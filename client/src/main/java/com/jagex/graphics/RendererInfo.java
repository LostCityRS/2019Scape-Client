package com.jagex.graphics;

import deob.ObfuscatedName;

@ObfuscatedName("cz")
public class RendererInfo {

	@ObfuscatedName("cz.w")
	public final int toolkitId;

	@ObfuscatedName("cz.l")
	public final String name;

	@ObfuscatedName("cz.u")
	public final int version;

	@ObfuscatedName("cz.z")
	public final String device;

	@ObfuscatedName("cz.p")
	public final long driverVersion;

	public RendererInfo(int arg0, String arg1, int arg2, String arg3, long arg4, boolean arg5) {
		this.toolkitId = arg0;
		this.name = arg1;
		this.version = arg2;
		this.device = arg3;
		this.driverVersion = arg4;
	}
}
