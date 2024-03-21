package com.jagex.game.world.entity;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("xh")
public class PlayerVisibility implements SerializableEnum {

	@ObfuscatedName("xh.e")
	public static final PlayerVisibility VISIBLE = new PlayerVisibility(0);

	@ObfuscatedName("xh.n")
	public static final PlayerVisibility HIDDEN = new PlayerVisibility(1);

	@ObfuscatedName("xh.m")
	public static final PlayerVisibility MINIMAP = new PlayerVisibility(2);

	@ObfuscatedName("xh.k")
	public final int serialID;

	@ObfuscatedName("xh.e(I)[Lxh;")
	public static PlayerVisibility[] values() {
		return new PlayerVisibility[] {VISIBLE, HIDDEN, MINIMAP};
	}

	public PlayerVisibility(int serialID) {
		this.serialID = serialID;
	}

	@ObfuscatedName("xh.n()I")
	public int getId() {
		return this.serialID;
	}

	@ObfuscatedName("xh.m(I)Z")
	public boolean isHidden() {
		return HIDDEN == this;
	}

	@ObfuscatedName("xh.f(I)Z")
	public boolean isNotVisible() {
		return VISIBLE != this;
	}
}
