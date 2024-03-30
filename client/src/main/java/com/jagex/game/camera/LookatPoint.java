package com.jagex.game.camera;

import com.jagex.core.io.Packet;
import com.jagex.game.shared.movement.CoordFine;
import com.jagex.graphics.camera.Camera;
import com.jagex.math.Matrix4x3;
import com.jagex.math.Vector3;
import com.jagex.math.Vector3i;
import deob.ObfuscatedName;

@ObfuscatedName("anc")
public class LookatPoint extends Lookat {

	@ObfuscatedName("anc.n")
	public final Vector3 field11847 = new Vector3(Float.NaN, Float.NaN, Float.NaN);

	@ObfuscatedName("anc.m")
	public final Vector3 field11848 = new Vector3(Float.NaN, Float.NaN, Float.NaN);

	@ObfuscatedName("anc.k")
	public final Vector3 field11849 = new Vector3();

	public LookatPoint(Camera arg0) {
		super(arg0);
	}

	@ObfuscatedName("anc.q(Lakt;B)V")
	public void method18776(CoordFine arg0) {
		this.field11848.x = arg0.x;
		this.field11848.y = arg0.y;
		this.field11848.z = arg0.z;
		if (Float.isNaN(this.field11847.x)) {
			this.field11847.setTo(this.field11848);
			this.field11849.reset();
		}
	}

	@ObfuscatedName("anc.e(FB)V")
	public void method14131(float arg0) {
		this.camera.method4807(false, arg0, this.field11847, this.camera.method4721(), this.field11848, this.field11849);
	}

	@ObfuscatedName("anc.n(I)Z")
	public boolean method14145() {
		return !Float.isNaN(this.field11847.x);
	}

	@ObfuscatedName("anc.f(Lju;Lou;IIFB)V")
	public void method14136(Vector3i arg0, Matrix4x3 arg1, int arg2, int arg3, float arg4) {
		Vector3 var6 = Vector3.create(this.camera.method4714());
		var6.x -= arg2;
		var6.z -= arg3;
		var6.y *= -1.0F;
		Vector3 var7 = Vector3.create(this.field11847);
		var7.x -= arg2;
		var7.z -= arg3;
		var7.y *= -1.0F;
		arg1.setToCameraTransform((double) var6.x, (double) var6.y, (double) var6.z, (double) var7.x, (double) var7.y, (double) var7.z, 0.0F, 1.0F, 0.0F);
		var6.release();
		var7.release();
	}

	@ObfuscatedName("anc.m(I)Lox;")
	public Vector3 method14133() {
		return Vector3.create(this.field11847);
	}

	@ObfuscatedName("anc.k(I)Lox;")
	public Vector3 method14135() {
		return Vector3.create(this.field11848);
	}

	@ObfuscatedName("anc.w(Lalw;I)V")
	public void decode(Packet buf) {
		this.field11848.decode(buf);
	}
}
