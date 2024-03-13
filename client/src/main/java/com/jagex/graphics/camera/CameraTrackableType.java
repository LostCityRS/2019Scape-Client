package com.jagex.graphics.camera;

import deob.ObfuscatedName;

@ObfuscatedName("jl")
public class CameraTrackableType {

	@ObfuscatedName("jl.e")
	public static final CameraTrackableType field2838 = new CameraTrackableType(0);

	@ObfuscatedName("jl.n")
	public static final CameraTrackableType field2839 = new CameraTrackableType(1);

	@ObfuscatedName("jl.m")
	public int field2840;

	public CameraTrackableType(int arg0) {
		this.field2840 = arg0;
	}

    @ObfuscatedName("ads.e(II)Ljl;")
    public static CameraTrackableType method15213(int arg0) {
        if (field2838.field2840 == arg0) {
            return field2838;
        } else if (field2839.field2840 == arg0) {
            return field2839;
        } else {
            return null;
        }
    }
}
