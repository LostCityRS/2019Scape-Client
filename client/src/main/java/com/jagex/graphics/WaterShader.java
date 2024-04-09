package com.jagex.graphics;

import com.jagex.math.Matrix4x3;
import com.jagex.math.Matrix4x4;
import deob.ObfuscatedName;

@ObfuscatedName("ahi")
public abstract class WaterShader extends GpuRendererRelated2 {

	@ObfuscatedName("ahi.n")
	public GpuShader shader;

	@ObfuscatedName("ahi.m")
	public ProgramUniform textureMatrixUniform;

	@ObfuscatedName("ahi.k")
	public ProgramUniform modelMatrixUniform;

	@ObfuscatedName("ahi.f")
	public ProgramUniform viewMatrixUniform;

	@ObfuscatedName("ahi.w")
	public ProgramUniform projectionMatrixUniform;

	@ObfuscatedName("ahi.l")
	public ProgramUniform field10588;

	@ObfuscatedName("ahi.u")
	public ProgramUniform modelViewMatrixUniform;

	@ObfuscatedName("ahi.z")
	public ProgramUniform modelViewProjectionMatrixUniform;

	@ObfuscatedName("ahi.p")
	public ProgramUniform viewProjectionMatrixUniform;

	@ObfuscatedName("ahi.d")
	public ProgramUniform eyePositionUniform;

	@ObfuscatedName("ahi.c")
	public ProgramUniform eyePositionOSUniform;

	@ObfuscatedName("ahi.r")
	public ProgramUniform sunDirectionOSUniform;

	@ObfuscatedName("ahi.v")
	public ProgramUniform ambientColourUniform;

	@ObfuscatedName("ahi.o")
	public ProgramUniform sunColourUniform;

	@ObfuscatedName("ahi.s")
	public ProgramUniform antiSunColourUniform;

	@ObfuscatedName("ahi.y")
	public ProgramUniform sunDirectionUniform;

	@ObfuscatedName("ahi.q")
	public ProgramUniform sunExponentUniform;

	@ObfuscatedName("ahi.ae")
	public int field10596;

	@ObfuscatedName("ahi.ag")
	public int[] field10609;

	@ObfuscatedName("ahi.ah")
	public static final Matrix4x4 viewProjectionMatrix = new Matrix4x4();

	@ObfuscatedName("ahi.al")
	public Matrix4x4[] field10611;

	@ObfuscatedName("ahi.ac")
	public float[] field10612 = new float[3];

	public WaterShader(GpuToolkit gpuRenderer) {
		super(gpuRenderer);
		new Matrix4x3();
		this.field10611 = new Matrix4x4[this.gpuRenderer.maxSimutaneousTextures];
		for (int var2 = 0; var2 < this.gpuRenderer.maxSimutaneousTextures; var2++) {
			this.field10611[var2] = new Matrix4x4();
		}
	}

	@ObfuscatedName("ahi.h(Ljava/lang/String;)Z")
	public boolean createShaderProgram(String name) throws ShaderException {
		this.shader = this.gpuRenderer.createShader(name);
		if (this.shader == null) {
			throw new ShaderException("");
		}
		this.textureMatrixUniform = this.shader.getUniform2("textureMatrix");
		this.modelMatrixUniform = this.shader.getUniform2("modelMatrix");
		this.viewMatrixUniform = this.shader.getUniform2("viewMatrix");
		this.projectionMatrixUniform = this.shader.getUniform2("projectionMatrix");
		this.modelViewMatrixUniform = this.shader.getUniform2("modelViewMatrix");
		this.modelViewProjectionMatrixUniform = this.shader.getUniform2("modelViewProjectionMatrix");
		this.viewProjectionMatrixUniform = this.shader.getUniform2("viewProjectionMatrix");
		this.ambientColourUniform = this.shader.getUniform2("ambientColour");
		this.sunDirectionUniform = this.shader.getUniform2("sunDirection");
		this.sunColourUniform = this.shader.getUniform2("sunColour");
		this.antiSunColourUniform = this.shader.getUniform2("antiSunColour");
		this.sunExponentUniform = this.shader.getUniform2("sunExponent");
		this.eyePositionUniform = this.shader.getUniform2("eyePosition");
		this.eyePositionOSUniform = this.shader.getUniform2("eyePositionOS");
		this.sunDirectionOSUniform = this.shader.getUniform2("sunDirectionOS");
		if (this.method16762()) {
			if (this.shader.getCurrentProgram() == null) {
				GpuProgram var2 = this.shader.compilePrograms();
				if (var2 == null) {
					throw new ShaderException(this.shader.getName() + "");
				}
				this.shader.setCurrentProgram(var2);
			}
			this.field10596 = this.shader.getProgramCount();
			this.field10609 = new int[this.field10596];
			return true;
		}
		this.shader = null;
		this.textureMatrixUniform = null;
		this.modelMatrixUniform = null;
		this.viewMatrixUniform = null;
		this.projectionMatrixUniform = null;
		this.modelViewMatrixUniform = null;
		this.modelViewProjectionMatrixUniform = null;
		this.viewProjectionMatrixUniform = null;
		this.ambientColourUniform = null;
		this.sunDirectionUniform = null;
		this.sunColourUniform = null;
		this.antiSunColourUniform = null;
		this.sunExponentUniform = null;
		this.eyePositionUniform = null;
		this.eyePositionOSUniform = null;
		this.sunDirectionOSUniform = null;
		return false;
	}

