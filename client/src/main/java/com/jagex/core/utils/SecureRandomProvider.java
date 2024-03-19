package com.jagex.core.utils;

import deob.ObfuscatedName;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("al")
public class SecureRandomProvider {

	@ObfuscatedName("al.e")
	public ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();

	@ObfuscatedName("al.n")
	public Future secureRandomFuture = this.singleThreadExecutor.submit(new SecureRandomTask());

	@ObfuscatedName("al.e(I)V")
	public void stop() {
		this.singleThreadExecutor.shutdown();
		this.singleThreadExecutor = null;
	}

	@ObfuscatedName("al.n(I)Ljava/security/SecureRandom;")
	public SecureRandom getSecureRandom() {
		try {
			return (SecureRandom) this.secureRandomFuture.get();
		} catch (Exception var2) {
			return SecureRandomTask.createSecureRandom();
		}
	}
}
