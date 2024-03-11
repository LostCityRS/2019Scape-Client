package com.jagex;

import deob.ObfuscatedName;

@ObfuscatedName("agc")
public final class Direct3DProgramManager extends Shader {

	@ObfuscatedName("agc.z")
	public final Direct3DRenderer field10388;

	@ObfuscatedName("agc.p")
	public Direct3DProgram field10389;

	@ObfuscatedName("agc.d")
	public boolean field10387;

	public Direct3DProgramManager(Direct3DRenderer arg0, ShaderData arg1) {
		super(arg0, arg1);
		this.field10388 = arg0;
		this.field10387 = false;
	}

	@ObfuscatedName("agc.f(Lafc;Lhn;)Lhi;")
	public Program method4156(GpuRenderer arg0, ProgramData arg1) {
		return new Direct3DProgram((Direct3DRenderer) arg0, this, arg1);
	}

	@ObfuscatedName("agc.d(Lhi;)Z")
	public boolean method4162(Program arg0) {
		if (this.field10389 == arg0) {
			return true;
		} else if (arg0.method4083()) {
			this.field10389 = (Direct3DProgram) arg0;
			this.field2573 = this.method4200(arg0);
			if (this.field2573 == -1) {
				throw new IllegalArgumentException();
			}
			if (this.field10387) {
				this.field10388.method19032(this.field10389.field10367);
				this.field10388.method18998(this.field10389.field10360);
				this.field10388.field11972 = this.field10389;
			}
			return true;
		} else {
			return false;
		}
	}

	@ObfuscatedName("agc.v(Lhv;)Laql;")
	public ProgramUniform method4165(ProgramUniformData arg0) {
		return new Direct3DProgramUniform(this, arg0);
	}

	@ObfuscatedName("agc.e()V")
	public void method4244() {
		if (this.field10389 == null) {
			throw new ProgramManagerException();
		}
		this.field10388.method19032(this.field10389.field10367);
		this.field10388.method18998(this.field10389.field10360);
		this.field10388.field11972 = this.field10389;
		this.field10387 = true;
	}

	@ObfuscatedName("agc.n()V")
	public void method4214() {
		this.field10388.method19032(0L);
		this.field10388.method18998(0L);
		this.field10387 = false;
		this.field10388.field11972 = null;
		this.field10388.method16038(1);
		this.field10388.method16092(null);
		this.field10388.method16038(0);
		this.field10388.method16092(null);
	}

	@ObfuscatedName("agc.m()Z")
	public boolean method4184() {
		return this.field10388.field11972 == this.field10389;
	}
}