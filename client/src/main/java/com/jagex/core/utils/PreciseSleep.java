package com.jagex.core.utils;

import deob.ObfuscatedName;

@ObfuscatedName("gb")
public class PreciseSleep {

	public PreciseSleep() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("cs.e(J)V")
	public static final void sleep(long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			sleep0(arg0 - 1L);
			sleep0(1L);
		} else {
			sleep0(arg0);
		}
	}

	@ObfuscatedName("at.n(J)V")
	public static final void sleep0(long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (InterruptedException var3) {
		}
	}
}
