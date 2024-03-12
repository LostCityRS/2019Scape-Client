package com.jagex.game.client;

import deob.ObfuscatedName;

@ObfuscatedName("wd")
public class PlayerSkillXPTable {

	@ObfuscatedName("wd.e")
	public static final PlayerSkillXPTable DEFAULT = new PlayerSkillXPTable();

	@ObfuscatedName("wd.n")
	public final int[] table;

	public PlayerSkillXPTable() {
		this.table = new int[120];
		int var1 = 0;
		for (int var2 = 0; var2 < 120; var2++) {
			int var3 = var2 + 1;
			int var4 = (int) ((double) var3 + Math.pow(2.0D, (double) var3 / 7.0D) * 300.0D);
			var1 += var4;
			this.table[var2] = var1 / 4;
		}
		this.verify();
	}

	public PlayerSkillXPTable(int[] arg0) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.table = arg0;
		this.verify();
	}

	@ObfuscatedName("wd.e(B)V")
	public final void verify() {
		for (int var1 = 1; var1 < this.table.length; var1++) {
			if (this.table[var1 - 1] < 0) {
				throw new IllegalArgumentException("Negative XP at pos:" + (var1 - 1));
			}
			if (this.table[var1] < this.table[var1 - 1]) {
				throw new IllegalArgumentException("XP goes backwards at pos:" + var1);
			}
		}
	}

	@ObfuscatedName("wd.n(II)I")
	public int getLevel(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < this.table.length && arg0 >= this.table[var3]; var3++) {
			var2 = var3 + 1;
		}
		return var2;
	}

	@ObfuscatedName("wd.m(II)I")
	public int getXP(int arg0) {
		if (arg0 < 1) {
			return 0;
		} else {
			if (arg0 > this.table.length) {
				arg0 = this.table.length;
			}
			return this.table[arg0 - 1];
		}
	}
}
