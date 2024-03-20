package com.jagex.audio.api;

import deob.ObfuscatedName;

@ObfuscatedName("fj")
public class BussType {

	@ObfuscatedName("fj.e")
	public static final BussType MASTER = new BussType(1);

	@ObfuscatedName("fj.n")
	public static final BussType SFX = new BussType(0);

	@ObfuscatedName("fj.m")
	public static final BussType MUSIC = new BussType(5);

	@ObfuscatedName("fj.k")
	public static final BussType MUSIC_LOGIN = new BussType(3);

	@ObfuscatedName("fj.f")
	public static final BussType AMBIENT = new BussType(2);

	@ObfuscatedName("fj.w")
	public static final BussType VOICEOVER = new BussType(4);

	@ObfuscatedName("fj.l")
	public final int ordinal;

	public BussType(int arg0) {
		this.ordinal = arg0;
	}

	@ObfuscatedName("fj.e(I)I")
	public int getId() {
		return MASTER == this ? -1 : this.ordinal | 0x1000000;
	}
}
