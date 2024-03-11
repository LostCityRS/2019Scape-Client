package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("hn")
public class ProgramData {

	@ObfuscatedName("hn.e")
	public String field2432;

	@ObfuscatedName("hn.n")
	public String field2428;

	@ObfuscatedName("hn.m")
	public String field2430;

	@ObfuscatedName("hn.k")
	public ProgramDefineData[] field2429;

	@ObfuscatedName("hn.f")
	public ProgramDefineData[] field2431;

	@ObfuscatedName("hn.e(Lhw;I)V")
	public void method4077(ShaderDataReader arg0) {
		this.field2432 = arg0.method4134();
		this.field2428 = arg0.method4134();
		this.field2430 = arg0.method4134();
		int var2 = arg0.method4133();
		int var3 = arg0.method4133();
		this.field2429 = var2 == 0 ? null : new ProgramDefineData[var2];
		this.field2431 = var3 == 0 ? null : new ProgramDefineData[var3];
		for (int var4 = 0; var4 < var2; var4++) {
			this.field2429[var4] = new ProgramDefineData();
			this.field2429[var4].method4146(arg0);
		}
		for (int var5 = 0; var5 < var3; var5++) {
			this.field2431[var5] = new ProgramDefineData();
			this.field2431[var5].method4146(arg0);
		}
	}
}
