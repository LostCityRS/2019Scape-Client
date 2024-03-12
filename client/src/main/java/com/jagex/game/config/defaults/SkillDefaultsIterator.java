package com.jagex.game.config.defaults;

import com.jagex.game.client.PlayerSkill;
import deob.ObfuscatedName;

import java.util.Iterator;

@ObfuscatedName("wi")
public class SkillDefaultsIterator implements Iterator {

	@ObfuscatedName("wi.e")
	public PlayerSkill[] field7760;

	@ObfuscatedName("wi.n")
	public int field7761;

	public SkillDefaultsIterator(PlayerSkill[] arg0) {
		this.field7760 = arg0;
	}

	public boolean hasNext() {
		return this.field7761 < this.field7760.length;
	}

	public Object next() {
		return this.field7760[++this.field7761 - 1];
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
