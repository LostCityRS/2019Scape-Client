package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("ib")
public class class254 {

	@ObfuscatedName("ib.e")
	public static final class254 field2663 = new class254(0, 104);

	@ObfuscatedName("ib.n")
	public static final class254 field2659 = new class254(1, 120);

	@ObfuscatedName("ib.m")
	public static final class254 field2660 = new class254(2, 136);

	@ObfuscatedName("ib.k")
	public static final class254 field2662 = new class254(3, 168);

	@ObfuscatedName("ib.f")
	public static final class254 field2661 = new class254(4, 72);

	@ObfuscatedName("ib.w")
	public static final class254 field2658 = new class254(5, 256);

	@ObfuscatedName("ib.l")
	public final int field2664;

	@ObfuscatedName("ib.u")
	public final int field2665;

	public class254(int arg0, int arg1) {
		this.field2664 = arg0;
		this.field2665 = arg1;
	}

	@ObfuscatedName("fd.n(IB)Lib;")
	public static class254 method3061(int arg0) {
		class254[] var1 = Statics.method18813();
		for (int var2 = 0; var2 < var1.length; var2++) {
			class254 var3 = var1[var2];
			if (var3.field2664 == arg0) {
				return var3;
			}
		}
		return null;
	}
}
