package com.jagex.graphics;

import deob.ObfuscatedName;

@ObfuscatedName("hn")
public class ProgramData {

	@ObfuscatedName("hn.e")
	public String name;

	@ObfuscatedName("hn.n")
	public String vertexShaderFile;

	@ObfuscatedName("hn.m")
	public String fragmentShaderFile;

	@ObfuscatedName("hn.k")
	public ProgramDefineData[] vertexPrograms;

	@ObfuscatedName("hn.f")
	public ProgramDefineData[] fragmentPrograms;

	@ObfuscatedName("hn.e(Lhw;I)V")
	public void decode(ShaderDataReader buf) {
		this.name = buf.gstr();
		this.vertexShaderFile = buf.gstr();
		this.fragmentShaderFile = buf.gstr();
		int var2 = buf.g2();
		int var3 = buf.g2();
		this.vertexPrograms = var2 == 0 ? null : new ProgramDefineData[var2];
		this.fragmentPrograms = var3 == 0 ? null : new ProgramDefineData[var3];
		for (int index = 0; index < var2; index++) {
			this.vertexPrograms[index] = new ProgramDefineData();
			this.vertexPrograms[index].decode(buf);
		}
		for (int index = 0; index < var3; index++) {
			this.fragmentPrograms[index] = new ProgramDefineData();
			this.fragmentPrograms[index].decode(buf);
		}
	}
}
