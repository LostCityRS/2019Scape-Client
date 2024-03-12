package com.jagex.game.camera;

import com.jagex.core.io.Packet;
import com.jagex.graphics.camera.Camera;
import com.jagex.graphics.camera.CameraTrackable;
import com.jagex.graphics.camera.CameraTrackableType;
import com.jagex.math.Matrix4x3;
import com.jagex.math.Vector3;
import com.jagex.math.Vector3i;
import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("anw")
public class LookatEntity extends Lookat {

	@ObfuscatedName("anw.n")
	public CameraTrackable field11867;

	@ObfuscatedName("anw.m")
	public final Vector3 field11863 = new Vector3();

	@ObfuscatedName("anw.k")
	public boolean field11864;

	@ObfuscatedName("anw.f")
	public final Vector3 field11865 = new Vector3(Float.NaN, Float.NaN, Float.NaN);

	@ObfuscatedName("anw.w")
	public final Vector3 field11862 = new Vector3(Float.NaN, Float.NaN, Float.NaN);

	@ObfuscatedName("anw.l")
	public final Vector3 field11866 = new Vector3();

	public LookatEntity(Camera arg0) {
		super(arg0);
	}

	@ObfuscatedName("anw.q(Ljn;Lox;ZI)V")
	public void method18816(CameraTrackable arg0, Vector3 arg1, boolean arg2) {
		this.field11867 = arg0;
		this.field11863.method6492(arg1);
		this.field11864 = arg2;
		arg0.method4667();
	}

	@ObfuscatedName("anw.x(I)V")
	public void method18815() {
		if (this.field11867 != null) {
			this.field11867 = this.field8479.method4697().method268(this.field11867.method4675(), this.field11867.method4670());
		}
	}

	@ObfuscatedName("anw.e(FB)V")
	public void method14131(float arg0) {
		if (this.field11867 != null) {
			this.field11862.method6492(this.field11867.method4667().method17853());
			this.field8479.method4807(false, arg0, this.field11865, this.field8479.method4721(), this.field11862, this.field11866);
		}
	}

	@ObfuscatedName("anw.n(I)Z")
	public boolean method14145() {
		return !Float.isNaN(this.field11865.field4308);
	}

	@ObfuscatedName("anw.f(Lju;Lou;IIFB)V")
	public void method14136(Vector3i arg0, Matrix4x3 arg1, int arg2, int arg3, float arg4) {
		Vector3 var6 = Vector3.method6484(this.field8479.method4714());
		var6.field4308 -= arg2;
		var6.field4313 -= arg3;
		var6.field4311 *= -1.0F;
		Vector3 var7 = this.method14133();
		var7.field4308 -= arg2;
		var7.field4313 -= arg3;
		var7.field4311 *= -1.0F;
		arg1.method6296((double) var6.field4308, (double) var6.field4311, (double) var6.field4313, (double) var7.field4308, (double) var7.field4311, (double) var7.field4313, 0.0F, 1.0F, 0.0F);
		var6.method6486();
		var7.method6486();
	}

	@ObfuscatedName("anw.m(I)Lox;")
	public Vector3 method14133() {
		Vector3 var1 = Vector3.method6484(this.field11865);
		Vector3 var2 = Vector3.method6484(this.field11863);
		if (this.field11864) {
			var2.method6526(this.field11867.method4668());
		}
		var1.method6497(var2);
		var2.method6486();
		return var1;
	}

	@ObfuscatedName("anw.k(I)Lox;")
	public Vector3 method14135() {
		Vector3 var1 = Vector3.method6484(this.field11862);
		Vector3 var2 = Vector3.method6484(this.field11863);
		if (this.field11864) {
			var2.method6526(this.field11867.method4668());
		}
		var1.method6497(var2);
		var2.method6486();
		return var1;
	}

	@ObfuscatedName("anw.b(I)Lox;")
	public Vector3 method18819() {
		return this.field11865;
	}

	@ObfuscatedName("anw.w(Lalw;I)V")
	public void method14132(Packet arg0) {
		CameraTrackableType var2 = Statics.method15213(arg0.g1());
		int var3 = arg0.g2();
		this.field11867 = this.field8479.method4697().method268(var2, var3);
		this.field11863.method6490(arg0);
		if (arg0.g1() == 1) {
			this.field11864 = true;
		} else {
			this.field11864 = false;
		}
	}
}
