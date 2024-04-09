package com.jagex.graphics.postprocess.effects;

import com.jagex.graphics.*;
import deob.ObfuscatedName;

@ObfuscatedName("aii")
public class ColourGradingBloomEffect extends GpuPostProcessEffect {

	@ObfuscatedName("aii.k")
	public static float field10623 = 0.25F;

	@ObfuscatedName("aii.f")
	public static float field10624 = 1.0F;

	@ObfuscatedName("aii.w")
	public static float field10625 = 1.0F;

	@ObfuscatedName("aii.l")
	public static float field10626 = 1.0F;

	@ObfuscatedName("aii.u")
	public GpuShader shader;

	@ObfuscatedName("aii.z")
	public GpuProgram techFullscreenTriProgram;

	@ObfuscatedName("aii.p")
	public GpuProgram brightpassProgram;

	@ObfuscatedName("aii.d")
	public GpuProgram blurProgram;

	@ObfuscatedName("aii.c")
	public GpuProgram compositeProgram;

	@ObfuscatedName("aii.r")
	public GpuProgram techDefaultProgram;

	@ObfuscatedName("aii.v")
	public ProgramUniform sceneTexUniform;

	@ObfuscatedName("aii.o")
	public ProgramUniform bloomTex1Uniform;

	@ObfuscatedName("aii.s")
	public ProgramUniform paramsUniform;

	@ObfuscatedName("aii.y")
	public ProgramUniform sampleSizeUniform;

	@ObfuscatedName("aii.q")
	public ProgramUniform pixelOffsetAndBloomScaleUniform;

	@ObfuscatedName("aii.x")
	public ProgramUniform posAndTexCoordsUniform;

	@ObfuscatedName("aii.b")
	public boolean field10639;

	public ColourGradingBloomEffect(GpuToolkit arg0) {
		super(arg0);
	}

	@ObfuscatedName("aii.e()Z")
	public boolean method5558() {
		return this.gpuRenderer.hasFramebufferObject && this.gpuRenderer.hasFragmentShader() && this.gpuRenderer.method15959(true);
	}

	@ObfuscatedName("aii.n()Z")
	public boolean method5559() {
		return this.field10639;
	}

	@ObfuscatedName("aii.m()Z")
	public boolean method5572() {
		if (!this.method5558()) {
			return false;
		}
		this.shader = this.gpuRenderer.createShader("FilterBloom");
		if (this.shader == null) {
			return false;
		}
		try {
			this.sceneTexUniform = this.shader.getUniform("sceneTex");
			this.bloomTex1Uniform = this.shader.getUniform("bloomTex1");
			this.paramsUniform = this.shader.getUniform("params");
			this.sampleSizeUniform = this.shader.getUniform("sampleSize");
			this.pixelOffsetAndBloomScaleUniform = this.shader.getUniform("pixelOffsetAndBloomScale");
			this.posAndTexCoordsUniform = this.shader.getUniform("PosAndTexCoords");
			this.shader.getProgram("test");
			this.techFullscreenTriProgram = this.shader.getProgram("techFullscreenTri");
			this.brightpassProgram = this.shader.getProgram("brightpass");
			this.blurProgram = this.shader.getProgram("blur");
			this.compositeProgram = this.shader.getProgram("composite");
			this.techDefaultProgram = this.shader.getProgram("techDefault");
		} catch (UniformNotFoundException var3) {
			return false;
		} catch (ProgramNotFoundException var4) {
			return false;
		}
		if (!this.techFullscreenTriProgram.compile()) {
			return false;
		} else if (!this.brightpassProgram.compile()) {
			return false;
		} else if (!this.blurProgram.compile()) {
			return false;
		} else if (!this.compositeProgram.compile()) {
			return false;
		} else if (this.techDefaultProgram.compile()) {
			this.field10639 = true;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("aii.w(II)V")
	public void method5574(int arg0, int arg1) {
	}

	@ObfuscatedName("aii.f()V")
	public void method5562() {
	}

	@ObfuscatedName("aii.z()I")
	public int method5566() {
		return 4;
	}

	@ObfuscatedName("aii.l(ILafq;Llz;Ldw;Llz;Z)V")
	public void method5564(int arg0, FrameBuffer arg1, GpuTexture arg2, EffectInterface arg3, GpuTexture arg4, boolean arg5) {
		float var7 = this.gpuRenderer.method15954();
		float var8 = (float) arg1.getWidth();
		float var9 = (float) arg1.getHeight();
		GpuTexture var10 = arg2;
		float var11 = var7 * 2.0F / var8;
		float var12 = -var7 * 2.0F / var9;
		float[] var13 = new float[] { var11 + -1.0F, var12 + 1.0F, 0.0F, 0.0F, var11 + -1.0F, var12 + -3.0F, 0.0F, 2.0F, var11 + 3.0F, var12 + 1.0F, 2.0F, 0.0F };
		int var14 = (int) var8;
		int var15 = (int) var9;
		int var16 = arg5 ? this.gpuRenderer.getSurface().getWidth() : var14;
		int var17 = arg5 ? this.gpuRenderer.getSurface().getHeight() : var15;
		if (arg0 == 0) {
			var14 = 256;
			var15 = 256;
			this.shader.setCurrentProgram(this.brightpassProgram);
			this.shader.enable();
		} else if (arg0 == 1) {
			var14 = 256;
			var15 = 256;
			var16 = var14;
			var17 = var15;
			this.shader.setCurrentProgram(this.blurProgram);
			this.shader.enable();
			this.shader.setUniform2f(this.sampleSizeUniform, field10626 / var8, 0.0F);
		} else if (arg0 == 2) {
			var14 = 256;
			var15 = 256;
			var16 = var14;
			var17 = var15;
			this.shader.setCurrentProgram(this.blurProgram);
			this.shader.enable();
			this.shader.setUniform2f(this.sampleSizeUniform, 0.0F, field10626 / var9);
		} else if (arg0 == 3) {
			this.shader.setCurrentProgram(this.compositeProgram);
			var10 = arg4;
			this.shader.setUniform1i(this.bloomTex1Uniform, 1, arg2);
			this.shader.enable();
		}
		float var18 = (float) var14 / var8;
		float var19 = (float) var15 / var9;
		float var20 = (float) var16 / var8;
		float var21 = (float) var17 / var9;
		var13[8] = (var13[8] + 1.0F) * var18 - 1.0F;
		var13[5] = (var13[5] - 1.0F) * var19 + 1.0F;
		var13[10] *= var20;
		var13[7] *= var21;
		this.shader.setUniformFloatv(this.posAndTexCoordsUniform, var13);
		this.shader.setUniform1i(this.sceneTexUniform, 0, var10);
		this.shader.setUniform4f(this.paramsUniform, field10625, field10623, field10624, 0.0F);
		this.shader.setUniform4f(this.pixelOffsetAndBloomScaleUniform, 0.0F, 0.0F, 256.0F / var8, 256.0F / var9);
		this.gpuRenderer.method2164(0, 0, var14, var15);
	}

	@ObfuscatedName("aii.u(I)V")
	public void method5565(int arg0) {
		this.shader.method4214();
	}

	@ObfuscatedName("aii.d()I")
	public int method5568() {
		return 1;
	}

	@ObfuscatedName("aii.p()I")
	public int method5567() {
		return 0;
	}

	@ObfuscatedName("aii.v()Z")
	public boolean method5571() {
		return false;
	}
}
