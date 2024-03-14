package com.jagex.game.cutscene;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("agw")
public class LocDelCutsceneAction extends CutsceneAction {

	@ObfuscatedName("agw.n")
	public final int field10320;

	public LocDelCutsceneAction(Packet arg0) {
		super(arg0);
		this.field10320 = arg0.g2();
	}

	@ObfuscatedName("agw.n(I)V")
	public void method2890() {
		CutsceneManager.field7317[this.field10320].method2848();
	}
}
