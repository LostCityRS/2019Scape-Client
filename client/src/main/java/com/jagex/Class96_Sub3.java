package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aeg")
public final class Class96_Sub3 extends Class96 {

	@OriginalMember(owner = "client!aeg", name = "e", descriptor = "Ljava/lang/String;")
	static final String aString15 = "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";

	@OriginalMember(owner = "client!aeg", name = "f", descriptor = "Ljava/lang/String;")
	static final String aString16 = "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";

	@OriginalMember(owner = "client!aeg", name = "l", descriptor = "Z")
	boolean aBoolean57 = false;

	@OriginalMember(owner = "client!aeg", name = "g", descriptor = "Z")
	boolean aBoolean58 = false;

	@OriginalMember(owner = "client!aeg", name = "i", descriptor = "Lclient!bf;")
	Class182 aClass182_2;

	@OriginalMember(owner = "client!aeg", name = "u", descriptor = "Lclient!by;")
	Class199 aClass199_1;

	@OriginalMember(owner = "client!aeg", name = "<init>", descriptor = "(Lclient!afm;Lclient!bf;)V")
	Class96_Sub3(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) Class182 arg1) {
		super(arg0);
		this.aClass182_2 = arg1;
		if (this.aClass182_2.aClass84_Sub3_3 != null && this.aClass102_Sub3_24.aBoolean137 && this.aClass102_Sub3_24.aBoolean155) {
			@Pc(29) Class181 local29 = Class181.method24681(this.aClass102_Sub3_24, 35633, "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			@Pc(35) Class181 local35 = Class181.method24681(this.aClass102_Sub3_24, 35632, "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			this.aClass199_1 = Class199.method24921(this.aClass102_Sub3_24, new Class181[] { local29, local35 });
			this.aBoolean58 = this.aClass199_1 != null;
		}
	}

	@OriginalMember(owner = "client!aeg", name = "h", descriptor = "(II)V")
	@Override
	void method2903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean57) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(36) int local36 = this.aClass199_1.anInt3371;
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "time"), (float) (local8 * this.aClass102_Sub3_24.anInt770 % 40000) / 40000.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "scale"), local19);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!aeg", name = "t", descriptor = "()Z")
	@Override
	boolean method2897() {
		return this.aBoolean58;
	}

	@OriginalMember(owner = "client!aeg", name = "m", descriptor = "(Z)V")
	@Override
	void method2892(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class84_Sub2 local3 = this.aClass102_Sub3_24.method6369();
		if (!this.aBoolean58 || local3 == null) {
			return;
		}
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(local3);
		this.aClass102_Sub3_24.method6386(0);
		this.aClass102_Sub3_24.method6339(this.aClass182_2.aClass84_Sub3_3);
		@Pc(30) int local30 = this.aClass199_1.anInt3371;
		OpenGL.glUseProgram(local30);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local30, "normalSampler"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local30, "envMapSampler"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local30, "sunDir"), -this.aClass102_Sub3_24.aFloatArray21[0], -this.aClass102_Sub3_24.aFloatArray21[1], -this.aClass102_Sub3_24.aFloatArray21[2]);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local30, "sunColour"), this.aClass102_Sub3_24.aFloat66, this.aClass102_Sub3_24.aFloat74, this.aClass102_Sub3_24.aFloat65, 1.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local30, "sunExponent"), Math.abs(this.aClass102_Sub3_24.aFloatArray21[1]) * 928.0F + 96.0F);
		this.aBoolean57 = true;
	}

	@OriginalMember(owner = "client!aeg", name = "e", descriptor = "(Z)V")
	@Override
	void method2888(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aeg", name = "u", descriptor = "()V")
	@Override
	void method2885() {
		if (!this.aBoolean57) {
			return;
		}
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(null);
		this.aClass102_Sub3_24.method6386(0);
		this.aClass102_Sub3_24.method6339(null);
		OpenGL.glUseProgram(0);
		this.aBoolean57 = false;
	}

	@OriginalMember(owner = "client!aeg", name = "l", descriptor = "(II)V")
	@Override
	void method2890(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean57) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(36) int local36 = this.aClass199_1.anInt3371;
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "time"), (float) (local8 * this.aClass102_Sub3_24.anInt770 % 40000) / 40000.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "scale"), local19);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!aeg", name = "g", descriptor = "(Lclient!bz;I)V")
	@Override
	void method2891(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean57) {
			this.aClass102_Sub3_24.method6339(arg0);
			this.aClass102_Sub3_24.method6543(arg1);
		}
	}

	@OriginalMember(owner = "client!aeg", name = "i", descriptor = "()Z")
	@Override
	boolean method2894() {
		return this.aBoolean58;
	}

	@OriginalMember(owner = "client!aeg", name = "k", descriptor = "(Z)V")
	@Override
	void method2886(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aeg", name = "o", descriptor = "(Z)V")
	@Override
	void method2893(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class84_Sub2 local3 = this.aClass102_Sub3_24.method6369();
		if (!this.aBoolean58 || local3 == null) {
			return;
		}
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(local3);
		this.aClass102_Sub3_24.method6386(0);
		this.aClass102_Sub3_24.method6339(this.aClass182_2.aClass84_Sub3_3);
		@Pc(30) int local30 = this.aClass199_1.anInt3371;
		OpenGL.glUseProgram(local30);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local30, "normalSampler"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local30, "envMapSampler"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local30, "sunDir"), -this.aClass102_Sub3_24.aFloatArray21[0], -this.aClass102_Sub3_24.aFloatArray21[1], -this.aClass102_Sub3_24.aFloatArray21[2]);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local30, "sunColour"), this.aClass102_Sub3_24.aFloat66, this.aClass102_Sub3_24.aFloat74, this.aClass102_Sub3_24.aFloat65, 1.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local30, "sunExponent"), Math.abs(this.aClass102_Sub3_24.aFloatArray21[1]) * 928.0F + 96.0F);
		this.aBoolean57 = true;
	}

	@OriginalMember(owner = "client!aeg", name = "j", descriptor = "(Z)V")
	@Override
	void method2889(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class84_Sub2 local3 = this.aClass102_Sub3_24.method6369();
		if (!this.aBoolean58 || local3 == null) {
			return;
		}
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(local3);
		this.aClass102_Sub3_24.method6386(0);
		this.aClass102_Sub3_24.method6339(this.aClass182_2.aClass84_Sub3_3);
		@Pc(30) int local30 = this.aClass199_1.anInt3371;
		OpenGL.glUseProgram(local30);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local30, "normalSampler"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local30, "envMapSampler"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local30, "sunDir"), -this.aClass102_Sub3_24.aFloatArray21[0], -this.aClass102_Sub3_24.aFloatArray21[1], -this.aClass102_Sub3_24.aFloatArray21[2]);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local30, "sunColour"), this.aClass102_Sub3_24.aFloat66, this.aClass102_Sub3_24.aFloat74, this.aClass102_Sub3_24.aFloat65, 1.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local30, "sunExponent"), Math.abs(this.aClass102_Sub3_24.aFloatArray21[1]) * 928.0F + 96.0F);
		this.aBoolean57 = true;
	}

	@OriginalMember(owner = "client!aeg", name = "a", descriptor = "(Z)V")
	@Override
	void method2895(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aeg", name = "s", descriptor = "(Z)V")
	@Override
	void method2896(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!aeg", name = "x", descriptor = "()V")
	@Override
	void method2898() {
		if (!this.aBoolean57) {
			return;
		}
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(null);
		this.aClass102_Sub3_24.method6386(0);
		this.aClass102_Sub3_24.method6339(null);
		OpenGL.glUseProgram(0);
		this.aBoolean57 = false;
	}

	@OriginalMember(owner = "client!aeg", name = "q", descriptor = "()V")
	@Override
	void method2901() {
		if (!this.aBoolean57) {
			return;
		}
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(null);
		this.aClass102_Sub3_24.method6386(0);
		this.aClass102_Sub3_24.method6339(null);
		OpenGL.glUseProgram(0);
		this.aBoolean57 = false;
	}

	@OriginalMember(owner = "client!aeg", name = "p", descriptor = "(Lclient!bz;I)V")
	@Override
	void method2905(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean57) {
			this.aClass102_Sub3_24.method6339(arg0);
			this.aClass102_Sub3_24.method6543(arg1);
		}
	}

	@OriginalMember(owner = "client!aeg", name = "r", descriptor = "()V")
	@Override
	void method2900() {
		if (!this.aBoolean57) {
			return;
		}
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(null);
		this.aClass102_Sub3_24.method6386(0);
		this.aClass102_Sub3_24.method6339(null);
		OpenGL.glUseProgram(0);
		this.aBoolean57 = false;
	}

	@OriginalMember(owner = "client!aeg", name = "f", descriptor = "(Z)V")
	@Override
	void method2887(@OriginalArg(0) boolean arg0) {
		@Pc(3) Class84_Sub2 local3 = this.aClass102_Sub3_24.method6369();
		if (!this.aBoolean58 || local3 == null) {
			return;
		}
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(local3);
		this.aClass102_Sub3_24.method6386(0);
		this.aClass102_Sub3_24.method6339(this.aClass182_2.aClass84_Sub3_3);
		@Pc(30) int local30 = this.aClass199_1.anInt3371;
		OpenGL.glUseProgram(local30);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local30, "normalSampler"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local30, "envMapSampler"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local30, "sunDir"), -this.aClass102_Sub3_24.aFloatArray21[0], -this.aClass102_Sub3_24.aFloatArray21[1], -this.aClass102_Sub3_24.aFloatArray21[2]);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local30, "sunColour"), this.aClass102_Sub3_24.aFloat66, this.aClass102_Sub3_24.aFloat74, this.aClass102_Sub3_24.aFloat65, 1.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local30, "sunExponent"), Math.abs(this.aClass102_Sub3_24.aFloatArray21[1]) * 928.0F + 96.0F);
		this.aBoolean57 = true;
	}

	@OriginalMember(owner = "client!aeg", name = "d", descriptor = "(II)V")
	@Override
	void method2902(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean57) {
			return;
		}
		@Pc(8) int local8 = 0x1 << (arg0 & 0x3);
		@Pc(19) float local19 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
		@Pc(23) int local23 = arg1 & 0xFFFF;
		@Pc(32) float local32 = (float) (arg1 >> 16 & 0x3) / 8.0F;
		@Pc(36) int local36 = this.aClass199_1.anInt3371;
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "time"), (float) (local8 * this.aClass102_Sub3_24.anInt770 % 40000) / 40000.0F);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "scale"), local19);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "breakWaterDepth"), (float) local23);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local36, "breakWaterOffset"), local32);
	}

	@OriginalMember(owner = "client!aeg", name = "z", descriptor = "(Lclient!bz;I)V")
	@Override
	void method2904(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1) {
		if (!this.aBoolean57) {
			this.aClass102_Sub3_24.method6339(arg0);
			this.aClass102_Sub3_24.method6543(arg1);
		}
	}

	@OriginalMember(owner = "client!aeg", name = "w", descriptor = "()V")
	@Override
	void method2899() {
		if (!this.aBoolean57) {
			return;
		}
		this.aClass102_Sub3_24.method6386(1);
		this.aClass102_Sub3_24.method6339(null);
		this.aClass102_Sub3_24.method6386(0);
		this.aClass102_Sub3_24.method6339(null);
		OpenGL.glUseProgram(0);
		this.aBoolean57 = false;
	}
}
