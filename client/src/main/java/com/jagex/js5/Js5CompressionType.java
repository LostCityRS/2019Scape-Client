package com.jagex.js5;

import com.jagex.core.constants.SerializableEnum;
import deob.ObfuscatedName;

@ObfuscatedName("pj")
public class Js5CompressionType implements SerializableEnum {

	@ObfuscatedName("pj.e")
	public static final Js5CompressionType UNCOMPRESSED = new Js5CompressionType("UNCOMPRESSED", 0);

	@ObfuscatedName("pj.n")
	public static final Js5CompressionType BZIP2 = new Js5CompressionType("BZIP2", 1);

	@ObfuscatedName("pj.m")
	public static final Js5CompressionType GZIP = new Js5CompressionType("GZIP", 2);

	@ObfuscatedName("pj.k")
	public static final Js5CompressionType LZMA = new Js5CompressionType("LZMA", 3);

	@ObfuscatedName("pj.f")
	public final String name;

	@ObfuscatedName("pj.w")
	public final int id;

	@ObfuscatedName("pj.e(S)[Lpj;")
	public static Js5CompressionType[] values() {
		return new Js5CompressionType[] { GZIP, LZMA, BZIP2, UNCOMPRESSED };
	}

	public Js5CompressionType(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@ObfuscatedName("pj.n()I")
	public int getId() {
		return this.id;
	}
}
