package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aea")
public class LegacyGraphicRelated2 extends GraphicsRelated {

	@ObfuscatedName("aea.e")
	public final LegacyGraphicRelated field9416;

	public LegacyGraphicRelated2(LegacyOpenGLRenderer arg0, int arg1, int arg2, byte[] arg3) {
		this.field9416 = LegacyGraphicRelated.method18932(arg0, TextureFormat.ALPHA, DataType.UNSIGNED_INT_8, arg1, arg2, false, arg3, TextureFormat.ALPHA);
		this.field9416.method15312(false, false);
	}

	@ObfuscatedName("aea.e(Lafa;II[I[I)Laea;")
	public static LegacyGraphicRelated2 method15384(LegacyOpenGLRenderer arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
		byte[] var5 = new byte[arg1 * arg2];
		for (int var6 = 0; var6 < arg2; var6++) {
			int var7 = arg1 * var6 + arg3[var6];
			for (int var8 = 0; var8 < arg4[var6]; var8++) {
				var5[var7++] = -1;
			}
		}
		return new LegacyGraphicRelated2(arg0, arg1, arg2, var5);
	}
}
