package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("zk")
public class class694 {

	@ObfuscatedName("zk.e")
	public static char[] field8328 = new char[64];

	@ObfuscatedName("zk.n")
	public static char[] field8329;

	@ObfuscatedName("zk.m")
	public static char[] field8331;

	@ObfuscatedName("zk.k")
	public static int[] field8330;

	static {
		for (int var0 = 0; var0 < 26; var0++) {
			field8328[var0] = (char) (var0 + 65);
		}
		for (int var1 = 26; var1 < 52; var1++) {
			field8328[var1] = (char) (var1 + 97 - 26);
		}
		for (int var2 = 52; var2 < 62; var2++) {
			field8328[var2] = (char) (var2 + 48 - 52);
		}
		field8328[62] = '+';
		field8328[63] = '/';
		field8329 = new char[64];
		for (int var3 = 0; var3 < 26; var3++) {
			field8329[var3] = (char) (var3 + 65);
		}
		for (int var4 = 26; var4 < 52; var4++) {
			field8329[var4] = (char) (var4 + 97 - 26);
		}
		for (int var5 = 52; var5 < 62; var5++) {
			field8329[var5] = (char) (var5 + 48 - 52);
		}
		field8329[62] = '*';
		field8329[63] = '-';
		field8331 = new char[64];
		for (int var6 = 0; var6 < 26; var6++) {
			field8331[var6] = (char) (var6 + 65);
		}
		for (int var7 = 26; var7 < 52; var7++) {
			field8331[var7] = (char) (var7 + 97 - 26);
		}
		for (int var8 = 52; var8 < 62; var8++) {
			field8331[var8] = (char) (var8 + 48 - 52);
		}
		field8331[62] = '-';
		field8331[63] = '_';
		field8330 = new int[128];
		for (int var9 = 0; var9 < field8330.length; var9++) {
			field8330[var9] = -1;
		}
		for (int var10 = 65; var10 <= 90; var10++) {
			field8330[var10] = var10 - 65;
		}
		for (int var11 = 97; var11 <= 122; var11++) {
			field8330[var11] = var11 - 97 + 26;
		}
		for (int var12 = 48; var12 <= 57; var12++) {
			field8330[var12] = var12 - 48 + 52;
		}
		int[] var13 = field8330;
		field8330[43] = 62;
		var13[42] = 62;
		int[] var14 = field8330;
		field8330[47] = 63;
		var14[45] = 63;
	}

	public class694() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("xs.e([BI)Ljava/lang/String;")
	public static String method10220(byte[] arg0) {
		return method1022(arg0, 0, arg0.length);
	}

	@ObfuscatedName("bl.n([BIII)Ljava/lang/String;")
	public static String method1022(byte[] arg0, int arg1, int arg2) {
		StringBuilder var3 = new StringBuilder();
		for (int var4 = arg1; var4 < arg1 + arg2; var4 += 3) {
			int var5 = arg0[var4] & 0xFF;
			var3.append(field8328[var5 >>> 2]);
			if (var4 < arg2 - 1) {
				int var6 = arg0[var4 + 1] & 0xFF;
				var3.append(field8328[(var5 & 0x3) << 4 | var6 >>> 4]);
				if (var4 < arg2 - 2) {
					int var7 = arg0[var4 + 2] & 0xFF;
					var3.append(field8328[(var6 & 0xF) << 2 | var7 >>> 6]).append(field8328[var7 & 0x3F]);
				} else {
					var3.append(field8328[(var6 & 0xF) << 2]).append("=");
				}
			} else {
				var3.append(field8328[(var5 & 0x3) << 4]).append("==");
			}
		}
		return var3.toString();
	}
}
