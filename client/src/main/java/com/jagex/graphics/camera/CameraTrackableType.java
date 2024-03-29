package com.jagex.graphics.camera;

import deob.ObfuscatedName;

@ObfuscatedName("jl")
public class CameraTrackableType {

	@ObfuscatedName("jl.e")
	public static final CameraTrackableType PLAYER = new CameraTrackableType(0);

	@ObfuscatedName("jl.n")
	public static final CameraTrackableType NPC = new CameraTrackableType(1);

	@ObfuscatedName("jl.m")
	public int index;

	public CameraTrackableType(int index) {
		this.index = index;
	}

    @ObfuscatedName("ads.e(II)Ljl;")
    public static CameraTrackableType of(int index) {
        if (PLAYER.index == index) {
            return PLAYER;
        } else if (NPC.index == index) {
            return NPC;
        } else {
            return null;
        }
    }
}
