package com.jagex.graphics;

import com.jagex.game.client.PrimitiveType;
import com.jagex.math.Matrix4x4;
import com.jagex.math.Vector4;
import deob.ObfuscatedName;

@ObfuscatedName("aqw")
public class WaterfallShader extends WaterShader {

	@ObfuscatedName("aqw.ai")
	public final GpuWaterRelated field12119;

	@ObfuscatedName("aqw.aw")
	public ProgramUniform timeUniform;

	@ObfuscatedName("aqw.as")
	public ProgramUniform billowSampler3DUniform;

	@ObfuscatedName("aqw.at")
	public GpuProgram waterfall3DProgram;

	@ObfuscatedName("aqw.ad")
	public GpuProgram waterfall2DProgram;

	@ObfuscatedName("aqw.am")
	public ProgramUniform wvpMatrixUniform;

	@ObfuscatedName("aqw.au")
	public final Matrix4x4 wvpMatrix = new Matrix4x4();

	@ObfuscatedName("aqw.ar")
	public ProgramUniform worldMatrixUniform;

	@ObfuscatedName("aqw.ap")
	public final Matrix4x4 worldMatrix = new Matrix4x4();

	@ObfuscatedName("aqw.aq")
	public ProgramUniform uGenerationPlaneUniform;

	@ObfuscatedName("aqw.ax")
	public final float[] uGenerationPlane = new float[4];

	@ObfuscatedName("aqw.av")
	public ProgramUniform vGenerationPlaneUniform;

	@ObfuscatedName("aqw.ao")
	public final float[] vGenerationPlane = new float[4];

	@ObfuscatedName("aqw.aj")
	public float time;

	@ObfuscatedName("aqw.ay")
	public int field12116;

	@ObfuscatedName("aqw.ab")
	public int field12110;

	@ObfuscatedName("aqw.az")
	public int field12115;

	@ObfuscatedName("aqw.aa")
	public int field12117;

	public WaterfallShader(GpuToolkit gpuRenderer, GpuWaterRelated arg1) throws ShaderException {
		super(gpuRenderer);
		this.field12119 = arg1;
		if (this.field12119.method5407() && gpuRenderer.hasVertexShader()) {
			this.createShaderProgram("Waterfall");
		}
	}

	@ObfuscatedName("aqw.a()Z")
	public boolean method16762() throws ShaderException {
		this.worldMatrixUniform = this.shader.getUniform("WorldMatrix");
		this.wvpMatrixUniform = this.shader.getUniform("WVPMatrix");
		this.uGenerationPlaneUniform = this.shader.getUniform("UGenerationPlane");
		this.vGenerationPlaneUniform = this.shader.getUniform("VGenerationPlane");
		this.timeUniform = this.shader.getUniform("Time");
		this.billowSampler3DUniform = this.shader.getUniform("billowSampler3D");
		if (this.field12119.field3229) {
			this.waterfall3DProgram = this.shader.getProgram("Waterfall3D");
			this.shader.setCurrentProgram(this.waterfall3DProgram);
		} else {
			this.waterfall2DProgram = this.shader.getProgram("Waterfall2D");
			this.shader.setCurrentProgram(this.waterfall2DProgram);
		}
		return true;
	}

	@ObfuscatedName("aqw.bf(III)V")
	public void method19204(int arg0, int arg1) {
		float var3 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
		float var4 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		float var5 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean var6 = (arg0 & 0x80) != 0;
		if (var6) {
			this.uGenerationPlane[0] = var5;
			this.uGenerationPlane[1] = 0.0F;
			this.uGenerationPlane[2] = 0.0F;
			this.uGenerationPlane[3] = 0.0F;
		} else {
			this.uGenerationPlane[0] = 0.0F;
			this.uGenerationPlane[1] = 0.0F;
			this.uGenerationPlane[2] = var5;
			this.uGenerationPlane[3] = 0.0F;
		}
		this.vGenerationPlane[0] = 0.0F;
		this.vGenerationPlane[1] = var5;
		this.vGenerationPlane[2] = 0.0F;
		this.vGenerationPlane[3] = (float) this.gpuRenderer.field10181 * var3 % 1.0F;
		if (this.field12119.field3229) {
			this.time = (float) ((double) var4 * (double) this.gpuRenderer.field10181 % 1.0D);
		} else {
			int var7 = (int) ((float) this.gpuRenderer.field10181 * var4 * 16.0F);
			this.gpuRenderer.setTexture(this.field12119.field3227[var7 % 16]);
		}
	}

	@ObfuscatedName("aqw.bl(I)V")
	public void method19202() {
		if (this.field12119.field3229) {
			this.shader.setCurrentProgram(this.waterfall3DProgram);
		} else {
			this.shader.setCurrentProgram(this.waterfall2DProgram);
		}
		this.shader.enable();
		if (this.field12119.field3229) {
			this.shader.setUniform1i(this.billowSampler3DUniform, 0, this.field12119.field3228);
		}
		this.shader.setUniform4fv(this.worldMatrixUniform, this.worldMatrix);
		this.shader.setUniform4fv(this.wvpMatrixUniform, this.wvpMatrix);
		this.shader.setUniform4fv(this.uGenerationPlaneUniform, new Vector4(this.uGenerationPlane[0], this.uGenerationPlane[1], this.uGenerationPlane[2], this.uGenerationPlane[3]));
		this.shader.setUniform4fv(this.vGenerationPlaneUniform, new Vector4(this.vGenerationPlane[0], this.vGenerationPlane[1], this.vGenerationPlane[2], this.vGenerationPlane[3]));
		this.shader.setUniform4fv(this.timeUniform, new Vector4(this.time, 0.0F, 0.0F, 0.0F));
		this.gpuRenderer.drawIndexedPrimitive(PrimitiveType.TRIANGLELIST, this.field12116, this.field12110, this.field12115, this.field12117);
	}
}
