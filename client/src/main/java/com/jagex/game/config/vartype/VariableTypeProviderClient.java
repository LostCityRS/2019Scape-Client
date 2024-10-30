package com.jagex.game.config.vartype;

import com.jagex.game.config.ConfigTypeList;
import com.jagex.game.config.vartype.bit.VarBitType;
import com.jagex.game.config.vartype.constants.VarDomainType;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("js")
public class VariableTypeProviderClient implements VariableTypeProvider {

	@ObfuscatedName("js.w(Lqe;II)Lec;")
	public VarType getVarType(VarDomainType arg0, int arg1) {
		return (VarType) ((ConfigTypeList) Client.varDomainToListEnumMap.get(arg0)).list(arg1);
	}

	@ObfuscatedName("js.l(IB)Lkh;")
	public VarBitType getVarBitType(int arg0) {
		return (VarBitType) Client.varBitTypeList.list(arg0);
	}
}
