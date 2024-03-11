package com.jagex.cutscene;

import com.jagex.Packet;
import com.jagex.CutsceneManager;
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
