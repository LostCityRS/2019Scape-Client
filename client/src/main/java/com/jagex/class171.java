package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

@ObfuscatedName("fn")
public class class171 implements class479 {

	// $FF: synthetic field
	public final class183 this$0;

	public class171(class183 arg0) {
		this.this$0 = arg0;
	}

	@ObfuscatedName("fn.e(Ljava/lang/Object;[F[Ljava/lang/Object;B)V")
	public void method3053(Object arg0, float[] arg1, Object[] arg2) {
		class476 var4 = (class476) arg0;
		class423 var5 = var4.method7395();
		float var6 = var4.method7436();
		float var7 = var4.method7397();
		class423 var8 = class423.method6528(var5, this.this$0.method3147());
		float var9 = 0.0F;
		float var10 = var8.method6519();
		if (var10 >= var7) {
			float var11 = 0.0F;
		}
		float var12;
		if (var10 <= var6) {
			var12 = 1.0F;
		} else {
			float var13 = 1.0F - 1.0F / (var7 - var6) * (var10 - var6);
			if ((double) var13 < 0.0D || (double) var13 > 1.0D) {
				var13 = Math.min(Math.max(var13, 0.0F), 1.0F);
			}
			var12 = var13;
		}
		int var14 = 8192;
		float var15 = 0.0F;
		float var19;
		if (Statics.field3416 == 3) {
			float var16 = Statics.field9155.method4719();
			if (var8.field4308 != 0.0F || var8.field4313 != 0.0F) {
				int var17 = (int) ((double) (var16 * -1.0F) * 2607.5945876176133D) - (int) (Math.atan2((double) var8.field4308, (double) var8.field4313) * 2607.5945876176133D) - 4096 & 0x3FFF;
				if (var17 > 8192) {
					var17 = 16384 - var17;
				}
				int var18;
				if (var10 <= 0.0F) {
					var18 = 8192;
				} else if (var10 >= 4096.0F) {
					var18 = 16384;
				} else {
					var18 = (int) (var10 * 8192.0F / 4096.0F + 8192.0F);
				}
				var14 = (16384 - var18 >> 1) + var17 * var18 / 8192;
			}
			var19 = (float) var14 * 6.1035156E-5F;
		} else {
			if (var8.field4308 != 0.0F || var8.field4313 != 0.0F) {
				int var20 = -Statics.field8586 - (int) (Math.atan2((double) var8.field4308, (double) var8.field4313) * 2607.5945876176133D) - 4096 & 0x3FFF;
				if (var20 > 8192) {
					var20 = 16384 - var20;
				}
				int var21;
				if (var10 <= 0.0F) {
					var21 = 8192;
				} else if (var10 >= 4096.0F) {
					var21 = 16384;
				} else {
					var21 = (int) (var10 * 8192.0F / 4096.0F + 8192.0F);
				}
				var14 = (16384 - var21 >> 1) + var20 * var21 / 8192;
			}
			var19 = (float) var14 * 6.1035156E-5F;
		}
		arg1[0] = (float) (var14 < 0 ? (double) var12 : (double) var12 * Math.sqrt((double) ((1.0F - var19) * 2.0F)));
		arg1[1] = (float) (var14 < 0 ? (double) -var12 : (double) var12 * Math.sqrt((double) (var19 * 2.0F)));
	}
}
