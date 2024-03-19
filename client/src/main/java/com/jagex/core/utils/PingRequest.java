package com.jagex.core.utils;

import deob.ObfuscatedName;

@ObfuscatedName("yb")
public final class PingRequest {

	@ObfuscatedName("yb.e")
	public volatile String host;

	@ObfuscatedName("yb.n")
	public volatile int hostpacked = -1;

	public PingRequest(String arg0) {
		this.host = arg0;
	}
}
