package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("api")
public class InvTypeList extends CachingConfigTypeList {

	public InvTypeList(ModeGame arg0, Language arg1, Js5 arg2) {
		super(arg0, arg1, arg2, Js5ConfigGroup.INVTYPE, 64, new BasicTypeFactory(InvType.class));
	}
}
