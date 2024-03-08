package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("aqf")
public class class1147 extends class968 {

	@ObfuscatedName("aqf.l")
	public static float field12205 = 0.25F;

	@ObfuscatedName("aqf.u")
	public static float field12188 = 1.0F;

	@ObfuscatedName("aqf.z")
	public static float field12189 = 1.0F;

	@ObfuscatedName("aqf.v")
	public class1118 field12194;

	@ObfuscatedName("aqf.o")
	public class1118 field12195;

	@ObfuscatedName("aqf.s")
	public class812 field12196;

	@ObfuscatedName("aqf.y")
	public class812 field12197;

	@ObfuscatedName("aqf.q")
	public class812[] field12193;

	@ObfuscatedName("aqf.x")
	public int field12190;

	@ObfuscatedName("aqf.b")
	public int field12200;

	@ObfuscatedName("aqf.h")
	public int field12201;

	@ObfuscatedName("aqf.a")
	public int field12202;

	@ObfuscatedName("aqf.g")
	public class68 field12203;

	@ObfuscatedName("aqf.i")
	public class68 field12204;

	@ObfuscatedName("aqf.j")
	public class68 field12192;

	@ObfuscatedName("aqf.t")
	public class68 field12206;

	public class1147(class849 arg0) {
		super(arg0);
	}

	@ObfuscatedName("aqf.ao()Z")
	public boolean method19235() {
		return this.field11270.field9985 && this.field11270.field10002 && this.field11270.field9997;
	}

	@ObfuscatedName("aqf.e()Z")
	public boolean method17539() {
		return this.field12194 != null;
	}

