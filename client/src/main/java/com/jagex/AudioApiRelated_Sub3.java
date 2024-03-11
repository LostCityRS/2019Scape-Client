package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("fi")
public class AudioApiRelated_Sub3 implements AudioApiRelated {

	// $FF: synthetic field
	public final AudioApi this$0;

	public AudioApiRelated_Sub3(AudioApi arg0) {
		this.this$0 = arg0;
	}

	@ObfuscatedName("fi.e(Ljava/lang/Object;[F[Ljava/lang/Object;B)V")
	public void method3053(Object arg0, float[] arg1, Object[] arg2) {
		Sound var4 = (Sound) arg0;
		Vector3 var5 = var4.method7395();
		float var6 = var4.method7436();
		float var7 = var4.method7397();
		Vector3 var8 = this.this$0.method3147();
		Vector3 var9 = Vector3.method6528(var5, var8);
		float var10 = 0.0F;
		float var11 = var9.method6519();
		if (var11 >= var7) {
			var10 = 0.0F;
		} else {
			float var12 = (Float) arg2[0];
			float var13 = (Float) arg2[1];
			if (var8.field4308 > var5.field4308 - var12 / 2.0F && var8.field4308 < var12 / 2.0F + var5.field4308 && var8.field4313 > var5.field4313 - var13 / 2.0F && var8.field4313 < var13 / 2.0F + var5.field4313) {
				float var14 = Math.abs(var8.field4308 - (var12 / 2.0F + var5.field4308));
				float var15 = Math.abs(var8.field4308 - (var5.field4308 - var12 / 2.0F));
				float var16 = Math.abs(var8.field4313 - (var13 / 2.0F + var5.field4308));
				float var17 = Math.abs(var8.field4313 - (var5.field4308 - var13 / 2.0F));
				float var18 = var7 - var6;
				float var19 = Math.min(var14, var15);
				float var20 = Math.min(var16, var17);
				float var21 = 1.0F / var18 * var19;
				float var22 = 1.0F / var18 * var20;
				float var23 = Math.min(Math.max(var21, 0.0F), 1.0F);
				float var24 = Math.min(Math.max(var22, 0.0F), 1.0F);
				var10 = Math.min(var23, var24);
			}
		}
		arg1[0] = var10;
		arg1[1] = var10;
	}
}
