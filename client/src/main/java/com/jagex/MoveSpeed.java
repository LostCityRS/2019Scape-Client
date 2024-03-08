package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("zj")
public class MoveSpeed implements SerializableEnum {

	@ObfuscatedName("zj.e")
	public static final MoveSpeed field8318 = new MoveSpeed(0, (byte) -1);

	@ObfuscatedName("zj.n")
	public static final MoveSpeed field8314 = new MoveSpeed(1, (byte) 0);

	@ObfuscatedName("zj.m")
	public static final MoveSpeed field8315 = new MoveSpeed(2, (byte) 1);

	@ObfuscatedName("zj.k")
	public static final MoveSpeed field8316 = new MoveSpeed(3, (byte) 2);

	@ObfuscatedName("zj.f")
	public static final MoveSpeed field8317 = new MoveSpeed(4, (byte) 3);

	@ObfuscatedName("zj.w")
	public final int field8320;

	@ObfuscatedName("zj.u")
	public byte field8313;

	@ObfuscatedName("zj.e(I)[Lzj;")
	public static MoveSpeed[] method13901() {
		return new MoveSpeed[] { field8318, field8314, field8315, field8316, field8317 };
	}

	public MoveSpeed(int arg0, byte arg1) {
		this.field8320 = arg0;
		this.field8313 = arg1;
	}

	@ObfuscatedName("zj.n()I")
	public int getId() {
		return this.field8313;
	}

	@ObfuscatedName("zj.m(B)I")
	public int method13906() {
		return this.field8313 + 1;
	}
}
