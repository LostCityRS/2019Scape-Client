package com.jagex.game.config.headbartype;

import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeFactory;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("ale")
public class BasicHeadbarTypeFactory extends HeadbarTypeFactory implements ConfigTypeFactory {

	public BasicHeadbarTypeFactory(Js5 configClient) {
		super(configClient);
	}

	@ObfuscatedName("ale.v(ILao;I)Lay;")
	public ConfigType create(int id, ConfigTypeList configTypeList) {
		return new HeadbarType(id, this);
	}

	@ObfuscatedName("ale.o(B)Ljava/lang/Class;")
	public Class type() {
		return HeadbarType.class;
	}
}
