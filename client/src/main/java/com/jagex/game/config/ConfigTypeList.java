package com.jagex.game.config;

import deob.ObfuscatedName;

@ObfuscatedName("ao")
public interface ConfigTypeList extends Iterable {

	@ObfuscatedName("ao.e(II)Lay;")
	ConfigType get(int arg0);

	@ObfuscatedName("ao.n(I)I")
	int size();
}
