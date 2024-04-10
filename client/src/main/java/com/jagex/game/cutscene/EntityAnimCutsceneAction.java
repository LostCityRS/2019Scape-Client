package com.jagex.game.cutscene;

import com.jagex.core.io.Packet;
import com.jagex.game.config.seqtype.SeqType;
import deob.ObfuscatedName;
import rs2.client.Client;
import rs2.client.scene.entities.PathingEntity;

import java.util.Arrays;

@ObfuscatedName("agk")
public class EntityAnimCutsceneAction extends CutsceneAction {

	@ObfuscatedName("agk.n")
	public final int field10301;

	@ObfuscatedName("agk.m")
	public final int field10299;

	@ObfuscatedName("agk.k")
	public final int field10300;

	@ObfuscatedName("agk.f")
	public final int[] field10298;

	public EntityAnimCutsceneAction(Packet arg0) {
		super(arg0);
		this.field10301 = arg0.g2();
		this.field10298 = new int[4];
		this.field10299 = arg0.gSmart2or4null();
		Arrays.fill(this.field10298, 0, this.field10298.length, this.field10299);
		this.field10300 = arg0.g4s();
	}

	@ObfuscatedName("agk.n(I)V")
	public void method2890() {
		PathingEntity var1 = CutsceneManager.entities[this.field10301].getEntity();
		if (this.field10300 == 0) {
			Client.addSequences(var1, this.field10298, 0, false);
		} else {
			Client.addSequences(var1, new int[] { this.field10299 }, new int[] { 0 }, new int[] { this.field10300 });
		}
	}

	@ObfuscatedName("agk.k(I)Z")
	public boolean method2891() {
		SeqType var1 = (SeqType) Client.seqTypeList.list(this.field10299);
		return var1.method2991();
	}
}
