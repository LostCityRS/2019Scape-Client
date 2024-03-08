package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("zi")
public class class689 implements class685 {

	@ObfuscatedName("zi.e")
	public static final class689 field8311 = new class689(7, 0);

	@ObfuscatedName("zi.n")
	public static final class689 field8305 = new class689(6, 1);

	@ObfuscatedName("zi.m")
	public static final class689 field8303 = new class689(3, 2);

	@ObfuscatedName("zi.k")
	public static final class689 field8306 = new class689(5, 3);

	@ObfuscatedName("zi.f")
	public static final class689 field8307 = new class689(0, 4);

	@ObfuscatedName("zi.w")
	public static final class689 field8308 = new class689(4, 5);

	@ObfuscatedName("zi.l")
	public static final class689 field8309 = new class689(1, 6);

	@ObfuscatedName("zi.u")
	public static final class689 field8310 = new class689(2, 7);

	@ObfuscatedName("zi.z")
	public final int field8304;

	@ObfuscatedName("zi.p")
	public final int field8312;

	@ObfuscatedName("vj.e(I)[Lzi;")
	public static class689[] method9573() {
		return new class689[] { field8305, field8307, field8303, field8311, field8310, field8309, field8306, field8308 };
	}

	public class689(int arg0, int arg1) {
		this.field8304 = arg0;
		this.field8312 = arg1;
	}

	@ObfuscatedName("zi.n()I")
	public int method1303() {
		return this.field8312;
	}

	@ObfuscatedName("zi.m(I)Lzi;")
	public class689 method13895() {
		switch(this.field8304) {
			case 0:
				return field8311;
			case 1:
				return field8303;
			case 2:
				return field8306;
			case 3:
				return field8309;
			case 4:
				return field8305;
			case 5:
				return field8310;
			case 6:
				return field8308;
			case 7:
				return field8307;
			default:
				throw new IllegalStateException();
		}
	}
}
