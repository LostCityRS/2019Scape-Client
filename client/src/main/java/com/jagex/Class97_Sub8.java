package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aev")
public class Class97_Sub8 extends Class97 {

	@OriginalMember(owner = "client!aev", name = "m", descriptor = "Ljava/lang/String;")
	static final String aString20 = "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";

	@OriginalMember(owner = "client!aev", name = "n", descriptor = "Ljava/lang/String;")
	static final String aString21 = "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";

	@OriginalMember(owner = "client!aev", name = "f", descriptor = "Z")
	boolean aBoolean64 = false;

	@OriginalMember(owner = "client!aev", name = "w", descriptor = "Z")
	boolean aBoolean65 = false;

	@OriginalMember(owner = "client!aev", name = "l", descriptor = "Lclient!bz;")
	Class199 aClass199_5;

	@OriginalMember(owner = "client!aev", name = "k", descriptor = "Lclient!bn;")
	Class191 aClass191_2;

	@OriginalMember(owner = "client!aev", name = "<init>", descriptor = "(Lclient!afa;Lclient!bz;)V", line = 16)
	Class97_Sub8(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) Class199 arg1) {
		super(arg0);
		this.aClass199_5 = arg1;
		if (this.aClass199_5.aClass88_Sub3_1 != null && this.aClass104_Sub1_25.aBoolean101 && this.aClass104_Sub1_25.aBoolean103) {
			@Pc(29) Class190 local29 = Class190.method24585(this.aClass104_Sub1_25, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(35) Class190 local35 = Class190.method24585(this.aClass104_Sub1_25, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass191_2 = Class191.method24589(this.aClass104_Sub1_25, new Class190[] { local29, local35 });
			this.aBoolean65 = this.aClass191_2 != null;
		}
	}

	@OriginalMember(owner = "client!aev", name = "e", descriptor = "()Z", line = 27)
	@Override
	boolean method2790() {
		return this.aBoolean65;
	}

	@OriginalMember(owner = "client!aev", name = "d", descriptor = "()Z", line = 27)
	@Override
	boolean method2799() {
		return this.aBoolean65;
	}

	@OriginalMember(owner = "client!aev", name = "l", descriptor = "()Z", line = 27)
	@Override
	boolean method2796() {
		return this.aBoolean65;
	}

	@OriginalMember(owner = "client!aev", name = "u", descriptor = "()Z", line = 27)
	@Override
	boolean method2802() {
		return this.aBoolean65;
	}

	@OriginalMember(owner = "client!aev", name = "z", descriptor = "()Z", line = 27)
	@Override
	boolean method2798() {
		return this.aBoolean65;
	}

	@OriginalMember(owner = "client!aev", name = "p", descriptor = "()Z", line = 27)
	@Override
	boolean method2791() {
		return this.aBoolean65;
	}

	@OriginalMember(owner = "client!aev", name = "n", descriptor = "(Z)V", line = 31)
	@Override
	void method2801(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class88_Sub1 local3 = this.aClass104_Sub1_25.method3838();
		if (!this.aBoolean65 || local3 == null) {
			return;
		}
		this.aClass104_Sub1_25.method3882(1);
		this.aClass104_Sub1_25.method3887(local3);
		this.aClass104_Sub1_25.method3882(0);
		this.aClass104_Sub1_25.method3887(this.aClass199_5.aClass88_Sub3_1);
		@Pc(30) int local30 = this.aClass191_2.anInt3349;
		OpenGL.glUseProgram(local30);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local30, "normalSampler"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local30, "envMapSampler"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local30, "sunDir"), -this.aClass104_Sub1_25.aFloatArray9[0], -this.aClass104_Sub1_25.aFloatArray9[1], -this.aClass104_Sub1_25.aFloatArray9[2]);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local30, "sunColour"), this.aClass104_Sub1_25.aFloat32, this.aClass104_Sub1_25.aFloat40, this.aClass104_Sub1_25.aFloat41, 1.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local30, "sunExponent"), Math.abs(this.aClass104_Sub1_25.aFloatArray9[1]) * 928.0F + 96.0F);
		this.aBoolean64 = true;
	}

	@OriginalMember(owner = "client!aev", name = "c", descriptor = "(Z)V", line = 31)
	@Override
	void method2800(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class88_Sub1 local3 = this.aClass104_Sub1_25.method3838();
		if (!this.aBoolean65 || local3 == null) {
			return;
		}
		this.aClass104_Sub1_25.method3882(1);
		this.aClass104_Sub1_25.method3887(local3);
		this.aClass104_Sub1_25.method3882(0);
		this.aClass104_Sub1_25.method3887(this.aClass199_5.aClass88_Sub3_1);
		@Pc(30) int local30 = this.aClass191_2.anInt3349;
		OpenGL.glUseProgram(local30);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local30, "normalSampler"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local30, "envMapSampler"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local30, "sunDir"), -this.aClass104_Sub1_25.aFloatArray9[0], -this.aClass104_Sub1_25.aFloatArray9[1], -this.aClass104_Sub1_25.aFloatArray9[2]);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local30, "sunColour"), this.aClass104_Sub1_25.aFloat32, this.aClass104_Sub1_25.aFloat40, this.aClass104_Sub1_25.aFloat41, 1.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local30, "sunExponent"), Math.abs(this.aClass104_Sub1_25.aFloatArray9[1]) * 928.0F + 96.0F);
		this.aBoolean64 = true;
	}

	@OriginalMember(owner = "client!aev", name = "m", descriptor = "(Z)V", line = 48)
	@Override
	void method2792(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aev", name = "r", descriptor = "(Z)V", line = 48)
	@Override
	void method2797(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aev", name = "k", descriptor = "()V", line = 51)
	@Override
	void method2793() {
		if (!this.aBoolean64) {
			return;
		}
		this.aClass104_Sub1_25.method3882(1);
		this.aClass104_Sub1_25.method3887(null);
		this.aClass104_Sub1_25.method3882(0);
		this.aClass104_Sub1_25.method3887(null);
		OpenGL.glUseProgram(0);
		this.aBoolean64 = false;
	}

	@OriginalMember(owner = "client!aev", name = "v", descriptor = "()V", line = 51)
	@Override
	void method2795() {
		if (!this.aBoolean64) {
			return;
		}
		this.aClass104_Sub1_25.method3882(1);
		this.aClass104_Sub1_25.method3887(null);
		this.aClass104_Sub1_25.method3882(0);
		this.aClass104_Sub1_25.method3887(null);
		OpenGL.glUseProgram(0);
		this.aBoolean64 = false;
	}

	@OriginalMember(owner = "client!aev", name = "f", descriptor = "(II)V", line = 62)
	@Override
	void method2794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean64) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(36) int local36 = this.aClass191_2.anInt3349;
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "time"), (float) (local8 * this.aClass104_Sub1_25.anInt530 % 40000) / 40000.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "scale"), local19);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!aev", name = "y", descriptor = "(II)V", line = 62)
	@Override
	void method2805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean64) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(36) int local36 = this.aClass191_2.anInt3349;
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "time"), (float) (local8 * this.aClass104_Sub1_25.anInt530 % 40000) / 40000.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "scale"), local19);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!aev", name = "o", descriptor = "(II)V", line = 62)
	@Override
	void method2803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean64) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(36) int local36 = this.aClass191_2.anInt3349;
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "time"), (float) (local8 * this.aClass104_Sub1_25.anInt530 % 40000) / 40000.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "scale"), local19);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!aev", name = "s", descriptor = "(II)V", line = 62)
	@Override
	void method2804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean64) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(36) int local36 = this.aClass191_2.anInt3349;
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "time"), (float) (local8 * this.aClass104_Sub1_25.anInt530 % 40000) / 40000.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "scale"), local19);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!aev", name = "x", descriptor = "(Lclient!bq;I)V", line = 76)
	@Override
	void method2807(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean64) {
			this.aClass104_Sub1_25.method3887(arg0);
			this.aClass104_Sub1_25.method3888(arg1);
		}
	}

	@OriginalMember(owner = "client!aev", name = "w", descriptor = "(Lclient!bq;I)V", line = 76)
	@Override
	void method2789(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean64) {
			this.aClass104_Sub1_25.method3887(arg0);
			this.aClass104_Sub1_25.method3888(arg1);
		}
	}

	@OriginalMember(owner = "client!aev", name = "q", descriptor = "(Lclient!bq;I)V", line = 76)
	@Override
	void method2806(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean64) {
			this.aClass104_Sub1_25.method3887(arg0);
			this.aClass104_Sub1_25.method3888(arg1);
		}
	}
}
