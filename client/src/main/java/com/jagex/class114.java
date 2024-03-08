package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("da")
public class class114 {

	@ObfuscatedName("da.k")
	public static final float field1287 = Math.ulp(1.0F);

	@ObfuscatedName("da.f")
	public static final float field1288 = field1287 * 2.0F;

	public class114() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ub.e(Ldn;FI)F")
	public static float method9083(class124 arg0, float arg1) {
		if (arg0 == null || arg0.method2015() == 0) {
			return 0.0F;
		} else if (arg1 < (float) arg0.field1439[0].field1663) {
			return class132.field1581 == arg0.field1437 ? arg0.field1439[0].field1660 : method7313(arg0, arg1, true);
		} else if (arg1 > (float) arg0.field1439[arg0.method2015() - 1].field1663) {
			return class132.field1581 == arg0.field1438 ? arg0.field1439[arg0.method2015() - 1].field1660 : method7313(arg0, arg1, false);
		} else if (arg0.field1444) {
			return arg0.field1439[0].field1660;
		} else {
			class139 var2 = arg0.method2022(arg1);
			boolean var3 = false;
			boolean var4 = false;
			if (var2 == null) {
				return 0.0F;
			}
			if ((double) var2.field1664 == 0.0D && (double) var2.field1659 == 0.0D) {
				var3 = true;
			} else if (var2.field1664 == Float.MAX_VALUE && var2.field1659 == Float.MAX_VALUE) {
				var4 = true;
			} else if (var2.field1665 == null) {
				var3 = true;
			} else if (arg0.field1445) {
				float[] var5 = new float[4];
				float[] var6 = new float[4];
				var5[0] = var2.field1663;
				var6[0] = var2.field1660;
				var5[1] = var2.field1664 * 0.33333334F + var5[0];
				var6[1] = var2.field1659 * 0.33333334F + var6[0];
				var5[3] = var2.field1665.field1663;
				var6[3] = var2.field1665.field1660;
				var5[2] = var5[3] - var2.field1665.field1661 * 0.33333334F;
				var6[2] = var6[3] - var2.field1665.field1662 * 0.33333334F;
				if (arg0.field1435) {
					method14845(arg0, var5, var6);
				} else {
					method16639(arg0, var5, var6);
				}
				arg0.field1445 = false;
			}
			if (var3) {
				return var2.field1660;
			} else if (var4) {
				return (float) var2.field1663 == arg1 || var2.field1665 == null ? var2.field1660 : var2.field1665.field1660;
			} else if (arg0.field1435) {
				return method13878(arg0, arg1);
			} else {
				return method5372(arg0, arg1);
			}
		}
	}

	@ObfuscatedName("zt.n(Ldn;FI)F")
	public static float method13878(class124 arg0, float arg1) {
		if (arg0 == null) {
			return 0.0F;
		}
		float var2;
		if (arg0.field1441 == arg1) {
			var2 = 0.0F;
		} else if (arg0.field1443 == arg1) {
			var2 = 1.0F;
		} else {
			var2 = (arg1 - arg0.field1441) / (arg0.field1443 - arg0.field1441);
		}
		float var3;
		if (arg0.field1440) {
			var3 = var2;
		} else {
			float[] var4 = new float[] { arg0.field1449[0] - var2, arg0.field1449[1], arg0.field1449[2], arg0.field1449[3] };
			float[] var5 = new float[5];
			int var6 = class138.method9407(var4, 3, 0.0F, true, 1.0F, true, var5);
			if (var6 == 1) {
				var3 = var5[0];
			} else {
				var3 = 0.0F;
			}
		}
		return ((arg0.field1442[3] * var3 + arg0.field1442[2]) * var3 + arg0.field1442[1]) * var3 + arg0.field1442[0];
	}

	@ObfuscatedName("km.m(Ldn;FI)F")
	public static float method5372(class124 arg0, float arg1) {
		if (arg0 == null) {
			return 0.0F;
		} else {
			float var2 = arg1 - arg0.field1441;
			return ((arg0.field1449[0] * var2 + arg0.field1449[1]) * var2 + arg0.field1449[2]) * var2 + arg0.field1449[3];
		}
	}

