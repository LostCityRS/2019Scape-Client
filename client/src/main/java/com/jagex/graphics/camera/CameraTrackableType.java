package com.jagex.graphics.camera;

import deob.ObfuscatedName;

@ObfuscatedName("jl")
public class CameraTrackableType {

	@ObfuscatedName("jl.e")
	public static final CameraTrackableType PLAYER = new CameraTrackableType(0);

	@ObfuscatedName("jl.n")
	public static final CameraTrackableType NPC = new CameraTrackableType(1);

	@ObfuscatedName("jl.m")
	public int id;

	public CameraTrackableType(int arg0) {
		this.id = arg0;
	}

	@ObfuscatedName("ads.e(II)Ljl;")
	public static CameraTrackableType of(int arg0) {
		if (PLAYER.id == arg0) {
			return PLAYER;
		} else if (NPC.id == arg0) {
			return NPC;
		} else {
			return null;
		}
	}
}
