package com.jagex.game.runetek5.config;

import com.jagex.game.runetek5.config.ConfigType;
import com.jagex.game.runetek5.config.ConfigTypeFactory;
import com.jagex.game.runetek5.config.ConfigTypeList;
import com.jagex.game.runetek5.config.idktype.IDKType;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("ja")
public class IDKTypeFactory implements ConfigTypeFactory {

	@ObfuscatedName("ja.e")
	public final Js5 field2961;

	public IDKTypeFactory(Js5 arg0) {
		this.field2961 = arg0;
	}

	@ObfuscatedName("ja.v(ILao;I)Lay;")
	public ConfigType create(int arg0, ConfigTypeList arg1) {
		return new IDKType(arg0, this.field2961);
	}

	@ObfuscatedName("ja.o(B)Ljava/lang/Class;")
	public Class type() {
		return IDKType.class;
	}
}
