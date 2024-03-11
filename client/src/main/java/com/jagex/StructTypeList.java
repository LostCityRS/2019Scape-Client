package com.jagex;

import com.jagex.game.config.Js5ConfigGroup;
import deob.ObfuscatedName;

@ObfuscatedName("ape")
public class StructTypeList extends ConfigTypeListPreload {

	public StructTypeList(ModeGame arg0, Language arg1, Js5 arg2, boolean arg3) {
		super(arg0, arg1, Js5ConfigGroup.STRUCTTYPE, arg2, new BasicTypeFactory(StructType.class), arg3);
	}
}
