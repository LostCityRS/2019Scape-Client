package com.jagex.game.config.seqgrouptype;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.game.config.BasicTypeFactory;
import com.jagex.game.config.CachingConfigTypeList;
import com.jagex.game.config.Js5ConfigGroup;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

@ObfuscatedName("aoo")
public class SeqGroupTypeList extends CachingConfigTypeList {

	public SeqGroupTypeList(ModeGame arg0, Language arg1, Js5 arg2) {
		super(arg0, arg1, arg2, Js5ConfigGroup.SEQGROUPTYPE, 64, new BasicTypeFactory(SeqGroupType.class));
	}
}
