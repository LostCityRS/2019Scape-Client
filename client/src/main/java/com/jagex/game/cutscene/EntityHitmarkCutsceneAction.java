package com.jagex.game.cutscene;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;
import rs2.client.Client;
import rs2.client.scene.entities.PathingEntity;

@ObfuscatedName("agi")
public class EntityHitmarkCutsceneAction extends CutsceneAction {

	@ObfuscatedName("agi.n")
	public final int field10281;

	@ObfuscatedName("agi.m")
	public final int field10279;

	@ObfuscatedName("agi.k")
	public final int field10280;

	@ObfuscatedName("agi.f")
	public final int field10282;

	@ObfuscatedName("agi.w")
	public final int field10278;

	public EntityHitmarkCutsceneAction(Packet arg0) {
		super(arg0);
		this.field10281 = arg0.g2();
		int var2 = arg0.g1();
		if ((var2 & 0x1) == 0) {
			this.field10279 = -1;
			this.field10280 = -1;
		} else {
			this.field10279 = arg0.g2();
			this.field10280 = arg0.g2();
		}
		if ((var2 & 0x2) == 0) {
			this.field10282 = -1;
			this.field10278 = -1;
		} else {
			this.field10282 = arg0.g2();
			this.field10278 = arg0.g2();
		}
		if ((var2 & 0x4) != 0) {
			int var3 = arg0.g2();
			int var4 = arg0.g2();
			int var5 = var3 * 255 / var4;
			if (var3 > 0 && var5 < 1) {
				boolean var6 = true;
			}
		}
	}

	@ObfuscatedName("agi.n(I)V")
	public void method2890() {
		PathingEntity var1 = CutsceneManager.entities[this.field10281].getEntity();
		var1.addHitmark(this.field10279, this.field10280, this.field10282, this.field10278, Client.loopCycle, 0);
	}
}
