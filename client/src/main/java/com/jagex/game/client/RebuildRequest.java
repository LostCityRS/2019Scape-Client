package com.jagex.game.client;

import com.jagex.core.io.PacketBit;
import deob.ObfuscatedName;

@ObfuscatedName("rt")
public class RebuildRequest {

	@ObfuscatedName("rt.e")
	public RebuildType rebuildType;

	@ObfuscatedName("rt.n")
	public PacketBit buf;

	public RebuildRequest(RebuildType rebuildType, PacketBit buf) {
		this.rebuildType = rebuildType;
		this.buf = buf;
	}
}
