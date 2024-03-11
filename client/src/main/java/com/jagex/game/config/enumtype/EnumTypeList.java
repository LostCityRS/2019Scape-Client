package com.jagex.game.config.enumtype;

import com.jagex.BasicTypeFactory;
import com.jagex.CachingConfigTypeList;
import com.jagex.Js5;
import com.jagex.ModeGame;
import com.jagex.core.constants.Language;
import com.jagex.game.config.Js5ConfigGroup;
import deob.ObfuscatedName;

@ObfuscatedName("aoh")
public class EnumTypeList extends CachingConfigTypeList {

	public EnumTypeList(ModeGame arg0, Language arg1, Js5 arg2) {
		super(arg0, arg1, arg2, Js5ConfigGroup.ENUMTYPE, 128, new BasicTypeFactory(EnumType.class));
	}
}
