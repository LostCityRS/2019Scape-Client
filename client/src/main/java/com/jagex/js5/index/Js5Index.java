package com.jagex.js5.index;

import com.jagex.core.datastruct.IntHashTable;
import com.jagex.core.io.Packet;
import com.jagex.encryption.Whirlpool;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("pl")
public class Js5Index {

	@ObfuscatedName("pl.n")
	public int crc;

	@ObfuscatedName("pl.m")
	public byte[] whirlpool;

	@ObfuscatedName("pl.k")
	public int version;

	@ObfuscatedName("pl.f")
	public int size;

	@ObfuscatedName("pl.w")
	public int[] groupIds;

	@ObfuscatedName("pl.l")
	public int[] groupNameHash;

	@ObfuscatedName("pl.u")
	public IntHashTable groupNameHashTable;

	@ObfuscatedName("pl.z")
	public int capacity;

	@ObfuscatedName("pl.p")
	public int[] groupChecksums;

	@ObfuscatedName("pl.d")
	public int[] groupUncompressedChecksums;

	@ObfuscatedName("pl.c")
	public byte[][] groupDigests;

	@ObfuscatedName("pl.r")
	public int[] groupVersions;

	@ObfuscatedName("pl.v")
	public int[] groupLengths;

	@ObfuscatedName("pl.o")
	public int[] groupUncompressedLengths;

	@ObfuscatedName("pl.s")
	public int[] groupSizes;

	@ObfuscatedName("pl.y")
	public int[][] fileIds;

	@ObfuscatedName("pl.q")
	public int[][] fileNameHashes;

	@ObfuscatedName("pl.x")
	public IntHashTable[] fileNameHashTables;

	@ObfuscatedName("pl.b")
	public int[] groupCapacities;

	public Js5Index(byte[] src, int crc, byte[] expectedwhirlpool) {
		this.crc = Packet.getcrc(src, src.length);
		if (this.crc != crc) {
			throw new RuntimeException("Invalid CRC - expected:" + crc + " got:" + this.crc);
		}

		if (expectedwhirlpool != null) {
			if (expectedwhirlpool.length != 64) {
				throw new RuntimeException("Invalid expectedwhirlpool - must be 64 bytes long");
			}

			this.whirlpool = Whirlpool.compute(src, 0, src.length);

			for (int i = 0; i < 64; i++) {
				if (this.whirlpool[i] != expectedwhirlpool[i]) {
	                // throw new RuntimeException("Invalid Whirlpool - expected:" + hexString(arg2) + " got:" + hexString(this.expectedwhirlpool));
					throw new RuntimeException("Invalid Whirlpool");
				}
			}
		}

		this.decode(src);
	}

