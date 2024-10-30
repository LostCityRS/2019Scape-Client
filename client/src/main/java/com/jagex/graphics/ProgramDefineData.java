package com.jagex.graphics;

import deob.ObfuscatedName;

@ObfuscatedName("hc")
public class ProgramDefineData {

	@ObfuscatedName("hc.e")
	public String field2566;

	@ObfuscatedName("hc.n")
	public String field2565;

	@ObfuscatedName("hc.e(Lhw;I)V")
	public void decode(ShaderDataReader arg0) {
		this.field2566 = arg0.gstr();
		this.field2565 = arg0.gstr();
	}
}
