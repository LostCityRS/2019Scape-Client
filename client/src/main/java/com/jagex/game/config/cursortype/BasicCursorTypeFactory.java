package com.jagex.game.config.cursortype;

import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeFactory;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("alo")
public class BasicCursorTypeFactory extends CursorTypeFactory implements ConfigTypeFactory {

	public BasicCursorTypeFactory(Js5 js5) {
		super(js5);
	}

	@ObfuscatedName("alo.v(ILao;I)Lay;")
	public ConfigType create(int id, ConfigTypeList configTypeList) {
		return new CursorType(id, this);
	}

	@ObfuscatedName("alo.o(B)Ljava/lang/Class;")
	public Class type() {
		return CursorType.class;
	}
}
