package com.jagex.game.config.vartype;

import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("qs")
public final class BaseVarTypeLong implements BaseVarTypeCodec {

	@ObfuscatedName("qs.e(Lalw;I)Ljava/lang/Object;")
	public Object decode(Packet arg0) {
		return arg0.g8();
	}
}
