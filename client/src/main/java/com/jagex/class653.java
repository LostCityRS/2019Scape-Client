package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("xo")
public final class class653 {

	public class653() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("tz.e(Ljava/lang/CharSequence;I)I")
	public static int method8499(CharSequence arg0) {
		int var1 = arg0.length();
		int var2 = 0;
		for (int var3 = 0; var3 < var1; var3++) {
			char var4 = arg0.charAt(var3);
			if (var4 <= 127) {
				var2++;
			} else if (var4 <= 2047) {
				var2 += 2;
			} else {
				var2 += 3;
			}
		}
		return var2;
	}

	@ObfuscatedName("alq.n([BILjava/lang/CharSequence;B)I")
	public static int method18328(byte[] arg0, int arg1, CharSequence arg2) {
		int var3 = arg2.length();
		int var4 = arg1;
		for (int var5 = 0; var5 < var3; var5++) {
			char var6 = arg2.charAt(var5);
			if (var6 <= 127) {
				arg0[var4++] = (byte) var6;
			} else if (var6 <= 2047) {
				arg0[var4++] = (byte) (var6 >> 6 | 0xC0);
				arg0[var4++] = (byte) (var6 & 0x3F | 0x80);
			} else {
				arg0[var4++] = (byte) (var6 >> 12 | 0xE0);
				arg0[var4++] = (byte) (var6 >> 6 & 0x3F | 0x80);
				arg0[var4++] = (byte) (var6 & 0x3F | 0x80);
			}
		}
		return var4 - arg1;
	}

	@ObfuscatedName("xf.m([BIIB)Ljava/lang/String;")
	public static String method10345(byte[] arg0, int arg1, int arg2) {
		char[] var3 = new char[arg2];
		int var4 = 0;
		int var5 = arg1;
		int var6 = arg1 + arg2;
		while (var5 < var6) {
			int var7 = arg0[var5++] & 0xFF;
			int var8;
			if (var7 < 128) {
				if (var7 == 0) {
					var8 = 65533;
				} else {
					var8 = var7;
				}
			} else if (var7 < 192) {
				var8 = 65533;
			} else if (var7 < 224) {
				if (var5 < var6 && (arg0[var5] & 0xC0) == 128) {
					var8 = (var7 & 0x1F) << 6 | arg0[var5++] & 0x3F;
					if (var8 < 128) {
						var8 = 65533;
					}
				} else {
					var8 = 65533;
				}
			} else if (var7 < 240) {
				if (var5 + 1 < var6 && (arg0[var5] & 0xC0) == 128 && (arg0[var5 + 1] & 0xC0) == 128) {
					var8 = (var7 & 0xF) << 12 | (arg0[var5++] & 0x3F) << 6 | arg0[var5++] & 0x3F;
					if (var8 < 2048) {
						var8 = 65533;
					}
				} else {
					var8 = 65533;
				}
			} else if (var7 >= 248) {
				var8 = 65533;
			} else if (var5 + 2 < var6 && (arg0[var5] & 0xC0) == 128 && (arg0[var5 + 1] & 0xC0) == 128 && (arg0[var5 + 2] & 0xC0) == 128) {
				int var9 = (var7 & 0x7) << 18 | (arg0[var5++] & 0x3F) << 12 | (arg0[var5++] & 0x3F) << 6 | arg0[var5++] & 0x3F;
				if (var9 >= 65536 && var9 <= 1114111) {
					var8 = 65533;
				} else {
					var8 = 65533;
				}
			} else {
				var8 = 65533;
			}
			var3[var4++] = (char) var8;
		}
		return new String(var3, 0, var4);
	}
}
