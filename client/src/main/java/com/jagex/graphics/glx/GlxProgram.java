package com.jagex.graphics.glx;

import com.jagex.core.utils.ArrayUtil;
import com.jagex.graphics.*;
import com.jagex.math.Matrix4x4;
import deob.ObfuscatedName;
import jaggl.OpenGL;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("agl")
public class GlxProgram extends GpuProgram {

	@ObfuscatedName("agl.l")
	public GlxToolkit glRenderer;

	@ObfuscatedName("agl.u")
	public GlxProgramManager glProgram;

	@ObfuscatedName("agl.z")
	public int field10373;

	@ObfuscatedName("agl.p")
	public int vertexShader3d;

	@ObfuscatedName("agl.d")
	public int pixelShader3d;

	@ObfuscatedName("agl.c")
	public boolean field10372;

	@ObfuscatedName("agl.r")
	public int[] field10377;

	@ObfuscatedName("agl.v")
	public static final int[] field10378 = new int[2];

	@ObfuscatedName("agl.o")
	public static final float[] field10380 = new float[16];

	@ObfuscatedName("agl.s")
	public final Map field10368;

	@ObfuscatedName("agl.y")
	public final Map field10381;

	@ObfuscatedName("agl.q")
	public final Map field10383;

	@ObfuscatedName("agl.x")
	public final Map field10382;

	@ObfuscatedName("agl.b")
	public final Map field10384;

	@ObfuscatedName("agl.h")
	public String vertexShaderName;

	@ObfuscatedName("agl.a")
	public String fragmentShaderName;

	public GlxProgram(GlxToolkit glRenderer, GlxProgramManager glProgram, ProgramData programData) {
		this(glRenderer, programData);
		this.glProgram = glProgram;
		this.glRenderer = glRenderer;
	}

	public GlxProgram(GlxToolkit glRenderer, ProgramData programData) {
		this.field10373 = 0;
		this.vertexShader3d = 0;
		this.pixelShader3d = 0;
		this.field10372 = false;
		this.field10377 = new int[13];
		this.field10368 = new HashMap();
		this.field10381 = new HashMap();
		this.field10383 = new HashMap();
		this.field10382 = new HashMap();
		this.field10384 = new HashMap();
		this.name = programData.name;
		StringBuilder stringBuilder = new StringBuilder();
		if (programData.vertexShaderFile != null) {
			this.vertexShaderFile = programData.vertexShaderFile;
			if (programData.vertexPrograms != null) {
				ProgramDefineData[] var4 = programData.vertexPrograms;
				for (int var5 = 0; var5 < var4.length; var5++) {
					ProgramDefineData var6 = var4[var5];
					stringBuilder.append("#define " + var6.field2566 + " " + var6.field2565 + '\n');
				}
			}
			stringBuilder.append(new String(glRenderer.method19089(this.vertexShaderFile)));
			this.vertexShaderName = stringBuilder.toString();
		}
		if (programData.fragmentShaderFile != null) {
			this.fragmentShaderFile = programData.fragmentShaderFile;
			stringBuilder.setLength(0);
			if (programData.fragmentPrograms != null) {
				ProgramDefineData[] var7 = programData.fragmentPrograms;
				for (int index = 0; index < var7.length; index++) {
					ProgramDefineData var9 = var7[index];
					stringBuilder.append("#define " + var9.field2566 + " " + var9.field2565 + '\n');
				}
			}
			stringBuilder.append(new String(glRenderer.method19089(this.fragmentShaderFile)));
			this.fragmentShaderName = stringBuilder.toString();
		}
		ArrayUtil.method14009(this.field10377, 0, this.field10377.length, -1);
	}

	@ObfuscatedName("agl.af(ILjava/lang/String;Ljava/lang/String;)I")
	public int method16478(int arg0, String arg1, String arg2) {
		if (arg1 == null) {
			return 0;
		}
		int var4 = OpenGL.glCreateShader(arg0);
		OpenGL.glShaderSource(var4, arg1);
		OpenGL.glCompileShader(var4);
		OpenGL.glGetShaderiv(var4, 35713, field10378, 0);
		if (field10378[0] == 0) {
			OpenGL.glDeleteShader(var4);
			var4 = 0;
		}
		return var4;
	}

