package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("asr")
public abstract class CacheEntry extends SecondaryNode {

	@ObfuscatedName("asr.l")
	public final int field12363;

	@ObfuscatedName("asr.u")
	public final CacheKey field12362;

	public CacheEntry(CacheKey arg0, int arg1) {
		this.field12362 = arg0;
		this.field12363 = arg1;
	}

	@ObfuscatedName("asr.e()Ljava/lang/Object;")
	public abstract Object method19487();

	@ObfuscatedName("asr.n()Z")
	public abstract boolean method19488();
}
