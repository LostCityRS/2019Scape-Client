package com.jagex.game.config.vartype;

import com.jagex.game.config.vartype.bit.VarBitType;
import com.jagex.game.config.vartype.constants.VarDomainType;
import deob.ObfuscatedName;

@ObfuscatedName("em")
public interface VariableTypeProvider {

	@ObfuscatedName("em.l(IB)Lkh;")
	VarBitType getVarBitType(int id);

	@ObfuscatedName("em.w(Lqe;II)Lec;")
	VarType getVarType(VarDomainType domainType, int id);
}
