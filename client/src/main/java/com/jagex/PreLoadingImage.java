package com.jagex;

import deob.ObfuscatedName;

import java.awt.*;

@ObfuscatedName("ahw")
public class PreLoadingImage extends PreLoadingRelated {

	// $FF: synthetic field
	public final PreLoadingScreen this$0;

	@ObfuscatedName("ahw.m")
	public Image field10470;

	public PreLoadingImage(PreLoadingScreen arg0, Image arg1, int arg2, int arg3) {
		super(arg0, arg2, arg3);
		this.this$0 = arg0;
		this.field10470 = arg1;
	}

	@ObfuscatedName("ahw.e(Ljava/awt/Graphics;B)V")
	public void method4987(Graphics arg0) {
		int var2 = this.this$0.method4893(this.field10470.getWidth(null)) + this.field2947;
		int var3 = this.this$0.method4887(this.field10470.getHeight(null)) + this.field2948;
		arg0.drawImage(this.field10470, var2, var3, null);
	}
}