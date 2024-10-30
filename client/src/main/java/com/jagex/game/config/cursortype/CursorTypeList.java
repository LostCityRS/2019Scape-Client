package com.jagex.game.config.cursortype;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.game.config.CachingConfigTypeList;
import com.jagex.game.config.Js5ConfigGroup;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("aog")
public class CursorTypeList extends CachingConfigTypeList {

	public CursorTypeList(ModeGame arg0, Language arg1, Js5 arg2, Js5 arg3) {
		super(arg0, arg1, arg2, Js5ConfigGroup.CURSORTYPE, 64, new BasicCursorTypeFactory(arg3));
	}

	@ObfuscatedName("aog.r(I)V")
	public void cacheReset() {
		super.cacheReset();
		((CursorTypeFactory) this.factory).cacheReset();
	}

	@ObfuscatedName("aog.v(II)V")
	public void cacheClean(int arg0) {
		super.cacheClean(arg0);
		((CursorTypeFactory) this.factory).cacheClean(arg0);
	}

	@ObfuscatedName("aog.o(I)V")
	public void cacheRemoveSoftReferences() {
		super.cacheRemoveSoftReferences();
		((CursorTypeFactory) this.factory).cacheRemoveSoftReferences();
	}
}
