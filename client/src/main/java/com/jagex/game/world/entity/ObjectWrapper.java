package com.jagex.game.world.entity;

import com.jagex.core.datastruct.Node;
import deob.ObfuscatedName;

@ObfuscatedName("ake")
public class ObjectWrapper extends Node {

	@ObfuscatedName("ake.k")
	public final Object value;

	public ObjectWrapper(Object value) {
		this.value = value;
	}
}
