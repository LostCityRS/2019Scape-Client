package com.jagex.core.constants;

import deob.ObfuscatedName;

@ObfuscatedName("zu")
public class ModeAccountType implements SerializableEnum {

	@ObfuscatedName("zu.e")
	public static final ModeAccountType field8344 = new ModeAccountType(0, "");

	@ObfuscatedName("zu.n")
	public static final ModeAccountType field8343 = new ModeAccountType(1, "");

	@ObfuscatedName("zu.m")
	public final int field8342;

	public ModeAccountType(int arg0, String arg1) {
		this.field8342 = arg0;
	}

	@ObfuscatedName("zu.n()I")
	public int getId() {
		return this.field8342;
	}
}
