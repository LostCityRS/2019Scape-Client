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
		((NPCTypeFactory) this.field8796).method4579(arg0);
		super.method14895();
	}

	@ObfuscatedName("aod.ac(II)V")
	public void method18877(int arg0) {
		((NPCTypeFactory) this.field8796).method4575(arg0);
	}

	@ObfuscatedName("aod.r(I)V")
	public void method14895() {
		super.method14895();
		((NPCTypeFactory) this.field8796).method4577();
	}

	@ObfuscatedName("aod.v(II)V")
	public void method14896(int arg0) {
		super.method14896(arg0);
		((NPCTypeFactory) this.field8796).method4578(arg0);
	}

	@ObfuscatedName("aod.o(I)V")
	public void method14899() {
		super.method14899();
		((NPCTypeFactory) this.field8796).method4584();
	}
}
