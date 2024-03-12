package com.jagex.game.config.flutype;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.game.config.BasicTypeFactory;
import com.jagex.game.config.CachingConfigTypeList;
import com.jagex.game.config.Js5ConfigGroup;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("aoe")
public class FloorUnderlayTypeList extends CachingConfigTypeList {

	public FloorUnderlayTypeList(ModeGame arg0, Language arg1, Js5 arg2) {
		super(arg0, arg1, arg2, Js5ConfigGroup.FLUTYPE, 128, new BasicTypeFactory(FloorUnderlayType.class));
	}
}
