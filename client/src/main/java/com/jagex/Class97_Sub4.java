package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aer")
public final class Class97_Sub4 extends Class97 {

	@OriginalMember(owner = "client!aer", name = "m", descriptor = "Ljava/lang/String;")
	static final String aString13 = "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";

	@OriginalMember(owner = "client!aer", name = "n", descriptor = "Ljava/lang/String;")
	static final String aString14 = "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";

	@OriginalMember(owner = "client!aer", name = "f", descriptor = "Z")
	boolean aBoolean59 = false;

	@OriginalMember(owner = "client!aer", name = "w", descriptor = "Z")
	boolean aBoolean58 = false;

	@OriginalMember(owner = "client!aer", name = "l", descriptor = "Lclient!bz;")
	Class199 aClass199_2;

	@OriginalMember(owner = "client!aer", name = "k", descriptor = "Lclient!bn;")
	Class191 aClass191_1;

	@OriginalMember(owner = "client!aer", name = "<init>", descriptor = "(Lclient!afa;Lclient!bz;)V")
	Class97_Sub4(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) Class199 arg1) {
		super(arg0);
		this.aClass199_2 = arg1;
		if (this.aClass199_2.aClass88_Sub3_1 != null && this.aClass104_Sub1_25.aBoolean101 && this.aClass104_Sub1_25.aBoolean103) {
			@Pc(29) Class190 local29 = Class190.method24597(this.aClass104_Sub1_25, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(35) Class190 local35 = Class190.method24597(this.aClass104_Sub1_25, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass191_1 = Class191.method24602(this.aClass104_Sub1_25, new Class190[] { local29, local35 });
			this.aBoolean58 = this.aClass191_1 != null;
		}
	}

	@OriginalMember(owner = "client!aer", name = "q", descriptor = "(Lclient!bq;I)V")
	@Override
	void method2806(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean59) {
			this.aClass104_Sub1_25.method3804(arg0);
			this.aClass104_Sub1_25.method3805(arg1);
		}
	}

	@OriginalMember(owner = "client!aer", name = "e", descriptor = "()Z")
	@Override
	boolean method2790() {
		return this.aBoolean58;
	}

	@OriginalMember(owner = "client!aer", name = "n", descriptor = "(Z)V")
	@Override
	void method2801(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class88_Sub1 local3 = this.aClass104_Sub1_25.method3787();
		if (!this.aBoolean58 || local3 == null) {
			return;
		}
		@Pc(21) float local21 = (1.0F - Math.abs(this.aClass104_Sub1_25.aFloatArray9[1])) * 2.0F + 1.0F;
		this.aClass104_Sub1_25.method3803(1);
		this.aClass104_Sub1_25.method3804(local3);
		this.aClass104_Sub1_25.method3803(0);
		this.aClass104_Sub1_25.method3804(this.aClass199_2.aClass88_Sub3_1);
		@Pc(43) int local43 = this.aClass191_1.anInt3349;
		OpenGL.glUseProgram(local43);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local43, "normalSampler"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local43, "envMapSampler"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local43, "sunDir"), -this.aClass104_Sub1_25.aFloatArray9[0], -this.aClass104_Sub1_25.aFloatArray9[1], -this.aClass104_Sub1_25.aFloatArray9[2]);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local43, "sunColour"), this.aClass104_Sub1_25.aFloat32 * local21, this.aClass104_Sub1_25.aFloat40 * local21, this.aClass104_Sub1_25.aFloat41 * local21, 1.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local43, "sunExponent"), Math.abs(this.aClass104_Sub1_25.aFloatArray9[1]) * 928.0F + 64.0F);
		this.aBoolean59 = true;
	}

	@OriginalMember(owner = "client!aer", name = "u", descriptor = "()Z")
	@Override
	boolean method2802() {
		return this.aBoolean58;
	}

	@OriginalMember(owner = "client!aer", name = "k", descriptor = "()V")
	@Override
	void method2793() {
		if (!this.aBoolean59) {
			return;
		}
		this.aClass104_Sub1_25.method3803(1);
		this.aClass104_Sub1_25.method3804(null);
		this.aClass104_Sub1_25.method3803(0);
		this.aClass104_Sub1_25.method3804(null);
		OpenGL.glUseProgram(0);
		this.aBoolean59 = false;
	}

	@OriginalMember(owner = "client!aer", name = "f", descriptor = "(II)V")
	@Override
	void method2794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean59) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(41) float local41 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(50) float local50 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(56) int local56 = arg1 >> 27 & 0xF;
		@Pc(60) int local60 = this.aClass191_1.anInt3349;
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "time"), (float) (local8 * this.aClass104_Sub1_25.anInt530 % 40000) / 40000.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "scale"), local19);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "breakWaterOffset"), local32);
		OpenGL.glUniform2f(OpenGL.glGetUniformLocation(local60, "waveIntensity"), local50, local41);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "waveExponent"), (float) local56);
	}

	@OriginalMember(owner = "client!aer", name = "w", descriptor = "(Lclient!bq;I)V")
	@Override
	void method2789(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean59) {
			this.aClass104_Sub1_25.method3804(arg0);
			this.aClass104_Sub1_25.method3805(arg1);
		}
	}

	@OriginalMember(owner = "client!aer", name = "x", descriptor = "(Lclient!bq;I)V")
	@Override
	void method2807(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean59) {
			this.aClass104_Sub1_25.method3804(arg0);
			this.aClass104_Sub1_25.method3805(arg1);
		}
	}

	@OriginalMember(owner = "client!aer", name = "m", descriptor = "(Z)V")
	@Override
	void method2792(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aer", name = "z", descriptor = "()Z")
	@Override
	boolean method2798() {
		return this.aBoolean58;
	}

	@OriginalMember(owner = "client!aer", name = "d", descriptor = "()Z")
	@Override
	boolean method2799() {
		return this.aBoolean58;
	}

	@OriginalMember(owner = "client!aer", name = "c", descriptor = "(Z)V")
	@Override
	void method2800(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class88_Sub1 local3 = this.aClass104_Sub1_25.method3787();
		if (!this.aBoolean58 || local3 == null) {
			return;
		}
		@Pc(21) float local21 = (1.0F - Math.abs(this.aClass104_Sub1_25.aFloatArray9[1])) * 2.0F + 1.0F;
		this.aClass104_Sub1_25.method3803(1);
		this.aClass104_Sub1_25.method3804(local3);
		this.aClass104_Sub1_25.method3803(0);
		this.aClass104_Sub1_25.method3804(this.aClass199_2.aClass88_Sub3_1);
		@Pc(43) int local43 = this.aClass191_1.anInt3349;
		OpenGL.glUseProgram(local43);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local43, "normalSampler"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local43, "envMapSampler"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local43, "sunDir"), -this.aClass104_Sub1_25.aFloatArray9[0], -this.aClass104_Sub1_25.aFloatArray9[1], -this.aClass104_Sub1_25.aFloatArray9[2]);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local43, "sunColour"), this.aClass104_Sub1_25.aFloat32 * local21, this.aClass104_Sub1_25.aFloat40 * local21, this.aClass104_Sub1_25.aFloat41 * local21, 1.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local43, "sunExponent"), Math.abs(this.aClass104_Sub1_25.aFloatArray9[1]) * 928.0F + 64.0F);
		this.aBoolean59 = true;
	}

	@OriginalMember(owner = "client!aer", name = "r", descriptor = "(Z)V")
	@Override
	void method2797(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aer", name = "v", descriptor = "()V")
	@Override
	void method2795() {
		if (!this.aBoolean59) {
			return;
		}
		this.aClass104_Sub1_25.method3803(1);
		this.aClass104_Sub1_25.method3804(null);
		this.aClass104_Sub1_25.method3803(0);
		this.aClass104_Sub1_25.method3804(null);
		OpenGL.glUseProgram(0);
		this.aBoolean59 = false;
	}

	@OriginalMember(owner = "client!aer", name = "o", descriptor = "(II)V")
	@Override
	void method2803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean59) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(41) float local41 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(50) float local50 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(56) int local56 = arg1 >> 27 & 0xF;
		@Pc(60) int local60 = this.aClass191_1.anInt3349;
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "time"), (float) (local8 * this.aClass104_Sub1_25.anInt530 % 40000) / 40000.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "scale"), local19);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "breakWaterOffset"), local32);
		OpenGL.glUniform2f(OpenGL.glGetUniformLocation(local60, "waveIntensity"), local50, local41);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "waveExponent"), (float) local56);
	}

	@OriginalMember(owner = "client!aer", name = "p", descriptor = "()Z")
	@Override
	boolean method2791() {
		return this.aBoolean58;
	}

	@OriginalMember(owner = "client!aer", name = "y", descriptor = "(II)V")
	@Override
	void method2805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean59) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(41) float local41 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(50) float local50 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(56) int local56 = arg1 >> 27 & 0xF;
		@Pc(60) int local60 = this.aClass191_1.anInt3349;
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "time"), (float) (local8 * this.aClass104_Sub1_25.anInt530 % 40000) / 40000.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "scale"), local19);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "breakWaterOffset"), local32);
		OpenGL.glUniform2f(OpenGL.glGetUniformLocation(local60, "waveIntensity"), local50, local41);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "waveExponent"), (float) local56);
	}

	@OriginalMember(owner = "client!aer", name = "l", descriptor = "()Z")
	@Override
	boolean method2796() {
		return this.aBoolean58;
	}

	@OriginalMember(owner = "client!aer", name = "s", descriptor = "(II)V")
	@Override
	void method2804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean59) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(41) float local41 = (float) (arg1 >> 19 & 0xF) / 16.0F;
		@Pc(50) float local50 = (float) (arg1 >> 23 & 0xF) / 16.0F;
		@Pc(56) int local56 = arg1 >> 27 & 0xF;
		@Pc(60) int local60 = this.aClass191_1.anInt3349;
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "time"), (float) (local8 * this.aClass104_Sub1_25.anInt530 % 40000) / 40000.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "scale"), local19);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "breakWaterOffset"), local32);
		OpenGL.glUniform2f(OpenGL.glGetUniformLocation(local60, "waveIntensity"), local50, local41);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local60, "waveExponent"), (float) local56);
	}
}
