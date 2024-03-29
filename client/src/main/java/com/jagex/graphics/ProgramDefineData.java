package com.jagex.graphics;

import deob.ObfuscatedName;

@ObfuscatedName("hc")
public class ProgramDefineData {

	@ObfuscatedName("hc.e")
	public String field2566;

	@ObfuscatedName("hc.n")
	public String field2565;

	@ObfuscatedName("hc.e(Lhw;I)V")
	public void decode(ShaderDataReader buf) {
		this.field2566 = buf.gstr();
		this.field2565 = buf.gstr();
	}
}
