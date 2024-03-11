package com.jagex.game.runetek5.config;

import com.jagex.game.runetek5.config.ConfigType;
import com.jagex.game.runetek5.config.ConfigTypeList;
import com.jagex.game.runetek5.config.vartype.bit.VarBitType;
import com.jagex.game.runetek5.config.vartype.bit.VarBitTypeFactory;
import deob.ObfuscatedName;

import java.util.Map;

@ObfuscatedName("ahg")
public class BasicVarBitTypeFactory extends VarBitTypeFactory {

	public BasicVarBitTypeFactory(Map arg0) {
		super(arg0);
	}

	@ObfuscatedName("ahg.v(ILao;I)Lay;")
	public ConfigType create(int arg0, ConfigTypeList arg1) {
		return new VarBitType(arg0, this);
	}

	@ObfuscatedName("ahg.o(B)Ljava/lang/Class;")
	public Class type() {
		return VarBitType.class;
	}
}
