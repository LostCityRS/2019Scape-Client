package com.jagex.graphics.runetek5.camera;

import com.jagex.*;
import com.jagex.math.Quaternion;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("a")
public class CameraManager {

	@ObfuscatedName("a.e")
	public static boolean field603 = false;

	public CameraManager() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("y.e(Lakt;I)V")
	public static void method542(CoordFine arg0) {
		Statics.field604 = new BasicCamera(client.field11034);
		Statics.field604.method4683(CameraControlMode.field2828);
		try {
			PositionPoint var1 = (PositionPoint) Statics.field604.method4688(PositionMode.field2816, false);
			LookatOrientation var2 = (LookatOrientation) Statics.field604.method4684(LookatMode.field2791, false);
			var1.method16671(arg0);
			var2.method18781(new Quaternion(0.0F, 0.0F, 0.0F));
			Statics.field604.method4695(Vector3.method6483(99999.0F, 99999.0F, 99999.0F));
			Statics.field604.method4814(Vector3.method6483(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY));
			Statics.field604.method4832(Vector3.method6483(99999.0F, 99999.0F, 99999.0F));
			Statics.field604.method4690(Vector3.method6483(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY));
		} catch (CameraException var4) {
		}
		Statics.field605 = Statics.field9182.method9086();
		Statics.field7284 = Statics.field9182.method9092();
		field603 = true;
	}

	@ObfuscatedName("hd.n(I)V")
	public static void method3913() {
		Statics.field604 = null;
		field603 = false;
	}

	@ObfuscatedName("ex.m(B)Z")
	public static boolean method2978() {
		return field603;
	}

	@ObfuscatedName("dg.k(B)V")
	public static void method2585() {
		PositionPoint var0 = (PositionPoint) Statics.field604.method4709();
		LookatOrientation var1 = (LookatOrientation) Statics.field604.method4797();
		Vector3 var2 = var0.method5219();
		Quaternion var3 = var1.method18787();
		if (client.field10986 != null) {
			int var4 = client.field10986.field2196;
			int var5 = client.field10986.field2197;
			float var6 = 1000.0F;
			float var7 = (float) (Math.atan((double) ((float) var4 / 2.0F / var6)) * 2.0D);
			float var8 = (float) (Math.atan((double) ((float) var5 / 2.0F / var6)) * 2.0D);
			try {
				Statics.field604.method4828(var7, var8);
			} catch (CameraException var21) {
			}
		}
		if (Statics.field9182.method9121()) {
			Quaternion var10 = Quaternion.method6469();
			var10.method6414(1.0F, 0.0F, 0.0F, (float) (Statics.field9182.method9092() - Statics.field7284) / 200.0F);
			var3.method6424(var10);
			Vector3 var11 = Vector3.method6483(0.0F, 1.0F, 0.0F);
			var11.method6526(var3);
			Quaternion var12 = Quaternion.method6469();
			var12.method6413(var11, (float) (Statics.field605 - Statics.field9182.method9086()) / 200.0F);
			var3.method6424(var12);
			var1.method18781(var3);
		}
		Statics.field605 = Statics.field9182.method9086();
		Statics.field7284 = Statics.field9182.method9092();
		var3.method6418();
		if (Statics.field11931.method9080(98)) {
			Vector3 var13 = Vector3.method6483(0.0F, 0.0F, 25.0F);
			var13.method6526(var3);
			var13.field4311 *= -1.0F;
			var2.method6497(var13);
		}
		if (Statics.field11931.method9080(99)) {
			Vector3 var14 = Vector3.method6483(0.0F, 0.0F, -25.0F);
			var14.method6526(var3);
			var14.field4311 *= -1.0F;
			var2.method6497(var14);
		}
		if (Statics.field11931.method9080(96)) {
			Vector3 var15 = Vector3.method6483(-25.0F, 0.0F, 0.0F);
			var15.method6526(var3);
			var15.field4311 *= -1.0F;
			var2.method6497(var15);
		}
		if (Statics.field11931.method9080(97)) {
			Vector3 var16 = Vector3.method6483(25.0F, 0.0F, 0.0F);
			var16.method6526(var3);
			var16.field4311 *= -1.0F;
			var2.method6497(var16);
		}
		CoordFine var17 = new CoordFine(0, (int) var2.field4308, (int) var2.field4311, (int) var2.field4313);
		var0.method16671(var17);
		CoordGrid var18 = client.world.method7727();
		int var19 = var18.field7426 << 9;
		int var20 = var18.field7427 << 9;
		Statics.field604.method4681(0.02F, client.world.method7744().field4540, client.world.method7793(), var19, var20);
	}
}
