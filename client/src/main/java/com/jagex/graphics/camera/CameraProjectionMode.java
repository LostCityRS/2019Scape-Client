package com.jagex.graphics.camera;

import deob.ObfuscatedName;

@ObfuscatedName("jf")
public class CameraProjectionMode {

	@ObfuscatedName("jf.e")
	public static final CameraProjectionMode field2831 = new CameraProjectionMode(0);

	@ObfuscatedName("jf.n")
	public static final CameraProjectionMode field2833 = new CameraProjectionMode(1);

	@ObfuscatedName("jf.m")
	public static final CameraProjectionMode field2832 = new CameraProjectionMode(2);

	@ObfuscatedName("jf.k")
	public int field2834;

	public CameraProjectionMode(int arg0) {
		this.field2834 = arg0;
	}

	@ObfuscatedName("aiu.e(II)Ljf;")
	public static CameraProjectionMode method16906(int arg0) {
		if (field2831.field2834 == arg0) {
			return field2831;
		} else if (field2833.field2834 == arg0) {
			return field2833;
		} else if (field2832.field2834 == arg0) {
			return field2832;
		} else {
			return null;
		}
	}
}
