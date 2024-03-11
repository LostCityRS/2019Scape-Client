package com.jagex.game.client;

import deob.ObfuscatedName;

@ObfuscatedName("abk")
public class RawCpuInfo {

	@ObfuscatedName("abk.e")
	public final int rawCpuInfo0;

	@ObfuscatedName("abk.n")
	public final int rawCpuInfo1;

	@ObfuscatedName("abk.m")
	public final int rawCpuInfo2;

	@ObfuscatedName("abk.k")
	public final int rawCpuInfo3;

	@ObfuscatedName("abk.f")
	public final int rawCpuInfo4;

	public RawCpuInfo(int arg0, int arg1, int arg2, int arg3, int arg4) {
		this.rawCpuInfo0 = arg0;
		this.rawCpuInfo1 = arg1;
		this.rawCpuInfo2 = arg2;
		this.rawCpuInfo3 = arg3;
		this.rawCpuInfo4 = arg4;
	}

	public int hashCode() {
		return this.rawCpuInfo0;
	}
}
