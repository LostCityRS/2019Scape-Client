package com.jagex.game.world;

import com.jagex.core.datastruct.Node;
import deob.ObfuscatedName;

@ObfuscatedName("akg")
public class WorldMapNode extends Node {

	@ObfuscatedName("akg.k")
	public int[] field11444;

	@ObfuscatedName("akg.f")
	public byte[] field11445;

	public WorldMapNode(int[] arg0, byte[] arg1) {
		this.field11444 = arg0;
		this.field11445 = arg1;
	}
}
