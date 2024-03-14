package com.jagex.graphics;

import deob.ObfuscatedName;

@ObfuscatedName("iw")
public class DrawDistance {

	@ObfuscatedName("iw.e")
	public static final DrawDistance field2671 = new DrawDistance(0, 4);

	@ObfuscatedName("iw.n")
	public static final DrawDistance field2672 = new DrawDistance(1, 5);

	@ObfuscatedName("iw.m")
	public static final DrawDistance field2673 = new DrawDistance(2, 6);

	@ObfuscatedName("iw.k")
	public final int field2674;

	@ObfuscatedName("iw.f")
	public final int field2675;

	@ObfuscatedName("aoz.e(B)[Liw;")
	public static DrawDistance[] method18920() {
		return new DrawDistance[] { field2671, field2672, field2673 };
	}

	public DrawDistance(int arg0, int arg1) {
		this.field2674 = arg0;
		this.field2675 = arg1 * 8;
	}

	@ObfuscatedName("ajy.n(IB)Liw;")
	public static DrawDistance method17395(int arg0) {
		DrawDistance[] var1 = method18920();
		for (int var2 = 0; var2 < var1.length; var2++) {
			DrawDistance var3 = var1[var2];
			if (var3.field2674 == arg0) {
				return var3;
			}
		}
		return null;
	}
}
