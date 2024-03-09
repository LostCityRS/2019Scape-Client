package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("fp")
public class LoginMusicVolumeProvider implements class368 {

	// $FF: synthetic field
	public final AudioApi this$0;

	public LoginMusicVolumeProvider(AudioApi arg0) {
		this.this$0 = arg0;
	}

	@ObfuscatedName("fp.e(I)F")
	public float method3084() {
		return (float) Statics.field688.themeMusicVolume4.method18763() / 255.0F;
	}
}
