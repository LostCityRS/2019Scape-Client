package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("ago")
public class OpenGLProgramManager extends Shader {

	@ObfuscatedName("ago.z")
	public final OpenGLRenderer field10390;

	@ObfuscatedName("ago.p")
	public OpenGLProgram field10391;

	@ObfuscatedName("ago.d")
	public int field10392;

	public OpenGLProgramManager(OpenGLRenderer arg0, ShaderData arg1) {
		super(arg0, arg1);
		this.field10390 = arg0;
	}

	@ObfuscatedName("ago.f(Lafc;Lhn;)Lhi;")
	public Program method4156(GpuRenderer arg0, ProgramData arg1) {
		return new OpenGLProgram((OpenGLRenderer) arg0, this, arg1);
	}

	@ObfuscatedName("ago.d(Lhi;)Z")
	public boolean method4162(Program arg0) {
		if (this.field10391 == arg0) {
			return true;
		} else if (arg0.method4083()) {
			boolean var2 = this.method4184();
			this.field10391 = (OpenGLProgram) arg0;
			this.field2573 = this.method4200(arg0);
			if (this.field2573 == -1) {
				throw new IllegalArgumentException();
			}
			this.field10392 = this.field10391.field10373;
			if (var2) {
				OpenGL.glUseProgram(this.field10392);
				this.field10390.field12015 = this.field10391;
			}
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ago.v(Lhv;)Laql;")
	public ProgramUniform method4165(ProgramUniformData arg0) {
		return new OpenGlProgramUniform(this, arg0);
	}

	@ObfuscatedName("ago.e()V")
	public void method4244() {
		if (this.field10390.field12015 == this.field10391) {
			return;
		}
		if (this.field10391 == null) {
			throw new ProgramManagerException();
		}
		OpenGL.glUseProgram(this.field10392);
		this.field10390.field12015 = this.field10391;
	}

	@ObfuscatedName("ago.n()V")
	public void method4214() {
	}

	@ObfuscatedName("ago.m()Z")
	public boolean method4184() {
		return this.field10390.field12015 == this.field10391;
	}

	@ObfuscatedName("ago.ap()V")
	public void method4191() {
		for (int var1 = 0; var1 < this.method4158(); var1++) {
			((OpenGLProgram) this.method4159(var1)).method1010();
		}
		super.method4191();
	}

	public void finalize() throws Throwable {
		this.method4191();
		super.finalize();
	}
}
