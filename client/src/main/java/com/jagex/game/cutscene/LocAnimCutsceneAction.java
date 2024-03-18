package com.jagex.game.cutscene;

import com.jagex.core.io.Packet;
import com.jagex.game.config.seqtype.SeqType;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("agv")
public class LocAnimCutsceneAction extends CutsceneAction {

	@ObfuscatedName("agv.n")
	public final int field10275;

	@ObfuscatedName("agv.m")
	public final int field10274;

	public LocAnimCutsceneAction(Packet arg0) {
		super(arg0);
		this.field10275 = arg0.g2();
		this.field10274 = arg0.gSmart2or4null();
	}

	@ObfuscatedName("agv.n(I)V")
	public void method2890() {
		CutsceneLocation var1 = CutsceneManager.field7317[this.field10275];
		Client.method8895(var1.field1740, var1.field1737, var1.field1739, var1.field1736.layer, var1.field1736.id, var1.field1738, null, this.field10274, 0);
	}

	@ObfuscatedName("agv.k(I)Z")
	public boolean method2891() {
		SeqType var1 = (SeqType) Client.seqTypeList.list(this.field10274);
		return var1.method2991();
	}
}
