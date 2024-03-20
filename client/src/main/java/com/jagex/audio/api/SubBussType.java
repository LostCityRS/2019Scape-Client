package com.jagex.audio.api;

import deob.ObfuscatedName;

@ObfuscatedName("fz")
public class SubBussType {

	@ObfuscatedName("fz.e")
	public static final SubBussType SFX_SUB = new SubBussType(8);

	@ObfuscatedName("fz.n")
	public static final SubBussType MUSIC_SUB = new SubBussType(0);

	@ObfuscatedName("fz.m")
	public static final SubBussType DIALOG_SUB = new SubBussType(1);

	@ObfuscatedName("fz.k")
	public static final SubBussType PLAYER_ANIMATION_SUB = new SubBussType(4);

	@ObfuscatedName("fz.f")
	public static final SubBussType NPC_ANIMATION_SUB = new SubBussType(7);

	@ObfuscatedName("fz.w")
	public static final SubBussType LOCATION_ANIMATION_SUB = new SubBussType(6);

	@ObfuscatedName("fz.l")
	public static final SubBussType GENERAL_ANIMATION_SUB = new SubBussType(9);

	@ObfuscatedName("fz.u")
	public static final SubBussType LOCATIONS_SUB = new SubBussType(2);

	@ObfuscatedName("fz.z")
	public static final SubBussType LOCATION_RANDOM_SUB = new SubBussType(5);

	@ObfuscatedName("fz.p")
	public static final SubBussType LOCATION_GENERIC_SUB = new SubBussType(3);

	@ObfuscatedName("fz.d")
	public final int ordinal;

	public SubBussType(int arg0) {
		this.ordinal = arg0;
	}

	@ObfuscatedName("fz.e(I)I")
	public int getId() {
		return this.ordinal | 0x2000000;
	}
}
