package com.jagex.game.cutscene;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("age")
public class CamMoveAlongCutsceneAction extends CutsceneAction {

	@ObfuscatedName("age.n")
	public final int field10292;

	@ObfuscatedName("age.m")
	public final int field10295;

	@ObfuscatedName("age.k")
	public final int field10293;

	@ObfuscatedName("age.f")
	public final int field10294;

	@ObfuscatedName("age.w")
	public final int field10291;

	@ObfuscatedName("age.l")
	public final int field10296;

	public CamMoveAlongCutsceneAction(Packet arg0) {
		super(arg0);
		this.field10292 = arg0.g2();
		this.field10295 = arg0.g2();
		this.field10293 = arg0.g2();
		this.field10294 = arg0.g2();
		this.field10291 = arg0.g2();
		this.field10296 = arg0.g2();
	}

	@ObfuscatedName("age.n(I)V")
	public void method2890() {
		CutsceneManager.field1714[this.field10292].method2840(0);
		CutsceneManager.field1714[this.field10295].method2840(1);
		Client.field10904 = 0;
		Client.field10909 = this.field10293 * 2;
		Client.field10976 = 0;
		Client.field10843 = this.field10291;
		Client.field10913 = this.field10296;
		Client.field10908 = 1;
		Client.field10932 = this.field10294 * 4;
		Client.cameraState = 6;
		Client.applyCameraMoveAlong();
		Client.field10877 = true;
	}
}
