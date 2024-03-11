package com.jagex.game.config.flotype;

import com.jagex.*;
import com.jagex.game.config.Js5ConfigGroup;
import com.jagex.game.config.flotype.FloorOverlayType;
import deob.ObfuscatedName;

@ObfuscatedName("aoa")
public class FloorOverlayTypeList extends CachingConfigTypeList {

	public FloorOverlayTypeList(ModeGame arg0, Language arg1, Js5 arg2) {
		super(arg0, arg1, arg2, Js5ConfigGroup.FLOTYPE, 64, new BasicTypeFactory(FloorOverlayType.class));
	}
}
