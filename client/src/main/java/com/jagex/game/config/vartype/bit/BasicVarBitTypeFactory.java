package com.jagex.game.config.vartype.bit;

import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeList;
import deob.ObfuscatedName;

import java.util.Map;

@ObfuscatedName("ahg")
public class BasicVarBitTypeFactory extends VarBitTypeFactory {

	public BasicVarBitTypeFactory(Map arg0) {
		super(arg0);
	}

	@ObfuscatedName("ahg.v(ILao;I)Lay;")
	public ConfigType create(int id, ConfigTypeList configTypeList) {
		return new VarBitType(id, this);
	}

	@ObfuscatedName("ahg.o(B)Ljava/lang/Class;")
	public Class type() {
		return VarBitType.class;
	}
}
