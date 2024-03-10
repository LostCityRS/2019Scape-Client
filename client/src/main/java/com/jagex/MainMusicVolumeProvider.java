package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("fc")
public class MainMusicVolumeProvider implements VolumeProvider {

	// $FF: synthetic field
	public final AudioApi this$0;

	public MainMusicVolumeProvider(AudioApi arg0) {
		this.this$0 = arg0;
	}

	@ObfuscatedName("fc.e(I)F")
	public float method3084() {
		return (float) Statics.field688.themeMusicVolume3.method18763() / 255.0F;
	}
}
