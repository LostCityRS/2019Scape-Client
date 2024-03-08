package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("aqo")
public class class1145 extends class968 {

	@ObfuscatedName("aqo.w")
	public static float field12167 = 1.0F;

	@ObfuscatedName("aqo.l")
	public static float field12172 = 0.0F;

	@ObfuscatedName("aqo.u")
	public static float field12168 = 1.0F;

	@ObfuscatedName("aqo.z")
	public static float field12166 = 0.0F;

	@ObfuscatedName("aqo.p")
	public static float field12170 = 1.0F;

	@ObfuscatedName("aqo.c")
	public class68 field12169;

	public class1145(class849 arg0) {
		super(arg0);
	}

	@ObfuscatedName("aqo.ao()Z")
	public boolean method19231() {
		return this.field11270.field10002;
	}

	@ObfuscatedName("aqo.e()Z")
	public boolean method17539() {
		return this.field12169 != null;
	}

	@ObfuscatedName("aqo.n()Z")
	public boolean method17534() {
		if (this.field11270.field10002) {
			this.field12169 = class68.method1065(this.field11270, new class71[] { class71.method1120(this.field11270, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") });
			return this.field12169 != null;
		} else {
			return false;
		}
	}

	@ObfuscatedName("aqo.k(II)V")
	public void method17540(int arg0, int arg1) {
	}

	@ObfuscatedName("aqo.m()V")
	public void method17570() {
		this.field12169 = null;
	}

	@ObfuscatedName("aqo.f(ILadt;Ladt;II)V")
	public void method17537(int arg0, class812 arg1, class812 arg2, int arg3, int arg4) {
		int var6 = this.field12169.field987;
		OpenGL.glUseProgram(var6);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var6, "sceneTex"), 0);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var6, "paramsGamma"), field12167);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(var6, "paramsRanges"), field12172, field12168, field12166, field12170);
		this.field11270.method15776(0);
		this.field11270.method15777(arg1);
	}

	@ObfuscatedName("aqo.w(I)V")
	public void method17538(int arg0) {
		OpenGL.glUseProgram(0);
		this.field11270.method15776(0);
		this.field11270.method15777(null);
	}

	@ObfuscatedName("aqo.p()Ldg;")
	public class135 method17542() {
		return class135.field1645;
	}

	@ObfuscatedName("aqo.u()I")
	public int method17546() {
		return 1;
	}

	@ObfuscatedName("aqo.c()Z")
	public boolean method17551() {
		return field12167 == 1.0F && field12172 == 0.0F && field12168 == 1.0F && field12166 == 0.0F && field12170 == 1.0F;
	}
}
