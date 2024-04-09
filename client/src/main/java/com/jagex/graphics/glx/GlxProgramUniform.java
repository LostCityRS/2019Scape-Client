package com.jagex.graphics.glx;

import com.jagex.graphics.ProgramUniform;
import com.jagex.graphics.ProgramUniformData;
import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("atr")
public class GlxProgramUniform extends ProgramUniform {

	@ObfuscatedName("atr.d")
	public GlxProgramManager field12535;

	@ObfuscatedName("atr.c")
	public int[] field12536 = null;

	public GlxProgramUniform(GlxProgramManager arg0, ProgramUniformData arg1) {
		super(arg1);
		this.field12535 = arg0;
	}

	@ObfuscatedName("atr.a()I")
	public final int method19681() {
		return this.field12536[this.field12535.getCurrentProgramIndex()];
	}

	@ObfuscatedName("atr.e(I)Z")
	public boolean method19245(int arg0) {
		if (this.field12536 == null) {
			this.field12536 = new int[this.field12535.getProgramCount()];
		}
		GlxProgram var2 = (GlxProgram) this.field12535.getProgram(arg0);
		this.field12536[arg0] = OpenGL.glGetUniformLocation(var2.field10373, this.method19257());
		return this.field12536[arg0] != -1;
	}

	@ObfuscatedName("atr.w(I)I")
	public final int getLocation(int arg0) {
		return this.field12536[arg0];
	}
}
