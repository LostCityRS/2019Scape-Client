package com.jagex.game.config.cursortype;

import com.jagex.*;
import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.game.config.Js5ConfigGroup;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("aog")
public class CursorTypeList extends CachingConfigTypeList {

	public CursorTypeList(ModeGame arg0, Language arg1, Js5 arg2, Js5 arg3) {
		super(arg0, arg1, arg2, Js5ConfigGroup.CURSORTYPE, 64, new BasicCursorTypeFactory(arg3));
	}

	@ObfuscatedName("aog.r(I)V")
	public void method14895() {
		super.method14895();
		((CursorTypeFactory) this.field8796).method10287();
	}

	@ObfuscatedName("aog.v(II)V")
	public void method14896(int arg0) {
		super.method14896(arg0);
		((CursorTypeFactory) this.field8796).method10291(arg0);
	}

	@ObfuscatedName("aog.o(I)V")
	public void method14899() {
		super.method14899();
		((CursorTypeFactory) this.field8796).method10289();
	}
}
