package com.jagex.game.config.effectanimtype;

import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.game.config.ConfigTypeFactory;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("yc")
public abstract class EffectAnimTypeFactory implements ConfigTypeFactory {

	@ObfuscatedName("yc.e")
	public final Js5 configClient;

	@ObfuscatedName("yc.n")
	public final SoftLruHashTable modelCache = new SoftLruHashTable(60);

	@ObfuscatedName("yc.m")
	public int field8264;

	public EffectAnimTypeFactory(Js5 configClient) {
		this.configClient = configClient;
	}

	@ObfuscatedName("yc.e(II)V")
	public void resetModelCache(int arg0) {
		this.field8264 = arg0;
		SoftLruHashTable var2 = this.modelCache;
		synchronized (this.modelCache) {
			this.modelCache.reset();
		}
	}

	@ObfuscatedName("yc.n(B)V")
	public void cacheReset() {
		SoftLruHashTable var1 = this.modelCache;
		synchronized (this.modelCache) {
			this.modelCache.reset();
		}
	}

	@ObfuscatedName("yc.m(IB)V")
	public void cacheClean(int arg0) {
		SoftLruHashTable var2 = this.modelCache;
		synchronized (this.modelCache) {
			this.modelCache.clean(arg0);
		}
	}

	@ObfuscatedName("yc.k(I)V")
	public void cacheRemoveSoftReferences() {
		SoftLruHashTable var1 = this.modelCache;
		synchronized (this.modelCache) {
			this.modelCache.clear();
		}
	}
}
