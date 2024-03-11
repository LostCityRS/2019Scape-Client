package com.jagex.game.runetek5.config.vartype;

import com.jagex.game.runetek5.config.Js5ConfigGroup;
import com.jagex.game.runetek5.config.vartype.VarDomainTypePlayer;
import com.jagex.game.runetek5.config.vartype.VarType;
import com.jagex.game.runetek5.config.vartype.constants.ScriptVarType;
import com.jagex.game.runetek5.config.vartype.constants.VarDomainType;
import deob.ObfuscatedName;

@ObfuscatedName("aip")
public final class VarDomainTypeWorld extends VarDomainType {

	public VarDomainTypeWorld(Js5ConfigGroup arg0, int arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3, (VarDomainTypePlayer) null);
	}

	@ObfuscatedName("aip.w(Lec;I)Ljava/lang/Object;")
	public Object getDefaultValue(VarType arg0) {
		return ScriptVarType.BOOLEAN == arg0.dataType ? -1 : arg0.dataType.getDefaultValue();
	}
}
