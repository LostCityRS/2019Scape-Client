package com.jagex.core.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("wk")
public interface CacheKey {

	@ObfuscatedName("wk.n(Lwk;)Z")
	boolean equal(CacheKey arg0);

	@ObfuscatedName("wk.e()J")
	long hash();
}
