package com.jagex.game.runetek5.config.defaults;

import com.jagex.core.io.Packet;
import com.jagex.Skill;
import com.jagex.SkillExperienceTable;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

import java.util.Iterator;
import java.util.LinkedList;

@ObfuscatedName("wq")
public class SkillDefaults implements Iterable {

	@ObfuscatedName("wq.e")
	public Skill[] field7650;

	@ObfuscatedName("wq.n")
	public SkillExperienceTable[] field7649;

	public SkillDefaults(Js5 arg0) {
		this.method9777(arg0.method6894(DefaultsGroup.field7709.field7708));
	}

	@ObfuscatedName("wq.e(S)V")
	public void method9774() {
		this.field7650 = null;
	}

	@ObfuscatedName("wq.n([BB)V")
	public void method9777(byte[] arg0) {
		this.method9774();
		if (arg0 == null) {
			this.field7650 = new Skill[0];
		} else {
			this.method9776(new Packet(arg0));
		}
	}

	@ObfuscatedName("wq.m(Lalw;I)V")
	public void method9776(Packet arg0) {
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
					SkillExperienceTable var11 = SkillExperienceTable.field7699;
					byte var12 = 1;
					boolean var13 = (var9 & 0x1) != 0;
					if ((var9 & 0x2) != 0) {
						var10 = arg0.g1();
					}
					if ((var9 & 0x4) != 0) {
						var11 = this.field7649[arg0.g1()];
					}
					if ((var9 & 0x8) != 0) {
						var12 = arg0.g1b();
					}
					boolean var14 = arg0.g1() == 1;
					var5.add(new Skill(var7, var8, var13, var14, var10, var11, var12));
					if (var7 > var4) {
						var4 = var7;
					}
				}
				this.field7650 = new Skill[var4 + 1];
				Iterator var15 = var5.iterator();
				while (var15.hasNext()) {
					Skill var16 = (Skill) var15.next();
					this.field7650[var16.method9809()] = var16;
				}
			} else if (var2 == 2) {
				this.field7649 = new SkillExperienceTable[arg0.g1()];
				for (int var17 = arg0.g1(); var17 != 255; var17 = arg0.g1()) {
					int[] var18 = new int[arg0.g2()];
					for (int var19 = 0; var19 < var18.length; var19++) {
						var18[var19] = arg0.g4s();
					}
					this.field7649[var17] = new SkillExperienceTable(var18);
				}
			}
		}
	}

	@ObfuscatedName("wq.k(I)I")
	public int method9784() {
		return this.field7650.length;
	}

	@ObfuscatedName("wq.f(IB)Lwm;")
	public Skill method9778(int arg0) {
		return this.field7650[arg0];
	}

	public Iterator iterator() {
		return new SkillDefaultsIterator(this.field7650);
	}
}
