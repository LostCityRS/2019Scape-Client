package com.jagex.game.camera;

import com.jagex.core.datastruct.SecondaryNode;
import com.jagex.core.io.Packet;
import com.jagex.game.camera.effects.Shake;
import com.jagex.game.camera.effects.ZTilt;
import com.jagex.graphics.camera.CameraEffectType;
import com.jagex.math.Matrix4x3;
import com.jagex.math.Matrix4x4;
import com.jagex.math.Vector3i;
import deob.ObfuscatedName;

@ObfuscatedName("aso")
public abstract class CameraEffect extends SecondaryNode {

	@ObfuscatedName("aso.l")
	public final int id;

	@ObfuscatedName("ary.e(ILie;Lalw;I)Laso;")
	public static CameraEffect createCameraEffect(int arg0, CameraEffectType arg1, Packet buf) {
		if (CameraEffectType.SHAKE == arg1) {
			return new Shake(arg0, buf);
		} else if (CameraEffectType.ZTILT == arg1) {
			return new ZTilt(arg0, buf);
		} else {
			return null;
		}
	}

	public CameraEffect(int id) {
		this.id = id;
	}

	@ObfuscatedName("aso.n(FI)V")
	public abstract void method19431(float arg0);

	@ObfuscatedName("aso.k(Lalw;I)V")
	public abstract void decode(Packet buf);

	@ObfuscatedName("aso.m(Lju;Lou;Lpq;I)V")
	public abstract void method19440(Vector3i arg0, Matrix4x3 arg1, Matrix4x4 arg2);
}
