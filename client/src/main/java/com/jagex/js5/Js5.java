package com.jagex.js5;

import com.jagex.core.io.BZip2;
import com.jagex.core.io.GZip;
import com.jagex.core.io.Packet;
import com.jagex.core.utils.ByteArrayCopier;
import com.jagex.core.utils.JagException;
import com.jagex.core.utils.StringTools;
import com.jagex.js5.index.Js5Index;
import com.jagex.js5.network.JS5CompressionHeader;
import deob.ObfuscatedName;
import lzma.sdk.lzma.LZMA;

import java.io.IOException;

@ObfuscatedName("py")
public final class Js5 {

	@ObfuscatedName("py.e")
	public Js5Index index = null;

	@ObfuscatedName("py.n")
	public Object[] packed;

	@ObfuscatedName("py.m")
	public Object[][] unpacked;

	@ObfuscatedName("py.k")
	public static GZip gzip = new GZip();

	@ObfuscatedName("py.f")
	public boolean discardPacked;

	@ObfuscatedName("py.z")
	public int discardUnpacked;

	@ObfuscatedName("py.p")
	public Js5ResourceProvider provider;

	@ObfuscatedName("py.d")
	public static boolean RAISE_EXCEPTIONS = false;

	@ObfuscatedName("py.c")
	public static int maxsize = 0;

	public Js5(Js5ResourceProvider provider, boolean discardPacked, int discardUnpacked) {
		if (discardUnpacked < 0 || discardUnpacked > 2) {
			throw new IllegalArgumentException("");
		}

		this.provider = provider;
		this.discardPacked = discardPacked;
		this.discardUnpacked = discardUnpacked;
	}

	@ObfuscatedName("py.e(B)Z")
	public synchronized boolean isIndexReady() {
		if (this.index == null) {
			this.index = this.provider.fetchindex();
			if (this.index == null) {
				return false;
			}

			this.packed = new Object[this.index.capacity];
			this.unpacked = new Object[this.index.capacity][];
		}

		return true;
	}

	@ObfuscatedName("py.n(S)I")
	public int getChecksum() {
		if (!this.isIndexReady()) {
			throw new IllegalStateException("");
		}

		return this.index.crc;
	}

	@ObfuscatedName("py.m(IB)Z")
	public synchronized boolean isGroupValid(int group) {
		if (!this.isIndexReady()) {
			return false;
		} else if (group >= 0 && group < this.index.groupCapacities.length && this.index.groupCapacities[group] != 0) {
			return true;
		} else if (RAISE_EXCEPTIONS) {
			throw new IllegalArgumentException(Integer.toString(group));
		} else {
			return false;
		}
	}

	@ObfuscatedName("py.k(IIB)Z")
	public synchronized boolean isGroupValid(int group, int file) {
		if (!this.isIndexReady()) {
			return false;
		} else if (group >= 0 && file >= 0 && group < this.index.groupCapacities.length && file < this.index.groupCapacities[group]) {
			return true;
		} else if (RAISE_EXCEPTIONS) {
			throw new IllegalArgumentException(group + " " + file);
		} else {
			return false;
		}
	}

	@ObfuscatedName("py.f(II)V")
	public synchronized void fetchgroup(int group) {
		if (this.discardPacked) {
			this.packed[group] = this.provider.fetchgroup(group);
		} else {
			this.packed[group] = ByteArrayCopier.wrap(this.provider.fetchgroup(group), false);
		}
	}

	@ObfuscatedName("py.w(II)V")
	public void prefetchGroup(int group) {
		this.provider.prefetchGroup(group);
	}

	@ObfuscatedName("py.l(IIB)[B")
	public byte[] getfile(int group, int file) {
		return this.getfile(group, file, null);
	}

