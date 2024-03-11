package com.jagex.game.config.vartype.general;

import com.jagex.core.io.Packet;
import com.jagex.game.config.vartype.VarType;
import com.jagex.game.config.vartype.constants.VarDomainType;
import deob.ObfuscatedName;

@ObfuscatedName("afv")
public class VarBasicType extends VarType {

	public VarBasicType(VarDomainType arg0, int arg1) {
		super(arg0, arg1);
	}

	@ObfuscatedName("afv.u(Lalw;IS)V")
	public void decode(Packet arg0, int arg1) {
	}

	@ObfuscatedName("afv.n(I)V")
	public void postDecode() {
	}
}
