package com.jagex.game.config.meltype;

import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.game.config.ConfigTypeFactory;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("hh")
public abstract class MapElementTypeFactory implements ConfigTypeFactory {

	@ObfuscatedName("hh.e")
	public final Js5 configClient;

	@ObfuscatedName("hh.n")
	public SoftLruHashTable elementCache;

	public MapElementTypeFactory(Js5 arg0, int arg1) {
		this.configClient = arg0;
		this.elementCache = new SoftLruHashTable(arg1);
	}
}
