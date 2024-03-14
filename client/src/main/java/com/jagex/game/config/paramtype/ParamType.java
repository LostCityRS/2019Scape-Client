package com.jagex.game.config.paramtype;

import com.jagex.core.datastruct.SerializableEnums;
import com.jagex.core.io.Packet;
import com.jagex.game.client.ConfigRelated;
import com.jagex.game.config.ConfigType;
import com.jagex.game.config.vartype.constants.ScriptVarType;
import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("adp")
public class ParamType implements ConfigType, ConfigRelated {

	@ObfuscatedName("adp.e")
	public ScriptVarType type;

	@ObfuscatedName("adp.n")
	public int defaultInt;

	@ObfuscatedName("adp.m")
	public String defaultString;

	@ObfuscatedName("adp.k")
	public boolean autodisable = true;

	@ObfuscatedName("adp.e(Lalw;B)V")
	public void decode(Packet buf) {
		while (true) {
			int var2 = buf.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(buf, var2);
		}
	}

	@ObfuscatedName("adp.u(Lalw;II)V")
	public void decode(Packet buf, int code) {
		if (code == 1) {
			char c = Statics.byteToCp1252Char(buf.g1b());
			this.type = ScriptVarType.getDefault(c);
		} else if (code == 2) {
			this.defaultInt = buf.g4s();
		} else if (code == 4) {
			this.autodisable = false;
		} else if (code == 5) {
			this.defaultString = buf.gjstr();
		} else if (code == 101) {
			this.type = (ScriptVarType) SerializableEnums.decode(ScriptVarType.method7293(), buf.gSmart1or2());
		}
	}

	@ObfuscatedName("adp.p(I)Z")
	public boolean isStringType() {
		return ScriptVarType.STRING == this.type;
	}

	@ObfuscatedName("adp.n(I)V")
	public void postDecode() {
	}

	@ObfuscatedName("adp.z(IB)V")
	public void method2998(int arg0) {
	}
}