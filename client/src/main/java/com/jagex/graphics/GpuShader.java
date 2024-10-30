package com.jagex.graphics;

import com.jagex.core.datastruct.HashMap;
import com.jagex.core.datastruct.HashMapKey;
import com.jagex.math.Matrix4x4;
import com.jagex.math.Vector3;
import com.jagex.math.Vector4;
import deob.ObfuscatedName;

@ObfuscatedName("ho")
public abstract class GpuShader {

	@ObfuscatedName("ho.e")
	public String name;

	@ObfuscatedName("ho.n")
	public GpuProgram[] programs;

	@ObfuscatedName("ho.m")
	public HashMap uniforms;

	@ObfuscatedName("ho.k")
	public HashMap uniforms2;

	@ObfuscatedName("ho.f")
	public int uniformsCount;

	@ObfuscatedName("ho.w")
	public int uniforms2Count;

	@ObfuscatedName("ho.l")
	public int currentProgramIndex = -1;

	@ObfuscatedName("ho.u")
	public static final HashMapKey field2571 = new ShaderRelated();

	public GpuShader(GpuToolkit arg0, ShaderData arg1) {
		this.name = arg1.name;
		this.uniformsCount = arg1.vertexUniforms.length;
		this.uniforms = new HashMap(this.uniformsCount, field2571);
		for (int var3 = 0; var3 < this.uniformsCount; var3++) {
			this.uniforms.put(var3, arg1.vertexUniforms[var3].field2586, this.method4165(arg1.vertexUniforms[var3]));
		}
		this.uniforms2Count = arg1.fragmentUniforms.length;
		this.uniforms2 = new HashMap(this.uniforms2Count, field2571);
		for (int var4 = 0; var4 < this.uniforms2Count; var4++) {
			this.uniforms2.put(var4, arg1.fragmentUniforms[var4].field2586, this.method4165(arg1.fragmentUniforms[var4]));
		}
		this.programs = new GpuProgram[arg1.programs.length];
		for (int var5 = 0; var5 < arg1.programs.length; var5++) {
			this.programs[var5] = this.createProgram(arg0, arg1.programs[var5]);
		}
	}

	@ObfuscatedName("ho.k(I)Ljava/lang/String;")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("ho.w(Ljava/lang/String;I)Lhi;")
	public GpuProgram getProgram(String arg0) throws ProgramNotFoundException {
		GpuProgram[] var2 = this.programs;
		for (int var3 = 0; var3 < var2.length; var3++) {
			GpuProgram var4 = var2[var3];
			String var5 = var4.getName();
			if (var5 != null && var5.equals(arg0)) {
				if (!var4.compile()) {
					throw new ProgramNotFoundException(arg0);
				}
				return var4;
			}
		}
		throw new ProgramNotFoundException(arg0);
	}

	@ObfuscatedName("ho.l(B)I")
	public final int getProgramCount() {
		return this.programs.length;
	}

	@ObfuscatedName("ho.u(II)Lhi;")
	public final GpuProgram getProgram(int arg0) {
		return this.programs[arg0];
	}

	@ObfuscatedName("ho.z(Lhi;I)I")
	public int getProgramIndex(GpuProgram arg0) {
		for (int var2 = 0; var2 < this.programs.length; var2++) {
			if (this.programs[var2] == arg0) {
				return var2;
			}
		}
		return -1;
	}

	@ObfuscatedName("ho.p(I)Lhi;")
	public GpuProgram compilePrograms() {
		GpuProgram[] var1 = this.programs;
		for (int var2 = 0; var2 < var1.length; var2++) {
			GpuProgram var3 = var1[var2];
			if (var3.compile()) {
				return var3;
			}
		}
		return null;
	}

	@ObfuscatedName("ho.c(B)Lhi;")
	public final GpuProgram getCurrentProgram() {
		return this.currentProgramIndex >= 0 ? this.programs[this.currentProgramIndex] : null;
	}

	@ObfuscatedName("ho.r(I)I")
	public final int getCurrentProgramIndex() {
		return this.currentProgramIndex;
	}

	@ObfuscatedName("ho.o(Laql;FB)V")
	public final void setUniform1f(ProgramUniform arg0, float arg1) {
		this.programs[this.currentProgramIndex].setUniform1f(arg0, arg1);
	}

	@ObfuscatedName("ho.s(Laql;FFB)V")
	public final void setUniform2f(ProgramUniform arg0, float arg1, float arg2) {
		this.programs[this.currentProgramIndex].setUniform2f(arg0, arg1, arg2);
	}

