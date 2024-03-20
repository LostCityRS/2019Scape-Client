package com.jagex.game.config.cursortype;

import com.jagex.core.datastruct.WeightedCache;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("xd")
public abstract class CursorTypeFactory {

	@ObfuscatedName("xd.e")
	public Js5 js5;

	@ObfuscatedName("xd.n")
	public final WeightedCache cursorCache = new WeightedCache(2);

	public CursorTypeFactory(Js5 js5) {
		this.js5 = js5;
	}

	@ObfuscatedName("xd.e(I)V")
	public void cacheReset() {
		WeightedCache var1 = this.cursorCache;
		synchronized (this.cursorCache) {
			this.cursorCache.reset();
		}
	}

	@ObfuscatedName("xd.n(II)V")
	public void cacheClean(int arg0) {
		WeightedCache var2 = this.cursorCache;
		synchronized (this.cursorCache) {
			this.cursorCache.clean(arg0);
		}
	}

	@ObfuscatedName("xd.m(I)V")
	public void cacheRemoveSoftReferences() {
		WeightedCache var1 = this.cursorCache;
		synchronized (this.cursorCache) {
			this.cursorCache.clear();
		}
	}
}
