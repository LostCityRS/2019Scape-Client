package com.jagex.game.config.headbartype;

import com.jagex.core.datastruct.WeightedCache;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("uy")
public abstract class HeadbarTypeFactory {

	@ObfuscatedName("uy.e")
	public final Js5 configClient;

	@ObfuscatedName("uy.n")
	public WeightedCache spriteCache = new WeightedCache(20);

	public HeadbarTypeFactory(Js5 configClient) {
		this.configClient = configClient;
	}

	@ObfuscatedName("uy.e(I)V")
	public void cacheReset() {
		WeightedCache var1 = this.spriteCache;
		synchronized (this.spriteCache) {
			this.spriteCache.reset();
		}
	}

	@ObfuscatedName("uy.n(II)V")
	public void cacheClean(int arg0) {
		WeightedCache var2 = this.spriteCache;
		synchronized (this.spriteCache) {
			this.spriteCache.clean(arg0);
		}
	}

	@ObfuscatedName("uy.m(I)V")
	public void cacheRemoveSoftReferences() {
		WeightedCache var1 = this.spriteCache;
		synchronized (this.spriteCache) {
			this.spriteCache.clear();
		}
	}
}
