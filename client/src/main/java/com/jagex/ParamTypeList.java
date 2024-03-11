package com.jagex;

import com.jagex.game.config.Js5ConfigGroup;
import deob.ObfuscatedName;

@ObfuscatedName("aoz")
public class ParamTypeList extends CachingConfigTypeList {

	public ParamTypeList(ModeGame arg0, Language arg1, Js5 arg2) {
		super(arg0, arg1, arg2, Js5ConfigGroup.PARAMTYPE, 64, new BasicTypeFactory(ParamType.class));
	}
}
