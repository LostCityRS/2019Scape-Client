package com.jagex.game.config.meltype;

import com.jagex.core.datastruct.WeightedCache;
import com.jagex.game.config.ConfigTypeFactory;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("hh")
public abstract class MapElementTypeFactory implements ConfigTypeFactory {

	@ObfuscatedName("hh.e")
	public final Js5 configClient;

	@ObfuscatedName("hh.n")
	public WeightedCache elementCache;

	public MapElementTypeFactory(Js5 configClient, int size) {
		this.configClient = configClient;
		this.elementCache = new WeightedCache(size);
	}
}
