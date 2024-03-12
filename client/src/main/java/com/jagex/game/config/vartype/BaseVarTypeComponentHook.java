package com.jagex.game.config.vartype;

import com.jagex.core.io.Packet;
import com.jagex.game.client.ComponentHook;
import deob.ObfuscatedName;

@ObfuscatedName("qo")
public final class BaseVarTypeComponentHook implements BaseVarTypeCodec {

	@ObfuscatedName("qo.e(Lalw;I)Ljava/lang/Object;")
	public Object decode(Packet arg0) {
		return ComponentHook.method2679(arg0);
	}
}
