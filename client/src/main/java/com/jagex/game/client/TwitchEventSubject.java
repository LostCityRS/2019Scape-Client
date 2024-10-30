package com.jagex.game.client;

import com.jagex.core.constants.SerializableEnum;
import com.jagex.game.config.vartype.constants.ScriptVarType;
import deob.ObfuscatedName;

@ObfuscatedName("ud")
public class TwitchEventSubject implements SerializableEnum, TwitchVar {

	@ObfuscatedName("ud.e")
	public static final TwitchEventSubject REPORT = new TwitchEventSubject(0, "", new ScriptVarType[] { ScriptVarType.INT, ScriptVarType.STRING });

	@ObfuscatedName("ud.n")
	public static final TwitchEventSubject RESULT = new TwitchEventSubject(1, "", new ScriptVarType[] { ScriptVarType.INT, ScriptVarType.INT });

	@ObfuscatedName("ud.m")
	public static final TwitchEventSubject CHAT_MESSAGE = new TwitchEventSubject(2, "", new ScriptVarType[] { ScriptVarType.STRING, ScriptVarType.STRING });

	@ObfuscatedName("ud.k")
	public static final TwitchEventSubject WEBCAM_DEVICE_INFO = new TwitchEventSubject(3, "", new ScriptVarType[] { ScriptVarType.INT, ScriptVarType.INT, ScriptVarType.STRING });

	@ObfuscatedName("ud.f")
	public final int serialID;

	@ObfuscatedName("ud.w")
	public final ScriptVarType[] types;

	public TwitchEventSubject(int arg0, String arg1, ScriptVarType[] arg2) {
		this.serialID = arg0;
		this.types = arg2;
		ScriptVarType[] var4 = this.types;
		int var5 = 0;
		while (var5 < var4.length) {
			ScriptVarType var6 = var4[var5];
			switch(var6.baseType.index) {
				case 1:
				case 2:
				case 3:
				case 4:
				default:
					var5++;
			}
		}
	}

	@ObfuscatedName("ud.n()I")
	public int getId() {
		return this.serialID;
	}
}
