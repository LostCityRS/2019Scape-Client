package com.jagex.game.camera;

import deob.ObfuscatedName;

@ObfuscatedName("ii")
public class LookatMode {

	@ObfuscatedName("ii.e")
	public static final LookatMode POINT = new LookatMode(0, false);

	@ObfuscatedName("ii.n")
	public static final LookatMode ENTITY = new LookatMode(1, false);

	@ObfuscatedName("ii.m")
	public static final LookatMode field2789 = new LookatMode(2, true);

	@ObfuscatedName("ii.k")
	public static final LookatMode ORIENTATION = new LookatMode(3, false);

	@ObfuscatedName("ii.f")
	public static final LookatMode field2795 = new LookatMode(4, true);

	@ObfuscatedName("ii.w")
	public static final LookatMode field2792 = new LookatMode(5, true);

	@ObfuscatedName("ii.l")
	public static final LookatMode field2787 = new LookatMode(6, true);

	@ObfuscatedName("ii.u")
	public final int id;

	@ObfuscatedName("ii.z")
	public final boolean field2793;

	public LookatMode(int id, boolean arg1) {
		this.id = id;
		this.field2793 = arg1;
	}

	@ObfuscatedName("fb.e(II)Lii;")
	public static LookatMode of(int id) {
		if (POINT.id == id) {
			return POINT;
		} else if (ENTITY.id == id) {
			return ENTITY;
		} else if (field2789.id == id) {
			return field2789;
		} else if (ORIENTATION.id == id) {
			return ORIENTATION;
		} else if (field2795.id == id) {
			return field2795;
		} else if (field2792.id == id) {
			return field2792;
		} else if (field2787.id == id) {
			return field2787;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ii.n(B)Z")
	public boolean method4602() {
		return this.field2793;
	}
}
