package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqy")
public final class Class80_Sub2_Sub3 extends Class80_Sub2 {

	@OriginalMember(owner = "client!aqy", name = "a", descriptor = "Ljava/lang/String;")
	static final String aString91 = "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";

	@OriginalMember(owner = "client!aqy", name = "s", descriptor = "Ljava/lang/String;")
	static final String aString92 = "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n";

	@OriginalMember(owner = "client!aqy", name = "j", descriptor = "Ljava/lang/String;")
	static final String aString93 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";

	@OriginalMember(owner = "client!aqy", name = "k", descriptor = "Ljava/lang/String;")
	static final String aString94 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n";

	@OriginalMember(owner = "client!aqy", name = "g", descriptor = "I")
	static final int anInt3012 = 256;

	@OriginalMember(owner = "client!aqy", name = "i", descriptor = "F")
	static float aFloat219 = 0.25F;

	@OriginalMember(owner = "client!aqy", name = "m", descriptor = "F")
	static float aFloat220 = 1.0F;

	@OriginalMember(owner = "client!aqy", name = "o", descriptor = "F")
	static float aFloat221 = 1.0F;

	@OriginalMember(owner = "client!aqy", name = "q", descriptor = "Lclient!adm;")
	Class84_Sub1 aClass84_Sub1_3;

	@OriginalMember(owner = "client!aqy", name = "d", descriptor = "I")
	int anInt3011;

	@OriginalMember(owner = "client!aqy", name = "w", descriptor = "Lclient!apt;")
	Class108_Sub1_Sub2 aClass108_Sub1_Sub2_2;

	@OriginalMember(owner = "client!aqy", name = "r", descriptor = "Lclient!adm;")
	Class84_Sub1 aClass84_Sub1_4;

	@OriginalMember(owner = "client!aqy", name = "h", descriptor = "[Lclient!adm;")
	Class84_Sub1[] aClass84_Sub1Array1;

	@OriginalMember(owner = "client!aqy", name = "x", descriptor = "Lclient!apt;")
	Class108_Sub1_Sub2 aClass108_Sub1_Sub2_3;

	@OriginalMember(owner = "client!aqy", name = "z", descriptor = "I")
	int anInt3013;

	@OriginalMember(owner = "client!aqy", name = "p", descriptor = "I")
	int anInt3014;

	@OriginalMember(owner = "client!aqy", name = "v", descriptor = "I")
	int anInt3015;

	@OriginalMember(owner = "client!aqy", name = "y", descriptor = "Lclient!by;")
	Class199 aClass199_4;

	@OriginalMember(owner = "client!aqy", name = "n", descriptor = "Lclient!by;")
	Class199 aClass199_5;

	@OriginalMember(owner = "client!aqy", name = "c", descriptor = "Lclient!by;")
	Class199 aClass199_6;

	@OriginalMember(owner = "client!aqy", name = "b", descriptor = "Lclient!by;")
	Class199 aClass199_7;

