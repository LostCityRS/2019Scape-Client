package com.jagex.game.config.questtype;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.game.config.Js5ConfigGroup;
import com.jagex.js5.ConfigTypeListPreload;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("apw")
public class QuestTypeList extends ConfigTypeListPreload {

	public QuestTypeList(ModeGame arg0, Language arg1, Js5 arg2, boolean arg3) {
		super(arg0, arg1, Js5ConfigGroup.QUESTTYPE, arg2, new QuestTypeFactory(), arg3);
	}

	@ObfuscatedName("apw.n(I)I")
	public int length() {
		return this.field8848;
	}
}
