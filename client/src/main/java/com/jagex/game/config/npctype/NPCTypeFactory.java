package com.jagex.game.config.npctype;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.core.datastruct.WeightedCache;
import com.jagex.game.client.LocalisedText;
import com.jagex.game.config.ConfigTypeFactory;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("ih")
public abstract class NPCTypeFactory implements ConfigTypeFactory {

	@ObfuscatedName("ih.e")
	public final ModeGame modeGame;

	@ObfuscatedName("ih.n")
	public boolean allowMembers;

	@ObfuscatedName("ih.m")
	public final Js5 configClient;

	@ObfuscatedName("ih.k")
	public final WeightedCache modelCache = new WeightedCache(50);

	@ObfuscatedName("ih.f")
	public final WeightedCache headModelCache = new WeightedCache(5);

	@ObfuscatedName("ih.w")
	public int field2773;

	@ObfuscatedName("ih.l")
	public final String[] defaultops;

	public NPCTypeFactory(boolean allowMembers, Js5 configClient, Language language, ModeGame modeGame) {
		this.allowMembers = allowMembers;
		this.configClient = configClient;
		this.modeGame = modeGame;
		if (ModeGame.RUNESCAPE == this.modeGame) {
			this.defaultops = new String[] { null, null, null, null, null, LocalisedText.EXAMINE.forLang(language) };
		} else {
			this.defaultops = new String[] { null, null, null, null, null, null };
		}
	}

	@ObfuscatedName("ih.e(ZI)V")
	public void setAllowMembers(boolean arg0) {
		if (this.allowMembers != arg0) {
			this.allowMembers = arg0;
			this.cacheReset();
		}
	}

	@ObfuscatedName("ih.n(II)V")
	public void method4575(int arg0) {
		this.field2773 = arg0;
		WeightedCache var2 = this.modelCache;
		synchronized (this.modelCache) {
			this.modelCache.reset();
		}
		WeightedCache var4 = this.headModelCache;
		synchronized (this.headModelCache) {
			this.headModelCache.reset();
		}
	}

	@ObfuscatedName("ih.m(B)V")
	public void cacheReset() {
		WeightedCache var1 = this.modelCache;
		synchronized (this.modelCache) {
			this.modelCache.reset();
		}
		WeightedCache var3 = this.headModelCache;
		synchronized (this.headModelCache) {
			this.headModelCache.reset();
		}
	}

	@ObfuscatedName("ih.k(II)V")
	public void cacheClean(int arg0) {
		WeightedCache var2 = this.modelCache;
		synchronized (this.modelCache) {
			this.modelCache.clean(arg0);
		}
		WeightedCache var4 = this.headModelCache;
		synchronized (this.headModelCache) {
			this.headModelCache.clean(arg0);
		}
	}

	@ObfuscatedName("ih.f(I)V")
	public void cacheRemoveSoftReferences() {
		WeightedCache var1 = this.modelCache;
		synchronized (this.modelCache) {
			this.modelCache.clear();
		}
		WeightedCache var3 = this.headModelCache;
		synchronized (this.headModelCache) {
			this.headModelCache.clear();
		}
	}
}
