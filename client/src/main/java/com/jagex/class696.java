package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("zd")
public class class696 {

	@ObfuscatedName("zd.e")
	public static final class696 field8335 = new class696("runescape", "RuneScape", 0, class794.field9193);

	@ObfuscatedName("zd.n")
	public static final class696 field8334 = new class696("stellardawn", "Stellar Dawn", 1, class794.field9190);

	@ObfuscatedName("zd.m")
	public static final class696 field8338 = new class696("game3", "Game 3", 2, class794.field9193);

	@ObfuscatedName("zd.k")
	public static final class696 field8336 = new class696("game4", "Game 4", 3, class794.field9192);

	@ObfuscatedName("zd.f")
	public static final class696 field8337 = new class696("game5", "Game 5", 4, class794.field9195);

	@ObfuscatedName("zd.w")
	public static final class696 field8340 = new class696("oldscape", "RuneScape 2007", 5, class794.field9193);

	@ObfuscatedName("zd.l")
	public final String field8333;

	@ObfuscatedName("zd.u")
	public final String field8341;

	@ObfuscatedName("zd.z")
	public final int field8339;

	public class696(String arg0, String arg1, int arg2, class794 arg3) {
		this.field8333 = arg0;
		this.field8341 = arg1;
		this.field8339 = arg2;
	}

	@ObfuscatedName("rg.n(II)Lzd;")
	public static class696 method7704(int arg0) {
		class696[] var1 = Statics.method7118();
		for (int var2 = 0; var2 < var1.length; var2++) {
			class696 var3 = var1[var2];
			if (var3.field8339 == arg0) {
				return var3;
			}
		}
		return null;
	}
}
