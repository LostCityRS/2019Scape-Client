package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ajq")
public class class955 extends class531 {

	@ObfuscatedName("ajq.m")
	public static class716 field11198 = new class716();

	@ObfuscatedName("ajq.k")
	public static int field11196 = 0;

	@ObfuscatedName("ajq.f")
	public class892 field11197;

	@ObfuscatedName("ajq.w")
	public int field11199;

	@ObfuscatedName("ajq.l")
	public int field11195;

	@ObfuscatedName("ajq.u")
	public int field11200;

	@ObfuscatedName("ajq.z")
	public int field11201;

	@ObfuscatedName("aaq.n(I)Lajq;")
	public static class955 method14429() {
		class955 var0 = (class955) field11198.method14245();
		if (var0 == null) {
			return new class955();
		} else {
			field11196--;
			return var0;
		}
	}

	@ObfuscatedName("fs.m(Lajq;I)V")
	public static void method3032(class955 arg0) {
		arg0.field11197 = null;
		if (field11196 < 20) {
			field11198.method14243(arg0);
			field11196++;
		}
	}
}
