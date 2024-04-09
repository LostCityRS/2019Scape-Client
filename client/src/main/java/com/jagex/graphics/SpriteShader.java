package com.jagex.graphics;

import com.jagex.math.Matrix4x4;
import deob.ObfuscatedName;

@ObfuscatedName("jc")
public abstract class SpriteShader {

	@ObfuscatedName("jc.e")
	public GpuToolkit field3002;

	@ObfuscatedName("jc.n")
	public GpuTexture field2997;

	@ObfuscatedName("jc.m")
	public GpuTexture field2996;

	@ObfuscatedName("jc.k")
	public final Matrix4x4 field2995 = new Matrix4x4();

	@ObfuscatedName("jc.f")
	public final Matrix4x4 field2998 = new Matrix4x4();

	@ObfuscatedName("jc.w")
	public final Matrix4x4 field2999 = new Matrix4x4();

	@ObfuscatedName("jc.l")
	public VertexBuffer field3000;

	@ObfuscatedName("jc.u")
	public int field3001;

	@ObfuscatedName("jc.z")
	public VertexDeclaration field2994;

	public SpriteShader(GpuToolkit arg0) {
		this.field3002 = arg0;
	}

	@ObfuscatedName("jc.e(II)V")
	public abstract void method5050(int arg0, int arg1);

	@ObfuscatedName("jc.n()V")
	public abstract void method5051();

	@ObfuscatedName("jc.m()V")
	public abstract void method5054();
}
