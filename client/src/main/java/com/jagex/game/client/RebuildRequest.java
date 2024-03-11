package com.jagex.game.client;

import com.jagex.core.io.PacketBit;
import deob.ObfuscatedName;

@ObfuscatedName("rt")
public class RebuildRequest {

	@ObfuscatedName("rt.e")
	public RebuildType field5017;

	@ObfuscatedName("rt.n")
	public PacketBit field5016;

	public RebuildRequest(RebuildType arg0, PacketBit arg1) {
		this.field5017 = arg0;
		this.field5016 = arg1;
	}
}
