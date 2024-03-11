package com.jagex.core.util;

import deob.ObfuscatedName;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

@ObfuscatedName("f")
public class SecureRandomTask implements Callable {

	@ObfuscatedName("qu.e(I)Ljava/security/SecureRandom;")
	public static SecureRandom method7327() {
		SecureRandom var0 = new SecureRandom();
		var0.nextInt();
		return var0;
	}

	public Object call() {
		return method7327();
	}
}
