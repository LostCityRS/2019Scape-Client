package com.jagex.game.client;

import deob.ObfuscatedName;

@ObfuscatedName("dg")
public class DataType {

	@ObfuscatedName("dg.e")
	public static final DataType field1644 = new DataType(4, 1);

	@ObfuscatedName("dg.n")
	public static final DataType field1643 = new DataType(1, 2);

	@ObfuscatedName("dg.m")
	public static final DataType field1651 = new DataType(2, 4);

	@ObfuscatedName("dg.k")
	public static final DataType UNSIGNED_INT_8 = new DataType(7, 1);

	@ObfuscatedName("dg.f")
	public static final DataType UNSIGNED_INT_16 = new DataType(6, 2);

	@ObfuscatedName("dg.w")
	public static final DataType UNSIGNED_INT_24 = new DataType(5, 3);

	@ObfuscatedName("dg.l")
	public static final DataType UNSIGNED_INT_32 = new DataType(8, 4);

	@ObfuscatedName("dg.u")
	public static final DataType FLOAT_16 = new DataType(3, 2);

	@ObfuscatedName("dg.z")
	public static final DataType FLOAT_32 = new DataType(0, 4);

	@ObfuscatedName("dg.p")
	public final int index;

	@ObfuscatedName("dg.d")
	public final int field1652;

	public DataType(int index, int arg1) {
		this.index = index;
		this.field1652 = arg1;
	}
}
