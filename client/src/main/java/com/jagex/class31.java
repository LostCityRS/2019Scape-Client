package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("i")
public class class31 {

	@ObfuscatedName("i.e")
	public static class162 field617 = new class162(32);

	public class31() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("jp.e(Ldh;IIIIILdo;IIIILaaq;B)Ldo;")
	public static class116 method5102(class133 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class116 arg6, int arg7, int arg8, int arg9, int arg10, class721 arg11) {
		if (arg6 == null) {
			return null;
		}
		int var12 = 2055;
		if (arg11 != null) {
			int var13 = var12 | arg11.method14358();
			var12 = var13 & 0xFFFFFDFF;
		}
		long var14 = ((long) arg8 << 48) + ((long) arg7 << 32) + (long) ((arg10 << 24) + (arg9 << 16) + arg5);
		class162 var16 = field617;
		class116 var17;
		synchronized (field617) {
			var17 = (class116) field617.method2930(var14);
		}
		if (var17 == null || arg0.method2394(var17.method1691(), var12) != 0) {
			if (var17 != null) {
				var12 = arg0.method2213(var12, var17.method1691());
			}
			int var19 = arg5 * 3 + 6;
			byte var20 = 3;
			int[] var21 = new int[] { 64, 96, 128 };
			class120 var22 = new class120(var19 * var20 + 1, var19 * var20 * 2 - var19, 0);
			int var23 = var22.method1936(0, 0, 0);
			int[][] var24 = new int[var20][var19];
			for (int var25 = 0; var25 < var20; var25++) {
				int var26 = var21[var25];
				int var27 = var21[var25];
				for (int var28 = 0; var28 < var19; var28++) {
					int var29 = (var28 << 14) / var19;
					int var30 = class417.field4270[var29] * var26 >> 14;
					int var31 = class417.field4272[var29] * var27 >> 14;
					var24[var25][var28] = var22.method1936(var30, 0, var31);
				}
			}
			for (int var32 = 0; var32 < var20; var32++) {
				int var33 = (var32 * 256 + 128) / var20;
				int var34 = 256 - var33;
				byte var35 = (byte) (arg9 * var34 + arg10 * var33 >> 8);
				short var36 = (short) (((arg7 & 0x7F) * var34 + (arg8 & 0x7F) * var33 & 0x7F00) + ((arg7 & 0x380) * var34 + (arg8 & 0x380) * var33 & 0x38000) + ((arg7 & 0xFC00) * var34 + (arg8 & 0xFC00) * var33 & 0xFC0000) >> 8);
				for (int var37 = 0; var37 < var19; var37++) {
					if (var32 == 0) {
						var22.method1966(var23, var24[0][(var37 + 1) % var19], var24[0][var37], (byte) 1, (byte) -1, var36, var35, (short) -1);
					} else {
						var22.method1966(var24[var32 - 1][var37], var24[var32 - 1][(var37 + 1) % var19], var24[var32][(var37 + 1) % var19], (byte) 1, (byte) -1, var36, var35, (short) -1);
						var22.method1966(var24[var32 - 1][var37], var24[var32][(var37 + 1) % var19], var24[var32][var37], (byte) 1, (byte) -1, var36, var35, (short) -1);
					}
				}
			}
			var17 = arg0.method2211(var22, var12, Statics.field616, 64, 768);
			class162 var38 = field617;
			synchronized (field617) {
				field617.method2921(var17, var14);
			}
		}
		int var40 = arg6.method1729();
		int var41 = arg6.method1730();
		int var42 = arg6.method1733();
		int var43 = arg6.method1794();
		class116 var44;
		if (arg11 == null) {
			var44 = var17.method1773((byte) 3, var12, true);
			var44.method1699(var41 - var40 >> 1, 128, var43 - var42 >> 1);
			var44.method1805(var40 + var41 >> 1, 0, var42 + var43 >> 1);
		} else {
			var44 = var17.method1773((byte) 3, var12, true);
			var44.method1699(var41 - var40 >> 1, 128, var43 - var42 >> 1);
			var44.method1805(var40 + var41 >> 1, 0, var42 + var43 >> 1);
			arg11.method14361(var44);
		}
		if (arg2 != 0) {
			var44.method1852(arg2);
		}
		if (arg3 != 0) {
			var44.method1696(arg3);
		}
		if (arg4 != 0) {
			var44.method1805(0, arg4, 0);
		}
		return var44;
	}

