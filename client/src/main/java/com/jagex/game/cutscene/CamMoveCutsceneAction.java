package com.jagex.game.cutscene;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("aft")
public class CamMoveCutsceneAction extends CutsceneAction {

	@ObfuscatedName("aft.n")
	public final int field10264;

	@ObfuscatedName("aft.m")
	public final int field10262;

	@ObfuscatedName("aft.k")
	public final int field10263;

	@ObfuscatedName("aft.f")
	public final int field10261;

	@ObfuscatedName("aft.w")
	public final int field10265;

	public CamMoveCutsceneAction(Packet arg0) {
		super(arg0);
		this.field10264 = arg0.g2();
		this.field10262 = arg0.g2();
		this.field10263 = arg0.g2();
		this.field10261 = arg0.g2();
		this.field10265 = arg0.g2();
	}

	@ObfuscatedName("aft.n(I)V")
	public void method2890() {
		Client.cameraMoveTo(this.field10264, this.field10263, this.field10262, 100, 100, false);
		Client.cameraForceAngle(this.field10261, this.field10265, 0);
		Client.field10877 = true;
	}
}
