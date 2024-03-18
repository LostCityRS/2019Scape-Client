package com.jagex.game.group;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("gv")
public class PlayerGroupMemberStatus implements SerializableEnum {

	@ObfuscatedName("gv.e")
	public static final PlayerGroupMemberStatus TELEPORTED = new PlayerGroupMemberStatus(3, 0);

	@ObfuscatedName("gv.n")
	public static final PlayerGroupMemberStatus NOT_READY = new PlayerGroupMemberStatus(0, 1);

	@ObfuscatedName("gv.m")
	public static final PlayerGroupMemberStatus GAME_LOADING = new PlayerGroupMemberStatus(2, 2);

	@ObfuscatedName("gv.k")
	public static final PlayerGroupMemberStatus READY = new PlayerGroupMemberStatus(1, 3);

	@ObfuscatedName("gv.f")
	public final int index;

	@ObfuscatedName("gv.w")
	public final int serialID;

	@ObfuscatedName("gv.e(I)[Lgv;")
	public static PlayerGroupMemberStatus[] values() {
		return new PlayerGroupMemberStatus[] {NOT_READY, READY, GAME_LOADING, TELEPORTED};
	}

	public PlayerGroupMemberStatus(int index, int serialID) {
		this.index = index;
		this.serialID = serialID;
	}

	@ObfuscatedName("gv.n()I")
	public int getId() {
		return this.serialID;
	}
}
