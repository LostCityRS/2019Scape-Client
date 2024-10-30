package com.jagex.game.config.paramtype;

import com.jagex.core.constants.SerializableEnum;
import com.jagex.core.datastruct.SerializableEnums;
import com.jagex.core.io.Packet;
import com.jagex.core.utils.Cp1252;
import com.jagex.game.client.MutableConfig;
import com.jagex.game.config.ConfigType;
import com.jagex.game.config.vartype.constants.ScriptVarType;
import deob.ObfuscatedName;

@ObfuscatedName("adp")
public class ParamType implements ConfigType, MutableConfig {

	@ObfuscatedName("adp.e")
	public ScriptVarType type;

	@ObfuscatedName("adp.n")
	public int defaultint;

	@ObfuscatedName("adp.m")
	public String defaultstr;

	@ObfuscatedName("adp.k")
	public boolean autodisable = true;

	@ObfuscatedName("adp.e(Lalw;B)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.decode(arg0, var2);
		}
	}

	@ObfuscatedName("adp.u(Lalw;II)V")
	public void decode(Packet arg0, int arg1) {
		if (arg1 == 1) {
			char var3 = Cp1252.byteToCp1252Char(arg0.g1b());
			this.type = ScriptVarType.getByLegacyChar(var3);
		} else if (arg1 == 2) {
			this.defaultint = arg0.g4s();
		} else if (arg1 == 4) {
			this.autodisable = false;
		} else if (arg1 == 5) {
			this.defaultstr = arg0.gjstr();
		} else if (arg1 == 101) {
			this.type = (ScriptVarType) SerializableEnums.decode((SerializableEnum[]) ScriptVarType.values(), arg0.gSmart1or2());
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
	public void setId(int arg0) {
	}
}
