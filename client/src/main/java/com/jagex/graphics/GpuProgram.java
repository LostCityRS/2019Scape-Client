package com.jagex.graphics;

import com.jagex.math.Matrix4x4;
import deob.ObfuscatedName;

@ObfuscatedName("hi")
public abstract class GpuProgram implements DeletableResource {

	@ObfuscatedName("hi.e")
	public String name = null;

	@ObfuscatedName("hi.n")
	public String vertexShaderFile;

	@ObfuscatedName("hi.m")
	public String fragmentShaderFile;

	@ObfuscatedName("hi.e(S)Ljava/lang/String;")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("hi.c(Laql;ILmq;)V")
	public abstract void setUniform1i(ProgramUniform arg0, int arg1, BaseTexture arg2);

	@ObfuscatedName("hi.n()Z")
	public abstract boolean compile();

	@ObfuscatedName("hi.k(Laql;F)V")
	public abstract void setUniform1f(ProgramUniform arg0, float arg1);

	@ObfuscatedName("hi.f(Laql;FF)V")
	public abstract void setUniform2f(ProgramUniform arg0, float arg1, float arg2);

	@ObfuscatedName("hi.z(Laql;[FI)V")
	public abstract void setUniformFloatv(ProgramUniform arg0, float[] arg1, int arg2);

	@ObfuscatedName("hi.l(Laql;FFFF)V")
	public abstract void setUniform4f(ProgramUniform arg0, float arg1, float arg2, float arg3, float arg4);

	@ObfuscatedName("hi.r(IFFF)V")
	public abstract void setUniform3f(int arg0, float arg1, float arg2, float arg3);

	@ObfuscatedName("hi.p(Laql;Lpq;)V")
	public abstract void setUniform2fv(ProgramUniform arg0, Matrix4x4 arg1);

	@ObfuscatedName("hi.o(I[FI)V")
	public abstract void setUniformFloatv(int arg0, float[] arg1, int arg2);

	@ObfuscatedName("hi.s(ILpq;)V")
	public abstract void setUniform3fv(int arg0, Matrix4x4 arg1);

	@ObfuscatedName("hi.y(ILpq;)V")
	public abstract void setUniform2fv(int arg0, Matrix4x4 arg1);

	@ObfuscatedName("hi.q(ILpq;)V")
	public abstract void setUniform4fv(int arg0, Matrix4x4 arg1);

	@ObfuscatedName("hi.x(IILmq;)V")
	public abstract void setUniform1i(int arg0, int arg1, BaseTexture arg2);

	@ObfuscatedName("hi.d(Laql;Lpq;)V")
	public abstract void setUniform4fv(ProgramUniform arg0, Matrix4x4 arg1);

	@ObfuscatedName("hi.w(Laql;FFF)V")
	public abstract void setUniform3f(ProgramUniform arg0, float arg1, float arg2, float arg3);

	@ObfuscatedName("hi.v(IFFFF)V")
	public abstract void setUniform4f(int arg0, float arg1, float arg2, float arg3, float arg4);
}
