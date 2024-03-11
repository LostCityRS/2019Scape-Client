package com.jagex.game.runetek5.config.skydecortype;

import com.jagex.game.runetek5.config.BasicTypeFactory;
import com.jagex.game.runetek5.config.CachingConfigTypeList;
import com.jagex.game.runetek5.config.Js5ConfigGroup;
import com.jagex.js5.Js5;
import com.jagex.core.constants.ModeGame;
import com.jagex.core.constants.Language;
import deob.ObfuscatedName;

@ObfuscatedName("aok")
public class SkyDecorTypeList extends CachingConfigTypeList {

	public SkyDecorTypeList(ModeGame arg0, Language arg1, Js5 arg2) {
		super(arg0, arg1, arg2, Js5ConfigGroup.SKYDECORTYPE, 16, new BasicTypeFactory(SkyDecorType.class));
	}
}
