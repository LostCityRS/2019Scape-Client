package com.jagex.game.camera.effects;

import com.jagex.core.io.Packet;
import com.jagex.game.camera.CameraEffect;
import com.jagex.math.Matrix4x3;
import com.jagex.math.Matrix4x4;
import com.jagex.math.Vector3i;
import deob.ObfuscatedName;

@ObfuscatedName("atj")
public class ZTilt extends CameraEffect {

	@ObfuscatedName("atj.u")
	public float field12551 = 0.0F;

	public ZTilt(int id, float arg1) {
		super(id);
		this.field12551 = arg1;
	}

	public ZTilt(int id, Packet buf) {
		super(id);
		this.field12551 = buf.gFloat();
	}

	@ObfuscatedName("atj.r(FI)V")
	public void method19713(float arg0) {
		this.field12551 = arg0;
	}

	@ObfuscatedName("atj.n(FI)V")
	public void method19431(float arg0) {
	}

	@ObfuscatedName("atj.m(Lju;Lou;Lpq;I)V")
	public void method19440(Vector3i arg0, Matrix4x3 arg1, Matrix4x4 arg2) {
		arg1.rotateAroundAxis(0.0F, 0.0F, 1.0F, this.field12551);
	}

	@ObfuscatedName("atj.k(Lalw;I)V")
	public void decode(Packet buf) {
		this.field12551 = buf.gFloat();
	}
}
