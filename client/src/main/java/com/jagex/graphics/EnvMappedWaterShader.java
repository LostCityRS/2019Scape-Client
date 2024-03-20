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
	public final WaterRelated field12122;

	@ObfuscatedName("aqe.as")
	public ProgramUniform field12121;

	@ObfuscatedName("aqe.at")
	public ProgramUniform field12123;

	@ObfuscatedName("aqe.ad")
	public ProgramUniform field12125;

	@ObfuscatedName("aqe.am")
	public final Matrix4x4 field12143 = new Matrix4x4();

	@ObfuscatedName("aqe.au")
	public ProgramUniform field12126;

	@ObfuscatedName("aqe.ar")
	public final Matrix4x4 field12127 = new Matrix4x4();

	@ObfuscatedName("aqe.ap")
	public ProgramUniform field12141;

	@ObfuscatedName("aqe.aq")
	public final Vector3 field12129 = new Vector3();

	@ObfuscatedName("aqe.ax")
	public int field12147;

	@ObfuscatedName("aqe.av")
	public ProgramUniform field12142;

	@ObfuscatedName("aqe.ao")
	public final Vector4 field12132 = new Vector4();

	@ObfuscatedName("aqe.aj")
	public ProgramUniform field12133;

	@ObfuscatedName("aqe.ay")
	public final Vector4 field12134 = new Vector4();

	@ObfuscatedName("aqe.ab")
	public ProgramUniform field12135;

	@ObfuscatedName("aqe.az")
	public final Vector4 field12136 = new Vector4();

	@ObfuscatedName("aqe.aa")
	public ProgramUniform field12137;

	@ObfuscatedName("aqe.af")
	public final Vector4 field12138 = new Vector4();

	@ObfuscatedName("aqe.ak")
	public ProgramUniform field12139;

	@ObfuscatedName("aqe.an")
	public final Vector3 field12140 = new Vector3();

	@ObfuscatedName("aqe.bf")
	public ProgramUniform field12151;

	@ObfuscatedName("aqe.bl")
	public final Vector4 field12124 = new Vector4();

	@ObfuscatedName("aqe.bk")
	public ProgramUniform field12149;

	@ObfuscatedName("aqe.bh")
	public final Vector3 field12144 = new Vector3();

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
	public boolean field12150;

	@ObfuscatedName("aqe.bq")
	public Program field12128;

	public EnvMappedWaterShader(GpuRenderer arg0, WaterRelated arg1, boolean arg2) throws ShaderException {
		super(arg0);
		new Matrix4x4();
		this.field12122 = arg1;
		this.field12150 = arg2;
		if (arg0.method15957() && arg0.method15958()) {
			this.field12131 = this.method16761("EnvMappedWater");
		} else {
			this.field12131 = false;
		}
	}

	@ObfuscatedName("aqe.a()Z")
	public boolean method16762() throws ShaderException {
		if (!this.field12122.method5409()) {
			return false;
		}
		this.field12121 = this.field10587.getUniform("NormalSampler");
		this.field12123 = this.field10587.getUniform("EnvMapSampler");
		this.field12125 = this.field10587.getUniform("WVPMatrix");
		this.field12126 = this.field10587.getUniform("TexCoordMatrix");
		this.field12141 = this.field10587.getUniform("EyePosAndTime");
		this.field12142 = this.field10587.getUniform("SunDirectionAndExponent");
		this.field12133 = this.field10587.getUniform("SunColourAndWaveExponent");
		this.field12135 = this.field10587.getUniform("WaveIntensityAndBreakWaterDepthAndOffset");
		this.field12137 = this.field10587.getUniform("HeightFogPlane");
		this.field12139 = this.field10587.getUniform("HeightFogColour");
		this.field12151 = this.field10587.getUniform("DistanceFogPlane");
		this.field12149 = this.field10587.getUniform("DistanceFogColour");
		this.field12128 = this.field10587.getProgram(this.field12150 ? "EnvMappedSea" : "EnvMappedWater");
		this.field10587.setCurrentProgram(this.field12128);
		return true;
	}

	@ObfuscatedName("aqe.bf(I)Z")
	public boolean method19209() {
		return this.field12131;
	}

	@ObfuscatedName("aqe.i(Lpq;)V")
	public void method16765(Matrix4x4 arg0) {
		Matrix4x4 var2 = new Matrix4x4();
		var2.method6612(this.field12130, this.field12130, 1.0F, 1.0F);
		var2.method6606(arg0, var2);
		super.method16765(var2);
	}

	@ObfuscatedName("aqe.ag(Z)V")
	public void method16769(boolean arg0) {
		float var2 = (1.0F - Math.abs(this.field3233.field10114[1])) * 2.0F + 1.0F;
		float var3 = this.field3233.field10123;
		this.field3233.field10123 *= var2;
		super.method16769(arg0);
		this.field3233.field10123 = var3;
	}

	@ObfuscatedName("aqe.bl(B)V")
	public void method19210() {
		this.method19208();
		this.field10587.setCurrentProgram(this.field12128);
		this.field10587.enable();
		this.field10587.setUniform(this.field12121, 0, this.field12122.field3224);
		this.field10587.setUniform(this.field12123, 1, this.field3233.method15994());
		this.field10587.setUniform4x4(this.field12125, this.field12143);
		this.field10587.setUniform4x2(this.field12126, this.field12127);
		int var1 = 0x1 << (this.field12147 & 0x3);
		this.field10587.setUniform(this.field12141, this.field12129.x, this.field12129.y, this.field12129.z, (float) (this.field3233.field10181 * var1 % 40000) / 40000.0F);
		this.field10587.setUniform(this.field12142, this.field12132);
		this.field10587.setUniform(this.field12133, this.field12134);
		this.field10587.setUniform(this.field12135, this.field12136);
		this.field10587.setUniform(this.field12137, this.field12138);
		this.field10587.setUniform(this.field12139, this.field12140);
		this.field10587.setUniform(this.field12151, this.field12124);
		this.field10587.setUniform(this.field12149, this.field12144);
		this.field3233.method16079(PrimitiveType.field3403, this.field12145, this.field12146, this.field12120, this.field12148);
	}

	@ObfuscatedName("aqe.bk(I)V")
	public void method19208() {
		this.field12130 = 2.4414062E-4F;
		short var1 = 256;
		float var2 = 0.3F;
		float var3 = 0.4F;
		float var4 = 0.1F;
		byte var5 = 5;
		this.field12127.method6612(this.field12130, this.field12130, this.field12130, this.field12130);
		this.field12132.method6247(-this.field3233.field10114[0], -this.field3233.field10114[1], -this.field3233.field10114[2], 32.0F);
		this.field12134.method6247(this.field3233.field10142, this.field3233.field10120, this.field3233.field10210, (float) var5);
		this.field12136.method6247(var4, var3, (float) var1, var2);
	}
}
