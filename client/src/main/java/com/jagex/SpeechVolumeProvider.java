package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("fa")
public class SpeechVolumeProvider implements class368 {

	// $FF: synthetic field
	public final AudioApi this$0;

	public SpeechVolumeProvider(AudioApi arg0) {
		this.this$0 = arg0;
	}

	@ObfuscatedName("fa.e(I)F")
	public float method3084() {
		return (float) Statics.field688.field11565.method18763() / 255.0F;
	}
}
