package com.jagex.graphics;

import com.jagex.game.client.DataType;
import deob.ObfuscatedName;

@ObfuscatedName("aed")
public class GpuRelated2 extends SpriteRelated {

	@ObfuscatedName("aed.e")
	public final GpuTexture field9417;

	public GpuRelated2(GpuToolkit arg0, int arg1, int arg2, byte[] arg3) {
		this.field9417 = arg0.method16028(TextureFormat.ALPHA, arg1, arg2, false, arg3);
		this.field9417.setWarp(false, false);
	}

	public GpuRelated2(GpuToolkit arg0, int arg1, int arg2, int[] arg3) {
		this.field9417 = arg0.method16204(arg1, arg2, false, arg3);
		this.field9417.setWarp(false, false);
	}

	@ObfuscatedName("aed.e(Lafc;II[I[I)Laed;")
	public static GpuRelated2 method15388(GpuToolkit arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
		if (!arg0.method16026(TextureFormat.ALPHA, DataType.UNSIGNED_INT_8)) {
			int[] var9 = new int[arg1 * arg2];
			for (int var10 = 0; var10 < arg2; var10++) {
				int var11 = arg1 * var10 + arg3[var10];
				for (int var12 = 0; var12 < arg4[var10]; var12++) {
					var9[var11++] = -16777216;
				}
			}
			return new GpuRelated2(arg0, arg1, arg2, var9);
		}
		byte[] var5 = new byte[arg1 * arg2];
		for (int var6 = 0; var6 < arg2; var6++) {
			int var7 = arg1 * var6 + arg3[var6];
			for (int var8 = 0; var8 < arg4[var6]; var8++) {
				var5[var7++] = -1;
			}
		}
		return new GpuRelated2(arg0, arg1, arg2, var5);
	}
}
