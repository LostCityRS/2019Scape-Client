package com.jagex.game.client;

import deob.ObfuscatedName;

@ObfuscatedName("wm")
public class PlayerSkill {

	@ObfuscatedName("wm.e")
	public final int id;

	@ObfuscatedName("wm.n")
	public final int maxLevel;

	@ObfuscatedName("wm.m")
	public boolean members;

	@ObfuscatedName("wm.k")
	public final int cappedXP;

	@ObfuscatedName("wm.f")
	public final int cappedLevel;

	@ObfuscatedName("wm.w")
	public final PlayerSkillXPTable table;

	@ObfuscatedName("wm.l")
	public final int baseLevel;

	public PlayerSkill(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, PlayerSkillXPTable arg5, int arg6) {
		this.id = arg0;
		this.maxLevel = arg1;
		this.members = arg2;
		this.table = arg5;
		this.baseLevel = arg6;
		if (arg2) {
			this.cappedLevel = arg4;
			this.cappedXP = this.getXPRaw(arg4);
		} else {
			this.cappedLevel = -1;
			this.cappedXP = -1;
		}
	}

	@ObfuscatedName("wm.e(I)I")
	public int getId() {
		return this.id;
	}

	@ObfuscatedName("wm.n(B)Z")
	public boolean isMembers() {
		return this.members;
	}

	@ObfuscatedName("wm.m(I)I")
	public int getCappedXP() {
		return this.cappedXP;
	}

	@ObfuscatedName("wm.k(I)I")
	public int getCappedLevel() {
		return this.cappedLevel;
	}

	@ObfuscatedName("wm.f(I)Z")
	public boolean isCapped() {
		return this.cappedXP != -1;
	}

	@ObfuscatedName("wm.w(IB)I")
	public int getLevel(int arg0) {
		int var2 = this.table.getLevel(arg0) + this.baseLevel;
		return var2 > this.maxLevel ? this.maxLevel : var2;
	}

	@ObfuscatedName("wm.l(IB)I")
	public int getLevelRaw(int arg0) {
		int var2 = arg0 / 10;
		return this.getLevel(var2);
	}

	@ObfuscatedName("wm.u(IB)I")
	public int getXP(int arg0) {
		if (arg0 > this.maxLevel) {
			arg0 = this.maxLevel;
		}
		return this.table.getXP(arg0 - this.baseLevel);
	}

	@ObfuscatedName("wm.z(II)I")
	public int getXPRaw(int arg0) {
		return this.getXP(arg0) * 10;
	}
}
