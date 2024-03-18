package com.jagex.game.client;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("hp")
public class MapAlignmentX implements SerializableEnum {

	@ObfuscatedName("hp.e")
	public static final MapAlignmentX field2420 = new MapAlignmentX(1, 0);

	@ObfuscatedName("hp.n")
	public static final MapAlignmentX field2417 = new MapAlignmentX(2, 1);

	@ObfuscatedName("hp.m")
	public static final MapAlignmentX field2418 = new MapAlignmentX(0, 2);

	@ObfuscatedName("hp.k")
	public final int index;

	@ObfuscatedName("hp.f")
	public final int serialID;

	@ObfuscatedName("zv.e(B)[Lhp;")
	public static MapAlignmentX[] values() {
		return new MapAlignmentX[] { field2418, field2420, field2417 };
	}

	public MapAlignmentX(int index, int serialID) {
		this.index = index;
		this.serialID = serialID;
	}

	@ObfuscatedName("hp.n()I")
	public int getId() {
		return this.serialID;
	}
}
