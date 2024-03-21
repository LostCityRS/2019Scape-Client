package com.jagex.game.config.hitmarktype;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.game.config.CachingConfigTypeList;
import com.jagex.game.config.Js5ConfigGroup;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("aoj")
public class HitmarkTypeList extends CachingConfigTypeList {

	public HitmarkTypeList(ModeGame modeGame, Language language, Js5 configClient, Js5 spritesClient) {
		super(modeGame, language, configClient, Js5ConfigGroup.HITMARKTYPE, 64, new BasicHitmarkTypeFactory(spritesClient));
	}

	@ObfuscatedName("aoj.r(I)V")
	public void cacheReset() {
		super.cacheReset();
		((HitmarkTypeFactory) this.factory).cacheReset();
	}

	@ObfuscatedName("aoj.v(II)V")
	public void cacheClean(int num) {
		super.cacheClean(num);
		((HitmarkTypeFactory) this.factory).cacheClean(num);
	}

	@ObfuscatedName("aoj.o(I)V")
	public void cacheRemoveSoftReferences() {
		super.cacheRemoveSoftReferences();
		((HitmarkTypeFactory) this.factory).cacheRemoveSoftReferences();
	}
}
