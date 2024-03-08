package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("hp")
public class class230 implements class685 {

	@ObfuscatedName("hp.e")
	public static final class230 field2420 = new class230(1, 0);

	@ObfuscatedName("hp.n")
	public static final class230 field2417 = new class230(2, 1);

	@ObfuscatedName("hp.m")
	public static final class230 field2418 = new class230(0, 2);

	@ObfuscatedName("hp.k")
	public final int field2419;

	@ObfuscatedName("hp.f")
	public final int field2416;

	@ObfuscatedName("zv.e(B)[Lhp;")
	public static class230[] method13997() {
		return new class230[] { field2418, field2420, field2417 };
	}

	public class230(int arg0, int arg1) {
		this.field2419 = arg0;
		this.field2416 = arg1;
	}

	@ObfuscatedName("hp.n()I")
	public int method1303() {
		return this.field2416;
	}
}
