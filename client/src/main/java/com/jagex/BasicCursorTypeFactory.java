package com.jagex;

import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.game.config.cursortype.CursorType;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("alo")
public class BasicCursorTypeFactory extends CursorTypeFactory implements ConfigTypeFactory {

	public BasicCursorTypeFactory(Js5 arg0) {
		super(arg0);
	}

	@ObfuscatedName("alo.v(ILao;I)Lay;")
	public ConfigType create(int arg0, ConfigTypeList arg1) {
		return new CursorType(arg0, this);
	}

	@ObfuscatedName("alo.o(B)Ljava/lang/Class;")
	public Class type() {
		return CursorType.class;
	}
}
