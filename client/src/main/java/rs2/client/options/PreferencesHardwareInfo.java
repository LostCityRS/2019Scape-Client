package rs2.client.options;

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

	public PreferencesHardwareInfo(int arg0, int arg1, boolean arg2, boolean arg3, boolean arg4) {
		this.maxmemory = arg0;
		this.cpucount = arg1;
		this.osArchArm = arg2;
		this.osArchWindows = arg3;
		this.unused = arg4;
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
