package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ti")
public class class534 {

	public class534() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ti.e(IIIIILte;FFFFF[BI)V")
	public static void method8459(int arg0, int arg1, int arg2, int arg3, int arg4, class533 arg5, float arg6, float arg7, float arg8, float arg9, float arg10, byte[] arg11, int arg12) {
		int var13 = arg1 * arg2;
		float[] var14 = new float[var13];
		for (int var15 = 0; var15 < arg4; var15++) {
			int var16 = arg12;
			arg5.method8447(arg0, arg1, arg2, arg3, arg6 / (float) arg1, arg7 / (float) arg2, arg8 / (float) arg3, arg9 * 127.0F, var14, 0);
			for (int var17 = 0; var17 < var13; var17++) {
				arg11[var16] = (byte) ((float) arg11[var16] + var14[var17]);
				var16++;
			}
			arg6 *= 2.0F;
			arg7 *= 2.0F;
			arg8 *= 2.0F;
			arg9 *= arg10;
		}
		int var18 = arg12;
		for (int var19 = 0; var19 < var13; var19++) {
			arg11[var18] = (byte) (arg11[var18] + 127);
			var18++;
		}
	}

	@ObfuscatedName("ti.n(IIIILte;FFFFF)[B")
	public static byte[] method8451(int arg0, int arg1, int arg2, int arg3, class533 arg4, float arg5, float arg6, float arg7, float arg8, float arg9) {
		byte[] var10 = new byte[arg0 * arg1 * arg2];
		method8450(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, var10, 0);
		return var10;
	}

	@ObfuscatedName("ti.m(IIIILte;FFFFF[BI)V")
	public static void method8450(int arg0, int arg1, int arg2, int arg3, class533 arg4, float arg5, float arg6, float arg7, float arg8, float arg9, byte[] arg10, int arg11) {
		for (int var12 = 0; var12 < arg2; var12++) {
			method8459(var12, arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11);
			arg11 += arg0 * arg1;
		}
	}
}
