package com.jagex.game.config.msitype;

import com.jagex.core.datastruct.WeightedCache;
import com.jagex.game.config.ConfigTypeFactory;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("ace")
public abstract class MSITypeFactory implements ConfigTypeFactory {

	@ObfuscatedName("ace.e")
	public final Js5 field9157;

	@ObfuscatedName("ace.n")
	public WeightedCache field9156;

	public MSITypeFactory(Js5 arg0, int arg1) {
		this.field9157 = arg0;
		this.field9156 = new WeightedCache(arg1);
	}

	@ObfuscatedName("ace.e(IB)V")
	public void method15072(int arg0) {
		this.field9156 = new WeightedCache(arg0);
	}

	@ObfuscatedName("ace.n(I)V")
	public void cacheReset() {
		WeightedCache var1 = this.field9156;
		synchronized (this.field9156) {
			this.field9156.reset();
		}
	}

	@ObfuscatedName("ace.m(II)V")
	public void cacheClean(int arg0) {
		WeightedCache var2 = this.field9156;
		synchronized (this.field9156) {
			this.field9156.clean(arg0);
		}
	}

	@ObfuscatedName("ace.k(I)V")
	public void cacheRemoveSoftReferences() {
		WeightedCache var1 = this.field9156;
		synchronized (this.field9156) {
			this.field9156.clear();
		}
	}
}
