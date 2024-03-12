package com.jagex.core.utils;

import deob.ObfuscatedName;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("al")
public class SecureRandomProvider {

	@ObfuscatedName("al.e")
	public ExecutorService field639 = Executors.newSingleThreadExecutor();

	@ObfuscatedName("al.n")
	public Future field638 = this.field639.submit(new SecureRandomTask());

	@ObfuscatedName("al.e(I)V")
	public void method710() {
		this.field639.shutdown();
		this.field639 = null;
	}

	@ObfuscatedName("al.n(I)Ljava/security/SecureRandom;")
	public SecureRandom method709() {
		try {
			return (SecureRandom) this.field638.get();
		} catch (Exception var2) {
			return SecureRandomTask.method7327();
		}
	}
}
