package com.jagex.core.utils;

import deob.ObfuscatedName;

@ObfuscatedName("zq")
public final class Base37 {

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
	public static long toBase37(CharSequence chars) {
		long base37 = 0L;
		int length = chars.length();
		for (int index = 0; index < length; index++) {
			base37 *= 37L;
			char c = chars.charAt(index);
			if (c >= 'A' && c <= 'Z') {
				base37 += c + 1 - 65;
			} else if (c >= 'a' && c <= 'z') {
				base37 += c + 1 - 97;
			} else if (c >= '0' && c <= '9') {
				base37 += c + 27 - 48;
			}
			if (base37 >= 177917621779460413L) {
				break;
			}
		}
		while (base37 % 37L == 0L && base37 != 0L) {
			base37 /= 37L;
		}
		return base37;
	}

	@ObfuscatedName("va.n(J)Ljava/lang/String;")
	public static String fromBase37(long base37) {
		if (base37 <= 0L || base37 >= 6582952005840035281L) {
			return null;
		}

		if (base37 % 37L == 0L) {
			return null;
		}

        int length = 0;
        for (long i = base37; i != 0L; i /= 37L) {
            length++;
        }

        StringBuilder chars = new StringBuilder(length);
        while (base37 != 0L) {
            long l1 = base37;
            base37 /= 37L;
            char c = ALPHABET[(int) (l1 - base37 * 37L)];
            if (c == '_') {
                int index = chars.length() - 1;
                chars.setCharAt(index, Character.toUpperCase(chars.charAt(index)));
                c = 160;
            }
            chars.append(c);
        }
        chars.reverse();
        chars.setCharAt(0, Character.toUpperCase(chars.charAt(0)));
        return chars.toString();
    }

	@ObfuscatedName("ady.m(Ljava/lang/CharSequence;B)Ljava/lang/String;")
	public static String fromBase37orEmpty(CharSequence chars) {
		String result = fromBase37(toBase37(chars));
		if (result == null) {
			result = "";
		}
		return result;
	}
}
