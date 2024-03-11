package com.jagex.game.runetek5.config.idktype;

import com.jagex.game.runetek5.config.CachingConfigTypeList;
import com.jagex.game.runetek5.config.IDKTypeFactory;
import com.jagex.game.runetek5.config.Js5ConfigGroup;
import com.jagex.js5.Js5;
import com.jagex.core.constants.ModeGame;
import com.jagex.core.constants.Language;
import deob.ObfuscatedName;

@ObfuscatedName("aov")
public class IDKTypeList extends CachingConfigTypeList {

	public IDKTypeList(ModeGame arg0, Language arg1, Js5 arg2, Js5 arg3) {
		super(arg0, arg1, arg2, Js5ConfigGroup.IDKTYPE, 64, new IDKTypeFactory(arg3));
	}
}
