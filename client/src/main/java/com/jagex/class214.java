package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("gb")
public class class214 {

	public class214() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("cs.e(J)V")
	public static final void method1571(long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			method810(arg0 - 1L);
			method810(1L);
		} else {
			method810(arg0);
		}
	}

	@ObfuscatedName("at.n(J)V")
	public static final void method810(long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (InterruptedException var3) {
		}
	}
}
