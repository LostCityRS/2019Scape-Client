package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("qf")
public final class BaseVarTypeString implements BaseVarTypeCodec {

	@ObfuscatedName("qf.e(Lalw;I)Ljava/lang/Object;")
	public Object decode(Packet arg0) {
		return arg0.gjstr();
	}
}
