package com.jagex.graphics;

import com.jagex.math.Matrix4x4;
import deob.ObfuscatedName;

@ObfuscatedName("ahk")
public class FixedFunctionBatchedSpriteShader extends BatchedSpriteShader {

	public FixedFunctionBatchedSpriteShader(GpuToolkit arg0) {
		super(arg0);
	}

	@ObfuscatedName("ahk.e()V")
	public void method5047() {
		this.field2993.method15967(Matrix4x4.IDENTITY, Matrix4x4.IDENTITY, Matrix4x4.IDENTITY);
		this.field2993.setActiveTexture(0);
		this.field2993.setTexture(this.field2992);
		this.field2993.method16041(0, TextureCombiner.field3365);
		this.field2993.method16042(0, TextureCombiner.field3365);
		this.field2993.method16041(1, TextureCombiner.field3367);
		this.field2993.method16042(1, TextureCombiner.field3367);
		this.field2993.method16115(TextureCombineMode.field3395, TextureCombineMode.field3395);
	}
}
