package com.jagex.game.config.hitmarktype;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.game.config.CachingConfigTypeList;
import com.jagex.game.config.Js5ConfigGroup;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("aoj")
public class HitmarkTypeList extends CachingConfigTypeList {

	public HitmarkTypeList(ModeGame arg0, Language arg1, Js5 arg2, Js5 arg3) {
		super(arg0, arg1, arg2, Js5ConfigGroup.HITMARKTYPE, 64, new BasicHitmarkTypeFactory(arg3));
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
