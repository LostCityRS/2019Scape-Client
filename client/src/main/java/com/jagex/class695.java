package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("zm")
public final class class695 {

	public class695() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("in.e(Ljava/lang/CharSequence;CI)I")
	public static int method4423(CharSequence arg0, char arg1) {
		int var2 = 0;
		int var3 = arg0.length();
		for (int var4 = 0; var4 < var3; var4++) {
			if (arg0.charAt(var4) == arg1) {
				var2++;
			}
		}
		return var2;
	}

	@ObfuscatedName("ua.n([Ljava/lang/Object;III)Ljava/lang/String;")
	public static String method9007(Object[] arg0, int arg1, int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			CharSequence var3 = (CharSequence) arg0[arg1];
			return var3 == null ? "null" : var3.toString();
		} else {
			int var4 = arg1 + arg2;
			int var5 = 0;
			for (int var6 = arg1; var6 < var4; var6++) {
				CharSequence var7 = (CharSequence) arg0[var6];
				if (var7 == null) {
					var5 += 4;
				} else {
					var5 += var7.length();
				}
			}
			StringBuilder var8 = new StringBuilder(var5);
			for (int var9 = arg1; var9 < var4; var9++) {
				CharSequence var10 = (CharSequence) arg0[var9];
				if (var10 == null) {
					var8.append("null");
				} else {
					var8.append(var10);
				}
			}
			return var8.toString();
		}
	}

	@ObfuscatedName("wc.m(Ljava/lang/CharSequence;I)Z")
	public static boolean method9836(CharSequence arg0) {
		return method17520(arg0, 10, true);
	}

	@ObfuscatedName("ajw.k(Ljava/lang/CharSequence;IZI)Z")
	public static boolean method17520(CharSequence arg0, int arg1, boolean arg2) {
		if (arg1 < 2 || arg1 > 36) {
			throw new IllegalArgumentException("" + arg1);
		}
		boolean var3 = false;
		boolean var4 = false;
		int var5 = 0;
		int var6 = arg0.length();
		for (int var7 = 0; var7 < var6; var7++) {
			char var8 = arg0.charAt(var7);
			if (var7 == 0) {
				if (var8 == '-') {
					var3 = true;
					continue;
				}
				if (var8 == '+' && arg2) {
					continue;
				}
			}
			int var10;
			if (var8 >= '0' && var8 <= '9') {
				var10 = var8 - '0';
			} else if (var8 >= 'A' && var8 <= 'Z') {
				var10 = var8 - '7';
			} else if (var8 >= 'a' && var8 <= 'z') {
				var10 = var8 - 'W';
			} else {
				return false;
			}
			if (var10 >= arg1) {
				return false;
			}
			if (var3) {
				var10 = -var10;
			}
			int var9 = arg1 * var5 + var10;
			if (var9 / arg1 != var5) {
				return false;
			}
			var5 = var9;
			var4 = true;
		}
		return var4;
	}

	@ObfuscatedName("vk.f(Ljava/lang/CharSequence;B)I")
	public static int method9595(CharSequence arg0) {
		return method9587(arg0, 10, true);
	}

	@ObfuscatedName("hz.w(Ljava/lang/CharSequence;II)I")
	public static int method4321(CharSequence arg0, int arg1) {
		return method9587(arg0, arg1, true);
	}

	@ObfuscatedName("vn.l(Ljava/lang/CharSequence;IZI)I")
	public static int method9587(CharSequence arg0, int arg1, boolean arg2) {
		if (arg1 < 2 || arg1 > 36) {
			throw new IllegalArgumentException("" + arg1);
		}
		boolean var3 = false;
		boolean var4 = false;
		int var5 = 0;
		int var6 = arg0.length();
		for (int var7 = 0; var7 < var6; var7++) {
			char var8 = arg0.charAt(var7);
			if (var7 == 0) {
				if (var8 == '-') {
					var3 = true;
					continue;
				}
				if (var8 == '+' && arg2) {
					continue;
				}
			}
			int var10;
			if (var8 >= '0' && var8 <= '9') {
				var10 = var8 - '0';
			} else if (var8 >= 'A' && var8 <= 'Z') {
				var10 = var8 - '7';
			} else if (var8 >= 'a' && var8 <= 'z') {
				var10 = var8 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (var10 >= arg1) {
				throw new NumberFormatException();
			}
			if (var3) {
				var10 = -var10;
			}
			int var9 = arg1 * var5 + var10;
			if (var9 / arg1 != var5) {
				throw new NumberFormatException();
			}
			var5 = var9;
			var4 = true;
		}
		if (!var4) {
			throw new NumberFormatException();
		}
		return var5;
	}

	@ObfuscatedName("dz.u(IZI)Ljava/lang/String;")
	public static String method1898(int arg0, boolean arg1) {
		return arg1 && arg0 >= 0 ? method13992(arg0, 10, arg1) : Integer.toString(arg0);
	}

	@ObfuscatedName("ze.z(IIZI)Ljava/lang/String;")
	public static String method13992(int arg0, int arg1, boolean arg2) {
		if (arg1 < 2 || arg1 > 36) {
			throw new IllegalArgumentException("" + arg1);
		} else if (arg2 && arg0 >= 0) {
			int var3 = 2;
			int var4 = arg0 / arg1;
			while (var4 != 0) {
				var4 /= arg1;
				var3++;
			}
			char[] var5 = new char[var3];
			var5[0] = '+';
			for (int var6 = var3 - 1; var6 > 0; var6--) {
				int var7 = arg0;
				arg0 /= arg1;
				int var8 = var7 - arg0 * arg1;
				if (var8 >= 10) {
					var5[var6] = (char) (var8 + 87);
				} else {
					var5[var6] = (char) (var8 + 48);
				}
			}
			return new String(var5);
		} else {
			return Integer.toString(arg0, arg1);
		}
	}

	@ObfuscatedName("go.p(Ljava/lang/CharSequence;B)I")
	public static int method3475(CharSequence arg0) {
		int var1 = arg0.length();
		int var2 = 0;
		for (int var3 = 0; var3 < var1; var3++) {
			var2 = (var2 << 5) - var2 + class693.method16904(arg0.charAt(var3));
		}
		return var2;
	}

	@ObfuscatedName("zg.d(Ljava/lang/CharSequence;I)I")
	public static int method14059(CharSequence arg0) {
		int var1 = arg0.length();
		int var2 = 0;
		for (int var3 = 0; var3 < var1; var3++) {
			var2 = (var2 << 5) - var2 + arg0.charAt(var3);
		}
		return var2;
	}

	@ObfuscatedName("aej.c(Ljava/lang/CharSequence;I)J")
	public static long method15380(CharSequence arg0) {
		int var1 = arg0.length();
		long var2 = 0L;
		for (int var4 = 0; var4 < var1; var4++) {
			var2 = (var2 << 5) - var2 + (long) arg0.charAt(var4);
		}
		return var2;
	}

	@ObfuscatedName("yc.r(Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)I")
	public static int method13835(CharSequence arg0, CharSequence arg1) {
		int var2 = arg0.length();
		int var3 = arg1.length();
		if (var2 == 0) {
			return var3;
		} else if (var3 == 0) {
			return var2;
		} else {
			int[] var4 = new int[var2 + 1];
			int[] var5 = new int[var2 + 1];
			int var6 = 0;
			while (var6 <= var2) {
				var4[var6] = var6++;
			}
			for (int var7 = 1; var7 <= var3; var7++) {
				var5[0] = var7;
				char var8 = arg1.charAt(var7 - 1);
				for (int var9 = 1; var9 <= var2; var9++) {
					var5[var9] = Math.min(Math.min(var5[var9 - 1] + 1, var4[var9] + 1), var4[var9 - 1] + (arg0.charAt(var9 - 1) == var8 ? 0 : 1));
				}
				int[] var10 = var4;
				var4 = var5;
				var5 = var10;
			}
			return var4[var2];
		}
	}

	@ObfuscatedName("abi.v(CI)Z")
	public static boolean method14704(char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@ObfuscatedName("pz.o(CB)Z")
	public static boolean method6819(char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@ObfuscatedName("ea.s(CI)Z")
	public static boolean method2883(char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@ObfuscatedName("client.q(Ljava/lang/String;CI)[Ljava/lang/String;")
	public static String[] method17361(String arg0, char arg1) {
		int var2 = method4423(arg0, arg1);
		String[] var3 = new String[var2 + 1];
		int var4 = 0;
		int var5 = 0;
		for (int var6 = 0; var6 < var2; var6++) {
			int var7;
			for (var7 = var5; arg0.charAt(var7) != arg1; var7++) {
			}
			var3[var4++] = arg0.substring(var5, var7);
			var5 = var7 + 1;
		}
		var3[var2] = arg0.substring(var5);
		return var3;
	}
}
