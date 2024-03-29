package com.jagex.graphics;

import deob.ObfuscatedName;

@ObfuscatedName("hv")
public class ProgramUniformData {

	@ObfuscatedName("hv.e")
	public UniformType uniformType;

	@ObfuscatedName("hv.n")
	public UniformType field2587;

	@ObfuscatedName("hv.m")
	public int field2588 = -1;

	@ObfuscatedName("hv.k")
	public String field2586;

	@ObfuscatedName("hv.f")
	public String field2590;

	@ObfuscatedName("hv.w")
	public int[] field2591;

	@ObfuscatedName("hv.l")
	public int[] field2593;

	@ObfuscatedName("hv.e(Lhw;I)V")
	public void decode(ShaderDataReader buf) {
		int var2 = buf.g2();
		this.uniformType = UniformType.values()[var2];
		if (UniformType.ARRAY == this.uniformType) {
			int var3 = buf.g2();
			this.field2587 = UniformType.values()[var3];
			this.field2588 = buf.g2();

		}
		this.field2586 = buf.gstr();
		this.field2590 = buf.gstr();
		int var4 = buf.g2();
		this.field2591 = new int[var4];
		this.field2593 = new int[var4];
		for (int var5 = 0; var5 < var4; var5++) {
			this.field2591[var5] = buf.g2();
			this.field2593[var5] = buf.g2();
		}
	}
}
