package com.jagex.graphics;

import deob.ObfuscatedName;

@ObfuscatedName("hv")
public class ProgramUniformData {

	@ObfuscatedName("hv.e")
	public UniformType field2592;

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
	public void method4290(ShaderDataReader arg0) {
		int var2 = arg0.method4133();
		this.field2592 = UniformType.method6075()[var2];
		if (UniformType.ARRAY == this.field2592) {
			int var3 = arg0.method4133();
			this.field2587 = UniformType.method6075()[var3];
			this.field2588 = arg0.method4133();
		}
		this.field2586 = arg0.method4134();
		this.field2590 = arg0.method4134();
		int var4 = arg0.method4133();
		this.field2591 = new int[var4];
		this.field2593 = new int[var4];
		for (int var5 = 0; var5 < var4; var5++) {
			this.field2591[var5] = arg0.method4133();
			this.field2593[var5] = arg0.method4133();
		}
	}
}
