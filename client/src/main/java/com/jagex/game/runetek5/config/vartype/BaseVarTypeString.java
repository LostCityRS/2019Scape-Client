package com.jagex.game.runetek5.config.vartype;

import com.jagex.Packet;
import com.jagex.game.runetek5.config.vartype.BaseVarTypeCodec;
import deob.ObfuscatedName;

@ObfuscatedName("qf")
public final class BaseVarTypeString implements BaseVarTypeCodec {

	@ObfuscatedName("qf.e(Lalw;I)Ljava/lang/Object;")
	public Object decode(Packet arg0) {
		return arg0.gjstr();
	}
}
