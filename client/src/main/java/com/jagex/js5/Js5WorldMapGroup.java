package com.jagex.js5;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("xk")
public class Js5WorldMapGroup implements SerializableEnum {

	@ObfuscatedName("xk.e")
	public static final Js5WorldMapGroup field7968 = new Js5WorldMapGroup(0);

	@ObfuscatedName("xk.n")
	public static final Js5WorldMapGroup field7970 = new Js5WorldMapGroup(1);

	@ObfuscatedName("xk.m")
	public static final Js5WorldMapGroup field7967 = new Js5WorldMapGroup(2);

	@ObfuscatedName("xk.k")
	public static final Js5WorldMapGroup field7969 = new Js5WorldMapGroup(3);

	@ObfuscatedName("xk.f")
	public static final Js5WorldMapGroup field7971 = new Js5WorldMapGroup(4);

	@ObfuscatedName("xk.w")
	public int field7972;

	public Js5WorldMapGroup(int arg0) {
		this.field7972 = arg0;
	}

	@ObfuscatedName("xk.n()I")
	public int getId() {
		return this.field7972;
	}
}
