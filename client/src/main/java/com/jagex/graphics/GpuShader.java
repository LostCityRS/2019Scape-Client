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

	public GpuShader(GpuToolkit renderer, ShaderData shader) {
		this.name = shader.name;

		this.uniformsCount = shader.vertexUniforms.length;
		this.uniforms = new HashMap(this.uniformsCount, field2571);
		for (int i = 0; i < this.uniformsCount; i++) {
			this.uniforms.put(i, shader.vertexUniforms[i].field2586, this.method4165(shader.vertexUniforms[i]));
		}

		this.uniforms2Count = shader.fragmentUniforms.length;
		this.uniforms2 = new HashMap(this.uniforms2Count, field2571);
		for (int i = 0; i < this.uniforms2Count; i++) {
			this.uniforms2.put(i, shader.fragmentUniforms[i].field2586, this.method4165(shader.fragmentUniforms[i]));
		}

		this.programs = new GpuProgram[shader.programs.length];
		for (int i = 0; i < shader.programs.length; i++) {
			this.programs[i] = this.createProgram(renderer, shader.programs[i]);
		}
	}

	@ObfuscatedName("ho.k(I)Ljava/lang/String;")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("ho.w(Ljava/lang/String;I)Lhi;")
	public GpuProgram getProgram(String name) throws ProgramNotFoundException {
		GpuProgram[] programs = this.programs;

		for (int i = 0; i < programs.length; i++) {
			GpuProgram prg = programs[i];
			String prgName = prg.getName();
			if (prgName != null && prgName.equals(name)) {
				if (!prg.compile()) {
					throw new ProgramNotFoundException(name);
				}

				return prg;
			}
		}

		throw new ProgramNotFoundException(name);
	}

	@ObfuscatedName("ho.l(B)I")
	public final int getProgramCount() {
		return this.programs.length;
	}

	@ObfuscatedName("ho.u(II)Lhi;")
	public final GpuProgram getProgram(int index) {
		return this.programs[index];
	}

	@ObfuscatedName("ho.z(Lhi;I)I")
	public int getProgramIndex(GpuProgram prg) {
		for (int i = 0; i < this.programs.length; i++) {
			if (this.programs[i] == prg) {
				return i;
			}
		}

		return -1;
	}

	@ObfuscatedName("ho.p(I)Lhi;")
	public GpuProgram compilePrograms() {
		GpuProgram[] programs = this.programs;
		for (int i = 0; i < programs.length; i++) {
			GpuProgram prg = programs[i];
			if (prg.compile()) {
				return prg;
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
	public ProgramUniform getUniform(String name) throws UniformNotFoundException {
		ProgramUniform var2 = (ProgramUniform) this.uniforms.get(name);
		if (var2 == null) {
			throw new UniformNotFoundException(name);
		}
		return var2;
	}

	@ObfuscatedName("ho.at(I)I")
	public int getUniform2Count() {
		return this.uniforms2Count;
	}

	@ObfuscatedName("ho.ad(IB)Laql;")
	public ProgramUniform getUniform2(int id) {
		return (ProgramUniform) this.uniforms2.get(id);
	}

	@ObfuscatedName("ho.am(Ljava/lang/String;S)Laql;")
	public ProgramUniform getUniform2(String name) {
		return (ProgramUniform) this.uniforms2.get(name);
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
