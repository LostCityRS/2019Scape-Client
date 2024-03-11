package com.jagex;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("pj")
public class CompressionType implements SerializableEnum {

	@ObfuscatedName("pj.e")
	public static final CompressionType field4434 = new CompressionType("UNCOMPRESSED", 0);

	@ObfuscatedName("pj.n")
	public static final CompressionType field4430 = new CompressionType("BZIP2", 1);

	@ObfuscatedName("pj.m")
	public static final CompressionType field4432 = new CompressionType("GZIP", 2);

	@ObfuscatedName("pj.k")
	public static final CompressionType LZMA = new CompressionType("LZMA", 3);

	@ObfuscatedName("pj.f")
	public final String field4435;

	@ObfuscatedName("pj.w")
	public final int field4433;

	@ObfuscatedName("pj.e(S)[Lpj;")
	public static CompressionType[] method6978() {
		return new CompressionType[] { field4432, LZMA, field4430, field4434 };
	}

	public CompressionType(String arg0, int arg1) {
		this.field4435 = arg0;
		this.field4433 = arg1;
	}

	@ObfuscatedName("pj.n()I")
	public int getId() {
		return this.field4433;
	}
}
