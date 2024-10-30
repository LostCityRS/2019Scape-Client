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
import java.io.IOException;
import lzma.sdk.lzma.LZMA;

@ObfuscatedName("py")
public class Js5 {

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

	public Js5(Js5ResourceProvider arg0, boolean arg1, int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("");
		}
		this.provider = arg0;
		this.discardPacked = arg1;
		this.discardUnpacked = arg2;
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
	public synchronized boolean isGroupValid(int arg0) {
		if (!this.isIndexReady()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.index.groupCapacities.length && this.index.groupCapacities[arg0] != 0) {
			return true;
		} else if (RAISE_EXCEPTIONS) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@ObfuscatedName("py.k(IIB)Z")
	public synchronized boolean isGroupValid(int arg0, int arg1) {
		if (!this.isIndexReady()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.index.groupCapacities.length && arg1 < this.index.groupCapacities[arg0]) {
			return true;
		} else if (RAISE_EXCEPTIONS) {
			throw new IllegalArgumentException(arg0 + " " + arg1);
		} else {
			return false;
		}
	}

	@ObfuscatedName("py.f(II)V")
	public synchronized void fetchgroup(int arg0) {
		if (this.discardPacked) {
			this.packed[arg0] = this.provider.fetchgroup(arg0);
		} else {
			this.packed[arg0] = ByteArrayCopier.wrap(this.provider.fetchgroup(arg0), false);
		}
	}

	@ObfuscatedName("py.w(II)V")
	public void prefetchGroup(int arg0) {
		this.provider.prefetchGroup(arg0);
	}

	@ObfuscatedName("py.l(IIB)[B")
	public byte[] getfile(int arg0, int arg1) {
		return this.getfile(arg0, arg1, null);
	}

	@ObfuscatedName("py.u(II[IB)[B")
	public synchronized byte[] getfile(int arg0, int arg1, int[] arg2) {
		if (!this.isGroupValid(arg0, arg1)) {
			return null;
		}
		byte[] var4 = null;
		if (this.unpacked[arg0] == null || this.unpacked[arg0][arg1] == null) {
			boolean var5 = this.unpackGroup(arg0, arg1, arg2);
			if (!var5) {
				this.fetchgroup(arg0);
				boolean var6 = this.unpackGroup(arg0, arg1, arg2);
				if (!var6) {
					return null;
				}
			}
		}
		if (this.unpacked[arg0] == null) {
			throw new RuntimeException("");
		}
		if (this.unpacked[arg0][arg1] != null) {
			var4 = ByteArrayCopier.method4540(this.unpacked[arg0][arg1], false);
			if (var4 == null) {
				throw new RuntimeException("");
			}
		}
		if (var4 != null) {
			if (this.discardUnpacked == 1) {
				this.unpacked[arg0][arg1] = null;
				if (this.index.groupCapacities[arg0] == 1) {
					this.unpacked[arg0] = null;
				}
			} else if (this.discardUnpacked == 2) {
				this.unpacked[arg0] = null;
			}
		}
		return var4;
	}

	@ObfuscatedName("py.z(III)Z")
	public synchronized boolean requestdownload(int arg0, int arg1) {
		if (!this.isGroupValid(arg0, arg1)) {
			return false;
		} else if (this.unpacked[arg0] != null && this.unpacked[arg0][arg1] != null) {
			return true;
		} else if (this.packed[arg0] == null) {
			this.fetchgroup(arg0);
			return this.packed[arg0] != null;
		} else {
			return true;
		}
	}

	@ObfuscatedName("py.p(II)Z")
	public synchronized boolean loadFile(int arg0) {
		if (!this.isIndexReady()) {
			return false;
		} else if (this.index.groupCapacities.length == 1) {
			return this.requestdownload(0, arg0);
		} else if (!this.isGroupValid(arg0)) {
			return false;
		} else if (this.index.groupCapacities[arg0] == 1) {
			return this.requestdownload(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("py.d(II)Z")
	public synchronized boolean isGroupReady(int arg0) {
		if (!this.isGroupValid(arg0)) {
			return false;
		} else if (this.packed[arg0] == null) {
			this.fetchgroup(arg0);
			return this.packed[arg0] != null;
		} else {
			return true;
		}
	}

	@ObfuscatedName("py.c(I)Z")
	public synchronized boolean fetchAll() {
		if (!this.isIndexReady()) {
			return false;
		}
		boolean var1 = true;
		for (int var2 = 0; var2 < this.index.groupIds.length; var2++) {
			int var3 = this.index.groupIds[var2];
			if (this.packed[var3] == null) {
				this.fetchgroup(var3);
				if (this.packed[var3] == null) {
					var1 = false;
				}
			}
		}
		return var1;
	}

	@ObfuscatedName("py.r(II)I")
	public synchronized int getPercentageComplete(int arg0) {
		if (this.isGroupValid(arg0)) {
			return this.packed[arg0] == null ? this.provider.getPercentageComplete(arg0) : 100;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("py.v(I)I")
	public synchronized int getPercentageComplete() {
		if (!this.isIndexReady()) {
			return 0;
		}
		int var1 = 0;
		int var2 = 0;
		for (int var3 = 0; var3 < this.packed.length; var3++) {
			if (this.index.groupSizes[var3] > 0) {
				var1 += 100;
				var2 += this.getPercentageComplete(var3);
			}
		}
		if (var1 == 0) {
			return 100;
		} else {
			return var2 * 100 / var1;
		}
	}

	@ObfuscatedName("py.o(IB)[B")
	public synchronized byte[] fetchFile(int arg0) {
		if (!this.isIndexReady()) {
			return null;
		} else if (this.index.groupCapacities.length == 1) {
			return this.getfile(0, arg0);
		} else if (!this.isGroupValid(arg0)) {
			return null;
		} else if (this.index.groupCapacities[arg0] == 1) {
			return this.getfile(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("py.s(IB)[I")
	public synchronized int[] getFileIds(int arg0) {
		if (!this.isGroupValid(arg0)) {
			return null;
		}
		int[] var2 = this.index.fileIds[arg0];
		if (var2 == null) {
			var2 = new int[this.index.groupSizes[arg0]];
			int var3 = 0;
			while (var3 < var2.length) {
				var2[var3] = var3++;
			}
		}
		return var2;
	}

	@ObfuscatedName("py.y(II)Z")
	public boolean isFileReady(int arg0) {
		if (!this.isIndexReady()) {
			return false;
		} else if (this.index.groupCapacities.length == 1) {
			return this.isGroupValid(0, arg0);
		} else if (!this.isGroupValid(arg0)) {
			return false;
		} else if (this.index.groupCapacities[arg0] == 1) {
			return this.isGroupValid(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("py.q(II)I")
	public int getGroupCapacity(int arg0) {
		return this.isGroupValid(arg0) ? this.index.groupCapacities[arg0] : 0;
	}

	@ObfuscatedName("py.x(B)I")
	public int capacity() {
		return this.isIndexReady() ? this.index.groupCapacities.length : -1;
	}

	@ObfuscatedName("py.b(II)V")
	public synchronized void discardUnpacked(int arg0) {
		if (this.isGroupValid(arg0) && this.unpacked != null) {
			this.unpacked[arg0] = null;
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
	public synchronized boolean unpackGroup(int arg0, int arg1, int[] arg2) {
		if (!this.isGroupValid(arg0)) {
			return false;
		} else if (this.packed[arg0] == null) {
			return false;
		} else {
			int var4 = this.index.groupSizes[arg0];
			int[] var5 = this.index.fileIds[arg0];
			if (this.unpacked[arg0] == null) {
				this.unpacked[arg0] = new Object[this.index.groupCapacities[arg0]];
			}
			Object[] var6 = this.unpacked[arg0];
			boolean var7 = true;
			for (int var8 = 0; var8 < var4; var8++) {
				int var9;
				if (var5 == null) {
					var9 = var8;
				} else {
					var9 = var5[var8];
				}
				if (var6[var9] == null) {
					var7 = false;
					break;
				}
			}
			if (var7) {
				return true;
			}
			byte[] var10;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				var10 = ByteArrayCopier.method4540(this.packed[arg0], false);
			} else {
				var10 = ByteArrayCopier.method4540(this.packed[arg0], true);
				Packet var11 = new Packet(var10);
				int var12 = var11.g1();
				int var13 = var11.g4s();
				int var14 = (var12 == Js5CompressionType.UNCOMPRESSED.getId() ? 5 : 9) + var13;
				var11.tinydec(arg2, 5, var14);
			}
			byte[] var15;
			try {
				var15 = decompress(var10);
			} catch (RuntimeException var51) {
				throw JagException.report((Throwable) var51, (String) ((arg2 != null) + " " + arg0 + " " + var10.length + " " + Packet.getcrc(var10, var10.length) + " " + Packet.getcrc(var10, var10.length - 2) + " " + this.index.groupChecksums[arg0] + " " + this.index.crc));
			}
			if (this.discardPacked) {
				this.packed[arg0] = null;
			}
			if (var4 <= 1) {
				int var50;
				if (var5 == null) {
					var50 = 0;
				} else {
					var50 = var5[0];
				}
				if (this.discardUnpacked == 0) {
					var6[var50] = ByteArrayCopier.wrap(var15, false);
				} else {
					var6[var50] = var15;
				}
			} else if (this.discardUnpacked == 2) {
				int var33 = var15.length;
				int var53 = var33 - 1;
				int var34 = var15[var53] & 0xFF;
				int var35 = var53 - var4 * var34 * 4;
				Packet var36 = new Packet(var15);
				int var37 = 0;
				int var38 = 0;
				var36.pos = var35;
				for (int var39 = 0; var39 < var34; var39++) {
					int var40 = 0;
					for (int var41 = 0; var41 < var4; var41++) {
						var40 += var36.g4s();
						int var42;
						if (var5 == null) {
							var42 = var41;
						} else {
							var42 = var5[var41];
						}
						if (arg1 == var42) {
							var37 += var40;
							var38 = var42;
						}
					}
				}
				if (var37 == 0) {
					return true;
				}
				byte[] var43 = new byte[var37];
				int var44 = 0;
				var36.pos = var35;
				int var45 = 0;
				for (int var46 = 0; var46 < var34; var46++) {
					int var47 = 0;
					for (int var48 = 0; var48 < var4; var48++) {
						var47 += var36.g4s();
						int var49;
						if (var5 == null) {
							var49 = var48;
						} else {
							var49 = var5[var48];
						}
						if (arg1 == var49) {
							System.arraycopy(var15, var45, var43, var44, var47);
							var44 += var47;
						}
						var45 += var47;
					}
				}
				var6[var38] = var43;
			} else {
				int var17 = var15.length;
				int var52 = var17 - 1;
				int var18 = var15[var52] & 0xFF;
				int var19 = var52 - var4 * var18 * 4;
				Packet var20 = new Packet(var15);
				int[] var21 = new int[var4];
				var20.pos = var19;
				for (int var22 = 0; var22 < var18; var22++) {
					int var23 = 0;
					for (int var24 = 0; var24 < var4; var24++) {
						var23 += var20.g4s();
						var21[var24] += var23;
					}
				}
				byte[][] var25 = new byte[var4][];
				for (int var26 = 0; var26 < var4; var26++) {
					var25[var26] = new byte[var21[var26]];
					var21[var26] = 0;
				}
				var20.pos = var19;
				int var27 = 0;
				for (int var28 = 0; var28 < var18; var28++) {
					int var29 = 0;
					for (int var30 = 0; var30 < var4; var30++) {
						var29 += var20.g4s();
						System.arraycopy(var15, var27, var25[var30], var21[var30], var29);
						var21[var30] += var29;
						var27 += var29;
					}
				}
				for (int var31 = 0; var31 < var4; var31++) {
					int var32;
					if (var5 == null) {
						var32 = var31;
					} else {
						var32 = var5[var31];
					}
					if (this.discardUnpacked == 0) {
						var6[var32] = ByteArrayCopier.wrap(var25[var31], false);
					} else {
						var6[var32] = var25[var31];
					}
				}
			}
			return true;
		}
	}

	@ObfuscatedName("py.g(Ljava/lang/String;I)I")
	public int getgroupid(String arg0) {
		if (this.isIndexReady()) {
			String var2 = arg0.toLowerCase();
			int var3 = this.index.groupNameHashTable.get(StringTools.hashCode(var2));
			return this.isGroupValid(var3) ? var3 : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("py.i(IS)I")
	public int getGroupId(int arg0) {
		if (this.isIndexReady()) {
			int var2 = this.index.groupNameHashTable.get(arg0);
			return this.isGroupValid(var2) ? var2 : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("py.j(Ljava/lang/String;B)Z")
	public boolean isGroupNameValid(String arg0) {
		if (this.isIndexReady()) {
			String var2 = arg0.toLowerCase();
			int var3 = this.index.groupNameHashTable.get(StringTools.hashCode(var2));
			return var3 >= 0;
		} else {
			return false;
		}
	}

	@ObfuscatedName("py.t(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean isFileNameValid(String arg0, String arg1) {
		if (!this.isIndexReady()) {
			return false;
		}
		String var3 = arg0.toLowerCase();
		String var4 = arg1.toLowerCase();
		int var5 = this.index.groupNameHashTable.get(StringTools.hashCode(var3));
		if (var5 < 0) {
			return false;
		} else {
			int var6 = this.index.fileNameHashTables[var5].get(StringTools.hashCode(var4));
			return var6 >= 0;
		}
	}

	@ObfuscatedName("py.ae(Ljava/lang/String;Ljava/lang/String;I)[B")
	public synchronized byte[] getfile(String arg0, String arg1) {
		if (!this.isIndexReady()) {
			return null;
		}
		String var3 = arg0.toLowerCase();
		String var4 = arg1.toLowerCase();
		int var5 = this.index.groupNameHashTable.get(StringTools.hashCode(var3));
		if (this.isGroupValid(var5)) {
			int var6 = this.index.fileNameHashTables[var5].get(StringTools.hashCode(var4));
			return this.getfile(var5, var6);
		} else {
			return null;
		}
	}

	@ObfuscatedName("py.ag(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean requestdownload(String arg0, String arg1) {
		if (!this.isIndexReady()) {
			return false;
		}
		String var3 = arg0.toLowerCase();
		String var4 = arg1.toLowerCase();
		int var5 = this.index.groupNameHashTable.get(StringTools.hashCode(var3));
		if (this.isGroupValid(var5)) {
			int var6 = this.index.fileNameHashTables[var5].get(StringTools.hashCode(var4));
			return this.requestdownload(var5, var6);
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
	public boolean isGroupReady(String arg0) {
		if (this.isIndexReady()) {
			String var2 = arg0.toLowerCase();
			int var3 = this.index.groupNameHashTable.get(StringTools.hashCode(var2));
			return this.isGroupReady(var3);
		} else {
			return false;
		}
	}

	@ObfuscatedName("py.ac(Ljava/lang/String;I)I")
	public int getPercentageComplete(String arg0) {
		if (this.isIndexReady()) {
			String var2 = arg0.toLowerCase();
			int var3 = this.index.groupNameHashTable.get(StringTools.hashCode(var2));
			return this.getPercentageComplete(var3);
		} else {
			return 0;
		}
	}

	@ObfuscatedName("qi.ai([BB)[B")
	public static final byte[] decompress(byte[] arg0) {
		Packet var1 = new Packet(arg0);
		JS5CompressionHeader var2 = new JS5CompressionHeader(var1);
		Js5CompressionType var3 = var2.getCompressionType();
		int var4 = var2.getPackedLength();
		if (var4 < 0 || maxsize != 0 && var4 > maxsize) {
			throw new RuntimeException();
		} else if (Js5CompressionType.UNCOMPRESSED == var3) {
			byte[] var5 = new byte[var4];
			var1.gdata(var5, 0, var4);
			return var5;
		} else {
			int var6 = var2.getUnpackedLength();
			if (var6 < 0 || maxsize != 0 && var6 > maxsize) {
				throw new RuntimeException();
			}
			byte[] var7;
			if (Js5CompressionType.BZIP2 == var3) {
				var7 = new byte[var6];
				BZip2.decompress(var7, var6, arg0, var4, 9);
			} else if (Js5CompressionType.GZIP == var3) {
				var7 = new byte[var6];
				GZip var8 = gzip;
				synchronized (gzip) {
					gzip.decompress(var1, var7);
				}
			} else if (Js5CompressionType.LZMA == var3) {
				try {
					var7 = LZMA.decompress(var1, var6);
				} catch (IOException var11) {
					throw new RuntimeException(var11);
				}
			} else {
				throw new RuntimeException();
			}
			return var7;
		}
	}
}
