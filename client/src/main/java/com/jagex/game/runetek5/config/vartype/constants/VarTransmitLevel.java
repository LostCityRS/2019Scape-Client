package com.jagex.game.runetek5.config.vartype.constants;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("ql")
public class VarTransmitLevel implements SerializableEnum {

	@ObfuscatedName("ql.e")
	public static final VarTransmitLevel field4607 = new VarTransmitLevel(0);

	@ObfuscatedName("ql.n")
	public static final VarTransmitLevel field4605 = new VarTransmitLevel(1);

	@ObfuscatedName("ql.m")
	public static final VarTransmitLevel field4604 = new VarTransmitLevel(2);

	@ObfuscatedName("ql.k")
	public final int field4606;

	@ObfuscatedName("mj.e(I)[Lql;")
	public static VarTransmitLevel[] method5925() {
		return new VarTransmitLevel[] { field4604, field4607, field4605 };
	}

	public VarTransmitLevel(int arg0) {
		this.field4606 = arg0;
	}

	@ObfuscatedName("ql.n()I")
	public int getId() {
		return this.field4606;
	}
}
