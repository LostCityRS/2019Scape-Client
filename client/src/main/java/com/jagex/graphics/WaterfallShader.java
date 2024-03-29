package com.jagex.graphics;

import com.jagex.game.client.PrimitiveType;
import com.jagex.math.Matrix4x4;
import com.jagex.math.Vector4;
import deob.ObfuscatedName;

@ObfuscatedName("aqw")
public class WaterfallShader extends WaterShader {

	@ObfuscatedName("aqw.ai")
	public final WaterRelated field12119;

	@ObfuscatedName("aqw.aw")
	public ProgramUniform field12103;

	@ObfuscatedName("aqw.as")
	public ProgramUniform field12104;

	@ObfuscatedName("aqw.at")
	public Program field12105;

	@ObfuscatedName("aqw.ad")
	public Program field12102;

	@ObfuscatedName("aqw.am")
	public ProgramUniform field12107;

	@ObfuscatedName("aqw.au")
	public final Matrix4x4 field12108 = new Matrix4x4();

	@ObfuscatedName("aqw.ar")
	public ProgramUniform field12118;

	@ObfuscatedName("aqw.ap")
	public final Matrix4x4 field12106 = new Matrix4x4();

	@ObfuscatedName("aqw.aq")
	public ProgramUniform field12111;

	@ObfuscatedName("aqw.ax")
	public final float[] field12112 = new float[4];

	@ObfuscatedName("aqw.av")
	public ProgramUniform field12113;

	@ObfuscatedName("aqw.ao")
	public final float[] field12114 = new float[4];

	@ObfuscatedName("aqw.aj")
	public float field12109;

	@ObfuscatedName("aqw.ay")
	public int field12116;

	@ObfuscatedName("aqw.ab")
	public int field12110;

	@ObfuscatedName("aqw.az")
	public int field12115;

	@ObfuscatedName("aqw.aa")
	public int field12117;

	public WaterfallShader(GpuRenderer arg0, WaterRelated arg1) throws ShaderException {
		super(arg0);
		this.field12119 = arg1;
		if (this.field12119.method5407() && arg0.method15957()) {
			this.method16761("Waterfall");
		}
	}

	@ObfuscatedName("aqw.a()Z")
	public boolean method16762() throws ShaderException {
		this.field12118 = this.field10587.getUniform("WorldMatrix");
		this.field12107 = this.field10587.getUniform("WVPMatrix");
		this.field12111 = this.field10587.getUniform("UGenerationPlane");
		this.field12113 = this.field10587.getUniform("VGenerationPlane");
		this.field12103 = this.field10587.getUniform("Time");
		this.field12104 = this.field10587.getUniform("billowSampler3D");
		if (this.field12119.field3229) {
			this.field12105 = this.field10587.getProgram("Waterfall3D");
			this.field10587.setCurrentProgram(this.field12105);
		} else {
			this.field12102 = this.field10587.getProgram("Waterfall2D");
			this.field10587.setCurrentProgram(this.field12102);
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
			this.field12112[0] = var5;
			this.field12112[1] = 0.0F;
			this.field12112[2] = 0.0F;
			this.field12112[3] = 0.0F;
		} else {
			this.field12112[0] = 0.0F;
			this.field12112[1] = 0.0F;
			this.field12112[2] = var5;
			this.field12112[3] = 0.0F;
		}
		this.field12114[0] = 0.0F;
		this.field12114[1] = var5;
		this.field12114[2] = 0.0F;
		this.field12114[3] = (float) this.field3233.field10181 * var3 % 1.0F;
		if (this.field12119.field3229) {
			this.field12109 = (float) ((double) var4 * (double) this.field3233.field10181 % 1.0D);
		} else {
			int var7 = (int) ((float) this.field3233.field10181 * var4 * 16.0F);
			this.field3233.setTexture(this.field12119.field3227[var7 % 16]);
		}
	}

	@ObfuscatedName("aqw.bl(I)V")
	public void method19202() {
		if (this.field12119.field3229) {
			this.field10587.setCurrentProgram(this.field12105);
		} else {
			this.field10587.setCurrentProgram(this.field12102);
		}
		this.field10587.enable();
		if (this.field12119.field3229) {
			this.field10587.setUniform(this.field12104, 0, this.field12119.field3228);
		}
		this.field10587.setUniform4x4(this.field12118, this.field12106);
		this.field10587.setUniform4x4(this.field12107, this.field12108);
		this.field10587.setUniform(this.field12111, new Vector4(this.field12112[0], this.field12112[1], this.field12112[2], this.field12112[3]));
		this.field10587.setUniform(this.field12113, new Vector4(this.field12114[0], this.field12114[1], this.field12114[2], this.field12114[3]));
		this.field10587.setUniform(this.field12103, new Vector4(this.field12109, 0.0F, 0.0F, 0.0F));
		this.field3233.method16079(PrimitiveType.field3403, this.field12116, this.field12110, this.field12115, this.field12117);
	}
}
