package com.jagex.game.config.cursortype;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.game.config.CachingConfigTypeList;
import com.jagex.game.config.Js5ConfigGroup;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("aog")
public class CursorTypeList extends CachingConfigTypeList {

	public CursorTypeList(ModeGame modeGame, Language language, Js5 js5, Js5 factoryJs5) {
		super(modeGame, language, js5, Js5ConfigGroup.CURSORTYPE, 64, new BasicCursorTypeFactory(factoryJs5));
	}

	@ObfuscatedName("aog.r(I)V")
	public void cacheReset() {
		super.cacheReset();
		((CursorTypeFactory) this.factory).cacheReset();
	}

	@ObfuscatedName("aog.v(II)V")
	public void cacheClean(int num) {
		super.cacheClean(num);
		((CursorTypeFactory) this.factory).cacheClean(num);
	}

	@ObfuscatedName("aog.o(I)V")
	public void cacheRemoveSoftReferences() {
		super.cacheRemoveSoftReferences();
		((CursorTypeFactory) this.factory).cacheRemoveSoftReferences();
	}
}
