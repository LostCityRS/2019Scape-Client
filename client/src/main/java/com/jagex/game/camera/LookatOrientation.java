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
	public static int rotationX = 0;

	@ObfuscatedName("anb.f")
	public static int rotationY = 0;

	@ObfuscatedName("anb.w")
	public static int movementX = 0;

	@ObfuscatedName("anb.l")
	public static int movementZ = 0;

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

	public LookatOrientation(Camera camera) {
		super(camera);
	}

	@ObfuscatedName("anb.q(Lov;I)V")
	public void method18781(Quaternion arg0) {
		this.field11850.w = arg0.w;
		this.field11850.x = arg0.x;
		this.field11850.y = arg0.y;
		this.field11850.z = arg0.z;
		this.field11856.setTo(this.field11850);
	}

	@ObfuscatedName("anb.x(II)V")
	public void setRotationX(int arg0) {
		rotationX = arg0;
	}

	@ObfuscatedName("anb.b(IB)V")
	public void setRotationY(int arg0) {
		rotationY = arg0;
	}

	@ObfuscatedName("anb.h(IB)V")
	public void setMovementX(int arg0) {
		movementX = arg0;
	}

	@ObfuscatedName("anb.a(IB)V")
	public void setMovementZ(int arg0) {
		movementZ = arg0;
	}

	@ObfuscatedName("anb.m(I)Lox;")
	public Vector3 method14133() {
		Vector3 var1 = new Vector3(0.0F, 0.0F, 1000.0F);
		var1.rotate(Quaternion.opposite(this.field11856));
		var1.y *= -1.0F;
		var1.add(this.camera.method4714());
		return var1;
	}

	@ObfuscatedName("anb.k(I)Lox;")
	public Vector3 method14135() {
		Vector3 var1 = new Vector3(0.0F, 0.0F, 1000.0F);
		var1.rotate(Quaternion.opposite(this.field11850));
		var1.y *= -1.0F;
		var1.add(this.camera.method4714());
		return var1;
	}

	@ObfuscatedName("anb.g(IIII)V")
	public void setVector(int arg0, int arg1, int arg2) {
		Matrix4x3 var4 = new Matrix4x3();
		var4.setToCameraTransform(0.0D, 0.0D, 0.0D, (double) arg0, (double) -arg1, (double) arg2, 0.0F, 1.0F, 0.0F);
		Matrix3x3 var5 = new Matrix3x3();
		var4.getMatrix3x3(var5.data);
		Quaternion var6 = var5.method6476();
		var6.opposite();
		this.field11856.setTo(var6);
	}

	@ObfuscatedName("anb.e(FB)V")
	public void method14131(float arg0) {
		Quaternion var2 = this.method18787();
		if (rotationX != 0 || rotationY != 0) {
			Quaternion var3 = Quaternion.create();
			var3.setToRotation(1.0F, 0.0F, 0.0F, (float) ((double) rotationX * 3.141592653589793D * 2.0D) / 16384.0F);
			var2.multiply(var3);
			Vector3 var4 = Vector3.create(0.0F, 1.0F, 0.0F);
			var4.rotate(var2);
			Quaternion var5 = Quaternion.create();
			var4.normalise();
			var5.setToRotation(var4, (float) ((double) rotationY * 3.141592653589793D * 2.0D) / 16384.0F);
			var2.multiply(var5);
			this.method18781(var2);
			rotationX = 0;
			rotationY = 0;
		}
		if (this.camera.getPositionMode() != PositionMode.POINT || movementX == 0 && movementZ == 0) {
			return;
		}
		var2.opposite();
		PositionPoint var6 = (PositionPoint) this.camera.getPosition();
		CoordFine var7 = var6.method5221();
		Vector3 var8 = var7.method17853();
		Vector3 var9 = Vector3.create(0.0F, 0.0F, (float) movementZ);
		var9.rotate(var2);
		var9.y *= -1.0F;
		var8.add(var9);
		Vector3 var10 = Vector3.create((float) movementX, 0.0F, 0.0F);
		var10.rotate(var2);
		var10.y *= -1.0F;
		var8.add(var10);
		this.method18790(var8);
		var6.method16671(new CoordFine(var7.level, (int) var8.x, (int) var8.y, (int) var8.z));
		movementX = 0;
		movementZ = 0;
	}

	@ObfuscatedName("anb.i(Lox;B)V")
	public void method18790(Vector3 arg0) {
		if (field11857 != -1.0F && arg0.x < field11857) {
			arg0.x = field11857;
		}
		if (field11851 != -1.0F && arg0.x > field11851) {
			arg0.x = field11851;
		}
		if (field11858 != -1.0F && arg0.y < field11858) {
			arg0.y = field11858;
		}
		if (field11859 != -1.0F && arg0.y > field11859) {
			arg0.y = field11859;
		}
		if (field11854 != -1.0F && arg0.z < field11854) {
			arg0.z = field11854;
		}
		if (field11861 != -1.0F && arg0.z > field11861) {
			arg0.z = field11861;
		}
	}

	@ObfuscatedName("anb.j(Lox;IIIIIIB)V")
	public void setMaxDistanceClamping(Vector3 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field11857 = arg1 == -1 ? -1.0F : arg0.x - (float) (arg1 * 512);
		field11851 = arg2 == -1 ? -1.0F : (float) (arg2 * 512) + arg0.x;
		field11858 = arg5 == -1 ? -1.0F : -arg0.y - (float) (arg5 * 512);
		field11859 = arg6 == -1 ? -1.0F : (float) (arg6 * 512) + -arg0.y;
		field11854 = arg3 == -1 ? -1.0F : arg0.z - (float) (arg3 * 512);
		field11861 = arg4 == -1 ? -1.0F : (float) (arg4 * 512) + arg0.z;
	}

	@ObfuscatedName("anb.n(I)Z")
	public boolean method14145() {
		return !Float.isNaN(this.field11856.w) && this.camera.method4714() != null;
	}

	@ObfuscatedName("anb.t(I)Lov;")
	public Quaternion method18787() {
		return new Quaternion(this.field11856);
	}

	@ObfuscatedName("anb.f(Lju;Lou;IIFB)V")
	public void method14136(Vector3i arg0, Matrix4x3 arg1, int arg2, int arg3, float arg4) {
		Vector3 var6 = Vector3.create(this.camera.method4714());
		var6.x -= arg2;
		var6.z -= arg3;
		var6.y *= -1.0F;
		arg1.setToRotation(Quaternion.opposite(this.field11856));
		arg1.translate(var6);
		arg1.method6300();
		var6.release();
	}

	@ObfuscatedName("anb.w(Lalw;I)V")
	public void decode(Packet buf) {
		this.field11856.decode(buf);
	}
}