	@ObfuscatedName("ahi.e()V")
	public void method5417() {
		this.shader.enable();
		this.field10609[this.shader.getCurrentProgramIndex()] = -1;
		this.method16773(0);
		this.method16768();
	}

	@ObfuscatedName("ahi.g()V")
	public void method16768() {
		this.method16769(this.gpuRenderer.field10111);
		this.method16765(this.gpuRenderer.getTextureMatrix());
		this.method16766();
		this.method5419();
	}

	@ObfuscatedName("ahi.n()V")
	public void method5416() {
		if (this.shader != null) {
			this.shader.method4214();
		}
	}

	@ObfuscatedName("ahi.i(Lpq;)V")
	public void method16765(Matrix4x4 arg0) {
		if (this.shader == null || !this.shader.method4184() || this.gpuRenderer.method16037() != 0) {
			return;
		}
		int var2 = this.shader.getCurrentProgramIndex();
		if ((this.field10609[var2] & 0x80) != 0 && this.textureMatrixUniform != null) {
			this.shader.setUniform2fv(this.textureMatrixUniform, arg0);
			this.field10609[var2] &= 0xFFFFFF7F;
		}
	}

	@ObfuscatedName("ahi.j()V")
	public void method16766() {
		if (this.shader == null || !this.shader.method4184()) {
			return;
		}
		int var1 = this.shader.getCurrentProgramIndex();
		int var2 = this.field10609[var1];
		if ((var2 & 0x1) != 0 && this.modelMatrixUniform != null) {
			this.shader.setUniform4fv(this.modelMatrixUniform, this.gpuRenderer.getModelMatrix());
		}
		if ((var2 & 0x2) != 0) {
			if (this.viewMatrixUniform != null) {
				this.shader.setUniform4fv(this.viewMatrixUniform, this.gpuRenderer.getViewMatrix());
			}
			if (this.eyePositionUniform != null) {
				this.field10612[0] = 0.0F;
				this.field10612[1] = 0.0F;
				this.field10612[2] = 0.0F;
				this.gpuRenderer.method2218().method6319(this.field10612[0], this.field10612[1], this.field10612[2], this.field10612);
				this.shader.setUniform3f(this.eyePositionUniform, this.field10612[0], this.field10612[1], this.field10612[2]);
			}
		}
		if ((var2 & 0x10) != 0 && this.modelViewMatrixUniform != null) {
			this.shader.setUniform4fv(this.modelViewMatrixUniform, this.gpuRenderer.getModelViewMatrix());
		}
		if ((var2 & 0x8) != 0 && this.field10588 != null) {
			this.shader.setUniform4fv(this.field10588, this.gpuRenderer.method16035());
		}
		if ((var2 & 0x4) != 0 && this.projectionMatrixUniform != null) {
			this.shader.setUniform4fv(this.projectionMatrixUniform, this.gpuRenderer.getProjectionMatrix());
		}
		if ((var2 & 0x20) != 0 && this.modelViewProjectionMatrixUniform != null) {
			viewProjectionMatrix.setToProduct(this.gpuRenderer.getModelViewMatrix(), this.gpuRenderer.getProjectionMatrix());
			this.shader.setUniform4fv(this.modelViewProjectionMatrixUniform, viewProjectionMatrix);
		}
		if ((var2 & 0x40) != 0 && this.viewProjectionMatrixUniform != null) {
			viewProjectionMatrix.setToProduct(this.gpuRenderer.getViewMatrix(), this.gpuRenderer.getProjectionMatrix());
			this.shader.setUniform4fv(this.viewProjectionMatrixUniform, viewProjectionMatrix);
		}
		if (this.gpuRenderer.method16037() == 0 && (this.field10609[var1] & 0x80) != 0 && this.textureMatrixUniform != null) {
			this.shader.setUniform2fv(this.textureMatrixUniform, this.gpuRenderer.getTextureMatrix());
			this.field10609[var1] &= 0xFFFFFF7F;
		}
		this.field10609[var1] = 0;
	}

