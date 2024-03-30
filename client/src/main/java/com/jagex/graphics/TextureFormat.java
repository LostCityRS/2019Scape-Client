package com.jagex.graphics;

import deob.ObfuscatedName;

@ObfuscatedName("ck")
public class TextureFormat {

	@ObfuscatedName("ck.e")
	public static final TextureFormat RGB = new TextureFormat(2, 3);

	@ObfuscatedName("ck.n")
	public static final TextureFormat RGBA = new TextureFormat(4, 4);

	@ObfuscatedName("ck.m")
	public static final TextureFormat ALPHA = new TextureFormat(6, 1);

	@ObfuscatedName("ck.k")
	public static final TextureFormat LUMINANCE = new TextureFormat(7, 1);

	@ObfuscatedName("ck.f")
	public static final TextureFormat ALPHA_LUMINANCE = new TextureFormat(3, 2);

	@ObfuscatedName("ck.w")
	public static final TextureFormat DEPTH = new TextureFormat(0, 1);

	@ObfuscatedName("ck.l")
	public static final TextureFormat field1274 = new TextureFormat(9, 3);

	@ObfuscatedName("ck.u")
	public static final TextureFormat field1269 = new TextureFormat(5, 4);

	@ObfuscatedName("ck.z")
	public static final TextureFormat COMPRESSED_RGBA_S3TC_DXT1 = new TextureFormat(1, 1);

	@ObfuscatedName("ck.p")
	public static final TextureFormat COMPRESSED_RGBA_S3TC_DXT5 = new TextureFormat(8, 1);

	@ObfuscatedName("ck.d")
	public final int index;

	@ObfuscatedName("ck.c")
	public final int id;

	public TextureFormat(int index, int id) {
		this.index = index;
		this.id = id;
	}
}
