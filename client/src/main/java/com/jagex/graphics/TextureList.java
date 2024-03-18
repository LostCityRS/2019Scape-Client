package com.jagex.graphics;

import deob.ObfuscatedName;

@ObfuscatedName("es")
public interface TextureList {

	@ObfuscatedName("es.u(Lvk;IFIIZI)[I")
	int[] getTexture(TextureRelated2 arg0, int arg1, float arg2, int arg3, int arg4, boolean arg5);

	@ObfuscatedName("es.m(Lvk;IILvc;FIIZI)Z")
	boolean loadTexture(TextureRelated2 arg0, int arg1, int arg2, TextureRelated1 arg3, float arg4, int arg5, int arg6, boolean arg7);

	@ObfuscatedName("es.p(Lvk;IIFIIZB)[F")
	float[] method1984(TextureRelated2 arg0, int arg1, int arg2, float arg3, int arg4, int arg5, boolean arg6);

	@ObfuscatedName("es.l(B)V")
	void method1982();

	@ObfuscatedName("es.z(Lvk;IFIIZB)[I")
	int[] getSpecialTexture(TextureRelated2 arg0, int arg1, float arg2, int arg3, int arg4, boolean arg5);
}
