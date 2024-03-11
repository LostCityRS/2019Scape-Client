package com.jagex.core.datastruct;

import deob.ObfuscatedName;

@ObfuscatedName("aky")
public class SecondaryNode extends Node {

	@ObfuscatedName("aky.k")
	public long field11440;

	@ObfuscatedName("aky.f")
	public SecondaryNode field11439;

	@ObfuscatedName("aky.w")
	public SecondaryNode field11438;

	@ObfuscatedName("aky.t(S)V")
	public void method17806() {
		if (this.field11438 != null) {
			this.field11438.field11439 = this.field11439;
			this.field11439.field11438 = this.field11438;
			this.field11439 = null;
			this.field11438 = null;
		}
	}
}
