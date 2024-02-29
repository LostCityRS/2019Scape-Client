package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqo")
public class Class93_Sub4_Sub3 extends Class93_Sub4 {

	@OriginalMember(owner = "client!aqo", name = "d", descriptor = "Ljava/lang/String;")
	static final String aString86 = "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n";

	@OriginalMember(owner = "client!aqo", name = "w", descriptor = "F")
	static float aFloat193 = 1.0F;

	@OriginalMember(owner = "client!aqo", name = "l", descriptor = "F")
	static float aFloat196 = 0.0F;

	@OriginalMember(owner = "client!aqo", name = "u", descriptor = "F")
	static float aFloat194 = 1.0F;

	@OriginalMember(owner = "client!aqo", name = "z", descriptor = "F")
	static float aFloat192 = 0.0F;

	@OriginalMember(owner = "client!aqo", name = "p", descriptor = "F")
	static float aFloat195 = 1.0F;

	@OriginalMember(owner = "client!aqo", name = "c", descriptor = "Lclient!bn;")
	Class191 aClass191_7;

	@OriginalMember(owner = "client!aqo", name = "<init>", descriptor = "(Lclient!afa;)V", line = 18)
	Class93_Sub4_Sub3(@OriginalArg(0) Class104_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aqo", name = "ao", descriptor = "()Z", line = 22)
	boolean method20200() {
		return this.aClass104_Sub1_38.aBoolean103;
	}

	@OriginalMember(owner = "client!aqo", name = "ay", descriptor = "()Z", line = 22)
	boolean method20201() {
		return this.aClass104_Sub1_38.aBoolean103;
	}

	@OriginalMember(owner = "client!aqo", name = "aj", descriptor = "()Z", line = 22)
	boolean method20202() {
		return this.aClass104_Sub1_38.aBoolean103;
	}

	@OriginalMember(owner = "client!aqo", name = "r", descriptor = "()Z", line = 26)
	@Override
	boolean method20182() {
		return this.aClass191_7 != null;
	}

	@OriginalMember(owner = "client!aqo", name = "v", descriptor = "()Z", line = 26)
	@Override
	boolean method20173() {
		return this.aClass191_7 != null;
	}

	@OriginalMember(owner = "client!aqo", name = "e", descriptor = "()Z", line = 26)
	@Override
	boolean method20179() {
		return this.aClass191_7 != null;
	}

	@OriginalMember(owner = "client!aqo", name = "x", descriptor = "()Z", line = 30)
	@Override
	boolean method20185() {
		if (this.aClass104_Sub1_38.aBoolean103) {
			this.aClass191_7 = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") });
			return this.aClass191_7 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aqo", name = "h", descriptor = "()Z", line = 30)
	@Override
	boolean method20176() {
		if (this.aClass104_Sub1_38.aBoolean103) {
			this.aClass191_7 = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") });
			return this.aClass191_7 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aqo", name = "n", descriptor = "()Z", line = 30)
	@Override
	boolean method20174() {
		if (this.aClass104_Sub1_38.aBoolean103) {
			this.aClass191_7 = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") });
			return this.aClass191_7 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aqo", name = "y", descriptor = "()Z", line = 30)
	@Override
	boolean method20184() {
		if (this.aClass104_Sub1_38.aBoolean103) {
			this.aClass191_7 = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") });
			return this.aClass191_7 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aqo", name = "k", descriptor = "(II)V", line = 37)
	@Override
	void method20180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aqo", name = "t", descriptor = "(II)V", line = 37)
	@Override
	void method20194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aqo", name = "j", descriptor = "(II)V", line = 37)
	@Override
	void method20189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aqo", name = "ae", descriptor = "(II)V", line = 37)
	@Override
	void method20191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aqo", name = "m", descriptor = "()V", line = 40)
	@Override
	void method20199() {
		this.aClass191_7 = null;
	}

	@OriginalMember(owner = "client!aqo", name = "g", descriptor = "()V", line = 40)
	@Override
	void method20175() {
		this.aClass191_7 = null;
	}

	@OriginalMember(owner = "client!aqo", name = "a", descriptor = "()V", line = 40)
	@Override
	void method20181() {
		this.aClass191_7 = null;
	}

	@OriginalMember(owner = "client!aqo", name = "i", descriptor = "()V", line = 40)
	@Override
	void method20172() {
		this.aClass191_7 = null;
	}

	@OriginalMember(owner = "client!aqo", name = "f", descriptor = "(ILclient!adt;Lclient!adt;II)V", line = 44)
	@Override
	void method20177(@OriginalArg(0) int arg0, @OriginalArg(1) Class88_Sub2 arg1, @OriginalArg(2) Class88_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = this.aClass191_7.anInt3349;
		OpenGL.glUseProgram(local3);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local3, "sceneTex"), 0);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local3, "paramsGamma"), aFloat193);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local3, "paramsRanges"), aFloat196, aFloat194, aFloat192, aFloat195);
		this.aClass104_Sub1_38.method3882(0);
		this.aClass104_Sub1_38.method3887(arg1);
	}

	@OriginalMember(owner = "client!aqo", name = "ax", descriptor = "(ILclient!adt;Lclient!adt;II)V", line = 44)
	@Override
	void method20190(@OriginalArg(0) int arg0, @OriginalArg(1) Class88_Sub2 arg1, @OriginalArg(2) Class88_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = this.aClass191_7.anInt3349;
		OpenGL.glUseProgram(local3);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local3, "sceneTex"), 0);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local3, "paramsGamma"), aFloat193);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local3, "paramsRanges"), aFloat196, aFloat194, aFloat192, aFloat195);
		this.aClass104_Sub1_38.method3882(0);
		this.aClass104_Sub1_38.method3887(arg1);
	}

	@OriginalMember(owner = "client!aqo", name = "ap", descriptor = "(ILclient!adt;Lclient!adt;II)V", line = 44)
	@Override
	void method20197(@OriginalArg(0) int arg0, @OriginalArg(1) Class88_Sub2 arg1, @OriginalArg(2) Class88_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = this.aClass191_7.anInt3349;
		OpenGL.glUseProgram(local3);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local3, "sceneTex"), 0);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local3, "paramsGamma"), aFloat193);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local3, "paramsRanges"), aFloat196, aFloat194, aFloat192, aFloat195);
		this.aClass104_Sub1_38.method3882(0);
		this.aClass104_Sub1_38.method3887(arg1);
	}

	@OriginalMember(owner = "client!aqo", name = "aq", descriptor = "(ILclient!adt;Lclient!adt;II)V", line = 44)
	@Override
	void method20198(@OriginalArg(0) int arg0, @OriginalArg(1) Class88_Sub2 arg1, @OriginalArg(2) Class88_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = this.aClass191_7.anInt3349;
		OpenGL.glUseProgram(local3);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local3, "sceneTex"), 0);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local3, "paramsGamma"), aFloat193);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local3, "paramsRanges"), aFloat196, aFloat194, aFloat192, aFloat195);
		this.aClass104_Sub1_38.method3882(0);
		this.aClass104_Sub1_38.method3887(arg1);
	}

	@OriginalMember(owner = "client!aqo", name = "av", descriptor = "(ILclient!adt;Lclient!adt;II)V", line = 44)
	@Override
	void method20186(@OriginalArg(0) int arg0, @OriginalArg(1) Class88_Sub2 arg1, @OriginalArg(2) Class88_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = this.aClass191_7.anInt3349;
		OpenGL.glUseProgram(local3);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local3, "sceneTex"), 0);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local3, "paramsGamma"), aFloat193);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local3, "paramsRanges"), aFloat196, aFloat194, aFloat192, aFloat195);
		this.aClass104_Sub1_38.method3882(0);
		this.aClass104_Sub1_38.method3887(arg1);
	}

	@OriginalMember(owner = "client!aqo", name = "w", descriptor = "(I)V", line = 54)
	@Override
	void method20178(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgram(0);
		this.aClass104_Sub1_38.method3882(0);
		this.aClass104_Sub1_38.method3887(null);
	}

	@OriginalMember(owner = "client!aqo", name = "ag", descriptor = "(I)V", line = 54)
	@Override
	void method20192(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgram(0);
		this.aClass104_Sub1_38.method3882(0);
		this.aClass104_Sub1_38.method3887(null);
	}

	@OriginalMember(owner = "client!aqo", name = "p", descriptor = "()Lclient!dg;", line = 60)
	@Override
	Class226 method20166() {
		return Class226.aClass226_22;
	}

	@OriginalMember(owner = "client!aqo", name = "aw", descriptor = "()Lclient!dg;", line = 60)
	@Override
	Class226 method20167() {
		return Class226.aClass226_22;
	}

	@OriginalMember(owner = "client!aqo", name = "as", descriptor = "()Lclient!dg;", line = 60)
	@Override
	Class226 method20168() {
		return Class226.aClass226_22;
	}

	@OriginalMember(owner = "client!aqo", name = "al", descriptor = "()I", line = 64)
	@Override
	int method20193() {
		return 1;
	}

	@OriginalMember(owner = "client!aqo", name = "u", descriptor = "()I", line = 64)
	@Override
	int method20183() {
		return 1;
	}

	@OriginalMember(owner = "client!aqo", name = "am", descriptor = "()Z", line = 68)
	@Override
	boolean method20195() {
		return aFloat193 == 1.0F && aFloat196 == 0.0F && aFloat194 == 1.0F && aFloat192 == 0.0F && aFloat195 == 1.0F;
	}

	@OriginalMember(owner = "client!aqo", name = "c", descriptor = "()Z", line = 68)
	@Override
	boolean method20187() {
		return aFloat193 == 1.0F && aFloat196 == 0.0F && aFloat194 == 1.0F && aFloat192 == 0.0F && aFloat195 == 1.0F;
	}

	@OriginalMember(owner = "client!aqo", name = "au", descriptor = "()Z", line = 68)
	@Override
	boolean method20188() {
		return aFloat193 == 1.0F && aFloat196 == 0.0F && aFloat194 == 1.0F && aFloat192 == 0.0F && aFloat195 == 1.0F;
	}

	@OriginalMember(owner = "client!aqo", name = "ar", descriptor = "()Z", line = 68)
	@Override
	boolean method20196() {
		return aFloat193 == 1.0F && aFloat196 == 0.0F && aFloat194 == 1.0F && aFloat192 == 0.0F && aFloat195 == 1.0F;
	}
}
