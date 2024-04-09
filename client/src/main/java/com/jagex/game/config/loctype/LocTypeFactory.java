package com.jagex.game.config.loctype;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.core.datastruct.Pair;
import com.jagex.core.datastruct.SoftLruHashTable;
import com.jagex.game.client.LocalisedText;
import com.jagex.graphics.ModelUnlit;
import deob.ObfuscatedName;

@ObfuscatedName("vh")
public abstract class LocTypeFactory {

	@ObfuscatedName("vh.e")
	public boolean allowMembers;

	@ObfuscatedName("vh.n")
	public final SoftLruHashTable modelCacheStatic = new SoftLruHashTable(500);

	@ObfuscatedName("vh.m")
	public final SoftLruHashTable modelCacheDynamic = new SoftLruHashTable(30);

	@ObfuscatedName("vh.k")
	public final SoftLruHashTable field7532 = new SoftLruHashTable(50);

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
		SoftLruHashTable var2 = this.modelCacheStatic;
		synchronized (this.modelCacheStatic) {
			this.modelCacheStatic.reset();
		}
		SoftLruHashTable var4 = this.modelCacheDynamic;
		synchronized (this.modelCacheDynamic) {
			this.modelCacheDynamic.reset();
		}
		SoftLruHashTable var6 = this.field7532;
		synchronized (this.field7532) {
			this.field7532.reset();
		}
	}

	@ObfuscatedName("vh.m(I)V")
	public void cacheReset() {
		SoftLruHashTable var1 = this.modelCacheStatic;
		synchronized (this.modelCacheStatic) {
			this.modelCacheStatic.reset();
		}
		SoftLruHashTable var3 = this.modelCacheDynamic;
		synchronized (this.modelCacheDynamic) {
			this.modelCacheDynamic.reset();
		}
		SoftLruHashTable var5 = this.field7532;
		synchronized (this.field7532) {
			this.field7532.reset();
		}
		this.field7535 = new ModelUnlit[4];
		this.field7529 = new Pair(null, null);
	}

	@ObfuscatedName("vh.k(IB)V")
	public void cacheClean(int arg0) {
		SoftLruHashTable var2 = this.modelCacheStatic;
		synchronized (this.modelCacheStatic) {
			this.modelCacheStatic.clean(arg0);
		}
		SoftLruHashTable var4 = this.modelCacheDynamic;
		synchronized (this.modelCacheDynamic) {
			this.modelCacheDynamic.clean(arg0);
		}
		SoftLruHashTable var6 = this.field7532;
		synchronized (this.field7532) {
			this.field7532.clean(arg0);
		}
	}

	@ObfuscatedName("vh.f(I)V")
	public void cacheRemoveSoftReferences() {
		SoftLruHashTable var1 = this.modelCacheStatic;
		synchronized (this.modelCacheStatic) {
			this.modelCacheStatic.clear();
		}
		SoftLruHashTable var3 = this.modelCacheDynamic;
		synchronized (this.modelCacheDynamic) {
			this.modelCacheDynamic.clear();
		}
		SoftLruHashTable var5 = this.field7532;
		synchronized (this.field7532) {
			this.field7532.clear();
		}
	}

	@ObfuscatedName("vh.l(IS)Z")
	public abstract boolean method9525(int arg0);

	@ObfuscatedName("vh.w(II)[B")
	public abstract byte[] method9530(int arg0);
}
