package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("adi")
public class Namespace implements SerializableEnum {

	@ObfuscatedName("adi.e")
	public static final Namespace RUNESCAPE = new Namespace(0, 0, "", "");

	@ObfuscatedName("adi.n")
	public static final Namespace FUNORB = new Namespace(5, 1, "", "");

	@ObfuscatedName("adi.m")
	public static final Namespace WAR_OF_LEGENDS = new Namespace(6, 2, "", "");

	@ObfuscatedName("adi.k")
	public static final Namespace STELLAR_DAWN = new Namespace(8, 3, "", "");

	@ObfuscatedName("adi.f")
	public static final Namespace EIGHT_REALMS = new Namespace(7, 4, "", "");

	@ObfuscatedName("adi.w")
	public static final Namespace TRANSFORMERS = new Namespace(2, 5, "", "");

	@ObfuscatedName("adi.l")
	public static final Namespace SCRATCH = new Namespace(3, 6, "", "");

	@ObfuscatedName("adi.u")
	public static final Namespace field9194 = new Namespace(4, 7, "", "");

	@ObfuscatedName("adi.z")
	public static final Namespace LEGACY = new Namespace(1, -1, "", "", true, new Namespace[] {RUNESCAPE, FUNORB, WAR_OF_LEGENDS, EIGHT_REALMS, STELLAR_DAWN});

	@ObfuscatedName("adi.p")
	public final int field9196;

	@ObfuscatedName("adi.d")
	public final int field9188;

	@ObfuscatedName("adi.c")
	public final String field9198;

	public Namespace(int arg0, int arg1, String arg2, String arg3) {
		this.field9196 = arg0;
		this.field9188 = arg1;
		this.field9198 = arg3;
	}

	public Namespace(int arg0, int arg1, String arg2, String arg3, boolean arg4, Namespace[] arg5) {
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
