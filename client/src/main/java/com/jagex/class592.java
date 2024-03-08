package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("vs")
public class class592 {

	@ObfuscatedName("vs.e")
	public static final class592 field7417 = new class592(0);

	@ObfuscatedName("vs.n")
	public static final class592 field7416 = new class592(1);

	@ObfuscatedName("vs.m")
	public static final class592 field7418 = new class592(2);

	@ObfuscatedName("vs.k")
	public final int field7419;

	@ObfuscatedName("ey.e(B)[Lvs;")
	public static class592[] method2675() {
		return new class592[] { field7417, field7416, field7418 };
	}

	public class592(int arg0) {
		this.field7419 = arg0;
	}

	@ObfuscatedName("iw.n(II)Lvs;")
	public static class592 method4512(int arg0) {
		class592[] var1 = method2675();
		for (int var2 = 0; var2 < var1.length; var2++) {
			class592 var3 = var1[var2];
			if (var3.field7419 == arg0) {
				return var3;
			}
		}
		return null;
	}
}
