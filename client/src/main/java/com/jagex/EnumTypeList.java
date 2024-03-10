package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aoh")
public class EnumTypeList extends CachingConfigTypeList {

	public EnumTypeList(ModeGame arg0, Language arg1, Js5 arg2) {
		super(arg0, arg1, arg2, Js5ConfigGroup.ENUMTYPE, 128, new BasicTypeFactory(EnumType.class));
	}
}
