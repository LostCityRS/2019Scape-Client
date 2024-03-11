package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("abi")
public class TotpType implements SerializableEnum {

	@ObfuscatedName("abi.e")
	public static final TotpType field8722 = new TotpType(0, 0);

	@ObfuscatedName("abi.n")
	public static final TotpType field8723 = new TotpType(3, 1);

	@ObfuscatedName("abi.m")
	public static final TotpType field8724 = new TotpType(2, 2);

	@ObfuscatedName("abi.k")
	public static final TotpType field8726 = new TotpType(1, 3);

	@ObfuscatedName("abi.f")
	public final int field8725;

	@ObfuscatedName("abi.w")
	public final int field8727;

	public TotpType(int arg0, int arg1) {
		this.field8725 = arg0;
		this.field8727 = arg1;
	}

	@ObfuscatedName("abi.n()I")
	public int getId() {
		return this.field8727;
	}
}
