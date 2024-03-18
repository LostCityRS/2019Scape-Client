package com.jagex.core.constants;

import deob.ObfuscatedName;

@ObfuscatedName("zu")
public class ModeAccountType implements SerializableEnum {

	@ObfuscatedName("zu.e")
	public static final ModeAccountType FREE = new ModeAccountType(0, "");

	@ObfuscatedName("zu.n")
	public static final ModeAccountType MEMBERS = new ModeAccountType(1, "");

	@ObfuscatedName("zu.m")
	public final int serialID;

	public ModeAccountType(int serialID, String arg1) {
		this.serialID = serialID;
	}

	@ObfuscatedName("zu.n()I")
	public int getId() {
		return this.serialID;
	}
}
