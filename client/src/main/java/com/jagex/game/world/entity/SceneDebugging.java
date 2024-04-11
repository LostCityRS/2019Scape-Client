package com.jagex.game.world.entity;

import deob.ObfuscatedName;

@ObfuscatedName("aci")
public class SceneDebugging {

	public SceneDebugging() {
		System.nanoTime();
	}

	@ObfuscatedName("aci.e(I)J")
	public long time() {
		return System.nanoTime();
	}
}
