package com.jagex.game.client;

import com.jagex.core.io.PacketBit;
import deob.ObfuscatedName;

@ObfuscatedName("rt")
public class RebuildRequest {

	@ObfuscatedName("rt.e")
	public RebuildType rebuildType;

	@ObfuscatedName("rt.n")
	public PacketBit buf;

	public RebuildRequest(RebuildType arg0, PacketBit arg1) {
		this.rebuildType = arg0;
		this.buf = arg1;
	}
}
