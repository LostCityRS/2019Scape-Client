package com.jagex;

import com.jagex.math.Matrix4x3;
import com.jagex.math.Matrix4x4;
import com.jagex.math.Vector3i;
import deob.ObfuscatedName;

@ObfuscatedName("atj")
public class ZTilt extends CameraEffect {

	@ObfuscatedName("atj.u")
	public float field12551 = 0.0F;

	public ZTilt(int arg0, float arg1) {
		super(arg0);
		this.field12551 = arg1;
	}

	public ZTilt(int arg0, Packet arg1) {
		super(arg0);
		this.field12551 = arg1.gFloat();
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
		arg1.method6307(0.0F, 0.0F, 1.0F, this.field12551);
	}

	@ObfuscatedName("atj.k(Lalw;I)V")
	public void method19434(Packet arg0) {
		this.field12551 = arg0.gFloat();
	}
}
