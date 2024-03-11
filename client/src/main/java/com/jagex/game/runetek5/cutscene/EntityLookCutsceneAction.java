package com.jagex.game.runetek5.cutscene;

import com.jagex.core.io.Packet;
import com.jagex.game.runetek5.cutscene.CutsceneAction;
import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("afn")
public class EntityLookCutsceneAction extends CutsceneAction {

	@ObfuscatedName("afn.n")
	public final int field10267;

	@ObfuscatedName("afn.m")
	public final int field10266;

	public EntityLookCutsceneAction(Packet arg0) {
		super(arg0);
		this.field10267 = arg0.g2();
		this.field10266 = arg0.g2();
	}

	@ObfuscatedName("afn.n(I)V")
	public void method2890() {
		Statics.field1721[this.field10267].method2870().method16491(this.field10266, true);
	}
}
