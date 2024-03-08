package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("cy")
public class class106 implements class685 {

	@ObfuscatedName("cy.e")
	public static final class106 field1251 = new class106(0, 0);

	@ObfuscatedName("cy.n")
	public static final class106 field1250 = new class106(1, 1);

	@ObfuscatedName("cy.m")
	public static final class106 field1245 = new class106(2, 2);

	@ObfuscatedName("cy.k")
	public static final class106 field1247 = new class106(3, 3);

	@ObfuscatedName("cy.f")
	public static final class106 field1249 = new class106(4, 4);

	@ObfuscatedName("cy.w")
	public static final class106 field1246 = new class106(5, 5);

	@ObfuscatedName("cy.l")
	public static final class106 field1248 = new class106(6, 6);

	@ObfuscatedName("cy.u")
	public static final class106 field1252 = new class106(7, 7);

	@ObfuscatedName("cy.z")
	public static final class106 field1253 = new class106(8, 8);

	@ObfuscatedName("cy.p")
	public final int field1254;

	@ObfuscatedName("cy.d")
	public final int field1255;

	@ObfuscatedName("dh.e(B)[Lcy;")
	public static class106[] method2582() {
		return new class106[] { field1251, field1250, field1245, field1247, field1249, field1246, field1248, field1252, field1253 };
	}

	public class106(int arg0, int arg1) {
		this.field1254 = arg0;
		this.field1255 = arg1;
	}

	@ObfuscatedName("cy.n()I")
	public int method1303() {
		return this.field1255;
	}

	@ObfuscatedName("fg.m(II)Lcy;")
	public static class106 method2995(int arg0) {
		class106 var1 = (class106) class686.method1897(method2582(), arg0);
		if (var1 == null) {
			var1 = field1253;
		}
		return var1;
	}
}
