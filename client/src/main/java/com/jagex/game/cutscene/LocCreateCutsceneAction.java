package com.jagex.game.cutscene;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("agf")
public class LocCreateCutsceneAction extends CutsceneAction {

	@ObfuscatedName("agf.n")
	public final int field10306;

	@ObfuscatedName("agf.m")
	public final int field10307;

	@ObfuscatedName("agf.k")
	public final int field10308;

	@ObfuscatedName("agf.f")
	public final int field10309;

	@ObfuscatedName("agf.w")
	public final int field10310;

	public LocCreateCutsceneAction(Packet arg0) {
		super(arg0);
		this.field10306 = arg0.g2();
		int var2 = arg0.g4s();
		this.field10307 = var2 >>> 16;
		this.field10308 = var2 & 0xFFFF;
		this.field10309 = arg0.g1();
		this.field10310 = arg0.g1();
	}

	@ObfuscatedName("agf.n(I)V")
	public void method2890() {
		CutsceneManager.field7317[this.field10306].method2847(this.field10309, this.field10307, this.field10308, this.field10310);
	}
}
