package com.jagex.game.world.entity;

import deob.ObfuscatedName;

@ObfuscatedName("su")
public class EntityChatLine {

	@ObfuscatedName("su.e")
	public String text;

	@ObfuscatedName("su.n")
	public int colour;

	@ObfuscatedName("su.m")
	public int effect;

	@ObfuscatedName("su.k")
	public int field6685;

	@ObfuscatedName("su.f")
	public int time;

	@ObfuscatedName("su.e(I)Ljava/lang/String;")
	public String getText() {
		return this.text;
	}

	@ObfuscatedName("su.n(B)I")
	public int getColour() {
		return this.colour;
	}

	@ObfuscatedName("su.m(B)I")
	public int getEffect() {
		return this.effect;
	}

	@ObfuscatedName("su.k(B)I")
	public int method8280() {
		return this.field6685;
	}

	@ObfuscatedName("su.f(I)I")
	public int getTime() {
		return this.time;
	}
}
