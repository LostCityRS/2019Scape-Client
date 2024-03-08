package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("zq")
public final class class692 {

	@ObfuscatedName("zq.e")
	public static final char[] field8325 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	@ObfuscatedName("zq.n")
	public static long[] field8324 = new long[12];

	static {
		for (int var0 = 0; var0 < field8324.length; var0++) {
			field8324[var0] = (long) Math.pow(37.0D, (double) var0);
		}
	}

	public class692() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("va.n(J)Ljava/lang/String;")
	public static String method9411(long arg0) {
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
				char var8 = field8325[(int) (var6 - arg0 * 37L)];
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
	public static String method15309(CharSequence arg0) {
		String var1 = method9411(Statics.method10482(arg0));
		if (var1 == null) {
			var1 = "";
		}
		return var1;
	}
}
