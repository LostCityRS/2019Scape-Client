package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("cc")
public class class107 {

	public class107() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("xf.e(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method10347(String arg0) {
		int var1 = arg0.length();
		int var2 = 0;
		for (int var3 = 0; var3 < var1; var3++) {
			char var4 = arg0.charAt(var3);
			if (var4 == '<' || var4 == '>') {
				var2 += 3;
			}
		}
		StringBuilder var5 = new StringBuilder(var1 + var2);
		for (int var6 = 0; var6 < var1; var6++) {
			char var7 = arg0.charAt(var6);
			if (var7 == '<') {
				var5.append("<lt>");
			} else if (var7 == '>') {
				var5.append("<gt>");
			} else {
				var5.append(var7);
			}
		}
		return var5.toString();
	}
}