	@ObfuscatedName("qo.k(Ldn;FZI)F")
	public static float method7313(class124 arg0, float arg1, boolean arg2) {
		float var3 = 0.0F;
		if (arg0 == null || arg0.method2015() == 0) {
			return var3;
		}
		float var4 = (float) arg0.field1439[0].field1663;
		float var5 = (float) arg0.field1439[arg0.method2015() - 1].field1663;
		float var6 = var5 - var4;
		if ((double) var6 == 0.0D) {
			return arg0.field1439[0].field1660;
		}
		float var7 = 0.0F;
		float var8;
		if (arg1 > var5) {
			var8 = (arg1 - var5) / var6;
		} else {
			var8 = (arg1 - var4) / var6;
		}
		double var9 = (double) var8;
		float var11 = Math.abs((float) ((double) var8 - var9));
		float var12 = var6 * var11;
		double var13 = Math.abs(var9 + 1.0D);
		double var15 = var13 / 2.0D;
		double var17 = (double) var15;
		float var19 = (float) (var15 - var17);
		if (arg2) {
			if (class132.field1580 == arg0.field1437) {
				if ((double) var19 == 0.0D) {
					var12 = var5 - var12;
				} else {
					var12 += var4;
				}
			} else if (class132.field1582 == arg0.field1437 || class132.field1583 == arg0.field1437) {
				var12 = var5 - var12;
			} else if (class132.field1585 == arg0.field1437) {
				float var20 = var4 - arg1;
				float var21 = arg0.field1439[0].field1661;
				float var22 = arg0.field1439[0].field1662;
				float var23 = arg0.field1439[0].field1660;
				if ((double) var21 != 0.0D) {
					var23 -= var20 * var22 / var21;
				}
				return var23;
			}
		} else if (class132.field1580 == arg0.field1438) {
			if ((double) var19 == 0.0D) {
				var12 += var4;
			} else {
				var12 = var5 - var12;
			}
		} else if (class132.field1582 == arg0.field1438 || class132.field1583 == arg0.field1438) {
			var12 += var4;
		} else if (class132.field1585 == arg0.field1438) {
			float var24 = arg1 - var5;
			float var25 = arg0.field1439[arg0.method2015() - 1].field1664;
			float var26 = arg0.field1439[arg0.method2015() - 1].field1659;
			float var27 = arg0.field1439[arg0.method2015() - 1].field1660;
			if ((double) var25 != 0.0D) {
				var27 += var24 * var26 / var25;
			}
			return var27;
		}
		float var28 = method9083(arg0, var12);
		if (arg2 && class132.field1583 == arg0.field1437) {
			float var29 = arg0.field1439[arg0.method2015() - 1].field1660 - arg0.field1439[0].field1660;
			var28 = (float) ((double) var28 - (double) var29 * var13);
		} else if (!arg2 && class132.field1583 == arg0.field1438) {
			float var30 = arg0.field1439[arg0.method2015() - 1].field1660 - arg0.field1439[0].field1660;
			var28 = (float) ((double) var30 * var13 + (double) var28);
		}
		return var28;
	}

	@ObfuscatedName("abp.f(Ldn;[F[FB)V")
	public static void method14845(class124 arg0, float[] arg1, float[] arg2) {
		if (arg0 == null) {
			return;
		}
		float var3 = arg1[3] - arg1[0];
		if ((double) var3 == 0.0D) {
			return;
		}
		float var4 = arg1[1] - arg1[0];
		float var5 = arg1[2] - arg1[0];
		Float var6 = var4 / var3;
		Float var7 = var5 / var3;
		arg0.field1440 = var6 == 0.33333334F && var7 == 0.6666667F;
		float var8 = var6;
		float var9 = var7;
		if ((double) var6 < 0.0D) {
			var6 = 0.0F;
		}
		if ((double) var7 > 1.0D) {
			var7 = 1.0F;
		}
		if ((double) var6 > 1.0D || var7 < -1.0F) {
			method4627(var6, var7);
		}
		if (var6 != var8) {
			arg1[1] = arg1[0] + var6 * var3;
			if ((double) var8 != 0.0D) {
				arg2[1] = arg2[0] + (arg2[1] - arg2[0]) * var6 / var8;
			}
		}
		if (var7 != var9) {
			arg1[2] = arg1[0] + var7 * var3;
			if ((double) var9 != 1.0D) {
				arg2[2] = (float) ((double) arg2[3] - (double) (arg2[3] - arg2[2]) * (1.0D - (double) var7) / (1.0D - (double) var9));
			}
		}
		arg0.field1441 = arg1[0];
		arg0.field1443 = arg1[3];
		method10358(0.0F, var6, var7, 1.0F, arg0.field1449);
		method10358(arg2[0], arg2[1], arg2[2], arg2[3], arg0.field1442);
	}

	@ObfuscatedName("ahr.w(Ldn;[F[FI)V")
	public static void method16639(class124 arg0, float[] arg1, float[] arg2) {
		if (arg0 == null) {
			return;
		}
		arg0.field1441 = arg1[0];
		float var3 = arg1[3] - arg1[0];
		float var4 = arg2[3] - arg2[0];
		float var5 = arg1[1] - arg1[0];
		float var6 = 0.0F;
		float var7 = 0.0F;
		if ((double) var5 != 0.0D) {
			var6 = (arg2[1] - arg2[0]) / var5;
		}
		float var8 = arg1[3] - arg1[2];
		if ((double) var8 != 0.0D) {
			var7 = (arg2[3] - arg2[2]) / var8;
		}
		float var9 = 1.0F / (var3 * var3);
		float var10 = var3 * var6;
		float var11 = var3 * var7;
		arg0.field1449[0] = (var10 + var11 - var4 - var4) * var9 / var3;
		arg0.field1449[1] = (var4 + var4 + var4 - var10 - var10 - var11) * var9;
		arg0.field1449[2] = var6;
		arg0.field1449[3] = arg2[0];
	}

	@ObfuscatedName("im.u(Ljava/lang/Float;Ljava/lang/Float;B)V")
	public static void method4627(Float arg0, Float arg1) {
		Float var2 = 1.0F - arg1;
		if (arg0 < 0.0F) {
			arg0 = 0.0F;
		}
		if (var2 < 0.0F) {
			var2 = 0.0F;
		}
		if (arg0 > 1.0F || var2 > 1.0F) {
			float var3 = (float) ((double) (arg0 * (arg0 - 2.0F + var2)) + (double) var2 * ((double) var2 - 2.0D) + 1.0D);
			if (field1287 + var3 > 0.0F) {
				Statics.method2672(arg0, var2);
			}
		}
		Float var4 = 1.0F - var2;
	}

	@ObfuscatedName("xt.z(FFFF[FI)V")
	public static void method10358(float arg0, float arg1, float arg2, float arg3, float[] arg4) {
		float var5 = arg1 - arg0;
		float var6 = arg2 - arg1;
		float var7 = arg3 - arg2;
		float var8 = var6 - var5;
		arg4[3] = var7 - var6 - var8;
		arg4[2] = var8 + var8 + var8;
		arg4[1] = var5 + var5 + var5;
		arg4[0] = arg0;
	}
}
