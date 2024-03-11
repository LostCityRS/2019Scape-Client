package com.jagex.game.runetek5.config.vartype.bit;

import com.jagex.game.runetek5.config.ConfigTypeFactory;
import deob.ObfuscatedName;

import java.util.Map;

@ObfuscatedName("ka")
public abstract class VarBitTypeFactory implements ConfigTypeFactory {

	@ObfuscatedName("ka.e")
	public final Map listContainer;

	public VarBitTypeFactory(Map arg0) {
		this.listContainer = arg0;
	}
}
