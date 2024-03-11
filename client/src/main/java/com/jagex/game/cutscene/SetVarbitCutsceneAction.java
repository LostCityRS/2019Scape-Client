package com.jagex.game.cutscene;

import com.jagex.core.datastruct.IntWrapper;
import com.jagex.core.io.Packet;
import com.jagex.game.cutscene.CutsceneAction;
import com.jagex.game.cutscene.CutsceneManager;
import deob.ObfuscatedName;

@ObfuscatedName("agx")
public class SetVarbitCutsceneAction extends CutsceneAction {

	@ObfuscatedName("agx.n")
	public final long field10288;

	@ObfuscatedName("agx.m")
	public final int field10289;

	public SetVarbitCutsceneAction(Packet arg0, boolean arg1) {
		super(arg0);
		int var3 = arg0.g2();
		if (arg1) {
			this.field10288 = (long) var3 | 0x100000000L;
		} else {
			this.field10288 = var3;
		}
		this.field10289 = arg0.g4s();
	}

	@ObfuscatedName("agx.n(I)V")
	public void method2890() {
		IntWrapper var1 = (IntWrapper) CutsceneManager.field1718.method14495(this.field10288);
		if (var1 == null) {
			CutsceneManager.field1718.method14501(new IntWrapper(this.field10289), this.field10288);
		} else {
			var1.field11442 = this.field10289;
		}
	}
}
