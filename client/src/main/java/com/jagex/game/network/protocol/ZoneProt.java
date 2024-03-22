package com.jagex.game.network.protocol;

import deob.ObfuscatedName;

@ObfuscatedName("nk")
public class ZoneProt {

	@ObfuscatedName("nk.e")
	public static final ZoneProt LOC_PREFETCH = new ZoneProt(5);

	@ObfuscatedName("nk.n")
	public static final ZoneProt MAP_ANIM = new ZoneProt(10);

	@ObfuscatedName("nk.m")
	public static final ZoneProt TEXT_COORD = new ZoneProt(-1);

	@ObfuscatedName("nk.k")
	public static final ZoneProt OBJ_COUNT = new ZoneProt(7);

	@ObfuscatedName("nk.f")
	public static final ZoneProt LOC_ANIM = new ZoneProt(7);

	@ObfuscatedName("nk.w")
	public static final ZoneProt LOC_DEL = new ZoneProt(2);

	@ObfuscatedName("nk.l")
	public static final ZoneProt field3618 = new ZoneProt(9);

	@ObfuscatedName("nk.u")
	public static final ZoneProt MAP_PROJANIM = new ZoneProt(18);

	@ObfuscatedName("nk.z")
	public static final ZoneProt OBJ_REVEAL = new ZoneProt(7);

	@ObfuscatedName("nk.p")
	public static final ZoneProt OBJ_DEL = new ZoneProt(3);

	@ObfuscatedName("nk.d")
	public static final ZoneProt LOC_ADD_CHANGE = new ZoneProt(-1);

	@ObfuscatedName("nk.c")
	public static final ZoneProt LOC_CUSTOMISE = new ZoneProt(-1);

	@ObfuscatedName("nk.r")
	public static final ZoneProt MAP_PROJANIM_HALFSQ = new ZoneProt(21);

	@ObfuscatedName("nk.v")
	public static final ZoneProt OBJ_ADD = new ZoneProt(5);

	@ObfuscatedName("nk.o")
	public static final ZoneProt SOUND_AREA = new ZoneProt(8);

	@ObfuscatedName("kh.e(I)[Lnk;")
	public static ZoneProt[] values() {
		return new ZoneProt[] {LOC_PREFETCH, MAP_ANIM, TEXT_COORD, OBJ_COUNT, LOC_ANIM, LOC_DEL, field3618, MAP_PROJANIM, OBJ_REVEAL, OBJ_DEL, LOC_ADD_CHANGE, LOC_CUSTOMISE, MAP_PROJANIM_HALFSQ, OBJ_ADD, SOUND_AREA};
	}

	public ZoneProt(int arg0) {
	}
}
