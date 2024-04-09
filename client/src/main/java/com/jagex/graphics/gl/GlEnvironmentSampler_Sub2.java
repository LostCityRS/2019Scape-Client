package com.jagex.graphics.gl;

import com.jagex.game.client.DataType;
import com.jagex.graphics.*;
import deob.ObfuscatedName;

@ObfuscatedName("apk")
public class GlEnvironmentSampler_Sub2 extends GlEnvironmentSampler {

	@ObfuscatedName("apk.e")
	public final GlToolkit field11946;

	@ObfuscatedName("apk.n")
	public GlCubeTexture field11947;

	@ObfuscatedName("apk.m")
	public final int field11945;

	@ObfuscatedName("apk.k")
	public static final int[][] field11948 = new int[6][];

	public GlEnvironmentSampler_Sub2(GlToolkit arg0, int arg1) {
		this.field11946 = arg0;
		this.field11945 = arg1;
	}

	@ObfuscatedName("apk.e()Ladq;")
	public GlCubeTexture method15649() {
		if (this.field11947 == null) {
			TextureList var1 = this.field11946.field1596;
			Material var2 = this.field11946.materialList.get(this.field11945);
			if (var2 == null) {
				return null;
			}
			if (!var2.field1333) {
				return null;
			}
			if (!var1.loadTexture(TextureRelated2.field7585, var2.diffuseTexture, -1, TextureRelated1.field7568, 1.0F, var2.size, var2.size, false)) {
				return null;
			}
			int[] var3 = var1.getTexture(TextureRelated2.field7585, var2.diffuseTexture, 1.0F, var2.size, var2.size, false);
			int var4 = var2.size * var2.size;
			if (var3 == null) {
				return null;
			}
			for (int var5 = 0; var5 < 6; var5++) {
				field11948[var5] = new int[var4];
				System.arraycopy(var3, var4 * var5, field11948[var5], 0, var4);
			}
			this.field11947 = new GlCubeTexture(this.field11946, TextureFormat.RGB, DataType.UNSIGNED_INT_8, var2.size, var2.field1332 != 0, field11948);
		}
		return this.field11947;
	}
}
