package com.jagex.graphics;

import com.jagex.game.client.PrimitiveType;
import com.jagex.math.Matrix4x4;
import deob.ObfuscatedName;

@ObfuscatedName("ahu")
public final class FixedFunctionSpriteShader extends SpriteShader {

	public FixedFunctionSpriteShader(GpuToolkit arg0) {
		super(arg0);
	}

	@ObfuscatedName("ahu.u()V")
	public void method16645() {
		this.field3002.method16080();
		this.method16644();
		this.field3002.setStreamSource(0, this.field3000);
		this.field3002.setVertexDeclaration(this.field2994);
		this.field3002.drawPrimitive(PrimitiveType.TRIANGLEFAN, this.field3001, 2);
	}

	@ObfuscatedName("ahu.z()V")
	public void method16644() {
		this.field3002.method16006(this.field2995);
		this.field3002.method15967(Matrix4x4.IDENTITY, Matrix4x4.IDENTITY, this.field2995);
		this.field3002.setActiveTexture(0);
		this.field3002.setTexture(this.field2997);
		this.field3002.method16041(0, TextureCombiner.field3365);
		this.field3002.method16042(0, TextureCombiner.field3365);
		this.field3002.method16041(1, TextureCombiner.field3368);
		this.field3002.method16042(1, TextureCombiner.field3368);
		this.field3002.method16046().setTo(this.field2998);
		this.field3002.method16174(TextureTramsformType.COUNT2);
	}

	@ObfuscatedName("ahu.e(II)V")
	public void method5050(int arg0, int arg1) {
		this.field3002.method15991(arg0);
		this.field3002.method16044(arg1);
	}

	@ObfuscatedName("ahu.n()V")
	public void method5051() {
		this.method16645();
	}

	@ObfuscatedName("ahu.m()V")
	public void method5054() {
		this.field3002.setActiveTexture(1);
		this.field3002.setTexture(this.field2996);
		this.field3002.method16046().setTo(this.field2999);
		this.field3002.method16174(TextureTramsformType.COUNT2);
		this.field3002.method16115(TextureCombineMode.field3396, TextureCombineMode.field3395);
		this.field3002.method16041(0, TextureCombiner.field3366);
		this.method16645();
		this.field3002.setActiveTexture(1);
		this.field3002.method16091();
	}
}
