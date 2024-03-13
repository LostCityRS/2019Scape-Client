package com.jagex.game.cutscene;

import com.jagex.core.io.Packet;
import com.jagex.game.config.effectanimtype.EffectAnimType;
import com.jagex.game.config.seqtype.SeqType;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("agm")
public abstract class CutsceneActionUnused extends CutsceneAction {

	@ObfuscatedName("agm.n")
	public final int field10303;

	@ObfuscatedName("agm.m")
	public final int field10304;

	@ObfuscatedName("agm.k")
	public final int field10305;

	public CutsceneActionUnused(Packet arg0) {
		super(arg0);
		this.field10303 = arg0.g2();
		this.field10304 = arg0.g2();
		this.field10305 = arg0.g1();
	}

	@ObfuscatedName("agm.k(I)Z")
	public boolean method2891() {
		EffectAnimType var1 = (EffectAnimType) Client.field4874.list(this.field10303);
		boolean var2 = var1.method13803();
		SeqType var3 = (SeqType) Client.field8797.list(var1.anim);
		return var2 & var3.method2991();
	}
}
