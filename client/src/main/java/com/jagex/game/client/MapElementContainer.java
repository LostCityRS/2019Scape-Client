package com.jagex.game.client;

import com.jagex.core.datastruct.Node;
import com.jagex.game.world.WorldMapElement;
import deob.ObfuscatedName;

@ObfuscatedName("ajw")
public class MapElementContainer extends Node {

	@ObfuscatedName("ajw.k")
	public int field11251 = Integer.MAX_VALUE;

	@ObfuscatedName("ajw.f")
	public int field11249 = Integer.MIN_VALUE;

	@ObfuscatedName("ajw.w")
	public int field11246 = Integer.MAX_VALUE;

	@ObfuscatedName("ajw.l")
	public int field11248 = Integer.MIN_VALUE;

	@ObfuscatedName("ajw.u")
	public int field11244 = Integer.MAX_VALUE;

	@ObfuscatedName("ajw.z")
	public int field11247 = Integer.MIN_VALUE;

	@ObfuscatedName("ajw.p")
	public int field11250 = Integer.MAX_VALUE;

	@ObfuscatedName("ajw.d")
	public int field11245 = Integer.MIN_VALUE;

	@ObfuscatedName("ajw.c")
	public WorldMapElement field11252;

	public MapElementContainer(WorldMapElement arg0) {
		this.field11252 = arg0;
	}

	@ObfuscatedName("ajw.e(III)Z")
	public boolean method17518(int arg0, int arg1) {
		if (arg0 >= this.field11251 && arg0 <= this.field11249 && arg1 >= this.field11246 && arg1 <= this.field11248) {
			return true;
		} else {
			return arg0 >= this.field11244 && arg0 <= this.field11247 && arg1 >= this.field11250 && arg1 <= this.field11245;
		}
	}
}
