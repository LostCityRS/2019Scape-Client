package com.jagex.game.world.entity;

import com.jagex.core.constants.ModeAccountType;
import com.jagex.game.client.PlayerSkill;
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
	public int xpLevel = 1;

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
	public int getCappedXP(ModeAccountType arg0) {
		if (ModeAccountType.FREE == arg0 && this.skill.isMembers() && this.skill.isCapped()) {
			int var2 = this.skill.getCappedXP();
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
		this.recalculateXPLevel();
	}

	@ObfuscatedName("xz.k(I)I")
	public int getXPLevel() {
		return this.xpLevel;
	}

	@ObfuscatedName("xz.f(Lzu;B)I")
	public int getCappedXPLevel(ModeAccountType arg0) {
		if (ModeAccountType.FREE == arg0 && this.skill.isMembers() && this.skill.isCapped()) {
			int var2 = this.skill.getCappedLevel();
			if (this.xpLevel > var2) {
				return var2;
			}
		}
		return this.xpLevel;
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
	public void recalculateXPLevel() {
		if (this.raw) {
			this.xpLevel = this.skill.getLevelRaw(this.xp);
		} else {
			this.xpLevel = this.skill.getLevel(this.xp);
		}
	}
}
