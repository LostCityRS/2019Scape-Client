package com.jagex.graphics.postprocess.effects;

import com.jagex.graphics.*;
import deob.ObfuscatedName;

@ObfuscatedName("aia")
public class LevelsFilterEffect extends GpuPostProcessEffect {

	@ObfuscatedName("aia.m")
	public GpuShader shader;

	@ObfuscatedName("aia.k")
	public GpuProgram techAdjustUniform;

	@ObfuscatedName("aia.f")
	public ProgramUniform sceneTexUniform;

	@ObfuscatedName("aia.w")
	public ProgramUniform paramsGammaUniform;

	@ObfuscatedName("aia.l")
	public ProgramUniform paramsRangesUniform;

	@ObfuscatedName("aia.u")
	public ProgramUniform pixelOffsetUniform;

	@ObfuscatedName("aia.z")
	public ProgramUniform posAndTexCoordsUniform;

	@ObfuscatedName("aia.p")
	public static float paramsGamma = 1.0F;

	@ObfuscatedName("aia.d")
	public static float field10642 = 0.0F;

	@ObfuscatedName("aia.c")
	public static float field10643 = 1.0F;

	@ObfuscatedName("aia.r")
	public static float field10650 = 0.0F;

	@ObfuscatedName("aia.v")
	public static float field10651 = 1.0F;

	@ObfuscatedName("aia.o")
	public boolean field10640;

	public LevelsFilterEffect(GpuToolkit arg0) {
		super(arg0);
	}

	@ObfuscatedName("aia.e()Z")
	public boolean method5558() {
		return this.gpuRenderer.hasFramebufferObject && this.gpuRenderer.hasFragmentShader();
	}

	@ObfuscatedName("aia.n()Z")
	public boolean method5559() {
		return this.field10640;
	}

	@ObfuscatedName("aia.m()Z")
	public boolean method5572() {
		if (!this.method5558()) {
			return false;
		}
		this.shader = this.gpuRenderer.createShader("FilterLevels");
		if (this.shader == null) {
			return false;
		}
		try {
			this.sceneTexUniform = this.shader.getUniform("sceneTex");
			this.paramsGammaUniform = this.shader.getUniform("paramsGamma");
			this.paramsRangesUniform = this.shader.getUniform("paramsRanges");
			this.pixelOffsetUniform = this.shader.getUniform("pixelOffset");
			this.posAndTexCoordsUniform = this.shader.getUniform("PosAndTexCoords");
			this.techAdjustUniform = this.shader.getProgram("techAdjust");
		} catch (UniformNotFoundException var3) {
			return false;
		} catch (ProgramNotFoundException var4) {
			return false;
		}
		if (this.techAdjustUniform.compile()) {
			this.field10640 = true;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("aia.w(II)V")
	public void method5574(int arg0, int arg1) {
	}

	@ObfuscatedName("aia.f()V")
	public void method5562() {
	}

	@ObfuscatedName("aia.z()I")
	public int method5566() {
		return 1;
	}

	@ObfuscatedName("aia.l(ILafq;Llz;Ldw;Llz;Z)V")
	public void method5564(int arg0, FrameBuffer arg1, GpuTexture arg2, EffectInterface arg3, GpuTexture arg4, boolean arg5) {
		float var7 = this.gpuRenderer.method15954();
		float var8 = (float) arg1.getWidth();
		float var9 = (float) arg1.getHeight();
		float var10 = var7 * 2.0F / var8;
		float var11 = -var7 * 2.0F / var9;
		float[] var12 = new float[] { var10 + -1.0F, var11 + 1.0F, 0.0F, 0.0F, var10 + -1.0F, var11 + -3.0F, 0.0F, 2.0F, var10 + 3.0F, var11 + 1.0F, 2.0F, 0.0F };
		int var13 = (int) var8;
		int var14 = (int) var9;
		int var15 = arg5 ? this.gpuRenderer.getSurface().getWidth() : var13;
		int var16 = arg5 ? this.gpuRenderer.getSurface().getHeight() : var14;
		this.shader.setCurrentProgram(this.techAdjustUniform);
		this.shader.enable();
		float var17 = (float) var13 / var8;
		float var18 = (float) var14 / var9;
		float var19 = (float) var15 / var8;
		float var20 = (float) var16 / var9;
		var12[8] = (var12[8] + 1.0F) * var17 - 1.0F;
		var12[5] = (var12[5] - 1.0F) * var18 + 1.0F;
		var12[10] *= var19;
		var12[7] *= var20;
		this.shader.setUniformFloatv(this.posAndTexCoordsUniform, var12);
		this.shader.setUniform1i(this.sceneTexUniform, 0, arg2);
		this.shader.setUniform1f(this.paramsGammaUniform, paramsGamma);
		this.shader.setUniform4f(this.paramsRangesUniform, field10642, field10643, field10650, field10651);
		this.shader.setUniform4f(this.pixelOffsetUniform, 0.0F, 0.0F, 0.0F, 0.0F);
		this.gpuRenderer.method2164(0, 0, var13, var14);
	}

	@ObfuscatedName("aia.u(I)V")
	public void method5565(int arg0) {
		this.shader.method4214();
	}

	@ObfuscatedName("aia.d()I")
	public int method5568() {
		return 0;
	}

	@ObfuscatedName("aia.p()I")
	public int method5567() {
		return 1;
	}

	@ObfuscatedName("aia.v()Z")
	public boolean method5571() {
		return paramsGamma == 1.0F && field10642 == 0.0F && field10643 == 1.0F && field10650 == 0.0F && field10651 == 1.0F;
	}
}
