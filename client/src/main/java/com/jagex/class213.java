package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("gz")
public final class class213 {

	public class213() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("gz.e(I)J")
	public static final synchronized long method3655() {
		long var0 = System.currentTimeMillis();
		if (var0 < Statics.field2012) {
			Statics.field2011 += Statics.field2012 - var0;
		}
		Statics.field2012 = var0;
		return Statics.field2011 + var0;
	}
}
