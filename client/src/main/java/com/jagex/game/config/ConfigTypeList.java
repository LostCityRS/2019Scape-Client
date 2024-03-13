package com.jagex.game.config;

import deob.ObfuscatedName;

@ObfuscatedName("ao")
public interface ConfigTypeList extends Iterable {

	@ObfuscatedName("ao.e(II)Lay;")
	ConfigType getById(int id);

	@ObfuscatedName("ao.n(I)I")
	int length();
}
