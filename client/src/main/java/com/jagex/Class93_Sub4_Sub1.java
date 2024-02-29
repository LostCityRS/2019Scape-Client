package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqf")
public class Class93_Sub4_Sub1 extends Class93_Sub4 {

	@OriginalMember(owner = "client!aqf", name = "c", descriptor = "Ljava/lang/String;")
	static final String aString67 = "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n";

	@OriginalMember(owner = "client!aqf", name = "p", descriptor = "Ljava/lang/String;")
	static final String aString68 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";

	@OriginalMember(owner = "client!aqf", name = "d", descriptor = "Ljava/lang/String;")
	static final String aString69 = "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";

	@OriginalMember(owner = "client!aqf", name = "w", descriptor = "I")
	static final int anInt2752 = 256;

	@OriginalMember(owner = "client!aqf", name = "r", descriptor = "Ljava/lang/String;")
	static final String aString70 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n";

	@OriginalMember(owner = "client!aqf", name = "l", descriptor = "F")
	static float aFloat188 = 0.25F;

	@OriginalMember(owner = "client!aqf", name = "u", descriptor = "F")
	static float aFloat186 = 1.0F;

	@OriginalMember(owner = "client!aqf", name = "z", descriptor = "F")
	static float aFloat187 = 1.0F;

	@OriginalMember(owner = "client!aqf", name = "x", descriptor = "I")
	int anInt2751;

	@OriginalMember(owner = "client!aqf", name = "j", descriptor = "Lclient!bn;")
	Class191 aClass191_3;

	@OriginalMember(owner = "client!aqf", name = "q", descriptor = "[Lclient!adt;")
	Class88_Sub2[] aClass88_Sub2Array1;

	@OriginalMember(owner = "client!aqf", name = "v", descriptor = "Lclient!app;")
	Class112_Sub1_Sub2 aClass112_Sub1_Sub2_2;

	@OriginalMember(owner = "client!aqf", name = "o", descriptor = "Lclient!app;")
	Class112_Sub1_Sub2 aClass112_Sub1_Sub2_3;

	@OriginalMember(owner = "client!aqf", name = "s", descriptor = "Lclient!adt;")
	Class88_Sub2 aClass88_Sub2_3;

	@OriginalMember(owner = "client!aqf", name = "y", descriptor = "Lclient!adt;")
	Class88_Sub2 aClass88_Sub2_4;

	@OriginalMember(owner = "client!aqf", name = "b", descriptor = "I")
	int anInt2753;

	@OriginalMember(owner = "client!aqf", name = "h", descriptor = "I")
	int anInt2754;

	@OriginalMember(owner = "client!aqf", name = "a", descriptor = "I")
	int anInt2755;

	@OriginalMember(owner = "client!aqf", name = "g", descriptor = "Lclient!bn;")
	Class191 aClass191_4;

	@OriginalMember(owner = "client!aqf", name = "i", descriptor = "Lclient!bn;")
	Class191 aClass191_5;

	@OriginalMember(owner = "client!aqf", name = "t", descriptor = "Lclient!bn;")
	Class191 aClass191_6;

