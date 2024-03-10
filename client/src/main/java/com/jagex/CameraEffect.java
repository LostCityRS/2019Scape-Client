package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aso")
public abstract class CameraEffect extends SecondaryNode {

	@ObfuscatedName("aso.l")
	public final int field12341;

	@ObfuscatedName("ary.e(ILie;Lalw;I)Laso;")
	public static CameraEffect method19262(int arg0, CameraEffectType arg1, Packet arg2) {
		if (CameraEffectType.field2618 == arg1) {
			return new class1227(arg0, arg2);
		} else if (CameraEffectType.field2616 == arg1) {
			return new class1226(arg0, arg2);
		} else {
			return null;
		}
	}

	public CameraEffect(int arg0) {
		this.field12341 = arg0;
	}

	@ObfuscatedName("aso.n(FI)V")
	public abstract void method19431(float arg0);

	@ObfuscatedName("aso.k(Lalw;I)V")
	public abstract void method19434(Packet arg0);

	@ObfuscatedName("aso.m(Lju;Lou;Lpq;I)V")
	public abstract void method19440(class270 arg0, Matrix4x3 arg1, Matrix4x4 arg2);
}
