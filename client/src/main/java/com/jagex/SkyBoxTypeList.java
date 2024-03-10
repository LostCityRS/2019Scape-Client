package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aom")
public class SkyBoxTypeList extends CachingConfigTypeList {

	public SkyBoxTypeList(ModeGame arg0, Language arg1, Js5 arg2) {
		super(arg0, arg1, arg2, Js5ConfigGroup.SKYBOXTYPE, 16, new BasicTypeFactory(SkyBoxType.class));
	}
}
