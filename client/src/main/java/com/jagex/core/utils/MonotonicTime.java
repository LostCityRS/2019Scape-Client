package com.jagex.core.utils;

import deob.ObfuscatedName;

@ObfuscatedName("gz")
public final class MonotonicTime {

	@ObfuscatedName("gz.e")
	public static long field2012;

	@ObfuscatedName("gz.n")
	public static long field2011;

	public MonotonicTime() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("gz.e(I)J")
	public static final synchronized long get() {
		long var0 = System.currentTimeMillis();
		if (var0 < field2012) {
			field2011 += field2012 - var0;
		}
		field2012 = var0;
		return field2011 + var0;
	}
}
