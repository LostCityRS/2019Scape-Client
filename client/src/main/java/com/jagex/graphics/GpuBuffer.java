package com.jagex.graphics;

import deob.ObfuscatedName;

@ObfuscatedName("ln")
public interface GpuBuffer {

	@ObfuscatedName("ln.w(II)J")
	long lock(int arg0, int arg1);

	@ObfuscatedName("ln.f(IIJ)Z")
	boolean upload(int arg0, int arg1, long arg2);

	@ObfuscatedName("ln.k()I")
	int method5743();

	@ObfuscatedName("ln.l()V")
	void unlock();
}
