package com.jagex.game.config.meltype;

import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("agr")
public class BasicMapElementTypeFactory extends MapElementTypeFactory {

	public BasicMapElementTypeFactory(Js5 arg0, int arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("agr.v(ILao;I)Lay;")
	public ConfigType create(int id, ConfigTypeList configTypeList) {
		return new MapElementType(id, configTypeList, this);
	}

	@ObfuscatedName("agr.o(B)Ljava/lang/Class;")
	public Class type() {
		return MapElementType.class;
	}
}
