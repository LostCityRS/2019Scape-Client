package com.jagex.game.config.npctype;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.game.config.CachingConfigTypeList;
import com.jagex.game.config.Js5ConfigGroup;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("aod")
public class NPCTypeList extends CachingConfigTypeList {

	public NPCTypeList(ModeGame arg0, Language arg1, boolean arg2, Js5 arg3, Js5 arg4) {
		super(arg0, arg1, arg3, Js5ConfigGroup.NPCTYPE, 64, new BasicNPCTypeFactory(arg2, arg4, arg1, arg0));
	}

	@ObfuscatedName("aod.al(ZI)V")
	public void setAllowMembers(boolean arg0) {
		((NPCTypeFactory) this.factory).setAllowMembers(arg0);
		super.cacheReset();
	}

	@ObfuscatedName("aod.ac(II)V")
	public void resetModelCache(int arg0) {
		((NPCTypeFactory) this.factory).resetModelCache(arg0);
	}

	@ObfuscatedName("aod.r(I)V")
	public void cacheReset() {
		super.cacheReset();
		((NPCTypeFactory) this.factory).cacheReset();
	}

	@ObfuscatedName("aod.v(II)V")
	public void cacheClean(int arg0) {
		super.cacheClean(arg0);
		((NPCTypeFactory) this.factory).cacheClean(arg0);
	}

	@ObfuscatedName("aod.o(I)V")
	public void cacheRemoveSoftReferences() {
		super.cacheRemoveSoftReferences();
		((NPCTypeFactory) this.factory).cacheRemoveSoftReferences();
	}
}
