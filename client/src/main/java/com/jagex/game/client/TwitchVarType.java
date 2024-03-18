package com.jagex.game.client;

import com.jagex.core.constants.SerializableEnum;
import com.jagex.game.config.vartype.constants.ScriptVarType;
import deob.ObfuscatedName;

@ObfuscatedName("ud")
public class TwitchVarType implements SerializableEnum, TwitchVar {

	@ObfuscatedName("ud.e")
	public static final TwitchVarType REPORT = new TwitchVarType(0, "", new ScriptVarType[] { ScriptVarType.INT, ScriptVarType.STRING});

	@ObfuscatedName("ud.n")
	public static final TwitchVarType RESULT = new TwitchVarType(1, "", new ScriptVarType[] { ScriptVarType.INT, ScriptVarType.INT});

	@ObfuscatedName("ud.m")
	public static final TwitchVarType CHAT_MESSAGE = new TwitchVarType(2, "", new ScriptVarType[] { ScriptVarType.STRING, ScriptVarType.STRING});

	@ObfuscatedName("ud.k")
	public static final TwitchVarType field7245 = new TwitchVarType(3, "", new ScriptVarType[] { ScriptVarType.INT, ScriptVarType.INT, ScriptVarType.STRING});

	@ObfuscatedName("ud.f")
	public final int serialID;

	@ObfuscatedName("ud.w")
	public final ScriptVarType[] types;

	public TwitchVarType(int serialID, String arg1, ScriptVarType[] types) {
		this.serialID = serialID;
		this.types = types;
		ScriptVarType[] varTypes = this.types;
		int index = 0;
		while (index < varTypes.length) {
			ScriptVarType scriptType = varTypes[index];
			switch(scriptType.baseType.index) {
				case 1:
				case 2:
				case 3:
				case 4:
				default:
					index++;
			}
		}
	}

	@ObfuscatedName("ud.n()I")
	public int getId() {
		return this.serialID;
	}
}
