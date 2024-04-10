package com.jagex.game.cutscene;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("agg")
public class EntitySayCutsceneAction extends CutsceneAction {

	@ObfuscatedName("agg.n")
	public int field10284;

	@ObfuscatedName("agg.m")
	public final String field10286;

	@ObfuscatedName("agg.k")
	public final int field10285;

	@ObfuscatedName("agg.f")
	public final int field10283;

	public EntitySayCutsceneAction(Packet arg0) {
		super(arg0);
		this.field10284 = arg0.g2();
		this.field10286 = arg0.gjstr();
		this.field10285 = arg0.g4s();
		this.field10283 = arg0.g2();
	}

	@ObfuscatedName("agg.n(I)V")
	public void method2890() {
		CutsceneManager.entities[this.field10284].getEntity().setChatLine(this.field10286, this.field10285, 0, this.field10283);
	}
}
