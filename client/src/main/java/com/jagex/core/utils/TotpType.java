package com.jagex.core.utils;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("abi")
public class TotpType implements SerializableEnum {

	@ObfuscatedName("abi.e")
	public static final TotpType AUTH_FOUND = new TotpType(0, 0);

	@ObfuscatedName("abi.n")
	public static final TotpType AUTH_DONT_TRUST = new TotpType(3, 1);

	@ObfuscatedName("abi.m")
	public static final TotpType AUTH_NOT_FOUND = new TotpType(2, 2);

	@ObfuscatedName("abi.k")
	public static final TotpType AUTH_TRUST = new TotpType(1, 3);

	@ObfuscatedName("abi.f")
	public final int index;

	@ObfuscatedName("abi.w")
	public final int serialID;

	public TotpType(int index, int serialID) {
		this.index = index;
		this.serialID = serialID;
	}

	@ObfuscatedName("abi.n()I")
	public int getId() {
		return this.serialID;
	}
}
