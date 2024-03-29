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

	public BuildAreaSize(int id, int size) {
		this.id = id;
		this.size = size;
	}

	@ObfuscatedName("anb.e(I)[Lib;")
	public static BuildAreaSize[] values() {
		return new BuildAreaSize[] {SIZE_168, CONSTRUCTION, STANDARD, SIZE_256, SIZE_120, SIZE_136};
	}

	@ObfuscatedName("fd.n(IB)Lib;")
	public static BuildAreaSize buildAreaSizeForId(int id) {
		BuildAreaSize[] values = values();
		for (int index = 0; index < values.length; index++) {
			BuildAreaSize buildAreaSize = values[index];
			if (buildAreaSize.id == id) {
				return buildAreaSize;
			}
		}
		return null;
	}
}
