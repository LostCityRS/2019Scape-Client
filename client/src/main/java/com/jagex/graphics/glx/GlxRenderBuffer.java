package com.jagex.graphics.glx;

import com.jagex.game.client.DataType;
import com.jagex.graphics.EffectInterface;
import com.jagex.graphics.GraphicsDeletable;
import com.jagex.graphics.TextureFormat;
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("rx")
public class GlxRenderBuffer implements GraphicsDeletable, EffectInterface, GlxRelated2 {

	@ObfuscatedName("rx.e")
	public final DataType field5001;

	@ObfuscatedName("rx.n")
	public final TextureFormat field4997;

	@ObfuscatedName("rx.m")
	public final int field4998;

	@ObfuscatedName("rx.k")
	public final int field4999;

	@ObfuscatedName("rx.f")
	public final GlxToolkit field5000;

	@ObfuscatedName("rx.w")
	public int field4996;

	public GlxRenderBuffer(GlxToolkit arg0, TextureFormat arg1, DataType arg2, int arg3, int arg4) {
		this.field4997 = arg1;
		this.field5001 = arg2;
		this.field4998 = arg3;
		this.field4999 = arg4;
		this.field5000 = arg0;
		int[] var6 = new int[1];
		OpenGL.glGenRenderbuffersEXT(1, var6, 0);
		this.field4996 = var6[0];
		OpenGL.glBindRenderbufferEXT(36161, this.field4996);
		OpenGL.glRenderbufferStorageEXT(36161, GlxToolkit.method19077(this.field4997, this.field5001), arg3, arg4);
	}

	public GlxRenderBuffer(GlxToolkit arg0, TextureFormat arg1, DataType arg2, int arg3, int arg4, int arg5) {
		this.field4997 = arg1;
		this.field5001 = arg2;
		this.field4998 = arg3;
		this.field4999 = arg4;
		this.field5000 = arg0;
		int[] var7 = new int[1];
		OpenGL.glGenRenderbuffersEXT(1, var7, 0);
		this.field4996 = var7[0];
		OpenGL.glBindRenderbufferEXT(36161, this.field4996);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg5, GlxToolkit.method19077(this.field4997, this.field5001), arg3, arg4);
	}

	@ObfuscatedName("rx.e()I")
	public int method1015() {
		return this.field4998;
	}

	@ObfuscatedName("rx.n()I")
	public int method1009() {
		return this.field4999;
	}

	@ObfuscatedName("rx.z(I)V")
	public void method7627(int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.field4996);
	}

	@ObfuscatedName("rx.m()V")
	public void delete() {
		if (this.field4996 != 0) {
			int[] var1 = new int[] { this.field4996 };
			OpenGL.glDeleteRenderbuffersEXT(1, var1, 0);
			this.field4996 = 0;
		}
	}

	@ObfuscatedName("rx.r()V")
	public void method7670() {
		if (this.field4996 != 0) {
			this.field5000.method19071(this.field4996, this.field5001.field1652 * this.field4999 * this.field4998 * this.field4997.id);
			this.field4996 = 0;
		}
	}

	public void finalize() throws Throwable {
		this.method7670();
		super.finalize();
	}
}
