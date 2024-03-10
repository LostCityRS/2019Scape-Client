package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("fv")
public class MainEffectsVolumeProvider implements VolumeProvider {

	// $FF: synthetic field
	public final AudioApi this$0;

	public MainEffectsVolumeProvider(AudioApi arg0) {
		this.this$0 = arg0;
	}

	@ObfuscatedName("fv.e(I)F")
	public float method3084() {
		return (float) Statics.field688.themeMusicVolume.method18763() / 255.0F;
	}
}
