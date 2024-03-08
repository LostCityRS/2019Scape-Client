package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("rc")
public class RebuildType {

	@ObfuscatedName("rc.e")
	public static final RebuildType field5063 = new RebuildType(false, false);

	@ObfuscatedName("rc.n")
	public static final RebuildType field5064 = new RebuildType(true, false);

	@ObfuscatedName("rc.m")
	public static final RebuildType field5071 = new RebuildType(false, false);

	@ObfuscatedName("rc.k")
	public static final RebuildType field5066 = new RebuildType(true, false);

	@ObfuscatedName("rc.f")
	public static final RebuildType field5067 = new RebuildType(true, false);

	@ObfuscatedName("rc.w")
	public static final RebuildType field5068 = new RebuildType(true, true);

	@ObfuscatedName("rc.l")
	public static final RebuildType field5069 = new RebuildType(true, true);

	@ObfuscatedName("rc.u")
	public static final RebuildType field5070 = new RebuildType(false, false);

	@ObfuscatedName("rc.z")
	public boolean field5072;

	@ObfuscatedName("rc.p")
	public boolean field5065;

	public RebuildType(boolean arg0, boolean arg1) {
		this.field5072 = arg0;
		this.field5065 = arg1;
	}

	@ObfuscatedName("rc.e(I)Z")
	public boolean method7887() {
		return this.field5072;
	}

	@ObfuscatedName("rc.n(B)Z")
	public boolean method7888() {
		return this.field5065;
	}
}
