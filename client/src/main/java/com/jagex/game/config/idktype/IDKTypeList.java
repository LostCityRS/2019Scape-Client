package com.jagex.game.config.idktype;

import com.jagex.CachingConfigTypeList;
import com.jagex.IDKTypeFactory;
import com.jagex.Js5;
import com.jagex.ModeGame;
import com.jagex.core.constants.Language;
import com.jagex.game.config.Js5ConfigGroup;
import deob.ObfuscatedName;

@ObfuscatedName("aov")
public class IDKTypeList extends CachingConfigTypeList {

	public IDKTypeList(ModeGame arg0, Language arg1, Js5 arg2, Js5 arg3) {
		super(arg0, arg1, arg2, Js5ConfigGroup.IDKTYPE, 64, new IDKTypeFactory(arg3));
	}
}
