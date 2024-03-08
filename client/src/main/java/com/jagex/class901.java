package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("ahq")
public class class901 extends class287 {

	@ObfuscatedName("ahq.m")
	public class238 field10515;

	@ObfuscatedName("ahq.k")
	public class1150 field10516;

	@ObfuscatedName("ahq.f")
	public class234 field10517;

	public class901(class850 arg0) throws class1108 {
		super(arg0);
		this.method16642();
	}

	@ObfuscatedName("ahq.f(I)Z")
	public boolean method16642() throws class1108 {
		this.field10515 = this.field2993.method15964("BatchedSprite");
		this.field10516 = this.field10515.method4157("SpriteSampler");
		this.field10517 = this.field10515.method4227("Normal");
		this.field10515.method4162(this.field10517);
		return true;
	}

	@ObfuscatedName("ahq.e()V")
	public void method5047() {
		this.field10515.method4244();
		this.field10515.method4252(this.field10516, 0, this.field2992);
	}
}
