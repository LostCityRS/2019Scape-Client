package com.jagex.core.utils;

import deob.ObfuscatedName;

@ObfuscatedName("zk")
public class Base64 {

	@ObfuscatedName("zk.e")
	public static char[] BASE64_ALPHABET = new char[64];

	@ObfuscatedName("zk.n")
	public static char[] unused1;

	@ObfuscatedName("zk.m")
	public static char[] BASE64_URL_ALPHABET;

	@ObfuscatedName("zk.k")
	public static int[] unused2;

	static {
		for (int var0 = 0; var0 < 26; var0++) {
			BASE64_ALPHABET[var0] = (char) (var0 + 65);
		}
		for (int var1 = 26; var1 < 52; var1++) {
			BASE64_ALPHABET[var1] = (char) (var1 + 97 - 26);
		}
		for (int var2 = 52; var2 < 62; var2++) {
			BASE64_ALPHABET[var2] = (char) (var2 + 48 - 52);
		}
		BASE64_ALPHABET[62] = '+';
		BASE64_ALPHABET[63] = '/';
		unused1 = new char[64];
		for (int var3 = 0; var3 < 26; var3++) {
			unused1[var3] = (char) (var3 + 65);
		}
		for (int var4 = 26; var4 < 52; var4++) {
			unused1[var4] = (char) (var4 + 97 - 26);
		}
		for (int var5 = 52; var5 < 62; var5++) {
			unused1[var5] = (char) (var5 + 48 - 52);
		}
		unused1[62] = '*';
		unused1[63] = '-';
		BASE64_URL_ALPHABET = new char[64];
		for (int var6 = 0; var6 < 26; var6++) {
			BASE64_URL_ALPHABET[var6] = (char) (var6 + 65);
		}
		for (int var7 = 26; var7 < 52; var7++) {
			BASE64_URL_ALPHABET[var7] = (char) (var7 + 97 - 26);
		}
		for (int var8 = 52; var8 < 62; var8++) {
			BASE64_URL_ALPHABET[var8] = (char) (var8 + 48 - 52);
		}
		BASE64_URL_ALPHABET[62] = '-';
		BASE64_URL_ALPHABET[63] = '_';
		unused2 = new int[128];
		for (int var9 = 0; var9 < unused2.length; var9++) {
			unused2[var9] = -1;
		}
		for (int var10 = 65; var10 <= 90; var10++) {
			unused2[var10] = var10 - 65;
		}
		for (int var11 = 97; var11 <= 122; var11++) {
			unused2[var11] = var11 - 97 + 26;
		}
		for (int var12 = 48; var12 <= 57; var12++) {
			unused2[var12] = var12 - 48 + 52;
		}
		int[] var13 = unused2;
		unused2[43] = 62;
		var13[42] = 62;
		int[] var14 = unused2;
		unused2[47] = 63;
		var14[45] = 63;
	}

	public Base64() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("xs.e([BI)Ljava/lang/String;")
	public static String toBase64(byte[] arg0) {
		return toBase64(arg0, 0, arg0.length);
	}

	@ObfuscatedName("bl.n([BIII)Ljava/lang/String;")
	public static String toBase64(byte[] arg0, int arg1, int arg2) {
		StringBuilder var3 = new StringBuilder();
		for (int var4 = arg1; var4 < arg1 + arg2; var4 += 3) {
			int var5 = arg0[var4] & 0xFF;
			var3.append(BASE64_ALPHABET[var5 >>> 2]);
			if (var4 < arg2 - 1) {
				int var6 = arg0[var4 + 1] & 0xFF;
				var3.append(BASE64_ALPHABET[(var5 & 0x3) << 4 | var6 >>> 4]);
				if (var4 < arg2 - 2) {
					int var7 = arg0[var4 + 2] & 0xFF;
					var3.append(BASE64_ALPHABET[(var6 & 0xF) << 2 | var7 >>> 6]).append(BASE64_ALPHABET[var7 & 0x3F]);
				} else {
					var3.append(BASE64_ALPHABET[(var6 & 0xF) << 2]).append("=");
				}
			} else {
				var3.append(BASE64_ALPHABET[(var5 & 0x3) << 4]).append("==");
			}
		}
		return var3.toString();
	}
}
