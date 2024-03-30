package com.jagex.game.camera;

import com.jagex.core.io.Packet;
import com.jagex.graphics.camera.Camera;
import com.jagex.math.*;
import deob.ObfuscatedName;

@ObfuscatedName("ani")
public class Lookat_Sub2 extends Lookat {

	@ObfuscatedName("ani.n")
	public Spline field11874 = null;

	@ObfuscatedName("ani.m")
	public PositionSpline field11875 = null;

	public Lookat_Sub2(Camera arg0) {
		super(arg0);
	}

	@ObfuscatedName("ani.e(FB)V")
	public void method14131(float arg0) {
	}

	@ObfuscatedName("ani.n(I)Z")
	public boolean method14145() {
		return this.field11874 != null && this.field11875 != null && this.field11875.method5218();
	}

	@ObfuscatedName("ani.m(I)Lox;")
	public Vector3 method14133() {
		Vector3 var1 = Vector3.create();
		double[] var2 = this.field11874.method6767(this.field11875.method16733());
		var1.x = (float) var2[0];
		var1.y = (float) var2[1];
		var1.z = (float) var2[2];
		return var1;
	}

	@ObfuscatedName("ani.q(B)[D")
	public double[] method18849() {
		return this.field11874.method6767(this.field11875.method16733());
	}

	@ObfuscatedName("ani.k(I)Lox;")
	public Vector3 method14135() {
		return this.method14133();
	}

	@ObfuscatedName("ani.f(Lju;Lou;IIFB)V")
	public void method14136(Vector3i arg0, Matrix4x3 arg1, int arg2, int arg3, float arg4) {
		double[] var6 = this.camera.method4715();
		var6[0] -= arg2;
		var6[2] -= arg3;
		double[] var7 = this.method18849();
		var7[0] -= arg2;
		var7[2] -= arg3;
		var6[1] *= -1.0D;
		var7[1] *= -1.0D;
		Vector3 var8 = Vector3.create();
		var8.x = (float) (var7[0] - var6[0]);
		var8.y = (float) (var7[1] - var6[1]);
		var8.z = (float) (var7[2] - var6[2]);
		var8.normalise();
		Quaternion var9 = new Quaternion();
		var9.setToRotation(var8, arg4);
		Vector3 var10 = Vector3.create(0.0F, 1.0F, 0.0F);
		Vector3 var11 = Vector3.cross(var8, var10);
		Vector3 var12 = Vector3.cross(var11, var8);
		var12.rotate(var9);
		arg1.setToCameraTransform(var6[0], var6[1], var6[2], var7[0], var7[1], var7[2], var12.x, var12.y, var12.z);
		var12.release();
	}

	@ObfuscatedName("ani.w(Lalw;I)V")
	public void decode(Packet buf) {
		this.field11874 = new Spline(buf);
	}
}
