package com.jagex.graphics.dx;

import com.jagex.core.utils.ArrayUtil;
import com.jagex.graphics.*;
import com.jagex.graphics.glx.GlxError;
import com.jagex.math.Matrix4x4;
import deob.ObfuscatedName;
import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

@ObfuscatedName("agt")
public final class DxProgram extends GpuProgram {

	@ObfuscatedName("agt.k")
	public DxProgramManager programManager;

	@ObfuscatedName("agt.f")
	public boolean field10357;

	@ObfuscatedName("agt.w")
	public DxToolkit renderer;

	@ObfuscatedName("agt.l")
	public long vertexShader3d;

	@ObfuscatedName("agt.u")
	public long pixelShader3d;

	@ObfuscatedName("agt.z")
	public static final float[] field10361 = new float[16];

	@ObfuscatedName("agt.p")
	public byte[] vertexShader;

	@ObfuscatedName("agt.d")
	public byte[] fragmentShader;

	@ObfuscatedName("agt.v")
	public final float[][] field10366;

	@ObfuscatedName("agt.o")
	public final boolean[] field10359;

	public DxProgram(DxToolkit renderer, DxProgramManager programManager, ProgramData programData) {
		this(renderer, programData);
		this.renderer = renderer;
		this.programManager = programManager;
	}

	public DxProgram(DxToolkit renderer, ProgramData programData) {
		this.field10357 = false;
		this.field10366 = new float[2][];
		this.field10359 = new boolean[2];
		this.name = programData.name;
		if (programData.vertexShaderFile != null) {
			this.vertexShaderFile = programData.vertexShaderFile;
			this.vertexShader = renderer.getShader(this.vertexShaderFile);
		}
		if (programData.fragmentShaderFile != null) {
			this.fragmentShaderFile = programData.fragmentShaderFile;
			this.fragmentShader = renderer.getShader(this.fragmentShaderFile);
		}
		renderer.method15985(this);
	}

	@ObfuscatedName("agt.n()Z")
	public boolean compile() {
		if (this.field10357) {
			return true;
		}
		this.vertexShader3d = this.vertexShader == null ? 0L : IDirect3DDevice.CreateVertexShader(this.renderer.device, this.vertexShader);
		this.pixelShader3d = this.fragmentShader == null ? 0L : IDirect3DDevice.CreatePixelShader(this.renderer.device, this.fragmentShader);
		if (this.vertexShader3d == 0L && this.pixelShader3d == 0L) {
			return false;
		}
		int var1 = -1;
		for (int var2 = 0; var2 < this.programManager.getProgramCount(); var2++) {
			if (this.programManager.getProgram(var2) == this) {
				var1 = var2;
				break;
			}
		}
		int var3 = this.programManager.getUniformCount();
		int var4 = this.programManager.getUniform2Count();
		for (int var5 = 0; var5 < var3; var5++) {
			ProgramUniform var6 = this.programManager.getUniform(var5);
			var6.method19245(var1);
		}
		for (int var7 = 0; var7 < var4; var7++) {
			ProgramUniform var8 = this.programManager.getUniform2(var7);
			var8.method19245(var1);
		}
		int var9 = 0;
		int var10 = 0;
		int var11 = this.programManager.getProgramIndex(this);
		for (int var12 = 0; var12 < var3 + var4; var12++) {
			DxProgramUniform var13 = (DxProgramUniform) (var12 < var3 ? this.programManager.getUniform(var12) : this.programManager.getUniform2(var12 - var3));
			UniformType var14 = var13.getType();
			int var15 = 1;
			if (UniformType.ARRAY == var14) {
				var14 = var13.getElementType();
				var15 = var13.getElementCount();
			}
			switch(var14.index) {
				case 17:
				case 35:
				case 52:
				case 103:
					var15 *= 4;
				case 20:
				case 81:
				case 89:
				case 104:
				case 121:
					break;
				case 33:
				case 48:
				case 55:
				case 119:
					var15 *= 2;
					break;
				case 36:
				case 71:
				case 75:
				case 87:
					var15 *= 3;
					break;
				default:
					var15 = 0;
			}
			if (var13.field12532[var11] >= 0) {
				int var16 = var13.field12532[var11] + var15;
				if (var9 < var16) {
					var9 = var16;
				}
			}
			if (var13.field12534[var11] >= 0) {
				int var17 = var13.field12534[var11] + var15;
				if (var10 < var17) {
					var10 = var17;
				}
			}
		}
		this.field10366[0] = new float[var9 * 4];
		this.field10366[1] = new float[var10 * 4];
		this.field10357 = true;
		return true;
	}

	@ObfuscatedName("agt.k(Laql;F)V")
	public void setUniform1f(ProgramUniform arg0, float arg1) {
		int var3 = ((DxProgramUniform) arg0).method19676();
		int var4 = ((DxProgramUniform) arg0).method19677();
		if (arg0.getType() != UniformType.FLOAT_1 && arg0.getType() != UniformType.field2509) {
			throw new GlxError(arg0, "");
		}
		if (var3 >= 0) {
			int var5 = var3 * 4;
			this.field10366[0][var5] = arg1;
			this.field10359[0] = true;
		}
		if (var4 >= 0) {
			int var6 = var4 * 4;
			this.field10366[1][var6] = arg1;
			this.field10359[1] = true;
		}
	}

