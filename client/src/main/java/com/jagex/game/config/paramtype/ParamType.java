package com.jagex.game.config.paramtype;

import com.jagex.game.client.ConfigRelated;
import com.jagex.core.io.Packet;
import com.jagex.core.datastruct.SerializableEnums;
import com.jagex.game.config.ConfigType;
import com.jagex.game.config.vartype.constants.ScriptVarType;
import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("adp")
public class ParamType implements ConfigType, ConfigRelated {

	@ObfuscatedName("adp.e")
	public ScriptVarType field9173;

	@ObfuscatedName("adp.n")
	public int field9172;

	@ObfuscatedName("adp.m")
	public String field9171;

	@ObfuscatedName("adp.k")
	public boolean field9174 = true;

	@ObfuscatedName("adp.e(Lalw;B)V")
	public void decode(Packet arg0) {
		while (true) {
			int var2 = arg0.g1();
			if (var2 == 0) {
				return;
			}
			this.method15151(arg0, var2);
		}
	}

	@ObfuscatedName("adp.u(Lalw;II)V")
	public void method15151(Packet arg0, int arg1) {
		if (arg1 == 1) {
			char var3 = Statics.method9576(arg0.g1b());
			this.field9173 = Statics.method7300(var3);
		} else if (arg1 == 2) {
			this.field9172 = arg0.g4s();
		} else if (arg1 == 4) {
			this.field9174 = false;
		} else if (arg1 == 5) {
			this.field9171 = arg0.gjstr();
		} else if (arg1 == 101) {
			this.field9173 = (ScriptVarType) SerializableEnums.decode(ScriptVarType.method7293(), arg0.gSmart1or2());
		}
	}

	@ObfuscatedName("adp.p(I)Z")
	public boolean method15152() {
		return ScriptVarType.STRING == this.field9173;
	}

	@ObfuscatedName("adp.n(I)V")
	public void postDecode() {
	}

	@ObfuscatedName("adp.z(IB)V")
	public void method2998(int arg0) {
	}
}
