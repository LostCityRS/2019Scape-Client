package com.jagex.cutscene;

import com.jagex.Packet;
import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("aqm")
public class EntitySpotAnimCutsceneAction extends class874 {

	@ObfuscatedName("aqm.f")
	public final int field12045;

	@ObfuscatedName("aqm.w")
	public final int field12046;

	@ObfuscatedName("aqm.l")
	public final int field12047;

	public EntitySpotAnimCutsceneAction(Packet arg0) {
		super(arg0);
		this.field12045 = arg0.g2();
		this.field12046 = arg0.g1();
		this.field12047 = arg0.g2();
	}

	@ObfuscatedName("aqm.n(I)V")
	public void method2890() {
		Statics.field1721[this.field12045].method2870().method16563(this.field10303, this.field10305 << 16, this.field10304, this.field12047, false, this.field12046);
	}
}
