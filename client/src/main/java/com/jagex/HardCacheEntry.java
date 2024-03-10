package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("auf")
public class HardCacheEntry extends CacheEntry {

	@ObfuscatedName("auf.z")
	public Object field12566;

	public HardCacheEntry(CacheKey arg0, Object arg1, int arg2) {
		super(arg0, arg2);
		this.field12566 = arg1;
	}

	@ObfuscatedName("auf.e()Ljava/lang/Object;")
	public Object method19487() {
		return this.field12566;
	}

	@ObfuscatedName("auf.n()Z")
	public boolean method19488() {
		return false;
	}
}
