package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ff")
public class BackgroundEffectsVolumeProvider implements VolumeProvider {

	// $FF: synthetic field
	public final AudioApi this$0;

	public BackgroundEffectsVolumeProvider(AudioApi arg0) {
		this.this$0 = arg0;
	}

	@ObfuscatedName("ff.e(I)F")
	public float method3084() {
		return (float) Statics.field688.themeMusicVolume1.method18763() / 255.0F;
	}
}
