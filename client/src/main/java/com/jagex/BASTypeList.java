package com.jagex;

import com.jagex.game.config.Js5ConfigGroup;
import deob.ObfuscatedName;

@ObfuscatedName("aof")
public class BASTypeList extends CachingConfigTypeList {

	@ObfuscatedName("aof.w")
	public static BASType field11886 = new BASType(-1);

	public BASTypeList(ModeGame arg0, Language arg1, Js5 arg2) {
		super(arg0, arg1, arg2, Js5ConfigGroup.BASTYPE, 64, new BasicTypeFactory(BASType.class));
	}
}
