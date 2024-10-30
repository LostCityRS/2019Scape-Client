package com.jagex.graphics;

import deob.ObfuscatedName;

@ObfuscatedName("hj")
public class ShaderData {

	@ObfuscatedName("hj.e")
	public String name;

	@ObfuscatedName("hj.k")
	public ProgramUniformData[] vertexUniforms;

	@ObfuscatedName("hj.f")
	public ProgramUniformData[] fragmentUniforms;

	@ObfuscatedName("hj.w")
	public ProgramData[] programs;

	public ShaderData(byte[] arg0) throws ShaderDataException {
		this.decode(arg0);
	}

	@ObfuscatedName("hj.e([BB)V")
	public void decode(byte[] arg0) throws ShaderDataException {
		ShaderDataReader var2 = new ShaderDataReader(arg0);
		int var3 = var2.g2();
		if (var3 != 4) {
			throw new ShaderDataException(this, var3, 4);
		}
		this.name = var2.gstr();
		this.vertexUniforms = new ProgramUniformData[var2.g2()];
		this.fragmentUniforms = new ProgramUniformData[var2.g2()];
		this.programs = new ProgramData[var2.g2()];
		for (int var4 = 0; var4 < this.vertexUniforms.length; var4++) {
			this.vertexUniforms[var4] = new ProgramUniformData();
			this.vertexUniforms[var4].decode(var2);
		}
		for (int var5 = 0; var5 < this.fragmentUniforms.length; var5++) {
			this.fragmentUniforms[var5] = new ProgramUniformData();
			this.fragmentUniforms[var5].decode(var2);
		}
		for (int var6 = 0; var6 < this.programs.length; var6++) {
			this.programs[var6] = new ProgramData();
			this.programs[var6].decode(var2);
		}
	}
}
