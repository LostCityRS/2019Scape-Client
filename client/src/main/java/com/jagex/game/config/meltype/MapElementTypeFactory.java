package com.jagex.game.config.meltype;

import com.jagex.core.datastruct.WeightedCache;
import com.jagex.game.config.ConfigTypeFactory;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("hh")
public abstract class MapElementTypeFactory implements ConfigTypeFactory {

	@ObfuscatedName("hh.e")
	public final Js5 field2415;

	@ObfuscatedName("hh.n")
	public WeightedCache field2414;

	public MapElementTypeFactory(Js5 arg0, int arg1) {
		this.field2415 = arg0;
		this.field2414 = new WeightedCache(arg1);
	}
}
