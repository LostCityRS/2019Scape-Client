package com.jagex.game.runetek5.config.vartype.bit;

import com.jagex.game.runetek5.config.BasicVarBitTypeFactory;
import com.jagex.game.runetek5.config.CachingConfigTypeList;
import com.jagex.game.runetek5.config.Js5ConfigGroup;
import com.jagex.js5.Js5;
import com.jagex.core.constants.ModeGame;
import com.jagex.core.constants.Language;
import deob.ObfuscatedName;

import java.util.Map;

@ObfuscatedName("aor")
public class VarBitTypeList extends CachingConfigTypeList {

	public VarBitTypeList(ModeGame arg0, Language arg1, Js5 arg2, Map arg3) {
		super(arg0, arg1, arg2, Js5ConfigGroup.VAR_BIT, 64, new BasicVarBitTypeFactory(arg3));
	}
}