	@ObfuscatedName("ahi.t(ILou;)V")
	public void method16767(int arg0, Matrix4x3 arg1) {
		if (this.eyePositionOSUniform == null) {
			return;
		}
		Matrix4x4 var3 = this.gpuRenderer.method16035();
		float[] var4 = new float[] { var3.entries[12], var3.entries[13], var3.entries[14] };
		float[] var5 = new float[] { 0.0F, 0.0F, 0.0F };
		var3.method6670(var5);
		float[] var6 = new float[] { 0.0F, 0.0F, 0.0F };
		this.gpuRenderer.method2218().method6295(0.0F, 0.0F, 0.0F, var6);
		arg1.method6320(var4);
		this.shader.setUniform3f(this.eyePositionOSUniform, var4[0], var4[1], var4[2]);
	}

	@ObfuscatedName("ahi.ae(ILou;)V")
	public void method16781(int arg0, Matrix4x3 arg1) {
		if (this.sunDirectionOSUniform != null) {
			float[] var3 = new float[] { this.gpuRenderer.field10114[0], this.gpuRenderer.field10114[1], this.gpuRenderer.field10114[2] };
			arg1.method6321(var3);
			this.shader.setUniform3f(this.sunDirectionOSUniform, var3[0], var3[1], var3[2]);
		}
	}

	@ObfuscatedName("ahi.ag(Z)V")
	public void method16769(boolean arg0) {
		if (this.shader == null || !this.shader.method4184()) {
			return;
		}
		if (this.ambientColourUniform != null) {
			this.shader.setUniform3f(this.ambientColourUniform, this.gpuRenderer.field10142 * this.gpuRenderer.field10122, this.gpuRenderer.field10122 * this.gpuRenderer.field10120, this.gpuRenderer.field10210 * this.gpuRenderer.field10122);
		}
		if (this.sunDirectionUniform != null) {
			this.shader.setUniform3f(this.sunDirectionUniform, this.gpuRenderer.field10114[0], this.gpuRenderer.field10114[1], this.gpuRenderer.field10114[2]);
		}
		if (this.sunColourUniform != null) {
			this.shader.setUniform3f(this.sunColourUniform, this.gpuRenderer.field10142 * this.gpuRenderer.field10123, this.gpuRenderer.field10123 * this.gpuRenderer.field10120, this.gpuRenderer.field10210 * this.gpuRenderer.field10123);
		}
		if (this.antiSunColourUniform != null) {
			this.shader.setUniform3f(this.antiSunColourUniform, -this.gpuRenderer.field10142 * this.gpuRenderer.field10124, -this.gpuRenderer.field10120 * this.gpuRenderer.field10124, -this.gpuRenderer.field10210 * this.gpuRenderer.field10124);
		}
		if (this.sunExponentUniform != null) {
			this.shader.setUniform1f(this.sunExponentUniform, Math.abs(this.gpuRenderer.field10114[1]) * 928.0F + 64.0F);
		}
	}

	@ObfuscatedName("ahi.f()V")
	public void method5419() {
	}

	@ObfuscatedName("ahi.ah(I)V")
	public void method16770(int arg0) {
		for (int var2 = 0; var2 < this.field10596; var2++) {
			this.field10609[var2] |= 0x80 << arg0;
		}
	}

	@ObfuscatedName("ahi.al(Lou;)V")
	public void method16771(Matrix4x3 arg0) {
		Matrix4x4 var2 = this.gpuRenderer.field10066;
		var2.setToMatrix4x3(arg0);
		int var3 = this.shader.getCurrentProgramIndex();
		if (this.modelMatrixUniform != null) {
			this.shader.setUniform4fv(this.modelMatrixUniform, var2);
			this.field10609[var3] &= 0xFFFFFFFE;
		}
		if (this.modelViewMatrixUniform != null) {
			viewProjectionMatrix.setToProduct(var2, this.gpuRenderer.getViewMatrix());
			this.shader.setUniform4fv(this.modelViewMatrixUniform, viewProjectionMatrix);
			this.field10609[var3] &= 0xFFFFFFEF;
		}
		if (this.modelViewProjectionMatrixUniform != null) {
			viewProjectionMatrix.setToProduct(var2, this.gpuRenderer.method16228());
			this.shader.setUniform4fv(this.modelViewProjectionMatrixUniform, viewProjectionMatrix);
			this.field10609[var3] &= 0xFFFFFFDF;
		}
		this.method16767(var3, arg0);
		this.method16781(var3, arg0);
	}

	@ObfuscatedName("ahi.l()V")
	public void method5421() {
		this.method16771(Matrix4x3.IDENTITY);
	}

	@ObfuscatedName("ahi.ac(I)V")
	public void method16773(int arg0) {
		this.field10611[0].setToIdentity();
		this.method16770(arg0);
	}

	@ObfuscatedName("ahi.a()Z")
	public abstract boolean method16762() throws ShaderException;
}
