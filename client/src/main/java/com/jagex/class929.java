package com.jagex;

import deob.ObfuscatedName;
import jagdx.IDirect3DCubeTexture;
import jagdx.IDirect3DDevice;

import java.nio.ByteBuffer;

@ObfuscatedName("aif")
public class class929 extends class408 implements class362 {

	@ObfuscatedName("aif.w")
	public final int field10676;

	public class929(class1126 arg0, int arg1, boolean arg2, int[][] arg3) {
		super(arg0, TextureFormat.field1273, DataType.field1645, arg2 && arg0.field11967, arg1 * arg1 * 6);
		this.field10676 = arg1;
		if (this.field4220) {
			this.field4217 = IDirect3DDevice.CreateCubeTexture(this.field4219.field11978, this.field10676, 0, 1024, 21, 1);
		} else {
			this.field4217 = IDirect3DDevice.CreateCubeTexture(this.field4219.field11978, this.field10676, 1, 0, 21, 1);
		}
		ByteBuffer var5 = this.field4219.field10071;
		this.field4219.method15961(this.field10676 * this.field10676 * 4);
		for (int var6 = 0; var6 < 6; var6++) {
			var5.clear();
			var5.asIntBuffer().put(arg3[var6]);
			IDirect3DCubeTexture.Upload(this.field4217, var6, 0, 0, 0, this.field10676, this.field10676, this.field10676 * 4, 0, this.field4219.field10046);
		}
	}

	@ObfuscatedName("aif.aj()V")
	public void method5823() {
		this.field4219.method19001(this);
	}

	@ObfuscatedName("aif.m()V")
	public void method1010() {
		super.method1010();
	}

	@ObfuscatedName("aif.ay(Llt;)V")
	public void method5824(class343 arg0) {
		super.method5824(arg0);
	}
}
