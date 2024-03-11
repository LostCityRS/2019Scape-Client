package com.jagex.game.config.vartype.bit;

import com.jagex.BasicVarBitTypeFactory;
import com.jagex.CachingConfigTypeList;
import com.jagex.Js5;
import com.jagex.ModeGame;
import com.jagex.core.constants.Language;
import com.jagex.game.config.Js5ConfigGroup;
import deob.ObfuscatedName;

import java.util.Map;

@ObfuscatedName("aor")
public class VarBitTypeList extends CachingConfigTypeList {

	public VarBitTypeList(ModeGame arg0, Language arg1, Js5 arg2, Map arg3) {
		super(arg0, arg1, arg2, Js5ConfigGroup.VAR_BIT, 64, new BasicVarBitTypeFactory(arg3));
	}
}
