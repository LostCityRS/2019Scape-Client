package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("atg")
public final class Direct3DProgramUniform extends ProgramUniform {

	@ObfuscatedName("atg.d")
	public Direct3DProgramManager field12533;

	@ObfuscatedName("atg.c")
	public int[] field12532 = null;

	@ObfuscatedName("atg.r")
	public int[] field12534 = null;

	public Direct3DProgramUniform(Direct3DProgramManager arg0, ProgramUniformData arg1) {
		super(arg1);
		this.field12533 = arg0;
		this.field12532 = arg1.field2591;
		this.field12534 = arg1.field2593;
	}

	@ObfuscatedName("atg.e(I)Z")
	public boolean method19245(int arg0) {
		return true;
	}

	@ObfuscatedName("atg.a()I")
	public final int method19676() {
		return this.field12532[this.field12533.method4212()];
	}

	@ObfuscatedName("atg.g()I")
	public final int method19677() {
		return this.field12534[this.field12533.method4212()];
	}

	@ObfuscatedName("atg.w(I)I")
	public final int method19250(int arg0) {
		int var2 = this.field12532[arg0];
		int var3 = this.field12534[arg0];
		if (var2 == -1) {
			return var3 == -1 ? -1 : var3 | 0x10000;
		} else {
			return var2;
		}
	}
}