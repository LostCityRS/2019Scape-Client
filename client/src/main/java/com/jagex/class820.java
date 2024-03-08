package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("aer")
public class class820 extends class74 {

	@ObfuscatedName("aer.k")
	public class68 field9308;

	@ObfuscatedName("aer.f")
	public boolean field9311 = false;

	@ObfuscatedName("aer.w")
	public boolean field9310 = false;

	@ObfuscatedName("aer.l")
	public class78 field9309;

	public class820(class849 arg0, class78 arg1) {
		super(arg0);
		this.field9309 = arg1;
		if (this.field9309.field1038 != null && this.field1021.field10000 && this.field1021.field10002) {
			class71 var3 = class71.method1120(this.field1021, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			class71 var4 = class71.method1120(this.field1021, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.field9308 = class68.method1065(this.field1021, new class71[] { var3, var4 });
			this.field9310 = this.field9308 != null;
		}
	}

	@ObfuscatedName("aer.e()Z")
	public boolean method1252() {
		return this.field9310;
	}

	@ObfuscatedName("aer.n(Z)V")
	public void method1263(boolean arg0) {
		class813 var2 = this.field1021.method15760();
		if (!this.field9310 || var2 == null) {
			return;
		}
		float var3 = (1.0F - Math.abs(this.field1021.field9870[1])) * 2.0F + 1.0F;
		this.field1021.method15776(1);
		this.field1021.method15777(var2);
		this.field1021.method15776(0);
		this.field1021.method15777(this.field9309.field1038);
		int var4 = this.field9308.field987;
		OpenGL.glUseProgram(var4);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var4, "normalSampler"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var4, "envMapSampler"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var4, "sunDir"), -this.field1021.field9870[0], -this.field1021.field9870[1], -this.field1021.field9870[2]);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(var4, "sunColour"), this.field1021.field9863 * var3, this.field1021.field9944 * var3, this.field1021.field9945 * var3, 1.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var4, "sunExponent"), Math.abs(this.field1021.field9870[1]) * 928.0F + 64.0F);
		this.field9311 = true;
	}

	@ObfuscatedName("aer.m(Z)V")
	public void method1254(boolean arg0) {
	}

	@ObfuscatedName("aer.k()V")
	public void method1255() {
		if (!this.field9311) {
			return;
		}
		this.field1021.method15776(1);
		this.field1021.method15777(null);
		this.field1021.method15776(0);
		this.field1021.method15777(null);
		OpenGL.glUseProgram(0);
		this.field9311 = false;
	}

	@ObfuscatedName("aer.f(II)V")
	public void method1256(int arg0, int arg1) {
		if (!this.field9311) {
			return;
		}
		int var3 = 0x1 << (arg0 & 0x3);
		float var4 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		int var5 = arg1 & 0xFFFF;
		float var6 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		float var7 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		float var8 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		int var9 = arg1 >> 27 & 0xF;
		int var10 = this.field9308.field987;
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "time"), (float) (this.field1021.field9872 * var3 % 40000) / 40000.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "scale"), var4);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "breakWaterDepth"), (float) var5);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "breakWaterOffset"), var6);
		OpenGL.glUniform2f(OpenGL.glGetUniformLocation(var10, "waveIntensity"), var8, var7);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(var10, "waveExponent"), (float) var9);
	}

	@ObfuscatedName("aer.w(Lbq;I)V")
	public void method1251(class70 arg0, int arg1) {
		if (!this.field9311) {
			this.field1021.method15777(arg0);
			this.field1021.method15778(arg1);
		}
	}
}
