package com.jagex.graphics;

import com.jagex.game.client.PrimitiveType;
import com.jagex.math.Matrix4x4;
import deob.ObfuscatedName;

@ObfuscatedName("ahf")
public final class FixedFunctionParticleShader extends ParticleShader {

	public FixedFunctionParticleShader(GpuToolkit arg0) {
		super(arg0);
	}

	@ObfuscatedName("ahf.e(Lpq;)V")
	public void method5038(Matrix4x4 arg0) {
		this.field2986.method15967(arg0, this.field2986.field10059, this.field2986.projectionMatrix);
	}

	@ObfuscatedName("ahf.n(IZ)V")
	public void method5039(int arg0, boolean arg1) {
		this.field2986.method16041(1, TextureCombiner.field3367);
		this.field2986.method16042(1, TextureCombiner.field3367);
		this.method16626();
		this.field2986.drawIndexedPrimitive(PrimitiveType.TRIANGLELIST, 0, arg0 * 4, 0, arg0 * 2);
	}

	@ObfuscatedName("ahf.m(Z)V")
	public void method5040(boolean arg0) {
		this.field2986.method16044(this.field2988);
		this.field2986.method16041(1, TextureCombiner.field3368);
		this.field2986.method16042(1, TextureCombiner.field3368);
		this.method16626();
		this.field2986.method16075();
	}

	@ObfuscatedName("ahf.p()V")
	public void method16626() {
		this.field2986.setActiveTexture(0);
		this.field2986.setTexture(this.field2991);
		this.field2986.method16041(0, TextureCombiner.field3365);
		this.field2986.method16042(0, TextureCombiner.field3365);
		this.field2986.method16115(TextureCombineMode.field3395, TextureCombineMode.field3395);
		this.field2986.method16046().setTo(this.field2987);
		this.field2986.method16174(TextureTramsformType.COUNT2);
	}
}
