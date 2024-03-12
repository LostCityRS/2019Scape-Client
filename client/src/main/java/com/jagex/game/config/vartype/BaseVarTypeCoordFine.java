package com.jagex.game.config.vartype;

import com.jagex.core.io.Packet;
import com.jagex.game.shared.movement.CoordFine;
import deob.ObfuscatedName;

@ObfuscatedName("qm")
public final class BaseVarTypeCoordFine implements BaseVarTypeCodec {

	@ObfuscatedName("qm.e(Lalw;I)Ljava/lang/Object;")
	public Object decode(Packet arg0) {
		return new CoordFine(arg0);
	}
}
