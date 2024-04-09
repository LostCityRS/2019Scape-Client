package com.jagex.graphics.dx;

import com.jagex.graphics.ProgramUniform;
import com.jagex.graphics.ProgramUniformData;
import deob.ObfuscatedName;

@ObfuscatedName("atg")
public final class DxProgramUniform extends ProgramUniform {

	@ObfuscatedName("atg.d")
	public DxProgramManager programManager;

	@ObfuscatedName("atg.c")
	public int[] field12532 = null;

	@ObfuscatedName("atg.r")
	public int[] field12534 = null;

	public DxProgramUniform(DxProgramManager arg0, ProgramUniformData arg1) {
		super(arg1);
		this.programManager = arg0;
		this.field12532 = arg1.field2591;
		this.field12534 = arg1.field2593;
	}

	@ObfuscatedName("atg.e(I)Z")
	public boolean method19245(int arg0) {
		return true;
	}

	@ObfuscatedName("atg.a()I")
	public final int method19676() {
		return this.field12532[this.programManager.getCurrentProgramIndex()];
	}

	@ObfuscatedName("atg.g()I")
	public final int method19677() {
		return this.field12534[this.programManager.getCurrentProgramIndex()];
	}

	@ObfuscatedName("atg.w(I)I")
	public final int getLocation(int arg0) {
		int var2 = this.field12532[arg0];
		int var3 = this.field12534[arg0];
		if (var2 == -1) {
			return var3 == -1 ? -1 : var3 | 0x10000;
		} else {
			return var2;
		}
	}
}
