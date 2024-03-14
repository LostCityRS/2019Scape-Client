package com.jagex.game.camera;

import com.jagex.core.io.Packet;
import com.jagex.game.shared.movement.CoordFine;
import com.jagex.game.world.entity.PositionMode;
import com.jagex.game.world.entity.PositionPoint;
import com.jagex.graphics.camera.Camera;
import com.jagex.math.*;
import deob.ObfuscatedName;

@ObfuscatedName("anb")
public class LookatOrientation extends Lookat {

	@ObfuscatedName("anb.n")
	public final Quaternion field11856 = new Quaternion();

	@ObfuscatedName("anb.m")
	public final Quaternion field11850 = new Quaternion(Float.NaN, Float.NaN, Float.NaN, Float.NaN);

	@ObfuscatedName("anb.k")
	public static int field11860 = 0;

	@ObfuscatedName("anb.f")
	public static int field11853 = 0;

	@ObfuscatedName("anb.w")
	public static int field11852 = 0;

	@ObfuscatedName("anb.l")
	public static int field11855 = 0;

	@ObfuscatedName("anb.u")
	public static float field11857 = -1.0F;

	@ObfuscatedName("anb.z")
	public static float field11851 = -1.0F;

	@ObfuscatedName("anb.p")
	public static float field11858 = -1.0F;

	@ObfuscatedName("anb.d")
	public static float field11859 = -1.0F;

	@ObfuscatedName("anb.c")
	public static float field11854 = -1.0F;

	@ObfuscatedName("anb.r")
	public static float field11861 = -1.0F;

	public LookatOrientation(Camera arg0) {
		super(arg0);
	}

	@ObfuscatedName("anb.q(Lov;I)V")
	public void method18781(Quaternion arg0) {
		this.field11850.field4301 = arg0.field4301;
		this.field11850.field4304 = arg0.field4304;
		this.field11850.field4305 = arg0.field4305;
		this.field11850.field4300 = arg0.field4300;
		this.field11856.method6412(this.field11850);
	}

	@ObfuscatedName("anb.x(II)V")
	public void method18789(int arg0) {
		field11860 = arg0;
	}

	@ObfuscatedName("anb.b(IB)V")
	public void method18783(int arg0) {
		field11853 = arg0;
	}

	@ObfuscatedName("anb.h(IB)V")
	public void method18788(int arg0) {
		field11852 = arg0;
	}

	@ObfuscatedName("anb.a(IB)V")
	public void method18784(int arg0) {
		field11855 = arg0;
	}

	@ObfuscatedName("anb.m(I)Lox;")
	public Vector3 method14133() {
		Vector3 var1 = new Vector3(0.0F, 0.0F, 1000.0F);
		var1.method6526(Quaternion.method6419(this.field11856));
		var1.field4311 *= -1.0F;
		var1.method6497(this.field8479.method4714());
		return var1;
	}

	@ObfuscatedName("anb.k(I)Lox;")
	public Vector3 method14135() {
		Vector3 var1 = new Vector3(0.0F, 0.0F, 1000.0F);
		var1.method6526(Quaternion.method6419(this.field11850));
		var1.field4311 *= -1.0F;
		var1.method6497(this.field8479.method4714());
		return var1;
	}

	@ObfuscatedName("anb.g(IIII)V")
	public void method18785(int arg0, int arg1, int arg2) {
		Matrix4x3 var4 = new Matrix4x3();
		var4.method6296(0.0D, 0.0D, 0.0D, (double) arg0, (double) -arg1, (double) arg2, 0.0F, 1.0F, 0.0F);
		Matrix3x3 var5 = new Matrix3x3();
		var4.method6374(var5.field4307);
		Quaternion var6 = var5.method6476();
		var6.method6418();
		this.field11856.method6412(var6);
	}

