package com.jagex.game.config.vartype;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.game.config.ConfigTypeList;
import deob.ObfuscatedName;

@ObfuscatedName("aj")
public abstract class BaseConfigTypeList implements ConfigTypeList {

	@ObfuscatedName("aj.e")
	public int field811;

	public BaseConfigTypeList(ModeGame arg0, Language arg1, int arg2) {
		this.field811 = arg2;
	}

	@ObfuscatedName("aj.n(I)I")
	public int length() {
		return this.field811;
	}
}
