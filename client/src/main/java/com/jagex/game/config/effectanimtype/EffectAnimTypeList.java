package com.jagex.game.config.effectanimtype;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.game.config.CachingConfigTypeList;
import com.jagex.game.config.Js5ConfigGroup;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("aot")
public class EffectAnimTypeList extends CachingConfigTypeList {

	public EffectAnimTypeList(ModeGame modeGame, Language language, Js5 js5, Js5 factoryJs5) {
		super(modeGame, language, js5, Js5ConfigGroup.SPOTTYPE, 64, new BasicEffectAnimTypeFactory(factoryJs5));
	}

	@ObfuscatedName("aot.al(II)V")
	public void resetModelCache(int arg0) {
		((EffectAnimTypeFactory) this.factory).resetModelCache(arg0);
	}

	@ObfuscatedName("aot.r(I)V")
	public void cacheReset() {
		super.cacheReset();
		((EffectAnimTypeFactory) this.factory).cacheReset();
	}

	@ObfuscatedName("aot.v(II)V")
	public void cacheClean(int num) {
		super.cacheClean(num);
		((EffectAnimTypeFactory) this.factory).cacheClean(num);
	}

	@ObfuscatedName("aot.o(I)V")
	public void cacheRemoveSoftReferences() {
		super.cacheRemoveSoftReferences();
		((EffectAnimTypeFactory) this.factory).cacheRemoveSoftReferences();
	}
}
