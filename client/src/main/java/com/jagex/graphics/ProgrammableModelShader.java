package com.jagex.graphics;

import com.jagex.game.client.PrimitiveType;
import com.jagex.math.Matrix4x4;
import deob.ObfuscatedName;

@ObfuscatedName("ahv")
public class ProgrammableModelShader extends ModelShader {

	@ObfuscatedName("ahv.i")
	public GpuShader shader;

	@ObfuscatedName("ahv.ak")
	public final Matrix4x4 field10499 = new Matrix4x4();

	@ObfuscatedName("ahv.an")
	public final GpuProgram[] field10500 = new GpuProgram[19];

	@ObfuscatedName("ahv.bf")
	public final int[][] field10473 = new int[19][17];

	@ObfuscatedName("ahv.bl")
	public int[] field10501;

	public ProgrammableModelShader(GpuToolkit arg0) throws ShaderException {
		super(arg0);
		this.method16619();
	}

	@ObfuscatedName("ahv.a(I)Z")
	public boolean method16619() throws ShaderException {
		this.shader = this.field2963.createShader("Model");
		ProgramUniform var1 = this.shader.getUniform("DiffuseSampler");
		ProgramUniform var2 = this.shader.getUniform("EnvironmentSampler");
		ProgramUniform var3 = this.shader.getUniform("PointLightsPosAndRadiusInv");
		ProgramUniform var4 = this.shader.getUniform("PointLightsDiffuseColour");
		ProgramUniform var5 = this.shader.getUniform("WVPMatrix");
		ProgramUniform var6 = this.shader.getUniform("TexCoordMatrix");
		ProgramUniform var7 = this.shader.getUniform("HeightFogPlane");
		ProgramUniform var8 = this.shader.getUniform("HeightFogColour");
		ProgramUniform var9 = this.shader.getUniform("DistanceFogPlane");
		ProgramUniform var10 = this.shader.getUniform("DistanceFogColour");
		ProgramUniform var11 = this.shader.getUniform("SunDir");
		ProgramUniform var12 = this.shader.getUniform("SunColour");
		ProgramUniform var13 = this.shader.getUniform("AntiSunColour");
		ProgramUniform var14 = this.shader.getUniform("AmbientColour");
		ProgramUniform var15 = this.shader.getUniform("EyePos");
		ProgramUniform var16 = this.shader.getUniform("SpecularExponent");
		ProgramUniform var17 = this.shader.getUniform("WorldMatrix");
		this.field10500[0] = this.shader.getProgram("Unlit");
		this.field10500[1] = this.shader.getProgram("Unlit_IgnoreAlpha");
		this.field10500[17] = this.shader.getProgram("UnderwaterGround");
		this.field10500[18] = this.shader.getProgram("UnderwaterGroundSpecular");
		for (int var18 = 0; var18 <= 4; var18++) {
			this.field10500[var18 + 2] = this.shader.getProgram("Standard_" + var18 + "PointLights");
			this.field10500[var18 + 7] = this.shader.getProgram("Specular_" + var18 + "PointLights");
			this.field10500[var18 + 12] = this.shader.getProgram("EnvironmentalMapping_" + var18 + "PointLights");
		}
		for (int var19 = 0; var19 < 19; var19++) {
			int var20 = this.shader.getProgramIndex(this.field10500[var19]);
			this.field10473[var19][2] = var1.getLocation(var20);
			this.field10473[var19][3] = var2.getLocation(var20);
			this.field10473[var19][1] = var3.getLocation(var20);
			this.field10473[var19][0] = var4.getLocation(var20);
			this.field10473[var19][4] = var5.getLocation(var20);
			this.field10473[var19][5] = var6.getLocation(var20);
			this.field10473[var19][7] = var7.getLocation(var20);
			this.field10473[var19][8] = var8.getLocation(var20);
			this.field10473[var19][9] = var9.getLocation(var20);
			this.field10473[var19][10] = var10.getLocation(var20);
			this.field10473[var19][11] = var11.getLocation(var20);
			this.field10473[var19][12] = var12.getLocation(var20);
			this.field10473[var19][13] = var13.getLocation(var20);
			this.field10473[var19][14] = var14.getLocation(var20);
			this.field10473[var19][6] = var15.getLocation(var20);
			this.field10473[var19][15] = var17.getLocation(var20);
			this.field10473[var19][16] = var16.getLocation(var20);
		}
		this.shader.setCurrentProgram(this.field10500[2]);
		return true;
	}

	@ObfuscatedName("ahv.n(Lpq;)V")
	public void method5018(Matrix4x4 arg0) {
		this.field10499.setTo(arg0);
		this.field10499.multiply(this.field2963.field10081);
	}

