package com.jagex.game.config.effectanimtype;

import com.jagex.core.datastruct.WeightedCache;
import com.jagex.game.config.ConfigTypeFactory;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("yc")
public abstract class EffectAnimTypeFactory implements ConfigTypeFactory {

	@ObfuscatedName("yc.e")
	public final Js5 configClient;

	@ObfuscatedName("yc.n")
	public final WeightedCache modelCache = new WeightedCache(60);

	@ObfuscatedName("yc.m")
	public int field8264;

	public EffectAnimTypeFactory(Js5 configClient) {
		this.configClient = configClient;
	}

	@ObfuscatedName("yc.e(II)V")
	public void method13832(int arg0) {
		this.field8264 = arg0;
		WeightedCache var2 = this.modelCache;
		synchronized (this.modelCache) {
			this.modelCache.method2924();
		}
	}

	@ObfuscatedName("yc.n(B)V")
	public void method13834() {
		WeightedCache var1 = this.modelCache;
		synchronized (this.modelCache) {
			this.modelCache.method2924();
		}
	}

	@ObfuscatedName("yc.m(IB)V")
	public void method13821(int arg0) {
		WeightedCache var2 = this.modelCache;
		synchronized (this.modelCache) {
			this.modelCache.method2923(arg0);
		}
	}

	@ObfuscatedName("yc.k(I)V")
	public void method13822() {
		WeightedCache var1 = this.modelCache;
		synchronized (this.modelCache) {
			this.modelCache.method2928();
		}
	}
}
