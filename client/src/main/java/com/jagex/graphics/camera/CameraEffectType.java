package com.jagex.graphics.camera;

import deob.ObfuscatedName;

@ObfuscatedName("ie")
public class CameraEffectType {

	@ObfuscatedName("ie.e")
	public static final CameraEffectType SHAKE = new CameraEffectType(0);

	@ObfuscatedName("ie.n")
	public static final CameraEffectType ZTILT = new CameraEffectType(1);

	@ObfuscatedName("ie.m")
	public final int index;

	public CameraEffectType(int arg0) {
		this.index = arg0;
	}

	@ObfuscatedName("jp.e(IB)Lie;")
	public static CameraEffectType of(int arg0) {
		if (SHAKE.index == arg0) {
			return SHAKE;
		} else if (ZTILT.index == arg0) {
			return ZTILT;
		} else {
			return null;
		}
	}
}
