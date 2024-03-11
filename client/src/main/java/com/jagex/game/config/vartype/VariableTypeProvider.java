package com.jagex.game.config.vartype;

import com.jagex.game.config.vartype.bit.VarBitType;
import com.jagex.game.config.vartype.constants.VarDomainType;
import deob.ObfuscatedName;

@ObfuscatedName("em")
public interface VariableTypeProvider {

	@ObfuscatedName("em.l(IB)Lkh;")
	VarBitType method694(int arg0);

	@ObfuscatedName("em.w(Lqe;II)Lec;")
	VarType method695(VarDomainType arg0, int arg1);
}
