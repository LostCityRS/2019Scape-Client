package com.jagex.game.config.vartype;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("ev")
public class VarTypeEncodingKey implements SerializableEnum {

	@ObfuscatedName("ev.e")
	public static final VarTypeEncodingKey DEBUGNAME = new VarTypeEncodingKey(2, 1);

	@ObfuscatedName("ev.n")
	public static final VarTypeEncodingKey DOMAIN = new VarTypeEncodingKey(4, 2);

	@ObfuscatedName("ev.m")
	public static final VarTypeEncodingKey TYPE = new VarTypeEncodingKey(1, 3);

	@ObfuscatedName("ev.k")
	public static final VarTypeEncodingKey LIFETIME = new VarTypeEncodingKey(6, 4);

	@ObfuscatedName("ev.f")
	public static final VarTypeEncodingKey TRANSMITLEVEL = new VarTypeEncodingKey(3, 5);

	@ObfuscatedName("ev.w")
	public static final VarTypeEncodingKey VARNAME_HASH32 = new VarTypeEncodingKey(5, 6);

	@ObfuscatedName("ev.l")
	public static final VarTypeEncodingKey field1698 = new VarTypeEncodingKey(0, 7);

	@ObfuscatedName("ev.u")
	public final int index;

	@ObfuscatedName("ev.z")
	public final int serialID;

	@ObfuscatedName("afy.e(I)[Lev;")
	public static VarTypeEncodingKey[] values() {
		return new VarTypeEncodingKey[] {LIFETIME, DOMAIN, TRANSMITLEVEL, VARNAME_HASH32, field1698, DEBUGNAME, TYPE};
	}

	public VarTypeEncodingKey(int index, int serialID) {
		this.index = index;
		this.serialID = serialID;
	}

	@ObfuscatedName("ev.n()I")
	public int getId() {
		return this.serialID;
	}
}
