package com.jagex.game.config.paramtype;

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
	public void decode(Packet buf) {
		while (true) {
			int code = buf.g1();
			if (code == 0) {
				return;
			}
			this.decode(buf, code);
		}
	}

	@ObfuscatedName("adp.u(Lalw;II)V")
	public void decode(Packet buf, int code) {
		if (code == 1) {
			char c = Cp1252.byteToCp1252Char(buf.g1b());
			this.type = ScriptVarType.getByLegacyChar(c);
		} else if (code == 2) {
			this.defaultint = buf.g4s();
		} else if (code == 4) {
			this.autodisable = false;
		} else if (code == 5) {
			this.defaultstr = buf.gjstr();
		} else if (code == 101) {
			this.type = (ScriptVarType) SerializableEnums.decode(ScriptVarType.values(), buf.gSmart1or2());
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