	@OriginalMember(owner = "client!aqf", name = "<init>", descriptor = "(Lclient!afa;)V", line = 33)
	Class93_Sub4_Sub1(@OriginalArg(0) Class104_Sub1 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aqf", name = "ao", descriptor = "()Z", line = 37)
	boolean method19696() {
		return this.aClass104_Sub1_38.aBoolean90 && this.aClass104_Sub1_38.aBoolean103 && this.aClass104_Sub1_38.aBoolean98;
	}

	@OriginalMember(owner = "client!aqf", name = "aj", descriptor = "()Z", line = 37)
	boolean method19697() {
		return this.aClass104_Sub1_38.aBoolean90 && this.aClass104_Sub1_38.aBoolean103 && this.aClass104_Sub1_38.aBoolean98;
	}

	@OriginalMember(owner = "client!aqf", name = "e", descriptor = "()Z", line = 41)
	@Override
	boolean method20179() {
		return this.aClass112_Sub1_Sub2_2 != null;
	}

	@OriginalMember(owner = "client!aqf", name = "r", descriptor = "()Z", line = 41)
	@Override
	boolean method20182() {
		return this.aClass112_Sub1_Sub2_2 != null;
	}

	@OriginalMember(owner = "client!aqf", name = "v", descriptor = "()Z", line = 41)
	@Override
	boolean method20173() {
		return this.aClass112_Sub1_Sub2_2 != null;
	}

	@OriginalMember(owner = "client!aqf", name = "n", descriptor = "()Z", line = 45)
	@Override
	boolean method20174() {
		if (!this.aClass104_Sub1_38.aBoolean90 || !this.aClass104_Sub1_38.aBoolean103 || !this.aClass104_Sub1_38.aBoolean98) {
			return false;
		}
		this.aClass112_Sub1_Sub2_2 = new Class112_Sub1_Sub2(this.aClass104_Sub1_38);
		this.aClass88_Sub2_3 = new Class88_Sub2(this.aClass104_Sub1_38, 3553, Class206.aClass206_22, this.method20166(), 256, 256);
		this.aClass88_Sub2_3.method18079(false, false);
		this.aClass88_Sub2_4 = new Class88_Sub2(this.aClass104_Sub1_38, 3553, Class206.aClass206_22, this.method20166(), 256, 256);
		this.aClass88_Sub2_4.method18079(false, false);
		this.aClass104_Sub1_38.method20453(this.aClass112_Sub1_Sub2_2, (byte) 1);
		this.aClass112_Sub1_Sub2_2.method23435(0, this.aClass88_Sub2_3.method18097(0));
		this.aClass112_Sub1_Sub2_2.method23435(1, this.aClass88_Sub2_4.method18097(0));
		this.aClass112_Sub1_Sub2_2.method18014(0);
		if (!this.aClass112_Sub1_Sub2_2.method23442()) {
			this.aClass104_Sub1_38.method20456(this.aClass112_Sub1_Sub2_2, -1497248091);
			return false;
		}
		this.aClass104_Sub1_38.method20456(this.aClass112_Sub1_Sub2_2, -1497248091);
		this.aClass191_6 = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass191_3 = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass191_5 = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") });
		this.aClass191_4 = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass191_3 != null && this.aClass191_6 != null && this.aClass191_5 != null && this.aClass191_4 != null;
	}

	@OriginalMember(owner = "client!aqf", name = "h", descriptor = "()Z", line = 45)
	@Override
	boolean method20176() {
		if (!this.aClass104_Sub1_38.aBoolean90 || !this.aClass104_Sub1_38.aBoolean103 || !this.aClass104_Sub1_38.aBoolean98) {
			return false;
		}
		this.aClass112_Sub1_Sub2_2 = new Class112_Sub1_Sub2(this.aClass104_Sub1_38);
		this.aClass88_Sub2_3 = new Class88_Sub2(this.aClass104_Sub1_38, 3553, Class206.aClass206_22, this.method20166(), 256, 256);
		this.aClass88_Sub2_3.method18079(false, false);
		this.aClass88_Sub2_4 = new Class88_Sub2(this.aClass104_Sub1_38, 3553, Class206.aClass206_22, this.method20166(), 256, 256);
		this.aClass88_Sub2_4.method18079(false, false);
		this.aClass104_Sub1_38.method20453(this.aClass112_Sub1_Sub2_2, (byte) 1);
		this.aClass112_Sub1_Sub2_2.method23435(0, this.aClass88_Sub2_3.method18097(0));
		this.aClass112_Sub1_Sub2_2.method23435(1, this.aClass88_Sub2_4.method18097(0));
		this.aClass112_Sub1_Sub2_2.method18014(0);
		if (!this.aClass112_Sub1_Sub2_2.method23442()) {
			this.aClass104_Sub1_38.method20456(this.aClass112_Sub1_Sub2_2, -1497248091);
			return false;
		}
		this.aClass104_Sub1_38.method20456(this.aClass112_Sub1_Sub2_2, -1497248091);
		this.aClass191_6 = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass191_3 = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass191_5 = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") });
		this.aClass191_4 = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass191_3 != null && this.aClass191_6 != null && this.aClass191_5 != null && this.aClass191_4 != null;
	}

	@OriginalMember(owner = "client!aqf", name = "y", descriptor = "()Z", line = 45)
	@Override
	boolean method20184() {
		if (!this.aClass104_Sub1_38.aBoolean90 || !this.aClass104_Sub1_38.aBoolean103 || !this.aClass104_Sub1_38.aBoolean98) {
			return false;
		}
		this.aClass112_Sub1_Sub2_2 = new Class112_Sub1_Sub2(this.aClass104_Sub1_38);
		this.aClass88_Sub2_3 = new Class88_Sub2(this.aClass104_Sub1_38, 3553, Class206.aClass206_22, this.method20166(), 256, 256);
		this.aClass88_Sub2_3.method18079(false, false);
		this.aClass88_Sub2_4 = new Class88_Sub2(this.aClass104_Sub1_38, 3553, Class206.aClass206_22, this.method20166(), 256, 256);
		this.aClass88_Sub2_4.method18079(false, false);
		this.aClass104_Sub1_38.method20453(this.aClass112_Sub1_Sub2_2, (byte) 1);
		this.aClass112_Sub1_Sub2_2.method23435(0, this.aClass88_Sub2_3.method18097(0));
		this.aClass112_Sub1_Sub2_2.method23435(1, this.aClass88_Sub2_4.method18097(0));
		this.aClass112_Sub1_Sub2_2.method18014(0);
		if (!this.aClass112_Sub1_Sub2_2.method23442()) {
			this.aClass104_Sub1_38.method20456(this.aClass112_Sub1_Sub2_2, -1497248091);
			return false;
		}
		this.aClass104_Sub1_38.method20456(this.aClass112_Sub1_Sub2_2, -1497248091);
		this.aClass191_6 = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass191_3 = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass191_5 = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") });
		this.aClass191_4 = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass191_3 != null && this.aClass191_6 != null && this.aClass191_5 != null && this.aClass191_4 != null;
	}

	@OriginalMember(owner = "client!aqf", name = "x", descriptor = "()Z", line = 45)
	@Override
	boolean method20185() {
		if (!this.aClass104_Sub1_38.aBoolean90 || !this.aClass104_Sub1_38.aBoolean103 || !this.aClass104_Sub1_38.aBoolean98) {
			return false;
		}
		this.aClass112_Sub1_Sub2_2 = new Class112_Sub1_Sub2(this.aClass104_Sub1_38);
		this.aClass88_Sub2_3 = new Class88_Sub2(this.aClass104_Sub1_38, 3553, Class206.aClass206_22, this.method20166(), 256, 256);
		this.aClass88_Sub2_3.method18079(false, false);
		this.aClass88_Sub2_4 = new Class88_Sub2(this.aClass104_Sub1_38, 3553, Class206.aClass206_22, this.method20166(), 256, 256);
		this.aClass88_Sub2_4.method18079(false, false);
		this.aClass104_Sub1_38.method20453(this.aClass112_Sub1_Sub2_2, (byte) 1);
		this.aClass112_Sub1_Sub2_2.method23435(0, this.aClass88_Sub2_3.method18097(0));
		this.aClass112_Sub1_Sub2_2.method23435(1, this.aClass88_Sub2_4.method18097(0));
		this.aClass112_Sub1_Sub2_2.method18014(0);
		if (!this.aClass112_Sub1_Sub2_2.method23442()) {
			this.aClass104_Sub1_38.method20456(this.aClass112_Sub1_Sub2_2, -1497248091);
			return false;
		}
		this.aClass104_Sub1_38.method20456(this.aClass112_Sub1_Sub2_2, -1497248091);
		this.aClass191_6 = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass191_3 = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass191_5 = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") });
		this.aClass191_4 = Class191.method24589(this.aClass104_Sub1_38, new Class190[] { Class190.method24585(this.aClass104_Sub1_38, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass191_3 != null && this.aClass191_6 != null && this.aClass191_5 != null && this.aClass191_4 != null;
	}

	@OriginalMember(owner = "client!aqf", name = "j", descriptor = "(II)V", line = 70)
	@Override
	void method20189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2751 = arg0;
		this.anInt2753 = arg1;
		@Pc(10) int local10 = Class278.method26363(this.anInt2751, 423254006);
		@Pc(15) int local15 = Class278.method26363(this.anInt2753, 423254006);
		if (this.anInt2754 == local10 && this.anInt2755 == local15) {
			return;
		}
		@Pc(28) int local28;
		if (this.aClass88_Sub2Array1 != null) {
			for (local28 = 0; local28 < this.aClass88_Sub2Array1.length; local28++) {
				this.aClass88_Sub2Array1[local28].method18052();
			}
			this.aClass88_Sub2Array1 = null;
		}
		if (local10 <= 256 && local15 <= 256) {
			this.aClass112_Sub1_Sub2_3 = null;
		} else {
			local28 = local10;
			@Pc(53) int local53 = local15;
			@Pc(55) int local55 = 0;
			label59: while (true) {
				if (local28 <= 256 && local53 <= 256) {
					if (this.aClass112_Sub1_Sub2_3 == null) {
						this.aClass112_Sub1_Sub2_3 = new Class112_Sub1_Sub2(this.aClass104_Sub1_38);
					}
					this.aClass88_Sub2Array1 = new Class88_Sub2[local55];
					local28 = local10;
					local53 = local15;
					local55 = 0;
					while (true) {
						if (local28 <= 256 && local53 <= 256) {
							break label59;
						}
						this.aClass88_Sub2Array1[local55++] = new Class88_Sub2(this.aClass104_Sub1_38, 3553, Class206.aClass206_22, this.method20166(), local28, local53);
						if (local28 > 256) {
							local28 >>= 0x1;
						}
						if (local53 > 256) {
							local53 >>= 0x1;
						}
					}
				}
				if (local28 > 256) {
					local28 >>= 0x1;
				}
				if (local53 > 256) {
					local53 >>= 0x1;
				}
				local55++;
			}
		}
		this.anInt2754 = local10;
		this.anInt2755 = local15;
	}

	@OriginalMember(owner = "client!aqf", name = "t", descriptor = "(II)V", line = 70)
	@Override
	void method20194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2751 = arg0;
		this.anInt2753 = arg1;
		@Pc(10) int local10 = Class278.method26363(this.anInt2751, 423254006);
		@Pc(15) int local15 = Class278.method26363(this.anInt2753, 423254006);
		if (this.anInt2754 == local10 && this.anInt2755 == local15) {
			return;
		}
		@Pc(28) int local28;
		if (this.aClass88_Sub2Array1 != null) {
			for (local28 = 0; local28 < this.aClass88_Sub2Array1.length; local28++) {
				this.aClass88_Sub2Array1[local28].method18052();
			}
			this.aClass88_Sub2Array1 = null;
		}
		if (local10 <= 256 && local15 <= 256) {
			this.aClass112_Sub1_Sub2_3 = null;
		} else {
			local28 = local10;
			@Pc(53) int local53 = local15;
			@Pc(55) int local55 = 0;
			label59: while (true) {
				if (local28 <= 256 && local53 <= 256) {
					if (this.aClass112_Sub1_Sub2_3 == null) {
						this.aClass112_Sub1_Sub2_3 = new Class112_Sub1_Sub2(this.aClass104_Sub1_38);
					}
					this.aClass88_Sub2Array1 = new Class88_Sub2[local55];
					local28 = local10;
					local53 = local15;
					local55 = 0;
					while (true) {
						if (local28 <= 256 && local53 <= 256) {
							break label59;
						}
						this.aClass88_Sub2Array1[local55++] = new Class88_Sub2(this.aClass104_Sub1_38, 3553, Class206.aClass206_22, this.method20166(), local28, local53);
						if (local28 > 256) {
							local28 >>= 0x1;
						}
						if (local53 > 256) {
							local53 >>= 0x1;
						}
					}
				}
				if (local28 > 256) {
					local28 >>= 0x1;
				}
				if (local53 > 256) {
					local53 >>= 0x1;
				}
				local55++;
			}
		}
		this.anInt2754 = local10;
		this.anInt2755 = local15;
	}

	@OriginalMember(owner = "client!aqf", name = "ae", descriptor = "(II)V", line = 70)
	@Override
	void method20191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2751 = arg0;
		this.anInt2753 = arg1;
		@Pc(10) int local10 = Class278.method26363(this.anInt2751, 423254006);
		@Pc(15) int local15 = Class278.method26363(this.anInt2753, 423254006);
		if (this.anInt2754 == local10 && this.anInt2755 == local15) {
			return;
		}
		@Pc(28) int local28;
		if (this.aClass88_Sub2Array1 != null) {
			for (local28 = 0; local28 < this.aClass88_Sub2Array1.length; local28++) {
				this.aClass88_Sub2Array1[local28].method18052();
			}
			this.aClass88_Sub2Array1 = null;
		}
		if (local10 <= 256 && local15 <= 256) {
			this.aClass112_Sub1_Sub2_3 = null;
		} else {
			local28 = local10;
			@Pc(53) int local53 = local15;
			@Pc(55) int local55 = 0;
			label59: while (true) {
				if (local28 <= 256 && local53 <= 256) {
					if (this.aClass112_Sub1_Sub2_3 == null) {
						this.aClass112_Sub1_Sub2_3 = new Class112_Sub1_Sub2(this.aClass104_Sub1_38);
					}
					this.aClass88_Sub2Array1 = new Class88_Sub2[local55];
					local28 = local10;
					local53 = local15;
					local55 = 0;
					while (true) {
						if (local28 <= 256 && local53 <= 256) {
							break label59;
						}
						this.aClass88_Sub2Array1[local55++] = new Class88_Sub2(this.aClass104_Sub1_38, 3553, Class206.aClass206_22, this.method20166(), local28, local53);
						if (local28 > 256) {
							local28 >>= 0x1;
						}
						if (local53 > 256) {
							local53 >>= 0x1;
						}
					}
				}
				if (local28 > 256) {
					local28 >>= 0x1;
				}
				if (local53 > 256) {
					local53 >>= 0x1;
				}
				local55++;
			}
		}
		this.anInt2754 = local10;
		this.anInt2755 = local15;
	}

	@OriginalMember(owner = "client!aqf", name = "k", descriptor = "(II)V", line = 70)
	@Override
	void method20180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2751 = arg0;
		this.anInt2753 = arg1;
		@Pc(10) int local10 = Class278.method26363(this.anInt2751, 423254006);
		@Pc(15) int local15 = Class278.method26363(this.anInt2753, 423254006);
		if (this.anInt2754 == local10 && this.anInt2755 == local15) {
			return;
		}
		@Pc(28) int local28;
		if (this.aClass88_Sub2Array1 != null) {
			for (local28 = 0; local28 < this.aClass88_Sub2Array1.length; local28++) {
				this.aClass88_Sub2Array1[local28].method18052();
			}
			this.aClass88_Sub2Array1 = null;
		}
		if (local10 <= 256 && local15 <= 256) {
			this.aClass112_Sub1_Sub2_3 = null;
		} else {
			local28 = local10;
			@Pc(53) int local53 = local15;
			@Pc(55) int local55 = 0;
			label59: while (true) {
				if (local28 <= 256 && local53 <= 256) {
					if (this.aClass112_Sub1_Sub2_3 == null) {
						this.aClass112_Sub1_Sub2_3 = new Class112_Sub1_Sub2(this.aClass104_Sub1_38);
					}
					this.aClass88_Sub2Array1 = new Class88_Sub2[local55];
					local28 = local10;
					local53 = local15;
					local55 = 0;
					while (true) {
						if (local28 <= 256 && local53 <= 256) {
							break label59;
						}
						this.aClass88_Sub2Array1[local55++] = new Class88_Sub2(this.aClass104_Sub1_38, 3553, Class206.aClass206_22, this.method20166(), local28, local53);
						if (local28 > 256) {
							local28 >>= 0x1;
						}
						if (local53 > 256) {
							local53 >>= 0x1;
						}
					}
				}
				if (local28 > 256) {
					local28 >>= 0x1;
				}
				if (local53 > 256) {
					local53 >>= 0x1;
				}
				local55++;
			}
		}
		this.anInt2754 = local10;
		this.anInt2755 = local15;
	}

