package com.jagex.game.config.vartype;

import com.jagex.game.config.ConfigTypeList;
import com.jagex.game.config.vartype.bit.VarBitType;
import com.jagex.game.config.vartype.constants.VarDomainType;
import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("js")
public final class VariableTypeProviderClient implements VariableTypeProvider {

	@ObfuscatedName("js.w(Lqe;II)Lec;")
	public VarType method695(VarDomainType arg0, int arg1) {
		return (VarType) ((ConfigTypeList) Statics.field1232.get(arg0)).list(arg1);
	}

	@ObfuscatedName("js.l(IB)Lkh;")
	public VarBitType method694(int arg0) {
		return (VarBitType) Statics.field8736.list(arg0);
	}
}
