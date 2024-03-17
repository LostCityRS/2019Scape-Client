package com.jagex.game.client;

import deob.ObfuscatedName;

@ObfuscatedName("rn")
public interface NativeLibraryLoader {

	@ObfuscatedName("rn.n(Ljava/lang/String;I)Z")
	boolean method7900(String arg0);

	@ObfuscatedName("rn.e(Ljava/lang/String;B)V")
	void load(String arg0) throws NativeLibraryException;

	@ObfuscatedName("rn.m(I)Z")
	boolean method7909();
}
