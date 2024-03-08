package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("yk")
public class class662 {

	@ObfuscatedName("yk.e")
	public static int field8147 = 0;

	@ObfuscatedName("yk.n")
	public static int field8148 = 0;

	public class662() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("xi.e(ZZI)V")
	public static void method10156(boolean arg0, boolean arg1) {
		if (arg0) {
			field8147++;
			method5131();
		}
		if (arg1) {
			field8148++;
			method3129();
		}
	}

	@ObfuscatedName("abu.n(ZZI)V")
	public static void method14805(boolean arg0, boolean arg1) {
		if (arg0) {
			field8147--;
			if (field8147 == 0) {
				Statics.field8149 = null;
			}
		}
		if (arg1) {
			field8148--;
			if (field8148 == 0) {
				Statics.field8151 = null;
			}
		}
	}

	@ObfuscatedName("ke.m(I)V")
	public static void method5131() {
		if (Statics.field8149 != null) {
			return;
		}
		Statics.field8149 = new int[65536];
		double var0 = 0.7D;
		int var2 = 0;
		for (int var3 = 0; var3 < 512; var3++) {
			float var4 = ((float) (var3 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			float var5 = (float) (var3 & 0x7) / 8.0F + 0.0625F;
			for (int var6 = 0; var6 < 128; var6++) {
				float var7 = (float) var6 / 128.0F;
				float var8 = 0.0F;
				float var9 = 0.0F;
				float var10 = 0.0F;
				float var11 = var4 / 60.0F;
				int var12 = (int) var11;
				int var13 = var12 % 6;
				float var14 = var11 - (float) var12;
				float var15 = (1.0F - var5) * var7;
				float var16 = (1.0F - var5 * var14) * var7;
				float var17 = (1.0F - (1.0F - var14) * var5) * var7;
				if (var13 == 0) {
					var8 = var7;
					var9 = var17;
					var10 = var15;
				} else if (var13 == 1) {
					var8 = var16;
					var9 = var7;
					var10 = var15;
				} else if (var13 == 2) {
					var8 = var15;
					var9 = var7;
					var10 = var17;
				} else if (var13 == 3) {
					var8 = var15;
					var9 = var16;
					var10 = var7;
				} else if (var13 == 4) {
					var8 = var17;
					var9 = var15;
					var10 = var7;
				} else if (var13 == 5) {
					var8 = var7;
					var9 = var15;
					var10 = var16;
				}
				float var18 = (float) Math.pow((double) var8, var0);
				float var19 = (float) Math.pow((double) var9, var0);
				float var20 = (float) Math.pow((double) var10, var0);
				int var21 = (int) (var18 * 256.0F);
				int var22 = (int) (var19 * 256.0F);
				int var23 = (int) (var20 * 256.0F);
				int var24 = (var22 << 8) + (var21 << 16) + -16777216 + var23;
				Statics.field8149[var2++] = var24;
			}
		}
	}

	@ObfuscatedName("ff.k(S)V")
	public static void method3129() {
		if (Statics.field8151 != null) {
			return;
		}
		Statics.field8151 = new int[65536];
		Statics.field8150 = new int[65536];
		double var0 = 0.7D;
		for (int var2 = 0; var2 < 65536; var2++) {
			double var3 = (double) (var2 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			double var5 = (double) (var2 >> 7 & 0x7) / 8.0D + 0.0625D;
			double var7 = (double) (var2 & 0x7F) / 128.0D;
			double var9 = var7;
			double var11 = var7;
			double var13 = var7;
			if (var5 != 0.0D) {
				double var15;
				if (var7 < 0.5D) {
					var15 = (var5 + 1.0D) * var7;
				} else {
					var15 = var5 + var7 - var5 * var7;
				}
				double var17 = var7 * 2.0D - var15;
				double var19 = var3 + 0.3333333333333333D;
				if (var19 > 1.0D) {
					var19--;
				}
				double var23 = var3 - 0.3333333333333333D;
				if (var23 < 0.0D) {
					var23++;
				}
				if (var19 * 6.0D < 1.0D) {
					var9 = (var15 - var17) * 6.0D * var19 + var17;
				} else if (var19 * 2.0D < 1.0D) {
					var9 = var15;
				} else if (var19 * 3.0D < 2.0D) {
					var9 = (var15 - var17) * (0.6666666666666666D - var19) * 6.0D + var17;
				} else {
					var9 = var17;
				}
				if (var3 * 6.0D < 1.0D) {
					var11 = (var15 - var17) * 6.0D * var3 + var17;
				} else if (var3 * 2.0D < 1.0D) {
					var11 = var15;
				} else if (var3 * 3.0D < 2.0D) {
					var11 = (var15 - var17) * (0.6666666666666666D - var3) * 6.0D + var17;
				} else {
					var11 = var17;
				}
				if (var23 * 6.0D < 1.0D) {
					var13 = (var15 - var17) * 6.0D * var23 + var17;
				} else if (var23 * 2.0D < 1.0D) {
					var13 = var15;
				} else if (var23 * 3.0D < 2.0D) {
					var13 = (var15 - var17) * (0.6666666666666666D - var23) * 6.0D + var17;
				} else {
					var13 = var17;
				}
			}
			double var25 = Math.pow(var9, var0);
			double var27 = Math.pow(var11, var0);
			double var29 = Math.pow(var13, var0);
			int var31 = (int) (var25 * 256.0D);
			int var32 = (int) (var27 * 256.0D);
			int var33 = (int) (var29 * 256.0D);
			int var34 = (var31 << 16) + (var32 << 8) + var33;
			Statics.field8151[var2] = var34 & 0xFFFFFF;
			int var35 = (var32 << 8) + (var33 << 16) + var31;
			Statics.field8150[var2] = var35;
		}
	}

	@ObfuscatedName("jr.f(II)S")
	public static short method4937(int arg0) {
		int var1 = arg0 >> 10 & 0x3F;
		int var2 = arg0 >> 3 & 0x70;
		int var3 = arg0 & 0x7F;
		int var4 = var3 <= 64 ? var2 * var3 >> 7 : (127 - var3) * var2 >> 7;
		int var5 = var3 + var4;
		int var6;
		if (var5 == 0) {
			var6 = var4 << 1;
		} else {
			var6 = (var4 << 8) / var5;
		}
		return (short) (var1 << 10 | var6 >> 4 << 7 | var5);
	}

	@ObfuscatedName("pm.w(IIB)I")
	public static int method6807(int arg0, int arg1) {
		int var2 = (arg0 & 0x7F) * arg1 >> 7;
		if (var2 < 2) {
			var2 = 2;
		} else if (var2 > 126) {
			var2 = 126;
		}
		return (arg0 & 0xFF80) + var2;
	}

	@ObfuscatedName("mb.l(III)I")
	public static int method5859(int arg0, int arg1) {
		int var2 = arg1 >>> 24;
		int var3 = 255 - var2;
		int var4 = ((arg1 & 0xFF00FF) * var2 & 0xFF00FF00 | (arg1 & 0xFF00) * var2 & 0xFF0000) >>> 8;
		return (((arg0 & 0xFF00FF) * var3 & 0xFF00FF00 | (arg0 & 0xFF00) * var3 & 0xFF0000) >>> 8) + var4;
	}

	@ObfuscatedName("fd.u(IIII)I")
	public static int method3057(int arg0, int arg1, int arg2) {
		int var3 = 255 - arg2;
		int var4 = ((arg1 & 0xFF00FF) * arg2 & 0xFF00FF00 | (arg1 & 0xFF00) * arg2 & 0xFF0000) >>> 8;
		return (((arg0 & 0xFF00FF) * var3 & 0xFF00FF00 | (arg0 & 0xFF00) * var3 & 0xFF0000) >>> 8) + var4;
	}

	@ObfuscatedName("aqy.z(IIFI)I")
	public static int method19201(int arg0, int arg1, float arg2) {
		return method3057(arg0, arg1, (int) arg2);
	}

	@ObfuscatedName("yg.p(II)I")
	public static int method10521(int arg0) {
		double var1 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		double var3 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		double var5 = (double) (arg0 & 0xFF) / 256.0D;
		double var7 = var1;
		if (var3 < var1) {
			var7 = var3;
		}
		if (var5 < var7) {
			var7 = var5;
		}
		double var9 = var1;
		if (var3 > var1) {
			var9 = var3;
		}
		if (var5 > var9) {
			var9 = var5;
		}
		double var11 = 0.0D;
		double var13 = 0.0D;
		double var15 = (var7 + var9) / 2.0D;
		if (var7 != var9) {
			if (var15 < 0.5D) {
				var13 = (var9 - var7) / (var7 + var9);
			}
			if (var15 >= 0.5D) {
				var13 = (var9 - var7) / (2.0D - var9 - var7);
			}
			if (var1 == var9) {
				var11 = (var3 - var5) / (var9 - var7);
			} else if (var3 == var9) {
				var11 = (var5 - var1) / (var9 - var7) + 2.0D;
			} else if (var5 == var9) {
				var11 = (var1 - var3) / (var9 - var7) + 4.0D;
			}
		}
		double var17 = var11 / 6.0D;
		int var19 = (int) (var17 * 256.0D);
		int var20 = (int) (var13 * 256.0D);
		int var21 = (int) (var15 * 256.0D);
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}
		if (var21 < 0) {
			var21 = 0;
		} else if (var21 > 255) {
			var21 = 255;
		}
		if (var21 > 243) {
			var20 >>= 0x4;
		} else if (var21 > 217) {
			var20 >>= 0x3;
		} else if (var21 > 192) {
			var20 >>= 0x2;
		} else if (var21 > 179) {
			var20 >>= 0x1;
		}
		return (var21 >> 1) + ((var19 & 0xFF) >> 2 << 10) + (var20 >> 5 << 7);
	}

	@ObfuscatedName("dd.d(IIB)I")
	public static final int method1625(int arg0, int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		int var2 = (arg0 & 0x7F) * arg1 >> 7;
		if (var2 < 2) {
			var2 = 2;
		} else if (var2 > 126) {
			var2 = 126;
		}
		return (arg0 & 0xFF80) + var2;
	}

	@ObfuscatedName("xs.c(IIB)I")
	public static final int method10223(int arg0, int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			int var2 = (arg0 & 0x7F) * arg1 >> 7;
			if (var2 < 2) {
				var2 = 2;
			} else if (var2 > 126) {
				var2 = 126;
			}
			return (arg0 & 0xFF80) + var2;
		}
	}

	@ObfuscatedName("akm.r(IIIB)I")
	public static final int method17849(int arg0, int arg1, int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg2 >> 1) + ((arg0 & 0xFF) >> 2 << 10) + (arg1 >> 5 << 7);
	}
}
