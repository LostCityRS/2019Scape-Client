package com.jagex.graphics;

import deob.ObfuscatedName;

@ObfuscatedName("aeq")
public class GpuColourRemapper extends ColourRemapper {

	@ObfuscatedName("aeq.e")
	public final GpuToolkit field9529;

	@ObfuscatedName("aeq.n")
	public BaseTexture field9530;

	public GpuColourRemapper(GpuToolkit arg0, int[] arg1) {
		this.field9529 = arg0;
		if (this.field9529.field10125) {
			byte[] var3 = this.method15433(arg1);
			this.field9530 = this.field9529.method16197(TextureFormat.RGBA, 16, 16, 16, false, var3);
		} else {
			this.field9530 = this.field9529.method16204(256, 16, false, arg1);
		}
	}

	@ObfuscatedName("aeq.e()Lmq;")
	public BaseTexture method15431() {
		return this.field9530;
	}

	@ObfuscatedName("aeq.n([I)[B")
	public byte[] method15433(int[] arg0) {
		byte[] var2 = new byte[16384];
		for (int var3 = 0; var3 < 16; var3++) {
			for (int var4 = 0; var4 < 16; var4++) {
				for (int var5 = 0; var5 < 16; var5++) {
					int var6 = arg0[var4 * 256 + var5 * 16 + var3];
					int var7 = (var4 * 16 + var5 * 256 + var3) * 4;
					if (this.field9529.field10185 == 0) {
						var2[var7] = (byte) (var6 & 0xFF);
						var2[var7 + 1] = (byte) (var6 >> 8 & 0xFF);
						var2[var7 + 2] = (byte) (var6 >> 16 & 0xFF);
						var2[var7 + 3] = -1;
					} else {
						var2[var7] = (byte) (var6 >> 16 & 0xFF);
						var2[var7 + 1] = (byte) (var6 >> 8 & 0xFF);
						var2[var7 + 2] = (byte) (var6 & 0xFF);
						var2[var7 + 3] = -1;
					}
				}
			}
		}
		return var2;
	}
}
