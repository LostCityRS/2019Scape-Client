package com.jagex.game.config.vartype;

import com.jagex.game.config.Js5ConfigGroup;
import com.jagex.game.config.vartype.constants.ScriptVarType;
import com.jagex.game.config.vartype.constants.VarDomainType;
import deob.ObfuscatedName;

@ObfuscatedName("aib")
public final class VarDomainTypePlayer extends VarDomainType {

	public VarDomainTypePlayer(Js5ConfigGroup arg0, int arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3, (VarDomainTypePlayer) null);
	}

	@ObfuscatedName("aib.w(Lec;I)Ljava/lang/Object;")
	public Object getDefaultValue(VarType arg0) {
		return ScriptVarType.BOOLEAN == arg0.dataType ? -1 : arg0.dataType.getDefaultValue();
	}
}
