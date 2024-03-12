package com.jagex.game.config.vartype.bit;

import com.jagex.core.constants.Language;
import com.jagex.core.constants.ModeGame;
import com.jagex.game.config.CachingConfigTypeList;
import com.jagex.game.config.Js5ConfigGroup;
import com.jagex.js5.Js5;
import deob.ObfuscatedName;

import java.util.Map;

@ObfuscatedName("aor")
public class VarBitTypeList extends CachingConfigTypeList {

	public VarBitTypeList(ModeGame arg0, Language arg1, Js5 arg2, Map arg3) {
		super(arg0, arg1, arg2, Js5ConfigGroup.VAR_BIT, 64, new BasicVarBitTypeFactory(arg3));
	}
}