	@OriginalMember(owner = "client!aqf", name = "m", descriptor = "()V", line = 106)
	@Override
	void method20199() {
		this.anInt2755 = -1;
		this.anInt2754 = -1;
		this.aClass112_Sub1_Sub2_3 = null;
		this.aClass88_Sub2Array1 = null;
		this.aClass112_Sub1_Sub2_2 = null;
		this.aClass88_Sub2_3 = null;
		this.aClass88_Sub2_4 = null;
		this.aClass191_6 = null;
		this.aClass191_3 = null;
		this.aClass191_5 = null;
		this.aClass191_4 = null;
	}

	@OriginalMember(owner = "client!aqf", name = "g", descriptor = "()V", line = 106)
	@Override
	void method20175() {
		this.anInt2755 = -1;
		this.anInt2754 = -1;
		this.aClass112_Sub1_Sub2_3 = null;
		this.aClass88_Sub2Array1 = null;
		this.aClass112_Sub1_Sub2_2 = null;
		this.aClass88_Sub2_3 = null;
		this.aClass88_Sub2_4 = null;
		this.aClass191_6 = null;
		this.aClass191_3 = null;
		this.aClass191_5 = null;
		this.aClass191_4 = null;
	}

	@OriginalMember(owner = "client!aqf", name = "a", descriptor = "()V", line = 106)
	@Override
	void method20181() {
		this.anInt2755 = -1;
		this.anInt2754 = -1;
		this.aClass112_Sub1_Sub2_3 = null;
		this.aClass88_Sub2Array1 = null;
		this.aClass112_Sub1_Sub2_2 = null;
		this.aClass88_Sub2_3 = null;
		this.aClass88_Sub2_4 = null;
		this.aClass191_6 = null;
		this.aClass191_3 = null;
		this.aClass191_5 = null;
		this.aClass191_4 = null;
	}

