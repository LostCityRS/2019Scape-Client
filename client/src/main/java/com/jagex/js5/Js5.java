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
	public static GZip field4409 = new GZip();

	@ObfuscatedName("py.f")
	public boolean discardPacked;

	@ObfuscatedName("py.z")
	public int discardUnpacked;

	@ObfuscatedName("py.p")
	public Js5ResourceProvider provider;

	@ObfuscatedName("py.d")
	public static boolean RAISE_EXCEPTIONS = false;

	@ObfuscatedName("py.c")
	public static int MAX_LENGTH = 0;

	public Js5(Js5ResourceProvider provider, boolean arg1, int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("");
		}

		this.provider = provider;
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
			this.packed[group] = ByteArrayCopier.method2821(this.provider.fetchgroup(group), false);
		}
	}

	@ObfuscatedName("py.w(II)V")
	public void method6885(int arg0) {
		this.provider.method6856(arg0);
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
	public synchronized boolean method6889(int group) {
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
	public synchronized boolean method6927(int group) {
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
	public synchronized byte[] method6894(int arg0) {
		if (!this.isIndexReady()) {
			return null;
		} else if (this.index.groupCapacities.length == 1) {
			return this.getfile(0, arg0);
		} else if (!this.isGroupValid(arg0)) {
			return null;
		} else if (this.index.groupCapacities[arg0] == 1) {
			return this.getfile(arg0, 0);
		} else {
			throw new RuntimeException("Unable to determine if id is groupid or fileid");
		}
	}

	@ObfuscatedName("py.s(IB)[I")
	public synchronized int[] method6895(int arg0) {
		if (!this.isGroupValid(arg0)) {
			return null;
		}
		int[] var2 = this.index.field4386[arg0];
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
	public boolean method6929(int arg0) {
		if (!this.isIndexReady()) {
			return false;
		} else if (this.index.groupCapacities.length == 1) {
			return this.isGroupValid(0, arg0);
		} else if (!this.isGroupValid(arg0)) {
			return false;
		} else if (this.index.groupCapacities[arg0] == 1) {
			return this.isGroupValid(arg0, 0);
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
	public synchronized void method6899(int arg0) {
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
			this.index.field4390 = null;
			this.index.field4391 = null;
		}

		if (arg1) {
			this.index.field4401 = null;
			this.index.field4402 = null;
		}
	}

	@ObfuscatedName("py.a(II[IB)Z")
	public synchronized boolean unpackGroup(int group, int file, int[] key) {
		if (!this.isGroupValid(group)) {
			return false;
		} else if (this.packed[group] == null) {
			return false;
		} else {
			int var4 = this.index.groupSizes[group];
			int[] var5 = this.index.field4386[group];

			if (this.unpacked[group] == null) {
				this.unpacked[group] = new Object[this.index.groupCapacities[group]];
			}

			Object[] var6 = this.unpacked[group];
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
			if (key == null || key[0] == 0 && key[1] == 0 && key[2] == 0 && key[3] == 0) {
				var10 = ByteArrayCopier.method4540(this.packed[group], false);
			} else {
				var10 = ByteArrayCopier.method4540(this.packed[group], true);
				Packet var11 = new Packet(var10);
				int var12 = var11.g1();
				int var13 = var11.g4s();
				int var14 = (var12 == Js5CompressionType.UNCOMPRESSED.getId() ? 5 : 9) + var13;
				var11.tinydec(key, 5, var14);
			}

			byte[] var15;
			try {
				var15 = uncompress(var10);
			} catch (RuntimeException var51) {
				throw JagException.method19636(var51, (key != null) + " " + group + " " + var10.length + " " + Packet.getcrc(var10, var10.length) + " " + Packet.getcrc(var10, var10.length - 2) + " " + this.index.field4393[group] + " " + this.index.crc);
			}

			if (this.discardPacked) {
				this.packed[group] = null;
			}

			if (var4 <= 1) {
				int var50;
				if (var5 == null) {
					var50 = 0;
				} else {
					var50 = var5[0];
				}

				if (this.discardUnpacked == 0) {
					var6[var50] = ByteArrayCopier.method2821(var15, false);
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

						if (file == var42) {
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

						if (file == var49) {
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
						var6[var32] = ByteArrayCopier.method2821(var25[var31], false);
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
			int var3 = this.index.field4391.method4486(StringTools.method3475(var2));
			return this.isGroupValid(var3) ? var3 : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("py.i(IS)I")
	public int method6903(int arg0) {
		if (this.isIndexReady()) {
			int var2 = this.index.field4391.method4486(arg0);
			return this.isGroupValid(var2) ? var2 : -1;
		} else {
			return -1;
		}
	}

	@ObfuscatedName("py.j(Ljava/lang/String;B)Z")
	public boolean method6904(String arg0) {
		if (this.isIndexReady()) {
			String var2 = arg0.toLowerCase();
			int var3 = this.index.field4391.method4486(StringTools.method3475(var2));
			return var3 >= 0;
		} else {
			return false;
		}
	}

	@ObfuscatedName("py.t(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method6905(String arg0, String arg1) {
		if (!this.isIndexReady()) {
			return false;
		}
		String var3 = arg0.toLowerCase();
		String var4 = arg1.toLowerCase();
		int var5 = this.index.field4391.method4486(StringTools.method3475(var3));
		if (var5 < 0) {
			return false;
		} else {
			int var6 = this.index.field4402[var5].method4486(StringTools.method3475(var4));
			return var6 >= 0;
		}
	}

	@ObfuscatedName("py.ae(Ljava/lang/String;Ljava/lang/String;I)[B")
	public synchronized byte[] method6906(String arg0, String arg1) {
		if (!this.isIndexReady()) {
			return null;
		}
		String var3 = arg0.toLowerCase();
		String var4 = arg1.toLowerCase();
		int var5 = this.index.field4391.method4486(StringTools.method3475(var3));
		if (this.isGroupValid(var5)) {
			int var6 = this.index.field4402[var5].method4486(StringTools.method3475(var4));
			return this.getfile(var5, var6);
		} else {
			return null;
		}
	}

	@ObfuscatedName("py.ag(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method6938(String arg0, String arg1) {
		if (!this.isIndexReady()) {
			return false;
		}
		String var3 = arg0.toLowerCase();
		String var4 = arg1.toLowerCase();
		int var5 = this.index.field4391.method4486(StringTools.method3475(var3));
		if (this.isGroupValid(var5)) {
			int var6 = this.index.field4402[var5].method4486(StringTools.method3475(var4));
			return this.requestdownload(var5, var6);
		} else {
			return false;
		}
	}

	@ObfuscatedName("py.ah(Ljava/lang/String;I)Z")
	public boolean method6908(String arg0) {
		int var2 = this.getgroupid("");
		return var2 == -1 ? this.method6938(arg0, "") : this.method6938("", arg0);
	}

	@ObfuscatedName("py.al(Ljava/lang/String;I)Z")
	public boolean method6886(String arg0) {
		if (this.isIndexReady()) {
			String var2 = arg0.toLowerCase();
			int var3 = this.index.field4391.method4486(StringTools.method3475(var2));
			return this.method6927(var3);
		} else {
			return false;
		}
	}

	@ObfuscatedName("py.ac(Ljava/lang/String;I)I")
	public int method6880(String arg0) {
		if (this.isIndexReady()) {
			String var2 = arg0.toLowerCase();
			int var3 = this.index.field4391.method4486(StringTools.method3475(var2));
			return this.getPercentageComplete(var3);
		} else {
			return 0;
		}
	}

	@ObfuscatedName("qi.ai([BB)[B")
	public static byte[] uncompress(byte[] src) {
		Packet buf = new Packet(src);
		JS5CompressionHeader header = new JS5CompressionHeader(buf);
		Js5CompressionType type = header.getCompressionType();
		int len = header.getPackedLength();

		if (len < 0 || MAX_LENGTH != 0 && len > MAX_LENGTH) {
			throw new RuntimeException("ctype=" + type + " clen=" + len + " maxsize=" + MAX_LENGTH);
		} else if (Js5CompressionType.UNCOMPRESSED == type) {
			byte[] bytes = new byte[len];
			buf.gdata(bytes, 0, len);
			return bytes;
		} else {
			int unpackedLength = header.getUnpackedLength();
			if (unpackedLength < 0 || MAX_LENGTH != 0 && unpackedLength > MAX_LENGTH) {
				throw new RuntimeException("ctype=" + type + " clen=" + len + " ulen=" + unpackedLength + " maxsize=" + MAX_LENGTH);
			}

			byte[] bytes;
			if (Js5CompressionType.BZIP2 == type) {
				bytes = new byte[unpackedLength];
				BZip2.method14100(bytes, unpackedLength, src, len, 9);
			} else if (Js5CompressionType.GZIP == type) {
				bytes = new byte[unpackedLength];
				GZip var8 = field4409;
				synchronized (var8) {
					field4409.method15245(buf, bytes);
				}
			} else if (Js5CompressionType.LZMA == type) {
				try {
					bytes = LZMA.method8503(buf, unpackedLength);
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