	@ObfuscatedName("py.u(II[IB)[B")
	public synchronized byte[] getfile(int group, int file, int[] key) {
		if (!this.isGroupValid(group, file)) {
			return null;
		}

		if (this.unpacked[group] == null || this.unpacked[group][file] == null) {
			boolean success = this.unpackGroup(group, file, key);
			if (!success) {
				this.fetchgroup(group);

				success = this.unpackGroup(group, file, key);
				if (!success) {
					return null;
				}
			}
		}

		if (this.unpacked[group] == null) {
			throw new RuntimeException("");
		}

		byte[] bytes = null;
		if (this.unpacked[group][file] != null) {
			bytes = ByteArrayCopier.method4540(this.unpacked[group][file], false);

			if (bytes == null) {
				throw new RuntimeException("");
			}
		}

		if (bytes != null) {
			if (this.discardUnpacked == 1) {
				this.unpacked[group][file] = null;

				if (this.index.groupCapacities[group] == 1) {
					this.unpacked[group] = null;
				}
			} else if (this.discardUnpacked == 2) {
				this.unpacked[group] = null;
			}
		}

		return bytes;
	}

	@ObfuscatedName("py.z(III)Z")
	public synchronized boolean requestdownload(int group, int file) {
		if (!this.isGroupValid(group, file)) {
			return false;
		} else if (this.unpacked[group] != null && this.unpacked[group][file] != null) {
			return true;
		} else if (this.packed[group] == null) {
			this.fetchgroup(group);
			return this.packed[group] != null;
		} else {
			return true;
		}
	}

	@ObfuscatedName("py.p(II)Z")
	public synchronized boolean loadFile(int group) {
		if (!this.isIndexReady()) {
			return false;
		} else if (this.index.groupCapacities.length == 1) {
			return this.requestdownload(0, group);
		} else if (!this.isGroupValid(group)) {
			return false;
		} else if (this.index.groupCapacities[group] == 1) {
			return this.requestdownload(group, 0);
		} else {
			throw new RuntimeException("Unable to determine if id is groupid or fileid");
		}
	}

	@ObfuscatedName("py.d(II)Z")
	public synchronized boolean isGroupReady(int group) {
		if (!this.isGroupValid(group)) {
			return false;
		} else if (this.packed[group] == null) {
			this.fetchgroup(group);
			return this.packed[group] != null;
		} else {
			return true;
		}
	}

	@ObfuscatedName("py.c(I)Z")
	public synchronized boolean fetchAll() {
		if (!this.isIndexReady()) {
			return false;
		}

		boolean success = true;
		for (int i = 0; i < this.index.groupIds.length; i++) {
			int groupId = this.index.groupIds[i];

			if (this.packed[groupId] == null) {
				this.fetchgroup(groupId);

				if (this.packed[groupId] == null) {
					success = false;
				}
			}
		}

		return success;
	}

