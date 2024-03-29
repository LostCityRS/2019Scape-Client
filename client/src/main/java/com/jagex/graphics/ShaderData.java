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

	// line 13
	public ShaderData(byte[] arg0) throws ShaderDataException {
		this.decode(arg0);
	}

	// line 18
	@ObfuscatedName("hj.e([BB)V")
	public void decode(byte[] bytes) throws ShaderDataException {
		ShaderDataReader buf = new ShaderDataReader(bytes);
		int var3 = buf.g2();
		if (var3 != 4) {
			throw new ShaderDataException(this, var3, 4);
		}
		this.name = buf.gstr();
		this.vertexUniforms = new ProgramUniformData[buf.g2()];
		this.fragmentUniforms = new ProgramUniformData[buf.g2()];
		this.programs = new ProgramData[buf.g2()];
		for (int var4 = 0; var4 < this.vertexUniforms.length; var4++) {
			this.vertexUniforms[var4] = new ProgramUniformData();
			this.vertexUniforms[var4].decode(buf);
		}
		for (int var5 = 0; var5 < this.fragmentUniforms.length; var5++) {
			this.fragmentUniforms[var5] = new ProgramUniformData();
			this.fragmentUniforms[var5].decode(buf);
		}
		for (int var6 = 0; var6 < this.programs.length; var6++) {
			this.programs[var6] = new ProgramData();
			this.programs[var6].decode(buf);
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
