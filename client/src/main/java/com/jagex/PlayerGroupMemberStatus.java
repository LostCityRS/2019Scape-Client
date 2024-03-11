package com.jagex;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("gv")
public class PlayerGroupMemberStatus implements SerializableEnum {

	@ObfuscatedName("gv.e")
	public static final PlayerGroupMemberStatus field1977 = new PlayerGroupMemberStatus(3, 0);

	@ObfuscatedName("gv.n")
	public static final PlayerGroupMemberStatus field1976 = new PlayerGroupMemberStatus(0, 1);

	@ObfuscatedName("gv.m")
	public static final PlayerGroupMemberStatus field1978 = new PlayerGroupMemberStatus(2, 2);

	@ObfuscatedName("gv.k")
	public static final PlayerGroupMemberStatus field1975 = new PlayerGroupMemberStatus(1, 3);

	@ObfuscatedName("gv.f")
	public final int field1979;

	@ObfuscatedName("gv.w")
	public final int field1980;

	@ObfuscatedName("gv.e(I)[Lgv;")
	public static PlayerGroupMemberStatus[] method3603() {
		return new PlayerGroupMemberStatus[] { field1976, field1975, field1978, field1977 };
	}

	public PlayerGroupMemberStatus(int arg0, int arg1) {
		this.field1979 = arg0;
		this.field1980 = arg1;
	}

	@ObfuscatedName("gv.n()I")
	public int getId() {
		return this.field1980;
	}
}
