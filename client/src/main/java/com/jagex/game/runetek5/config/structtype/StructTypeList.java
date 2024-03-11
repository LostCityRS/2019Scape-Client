package com.jagex.game.runetek5.config.structtype;

import com.jagex.game.runetek5.config.BasicTypeFactory;
import com.jagex.js5.ConfigTypeListPreload;
import com.jagex.game.runetek5.config.Js5ConfigGroup;
import com.jagex.js5.Js5;
import com.jagex.core.constants.ModeGame;
import com.jagex.core.constants.Language;
import deob.ObfuscatedName;

@ObfuscatedName("ape")
public class StructTypeList extends ConfigTypeListPreload {

	public StructTypeList(ModeGame arg0, Language arg1, Js5 arg2, boolean arg3) {
		super(arg0, arg1, Js5ConfigGroup.STRUCTTYPE, arg2, new BasicTypeFactory(StructType.class), arg3);
	}
}
