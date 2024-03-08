package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("xs")
public class class646 {

	@ObfuscatedName("xs.e")
	public static final class646 field7941 = new class646(0, 2, 2, 1);

	@ObfuscatedName("xs.n")
	public static final class646 field7924 = new class646(1, 2, 2, 0);

	@ObfuscatedName("xs.m")
	public static final class646 field7934 = new class646(2, 4, 4, 0);

	@ObfuscatedName("xs.k")
	public static final class646 field7931 = new class646(4, 1, 1, 1);

	@ObfuscatedName("xs.f")
	public static final class646 field7927 = new class646(6, 0, 4, 2);

	@ObfuscatedName("xs.w")
	public static final class646 field7928 = new class646(7, 0, 1, 1);

	@ObfuscatedName("xs.l")
	public static final class646 field7929 = new class646(8, 0, 4, 1);

	@ObfuscatedName("xs.u")
	public static final class646 field7926 = new class646(9, 0, 4, 1);

	@ObfuscatedName("xs.z")
	public static final class646 field7937 = new class646(10, 2, 2, 0);

	@ObfuscatedName("xs.p")
	public static final class646 field7932 = new class646(11, 0, 1, 2);

	@ObfuscatedName("xs.d")
	public static final class646 field7933 = new class646(12, 0, 1, 0);

	@ObfuscatedName("xs.c")
	public static final class646 field7930 = new class646(13, 0, 1, 0);

	@ObfuscatedName("xs.r")
	public static final class646 field7935 = new class646(14, 0, 4, 1);

	@ObfuscatedName("xs.v")
	public static final class646 field7936 = new class646(15, 0, 1, 0);

	@ObfuscatedName("xs.o")
	public static final class646 field7925 = new class646(16, 0, 4, 2);

	@ObfuscatedName("xs.s")
	public int field7938;

	@ObfuscatedName("xs.y")
	public int field7939;

	@ObfuscatedName("xs.q")
	public int field7940;

	@ObfuscatedName("xs.x")
	public int field7923;

	@ObfuscatedName("vl.e(I)[Lxs;")
	public static class646[] method9288() {
		return new class646[] { field7936, field7927, field7925, field7924, field7937, field7930, field7941, field7934, field7926, field7931, field7929, field7932, field7933, field7928, field7935 };
	}

	public class646(int arg0, int arg1, int arg2, int arg3) {
		this.field7938 = arg0;
		this.field7939 = arg1;
		this.field7940 = arg2;
		this.field7923 = arg3;
	}

	@ObfuscatedName("tl.n(II)Lxs;")
	public static class646 method8897(int arg0) {
		class646[] var1 = method9288();
		for (int var2 = 0; var2 < var1.length; var2++) {
			if (var1[var2].field7938 == arg0) {
				return var1[var2];
			}
		}
		return null;
	}

	public static final void add(class677 arg0, short arg1) {
		arg0.field8226 -= 2;
		int var2 = arg0.field8216[arg0.field8226];
		int var3 = arg0.field8216[arg0.field8226 + 1];
		arg0.field8216[++arg0.field8226 - 1] = var2 - var3;
	}
}
