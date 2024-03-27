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
		for (int index = 0; index < 26; index++) {
			BASE64_ALPHABET[index] = (char) (index + 65);
		}
		for (int index = 26; index < 52; index++) {
			BASE64_ALPHABET[index] = (char) (index + 97 - 26);
		}
		for (int index = 52; index < 62; index++) {
			BASE64_ALPHABET[index] = (char) (index + 48 - 52);
		}
		BASE64_ALPHABET[62] = '+';
		BASE64_ALPHABET[63] = '/';
		unused1 = new char[64];
		for (int index = 0; index < 26; index++) {
			unused1[index] = (char) (index + 65);
		}
		for (int index = 26; index < 52; index++) {
			unused1[index] = (char) (index + 97 - 26);
		}
		for (int index = 52; index < 62; index++) {
			unused1[index] = (char) (index + 48 - 52);
		}
		unused1[62] = '*';
		unused1[63] = '-';
		BASE64_URL_ALPHABET = new char[64];
		for (int index = 0; index < 26; index++) {
			BASE64_URL_ALPHABET[index] = (char) (index + 65);
		}
		for (int index = 26; index < 52; index++) {
			BASE64_URL_ALPHABET[index] = (char) (index + 97 - 26);
		}
		for (int index = 52; index < 62; index++) {
			BASE64_URL_ALPHABET[index] = (char) (index + 48 - 52);
		}
		BASE64_URL_ALPHABET[62] = '-';
		BASE64_URL_ALPHABET[63] = '_';
		unused2 = new int[128];
		for (int index = 0; index < unused2.length; index++) {
			unused2[index] = -1;
		}
		for (int index = 65; index <= 90; index++) {
			unused2[index] = index - 65;
		}
		for (int index = 97; index <= 122; index++) {
			unused2[index] = index - 97 + 26;
		}
		for (int index = 48; index <= 57; index++) {
			unused2[index] = index - 48 + 52;
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
	public static String toBase64(byte[] bytes) {
		return toBase64(bytes, 0, bytes.length);
	}

	@ObfuscatedName("bl.n([BIII)Ljava/lang/String;")
	public static String toBase64(byte[] bytes, int off, int length) {
		StringBuilder base64 = new StringBuilder();
		for (int index = off; index < off + length; index += 3) {
			int one = bytes[index] & 0xFF;
			base64.append(BASE64_ALPHABET[one >>> 2]);
			if (index < length - 1) {
				int two = bytes[index + 1] & 0xFF;
				base64.append(BASE64_ALPHABET[(one & 0x3) << 4 | two >>> 4]);
				if (index < length - 2) {
					int three = bytes[index + 2] & 0xFF;
					base64.append(BASE64_ALPHABET[(two & 0xF) << 2 | three >>> 6]).append(BASE64_ALPHABET[three & 0x3F]);
				} else {
					base64.append(BASE64_ALPHABET[(two & 0xF) << 2]).append("=");
				}
			} else {
				base64.append(BASE64_ALPHABET[(one & 0x3) << 4]).append("==");
			}
		}
		return base64.toString();
	}
}
