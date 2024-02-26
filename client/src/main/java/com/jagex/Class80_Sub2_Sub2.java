package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqp")
public final class Class80_Sub2_Sub2 extends Class80_Sub2 {

	@OriginalMember(owner = "client!aqp", name = "a", descriptor = "Ljava/lang/String;")
	static final String aString87 = "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n";

	@OriginalMember(owner = "client!aqp", name = "g", descriptor = "F")
	static float aFloat193 = 1.0F;

	@OriginalMember(owner = "client!aqp", name = "i", descriptor = "F")
	static float aFloat192 = 0.0F;

	@OriginalMember(owner = "client!aqp", name = "m", descriptor = "F")
	static float aFloat196 = 1.0F;

	@OriginalMember(owner = "client!aqp", name = "o", descriptor = "F")
	static float aFloat194 = 0.0F;

	@OriginalMember(owner = "client!aqp", name = "j", descriptor = "F")
	static float aFloat195 = 1.0F;

	@OriginalMember(owner = "client!aqp", name = "s", descriptor = "Lclient!by;")
	Class199 aClass199_3;

	@OriginalMember(owner = "client!aqp", name = "<init>", descriptor = "(Lclient!afm;)V")
	Class80_Sub2_Sub2(@OriginalArg(0) Class102_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aqp", name = "x", descriptor = "()Z")
	@Override
	boolean method21638() {
		return this.aClass199_3 != null;
	}

	@OriginalMember(owner = "client!aqp", name = "av", descriptor = "()Z")
	boolean method20433() {
		return this.aClass102_Sub3_38.aBoolean155;
	}

	@OriginalMember(owner = "client!aqp", name = "ay", descriptor = "(ILclient!adm;Lclient!adm;II)V")
	@Override
	void method21644(@OriginalArg(0) int arg0, @OriginalArg(1) Class84_Sub1 arg1, @OriginalArg(2) Class84_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = this.aClass199_3.anInt3371;
		OpenGL.glUseProgram(local3);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local3, "sceneTex"), 0);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local3, "paramsGamma"), aFloat193);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local3, "paramsRanges"), aFloat192, aFloat196, aFloat194, aFloat195);
		this.aClass102_Sub3_38.method6386(0);
		this.aClass102_Sub3_38.method6339(arg1);
	}

	@OriginalMember(owner = "client!aqp", name = "t", descriptor = "()Z")
	@Override
	boolean method21626() {
		return this.aClass199_3 != null;
	}

	@OriginalMember(owner = "client!aqp", name = "u", descriptor = "(II)V")
	@Override
	void method21629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aqp", name = "e", descriptor = "()V")
	@Override
	void method21628() {
		this.aClass199_3 = null;
	}

	@OriginalMember(owner = "client!aqp", name = "s", descriptor = "()Z")
	@Override
	boolean method21637() {
		return aFloat193 == 1.0F && aFloat192 == 0.0F && aFloat196 == 1.0F && aFloat194 == 0.0F && aFloat195 == 1.0F;
	}

	@OriginalMember(owner = "client!aqp", name = "g", descriptor = "(I)V")
	@Override
	void method21631(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgram(0);
		this.aClass102_Sub3_38.method6386(0);
		this.aClass102_Sub3_38.method6339(null);
	}

	@OriginalMember(owner = "client!aqp", name = "l", descriptor = "(ILclient!adm;Lclient!adm;II)V")
	@Override
	void method21630(@OriginalArg(0) int arg0, @OriginalArg(1) Class84_Sub1 arg1, @OriginalArg(2) Class84_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = this.aClass199_3.anInt3371;
		OpenGL.glUseProgram(local3);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local3, "sceneTex"), 0);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local3, "paramsGamma"), aFloat193);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local3, "paramsRanges"), aFloat192, aFloat196, aFloat194, aFloat195);
		this.aClass102_Sub3_38.method6386(0);
		this.aClass102_Sub3_38.method6339(arg1);
	}

	@OriginalMember(owner = "client!aqp", name = "m", descriptor = "()I")
	@Override
	int method21633() {
		return 1;
	}

	@OriginalMember(owner = "client!aqp", name = "an", descriptor = "()Z")
	boolean method20434() {
		return this.aClass102_Sub3_38.aBoolean155;
	}

	@OriginalMember(owner = "client!aqp", name = "z", descriptor = "()Z")
	@Override
	boolean method21639() {
		return this.aClass199_3 != null;
	}

	@OriginalMember(owner = "client!aqp", name = "y", descriptor = "()Z")
	@Override
	boolean method21641() {
		if (this.aClass102_Sub3_38.aBoolean155) {
			this.aClass199_3 = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") });
			return this.aClass199_3 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aqp", name = "p", descriptor = "()Z")
	@Override
	boolean method21640() {
		if (this.aClass102_Sub3_38.aBoolean155) {
			this.aClass199_3 = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") });
			return this.aClass199_3 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aqp", name = "v", descriptor = "()Z")
	@Override
	boolean method21625() {
		if (this.aClass102_Sub3_38.aBoolean155) {
			this.aClass199_3 = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") });
			return this.aClass199_3 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aqp", name = "f", descriptor = "()Z")
	@Override
	boolean method21636() {
		if (this.aClass102_Sub3_38.aBoolean155) {
			this.aClass199_3 = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") });
			return this.aClass199_3 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aqp", name = "n", descriptor = "()V")
	@Override
	void method21648() {
		this.aClass199_3 = null;
	}

	@OriginalMember(owner = "client!aqp", name = "c", descriptor = "()V")
	@Override
	void method21643() {
		this.aClass199_3 = null;
	}

	@OriginalMember(owner = "client!aqp", name = "b", descriptor = "()V")
	@Override
	void method21660() {
		this.aClass199_3 = null;
	}

	@OriginalMember(owner = "client!aqp", name = "ax", descriptor = "(II)V")
	@Override
	void method21645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aqp", name = "j", descriptor = "()Lclient!dy;")
	@Override
	Class236 method21649() {
		return Class236.aClass236_21;
	}

	@OriginalMember(owner = "client!aqp", name = "ai", descriptor = "(ILclient!adm;Lclient!adm;II)V")
	@Override
	void method21647(@OriginalArg(0) int arg0, @OriginalArg(1) Class84_Sub1 arg1, @OriginalArg(2) Class84_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = this.aClass199_3.anInt3371;
		OpenGL.glUseProgram(local3);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local3, "sceneTex"), 0);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local3, "paramsGamma"), aFloat193);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local3, "paramsRanges"), aFloat192, aFloat196, aFloat194, aFloat195);
		this.aClass102_Sub3_38.method6386(0);
		this.aClass102_Sub3_38.method6339(arg1);
	}

	@OriginalMember(owner = "client!aqp", name = "aq", descriptor = "(ILclient!adm;Lclient!adm;II)V")
	@Override
	void method21627(@OriginalArg(0) int arg0, @OriginalArg(1) Class84_Sub1 arg1, @OriginalArg(2) Class84_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = this.aClass199_3.anInt3371;
		OpenGL.glUseProgram(local3);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local3, "sceneTex"), 0);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local3, "paramsGamma"), aFloat193);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local3, "paramsRanges"), aFloat192, aFloat196, aFloat194, aFloat195);
		this.aClass102_Sub3_38.method6386(0);
		this.aClass102_Sub3_38.method6339(arg1);
	}

	@OriginalMember(owner = "client!aqp", name = "ao", descriptor = "(I)V")
	@Override
	void method21634(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgram(0);
		this.aClass102_Sub3_38.method6386(0);
		this.aClass102_Sub3_38.method6339(null);
	}

	@OriginalMember(owner = "client!aqp", name = "aj", descriptor = "()Lclient!dy;")
	@Override
	Class236 method21650() {
		return Class236.aClass236_21;
	}

	@OriginalMember(owner = "client!aqp", name = "ac", descriptor = "()Lclient!dy;")
	@Override
	Class236 method21652() {
		return Class236.aClass236_21;
	}

	@OriginalMember(owner = "client!aqp", name = "ag", descriptor = "()Lclient!dy;")
	@Override
	Class236 method21651() {
		return Class236.aClass236_21;
	}

	@OriginalMember(owner = "client!aqp", name = "af", descriptor = "()Z")
	@Override
	boolean method21656() {
		return aFloat193 == 1.0F && aFloat192 == 0.0F && aFloat196 == 1.0F && aFloat194 == 0.0F && aFloat195 == 1.0F;
	}

	@OriginalMember(owner = "client!aqp", name = "am", descriptor = "()Z")
	@Override
	boolean method21657() {
		return aFloat193 == 1.0F && aFloat192 == 0.0F && aFloat196 == 1.0F && aFloat194 == 0.0F && aFloat195 == 1.0F;
	}

	@OriginalMember(owner = "client!aqp", name = "ak", descriptor = "()Z")
	@Override
	boolean method21658() {
		return aFloat193 == 1.0F && aFloat192 == 0.0F && aFloat196 == 1.0F && aFloat194 == 0.0F && aFloat195 == 1.0F;
	}

	@OriginalMember(owner = "client!aqp", name = "at", descriptor = "()Z")
	@Override
	boolean method21659() {
		return aFloat193 == 1.0F && aFloat192 == 0.0F && aFloat196 == 1.0F && aFloat194 == 0.0F && aFloat195 == 1.0F;
	}

	@OriginalMember(owner = "client!aqp", name = "ah", descriptor = "()Z")
	@Override
	boolean method21655() {
		return aFloat193 == 1.0F && aFloat192 == 0.0F && aFloat196 == 1.0F && aFloat194 == 0.0F && aFloat195 == 1.0F;
	}

	@OriginalMember(owner = "client!aqp", name = "ad", descriptor = "()I")
	@Override
	int method21635() {
		return 1;
	}
}
