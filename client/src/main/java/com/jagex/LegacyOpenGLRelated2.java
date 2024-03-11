package com.jagex;

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
		return this.method1398(arg0, arg0.field1357);
	}

	@ObfuscatedName("ca.n(Ldv;I)Ladt;")
	public LegacyOpenGLRelated method1398(Material arg0, int arg1) {
		LegacyOpenGLRelated var3 = (LegacyOpenGLRelated) this.field1185.method2930((long) arg0.field1329);
		if (var3 != null) {
			return var3;
		} else if (this.method1397(TextureRelated2.field7586, arg0, arg1)) {
			if (arg1 == -1) {
				arg1 = arg0.field1357;
			}
			LegacyOpenGLRelated var5;
			if (arg0.field1336 && this.field1187.method2242()) {
				float[] var4 = this.field1186.method1984(TextureRelated2.field7586, arg0.field1334, arg0.field1302, 0.7F, arg1, arg1, false);
				var5 = new LegacyOpenGLRelated(this.field1187, 3553, TextureFormat.field1273, DataType.FLOAT_16, arg1, arg1, arg0.field1332 != 0, var4, TextureFormat.field1273);
			} else {
				int[] var6;
				if (MaterialAlphaMode.field7575 == arg0.field1340 && Material.method261(arg0.field1308)) {
					var6 = this.field1186.method1986(TextureRelated2.field7586, arg0.field1334, 0.7F, arg1, arg1, true);
				} else {
					var6 = this.field1186.method1983(TextureRelated2.field7586, arg0.field1334, 0.7F, arg1, arg1, false);
				}
				var5 = new LegacyOpenGLRelated(this.field1187, 3553, arg1, arg1, arg0.field1332 != 0, var6, 0, 0, false);
			}
			var5.method15312(arg0.field1307 == 1, arg0.field1343 == 1);
			this.field1185.method2922(var5, (long) arg0.field1329, arg1 * arg1);
			return var5;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ca.m(Lvk;Ldv;I)Z")
	public boolean method1397(TextureRelated2 arg0, Material arg1, int arg2) {
		if (arg2 == -1) {
			arg2 = arg1.field1357;
		}
		if (arg1.field1336 && this.field1187.method2242()) {
			return this.field1186.method1977(arg0, arg1.field1334, arg1.field1302, TextureRelated1.field7570, 0.7F, arg2, arg2, false);
		} else if (MaterialAlphaMode.field7575 == arg1.field1340 && Material.method261(arg1.field1308)) {
			return this.field1186.method1977(arg0, arg1.field1334, -1, TextureRelated1.field7568, 0.7F, arg2, arg2, true);
		} else {
			return this.field1186.method1977(arg0, arg1.field1334, -1, TextureRelated1.field7569, 0.7F, arg2, arg2, false);
		}
	}

	@ObfuscatedName("ca.k()V")
	public void method1402() {
		this.field1185.method2923(5);
	}

	@ObfuscatedName("ca.f()V")
	public void method1399() {
		this.field1185.method2924();
	}
}
