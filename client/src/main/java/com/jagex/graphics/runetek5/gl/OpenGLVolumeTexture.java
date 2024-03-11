package com.jagex.graphics.runetek5.gl;

import com.jagex.DataType;
import com.jagex.TextureFormat;
import com.jagex.audio.runetek5.VolumeTexture;
import com.jagex.graphics.runetek5.GpuTextureRelated;
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("air")
public class OpenGLVolumeTexture extends OpenGLBaseTexture implements VolumeTexture {

	@ObfuscatedName("air.v")
	public final int field10616;

	@ObfuscatedName("air.o")
	public final int field10617;

	@ObfuscatedName("air.s")
	public final int field10618;

	public OpenGLVolumeTexture(OpenGLRenderer arg0, TextureFormat arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6) {
		super(arg0, 32879, arg1, DataType.UNSIGNED_INT_8, arg2 * arg3 * arg4, arg5);
		this.field10616 = arg2;
		this.field10617 = arg3;
		this.field10618 = arg4;
		this.field4980.method16092(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(this.field4979, 0, OpenGLRenderer.method19077(this.field4973, this.field4977), this.field10616, this.field10617, this.field10618, 0, OpenGLRenderer.method19085(this.field4973), 5121, arg6, 0);
		OpenGL.glPixelStorei(3317, 4);
		if (arg5) {
			this.method5708();
		}
	}

	@ObfuscatedName("air.aj()V")
	public void method5823() {
		super.method5823();
	}

	@ObfuscatedName("air.ay(Llt;)V")
	public void method5824(GpuTextureRelated arg0) {
		super.method5824(arg0);
	}

	@ObfuscatedName("air.m()V")
	public void method1010() {
		super.method1010();
	}
}