	@ObfuscatedName("anb.e(FB)V")
	public void method14131(float arg0) {
		Quaternion var2 = this.method18787();
		if (field11860 != 0 || field11853 != 0) {
			Quaternion var3 = Quaternion.method6469();
			var3.method6414(1.0F, 0.0F, 0.0F, (float) ((double) field11860 * 3.141592653589793D * 2.0D) / 16384.0F);
			var2.method6424(var3);
			Vector3 var4 = Vector3.method6483(0.0F, 1.0F, 0.0F);
			var4.method6526(var2);
			Quaternion var5 = Quaternion.method6469();
			var4.method6513();
			var5.method6413(var4, (float) ((double) field11853 * 3.141592653589793D * 2.0D) / 16384.0F);
			var2.method6424(var5);
			this.method18781(var2);
			field11860 = 0;
			field11853 = 0;
		}
		if (this.field8479.method4780() != PositionMode.field2816 || field11852 == 0 && field11855 == 0) {
			return;
		}
		var2.method6418();
		PositionPoint var6 = (PositionPoint) this.field8479.method4709();
		CoordFine var7 = var6.method5221();
		Vector3 var8 = var7.method17853();
		Vector3 var9 = Vector3.method6483(0.0F, 0.0F, (float) field11855);
		var9.method6526(var2);
		var9.field4311 *= -1.0F;
		var8.method6497(var9);
		Vector3 var10 = Vector3.method6483((float) field11852, 0.0F, 0.0F);
		var10.method6526(var2);
		var10.field4311 *= -1.0F;
		var8.method6497(var10);
		this.method18790(var8);
		var6.method16671(new CoordFine(var7.level, (int) var8.field4308, (int) var8.field4311, (int) var8.field4313));
		field11852 = 0;
		field11855 = 0;
	}

	@ObfuscatedName("anb.i(Lox;B)V")
	public void method18790(Vector3 arg0) {
		if (field11857 != -1.0F && arg0.field4308 < field11857) {
			arg0.field4308 = field11857;
		}
		if (field11851 != -1.0F && arg0.field4308 > field11851) {
			arg0.field4308 = field11851;
		}
		if (field11858 != -1.0F && arg0.field4311 < field11858) {
			arg0.field4311 = field11858;
		}
		if (field11859 != -1.0F && arg0.field4311 > field11859) {
			arg0.field4311 = field11859;
		}
		if (field11854 != -1.0F && arg0.field4313 < field11854) {
			arg0.field4313 = field11854;
		}
		if (field11861 != -1.0F && arg0.field4313 > field11861) {
			arg0.field4313 = field11861;
		}
	}

	@ObfuscatedName("anb.j(Lox;IIIIIIB)V")
	public void method18780(Vector3 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field11857 = arg1 == -1 ? -1.0F : arg0.field4308 - (float) (arg1 * 512);
		field11851 = arg2 == -1 ? -1.0F : (float) (arg2 * 512) + arg0.field4308;
		field11858 = arg5 == -1 ? -1.0F : -arg0.field4311 - (float) (arg5 * 512);
		field11859 = arg6 == -1 ? -1.0F : (float) (arg6 * 512) + -arg0.field4311;
		field11854 = arg3 == -1 ? -1.0F : arg0.field4313 - (float) (arg3 * 512);
		field11861 = arg4 == -1 ? -1.0F : (float) (arg4 * 512) + arg0.field4313;
	}

	@ObfuscatedName("anb.n(I)Z")
	public boolean method14145() {
		return !Float.isNaN(this.field11856.field4301) && this.field8479.method4714() != null;
	}

	@ObfuscatedName("anb.t(I)Lov;")
	public Quaternion method18787() {
		return new Quaternion(this.field11856);
	}

	@ObfuscatedName("anb.f(Lju;Lou;IIFB)V")
	public void method14136(Vector3i arg0, Matrix4x3 arg1, int arg2, int arg3, float arg4) {
		Vector3 var6 = Vector3.method6484(this.field8479.method4714());
		var6.field4308 -= arg2;
		var6.field4313 -= arg3;
		var6.field4311 *= -1.0F;
		arg1.method6302(Quaternion.method6419(this.field11856));
		arg1.method6314(var6);
		arg1.method6300();
		var6.method6486();
	}

	@ObfuscatedName("anb.w(Lalw;I)V")
	public void method14132(Packet arg0) {
		this.field11856.method6410(arg0);
	}
}
