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

	public CameraControlMode(int index) {
		this.index = index;
	}

	@ObfuscatedName("ir.e(II)Ljd;")
	public static CameraControlMode of(int index) {
		if (SERVER.index == index) {
			return SERVER;
		} else if (CLIENT.index == index) {
			return CLIENT;
		} else {
			return null;
		}
	}
}
