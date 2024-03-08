package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("sw")
public class class503 {

	@ObfuscatedName("sw.f")
	public final int field5112;

	@ObfuscatedName("sw.w")
	public final int field5113;

	@ObfuscatedName("sw.l")
	public final int field5136;

	@ObfuscatedName("sw.u")
	public final int field5115;

	@ObfuscatedName("sw.z")
	public final boolean field5117;

	@ObfuscatedName("sw.p")
	public final int field5116;

	@ObfuscatedName("sw.d")
	public final int field5135;

	@ObfuscatedName("sw.c")
	public final int field5111;

	@ObfuscatedName("sw.r")
	public int field5125;

	@ObfuscatedName("sw.v")
	public int field5121;

	@ObfuscatedName("sw.o")
	public int field5122;

	@ObfuscatedName("sw.s")
	public int field5123;

	@ObfuscatedName("sw.y")
	public int field5130;

	@ObfuscatedName("sw.q")
	public class101 field5128;

	@ObfuscatedName("sw.x")
	public int field5126;

	@ObfuscatedName("sw.b")
	public int field5127;

	@ObfuscatedName("sw.h")
	public int field5124;

	@ObfuscatedName("sw.ac")
	public static final int[] field5138 = new int[4];

	public class503(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
		this.field5136 = arg2;
		this.field5115 = arg3;
		this.field5116 = arg4;
		this.field5117 = arg7;
		this.field5135 = arg1;
		this.field5111 = arg6;
		this.field5113 = arg5;
		this.field5112 = arg0;
		this.field5126 = arg8;
		this.field5127 = arg9;
		this.field5124 = arg10;
	}

	@ObfuscatedName("sw.e()V")
	public static void method7979() {
		Statics.field5129 = null;
		Statics.field5137 = null;
	}

