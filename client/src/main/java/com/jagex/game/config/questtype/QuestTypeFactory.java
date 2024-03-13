package com.jagex.game.config.questtype;

import com.jagex.game.config.ConfigType;
import com.jagex.game.config.ConfigTypeFactory;
import com.jagex.game.config.ConfigTypeList;
import deob.ObfuscatedName;

@ObfuscatedName("in")
public class QuestTypeFactory implements ConfigTypeFactory {

	@ObfuscatedName("in.v(ILao;I)Lay;")
	public ConfigType create(int id, ConfigTypeList configTypeList) {
		return new QuestType(id, configTypeList);
	}

	@ObfuscatedName("in.o(B)Ljava/lang/Class;")
	public Class type() {
		return QuestType.class;
	}
}
