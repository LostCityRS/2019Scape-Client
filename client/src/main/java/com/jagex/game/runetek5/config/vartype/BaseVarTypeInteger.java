package com.jagex.game.runetek5.config.vartype;

import com.jagex.Packet;
import com.jagex.game.runetek5.config.vartype.BaseVarTypeCodec;
import deob.ObfuscatedName;

@ObfuscatedName("qh")
public final class BaseVarTypeInteger implements BaseVarTypeCodec {

	@ObfuscatedName("qh.e(Lalw;I)Ljava/lang/Object;")
	public Object decode(Packet arg0) {
		return arg0.g4s();
	}
}
