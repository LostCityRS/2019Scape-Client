package com.jagex.game.client;

import com.jagex.math.IntMath;
import deob.ObfuscatedName;

import java.util.Random;

@ObfuscatedName("ol")
public abstract class NoiseGenerator3D {

	@ObfuscatedName("ol.k")
	public short[] field4189;

	@ObfuscatedName("ol.f")
	public short[] field4193 = new short[512];

	@ObfuscatedName("ol.w")
	public int field4194 = 0;

	@ObfuscatedName("ol.l")
	public int field4195 = 4;

	@ObfuscatedName("ol.u")
	public int field4196 = 4;

	@ObfuscatedName("ol.z")
	public int field4191 = 4;

	@ObfuscatedName("ol.p")
	public int field4198 = 4;

	@ObfuscatedName("ol.d")
	public static final int[] field4199 = new int[4096];

	static {
		for (int var0 = 0; var0 < 4096; var0++) {
			field4199[var0] = method6155(var0);
		}
	}

	public NoiseGenerator3D(int arg0, int arg1, int arg2, int arg3, int arg4) {
		this.field4194 = arg0;
		this.field4195 = arg2;
		this.field4196 = arg3;
		this.field4191 = arg4;
		this.field4198 = arg1;
		this.method6137();
		this.method6136();
	}

	@ObfuscatedName("ol.e(III)V")
	public void method6134(int arg0, int arg1, int arg2) {
		int[] var4 = new int[arg0];
		int[] var5 = new int[arg1];
		int[] var6 = new int[arg2];
		for (int var7 = 0; var7 < arg0; var7++) {
			var4[var7] = (var7 << 12) / arg0;
		}
		for (int var8 = 0; var8 < arg1; var8++) {
			var5[var8] = (var8 << 12) / arg1;
		}
		for (int var9 = 0; var9 < arg2; var9++) {
			var6[var9] = (var9 << 12) / arg2;
		}
		this.method6147();
		for (int var10 = 0; var10 < arg2; var10++) {
			for (int var11 = 0; var11 < arg1; var11++) {
				for (int var12 = 0; var12 < arg0; var12++) {
					for (int var13 = 0; var13 < this.field4198; var13++) {
						int var14 = this.field4189[var13] << 12;
						int var15 = this.field4195 * var14 >> 12;
						int var16 = this.field4196 * var14 >> 12;
						int var17 = this.field4191 * var14 >> 12;
						int var18 = var4[var12] * var14 >> 12;
						int var19 = var5[var11] * var14 >> 12;
						int var20 = var6[var10] * var14 >> 12;
						int var21 = this.field4195 * var18;
						int var22 = this.field4196 * var19;
						int var23 = this.field4191 * var20;
						int var24 = var21 >> 12;
						int var25 = var24 + 1;
						int var26 = var24 & 0xFF;
						int var27 = var22 >> 12;
						int var28 = var27 + 1;
						int var29 = var27 & 0xFF;
						int var30 = var23 >> 12;
						int var31 = var30 + 1;
						int var32 = var30 & 0xFF;
						int var33;
						if (var25 >= var15) {
							var33 = 0;
						} else {
							var33 = var25 & 0xFF;
						}
						int var34;
						if (var28 >= var16) {
							var34 = 0;
						} else {
							var34 = var28 & 0xFF;
						}
						int var35;
						if (var31 >= var17) {
							var35 = 0;
						} else {
							var35 = var31 & 0xFF;
						}
						int var36 = var21 & 0xFFF;
						int var37 = var22 & 0xFFF;
						int var38 = var23 & 0xFFF;
						int var39 = field4199[var36];
						int var40 = field4199[var37];
						int var41 = field4199[var38];
						int var42 = var36 - 4096;
						int var43 = var37 - 4096;
						int var44 = var38 - 4096;
						short var45 = this.field4193[var32];
						short var46 = this.field4193[var35];
						short var47 = this.field4193[var29 + var45];
						short var48 = this.field4193[var34 + var45];
						short var49 = this.field4193[var29 + var46];
						short var50 = this.field4193[var34 + var46];
						int var51 = method6135(this.field4193[var26 + var47], var36, var37, var38);
						int var52 = method6135(this.field4193[var33 + var47], var42, var37, var38);
						int var53 = ((var52 - var51) * var39 >> 12) + var51;
						int var54 = method6135(this.field4193[var26 + var48], var36, var43, var38);
						int var55 = method6135(this.field4193[var33 + var48], var42, var43, var38);
						int var56 = ((var55 - var54) * var39 >> 12) + var54;
						int var57 = ((var56 - var53) * var40 >> 12) + var53;
						int var58 = method6135(this.field4193[var26 + var49], var36, var37, var44);
						int var59 = method6135(this.field4193[var33 + var49], var42, var37, var44);
						int var60 = ((var59 - var58) * var39 >> 12) + var58;
						int var61 = method6135(this.field4193[var26 + var50], var36, var43, var44);
						int var62 = method6135(this.field4193[var33 + var50], var42, var43, var44);
						int var63 = ((var62 - var61) * var39 >> 12) + var61;
						int var64 = ((var63 - var60) * var40 >> 12) + var60;
						this.method6138(var13, ((var64 - var57) * var41 >> 12) + var57);
					}
					this.method6143();
				}
			}
		}
	}

	@ObfuscatedName("ol.f()V")
	public void method6137() {
		this.field4189 = new short[this.field4198];
		for (int var1 = 0; var1 < this.field4198; var1++) {
			this.field4189[var1] = (short) Math.pow(2.0D, (double) var1);
		}
	}

	@ObfuscatedName("ol.w(IIII)I")
	public static int method6135(int arg0, int arg1, int arg2, int arg3) {
		int var4 = arg0 & 0xF;
		int var5 = var4 < 8 ? arg1 : arg2;
		int var6 = var4 < 4 ? arg2 : var4 == 12 || var4 == 14 ? arg1 : arg3;
		return ((var4 & 0x1) == 0 ? var5 : -var5) + ((var4 & 0x2) == 0 ? var6 : -var6);
	}

	@ObfuscatedName("ol.l()V")
	public void method6136() {
		Random var1 = new Random((long) this.field4194);
		for (int var2 = 0; var2 < 255; var2++) {
			this.field4193[var2] = (short) var2;
		}
		for (int var3 = 0; var3 < 255; var3++) {
			int var4 = 255 - var3;
			int var5 = IntMath.method14985(var1, var4);
			short var6 = this.field4193[var5];
			this.field4193[var5] = this.field4193[var4];
			this.field4193[var4] = this.field4193[var4 + 256] = var6;
		}
	}

	@ObfuscatedName("ol.u(I)I")
	public static final int method6155(int arg0) {
		int var1 = (arg0 * arg0 >> 12) * arg0 >> 12;
		int var2 = arg0 * 6 - 61440;
		int var3 = (arg0 * var2 >> 12) + 40960;
		return var1 * var3 >> 12;
	}

	@ObfuscatedName("ol.k(II)V")
	public abstract void method6138(int arg0, int arg1);

	@ObfuscatedName("ol.m()V")
	public abstract void method6143();

	@ObfuscatedName("ol.n()V")
	public abstract void method6147();
}
