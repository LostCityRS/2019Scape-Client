package com.jagex.game.config.idktype;

import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeFactory;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("ja")
public class IDKTypeFactory implements ConfigTypeFactory {

	@ObfuscatedName("ja.e")
	public final Js5 configClient;

	public IDKTypeFactory(Js5 arg0) {
		this.configClient = arg0;
	}

	@ObfuscatedName("ja.v(ILao;I)Lay;")
	public ConfigType create(int arg0, ConfigTypeList arg1) {
		return new IDKType(arg0, this.configClient);
	}

	@ObfuscatedName("ja.o(B)Ljava/lang/Class;")
	public Class type() {
		return IDKType.class;
	}
}
