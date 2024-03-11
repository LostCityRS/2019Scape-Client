package com.jagex.core.datastruct;

import deob.ObfuscatedName;

import java.lang.ref.SoftReference;

@ObfuscatedName("auj")
public class SoftCacheEntry extends CacheEntry {

	@ObfuscatedName("auj.z")
	public SoftReference field12567;

	public SoftCacheEntry(CacheKey arg0, Object arg1, int arg2) {
		super(arg0, arg2);
		this.field12567 = new SoftReference(arg1);
	}

	@ObfuscatedName("auj.e()Ljava/lang/Object;")
	public Object method19487() {
		return this.field12567.get();
	}

	@ObfuscatedName("auj.n()Z")
	public boolean method19488() {
		return true;
	}
}
