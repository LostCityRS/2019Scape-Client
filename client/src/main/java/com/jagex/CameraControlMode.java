package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("jd")
public class CameraControlMode {

	@ObfuscatedName("jd.e")
	public static final CameraControlMode field2829 = new CameraControlMode(0);

	@ObfuscatedName("jd.n")
	public static final CameraControlMode field2828 = new CameraControlMode(1);

	@ObfuscatedName("jd.m")
	public int field2827;

	public CameraControlMode(int arg0) {
		this.field2827 = arg0;
	}

	@ObfuscatedName("ir.e(II)Ljd;")
	public static CameraControlMode method4461(int arg0) {
		if (field2829.field2827 == arg0) {
			return field2829;
		} else if (field2828.field2827 == arg0) {
			return field2828;
		} else {
			return null;
		}
	}
}
