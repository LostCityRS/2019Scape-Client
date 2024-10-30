package com.jagex.graphics.camera;

import deob.ObfuscatedName;

@ObfuscatedName("jd")
public class CameraControlMode {

	@ObfuscatedName("jd.e")
	public static final CameraControlMode SERVER = new CameraControlMode(0);

	@ObfuscatedName("jd.n")
	public static final CameraControlMode CLIENT = new CameraControlMode(1);

	@ObfuscatedName("jd.m")
	public int index;

	public CameraControlMode(int arg0) {
		this.index = arg0;
	}

	@ObfuscatedName("ir.e(II)Ljd;")
	public static CameraControlMode of(int arg0) {
		if (SERVER.index == arg0) {
			return SERVER;
		} else if (CLIENT.index == arg0) {
			return CLIENT;
		} else {
			return null;
		}
	}
}
