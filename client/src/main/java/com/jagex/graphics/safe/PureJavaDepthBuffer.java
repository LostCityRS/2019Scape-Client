package com.jagex.graphics.safe;

import com.jagex.graphics.EffectInterface;
import deob.ObfuscatedName;

@ObfuscatedName("bc")
public class PureJavaDepthBuffer implements EffectInterface {

	@ObfuscatedName("bc.e")
	public int field971;

	@ObfuscatedName("bc.n")
	public int field972;

	@ObfuscatedName("bc.m")
	public float[] field973;

	public PureJavaDepthBuffer(int arg0, int arg1) {
		this.field971 = arg0;
		this.field972 = arg1;
		this.field973 = new float[this.field972 * this.field971];
	}

	@ObfuscatedName("bc.e()I")
	public int method1015() {
		return this.field971;
	}

	@ObfuscatedName("bc.n()I")
	public int method1009() {
		return this.field972;
	}

	@ObfuscatedName("bc.m()V")
	public void delete() {
	}
}
