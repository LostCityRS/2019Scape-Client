package com.jagex.game.config.idktype;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.game.config.CachingConfigTypeList;
import com.jagex.game.config.Js5ConfigGroup;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("aov")
public class IDKTypeList extends CachingConfigTypeList {

	public IDKTypeList(ModeGame modeGame, Language language, Js5 js5, Js5 factoryJs5) {
		super(modeGame, language, js5, Js5ConfigGroup.IDKTYPE, 64, new IDKTypeFactory(factoryJs5));
	}
}
