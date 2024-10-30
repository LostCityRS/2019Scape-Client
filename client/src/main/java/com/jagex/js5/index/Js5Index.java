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

	public Js5Index(byte[] arg0, int arg1, byte[] arg2) {
		this.crc = Packet.getcrc(arg0, arg0.length);
		if (this.crc != arg1) {
			throw new RuntimeException();
		}
		if (arg2 != null) {
			if (arg2.length != 64) {
				throw new RuntimeException();
			}
			this.whirlpool = Whirlpool.compute(arg0, 0, arg0.length);
			for (int var4 = 0; var4 < 64; var4++) {
				if (this.whirlpool[var4] != arg2[var4]) {
					throw new RuntimeException();
				}
			}
		}
		this.decode(arg0);
	}

	@ObfuscatedName("pl.e([BI)V")
	public void decode(byte[] arg0) {
		Packet var2 = new Packet(Js5.decompress(arg0));
		int var3 = var2.g1();
		if (var3 < 5 || var3 > 7) {
			throw new RuntimeException();
		}
		if (var3 >= 6) {
			this.version = var2.g4s();
		} else {
			this.version = 0;
		}
		int var4 = var2.g1();
		boolean var5 = (var4 & 0x1) != 0;
		boolean var6 = (var4 & 0x2) != 0;
		boolean var7 = (var4 & 0x4) != 0;
		boolean var8 = (var4 & 0x8) != 0;
		if (var3 >= 7) {
			this.size = var2.gSmart2or4();
		} else {
			this.size = var2.g2();
		}
		int var9 = 0;
		int var10 = -1;
		this.groupIds = new int[this.size];
		if (var3 >= 7) {
			for (int var11 = 0; var11 < this.size; var11++) {
				this.groupIds[var11] = var9 += var2.gSmart2or4();
				if (this.groupIds[var11] > var10) {
					var10 = this.groupIds[var11];
				}
			}
		} else {
			for (int var12 = 0; var12 < this.size; var12++) {
				this.groupIds[var12] = var9 += var2.g2();
				if (this.groupIds[var12] > var10) {
					var10 = this.groupIds[var12];
				}
			}
		}
		this.capacity = var10 + 1;
		this.groupChecksums = new int[this.capacity];
		if (var8) {
			this.groupUncompressedChecksums = new int[this.capacity];
		}
		if (var6) {
			this.groupDigests = new byte[this.capacity][];
		}
		this.groupVersions = new int[this.capacity];
		this.groupSizes = new int[this.capacity];
		this.fileIds = new int[this.capacity][];
		this.groupCapacities = new int[this.capacity];
		if (var5) {
			this.groupNameHash = new int[this.capacity];
			for (int var13 = 0; var13 < this.capacity; var13++) {
				this.groupNameHash[var13] = -1;
			}
			for (int var14 = 0; var14 < this.size; var14++) {
				this.groupNameHash[this.groupIds[var14]] = var2.g4s();
			}
			this.groupNameHashTable = new IntHashTable(this.groupNameHash);
		}
		for (int var15 = 0; var15 < this.size; var15++) {
			this.groupChecksums[this.groupIds[var15]] = var2.g4s();
		}
		if (var8) {
			for (int var16 = 0; var16 < this.size; var16++) {
				this.groupUncompressedChecksums[var16] = var2.g4s();
			}
		}
		if (var6) {
			for (int var17 = 0; var17 < this.size; var17++) {
				byte[] var18 = new byte[64];
				var2.gdata(var18, 0, 64);
				this.groupDigests[this.groupIds[var17]] = var18;
			}
		}
		if (var7) {
			this.groupLengths = new int[this.capacity];
			this.groupUncompressedLengths = new int[this.capacity];
			for (int var19 = 0; var19 < this.size; var19++) {
				this.groupLengths[this.groupIds[var19]] = var2.g4s();
				this.groupUncompressedLengths[this.groupIds[var19]] = var2.g4s();
			}
		}
		for (int var20 = 0; var20 < this.size; var20++) {
			this.groupVersions[this.groupIds[var20]] = var2.g4s();
		}
		if (var3 >= 7) {
			for (int var21 = 0; var21 < this.size; var21++) {
				this.groupSizes[this.groupIds[var21]] = var2.gSmart2or4();
			}
			for (int var22 = 0; var22 < this.size; var22++) {
				int var23 = this.groupIds[var22];
				int var24 = this.groupSizes[var23];
				int var25 = 0;
				int var26 = -1;
				this.fileIds[var23] = new int[var24];
				for (int var27 = 0; var27 < var24; var27++) {
					int var28 = this.fileIds[var23][var27] = var25 += var2.gSmart2or4();
					if (var28 > var26) {
						var26 = var28;
					}
				}
				this.groupCapacities[var23] = var26 + 1;
				if (var26 + 1 == var24) {
					this.fileIds[var23] = null;
				}
			}
		} else {
			for (int var29 = 0; var29 < this.size; var29++) {
				this.groupSizes[this.groupIds[var29]] = var2.g2();
			}
			for (int var30 = 0; var30 < this.size; var30++) {
				int var31 = this.groupIds[var30];
				int var32 = this.groupSizes[var31];
				int var33 = 0;
				int var34 = -1;
				this.fileIds[var31] = new int[var32];
				for (int var35 = 0; var35 < var32; var35++) {
					int var36 = this.fileIds[var31][var35] = var33 += var2.g2();
					if (var36 > var34) {
						var34 = var36;
					}
				}
				this.groupCapacities[var31] = var34 + 1;
				if (var34 + 1 == var32) {
					this.fileIds[var31] = null;
				}
			}
		}
		if (!var5) {
			return;
		}
		this.fileNameHashes = new int[var10 + 1][];
		this.fileNameHashTables = new IntHashTable[var10 + 1];
		for (int var37 = 0; var37 < this.size; var37++) {
			int var38 = this.groupIds[var37];
			int var39 = this.groupSizes[var38];
			this.fileNameHashes[var38] = new int[this.groupCapacities[var38]];
			for (int var40 = 0; var40 < this.groupCapacities[var38]; var40++) {
				this.fileNameHashes[var38][var40] = -1;
			}
			for (int var41 = 0; var41 < var39; var41++) {
				int var42;
				if (this.fileIds[var38] == null) {
					var42 = var41;
				} else {
					var42 = this.fileIds[var38][var41];
				}
				this.fileNameHashes[var38][var42] = var2.g4s();
			}
			this.fileNameHashTables[var38] = new IntHashTable(this.fileNameHashes[var38]);
		}
	}
}
