package com.jagex.game.runetek5.cutscene;

import com.jagex.core.io.Packet;
import com.jagex.game.runetek5.cutscene.CutsceneAction;
import com.jagex.game.runetek5.cutscene.CutsceneEntity;
import com.jagex.game.runetek5.cutscene.CutsceneRoute;
import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("agp")
public class EntityRouteCutsceneAction extends CutsceneAction {

	@ObfuscatedName("agp.n")
	public final int field10330;

	@ObfuscatedName("agp.m")
	public final int field10331;

	@ObfuscatedName("agp.k")
	public final int field10332;

	public EntityRouteCutsceneAction(Packet arg0) {
		super(arg0);
		this.field10330 = arg0.g2();
		this.field10331 = arg0.g2();
		this.field10332 = arg0.g1();
	}

	@ObfuscatedName("agp.n(I)V")
	public void method2890() {
		CutsceneEntity var1 = Statics.field1721[this.field10330];
		CutsceneRoute var2 = Statics.field8358[this.field10331];
		var2.method2906(var1, this.field10332);
	}
}
