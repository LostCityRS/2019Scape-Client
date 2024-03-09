package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("adi")
public class class794 implements SerializableEnum {

	@ObfuscatedName("adi.e")
	public static final class794 RUNESCAPE = new class794(0, 0, "", "");

	@ObfuscatedName("adi.n")
	public static final class794 FUNORB = new class794(5, 1, "", "");

	@ObfuscatedName("adi.m")
	public static final class794 WAR_OF_LEGENDS = new class794(6, 2, "", "");

	@ObfuscatedName("adi.k")
	public static final class794 STELLAR_DAWN = new class794(8, 3, "", "");

	@ObfuscatedName("adi.f")
	public static final class794 EIGHT_REALMS = new class794(7, 4, "", "");

	@ObfuscatedName("adi.w")
	public static final class794 TRANSFORMERS = new class794(2, 5, "", "");

	@ObfuscatedName("adi.l")
	public static final class794 SCRATCH = new class794(3, 6, "", "");

	@ObfuscatedName("adi.u")
	public static final class794 field9194 = new class794(4, 7, "", "");

	@ObfuscatedName("adi.z")
	public static final class794 LEGACY = new class794(1, -1, "", "", true, new class794[] {RUNESCAPE, FUNORB, WAR_OF_LEGENDS, EIGHT_REALMS, STELLAR_DAWN});

	@ObfuscatedName("adi.p")
	public final int field9196;

	@ObfuscatedName("adi.d")
	public final int field9188;

	@ObfuscatedName("adi.c")
	public final String field9198;

	public class794(int arg0, int arg1, String arg2, String arg3) {
		this.field9196 = arg0;
		this.field9188 = arg1;
		this.field9198 = arg3;
	}

	public class794(int arg0, int arg1, String arg2, String arg3, boolean arg4, class794[] arg5) {
		this.field9196 = arg0;
		this.field9188 = arg1;
		this.field9198 = arg3;
	}

	@ObfuscatedName("adi.n()I")
	public int getId() {
		return this.field9188;
	}

	public String toString() {
		return this.field9198;
	}
}
