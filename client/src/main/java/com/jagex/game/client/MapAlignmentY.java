package com.jagex.game.client;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("hy")
public class MapAlignmentY implements SerializableEnum {

	@ObfuscatedName("hy.e")
	public static final MapAlignmentY field2426 = new MapAlignmentY(1, 0);

	@ObfuscatedName("hy.n")
	public static final MapAlignmentY field2424 = new MapAlignmentY(2, 1);

	@ObfuscatedName("hy.m")
	public static final MapAlignmentY field2422 = new MapAlignmentY(0, 2);

	@ObfuscatedName("hy.k")
	public final int index;

	@ObfuscatedName("hy.f")
	public final int serialID;

	public MapAlignmentY(int index, int serialID) {
		this.index = index;
		this.serialID = serialID;
	}

    @ObfuscatedName("ace.e(I)[Lhy;")
    public static MapAlignmentY[] values() {
        return new MapAlignmentY[] {field2422, field2426, field2424};
    }

    @ObfuscatedName("hy.n()I")
	public int getId() {
		return this.serialID;
	}
}
