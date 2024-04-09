package com.jagex.graphics;

import com.jagex.game.client.PrimitiveType;
import com.jagex.math.Matrix4x4;
import deob.ObfuscatedName;

@ObfuscatedName("ahr")
public class ProgrammableParticleShader extends ParticleShader {

	@ObfuscatedName("ahr.u")
	public GpuShader shader;

	@ObfuscatedName("ahr.z")
	public ProgramUniform field10512;

	@ObfuscatedName("ahr.p")
	public final Matrix4x4 field10506 = new Matrix4x4();

	@ObfuscatedName("ahr.d")
	public ProgramUniform field10507;

	@ObfuscatedName("ahr.c")
	public ProgramUniform field10504;

	@ObfuscatedName("ahr.r")
	public ProgramUniform field10508;

	@ObfuscatedName("ahr.v")
	public ProgramUniform field10509;

	@ObfuscatedName("ahr.o")
	public ProgramUniform field10503;

	@ObfuscatedName("ahr.s")
	public ProgramUniform field10511;

	@ObfuscatedName("ahr.y")
	public GpuProgram field10514;

	@ObfuscatedName("ahr.q")
	public GpuProgram field10513;

	@ObfuscatedName("ahr.x")
	public GpuProgram field10510;

	public ProgrammableParticleShader(GpuToolkit arg0) throws ShaderException {
		super(arg0);
		this.method16630();
	}

	@ObfuscatedName("ahr.p(B)Z")
	public boolean method16630() throws ShaderException {
		this.shader = this.field2986.createShader("Particle");
		this.field10507 = this.shader.getUniform("WVPMatrix");
		this.field10512 = this.shader.getUniform("DiffuseSampler");
		this.field10504 = this.shader.getUniform("TexCoordMatrix");
		this.field10508 = this.shader.getUniform("DistanceFogPlane");
		this.field10509 = this.shader.getUniform("DistanceFogColour");
		this.field10503 = this.shader.getUniform("DistanceFogAmount");
		this.field10511 = this.shader.getUniform("DiffuseColour");
		this.field10514 = this.shader.getProgram("NoFog");
		this.field10513 = this.shader.getProgram("ParticleFog");
		this.field10510 = this.shader.getProgram("BillboardFog");
		if (!this.field10514.compile()) {
			return false;
		} else if (this.field10513.compile()) {
			return this.field10510.compile();
		} else {
			return false;
		}
	}

	@ObfuscatedName("ahr.e(Lpq;)V")
	public void method5038(Matrix4x4 arg0) {
		this.field10506.setTo(arg0);
		this.field10506.multiply(this.field2986.field10081);
	}

	@ObfuscatedName("ahr.n(IZ)V")
	public void method5039(int arg0, boolean arg1) {
		this.shader.setCurrentProgram(arg1 ? this.field10513 : this.field10514);
		this.shader.enable();
		this.method16629(arg1, true);
		this.field2986.drawIndexedPrimitive(PrimitiveType.TRIANGLELIST, 0, arg0 * 4, 0, arg0 * 2);
	}

	@ObfuscatedName("ahr.m(Z)V")
	public void method5040(boolean arg0) {
		this.shader.setCurrentProgram(arg0 ? this.field10510 : this.field10514);
		this.shader.enable();
		this.method16629(arg0, false);
		this.field2986.method16075();
	}

	@ObfuscatedName("ahr.d(ZZB)V")
	public void method16629(boolean arg0, boolean arg1) {
		this.shader.setUniform1i(this.field10512, 0, this.field2991);
		this.shader.setUniform4fv(this.field10507, this.field10506);
		this.shader.setUniform2fv(this.field10504, this.field2987);
		this.shader.setFloatColour(this.field10511, this.field2988);
		if (!arg0) {
			return;
		}
		if (arg1) {
			this.shader.setUniform4f(this.field10508, this.field2989.field4244, this.field2989.field4243, this.field2989.field4242, this.field2989.field4245);
		} else {
			this.shader.setUniform1f(this.field10503, Math.min(Math.max(this.field2985, 0.0F), 1.0F));
		}
		this.shader.setUniform3f(this.field10509, this.field2990.x, this.field2990.y, this.field2990.z);
	}
}
