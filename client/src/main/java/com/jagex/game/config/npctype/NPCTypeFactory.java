package com.jagex.game.config.npctype;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.core.datastruct.SoftLruHashTable;
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
	public final SoftLruHashTable modelCache = new SoftLruHashTable(50);

	@ObfuscatedName("ih.f")
	public final SoftLruHashTable headModelCache = new SoftLruHashTable(5);

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
	public void resetModelCache(int arg0) {
		this.field2773 = arg0;
		SoftLruHashTable var2 = this.modelCache;
		synchronized (this.modelCache) {
			this.modelCache.reset();
		}
		SoftLruHashTable var4 = this.headModelCache;
		synchronized (this.headModelCache) {
			this.headModelCache.reset();
		}
	}

	@ObfuscatedName("ih.m(B)V")
	public void cacheReset() {
		SoftLruHashTable var1 = this.modelCache;
		synchronized (this.modelCache) {
			this.modelCache.reset();
		}
		SoftLruHashTable var3 = this.headModelCache;
		synchronized (this.headModelCache) {
			this.headModelCache.reset();
		}
	}

	@ObfuscatedName("ih.k(II)V")
	public void cacheClean(int arg0) {
		SoftLruHashTable var2 = this.modelCache;
		synchronized (this.modelCache) {
			this.modelCache.clean(arg0);
		}
		SoftLruHashTable var4 = this.headModelCache;
		synchronized (this.headModelCache) {
			this.headModelCache.clean(arg0);
		}
	}

	@ObfuscatedName("ih.f(I)V")
	public void cacheRemoveSoftReferences() {
		SoftLruHashTable var1 = this.modelCache;
		synchronized (this.modelCache) {
			this.modelCache.clear();
		}
		SoftLruHashTable var3 = this.headModelCache;
		synchronized (this.headModelCache) {
			this.headModelCache.clear();
		}
	}
}
