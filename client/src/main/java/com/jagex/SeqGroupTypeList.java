package com.jagex;

import com.jagex.game.config.Js5ConfigGroup;
import deob.ObfuscatedName;

@ObfuscatedName("aoo")
public class SeqGroupTypeList extends CachingConfigTypeList {

	public SeqGroupTypeList(ModeGame arg0, Language arg1, Js5 arg2) {
		super(arg0, arg1, arg2, Js5ConfigGroup.SEQGROUPTYPE, 64, new BasicTypeFactory(SeqGroupType.class));
	}
}
