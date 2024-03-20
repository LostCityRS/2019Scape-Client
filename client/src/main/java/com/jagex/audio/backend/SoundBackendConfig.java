package com.jagex.audio.backend;

import com.jagex.audio.api.SoundBackendType;
import com.jagex.audio.stream.SoundRelatedType2;
import deob.ObfuscatedName;

import java.util.HashMap;

@ObfuscatedName("xf")
public class SoundBackendConfig {

	@ObfuscatedName("xf.e")
	public SoundBackendType field8052;

	@ObfuscatedName("xf.n")
	public HashMap field8053;

	public SoundBackendConfig(SoundBackendType arg0) {
		this.method10342();
		this.field8052 = arg0;
	}

	@ObfuscatedName("xf.e(I)V")
	public void method10342() {
		this.field8053 = new HashMap();
		this.field8053.put(SoundRelatedType2.field4851, 50);
	}
}
