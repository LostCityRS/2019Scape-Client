package com.jagex;

import com.jagex.deob.ObfuscatedName;
import jaclib.memory.Stream;

@ObfuscatedName("asb")
public class class1189 extends class997 {

	public class1189(int arg0) {
		super(arg0);
	}

	@ObfuscatedName("asb.jg(F)V")
	public void method19550(float arg0) {
		int var2 = Stream.floatToRawIntBits(arg0);
		this.field11502[(++this.field11503) - 1] = (byte) (var2 >> 24);
		this.field11502[(++this.field11503) - 1] = (byte) (var2 >> 16);
		this.field11502[(++this.field11503) - 1] = (byte) (var2 >> 8);
		this.field11502[(++this.field11503) - 1] = (byte) var2;
	}

	@ObfuscatedName("asb.jx(F)V")
	public void method19553(float arg0) {
		int var2 = Stream.floatToRawIntBits(arg0);
		this.field11502[(++this.field11503) - 1] = (byte) var2;
		this.field11502[(++this.field11503) - 1] = (byte) (var2 >> 8);
		this.field11502[(++this.field11503) - 1] = (byte) (var2 >> 16);
		this.field11502[(++this.field11503) - 1] = (byte) (var2 >> 24);
	}
}
