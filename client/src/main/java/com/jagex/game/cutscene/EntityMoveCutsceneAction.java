package com.jagex.game.cutscene;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("afp")
public class EntityMoveCutsceneAction extends CutsceneAction {

	@ObfuscatedName("afp.n")
	public final int field10270;

	@ObfuscatedName("afp.m")
	public final int field10269;

	@ObfuscatedName("afp.k")
	public final int field10273;

	@ObfuscatedName("afp.f")
	public final int field10271;

	@ObfuscatedName("afp.w")
	public final int field10272;

	public EntityMoveCutsceneAction(Packet arg0) {
		super(arg0);
		this.field10270 = arg0.g2();
		int var2 = arg0.g4s();
		this.field10269 = var2 >>> 16;
		this.field10273 = var2 & 0xFFFF;
		this.field10271 = arg0.g1();
		this.field10272 = arg0.gSmart1or2s();
	}

	@ObfuscatedName("afp.n(I)V")
	public void method2890() {
		CutsceneManager.entities[this.field10270].method2867(this.field10269, this.field10273, this.field10271, this.field10272);
	}
}
