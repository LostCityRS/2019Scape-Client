package com.jagex.graphics.runetek5;

import deob.ObfuscatedName;

@ObfuscatedName("hj")
public class ShaderData {

	@ObfuscatedName("hj.e")
	public String field2577;

	@ObfuscatedName("hj.k")
	public ProgramUniformData[] field2580;

	@ObfuscatedName("hj.f")
	public ProgramUniformData[] field2581;

	@ObfuscatedName("hj.w")
	public ProgramData[] field2582;

	// line 13
	public ShaderData(byte[] arg0) throws ShaderDataException {
		this.method4279(arg0);
	}

	// line 18
	@ObfuscatedName("hj.e([BB)V")
	public void method4279(byte[] arg0) throws ShaderDataException {
		ShaderDataReader var2 = new ShaderDataReader(arg0);
		int var3 = var2.method4133();
		if (var3 != 4) {
			throw new ShaderDataException(this, var3, 4);
		}
		this.field2577 = var2.method4134();
		this.field2580 = new ProgramUniformData[var2.method4133()];
		this.field2581 = new ProgramUniformData[var2.method4133()];
		this.field2582 = new ProgramData[var2.method4133()];
		for (int var4 = 0; var4 < this.field2580.length; var4++) {
			this.field2580[var4] = new ProgramUniformData();
			this.field2580[var4].method4290(var2);
		}
		for (int var5 = 0; var5 < this.field2581.length; var5++) {
			this.field2581[var5] = new ProgramUniformData();
			this.field2581[var5].method4290(var2);
		}
		for (int var6 = 0; var6 < this.field2582.length; var6++) {
			this.field2582[var6] = new ProgramData();
			this.field2582[var6].method4077(var2);
		}
	}

	@ObfuscatedName("apu")
	public static class ShaderDataException extends Exception {

		// $FF: synthetic field
		public final ShaderData this$0;

		// line 40
		public ShaderDataException(ShaderData arg0, int arg1, int arg2) {
			super("");
			this.this$0 = arg0;
		}
	}
}
