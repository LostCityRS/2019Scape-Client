package com.jagex.game.cutscene;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("agn")
public class SoundJingleCutsceneAction extends CutsceneAction {

	@ObfuscatedName("agn.n")
	public final int field10321;

	@ObfuscatedName("agn.m")
	public final int field10322;

	public SoundJingleCutsceneAction(Packet arg0) {
		super(arg0);
		this.field10321 = arg0.g2();
		this.field10322 = arg0.g1();
	}

	@ObfuscatedName("agn.n(I)V")
	public void method2890() {
		Client.audioApi.playJingle(this.field10321, this.field10322);
	}
}
