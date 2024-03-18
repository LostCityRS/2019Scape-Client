package com.jagex.game.client;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("hd")
public class GroupUserKind implements SerializableEnum {

	@ObfuscatedName("hd.e")
	public static final GroupUserKind field2136 = new GroupUserKind(2, 0);

	@ObfuscatedName("hd.n")
	public static final GroupUserKind field2138 = new GroupUserKind(0, 1);

	@ObfuscatedName("hd.m")
	public static final GroupUserKind field2137 = new GroupUserKind(3, 2);

	@ObfuscatedName("hd.k")
	public static final GroupUserKind field2139 = new GroupUserKind(1, 3);

	@ObfuscatedName("hd.f")
	public static final GroupUserKind field2135 = new GroupUserKind(4, 4);

	@ObfuscatedName("hd.w")
	public static final GroupUserKind field2140 = new GroupUserKind(5, 5);

	@ObfuscatedName("hd.l")
	public final int index;

	@ObfuscatedName("hd.u")
	public final int serialID;

	public GroupUserKind(int index, int serialID) {
		this.index = index;
		this.serialID = serialID;
	}

	@ObfuscatedName("hd.n()I")
	public int getId() {
		return this.serialID;
	}
}