	@OriginalMember(owner = "client!aqf", name = "i", descriptor = "()V", line = 106)
	@Override
	void method20172() {
		this.anInt2755 = -1;
		this.anInt2754 = -1;
		this.aClass112_Sub1_Sub2_3 = null;
		this.aClass88_Sub2Array1 = null;
		this.aClass112_Sub1_Sub2_2 = null;
		this.aClass88_Sub2_3 = null;
		this.aClass88_Sub2_4 = null;
		this.aClass191_6 = null;
		this.aClass191_3 = null;
		this.aClass191_5 = null;
		this.aClass191_4 = null;
	}

	@OriginalMember(owner = "client!aqf", name = "f", descriptor = "(ILclient!adt;Lclient!adt;II)V", line = 120)
	@Override
	void method20177(@OriginalArg(0) int arg0, @OriginalArg(1) Class88_Sub2 arg1, @OriginalArg(2) Class88_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(26) int local26;
		@Pc(31) int local31;
		if (this.aClass88_Sub2Array1 == null) {
			this.aClass104_Sub1_38.method3887(arg1);
			this.aClass104_Sub1_38.method20453(this.aClass112_Sub1_Sub2_2, (byte) 1);
			this.aClass112_Sub1_Sub2_2.method18014(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local26 = this.aClass191_6.anInt3349;
			OpenGL.glUseProgram(local26);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local26, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local26, "params"), aFloat187, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt2751, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt2751, (float) this.anInt2753);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt2753);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			this.aClass104_Sub1_38.method20453(this.aClass112_Sub1_Sub2_3, (byte) 1);
			local26 = Class278.method26363(this.anInt2751, 423254006);
			local31 = Class278.method26363(this.anInt2753, 423254006);
			@Pc(33) int local33 = 0;
			while (local26 > 256 || local31 > 256) {
				OpenGL.glViewport(0, 0, local26, local31);
				this.aClass112_Sub1_Sub2_3.method23435(0, this.aClass88_Sub2Array1[local33].method18097(0));
				if (local33 == 0) {
					this.aClass104_Sub1_38.method3887(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) (this.anInt2753 - arg3));
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) arg4, (float) (this.anInt2753 - arg3));
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) arg4, (float) this.anInt2753);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt2753);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					this.aClass104_Sub1_38.method3887(this.aClass88_Sub2Array1[local33 - 1]);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(1.0F, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f(1.0F, 1.0F);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, 1.0F);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				}
				if (local26 > 256) {
					local26 >>= 0x1;
				}
				if (local31 > 256) {
					local31 >>= 0x1;
				}
				local33++;
			}
			this.aClass104_Sub1_38.method20456(this.aClass112_Sub1_Sub2_3, -1497248091);
			this.aClass104_Sub1_38.method3887(this.aClass88_Sub2Array1[local33 - 1]);
			this.aClass104_Sub1_38.method20453(this.aClass112_Sub1_Sub2_2, (byte) 1);
			this.aClass112_Sub1_Sub2_2.method18014(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(192) int local192 = this.aClass191_3.anInt3349;
			OpenGL.glUseProgram(local192);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local192, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local192, "params"), aFloat187, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f(1.0F, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f(1.0F, 1.0F);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, 1.0F);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		}
		this.aClass112_Sub1_Sub2_2.method18014(1);
		this.aClass104_Sub1_38.method3887(this.aClass88_Sub2_3);
		local26 = this.aClass191_4.anInt3349;
		OpenGL.glUseProgram(local26);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local26, "baseTex"), 0);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local26, "step"), 0.00390625F, 0.0F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		this.aClass112_Sub1_Sub2_2.method18014(0);
		this.aClass104_Sub1_38.method3887(this.aClass88_Sub2_4);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local26, "step"), 0.0F, 0.00390625F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		OpenGL.glPopAttrib();
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
		this.aClass104_Sub1_38.method20456(this.aClass112_Sub1_Sub2_2, -1497248091);
		local31 = this.aClass191_5.anInt3349;
		OpenGL.glUseProgram(local31);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local31, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local31, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local31, "params"), aFloat188, aFloat186, 0.0F);
		this.aClass104_Sub1_38.method3882(1);
		this.aClass104_Sub1_38.method3887(this.aClass88_Sub2_3);
		this.aClass104_Sub1_38.method3882(0);
		this.aClass104_Sub1_38.method3887(arg1);
	}

	@OriginalMember(owner = "client!aqf", name = "aq", descriptor = "(ILclient!adt;Lclient!adt;II)V", line = 120)
	@Override
	void method20198(@OriginalArg(0) int arg0, @OriginalArg(1) Class88_Sub2 arg1, @OriginalArg(2) Class88_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(26) int local26;
		@Pc(31) int local31;
		if (this.aClass88_Sub2Array1 == null) {
			this.aClass104_Sub1_38.method3887(arg1);
			this.aClass104_Sub1_38.method20453(this.aClass112_Sub1_Sub2_2, (byte) 1);
			this.aClass112_Sub1_Sub2_2.method18014(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local26 = this.aClass191_6.anInt3349;
			OpenGL.glUseProgram(local26);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local26, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local26, "params"), aFloat187, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt2751, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt2751, (float) this.anInt2753);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt2753);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			this.aClass104_Sub1_38.method20453(this.aClass112_Sub1_Sub2_3, (byte) 1);
			local26 = Class278.method26363(this.anInt2751, 423254006);
			local31 = Class278.method26363(this.anInt2753, 423254006);
			@Pc(33) int local33 = 0;
			while (local26 > 256 || local31 > 256) {
				OpenGL.glViewport(0, 0, local26, local31);
				this.aClass112_Sub1_Sub2_3.method23435(0, this.aClass88_Sub2Array1[local33].method18097(0));
				if (local33 == 0) {
					this.aClass104_Sub1_38.method3887(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) (this.anInt2753 - arg3));
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) arg4, (float) (this.anInt2753 - arg3));
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) arg4, (float) this.anInt2753);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt2753);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					this.aClass104_Sub1_38.method3887(this.aClass88_Sub2Array1[local33 - 1]);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(1.0F, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f(1.0F, 1.0F);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, 1.0F);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				}
				if (local26 > 256) {
					local26 >>= 0x1;
				}
				if (local31 > 256) {
					local31 >>= 0x1;
				}
				local33++;
			}
			this.aClass104_Sub1_38.method20456(this.aClass112_Sub1_Sub2_3, -1497248091);
			this.aClass104_Sub1_38.method3887(this.aClass88_Sub2Array1[local33 - 1]);
			this.aClass104_Sub1_38.method20453(this.aClass112_Sub1_Sub2_2, (byte) 1);
			this.aClass112_Sub1_Sub2_2.method18014(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(192) int local192 = this.aClass191_3.anInt3349;
			OpenGL.glUseProgram(local192);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local192, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local192, "params"), aFloat187, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f(1.0F, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f(1.0F, 1.0F);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, 1.0F);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		}
		this.aClass112_Sub1_Sub2_2.method18014(1);
		this.aClass104_Sub1_38.method3887(this.aClass88_Sub2_3);
		local26 = this.aClass191_4.anInt3349;
		OpenGL.glUseProgram(local26);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local26, "baseTex"), 0);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local26, "step"), 0.00390625F, 0.0F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		this.aClass112_Sub1_Sub2_2.method18014(0);
		this.aClass104_Sub1_38.method3887(this.aClass88_Sub2_4);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local26, "step"), 0.0F, 0.00390625F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		OpenGL.glPopAttrib();
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
		this.aClass104_Sub1_38.method20456(this.aClass112_Sub1_Sub2_2, -1497248091);
		local31 = this.aClass191_5.anInt3349;
		OpenGL.glUseProgram(local31);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local31, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local31, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local31, "params"), aFloat188, aFloat186, 0.0F);
		this.aClass104_Sub1_38.method3882(1);
		this.aClass104_Sub1_38.method3887(this.aClass88_Sub2_3);
		this.aClass104_Sub1_38.method3882(0);
		this.aClass104_Sub1_38.method3887(arg1);
	}

	@OriginalMember(owner = "client!aqf", name = "ax", descriptor = "(ILclient!adt;Lclient!adt;II)V", line = 120)
	@Override
	void method20190(@OriginalArg(0) int arg0, @OriginalArg(1) Class88_Sub2 arg1, @OriginalArg(2) Class88_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(26) int local26;
		@Pc(31) int local31;
		if (this.aClass88_Sub2Array1 == null) {
			this.aClass104_Sub1_38.method3887(arg1);
			this.aClass104_Sub1_38.method20453(this.aClass112_Sub1_Sub2_2, (byte) 1);
			this.aClass112_Sub1_Sub2_2.method18014(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local26 = this.aClass191_6.anInt3349;
			OpenGL.glUseProgram(local26);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local26, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local26, "params"), aFloat187, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt2751, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt2751, (float) this.anInt2753);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt2753);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			this.aClass104_Sub1_38.method20453(this.aClass112_Sub1_Sub2_3, (byte) 1);
			local26 = Class278.method26363(this.anInt2751, 423254006);
			local31 = Class278.method26363(this.anInt2753, 423254006);
			@Pc(33) int local33 = 0;
			while (local26 > 256 || local31 > 256) {
				OpenGL.glViewport(0, 0, local26, local31);
				this.aClass112_Sub1_Sub2_3.method23435(0, this.aClass88_Sub2Array1[local33].method18097(0));
				if (local33 == 0) {
					this.aClass104_Sub1_38.method3887(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) (this.anInt2753 - arg3));
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) arg4, (float) (this.anInt2753 - arg3));
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) arg4, (float) this.anInt2753);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt2753);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					this.aClass104_Sub1_38.method3887(this.aClass88_Sub2Array1[local33 - 1]);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(1.0F, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f(1.0F, 1.0F);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, 1.0F);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				}
				if (local26 > 256) {
					local26 >>= 0x1;
				}
				if (local31 > 256) {
					local31 >>= 0x1;
				}
				local33++;
			}
			this.aClass104_Sub1_38.method20456(this.aClass112_Sub1_Sub2_3, -1497248091);
			this.aClass104_Sub1_38.method3887(this.aClass88_Sub2Array1[local33 - 1]);
			this.aClass104_Sub1_38.method20453(this.aClass112_Sub1_Sub2_2, (byte) 1);
			this.aClass112_Sub1_Sub2_2.method18014(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(192) int local192 = this.aClass191_3.anInt3349;
			OpenGL.glUseProgram(local192);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local192, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local192, "params"), aFloat187, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f(1.0F, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f(1.0F, 1.0F);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, 1.0F);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		}
		this.aClass112_Sub1_Sub2_2.method18014(1);
		this.aClass104_Sub1_38.method3887(this.aClass88_Sub2_3);
		local26 = this.aClass191_4.anInt3349;
		OpenGL.glUseProgram(local26);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local26, "baseTex"), 0);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local26, "step"), 0.00390625F, 0.0F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		this.aClass112_Sub1_Sub2_2.method18014(0);
		this.aClass104_Sub1_38.method3887(this.aClass88_Sub2_4);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local26, "step"), 0.0F, 0.00390625F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		OpenGL.glPopAttrib();
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
		this.aClass104_Sub1_38.method20456(this.aClass112_Sub1_Sub2_2, -1497248091);
		local31 = this.aClass191_5.anInt3349;
		OpenGL.glUseProgram(local31);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local31, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local31, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local31, "params"), aFloat188, aFloat186, 0.0F);
		this.aClass104_Sub1_38.method3882(1);
		this.aClass104_Sub1_38.method3887(this.aClass88_Sub2_3);
		this.aClass104_Sub1_38.method3882(0);
		this.aClass104_Sub1_38.method3887(arg1);
	}

	@OriginalMember(owner = "client!aqf", name = "ap", descriptor = "(ILclient!adt;Lclient!adt;II)V", line = 120)
	@Override
	void method20197(@OriginalArg(0) int arg0, @OriginalArg(1) Class88_Sub2 arg1, @OriginalArg(2) Class88_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(26) int local26;
		@Pc(31) int local31;
		if (this.aClass88_Sub2Array1 == null) {
			this.aClass104_Sub1_38.method3887(arg1);
			this.aClass104_Sub1_38.method20453(this.aClass112_Sub1_Sub2_2, (byte) 1);
			this.aClass112_Sub1_Sub2_2.method18014(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local26 = this.aClass191_6.anInt3349;
			OpenGL.glUseProgram(local26);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local26, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local26, "params"), aFloat187, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt2751, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt2751, (float) this.anInt2753);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt2753);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			this.aClass104_Sub1_38.method20453(this.aClass112_Sub1_Sub2_3, (byte) 1);
			local26 = Class278.method26363(this.anInt2751, 423254006);
			local31 = Class278.method26363(this.anInt2753, 423254006);
			@Pc(33) int local33 = 0;
			while (local26 > 256 || local31 > 256) {
				OpenGL.glViewport(0, 0, local26, local31);
				this.aClass112_Sub1_Sub2_3.method23435(0, this.aClass88_Sub2Array1[local33].method18097(0));
				if (local33 == 0) {
					this.aClass104_Sub1_38.method3887(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) (this.anInt2753 - arg3));
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) arg4, (float) (this.anInt2753 - arg3));
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) arg4, (float) this.anInt2753);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt2753);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					this.aClass104_Sub1_38.method3887(this.aClass88_Sub2Array1[local33 - 1]);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(1.0F, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f(1.0F, 1.0F);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, 1.0F);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				}
				if (local26 > 256) {
					local26 >>= 0x1;
				}
				if (local31 > 256) {
					local31 >>= 0x1;
				}
				local33++;
			}
			this.aClass104_Sub1_38.method20456(this.aClass112_Sub1_Sub2_3, -1497248091);
			this.aClass104_Sub1_38.method3887(this.aClass88_Sub2Array1[local33 - 1]);
			this.aClass104_Sub1_38.method20453(this.aClass112_Sub1_Sub2_2, (byte) 1);
			this.aClass112_Sub1_Sub2_2.method18014(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(192) int local192 = this.aClass191_3.anInt3349;
			OpenGL.glUseProgram(local192);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local192, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local192, "params"), aFloat187, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f(1.0F, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f(1.0F, 1.0F);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, 1.0F);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		}
		this.aClass112_Sub1_Sub2_2.method18014(1);
		this.aClass104_Sub1_38.method3887(this.aClass88_Sub2_3);
		local26 = this.aClass191_4.anInt3349;
		OpenGL.glUseProgram(local26);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local26, "baseTex"), 0);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local26, "step"), 0.00390625F, 0.0F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		this.aClass112_Sub1_Sub2_2.method18014(0);
		this.aClass104_Sub1_38.method3887(this.aClass88_Sub2_4);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local26, "step"), 0.0F, 0.00390625F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		OpenGL.glPopAttrib();
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
		this.aClass104_Sub1_38.method20456(this.aClass112_Sub1_Sub2_2, -1497248091);
		local31 = this.aClass191_5.anInt3349;
		OpenGL.glUseProgram(local31);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local31, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local31, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local31, "params"), aFloat188, aFloat186, 0.0F);
		this.aClass104_Sub1_38.method3882(1);
		this.aClass104_Sub1_38.method3887(this.aClass88_Sub2_3);
		this.aClass104_Sub1_38.method3882(0);
		this.aClass104_Sub1_38.method3887(arg1);
	}

	@OriginalMember(owner = "client!aqf", name = "av", descriptor = "(ILclient!adt;Lclient!adt;II)V", line = 120)
	@Override
	void method20186(@OriginalArg(0) int arg0, @OriginalArg(1) Class88_Sub2 arg1, @OriginalArg(2) Class88_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(26) int local26;
		@Pc(31) int local31;
		if (this.aClass88_Sub2Array1 == null) {
			this.aClass104_Sub1_38.method3887(arg1);
			this.aClass104_Sub1_38.method20453(this.aClass112_Sub1_Sub2_2, (byte) 1);
			this.aClass112_Sub1_Sub2_2.method18014(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local26 = this.aClass191_6.anInt3349;
			OpenGL.glUseProgram(local26);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local26, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local26, "params"), aFloat187, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt2751, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt2751, (float) this.anInt2753);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt2753);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			this.aClass104_Sub1_38.method20453(this.aClass112_Sub1_Sub2_3, (byte) 1);
			local26 = Class278.method26363(this.anInt2751, 423254006);
			local31 = Class278.method26363(this.anInt2753, 423254006);
			@Pc(33) int local33 = 0;
			while (local26 > 256 || local31 > 256) {
				OpenGL.glViewport(0, 0, local26, local31);
				this.aClass112_Sub1_Sub2_3.method23435(0, this.aClass88_Sub2Array1[local33].method18097(0));
				if (local33 == 0) {
					this.aClass104_Sub1_38.method3887(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) (this.anInt2753 - arg3));
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) arg4, (float) (this.anInt2753 - arg3));
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) arg4, (float) this.anInt2753);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt2753);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					this.aClass104_Sub1_38.method3887(this.aClass88_Sub2Array1[local33 - 1]);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(1.0F, 0.0F);
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f(1.0F, 1.0F);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, 1.0F);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				}
				if (local26 > 256) {
					local26 >>= 0x1;
				}
				if (local31 > 256) {
					local31 >>= 0x1;
				}
				local33++;
			}
			this.aClass104_Sub1_38.method20456(this.aClass112_Sub1_Sub2_3, -1497248091);
			this.aClass104_Sub1_38.method3887(this.aClass88_Sub2Array1[local33 - 1]);
			this.aClass104_Sub1_38.method20453(this.aClass112_Sub1_Sub2_2, (byte) 1);
			this.aClass112_Sub1_Sub2_2.method18014(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(192) int local192 = this.aClass191_3.anInt3349;
			OpenGL.glUseProgram(local192);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local192, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local192, "params"), aFloat187, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f(1.0F, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f(1.0F, 1.0F);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, 1.0F);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		}
		this.aClass112_Sub1_Sub2_2.method18014(1);
		this.aClass104_Sub1_38.method3887(this.aClass88_Sub2_3);
		local26 = this.aClass191_4.anInt3349;
		OpenGL.glUseProgram(local26);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local26, "baseTex"), 0);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local26, "step"), 0.00390625F, 0.0F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		this.aClass112_Sub1_Sub2_2.method18014(0);
		this.aClass104_Sub1_38.method3887(this.aClass88_Sub2_4);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local26, "step"), 0.0F, 0.00390625F, 0.0F);
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);
		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);
		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);
		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);
		OpenGL.glEnd();
		OpenGL.glPopAttrib();
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
		this.aClass104_Sub1_38.method20456(this.aClass112_Sub1_Sub2_2, -1497248091);
		local31 = this.aClass191_5.anInt3349;
		OpenGL.glUseProgram(local31);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local31, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local31, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local31, "params"), aFloat188, aFloat186, 0.0F);
		this.aClass104_Sub1_38.method3882(1);
		this.aClass104_Sub1_38.method3887(this.aClass88_Sub2_3);
		this.aClass104_Sub1_38.method3882(0);
		this.aClass104_Sub1_38.method3887(arg1);
	}

	@OriginalMember(owner = "client!aqf", name = "ag", descriptor = "(I)V", line = 248)
	@Override
	void method20192(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgram(0);
		this.aClass104_Sub1_38.method3882(1);
		this.aClass104_Sub1_38.method3887(null);
		this.aClass104_Sub1_38.method3882(0);
	}

	@OriginalMember(owner = "client!aqf", name = "w", descriptor = "(I)V", line = 248)
	@Override
	void method20178(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgram(0);
		this.aClass104_Sub1_38.method3882(1);
		this.aClass104_Sub1_38.method3887(null);
		this.aClass104_Sub1_38.method3882(0);
	}

	@OriginalMember(owner = "client!aqf", name = "p", descriptor = "()Lclient!dg;", line = 255)
	@Override
	Class226 method20166() {
		return Class226.aClass226_24;
	}

	@OriginalMember(owner = "client!aqf", name = "aw", descriptor = "()Lclient!dg;", line = 255)
	@Override
	Class226 method20167() {
		return Class226.aClass226_24;
	}

	@OriginalMember(owner = "client!aqf", name = "as", descriptor = "()Lclient!dg;", line = 255)
	@Override
	Class226 method20168() {
		return Class226.aClass226_24;
	}

	@OriginalMember(owner = "client!aqf", name = "u", descriptor = "()I", line = 259)
	@Override
	int method20183() {
		return 0;
	}

	@OriginalMember(owner = "client!aqf", name = "al", descriptor = "()I", line = 259)
	@Override
	int method20193() {
		return 0;
	}

	@OriginalMember(owner = "client!aqf", name = "c", descriptor = "()Z", line = 263)
	@Override
	boolean method20187() {
		return false;
	}

	@OriginalMember(owner = "client!aqf", name = "au", descriptor = "()Z", line = 263)
	@Override
	boolean method20188() {
		return false;
	}

	@OriginalMember(owner = "client!aqf", name = "am", descriptor = "()Z", line = 263)
	@Override
	boolean method20195() {
		return false;
	}

	@OriginalMember(owner = "client!aqf", name = "ar", descriptor = "()Z", line = 263)
	@Override
	boolean method20196() {
		return false;
	}
}
