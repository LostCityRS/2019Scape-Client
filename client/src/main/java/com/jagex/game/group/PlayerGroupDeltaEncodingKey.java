package com.jagex.game.group;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("gs")
public class PlayerGroupDeltaEncodingKey implements SerializableEnum {

	@ObfuscatedName("gs.e")
	public static final PlayerGroupDeltaEncodingKey SET_VARBIT_VALUE = new PlayerGroupDeltaEncodingKey(1, 1);

	@ObfuscatedName("gs.n")
	public static final PlayerGroupDeltaEncodingKey SET_MEMBER_RANK = new PlayerGroupDeltaEncodingKey(9, 2);

	@ObfuscatedName("gs.m")
	public static final PlayerGroupDeltaEncodingKey SET_MEMBER_OFFLINE = new PlayerGroupDeltaEncodingKey(6, 3);

	@ObfuscatedName("gs.k")
	public static final PlayerGroupDeltaEncodingKey START_GAME = new PlayerGroupDeltaEncodingKey(10, 4);

	@ObfuscatedName("gs.f")
	public static final PlayerGroupDeltaEncodingKey SET_GAME_LOADING = new PlayerGroupDeltaEncodingKey(7, 5);

	@ObfuscatedName("gs.w")
	public static final PlayerGroupDeltaEncodingKey SET_TEAM_MEMBER = new PlayerGroupDeltaEncodingKey(2, 6);

	@ObfuscatedName("gs.l")
	public static final PlayerGroupDeltaEncodingKey DELETE_BANNED = new PlayerGroupDeltaEncodingKey(11, 7);

	@ObfuscatedName("gs.u")
	public static final PlayerGroupDeltaEncodingKey ADD_BANNED = new PlayerGroupDeltaEncodingKey(4, 8);

	@ObfuscatedName("gs.z")
	public static final PlayerGroupDeltaEncodingKey SET_MEMBER_ONLINE = new PlayerGroupDeltaEncodingKey(13, 9);

	@ObfuscatedName("gs.p")
	public static final PlayerGroupDeltaEncodingKey SET_MEMBER_READY = new PlayerGroupDeltaEncodingKey(5, 10);

	@ObfuscatedName("gs.d")
	public static final PlayerGroupDeltaEncodingKey ADD_MEMBER = new PlayerGroupDeltaEncodingKey(0, 11);

	@ObfuscatedName("gs.c")
	public static final PlayerGroupDeltaEncodingKey DELETE_MEMBER = new PlayerGroupDeltaEncodingKey(8, 12);

	@ObfuscatedName("gs.r")
	public static final PlayerGroupDeltaEncodingKey SET_VAR_VALUE = new PlayerGroupDeltaEncodingKey(3, 13);

	@ObfuscatedName("gs.v")
	public static final PlayerGroupDeltaEncodingKey UPDATE_MEMBER_BASE = new PlayerGroupDeltaEncodingKey(12, 14);

	@ObfuscatedName("gs.o")
	public final int index;

	@ObfuscatedName("gs.s")
	public final int serialID;

	@ObfuscatedName("gs.e(B)[Lgs;")
	public static PlayerGroupDeltaEncodingKey[] values() {
		return new PlayerGroupDeltaEncodingKey[] {ADD_MEMBER, SET_VARBIT_VALUE, SET_TEAM_MEMBER, SET_VAR_VALUE, ADD_BANNED, SET_MEMBER_READY, SET_MEMBER_OFFLINE, SET_GAME_LOADING, DELETE_MEMBER, SET_MEMBER_RANK, START_GAME, DELETE_BANNED, UPDATE_MEMBER_BASE, SET_MEMBER_ONLINE};
	}

	public PlayerGroupDeltaEncodingKey(int index, int serialID) {
		this.index = index;
		this.serialID = serialID;
	}

	@ObfuscatedName("gs.n()I")
	public int getId() {
		return this.serialID;
	}
}
