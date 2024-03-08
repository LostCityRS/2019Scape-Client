package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("aev")
public class class823 extends class74 {

	@ObfuscatedName("aev.k")
	public class68 field9341;

	@ObfuscatedName("aev.f")
	public boolean field9342 = false;

	@ObfuscatedName("aev.w")
	public boolean field9343 = false;

	@ObfuscatedName("aev.l")
	public class78 field9344;

	public class823(class849 arg0, class78 arg1) {
		super(arg0);
		this.field9344 = arg1;
		if (this.field9344.field1038 != null && this.field1021.field10000 && this.field1021.field10002) {
			class71 var3 = class71.method1120(this.field1021, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			class71 var4 = class71.method1120(this.field1021, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.field9341 = class68.method1065(this.field1021, new class71[] { var3, var4 });
			this.field9343 = this.field9341 != null;
		}
	}

	@ObfuscatedName("aev.e()Z")
	public boolean method1252() {
		return this.field9343;
	}

	@ObfuscatedName("aev.n(Z)V")
	public void method1263(boolean arg0) {
		class813 var2 = this.field1021.method15760();
		if (!this.field9343 || var2 == null) {
			return;
		}
		this.field1021.method15776(1);
		this.field1021.method15777(var2);
		this.field1021.method15776(0);
		this.field1021.method15777(this.field9344.field1038);
		int var3 = this.field9341.field987;
		OpenGL.glUseProgram(var3);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var3, "normalSampler"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var3, "envMapSampler"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var3, "sunDir"), -this.field1021.field9870[0], -this.field1021.field9870[1], -this.field1021.field9870[2]);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(var3, "sunColour"), this.field1021.field9863, this.field1021.field9944, this.field1021.field9945, 1.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var3, "sunExponent"), Math.abs(this.field1021.field9870[1]) * 928.0F + 96.0F);
		this.field9342 = true;
	}

	@ObfuscatedName("aev.m(Z)V")
	public void method1254(boolean arg0) {
	}

	@ObfuscatedName("aev.k()V")
	public void method1255() {
		if (!this.field9342) {
			return;
		}
		this.field1021.method15776(1);
		this.field1021.method15777(null);
		this.field1021.method15776(0);
		this.field1021.method15777(null);
		OpenGL.glUseProgram(0);
		this.field9342 = false;
	}

	@ObfuscatedName("aev.f(II)V")
	public void method1256(int arg0, int arg1) {
		if (!this.field9342) {
			return;
		}
		int var3 = 0x1 << (arg0 & 0x3);
		float var4 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		int var5 = arg1 & 0xFFFF;
		float var6 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		int var7 = this.field9341.field987;
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var7, "time"), (float) (this.field1021.field9872 * var3 % 40000) / 40000.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var7, "scale"), var4);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var7, "breakWaterDepth"), (float) var5);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var7, "breakWaterOffset"), var6);
	}

	@ObfuscatedName("aev.w(Lbq;I)V")
	public void method1251(class70 arg0, int arg1) {
		if (!this.field9342) {
			this.field1021.method15777(arg0);
			this.field1021.method15778(arg1);
		}
	}
}