	@ObfuscatedName("fo.n(Ldh;IIIILdo;SBLaaq;I)Ldo;")
	public static class116 method3283(class133 arg0, int arg1, int arg2, int arg3, int arg4, class116 arg5, short arg6, byte arg7, class721 arg8) {
		if (arg5 == null) {
			return null;
		}
		int var9 = 2055;
		if (arg8 != null) {
			int var10 = var9 | arg8.method14358();
			var9 = var10 & 0xFFFFFDFF;
		}
		long var11 = (long) ((arg6 & 0xFFFF) << 8 | arg7);
		class162 var13 = field617;
		class116 var14;
		synchronized (field617) {
			var14 = (class116) field617.method2930(var11);
		}
		if (var14 == null || arg0.method2394(var14.method1691(), var9) != 0) {
			if (var14 != null) {
				var9 = arg0.method2213(var9, var14.method1691());
			}
			class120 var16 = new class120(4, 2, 2);
			short var17 = 128;
			int[] var18 = new int[] { var16.method1936(-var17, 0, -var17), var16.method1936(var17, 0, -var17), var16.method1936(var17, 0, var17), var16.method1936(-var17, 0, var17) };
			var16.method1966(0, 1, 2, (byte) 1, (byte) 0, (short) 0, arg7, arg6);
			var16.method1966(0, 2, 3, (byte) 1, (byte) 0, (short) 0, arg7, arg6);
			var16.method1938((short) 1, (short) 2, (short) 0);
			var16.method1938((short) 2, (short) 3, (short) 0);
			var14 = arg0.method2211(var16, var9, Statics.field616, 64, 768);
			class162 var19 = field617;
			synchronized (field617) {
				field617.method2921(var14, var11);
			}
		}
		int var21 = arg5.method1729();
		int var22 = arg5.method1730();
		int var23 = arg5.method1733();
		int var24 = arg5.method1794();
		class116 var25;
		if (arg8 == null) {
			var25 = var14.method1773((byte) 3, var9, true);
			var25.method1699(var22 - var21 >> 1, 128, var24 - var23 >> 1);
			var25.method1805(var21 + var22 >> 1, 0, var23 + var24 >> 1);
		} else {
			var25 = var14.method1773((byte) 3, var9, true);
			var25.method1699(var22 - var21 >> 1, 128, var24 - var23 >> 1);
			var25.method1805(var21 + var22 >> 1, 0, var23 + var24 >> 1);
			arg8.method14361(var25);
		}
		if (arg2 != 0) {
			var25.method1852(arg2);
		}
		if (arg3 != 0) {
			var25.method1696(arg3);
		}
		if (arg4 != 0) {
			var25.method1805(0, arg4, 0);
		}
		return var25;
	}

	@ObfuscatedName("ajb.m(II)V")
	public static void method17441(int arg0) {
		Statics.field616 = arg0;
		class162 var1 = field617;
		synchronized (field617) {
			field617.method2924();
		}
	}

	@ObfuscatedName("ft.k(I)V")
	public static void method3076() {
		class162 var0 = field617;
		synchronized (field617) {
			field617.method2924();
		}
	}

	@ObfuscatedName("vg.f(IB)V")
	public static void method9467(int arg0) {
		class162 var1 = field617;
		synchronized (field617) {
			field617.method2923(arg0);
		}
	}

	@ObfuscatedName("kh.w(B)V")
	public static void method5201() {
		class162 var0 = field617;
		synchronized (field617) {
			field617.method2928();
		}
	}
}
