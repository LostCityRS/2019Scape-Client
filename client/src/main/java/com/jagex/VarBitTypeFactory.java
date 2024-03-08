package com.jagex;

import deob.ObfuscatedName;

import java.util.Map;

@ObfuscatedName("ahg")
public class VarBitTypeFactory extends class306 {

	public VarBitTypeFactory(Map arg0) {
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
