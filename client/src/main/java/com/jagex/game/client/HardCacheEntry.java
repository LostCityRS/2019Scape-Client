package com.jagex.game.client;

import com.jagex.core.datastruct.CacheEntry;
import com.jagex.core.datastruct.CacheKey;
import deob.ObfuscatedName;

@ObfuscatedName("auf")
public class HardCacheEntry extends CacheEntry {

	@ObfuscatedName("auf.z")
	public Object value;

	public HardCacheEntry(CacheKey arg0, Object arg1, int arg2) {
		super(arg0, arg2);
		this.value = arg1;
	}

	@ObfuscatedName("auf.e()Ljava/lang/Object;")
	public Object getValue() {
		return this.value;
	}

	@ObfuscatedName("auf.n()Z")
	public boolean isSoft() {
		return false;
	}
}
