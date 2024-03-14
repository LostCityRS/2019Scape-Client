package com.jagex.graphics.legacygl;

import com.jagex.core.utils.ByteArrayCopier;
import com.jagex.game.client.DataType;
import com.jagex.game.client.NoiseGenerator3D_Sub1_Sub1;
import com.jagex.game.client.NoiseGenerator3D_Sub2_Sub1;
import com.jagex.graphics.EffectRelated1;
import com.jagex.graphics.TextureFormat;
import com.jagex.graphics.WaterRelated5;
import deob.ObfuscatedName;

@ObfuscatedName("bz")
public class LegacyGlEffectRelated {

	@ObfuscatedName("bz.f")
	public boolean field1040;

	@ObfuscatedName("bz.w")
	public LegacyOpenGLRelated[] field1041 = null;

	@ObfuscatedName("bz.l")
	public LegacyColourRemapperRelated field1042 = null;

	@ObfuscatedName("bz.u")
	public LegacyOpenGLRelated[] field1043 = null;

	@ObfuscatedName("bz.z")
	public LegacyColourRemapperRelated field1044 = null;

	@ObfuscatedName("bz.p")
	public LegacyColourRemapperRelated field1038 = null;

	@ObfuscatedName("bz.d")
	public static Object field1046;

	@ObfuscatedName("bz.c")
	public static Object field1039;

	@ObfuscatedName("bz.r")
	public static Object field1048;

	@ObfuscatedName("bz.e(Lafa;)V")
	public static void method1283(LegacyOpenGLRenderer arg0) {
		if (field1046 == null) {
			NoiseGenerator3D_Sub2_Sub1 var1 = new NoiseGenerator3D_Sub2_Sub1();
			byte[] var2 = var1.method19221(128, 128, 16);
			field1046 = ByteArrayCopier.method2821(var2, false);
		}
		if (field1039 == null) {
			NoiseGenerator3D_Sub1_Sub1 var3 = new NoiseGenerator3D_Sub1_Sub1();
			byte[] var4 = var3.method19216(128, 128, 16);
			field1039 = ByteArrayCopier.method2821(var4, false);
		}
		LegacyEffectRelated5 var5 = arg0.field9871;
		if (var5.method1391() && field1048 == null) {
			byte[] var6 = WaterRelated5.method8451(128, 128, 16, 8, new EffectRelated1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
			field1048 = ByteArrayCopier.method2821(var6, false);
		}
	}

	public LegacyGlEffectRelated(LegacyOpenGLRenderer arg0) {
		this.field1040 = arg0.field9889;
		method1283(arg0);
		if (this.field1040) {
			byte[] var6 = ByteArrayCopier.method4540(field1046, false);
			this.field1042 = new LegacyColourRemapperRelated(arg0, TextureFormat.field1272, DataType.UNSIGNED_INT_8, 128, 128, 16, var6, TextureFormat.field1272);
			byte[] var7 = ByteArrayCopier.method4540(field1039, false);
			this.field1044 = new LegacyColourRemapperRelated(arg0, TextureFormat.field1272, DataType.UNSIGNED_INT_8, 128, 128, 16, var7, TextureFormat.field1272);
			LegacyEffectRelated5 var8 = arg0.field9871;
			if (var8.method1391()) {
				byte[] var9 = ByteArrayCopier.method4540(field1048, false);
				this.field1038 = new LegacyColourRemapperRelated(arg0, TextureFormat.field1273, DataType.UNSIGNED_INT_8, 128, 128, 16);
				LegacyColourRemapperRelated var10 = new LegacyColourRemapperRelated(arg0, TextureFormat.field1275, DataType.UNSIGNED_INT_8, 128, 128, 16, var9, TextureFormat.field1275);
				if (var8.method1390(this.field1038, var10, 2.0F)) {
					this.field1038.method1084();
				} else {
					this.field1038.method1087();
					this.field1038 = null;
				}
				var10.method1087();
			}
		} else {
			this.field1041 = new LegacyOpenGLRelated[16];
			for (int var2 = 0; var2 < 16; var2++) {
				byte[] var3 = ByteArrayCopier.method6024(field1046, var2 * 32768, 32768);
				this.field1041[var2] = new LegacyOpenGLRelated(arg0, 3553, TextureFormat.field1272, DataType.UNSIGNED_INT_8, 128, 128, true, var3, TextureFormat.field1272, false);
			}
			this.field1043 = new LegacyOpenGLRelated[16];
			for (int var4 = 0; var4 < 16; var4++) {
				byte[] var5 = ByteArrayCopier.method6024(field1039, var4 * 32768, 32768);
				this.field1043[var4] = new LegacyOpenGLRelated(arg0, 3553, TextureFormat.field1272, DataType.UNSIGNED_INT_8, 128, 128, true, var5, TextureFormat.field1272, false);
			}
		}
	}
}
