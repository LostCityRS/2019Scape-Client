package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ds")
public class class127 {

	public class127() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("ds.e(Ldh;[II)V")
	public static void method2053(class133 arg0, int[] arg1, int arg2) {
		method2055(arg0, arg1, 0, arg1.length, arg2, null, null);
	}

	@ObfuscatedName("ds.n(Ldh;[II[I[I)V")
	public static void method2054(class133 arg0, int[] arg1, int arg2, int[] arg3, int[] arg4) {
		method2055(arg0, arg1, 0, arg1.length, arg2, arg3, arg4);
	}

	@ObfuscatedName("ds.m(Ldh;[IIII[I[I)V")
	public static void method2055(class133 arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6) {
		int[] var7 = new int[4];
		arg0.method2171(var7);
		if (arg5 != null && var7[3] - var7[1] != arg5.length) {
			throw new IllegalStateException();
		}
		method2056();
		method2057(arg1, arg2, arg3);
		method2074(var7[1]);
		while (true) {
			int var8;
			int var9;
			int var10;
			do {
				if (!method2059(var7[3])) {
					return;
				}
				var8 = Statics.field1459;
				var9 = Statics.field1456;
				var10 = Statics.field1457;
				if (arg5 == null) {
					break;
				}
				int var11 = var10 - var7[1];
				if (var8 < arg5[var11] + var7[0]) {
					var8 = arg5[var11] + var7[0];
				}
				if (var9 > arg5[var11] + arg6[var11] + var7[0]) {
					var9 = arg5[var11] + arg6[var11] + var7[0];
				}
			} while (var9 - var8 <= 0);
			arg0.method2433(var8, var10, var9 - var8, arg4, 1);
		}
	}

	@ObfuscatedName("ds.k()V")
	public static void method2056() {
		Statics.field1458 = 0;
	}

	@ObfuscatedName("ds.f([III)V")
	public static void method2057(int[] arg0, int arg1, int arg2) {
		int var3 = (arg2 << 1) + Statics.field1458;
		if (Statics.field1460 == null || Statics.field1460.length < var3) {
			int[] var4 = new int[var3];
			for (int var5 = 0; var5 < Statics.field1458; var5++) {
				var4[var5] = Statics.field1460[var5];
			}
			Statics.field1460 = var4;
		}
		int var6 = arg1 + arg2;
		int var7 = var6 - 2;
		for (int var8 = arg1; var8 < var6; var8 += 2) {
			int var9 = arg0[var7 + 1];
			int var10 = arg0[var8 + 1];
			if (var9 < var10) {
				Statics.field1460[Statics.field1458++] = arg0[var7];
				Statics.field1460[Statics.field1458++] = var9;
				Statics.field1460[Statics.field1458++] = arg0[var8];
				Statics.field1460[Statics.field1458++] = var10;
			} else if (var10 < var9) {
				Statics.field1460[Statics.field1458++] = arg0[var8];
				Statics.field1460[Statics.field1458++] = var10;
				Statics.field1460[Statics.field1458++] = arg0[var7];
				Statics.field1460[Statics.field1458++] = var9;
			}
			var7 = var8;
		}
	}

	@ObfuscatedName("ds.w(I)V")
	public static void method2074(int arg0) {
		if (Statics.field1458 < 0) {
			Statics.field1462 = 0;
			Statics.field1461 = 0;
			Statics.field1455 = 0;
			Statics.field1457 = 2147483646;
			return;
		}
		method2060(0, Statics.field1458);
		int var1 = Statics.field1460[1];
		if (var1 < arg0) {
			var1 = arg0;
		}
		byte var2 = 0;
		int var3;
		for (var3 = 0; var3 < Statics.field1458; var3 += 4) {
			int var4 = Statics.field1460[var3 + 1];
			if (var1 < var4) {
				break;
			}
			int var5 = Statics.field1460[var3];
			int var6 = Statics.field1460[var3 + 2];
			int var7 = Statics.field1460[var3 + 3];
			int var8 = (var6 - var5 << 16) / (var7 - var4);
			int var9 = (var5 << 16) + 32768;
			Statics.field1460[var3] = (var1 - var4) * var8 + var9;
			Statics.field1460[var3 + 2] = var8;
		}
		Statics.field1455 = var2;
		Statics.field1461 = var3;
		Statics.field1462 = var3;
		Statics.field1457 = var1 - 1;
	}

