package com.jagex.game.camera;

import com.jagex.core.io.Packet;
import com.jagex.graphics.camera.Camera;
import com.jagex.math.Matrix4x3;
import com.jagex.math.Vector3;
import com.jagex.math.Vector3i;
import deob.ObfuscatedName;

@ObfuscatedName("aax")
public abstract class Lookat {

	@ObfuscatedName("aax.e")
	public final Camera camera;

	public Lookat(Camera camera) {
		this.camera = camera;
	}

	@ObfuscatedName("aax.e(FB)V")
	public abstract void method14131(float arg0);

	@ObfuscatedName("aax.w(Lalw;I)V")
	public abstract void decode(Packet buf);

	@ObfuscatedName("aax.m(I)Lox;")
	public abstract Vector3 method14133();

	@ObfuscatedName("aax.k(I)Lox;")
	public abstract Vector3 method14135();

	@ObfuscatedName("aax.f(Lju;Lou;IIFB)V")
	public abstract void method14136(Vector3i arg0, Matrix4x3 arg1, int arg2, int arg3, float arg4);

	@ObfuscatedName("aax.n(I)Z")
	public abstract boolean method14145();
}
