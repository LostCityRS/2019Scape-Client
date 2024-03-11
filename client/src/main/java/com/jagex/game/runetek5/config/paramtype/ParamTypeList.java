package com.jagex.game.runetek5.config.paramtype;

import com.jagex.game.runetek5.config.BasicTypeFactory;
import com.jagex.game.runetek5.config.CachingConfigTypeList;
import com.jagex.game.runetek5.config.Js5ConfigGroup;
import com.jagex.js5.Js5;
import com.jagex.core.constants.ModeGame;
import com.jagex.core.constants.Language;
import deob.ObfuscatedName;

@ObfuscatedName("aoz")
public class ParamTypeList extends CachingConfigTypeList {

	public ParamTypeList(ModeGame arg0, Language arg1, Js5 arg2) {
		super(arg0, arg1, arg2, Js5ConfigGroup.PARAMTYPE, 64, new BasicTypeFactory(ParamType.class));
	}
}
