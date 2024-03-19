package com.jagex.graphics;

import deob.ObfuscatedName;

@ObfuscatedName("hj")
public class ShaderData {

	@ObfuscatedName("hj.e")
	public String name;

	@ObfuscatedName("hj.k")
	public ProgramUniformData[] uniforms;

	@ObfuscatedName("hj.f")
	public ProgramUniformData[] uniforms2;

	@ObfuscatedName("hj.w")
	public ProgramData[] programs;

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
		this.name = var2.method4134();
		this.uniforms = new ProgramUniformData[var2.method4133()];
		this.uniforms2 = new ProgramUniformData[var2.method4133()];
		this.programs = new ProgramData[var2.method4133()];
		for (int var4 = 0; var4 < this.uniforms.length; var4++) {
			this.uniforms[var4] = new ProgramUniformData();
			this.uniforms[var4].method4290(var2);
		}
		for (int var5 = 0; var5 < this.uniforms2.length; var5++) {
			this.uniforms2[var5] = new ProgramUniformData();
			this.uniforms2[var5].method4290(var2);
		}
		for (int var6 = 0; var6 < this.programs.length; var6++) {
			this.programs[var6] = new ProgramData();
			this.programs[var6].method4077(var2);
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
