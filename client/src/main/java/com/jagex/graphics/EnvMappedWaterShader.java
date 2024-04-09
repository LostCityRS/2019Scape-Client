package com.jagex.graphics;

import com.jagex.game.client.PrimitiveType;
import com.jagex.math.Matrix4x4;
import com.jagex.math.Vector3;
import com.jagex.math.Vector4;
import deob.ObfuscatedName;

@ObfuscatedName("aqe")
public class EnvMappedWaterShader extends WaterShader {

	@ObfuscatedName("aqe.ai")
	public final boolean field12131;

	@ObfuscatedName("aqe.aw")
	public final GpuWaterRelated field12122;

	@ObfuscatedName("aqe.as")
	public ProgramUniform normalSamplerUniform;

	@ObfuscatedName("aqe.at")
	public ProgramUniform envMapSamplerUniform;

	@ObfuscatedName("aqe.ad")
	public ProgramUniform wvpMatrixUniform;

	@ObfuscatedName("aqe.am")
	public final Matrix4x4 wvpMatrix = new Matrix4x4();

	@ObfuscatedName("aqe.au")
	public ProgramUniform texCoordMatrixUniform;

	@ObfuscatedName("aqe.ar")
	public final Matrix4x4 texCoordMatrix = new Matrix4x4();

	@ObfuscatedName("aqe.ap")
	public ProgramUniform eyePosAndTimeUniform;

	@ObfuscatedName("aqe.aq")
	public final Vector3 eyePosAndTime = new Vector3();

	@ObfuscatedName("aqe.ax")
	public int field12147;

	@ObfuscatedName("aqe.av")
	public ProgramUniform sunDirectionAndExponentUniform;

	@ObfuscatedName("aqe.ao")
	public final Vector4 sunDirectionAndExponent = new Vector4();

	@ObfuscatedName("aqe.aj")
	public ProgramUniform sunColourAndWaveExponentUniform;

	@ObfuscatedName("aqe.ay")
	public final Vector4 sunColourAndWaveExponent = new Vector4();

	@ObfuscatedName("aqe.ab")
	public ProgramUniform waveIntensityAndBreakWaterDepthAndOffsetUniform;

	@ObfuscatedName("aqe.az")
	public final Vector4 waveIntensityAndBreakWaterDepthAndOffset = new Vector4();

	@ObfuscatedName("aqe.aa")
	public ProgramUniform heightFogPlaneUniform;

	@ObfuscatedName("aqe.af")
	public final Vector4 heightFogPlane = new Vector4();

	@ObfuscatedName("aqe.ak")
	public ProgramUniform heightFogColourUniform;

	@ObfuscatedName("aqe.an")
	public final Vector3 heightFogColour = new Vector3();

	@ObfuscatedName("aqe.bf")
	public ProgramUniform distanceFogPlaneUniform;

	@ObfuscatedName("aqe.bl")
	public final Vector4 distanceFogPlane = new Vector4();

	@ObfuscatedName("aqe.bk")
	public ProgramUniform distanceFogColourUniform;

	@ObfuscatedName("aqe.bh")
	public final Vector3 distanceFogColour = new Vector3();

	@ObfuscatedName("aqe.bx")
	public int field12145;

	@ObfuscatedName("aqe.bd")
	public int field12146;

	@ObfuscatedName("aqe.bc")
	public int field12120;

	@ObfuscatedName("aqe.bi")
	public int field12148;

	@ObfuscatedName("aqe.bn")
	public float field12130 = 0.0F;

	@ObfuscatedName("aqe.bt")
	public boolean isEnvMappedSea;

	@ObfuscatedName("aqe.bq")
	public GpuProgram envMappedWaterProgram;

	public EnvMappedWaterShader(GpuToolkit arg0, GpuWaterRelated arg1, boolean isEnvMappedSea) throws ShaderException {
		super(arg0);
		new Matrix4x4();
		this.field12122 = arg1;
		this.isEnvMappedSea = isEnvMappedSea;
		if (arg0.hasVertexShader() && arg0.hasFragmentShader()) {
			this.field12131 = this.createShaderProgram("EnvMappedWater");
		} else {
			this.field12131 = false;
		}
	}

