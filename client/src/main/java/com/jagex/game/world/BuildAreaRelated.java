package com.jagex.game.world;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("il")
public class BuildAreaRelated implements SerializableEnum {

	@ObfuscatedName("il.e")
	public static final BuildAreaRelated field2669 = new BuildAreaRelated(0);

	@ObfuscatedName("il.n")
	public static final BuildAreaRelated field2667 = new BuildAreaRelated(1);

	@ObfuscatedName("il.m")
	public static final BuildAreaRelated field2668 = new BuildAreaRelated(2);

	@ObfuscatedName("il.k")
	public static final BuildAreaRelated field2670 = new BuildAreaRelated(3);

	@ObfuscatedName("il.f")
	public final int field2666;

	public BuildAreaRelated(int arg0) {
		this.field2666 = arg0;
	}

	@ObfuscatedName("il.n()I")
	public int getId() {
		return this.field2666;
	}
}
