package com.jagex.graphics.camera;

import com.jagex.math.Quaternion;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;

@ObfuscatedName("ue")
public class CameraMode3 {

	public CameraMode3() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("aca.e(FLox;Lov;Lox;Lox;Lox;FFFI)V")
	public static void method14933(float arg0, Vector3 arg1, Quaternion arg2, Vector3 arg3, Vector3 arg4, Vector3 arg5, float arg6, float arg7, float arg8) {
		if (arg3.isEqualTo(arg1)) {
			return;
		}
		Vector3 var9 = Vector3.create(0.0F, 0.0F, 0.0F);
		Vector3 var10 = Vector3.create(Vector3.sub(arg3, arg1));
		var10.rotate(arg2);
		Vector3 var11 = Vector3.sub(var10, var9);
		float var12 = var11.length();
		if (arg5.x == Float.POSITIVE_INFINITY || Float.isNaN(arg1.x) || var12 > arg7 || var12 < arg8) {
			arg1.setTo(arg3);
			arg4.reset();
			return;
		}
		arg2.opposite();
		Vector3 var13 = Vector3.create(1.0F, 0.0F, 0.0F);
		Vector3 var14 = Vector3.create(0.0F, 1.0F, 0.0F);
		Vector3 var15 = Vector3.create(0.0F, 0.0F, 1.0F);
		var13.rotate(arg2);
		var14.rotate(arg2);
		var15.rotate(arg2);
		Vector3 var16 = Vector3.create(Vector3.dot(var13, arg4), Vector3.dot(var14, arg4), Vector3.dot(var15, arg4));
		Vector3 var17 = Vector3.create(var16);
		Vector3 var18 = Vector3.create(arg5.x * var11.x, arg5.y * var11.y, arg5.z * var11.z);
		var17.addScaled(var18, arg0);
		var17.divide(arg6);
		Vector3 var19 = Vector3.multiply(var13, var17.x);
		var19.addScaled(var14, var17.y);
		var19.addScaled(var15, var17.z);
		arg4.setTo(var19);
		arg1.add(Vector3.multiply(arg4, arg0));
	}
}
