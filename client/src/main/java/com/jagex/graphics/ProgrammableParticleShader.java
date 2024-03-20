package com.jagex.graphics;

import com.jagex.game.client.PrimitiveType;
import com.jagex.math.Matrix4x4;
import deob.ObfuscatedName;

@ObfuscatedName("ahr")
public class ProgrammableParticleShader extends ParticleShader {

	@ObfuscatedName("ahr.u")
	public Shader field10505;

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
	public Program field10514;

	@ObfuscatedName("ahr.q")
	public Program field10513;

	@ObfuscatedName("ahr.x")
	public Program field10510;

	public ProgrammableParticleShader(GpuRenderer arg0) throws ShaderException {
		super(arg0);
		this.method16630();
	}

	@ObfuscatedName("ahr.p(B)Z")
	public boolean method16630() throws ShaderException {
		this.field10505 = this.field2986.method15964("Particle");
		this.field10507 = this.field10505.getUniform("WVPMatrix");
		this.field10512 = this.field10505.getUniform("DiffuseSampler");
		this.field10504 = this.field10505.getUniform("TexCoordMatrix");
		this.field10508 = this.field10505.getUniform("DistanceFogPlane");
		this.field10509 = this.field10505.getUniform("DistanceFogColour");
		this.field10503 = this.field10505.getUniform("DistanceFogAmount");
		this.field10511 = this.field10505.getUniform("DiffuseColour");
		this.field10514 = this.field10505.getProgram("NoFog");
		this.field10513 = this.field10505.getProgram("ParticleFog");
		this.field10510 = this.field10505.getProgram("BillboardFog");
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
		this.field10505.setCurrentProgram(arg1 ? this.field10513 : this.field10514);
		this.field10505.enable();
		this.method16629(arg1, true);
		this.field2986.method16079(PrimitiveType.field3403, 0, arg0 * 4, 0, arg0 * 2);
	}

	@ObfuscatedName("ahr.m(Z)V")
	public void method5040(boolean arg0) {
		this.field10505.setCurrentProgram(arg0 ? this.field10510 : this.field10514);
		this.field10505.enable();
		this.method16629(arg0, false);
		this.field2986.method16075();
	}

	@ObfuscatedName("ahr.d(ZZB)V")
	public void method16629(boolean arg0, boolean arg1) {
		this.field10505.setUniform(this.field10512, 0, this.field2991);
		this.field10505.setUniform4x4(this.field10507, this.field10506);
		this.field10505.setUniform4x2(this.field10504, this.field2987);
		this.field10505.setUniformColour(this.field10511, this.field2988);
		if (!arg0) {
			return;
		}
		if (arg1) {
			this.field10505.setUniform(this.field10508, this.field2989.field4244, this.field2989.field4243, this.field2989.field4242, this.field2989.field4245);
		} else {
			this.field10505.setUniform(this.field10503, Math.min(Math.max(this.field2985, 0.0F), 1.0F));
		}
		this.field10505.setUniform(this.field10509, this.field2990.x, this.field2990.y, this.field2990.z);
	}
}