	@ObfuscatedName("ahv.m(Z)V")
	public void method5019(boolean arg0) {
		if (arg0) {
			this.shader.setCurrentProgram(this.field10500[1]);
		} else {
			this.shader.setCurrentProgram(this.field10500[0]);
		}
		this.field10501 = this.field10473[this.shader.getCurrentProgramIndex()];
		this.shader.enable();
		this.shader.setUniform1i(this.field10501[2], 0, this.field2966);
		this.shader.setUniform4fv(this.field10501[4], this.field10499);
		this.shader.setUniform2fv(this.field10501[5], this.field2982);
		this.shader.setUniform4f(this.field10501[7], this.field2979.field4244, this.field2979.field4243, this.field2979.field4242, this.field2979.field4245);
		this.shader.setUniform3f(this.field10501[8], this.field2973.x, this.field2973.y, this.field2973.z);
		this.shader.setUniform4f(this.field10501[9], this.field2984.field4244, this.field2984.field4243, this.field2984.field4242, this.field2984.field4245);
		this.shader.setUniform3f(this.field10501[10], this.field2975.x, this.field2975.y, this.field2975.z);
		this.field2963.drawIndexedPrimitive(PrimitiveType.TRIANGLELIST, this.field2981, this.field2983, this.field2972, this.field2962);
	}

	@ObfuscatedName("ahv.l()V")
	public void method5023() {
		this.shader.setCurrentProgram(this.field10500[17]);
		this.field10501 = this.field10473[this.shader.getCurrentProgramIndex()];
		this.shader.enable();
		this.method16620(0);
	}

	@ObfuscatedName("ahv.u()V")
	public void method5024() {
		this.shader.setCurrentProgram(this.field10500[18]);
		this.field10501 = this.field10473[this.shader.getCurrentProgramIndex()];
		this.shader.enable();
		this.shader.setUniform3f(this.field10501[6], this.field2969.x, this.field2969.y, this.field2969.z);
		this.shader.setUniform4f(this.field10501[16], this.field2970, this.field2971, 0.0F, 0.0F);
		this.method16620(0);
	}

	@ObfuscatedName("ahv.g(IB)V")
	public void method16620(int arg0) {
		this.shader.setUniform1i(this.field10501[2], 0, this.field2966);
		this.shader.setUniform4fv(this.field10501[4], this.field10499);
		this.shader.setUniform2fv(this.field10501[5], this.field2982);
		this.shader.setUniform4f(this.field10501[7], this.field2979.field4244, this.field2979.field4243, this.field2979.field4242, this.field2979.field4245);
		this.shader.setUniform3f(this.field10501[8], this.field2973.x, this.field2973.y, this.field2973.z);
		this.shader.setUniform4f(this.field10501[9], this.field2984.field4244, this.field2984.field4243, this.field2984.field4242, this.field2984.field4245);
		this.shader.setUniform3f(this.field10501[10], this.field2975.x, this.field2975.y, this.field2975.z);
		this.shader.setUniform3fv(this.field10501[11], this.field2976);
		this.shader.setUniform3fv(this.field10501[12], this.field2977);
		this.shader.setUniform3fv(this.field10501[13], this.field2978);
		this.shader.setUniform3fv(this.field10501[14], this.field2968);
		if (arg0 > 0) {
			this.shader.setUniformFloatv(this.field10501[1], this.field2965, arg0 * 4);
			this.shader.setUniformFloatv(this.field10501[0], this.field2964, arg0 * 4);
		}
		this.field2963.drawIndexedPrimitive(PrimitiveType.TRIANGLELIST, this.field2981, this.field2983, this.field2972, this.field2962);
	}

	@ObfuscatedName("ahv.k(I)V")
	public void method5020(int arg0) {
		this.shader.setCurrentProgram(this.field10500[arg0 + 2]);
		this.field10501 = this.field10473[this.shader.getCurrentProgramIndex()];
		this.shader.enable();
		this.method16620(arg0);
	}

	@ObfuscatedName("ahv.f(I)V")
	public void method5031(int arg0) {
		this.shader.setCurrentProgram(this.field10500[arg0 + 7]);
		this.field10501 = this.field10473[this.shader.getCurrentProgramIndex()];
		this.shader.enable();
		this.shader.setUniform3f(this.field10501[6], this.field2969.x, this.field2969.y, this.field2969.z);
		this.shader.setUniform4f(this.field10501[16], this.field2970, this.field2971, 0.0F, 0.0F);
		this.method16620(arg0);
	}

	@ObfuscatedName("ahv.w(I)V")
	public void method5026(int arg0) {
		this.shader.setCurrentProgram(this.field10500[arg0 + 12]);
		this.field10501 = this.field10473[this.shader.getCurrentProgramIndex()];
		this.shader.enable();
		this.shader.setUniform3fv(this.field10501[15], this.field2980);
		this.shader.setUniform3f(this.field10501[6], this.field2969.x, this.field2969.y, this.field2969.z);
		this.shader.setUniform1i(this.field10501[3], 1, this.field2967);
		this.method16620(arg0);
	}
}
