package com.jagex.game.config.questtype;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.game.config.Js5ConfigGroup;
import com.jagex.js5.ConfigTypeListPreload;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("apw")
public class QuestTypeList extends ConfigTypeListPreload {

	public QuestTypeList(ModeGame modeGame, Language language, Js5 configClient, boolean preload) {
		super(modeGame, language, Js5ConfigGroup.QUESTTYPE, configClient, new QuestTypeFactory(), preload);
	}

	@ObfuscatedName("apw.n(I)I")
	public int length() {
		return this.num;
	}
}
