package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aqe")
public class class1139 extends class916 {

	@ObfuscatedName("aqe.ai")
	public final boolean field12131;

	@ObfuscatedName("aqe.aw")
	public final class323 field12122;

	@ObfuscatedName("aqe.as")
	public class1150 field12121;

	@ObfuscatedName("aqe.at")
	public class1150 field12123;

	@ObfuscatedName("aqe.ad")
	public class1150 field12125;

	@ObfuscatedName("aqe.am")
	public final class426 field12143 = new class426();

	@ObfuscatedName("aqe.au")
	public class1150 field12126;

	@ObfuscatedName("aqe.ar")
	public final class426 field12127 = new class426();

	@ObfuscatedName("aqe.ap")
	public class1150 field12141;

	@ObfuscatedName("aqe.aq")
	public final class423 field12129 = new class423();

	@ObfuscatedName("aqe.ax")
	public int field12147;

	@ObfuscatedName("aqe.av")
	public class1150 field12142;

	@ObfuscatedName("aqe.ao")
	public final class415 field12132 = new class415();

	@ObfuscatedName("aqe.aj")
	public class1150 field12133;

	@ObfuscatedName("aqe.ay")
	public final class415 field12134 = new class415();

	@ObfuscatedName("aqe.ab")
	public class1150 field12135;

	@ObfuscatedName("aqe.az")
	public final class415 field12136 = new class415();

	@ObfuscatedName("aqe.aa")
	public class1150 field12137;

	@ObfuscatedName("aqe.af")
	public final class415 field12138 = new class415();

	@ObfuscatedName("aqe.ak")
	public class1150 field12139;

	@ObfuscatedName("aqe.an")
	public final class423 field12140 = new class423();

	@ObfuscatedName("aqe.bf")
	public class1150 field12151;

	@ObfuscatedName("aqe.bl")
	public final class415 field12124 = new class415();

	@ObfuscatedName("aqe.bk")
	public class1150 field12149;

	@ObfuscatedName("aqe.bh")
	public final class423 field12144 = new class423();

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
	public class234 field12128;

	public class1139(class850 arg0, class323 arg1, boolean arg2) throws class1108 {
		super(arg0);
		new class426();
		this.field12122 = arg1;
		this.field12150 = arg2;
		if (arg0.method15957() && arg0.method15958()) {
			this.field12131 = this.method16761("EnvMappedWater");
		} else {
			this.field12131 = false;
		}
	}

	@ObfuscatedName("aqe.a()Z")
	public boolean method16762() throws class1108 {
		if (!this.field12122.method5409()) {
			return false;
		}
		this.field12121 = this.field10587.method4157("NormalSampler");
		this.field12123 = this.field10587.method4157("EnvMapSampler");
		this.field12125 = this.field10587.method4157("WVPMatrix");
		this.field12126 = this.field10587.method4157("TexCoordMatrix");
		this.field12141 = this.field10587.method4157("EyePosAndTime");
		this.field12142 = this.field10587.method4157("SunDirectionAndExponent");
		this.field12133 = this.field10587.method4157("SunColourAndWaveExponent");
		this.field12135 = this.field10587.method4157("WaveIntensityAndBreakWaterDepthAndOffset");
		this.field12137 = this.field10587.method4157("HeightFogPlane");
		this.field12139 = this.field10587.method4157("HeightFogColour");
		this.field12151 = this.field10587.method4157("DistanceFogPlane");
		this.field12149 = this.field10587.method4157("DistanceFogColour");
		this.field12128 = this.field10587.method4227(this.field12150 ? "EnvMappedSea" : "EnvMappedWater");
		this.field10587.method4162(this.field12128);
		return true;
	}

	@ObfuscatedName("aqe.bf(I)Z")
	public boolean method19209() {
		return this.field12131;
	}

	@ObfuscatedName("aqe.i(Lpq;)V")
	public void method16765(class426 arg0) {
		class426 var2 = new class426();
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
		this.field10587.method4162(this.field12128);
		this.field10587.method4244();
		this.field10587.method4252(this.field12121, 0, this.field12122.field3224);
		this.field10587.method4252(this.field12123, 1, this.field3233.method15994());
		this.field10587.method4166(this.field12125, this.field12143);
		this.field10587.method4201(this.field12126, this.field12127);
		int var1 = 0x1 << (this.field12147 & 0x3);
		this.field10587.method4169(this.field12141, this.field12129.field4308, this.field12129.field4311, this.field12129.field4313, (float) (this.field3233.field10181 * var1 % 40000) / 40000.0F);
		this.field10587.method4171(this.field12142, this.field12132);
		this.field10587.method4171(this.field12133, this.field12134);
		this.field10587.method4171(this.field12135, this.field12136);
		this.field10587.method4171(this.field12137, this.field12138);
		this.field10587.method4246(this.field12139, this.field12140);
		this.field10587.method4171(this.field12151, this.field12124);
		this.field10587.method4246(this.field12149, this.field12144);
		this.field3233.method16079(class357.field3403, this.field12145, this.field12146, this.field12120, this.field12148);
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
