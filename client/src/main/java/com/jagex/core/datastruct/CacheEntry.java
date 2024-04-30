package com.jagex.core.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("asr")
public abstract class CacheEntry extends SecondaryNode {

	@ObfuscatedName("asr.l")
	public final int cacheWeight;

	@ObfuscatedName("asr.u")
	public final CacheKey cacheKey;

	public CacheEntry(CacheKey arg0, int arg1) {
		this.cacheKey = arg0;
		this.cacheWeight = arg1;
	}

	@ObfuscatedName("asr.e()Ljava/lang/Object;")
	public abstract Object getValue();

	@ObfuscatedName("asr.n()Z")
	public abstract boolean isSoft();
}
