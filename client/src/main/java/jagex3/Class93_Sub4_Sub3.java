package jagex3;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqo")
public final class Class93_Sub4_Sub3 extends Class93_Sub4 {

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

	@OriginalMember(owner = "client!aqo", name = "<init>", descriptor = "(Lclient!afa;)V")
	Class93_Sub4_Sub3(@OriginalArg(0) Class104_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aqo", name = "am", descriptor = "()Z")
	@Override
	boolean method20205() {
		return aFloat193 == 1.0F && aFloat196 == 0.0F && aFloat194 == 1.0F && aFloat192 == 0.0F && aFloat195 == 1.0F;
	}

	@OriginalMember(owner = "client!aqo", name = "ao", descriptor = "()Z")
	boolean method20212() {
		return this.aClass104_Sub1_38.aBoolean103;
	}

	@OriginalMember(owner = "client!aqo", name = "m", descriptor = "()V")
	@Override
	void method20211() {
		this.aClass191_7 = null;
	}

	@OriginalMember(owner = "client!aqo", name = "k", descriptor = "(II)V")
	@Override
	void method20181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aqo", name = "t", descriptor = "(II)V")
	@Override
	void method20204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aqo", name = "r", descriptor = "()Z")
	@Override
	boolean method20186() {
		return this.aClass191_7 != null;
	}

	@OriginalMember(owner = "client!aqo", name = "f", descriptor = "(ILclient!adt;Lclient!adt;II)V")
	@Override
	void method20178(@OriginalArg(0) int arg0, @OriginalArg(1) Class88_Sub2 arg1, @OriginalArg(2) Class88_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = this.aClass191_7.anInt3349;
		OpenGL.glUseProgram(local3);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local3, "sceneTex"), 0);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local3, "paramsGamma"), aFloat193);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local3, "paramsRanges"), aFloat196, aFloat194, aFloat192, aFloat195);
		this.aClass104_Sub1_38.method3803(0);
		this.aClass104_Sub1_38.method3804(arg1);
	}

	@OriginalMember(owner = "client!aqo", name = "w", descriptor = "(I)V")
	@Override
	void method20179(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgram(0);
		this.aClass104_Sub1_38.method3803(0);
		this.aClass104_Sub1_38.method3804(null);
	}

	@OriginalMember(owner = "client!aqo", name = "p", descriptor = "()Lclient!dg;")
	@Override
	Class226 method20183() {
		return Class226.aClass226_22;
	}

	@OriginalMember(owner = "client!aqo", name = "ay", descriptor = "()Z")
	boolean method20213() {
		return this.aClass104_Sub1_38.aBoolean103;
	}

	@OriginalMember(owner = "client!aqo", name = "c", descriptor = "()Z")
	@Override
	boolean method20192() {
		return aFloat193 == 1.0F && aFloat196 == 0.0F && aFloat194 == 1.0F && aFloat192 == 0.0F && aFloat195 == 1.0F;
	}

	@OriginalMember(owner = "client!aqo", name = "ax", descriptor = "(ILclient!adt;Lclient!adt;II)V")
	@Override
	void method20195(@OriginalArg(0) int arg0, @OriginalArg(1) Class88_Sub2 arg1, @OriginalArg(2) Class88_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = this.aClass191_7.anInt3349;
		OpenGL.glUseProgram(local3);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local3, "sceneTex"), 0);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local3, "paramsGamma"), aFloat193);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local3, "paramsRanges"), aFloat196, aFloat194, aFloat192, aFloat195);
		this.aClass104_Sub1_38.method3803(0);
		this.aClass104_Sub1_38.method3804(arg1);
	}

	@OriginalMember(owner = "client!aqo", name = "v", descriptor = "()Z")
	@Override
	boolean method20174() {
		return this.aClass191_7 != null;
	}

	@OriginalMember(owner = "client!aqo", name = "x", descriptor = "()Z")
	@Override
	boolean method20189() {
		if (this.aClass104_Sub1_38.aBoolean103) {
			this.aClass191_7 = Class191.method24602(this.aClass104_Sub1_38, new Class190[] { Class190.method24597(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") });
			return this.aClass191_7 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aqo", name = "h", descriptor = "()Z")
	@Override
	boolean method20177() {
		if (this.aClass104_Sub1_38.aBoolean103) {
			this.aClass191_7 = Class191.method24602(this.aClass104_Sub1_38, new Class190[] { Class190.method24597(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") });
			return this.aClass191_7 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aqo", name = "ag", descriptor = "(I)V")
	@Override
	void method20197(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgram(0);
		this.aClass104_Sub1_38.method3803(0);
		this.aClass104_Sub1_38.method3804(null);
	}

	@OriginalMember(owner = "client!aqo", name = "g", descriptor = "()V")
	@Override
	void method20176() {
		this.aClass191_7 = null;
	}

	@OriginalMember(owner = "client!aqo", name = "n", descriptor = "()Z")
	@Override
	boolean method20175() {
		if (this.aClass104_Sub1_38.aBoolean103) {
			this.aClass191_7 = Class191.method24602(this.aClass104_Sub1_38, new Class190[] { Class190.method24597(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") });
			return this.aClass191_7 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aqo", name = "j", descriptor = "(II)V")
	@Override
	void method20194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aqo", name = "aw", descriptor = "()Lclient!dg;")
	@Override
	Class226 method20201() {
		return Class226.aClass226_22;
	}

	@OriginalMember(owner = "client!aqo", name = "ae", descriptor = "(II)V")
	@Override
	void method20196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!aqo", name = "e", descriptor = "()Z")
	@Override
	boolean method20180() {
		return this.aClass191_7 != null;
	}

	@OriginalMember(owner = "client!aqo", name = "al", descriptor = "()I")
	@Override
	int method20199() {
		return 1;
	}

	@OriginalMember(owner = "client!aqo", name = "y", descriptor = "()Z")
	@Override
	boolean method20188() {
		if (this.aClass104_Sub1_38.aBoolean103) {
			this.aClass191_7 = Class191.method24602(this.aClass104_Sub1_38, new Class190[] { Class190.method24597(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") });
			return this.aClass191_7 != null;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aqo", name = "as", descriptor = "()Lclient!dg;")
	@Override
	Class226 method20202() {
		return Class226.aClass226_22;
	}

	@OriginalMember(owner = "client!aqo", name = "a", descriptor = "()V")
	@Override
	void method20185() {
		this.aClass191_7 = null;
	}

	@OriginalMember(owner = "client!aqo", name = "au", descriptor = "()Z")
	@Override
	boolean method20193() {
		return aFloat193 == 1.0F && aFloat196 == 0.0F && aFloat194 == 1.0F && aFloat192 == 0.0F && aFloat195 == 1.0F;
	}

	@OriginalMember(owner = "client!aqo", name = "ar", descriptor = "()Z")
	@Override
	boolean method20207() {
		return aFloat193 == 1.0F && aFloat196 == 0.0F && aFloat194 == 1.0F && aFloat192 == 0.0F && aFloat195 == 1.0F;
	}

	@OriginalMember(owner = "client!aqo", name = "aj", descriptor = "()Z")
	boolean method20214() {
		return this.aClass104_Sub1_38.aBoolean103;
	}

	@OriginalMember(owner = "client!aqo", name = "i", descriptor = "()V")
	@Override
	void method20173() {
		this.aClass191_7 = null;
	}

	@OriginalMember(owner = "client!aqo", name = "ap", descriptor = "(ILclient!adt;Lclient!adt;II)V")
	@Override
	void method20208(@OriginalArg(0) int arg0, @OriginalArg(1) Class88_Sub2 arg1, @OriginalArg(2) Class88_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = this.aClass191_7.anInt3349;
		OpenGL.glUseProgram(local3);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local3, "sceneTex"), 0);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local3, "paramsGamma"), aFloat193);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local3, "paramsRanges"), aFloat196, aFloat194, aFloat192, aFloat195);
		this.aClass104_Sub1_38.method3803(0);
		this.aClass104_Sub1_38.method3804(arg1);
	}

	@OriginalMember(owner = "client!aqo", name = "aq", descriptor = "(ILclient!adt;Lclient!adt;II)V")
	@Override
	void method20209(@OriginalArg(0) int arg0, @OriginalArg(1) Class88_Sub2 arg1, @OriginalArg(2) Class88_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = this.aClass191_7.anInt3349;
		OpenGL.glUseProgram(local3);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local3, "sceneTex"), 0);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local3, "paramsGamma"), aFloat193);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local3, "paramsRanges"), aFloat196, aFloat194, aFloat192, aFloat195);
		this.aClass104_Sub1_38.method3803(0);
		this.aClass104_Sub1_38.method3804(arg1);
	}

	@OriginalMember(owner = "client!aqo", name = "u", descriptor = "()I")
	@Override
	int method20187() {
		return 1;
	}

	@OriginalMember(owner = "client!aqo", name = "av", descriptor = "(ILclient!adt;Lclient!adt;II)V")
	@Override
	void method20190(@OriginalArg(0) int arg0, @OriginalArg(1) Class88_Sub2 arg1, @OriginalArg(2) Class88_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = this.aClass191_7.anInt3349;
		OpenGL.glUseProgram(local3);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local3, "sceneTex"), 0);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(local3, "paramsGamma"), aFloat193);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(local3, "paramsRanges"), aFloat196, aFloat194, aFloat192, aFloat195);
		this.aClass104_Sub1_38.method3803(0);
		this.aClass104_Sub1_38.method3804(arg1);
	}
}
