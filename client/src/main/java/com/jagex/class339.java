package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("lj")
public class class339 {

	@ObfuscatedName("lj.e")
	public static final class339 field3310 = new class339(4, 0, 3, class135.field1642);

	@ObfuscatedName("lj.n")
	public static final class339 field3301 = new class339(11, 1, 3, class135.field1642);

	@ObfuscatedName("lj.m")
	public static final class339 field3311 = new class339(2, 2, 4, class135.field1645);

	@ObfuscatedName("lj.k")
	public static final class339 field3303 = new class339(7, 3, 1, class135.field1642);

	@ObfuscatedName("lj.f")
	public static final class339 field3300 = new class339(5, 4, 2, class135.field1642);

	@ObfuscatedName("lj.w")
	public static final class339 field3305 = new class339(3, 5, 3, class135.field1642);

	@ObfuscatedName("lj.l")
	public static final class339 field3306 = new class339(9, 6, 4, class135.field1642);

	@ObfuscatedName("lj.u")
	public static final class339 field3307 = new class339(10, 7, 4, class135.field1642);

	@ObfuscatedName("lj.z")
	public static final class339 field3308 = new class339(1, 8, 4, class135.field1642);

	@ObfuscatedName("lj.p")
	public static final class339 field3309 = new class339(0, 9, 4, class135.field1642);

	@ObfuscatedName("lj.d")
	public static final class339 field3314 = new class339(8, 10, 3, class135.field1642);

	@ObfuscatedName("lj.c")
	public static final class339 field3315 = new class339(6, 11, 3, class135.field1642);

	@ObfuscatedName("lj.r")
	public final int field3312;

	@ObfuscatedName("lj.o")
	public static final int field3302 = class783.method8327(16);

	@ObfuscatedName("lj.s")
	public final int field3316;

	@ObfuscatedName("lj.y")
	public final int field3313;

	@ObfuscatedName("lj.q")
	public final int field3317;

	@ObfuscatedName("lj.x")
	public final class135 field3318;

	public class339(int arg0, int arg1, int arg2, class135 arg3) {
		this.field3312 = arg0;
		this.field3316 = arg1;
		this.field3317 = arg2;
		this.field3318 = arg3;
		this.field3313 = this.field3318.field1652 * this.field3317;
		if (this.field3316 >= 16) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("lj.e(I)Llj;")
	public static class339 method5692(int arg0) {
		switch(arg0) {
			case 0:
				return field3310;
			case 1:
				return field3301;
			case 2:
				return field3311;
			case 3:
				return field3303;
			case 4:
				return field3300;
			case 5:
				return field3305;
			case 6:
				return field3306;
			default:
				return null;
		}
	}
}
