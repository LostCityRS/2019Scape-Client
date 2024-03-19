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
	public static BasicCamera field604;

	@ObfuscatedName("a.m")
	public static int field605;

	@ObfuscatedName("vx.k")
	public static int field7284;

	public CameraManager() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("y.e(Lakt;I)V")
	public static void method542(CoordFine arg0) {
		field604 = new BasicCamera(Client.field11034);
		field604.method4683(CameraControlMode.field2828);
		try {
			PositionPoint var1 = (PositionPoint) field604.method4688(PositionMode.field2816, false);
			LookatOrientation var2 = (LookatOrientation) field604.method4684(LookatMode.field2791, false);
			var1.method16671(arg0);
			var2.method18781(new Quaternion(0.0F, 0.0F, 0.0F));
			field604.method4695(Vector3.create(99999.0F, 99999.0F, 99999.0F));
			field604.method4814(Vector3.create(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY));
			field604.method4832(Vector3.create(99999.0F, 99999.0F, 99999.0F));
			field604.method4690(Vector3.create(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY));
		} catch (CameraException var4) {
		}
		field605 = Client.mouse.method9086();
		field7284 = Client.mouse.method9092();
		field603 = true;
	}

	@ObfuscatedName("hd.n(I)V")
	public static void method3913() {
		field604 = null;
		field603 = false;
	}

	@ObfuscatedName("ex.m(B)Z")
	public static boolean method2978() {
		return field603;
	}

	@ObfuscatedName("dg.k(B)V")
	public static void method2585() {
		PositionPoint var0 = (PositionPoint) field604.method4709();
		LookatOrientation var1 = (LookatOrientation) field604.method4797();
		Vector3 var2 = var0.method5219();
		Quaternion var3 = var1.method18787();
		if (Client.field10986 != null) {
			int var4 = Client.field10986.field2196;
			int var5 = Client.field10986.field2197;
			float var6 = 1000.0F;
			float var7 = (float) (Math.atan((double) ((float) var4 / 2.0F / var6)) * 2.0D);
			float var8 = (float) (Math.atan((double) ((float) var5 / 2.0F / var6)) * 2.0D);
			try {
				field604.method4828(var7, var8);
			} catch (CameraException var21) {
			}
		}
		if (Client.mouse.method9121()) {
			Quaternion var10 = Quaternion.method6469();
			var10.method6414(1.0F, 0.0F, 0.0F, (float) (Client.mouse.method9092() - field7284) / 200.0F);
			var3.method6424(var10);
			Vector3 var11 = Vector3.create(0.0F, 1.0F, 0.0F);
			var11.method6526(var3);
			Quaternion var12 = Quaternion.method6469();
			var12.method6413(var11, (float) (field605 - Client.mouse.method9086()) / 200.0F);
			var3.method6424(var12);
			var1.method18781(var3);
		}
		field605 = Client.mouse.method9086();
		field7284 = Client.mouse.method9092();
		var3.method6418();
		if (Client.keyboard.method9080(98)) {
			Vector3 var13 = Vector3.create(0.0F, 0.0F, 25.0F);
			var13.method6526(var3);
			var13.field4311 *= -1.0F;
			var2.method6497(var13);
		}
		if (Client.keyboard.method9080(99)) {
			Vector3 var14 = Vector3.create(0.0F, 0.0F, -25.0F);
			var14.method6526(var3);
			var14.field4311 *= -1.0F;
			var2.method6497(var14);
		}
		if (Client.keyboard.method9080(96)) {
			Vector3 var15 = Vector3.create(-25.0F, 0.0F, 0.0F);
			var15.method6526(var3);
			var15.field4311 *= -1.0F;
			var2.method6497(var15);
		}
		if (Client.keyboard.method9080(97)) {
			Vector3 var16 = Vector3.create(25.0F, 0.0F, 0.0F);
			var16.method6526(var3);
			var16.field4311 *= -1.0F;
			var2.method6497(var16);
		}
		CoordFine var17 = new CoordFine(0, (int) var2.field4308, (int) var2.field4311, (int) var2.field4313);
		var0.method16671(var17);
		CoordGrid var18 = Client.world.method7727();
		int var19 = var18.x << 9;
		int var20 = var18.z << 9;
		field604.method4681(0.02F, Client.world.method7744().levelHeightmap, Client.world.method7793(), var19, var20);
	}
}