	@ObfuscatedName("aqe.a()Z")
	public boolean method16762() throws ShaderException {
		if (!this.field12122.method5409()) {
			return false;
		}
		this.normalSamplerUniform = this.shader.getUniform("NormalSampler");
		this.envMapSamplerUniform = this.shader.getUniform("EnvMapSampler");
		this.wvpMatrixUniform = this.shader.getUniform("WVPMatrix");
		this.texCoordMatrixUniform = this.shader.getUniform("TexCoordMatrix");
		this.eyePosAndTimeUniform = this.shader.getUniform("EyePosAndTime");
		this.sunDirectionAndExponentUniform = this.shader.getUniform("SunDirectionAndExponent");
		this.sunColourAndWaveExponentUniform = this.shader.getUniform("SunColourAndWaveExponent");
		this.waveIntensityAndBreakWaterDepthAndOffsetUniform = this.shader.getUniform("WaveIntensityAndBreakWaterDepthAndOffset");
		this.heightFogPlaneUniform = this.shader.getUniform("HeightFogPlane");
		this.heightFogColourUniform = this.shader.getUniform("HeightFogColour");
		this.distanceFogPlaneUniform = this.shader.getUniform("DistanceFogPlane");
		this.distanceFogColourUniform = this.shader.getUniform("DistanceFogColour");
		this.envMappedWaterProgram = this.shader.getProgram(this.isEnvMappedSea ? "EnvMappedSea" : "EnvMappedWater");
		this.shader.setCurrentProgram(this.envMappedWaterProgram);
		return true;
	}

	@ObfuscatedName("aqe.bf(I)Z")
	public boolean method19209() {
		return this.field12131;
	}

	@ObfuscatedName("aqe.i(Lpq;)V")
	public void method16765(Matrix4x4 arg0) {
		Matrix4x4 var2 = new Matrix4x4();
		var2.scale(this.field12130, this.field12130, 1.0F, 1.0F);
		var2.setToProduct(arg0, var2);
		super.method16765(var2);
	}

	@ObfuscatedName("aqe.ag(Z)V")
	public void method16769(boolean arg0) {
		float var2 = (1.0F - Math.abs(this.gpuRenderer.field10114[1])) * 2.0F + 1.0F;
		float var3 = this.gpuRenderer.field10123;
		this.gpuRenderer.field10123 *= var2;
		super.method16769(arg0);
		this.gpuRenderer.field10123 = var3;
	}

	@ObfuscatedName("aqe.bl(B)V")
	public void method19210() {
		this.method19208();
		this.shader.setCurrentProgram(this.envMappedWaterProgram);
		this.shader.enable();
		this.shader.setUniform1i(this.normalSamplerUniform, 0, this.field12122.field3224);
		this.shader.setUniform1i(this.envMapSamplerUniform, 1, this.gpuRenderer.getEnvMapSampler());
		this.shader.setUniform4fv(this.wvpMatrixUniform, this.wvpMatrix);
		this.shader.setUniform2fv(this.texCoordMatrixUniform, this.texCoordMatrix);
		int var1 = 0x1 << (this.field12147 & 0x3);
		this.shader.setUniform4f(this.eyePosAndTimeUniform, this.eyePosAndTime.x, this.eyePosAndTime.y, this.eyePosAndTime.z, (float) (this.gpuRenderer.field10181 * var1 % 40000) / 40000.0F);
		this.shader.setUniform4fv(this.sunDirectionAndExponentUniform, this.sunDirectionAndExponent);
		this.shader.setUniform4fv(this.sunColourAndWaveExponentUniform, this.sunColourAndWaveExponent);
		this.shader.setUniform4fv(this.waveIntensityAndBreakWaterDepthAndOffsetUniform, this.waveIntensityAndBreakWaterDepthAndOffset);
		this.shader.setUniform4fv(this.heightFogPlaneUniform, this.heightFogPlane);
		this.shader.setUniform3fv(this.heightFogColourUniform, this.heightFogColour);
		this.shader.setUniform4fv(this.distanceFogPlaneUniform, this.distanceFogPlane);
		this.shader.setUniform3fv(this.distanceFogColourUniform, this.distanceFogColour);
		this.gpuRenderer.drawIndexedPrimitive(PrimitiveType.TRIANGLELIST, this.field12145, this.field12146, this.field12120, this.field12148);
	}

	@ObfuscatedName("aqe.bk(I)V")
	public void method19208() {
		this.field12130 = 2.4414062E-4F;
		short var1 = 256;
		float var2 = 0.3F;
		float var3 = 0.4F;
		float var4 = 0.1F;
		byte var5 = 5;
		this.texCoordMatrix.scale(this.field12130, this.field12130, this.field12130, this.field12130);
		this.sunDirectionAndExponent.method6247(-this.gpuRenderer.field10114[0], -this.gpuRenderer.field10114[1], -this.gpuRenderer.field10114[2], 32.0F);
		this.sunColourAndWaveExponent.method6247(this.gpuRenderer.field10142, this.gpuRenderer.field10120, this.gpuRenderer.field10210, (float) var5);
		this.waveIntensityAndBreakWaterDepthAndOffset.method6247(var4, var3, (float) var1, var2);
	}
}
