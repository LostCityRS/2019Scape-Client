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
	public void decode(ShaderDataReader arg0) {
		this.name = arg0.gstr();
		this.vertexShaderFile = arg0.gstr();
		this.fragmentShaderFile = arg0.gstr();
		int var2 = arg0.g2();
		int var3 = arg0.g2();
		this.vertexPrograms = var2 == 0 ? null : new ProgramDefineData[var2];
		this.fragmentPrograms = var3 == 0 ? null : new ProgramDefineData[var3];
		for (int var4 = 0; var4 < var2; var4++) {
			this.vertexPrograms[var4] = new ProgramDefineData();
			this.vertexPrograms[var4].decode(arg0);
		}
		for (int var5 = 0; var5 < var3; var5++) {
			this.fragmentPrograms[var5] = new ProgramDefineData();
			this.fragmentPrograms[var5].decode(arg0);
		}
	}
}
