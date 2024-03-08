package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("do")
public abstract class class116 {

	@ObfuscatedName("do.m")
	public boolean field1301 = false;

	@ObfuscatedName("do.k")
	public boolean field1298 = true;

	@ObfuscatedName("do.e(IIIIII[FIF[F)V")
	public static void method1753(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, int arg7, float arg8, float[] arg9) {
		int var10 = arg0 - arg3;
		int var11 = arg1 - arg4;
		int var12 = arg2 - arg5;
		float var13 = arg6[2] * (float) var12 + arg6[0] * (float) var10 + arg6[1] * (float) var11;
		float var14 = arg6[5] * (float) var12 + arg6[3] * (float) var10 + arg6[4] * (float) var11;
		float var15 = arg6[8] * (float) var12 + arg6[6] * (float) var10 + arg6[7] * (float) var11;
		float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
		float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
		float var18 = (float) Math.asin((double) (var14 / var16)) / 3.1415927F + 0.5F + arg8;
		if (arg7 == 1) {
			float var19 = var17;
			var17 = -var18;
			var18 = var19;
		} else if (arg7 == 2) {
			var17 = -var17;
			var18 = -var18;
		} else if (arg7 == 3) {
			float var20 = var17;
			var17 = var18;
			var18 = -var20;
		}
		arg9[0] = var17;
		arg9[1] = var18;
	}

	@ObfuscatedName("do.n(IIIIII[FFIF[F)V")
	public static void method1684(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6, float arg7, int arg8, float arg9, float[] arg10) {
		int var11 = arg0 - arg3;
		int var12 = arg1 - arg4;
		int var13 = arg2 - arg5;
		float var14 = arg6[2] * (float) var13 + arg6[0] * (float) var11 + arg6[1] * (float) var12;
		float var15 = arg6[5] * (float) var13 + arg6[3] * (float) var11 + arg6[4] * (float) var12;
		float var16 = arg6[8] * (float) var13 + arg6[6] * (float) var11 + arg6[7] * (float) var12;
		float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
		if (arg7 != 1.0F) {
			var17 = arg7 * var17;
		}
		float var18 = var15 + 0.5F + arg9;
		if (arg8 == 1) {
			float var19 = var17;
			var17 = -var18;
			var18 = var19;
		} else if (arg8 == 2) {
			var17 = -var17;
			var18 = -var18;
		} else if (arg8 == 3) {
			float var20 = var17;
			var17 = var18;
			var18 = -var20;
		}
		arg10[0] = var17;
		arg10[1] = var18;
	}

