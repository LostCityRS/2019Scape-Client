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

	public CameraEffectType(int index) {
		this.index = index;
	}

    @ObfuscatedName("jp.e(IB)Lie;")
    public static CameraEffectType of(int index) {
        if (SHAKE.index == index) {
            return SHAKE;
        } else if (ZTILT.index == index) {
            return ZTILT;
        } else {
            return null;
        }
    }
}
