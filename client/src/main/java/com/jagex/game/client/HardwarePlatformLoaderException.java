package com.jagex.game.client;

import deob.ObfuscatedName;

@ObfuscatedName("apl")
public class HardwarePlatformLoaderException extends Exception {

	@ObfuscatedName("apl.e")
	public final String field11896;

	@ObfuscatedName("apl.n")
	public final int field11897;

	public HardwarePlatformLoaderException(int arg0, String arg1) {
		this(arg0, arg1, (Throwable) null);
	}

	public HardwarePlatformLoaderException(int arg0, String arg1, Throwable arg2) {
		super(arg2);
		this.field11896 = arg1;
		this.field11897 = arg0;
	}
}
