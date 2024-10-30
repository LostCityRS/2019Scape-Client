package com.jagex.game.config.loctype;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.game.config.CachingConfigTypeList;
import com.jagex.game.config.Js5ConfigGroup;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("aop")
public class LocTypeList extends CachingConfigTypeList {

	public LocTypeList(ModeGame arg0, Language arg1, boolean arg2, Js5 arg3, Js5 arg4) {
		super(arg0, arg1, arg3, Js5ConfigGroup.LOCTYPE, 256, new BasicLocTypeFactory(arg2, arg4, arg1, arg0));
	}

	@ObfuscatedName("aop.al(ZI)V")
	public void setAllowMembers(boolean arg0) {
		((LocTypeFactory) this.factory).setAllowMembers(arg0);
	}

	@ObfuscatedName("aop.ac(IB)V")
	public void resetModelCache(int arg0) {
		((LocTypeFactory) this.factory).resetModelCache(arg0);
	}

	@ObfuscatedName("aop.r(I)V")
	public void cacheReset() {
		super.cacheReset();
		((LocTypeFactory) this.factory).cacheReset();
	}

	@ObfuscatedName("aop.v(II)V")
	public void cacheClean(int arg0) {
		super.cacheClean(arg0);
		((LocTypeFactory) this.factory).cacheClean(arg0);
	}

	@ObfuscatedName("aop.o(I)V")
	public void cacheRemoveSoftReferences() {
		super.cacheRemoveSoftReferences();
		((LocTypeFactory) this.factory).cacheRemoveSoftReferences();
	}
}
