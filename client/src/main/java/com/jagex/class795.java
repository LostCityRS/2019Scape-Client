package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("adz")
public class class795 {

	@ObfuscatedName("adz.m")
	public static final char[] field9203 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@ObfuscatedName("adz.k")
	public static final char[] field9202 = new char[] { '[', ']', '#' };

	public class795() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("uj.e(Ladi;B)I")
	public static final int method9127(class794 arg0) {
		if (arg0 == null) {
			return 12;
		} else {
			switch(arg0.field9196) {
				case 2:
					return 20;
				default:
					return 12;
			}
		}
	}

	@ObfuscatedName("ym.n(CB)Z")
	public static final boolean method13783(char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (class695.method2883(arg0)) {
			return true;
		} else {
			char[] var1 = field9203;
			for (int var2 = 0; var2 < var1.length; var2++) {
				char var3 = var1[var2];
				if (arg0 == var3) {
					return true;
				}
			}
			char[] var4 = field9202;
			for (int var5 = 0; var5 < var4.length; var5++) {
				char var6 = var4[var5];
				if (arg0 == var6) {
					return true;
				}
			}
			return false;
		}
	}

	@ObfuscatedName("tl.m(CI)Z")
	public static final boolean method8894(char arg0) {
		return arg0 == 160 || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@ObfuscatedName("adh.k(Ljava/lang/CharSequence;Ladi;B)Ljava/lang/String;")
	public static String method15191(CharSequence arg0, class794 arg1) {
		if (arg0 == null) {
			return null;
		}
		int var2 = 0;
		int var3 = arg0.length();
		while (var2 < var3 && method8894(arg0.charAt(var2))) {
			var2++;
		}
		while (var3 > var2 && method8894(arg0.charAt(var3 - 1))) {
			var3--;
		}
		int var4 = var3 - var2;
		if (var4 < 1 || var4 > method9127(arg1)) {
			return null;
		}
		StringBuilder var5 = new StringBuilder(var4);
		for (int var6 = var2; var6 < var3; var6++) {
			char var7 = arg0.charAt(var6);
			if (method13783(var7)) {
				char var8 = method8383(var7);
				if (var8 != 0) {
					var5.append(var8);
				}
			}
		}
		if (var5.length() == 0) {
			return null;
		} else {
			return var5.toString();
		}
	}

	@ObfuscatedName("sg.f(CI)C")
	public static char method8383(char arg0) {
		switch(arg0) {
			case ' ':
			case '-':
			case '_':
			case ' ':
				return '_';
			case '#':
			case '[':
			case ']':
				return arg0;
			case 'À':
			case 'Á':
			case 'Â':
			case 'Ã':
			case 'Ä':
			case 'à':
			case 'á':
			case 'â':
			case 'ã':
			case 'ä':
				return 'a';
			case 'Ç':
			case 'ç':
				return 'c';
			case 'È':
			case 'É':
			case 'Ê':
			case 'Ë':
			case 'è':
			case 'é':
			case 'ê':
			case 'ë':
				return 'e';
			case 'Í':
			case 'Î':
			case 'Ï':
			case 'í':
			case 'î':
			case 'ï':
				return 'i';
			case 'Ñ':
			case 'ñ':
				return 'n';
			case 'Ò':
			case 'Ó':
			case 'Ô':
			case 'Õ':
			case 'Ö':
			case 'ò':
			case 'ó':
			case 'ô':
			case 'õ':
			case 'ö':
				return 'o';
			case 'Ù':
			case 'Ú':
			case 'Û':
			case 'Ü':
			case 'ù':
			case 'ú':
			case 'û':
			case 'ü':
				return 'u';
			case 'ß':
				return 'b';
			case 'ÿ':
			case 'Ÿ':
				return 'y';
			default:
				return Character.toLowerCase(arg0);
		}
	}
}
