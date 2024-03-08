package com.jagex;

import deob.ObfuscatedName;
import jaggl.OpenGL;

@ObfuscatedName("cp")
public class class93 {

	@ObfuscatedName("cp.n")
	public final class849 field1183;

	@ObfuscatedName("cp.m")
	public class68 field1182;

	public class93(class849 arg0) {
		this.field1183 = arg0;
	}

	@ObfuscatedName("cp.e()Z")
	public boolean method1391() {
		if (this.field1183.field9985 && this.field1183.field10002 && this.field1182 == null) {
			class71 var1 = class71.method1120(this.field1183, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (var1 != null) {
				this.field1182 = class68.method1065(this.field1183, new class71[] { var1 });
			}
		}
		return this.field1182 != null;
	}

	@ObfuscatedName("cp.n(Ladu;Ladu;F)Z")
	public boolean method1390(class811 arg0, class811 arg1, float arg2) {
		if (!this.method1391()) {
			return false;
		}
		class1118 var4 = this.field1183.field9877;
		class828 var5 = new class828(this.field1183, class109.field1273, class135.field1645, arg0.field9269, arg0.field9268);
		boolean var6 = false;
		this.field1183.method2142(var4);
		var4.method15439(0, var5);
		if (var4.method15446()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.field9269, arg0.field9268);
			OpenGL.glUseProgram(this.field1182.field987);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(this.field1182.field987, "heightMap"), 0);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(this.field1182.field987, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(this.field1182.field987, "sampleSize"), 1.0F / (float) arg1.field9269, 1.0F / (float) arg1.field9268);
			for (int var7 = 0; var7 < arg0.field9270; var7++) {
				float var8 = (float) var7 / (float) arg0.field9270;
				this.field1183.method15777(arg1);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, var8);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, var8);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, var8);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, var8);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				arg0.method15310(0, 0, var7, arg0.field9269, arg0.field9268, 0, 0);
			}
			OpenGL.glUseProgram(0);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			var6 = true;
		}
		var4.method15439(0, null);
		this.field1183.method2143(var4);
		return var6;
	}
}
