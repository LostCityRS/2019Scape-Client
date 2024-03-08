package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("adr")
public class class801 {

	@ObfuscatedName("adr.e")
	public static final class801 field9221 = new class801(23, 0);

	@ObfuscatedName("adr.n")
	public static final class801 field9219 = new class801(29, 1);

	@ObfuscatedName("adr.m")
	public static final class801 field9220 = new class801(18, 2);

	@ObfuscatedName("adr.k")
	public static final class801 field9240 = new class801(17, 3);

	@ObfuscatedName("adr.f")
	public static final class801 field9222 = new class801(1, 10);

	@ObfuscatedName("adr.w")
	public static final class801 field9223 = new class801(13, 11);

	@ObfuscatedName("adr.l")
	public static final class801 field9224 = new class801(6, 12);

	@ObfuscatedName("adr.u")
	public static final class801 field9234 = new class801(11, 13);

	@ObfuscatedName("adr.z")
	public static final class801 field9226 = new class801(12, 14);

	@ObfuscatedName("adr.p")
	public static final class801 field9225 = new class801(0, 15);

	@ObfuscatedName("adr.d")
	public static final class801 field9230 = new class801(9, 16);

	@ObfuscatedName("adr.c")
	public static final class801 field9229 = new class801(24, 17);

	@ObfuscatedName("adr.r")
	public static final class801 field9218 = new class801(14, 20);

	@ObfuscatedName("adr.v")
	public static final class801 field9231 = new class801(20, 21);

	@ObfuscatedName("adr.o")
	public static final class801 field9232 = new class801(21, 22);

	@ObfuscatedName("adr.s")
	public static final class801 field9238 = new class801(25, 30);

	@ObfuscatedName("adr.y")
	public static final class801 field9246 = new class801(3, 31);

	@ObfuscatedName("adr.q")
	public static final class801 field9235 = new class801(5, 32);

	@ObfuscatedName("adr.x")
	public static final class801 field9236 = new class801(22, 33);

	@ObfuscatedName("adr.b")
	public static final class801 field9237 = new class801(19, 40);

	@ObfuscatedName("adr.h")
	public static final class801 field9228 = new class801(8, 41);

	@ObfuscatedName("adr.a")
	public static final class801 field9239 = new class801(28, 42);

	@ObfuscatedName("adr.g")
	public static final class801 field9243 = new class801(7, 43);

	@ObfuscatedName("adr.i")
	public static final class801 field9241 = new class801(10, 50);

	@ObfuscatedName("adr.j")
	public static final class801 field9242 = new class801(26, 51);

	@ObfuscatedName("adr.t")
	public static final class801 field9227 = new class801(15, 52);

	@ObfuscatedName("adr.ae")
	public static final class801 field9244 = new class801(27, 53);

	@ObfuscatedName("adr.ag")
	public static final class801 field9245 = new class801(16, 60);

	@ObfuscatedName("adr.ah")
	public static final class801 field9233 = new class801(4, 61);

	@ObfuscatedName("adr.al")
	public static final class801 field9247 = new class801(30, 70);

	@ObfuscatedName("adr.ac")
	public static final class801 field9248 = new class801(2, 255);

	@ObfuscatedName("adr.ai")
	public final int field9249;

	@ObfuscatedName("adr.aw")
	public int field9250;

	@ObfuscatedName("aag.e(B)[Ladr;")
	public static class801[] method14096() {
		return new class801[] { field9245, field9247, field9235, field9238, field9243, field9241, field9223, field9221, field9240, field9232, field9218, field9246, field9228, field9244, field9234, field9231, field9230, field9222, field9237, field9242, field9248, field9225, field9219, field9220, field9227, field9224, field9226, field9233, field9229, field9236, field9239 };
	}

	public class801(int arg0, int arg1) {
		this.field9249 = arg0;
		this.field9250 = arg1;
	}

	@ObfuscatedName("fp.n(IB)Ladr;")
	public static class801 method3108(int arg0) {
		class801[] var1 = method14096();
		class801[] var2 = var1;
		for (int var3 = 0; var3 < var2.length; var3++) {
			class801 var4 = var2[var3];
			if (var4.field9250 == arg0) {
				return var4;
			}
		}
		return null;
	}
}
