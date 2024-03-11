package com.jagex.game.config.headbartype;

import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeFactory;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.game.config.headbartype.HeadbarType;
import com.jagex.game.config.headbartype.HeadbarTypeFactory;
import com.jagex.js5.Js5;
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
