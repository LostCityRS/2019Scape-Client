package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("fw")
public class AudioApiRelated_Sub4 implements AudioApiRelated {

	// $FF: synthetic field
	public final AudioApi this$0;

	public AudioApiRelated_Sub4(AudioApi arg0) {
		this.this$0 = arg0;
	}

	@ObfuscatedName("fw.e(Ljava/lang/Object;[F[Ljava/lang/Object;B)V")
	public void method3053(Object arg0, float[] arg1, Object[] arg2) {
		Sound var4 = (Sound) arg0;
		Vector3 var5 = var4.method7395();
		float var6 = var4.method7436();
		float var7 = var4.method7397();
		Vector3 var8 = Vector3.method6528(var5, this.this$0.method3147());
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
		arg1[0] = var12;
		arg1[1] = var12;
	}
}
