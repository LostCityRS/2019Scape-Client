package com.jagex.graphics;

import com.jagex.game.client.PrimitiveType;
import com.jagex.math.Matrix4x4;
import deob.ObfuscatedName;

@ObfuscatedName("ahl")
public class FixedFunctionModelShader extends ModelShader {

	public FixedFunctionModelShader(GpuToolkit arg0) {
		super(arg0);
	}

	@ObfuscatedName("ahl.n(Lpq;)V")
	public void method5018(Matrix4x4 arg0) {
		this.field2963.method15967(arg0, this.field2963.field10059, this.field2963.projectionMatrix);
	}

	@ObfuscatedName("ahl.m(Z)V")
	public void method5019(boolean arg0) {
		this.field2963.setActiveTexture(0);
		this.field2963.method16041(0, TextureCombiner.field3365);
		this.field2963.method16042(0, TextureCombiner.field3365);
		this.field2963.method16041(1, TextureCombiner.field3367);
		this.field2963.method16042(1, TextureCombiner.field3367);
		this.field2963.method16115(TextureCombineMode.field3395, TextureCombineMode.field3395);
		this.method16615();
	}

	@ObfuscatedName("ahl.a()V")
	public void method16615() {
		this.field2963.setTexture(this.field2966);
		this.field2963.method16046().setTo(this.field2982);
		this.field2963.method16174(TextureTramsformType.COUNT2);
		this.field2963.drawIndexedPrimitive(PrimitiveType.TRIANGLELIST, this.field2981, this.field2983, this.field2972, this.field2962);
	}

	@ObfuscatedName("ahl.k(I)V")
	public void method5020(int arg0) {
		this.field2963.setActiveTexture(0);
		this.field2963.method16115(TextureCombineMode.field3395, TextureCombineMode.field3395);
		this.field2963.method16041(0, TextureCombiner.field3365);
		this.field2963.method16042(0, TextureCombiner.field3365);
		this.field2963.method16041(1, TextureCombiner.field3367);
		this.field2963.method16042(1, TextureCombiner.field3367);
		this.method16615();
	}

	@ObfuscatedName("ahl.f(I)V")
	public void method5031(int arg0) {
		this.field2963.setActiveTexture(0);
		this.field2963.method16115(TextureCombineMode.field3395, TextureCombineMode.field3396);
		this.field2963.method16041(0, TextureCombiner.field3365);
		this.field2963.method16042(0, TextureCombiner.field3367);
		this.field2963.method16041(1, TextureCombiner.field3367);
		this.field2963.method16042(1, TextureCombiner.field3367);
		this.method16615();
	}

	@ObfuscatedName("ahl.w(I)V")
	public void method5026(int arg0) {
		this.field2963.setActiveTexture(0);
		this.field2963.method16115(TextureCombineMode.field3395, TextureCombineMode.field3396);
		this.field2963.method16041(0, TextureCombiner.field3365);
		this.field2963.method16042(0, TextureCombiner.field3367);
		this.field2963.method16041(1, TextureCombiner.field3367);
		this.field2963.method16042(1, TextureCombiner.field3367);
		this.method16615();
	}

	@ObfuscatedName("ahl.l()V")
	public void method5023() {
		this.method5020(0);
	}

	@ObfuscatedName("ahl.u()V")
	public void method5024() {
		this.method5020(0);
	}
}
