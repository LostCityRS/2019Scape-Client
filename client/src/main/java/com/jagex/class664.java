package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("yg")
public class class664 {

	public class664() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("hh.e([Ljava/lang/String;[II)V")
	public static void method4054(String[] arg0, int[] arg1) {
		method4923(arg0, arg1, 0, arg0.length - 1);
	}

	@ObfuscatedName("jw.n([Ljava/lang/String;[IIII)V")
	public static void method4923(String[] arg0, int[] arg1, int arg2, int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		int var4 = (arg2 + arg3) / 2;
		int var5 = arg2;
		String var6 = arg0[var4];
		arg0[var4] = arg0[arg3];
		arg0[arg3] = var6;
		int var7 = arg1[var4];
		arg1[var4] = arg1[arg3];
		arg1[arg3] = var7;
		for (int var8 = arg2; var8 < arg3; var8++) {
			if (var6 == null || arg0[var8] != null && arg0[var8].compareTo(var6) < (var8 & 0x1)) {
				String var9 = arg0[var8];
				arg0[var8] = arg0[var5];
				arg0[var5] = var9;
				int var10 = arg1[var8];
				arg1[var8] = arg1[var5];
				arg1[var5++] = var10;
			}
		}
		arg0[arg3] = arg0[var5];
		arg0[var5] = var6;
		arg1[arg3] = arg1[var5];
		arg1[var5] = var7;
		method4923(arg0, arg1, arg2, var5 - 1);
		method4923(arg0, arg1, var5 + 1, arg3);
	}

	@ObfuscatedName("adn.m([I[IIII)V")
	public static void method15233(int[] arg0, int[] arg1, int arg2, int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		int var4 = (arg2 + arg3) / 2;
		int var5 = arg2;
		int var6 = arg0[var4];
		arg0[var4] = arg0[arg3];
		arg0[arg3] = var6;
		int var7 = arg1[var4];
		arg1[var4] = arg1[arg3];
		arg1[arg3] = var7;
		int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;
		for (int var9 = arg2; var9 < arg3; var9++) {
			if (arg0[var9] < (var9 & var8) + var6) {
				int var10 = arg0[var9];
				arg0[var9] = arg0[var5];
				arg0[var5] = var10;
				int var11 = arg1[var9];
				arg1[var9] = arg1[var5];
				arg1[var5++] = var11;
			}
		}
		arg0[arg3] = arg0[var5];
		arg0[var5] = var6;
		arg1[arg3] = arg1[var5];
		arg1[var5] = var7;
		method15233(arg0, arg1, arg2, var5 - 1);
		method15233(arg0, arg1, var5 + 1, arg3);
	}

	@ObfuscatedName("jk.k([J[IB)V")
	public static void method5114(long[] arg0, int[] arg1) {
		method8194(arg0, arg1, 0, arg0.length - 1);
	}

	@ObfuscatedName("sh.f([J[IIII)V")
	public static void method8194(long[] arg0, int[] arg1, int arg2, int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		int var4 = (arg2 + arg3) / 2;
		int var5 = arg2;
		long var6 = arg0[var4];
		arg0[var4] = arg0[arg3];
		arg0[arg3] = var6;
		int var8 = arg1[var4];
		arg1[var4] = arg1[arg3];
		arg1[arg3] = var8;
		int var9 = var6 == Long.MAX_VALUE ? 0 : 1;
		for (int var10 = arg2; var10 < arg3; var10++) {
			if (arg0[var10] < (long) (var10 & var9) + var6) {
				long var11 = arg0[var10];
				arg0[var10] = arg0[var5];
				arg0[var5] = var11;
				int var13 = arg1[var10];
				arg1[var10] = arg1[var5];
				arg1[var5++] = var13;
			}
		}
		arg0[arg3] = arg0[var5];
		arg0[var5] = var6;
		arg1[arg3] = arg1[var5];
		arg1[var5] = var8;
		method8194(arg0, arg1, arg2, var5 - 1);
		method8194(arg0, arg1, var5 + 1, arg3);
	}

	@ObfuscatedName("w.w([F[IIII)V")
	public static void method228(float[] arg0, int[] arg1, int arg2, int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		int var4 = (arg2 + arg3) / 2;
		int var5 = arg2;
		float var6 = arg0[var4];
		arg0[var4] = arg0[arg3];
		arg0[arg3] = var6;
		int var7 = arg1[var4];
		arg1[var4] = arg1[arg3];
		arg1[arg3] = var7;
		for (int var8 = arg2; var8 < arg3; var8++) {
			if (arg0[var8] > var6) {
				float var9 = arg0[var8];
				arg0[var8] = arg0[var5];
				arg0[var5] = var9;
				int var10 = arg1[var8];
				arg1[var8] = arg1[var5];
				arg1[var5++] = var10;
			}
		}
		arg0[arg3] = arg0[var5];
		arg0[var5] = var6;
		arg1[arg3] = arg1[var5];
		arg1[var5] = var7;
		method228(arg0, arg1, arg2, var5 - 1);
		method228(arg0, arg1, var5 + 1, arg3);
	}

