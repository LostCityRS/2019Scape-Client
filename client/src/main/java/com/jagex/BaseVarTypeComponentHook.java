package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("qo")
public final class BaseVarTypeComponentHook implements BaseVarTypeCodec {

	@ObfuscatedName("qo.e(Lalw;I)Ljava/lang/Object;")
	public Object decode(Packet arg0) {
		return ComponentHook.method2679(arg0);
	}
}
