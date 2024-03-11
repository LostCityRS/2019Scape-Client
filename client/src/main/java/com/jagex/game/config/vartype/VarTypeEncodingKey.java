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
	public final int field1694;

	@ObfuscatedName("ev.z")
	public final int field1700;

	@ObfuscatedName("afy.e(I)[Lev;")
	public static VarTypeEncodingKey[] method15457() {
		return new VarTypeEncodingKey[] {LIFETIME, DOMAIN, TRANSMITLEVEL, VARNAME_HASH32, field1698, DEBUGNAME, TYPE};
	}

	public VarTypeEncodingKey(int arg0, int arg1) {
		this.field1694 = arg0;
		this.field1700 = arg1;
	}

	@ObfuscatedName("ev.n()I")
	public int getId() {
		return this.field1700;
	}
}
