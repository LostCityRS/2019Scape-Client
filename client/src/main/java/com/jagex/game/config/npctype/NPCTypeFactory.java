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
	public final ModeGame field2772;

	@ObfuscatedName("ih.n")
	public boolean allowMembers;

	@ObfuscatedName("ih.m")
	public final Js5 js5;

	@ObfuscatedName("ih.k")
	public final WeightedCache modelCache = new WeightedCache(50);

	@ObfuscatedName("ih.f")
	public final WeightedCache field2768 = new WeightedCache(5);

	@ObfuscatedName("ih.w")
	public int field2773;

	@ObfuscatedName("ih.l")
	public final String[] defaultops;

	public NPCTypeFactory(boolean allowMembers, Js5 js5, Language language, ModeGame modeGame) {
		this.allowMembers = allowMembers;
		this.js5 = js5;
		this.field2772 = modeGame;
		if (ModeGame.RUNESCAPE == this.field2772) {
			this.defaultops = new String[] { null, null, null, null, null, LocalisedText.EXAMINE.method15021(language) };
		} else {
			this.defaultops = new String[] { null, null, null, null, null, null };
		}
	}

	@ObfuscatedName("ih.e(ZI)V")
	public void method4579(boolean arg0) {
		if (this.allowMembers != arg0) {
			this.allowMembers = arg0;
			this.method4577();
		}
	}

	@ObfuscatedName("ih.n(II)V")
	public void method4575(int arg0) {
		this.field2773 = arg0;
		WeightedCache var2 = this.modelCache;
		synchronized (this.modelCache) {
			this.modelCache.method2924();
		}
		WeightedCache var4 = this.field2768;
		synchronized (this.field2768) {
			this.field2768.method2924();
		}
	}

	@ObfuscatedName("ih.m(B)V")
	public void method4577() {
		WeightedCache var1 = this.modelCache;
		synchronized (this.modelCache) {
			this.modelCache.method2924();
		}
		WeightedCache var3 = this.field2768;
		synchronized (this.field2768) {
			this.field2768.method2924();
		}
	}

	@ObfuscatedName("ih.k(II)V")
	public void method4578(int arg0) {
		WeightedCache var2 = this.modelCache;
		synchronized (this.modelCache) {
			this.modelCache.method2923(arg0);
		}
		WeightedCache var4 = this.field2768;
		synchronized (this.field2768) {
			this.field2768.method2923(arg0);
		}
	}

	@ObfuscatedName("ih.f(I)V")
	public void method4584() {
		WeightedCache var1 = this.modelCache;
		synchronized (this.modelCache) {
			this.modelCache.method2928();
		}
		WeightedCache var3 = this.field2768;
		synchronized (this.field2768) {
			this.field2768.method2928();
		}
	}
}
