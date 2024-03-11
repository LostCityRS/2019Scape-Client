package com.jagex.game.config.hitmarktype;

import com.jagex.*;
import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.game.config.Js5ConfigGroup;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("aoj")
public class HitmarkTypeList extends CachingConfigTypeList {

	public HitmarkTypeList(ModeGame arg0, Language arg1, Js5 arg2, Js5 arg3) {
		super(arg0, arg1, arg2, Js5ConfigGroup.HITMARKTYPE, 64, new BasicHitmarkTypeFactory(arg3));
	}

	@ObfuscatedName("aoj.r(I)V")
	public void method14895() {
		super.method14895();
		((HitmarkTypeFactory) this.field8796).method9277();
	}

	@ObfuscatedName("aoj.v(II)V")
	public void method14896(int arg0) {
		super.method14896(arg0);
		((HitmarkTypeFactory) this.field8796).method9282(arg0);
	}

	@ObfuscatedName("aoj.o(I)V")
	public void method14899() {
		super.method14899();
		((HitmarkTypeFactory) this.field8796).method9279();
	}
}