	@OriginalMember(owner = "client!aqy", name = "<init>", descriptor = "(Lclient!afm;)V")
	Class80_Sub2_Sub3(@OriginalArg(0) Class102_Sub3 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aqy", name = "s", descriptor = "()Z")
	@Override
	boolean method21637() {
		return false;
	}

	@OriginalMember(owner = "client!aqy", name = "av", descriptor = "()Z")
	boolean method21661() {
		return this.aClass102_Sub3_38.aBoolean141 && this.aClass102_Sub3_38.aBoolean155 && this.aClass102_Sub3_38.aBoolean159;
	}

	@OriginalMember(owner = "client!aqy", name = "f", descriptor = "()Z")
	@Override
	boolean method21636() {
		if (!this.aClass102_Sub3_38.aBoolean141 || !this.aClass102_Sub3_38.aBoolean155 || !this.aClass102_Sub3_38.aBoolean159) {
			return false;
		}
		this.aClass108_Sub1_Sub2_3 = new Class108_Sub1_Sub2(this.aClass102_Sub3_38);
		this.aClass84_Sub1_4 = new Class84_Sub1(this.aClass102_Sub3_38, 3553, Class210.aClass210_24, this.method21649(), 256, 256);
		this.aClass84_Sub1_4.method18355(false, false);
		this.aClass84_Sub1_3 = new Class84_Sub1(this.aClass102_Sub3_38, 3553, Class210.aClass210_24, this.method21649(), 256, 256);
		this.aClass84_Sub1_3.method18355(false, false);
		this.aClass102_Sub3_38.method20684(this.aClass108_Sub1_Sub2_3, 145902512);
		this.aClass108_Sub1_Sub2_3.method23903(0, this.aClass84_Sub1_4.method18361(0));
		this.aClass108_Sub1_Sub2_3.method23903(1, this.aClass84_Sub1_3.method18361(0));
		this.aClass108_Sub1_Sub2_3.method18461(0);
		if (!this.aClass108_Sub1_Sub2_3.method23897()) {
			this.aClass102_Sub3_38.method20887(this.aClass108_Sub1_Sub2_3, (byte) 1);
			return false;
		}
		this.aClass102_Sub3_38.method20887(this.aClass108_Sub1_Sub2_3, (byte) 1);
		this.aClass199_7 = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass199_6 = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass199_5 = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") });
		this.aClass199_4 = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass199_6 != null && this.aClass199_7 != null && this.aClass199_5 != null && this.aClass199_4 != null;
	}

	@OriginalMember(owner = "client!aqy", name = "ai", descriptor = "(ILclient!adm;Lclient!adm;II)V")
	@Override
	void method21647(@OriginalArg(0) int arg0, @OriginalArg(1) Class84_Sub1 arg1, @OriginalArg(2) Class84_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(26) int local26;
		@Pc(31) int local31;
		if (this.aClass84_Sub1Array1 == null) {
			this.aClass102_Sub3_38.method6339(arg1);
			this.aClass102_Sub3_38.method20684(this.aClass108_Sub1_Sub2_3, 540736049);
			this.aClass108_Sub1_Sub2_3.method18461(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local26 = this.aClass199_7.anInt3371;
			OpenGL.glUseProgram(local26);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local26, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local26, "params"), aFloat221, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt3011, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt3011, (float) this.anInt3013);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt3013);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			this.aClass102_Sub3_38.method20684(this.aClass108_Sub1_Sub2_2, 730823061);
			local26 = Class548.method31273(this.anInt3011, 695409532);
			local31 = Class548.method31273(this.anInt3013, -1738577725);
			@Pc(33) int local33 = 0;
			while (local26 > 256 || local31 > 256) {
				OpenGL.glViewport(0, 0, local26, local31);
				this.aClass108_Sub1_Sub2_2.method23903(0, this.aClass84_Sub1Array1[local33].method18361(0));
				if (local33 == 0) {
					this.aClass102_Sub3_38.method6339(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) (this.anInt3013 - arg3));
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) arg4, (float) (this.anInt3013 - arg3));
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) arg4, (float) this.anInt3013);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt3013);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					this.aClass102_Sub3_38.method6339(this.aClass84_Sub1Array1[local33 - 1]);
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
			this.aClass102_Sub3_38.method20887(this.aClass108_Sub1_Sub2_2, (byte) 1);
			this.aClass102_Sub3_38.method6339(this.aClass84_Sub1Array1[local33 - 1]);
			this.aClass102_Sub3_38.method20684(this.aClass108_Sub1_Sub2_3, -1524007052);
			this.aClass108_Sub1_Sub2_3.method18461(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(192) int local192 = this.aClass199_6.anInt3371;
			OpenGL.glUseProgram(local192);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local192, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local192, "params"), aFloat221, 0.0F, 0.0F);
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
		this.aClass108_Sub1_Sub2_3.method18461(1);
		this.aClass102_Sub3_38.method6339(this.aClass84_Sub1_4);
		local26 = this.aClass199_4.anInt3371;
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
		this.aClass108_Sub1_Sub2_3.method18461(0);
		this.aClass102_Sub3_38.method6339(this.aClass84_Sub1_3);
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
		this.aClass102_Sub3_38.method20887(this.aClass108_Sub1_Sub2_3, (byte) 1);
		local31 = this.aClass199_5.anInt3371;
		OpenGL.glUseProgram(local31);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local31, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local31, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local31, "params"), aFloat219, aFloat220, 0.0F);
		this.aClass102_Sub3_38.method6386(1);
		this.aClass102_Sub3_38.method6339(this.aClass84_Sub1_4);
		this.aClass102_Sub3_38.method6386(0);
		this.aClass102_Sub3_38.method6339(arg1);
	}

	@OriginalMember(owner = "client!aqy", name = "u", descriptor = "(II)V")
	@Override
	void method21629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3011 = arg0;
		this.anInt3013 = arg1;
		@Pc(10) int local10 = Class548.method31273(this.anInt3011, -1987071581);
		@Pc(15) int local15 = Class548.method31273(this.anInt3013, -1946883006);
		if (this.anInt3014 == local10 && this.anInt3015 == local15) {
			return;
		}
		@Pc(28) int local28;
		if (this.aClass84_Sub1Array1 != null) {
			for (local28 = 0; local28 < this.aClass84_Sub1Array1.length; local28++) {
				this.aClass84_Sub1Array1[local28].method18321();
			}
			this.aClass84_Sub1Array1 = null;
		}
		if (local10 <= 256 && local15 <= 256) {
			this.aClass108_Sub1_Sub2_2 = null;
		} else {
			local28 = local10;
			@Pc(53) int local53 = local15;
			@Pc(55) int local55 = 0;
			label59: while (true) {
				if (local28 <= 256 && local53 <= 256) {
					if (this.aClass108_Sub1_Sub2_2 == null) {
						this.aClass108_Sub1_Sub2_2 = new Class108_Sub1_Sub2(this.aClass102_Sub3_38);
					}
					this.aClass84_Sub1Array1 = new Class84_Sub1[local55];
					local28 = local10;
					local53 = local15;
					local55 = 0;
					while (true) {
						if (local28 <= 256 && local53 <= 256) {
							break label59;
						}
						this.aClass84_Sub1Array1[local55++] = new Class84_Sub1(this.aClass102_Sub3_38, 3553, Class210.aClass210_24, this.method21649(), local28, local53);
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
		this.anInt3014 = local10;
		this.anInt3015 = local15;
	}

	@OriginalMember(owner = "client!aqy", name = "e", descriptor = "()V")
	@Override
	void method21628() {
		this.anInt3015 = -1;
		this.anInt3014 = -1;
		this.aClass108_Sub1_Sub2_2 = null;
		this.aClass84_Sub1Array1 = null;
		this.aClass108_Sub1_Sub2_3 = null;
		this.aClass84_Sub1_4 = null;
		this.aClass84_Sub1_3 = null;
		this.aClass199_7 = null;
		this.aClass199_6 = null;
		this.aClass199_5 = null;
		this.aClass199_4 = null;
	}

	@OriginalMember(owner = "client!aqy", name = "l", descriptor = "(ILclient!adm;Lclient!adm;II)V")
	@Override
	void method21630(@OriginalArg(0) int arg0, @OriginalArg(1) Class84_Sub1 arg1, @OriginalArg(2) Class84_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(26) int local26;
		@Pc(31) int local31;
		if (this.aClass84_Sub1Array1 == null) {
			this.aClass102_Sub3_38.method6339(arg1);
			this.aClass102_Sub3_38.method20684(this.aClass108_Sub1_Sub2_3, 570385566);
			this.aClass108_Sub1_Sub2_3.method18461(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local26 = this.aClass199_7.anInt3371;
			OpenGL.glUseProgram(local26);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local26, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local26, "params"), aFloat221, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt3011, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt3011, (float) this.anInt3013);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt3013);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			this.aClass102_Sub3_38.method20684(this.aClass108_Sub1_Sub2_2, -1817739204);
			local26 = Class548.method31273(this.anInt3011, 1323012116);
			local31 = Class548.method31273(this.anInt3013, 1613163375);
			@Pc(33) int local33 = 0;
			while (local26 > 256 || local31 > 256) {
				OpenGL.glViewport(0, 0, local26, local31);
				this.aClass108_Sub1_Sub2_2.method23903(0, this.aClass84_Sub1Array1[local33].method18361(0));
				if (local33 == 0) {
					this.aClass102_Sub3_38.method6339(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) (this.anInt3013 - arg3));
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) arg4, (float) (this.anInt3013 - arg3));
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) arg4, (float) this.anInt3013);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt3013);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					this.aClass102_Sub3_38.method6339(this.aClass84_Sub1Array1[local33 - 1]);
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
			this.aClass102_Sub3_38.method20887(this.aClass108_Sub1_Sub2_2, (byte) 1);
			this.aClass102_Sub3_38.method6339(this.aClass84_Sub1Array1[local33 - 1]);
			this.aClass102_Sub3_38.method20684(this.aClass108_Sub1_Sub2_3, 478243625);
			this.aClass108_Sub1_Sub2_3.method18461(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(192) int local192 = this.aClass199_6.anInt3371;
			OpenGL.glUseProgram(local192);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local192, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local192, "params"), aFloat221, 0.0F, 0.0F);
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
		this.aClass108_Sub1_Sub2_3.method18461(1);
		this.aClass102_Sub3_38.method6339(this.aClass84_Sub1_4);
		local26 = this.aClass199_4.anInt3371;
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
		this.aClass108_Sub1_Sub2_3.method18461(0);
		this.aClass102_Sub3_38.method6339(this.aClass84_Sub1_3);
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
		this.aClass102_Sub3_38.method20887(this.aClass108_Sub1_Sub2_3, (byte) 1);
		local31 = this.aClass199_5.anInt3371;
		OpenGL.glUseProgram(local31);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local31, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local31, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local31, "params"), aFloat219, aFloat220, 0.0F);
		this.aClass102_Sub3_38.method6386(1);
		this.aClass102_Sub3_38.method6339(this.aClass84_Sub1_4);
		this.aClass102_Sub3_38.method6386(0);
		this.aClass102_Sub3_38.method6339(arg1);
	}

	@OriginalMember(owner = "client!aqy", name = "g", descriptor = "(I)V")
	@Override
	void method21631(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgram(0);
		this.aClass102_Sub3_38.method6386(1);
		this.aClass102_Sub3_38.method6339(null);
		this.aClass102_Sub3_38.method6386(0);
	}

	@OriginalMember(owner = "client!aqy", name = "j", descriptor = "()Lclient!dy;")
	@Override
	Class236 method21649() {
		return Class236.aClass236_25;
	}

	@OriginalMember(owner = "client!aqy", name = "m", descriptor = "()I")
	@Override
	int method21633() {
		return 0;
	}

	@OriginalMember(owner = "client!aqy", name = "x", descriptor = "()Z")
	@Override
	boolean method21638() {
		return this.aClass108_Sub1_Sub2_3 != null;
	}

	@OriginalMember(owner = "client!aqy", name = "z", descriptor = "()Z")
	@Override
	boolean method21639() {
		return this.aClass108_Sub1_Sub2_3 != null;
	}

	@OriginalMember(owner = "client!aqy", name = "p", descriptor = "()Z")
	@Override
	boolean method21640() {
		if (!this.aClass102_Sub3_38.aBoolean141 || !this.aClass102_Sub3_38.aBoolean155 || !this.aClass102_Sub3_38.aBoolean159) {
			return false;
		}
		this.aClass108_Sub1_Sub2_3 = new Class108_Sub1_Sub2(this.aClass102_Sub3_38);
		this.aClass84_Sub1_4 = new Class84_Sub1(this.aClass102_Sub3_38, 3553, Class210.aClass210_24, this.method21649(), 256, 256);
		this.aClass84_Sub1_4.method18355(false, false);
		this.aClass84_Sub1_3 = new Class84_Sub1(this.aClass102_Sub3_38, 3553, Class210.aClass210_24, this.method21649(), 256, 256);
		this.aClass84_Sub1_3.method18355(false, false);
		this.aClass102_Sub3_38.method20684(this.aClass108_Sub1_Sub2_3, -1971919592);
		this.aClass108_Sub1_Sub2_3.method23903(0, this.aClass84_Sub1_4.method18361(0));
		this.aClass108_Sub1_Sub2_3.method23903(1, this.aClass84_Sub1_3.method18361(0));
		this.aClass108_Sub1_Sub2_3.method18461(0);
		if (!this.aClass108_Sub1_Sub2_3.method23897()) {
			this.aClass102_Sub3_38.method20887(this.aClass108_Sub1_Sub2_3, (byte) 1);
			return false;
		}
		this.aClass102_Sub3_38.method20887(this.aClass108_Sub1_Sub2_3, (byte) 1);
		this.aClass199_7 = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass199_6 = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass199_5 = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") });
		this.aClass199_4 = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass199_6 != null && this.aClass199_7 != null && this.aClass199_5 != null && this.aClass199_4 != null;
	}

	@OriginalMember(owner = "client!aqy", name = "v", descriptor = "()Z")
	@Override
	boolean method21625() {
		if (!this.aClass102_Sub3_38.aBoolean141 || !this.aClass102_Sub3_38.aBoolean155 || !this.aClass102_Sub3_38.aBoolean159) {
			return false;
		}
		this.aClass108_Sub1_Sub2_3 = new Class108_Sub1_Sub2(this.aClass102_Sub3_38);
		this.aClass84_Sub1_4 = new Class84_Sub1(this.aClass102_Sub3_38, 3553, Class210.aClass210_24, this.method21649(), 256, 256);
		this.aClass84_Sub1_4.method18355(false, false);
		this.aClass84_Sub1_3 = new Class84_Sub1(this.aClass102_Sub3_38, 3553, Class210.aClass210_24, this.method21649(), 256, 256);
		this.aClass84_Sub1_3.method18355(false, false);
		this.aClass102_Sub3_38.method20684(this.aClass108_Sub1_Sub2_3, 1478621183);
		this.aClass108_Sub1_Sub2_3.method23903(0, this.aClass84_Sub1_4.method18361(0));
		this.aClass108_Sub1_Sub2_3.method23903(1, this.aClass84_Sub1_3.method18361(0));
		this.aClass108_Sub1_Sub2_3.method18461(0);
		if (!this.aClass108_Sub1_Sub2_3.method23897()) {
			this.aClass102_Sub3_38.method20887(this.aClass108_Sub1_Sub2_3, (byte) 1);
			return false;
		}
		this.aClass102_Sub3_38.method20887(this.aClass108_Sub1_Sub2_3, (byte) 1);
		this.aClass199_7 = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass199_6 = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass199_5 = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") });
		this.aClass199_4 = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass199_6 != null && this.aClass199_7 != null && this.aClass199_5 != null && this.aClass199_4 != null;
	}

	@OriginalMember(owner = "client!aqy", name = "y", descriptor = "()Z")
	@Override
	boolean method21641() {
		if (!this.aClass102_Sub3_38.aBoolean141 || !this.aClass102_Sub3_38.aBoolean155 || !this.aClass102_Sub3_38.aBoolean159) {
			return false;
		}
		this.aClass108_Sub1_Sub2_3 = new Class108_Sub1_Sub2(this.aClass102_Sub3_38);
		this.aClass84_Sub1_4 = new Class84_Sub1(this.aClass102_Sub3_38, 3553, Class210.aClass210_24, this.method21649(), 256, 256);
		this.aClass84_Sub1_4.method18355(false, false);
		this.aClass84_Sub1_3 = new Class84_Sub1(this.aClass102_Sub3_38, 3553, Class210.aClass210_24, this.method21649(), 256, 256);
		this.aClass84_Sub1_3.method18355(false, false);
		this.aClass102_Sub3_38.method20684(this.aClass108_Sub1_Sub2_3, 259393418);
		this.aClass108_Sub1_Sub2_3.method23903(0, this.aClass84_Sub1_4.method18361(0));
		this.aClass108_Sub1_Sub2_3.method23903(1, this.aClass84_Sub1_3.method18361(0));
		this.aClass108_Sub1_Sub2_3.method18461(0);
		if (!this.aClass108_Sub1_Sub2_3.method23897()) {
			this.aClass102_Sub3_38.method20887(this.aClass108_Sub1_Sub2_3, (byte) 1);
			return false;
		}
		this.aClass102_Sub3_38.method20887(this.aClass108_Sub1_Sub2_3, (byte) 1);
		this.aClass199_7 = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass199_6 = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.aClass199_5 = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") });
		this.aClass199_4 = Class199.method24921(this.aClass102_Sub3_38, new Class181[] { Class181.method24681(this.aClass102_Sub3_38, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.aClass199_6 != null && this.aClass199_7 != null && this.aClass199_5 != null && this.aClass199_4 != null;
	}

	@OriginalMember(owner = "client!aqy", name = "n", descriptor = "()V")
	@Override
	void method21648() {
		this.anInt3015 = -1;
		this.anInt3014 = -1;
		this.aClass108_Sub1_Sub2_2 = null;
		this.aClass84_Sub1Array1 = null;
		this.aClass108_Sub1_Sub2_3 = null;
		this.aClass84_Sub1_4 = null;
		this.aClass84_Sub1_3 = null;
		this.aClass199_7 = null;
		this.aClass199_6 = null;
		this.aClass199_5 = null;
		this.aClass199_4 = null;
	}

	@OriginalMember(owner = "client!aqy", name = "af", descriptor = "()Z")
	@Override
	boolean method21656() {
		return false;
	}

	@OriginalMember(owner = "client!aqy", name = "b", descriptor = "()V")
	@Override
	void method21660() {
		this.anInt3015 = -1;
		this.anInt3014 = -1;
		this.aClass108_Sub1_Sub2_2 = null;
		this.aClass84_Sub1Array1 = null;
		this.aClass108_Sub1_Sub2_3 = null;
		this.aClass84_Sub1_4 = null;
		this.aClass84_Sub1_3 = null;
		this.aClass199_7 = null;
		this.aClass199_6 = null;
		this.aClass199_5 = null;
		this.aClass199_4 = null;
	}

	@OriginalMember(owner = "client!aqy", name = "ax", descriptor = "(II)V")
	@Override
	void method21645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3011 = arg0;
		this.anInt3013 = arg1;
		@Pc(10) int local10 = Class548.method31273(this.anInt3011, 1852785450);
		@Pc(15) int local15 = Class548.method31273(this.anInt3013, -985861619);
		if (this.anInt3014 == local10 && this.anInt3015 == local15) {
			return;
		}
		@Pc(28) int local28;
		if (this.aClass84_Sub1Array1 != null) {
			for (local28 = 0; local28 < this.aClass84_Sub1Array1.length; local28++) {
				this.aClass84_Sub1Array1[local28].method18321();
			}
			this.aClass84_Sub1Array1 = null;
		}
		if (local10 <= 256 && local15 <= 256) {
			this.aClass108_Sub1_Sub2_2 = null;
		} else {
			local28 = local10;
			@Pc(53) int local53 = local15;
			@Pc(55) int local55 = 0;
			label59: while (true) {
				if (local28 <= 256 && local53 <= 256) {
					if (this.aClass108_Sub1_Sub2_2 == null) {
						this.aClass108_Sub1_Sub2_2 = new Class108_Sub1_Sub2(this.aClass102_Sub3_38);
					}
					this.aClass84_Sub1Array1 = new Class84_Sub1[local55];
					local28 = local10;
					local53 = local15;
					local55 = 0;
					while (true) {
						if (local28 <= 256 && local53 <= 256) {
							break label59;
						}
						this.aClass84_Sub1Array1[local55++] = new Class84_Sub1(this.aClass102_Sub3_38, 3553, Class210.aClass210_24, this.method21649(), local28, local53);
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
		this.anInt3014 = local10;
		this.anInt3015 = local15;
	}

	@OriginalMember(owner = "client!aqy", name = "ay", descriptor = "(ILclient!adm;Lclient!adm;II)V")
	@Override
	void method21644(@OriginalArg(0) int arg0, @OriginalArg(1) Class84_Sub1 arg1, @OriginalArg(2) Class84_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(26) int local26;
		@Pc(31) int local31;
		if (this.aClass84_Sub1Array1 == null) {
			this.aClass102_Sub3_38.method6339(arg1);
			this.aClass102_Sub3_38.method20684(this.aClass108_Sub1_Sub2_3, 24719165);
			this.aClass108_Sub1_Sub2_3.method18461(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local26 = this.aClass199_7.anInt3371;
			OpenGL.glUseProgram(local26);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local26, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local26, "params"), aFloat221, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt3011, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt3011, (float) this.anInt3013);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt3013);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			this.aClass102_Sub3_38.method20684(this.aClass108_Sub1_Sub2_2, 98866206);
			local26 = Class548.method31273(this.anInt3011, -579680311);
			local31 = Class548.method31273(this.anInt3013, -1357603567);
			@Pc(33) int local33 = 0;
			while (local26 > 256 || local31 > 256) {
				OpenGL.glViewport(0, 0, local26, local31);
				this.aClass108_Sub1_Sub2_2.method23903(0, this.aClass84_Sub1Array1[local33].method18361(0));
				if (local33 == 0) {
					this.aClass102_Sub3_38.method6339(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) (this.anInt3013 - arg3));
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) arg4, (float) (this.anInt3013 - arg3));
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) arg4, (float) this.anInt3013);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt3013);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					this.aClass102_Sub3_38.method6339(this.aClass84_Sub1Array1[local33 - 1]);
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
			this.aClass102_Sub3_38.method20887(this.aClass108_Sub1_Sub2_2, (byte) 1);
			this.aClass102_Sub3_38.method6339(this.aClass84_Sub1Array1[local33 - 1]);
			this.aClass102_Sub3_38.method20684(this.aClass108_Sub1_Sub2_3, 46138947);
			this.aClass108_Sub1_Sub2_3.method18461(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(192) int local192 = this.aClass199_6.anInt3371;
			OpenGL.glUseProgram(local192);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local192, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local192, "params"), aFloat221, 0.0F, 0.0F);
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
		this.aClass108_Sub1_Sub2_3.method18461(1);
		this.aClass102_Sub3_38.method6339(this.aClass84_Sub1_4);
		local26 = this.aClass199_4.anInt3371;
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
		this.aClass108_Sub1_Sub2_3.method18461(0);
		this.aClass102_Sub3_38.method6339(this.aClass84_Sub1_3);
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
		this.aClass102_Sub3_38.method20887(this.aClass108_Sub1_Sub2_3, (byte) 1);
		local31 = this.aClass199_5.anInt3371;
		OpenGL.glUseProgram(local31);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local31, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local31, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local31, "params"), aFloat219, aFloat220, 0.0F);
		this.aClass102_Sub3_38.method6386(1);
		this.aClass102_Sub3_38.method6339(this.aClass84_Sub1_4);
		this.aClass102_Sub3_38.method6386(0);
		this.aClass102_Sub3_38.method6339(arg1);
	}

	@OriginalMember(owner = "client!aqy", name = "an", descriptor = "()Z")
	boolean method21662() {
		return this.aClass102_Sub3_38.aBoolean141 && this.aClass102_Sub3_38.aBoolean155 && this.aClass102_Sub3_38.aBoolean159;
	}

	@OriginalMember(owner = "client!aqy", name = "at", descriptor = "()Z")
	@Override
	boolean method21659() {
		return false;
	}

	@OriginalMember(owner = "client!aqy", name = "ao", descriptor = "(I)V")
	@Override
	void method21634(@OriginalArg(0) int arg0) {
		OpenGL.glUseProgram(0);
		this.aClass102_Sub3_38.method6386(1);
		this.aClass102_Sub3_38.method6339(null);
		this.aClass102_Sub3_38.method6386(0);
	}

	@OriginalMember(owner = "client!aqy", name = "aj", descriptor = "()Lclient!dy;")
	@Override
	Class236 method21650() {
		return Class236.aClass236_25;
	}

	@OriginalMember(owner = "client!aqy", name = "ac", descriptor = "()Lclient!dy;")
	@Override
	Class236 method21652() {
		return Class236.aClass236_25;
	}

	@OriginalMember(owner = "client!aqy", name = "ag", descriptor = "()Lclient!dy;")
	@Override
	Class236 method21651() {
		return Class236.aClass236_25;
	}

	@OriginalMember(owner = "client!aqy", name = "ah", descriptor = "()Z")
	@Override
	boolean method21655() {
		return false;
	}

	@OriginalMember(owner = "client!aqy", name = "t", descriptor = "()Z")
	@Override
	boolean method21626() {
		return this.aClass108_Sub1_Sub2_3 != null;
	}

	@OriginalMember(owner = "client!aqy", name = "am", descriptor = "()Z")
	@Override
	boolean method21657() {
		return false;
	}

	@OriginalMember(owner = "client!aqy", name = "ak", descriptor = "()Z")
	@Override
	boolean method21658() {
		return false;
	}

	@OriginalMember(owner = "client!aqy", name = "aq", descriptor = "(ILclient!adm;Lclient!adm;II)V")
	@Override
	void method21627(@OriginalArg(0) int arg0, @OriginalArg(1) Class84_Sub1 arg1, @OriginalArg(2) Class84_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		@Pc(26) int local26;
		@Pc(31) int local31;
		if (this.aClass84_Sub1Array1 == null) {
			this.aClass102_Sub3_38.method6339(arg1);
			this.aClass102_Sub3_38.method20684(this.aClass108_Sub1_Sub2_3, 1602305419);
			this.aClass108_Sub1_Sub2_3.method18461(0);
			OpenGL.glViewport(0, 0, 256, 256);
			local26 = this.aClass199_7.anInt3371;
			OpenGL.glUseProgram(local26);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local26, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local26, "params"), aFloat221, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.anInt3011, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.anInt3011, (float) this.anInt3013);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.anInt3013);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			this.aClass102_Sub3_38.method20684(this.aClass108_Sub1_Sub2_2, -593558786);
			local26 = Class548.method31273(this.anInt3011, 637337098);
			local31 = Class548.method31273(this.anInt3013, -1733577526);
			@Pc(33) int local33 = 0;
			while (local26 > 256 || local31 > 256) {
				OpenGL.glViewport(0, 0, local26, local31);
				this.aClass108_Sub1_Sub2_2.method23903(0, this.aClass84_Sub1Array1[local33].method18361(0));
				if (local33 == 0) {
					this.aClass102_Sub3_38.method6339(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) (this.anInt3013 - arg3));
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) arg4, (float) (this.anInt3013 - arg3));
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) arg4, (float) this.anInt3013);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt3013);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					this.aClass102_Sub3_38.method6339(this.aClass84_Sub1Array1[local33 - 1]);
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
			this.aClass102_Sub3_38.method20887(this.aClass108_Sub1_Sub2_2, (byte) 1);
			this.aClass102_Sub3_38.method6339(this.aClass84_Sub1Array1[local33 - 1]);
			this.aClass102_Sub3_38.method20684(this.aClass108_Sub1_Sub2_3, -418141710);
			this.aClass108_Sub1_Sub2_3.method18461(0);
			OpenGL.glViewport(0, 0, 256, 256);
			@Pc(192) int local192 = this.aClass199_6.anInt3371;
			OpenGL.glUseProgram(local192);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local192, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local192, "params"), aFloat221, 0.0F, 0.0F);
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
		this.aClass108_Sub1_Sub2_3.method18461(1);
		this.aClass102_Sub3_38.method6339(this.aClass84_Sub1_4);
		local26 = this.aClass199_4.anInt3371;
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
		this.aClass108_Sub1_Sub2_3.method18461(0);
		this.aClass102_Sub3_38.method6339(this.aClass84_Sub1_3);
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
		this.aClass102_Sub3_38.method20887(this.aClass108_Sub1_Sub2_3, (byte) 1);
		local31 = this.aClass199_5.anInt3371;
		OpenGL.glUseProgram(local31);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local31, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(local31, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(local31, "params"), aFloat219, aFloat220, 0.0F);
		this.aClass102_Sub3_38.method6386(1);
		this.aClass102_Sub3_38.method6339(this.aClass84_Sub1_4);
		this.aClass102_Sub3_38.method6386(0);
		this.aClass102_Sub3_38.method6339(arg1);
	}

	@OriginalMember(owner = "client!aqy", name = "ad", descriptor = "()I")
	@Override
	int method21635() {
		return 0;
	}

	@OriginalMember(owner = "client!aqy", name = "c", descriptor = "()V")
	@Override
	void method21643() {
		this.anInt3015 = -1;
		this.anInt3014 = -1;
		this.aClass108_Sub1_Sub2_2 = null;
		this.aClass84_Sub1Array1 = null;
		this.aClass108_Sub1_Sub2_3 = null;
		this.aClass84_Sub1_4 = null;
		this.aClass84_Sub1_3 = null;
		this.aClass199_7 = null;
		this.aClass199_6 = null;
		this.aClass199_5 = null;
		this.aClass199_4 = null;
	}
}
