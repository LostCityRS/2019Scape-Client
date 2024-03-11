package com.jagex;

import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.game.config.headbartype.HeadbarType;
import deob.ObfuscatedName;

@ObfuscatedName("ale")
public class BasicHeadbarTypeFactory extends HeadbarTypeFactory implements ConfigTypeFactory {

	public BasicHeadbarTypeFactory(Js5 arg0) {
		super(arg0);
	}

	@ObfuscatedName("ale.v(ILao;I)Lay;")
	public ConfigType create(int arg0, ConfigTypeList arg1) {
		return new HeadbarType(arg0, this);
	}

	@ObfuscatedName("ale.o(B)Ljava/lang/Class;")
	public Class type() {
		return HeadbarType.class;
	}
}
