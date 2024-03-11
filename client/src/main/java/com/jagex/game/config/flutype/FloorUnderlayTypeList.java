package com.jagex.game.config.flutype;

import com.jagex.*;
import com.jagex.game.config.Js5ConfigGroup;
import com.jagex.game.config.flutype.FloorUnderlayType;
import deob.ObfuscatedName;

@ObfuscatedName("aoe")
public class FloorUnderlayTypeList extends CachingConfigTypeList {

	public FloorUnderlayTypeList(ModeGame arg0, Language arg1, Js5 arg2) {
		super(arg0, arg1, arg2, Js5ConfigGroup.FLUTYPE, 128, new BasicTypeFactory(FloorUnderlayType.class));
	}
}
