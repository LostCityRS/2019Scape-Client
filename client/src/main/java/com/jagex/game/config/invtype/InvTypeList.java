package com.jagex.game.config.invtype;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.game.config.BasicTypeFactory;
import com.jagex.game.config.CachingConfigTypeList;
import com.jagex.game.config.Js5ConfigGroup;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("api")
public class InvTypeList extends CachingConfigTypeList {

	public InvTypeList(ModeGame modeGame, Language language, Js5 js5) {
		super(modeGame, language, js5, Js5ConfigGroup.INVTYPE, 64, new BasicTypeFactory(InvType.class));
	}
}
