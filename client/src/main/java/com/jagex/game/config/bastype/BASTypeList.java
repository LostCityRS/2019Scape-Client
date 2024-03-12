package com.jagex.game.config.bastype;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.game.config.BasicTypeFactory;
import com.jagex.game.config.CachingConfigTypeList;
import com.jagex.game.config.Js5ConfigGroup;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("aof")
public class BASTypeList extends CachingConfigTypeList {

	@ObfuscatedName("aof.w")
	public static BASType field11886 = new BASType(-1);

	public BASTypeList(ModeGame arg0, Language arg1, Js5 arg2) {
		super(arg0, arg1, arg2, Js5ConfigGroup.BASTYPE, 64, new BasicTypeFactory(BASType.class));
	}
}
