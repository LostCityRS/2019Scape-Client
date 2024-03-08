package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aso")
public abstract class class1180 extends SecondaryNode {

	@ObfuscatedName("aso.l")
	public final int field12341;

	@ObfuscatedName("ary.e(ILie;Lalw;I)Laso;")
	public static class1180 method19262(int arg0, class247 arg1, Packet arg2) {
		if (class247.field2618 == arg1) {
			return new class1227(arg0, arg2);
		} else if (class247.field2616 == arg1) {
			return new class1226(arg0, arg2);
		} else {
			return null;
		}
	}

	public class1180(int arg0) {
		this.field12341 = arg0;
	}

	@ObfuscatedName("aso.n(FI)V")
	public abstract void method19431(float arg0);

	@ObfuscatedName("aso.k(Lalw;I)V")
	public abstract void method19434(Packet arg0);

	@ObfuscatedName("aso.m(Lju;Lou;Lpq;I)V")
	public abstract void method19440(class270 arg0, Matrix4x3 arg1, Matrix4x4 arg2);
}
