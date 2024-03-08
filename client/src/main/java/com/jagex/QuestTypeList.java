package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("apw")
public class QuestTypeList extends ConfigTypeListPreload {

	public QuestTypeList(ModeGame arg0, Language arg1, Js5 arg2, boolean arg3) {
		super(arg0, arg1, Js5ConfigGroup.QUESTTYPE, arg2, new QuestTypeFactory(), arg3);
	}

	@ObfuscatedName("apw.n(I)I")
	public int size() {
		return this.field8848;
	}
}
