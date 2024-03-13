package com.jagex.game.config;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("ay")
public interface ConfigType {

	@ObfuscatedName("ay.n(I)V")
	void postDecode();

	@ObfuscatedName("ay.e(Lalw;B)V")
	void decode(Packet buf);
}
