package com.jagex.graphics;

import com.jagex.core.utils.ByteArrayCopier;
import com.jagex.game.client.DataType;
import com.jagex.graphics.gl.GlAbstractEffect1;
import deob.ObfuscatedName;

@ObfuscatedName("lp")
public class GpuWaterRelated {

	@ObfuscatedName("lp.k")
	public GpuToolkit field3223;

	@ObfuscatedName("lp.f")
	public boolean field3229;

	@ObfuscatedName("lp.w")
	public GpuTexture[] field3232 = null;

	@ObfuscatedName("lp.l")
	public GpuVolumeTexture field3226 = null;

	@ObfuscatedName("lp.u")
	public GpuTexture[] field3227 = null;

	@ObfuscatedName("lp.z")
	public GpuVolumeTexture field3228 = null;

	@ObfuscatedName("lp.p")
	public GpuVolumeTexture field3224 = null;

	@ObfuscatedName("lp.d")
	public static Object field3230;

	@ObfuscatedName("lp.c")
	public static Object field3231;

	@ObfuscatedName("lp.r")
	public static Object field3225;

	@ObfuscatedName("lp.e()V")
	public static void method5410() {
		if (field3230 == null) {
			WaterUnknownGenerator var0 = new WaterUnknownGenerator();
			byte[] var1 = var0.method19228(128, 128, 16);
			field3230 = ByteArrayCopier.wrap(var1, false);
		}
		if (field3231 == null) {
			WaterBillowGenerator var2 = new WaterBillowGenerator();
			byte[] var3 = var2.method19218(128, 128, 16);
			field3231 = ByteArrayCopier.wrap(var3, false);
		}
	}

	public GpuWaterRelated(GpuToolkit arg0) {
		this.field3223 = arg0;
		this.field3229 = this.field3223.field10125;
		if (this.field3229 && !this.field3223.field10116) {
			this.field3229 = false;
		}
		if (this.field3229 && !this.field3223.method16289(TextureFormat.ALPHA_LUMINANCE, DataType.UNSIGNED_INT_8)) {
			this.field3229 = false;
		}
		if (this.field3229 || this.field3223.method16026(TextureFormat.ALPHA_LUMINANCE, DataType.UNSIGNED_INT_8)) {
			method5410();
			if (this.field3229) {
				byte[] var6 = ByteArrayCopier.method4540(field3230, false);
				this.field3226 = this.field3223.method16197(TextureFormat.ALPHA_LUMINANCE, 128, 128, 16, true, var6);
				byte[] var7 = ByteArrayCopier.method4540(field3231, false);
				this.field3228 = this.field3223.method16197(TextureFormat.ALPHA_LUMINANCE, 128, 128, 16, true, var7);
			} else {
				this.field3232 = new GpuTexture[16];
				for (int var2 = 0; var2 < 16; var2++) {
					byte[] var3 = ByteArrayCopier.method6024(field3230, var2 * 32768, 32768);
					this.field3232[var2] = this.field3223.method16028(TextureFormat.ALPHA_LUMINANCE, 128, 128, true, var3);
				}
				this.field3227 = new GpuTexture[16];
				for (int var4 = 0; var4 < 16; var4++) {
					byte[] var5 = ByteArrayCopier.method6024(field3231, var4 * 32768, 32768);
					this.field3227[var4] = this.field3223.method16028(TextureFormat.ALPHA_LUMINANCE, 128, 128, true, var5);
				}
			}
		}
	}

	@ObfuscatedName("lp.n()Z")
	public boolean method5407() {
		return this.field3229 ? this.field3226 != null : this.field3232 != null;
	}

	@ObfuscatedName("lp.m()Z")
	public boolean method5409() {
		if (!this.field3223.field10125) {
			return false;
		}
		if (this.field3224 == null) {
			if (field3225 == null) {
				byte[] var1 = WaterRelated5.method8451(128, 128, 16, 8, new GlAbstractEffect1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
				field3225 = ByteArrayCopier.wrap(var1, false);
			}
			byte[] var2 = ByteArrayCopier.method4540(field3225, false);
			byte[] var3 = new byte[var2.length * 4];
			int var4 = 0;
			for (int var5 = 0; var5 < 16; var5++) {
				int var6 = var5 * 16384;
				int var7 = var6;
				for (int var8 = 0; var8 < 128; var8++) {
					int var9 = var8 * 128 + var7;
					int var10 = (var8 - 1 & 0x7F) * 128 + var7;
					int var11 = (var8 + 1 & 0x7F) * 128 + var7;
					for (int var12 = 0; var12 < 128; var12++) {
						float var13 = (float) ((var2[var10 + var12] & 0xFF) - (var2[var11 + var12] & 0xFF));
						float var14 = (float) ((var2[(var12 - 1 & 0x7F) + var9] & 0xFF) - (var2[(var12 + 1 & 0x7F) + var9] & 0xFF));
						float var15 = (float) (128.0D / Math.sqrt((double) (var13 * var13 + var14 * var14 + 16384.0F)));
						var3[var4++] = (byte) (var14 * var15 + 127.0F);
						var3[var4++] = (byte) (var15 * 128.0F + 127.0F);
						var3[var4++] = (byte) (var13 * var15 + 127.0F);
						var3[var4++] = var2[var6++];
					}
				}
			}
			this.field3224 = this.field3223.method16197(TextureFormat.RGBA, 128, 128, 16, true, var3);
		}
		return this.field3224 != null;
	}
}
