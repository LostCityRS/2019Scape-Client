package com.jagex.js5;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("pj")
public class Js5CompressionType implements SerializableEnum {

	@ObfuscatedName("pj.e")
	public static final Js5CompressionType field4434 = new Js5CompressionType("UNCOMPRESSED", 0);

	@ObfuscatedName("pj.n")
	public static final Js5CompressionType field4430 = new Js5CompressionType("BZIP2", 1);

	@ObfuscatedName("pj.m")
	public static final Js5CompressionType field4432 = new Js5CompressionType("GZIP", 2);

	@ObfuscatedName("pj.k")
	public static final Js5CompressionType LZMA = new Js5CompressionType("LZMA", 3);

	@ObfuscatedName("pj.f")
	public final String field4435;

	@ObfuscatedName("pj.w")
	public final int field4433;

	@ObfuscatedName("pj.e(S)[Lpj;")
	public static Js5CompressionType[] method6978() {
		return new Js5CompressionType[] { field4432, LZMA, field4430, field4434 };
	}

	public Js5CompressionType(String arg0, int arg1) {
		this.field4435 = arg0;
		this.field4433 = arg1;
	}

	@ObfuscatedName("pj.n()I")
	public int getId() {
		return this.field4433;
	}
}
