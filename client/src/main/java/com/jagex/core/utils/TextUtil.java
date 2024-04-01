package com.jagex.core.utils;

import deob.ObfuscatedName;

@ObfuscatedName("n")
public class TextUtil {

	@ObfuscatedName("n.e")
	public static String TRUE = "true";

	@ObfuscatedName("n.n")
	public static String COMMA = ",";

	@ObfuscatedName("n.m")
	public static String OPEN_PARENTHESIS = " (";

	@ObfuscatedName("n.k")
	public static String CLOSE_PARENTHESIS = ")";

	@ObfuscatedName("n.f")
	public static String ARROW = "->";

	@ObfuscatedName("n.w")
	public static String BR = "<br>";

	@ObfuscatedName("n.l")
	public static String ENDCOL = "</col>";

	@ObfuscatedName("n.u")
	public static String NAME = "<name>";

	public TextUtil() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("iq.e(II)Ljava/lang/String;")
	public static String imgTag(int arg0) {
		return "<img=" + arg0 + ">";
	}

	@ObfuscatedName("h.n(II)Ljava/lang/String;")
	public static String colTag(int arg0) {
		return "<col=" + Integer.toHexString(arg0) + ">";
	}
}
