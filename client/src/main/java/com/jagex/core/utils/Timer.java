package com.jagex.core.utils;

import deob.ObfuscatedName;

@ObfuscatedName("sr")
public abstract class Timer {

	@ObfuscatedName("nv.e(I)Lsr;")
	public static Timer method6109() {
		try {
			return new MillisTimer();
		} catch (Throwable var1) {
			return new NanoTimer();
		}
	}

	@ObfuscatedName("sr.n(J)I")
	public final int method8158(long arg0) {
		long var3 = this.method8159();
		if (var3 > 0L) {
			PreciseSleep.sleep(var3);
		}
		return this.method8160(arg0);
	}

	@ObfuscatedName("sr.m(B)V")
	public abstract void method8156();

	@ObfuscatedName("sr.k(I)J")
	public abstract long method8159();

	@ObfuscatedName("sr.f(J)I")
	public abstract int method8160(long arg0);

	@ObfuscatedName("sr.w(I)J")
	public abstract long method8173();
}
