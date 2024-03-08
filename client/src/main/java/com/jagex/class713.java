package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aaa")
public class class713 {

	@ObfuscatedName("aaa.e")
	public static final class713 field8473 = new class713("LIVE", 0);

	@ObfuscatedName("aaa.n")
	public static final class713 field8472 = new class713("BUILDLIVE", 3);

	@ObfuscatedName("aaa.m")
	public static final class713 field8474 = new class713("RC", 1);

	@ObfuscatedName("aaa.k")
	public static final class713 field8475 = new class713("WIP", 2);

	@ObfuscatedName("aaa.f")
	public static final class713 field8476 = new class713("INTBETA", 4);

	@ObfuscatedName("aaa.w")
	public final String field8478;

	@ObfuscatedName("aaa.l")
	public final int field8477;

	@ObfuscatedName("rg.e(B)[Laaa;")
	public static class713[] method7705() {
		return new class713[] { field8475, field8472, field8473, field8474, field8476 };
	}

	public class713(String arg0, int arg1) {
		this.field8478 = arg0;
		this.field8477 = arg1;
	}

	@ObfuscatedName("sk.n(II)Laaa;")
	public static class713 method8146(int arg0) {
		class713[] var1 = method7705();
		for (int var2 = 0; var2 < var1.length; var2++) {
			class713 var3 = var1[var2];
			if (var3.field8477 == arg0) {
				return var3;
			}
		}
		return null;
	}
}
