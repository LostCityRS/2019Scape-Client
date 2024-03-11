package com.jagex.game.runetek5.config.vartype;

import com.jagex.ComponentHook;
import com.jagex.Packet;
import com.jagex.game.runetek5.config.vartype.BaseVarTypeCodec;
import deob.ObfuscatedName;

@ObfuscatedName("qo")
public final class BaseVarTypeComponentHook implements BaseVarTypeCodec {

	@ObfuscatedName("qo.e(Lalw;I)Ljava/lang/Object;")
	public Object decode(Packet arg0) {
		return ComponentHook.method2679(arg0);
	}
}
