package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aiv")
public final class VarDomainTypeNpc extends VarDomainType {

	public VarDomainTypeNpc(Js5ConfigGroup arg0, int arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3, (VarDomainTypePlayer) null);
	}

	@ObfuscatedName("aiv.w(Lec;I)Ljava/lang/Object;")
	public Object method7212(class149 arg0) {
		return ScriptVarType.BOOLEAN == arg0.field1704 ? -1 : arg0.field1704.method7298();
	}
}
