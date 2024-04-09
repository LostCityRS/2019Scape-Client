package com.jagex.graphics.gl;

import com.jagex.game.client.DataType;
import com.jagex.graphics.ColourRemapper;
import com.jagex.graphics.TextureFormat;
import deob.ObfuscatedName;

@ObfuscatedName("aep")
public class GlColourRemapper extends ColourRemapper {

	@ObfuscatedName("aep.e")
	public final GlToolkit field9528;

	@ObfuscatedName("aep.n")
	public GlTexture field9527;

	public GlColourRemapper(GlToolkit arg0, int[] arg1) {
		this.field9528 = arg0;
		if (this.field9528.field9889) {
			byte[] var3 = this.method15426(arg1);
			this.field9527 = new GlTexture_Sub2(this.field9528, TextureFormat.RGBA, DataType.UNSIGNED_INT_8, 16, 16, 16, var3, TextureFormat.RGBA);
		} else {
			this.field9527 = new GlTexture_Sub1(this.field9528, 3553, 256, 16, false, arg1, 256, 0, false);
		}
	}

	@ObfuscatedName("aep.e()Lbq;")
	public GlTexture method15425() {
		return this.field9527;
	}

	@ObfuscatedName("aep.n([I)[B")
	public byte[] method15426(int[] arg0) {
		byte[] var2 = new byte[16384];
		for (int var3 = 0; var3 < 16; var3++) {
			for (int var4 = 0; var4 < 16; var4++) {
				for (int var5 = 0; var5 < 16; var5++) {
					int var6 = arg0[var4 * 256 + var5 * 16 + var3];
					int var7 = (var4 * 16 + var5 * 256 + var3) * 4;
					var2[var7] = (byte) (var6 >> 16 & 0xFF);
					var2[var7 + 1] = (byte) (var6 >> 8 & 0xFF);
					var2[var7 + 2] = (byte) (var6 & 0xFF);
					var2[var7 + 3] = -1;
				}
			}
		}
		return var2;
	}
}
