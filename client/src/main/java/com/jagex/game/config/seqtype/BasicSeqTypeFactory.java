package com.jagex.game.config.seqtype;

import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeList;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("agq")
public class BasicSeqTypeFactory extends SeqTypeFactory {

	public BasicSeqTypeFactory(ConfigTypeList arg0, Js5 arg1, Js5 arg2, Js5 arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("agq.v(ILao;I)Lay;")
	public ConfigType create(int id, ConfigTypeList configTypeList) {
		return new SeqType(id, this);
	}

	@ObfuscatedName("agq.o(B)Ljava/lang/Class;")
	public Class type() {
		return SeqType.class;
	}
}
