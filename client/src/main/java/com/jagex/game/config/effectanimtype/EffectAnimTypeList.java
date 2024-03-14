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
	public void method18896(int arg0) {
		((EffectAnimTypeFactory) this.factory).method13832(arg0);
	}

	@ObfuscatedName("aot.r(I)V")
	public void method14895() {
		super.method14895();
		((EffectAnimTypeFactory) this.factory).method13834();
	}

	@ObfuscatedName("aot.v(II)V")
	public void method14896(int arg0) {
		super.method14896(arg0);
		((EffectAnimTypeFactory) this.factory).method13821(arg0);
	}

	@ObfuscatedName("aot.o(I)V")
	public void method14899() {
		super.method14899();
		((EffectAnimTypeFactory) this.factory).method13822();
	}
}