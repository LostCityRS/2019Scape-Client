package com.jagex.game.config.loctype;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.game.config.CachingConfigTypeList;
import com.jagex.game.config.Js5ConfigGroup;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("aop")
public class LocTypeList extends CachingConfigTypeList {

	public LocTypeList(ModeGame modeGame, Language language, boolean allowMembers, Js5 js5, Js5 factoryJs5) {
		super(modeGame, language, js5, Js5ConfigGroup.LOCTYPE, 256, new BasicLocTypeFactory(allowMembers, factoryJs5, language, modeGame));
	}

	@ObfuscatedName("aop.al(ZI)V")
	public void setAllowMembers(boolean arg0) {
		((LocTypeFactory) this.factory).method9519(arg0);
	}

	@ObfuscatedName("aop.ac(IB)V")
	public void method18891(int arg0) {
		((LocTypeFactory) this.factory).method9541(arg0);
	}

	@ObfuscatedName("aop.r(I)V")
	public void method14895() {
		super.method14895();
		((LocTypeFactory) this.factory).method9521();
	}

	@ObfuscatedName("aop.v(II)V")
	public void method14896(int arg0) {
		super.method14896(arg0);
		((LocTypeFactory) this.factory).method9522(arg0);
	}

	@ObfuscatedName("aop.o(I)V")
	public void method14899() {
		super.method14899();
		((LocTypeFactory) this.factory).method9520();
	}
}
