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

	public RendererInfo(int toolkitId, String name, int version, String device, long arg4, boolean arg5) {
		this.toolkitId = toolkitId;
		this.name = name;
		this.version = version;
		this.device = device;
		this.driverVersion = arg4;
	}
}