	@ObfuscatedName("agt.f(Laql;FF)V")
	public void setUniform2f(ProgramUniform arg0, float arg1, float arg2) {
		int var4 = ((DxProgramUniform) arg0).method19676();
		int var5 = ((DxProgramUniform) arg0).method19677();
		if (arg0.getType() != UniformType.FLOAT_2) {
			throw new GlxError(arg0, "");
		}
		if (var4 >= 0) {
			int var6 = var4 * 4;
			this.field10366[0][var6] = arg1;
			this.field10366[0][var6 + 1] = arg2;
			this.field10359[0] = true;
		}
		if (var5 >= 0) {
			int var7 = var5 * 4;
			this.field10366[1][var7] = arg1;
			this.field10366[1][var7 + 1] = arg2;
			this.field10359[1] = true;
		}
	}

	@ObfuscatedName("agt.w(Laql;FFF)V")
	public void setUniform3f(ProgramUniform arg0, float arg1, float arg2, float arg3) {
		int var5 = ((DxProgramUniform) arg0).method19676();
		int var6 = ((DxProgramUniform) arg0).method19677();
		if (arg0.getType() != UniformType.FLOAT_3) {
			throw new GlxError(arg0, "");
		}
		if (var5 >= 0) {
			int var7 = var5 * 4;
			this.field10366[0][var7] = arg1;
			this.field10366[0][var7 + 1] = arg2;
			this.field10366[0][var7 + 2] = arg3;
			this.field10359[0] = true;
		}
		if (var6 < 0) {
			return;
		}
		int var8 = var6 * 4;
		this.field10366[1][var8] = arg1;
		this.field10366[1][var8 + 1] = arg2;
		this.field10366[1][var8 + 2] = arg3;
		this.field10359[1] = true;
	}

	@ObfuscatedName("agt.l(Laql;FFFF)V")
	public void setUniform4f(ProgramUniform arg0, float arg1, float arg2, float arg3, float arg4) {
		int var6 = ((DxProgramUniform) arg0).method19676();
		int var7 = ((DxProgramUniform) arg0).method19677();
		if (arg0.getType() != UniformType.FLOAT_4) {
			throw new GlxError(arg0, "");
		}
		if (var6 >= 0) {
			int var8 = var6 * 4;
			this.field10366[0][var8] = arg1;
			this.field10366[0][var8 + 1] = arg2;
			this.field10366[0][var8 + 2] = arg3;
			this.field10366[0][var8 + 3] = arg4;
			this.field10359[0] = true;
		}
		if (var7 < 0) {
			return;
		}
		int var9 = var7 * 4;
		this.field10366[1][var9] = arg1;
		this.field10366[1][var9 + 1] = arg2;
		this.field10366[1][var9 + 2] = arg3;
		this.field10366[1][var9 + 3] = arg4;
		this.field10359[1] = true;
	}

	@ObfuscatedName("agt.p(Laql;Lpq;)V")
	public void setUniform2fv(ProgramUniform arg0, Matrix4x4 arg1) {
		int var3 = ((DxProgramUniform) arg0).method19676();
		int var4 = ((DxProgramUniform) arg0).method19677();
		if (arg0.getType() != UniformType.MATRIX_4X2) {
			throw new GlxError(arg0, "");
		}
		if (var3 >= 0) {
			this.method16468(var3, arg1.method6637(field10361), 8);
		}
		if (var4 >= 0) {
			this.method16469(var4, arg1.method6637(field10361), 8);
		}
	}

	@ObfuscatedName("agt.d(Laql;Lpq;)V")
	public void setUniform4fv(ProgramUniform arg0, Matrix4x4 arg1) {
		int var3 = ((DxProgramUniform) arg0).method19676();
		int var4 = ((DxProgramUniform) arg0).method19677();
		if (arg0.getType() != UniformType.MATRIX_4X4) {
			throw new GlxError(arg0, "");
		}
		if (var3 >= 0) {
			this.method16468(var3, arg1.method6620(field10361), 16);
		}
		if (var4 >= 0) {
			this.method16469(var4, arg1.method6620(field10361), 16);
		}
	}

	@ObfuscatedName("agt.z(Laql;[FI)V")
	public void setUniformFloatv(ProgramUniform arg0, float[] arg1, int arg2) {
		int var4 = ((DxProgramUniform) arg0).method19676();
		int var5 = ((DxProgramUniform) arg0).method19677();
		if (arg0.getType() != UniformType.ARRAY) {
			throw new GlxError(arg0, "");
		}
		if (var4 >= 0) {
			this.method16468(var4, arg1, arg2);
		}
		if (var5 >= 0) {
			this.method16469(var5, arg1, arg2);
		}
	}

