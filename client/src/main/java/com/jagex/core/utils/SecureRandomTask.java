package com.jagex.core.utils;

import deob.ObfuscatedName;

import java.security.SecureRandom;
import java.util.concurrent.Callable;

@ObfuscatedName("f")
public class SecureRandomTask implements Callable {

	@ObfuscatedName("qu.e(I)Ljava/security/SecureRandom;")
	public static SecureRandom createSecureRandom() {
		SecureRandom secureRandom = new SecureRandom();
		secureRandom.nextInt();
		return secureRandom;
	}

	public Object call() {
		return createSecureRandom();
	}
}
