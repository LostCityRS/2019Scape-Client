package com.jagex.graphics;

import com.jagex.math.Matrix4x4;
import deob.ObfuscatedName;

@ObfuscatedName("hi")
public abstract class Program implements DeletableResource {

	@ObfuscatedName("hi.e")
	public String field2435 = null;

	@ObfuscatedName("hi.n")
	public String vertexShaderFile;

	@ObfuscatedName("hi.m")
	public String fragmentShaderFile;

	@ObfuscatedName("hi.e(S)Ljava/lang/String;")
	public String getName() {
		return this.field2435;
	}

	@ObfuscatedName("hi.c(Laql;ILmq;)V")
	public abstract void setUniform(ProgramUniform arg0, int arg1, BaseTexture arg2);

	@ObfuscatedName("hi.n()Z")
	public abstract boolean compile();

	@ObfuscatedName("hi.k(Laql;F)V")
	public abstract void setUniform(ProgramUniform arg0, float arg1);

	@ObfuscatedName("hi.f(Laql;FF)V")
	public abstract void setUniform(ProgramUniform arg0, float arg1, float arg2);

	@ObfuscatedName("hi.z(Laql;[FI)V")
	public abstract void setUniform(ProgramUniform arg0, float[] arg1, int arg2);

	@ObfuscatedName("hi.l(Laql;FFFF)V")
	public abstract void setUniform(ProgramUniform arg0, float arg1, float arg2, float arg3, float arg4);

	@ObfuscatedName("hi.r(IFFF)V")
	public abstract void setUniform(int arg0, float arg1, float arg2, float arg3);

	@ObfuscatedName("hi.p(Laql;Lpq;)V")
	public abstract void setUniform4x2(ProgramUniform arg0, Matrix4x4 arg1);

	@ObfuscatedName("hi.o(I[FI)V")
	public abstract void setUniform(int arg0, float[] arg1, int arg2);

	@ObfuscatedName("hi.s(ILpq;)V")
	public abstract void setUniform3x3(int arg0, Matrix4x4 arg1);

	@ObfuscatedName("hi.y(ILpq;)V")
	public abstract void setUniform4x2(int arg0, Matrix4x4 arg1);

	@ObfuscatedName("hi.q(ILpq;)V")
	public abstract void setUniform4x4(int arg0, Matrix4x4 arg1);

	@ObfuscatedName("hi.x(IILmq;)V")
	public abstract void setUniform(int arg0, int arg1, BaseTexture arg2);

	@ObfuscatedName("hi.d(Laql;Lpq;)V")
	public abstract void setUniform4x4(ProgramUniform arg0, Matrix4x4 arg1);

	@ObfuscatedName("hi.w(Laql;FFF)V")
	public abstract void setUniform(ProgramUniform arg0, float arg1, float arg2, float arg3);

	@ObfuscatedName("hi.v(IFFFF)V")
	public abstract void setUniform(int arg0, float arg1, float arg2, float arg3, float arg4);
}
