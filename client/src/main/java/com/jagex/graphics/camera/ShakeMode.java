package com.jagex.graphics.camera;

import deob.ObfuscatedName;

@ObfuscatedName("iu")
public class ShakeMode {

	@ObfuscatedName("iu.e")
	public static final ShakeMode field2625 = new ShakeMode(0);

	@ObfuscatedName("iu.n")
	public static final ShakeMode field2620 = new ShakeMode(1);

	@ObfuscatedName("iu.m")
	public static final ShakeMode field2619 = new ShakeMode(2);

	@ObfuscatedName("iu.k")
	public static final ShakeMode field2622 = new ShakeMode(3);

	@ObfuscatedName("iu.f")
	public static final ShakeMode field2623 = new ShakeMode(4);

	@ObfuscatedName("iu.w")
	public static final ShakeMode field2624 = new ShakeMode(5);

	@ObfuscatedName("iu.l")
	public int id;

	public ShakeMode(int id) {
		this.id = id;
	}

	@ObfuscatedName("cj.e(II)Liu;")
	public static ShakeMode of(int id) {
		if (field2625.id == id) {
			return field2625;
		} else if (field2620.id == id) {
			return field2620;
		} else if (field2619.id == id) {
			return field2619;
		} else if (field2622.id == id) {
			return field2622;
		} else if (field2623.id == id) {
			return field2623;
		} else if (field2624.id == id) {
			return field2624;
		} else {
			return null;
		}
	}
}
