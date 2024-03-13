package com.jagex.game.config.msitype;

import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("apq")
public class BasicMSITypeFactory extends MSITypeFactory {

	public BasicMSITypeFactory(Js5 arg0, int arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("apq.v(ILao;I)Lay;")
	public ConfigType create(int id, ConfigTypeList configTypeList) {
		return new MSIType(id, this);
	}

	@ObfuscatedName("apq.o(B)Ljava/lang/Class;")
	public Class type() {
		return MSIType.class;
	}
}
