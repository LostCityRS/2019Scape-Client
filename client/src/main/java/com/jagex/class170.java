package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("fd")
public class class170 implements class479 {

	// $FF: synthetic field
	public final class183 this$0;

	public class170(class183 arg0) {
		this.this$0 = arg0;
	}

	@ObfuscatedName("fd.e(Ljava/lang/Object;[F[Ljava/lang/Object;B)V")
	public void method3053(Object arg0, float[] arg1, Object[] arg2) {
		class476 var4 = (class476) arg0;
		class423 var5 = var4.method7395();
		float var6 = var4.method7436();
		float var7 = var4.method7397();
		class423 var8 = this.this$0.method3147();
		class423 var9 = class423.method6528(var5, var8);
		float var10 = 0.0F;
		int var11 = 8192;
		float var12 = var9.method6519();
		float var13 = 0.0F;
		if (var12 >= var7) {
			var10 = 0.0F;
		} else {
			float var14 = (Float) arg2[0];
			float var15 = (Float) arg2[1];
			if (var8.field4308 > var5.field4308 - var14 / 2.0F && var8.field4308 < var14 / 2.0F + var5.field4308 && var8.field4313 > var5.field4313 - var15 / 2.0F && var8.field4313 < var15 / 2.0F + var5.field4313) {
				float var16 = Math.abs(var8.field4308 - (var14 / 2.0F + var5.field4308));
				float var17 = Math.abs(var8.field4308 - (var5.field4308 - var14 / 2.0F));
				float var18 = Math.abs(var8.field4313 - (var15 / 2.0F + var5.field4308));
				float var19 = Math.abs(var8.field4313 - (var5.field4308 - var15 / 2.0F));
				float var20 = var7 - var6;
				float var21 = Math.min(var16, var17);
				float var22 = Math.min(var18, var19);
				float var23 = 1.0F / var20 * var21;
				float var24 = 1.0F / var20 * var22;
				float var25 = Math.min(Math.max(var23, 0.0F), 1.0F);
				float var26 = Math.min(Math.max(var24, 0.0F), 1.0F);
				var10 = Math.min(var25, var26);
			}
			if (var9.field4308 != 0.0F || var9.field4313 != 0.0F) {
				if (Statics.field3416 == 3) {
					float var27 = Statics.field9155.method4719();
					if (var9.field4308 != 0.0F || var9.field4313 != 0.0F) {
						int var28 = (int) ((double) (var27 * -1.0F) * 2607.5945876176133D) - (int) (Math.atan2((double) var9.field4308, (double) var9.field4313) * 2607.5945876176133D) - 4096 & 0x3FFF;
						if (var28 > 8192) {
							var28 = 16384 - var28;
						}
						int var29;
						if (var12 <= 0.0F) {
							var29 = 8192;
						} else if (var12 >= 4096.0F) {
							var29 = 16384;
						} else {
							var29 = (int) (var12 * 8192.0F / 4096.0F + 8192.0F);
						}
						var11 = (16384 - var29 >> 1) + var28 * var29 / 8192;
					}
					var13 = (float) var11 * 6.1035156E-5F;
				} else {
					int var30 = -Statics.field8586 - (int) (Math.atan2((double) var9.field4308, (double) var9.field4313) * 2607.5945876176133D) - 4096 & 0x3FFF;
					if (var30 > 8192) {
						var30 = 16384 - var30;
					}
					int var31;
					if (var12 <= 0.0F) {
						var31 = 8192;
					} else if (var12 >= 4096.0F) {
						var31 = 16384;
					} else {
						var31 = (int) (var12 * 8192.0F / 4096.0F + 8192.0F);
					}
					var11 = (16384 - var31 >> 1) + var30 * var31 / 8192;
					var13 = (float) var11 * 6.1035156E-5F;
				}
			}
		}
		arg1[0] = (float) (var11 < 0 ? (double) var10 : (double) var10 * Math.sqrt((double) (1.0F - var13)));
		arg1[1] = (float) (var11 < 0 ? (double) -var10 : (double) var10 * Math.sqrt((double) var13));
	}
}
