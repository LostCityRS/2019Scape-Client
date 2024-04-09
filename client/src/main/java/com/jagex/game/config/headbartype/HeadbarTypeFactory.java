package com.jagex.game.config.headbartype;

import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("uy")
public abstract class HeadbarTypeFactory {

	@ObfuscatedName("uy.e")
	public final Js5 configClient;

	@ObfuscatedName("uy.n")
	public SoftLruHashTable spriteCache = new SoftLruHashTable(20);

	public HeadbarTypeFactory(Js5 configClient) {
		this.configClient = configClient;
	}

	@ObfuscatedName("uy.e(I)V")
	public void cacheReset() {
		SoftLruHashTable var1 = this.spriteCache;
		synchronized (this.spriteCache) {
			this.spriteCache.reset();
		}
	}

	@ObfuscatedName("uy.n(II)V")
	public void cacheClean(int arg0) {
		SoftLruHashTable var2 = this.spriteCache;
		synchronized (this.spriteCache) {
			this.spriteCache.clean(arg0);
		}
	}

	@ObfuscatedName("uy.m(I)V")
	public void cacheRemoveSoftReferences() {
		SoftLruHashTable var1 = this.spriteCache;
		synchronized (this.spriteCache) {
			this.spriteCache.clear();
		}
	}
}