	@ObfuscatedName("sw.n(IIII)Z")
	public boolean method7998(int arg0, int arg1, int arg2, int arg3) {
		int var8;
		int var9;
		int var10;
		if (this.field5117) {
			this.field5122 = 1073741823;
			var8 = this.field5136;
			var9 = this.field5115;
			var10 = this.field5116;
		} else {
			int var5 = this.field5136 - arg0;
			int var6 = this.field5115 - arg1;
			int var7 = this.field5116 - arg2;
			this.field5122 = (int) Math.sqrt((double) (var7 * var7 + var5 * var5 + var6 * var6));
			if (this.field5122 == 0) {
				this.field5122 = 1;
			}
			var8 = (var5 << 8) / this.field5122;
			var9 = (var6 << 8) / this.field5122;
			var10 = (var7 << 8) / this.field5122;
		}
		int var11 = (int) (Math.sqrt((double) (var10 * var10 + var8 * var8 + var9 * var9)) * 256.0D);
		if (var11 > 128) {
			var8 = (var8 << 16) / var11;
			var9 = (var9 << 16) / var11;
			var10 = (var10 << 16) / var11;
			this.field5130 = this.field5113 * arg3 / (this.field5117 ? 1024 : this.field5122);
		} else {
			this.field5130 = 0;
		}
		if (this.field5130 < 8) {
			this.field5128 = null;
			return false;
		}
		int var12 = class783.method16657(this.field5130);
		if (var12 > arg3) {
			var12 = class783.method3082(arg3);
		}
		if (var12 > 512) {
			var12 = 512;
		}
		if (this.field5123 != var12) {
			this.field5123 = var12;
		}
		this.field5125 = (int) (Math.asin((double) ((float) var9 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.field5121 = (int) (Math.atan2((double) var8, (double) -var10) * 2607.5945876176133D) & 0x3FFF;
		this.field5128 = null;
		return true;
	}

	@ObfuscatedName("sw.m(Ldh;Lsw;)Z")
	public boolean method7980(class133 arg0, class503 arg1) {
		return this.field5128 != null || this.method7999(arg0, arg1);
	}

	@ObfuscatedName("sw.k(Ldh;IIIIIIIIII)V")
	public void method7981(class133 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		if (this.field5128 == null) {
			return;
		}
		float[] var12 = new float[3];
		float var13 = (float) -(this.field5136 - arg7 << 16);
		float var14 = (float) (this.field5115 - arg8 << 15);
		float var15 = (float) -(this.field5116 - arg9 << 16);
		float[] var16 = new float[3];
		arg0.method2218().method6318(var16);
		float var17 = var16[0] + var13;
		float var18 = var16[1] + var14;
		float var19 = var16[2] + var15;
		arg0.method2525(var17, var18, var19, var12);
		if (var12[2] < 0.0F) {
			return;
		}
		int var20 = (int) (var12[0] - (float) (this.field5130 / 2));
		int var21 = (int) (var12[1] - (float) (this.field5130 / 2));
		if (var21 < arg4 && this.field5130 + var21 > 0 && var20 < arg3 && this.field5130 + var20 > 0) {
			this.field5128.method1446(var20, var21, this.field5130, this.field5130, 0, arg10 << 24 | 0xFFFFFF, 1);
		}
	}

	@ObfuscatedName("sw.f(Ldh;Lsw;)Z")
	public boolean method7999(class133 arg0, class503 arg1) {
		if (this.field5128 == null) {
			if (this.field5112 == 0) {
				if (Statics.field2421.method1977(class605.field7586, this.field5135, -1, class602.field7569, 0.7F, this.field5123, this.field5123, false)) {
					int[] var3 = Statics.field2421.method1983(class605.field7586, this.field5135, 0.7F, this.field5123, this.field5123, false);
					this.field5128 = arg0.method2199(var3, 0, this.field5123, this.field5123, this.field5123);
				}
			} else if (this.field5112 == 2) {
				this.method7983(arg0, arg1);
			} else if (this.field5112 == 1) {
				this.method7985(arg0, arg1);
			}
		}
		return this.field5128 != null;
	}

	@ObfuscatedName("sw.w(Ldh;Lsw;)V")
	public void method7983(class133 arg0, class503 arg1) {
		class120 var3 = class120.method1931(Statics.field1810, this.field5135, 0);
		if (var3 == null) {
			return;
		}
		arg0.method2171(field5138);
		arg0.method2168(0, 0, this.field5123, this.field5123);
		arg0.method2475(2, 0);
		arg0.method2354(0, 0, this.field5123, this.field5123, 0, 0);
		int var4 = 0;
		int var5 = 0;
		int var6 = 256;
		if (arg1 != null) {
			if (arg1.field5117) {
				var4 = -arg1.field5136;
				var5 = -arg1.field5115;
				var6 = -arg1.field5116;
			} else {
				var4 = this.field5136 - arg1.field5136;
				var5 = this.field5115 - arg1.field5115;
				var6 = this.field5116 - arg1.field5116;
			}
		}
		if (this.field5125 != 0) {
			int var7 = -this.field5125 & 0x3FFF;
			int var8 = class417.field4270[var7];
			int var9 = class417.field4272[var7];
			int var10 = var5 * var9 - var6 * var8 >> 14;
			var6 = var5 * var8 + var6 * var9 >> 14;
			var5 = var10;
		}
		if (this.field5121 != 0) {
			int var11 = -this.field5121 & 0x3FFF;
			int var12 = class417.field4270[var11];
			int var13 = class417.field4272[var11];
			int var14 = var4 * var13 + var6 * var12 >> 14;
			var6 = var6 * var13 - var4 * var12 >> 14;
			var4 = var14;
		}
		arg0.method2222(1.0F);
		arg0.method2223(this.field5111, 1.0F, 1.0F, (float) var4, (float) var5, (float) var6);
		var3.method1946(this.field5126 & 0x3FFF, this.field5127 & 0x3FFF, this.field5124 & 0x3FFF);
		class116 var15 = arg0.method2211(var3, 2048, 0, 64, 768);
		int var16 = var15.method1730() - var15.method1729();
		int var17 = var15.method1695() - var15.method1748();
		int var18 = var16 > var17 ? var16 : var17;
		int var19 = this.field5123 * 1024 / var18;
		class426 var20 = arg0.method2355();
		class426 var21 = arg0.method2208();
		var21.method6622((float) (this.field5123 / 2), (float) (this.field5123 / 2), (float) var19, (float) var19, 50.0F, 50000.0F, (float) arg0.method2135().method1627(), (float) arg0.method2135().method1628(), 1024.0F);
		arg0.method2220(var21);
		class419 var22 = new class419();
		arg0.method2217(var22);
		class419 var23 = arg0.method2209();
		var23.method6313(0.0F, 0.0F, (float) (50 - var15.method1733()));
		var15.method1813(var23, null, 1);
		this.field5128 = arg0.method2314(0, 0, this.field5123, this.field5123, true);
		this.field5128.method1441(0, 0, 3);
		arg0.method2220(var20);
		arg0.method2168(field5138[0], field5138[1], field5138[2], field5138[3]);
	}

	@ObfuscatedName("sw.l(Ldh;Lsw;)V")
	public void method7985(class133 arg0, class503 arg1) {
		method7992(arg0);
		method7986(arg0);
		arg0.method2171(field5138);
		arg0.method2168(0, 0, this.field5123, this.field5123);
		arg0.method2475(2, 0);
		arg0.method2354(0, 0, this.field5123, this.field5123, this.field5111 | 0xFF000000, 0);
		int var3 = 0;
		int var4 = 0;
		int var5 = 256;
		if (arg1 != null) {
			if (arg1.field5117) {
				var3 = -arg1.field5136;
				var4 = -arg1.field5115;
				var5 = -arg1.field5116;
			} else {
				var3 = arg1.field5136 - this.field5136;
				var4 = arg1.field5115 - this.field5115;
				var5 = arg1.field5116 - this.field5116;
			}
		}
		if (this.field5125 != 0) {
			int var6 = class417.field4270[this.field5125];
			int var7 = class417.field4272[this.field5125];
			int var8 = var4 * var7 - var5 * var6 >> 14;
			var5 = var4 * var6 + var5 * var7 >> 14;
			var4 = var8;
		}
		if (this.field5121 != 0) {
			int var9 = class417.field4270[this.field5121];
			int var10 = class417.field4272[this.field5121];
			int var11 = var3 * var10 + var5 * var9 >> 14;
			var5 = var5 * var10 - var3 * var9 >> 14;
			var3 = var11;
		}
		class116 var12 = Statics.field5129.method1773((byte) 0, 51200, true);
		var12.method1744((short) 0, (short) this.field5135);
		arg0.method2222(1.0F);
		arg0.method2223(16777215, 1.0F, 1.0F, (float) var3, (float) var4, (float) var5);
		int var13 = this.field5123 * 1024 / (var12.method1730() - var12.method1729());
		if (this.field5111 != 0) {
			var13 = var13 * 13 / 16;
		}
		class426 var14 = arg0.method2355();
		class426 var15 = arg0.method2208();
		var15.method6622((float) (this.field5123 / 2), (float) (this.field5123 / 2), (float) var13, (float) var13, 50.0F, 50000.0F, (float) arg0.method2135().method1627(), (float) arg0.method2135().method1628(), 1024.0F);
		arg0.method2220(var15);
		arg0.method2217(new class419());
		class419 var16 = new class419();
		var16.method6313(0.0F, 0.0F, (float) (50 - var12.method1733()));
		var12.method1813(var16, null, 1);
		int var17 = this.field5123 * 13 / 16;
		int var18 = (this.field5123 - var17) / 2;
		Statics.field5118.method1446(var18, var18, var17, var17, 0, this.field5111 | 0xFF000000, 1);
		this.field5128 = arg0.method2314(0, 0, this.field5123, this.field5123, true);
		arg0.method2475(2, 0);
		arg0.method2354(0, 0, this.field5123, this.field5123, 0, 0);
		Statics.field5137.method1446(0, 0, this.field5123, this.field5123, 1, 0, 0);
		this.field5128.method1441(0, 0, 3);
		arg0.method2220(var14);
		arg0.method2168(field5138[0], field5138[1], field5138[2], field5138[3]);
	}

	@ObfuscatedName("sw.u(Ldh;)V")
	public static void method7992(class133 arg0) {
		if (Statics.field5129 != null) {
			return;
		}
		class120 var1 = new class120(580, 1104, 1);
		var1.method1935((short) 0, (short) 32767, (short) 0, (short) 1024, (short) 1024, (short) 1024, (byte) 0, (byte) 0, (byte) 0);
		var1.method1936(0, 128, 0);
		var1.method1936(0, -128, 0);
		for (int var2 = 0; var2 <= 24; var2++) {
			int var3 = var2 * 8192 / 24;
			int var4 = class417.field4270[var3];
			int var5 = class417.field4272[var3];
			for (int var6 = 1; var6 < 24; var6++) {
				int var7 = var6 * 8192 / 24;
				int var8 = class417.field4272[var7] >> 7;
				int var9 = class417.field4270[var7] * var4 >> 21;
				int var10 = class417.field4270[var7] * var5 >> 21;
				var1.method1936(var10, var8, -var9);
			}
			if (var2 > 0) {
				int var11 = var2 * 23 + 2;
				int var12 = var11 - 23;
				var1.method1966(0, var12, var11, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
				for (int var13 = 1; var13 < 23; var13++) {
					int var14 = var12 + 1;
					int var15 = var11 + 1;
					var1.method1966(var12, var14, var11, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					var1.method1966(var14, var15, var11, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
					var12 = var14;
					var11 = var15;
				}
				var1.method1966(var11, var12, 1, (byte) 0, (byte) 0, (short) 127, (byte) 0, (short) 0);
			}
		}
		var1.field1374 = var1.field1373;
		var1.field1397 = null;
		var1.field1379 = null;
		var1.field1392 = null;
		Statics.field5129 = arg0.method2211(var1, 51200, 33, 64, 768);
	}

	@ObfuscatedName("sw.z(Ldh;)V")
	public static void method7986(class133 arg0) {
		if (Statics.field5137 != null) {
			return;
		}
		int[] var1 = new int[16384];
		int[] var2 = new int[16384];
		for (int var3 = 0; var3 < 64; var3++) {
			int var4 = 64 - var3;
			int var5 = var4 * var4;
			int var6 = 128 - var3 - 1;
			int var7 = var3 * 128;
			int var8 = var6 * 128;
			for (int var9 = 0; var9 < 64; var9++) {
				int var10 = 64 - var9;
				int var11 = var10 * var10;
				int var12 = 128 - var9 - 1;
				int var13 = 256 - (var5 + var11 << 8) / 4096;
				int var14 = var13 * 3072 / 1536;
				if (var14 < 0) {
					var14 = 0;
				} else if (var14 > 255) {
					var14 = 255;
				}
				int var15 = var14 / 2;
				var2[var7 + var9] = var2[var7 + var12] = var2[var8 + var9] = var2[var8 + var12] = (var14 | 0xFF00) << 16;
				var1[var7 + var9] = var1[var7 + var12] = var1[var8 + var9] = var1[var8 + var12] = 127 - var15 << 24 | 0xFFFFFF;
			}
		}
		Statics.field5137 = arg0.method2199(var2, 0, 128, 128, 128);
		Statics.field5118 = arg0.method2199(var1, 0, 128, 128, 128);
	}
}
