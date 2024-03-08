package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ib")
public class BuildAreaSize {

	@ObfuscatedName("ib.e")
	public static final BuildAreaSize field2663 = new BuildAreaSize(0, 104);

	@ObfuscatedName("ib.n")
	public static final BuildAreaSize field2659 = new BuildAreaSize(1, 120);

	@ObfuscatedName("ib.m")
	public static final BuildAreaSize field2660 = new BuildAreaSize(2, 136);

	@ObfuscatedName("ib.k")
	public static final BuildAreaSize field2662 = new BuildAreaSize(3, 168);

	@ObfuscatedName("ib.f")
	public static final BuildAreaSize field2661 = new BuildAreaSize(4, 72);

	@ObfuscatedName("ib.w")
	public static final BuildAreaSize field2658 = new BuildAreaSize(5, 256);

	@ObfuscatedName("ib.l")
	public final int field2664;

	@ObfuscatedName("ib.u")
	public final int field2665;

	public BuildAreaSize(int arg0, int arg1) {
		this.field2664 = arg0;
		this.field2665 = arg1;
	}

	@ObfuscatedName("fd.n(IB)Lib;")
	public static BuildAreaSize method3061(int arg0) {
		BuildAreaSize[] var1 = Statics.method18813();
		for (int var2 = 0; var2 < var1.length; var2++) {
			BuildAreaSize var3 = var1[var2];
			if (var3.field2664 == arg0) {
				return var3;
			}
		}
		return null;
	}
}
