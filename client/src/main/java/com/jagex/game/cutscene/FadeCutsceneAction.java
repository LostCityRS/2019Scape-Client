package com.jagex.game.cutscene;

import rs2.client.Client;
import com.jagex.core.io.Packet;
import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ags")
public class FadeCutsceneAction extends CutsceneAction {

	@ObfuscatedName("ags.n")
	public final int field10329;

	@ObfuscatedName("ags.m")
	public final int field10328;

	public FadeCutsceneAction(Packet arg0) {
		super(arg0);
		this.field10329 = arg0.g2();
		this.field10328 = arg0.g4s();
	}

	@ObfuscatedName("ags.n(I)V")
	public void method2890() {
		Client.field10868 = Client.field10903;
		Client.field10869 = this.field10329 + Client.field10903;
		Statics.field7950 = Client.field11002;
		Statics.field10297 = Client.field10871;
		Statics.field8521 = Client.field10872;
		Statics.field1843 = Client.field10805;
		Client.field11002 = this.field10328 >>> 24;
		Client.field10871 = this.field10328 >>> 16 & 0xFF;
		Client.field10872 = this.field10328 >>> 8 & 0xFF;
		Client.field10805 = this.field10328 & 0xFF;
	}
}
