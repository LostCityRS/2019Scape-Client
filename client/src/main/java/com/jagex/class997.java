package com.jagex;

import com.jagex.deob.ObfuscatedName;
import com.jagex.deob.Statics;
import java.math.BigInteger;

@ObfuscatedName("alw")
public class class997 extends class532 {

	@ObfuscatedName("alw.w")
	public byte[] field11502;

	@ObfuscatedName("alw.l")
	public int field11503;

	@ObfuscatedName("alw.u")
	public static int[] field11504 = new int[256];

	@ObfuscatedName("alw.p")
	public static long[] field11507;

	static {
		for (int var0 = 0; var0 < 256; var0++) {
			int var1 = var0;
			for (int var2 = 0; var2 < 8; var2++) {
				if ((var1 & 0x1) == 1) {
					var1 = var1 >>> 1 ^ 0xEDB88320;
				} else {
					var1 >>>= 0x1;
				}
			}
			field11504[var0] = var1;
		}
		field11507 = new long[256];
		for (int var3 = 0; var3 < 256; var3++) {
			long var4 = (long) var3;
			for (int var6 = 0; var6 < 8; var6++) {
				if ((var4 & 0x1L) == 1L) {
					var4 = var4 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					var4 >>>= 0x1;
				}
			}
			field11507[var3] = var4;
		}
	}

	@ObfuscatedName("ahd.e([BIIB)I")
	public static int method16714(byte[] arg0, int arg1, int arg2) {
		int var3 = -1;
		for (int var4 = arg1; var4 < arg2; var4++) {
			var3 = var3 >>> 8 ^ field11504[(var3 ^ arg0[var4]) & 0xFF];
		}
		return ~var3;
	}

	@ObfuscatedName("wg.n([BII)I")
	public static int method9757(byte[] arg0, int arg1) {
		return method16714(arg0, 0, arg1);
	}

	public class997(int arg0) {
		this.field11502 = class702.method14027(arg0);
		this.field11503 = 0;
	}

	public class997(int arg0, boolean arg1) {
		this.field11502 = Statics.method14028(arg0, arg1);
	}

	public class997(byte[] arg0) {
		this.field11502 = arg0;
		this.field11503 = 0;
	}

	@ObfuscatedName("alw.m(B)V")
	public void method18142() {
		if (this.field11502 != null) {
			class702.method14031(this.field11502);
		}
		this.field11502 = null;
	}

