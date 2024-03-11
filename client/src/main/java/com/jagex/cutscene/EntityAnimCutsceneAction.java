package com.jagex.cutscene;

import com.jagex.Packet;
import com.jagex.PathingEntity;
import com.jagex.SeqType;
import com.jagex.client;
import deob.ObfuscatedName;
import deob.Statics;

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
		PathingEntity var1 = Statics.field1721[this.field10301].method2870();
		if (this.field10300 == 0) {
			client.method9423(var1, this.field10298, 0, false);
		} else {
			client.method16758(var1, new int[] { this.field10299 }, new int[] { 0 }, new int[] { this.field10300 });
		}
	}

	@ObfuscatedName("agk.k(I)Z")
	public boolean method2891() {
		SeqType var1 = (SeqType) Statics.field8797.get(this.field10299);
		return var1.method2991();
	}
}
