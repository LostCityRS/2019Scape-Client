package com.jagex.game.group;

import com.jagex.game.config.defaults.SkillDefaults;
import com.jagex.game.config.vartype.VarTypeList;
import com.jagex.game.config.vartype.bit.VarBitTypeList;
import deob.ObfuscatedName;

@ObfuscatedName("gu")
public interface PlayerGroupResourceProvider {

	@ObfuscatedName("gu.n(B)Ladd;")
	VarTypeList getVarPlayerGroupTypeList();

	@ObfuscatedName("gu.m(I)Laor;")
	VarBitTypeList getVarBitTypeList();

	@ObfuscatedName("gu.k(B)Lwq;")
	SkillDefaults getSkillDefaults();

	@ObfuscatedName("gu.e(B)Ladd;")
    VarTypeList getVarPlayerTypeList();
}
