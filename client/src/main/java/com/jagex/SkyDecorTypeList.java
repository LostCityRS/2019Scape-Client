package com.jagex;

import com.jagex.core.constants.Language;
import com.jagex.game.config.Js5ConfigGroup;
import deob.ObfuscatedName;

@ObfuscatedName("aok")
public class SkyDecorTypeList extends CachingConfigTypeList {

	public SkyDecorTypeList(ModeGame arg0, Language arg1, Js5 arg2) {
		super(arg0, arg1, arg2, Js5ConfigGroup.SKYDECORTYPE, 16, new BasicTypeFactory(SkyDecorType.class));
	}
}
