package com.jagex.graphics.runetek5;

import com.jagex.ModelShader;
import com.jagex.PrimitiveType;
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
		ProgramUniform var1 = this.field10479.method4157("DiffuseSampler");
		ProgramUniform var2 = this.field10479.method4157("EnvironmentSampler");
		ProgramUniform var3 = this.field10479.method4157("PointLightsPosAndRadiusInv");
		ProgramUniform var4 = this.field10479.method4157("PointLightsDiffuseColour");
		ProgramUniform var5 = this.field10479.method4157("WVPMatrix");
		ProgramUniform var6 = this.field10479.method4157("TexCoordMatrix");
		ProgramUniform var7 = this.field10479.method4157("HeightFogPlane");
		ProgramUniform var8 = this.field10479.method4157("HeightFogColour");
		ProgramUniform var9 = this.field10479.method4157("DistanceFogPlane");
		ProgramUniform var10 = this.field10479.method4157("DistanceFogColour");
		ProgramUniform var11 = this.field10479.method4157("SunDir");
		ProgramUniform var12 = this.field10479.method4157("SunColour");
		ProgramUniform var13 = this.field10479.method4157("AntiSunColour");
		ProgramUniform var14 = this.field10479.method4157("AmbientColour");
		ProgramUniform var15 = this.field10479.method4157("EyePos");
		ProgramUniform var16 = this.field10479.method4157("SpecularExponent");
		ProgramUniform var17 = this.field10479.method4157("WorldMatrix");
		this.field10500[0] = this.field10479.method4227("Unlit");
		this.field10500[1] = this.field10479.method4227("Unlit_IgnoreAlpha");
		this.field10500[17] = this.field10479.method4227("UnderwaterGround");
		this.field10500[18] = this.field10479.method4227("UnderwaterGroundSpecular");
		for (int var18 = 0; var18 <= 4; var18++) {
			this.field10500[var18 + 2] = this.field10479.method4227("Standard_" + var18 + "PointLights");
			this.field10500[var18 + 7] = this.field10479.method4227("Specular_" + var18 + "PointLights");
			this.field10500[var18 + 12] = this.field10479.method4227("EnvironmentalMapping_" + var18 + "PointLights");
		}
		for (int var19 = 0; var19 < 19; var19++) {
			int var20 = this.field10479.method4200(this.field10500[var19]);
			this.field10473[var19][2] = var1.method19250(var20);
			this.field10473[var19][3] = var2.method19250(var20);
			this.field10473[var19][1] = var3.method19250(var20);
			this.field10473[var19][0] = var4.method19250(var20);
			this.field10473[var19][4] = var5.method19250(var20);
			this.field10473[var19][5] = var6.method19250(var20);
			this.field10473[var19][7] = var7.method19250(var20);
			this.field10473[var19][8] = var8.method19250(var20);
			this.field10473[var19][9] = var9.method19250(var20);
			this.field10473[var19][10] = var10.method19250(var20);
			this.field10473[var19][11] = var11.method19250(var20);
			this.field10473[var19][12] = var12.method19250(var20);
			this.field10473[var19][13] = var13.method19250(var20);
			this.field10473[var19][14] = var14.method19250(var20);
			this.field10473[var19][6] = var15.method19250(var20);
			this.field10473[var19][15] = var17.method19250(var20);
			this.field10473[var19][16] = var16.method19250(var20);
		}
		this.field10479.method4162(this.field10500[2]);
		return true;
	}

	@ObfuscatedName("ahv.n(Lpq;)V")
	public void method5018(Matrix4x4 arg0) {
		this.field10499.method6604(arg0);
		this.field10499.method6720(this.field2963.field10081);
	}

	@ObfuscatedName("ahv.m(Z)V")
	public void method5019(boolean arg0) {
		if (arg0) {
			this.field10479.method4162(this.field10500[1]);
		} else {
			this.field10479.method4162(this.field10500[0]);
		}
		this.field10501 = this.field10473[this.field10479.method4212()];
		this.field10479.method4244();
		this.field10479.method4215(this.field10501[2], 0, this.field2966);
		this.field10479.method4183(this.field10501[4], this.field10499);
		this.field10479.method4182(this.field10501[5], this.field2982);
		this.field10479.method4178(this.field10501[7], this.field2979.field4244, this.field2979.field4243, this.field2979.field4242, this.field2979.field4245);
		this.field10479.method4177(this.field10501[8], this.field2973.field4308, this.field2973.field4311, this.field2973.field4313);
		this.field10479.method4178(this.field10501[9], this.field2984.field4244, this.field2984.field4243, this.field2984.field4242, this.field2984.field4245);
		this.field10479.method4177(this.field10501[10], this.field2975.field4308, this.field2975.field4311, this.field2975.field4313);
		this.field2963.method16079(PrimitiveType.field3403, this.field2981, this.field2983, this.field2972, this.field2962);
	}

	@ObfuscatedName("ahv.l()V")
	public void method5023() {
		this.field10479.method4162(this.field10500[17]);
		this.field10501 = this.field10473[this.field10479.method4212()];
		this.field10479.method4244();
		this.method16620(0);
	}

	@ObfuscatedName("ahv.u()V")
	public void method5024() {
		this.field10479.method4162(this.field10500[18]);
		this.field10501 = this.field10473[this.field10479.method4212()];
		this.field10479.method4244();
		this.field10479.method4177(this.field10501[6], this.field2969.field4308, this.field2969.field4311, this.field2969.field4313);
		this.field10479.method4178(this.field10501[16], this.field2970, this.field2971, 0.0F, 0.0F);
		this.method16620(0);
	}

	@ObfuscatedName("ahv.g(IB)V")
	public void method16620(int arg0) {
		this.field10479.method4215(this.field10501[2], 0, this.field2966);
		this.field10479.method4183(this.field10501[4], this.field10499);
		this.field10479.method4182(this.field10501[5], this.field2982);
		this.field10479.method4178(this.field10501[7], this.field2979.field4244, this.field2979.field4243, this.field2979.field4242, this.field2979.field4245);
		this.field10479.method4177(this.field10501[8], this.field2973.field4308, this.field2973.field4311, this.field2973.field4313);
		this.field10479.method4178(this.field10501[9], this.field2984.field4244, this.field2984.field4243, this.field2984.field4242, this.field2984.field4245);
		this.field10479.method4177(this.field10501[10], this.field2975.field4308, this.field2975.field4311, this.field2975.field4313);
		this.field10479.method4179(this.field10501[11], this.field2976);
		this.field10479.method4179(this.field10501[12], this.field2977);
		this.field10479.method4179(this.field10501[13], this.field2978);
		this.field10479.method4179(this.field10501[14], this.field2968);
		if (arg0 > 0) {
			this.field10479.method4180(this.field10501[1], this.field2965, arg0 * 4);
			this.field10479.method4180(this.field10501[0], this.field2964, arg0 * 4);
		}
		this.field2963.method16079(PrimitiveType.field3403, this.field2981, this.field2983, this.field2972, this.field2962);
	}

	@ObfuscatedName("ahv.k(I)V")
	public void method5020(int arg0) {
		this.field10479.method4162(this.field10500[arg0 + 2]);
		this.field10501 = this.field10473[this.field10479.method4212()];
		this.field10479.method4244();
		this.method16620(arg0);
	}

	@ObfuscatedName("ahv.f(I)V")
	public void method5031(int arg0) {
		this.field10479.method4162(this.field10500[arg0 + 7]);
		this.field10501 = this.field10473[this.field10479.method4212()];
		this.field10479.method4244();
		this.field10479.method4177(this.field10501[6], this.field2969.field4308, this.field2969.field4311, this.field2969.field4313);
		this.field10479.method4178(this.field10501[16], this.field2970, this.field2971, 0.0F, 0.0F);
		this.method16620(arg0);
	}

	@ObfuscatedName("ahv.w(I)V")
	public void method5026(int arg0) {
		this.field10479.method4162(this.field10500[arg0 + 12]);
		this.field10501 = this.field10473[this.field10479.method4212()];
		this.field10479.method4244();
		this.field10479.method4181(this.field10501[15], this.field2980);
		this.field10479.method4177(this.field10501[6], this.field2969.field4308, this.field2969.field4311, this.field2969.field4313);
		this.field10479.method4215(this.field10501[3], 1, this.field2967);
		this.method16620(arg0);
	}
}
