package com.jagex.game.world.entity;

import deob.ObfuscatedName;

@ObfuscatedName("im")
public class PositionMode {

	@ObfuscatedName("im.e")
	public static final PositionMode POINT = new PositionMode(0, false);

	@ObfuscatedName("im.n")
	public static final PositionMode ENTITY = new PositionMode(1, false);

	@ObfuscatedName("im.m")
	public static final PositionMode field2819 = new PositionMode(2, true);

	@ObfuscatedName("im.k")
	public static final PositionMode field2817 = new PositionMode(3, true);

	@ObfuscatedName("im.f")
	public static final PositionMode field2818 = new PositionMode(4, true);

	@ObfuscatedName("im.w")
	public final int index;

	@ObfuscatedName("im.l")
	public final boolean field2820;

	public PositionMode(int index, boolean arg1) {
		this.index = index;
		this.field2820 = arg1;
	}

	@ObfuscatedName("bc.e(IB)Lim;")
	public static PositionMode method1058(int arg0) {
		if (POINT.index == arg0) {
			return POINT;
		} else if (ENTITY.index == arg0) {
			return ENTITY;
		} else if (field2819.index == arg0) {
			return field2819;
		} else if (field2817.index == arg0) {
			return field2817;
		} else if (field2818.index == arg0) {
			return field2818;
		} else {
			return null;
		}
	}

	@ObfuscatedName("im.n(I)Z")
	public boolean method4623() {
		return this.field2820;
	}
}