	@ObfuscatedName("py.r(II)I")
	public synchronized int getPercentageComplete(int group) {
		if (this.isGroupValid(group)) {
			return this.packed[group] == null ? this.provider.getPercentageComplete(group) : 100;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("py.v(I)I")
	public synchronized int getPercentageComplete() {
		if (!this.isIndexReady()) {
			return 0;
		}

		int total = 0;
		int complete = 0;

		for (int i = 0; i < this.packed.length; i++) {
			if (this.index.groupSizes[i] > 0) {
				total += 100;
				complete += this.getPercentageComplete(i);
			}
		}

		if (total == 0) {
			return 100;
		} else {
			return complete * 100 / total;
		}
	}

	@ObfuscatedName("py.o(IB)[B")
	public synchronized byte[] fetchFile(int id) {
		if (!this.isIndexReady()) {
			return null;
		} else if (this.index.groupCapacities.length == 1) {
			return this.getfile(0, id);
		} else if (!this.isGroupValid(id)) {
			return null;
		} else if (this.index.groupCapacities[id] == 1) {
			return this.getfile(id, 0);
		} else {
			throw new RuntimeException("Unable to determine if id is groupid or fileid");
		}
	}

	@ObfuscatedName("py.s(IB)[I")
	public synchronized int[] getFileIds(int group) {
		if (!this.isGroupValid(group)) {
			return null;
		}
		int[] fileIds = this.index.fileIds[group];
		if (fileIds == null) {
			fileIds = new int[this.index.groupSizes[group]];
			int i = 0;
			while (i < fileIds.length) {
				fileIds[i] = i++;
			}
		}
		return fileIds;
	}

	@ObfuscatedName("py.y(II)Z")
	public boolean isFileReady(int id) {
		if (!this.isIndexReady()) {
			return false;
		} else if (this.index.groupCapacities.length == 1) {
			return this.isGroupValid(0, id);
		} else if (!this.isGroupValid(id)) {
			return false;
		} else if (this.index.groupCapacities[id] == 1) {
			return this.isGroupValid(id, 0);
		} else {
			throw new RuntimeException("Unable to determine if id is groupid or fileid");
		}
	}

	@ObfuscatedName("py.q(II)I")
	public int getGroupCapacity(int group) {
		return this.isGroupValid(group) ? this.index.groupCapacities[group] : 0;
	}

	@ObfuscatedName("py.x(B)I")
	public int capacity() {
		return this.isIndexReady() ? this.index.groupCapacities.length : -1;
	}

	@ObfuscatedName("py.b(II)V")
	public synchronized void discardUnpacked(int group) {
		if (this.isGroupValid(group) && this.unpacked != null) {
			this.unpacked[group] = null;
		}
	}

	@ObfuscatedName("py.h(ZZB)V")
	public void discardNames(boolean arg0, boolean arg1) {
		if (!this.isIndexReady()) {
			return;
		}

		if (arg0) {
			this.index.groupNameHash = null;
			this.index.groupNameHashTable = null;
		}

		if (arg1) {
			this.index.fileNameHashes = null;
			this.index.fileNameHashTables = null;
		}
	}

	@ObfuscatedName("py.a(II[IB)Z")
	public synchronized boolean unpackGroup(int group, int file, int[] key) {
		if (!this.isGroupValid(group)) {
			return false;
		}

		if (this.packed[group] == null) {
			return false;
		}

        int groupSize = this.index.groupSizes[group];
        int[] fileIds = this.index.fileIds[group];

        if (this.unpacked[group] == null) {
            this.unpacked[group] = new Object[this.index.groupCapacities[group]];
        }

        Object[] unpacked = this.unpacked[group];
        boolean valid = true;
        for (int i = 0; i < groupSize; i++) {
            int fileId;
            if (fileIds == null) {
                fileId = i;
            } else {
                fileId = fileIds[i];
            }

            if (unpacked[fileId] == null) {
                valid = false;
                break;
            }
        }

        if (valid) {
            return true;
        }

        byte[] compressed;
        if (key == null || key[0] == 0 && key[1] == 0 && key[2] == 0 && key[3] == 0) {
            compressed = ByteArrayCopier.method4540(this.packed[group], false);
        } else {
            compressed = ByteArrayCopier.method4540(this.packed[group], true);
            Packet buf = new Packet(compressed);
            int ctype = buf.g1();
            int clen = buf.g4s();
            int var14 = (ctype == Js5CompressionType.UNCOMPRESSED.getId() ? 5 : 9) + clen;
            buf.tinydec(key, 5, var14);
        }

        byte[] uncompressed;
        try {
            uncompressed = decompress(compressed);
        } catch (RuntimeException ex) {
            throw JagException.report(ex, (key != null) + " " + group + " " + compressed.length + " " + Packet.getcrc(compressed, compressed.length) + " " + Packet.getcrc(compressed, compressed.length - 2) + " " + this.index.groupChecksums[group] + " " + this.index.crc);
        }

        if (this.discardPacked) {
            this.packed[group] = null;
        }

        if (groupSize <= 1) {
            int fileid;
            if (fileIds == null) {
                fileid = 0;
            } else {
                fileid = fileIds[0];
            }

            if (this.discardUnpacked == 0) {
                unpacked[fileid] = ByteArrayCopier.wrap(uncompressed, false);
            } else {
                unpacked[fileid] = uncompressed;
            }
        } else if (this.discardUnpacked == 2) {
            int pos = uncompressed.length;
            pos -= 1;
            int stripes = uncompressed[pos] & 0xFF;
            pos -= groupSize * stripes * 4;

            Packet buf = new Packet(uncompressed);
            int rawOff = 0;
            int realFileId = 0;
            buf.pos = pos;

            for (int i = 0; i < stripes; i++) {
                int len = 0;

                for (int j = 0; j < groupSize; j++) {
                    len += buf.g4s();

                    int fileId;
                    if (fileIds == null) {
                        fileId = j;
                    } else {
                        fileId = fileIds[j];
                    }

                    if (file == fileId) {
                        rawOff += len;
                        realFileId = fileId;
                    }
                }
            }

            if (rawOff == 0) {
                return true;
            }

            byte[] extracted = new byte[rawOff];
            int extractedOff = 0;
            buf.pos = pos;
            int extractedTotalOff = 0;

            for (int i = 0; i < stripes; i++) {
                int len = 0;

                for (int j = 0; j < groupSize; j++) {
                    len += buf.g4s();

                    int fileId;
                    if (fileIds == null) {
                        fileId = j;
                    } else {
                        fileId = fileIds[j];
                    }

                    if (file == fileId) {
                        System.arraycopy(uncompressed, extractedTotalOff, extracted, extractedOff, len);
                        extractedOff += len;
                    }

                    extractedTotalOff += len;
                }
            }

            unpacked[realFileId] = extracted;
        } else {
            int pos = uncompressed.length;
            pos -= 1;
            int stripes = uncompressed[pos] & 0xFF;
            pos -= groupSize * stripes * 4;

            Packet buf = new Packet(uncompressed);
            int[] lens = new int[groupSize];
            buf.pos = pos;

            for (int i = 0; i < stripes; i++) {
                int len = 0;
                for (int j = 0; j < groupSize; j++) {
                    len += buf.g4s();

                    lens[j] += len;
                }
            }

            byte[][] extracted = new byte[groupSize][];
            for (int i = 0; i < groupSize; i++) {
                extracted[i] = new byte[lens[i]];
                lens[i] = 0;
            }

            buf.pos = pos;
            int off = 0;

            for (int i = 0; i < stripes; i++) {
                int len = 0;
                for (int j = 0; j < groupSize; j++) {
                    len += buf.g4s();

                    System.arraycopy(uncompressed, off, extracted[j], lens[j], len);
                    lens[j] += len;
                    off += len;
                }
            }

            for (int i = 0; i < groupSize; i++) {
                int fileId;
                if (fileIds == null) {
                    fileId = i;
                } else {
                    fileId = fileIds[i];
                }

                if (this.discardUnpacked == 0) {
                    unpacked[fileId] = ByteArrayCopier.wrap(extracted[i], false);
                } else {
                    unpacked[fileId] = extracted[i];
                }
            }
        }

        return true;
    }

	@ObfuscatedName("py.g(Ljava/lang/String;I)I")
	public int getgroupid(String name) {
		if (this.isIndexReady()) {
			String lower = name.toLowerCase();
			int groupId = this.index.groupNameHashTable.get(StringTools.hashCode(lower));
			return this.isGroupValid(groupId) ? groupId : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("py.i(IS)I")
	public int getGroupId(int hash) {
		if (this.isIndexReady()) {
			int groupId = this.index.groupNameHashTable.get(hash);
			return this.isGroupValid(groupId) ? groupId : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("py.j(Ljava/lang/String;B)Z")
	public boolean isGroupNameValid(String name) {
		if (this.isIndexReady()) {
			String lower = name.toLowerCase();
			int groupId = this.index.groupNameHashTable.get(StringTools.hashCode(lower));
			return groupId >= 0;
		} else {
			return false;
		}
	}

	@ObfuscatedName("py.t(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean isFileNameValid(String group, String file) {
		if (!this.isIndexReady()) {
			return false;
		}
		String groupLower = group.toLowerCase();
		String fileLower = file.toLowerCase();
		int groupId = this.index.groupNameHashTable.get(StringTools.hashCode(groupLower));
		if (groupId < 0) {
			return false;
		} else {
			int fileId = this.index.fileNameHashTables[groupId].get(StringTools.hashCode(fileLower));
			return fileId >= 0;
		}
	}

	@ObfuscatedName("py.ae(Ljava/lang/String;Ljava/lang/String;I)[B")
	public synchronized byte[] getfile(String group, String file) {
		if (!this.isIndexReady()) {
			return null;
		}
		String groupLower = group.toLowerCase();
		String fileLower = file.toLowerCase();
		int groupId = this.index.groupNameHashTable.get(StringTools.hashCode(groupLower));
		if (this.isGroupValid(groupId)) {
			int fileId = this.index.fileNameHashTables[groupId].get(StringTools.hashCode(fileLower));
			return this.getfile(groupId, fileId);
		} else {
			return null;
		}
	}

	@ObfuscatedName("py.ag(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean requestdownload(String group, String file) {
		if (!this.isIndexReady()) {
			return false;
		}
		String groupLower = group.toLowerCase();
		String fileLower = file.toLowerCase();
		int groupId = this.index.groupNameHashTable.get(StringTools.hashCode(groupLower));
		if (this.isGroupValid(groupId)) {
			int fileId = this.index.fileNameHashTables[groupId].get(StringTools.hashCode(fileLower));
			return this.requestdownload(groupId, fileId);
		} else {
			return false;
		}
	}

	@ObfuscatedName("py.ah(Ljava/lang/String;I)Z")
	public boolean method6908(String arg0) {
		int var2 = this.getgroupid("");
		return var2 == -1 ? this.requestdownload(arg0, "") : this.requestdownload("", arg0);
	}

	@ObfuscatedName("py.al(Ljava/lang/String;I)Z")
	public boolean isGroupReady(String name) {
		if (this.isIndexReady()) {
			String lower = name.toLowerCase();
			int groupId = this.index.groupNameHashTable.get(StringTools.hashCode(lower));
			return this.isGroupReady(groupId);
		} else {
			return false;
		}
	}

	@ObfuscatedName("py.ac(Ljava/lang/String;I)I")
	public int getPercentageComplete(String name) {
		if (this.isIndexReady()) {
			String lower = name.toLowerCase();
			int groupId = this.index.groupNameHashTable.get(StringTools.hashCode(lower));
			return this.getPercentageComplete(groupId);
		} else {
			return 0;
		}
	}

	@ObfuscatedName("qi.ai([BB)[B")
	public static byte[] decompress(byte[] src) {
		Packet buf = new Packet(src);
		JS5CompressionHeader header = new JS5CompressionHeader(buf);
		Js5CompressionType ctype = header.getCompressionType();
		int clen = header.getPackedLength();

		if (clen < 0 || maxsize != 0 && clen > maxsize) {
			throw new RuntimeException("ctype=" + ctype + " clen=" + clen + " maxsize=" + maxsize);
		} else if (Js5CompressionType.UNCOMPRESSED == ctype) {
			byte[] bytes = new byte[clen];
			buf.gdata(bytes, 0, clen);
			return bytes;
		} else {
			int ulen = header.getUnpackedLength();
			if (ulen < 0 || maxsize != 0 && ulen > maxsize) {
				throw new RuntimeException("ctype=" + ctype + " clen=" + clen + " ulen=" + ulen + " maxsize=" + maxsize);
			}

			byte[] bytes;
			if (Js5CompressionType.BZIP2 == ctype) {
				bytes = new byte[ulen];
				BZip2.decompress(bytes, ulen, src, clen, 9);
			} else if (Js5CompressionType.GZIP == ctype) {
				bytes = new byte[ulen];
				GZip var8 = gzip;
				synchronized (var8) {
					gzip.decompress(buf, bytes);
				}
			} else if (Js5CompressionType.LZMA == ctype) {
				try {
					bytes = LZMA.decompress(buf, ulen);
				} catch (IOException ex) {
					throw new RuntimeException(ex);
				}
			} else {
				throw new RuntimeException();
			}

			return bytes;
		}
	}
}
