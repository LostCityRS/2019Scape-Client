package com.jagex.graphics.runetek5.legacygl;

import com.jagex.*;
import deob.ObfuscatedName;

@ObfuscatedName("apk")
public class LegacyOpenGLEnvironmentSampler_Sub2 extends LegacyOpenGLEnvironmentSampler {

	@ObfuscatedName("apk.e")
	public final LegacyOpenGLRenderer field11946;

	@ObfuscatedName("apk.n")
	public LegacyOpenGLCubeTexture field11947;

	@ObfuscatedName("apk.m")
	public final int field11945;

	@ObfuscatedName("apk.k")
	public static final int[][] field11948 = new int[6][];

	public LegacyOpenGLEnvironmentSampler_Sub2(LegacyOpenGLRenderer arg0, int arg1) {
		this.field11946 = arg0;
		this.field11945 = arg1;
	}

	@ObfuscatedName("apk.e()Ladq;")
	public LegacyOpenGLCubeTexture method15649() {
		if (this.field11947 == null) {
			TextureList var1 = this.field11946.field1596;
			Material var2 = this.field11946.field1597.method2043(this.field11945);
			if (var2 == null) {
				return null;
			}
			if (!var2.field1333) {
				return null;
			}
			if (!var1.method1977(TextureRelated2.field7585, var2.field1334, -1, TextureRelated1.field7568, 1.0F, var2.field1357, var2.field1357, false)) {
				return null;
			}
			int[] var3 = var1.method1986(TextureRelated2.field7585, var2.field1334, 1.0F, var2.field1357, var2.field1357, false);
			int var4 = var2.field1357 * var2.field1357;
			if (var3 == null) {
				return null;
			}
			for (int var5 = 0; var5 < 6; var5++) {
				field11948[var5] = new int[var4];
				System.arraycopy(var3, var4 * var5, field11948[var5], 0, var4);
			}
			this.field11947 = new LegacyOpenGLCubeTexture(this.field11946, TextureFormat.field1271, DataType.UNSIGNED_INT_8, var2.field1357, var2.field1332 != 0, field11948);
		}
		return this.field11947;
	}
}
