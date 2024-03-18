package com.jagex.game.config.structtype;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.game.config.BasicTypeFactory;
import com.jagex.game.config.Js5ConfigGroup;
import com.jagex.js5.ConfigTypeListPreload;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("ape")
public class StructTypeList extends ConfigTypeListPreload {

	public StructTypeList(ModeGame modeGame, Language language, Js5 configClient, boolean preload) {
		super(modeGame, language, Js5ConfigGroup.STRUCTTYPE, configClient, new BasicTypeFactory(StructType.class), preload);
	}
}
