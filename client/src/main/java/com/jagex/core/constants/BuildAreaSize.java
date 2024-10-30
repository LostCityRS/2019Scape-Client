package com.jagex.core.constants;

import deob.ObfuscatedName;

@ObfuscatedName("ib")
public class BuildAreaSize {

	@ObfuscatedName("ib.e")
	public static final BuildAreaSize STANDARD = new BuildAreaSize(0, 104);

	@ObfuscatedName("ib.n")
	public static final BuildAreaSize SIZE_120 = new BuildAreaSize(1, 120);

	@ObfuscatedName("ib.m")
	public static final BuildAreaSize SIZE_136 = new BuildAreaSize(2, 136);

	@ObfuscatedName("ib.k")
	public static final BuildAreaSize SIZE_168 = new BuildAreaSize(3, 168);

	@ObfuscatedName("ib.f")
	public static final BuildAreaSize CONSTRUCTION = new BuildAreaSize(4, 72);

	@ObfuscatedName("ib.w")
	public static final BuildAreaSize SIZE_256 = new BuildAreaSize(5, 256);

	@ObfuscatedName("ib.l")
	public final int id;

	@ObfuscatedName("ib.u")
	public final int size;

	@ObfuscatedName("anb.e(I)[Lib;")
	public static BuildAreaSize[] values() {
		return new BuildAreaSize[] { SIZE_168, CONSTRUCTION, STANDARD, SIZE_256, SIZE_120, SIZE_136 };
	}

	public BuildAreaSize(int arg0, int arg1) {
		this.id = arg0;
		this.size = arg1;
	}

	@ObfuscatedName("fd.n(IB)Lib;")
	public static BuildAreaSize buildAreaSizeForId(int arg0) {
		BuildAreaSize[] var1 = values();
		for (int var2 = 0; var2 < var1.length; var2++) {
			BuildAreaSize var3 = var1[var2];
			if (var3.id == arg0) {
				return var3;
			}
		}
		return null;
	}
}