	@ObfuscatedName("aah.l([I[F[FB)V")
	public static void method14525(int[] arg0, float[] arg1, float[] arg2) {
		method10480(arg0, arg1, arg2, 0, arg0.length - 1);
	}

	@ObfuscatedName("yk.u([I[F[FIII)V")
	public static void method10480(int[] arg0, float[] arg1, float[] arg2, int arg3, int arg4) {
		if (arg3 >= arg4) {
			return;
		}
		int var5 = (arg3 + arg4) / 2;
		int var6 = arg3;
		int var7 = arg0[var5];
		arg0[var5] = arg0[arg4];
		arg0[arg4] = var7;
		float var8 = arg1[var5];
		arg1[var5] = arg1[arg4];
		arg1[arg4] = var8;
		float var9 = arg2[var5];
		arg2[var5] = arg2[arg4];
		arg2[arg4] = var9;
		int var10 = (long) var7 == Long.MAX_VALUE ? 0 : 1;
		for (int var11 = arg3; var11 < arg4; var11++) {
			if (arg0[var11] < (var11 & var10) + var7) {
				int var12 = arg0[var11];
				arg0[var11] = arg0[var6];
				arg0[var6] = var12;
				float var13 = arg1[var11];
				arg1[var11] = arg1[var6];
				arg1[var6] = var13;
				float var14 = arg2[var11];
				arg2[var11] = arg2[var6];
				arg2[var6] = var14;
				var6++;
			}
		}
		arg0[arg4] = arg0[var6];
		arg0[var6] = var7;
		arg1[arg4] = arg1[var6];
		arg1[var6] = var8;
		arg2[arg4] = arg2[var6];
		arg2[var6] = var9;
		method10480(arg0, arg1, arg2, arg3, var6 - 1);
		method10480(arg0, arg1, arg2, var6 + 1, arg4);
	}

	@ObfuscatedName("dz.z([I[Ljava/lang/Object;I)V")
	public static void method1901(int[] arg0, Object[] arg1) {
		method4397(arg0, arg1, 0, arg0.length - 1);
	}

	@ObfuscatedName("iv.p([I[Ljava/lang/Object;III)V")
	public static void method4397(int[] arg0, Object[] arg1, int arg2, int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		int var4 = (arg2 + arg3) / 2;
		int var5 = arg2;
		int var6 = arg0[var4];
		arg0[var4] = arg0[arg3];
		arg0[arg3] = var6;
		Object var7 = arg1[var4];
		arg1[var4] = arg1[arg3];
		arg1[arg3] = var7;
		int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;
		for (int var9 = arg2; var9 < arg3; var9++) {
			if (arg0[var9] < (var9 & var8) + var6) {
				int var10 = arg0[var9];
				arg0[var9] = arg0[var5];
				arg0[var5] = var10;
				Object var11 = arg1[var9];
				arg1[var9] = arg1[var5];
				arg1[var5++] = var11;
			}
		}
		arg0[arg3] = arg0[var5];
		arg0[var5] = var6;
		arg1[arg3] = arg1[var5];
		arg1[var5] = var7;
		method4397(arg0, arg1, arg2, var5 - 1);
		method4397(arg0, arg1, var5 + 1, arg3);
	}

	@ObfuscatedName("xh.d([J[Ljava/lang/Object;I)V")
	public static void method10210(long[] arg0, Object[] arg1) {
		method13785(arg0, arg1, 0, arg0.length - 1);
	}

	@ObfuscatedName("yf.c([J[Ljava/lang/Object;III)V")
	public static void method13785(long[] arg0, Object[] arg1, int arg2, int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		int var4 = (arg2 + arg3) / 2;
		int var5 = arg2;
		long var6 = arg0[var4];
		arg0[var4] = arg0[arg3];
		arg0[arg3] = var6;
		Object var8 = arg1[var4];
		arg1[var4] = arg1[arg3];
		arg1[arg3] = var8;
		int var9 = var6 == Long.MAX_VALUE ? 0 : 1;
		for (int var10 = arg2; var10 < arg3; var10++) {
			if (arg0[var10] < (long) (var10 & var9) + var6) {
				long var11 = arg0[var10];
				arg0[var10] = arg0[var5];
				arg0[var5] = var11;
				Object var13 = arg1[var10];
				arg1[var10] = arg1[var5];
				arg1[var5++] = var13;
			}
		}
		arg0[arg3] = arg0[var5];
		arg0[var5] = var6;
		arg1[arg3] = arg1[var5];
		arg1[var5] = var8;
		method13785(arg0, arg1, arg2, var5 - 1);
		method13785(arg0, arg1, var5 + 1, arg3);
	}
}
