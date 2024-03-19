package com.jagex.graphics;

import com.jagex.game.client.PrimitiveType;
import com.jagex.math.Matrix4x4;
import deob.ObfuscatedName;

@ObfuscatedName("ahv")
public class ProgrammableModelShader extends ModelShader {

	@ObfuscatedName("ahv.i")
	public Shader field10479;

	@ObfuscatedName("ahv.ak")
	public final Matrix4x4 field10499 = new Matrix4x4();

	@ObfuscatedName("ahv.an")
	public final Program[] field10500 = new Program[19];

	@ObfuscatedName("ahv.bf")
	public final int[][] field10473 = new int[19][17];

	@ObfuscatedName("ahv.bl")
	public int[] field10501;

	public ProgrammableModelShader(GpuRenderer arg0) throws ShaderException {
		super(arg0);
		this.method16619();
	}

	@ObfuscatedName("ahv.a(I)Z")
	public boolean method16619() throws ShaderException {
		this.field10479 = this.field2963.method15964("Model");
		ProgramUniform var1 = this.field10479.getUniform("DiffuseSampler");
		ProgramUniform var2 = this.field10479.getUniform("EnvironmentSampler");
		ProgramUniform var3 = this.field10479.getUniform("PointLightsPosAndRadiusInv");
		ProgramUniform var4 = this.field10479.getUniform("PointLightsDiffuseColour");
		ProgramUniform var5 = this.field10479.getUniform("WVPMatrix");
		ProgramUniform var6 = this.field10479.getUniform("TexCoordMatrix");
		ProgramUniform var7 = this.field10479.getUniform("HeightFogPlane");
		ProgramUniform var8 = this.field10479.getUniform("HeightFogColour");
		ProgramUniform var9 = this.field10479.getUniform("DistanceFogPlane");
		ProgramUniform var10 = this.field10479.getUniform("DistanceFogColour");
		ProgramUniform var11 = this.field10479.getUniform("SunDir");
		ProgramUniform var12 = this.field10479.getUniform("SunColour");
		ProgramUniform var13 = this.field10479.getUniform("AntiSunColour");
		ProgramUniform var14 = this.field10479.getUniform("AmbientColour");
		ProgramUniform var15 = this.field10479.getUniform("EyePos");
		ProgramUniform var16 = this.field10479.getUniform("SpecularExponent");
		ProgramUniform var17 = this.field10479.getUniform("WorldMatrix");
		this.field10500[0] = this.field10479.getProgram("Unlit");
		this.field10500[1] = this.field10479.getProgram("Unlit_IgnoreAlpha");
		this.field10500[17] = this.field10479.getProgram("UnderwaterGround");
		this.field10500[18] = this.field10479.getProgram("UnderwaterGroundSpecular");
		for (int var18 = 0; var18 <= 4; var18++) {
			this.field10500[var18 + 2] = this.field10479.getProgram("Standard_" + var18 + "PointLights");
			this.field10500[var18 + 7] = this.field10479.getProgram("Specular_" + var18 + "PointLights");
			this.field10500[var18 + 12] = this.field10479.getProgram("EnvironmentalMapping_" + var18 + "PointLights");
		}
		for (int var19 = 0; var19 < 19; var19++) {
			int var20 = this.field10479.getProgramIndex(this.field10500[var19]);
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
		this.field10479.setCurrentProgram(this.field10500[2]);
		return true;
	}

	@ObfuscatedName("ahv.n(Lpq;)V")
	public void method5018(Matrix4x4 arg0) {
		this.field10499.method6604(arg0);
		this.field10499.multiply(this.field2963.field10081);
	}

	@ObfuscatedName("ahv.m(Z)V")
	public void method5019(boolean arg0) {
		if (arg0) {
			this.field10479.setCurrentProgram(this.field10500[1]);
		} else {
			this.field10479.setCurrentProgram(this.field10500[0]);
		}
		this.field10501 = this.field10473[this.field10479.getCurrentProgramIndex()];
		this.field10479.enable();
		this.field10479.setUniform(this.field10501[2], 0, this.field2966);
		this.field10479.setUniform4x4(this.field10501[4], this.field10499);
		this.field10479.setUniform4x2(this.field10501[5], this.field2982);
		this.field10479.setUniform(this.field10501[7], this.field2979.field4244, this.field2979.field4243, this.field2979.field4242, this.field2979.field4245);
		this.field10479.setUniform(this.field10501[8], this.field2973.field4308, this.field2973.field4311, this.field2973.field4313);
		this.field10479.setUniform(this.field10501[9], this.field2984.field4244, this.field2984.field4243, this.field2984.field4242, this.field2984.field4245);
		this.field10479.setUniform(this.field10501[10], this.field2975.field4308, this.field2975.field4311, this.field2975.field4313);
		this.field2963.method16079(PrimitiveType.field3403, this.field2981, this.field2983, this.field2972, this.field2962);
	}

	@ObfuscatedName("ahv.l()V")
	public void method5023() {
		this.field10479.setCurrentProgram(this.field10500[17]);
		this.field10501 = this.field10473[this.field10479.getCurrentProgramIndex()];
		this.field10479.enable();
		this.method16620(0);
	}

	@ObfuscatedName("ahv.u()V")
	public void method5024() {
		this.field10479.setCurrentProgram(this.field10500[18]);
		this.field10501 = this.field10473[this.field10479.getCurrentProgramIndex()];
		this.field10479.enable();
		this.field10479.setUniform(this.field10501[6], this.field2969.field4308, this.field2969.field4311, this.field2969.field4313);
		this.field10479.setUniform(this.field10501[16], this.field2970, this.field2971, 0.0F, 0.0F);
		this.method16620(0);
	}

	@ObfuscatedName("ahv.g(IB)V")
	public void method16620(int arg0) {
		this.field10479.setUniform(this.field10501[2], 0, this.field2966);
		this.field10479.setUniform4x4(this.field10501[4], this.field10499);
		this.field10479.setUniform4x2(this.field10501[5], this.field2982);
		this.field10479.setUniform(this.field10501[7], this.field2979.field4244, this.field2979.field4243, this.field2979.field4242, this.field2979.field4245);
		this.field10479.setUniform(this.field10501[8], this.field2973.field4308, this.field2973.field4311, this.field2973.field4313);
		this.field10479.setUniform(this.field10501[9], this.field2984.field4244, this.field2984.field4243, this.field2984.field4242, this.field2984.field4245);
		this.field10479.setUniform(this.field10501[10], this.field2975.field4308, this.field2975.field4311, this.field2975.field4313);
		this.field10479.setUniform(this.field10501[11], this.field2976);
		this.field10479.setUniform(this.field10501[12], this.field2977);
		this.field10479.setUniform(this.field10501[13], this.field2978);
		this.field10479.setUniform(this.field10501[14], this.field2968);
		if (arg0 > 0) {
			this.field10479.setUniform(this.field10501[1], this.field2965, arg0 * 4);
			this.field10479.setUniform(this.field10501[0], this.field2964, arg0 * 4);
		}
		this.field2963.method16079(PrimitiveType.field3403, this.field2981, this.field2983, this.field2972, this.field2962);
	}

	@ObfuscatedName("ahv.k(I)V")
	public void method5020(int arg0) {
		this.field10479.setCurrentProgram(this.field10500[arg0 + 2]);
		this.field10501 = this.field10473[this.field10479.getCurrentProgramIndex()];
		this.field10479.enable();
		this.method16620(arg0);
	}

	@ObfuscatedName("ahv.f(I)V")
	public void method5031(int arg0) {
		this.field10479.setCurrentProgram(this.field10500[arg0 + 7]);
		this.field10501 = this.field10473[this.field10479.getCurrentProgramIndex()];
		this.field10479.enable();
		this.field10479.setUniform(this.field10501[6], this.field2969.field4308, this.field2969.field4311, this.field2969.field4313);
		this.field10479.setUniform(this.field10501[16], this.field2970, this.field2971, 0.0F, 0.0F);
		this.method16620(arg0);
	}

	@ObfuscatedName("ahv.w(I)V")
	public void method5026(int arg0) {
		this.field10479.setCurrentProgram(this.field10500[arg0 + 12]);
		this.field10501 = this.field10473[this.field10479.getCurrentProgramIndex()];
		this.field10479.enable();
		this.field10479.setUniform3x3(this.field10501[15], this.field2980);
		this.field10479.setUniform(this.field10501[6], this.field2969.field4308, this.field2969.field4311, this.field2969.field4313);
		this.field10479.setUniform(this.field10501[3], 1, this.field2967);
		this.method16620(arg0);
	}
}
