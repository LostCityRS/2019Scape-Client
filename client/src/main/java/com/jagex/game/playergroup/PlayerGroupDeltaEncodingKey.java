package com.jagex.game.playergroup;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("gs")
public class PlayerGroupDeltaEncodingKey implements SerializableEnum {

	@ObfuscatedName("gs.e")
	public static final PlayerGroupDeltaEncodingKey field1964 = new PlayerGroupDeltaEncodingKey(1, 1);

	@ObfuscatedName("gs.n")
	public static final PlayerGroupDeltaEncodingKey field1952 = new PlayerGroupDeltaEncodingKey(9, 2);

	@ObfuscatedName("gs.m")
	public static final PlayerGroupDeltaEncodingKey field1962 = new PlayerGroupDeltaEncodingKey(6, 3);

	@ObfuscatedName("gs.k")
	public static final PlayerGroupDeltaEncodingKey field1954 = new PlayerGroupDeltaEncodingKey(10, 4);

	@ObfuscatedName("gs.f")
	public static final PlayerGroupDeltaEncodingKey field1958 = new PlayerGroupDeltaEncodingKey(7, 5);

	@ObfuscatedName("gs.w")
	public static final PlayerGroupDeltaEncodingKey field1956 = new PlayerGroupDeltaEncodingKey(2, 6);

	@ObfuscatedName("gs.l")
	public static final PlayerGroupDeltaEncodingKey field1957 = new PlayerGroupDeltaEncodingKey(11, 7);

	@ObfuscatedName("gs.u")
	public static final PlayerGroupDeltaEncodingKey field1953 = new PlayerGroupDeltaEncodingKey(4, 8);

	@ObfuscatedName("gs.z")
	public static final PlayerGroupDeltaEncodingKey field1959 = new PlayerGroupDeltaEncodingKey(13, 9);

	@ObfuscatedName("gs.p")
	public static final PlayerGroupDeltaEncodingKey field1960 = new PlayerGroupDeltaEncodingKey(5, 10);

	@ObfuscatedName("gs.d")
	public static final PlayerGroupDeltaEncodingKey field1961 = new PlayerGroupDeltaEncodingKey(0, 11);

	@ObfuscatedName("gs.c")
	public static final PlayerGroupDeltaEncodingKey field1965 = new PlayerGroupDeltaEncodingKey(8, 12);

	@ObfuscatedName("gs.r")
	public static final PlayerGroupDeltaEncodingKey field1963 = new PlayerGroupDeltaEncodingKey(3, 13);

	@ObfuscatedName("gs.v")
	public static final PlayerGroupDeltaEncodingKey field1951 = new PlayerGroupDeltaEncodingKey(12, 14);

	@ObfuscatedName("gs.o")
	public final int field1955;

	@ObfuscatedName("gs.s")
	public final int field1966;

	@ObfuscatedName("gs.e(B)[Lgs;")
	public static PlayerGroupDeltaEncodingKey[] method3580() {
		return new PlayerGroupDeltaEncodingKey[] { field1961, field1964, field1956, field1963, field1953, field1960, field1962, field1958, field1965, field1952, field1954, field1957, field1951, field1959 };
	}

	public PlayerGroupDeltaEncodingKey(int arg0, int arg1) {
		this.field1955 = arg0;
		this.field1966 = arg1;
	}

	@ObfuscatedName("gs.n()I")
	public int getId() {
		return this.field1966;
	}
}
