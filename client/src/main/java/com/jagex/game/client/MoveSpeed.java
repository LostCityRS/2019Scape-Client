package com.jagex.game.client;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("zj")
public class MoveSpeed implements SerializableEnum {

	@ObfuscatedName("zj.e")
	public static final MoveSpeed STATIONARY = new MoveSpeed(0, (byte) -1);

	@ObfuscatedName("zj.n")
	public static final MoveSpeed CRAWL = new MoveSpeed(1, (byte) 0);

	@ObfuscatedName("zj.m")
	public static final MoveSpeed WALK = new MoveSpeed(2, (byte) 1);

	@ObfuscatedName("zj.k")
	public static final MoveSpeed RUN = new MoveSpeed(3, (byte) 2);

	@ObfuscatedName("zj.f")
	public static final MoveSpeed INSTANT = new MoveSpeed(4, (byte) 3);

	@ObfuscatedName("zj.w")
	public final int index;

	@ObfuscatedName("zj.u")
	public byte serialID;

	@ObfuscatedName("zj.e(I)[Lzj;")
	public static MoveSpeed[] values() {
		return new MoveSpeed[] {STATIONARY, CRAWL, WALK, RUN, INSTANT};
	}

	public MoveSpeed(int index, byte serialID) {
		this.index = index;
		this.serialID = serialID;
	}

	@ObfuscatedName("zj.n()I")
	public int getId() {
		return this.serialID;
	}

	@ObfuscatedName("zj.m(B)I")
	public int method13906() {
		return this.serialID + 1;
	}
}
