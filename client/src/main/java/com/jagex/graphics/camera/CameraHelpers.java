package com.jagex.graphics.camera;

import com.jagex.math.Quaternion;
import com.jagex.math.Vector3;
import deob.ObfuscatedName;

@ObfuscatedName("zy")
public class CameraHelpers {

	public CameraHelpers() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("agm.e(Lov;B)F")
	public static float method16445(Quaternion arg0) {
		Vector3 var1 = Vector3.create(0.0F, 0.0F, 1.0F);
		var1.rotate(arg0);
		double var2 = 1.5707963267948966D - Math.acos((double) var1.y);
		var1.release();
		return (float) var2;
	}

	@ObfuscatedName("uh.n(Lov;I)I")
	public static int method9198(Quaternion arg0) {
		Vector3 var1 = Vector3.create(0.0F, 0.0F, 1.0F);
		var1.rotate(arg0);
		double var2 = 1.5707963267948966D - Math.acos((double) var1.y);
		var1.release();
		if (var2 < 0.0D) {
			var2 = var2 + 3.141592653589793D + 3.141592653589793D;
		}
		return (int) (var2 / 6.283185307179586D * 16384.0D) & 0x3FFF;
	}

	@ObfuscatedName("vb.m(FFI)F")
	public static float method9272(float arg0, float arg1) {
		double var2 = Math.atan2((double) arg0, (double) arg1);
		if (var2 < 0.0D) {
			var2 = var2 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) var2;
	}

	@ObfuscatedName("ib.k(Lov;I)F")
	public static float method4498(Quaternion arg0) {
		Vector3 var1 = Vector3.create(0.0F, 0.0F, 1.0F);
		var1.rotate(arg0);
		double var2 = Math.atan2((double) var1.x, (double) var1.z);
		var1.release();
		if (var2 < 0.0D) {
			var2 = var2 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) var2;
	}

	@ObfuscatedName("dn.f(Lov;I)I")
	public static int method2041(Quaternion arg0) {
		Vector3 var1 = Vector3.create(0.0F, 0.0F, 1.0F);
		var1.rotate(arg0);
		double var2 = Math.atan2((double) var1.x, (double) var1.z);
		var1.release();
		if (var2 < 0.0D) {
			var2 = var2 + 3.141592653589793D + 3.141592653589793D;
		}
		return (int) (var2 / 6.283185307179586D * 16384.0D) & 0x3FFF;
	}
}
