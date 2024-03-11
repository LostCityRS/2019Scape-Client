package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ahk")
public class FixedFunctionBatchedSpriteShader extends BatchedSpriteShader {

	public FixedFunctionBatchedSpriteShader(GpuRenderer arg0) {
		super(arg0);
	}

	@ObfuscatedName("ahk.e()V")
	public void method5047() {
		this.field2993.method15967(Matrix4x4.field4317, Matrix4x4.field4317, Matrix4x4.field4317);
		this.field2993.method16038(0);
		this.field2993.method16092(this.field2992);
		this.field2993.method16041(0, class351.field3365);
		this.field2993.method16042(0, class351.field3365);
		this.field2993.method16041(1, class351.field3367);
		this.field2993.method16042(1, class351.field3367);
		this.field2993.method16115(class355.field3395, class355.field3395);
	}
}