	@ObfuscatedName("alw.k(IB)V")
	public void method18001(int arg0) {
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@ObfuscatedName("alw.f(II)V")
	public void method17945(int arg0) {
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@ObfuscatedName("alw.w(II)V")
	public void method17884(int arg0) {
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("alw.l(IB)V")
	public void method17885(int arg0) {
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@ObfuscatedName("alw.u(IB)V")
	public void method17886(int arg0) {
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@ObfuscatedName("alw.z(II)V")
	public void method17887(int arg0) {
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("alw.p(J)V")
	public void method17888(long arg0) {
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 32);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@ObfuscatedName("alw.d(J)V")
	public void method17889(long arg0) {
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 40);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 32);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@ObfuscatedName("alw.c(J)V")
	public void method17890(long arg0) {
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 56);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 48);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 40);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 32);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@ObfuscatedName("alw.r(JII)V")
	public void method18040(long arg0, int arg1) {
		int var5 = arg1 - 1;
		if (var5 < 0 || var5 > 7) {
			throw new IllegalArgumentException();
		}
		for (int var4 = var5 * 8; var4 >= 0; var4 -= 8) {
			this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> var4);
		}
	}

	@ObfuscatedName("alw.v(ZI)V")
	public void method17892(boolean arg0) {
		this.method18001(arg0 ? 1 : 0);
	}

	@ObfuscatedName("abu.y(Ljava/lang/String;I)I")
	public static int method14803(String arg0) {
		return arg0.length() + 1;
	}

	@ObfuscatedName("alw.x(Ljava/lang/String;I)V")
	public void method17893(String arg0) {
		int var2 = arg0.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.field11503 += class693.method5981(arg0, 0, arg0.length(), this.field11502, this.field11503 * 212851357) * -1445626955;
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = 0;
	}

	@ObfuscatedName("alw.a(Ljava/lang/String;I)V")
	public void method17894(String arg0) {
		int var2 = arg0.indexOf(0);
		if (var2 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = 0;
		this.field11503 += class693.method5981(arg0, 0, arg0.length(), this.field11502, this.field11503 * 212851357) * -1445626955;
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = 0;
	}

	@ObfuscatedName("alw.g(Ljava/lang/CharSequence;I)V")
	public void method17895(CharSequence arg0) {
		int var2 = class653.method8499(arg0);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = 0;
		this.method17903(var2);
		this.field11503 += class653.method18328(this.field11502, this.field11503 * 212851357, arg0) * -1445626955;
	}

	@ObfuscatedName("alw.i([BIII)V")
	public void method17896(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = arg0[var4];
		}
	}

	@ObfuscatedName("alw.j(Lalw;B)V")
	public void method18111(class997 arg0) {
		this.method17896(arg0.field11502, 0, arg0.field11503 * 212851357);
	}

	@ObfuscatedName("alw.t(II)V")
	public void method17898(int arg0) {
		if (arg0 < 0 || arg0 > 65535) {
			throw new IllegalArgumentException();
		}
		this.field11502[this.field11503 * 212851357 - arg0 - 2] = (byte) (arg0 >> 8);
		this.field11502[this.field11503 * 212851357 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("alw.ae(IB)V")
	public void method18028(int arg0) {
		if (arg0 < 0 || arg0 > 255) {
			throw new IllegalArgumentException();
		}
		this.field11502[this.field11503 * 212851357 - arg0 - 1] = (byte) arg0;
	}

	@ObfuscatedName("alw.ag(II)V")
	public void method18143(int arg0) {
		if (arg0 < 64 && arg0 >= -64) {
			this.method18001(arg0 + 64);
		} else if (arg0 < 16384 && arg0 >= -16384) {
			this.method17945(arg0 + 49152);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("alw.ah(IB)V")
	public void method18130(int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method18001(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method17945(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("alw.al(II)V")
	public void method17902(int arg0) {
		if (arg0 < -1) {
			throw new IllegalArgumentException();
		} else if (arg0 == -1) {
			this.method17945(32767);
		} else if (arg0 < 32767) {
			this.method17945(arg0);
		} else {
			this.method17886(arg0);
			this.field11502[this.field11503 * 212851357 - 4] = (byte) (this.field11502[this.field11503 * 212851357 - 4] | 0x80);
		}
	}

	@ObfuscatedName("alw.ac(II)V")
	public void method17903(int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method18001(arg0 >>> 28 | 0x80);
					}
					this.method18001(arg0 >>> 21 | 0x80);
				}
				this.method18001(arg0 >>> 14 | 0x80);
			}
			this.method18001(arg0 >>> 7 | 0x80);
		}
		this.method18001(arg0 & 0x7F);
	}

	@ObfuscatedName("alw.ai(S)I")
	public int method17904() {
		return this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] & 0xFF;
	}

	@ObfuscatedName("alw.aw(I)B")
	public byte method17905() {
		return this.field11502[(this.field11503 += -1445626955) * 212851357 - 1];
	}

	@ObfuscatedName("alw.as(I)I")
	public int method17906() {
		this.field11503 += 1403713386;
		return ((this.field11502[this.field11503 * 212851357 - 2] & 0xFF) << 8) + (this.field11502[this.field11503 * 212851357 - 1] & 0xFF);
	}

	@ObfuscatedName("alw.at(B)I")
	public int method17973() {
		this.field11503 += 1403713386;
		int var1 = ((this.field11502[this.field11503 * 212851357 - 2] & 0xFF) << 8) + (this.field11502[this.field11503 * 212851357 - 1] & 0xFF);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("alw.ad(S)I")
	public int method17908() {
		this.field11503 += -41913569;
		return (this.field11502[this.field11503 * 212851357 - 1] & 0xFF) + ((this.field11502[this.field11503 * 212851357 - 3] & 0xFF) << 16) + ((this.field11502[this.field11503 * 212851357 - 2] & 0xFF) << 8);
	}

	@ObfuscatedName("alw.am(I)I")
	public int method17899() {
		this.field11503 += -41913569;
		int var1 = (this.field11502[this.field11503 * 212851357 - 1] & 0xFF) + ((this.field11502[this.field11503 * 212851357 - 3] & 0xFF) << 16) + ((this.field11502[this.field11503 * 212851357 - 2] & 0xFF) << 8);
		if (var1 > 8388607) {
			var1 -= 16777216;
		}
		return var1;
	}

	@ObfuscatedName("alw.au(I)I")
	public int method17910() {
		this.field11503 += -1487540524;
		return (this.field11502[this.field11503 * 212851357 - 1] & 0xFF) + ((this.field11502[this.field11503 * 212851357 - 2] & 0xFF) << 8) + ((this.field11502[this.field11503 * 212851357 - 3] & 0xFF) << 16) + ((this.field11502[this.field11503 * 212851357 - 4] & 0xFF) << 24);
	}

	@ObfuscatedName("alw.ar(B)I")
	public int method17911() {
		this.field11503 += -1487540524;
		return (this.field11502[this.field11503 * 212851357 - 4] & 0xFF) + ((this.field11502[this.field11503 * 212851357 - 3] & 0xFF) << 8) + ((this.field11502[this.field11503 * 212851357 - 2] & 0xFF) << 16) + ((this.field11502[this.field11503 * 212851357 - 1] & 0xFF) << 24);
	}

	@ObfuscatedName("alw.ap(I)J")
	public long method18100() {
		long var1 = (long) this.method17904() & 0xFFFFFFFFL;
		long var3 = (long) this.method17910() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("alw.aq(I)J")
	public long method17913() {
		long var1 = (long) this.method17906() & 0xFFFFFFFFL;
		long var3 = (long) this.method17910() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("alw.ax(I)J")
	public long method17914() {
		long var1 = (long) this.method17910() & 0xFFFFFFFFL;
		long var3 = (long) this.method17910() & 0xFFFFFFFFL;
		return (var1 << 32) + var3;
	}

	@ObfuscatedName("alw.av(II)J")
	public long method17915(int arg0) {
		int var5 = arg0 - 1;
		if (var5 < 0 || var5 > 7) {
			throw new IllegalArgumentException();
		}
		int var2 = var5 * 8;
		long var3 = 0L;
		while (var2 >= 0) {
			var3 |= ((long) this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] & 0xFFL) << var2;
			var2 -= 8;
		}
		return var3;
	}

	@ObfuscatedName("alw.ao(I)F")
	public float method17916() {
		return Float.intBitsToFloat(this.method17910());
	}

	@ObfuscatedName("alw.aj(B)Ljava/lang/String;")
	public String method17917() {
		if (this.field11502[this.field11503 * 212851357] == 0) {
			this.field11503 += -1445626955;
			return null;
		} else {
			return this.method17918();
		}
	}

	@ObfuscatedName("alw.ay(I)Ljava/lang/String;")
	public String method17918() {
		int var1 = this.field11503 * 212851357;
		while (this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] != 0) {
		}
		int var2 = this.field11503 * 212851357 - var1 - 1;
		return var2 == 0 ? "" : class693.method9199(this.field11502, var1, var2);
	}

	@ObfuscatedName("alw.ab(I)Ljava/lang/String;")
	public String method17919() {
		byte var1 = this.field11502[(this.field11503 += -1445626955) * 212851357 - 1];
		if (var1 != 0) {
			throw new IllegalStateException("");
		}
		int var2 = this.field11503 * 212851357;
		while (this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] != 0) {
		}
		int var3 = this.field11503 * 212851357 - var2 - 1;
		return var3 == 0 ? "" : class693.method9199(this.field11502, var2, var3);
	}

	@ObfuscatedName("alw.az(I)Ljava/lang/String;")
	public String method17920() {
		byte var1 = this.field11502[(this.field11503 += -1445626955) * 212851357 - 1];
		if (var1 != 0) {
			throw new IllegalStateException("");
		}
		int var2 = this.method17928();
		if (this.field11503 * 212851357 + var2 > this.field11502.length) {
			throw new IllegalStateException("");
		}
		String var3 = class653.method10345(this.field11502, this.field11503 * 212851357, var2);
		this.field11503 += var2 * -1445626955;
		return var3;
	}

	@ObfuscatedName("alw.aa([BIIS)V")
	public void method17921(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			arg0[var4] = this.field11502[(this.field11503 += -1445626955) * 212851357 - 1];
		}
	}

	@ObfuscatedName("alw.af(I)I")
	public int method17922() {
		int var1 = this.field11502[this.field11503 * 212851357] & 0xFF;
		return var1 < 128 ? this.method17904() - 64 : this.method17906() - 49152;
	}

	@ObfuscatedName("alw.ak(B)I")
	public int method18123() {
		int var1 = this.field11502[this.field11503 * 212851357] & 0xFF;
		return var1 < 128 ? this.method17904() : this.method17906() - 32768;
	}

	@ObfuscatedName("alw.an(B)I")
	public int method17924() {
		int var1 = this.field11502[this.field11503 * 212851357] & 0xFF;
		return var1 < 128 ? this.method17904() - 1 : this.method17906() - 32769;
	}

	@ObfuscatedName("alw.bf(I)I")
	public int method17955() {
		int var1 = 0;
		int var2;
		for (var2 = this.method18123(); var2 == 32767; var2 = this.method18123()) {
			var1 += 32767;
		}
		return var1 + var2;
	}

	@ObfuscatedName("alw.bl(I)I")
	public int method17926() {
		return this.field11502[this.field11503 * 212851357] < 0 ? this.method17910() & Integer.MAX_VALUE : this.method17906();
	}

	@ObfuscatedName("alw.bk(I)I")
	public int method17927() {
		if (this.field11502[this.field11503 * 212851357] < 0) {
			return this.method17910() & Integer.MAX_VALUE;
		} else {
			int var1 = this.method17906();
			return var1 == 32767 ? -1 : var1;
		}
	}

	@ObfuscatedName("alw.bh(I)I")
	public int method17928() {
		byte var1 = this.field11502[(this.field11503 += -1445626955) * 212851357 - 1];
		int var2 = 0;
		while (var1 < 0) {
			var2 = (var2 | var1 & 0x7F) << 7;
			var1 = this.field11502[(this.field11503 += -1445626955) * 212851357 - 1];
		}
		return var2 | var1;
	}

	@ObfuscatedName("alw.bx(S)I")
	public int method18087() {
		int var1 = 0;
		int var2 = 0;
		int var3;
		do {
			var3 = this.method17904();
			var1 |= (var3 & 0x7F) << var2;
			var2 += 7;
		} while (var3 > 127);
		return var1;
	}

	@ObfuscatedName("alw.bd([II)V")
	public void method17966(int[] arg0) {
		int var2 = this.field11503 * 212851357 / 8;
		this.field11503 = 0;
		for (int var3 = 0; var3 < var2; var3++) {
			int var4 = this.method17910();
			int var5 = this.method17910();
			int var6 = 0;
			int var7 = -1640531527;
			int var8 = 32;
			while (var8-- > 0) {
				var4 += (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
				var6 += var7;
				var5 += (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
			}
			this.field11503 -= 1319886248;
			this.method17886(var4);
			this.method17886(var5);
		}
	}

	@ObfuscatedName("alw.bc([II)V")
	public void method17931(int[] arg0) {
		int var2 = this.field11503 * 212851357 / 8;
		this.field11503 = 0;
		for (int var3 = 0; var3 < var2; var3++) {
			int var4 = this.method17910();
			int var5 = this.method17910();
			int var6 = -957401312;
			int var7 = -1640531527;
			int var8 = 32;
			while (var8-- > 0) {
				var5 -= (var4 << 4 ^ var4 >>> 5) + var4 ^ arg0[var6 >>> 11 & 0x3] + var6;
				var6 -= var7;
				var4 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ arg0[var6 & 0x3] + var6;
			}
			this.field11503 -= 1319886248;
			this.method17886(var4);
			this.method17886(var5);
		}
	}

	@ObfuscatedName("alw.bi([IIIB)V")
	public void method17932(int[] arg0, int arg1, int arg2) {
		int var4 = this.field11503 * 212851357;
		this.field11503 = arg1 * -1445626955;
		int var5 = (arg2 - arg1) / 8;
		for (int var6 = 0; var6 < var5; var6++) {
			int var7 = this.method17910();
			int var8 = this.method17910();
			int var9 = 0;
			int var10 = -1640531527;
			int var11 = 32;
			while (var11-- > 0) {
				var7 += (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
				var9 += var10;
				var8 += (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
			}
			this.field11503 -= 1319886248;
			this.method17886(var7);
			this.method17886(var8);
		}
		this.field11503 = var4 * -1445626955;
	}

	@ObfuscatedName("alw.bn([IIII)V")
	public void method17933(int[] arg0, int arg1, int arg2) {
		int var4 = this.field11503 * 212851357;
		this.field11503 = arg1 * -1445626955;
		int var5 = (arg2 - arg1) / 8;
		for (int var6 = 0; var6 < var5; var6++) {
			int var7 = this.method17910();
			int var8 = this.method17910();
			int var9 = -957401312;
			int var10 = -1640531527;
			int var11 = 32;
			while (var11-- > 0) {
				var8 -= (var7 << 4 ^ var7 >>> 5) + var7 ^ arg0[var9 >>> 11 & 0x3] + var9;
				var9 -= var10;
				var7 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ arg0[var9 & 0x3] + var9;
			}
			this.field11503 -= 1319886248;
			this.method17886(var7);
			this.method17886(var8);
		}
		this.field11503 = var4 * -1445626955;
	}

	@ObfuscatedName("alw.bt(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
	public void method17907(BigInteger arg0, BigInteger arg1) {
		if (!client.ENABLE_RSA) {
			return;
		}

		int var3 = this.field11503 * 212851357;
		this.field11503 = 0;
		byte[] var4 = new byte[var3];
		this.method17921(var4, 0, var3);
		BigInteger var5 = new BigInteger(var4);
		BigInteger var6 = var5.modPow(arg0, arg1);
		byte[] var7 = var6.toByteArray();
		this.field11503 = 0;
		this.method17945(var7.length);
		this.method17896(var7, 0, var7.length);
	}

	@ObfuscatedName("alw.bq(II)I")
	public int method17997(int arg0) {
		int var2 = method16714(this.field11502, arg0, this.field11503 * 212851357);
		this.method17886(var2);
		return var2;
	}

	@ObfuscatedName("alw.bm(I)Z")
	public boolean method18148() {
		this.field11503 -= -1487540524;
		int var1 = method16714(this.field11502, 0, this.field11503 * 212851357);
		int var2 = this.method17910();
		return var1 == var2;
	}

	@ObfuscatedName("alw.bb(II)V")
	public void method17937(int arg0) {
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("alw.be(II)V")
	public void method17938(int arg0) {
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) -arg0;
	}

	@ObfuscatedName("alw.by(IB)V")
	public void method17939(int arg0) {
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (128 - arg0);
	}

	@ObfuscatedName("alw.bu(I)I")
	public int method17940() {
		return this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] - 128 & 0xFF;
	}

	@ObfuscatedName("alw.bw(I)I")
	public int method17988() {
		return -this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] & 0xFF;
	}

	@ObfuscatedName("alw.bo(I)I")
	public int method17990() {
		return 128 - this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] & 0xFF;
	}

	@ObfuscatedName("alw.bz(B)B")
	public byte method17942() {
		return (byte) (this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] - 128);
	}

	@ObfuscatedName("alw.bv(I)B")
	public byte method17880() {
		return (byte) -this.field11502[(this.field11503 += -1445626955) * 212851357 - 1];
	}

	@ObfuscatedName("alw.br(I)B")
	public byte method17994() {
		return (byte) (128 - this.field11502[(this.field11503 += -1445626955) * 212851357 - 1]);
	}

	@ObfuscatedName("alw.bg(IB)V")
	public void method18081(int arg0) {
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("alw.ba(II)V")
	public void method17949(int arg0) {
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 + 128);
	}

	@ObfuscatedName("alw.bp(IS)V")
	public void method17947(int arg0) {
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 + 128);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("alw.bj(I)I")
	public int method17948() {
		this.field11503 += 1403713386;
		return ((this.field11502[this.field11503 * 212851357 - 1] & 0xFF) << 8) + (this.field11502[this.field11503 * 212851357 - 2] & 0xFF);
	}

	@ObfuscatedName("alw.bs(I)I")
	public int method17934() {
		this.field11503 += 1403713386;
		return ((this.field11502[this.field11503 * 212851357 - 2] & 0xFF) << 8) + (this.field11502[this.field11503 * 212851357 - 1] - 128 & 0xFF);
	}

	@ObfuscatedName("alw.cl(I)I")
	public int method17950() {
		this.field11503 += 1403713386;
		return ((this.field11502[this.field11503 * 212851357 - 1] & 0xFF) << 8) + (this.field11502[this.field11503 * 212851357 - 2] - 128 & 0xFF);
	}

	@ObfuscatedName("alw.cg(I)I")
	public int method17951() {
		this.field11503 += 1403713386;
		int var1 = ((this.field11502[this.field11503 * 212851357 - 1] & 0xFF) << 8) + (this.field11502[this.field11503 * 212851357 - 2] & 0xFF);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("alw.ce(I)I")
	public int method17881() {
		this.field11503 += 1403713386;
		int var1 = ((this.field11502[this.field11503 * 212851357 - 2] & 0xFF) << 8) + (this.field11502[this.field11503 * 212851357 - 1] - 128 & 0xFF);
		if (var1 > 32767) {
			var1 -= 65536;
		}
		return var1;
	}

	@ObfuscatedName("alw.cu(II)V")
	public void method18122(int arg0) {
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("alw.ci(IB)V")
	public void method17935(int arg0) {
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@ObfuscatedName("alw.cn(S)I")
	public int method17967() {
		this.field11503 += -41913569;
		return (this.field11502[this.field11503 * 212851357 - 1] & 0xFF) + ((this.field11502[this.field11503 * 212851357 - 3] & 0xFF) << 8) + ((this.field11502[this.field11503 * 212851357 - 2] & 0xFF) << 16);
	}

	@ObfuscatedName("alw.cv(II)V")
	public void method17956(int arg0) {
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
	}

	@ObfuscatedName("alw.cp(II)V")
	public void method17957(int arg0) {
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
	}

	@ObfuscatedName("alw.ca(IB)V")
	public void method17958(int arg0) {
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@ObfuscatedName("alw.cx(I)I")
	public int method17959() {
		this.field11503 += -1487540524;
		return (this.field11502[this.field11503 * 212851357 - 4] & 0xFF) + ((this.field11502[this.field11503 * 212851357 - 3] & 0xFF) << 8) + ((this.field11502[this.field11503 * 212851357 - 2] & 0xFF) << 16) + ((this.field11502[this.field11503 * 212851357 - 1] & 0xFF) << 24);
	}

	@ObfuscatedName("alw.cw(I)I")
	public int method17999() {
		this.field11503 += -1487540524;
		return (this.field11502[this.field11503 * 212851357 - 3] & 0xFF) + ((this.field11502[this.field11503 * 212851357 - 4] & 0xFF) << 8) + ((this.field11502[this.field11503 * 212851357 - 1] & 0xFF) << 16) + ((this.field11502[this.field11503 * 212851357 - 2] & 0xFF) << 24);
	}

	@ObfuscatedName("alw.ct(I)I")
	public int method18029() {
		this.field11503 += -1487540524;
		return (this.field11502[this.field11503 * 212851357 - 2] & 0xFF) + ((this.field11502[this.field11503 * 212851357 - 1] & 0xFF) << 8) + ((this.field11502[this.field11503 * 212851357 - 4] & 0xFF) << 16) + ((this.field11502[this.field11503 * 212851357 - 3] & 0xFF) << 24);
	}

	@ObfuscatedName("alw.cf([BIIB)V")
	public void method17962(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1 + arg2 - 1; var4 >= arg1; var4--) {
			arg0[var4] = this.field11502[(this.field11503 += -1445626955) * 212851357 - 1];
		}
	}

	@ObfuscatedName("alw.co([BIII)V")
	public void method18022(byte[] arg0, int arg1, int arg2) {
		for (int var4 = arg1; var4 < arg1 + arg2; var4++) {
			arg0[var4] = (byte) (this.field11502[(this.field11503 += -1445626955) * 212851357 - 1] - 128);
		}
	}
}
