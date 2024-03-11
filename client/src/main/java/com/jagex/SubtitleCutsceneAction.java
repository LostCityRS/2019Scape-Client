package com.jagex;

import com.jagex.core.io.Packet;
import com.jagex.game.runetek5.cutscene.CutsceneAction;
import deob.ObfuscatedName;

@ObfuscatedName("aga")
public class SubtitleCutsceneAction extends CutsceneAction {

	@ObfuscatedName("aga.n")
	public final String field10276;

	@ObfuscatedName("aga.m")
	public final int field10277;

	public SubtitleCutsceneAction(Packet arg0) {
		super(arg0);
		this.field10276 = arg0.gjstr();
		this.field10277 = arg0.g2();
	}

	@ObfuscatedName("aga.n(I)V")
	public void method2890() {
		if (client.field10862 != -1) {
			ScriptRunner.method4654(client.field10862, this.field10276, this.field10277);
		}
	}
}
