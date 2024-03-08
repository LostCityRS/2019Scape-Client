package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("aqw")
public class class1138 extends class916 {

	@ObfuscatedName("aqw.ai")
	public final class323 field12119;

	@ObfuscatedName("aqw.aw")
	public class1150 field12103;

	@ObfuscatedName("aqw.as")
	public class1150 field12104;

	@ObfuscatedName("aqw.at")
	public class234 field12105;

	@ObfuscatedName("aqw.ad")
	public class234 field12102;

	@ObfuscatedName("aqw.am")
	public class1150 field12107;

	@ObfuscatedName("aqw.au")
	public final class426 field12108 = new class426();

	@ObfuscatedName("aqw.ar")
	public class1150 field12118;

	@ObfuscatedName("aqw.ap")
	public final class426 field12106 = new class426();

	@ObfuscatedName("aqw.aq")
	public class1150 field12111;

	@ObfuscatedName("aqw.ax")
	public final float[] field12112 = new float[4];

	@ObfuscatedName("aqw.av")
	public class1150 field12113;

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

	public class1138(class850 arg0, class323 arg1) throws class1108 {
		super(arg0);
		this.field12119 = arg1;
		if (this.field12119.method5407() && arg0.method15957()) {
			this.method16761("Waterfall");
		}
	}

	@ObfuscatedName("aqw.a()Z")
	public boolean method16762() throws class1108 {
		this.field12118 = this.field10587.method4157("WorldMatrix");
		this.field12107 = this.field10587.method4157("WVPMatrix");
		this.field12111 = this.field10587.method4157("UGenerationPlane");
		this.field12113 = this.field10587.method4157("VGenerationPlane");
		this.field12103 = this.field10587.method4157("Time");
		this.field12104 = this.field10587.method4157("billowSampler3D");
		if (this.field12119.field3229) {
			this.field12105 = this.field10587.method4227("Waterfall3D");
			this.field10587.method4162(this.field12105);
		} else {
			this.field12102 = this.field10587.method4227("Waterfall2D");
			this.field10587.method4162(this.field12102);
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
			this.field3233.method16092(this.field12119.field3227[var7 % 16]);
		}
	}

	@ObfuscatedName("aqw.bl(I)V")
	public void method19202() {
		if (this.field12119.field3229) {
			this.field10587.method4162(this.field12105);
		} else {
			this.field10587.method4162(this.field12102);
		}
		this.field10587.method4244();
		if (this.field12119.field3229) {
			this.field10587.method4252(this.field12104, 0, this.field12119.field3228);
		}
		this.field10587.method4166(this.field12118, this.field12106);
		this.field10587.method4166(this.field12107, this.field12108);
		this.field10587.method4171(this.field12111, new class415(this.field12112[0], this.field12112[1], this.field12112[2], this.field12112[3]));
		this.field10587.method4171(this.field12113, new class415(this.field12114[0], this.field12114[1], this.field12114[2], this.field12114[3]));
		this.field10587.method4171(this.field12103, new class415(this.field12109, 0.0F, 0.0F, 0.0F));
		this.field3233.method16079(class357.field3403, this.field12116, this.field12110, this.field12115, this.field12117);
	}
}
