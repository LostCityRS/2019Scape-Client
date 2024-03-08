package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("iw")
public class class256 {

	@ObfuscatedName("iw.e")
	public static final class256 field2671 = new class256(0, 4);

	@ObfuscatedName("iw.n")
	public static final class256 field2672 = new class256(1, 5);

	@ObfuscatedName("iw.m")
	public static final class256 field2673 = new class256(2, 6);

	@ObfuscatedName("iw.k")
	public final int field2674;

	@ObfuscatedName("iw.f")
	public final int field2675;

	@ObfuscatedName("aoz.e(B)[Liw;")
	public static class256[] method18920() {
		return new class256[] { field2671, field2672, field2673 };
	}

	public class256(int arg0, int arg1) {
		this.field2674 = arg0;
		this.field2675 = arg1 * 64;
	}

	@ObfuscatedName("ajy.n(IB)Liw;")
	public static class256 method17395(int arg0) {
		class256[] var1 = method18920();
		for (int var2 = 0; var2 < var1.length; var2++) {
			class256 var3 = var1[var2];
			if (var3.field2674 == arg0) {
				return var3;
			}
		}
		return null;
	}
}
