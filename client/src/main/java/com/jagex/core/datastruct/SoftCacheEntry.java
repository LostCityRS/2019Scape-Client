package com.jagex.core.datastruct;

import deob.ObfuscatedName;

import java.lang.ref.SoftReference;

@ObfuscatedName("auj")
public class SoftCacheEntry extends CacheEntry {

	@ObfuscatedName("auj.z")
	public SoftReference value;

	public SoftCacheEntry(CacheKey arg0, Object arg1, int arg2) {
		super(arg0, arg2);
		this.value = new SoftReference(arg1);
	}

	@ObfuscatedName("auj.e()Ljava/lang/Object;")
	public Object getValue() {
		return this.value.get();
	}

	@ObfuscatedName("auj.n()Z")
	public boolean isSoft() {
		return true;
	}
}
