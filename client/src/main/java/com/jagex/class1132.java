package com.jagex;

import deob.ObfuscatedName;

import java.awt.*;

@ObfuscatedName("aqz")
public class class1132 extends class895 {

	// $FF: synthetic field
	public final PreLoadingScreen this$0;

	@ObfuscatedName("aqz.k")
	public float field12091;

	@ObfuscatedName("aqz.f")
	public float field12092;

	public class1132(PreLoadingScreen arg0, Image arg1, int arg2, int arg3, float arg4) {
		super(arg0, arg1, arg2, arg3);
		this.this$0 = arg0;
		this.field12091 = arg4;
		this.field12092 = -this.field12091;
	}

	@ObfuscatedName("aqz.e(Ljava/awt/Graphics;B)V")
	public void method4987(Graphics arg0) {
		this.field12092 += this.field12091;
		if (this.field12092 < 0.0F) {
			this.field12092 += 360.0F;
		}
		this.field12092 %= 360.0F;
		double var2 = Math.toRadians((double) this.field12092);
		int var4 = this.field10470.getWidth(null);
		int var5 = this.field10470.getHeight(null);
		Graphics2D var6 = (Graphics2D) arg0;
		var6.rotate(var2, (double) (this.this$0.method4893(var4) + var4 / 2 + this.field2947), (double) (this.this$0.method4887(var5) + var5 / 2 + this.field2948));
		var6.translate(this.this$0.method4893(var4) + this.field2947, this.this$0.method4887(var5) + this.field2948);
		var6.drawImage(this.field10470, null, null);
		var6.setTransform(this.this$0.field2898);
	}
}
