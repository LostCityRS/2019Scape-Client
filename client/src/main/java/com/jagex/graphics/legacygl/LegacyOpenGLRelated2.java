package com.jagex.graphics.legacygl;

import com.jagex.core.datastruct.WeightedCache;
import com.jagex.game.client.DataType;
import com.jagex.graphics.*;
import deob.ObfuscatedName;

@ObfuscatedName("ca")
public class LegacyOpenGLRelated2 {

	@ObfuscatedName("ca.e")
	public final LegacyOpenGLRenderer field1187;

	@ObfuscatedName("ca.n")
	public final TextureList field1186;

	@ObfuscatedName("ca.m")
	public final WeightedCache field1185 = new WeightedCache(10485760, 256);

	public LegacyOpenGLRelated2(LegacyOpenGLRenderer arg0, TextureList arg1) {
		this.field1187 = arg0;
		this.field1186 = arg1;
	}

	@ObfuscatedName("ca.e(Ldv;)Ladt;")
	public LegacyOpenGLRelated method1404(Material arg0) {
		return this.method1398(arg0, arg0.size);
	}

	@ObfuscatedName("ca.n(Ldv;I)Ladt;")
	public LegacyOpenGLRelated method1398(Material arg0, int arg1) {
		LegacyOpenGLRelated var3 = (LegacyOpenGLRelated) this.field1185.get((long) arg0.field1329);
		if (var3 != null) {
			return var3;
		} else if (this.method1397(TextureRelated2.field7586, arg0, arg1)) {
			if (arg1 == -1) {
				arg1 = arg0.size;
			}
			LegacyOpenGLRelated var5;
			if (arg0.field1336 && this.field1187.isBloomEnabled()) {
				float[] var4 = this.field1186.method1984(TextureRelated2.field7586, arg0.diffuseTexture, arg0.field1302, 0.7F, arg1, arg1, false);
				var5 = new LegacyOpenGLRelated(this.field1187, 3553, TextureFormat.field1273, DataType.FLOAT_16, arg1, arg1, arg0.field1332 != 0, var4, TextureFormat.field1273);
			} else {
				int[] var6;
				if (MaterialAlphaMode.NONE == arg0.alphaMode && Material.method261(arg0.effect)) {
					var6 = this.field1186.getTexture(TextureRelated2.field7586, arg0.diffuseTexture, 0.7F, arg1, arg1, true);
				} else {
					var6 = this.field1186.getSpecialTexture(TextureRelated2.field7586, arg0.diffuseTexture, 0.7F, arg1, arg1, false);
				}
				var5 = new LegacyOpenGLRelated(this.field1187, 3553, arg1, arg1, arg0.field1332 != 0, var6, 0, 0, false);
			}
			var5.method15312(arg0.repeatS == 1, arg0.repeatT == 1);
			this.field1185.put(var5, (long) arg0.field1329, arg1 * arg1);
			return var5;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ca.m(Lvk;Ldv;I)Z")
	public boolean method1397(TextureRelated2 arg0, Material arg1, int arg2) {
		if (arg2 == -1) {
			arg2 = arg1.size;
		}
		if (arg1.field1336 && this.field1187.isBloomEnabled()) {
			return this.field1186.loadTexture(arg0, arg1.diffuseTexture, arg1.field1302, TextureRelated1.field7570, 0.7F, arg2, arg2, false);
		} else if (MaterialAlphaMode.NONE == arg1.alphaMode && Material.method261(arg1.effect)) {
			return this.field1186.loadTexture(arg0, arg1.diffuseTexture, -1, TextureRelated1.field7568, 0.7F, arg2, arg2, true);
		} else {
			return this.field1186.loadTexture(arg0, arg1.diffuseTexture, -1, TextureRelated1.field7569, 0.7F, arg2, arg2, false);
		}
	}

	@ObfuscatedName("ca.k()V")
	public void method1402() {
		this.field1185.update(5);
	}

	@ObfuscatedName("ca.f()V")
	public void method1399() {
		this.field1185.method2924();
	}
}
