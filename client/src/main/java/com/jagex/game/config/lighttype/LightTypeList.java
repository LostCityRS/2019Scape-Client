package com.jagex.game.config.lighttype;

import com.jagex.BasicTypeFactory;
import com.jagex.CachingConfigTypeList;
import com.jagex.js5.Js5;
import com.jagex.core.constants.ModeGame;
import com.jagex.core.constants.Language;
import com.jagex.game.config.Js5ConfigGroup;
import deob.ObfuscatedName;

@ObfuscatedName("aoq")
public class LightTypeList extends CachingConfigTypeList {

	public LightTypeList(ModeGame arg0, Language arg1, Js5 arg2) {
		super(arg0, arg1, arg2, Js5ConfigGroup.LIGHTTYPE, 64, new BasicTypeFactory(LightType.class));
	}
}