	@ObfuscatedName("ho.y(Laql;FFFI)V")
	public final void setUniform3f(ProgramUniform arg0, float arg1, float arg2, float arg3) {
		this.programs[this.currentProgramIndex].setUniform3f(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("ho.q(Laql;FFFFI)V")
	public final void setUniform4f(ProgramUniform arg0, float arg1, float arg2, float arg3, float arg4) {
		this.programs[this.currentProgramIndex].setUniform4f(arg0, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("ho.x(Laql;Lox;I)V")
	public final void setUniform3fv(ProgramUniform arg0, Vector3 arg1) {
		this.programs[this.currentProgramIndex].setUniform3f(arg0, arg1.x, arg1.y, arg1.z);
	}

	@ObfuscatedName("ho.b(Laql;Log;I)V")
	public final void setUniform4fv(ProgramUniform arg0, Vector4 arg1) {
		this.programs[this.currentProgramIndex].setUniform4f(arg0, arg1.field4244, arg1.field4243, arg1.field4242, arg1.field4245);
	}

	@ObfuscatedName("ho.h(Laql;[FI)V")
	public final void setUniformFloatv(ProgramUniform arg0, float[] arg1) {
		this.programs[this.currentProgramIndex].setUniformFloatv(arg0, arg1, arg1.length);
	}

	@ObfuscatedName("ho.a(Laql;IB)V")
	public final void setFloatColour(ProgramUniform arg0, int arg1) {
		float var3 = (float) (arg1 >> 16 & 0xFF) / 255.0F;
		float var4 = (float) (arg1 >> 8 & 0xFF) / 255.0F;
		float var5 = (float) (arg1 & 0xFF) / 255.0F;
		float var6 = (float) (arg1 >> 24 & 0xFF) / 255.0F;
		this.setUniform4f(arg0, var3, var4, var5, var6);
	}

	@ObfuscatedName("ho.g(Laql;Lpq;I)V")
	public final void setUniform2fv(ProgramUniform arg0, Matrix4x4 arg1) {
		this.programs[this.currentProgramIndex].setUniform2fv(arg0, arg1);
	}

	@ObfuscatedName("ho.i(Laql;Lpq;I)V")
	public final void setUniform4fv(ProgramUniform arg0, Matrix4x4 arg1) {
		this.programs[this.currentProgramIndex].setUniform4fv(arg0, arg1);
	}

	@ObfuscatedName("ho.j(Laql;ILmq;I)V")
	public final void setUniform1i(ProgramUniform arg0, int arg1, BaseTexture arg2) {
		this.programs[this.currentProgramIndex].setUniform1i(arg0, arg1, arg2);
	}

	@ObfuscatedName("ho.t(IFFFI)V")
	public final void setUniform3f(int arg0, float arg1, float arg2, float arg3) {
		this.programs[this.currentProgramIndex].setUniform3f(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("ho.ae(IFFFFI)V")
	public final void setUniform4f(int arg0, float arg1, float arg2, float arg3, float arg4) {
		this.programs[this.currentProgramIndex].setUniform4f(arg0, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("ho.ag(ILox;B)V")
	public final void setUniform3fv(int arg0, Vector3 arg1) {
		this.programs[this.currentProgramIndex].setUniform3f(arg0, arg1.x, arg1.y, arg1.z);
	}

	@ObfuscatedName("ho.ah(I[FII)V")
	public final void setUniformFloatv(int arg0, float[] arg1, int arg2) {
		this.programs[this.currentProgramIndex].setUniformFloatv(arg0, arg1, arg2);
	}

	@ObfuscatedName("ho.al(ILpq;I)V")
	public final void setUniform3fv(int arg0, Matrix4x4 arg1) {
		this.programs[this.currentProgramIndex].setUniform3fv(arg0, arg1);
	}

	@ObfuscatedName("ho.ac(ILpq;I)V")
	public final void setUniform2fv(int arg0, Matrix4x4 arg1) {
		this.programs[this.currentProgramIndex].setUniform2fv(arg0, arg1);
	}

	@ObfuscatedName("ho.ai(ILpq;I)V")
	public final void setUniform4fv(int arg0, Matrix4x4 arg1) {
		this.programs[this.currentProgramIndex].setUniform4fv(arg0, arg1);
	}

	@ObfuscatedName("ho.aw(IILmq;B)V")
	public final void setUniform1i(int arg0, int arg1, BaseTexture arg2) {
		this.programs[this.currentProgramIndex].setUniform1i(arg0, arg1, arg2);
	}

	@ObfuscatedName("ho.as(Ljava/lang/String;B)Laql;")
	public ProgramUniform getUniform(String arg0) throws UniformNotFoundException {
		ProgramUniform var2 = (ProgramUniform) this.uniforms.get(arg0);
		if (var2 == null) {
			throw new UniformNotFoundException(arg0);
		}
		return var2;
	}

	@ObfuscatedName("ho.at(I)I")
	public int getUniform2Count() {
		return this.uniforms2Count;
	}

	@ObfuscatedName("ho.ad(IB)Laql;")
	public ProgramUniform getUniform2(int arg0) {
		return (ProgramUniform) this.uniforms2.get(arg0);
	}

	@ObfuscatedName("ho.am(Ljava/lang/String;S)Laql;")
	public ProgramUniform getUniform2(String arg0) {
		return (ProgramUniform) this.uniforms2.get(arg0);
	}

	@ObfuscatedName("ho.au(I)I")
	public int getUniformCount() {
		return this.uniformsCount;
	}

	@ObfuscatedName("ho.ar(II)Laql;")
	public ProgramUniform getUniform(int arg0) {
		return (ProgramUniform) this.uniforms.get(arg0);
	}

	@ObfuscatedName("ho.ap()V")
	public void method4191() {
	}

	@ObfuscatedName("ho.f(Lafc;Lhn;)Lhi;")
	public abstract GpuProgram createProgram(GpuToolkit arg0, ProgramData arg1);

	@ObfuscatedName("ho.d(Lhi;)Z")
	public abstract boolean setCurrentProgram(GpuProgram arg0);

	@ObfuscatedName("ho.v(Lhv;)Laql;")
	public abstract ProgramUniform method4165(ProgramUniformData arg0);

	@ObfuscatedName("ho.m()Z")
	public abstract boolean method4184();

	@ObfuscatedName("ho.n()V")
	public abstract void method4214();

	@ObfuscatedName("ho.e()V")
	public abstract void enable();
}
