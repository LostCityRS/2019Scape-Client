package com.jagex.game.runetek5.cutscene;

import com.jagex.core.io.Packet;
import com.jagex.game.runetek5.cutscene.CutsceneAction;
import com.jagex.game.runetek5.cutscene.CutsceneManager;
import deob.ObfuscatedName;

@ObfuscatedName("afj")
public class FinishCutsceneAction extends CutsceneAction {

	public FinishCutsceneAction(Packet arg0) {
		super(arg0);
	}

	@ObfuscatedName("afj.n(I)V")
	public void method2890() {
		CutsceneManager.method7372(true);
	}
}
