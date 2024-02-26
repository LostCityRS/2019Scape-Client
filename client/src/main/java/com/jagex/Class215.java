package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class215 {

	@OriginalMember(owner = "client!cu", name = "t", descriptor = "Ljava/lang/String;")
	static final String aString152 = "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n";

	@OriginalMember(owner = "client!cu", name = "e", descriptor = "Lclient!by;")
	Class199 aClass199_8;

	@OriginalMember(owner = "client!cu", name = "f", descriptor = "Lclient!afm;")
	final Class102_Sub3 aClass102_Sub3_46;

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(Lclient!afm;)V")
	Class215(@OriginalArg(0) Class102_Sub3 arg0) {
		this.aClass102_Sub3_46 = arg0;
	}

	@OriginalMember(owner = "client!cu", name = "t", descriptor = "()Z")
	boolean method25839() {
		if (this.aClass102_Sub3_46.aBoolean141 && this.aClass102_Sub3_46.aBoolean155 && this.aClass199_8 == null) {
			@Pc(16) Class181 local16 = Class181.method24681(this.aClass102_Sub3_46, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local16 != null) {
				this.aClass199_8 = Class199.method24921(this.aClass102_Sub3_46, new Class181[] { local16 });
			}
		}
		return this.aClass199_8 != null;
	}

	@OriginalMember(owner = "client!cu", name = "f", descriptor = "(Lclient!ads;Lclient!ads;F)Z")
	boolean method25840(@OriginalArg(0) Class84_Sub3 arg0, @OriginalArg(1) Class84_Sub3 arg1, @OriginalArg(2) float arg2) {
		if (!this.method25839()) {
			return false;
		}
		@Pc(8) Class108_Sub1_Sub2 local8 = this.aClass102_Sub3_46.aClass108_Sub1_Sub2_1;
		@Pc(20) Class80_Sub1_Sub3 local20 = new Class80_Sub1_Sub3(this.aClass102_Sub3_46, Class210.aClass210_24, Class236.aClass236_21, arg0.anInt311, arg0.anInt310);
		@Pc(22) boolean local22 = false;
		this.aClass102_Sub3_46.method20684(local8, 681567250);
		local8.method23903(0, local20);
		if (local8.method23897()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt311, arg0.anInt310);
			OpenGL.glUseProgram(this.aClass199_8.anInt3371);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(this.aClass199_8.anInt3371, "heightMap"), 0);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(this.aClass199_8.anInt3371, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(this.aClass199_8.anInt3371, "sampleSize"), 1.0F / (float) arg1.anInt311, 1.0F / (float) arg1.anInt310);
			for (@Pc(94) int local94 = 0; local94 < arg0.anInt312; local94++) {
				@Pc(105) float local105 = (float) local94 / (float) arg0.anInt312;
				this.aClass102_Sub3_46.method6339(arg1);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, local105);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, local105);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, local105);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, local105);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				arg0.method1779(0, 0, local94, arg0.anInt311, arg0.anInt310, 0, 0);
			}
			OpenGL.glUseProgram(0);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local22 = true;
		}
		local8.method23903(0, null);
		this.aClass102_Sub3_46.method20887(local8, (byte) 1);
		return local22;
	}

	@OriginalMember(owner = "client!cu", name = "e", descriptor = "()Z")
	boolean method25841() {
		if (this.aClass102_Sub3_46.aBoolean141 && this.aClass102_Sub3_46.aBoolean155 && this.aClass199_8 == null) {
			@Pc(16) Class181 local16 = Class181.method24681(this.aClass102_Sub3_46, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local16 != null) {
				this.aClass199_8 = Class199.method24921(this.aClass102_Sub3_46, new Class181[] { local16 });
			}
		}
		return this.aClass199_8 != null;
	}

	@OriginalMember(owner = "client!cu", name = "u", descriptor = "()Z")
	boolean method25842() {
		if (this.aClass102_Sub3_46.aBoolean141 && this.aClass102_Sub3_46.aBoolean155 && this.aClass199_8 == null) {
			@Pc(16) Class181 local16 = Class181.method24681(this.aClass102_Sub3_46, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local16 != null) {
				this.aClass199_8 = Class199.method24921(this.aClass102_Sub3_46, new Class181[] { local16 });
			}
		}
		return this.aClass199_8 != null;
	}

	@OriginalMember(owner = "client!cu", name = "l", descriptor = "()Z")
	boolean method25843() {
		if (this.aClass102_Sub3_46.aBoolean141 && this.aClass102_Sub3_46.aBoolean155 && this.aClass199_8 == null) {
			@Pc(16) Class181 local16 = Class181.method24681(this.aClass102_Sub3_46, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local16 != null) {
				this.aClass199_8 = Class199.method24921(this.aClass102_Sub3_46, new Class181[] { local16 });
			}
		}
		return this.aClass199_8 != null;
	}

	@OriginalMember(owner = "client!cu", name = "g", descriptor = "(Lclient!ads;Lclient!ads;F)Z")
	boolean method25844(@OriginalArg(0) Class84_Sub3 arg0, @OriginalArg(1) Class84_Sub3 arg1, @OriginalArg(2) float arg2) {
		if (!this.method25839()) {
			return false;
		}
		@Pc(8) Class108_Sub1_Sub2 local8 = this.aClass102_Sub3_46.aClass108_Sub1_Sub2_1;
		@Pc(20) Class80_Sub1_Sub3 local20 = new Class80_Sub1_Sub3(this.aClass102_Sub3_46, Class210.aClass210_24, Class236.aClass236_21, arg0.anInt311, arg0.anInt310);
		@Pc(22) boolean local22 = false;
		this.aClass102_Sub3_46.method20684(local8, 2083274686);
		local8.method23903(0, local20);
		if (local8.method23897()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt311, arg0.anInt310);
			OpenGL.glUseProgram(this.aClass199_8.anInt3371);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(this.aClass199_8.anInt3371, "heightMap"), 0);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(this.aClass199_8.anInt3371, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(this.aClass199_8.anInt3371, "sampleSize"), 1.0F / (float) arg1.anInt311, 1.0F / (float) arg1.anInt310);
			for (@Pc(94) int local94 = 0; local94 < arg0.anInt312; local94++) {
				@Pc(105) float local105 = (float) local94 / (float) arg0.anInt312;
				this.aClass102_Sub3_46.method6339(arg1);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, local105);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, local105);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, local105);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, local105);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				arg0.method1779(0, 0, local94, arg0.anInt311, arg0.anInt310, 0, 0);
			}
			OpenGL.glUseProgram(0);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local22 = true;
		}
		local8.method23903(0, null);
		this.aClass102_Sub3_46.method20887(local8, (byte) 1);
		return local22;
	}
}