	@ObfuscatedName("agl.n()Z")
	public boolean compile() {
		if (this.field10372) {
			return true;
		}
		this.glRenderer.field12015 = null;
		this.vertexShader3d = this.method16478(35633, this.vertexShaderName, this.vertexShaderFile);
		this.pixelShader3d = this.method16478(35632, this.fragmentShaderName, this.fragmentShaderFile);
		if (this.vertexShader3d == 0 || this.pixelShader3d == 0) {
			if (this.vertexShader3d != 0) {
				OpenGL.glDeleteShader(this.vertexShader3d);
			}
			if (this.pixelShader3d != 0) {
				OpenGL.glDeleteShader(this.pixelShader3d);
			}
			return false;
		}
		this.field10373 = OpenGL.glCreateProgram();
		if (this.vertexShader3d != 0) {
			OpenGL.glAttachShader(this.field10373, this.vertexShader3d);
		}
		if (this.pixelShader3d != 0) {
			OpenGL.glAttachShader(this.field10373, this.pixelShader3d);
		}
		OpenGL.glLinkProgram(this.field10373);
		OpenGL.glGetProgramiv(this.field10373, 35714, field10378, 0);
		if (field10378[0] == 0) {
			if (this.vertexShader3d != 0) {
				OpenGL.glDetachShader(this.field10373, this.vertexShader3d);
				OpenGL.glDeleteShader(this.vertexShader3d);
			}
			if (this.pixelShader3d != 0) {
				OpenGL.glDetachShader(this.field10373, this.pixelShader3d);
				OpenGL.glDeleteShader(this.pixelShader3d);
			}
			OpenGL.glDeleteProgram(this.field10373);
			return false;
		}
		OpenGL.glUseProgram(this.field10373);
		int var1 = -1;
		for (int var2 = 0; var2 < this.glProgram.getProgramCount(); var2++) {
			if (this.glProgram.getProgram(var2) == this) {
				var1 = var2;
				break;
			}
		}
		if (var1 == -1) {
			return false;
		}
		for (int var3 = 0; var3 < this.glProgram.getUniformCount(); var3++) {
			ProgramUniform var4 = this.glProgram.getUniform(var3);
			if (var4 != null) {
				var4.method19245(var1);
			}
		}
		for (int var5 = 0; var5 < this.glProgram.getUniform2Count(); var5++) {
			ProgramUniform var6 = this.glProgram.getUniform2(var5);
			if (var6 != null) {
				var6.method19245(var1);
			}
		}
		this.vertexShaderName = null;
		this.fragmentShaderName = null;
		this.field10372 = true;
		return true;
	}

	@ObfuscatedName("agl.k(Laql;F)V")
	public void setUniform1f(ProgramUniform arg0, float arg1) {
		int var3 = ((GlxProgramUniform) arg0).method19681();
		if (var3 == -1 || this.field10368.get(var3) != null && (Float) this.field10368.get(var3) == arg1) {
			return;
		}
		this.field10368.put(var3, arg1);
		if (arg0.getType() != UniformType.FLOAT_1 && arg0.getType() != UniformType.field2509) {
			throw new GlxError(arg0, "");
		}
		OpenGL.glUniform1f(var3, arg1);
	}

	@ObfuscatedName("agl.f(Laql;FF)V")
	public void setUniform2f(ProgramUniform arg0, float arg1, float arg2) {
		int var4 = ((GlxProgramUniform) arg0).method19681();
		if (var4 == -1 || this.field10368.get(var4) != null && this.field10381.get(var4) != null && (Float) this.field10368.get(var4) == arg1 && (Float) this.field10381.get(var4) == arg2) {
			return;
		}
		this.field10368.put(var4, arg1);
		this.field10381.put(var4, arg2);
		if (arg0.getType() != UniformType.FLOAT_2) {
			throw new GlxError(arg0, "");
		}
		OpenGL.glUniform2f(var4, arg1, arg2);
	}

	@ObfuscatedName("agl.w(Laql;FFF)V")
	public void setUniform3f(ProgramUniform arg0, float arg1, float arg2, float arg3) {
		int var5 = ((GlxProgramUniform) arg0).method19681();
		if (var5 == -1 || this.field10368.get(var5) != null && this.field10381.get(var5) != null && this.field10383.get(var5) != null && (Float) this.field10368.get(var5) == arg1 && (Float) this.field10381.get(var5) == arg2 && (Float) this.field10383.get(var5) == arg3) {
			return;
		}
		this.field10368.put(var5, arg1);
		this.field10381.put(var5, arg2);
		this.field10383.put(var5, arg3);
		if (arg0.getType() != UniformType.FLOAT_3) {
			throw new GlxError(arg0, "");
		}
		OpenGL.glUniform3f(var5, arg1, arg2, arg3);
	}

