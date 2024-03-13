package com.jagex.graphics.camera;

import deob.ObfuscatedName;

@ObfuscatedName("ie")
public class CameraEffectType {

	@ObfuscatedName("ie.e")
	public static final CameraEffectType field2618 = new CameraEffectType(0);

	@ObfuscatedName("ie.n")
	public static final CameraEffectType field2616 = new CameraEffectType(1);

	@ObfuscatedName("ie.m")
	public final int field2617;

	public CameraEffectType(int arg0) {
		this.field2617 = arg0;
	}

    @ObfuscatedName("jp.e(IB)Lie;")
    public static CameraEffectType method5101(int arg0) {
        if (field2618.field2617 == arg0) {
            return field2618;
        } else if (field2616.field2617 == arg0) {
            return field2616;
        } else {
            return null;
        }
    }
}
