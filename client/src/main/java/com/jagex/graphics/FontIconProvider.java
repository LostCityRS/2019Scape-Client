package com.jagex.graphics;

import deob.ObfuscatedName;

@ObfuscatedName("aaw")
public interface FontIconProvider {

	@ObfuscatedName("aaw.c(Ldh;II)[Lcm;")
	Sprite[] getIconSprites(Toolkit toolkit, int id);

	@ObfuscatedName("aaw.r(II)I")
	int getIconWidth(int id);
}