	@ObfuscatedName("ds.l(I)Z")
	public static boolean method2059(int arg0) {
		int var1 = Statics.field1461;
		int var2 = Statics.field1462;
		int var3 = Statics.field1457;
		while (var2 >= var1) {
			var3++;
			Statics.field1457 = var3;
			if (var3 >= arg0) {
				return false;
			}
			int var4 = Statics.field1455;
			while (var1 < Statics.field1458) {
				int var5 = Statics.field1460[var1 + 1];
				if (var3 < var5) {
					break;
				}
				int var6 = Statics.field1460[var1];
				int var7 = Statics.field1460[var1 + 2];
				int var8 = Statics.field1460[var1 + 3];
				int var9 = (var7 - var6 << 16) / (var8 - var5);
				int var10 = (var6 << 16) + 32768;
				Statics.field1460[var1] = var10;
				Statics.field1460[var1 + 2] = var9;
				var1 += 4;
			}
			for (int var11 = var4; var11 < var1; var11 += 4) {
				int var12 = Statics.field1460[var11 + 3];
				if (var3 >= var12) {
					Statics.field1460[var11] = Statics.field1460[var4];
					Statics.field1460[var11 + 1] = Statics.field1460[var4 + 1];
					Statics.field1460[var11 + 2] = Statics.field1460[var4 + 2];
					Statics.field1460[var11 + 3] = Statics.field1460[var4 + 3];
					var4 += 4;
				}
			}
			if (Statics.field1458 == var4) {
				Statics.field1458 = 0;
				return false;
			}
			method2068(var4, var1);
			Statics.field1455 = var4;
			Statics.field1461 = var1;
			var2 = var4;
		}
		Statics.field1459 = Statics.field1460[var2] >> 16;
		Statics.field1456 = Statics.field1460[var2 + 4] >> 16;
		Statics.field1460[var2] += Statics.field1460[var2 + 2];
		Statics.field1460[var2 + 4] += Statics.field1460[var2 + 6];
		var2 += 8;
		Statics.field1462 = var2;
		return true;
	}

	@ObfuscatedName("ds.u(II)V")
	public static void method2060(int arg0, int arg1) {
		if (arg1 <= arg0 + 4) {
			return;
		}
		int var2 = arg0;
		int var3 = Statics.field1460[arg0];
		int var4 = Statics.field1460[arg0 + 1];
		int var5 = Statics.field1460[arg0 + 2];
		int var6 = Statics.field1460[arg0 + 3];
		for (int var7 = arg0 + 4; var7 < arg1; var7 += 4) {
			int var8 = Statics.field1460[var7 + 1];
			if (var8 < var4) {
				Statics.field1460[var2] = Statics.field1460[var7];
				Statics.field1460[var2 + 1] = var8;
				Statics.field1460[var2 + 2] = Statics.field1460[var7 + 2];
				Statics.field1460[var2 + 3] = Statics.field1460[var7 + 3];
				var2 += 4;
				Statics.field1460[var7] = Statics.field1460[var2];
				Statics.field1460[var7 + 1] = Statics.field1460[var2 + 1];
				Statics.field1460[var7 + 2] = Statics.field1460[var2 + 2];
				Statics.field1460[var7 + 3] = Statics.field1460[var2 + 3];
			}
		}
		Statics.field1460[var2] = var3;
		Statics.field1460[var2 + 1] = var4;
		Statics.field1460[var2 + 2] = var5;
		Statics.field1460[var2 + 3] = var6;
		method2060(arg0, var2);
		method2060(var2 + 4, arg1);
	}

	@ObfuscatedName("ds.z(II)V")
	public static void method2068(int arg0, int arg1) {
		while (true) {
			if (arg1 >= arg0 + 8) {
				boolean var2 = true;
				for (int var3 = arg0 + 4; var3 < arg1; var3 += 4) {
					int var4 = Statics.field1460[var3 - 4];
					int var5 = Statics.field1460[var3];
					if (var4 > var5) {
						var2 = false;
						Statics.field1460[var3 - 4] = var5;
						Statics.field1460[var3] = var4;
						int var6 = Statics.field1460[var3 - 2];
						Statics.field1460[var3 - 2] = Statics.field1460[var3 + 2];
						Statics.field1460[var3 + 2] = var6;
						int var7 = Statics.field1460[var3 - 1];
						Statics.field1460[var3 - 1] = Statics.field1460[var3 + 3];
						Statics.field1460[var3 + 3] = var7;
					}
				}
				if (!var2) {
					arg1 -= 4;
					continue;
				}
			}
			return;
		}
	}
}
