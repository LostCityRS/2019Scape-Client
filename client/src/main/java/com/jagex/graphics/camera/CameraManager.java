package com.jagex.graphics.camera;

import com.jagex.game.camera.LookatMode;
import com.jagex.game.camera.LookatOrientation;
import com.jagex.game.client.BasicCamera;
import com.jagex.game.shared.movement.CoordFine;
import com.jagex.game.shared.movement.CoordGrid;
import com.jagex.game.world.entity.PositionMode;
import com.jagex.game.world.entity.PositionPoint;
import com.jagex.math.Quaternion;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("a")
public class CameraManager {

	@ObfuscatedName("a.e")
	public static boolean field603 = false;

	@ObfuscatedName("a.n")
	public static BasicCamera camera;

	@ObfuscatedName("a.m")
	public static int field605;

	@ObfuscatedName("vx.k")
	public static int field7284;

	public CameraManager() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("y.e(Lakt;I)V")
	public static void method542(CoordFine arg0) {
		camera = new BasicCamera(Client.cameraProvider);
		camera.setControlMode(CameraControlMode.CLIENT);
		try {
			PositionPoint var1 = (PositionPoint) camera.setPositionMode(PositionMode.POINT, false);
			LookatOrientation var2 = (LookatOrientation) camera.setLookatMode(LookatMode.ORIENTATION, false);
			var1.method16671(arg0);
			var2.method18781(new Quaternion(0.0F, 0.0F, 0.0F));
			camera.setPositionMaxSpeed(Vector3.create(99999.0F, 99999.0F, 99999.0F));
			camera.setPositionAcceleration(Vector3.create(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY));
			camera.setLookatMaxSpeed(Vector3.create(99999.0F, 99999.0F, 99999.0F));
			camera.setLookatAcceleration(Vector3.create(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY));
		} catch (CameraException var4) {
		}
		field605 = Client.mouse.getX();
		field7284 = Client.mouse.getY();
		field603 = true;
	}

	@ObfuscatedName("hd.n(I)V")
	public static void method3913() {
		camera = null;
		field603 = false;
	}

	@ObfuscatedName("ex.m(B)Z")
	public static boolean method2978() {
		return field603;
	}

	@ObfuscatedName("dg.k(B)V")
	public static void method2585() {
		PositionPoint var0 = (PositionPoint) camera.getPosition();
		LookatOrientation var1 = (LookatOrientation) camera.getLookat();
		Vector3 var2 = var0.method5219();
		Quaternion var3 = var1.method18787();
		if (Client.field10986 != null) {
			int var4 = Client.field10986.width;
			int var5 = Client.field10986.height;
			float var6 = 1000.0F;
			float var7 = (float) (Math.atan((double) ((float) var4 / 2.0F / var6)) * 2.0D);
			float var8 = (float) (Math.atan((double) ((float) var5 / 2.0F / var6)) * 2.0D);
			try {
				camera.setFieldOfView(var7, var8);
			} catch (CameraException var21) {
			}
		}
		if (Client.mouse.method9121()) {
			Quaternion var10 = Quaternion.create();
			var10.setToRotation(1.0F, 0.0F, 0.0F, (float) (Client.mouse.getY() - field7284) / 200.0F);
			var3.multiply(var10);
			Vector3 var11 = Vector3.create(0.0F, 1.0F, 0.0F);
			var11.rotate(var3);
			Quaternion var12 = Quaternion.create();
			var12.setToRotation(var11, (float) (field605 - Client.mouse.getX()) / 200.0F);
			var3.multiply(var12);
			var1.method18781(var3);
		}
		field605 = Client.mouse.getX();
		field7284 = Client.mouse.getY();
		var3.opposite();
		if (Client.keyboard.keyheld(98)) {
			Vector3 var13 = Vector3.create(0.0F, 0.0F, 25.0F);
			var13.rotate(var3);
			var13.y *= -1.0F;
			var2.add(var13);
		}
		if (Client.keyboard.keyheld(99)) {
			Vector3 var14 = Vector3.create(0.0F, 0.0F, -25.0F);
			var14.rotate(var3);
			var14.y *= -1.0F;
			var2.add(var14);
		}
		if (Client.keyboard.keyheld(96)) {
			Vector3 var15 = Vector3.create(-25.0F, 0.0F, 0.0F);
			var15.rotate(var3);
			var15.y *= -1.0F;
			var2.add(var15);
		}
		if (Client.keyboard.keyheld(97)) {
			Vector3 var16 = Vector3.create(25.0F, 0.0F, 0.0F);
			var16.rotate(var3);
			var16.y *= -1.0F;
			var2.add(var16);
		}
		CoordFine var17 = new CoordFine(0, (int) var2.x, (int) var2.y, (int) var2.z);
		var0.method16671(var17);
		CoordGrid var18 = Client.world.getBase();
		int var19 = var18.x << 9;
		int var20 = var18.z << 9;
		camera.update(0.02F, Client.world.method7744().levelHeightmap, Client.world.getSceneLevelTileFlags(), var19, var20);
	}
}
