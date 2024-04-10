package com.jagex.game.cutscene;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("afj")
public class FinishCutsceneAction extends CutsceneAction {

	public FinishCutsceneAction(Packet arg0) {
		super(arg0);
	}

	@ObfuscatedName("afj.n(I)V")
	public void method2890() {
		CutsceneManager.finish(true);
	}
}
