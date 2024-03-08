package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("eo")
public class class138 {

	@ObfuscatedName("eo.e")
	public float[] field1658;

	@ObfuscatedName("eo.n")
	public int field1657;

	public class138(float[] arg0, int arg1) {
		this.field1658 = arg0;
		this.field1657 = arg1;
	}

	@ObfuscatedName("vi.e([FIFZFZ[FB)I")
	public static int method9407(float[] arg0, int arg1, float arg2, boolean arg3, float arg4, boolean arg5, float[] arg6) {
		float var7 = 0.0F;
		for (int var8 = 0; var8 < arg1 + 1; var8++) {
			var7 += Math.abs(arg0[var8]);
		}
		float var9 = (Math.abs(arg2) + Math.abs(arg4)) * (float) (arg1 + 1) * class114.field1287;
		if (var7 <= var9) {
			return -1;
		}
		float[] var10 = new float[arg1 + 1];
		for (int var11 = 0; var11 < arg1 + 1; var11++) {
			var10[var11] = 1.0F / var7 * arg0[var11];
		}
		while (Math.abs(var10[arg1]) < var9) {
			arg1--;
		}
		int var12 = 0;
		if (arg1 == 0) {
			return var12;
		} else if (arg1 == 1) {
			arg6[0] = -var10[0] / var10[1];
			boolean var13 = arg3 ? arg2 < arg6[0] + var9 : arg2 < arg6[0] - var9;
			boolean var14 = arg5 ? arg4 > arg6[0] - var9 : arg4 > arg6[0] + var9;
			int var15 = var13 && var14 ? 1 : 0;
			if (var15 > 0) {
				if (arg3 && arg6[0] < arg2) {
					arg6[0] = arg2;
				} else if (arg5 && arg6[0] > arg4) {
					arg6[0] = arg4;
				}
			}
			return var15;
		} else {
			class138 var16 = new class138(var10, arg1);
			float[] var17 = new float[arg1 + 1];
			for (int var18 = 1; var18 <= arg1; var18++) {
				var17[var18 - 1] = var10[var18] * (float) var18;
			}
			float[] var19 = new float[arg1 + 1];
			int var20 = method9407(var17, arg1 - 1, arg2, false, arg4, false, var19);
			if (var20 == -1) {
				return 0;
			}
			boolean var21 = false;
			float var22 = 0.0F;
			float var23 = 0.0F;
			float var24 = 0.0F;
			for (int var25 = 0; var25 <= var20; var25++) {
				if (var12 > arg1) {
					return var12;
				}
				float var26;
				float var27;
				if (var25 == 0) {
					var26 = arg2;
					var27 = method4656(var10, arg1, arg2);
					if (Math.abs(var27) <= var9 && arg3) {
						arg6[var12++] = arg2;
					}
				} else {
					var26 = var24;
					var27 = var22;
				}
				if (var20 == var25) {
					var24 = arg4;
					var21 = false;
				} else {
					var24 = var19[var25];
				}
				var22 = method4656(var10, arg1, var24);
				if (var21) {
					var21 = false;
				} else if (Math.abs(var22) < var9) {
					if (var20 != var25 || arg5) {
						arg6[var12++] = var24;
						var21 = true;
					}
				} else if (var27 < 0.0F && var22 > 0.0F || var27 > 0.0F && var22 < 0.0F) {
					arg6[var12++] = method15228(var16, var26, var24, 0.0F);
					if (var12 > 1 && arg6[var12 - 2] >= arg6[var12 - 1] - var9) {
						arg6[var12 - 2] = (arg6[var12 - 2] + arg6[var12 - 1]) * 0.5F;
						var12--;
					}
				}
			}
			return var12;
		}
	}

	@ObfuscatedName("ju.n([FIFS)F")
	public static float method4656(float[] arg0, int arg1, float arg2) {
		float var3 = arg0[arg1];
		for (int var4 = arg1 - 1; var4 >= 0; var4--) {
			var3 = arg2 * var3 + arg0[var4];
		}
		return var3;
	}

	@ObfuscatedName("adg.m(Leo;FFFI)F")
	public static float method15228(class138 arg0, float arg1, float arg2, float arg3) {
		float var4 = method4656(arg0.field1658, arg0.field1657, arg1);
		if (Math.abs(var4) < class114.field1287) {
			return arg1;
		}
		float var5 = method4656(arg0.field1658, arg0.field1657, arg2);
		if (Math.abs(var5) < class114.field1287) {
			return arg2;
		}
		float var6 = 0.0F;
		float var7 = 0.0F;
		float var8 = 0.0F;
		float var9 = 0.0F;
		boolean var10 = true;
		boolean var11 = false;
		boolean var12;
		do {
			var12 = false;
			if (var10) {
				var6 = arg1;
				var9 = var4;
				var7 = arg2 - arg1;
				var8 = var7;
				var10 = false;
			}
			if (Math.abs(var9) < Math.abs(var5)) {
				arg1 = arg2;
				arg2 = var6;
				var6 = arg1;
				var4 = var5;
				var5 = var9;
				var9 = var4;
			}
			float var13 = class114.field1288 * Math.abs(arg2) + arg3 * 0.5F;
			float var14 = (var6 - arg2) * 0.5F;
			boolean var15 = Math.abs(var14) > var13 && var5 != 0.0F;
			if (var15) {
				if (Math.abs(var8) < var13 || Math.abs(var4) <= Math.abs(var5)) {
					var7 = var14;
					var8 = var14;
				} else {
					float var16 = var5 / var4;
					float var17;
					float var18;
					if (arg1 == var6) {
						var17 = var14 * 2.0F * var16;
						var18 = 1.0F - var16;
					} else {
						float var19 = var4 / var9;
						float var20 = var5 / var9;
						var17 = (var14 * 2.0F * var19 * (var19 - var20) - (arg2 - arg1) * (var20 - 1.0F)) * var16;
						var18 = (var19 - 1.0F) * (var20 - 1.0F) * (var16 - 1.0F);
					}
					if ((double) var17 > 0.0D) {
						var18 = -var18;
					} else {
						var17 = -var17;
					}
					float var21 = var8;
					var8 = var7;
					if (var17 * 2.0F < var14 * 3.0F * var18 - Math.abs(var13 * var18) && var17 < Math.abs(var21 * 0.5F * var18)) {
						var7 = var17 / var18;
					} else {
						var7 = var14;
						var8 = var14;
					}
				}
				arg1 = arg2;
				var4 = var5;
				if (Math.abs(var7) > var13) {
					arg2 += var7;
				} else if ((double) var14 > 0.0D) {
					arg2 += var13;
				} else {
					arg2 -= var13;
				}
				var5 = method4656(arg0.field1658, arg0.field1657, arg2);
				if ((double) (var5 * (var9 / Math.abs(var9))) > 0.0D) {
					var10 = true;
					var12 = true;
				} else {
					var12 = true;
				}
			}
		} while (var12);
		return arg2;
	}
}
