package com.jagex.game.config.vartype;

import com.jagex.game.config.ConfigTypeList;
import com.jagex.game.config.vartype.bit.VarBitType;
import com.jagex.game.config.vartype.constants.VarDomainType;
import deob.ObfuscatedName;
import rs2.client.Client;

@ObfuscatedName("js")
public final class VariableTypeProviderClient implements VariableTypeProvider {

	@ObfuscatedName("js.w(Lqe;II)Lec;")
	public VarType getVarType(VarDomainType domainType, int id) {
		return (VarType) ((ConfigTypeList) Client.varDomainToListEnumMap.get(domainType)).list(id);
	}

	@ObfuscatedName("js.l(IB)Lkh;")
	public VarBitType getVarBitType(int id) {
		return (VarBitType) Client.varBitTypeList.list(id);
	}
}
