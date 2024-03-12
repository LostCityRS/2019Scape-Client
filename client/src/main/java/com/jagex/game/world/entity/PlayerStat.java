package com.jagex.game.world.entity;

import com.jagex.game.client.PlayerSkill;
import com.jagex.core.constants.ModeAccountType;
import deob.ObfuscatedName;

@ObfuscatedName("xz")
public class PlayerStat {

	@ObfuscatedName("xz.n")
	public final PlayerSkill skill;

	@ObfuscatedName("xz.m")
	public final boolean raw;

	@ObfuscatedName("xz.k")
	public int xp = 0;

	@ObfuscatedName("xz.f")
	public int base = 1;

	@ObfuscatedName("xz.w")
	public int level = 1;

	public PlayerStat(PlayerSkill arg0, boolean arg1) {
		this.skill = arg0;
		this.raw = arg1;
	}

	@ObfuscatedName("xz.e(I)I")
	public int getXP() {
		return this.xp;
	}

	@ObfuscatedName("xz.n(Lzu;B)I")
	public int method10163(ModeAccountType arg0) {
		if (ModeAccountType.field8344 == arg0 && this.skill.isMembers() && this.skill.method9813()) {
			int var2 = this.skill.method9797();
			if (!this.raw) {
				var2 /= 10;
			}
			if (this.xp > var2) {
				return var2;
			}
		}
		return this.xp;
	}

	@ObfuscatedName("xz.m(II)V")
	public void setXP(int arg0) {
		this.xp = arg0;
		if (this.xp < 0) {
			this.xp = 0;
		} else if (this.raw && this.xp > 2000000000) {
			this.xp = 2000000000;
		} else if (!this.raw && this.xp > 200000000) {
			this.xp = 200000000;
		}
		this.calculateBaseLevel();
	}

	@ObfuscatedName("xz.k(I)I")
	public int getBaseLevel() {
		return this.base;
	}

	@ObfuscatedName("xz.f(Lzu;B)I")
	public int getBaseLevel(ModeAccountType arg0) {
		if (ModeAccountType.field8344 == arg0 && this.skill.isMembers() && this.skill.method9813()) {
			int var2 = this.skill.method9798();
			if (this.base > var2) {
				return var2;
			}
		}
		return this.base;
	}

	@ObfuscatedName("xz.w(B)I")
	public int getLevel() {
		return this.level;
	}

	@ObfuscatedName("xz.l(II)V")
	public void setLevel(int arg0) {
		this.level = arg0;
	}

	@ObfuscatedName("xz.u(I)V")
	public void calculateBaseLevel() {
		if (this.raw) {
			this.base = this.skill.getLevelRaw(this.xp);
		} else {
			this.base = this.skill.getLevel(this.xp);
		}
	}
}
