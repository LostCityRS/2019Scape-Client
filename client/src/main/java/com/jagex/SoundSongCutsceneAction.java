package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("agb")
public class SoundSongCutsceneAction extends CutsceneAction {

	@ObfuscatedName("agb.n")
	public final int field10318;

	@ObfuscatedName("agb.m")
	public final int field10319;

	public SoundSongCutsceneAction(Packet arg0) {
		super(arg0);
		this.field10318 = arg0.g2();
		this.field10319 = arg0.g1();
	}

	@ObfuscatedName("agb.n(I)V")
	public void method2890() {
		Statics.field1798.method3174(this.field10318);
	}

	@ObfuscatedName("agb.k(I)Z")
	public boolean method2891() {
		Statics.field1798.method3239(this.field10318, this.field10319);
		return true;
	}
}
