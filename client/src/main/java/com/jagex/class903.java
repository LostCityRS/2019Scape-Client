package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ahz")
public final class class903 extends class288 {

	@ObfuscatedName("ahz.p")
	public class238 field10532;

	@ObfuscatedName("ahz.g")
	public final class234[] field10527 = new class234[3];

	@ObfuscatedName("ahz.i")
	public final int[][] field10533 = new int[3][7];

	@ObfuscatedName("ahz.j")
	public int[] field10534;

	@ObfuscatedName("ahz.t")
	public class415 field10535 = new class415(1.0F, 1.0F, 1.0F, 1.0F);

	@ObfuscatedName("ahz.ae")
	public class415 field10536 = new class415(0.0F, 0.0F, 0.0F, 0.0F);

	public class903(class850 arg0) throws class1108 {
		super(arg0);
		this.method16651();
	}

	@ObfuscatedName("ahz.u(B)Z")
	public boolean method16651() throws class1108 {
		this.field10532 = this.field3002.method15964("Sprite");
		class1150 var1 = this.field10532.method4157("WVPMatrix");
		class1150 var2 = this.field10532.method4157("SpriteSampler");
		class1150 var3 = this.field10532.method4157("MaskSampler");
		class1150 var4 = this.field10532.method4157("MulColour");
		class1150 var5 = this.field10532.method4157("AddColour");
		class1150 var6 = this.field10532.method4157("SpriteTexCoordMatrix");
		class1150 var7 = this.field10532.method4157("MaskTexCoordMatrix");
		this.field10527[0] = this.field10532.method4227("Normal");
		this.field10527[1] = this.field10532.method4227("Masked");
		this.field10527[2] = this.field10532.method4227("AlphaTex");
		for (int var8 = 0; var8 < 3; var8++) {
			int var9 = this.field10532.method4200(this.field10527[var8]);
			this.field10533[var8][0] = var1.method19250(var9);
			this.field10533[var8][1] = var2.method19250(var9);
			this.field10533[var8][2] = var3.method19250(var9);
			this.field10533[var8][5] = var4.method19250(var9);
			this.field10533[var8][6] = var5.method19250(var9);
			this.field10533[var8][3] = var6.method19250(var9);
			this.field10533[var8][4] = var7.method19250(var9);
		}
		this.field10532.method4162(this.field10527[0]);
		return true;
	}

	@ObfuscatedName("ahz.e(II)V")
	public void method5050(int arg0, int arg1) {
		switch(arg0) {
			case 0:
				this.field10535.method6249(arg1);
				this.field10536.method6249(0);
				break;
			case 1:
				this.field10535.method6249(-1);
				this.field10536.method6249(0);
				break;
			case 2:
				this.field10535.method6249(arg1);
				this.field10536.method6249(0);
				break;
			case 3:
				this.field10535.method6249(arg1 & 0xFF000000 | 0xFFFFFF);
				this.field10536.method6249(arg1 & 0xFFFFFF);
				break;
			case 4:
				this.field10535.method6249(-1);
				this.field10536.method6249(arg1);
				this.field10536.method6259();
		}
	}

	@ObfuscatedName("ahz.z(I)V")
	public void method16649() {
		this.field10532.method4215(this.field10534[1], 0, this.field2997);
		this.field3002.method16006(this.field2995);
		this.field10532.method4183(this.field10534[0], this.field2995);
		this.field10532.method4182(this.field10534[3], this.field2998);
		this.field10532.method4178(this.field10534[5], this.field10535.field4244, this.field10535.field4243, this.field10535.field4242, this.field10535.field4245);
		this.field10532.method4178(this.field10534[6], this.field10536.field4244, this.field10536.field4243, this.field10536.field4242, this.field10536.field4245);
		this.field3002.method16120(0, this.field3000);
		this.field3002.method16177(this.field2994);
		this.field3002.method16077(class357.field3404, this.field3001, 2);
	}

	@ObfuscatedName("ahz.n()V")
	public void method5051() {
		this.field10532.method4162(this.field10527[0]);
		this.field10532.method4244();
		this.field10534 = this.field10533[this.field10532.method4212()];
		this.method16649();
	}

	@ObfuscatedName("ahz.m()V")
	public void method5054() {
		this.field10532.method4162(this.field10527[1]);
		this.field10532.method4244();
		this.field10534 = this.field10533[this.field10532.method4212()];
		this.field10532.method4215(this.field10534[2], 1, this.field2996);
		this.field10532.method4182(this.field10534[4], this.field2999);
		this.method16649();
	}
}
