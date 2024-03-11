package com.jagex;

import deob.ObfuscatedName;
import deob.Statics;

import java.awt.*;

@ObfuscatedName("ahj")
public class PreLoadingProgressImage extends class282 {

	// $FF: synthetic field
	public final PreLoadingScreen this$0;

	@ObfuscatedName("ahj.m")
	public boolean field10469;

	@ObfuscatedName("ahj.k")
	public java.awt.Font field10467;

	@ObfuscatedName("ahj.f")
	public java.awt.FontMetrics field10468;

	@ObfuscatedName("ahj.w")
	public Color field10466;

	public PreLoadingProgressImage(PreLoadingScreen arg0, boolean arg1, String arg2, int arg3, int arg4, int arg5, int arg6) {
		super(arg0, arg5, arg6);
		this.this$0 = arg0;
		this.field10469 = arg1;
		this.field10467 = new java.awt.Font(arg2, 0, arg3);
		this.field10468 = Statics.canvas.getFontMetrics(this.field10467);
		this.field10466 = new Color(arg4);
	}

	@ObfuscatedName("ahj.e(Ljava/awt/Graphics;B)V")
	public void method4987(Graphics arg0) {
		String var2;
		if (this.field10469) {
			var2 = this.this$0.field2896;
		} else {
			var2 = this.this$0.field2897 + " " + this.this$0.field2896;
		}
		arg0.setFont(this.field10467);
		arg0.setColor(this.field10466);
		arg0.drawString(var2, this.this$0.method4893(this.field10468.stringWidth(var2)) + this.field2947, this.this$0.method4887(0) + this.field2948);
	}
}
