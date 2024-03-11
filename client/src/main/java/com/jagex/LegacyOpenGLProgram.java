package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("bn")
public class LegacyOpenGLProgram {

	@ObfuscatedName("bn.e")
	public static final int[] field985 = new int[2];

	@ObfuscatedName("bn.n")
	public final LegacyOpenGLRenderer field986;

	@ObfuscatedName("bn.m")
	public final int field987;

	@ObfuscatedName("bn.e(Lafa;[Lbm;)Lbn;")
	public static LegacyOpenGLProgram method1065(LegacyOpenGLRenderer arg0, LegacyOpenGLShader[] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			if (arg1[var2] == null || arg1[var2].field1019 <= 0) {
				return null;
			}
		}
		int var3 = OpenGL.glCreateProgram();
		for (int var4 = 0; var4 < arg1.length; var4++) {
			OpenGL.glAttachShader(var3, arg1[var4].field1019);
		}
		OpenGL.glLinkProgram(var3);
		OpenGL.glGetProgramiv(var3, 35714, field985, 0);
		if (field985[0] == 0) {
			OpenGL.glGetProgramiv(var3, 35716, field985, 1);
			if (field985[1] > 1) {
				byte[] var5 = new byte[field985[1]];
				OpenGL.glGetProgramInfoLog(var3, field985[1], field985, 0, var5, 0);
				System.out.println(new String(var5));
			}
			if (field985[0] == 0) {
				for (int var6 = 0; var6 < arg1.length; var6++) {
					OpenGL.glDetachShader(var3, arg1[var6].field1019);
				}
				OpenGL.glDeleteProgram(var3);
				return null;
			}
		}
		return new LegacyOpenGLProgram(arg0, var3, arg1);
	}

	public LegacyOpenGLProgram(LegacyOpenGLRenderer arg0, int arg1, LegacyOpenGLShader[] arg2) {
		this.field986 = arg0;
		this.field987 = arg1;
	}

	public void finalize() throws Throwable {
		this.field986.method15816((long) this.field987);
		super.finalize();
	}
}
