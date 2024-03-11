package com.jagex.game.config.msitype;

import com.jagex.*;
import com.jagex.game.config.Js5ConfigGroup;
import deob.ObfuscatedName;

@ObfuscatedName("aox")
public class MSITypeList extends CachingConfigTypeList {

	public MSITypeList(ModeGame arg0, Language arg1, Js5 arg2, Js5 arg3) {
		super(arg0, arg1, arg2, Js5ConfigGroup.MSITYPE, 64, new BasicMSITypeFactory(arg3, 64));
	}

	@ObfuscatedName("aox.al(III)V")
	public void method18915(int arg0, int arg1) {
		super.method14910(arg0);
		((MSITypeFactory) this.field8796).method15072(arg1);
	}

	@ObfuscatedName("aox.r(I)V")
	public void method14895() {
		super.method14895();
		((MSITypeFactory) this.field8796).method15075();
	}

	@ObfuscatedName("aox.v(II)V")
	public void method14896(int arg0) {
		super.method14896(arg0);
		((MSITypeFactory) this.field8796).method15074(arg0);
	}

	@ObfuscatedName("aox.o(I)V")
	public void method14899() {
		super.method14899();
		((MSITypeFactory) this.field8796).method15078();
	}
}
