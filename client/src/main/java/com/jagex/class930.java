package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("ail")
public class class930 extends class485 implements class362 {

	public class930(class1127 arg0, int arg1, boolean arg2, int[][] arg3) {
		super(arg0, 34067, class109.field1273, class135.field1645, arg1 * arg1 * 6, arg2);
		for (int var5 = 0; var5 < 6; var5++) {
			for (int var6 = 0; var6 < arg3[var5].length; var6++) {
				int var7 = arg3[var5][var6];
				arg3[var5][var6] = var7 & 0xFF00FF00 | (var7 & 0xFF) << 16 | var7 >> 16 & 0xFF;
			}
		}
		this.field4980.method16092(this);
		if (arg2) {
			for (int var8 = 0; var8 < 6; var8++) {
				this.method7638(var8 + 34069, arg1, arg1, arg3[var8]);
			}
		} else {
			for (int var9 = 0; var9 < 6; var9++) {
				OpenGL.glTexImage2Di(var9 + 34069, 0, class1127.method19077(this.field4973, this.field4977), arg1, arg1, 0, class1127.method19085(this.field4973), this.field4980.field12027, arg3[var9], 0);
			}
		}
	}

	@ObfuscatedName("ail.aj()V")
	public void method5823() {
		super.method5823();
	}

	@ObfuscatedName("ail.ay(Llt;)V")
	public void method5824(class343 arg0) {
		super.method5824(arg0);
	}

	@ObfuscatedName("ail.m()V")
	public void method1010() {
		super.method1010();
	}
}