	@ObfuscatedName("pl.e([BI)V")
	public void decode(byte[] bytes) {
		Packet buf = new Packet(Js5.decompress(bytes));

		int protocol = buf.g1();
		if (protocol < 5 || protocol > 7) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + protocol);
		}

		if (protocol >= 6) {
			this.version = buf.g4s();
		} else {
			this.version = 0;
		}

		int info = buf.g1();
		boolean hasNames = (info & 0x1) != 0;
		boolean hasDigests = (info & 0x2) != 0;
		boolean hasLengths = (info & 0x4) != 0;
		boolean hasUncompressedChecksums = (info & 0x8) != 0;

		if (protocol >= 7) {
			this.size = buf.gSmart2or4();
		} else {
			this.size = buf.g2();
		}

		int prevGroupId = 0;
		int maxGroupId = -1;
		this.groupIds = new int[this.size];

		if (protocol >= 7) {
			for (int index = 0; index < this.size; index++) {
				this.groupIds[index] = prevGroupId += buf.gSmart2or4();
				if (this.groupIds[index] > maxGroupId) {
					maxGroupId = this.groupIds[index];
				}
			}
		} else {
			for (int index = 0; index < this.size; index++) {
				this.groupIds[index] = prevGroupId += buf.g2();
				if (this.groupIds[index] > maxGroupId) {
					maxGroupId = this.groupIds[index];
				}
			}
		}

		this.capacity = maxGroupId + 1;
		this.groupChecksums = new int[this.capacity];
		this.groupVersions = new int[this.capacity];
		this.groupSizes = new int[this.capacity];
		this.fileIds = new int[this.capacity][];
		this.groupCapacities = new int[this.capacity];

		if (hasNames) {
			this.groupNameHash = new int[this.capacity];

			for (int groupId = 0; groupId < this.capacity; groupId++) {
				this.groupNameHash[groupId] = -1;
			}

			for (int i = 0; i < this.size; i++) {
				this.groupNameHash[this.groupIds[i]] = buf.g4s();
			}

			this.groupNameHashTable = new IntHashTable(this.groupNameHash);
		}

		for (int i = 0; i < this.size; i++) {
			this.groupChecksums[this.groupIds[i]] = buf.g4s();
		}

		if (hasUncompressedChecksums) {
			this.groupUncompressedChecksums = new int[this.capacity];

			for (int i = 0; i < this.size; i++) {
				this.groupUncompressedChecksums[i] = buf.g4s();
			}
		}

		if (hasDigests) {
			this.groupDigests = new byte[this.capacity][];

			for (int i = 0; i < this.size; i++) {
				byte[] whirlpool = new byte[64];
				buf.gdata(whirlpool, 0, 64);
				this.groupDigests[this.groupIds[i]] = whirlpool;
			}
		}

		if (hasLengths) {
			this.groupLengths = new int[this.capacity];
			this.groupUncompressedLengths = new int[this.capacity];

			for (int i = 0; i < this.size; i++) {
				this.groupLengths[this.groupIds[i]] = buf.g4s();
				this.groupUncompressedLengths[this.groupIds[i]] = buf.g4s();
			}
		}

		for (int i = 0; i < this.size; i++) {
			this.groupVersions[this.groupIds[i]] = buf.g4s();
		}

		if (protocol >= 7) {
			for (int i = 0; i < this.size; i++) {
				this.groupSizes[this.groupIds[i]] = buf.gSmart2or4();
			}

			for (int i = 0; i < this.size; i++) {
				int groupId = this.groupIds[i];
				int groupSize = this.groupSizes[groupId];
				int prevFileId = 0;
				int maxFileId = -1;

				this.fileIds[groupId] = new int[groupSize];
				for (int j = 0; j < groupSize; j++) {
					int fileId = this.fileIds[groupId][j] = prevFileId += buf.gSmart2or4();
					if (fileId > maxFileId) {
						maxFileId = fileId;
					}
				}

				this.groupCapacities[groupId] = maxFileId + 1;
				if (maxFileId + 1 == groupSize) {
					this.fileIds[groupId] = null;
				}
			}
		} else {
			for (int i = 0; i < this.size; i++) {
				this.groupSizes[this.groupIds[i]] = buf.g2();
			}

			for (int i = 0; i < this.size; i++) {
				int groupId = this.groupIds[i];
				int groupSize = this.groupSizes[groupId];
				int prevFileId = 0;
				int maxFileId = -1;

				this.fileIds[groupId] = new int[groupSize];
				for (int j = 0; j < groupSize; j++) {
					int fileId = this.fileIds[groupId][j] = prevFileId += buf.g2();
					if (fileId > maxFileId) {
						maxFileId = fileId;
					}
				}

				this.groupCapacities[groupId] = maxFileId + 1;
				if (maxFileId + 1 == groupSize) {
					this.fileIds[groupId] = null;
				}
			}
		}

        if (hasNames) {
            this.fileNameHashes = new int[maxGroupId + 1][];
            this.fileNameHashTables = new IntHashTable[maxGroupId + 1];

            for (int i = 0; i < this.size; i++) {
                int groupId = this.groupIds[i];
				int groupSize = this.groupSizes[groupId];

                this.fileNameHashes[groupId] = new int[this.groupCapacities[groupId]];
                for (int fileId = 0; fileId < this.groupCapacities[groupId]; fileId++) {
                    this.fileNameHashes[groupId][fileId] = -1;
                }

                for (int j = 0; j < groupSize; j++) {
                    int fileId;
                    if (this.fileIds[groupId] == null) {
                        fileId = j;
                    } else {
                        fileId = this.fileIds[groupId][j];
                    }

                    this.fileNameHashes[groupId][fileId] = buf.g4s();
                }

                this.fileNameHashTables[groupId] = new IntHashTable(this.fileNameHashes[groupId]);
            }
        }
    }
}
