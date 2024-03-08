package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("zp")
public class class701 {

	public class701() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("zp.w([FI[FII)V")
	public static void method14023(float[] arg0, int arg1, float[] arg2, int arg3, int arg4) {
		if (arg0 == arg2) {
			if (arg1 == arg3) {
				return;
			}
			if (arg3 > arg1 && arg3 < arg1 + arg4) {
				int var9 = arg4 - 1;
				int var5 = arg1 + var9;
				int var6 = arg3 + var9;
				int var7 = var5 - var9;
				int var10 = var7 + 7;
				while (var5 >= var10) {
					arg2[var6--] = arg0[var5--];
					arg2[var6--] = arg0[var5--];
					arg2[var6--] = arg0[var5--];
					arg2[var6--] = arg0[var5--];
					arg2[var6--] = arg0[var5--];
					arg2[var6--] = arg0[var5--];
					arg2[var6--] = arg0[var5--];
					arg2[var6--] = arg0[var5--];
				}
				var7 = var10 - 7;
				while (var5 >= var7) {
					arg2[var6--] = arg0[var5--];
				}
				return;
			}
		}
		int var8 = arg1 + arg4;
		int var11 = var8 - 7;
		while (arg1 < var11) {
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
		}
		var8 = var11 + 7;
		while (arg1 < var8) {
			arg2[arg3++] = arg0[arg1++];
		}
	}

	@ObfuscatedName("zp.z([Ljava/lang/Object;I[Ljava/lang/Object;II)V")
	public static void method14008(Object[] arg0, int arg1, Object[] arg2, int arg3, int arg4) {
		if (arg0 == arg2) {
			if (arg1 == arg3) {
				return;
			}
			if (arg3 > arg1 && arg3 < arg1 + arg4) {
				int var9 = arg4 - 1;
				int var5 = arg1 + var9;
				int var6 = arg3 + var9;
				int var7 = var5 - var9;
				int var10 = var7 + 7;
				while (var5 >= var10) {
					arg2[var6--] = arg0[var5--];
					arg2[var6--] = arg0[var5--];
					arg2[var6--] = arg0[var5--];
					arg2[var6--] = arg0[var5--];
					arg2[var6--] = arg0[var5--];
					arg2[var6--] = arg0[var5--];
					arg2[var6--] = arg0[var5--];
					arg2[var6--] = arg0[var5--];
				}
				var7 = var10 - 7;
				while (var5 >= var7) {
					arg2[var6--] = arg0[var5--];
				}
				return;
			}
		}
		int var8 = arg1 + arg4;
		int var11 = var8 - 7;
		while (arg1 < var11) {
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
			arg2[arg3++] = arg0[arg1++];
		}
		var8 = var11 + 7;
		while (arg1 < var8) {
			arg2[arg3++] = arg0[arg1++];
		}
	}

	@ObfuscatedName("zp.p([IIII)V")
	public static void method14009(int[] arg0, int arg1, int arg2, int arg3) {
		int var4 = arg1 + arg2 - 7;
		while (arg1 < var4) {
			arg0[arg1++] = arg3;
			arg0[arg1++] = arg3;
			arg0[arg1++] = arg3;
			arg0[arg1++] = arg3;
			arg0[arg1++] = arg3;
			arg0[arg1++] = arg3;
			arg0[arg1++] = arg3;
			arg0[arg1++] = arg3;
		}
		var4 += 7;
		while (arg1 < var4) {
			arg0[arg1++] = arg3;
		}
	}
}
