package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("qt")
public class class452 {

	public class452() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("abx.e(IIII)I")
	public static int method14888(int arg0, int arg1, int arg2) {
		int var3 = arg2 & 0x3;
		if (var3 == 0) {
			return arg0;
		} else if (var3 == 1) {
			return arg1;
		} else if (var3 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}

	@ObfuscatedName("pc.m(IIIB)I")
	public static int method7092(int arg0, int arg1, int arg2) {
		int var3 = arg2 & 0x3;
		if (var3 == 0) {
			return arg0;
		} else if (var3 == 1) {
			return arg1;
		} else if (var3 == 2) {
			return 4095 - arg0;
		} else {
			return 4095 - arg1;
		}
	}

	@ObfuscatedName("uc.k(IIII)I")
	public static int method8977(int arg0, int arg1, int arg2) {
		int var3 = arg2 & 0x3;
		if (var3 == 0) {
			return arg1;
		} else if (var3 == 1) {
			return 4095 - arg0;
		} else if (var3 == 2) {
			return 4095 - arg1;
		} else {
			return arg0;
		}
	}

	@ObfuscatedName("eu.w(IIIIIII)I")
	public static int method2733(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if ((arg5 & 0x1) == 1) {
			int var6 = arg3;
			arg3 = arg4;
			arg4 = var6;
		}
		int var7 = arg2 & 0x3;
		if (var7 == 0) {
			return arg1;
		} else if (var7 == 1) {
			return 7 - arg0 - (arg3 - 1);
		} else if (var7 == 2) {
			return 7 - arg1 - (arg4 - 1);
		} else {
			return arg0;
		}
	}
}