	@ObfuscatedName("aqf.n()Z")
	public boolean method17534() {
		if (!this.field11270.field9985 || !this.field11270.field10002 || !this.field11270.field9997) {
			return false;
		}
		this.field12194 = new class1118(this.field11270);
		this.field12196 = new class812(this.field11270, 3553, class109.field1273, this.method17542(), 256, 256);
		this.field12196.method15312(false, false);
		this.field12197 = new class812(this.field11270, 3553, class109.field1273, this.method17542(), 256, 256);
		this.field12197.method15312(false, false);
		this.field11270.method2142(this.field12194);
		this.field12194.method15439(0, this.field12196.method15317(0));
		this.field12194.method15439(1, this.field12197.method15317(0));
		this.field12194.method18966(0);
		if (!this.field12194.method15446()) {
			this.field11270.method2143(this.field12194);
			return false;
		}
		this.field11270.method2143(this.field12194);
		this.field12206 = class68.method1065(this.field11270, new class71[] { class71.method1120(this.field11270, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.field12192 = class68.method1065(this.field11270, new class71[] { class71.method1120(this.field11270, 35632, "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n") });
		this.field12204 = class68.method1065(this.field11270, new class71[] { class71.method1120(this.field11270, 35632, "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n") });
		this.field12203 = class68.method1065(this.field11270, new class71[] { class71.method1120(this.field11270, 35632, "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n") });
		return this.field12192 != null && this.field12206 != null && this.field12204 != null && this.field12203 != null;
	}

	@ObfuscatedName("aqf.k(II)V")
	public void method17540(int arg0, int arg1) {
		this.field12190 = arg0;
		this.field12200 = arg1;
		int var3 = class783.method3082(this.field12190);
		int var4 = class783.method3082(this.field12200);
		if (this.field12201 == var3 && this.field12202 == var4) {
			return;
		}
		if (this.field12193 != null) {
			for (int var5 = 0; var5 < this.field12193.length; var5++) {
				this.field12193[var5].method1089();
			}
			this.field12193 = null;
		}
		if (var3 <= 256 && var4 <= 256) {
			this.field12195 = null;
		} else {
			int var6 = var3;
			int var7 = var4;
			int var8 = 0;
			label61: while (true) {
				if (var6 <= 256 && var7 <= 256) {
					if (this.field12195 == null) {
						this.field12195 = new class1118(this.field11270);
					}
					this.field12193 = new class812[var8];
					int var9 = var3;
					int var10 = var4;
					int var11 = 0;
					while (true) {
						if (var9 <= 256 && var10 <= 256) {
							break label61;
						}
						this.field12193[var11++] = new class812(this.field11270, 3553, class109.field1273, this.method17542(), var9, var10);
						if (var9 > 256) {
							var9 >>= 0x1;
						}
						if (var10 > 256) {
							var10 >>= 0x1;
						}
					}
				}
				if (var6 > 256) {
					var6 >>= 0x1;
				}
				if (var7 > 256) {
					var7 >>= 0x1;
				}
				var8++;
			}
		}
		this.field12201 = var3;
		this.field12202 = var4;
	}

	@ObfuscatedName("aqf.m()V")
	public void method17570() {
		this.field12202 = -1;
		this.field12201 = -1;
		this.field12195 = null;
		this.field12193 = null;
		this.field12194 = null;
		this.field12196 = null;
		this.field12197 = null;
		this.field12206 = null;
		this.field12192 = null;
		this.field12204 = null;
		this.field12203 = null;
	}

	@ObfuscatedName("aqf.f(ILadt;Ladt;II)V")
	public void method17537(int arg0, class812 arg1, class812 arg2, int arg3, int arg4) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		if (this.field12193 == null) {
			this.field11270.method15777(arg1);
			this.field11270.method2142(this.field12194);
			this.field12194.method18966(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int var10 = this.field12206.field987;
			OpenGL.glUseProgram(var10);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var10, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var10, "params"), field12189, 0.0F, 0.0F);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);
			OpenGL.glTexCoord2f((float) this.field12190, 0.0F);
			OpenGL.glVertex2i(1, 0);
			OpenGL.glTexCoord2f((float) this.field12190, (float) this.field12200);
			OpenGL.glVertex2i(1, 1);
			OpenGL.glTexCoord2f(0.0F, (float) this.field12200);
			OpenGL.glVertex2i(0, 1);
			OpenGL.glEnd();
		} else {
			this.field11270.method2142(this.field12195);
			int var6 = class783.method3082(this.field12190);
			int var7 = class783.method3082(this.field12200);
			int var8 = 0;
			while (var6 > 256 || var7 > 256) {
				OpenGL.glViewport(0, 0, var6, var7);
				this.field12195.method15439(0, this.field12193[var8].method15317(0));
				if (var8 == 0) {
					this.field11270.method15777(arg1);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) (this.field12200 - arg3));
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f((float) arg4, (float) (this.field12200 - arg3));
					OpenGL.glVertex2i(1, 0);
					OpenGL.glTexCoord2f((float) arg4, (float) this.field12200);
					OpenGL.glVertex2i(1, 1);
					OpenGL.glTexCoord2f(0.0F, (float) this.field12200);
					OpenGL.glVertex2i(0, 1);
					OpenGL.glEnd();
				} else {
					this.field11270.method15777(this.field12193[var8 - 1]);
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
				if (var6 > 256) {
					var6 >>= 0x1;
				}
				if (var7 > 256) {
					var7 >>= 0x1;
				}
				var8++;
			}
			this.field11270.method2143(this.field12195);
			this.field11270.method15777(this.field12193[var8 - 1]);
			this.field11270.method2142(this.field12194);
			this.field12194.method18966(0);
			OpenGL.glViewport(0, 0, 256, 256);
			int var9 = this.field12192.field987;
			OpenGL.glUseProgram(var9);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var9, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var9, "params"), field12189, 0.0F, 0.0F);
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
		this.field12194.method18966(1);
		this.field11270.method15777(this.field12196);
		int var11 = this.field12203.field987;
		OpenGL.glUseProgram(var11);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var11, "baseTex"), 0);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var11, "step"), 0.00390625F, 0.0F, 0.0F);
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
		this.field12194.method18966(0);
		this.field11270.method15777(this.field12197);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var11, "step"), 0.0F, 0.00390625F, 0.0F);
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
		this.field11270.method2143(this.field12194);
		int var12 = this.field12204.field987;
		OpenGL.glUseProgram(var12);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var12, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(var12, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(var12, "params"), field12205, field12188, 0.0F);
		this.field11270.method15776(1);
		this.field11270.method15777(this.field12196);
		this.field11270.method15776(0);
		this.field11270.method15777(arg1);
	}

	@ObfuscatedName("aqf.w(I)V")
	public void method17538(int arg0) {
		OpenGL.glUseProgram(0);
		this.field11270.method15776(1);
		this.field11270.method15777(null);
		this.field11270.method15776(0);
	}

	@ObfuscatedName("aqf.p()Ldg;")
	public class135 method17542() {
		return class135.field1647;
	}

	@ObfuscatedName("aqf.u()I")
	public int method17546() {
		return 0;
	}

	@ObfuscatedName("aqf.c()Z")
	public boolean method17551() {
		return false;
	}
}
