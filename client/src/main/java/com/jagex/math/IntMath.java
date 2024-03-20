package com.jagex.math;

import deob.ObfuscatedName;

import java.util.Random;

@ObfuscatedName("acl")
public class IntMath {

	@ObfuscatedName("acl.e")
	public static Random field9158;

	@ObfuscatedName("acl.n")
	public static final Object field9159 = new Object();

	@ObfuscatedName("acl.m")
	public static int[] field9160 = new int[33];

	static {
		field9160[0] = 0;
		int var0 = 2;
		for (int var1 = 1; var1 < 33; var1++) {
			field9160[var1] = var0 - 1;
			var0 += var0;
		}
	}

	public IntMath() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("aaf.e(II)I")
	public static int method14281(int arg0) {
		return field9160[arg0];
	}

	@ObfuscatedName("aac.n(II)I")
	public static int method14573(int arg0) {
		int var1 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		int var2 = (var1 >>> 2 & 0x33333333) + (var1 & 0x33333333);
		int var3 = (var2 >>> 4) + var2 & 0xF0F0F0F;
		int var4 = (var3 >>> 8) + var3;
		int var5 = (var4 >>> 16) + var4;
		return var5 & 0xFF;
	}

	@ObfuscatedName("gt.m(IIIB)I")
	public static int method3588(int arg0, int arg1, int arg2) {
		int var3 = method14281(arg2 - arg1 + 1);
		int var4 = var3 << arg1;
		return arg0 & ~var4;
	}

	@ObfuscatedName("fb.k(IIII)I")
	public static int method3256(int arg0, int arg1, int arg2) {
		int var3 = method14281(arg2 - arg1 + 1);
		int var4 = var3 << arg1;
		return arg0 | var4;
	}

	@ObfuscatedName("ahz.f(IB)I")
	public static int bitceil(int arg0) {
		int var6 = arg0 - 1;
		int var1 = var6 | var6 >>> 1;
		int var2 = var1 | var1 >>> 2;
		int var3 = var2 | var2 >>> 4;
		int var4 = var3 | var3 >>> 8;
		int var5 = var4 | var4 >>> 16;
		return var5 + 1;
	}

	@ObfuscatedName("fx.w(II)I")
	public static int method3082(int arg0) {
		int var1 = arg0 >>> 1;
		int var2 = var1 | var1 >>> 1;
		int var3 = var2 | var2 >>> 2;
		int var4 = var3 | var3 >>> 4;
		int var5 = var4 | var4 >>> 8;
		int var6 = var5 | var5 >>> 16;
		return arg0 & ~var6;
	}

	@ObfuscatedName("jm.l(II)Z")
	public static boolean method4918(int arg0) {
		return (arg0 & -arg0) == arg0;
	}

	@ObfuscatedName("sf.u(II)I")
	public static int ilog(int v) {
		int var1 = 0;
		if (v < 0 || v >= 65536) {
			v >>>= 0x10;
			var1 += 16;
		}
		if (v >= 256) {
			v >>>= 0x8;
			var1 += 8;
		}
		if (v >= 16) {
			v >>>= 0x4;
			var1 += 4;
		}
		if (v >= 4) {
			v >>>= 0x2;
			var1 += 2;
		}
		if (v >= 1) {
			v >>>= 0x1;
			var1++;
		}
		return v + var1;
	}

	@ObfuscatedName("ni.z(III)I")
	public static int bitReverse(int arg0, int arg1) {
		int var2 = 0;
		while (arg1 > 0) {
			var2 = var2 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return var2;
	}

	@ObfuscatedName("ts.p(IIB)I")
	public static int method8658(int arg0, int arg1) {
		int var2 = arg0 >> 31 & arg1 - 1;
		return ((arg0 >>> 31) + arg0) % arg1 + var2;
	}

	@ObfuscatedName("ach.d(Ljava/util/Random;II)I")
	public static int method14985(Random arg0, int arg1) {
		if (arg0 == null) {
			arg0 = field9158;
			if (arg0 == null) {
				Object var2 = field9159;
				synchronized (field9159) {
					if (field9158 == null) {
						field9158 = new Random();
					}
					arg0 = field9158;
				}
			}
		}
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (method4918(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			int var4 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			int var5;
			do {
				var5 = arg0.nextInt();
			} while (var5 >= var4);
			return method8658(var5, arg1);
		}
	}
}
