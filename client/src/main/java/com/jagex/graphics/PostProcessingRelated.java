package com.jagex.graphics;

import com.jagex.core.datastruct.SecondaryNode;
import com.jagex.game.client.DataType;
import com.jagex.graphics.gl.GlToolkit;
import com.jagex.graphics.gl.GlPostProcessingRelated;
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("aeg")
public class PostProcessingRelated extends SecondaryNode implements GlPostProcessingRelated {

	@ObfuscatedName("aeg.k")
	public final GlToolkit field9348;

	@ObfuscatedName("aeg.f")
	public int field9353;

	@ObfuscatedName("aeg.w")
	public final int field9349;

	@ObfuscatedName("aeg.l")
	public final int field9347;

	@ObfuscatedName("aeg.u")
	public final DataType field9351;

	@ObfuscatedName("aeg.z")
	public final TextureFormat field9352;

	@ObfuscatedName("aeg.p")
	public final int field9350;

	@ObfuscatedName("aeg.d")
	public static final int[] field9354 = new int[1];

	public PostProcessingRelated(GlToolkit arg0, TextureFormat arg1, DataType arg2, int arg3, int arg4) {
		this.field9348 = arg0;
		this.field9349 = arg3;
		this.field9347 = arg4;
		this.field9352 = arg1;
		this.field9351 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, field9354, 0);
		this.field9353 = field9354[0];
		OpenGL.glBindRenderbufferEXT(36161, this.field9353);
		OpenGL.glRenderbufferStorageEXT(36161, GlToolkit.method15799(this.field9352, this.field9351), this.field9349, this.field9347);
		this.field9350 = this.field9352.id * this.field9349 * this.field9347 * this.field9351.field1652;
	}

	public PostProcessingRelated(GlToolkit arg0, TextureFormat arg1, DataType arg2, int arg3, int arg4, int arg5) {
		this.field9348 = arg0;
		this.field9349 = arg3;
		this.field9347 = arg4;
		this.field9352 = arg1;
		this.field9351 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, field9354, 0);
		this.field9353 = field9354[0];
		OpenGL.glBindRenderbufferEXT(36161, this.field9353);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg5, GlToolkit.method15799(this.field9352, this.field9351), this.field9349, this.field9347);
		this.field9350 = this.field9352.id * this.field9349 * this.field9347 * this.field9351.field1652;
	}

	@ObfuscatedName("aeg.e()I")
	public int method1015() {
		return this.field9349;
	}

	@ObfuscatedName("aeg.n()I")
	public int method1009() {
		return this.field9347;
	}

	@ObfuscatedName("aeg.z(I)V")
	public void method1318(int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.field9353);
	}

	@ObfuscatedName("aeg.m()V")
	public void delete() {
		if (this.field9353 != 0) {
			int[] var1 = new int[] { this.field9353 };
			OpenGL.glDeleteRenderbuffersEXT(1, var1, 0);
			this.field9353 = 0;
		}
	}

	@ObfuscatedName("aeg.r()V")
	public void method15351() {
		if (this.field9353 != 0) {
			this.field9348.method15796(this.field9353, this.field9350);
			this.field9353 = 0;
		}
	}

	public void finalize() throws Throwable {
		this.method15351();
		super.finalize();
	}
}
