package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("im")
public class class266 {

	@ObfuscatedName("im.e")
	public static final class266 field2816 = new class266(0, false);

	@ObfuscatedName("im.n")
	public static final class266 field2815 = new class266(1, false);

	@ObfuscatedName("im.m")
	public static final class266 field2819 = new class266(2, true);

	@ObfuscatedName("im.k")
	public static final class266 field2817 = new class266(3, true);

	@ObfuscatedName("im.f")
	public static final class266 field2818 = new class266(4, true);

	@ObfuscatedName("im.w")
	public final int field2814;

	@ObfuscatedName("im.l")
	public final boolean field2820;

	public class266(int arg0, boolean arg1) {
		this.field2814 = arg0;
		this.field2820 = arg1;
	}

	@ObfuscatedName("bc.e(IB)Lim;")
	public static class266 method1058(int arg0) {
		if (field2816.field2814 == arg0) {
			return field2816;
		} else if (field2815.field2814 == arg0) {
			return field2815;
		} else if (field2819.field2814 == arg0) {
			return field2819;
		} else if (field2817.field2814 == arg0) {
			return field2817;
		} else if (field2818.field2814 == arg0) {
			return field2818;
		} else {
			return null;
		}
	}

	@ObfuscatedName("im.n(I)Z")
	public boolean method4623() {
		return this.field2820;
	}
}
