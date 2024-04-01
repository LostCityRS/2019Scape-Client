package com.jagex.game.config.loctype;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.core.datastruct.Pair;
import com.jagex.core.datastruct.WeightedCache;
import com.jagex.game.client.LocalisedText;
import com.jagex.graphics.ModelUnlit;
import deob.ObfuscatedName;

@ObfuscatedName("vh")
public abstract class LocTypeFactory {

	@ObfuscatedName("vh.e")
	public boolean allowMembers;

	@ObfuscatedName("vh.n")
	public final WeightedCache modelCacheStatic = new WeightedCache(500);

	@ObfuscatedName("vh.m")
	public final WeightedCache modelCacheDynamic = new WeightedCache(30);

	@ObfuscatedName("vh.k")
	public final WeightedCache field7532 = new WeightedCache(50);

	@ObfuscatedName("vh.f")
	public int field7536;

	@ObfuscatedName("vh.w")
	public final String[] defaultops;

	@ObfuscatedName("vh.l")
	public ModelUnlit[] field7535 = new ModelUnlit[4];

	@ObfuscatedName("vh.u")
	public Pair field7529 = new Pair(null, null);

	public LocTypeFactory(boolean allowMembers, Language language, ModeGame modeGame) {
		this.allowMembers = allowMembers;
		if (ModeGame.RUNESCAPE == modeGame) {
			this.defaultops = new String[] { null, null, null, null, null, LocalisedText.EXAMINE.forLang(language) };
		} else {
			this.defaultops = new String[] { null, null, null, null, null, null };
		}
	}

	@ObfuscatedName("vh.e(ZI)V")
	public void setAllowMembers(boolean arg0) {
		if (this.allowMembers != arg0) {
			this.allowMembers = arg0;
			this.cacheReset();
		}
	}

	@ObfuscatedName("vh.n(IB)V")
	public void resetModelCache(int arg0) {
		this.field7536 = arg0;
		WeightedCache var2 = this.modelCacheStatic;
		synchronized (this.modelCacheStatic) {
			this.modelCacheStatic.reset();
		}
		WeightedCache var4 = this.modelCacheDynamic;
		synchronized (this.modelCacheDynamic) {
			this.modelCacheDynamic.reset();
		}
		WeightedCache var6 = this.field7532;
		synchronized (this.field7532) {
			this.field7532.reset();
		}
	}

	@ObfuscatedName("vh.m(I)V")
	public void cacheReset() {
		WeightedCache var1 = this.modelCacheStatic;
		synchronized (this.modelCacheStatic) {
			this.modelCacheStatic.reset();
		}
		WeightedCache var3 = this.modelCacheDynamic;
		synchronized (this.modelCacheDynamic) {
			this.modelCacheDynamic.reset();
		}
		WeightedCache var5 = this.field7532;
		synchronized (this.field7532) {
			this.field7532.reset();
		}
		this.field7535 = new ModelUnlit[4];
		this.field7529 = new Pair(null, null);
	}

	@ObfuscatedName("vh.k(IB)V")
	public void cacheClean(int arg0) {
		WeightedCache var2 = this.modelCacheStatic;
		synchronized (this.modelCacheStatic) {
			this.modelCacheStatic.clean(arg0);
		}
		WeightedCache var4 = this.modelCacheDynamic;
		synchronized (this.modelCacheDynamic) {
			this.modelCacheDynamic.clean(arg0);
		}
		WeightedCache var6 = this.field7532;
		synchronized (this.field7532) {
			this.field7532.clean(arg0);
		}
	}

	@ObfuscatedName("vh.f(I)V")
	public void cacheRemoveSoftReferences() {
		WeightedCache var1 = this.modelCacheStatic;
		synchronized (this.modelCacheStatic) {
			this.modelCacheStatic.clear();
		}
		WeightedCache var3 = this.modelCacheDynamic;
		synchronized (this.modelCacheDynamic) {
			this.modelCacheDynamic.clear();
		}
		WeightedCache var5 = this.field7532;
		synchronized (this.field7532) {
			this.field7532.clear();
		}
	}

	@ObfuscatedName("vh.l(IS)Z")
	public abstract boolean method9525(int arg0);

	@ObfuscatedName("vh.w(II)[B")
	public abstract byte[] method9530(int arg0);
}
