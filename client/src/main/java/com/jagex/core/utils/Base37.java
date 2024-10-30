package com.jagex.core.utils;

import deob.ObfuscatedName;

@ObfuscatedName("zq")
public class Base37 {

	@ObfuscatedName("zq.e")
	public static final char[] ALPHABET = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@ObfuscatedName("zq.n")
	public static long[] unused = new long[12];

	static {
		for (int var0 = 0; var0 < unused.length; var0++) {
			unused[var0] = (long) Math.pow(37.0D, (double) var0);
		}
	}

	public Base37() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("yk.e(Ljava/lang/CharSequence;B)J")
	public static long toBase37(CharSequence arg0) {
		long var1 = 0L;
		int var3 = arg0.length();
		for (int var4 = 0; var4 < var3; var4++) {
			var1 *= 37L;
			char var5 = arg0.charAt(var4);
			if (var5 >= 'A' && var5 <= 'Z') {
				var1 += var5 + 1 - 65;
			} else if (var5 >= 'a' && var5 <= 'z') {
				var1 += var5 + 1 - 97;
			} else if (var5 >= '0' && var5 <= '9') {
				var1 += var5 + 27 - 48;
			}
			if (var1 >= 177917621779460413L) {
				break;
			}
		}
		while (var1 % 37L == 0L && var1 != 0L) {
			var1 /= 37L;
		}
		return var1;
	}

	@ObfuscatedName("va.n(J)Ljava/lang/String;")
	public static String fromBase37(long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			int var2 = 0;
			for (long var3 = arg0; var3 != 0L; var3 /= 37L) {
				var2++;
			}
			StringBuilder var5 = new StringBuilder(var2);
			while (arg0 != 0L) {
				long var6 = arg0;
				arg0 /= 37L;
				char var8 = ALPHABET[(int) (var6 - arg0 * 37L)];
				if (var8 == '_') {
					int var9 = var5.length() - 1;
					var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
					var8 = 160;
				}
				var5.append(var8);
			}
			var5.reverse();
			var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
			return var5.toString();
		}
	}

	@ObfuscatedName("ady.m(Ljava/lang/CharSequence;B)Ljava/lang/String;")
	public static String fromBase37orEmpty(CharSequence arg0) {
		String var1 = fromBase37(toBase37(arg0));
		if (var1 == null) {
			var1 = "";
		}
		return var1;
	}
}
