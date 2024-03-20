package com.jagex.game.config.hitmarktype;

import com.jagex.core.datastruct.WeightedCache;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("vl")
public abstract class HitmarkTypeFactory {

	@ObfuscatedName("vl.e")
	public final Js5 configClient;

	@ObfuscatedName("vl.n")
	public final WeightedCache spriteCache = new WeightedCache(20);

	public HitmarkTypeFactory(Js5 configClient) {
		this.configClient = configClient;
	}

	@ObfuscatedName("vl.e(I)V")
	public void cacheReset() {
		WeightedCache var1 = this.spriteCache;
		synchronized (this.spriteCache) {
			this.spriteCache.reset();
		}
	}

	@ObfuscatedName("vl.n(II)V")
	public void cacheClean(int arg0) {
		WeightedCache var2 = this.spriteCache;
		synchronized (this.spriteCache) {
			this.spriteCache.clean(arg0);
		}
	}

	@ObfuscatedName("vl.m(I)V")
	public void cacheRemoveSoftReferences() {
		WeightedCache var1 = this.spriteCache;
		synchronized (this.spriteCache) {
			this.spriteCache.clear();
		}
	}
}
