package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("zj")
public class class690 implements class685 {

	@ObfuscatedName("zj.e")
	public static final class690 field8318 = new class690(0, (byte) -1);

	@ObfuscatedName("zj.n")
	public static final class690 field8314 = new class690(1, (byte) 0);

	@ObfuscatedName("zj.m")
	public static final class690 field8315 = new class690(2, (byte) 1);

	@ObfuscatedName("zj.k")
	public static final class690 field8316 = new class690(3, (byte) 2);

	@ObfuscatedName("zj.f")
	public static final class690 field8317 = new class690(4, (byte) 3);

	@ObfuscatedName("zj.w")
	public final int field8320;

	@ObfuscatedName("zj.u")
	public byte field8313;

	@ObfuscatedName("zj.e(I)[Lzj;")
	public static class690[] method13901() {
		return new class690[] { field8318, field8314, field8315, field8316, field8317 };
	}

	public class690(int arg0, byte arg1) {
		this.field8320 = arg0;
		this.field8313 = arg1;
	}

	@ObfuscatedName("zj.n()I")
	public int method1303() {
		return this.field8313;
	}

	@ObfuscatedName("zj.m(B)I")
	public int method13906() {
		return this.field8313 + 1;
	}
}
