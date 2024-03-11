package com.jagex.game.runetek5.config.vartype;

import com.jagex.CoordFine;
import com.jagex.core.io.Packet;
import deob.ObfuscatedName;

@ObfuscatedName("qm")
public final class BaseVarTypeCoordFine implements BaseVarTypeCodec {

	@ObfuscatedName("qm.e(Lalw;I)Ljava/lang/Object;")
	public Object decode(Packet arg0) {
		return new CoordFine(arg0);
	}
}
