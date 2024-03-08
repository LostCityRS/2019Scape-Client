package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("pj")
public class class445 implements class685 {

	@ObfuscatedName("pj.e")
	public static final class445 field4434 = new class445("UNCOMPRESSED", 0);

	@ObfuscatedName("pj.n")
	public static final class445 field4430 = new class445("BZIP2", 1);

	@ObfuscatedName("pj.m")
	public static final class445 field4432 = new class445("GZIP", 2);

	@ObfuscatedName("pj.k")
	public static final class445 field4431 = new class445("LZMA", 3);

	@ObfuscatedName("pj.f")
	public final String field4435;

	@ObfuscatedName("pj.w")
	public final int field4433;

	@ObfuscatedName("pj.e(S)[Lpj;")
	public static class445[] method6978() {
		return new class445[] { field4432, field4431, field4430, field4434 };
	}

	public class445(String arg0, int arg1) {
		this.field4435 = arg0;
		this.field4433 = arg1;
	}

	@ObfuscatedName("pj.n()I")
	public int method1303() {
		return this.field4433;
	}
}
