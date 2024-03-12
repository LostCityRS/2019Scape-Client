package com.jagex.game.config.vartype;

import com.jagex.game.config.vartype.bit.VarBitType;
import deob.ObfuscatedName;

@ObfuscatedName("ep")
public interface VarIntDomain {

	@ObfuscatedName("ep.z(Lkh;I)I")
	int getVarBitValue(VarBitType arg0);

	@ObfuscatedName("ep.u(Lec;I)I")
	int getVarValueInt(VarType arg0);
}
