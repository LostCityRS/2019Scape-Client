package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aer")
public final class Class96_Sub6 extends Class96 {

	@OriginalMember(owner = "client!aer", name = "e", descriptor = "Ljava/lang/String;")
	static final String aString17 = "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";

	@OriginalMember(owner = "client!aer", name = "f", descriptor = "Ljava/lang/String;")
	static final String aString18 = "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";

	@OriginalMember(owner = "client!aer", name = "l", descriptor = "Z")
	boolean aBoolean71 = false;

	@OriginalMember(owner = "client!aer", name = "g", descriptor = "Z")
	boolean aBoolean72 = false;

	@OriginalMember(owner = "client!aer", name = "i", descriptor = "Lclient!bf;")
	Class182 aClass182_3;

	@OriginalMember(owner = "client!aer", name = "u", descriptor = "Lclient!by;")
	Class199 aClass199_2;

	@OriginalMember(owner = "client!aer", name = "<init>", descriptor = "(Lclient!afm;Lclient!bf;)V")
	Class96_Sub6(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) Class182 arg1) {
		super(arg0);
		this.aClass182_3 = arg1;
		if (this.aClass182_3.aClass84_Sub3_3 != null && this.aClass102_Sub3_24.aBoolean137 && this.aClass102_Sub3_24.aBoolean155) {
			@Pc(29) Class181 local29 = Class181.method24681(this.aClass102_Sub3_24, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(35) Class181 local35 = Class181.method24681(this.aClass102_Sub3_24, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass199_2 = Class199.method24921(this.aClass102_Sub3_24, new Class181[] { local29, local35 });
			this.aBoolean72 = this.aClass199_2 != null;
		}
	}

	@OriginalMember(owner = "client!aer", name = "t", descriptor = "()Z")
	@Override
	boolean method2897() {
		return this.aBoolean72;
	}

	@OriginalMember(owner = "client!aer", name = "l", descriptor = "(II)V")
	@Override
	void method2890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean71) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(41) float local41 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(50) float local50 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(56) int local56 = arg1 >> 27 & 0xF;
		@Pc(60) int local60 = this.aClass199_2.anInt3371;
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "time"), (float) (local8 * this.aClass102_Sub3_24.anInt770 % 40000) / 40000.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "scale"), local19);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "breakWaterOffset"), local32);
		OpenGL.glUniform2f(OpenGL.glGetUniformLocation(local60, "waveIntensity"), local50, local41);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "waveExponent"), (float) local56);
	}

	@OriginalMember(owner = "client!aer", name = "i", descriptor = "()Z")
	@Override
	boolean method2894() {
		return this.aBoolean72;
	}

	@OriginalMember(owner = "client!aer", name = "u", descriptor = "()V")
	@Override
	void method2885() {
		if (!this.aBoolean71) {
			return;
		}
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(null);
		this.aClass102_Sub3_24.method6386(0);
		this.aClass102_Sub3_24.method6339(null);
		OpenGL.glUseProgram(0);
		this.aBoolean71 = false;
	}

	@OriginalMember(owner = "client!aer", name = "p", descriptor = "(Lclient!bz;I)V")
	@Override
	void method2905(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean71) {
			this.aClass102_Sub3_24.method6339(arg0);
			this.aClass102_Sub3_24.method6543(arg1);
		}
	}

	@OriginalMember(owner = "client!aer", name = "z", descriptor = "(Lclient!bz;I)V")
	@Override
	void method2904(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean71) {
			this.aClass102_Sub3_24.method6339(arg0);
			this.aClass102_Sub3_24.method6543(arg1);
		}
	}

	@OriginalMember(owner = "client!aer", name = "x", descriptor = "()V")
	@Override
	void method2898() {
		if (!this.aBoolean71) {
			return;
		}
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(null);
		this.aClass102_Sub3_24.method6386(0);
		this.aClass102_Sub3_24.method6339(null);
		OpenGL.glUseProgram(0);
		this.aBoolean71 = false;
	}

	@OriginalMember(owner = "client!aer", name = "m", descriptor = "(Z)V")
	@Override
	void method2892(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class84_Sub2 local3 = this.aClass102_Sub3_24.method6369();
		if (!this.aBoolean72 || local3 == null) {
			return;
		}
		@Pc(21) float local21 = (1.0F - Math.abs(this.aClass102_Sub3_24.aFloatArray21[1])) * 2.0F + 1.0F;
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(local3);
		this.aClass102_Sub3_24.method6386(0);
		this.aClass102_Sub3_24.method6339(this.aClass182_3.aClass84_Sub3_3);
		@Pc(43) int local43 = this.aClass199_2.anInt3371;
		OpenGL.glUseProgram(local43);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local43, "normalSampler"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local43, "envMapSampler"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local43, "sunDir"), -this.aClass102_Sub3_24.aFloatArray21[0], -this.aClass102_Sub3_24.aFloatArray21[1], -this.aClass102_Sub3_24.aFloatArray21[2]);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local43, "sunColour"), this.aClass102_Sub3_24.aFloat66 * local21, this.aClass102_Sub3_24.aFloat74 * local21, this.aClass102_Sub3_24.aFloat65 * local21, 1.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local43, "sunExponent"), Math.abs(this.aClass102_Sub3_24.aFloatArray21[1]) * 928.0F + 64.0F);
		this.aBoolean71 = true;
	}

	@OriginalMember(owner = "client!aer", name = "e", descriptor = "(Z)V")
	@Override
	void method2888(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aer", name = "j", descriptor = "(Z)V")
	@Override
	void method2889(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class84_Sub2 local3 = this.aClass102_Sub3_24.method6369();
		if (!this.aBoolean72 || local3 == null) {
			return;
		}
		@Pc(21) float local21 = (1.0F - Math.abs(this.aClass102_Sub3_24.aFloatArray21[1])) * 2.0F + 1.0F;
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(local3);
		this.aClass102_Sub3_24.method6386(0);
		this.aClass102_Sub3_24.method6339(this.aClass182_3.aClass84_Sub3_3);
		@Pc(43) int local43 = this.aClass199_2.anInt3371;
		OpenGL.glUseProgram(local43);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local43, "normalSampler"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local43, "envMapSampler"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local43, "sunDir"), -this.aClass102_Sub3_24.aFloatArray21[0], -this.aClass102_Sub3_24.aFloatArray21[1], -this.aClass102_Sub3_24.aFloatArray21[2]);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local43, "sunColour"), this.aClass102_Sub3_24.aFloat66 * local21, this.aClass102_Sub3_24.aFloat74 * local21, this.aClass102_Sub3_24.aFloat65 * local21, 1.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local43, "sunExponent"), Math.abs(this.aClass102_Sub3_24.aFloatArray21[1]) * 928.0F + 64.0F);
		this.aBoolean71 = true;
	}

	@OriginalMember(owner = "client!aer", name = "a", descriptor = "(Z)V")
	@Override
	void method2895(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aer", name = "s", descriptor = "(Z)V")
	@Override
	void method2896(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aer", name = "k", descriptor = "(Z)V")
	@Override
	void method2886(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aer", name = "f", descriptor = "(Z)V")
	@Override
	void method2887(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class84_Sub2 local3 = this.aClass102_Sub3_24.method6369();
		if (!this.aBoolean72 || local3 == null) {
			return;
		}
		@Pc(21) float local21 = (1.0F - Math.abs(this.aClass102_Sub3_24.aFloatArray21[1])) * 2.0F + 1.0F;
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(local3);
		this.aClass102_Sub3_24.method6386(0);
		this.aClass102_Sub3_24.method6339(this.aClass182_3.aClass84_Sub3_3);
		@Pc(43) int local43 = this.aClass199_2.anInt3371;
		OpenGL.glUseProgram(local43);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local43, "normalSampler"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local43, "envMapSampler"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local43, "sunDir"), -this.aClass102_Sub3_24.aFloatArray21[0], -this.aClass102_Sub3_24.aFloatArray21[1], -this.aClass102_Sub3_24.aFloatArray21[2]);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local43, "sunColour"), this.aClass102_Sub3_24.aFloat66 * local21, this.aClass102_Sub3_24.aFloat74 * local21, this.aClass102_Sub3_24.aFloat65 * local21, 1.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local43, "sunExponent"), Math.abs(this.aClass102_Sub3_24.aFloatArray21[1]) * 928.0F + 64.0F);
		this.aBoolean71 = true;
	}

	@OriginalMember(owner = "client!aer", name = "w", descriptor = "()V")
	@Override
	void method2899() {
		if (!this.aBoolean71) {
			return;
		}
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(null);
		this.aClass102_Sub3_24.method6386(0);
		this.aClass102_Sub3_24.method6339(null);
		OpenGL.glUseProgram(0);
		this.aBoolean71 = false;
	}

	@OriginalMember(owner = "client!aer", name = "r", descriptor = "()V")
	@Override
	void method2900() {
		if (!this.aBoolean71) {
			return;
		}
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(null);
		this.aClass102_Sub3_24.method6386(0);
		this.aClass102_Sub3_24.method6339(null);
		OpenGL.glUseProgram(0);
		this.aBoolean71 = false;
	}

	@OriginalMember(owner = "client!aer", name = "q", descriptor = "()V")
	@Override
	void method2901() {
		if (!this.aBoolean71) {
			return;
		}
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(null);
		this.aClass102_Sub3_24.method6386(0);
		this.aClass102_Sub3_24.method6339(null);
		OpenGL.glUseProgram(0);
		this.aBoolean71 = false;
	}

	@OriginalMember(owner = "client!aer", name = "h", descriptor = "(II)V")
	@Override
	void method2903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean71) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(41) float local41 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(50) float local50 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(56) int local56 = arg1 >> 27 & 0xF;
		@Pc(60) int local60 = this.aClass199_2.anInt3371;
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "time"), (float) (local8 * this.aClass102_Sub3_24.anInt770 % 40000) / 40000.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "scale"), local19);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "breakWaterOffset"), local32);
		OpenGL.glUniform2f(OpenGL.glGetUniformLocation(local60, "waveIntensity"), local50, local41);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "waveExponent"), (float) local56);
	}

	@OriginalMember(owner = "client!aer", name = "d", descriptor = "(II)V")
	@Override
	void method2902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean71) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(41) float local41 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(50) float local50 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(56) int local56 = arg1 >> 27 & 0xF;
		@Pc(60) int local60 = this.aClass199_2.anInt3371;
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "time"), (float) (local8 * this.aClass102_Sub3_24.anInt770 % 40000) / 40000.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "scale"), local19);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "breakWaterOffset"), local32);
		OpenGL.glUniform2f(OpenGL.glGetUniformLocation(local60, "waveIntensity"), local50, local41);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "waveExponent"), (float) local56);
	}

	@OriginalMember(owner = "client!aer", name = "o", descriptor = "(Z)V")
	@Override
	void method2893(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class84_Sub2 local3 = this.aClass102_Sub3_24.method6369();
		if (!this.aBoolean72 || local3 == null) {
			return;
		}
		@Pc(21) float local21 = (1.0F - Math.abs(this.aClass102_Sub3_24.aFloatArray21[1])) * 2.0F + 1.0F;
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(local3);
		this.aClass102_Sub3_24.method6386(0);
		this.aClass102_Sub3_24.method6339(this.aClass182_3.aClass84_Sub3_3);
		@Pc(43) int local43 = this.aClass199_2.anInt3371;
		OpenGL.glUseProgram(local43);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local43, "normalSampler"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local43, "envMapSampler"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local43, "sunDir"), -this.aClass102_Sub3_24.aFloatArray21[0], -this.aClass102_Sub3_24.aFloatArray21[1], -this.aClass102_Sub3_24.aFloatArray21[2]);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local43, "sunColour"), this.aClass102_Sub3_24.aFloat66 * local21, this.aClass102_Sub3_24.aFloat74 * local21, this.aClass102_Sub3_24.aFloat65 * local21, 1.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local43, "sunExponent"), Math.abs(this.aClass102_Sub3_24.aFloatArray21[1]) * 928.0F + 64.0F);
		this.aBoolean71 = true;
	}

	@OriginalMember(owner = "client!aer", name = "g", descriptor = "(Lclient!bz;I)V")
	@Override
	void method2891(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean71) {
			this.aClass102_Sub3_24.method6339(arg0);
			this.aClass102_Sub3_24.method6543(arg1);
		}
	}
}
