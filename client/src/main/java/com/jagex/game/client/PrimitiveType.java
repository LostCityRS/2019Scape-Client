package com.jagex.game.client;

import deob.ObfuscatedName;

@ObfuscatedName("ms")
public class PrimitiveType {

	@ObfuscatedName("ms.e")
	public static final PrimitiveType LINELIST = new PrimitiveType(5);

	@ObfuscatedName("ms.n")
	public static final PrimitiveType LINESTRIP = new PrimitiveType(2);

	@ObfuscatedName("ms.m")
	public static final PrimitiveType POINTLIST = new PrimitiveType(4);

	@ObfuscatedName("ms.k")
	public static final PrimitiveType TRIANGLELIST = new PrimitiveType(1);

	@ObfuscatedName("ms.f")
	public static final PrimitiveType TRIANGLEFAN = new PrimitiveType(3);

	@ObfuscatedName("ms.w")
	public static final PrimitiveType TRIANGLESTRIP = new PrimitiveType(0);

	@ObfuscatedName("ms.l")
	public final int index;

	public PrimitiveType(int index) {
		this.index = index;
	}
}
