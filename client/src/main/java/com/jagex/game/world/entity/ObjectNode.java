package com.jagex.game.world.entity;

import com.jagex.core.datastruct.Node;
import deob.ObfuscatedName;

@ObfuscatedName("ake")
public class ObjectNode extends Node {

	@ObfuscatedName("ake.k")
	public final Object value;

	public ObjectNode(Object value) {
		this.value = value;
	}
}
