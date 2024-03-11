package com.jagex.game.config.meltype;

import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.game.config.meltype.MapElementType;
import com.jagex.game.config.meltype.MapElementTypeFactory;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("agr")
public class BasicMapElementTypeFactory extends MapElementTypeFactory {

	public BasicMapElementTypeFactory(Js5 arg0, int arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("agr.v(ILao;I)Lay;")
	public ConfigType create(int arg0, ConfigTypeList arg1) {
		return new MapElementType(arg0, arg1, this);
	}

	@ObfuscatedName("agr.o(B)Ljava/lang/Class;")
	public Class type() {
		return MapElementType.class;
	}
}
