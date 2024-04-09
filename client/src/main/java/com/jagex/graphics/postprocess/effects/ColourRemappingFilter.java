package com.jagex.graphics.postprocess.effects;

import com.jagex.graphics.*;
import deob.ObfuscatedName;

@ObfuscatedName("ais")
public class ColourRemappingFilter extends GpuPostProcessEffect {

	@ObfuscatedName("ais.m")
	public static float[] field10663 = new float[] { 0.0F, 0.0F, 0.0F };

	@ObfuscatedName("ais.k")
	public static float field10656 = 1.0F;

	@ObfuscatedName("ais.f")
	public static int field10655 = 1;

	@ObfuscatedName("ais.w")
	public static GpuColourRemapper[] field10653 = new GpuColourRemapper[] { null, null, null };

	@ObfuscatedName("ais.l")
	public GpuShader shader;

	@ObfuscatedName("ais.u")
	public ProgramUniform sceneTexUniform;

	@ObfuscatedName("ais.z")
	public GpuProgram[] techRemap3DPrograms = null;

	@ObfuscatedName("ais.p")
	public ProgramUniform[] remapTex3DPrograms = null;

	@ObfuscatedName("ais.d")
	public ProgramUniform paramsWeightingsUniform;

	@ObfuscatedName("ais.c")
	public ProgramUniform pixelOffsetUniforms;

	@ObfuscatedName("ais.r")
	public ProgramUniform posAndTexCoordsUniform;

	@ObfuscatedName("ais.v")
	public boolean field10664;

	public ColourRemappingFilter(GpuToolkit arg0) {
		super(arg0);
	}

	@ObfuscatedName("ais.e()Z")
	public boolean method5558() {
		return this.gpuRenderer.hasFramebufferObject && this.gpuRenderer.hasFragmentShader();
	}

	@ObfuscatedName("ais.n()Z")
	public boolean method5559() {
		return this.field10664;
	}

	@ObfuscatedName("ais.m()Z")
	public boolean method5572() {
		if (!this.method5558()) {
			return false;
		}
		this.shader = this.gpuRenderer.createShader("FilterColourRemapping");
		if (this.shader == null) {
			return false;
		}
		try {
			this.sceneTexUniform = this.shader.getUniform("sceneTex");
			this.techRemap3DPrograms = new GpuProgram[3];
			this.remapTex3DPrograms = new ProgramUniform[3];
			if (this.gpuRenderer.field10125) {
				this.techRemap3DPrograms[0] = this.shader.getProgram("techRemap3D_1");
				this.techRemap3DPrograms[1] = this.shader.getProgram("techRemap3D_2");
				this.techRemap3DPrograms[2] = this.shader.getProgram("techRemap3D_3");
				this.remapTex3DPrograms[0] = this.shader.getUniform("remapTex3D_1");
				this.remapTex3DPrograms[1] = this.shader.getUniform("remapTex3D_2");
				this.remapTex3DPrograms[2] = this.shader.getUniform("remapTex3D_3");
			} else {
				this.techRemap3DPrograms[0] = this.shader.getProgram("techRemap2D_1");
				this.techRemap3DPrograms[1] = this.shader.getProgram("techRemap2D_2");
				this.techRemap3DPrograms[2] = this.shader.getProgram("techRemap2D_3");
				this.remapTex3DPrograms[0] = this.shader.getUniform("remapTex2D_1");
				this.remapTex3DPrograms[1] = this.shader.getUniform("remapTex2D_2");
				this.remapTex3DPrograms[2] = this.shader.getUniform("remapTex2D_3");
			}
			this.paramsWeightingsUniform = this.shader.getUniform("paramsWeightings");
			this.pixelOffsetUniforms = this.shader.getUniform("pixelOffset");
			this.posAndTexCoordsUniform = this.shader.getUniform("PosAndTexCoords");
		} catch (UniformNotFoundException var3) {
			return false;
		} catch (ProgramNotFoundException var4) {
			return false;
		}
		if (this.techRemap3DPrograms[0].compile() && this.techRemap3DPrograms[1].compile() && this.techRemap3DPrograms[2].compile()) {
			this.field10664 = true;
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ais.w(II)V")
	public void method5574(int arg0, int arg1) {
	}

	@ObfuscatedName("ais.f()V")
	public void method5562() {
	}

	@ObfuscatedName("ais.z()I")
	public int method5566() {
		return 1;
	}

	@ObfuscatedName("ais.l(ILafq;Llz;Ldw;Llz;Z)V")
	public void method5564(int arg0, FrameBuffer arg1, GpuTexture arg2, EffectInterface arg3, GpuTexture arg4, boolean arg5) {
		float var7 = this.gpuRenderer.method15954();
		float var8 = (float) arg1.getWidth();
		float var9 = (float) arg1.getHeight();
		float var11 = var7 * 2.0F / var8;
		float var12 = -var7 * 2.0F / var9;
		float[] var13 = new float[] { var11 + -1.0F, var12 + 1.0F, 0.0F, 0.0F, var11 + -1.0F, var12 + -3.0F, 0.0F, 2.0F, var11 + 3.0F, var12 + 1.0F, 2.0F, 0.0F };
		int var14 = (int) var8;
		int var15 = (int) var9;
		int var16 = arg5 ? this.gpuRenderer.getSurface().getWidth() : var14;
		int var17 = arg5 ? this.gpuRenderer.getSurface().getHeight() : var15;
		GpuProgram var18 = this.techRemap3DPrograms[field10655 - 1];
		this.shader.setCurrentProgram(var18);
		this.shader.enable();
		this.shader.setUniform4f(this.paramsWeightingsUniform, field10656, field10663[0], field10663[1], field10663[2]);
		Object var19 = null;
		Object var20 = null;
		for (int var21 = 0; var21 < field10655; var21++) {
			if (field10653[var21] != null) {
				ProgramUniform var22 = this.remapTex3DPrograms[var21];
				BaseTexture var23 = field10653[var21].method15431();
				this.shader.setUniform1i(var22, var21 + 1, var23);
			}
		}
		float var24 = (float) var14 / var8;
		float var25 = (float) var15 / var9;
		float var26 = (float) var16 / var8;
		float var27 = (float) var17 / var9;
		var13[8] = (var13[8] + 1.0F) * var24 - 1.0F;
		var13[5] = (var13[5] - 1.0F) * var25 + 1.0F;
		var13[10] *= var26;
		var13[7] *= var27;
		this.shader.setUniformFloatv(this.posAndTexCoordsUniform, var13);
		this.shader.setUniform1i(this.sceneTexUniform, 0, arg2);
		this.shader.setUniform4f(this.pixelOffsetUniforms, 0.0F, 0.0F, 0.0F, 0.0F);
		this.gpuRenderer.method2164(0, 0, var14, var15);
	}

	@ObfuscatedName("ais.u(I)V")
	public void method5565(int arg0) {
		this.shader.method4214();
	}

	@ObfuscatedName("ais.d()I")
	public int method5568() {
		return 0;
	}

	@ObfuscatedName("ais.p()I")
	public int method5567() {
		return 2;
	}

	@ObfuscatedName("ais.v()Z")
	public boolean method5571() {
		return field10655 == 0 || field10656 == 1.0F || field10663[0] + field10663[1] + field10663[2] == 0.0F || field10653[0] == null && field10653[1] == null && field10653[2] == null;
	}
}
