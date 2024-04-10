package com.jagex.graphics;

import deob.ObfuscatedName;

@ObfuscatedName("apj")
public class RendererException extends Exception {

	@ObfuscatedName("apj.e")
	public final int field11892;

	public RendererException() throws Throwable {
		throw new Error();
	}

	@ObfuscatedName("apj.e(I)I")
	public int getErrorCode() {
		return this.field11892;
	}
}
