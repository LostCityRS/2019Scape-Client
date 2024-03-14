package com.jagex.game.clientoptions.options;

import deob.ObfuscatedName;

@ObfuscatedName("aag")
public class PreferencesHardwareInfo {

	@ObfuscatedName("aag.e")
	public int maxmemory;

	@ObfuscatedName("aag.n")
	public int cpucount;

	@ObfuscatedName("aag.m")
	public boolean osArchArm;

	@ObfuscatedName("aag.k")
	public boolean osArchWindows;

	@ObfuscatedName("aag.f")
	public boolean unused;

	public PreferencesHardwareInfo(int maxmemory, int cpucount, boolean osArchArm, boolean osArchWindows, boolean unused) {
		this.maxmemory = maxmemory;
		this.cpucount = cpucount;
		this.osArchArm = osArchArm;
		this.osArchWindows = osArchWindows;
		this.unused = unused;
	}

	@ObfuscatedName("aag.e(B)I")
	public int maxmemory() {
		return this.maxmemory;
	}

	@ObfuscatedName("aag.n(I)I")
	public int cpucount() {
		return this.cpucount;
	}

	@ObfuscatedName("aag.m(I)Z")
	public boolean osArchArm() {
		return this.osArchArm;
	}

	@ObfuscatedName("aag.k(I)Z")
	public boolean osArchWindows() {
		return this.osArchWindows;
	}

	@ObfuscatedName("aag.f(I)Z")
	public boolean unused() {
		return this.unused;
	}
}
