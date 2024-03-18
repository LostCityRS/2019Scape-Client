package com.jagex.game.config.vartype.constants;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("qj")
public class VarLifetime implements SerializableEnum {

	@ObfuscatedName("qj.e")
	public static final VarLifetime TEMPORARY = new VarLifetime(0);

	@ObfuscatedName("qj.n")
	public static final VarLifetime PERMANENT = new VarLifetime(1);

	@ObfuscatedName("qj.m")
	public static final VarLifetime SERVER_PERMANENT = new VarLifetime(2);

	@ObfuscatedName("qj.k")
	public final int serialID;

	@ObfuscatedName("aw.e(B)[Lqj;")
	public static VarLifetime[] values() {
		return new VarLifetime[] {PERMANENT, TEMPORARY, SERVER_PERMANENT};
	}

	public VarLifetime(int serialID) {
		this.serialID = serialID;
	}

	@ObfuscatedName("qj.n()I")
	public int getId() {
		return this.serialID;
	}
}
