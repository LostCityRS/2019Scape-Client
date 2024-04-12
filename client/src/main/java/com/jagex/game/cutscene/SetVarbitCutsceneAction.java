package com.jagex.game.cutscene;

import com.jagex.core.datastruct.IntNode;
import com.jagex.core.io.Packet;
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
		IntNode var1 = (IntNode) CutsceneManager.varPlayerOverrides.get(this.field10288);
		if (var1 == null) {
			CutsceneManager.varPlayerOverrides.put(new IntNode(this.field10289), this.field10288);
		} else {
			var1.value = this.field10289;
		}
	}
}
