package com.jagex.game.config.spottype;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.game.config.BasicEffectAnimTypeFactory;
import com.jagex.game.config.CachingConfigTypeList;
import com.jagex.game.config.Js5ConfigGroup;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("aot")
public class EffectAnimTypeList extends CachingConfigTypeList {

	public EffectAnimTypeList(ModeGame arg0, Language arg1, Js5 arg2, Js5 arg3) {
		super(arg0, arg1, arg2, Js5ConfigGroup.SPOTTYPE, 64, new BasicEffectAnimTypeFactory(arg3));
	}

	@ObfuscatedName("aot.al(II)V")
	public void method18896(int arg0) {
		((EffectAnimTypeFactory) this.field8796).method13832(arg0);
	}

	@ObfuscatedName("aot.r(I)V")
	public void method14895() {
		super.method14895();
		((EffectAnimTypeFactory) this.field8796).method13834();
	}

	@ObfuscatedName("aot.v(II)V")
	public void method14896(int arg0) {
		super.method14896(arg0);
		((EffectAnimTypeFactory) this.field8796).method13821(arg0);
	}

	@ObfuscatedName("aot.o(I)V")
	public void method14899() {
		super.method14899();
		((EffectAnimTypeFactory) this.field8796).method13822();
	}
}
