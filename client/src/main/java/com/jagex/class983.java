package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("akl")
public class class983 extends class532 {

	@ObfuscatedName("akl.k")
	public class390 field11435;

	@ObfuscatedName("akl.f")
	public int field11431;

	@ObfuscatedName("akl.w")
	public class1190 field11432;

	@ObfuscatedName("akl.l")
	public int field11430;

	@ObfuscatedName("akl.u")
	public static class983[] field11434 = new class983[300];

	@ObfuscatedName("akl.z")
	public static int field11433 = 0;

	@ObfuscatedName("rd.e(I)Lakl;")
	public static class983 method7898() {
		return field11433 == 0 ? new class983() : field11434[--field11433];
	}

	@ObfuscatedName("zw.m(B)Lakl;")
	public static class983 method13920() {
		class983 var0 = method7898();
		var0.field11435 = null;
		var0.field11431 = 0;
		var0.field11432 = new class1190(5000);
		return var0;
	}

	@ObfuscatedName("akl.k(I)V")
	public void method17793() {
		if (field11433 < field11434.length) {
			field11434[++field11433 - 1] = this;
		}
	}
}
