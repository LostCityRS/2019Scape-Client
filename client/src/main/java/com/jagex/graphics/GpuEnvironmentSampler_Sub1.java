package com.jagex.graphics;

import deob.ObfuscatedName;

@ObfuscatedName("aps")
public class GpuEnvironmentSampler_Sub1 extends GpuEnvironmentSampler {

	@ObfuscatedName("aps.e")
	public final GpuToolkit field11950;

	@ObfuscatedName("aps.n")
	public GpuCubeTexture field11952;

	@ObfuscatedName("aps.m")
	public final int field11951;

	@ObfuscatedName("aps.k")
	public static final int[][] field11949 = new int[6][];

	public GpuEnvironmentSampler_Sub1(GpuToolkit arg0, int arg1) {
		this.field11950 = arg0;
		this.field11951 = arg1;
	}

	@ObfuscatedName("aps.e()Lmr;")
	public GpuCubeTexture method15652() {
		if (this.field11952 == null) {
			TextureList var1 = this.field11950.field1596;
			Material var2 = this.field11950.materialList.get(this.field11951);
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
				field11949[var5] = new int[var4];
				System.arraycopy(var3, var4 * var5, field11949[var5], 0, var4);
			}
			this.field11952 = this.field11950.method16034(var2.size, var2.field1332 != 0, field11949);
		}
		return this.field11952;
	}
}
