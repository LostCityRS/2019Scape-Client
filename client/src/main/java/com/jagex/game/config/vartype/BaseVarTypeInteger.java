package com.jagex.game.config.vartype;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("qh")
public final class BaseVarTypeInteger implements BaseVarTypeCodec {

	@ObfuscatedName("qh.e(Lalw;I)Ljava/lang/Object;")
	public Object decode(Packet arg0) {
		return arg0.g4s();
	}
}
