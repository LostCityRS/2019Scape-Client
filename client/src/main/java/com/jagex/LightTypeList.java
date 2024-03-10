package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aoq")
public class LightTypeList extends CachingConfigTypeList {

	public LightTypeList(ModeGame arg0, Language arg1, Js5 arg2) {
		super(arg0, arg1, arg2, Js5ConfigGroup.LIGHTTYPE, 64, new BasicTypeFactory(LightType.class));
	}
}
