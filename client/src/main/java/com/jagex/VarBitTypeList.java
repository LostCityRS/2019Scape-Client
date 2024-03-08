package com.jagex;

import deob.ObfuscatedName;

import java.util.Map;

@ObfuscatedName("aor")
public class VarBitTypeList extends class758 {

	public VarBitTypeList(ModeGame arg0, Language arg1, Js5 arg2, Map arg3) {
		super(arg0, arg1, arg2, Js5ConfigGroup.VAR_BIT, 64, new VarBitTypeFactory(arg3));
	}
}
