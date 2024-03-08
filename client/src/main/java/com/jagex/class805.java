package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("adw")
public class class805 {

	public class805() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("anc.e(Ljava/lang/CharSequence;B)Ljava/lang/String;")
	public static String method18779(CharSequence arg0) {
		int var1 = arg0.length();
		StringBuilder var2 = new StringBuilder(var1);
		for (int var3 = 0; var3 < var1; var3++) {
			char var4 = arg0.charAt(var3);
			if (var4 >= 'a' && var4 <= 'z' || !(var4 < 'A' || var4 > 'Z') || var4 >= '0' && var4 <= '9' || var4 == '.' || var4 == '-' || var4 == '*' || var4 == '_') {
				var2.append(var4);
			} else if (var4 == ' ') {
				var2.append('+');
			} else {
				byte var5 = class693.method16904(var4);
				var2.append('%');
				int var6 = var5 >> 4 & 0xF;
				if (var6 >= 10) {
					var2.append((char) (var6 + 55));
				} else {
					var2.append((char) (var6 + 48));
				}
				int var7 = var5 & 0xF;
				if (var7 >= 10) {
					var2.append((char) (var7 + 55));
				} else {
					var2.append((char) (var7 + 48));
				}
			}
		}
		return var2.toString();
	}
}
