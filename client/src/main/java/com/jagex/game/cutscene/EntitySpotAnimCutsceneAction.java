package com.jagex.game.cutscene;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("aqm")
public class EntitySpotAnimCutsceneAction extends CutsceneAction_Sub1 {

	@ObfuscatedName("aqm.f")
	public final int field12045;

	@ObfuscatedName("aqm.w")
	public final int field12046;

	@ObfuscatedName("aqm.l")
	public final int field12047;

	public EntitySpotAnimCutsceneAction(Packet arg0) {
		super(arg0);
		this.field12045 = arg0.g2();
		this.field12046 = arg0.g1();
		this.field12047 = arg0.g2();
	}

	@ObfuscatedName("aqm.n(I)V")
	public void method2890() {
		CutsceneManager.entities[this.field12045].getEntity().addSpotAnimation(this.field10303, this.field10305 << 16, this.field10304, this.field12047, false, this.field12046);
	}
}
