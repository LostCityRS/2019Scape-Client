package com.jagex.graphics;

import deob.ObfuscatedName;

@ObfuscatedName("mv")
public class TextureTramsformType {

	@ObfuscatedName("mv.e")
	public static final TextureTramsformType DISABLE = new TextureTramsformType(5);

	@ObfuscatedName("mv.n")
	public static final TextureTramsformType COUNT1 = new TextureTramsformType(3);

	@ObfuscatedName("mv.m")
	public static final TextureTramsformType COUNT2 = new TextureTramsformType(0);

	@ObfuscatedName("mv.k")
	public static final TextureTramsformType COUNT3 = new TextureTramsformType(1);

	@ObfuscatedName("mv.f")
	public static final TextureTramsformType COUNT4 = new TextureTramsformType(2);

	@ObfuscatedName("mv.w")
	public static final TextureTramsformType PROJECTED = new TextureTramsformType(4);

	@ObfuscatedName("mv.l")
	public final int index;

	public TextureTramsformType(int index) {
		this.index = index;
	}
}
