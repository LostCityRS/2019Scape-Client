package com.jagex.game.world.entity;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("xh")
public class PlayerGender implements SerializableEnum {

	@ObfuscatedName("xh.e")
	public static final PlayerGender field7918 = new PlayerGender(0);

	@ObfuscatedName("xh.n")
	public static final PlayerGender field7920 = new PlayerGender(1);

	@ObfuscatedName("xh.m")
	public static final PlayerGender field7917 = new PlayerGender(2);

	@ObfuscatedName("xh.k")
	public final int field7919;

	@ObfuscatedName("xh.e(I)[Lxh;")
	public static PlayerGender[] method10193() {
		return new PlayerGender[] { field7918, field7920, field7917 };
	}

	public PlayerGender(int arg0) {
		this.field7919 = arg0;
	}

	@ObfuscatedName("xh.n()I")
	public int getId() {
		return this.field7919;
	}

	@ObfuscatedName("xh.m(I)Z")
	public boolean method10191() {
		return field7920 == this;
	}

	@ObfuscatedName("xh.f(I)Z")
	public boolean method10195() {
		return field7918 != this;
	}
}
