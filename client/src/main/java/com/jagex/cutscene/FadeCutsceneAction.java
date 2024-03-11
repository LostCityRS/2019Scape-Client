package com.jagex.cutscene;

import com.jagex.Packet;
import com.jagex.client;
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
		client.field10868 = client.field10903;
		client.field10869 = this.field10329 + client.field10903;
		Statics.field7950 = client.field11002;
		Statics.field10297 = client.field10871;
		Statics.field8521 = client.field10872;
		Statics.field1843 = client.field10805;
		client.field11002 = this.field10328 >>> 24;
		client.field10871 = this.field10328 >>> 16 & 0xFF;
		client.field10872 = this.field10328 >>> 8 & 0xFF;
		client.field10805 = this.field10328 & 0xFF;
	}
}