	@ObfuscatedName("agt.c(Laql;ILmq;)V")
	public void setUniform1i(ProgramUniform arg0, int arg1, BaseTexture arg2) {
		this.renderer.setActiveTexture(arg1);
		this.renderer.setTexture(arg2);
	}

	@ObfuscatedName("agt.r(IFFF)V")
	public void setUniform3f(int arg0, float arg1, float arg2, float arg3) {
		int var5 = arg0 >> 16;
		int var6 = (arg0 & 0xFFFF) * 4;
		this.field10366[var5][var6] = arg1;
		this.field10366[var5][var6 + 1] = arg2;
		this.field10366[var5][var6 + 2] = arg3;
		this.field10359[var5] = true;
	}

	@ObfuscatedName("agt.v(IFFFF)V")
	public void setUniform4f(int arg0, float arg1, float arg2, float arg3, float arg4) {
		int var6 = arg0 >> 16;
		int var7 = (arg0 & 0xFFFF) * 4;
		this.field10366[var6][var7] = arg1;
		this.field10366[var6][var7 + 1] = arg2;
		this.field10366[var6][var7 + 2] = arg3;
		this.field10366[var6][var7 + 3] = arg4;
		this.field10359[var6] = true;
	}

	@ObfuscatedName("agt.s(ILpq;)V")
	public void setUniform3fv(int arg0, Matrix4x4 arg1) {
		int var3 = arg0 >> 16;
		int var4 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method6620(field10361), 0, this.field10366[var3], var4, 12);
		this.field10359[var3] = true;
	}

	@ObfuscatedName("agt.y(ILpq;)V")
	public void setUniform2fv(int arg0, Matrix4x4 arg1) {
		int var3 = arg0 >> 16;
		int var4 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method6637(field10361), 0, this.field10366[var3], var4, 8);
		this.field10359[var3] = true;
	}

	@ObfuscatedName("agt.q(ILpq;)V")
	public void setUniform4fv(int arg0, Matrix4x4 arg1) {
		int var3 = arg0 >> 16;
		int var4 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1.method6620(field10361), 0, this.field10366[var3], var4, 16);
		this.field10359[var3] = true;
	}

	@ObfuscatedName("agt.o(I[FI)V")
	public void setUniformFloatv(int arg0, float[] arg1, int arg2) {
		int var4 = arg0 >> 16;
		int var5 = (arg0 & 0xFFFF) * 4;
		System.arraycopy(arg1, 0, this.field10366[var4], var5, arg2);
		this.field10359[var4] = true;
	}

	@ObfuscatedName("agt.af(I[FI)V")
	public final void method16468(int arg0, float[] arg1, int arg2) {
		ArrayUtil.method14023(arg1, 0, this.field10366[0], arg0 * 4, arg2);
		this.field10359[0] = true;
	}

	@ObfuscatedName("agt.ak(I[FI)V")
	public final void method16469(int arg0, float[] arg1, int arg2) {
		ArrayUtil.method14023(arg1, 0, this.field10366[1], arg0 * 4, arg2);
		this.field10359[1] = true;
	}

	@ObfuscatedName("agt.x(IILmq;)V")
	public void setUniform1i(int arg0, int arg1, BaseTexture arg2) {
		this.renderer.setActiveTexture(arg1);
		this.renderer.setTexture(arg2);
	}

	@ObfuscatedName("agt.an()V")
	public void method16476() {
		if (this.field10359[0]) {
			this.renderer.temporaryBuffer.clear();
			this.renderer.temporaryBuffer.asFloatBuffer().put(this.field10366[0]);
			IDirect3DDevice.SetVertexShaderConstantF(this.renderer.device, 0, this.renderer.temporaryBufferAddress, this.field10366[0].length / 4);
			this.field10359[0] = false;
		}
		if (this.field10359[1]) {
			this.renderer.temporaryBuffer.clear();
			this.renderer.temporaryBuffer.asFloatBuffer().put(this.field10366[1]);
			IDirect3DDevice.SetPixelShaderConstantF(this.renderer.device, 0, this.renderer.temporaryBufferAddress, this.field10366[1].length / 4);
			this.field10359[1] = false;
		}
	}

	@ObfuscatedName("agt.m()V")
	public void delete() {
		if (this.vertexShader3d != 0L) {
			IUnknown.Release(this.vertexShader3d);
			this.vertexShader3d = 0L;
		}
		if (this.pixelShader3d != 0L) {
			IUnknown.Release(this.pixelShader3d);
			this.pixelShader3d = 0L;
		}
		this.renderer.method16198(this);
	}

	@ObfuscatedName("agt.bf()V")
	public void method16466() {
		if (this.vertexShader3d != 0L) {
			this.renderer.method19023(this.vertexShader3d);
			this.vertexShader3d = 0L;
		}
		if (this.pixelShader3d != 0L) {
			this.renderer.method19023(this.pixelShader3d);
			this.pixelShader3d = 0L;
		}
	}

	public void finalize() {
		this.method16466();
	}
}
