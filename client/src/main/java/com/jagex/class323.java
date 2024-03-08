package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("lp")
public class class323 {

	@ObfuscatedName("lp.k")
	public class850 field3223;

	@ObfuscatedName("lp.f")
	public boolean field3229;

	@ObfuscatedName("lp.w")
	public class341[] field3232 = null;

	@ObfuscatedName("lp.l")
	public class327 field3226 = null;

	@ObfuscatedName("lp.u")
	public class341[] field3227 = null;

	@ObfuscatedName("lp.z")
	public class327 field3228 = null;

	@ObfuscatedName("lp.p")
	public class327 field3224 = null;

	@ObfuscatedName("lp.e()V")
	public static void method5410() {
		if (Statics.field3230 == null) {
			class1143 var0 = new class1143();
			byte[] var1 = var0.method19228(128, 128, 16);
			Statics.field3230 = class703.method2821(var1, false);
		}
		if (Statics.field3231 == null) {
			class1141 var2 = new class1141();
			byte[] var3 = var2.method19218(128, 128, 16);
			Statics.field3231 = class703.method2821(var3, false);
		}
	}

	public class323(class850 arg0) {
		this.field3223 = arg0;
		this.field3229 = this.field3223.field10125;
		if (this.field3229 && !this.field3223.field10116) {
			this.field3229 = false;
		}
		if (this.field3229 && !this.field3223.method16289(class109.field1272, class135.field1645)) {
			this.field3229 = false;
		}
		if (this.field3229 || this.field3223.method16026(class109.field1272, class135.field1645)) {
			method5410();
			if (this.field3229) {
				byte[] var6 = class703.method4540(Statics.field3230, false);
				this.field3226 = this.field3223.method16197(class109.field1272, 128, 128, 16, true, var6);
				byte[] var7 = class703.method4540(Statics.field3231, false);
				this.field3228 = this.field3223.method16197(class109.field1272, 128, 128, 16, true, var7);
			} else {
				this.field3232 = new class341[16];
				for (int var2 = 0; var2 < 16; var2++) {
					byte[] var3 = class703.method6024(Statics.field3230, var2 * 32768, 32768);
					this.field3232[var2] = this.field3223.method16028(class109.field1272, 128, 128, true, var3);
				}
				this.field3227 = new class341[16];
				for (int var4 = 0; var4 < 16; var4++) {
					byte[] var5 = class703.method6024(Statics.field3231, var4 * 32768, 32768);
					this.field3227[var4] = this.field3223.method16028(class109.field1272, 128, 128, true, var5);
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
			if (Statics.field3225 == null) {
				byte[] var1 = class534.method8451(128, 128, 16, 8, new class1003(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
				Statics.field3225 = class703.method2821(var1, false);
			}
			byte[] var2 = class703.method4540(Statics.field3225, false);
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
			this.field3224 = this.field3223.method16197(class109.field1273, 128, 128, 16, true, var3);
		}
		return this.field3224 != null;
	}
}
