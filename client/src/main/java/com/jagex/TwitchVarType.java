package com.jagex;

import com.jagex.core.constants.SerializableEnum;
import com.jagex.game.runetek5.config.vartype.constants.ScriptVarType;
import deob.ObfuscatedName;

@ObfuscatedName("ud")
public class TwitchVarType implements SerializableEnum, TwitchVar {

	@ObfuscatedName("ud.e")
	public static final TwitchVarType field7244 = new TwitchVarType(0, "", new ScriptVarType[] { ScriptVarType.INT, ScriptVarType.STRING});

	@ObfuscatedName("ud.n")
	public static final TwitchVarType field7243 = new TwitchVarType(1, "", new ScriptVarType[] { ScriptVarType.INT, ScriptVarType.INT});

	@ObfuscatedName("ud.m")
	public static final TwitchVarType field7247 = new TwitchVarType(2, "", new ScriptVarType[] { ScriptVarType.STRING, ScriptVarType.STRING});

	@ObfuscatedName("ud.k")
	public static final TwitchVarType field7245 = new TwitchVarType(3, "", new ScriptVarType[] { ScriptVarType.INT, ScriptVarType.INT, ScriptVarType.STRING});

	@ObfuscatedName("ud.f")
	public final int field7246;

	@ObfuscatedName("ud.w")
	public final ScriptVarType[] field7242;

	public TwitchVarType(int arg0, String arg1, ScriptVarType[] arg2) {
		this.field7246 = arg0;
		this.field7242 = arg2;
		ScriptVarType[] var4 = this.field7242;
		int var5 = 0;
		while (var5 < var4.length) {
			ScriptVarType var6 = var4[var5];
			switch(var6.baseType.id) {
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
		return this.field7246;
	}
}
