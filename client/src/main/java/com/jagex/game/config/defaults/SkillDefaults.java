package com.jagex.game.config.defaults;

import com.jagex.core.io.Packet;
import com.jagex.game.client.PlayerSkill;
import com.jagex.game.client.PlayerSkillXPTable;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("wq")
public class SkillDefaults implements Iterable {

	@ObfuscatedName("wq.e")
	public PlayerSkill[] skills;

	@ObfuscatedName("wq.n")
	public PlayerSkillXPTable[] tables;

	public SkillDefaults(Js5 arg0) {
		this.decode(arg0.fetchFile(DefaultsGroup.SKILL.js5GroupId));
	}

	@ObfuscatedName("wq.e(S)V")
	public void method9774() {
		this.skills = null;
	}

	@ObfuscatedName("wq.n([BB)V")
	public void decode(byte[] arg0) {
		this.method9774();
		if (arg0 == null) {
			this.skills = new PlayerSkill[0];
		} else {
			this.decode(new Packet(arg0));
		}
	}

	@ObfuscatedName("wq.m(Lalw;I)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			if (var2 == 1) {
				int var3 = arg0.g1();
				int var4 = 0;
				LinkedList var5 = new LinkedList();
				for (int var6 = 0; var6 < var3; var6++) {
					int var7 = arg0.g1();
					int var8 = arg0.g2();
					int var9 = arg0.g1();
					int var10 = 0;
					PlayerSkillXPTable var11 = PlayerSkillXPTable.DEFAULT;
					byte var12 = 1;
					boolean var13 = (var9 & 0x1) != 0;
					if ((var9 & 0x2) != 0) {
						var10 = arg0.g1();
					}
					if ((var9 & 0x4) != 0) {
						var11 = this.tables[arg0.g1()];
					}
					if ((var9 & 0x8) != 0) {
						var12 = arg0.g1b();
					}
					boolean var14 = arg0.g1() == 1;
					var5.add(new PlayerSkill(var7, var8, var13, var14, var10, var11, var12));
					if (var7 > var4) {
						var4 = var7;
					}
				}
				this.skills = new PlayerSkill[var4 + 1];
				Iterator var15 = var5.iterator();
				while (var15.hasNext()) {
					PlayerSkill var16 = (PlayerSkill) var15.next();
					this.skills[var16.getId()] = var16;
				}
			} else if (var2 == 2) {
				this.tables = new PlayerSkillXPTable[arg0.g1()];
				for (int var17 = arg0.g1(); var17 != 255; var17 = arg0.g1()) {
					int[] var18 = new int[arg0.g2()];
					for (int var19 = 0; var19 < var18.length; var19++) {
						var18[var19] = arg0.g4s();
					}
					this.tables[var17] = new PlayerSkillXPTable(var18);
				}
			}
		}
	}

	@ObfuscatedName("wq.k(I)I")
	public int getSkillCount() {
		return this.skills.length;
	}

	@ObfuscatedName("wq.f(IB)Lwm;")
	public PlayerSkill getSkill(int arg0) {
		return this.skills[arg0];
	}

	public Iterator iterator() {
		return new SkillDefaultsIterator(this.skills);
	}
}