	@ObfuscatedName("agl.l(Laql;FFFF)V")
	public void setUniform4f(ProgramUniform arg0, float arg1, float arg2, float arg3, float arg4) {
		int var6 = ((GlxProgramUniform) arg0).method19681();
		if (var6 == -1 || this.field10368.get(var6) != null && this.field10381.get(var6) != null && this.field10383.get(var6) != null && this.field10382.get(var6) != null && (Float) this.field10368.get(var6) == arg1 && (Float) this.field10381.get(var6) == arg2 && (Float) this.field10383.get(var6) == arg3 && (Float) this.field10382.get(var6) == arg4) {
			return;
		}
		this.field10368.put(var6, arg1);
		this.field10381.put(var6, arg2);
		this.field10383.put(var6, arg3);
		this.field10382.put(var6, arg4);
		if (arg0.getType() != UniformType.FLOAT_4) {
			throw new GlxError(arg0, "");
		}
		OpenGL.glUniform4f(var6, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("agl.z(Laql;[FI)V")
	public void setUniformFloatv(ProgramUniform arg0, float[] arg1, int arg2) {
		int var4 = ((GlxProgramUniform) arg0).method19681();
		if (var4 != -1) {
			OpenGL.glUniform4fv(var4, arg2, arg1, 0);
		}
	}

	@ObfuscatedName("agl.p(Laql;Lpq;)V")
	public void setUniform2fv(ProgramUniform arg0, Matrix4x4 arg1) {
		assert arg0.getType() == UniformType.MATRIX_4X2;
		int var3 = ((GlxProgramUniform) arg0).method19681();
		if (var3 != -1) {
			OpenGL.glUniform2fv(var3, 4, arg1.method6682(field10380), 0);
		}
	}

	@ObfuscatedName("agl.d(Laql;Lpq;)V")
	public void setUniform4fv(ProgramUniform arg0, Matrix4x4 arg1) {
		assert arg0.getType() == UniformType.MATRIX_4X4;
		int var3 = ((GlxProgramUniform) arg0).method19681();
		if (var3 != -1) {
			OpenGL.glUniform4fv(var3, 4, arg1.toArray(field10380), 0);
		}
	}

	@ObfuscatedName("agl.c(Laql;ILmq;)V")
	public void setUniform1i(ProgramUniform arg0, int arg1, BaseTexture arg2) {
		int var4 = ((GlxProgramUniform) arg0).method19681();
		if (var4 == -1) {
			return;
		}
		if (arg2 == null) {
			arg2 = this.glRenderer.field10140;
		}
		if (arg1 < this.glRenderer.maxSimutaneousTextures) {
			this.glRenderer.setActiveTexture(arg1);
			this.glRenderer.setTexture(arg2);
		} else {
			OpenGL.glActiveTexture(arg1 + 33984);
			OpenGL.glBindTexture(((GlxBaseTexture) arg2).field4979, ((GlxBaseTexture) arg2).field4974);
		}
		if (this.field10384.get(var4) == null || (Integer) this.field10384.get(var4) != arg1) {
			this.field10384.put(var4, arg1);
			OpenGL.glUniform1i(var4, arg1);
		}
	}

	@ObfuscatedName("agl.r(IFFF)V")
	public void setUniform3f(int arg0, float arg1, float arg2, float arg3) {
		OpenGL.glUniform3f(arg0, arg1, arg2, arg3);
	}

	@ObfuscatedName("agl.v(IFFFF)V")
	public void setUniform4f(int arg0, float arg1, float arg2, float arg3, float arg4) {
		OpenGL.glUniform4f(arg0, arg1, arg2, arg3, arg4);
	}

	@ObfuscatedName("agl.o(I[FI)V")
	public void setUniformFloatv(int arg0, float[] arg1, int arg2) {
		OpenGL.glUniform4fv(arg0, arg2, arg1, 0);
	}

	@ObfuscatedName("agl.s(ILpq;)V")
	public void setUniform3fv(int arg0, Matrix4x4 arg1) {
		OpenGL.glUniform3fv(arg0, 3, arg1.method6699(field10380), 0);
	}

	@ObfuscatedName("agl.y(ILpq;)V")
	public void setUniform2fv(int arg0, Matrix4x4 arg1) {
		OpenGL.glUniform2fv(arg0, 4, arg1.method6682(field10380), 0);
	}

	@ObfuscatedName("agl.q(ILpq;)V")
	public void setUniform4fv(int arg0, Matrix4x4 arg1) {
		OpenGL.glUniform4fv(arg0, 4, arg1.toArray(field10380), 0);
	}

	@ObfuscatedName("agl.x(IILmq;)V")
	public void setUniform1i(int arg0, int arg1, BaseTexture arg2) {
		this.glRenderer.setActiveTexture(arg1);
		this.glRenderer.setTexture(arg2);
		OpenGL.glUniform1i(arg0, arg1);
	}

	@ObfuscatedName("agl.m()V")
	public void delete() {
		if (this.field10373 == 0) {
			return;
		}
		this.glRenderer.method19087(this.field10373);
		if (this.vertexShader3d != 0) {
			this.glRenderer.method19075((long) this.vertexShader3d);
		}
		if (this.pixelShader3d != 0) {
			this.glRenderer.method19075((long) this.pixelShader3d);
		}
		this.field10373 = 0;
		this.vertexShader3d = 0;
		this.pixelShader3d = 0;
	}

	public void finalize() {
		this.delete();
	}
}
