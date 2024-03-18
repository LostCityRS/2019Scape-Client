package com.jagex.game.config.vartype.constants;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("ql")
public class VarTransmitLevel implements SerializableEnum {

	@ObfuscatedName("ql.e")
	public static final VarTransmitLevel NEVER = new VarTransmitLevel(0);

	@ObfuscatedName("ql.n")
	public static final VarTransmitLevel ON_SET_DIFFERENT = new VarTransmitLevel(1);

	@ObfuscatedName("ql.m")
	public static final VarTransmitLevel ON_SET_ALWAYS = new VarTransmitLevel(2);

	@ObfuscatedName("ql.k")
	public final int serialID;

	@ObfuscatedName("mj.e(I)[Lql;")
	public static VarTransmitLevel[] values() {
		return new VarTransmitLevel[] {ON_SET_ALWAYS, NEVER, ON_SET_DIFFERENT};
	}

	public VarTransmitLevel(int serialID) {
		this.serialID = serialID;
	}

	@ObfuscatedName("ql.n()I")
	public int getId() {
		return this.serialID;
	}
}