	@ObfuscatedName("do.m(FFF)I")
	public static int method1685(float arg0, float arg1, float arg2) {
		float var3 = arg0 < 0.0F ? -arg0 : arg0;
		float var4 = arg1 < 0.0F ? -arg1 : arg1;
		float var5 = arg2 < 0.0F ? -arg2 : arg2;
		if (var4 > var3 && var4 > var5) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (var5 > var3 && var5 > var4) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@ObfuscatedName("do.k(IIIIIII[FIFFF[F)V")
	public static void method1708(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9, float arg10, float arg11, float[] arg12) {
		int var13 = arg0 - arg3;
		int var14 = arg1 - arg4;
		int var15 = arg2 - arg5;
		float var16 = arg7[2] * (float) var15 + arg7[0] * (float) var13 + arg7[1] * (float) var14;
		float var17 = arg7[5] * (float) var15 + arg7[3] * (float) var13 + arg7[4] * (float) var14;
		float var18 = arg7[8] * (float) var15 + arg7[6] * (float) var13 + arg7[7] * (float) var14;
		float var19;
		float var20;
		if (arg6 == 0) {
			var19 = arg9 + var16 + 0.5F;
			var20 = -var18 + arg11 + 0.5F;
		} else if (arg6 == 1) {
			var19 = arg9 + var16 + 0.5F;
			var20 = arg11 + var18 + 0.5F;
		} else if (arg6 == 2) {
			var19 = -var16 + arg9 + 0.5F;
			var20 = -var17 + arg10 + 0.5F;
		} else if (arg6 == 3) {
			var19 = arg9 + var16 + 0.5F;
			var20 = -var17 + arg10 + 0.5F;
		} else if (arg6 == 4) {
			var19 = arg11 + var18 + 0.5F;
			var20 = -var17 + arg10 + 0.5F;
		} else {
			var19 = -var18 + arg11 + 0.5F;
			var20 = -var17 + arg10 + 0.5F;
		}
		if (arg8 == 1) {
			float var21 = var19;
			var19 = -var20;
			var20 = var21;
		} else if (arg8 == 2) {
			var19 = -var19;
			var20 = -var20;
		} else if (arg8 == 3) {
			float var22 = var19;
			var19 = var20;
			var20 = -var22;
		}
		arg12[0] = var19;
		arg12[1] = var20;
	}

	@ObfuscatedName("do.f(Ldq;[II)Lee;")
	public class142 method1687(class120 arg0, int[] arg1, int arg2) {
		int[] var4 = null;
		int[] var5 = null;
		int[] var6 = null;
		float[][] var7 = null;
		if (arg0.field1413 != null) {
			int var8 = arg0.field1387;
			int[] var9 = new int[var8];
			int[] var10 = new int[var8];
			int[] var11 = new int[var8];
			int[] var12 = new int[var8];
			int[] var13 = new int[var8];
			int[] var14 = new int[var8];
			for (int var15 = 0; var15 < var8; var15++) {
				var9[var15] = Integer.MAX_VALUE;
				var10[var15] = -2147483647;
				var11[var15] = Integer.MAX_VALUE;
				var12[var15] = -2147483647;
				var13[var15] = Integer.MAX_VALUE;
				var14[var15] = -2147483647;
			}
			for (int var16 = 0; var16 < arg2; var16++) {
				int var17 = arg1[var16];
				short var18 = arg0.field1413[var17];
				if (var18 > -1 && var18 < 32766) {
					for (int var19 = 0; var19 < 3; var19++) {
						short var20;
						if (var19 == 0) {
							var20 = arg0.field1415[var17];
						} else if (var19 == 1) {
							var20 = arg0.field1386[var17];
						} else {
							var20 = arg0.field1400[var17];
						}
						int var21 = arg0.field1375[var20];
						int var22 = arg0.field1382[var20];
						int var23 = arg0.field1411[var20];
						if (var21 < var9[var18]) {
							var9[var18] = var21;
						}
						if (var21 > var10[var18]) {
							var10[var18] = var21;
						}
						if (var22 < var11[var18]) {
							var11[var18] = var22;
						}
						if (var22 > var12[var18]) {
							var12[var18] = var22;
						}
						if (var23 < var13[var18]) {
							var13[var18] = var23;
						}
						if (var23 > var14[var18]) {
							var14[var18] = var23;
						}
					}
				}
			}
			var4 = new int[var8];
			var5 = new int[var8];
			var6 = new int[var8];
			var7 = new float[var8][];
			for (int var24 = 0; var24 < var8; var24++) {
				byte var25 = arg0.field1377[var24];
				if (var25 > 0) {
					var4[var24] = (var9[var24] + var10[var24]) / 2;
					var5[var24] = (var11[var24] + var12[var24]) / 2;
					var6[var24] = (var13[var24] + var14[var24]) / 2;
					float var27;
					float var28;
					float var29;
					if (var25 == 1) {
						int var26 = arg0.field1407[var24];
						if (var26 == 0) {
							var27 = 1.0F;
							var28 = 1.0F;
						} else if (var26 > 0) {
							var27 = 1.0F;
							var28 = (float) var26 / 1024.0F;
						} else {
							var28 = 1.0F;
							var27 = (float) -var26 / 1024.0F;
						}
						var29 = 64.0F / (float) arg0.field1408[var24];
					} else if (var25 == 2) {
						var27 = 64.0F / (float) arg0.field1407[var24];
						var29 = 64.0F / (float) arg0.field1408[var24];
						var28 = 64.0F / (float) arg0.field1409[var24];
					} else {
						var27 = (float) arg0.field1407[var24] / 1024.0F;
						var29 = (float) arg0.field1408[var24] / 1024.0F;
						var28 = (float) arg0.field1409[var24] / 1024.0F;
					}
					var7[var24] = method1688(arg0.field1404[var24], arg0.field1405[var24], arg0.field1406[var24], arg0.field1402[var24] & 0xFF, var27, var29, var28);
				}
			}
		}
		return new class142(this, var4, var5, var6, var7);
	}

	@ObfuscatedName("do.w(IIIIFFF)[F")
	public static float[] method1688(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6) {
		float[] var7 = new float[9];
		float[] var8 = new float[9];
		float var9 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		float var10 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
		float var11 = 1.0F - var9;
		var7[0] = var9;
		var7[1] = 0.0F;
		var7[2] = var10;
		var7[3] = 0.0F;
		var7[4] = 1.0F;
		var7[5] = 0.0F;
		var7[6] = -var10;
		var7[7] = 0.0F;
		var7[8] = var9;
		float[] var12 = new float[9];
		float var13 = 1.0F;
		float var14 = 0.0F;
		float var15 = (float) arg1 / 32767.0F;
		float var16 = -((float) Math.sqrt((double) (1.0F - var15 * var15)));
		float var17 = 1.0F - var15;
		float var18 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
		if (var18 == 0.0F && var15 == 0.0F) {
			var8 = var7;
		} else {
			if (var18 != 0.0F) {
				var13 = (float) -arg2 / var18;
				var14 = (float) arg0 / var18;
			}
			var12[0] = var13 * var13 * var17 + var15;
			var12[1] = var14 * var16;
			var12[2] = var13 * var14 * var17;
			var12[3] = -var14 * var16;
			var12[4] = var15;
			var12[5] = var13 * var16;
			var12[6] = var13 * var14 * var17;
			var12[7] = -var13 * var16;
			var12[8] = var14 * var14 * var17 + var15;
			var8[0] = var7[2] * var12[6] + var7[0] * var12[0] + var7[1] * var12[3];
			var8[1] = var7[2] * var12[7] + var7[0] * var12[1] + var7[1] * var12[4];
			var8[2] = var7[2] * var12[8] + var7[0] * var12[2] + var7[1] * var12[5];
			var8[3] = var7[5] * var12[6] + var7[3] * var12[0] + var7[4] * var12[3];
			var8[4] = var7[5] * var12[7] + var7[3] * var12[1] + var7[4] * var12[4];
			var8[5] = var7[5] * var12[8] + var7[3] * var12[2] + var7[4] * var12[5];
			var8[6] = var7[8] * var12[6] + var7[6] * var12[0] + var7[7] * var12[3];
			var8[7] = var7[8] * var12[7] + var7[6] * var12[1] + var7[7] * var12[4];
			var8[8] = var7[8] * var12[8] + var7[6] * var12[2] + var7[7] * var12[5];
		}
		var8[0] *= arg4;
		var8[1] *= arg4;
		var8[2] *= arg4;
		var8[3] *= arg5;
		var8[4] *= arg5;
		var8[5] *= arg5;
		var8[6] *= arg6;
		var8[7] *= arg6;
		var8[8] *= arg6;
		return var8;
	}

	@ObfuscatedName("do.x(Lcb;IIIIIII)V")
	public void method1701(class104 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		boolean var9 = false;
		boolean var10 = false;
		boolean var11 = false;
		int var12 = -arg4 / 2;
		int var13 = -arg5 / 2;
		int var14 = arg0.method1528(arg1 + var12, arg3 + var13);
		int var15 = arg4 / 2;
		int var16 = -arg5 / 2;
		int var17 = arg0.method1528(arg1 + var15, arg3 + var16);
		int var18 = -arg4 / 2;
		int var19 = arg5 / 2;
		int var20 = arg0.method1528(arg1 + var18, arg3 + var19);
		int var21 = arg4 / 2;
		int var22 = arg5 / 2;
		int var23 = arg0.method1528(arg1 + var21, arg3 + var22);
		int var24 = var14 < var17 ? var14 : var17;
		int var25 = var20 < var23 ? var20 : var23;
		int var26 = var17 < var23 ? var17 : var23;
		int var27 = var14 < var20 ? var14 : var20;
		if (arg5 != 0) {
			int var28 = (int) (Math.atan2((double) (var24 - var25), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (var28 != 0) {
				if (arg6 != 0) {
					if (var28 > 8192) {
						int var29 = 16384 - arg6;
						if (var28 < var29) {
							var28 = var29;
						}
					} else if (var28 > arg6) {
						var28 = arg6;
					}
				}
				this.method1852(var28);
			}
		}
		if (arg4 != 0) {
			int var30 = (int) (Math.atan2((double) (var27 - var26), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (var30 != 0) {
				if (arg7 != 0) {
					if (var30 > 8192) {
						int var31 = 16384 - arg7;
						if (var30 < var31) {
							var30 = var31;
						}
					} else if (var30 > arg7) {
						var30 = arg7;
					}
				}
				this.method1696(var30);
			}
		}
		int var32 = var14 + var23;
		if (var17 + var20 < var32) {
			var32 = var17 + var20;
		}
		int var33 = (var32 >> 1) - arg2;
		if (var33 != 0) {
			this.method1805(0, var33, 0);
		}
	}

	@ObfuscatedName("do.a(Larr;ILarr;IIIIZ)V")
	public final void method1704(class1177 arg0, int arg1, class1177 arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
		if (arg1 == -1) {
			return;
		}
		this.method1702();
		if (!this.method1716()) {
			this.method1703();
			return;
		}
		class134 var9 = arg0.field12327[arg1];
		class971 var10 = var9.field1628;
		class134 var11 = null;
		if (arg2 != null) {
			var11 = arg2.field12327[arg3];
			if (var11.field1628 != var10) {
				var11 = null;
			}
		}
		this.method1712(var10, var9, var11, arg4, arg5, arg6, null, false, arg7, 65535, null);
		this.method1776();
		this.method1703();
	}

	@ObfuscatedName("do.g(Lard;IIZ)V")
	public final void method1705(class1176 arg0, int arg1, int arg2, boolean arg3) {
		this.method1702();
		if (this.method1716()) {
			class971 var5 = arg0.field12317;
			this.method1713(var5, arg0, arg1, arg2, arg3, null, false, 65535, null);
			this.method1776();
			this.method1703();
		} else {
			this.method1703();
		}
	}

	@ObfuscatedName("do.i(Larr;ILarr;IIIIIZ[I)V")
	public final void method1706(class1177 arg0, int arg1, class1177 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int[] arg9) {
		if (arg1 == -1) {
			return;
		}
		this.method1702();
		if (!this.method1716()) {
			this.method1703();
			return;
		}
		class134 var11 = arg0.field12327[arg1];
		class971 var12 = var11.field1628;
		class134 var13 = null;
		if (arg2 != null) {
			var13 = arg2.field12327[arg3];
			if (var13.field1628 != var12) {
				var13 = null;
			}
		}
		this.method1712(var12, var11, var13, arg4, arg5, arg6, null, false, arg8, arg7, arg9);
		this.method1776();
		this.method1703();
	}

	@ObfuscatedName("do.j(Larr;ILarr;IIILarr;ILarr;III[ZZ)V")
	public final void method1697(class1177 arg0, int arg1, class1177 arg2, int arg3, int arg4, int arg5, class1177 arg6, int arg7, class1177 arg8, int arg9, int arg10, int arg11, boolean[] arg12, boolean arg13) {
		if (arg1 == -1) {
			return;
		}
		if (arg12 == null || arg7 == -1) {
			this.method1704(arg0, arg1, arg2, arg3, arg4, arg5, 0, arg13);
			return;
		}
		this.method1702();
		if (!this.method1716()) {
			this.method1703();
			return;
		}
		class134 var15 = arg0.field12327[arg1];
		class971 var16 = var15.field1628;
		class134 var17 = null;
		if (arg2 != null) {
			var17 = arg2.field12327[arg3];
			if (var17.field1628 != var16) {
				var17 = null;
			}
		}
		this.method1712(var16, var15, var17, arg4, arg5, 0, arg12, false, arg13, 65535, null);
		class134 var18 = arg6.field12327[arg7];
		class134 var19 = null;
		if (arg8 != null) {
			var19 = arg8.field12327[arg9];
			if (var19.field1628 != var16) {
				var19 = null;
			}
		}
		this.method1717(0, new int[0], 0, 0, 0, 0, arg13);
		this.method1712(var18.field1628, var18, var19, arg10, arg11, 0, arg12, true, arg13, 65535, null);
		this.method1776();
		this.method1703();
	}

	@ObfuscatedName("do.t(Lard;ILard;I[ZZ)V")
	public final void method1682(class1176 arg0, int arg1, class1176 arg2, int arg3, boolean[] arg4, boolean arg5) {
		if (arg0 == null) {
			return;
		}
		if (arg4 == null || arg2 == null) {
			this.method1705(arg0, arg1, 0, arg5);
			return;
		}
		this.method1702();
		if (!this.method1716()) {
			this.method1703();
			return;
		}
		class971 var7 = arg0.field12317;
		int var8 = arg1 % (arg0.method19384() + 1);
		this.method1713(var7, arg0, var8, 0, arg5, arg4, false, 65535, null);
		this.method1717(0, new int[0], 0, 0, 0, 0, arg5);
		class971 var9 = arg2.field12317;
		int var10 = arg3 % (arg2.method19384() + 1);
		this.method1713(var9, arg2, var10, 0, arg5, arg4, true, 65535, null);
		this.method1776();
		this.method1703();
	}

	@ObfuscatedName("do.ae(Lard;ILarr;ILarr;III[ZZ)V")
	public final void method1709(class1176 arg0, int arg1, class1177 arg2, int arg3, class1177 arg4, int arg5, int arg6, int arg7, boolean[] arg8, boolean arg9) {
		if (arg0 == null) {
			return;
		}
		if (arg8 == null || arg2 == null) {
			this.method1705(arg0, arg1, 0, arg9);
			return;
		}
		this.method1702();
		if (!this.method1716()) {
			this.method1703();
			return;
		}
		class971 var11 = arg0.field12317;
		int var12 = arg1 % (arg0.method19384() + 1);
		this.method1713(var11, arg0, var12, 0, arg9, arg8, false, 65535, null);
		class134 var13 = arg2.field12327[arg3];
		class134 var14 = null;
		if (arg4 != null) {
			var14 = arg4.field12327[arg5];
			if (var14.field1628 != var11) {
				var14 = null;
			}
		}
		this.method1717(0, new int[0], 0, 0, 0, 0, arg9);
		this.method1712(var13.field1628, var13, var14, arg6, arg7, 0, arg8, true, arg9, 65535, null);
		this.method1776();
		this.method1703();
	}

	@ObfuscatedName("do.ag(Larr;ILarr;IIILard;I[ZZ)V")
	public final void method1710(class1177 arg0, int arg1, class1177 arg2, int arg3, int arg4, int arg5, class1176 arg6, int arg7, boolean[] arg8, boolean arg9) {
		if (arg1 == -1) {
			return;
		}
		if (arg8 == null || arg6 == null) {
			this.method1704(arg0, arg1, arg2, arg3, arg4, arg5, 0, arg9);
			return;
		}
		this.method1702();
		if (!this.method1716()) {
			this.method1703();
			return;
		}
		class134 var11 = arg0.field12327[arg1];
		class971 var12 = var11.field1628;
		class134 var13 = null;
		if (arg2 != null) {
			var13 = arg2.field12327[arg3];
			if (var13.field1628 != var12) {
				var13 = null;
			}
		}
		this.method1712(var12, var11, var13, arg4, arg5, 0, arg8, false, arg9, 65535, null);
		this.method1717(0, new int[0], 0, 0, 0, 0, arg9);
		class971 var14 = arg6.field12317;
		int var15 = arg7 % (arg6.method19384() + 1);
		this.method1713(var14, arg6, var15, 0, arg9, arg8, true, 65535, null);
		this.method1776();
		this.method1703();
	}

	@ObfuscatedName("do.ah(Larr;I)V")
	public final void method1878(class1177 arg0, int arg1) {
		if (arg1 == -1) {
			return;
		}
		this.method1702();
		if (!this.method1716()) {
			this.method1703();
			return;
		}
		class134 var3 = arg0.field12327[arg1];
		class971 var4 = var3.field1628;
		for (int var5 = 0; var5 < var3.field1631; var5++) {
			short var6 = var3.field1630[var5];
			if (var4.field11311[var6]) {
				if (var3.field1634[var5] != -1) {
					this.method1721(0, 0, 0, 0);
				}
				this.method1721(var4.field11314[var6], var3.field1627[var5], var3.field1622[var5], var3.field1632[var5]);
			}
		}
		this.method1776();
		this.method1703();
	}

	@ObfuscatedName("do.al(Lako;Ldx;Ldx;III[ZZZI[I)V")
	public void method1712(class971 arg0, class134 arg1, class134 arg2, int arg3, int arg4, int arg5, boolean[] arg6, boolean arg7, boolean arg8, int arg9, int[] arg10) {
		if (arg2 == null || arg3 == 0) {
			for (int var37 = 0; var37 < arg1.field1631; var37++) {
				short var38 = arg1.field1630[var37];
				if (arg6 == null || arg6[var38] == arg7 || arg0.field11314[var38] == 0) {
					short var39 = arg1.field1634[var37];
					if (var39 != -1) {
						this.method1714(0, arg0.field11307[var39], 0, 0, 0, arg5, arg8, arg9 & arg0.field11317[var39], arg10);
					}
					this.method1714(arg0.field11314[var38], arg0.field11307[var38], arg1.field1627[var37], arg1.field1622[var37], arg1.field1632[var37], arg5, arg8, arg9 & arg0.field11317[var38], arg10);
				}
			}
			return;
		}
		int var12 = 0;
		int var13 = 0;
		for (int var14 = 0; var14 < arg0.field11313; var14++) {
			boolean var15 = false;
			if (var12 < arg1.field1631 && arg1.field1630[var12] == var14) {
				var15 = true;
			}
			boolean var16 = false;
			if (var13 < arg2.field1631 && arg2.field1630[var13] == var14) {
				var16 = true;
			}
			if (var15 || var16) {
				if (arg6 == null || arg6[var14] == arg7 || arg0.field11314[var14] == 0) {
					short var17 = 0;
					int var18 = arg0.field11314[var14];
					if (var18 == 3 || var18 == 10) {
						var17 = 128;
					}
					short var19;
					short var20;
					short var21;
					short var22;
					byte var23;
					if (var15) {
						var19 = arg1.field1627[var12];
						var20 = arg1.field1622[var12];
						var21 = arg1.field1632[var12];
						var22 = arg1.field1634[var12];
						var23 = arg1.field1635[var12];
						var12++;
					} else {
						var19 = var17;
						var20 = var17;
						var21 = var17;
						var22 = -1;
						var23 = 0;
					}
					short var24;
					short var25;
					short var26;
					short var27;
					byte var28;
					if (var16) {
						var24 = arg2.field1627[var13];
						var25 = arg2.field1622[var13];
						var26 = arg2.field1632[var13];
						var27 = arg2.field1634[var13];
						var28 = arg2.field1635[var13];
						var13++;
					} else {
						var24 = var17;
						var25 = var17;
						var26 = var17;
						var27 = -1;
						var28 = 0;
					}
					int var32;
					int var33;
					int var34;
					if ((var23 & 0x2) != 0 || (var28 & 0x1) != 0) {
						var32 = var19;
						var33 = var20;
						var34 = var21;
					} else if (var18 == 2) {
						int var29 = var24 - var19 & 0x3FFF;
						int var30 = var25 - var20 & 0x3FFF;
						int var31 = var26 - var21 & 0x3FFF;
						if (var29 >= 8192) {
							var29 -= 16384;
						}
						if (var30 >= 8192) {
							var30 -= 16384;
						}
						if (var31 >= 8192) {
							var31 -= 16384;
						}
						var32 = arg3 * var29 / arg4 + var19 & 0x3FFF;
						var33 = arg3 * var30 / arg4 + var20 & 0x3FFF;
						var34 = arg3 * var31 / arg4 + var21 & 0x3FFF;
					} else if (var18 == 9) {
						int var35 = var24 - var19 & 0x3FFF;
						if (var35 >= 8192) {
							var35 -= 16384;
						}
						var32 = arg3 * var35 / arg4 + var19 & 0x3FFF;
						var34 = 0;
						var33 = 0;
					} else if (var18 == 7) {
						int var36 = var24 - var19 & 0x3F;
						if (var36 >= 32) {
							var36 -= 64;
						}
						var32 = arg3 * var36 / arg4 + var19 & 0x3F;
						var33 = (var25 - var20) * arg3 / arg4 + var20;
						var34 = (var26 - var21) * arg3 / arg4 + var21;
					} else {
						var32 = (var24 - var19) * arg3 / arg4 + var19;
						var33 = (var25 - var20) * arg3 / arg4 + var20;
						var34 = (var26 - var21) * arg3 / arg4 + var21;
					}
					if (var22 != -1) {
						this.method1714(0, arg0.field11307[var22], 0, 0, 0, arg5, arg8, arg9 & arg0.field11317[var22], arg10);
					} else if (var27 != -1) {
						this.method1714(0, arg0.field11307[var27], 0, 0, 0, arg5, arg8, arg9 & arg0.field11317[var27], arg10);
					}
					this.method1714(var18, arg0.field11307[var14], var32, var33, var34, arg5, arg8, arg9 & arg0.field11317[var14], arg10);
				} else {
					if (var15) {
						var12++;
					}
					if (var16) {
						var13++;
					}
				}
			}
		}
	}

	@ObfuscatedName("do.ac(Lako;Lard;IIZ[ZZI[I)V")
	public void method1713(class971 arg0, class1176 arg1, int arg2, int arg3, boolean arg4, boolean[] arg5, boolean arg6, int arg7, int[] arg8) {
		class105 var10 = null;
		int var11 = 0;
		for (int var12 = 0; var12 < arg0.field11313; var12++) {
			if (arg5 == null || arg5[var12] == arg6 || arg0.field11314[var12] == 0) {
				if (arg0.field11314[var12] == 0) {
					int var13 = arg0.field11302[var11++];
					if (var13 >= 0 && var13 < arg0.field11319.length) {
						var10 = arg0.field11319[var13];
					} else {
						var10 = null;
					}
					this.method1756(0, var10, arg1.method19381(), arg0.field11307[var12], 0.0F, 0.0F, 0.0F, arg3, arg4, arg7 & arg0.field11317[var12], null);
				} else if (arg1.field12322[var12] != null) {
					float var14 = 0.0F;
					float var15 = 0.0F;
					float var16 = 0.0F;
					Object var17 = null;
					Object var18 = null;
					float[] var19;
					float[] var20;
					if (var10 == null) {
						var19 = new float[] { 0.0F, 0.0F, 0.0F };
						var20 = new float[] { 0.0F, 0.0F, 0.0F };
					} else {
						var19 = new float[] { var10.method1570(arg1.method19381()).field4315[12], var10.method1570(arg1.method19381()).field4315[13], var10.method1570(arg1.method19381()).field4315[14] };
						var20 = var10.method1564(arg1.method19381()).method6602();
					}
					if (arg0.field11314[var12] == 1) {
						var14 = var19[0];
						var15 = var19[1];
						var16 = var19[2];
					} else if (arg0.field11314[var12] == 3) {
						var14 = 1.0F;
						var15 = 1.0F;
						var16 = 1.0F;
					} else if (arg0.field11314[var12] == 2) {
						var14 = var20[0];
						var15 = var20[1];
						var16 = var20[2];
					}
					int var21 = arg0.field11314[var12];
					for (int var22 = 0; var22 < arg1.field12322[var12].length; var22++) {
						class124 var23 = arg1.field12322[var12][var22];
						if (var23 != null && (var21 != 7 || var22 < 0 || var22 >= 3)) {
							float var24 = var23.method2017(arg2);
							switch(var22) {
								case 0:
									var14 = var24;
									break;
								case 1:
									var15 = var24;
									break;
								case 2:
									var16 = var24;
									break;
								case 3:
									var14 = var24;
									break;
								case 4:
									var15 = var24;
									break;
								case 5:
									var16 = var24;
							}
						}
					}
					if (var21 == 9) {
						var14 = var16;
					}
					this.method1756(var21, var10, arg1.method19381(), arg0.field11307[var12], var14, var15, var16, arg3, arg4, arg7 & arg0.field11317[var12], arg8);
				}
			}
		}
	}

	@ObfuscatedName("do.ai(I[IIIIIZI[I)V")
	public void method1714(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int[] arg8) {
		if (arg5 == 1) {
			if (arg0 == 0 || arg0 == 1) {
				int var12 = -arg2;
				arg2 = arg4;
				arg4 = var12;
			} else if (arg0 == 3) {
				int var10 = arg2;
				arg2 = arg4;
				arg4 = var10;
			} else if (arg0 == 2) {
				int var11 = arg2;
				arg2 = -arg4 & 0x3FFF;
				arg4 = var11 & 0x3FFF;
			}
		} else if (arg5 == 2) {
			if (arg0 == 0 || arg0 == 1) {
				arg2 = -arg2;
				arg4 = -arg4;
			} else if (arg0 == 2) {
				arg2 = -arg2 & 0x3FFF;
				arg4 = -arg4 & 0x3FFF;
			}
		} else if (arg5 == 3) {
			if (arg0 == 0 || arg0 == 1) {
				int var15 = arg2;
				arg2 = -arg4;
				arg4 = var15;
			} else if (arg0 == 3) {
				int var13 = arg2;
				arg2 = arg4;
				arg4 = var13;
			} else if (arg0 == 2) {
				int var14 = arg2;
				arg2 = arg4 & 0x3FFF;
				arg4 = -var14 & 0x3FFF;
			}
		}
		if (arg7 == 65535) {
			this.method1717(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		} else {
			this.method1719(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg8);
		}
	}

	@ObfuscatedName("do.aw(ILcs;I[IFFFIZI[I)V")
	public void method1756(int arg0, class105 arg1, int arg2, int[] arg3, float arg4, float arg5, float arg6, int arg7, boolean arg8, int arg9, int[] arg10) {
		int var12 = (int) arg4;
		int var13 = (int) arg5;
		int var14 = (int) arg6;
		if (arg0 == 0) {
			if (arg1 == null) {
				return;
			}
			var12 = (int) arg1.method1565(arg2).field4315[12];
			var13 = (int) -arg1.method1565(arg2).field4315[13];
			var14 = (int) -arg1.method1565(arg2).field4315[14];
		} else if (arg0 == 1) {
			if (arg1 == null) {
				return;
			}
			float[] var15 = new float[3];
			arg1.method1564(arg2).method6614(arg4, arg5, arg6, var15);
			float[] var16 = new float[3];
			arg1.method1565(arg2).method6616(var15[0], var15[1], var15[2], var16);
			var12 = (int) var16[0];
			int var17 = (int) var16[1];
			int var18 = (int) var16[2];
			var13 = -var17;
			var14 = -var18;
		} else if (arg0 == 2) {
			if (arg1 == null) {
				return;
			}
			class426 var19 = class426.method6641();
			var19.method6608(arg5, arg4, arg6);
			if (arg1.field1239 != null) {
				var19.method6720(arg1.field1239.method1565(arg2));
			}
			var19.method6611();
			var19.method6720(arg1.method1565(arg2));
			float[] var20 = var19.method6602();
			var12 = (int) (var20[0] * 2607.5945F) & 0x3FFF;
			var13 = (int) (-var20[1] * 2607.5945F) & 0x3FFF;
			var14 = (int) (var20[2] * 2607.5945F) & 0x3FFF;
			var19.method6605();
		} else if (arg0 == 3 || arg0 == 10) {
			var12 = (int) (arg4 * 128.0F);
			var13 = (int) (arg5 * 128.0F);
			var14 = (int) (arg6 * 128.0F);
		} else if (arg0 == 9) {
			var12 = (int) (arg4 * 2607.5945F) & 0x3FFF;
		} else if (arg0 == 5) {
			var12 = (int) (32.0F - arg4 * 32.0F);
		}
		if (arg7 == 1) {
			if (arg0 == 0 || arg0 == 1) {
				int var23 = -var12;
				var12 = var14;
				var14 = var23;
			} else if (arg0 == 3) {
				int var21 = var12;
				var12 = var14;
				var14 = var21;
			} else if (arg0 == 2) {
				int var22 = var12;
				var12 = -var14 & 0x3FFF;
				var14 = var22 & 0x3FFF;
			}
		} else if (arg7 == 2) {
			if (arg0 == 0 || arg0 == 1) {
				var12 = -var12;
				var14 = -var14;
			} else if (arg0 == 2) {
				var12 = -var12 & 0x3FFF;
				var14 = -var14 & 0x3FFF;
			}
		} else if (arg7 == 3) {
			if (arg0 == 0 || arg0 == 1) {
				int var26 = var12;
				var12 = -var14;
				var14 = var26;
			} else if (arg0 == 3) {
				int var24 = var12;
				var12 = var14;
				var14 = var24;
			} else if (arg0 == 2) {
				int var25 = var12;
				var12 = var14 & 0x3FFF;
				var14 = -var25 & 0x3FFF;
			}
		}
		if (arg9 == 65535) {
			this.method1711(arg0, arg3, var12, var13, var14, arg7, arg8);
		} else {
			this.method1720(arg0, arg3, var12, var13, var14, arg8, arg9, arg10);
		}
	}

	@ObfuscatedName("do.bo(Ldo;IIIZ)V")
	public abstract void method1686(class116 arg0, int arg1, int arg2, int arg3, boolean arg4);

	@ObfuscatedName("do.by(Lou;)V")
	public abstract void method1689(class419 arg0);

	@ObfuscatedName("do.u(I)V")
	public abstract void method1690(int arg0);

	@ObfuscatedName("do.z()I")
	public abstract int method1691();

	@ObfuscatedName("do.d(I)V")
	public abstract void method1693(int arg0);

	@ObfuscatedName("do.c(I)V")
	public abstract void method1694(int arg0);

	@ObfuscatedName("do.af()I")
	public abstract int method1695();

	@ObfuscatedName("do.v(I)V")
	public abstract void method1696(int arg0);

	@ObfuscatedName("do.s()V")
	public abstract void method1698();

	@ObfuscatedName("do.y(III)V")
	public abstract void method1699(int arg0, int arg1, int arg2);

	@ObfuscatedName("do.q(IILcb;Lcb;III)V")
	public abstract void method1700(int arg0, int arg1, class104 arg2, class104 arg3, int arg4, int arg5, int arg6);

	@ObfuscatedName("do.b()V")
	public abstract void method1702();

	@ObfuscatedName("do.h()V")
	public abstract void method1703();

	@ObfuscatedName("do.bf()I")
	public abstract int method1707();

	@ObfuscatedName("do.ad(I[IIIIIZ)V")
	public abstract void method1711(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

	@ObfuscatedName("do.as()Z")
	public abstract boolean method1716();

	@ObfuscatedName("do.at(I[IIIIIZ)V")
	public abstract void method1717(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

	@ObfuscatedName("do.am(I[IIIIZI[I)V")
	public abstract void method1719(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

	@ObfuscatedName("do.au(I[IIIIZI[I)V")
	public abstract void method1720(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

	@ObfuscatedName("do.ar(IIII)V")
	public abstract void method1721(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("do.av(IILou;ZI)Z")
	public abstract boolean method1725(int arg0, int arg1, class419 arg2, boolean arg3, int arg4);

	@ObfuscatedName("do.ao(Lara;)Lara;")
	public abstract class1175 method1726(class1175 arg0);

	@ObfuscatedName("do.aj()I")
	public abstract int method1727();

	@ObfuscatedName("do.ay()I")
	public abstract int method1728();

	@ObfuscatedName("do.ab()I")
	public abstract int method1729();

	@ObfuscatedName("do.az()I")
	public abstract int method1730();

	@ObfuscatedName("do.bb()Z")
	public abstract boolean method1731();

	@ObfuscatedName("do.ak()I")
	public abstract int method1733();

	@ObfuscatedName("do.bl()V")
	public abstract void method1736();

	@ObfuscatedName("do.bh(I)V")
	public abstract void method1738(int arg0);

	@ObfuscatedName("do.bd()I")
	public abstract int method1740();

	@ObfuscatedName("do.bc()[B")
	public abstract byte[] method1741();

	@ObfuscatedName("do.bt(SS)V")
	public abstract void method1744(short arg0, short arg1);

	@ObfuscatedName("do.bq(IIII)V")
	public abstract void method1745(int arg0, int arg1, int arg2, int arg3);

	@ObfuscatedName("do.bm()Z")
	public abstract boolean method1746();

	@ObfuscatedName("do.bn(B[B)V")
	public abstract void method1747(byte arg0, byte[] arg1);

	@ObfuscatedName("do.aa()I")
	public abstract int method1748();

	@ObfuscatedName("do.bu()[Ldu;")
	public abstract class128[] method1750();

	@ObfuscatedName("do.bw()[Lcq;")
	public abstract class102[] method1765();

	@ObfuscatedName("do.aq(Lou;IZ)V")
	public abstract void method1771(class419 arg0, int arg1, boolean arg2);

	@ObfuscatedName("do.l(BIZ)Ldo;")
	public abstract class116 method1773(byte arg0, int arg1, boolean arg2);

	@ObfuscatedName("do.ap()V")
	public abstract void method1776();

	@ObfuscatedName("do.an()I")
	public abstract int method1794();

	@ObfuscatedName("do.o(III)V")
	public abstract void method1805(int arg0, int arg1, int arg2);

	@ObfuscatedName("do.be()Z")
	public abstract boolean method1812();

	@ObfuscatedName("do.ax(Lou;Led;I)V")
	public abstract void method1813(class419 arg0, class141 arg1, int arg2);

	@ObfuscatedName("do.p()V")
	public abstract void method1816();

	@ObfuscatedName("do.r(I)V")
	public abstract void method1852(int arg0);

	@ObfuscatedName("do.bi(SS)V")
	public abstract void method1859(short arg0, short arg1);

	@ObfuscatedName("do.bx()I")
	public abstract int method1862();

	@ObfuscatedName("do.bk(I)V")
	public abstract void method1893(int arg0);
}
