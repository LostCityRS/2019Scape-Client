package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public class Class209 {

	@OriginalMember(owner = "client!cp", name = "e", descriptor = "Ljava/lang/String;")
	static final String aString149 = "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n";

	@OriginalMember(owner = "client!cp", name = "m", descriptor = "Lclient!bn;")
	Class191 aClass191_8;

	@OriginalMember(owner = "client!cp", name = "n", descriptor = "Lclient!afa;")
	final Class104_Sub1 aClass104_Sub1_46;

	@OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Lclient!afa;)V", line = 13)
	Class209(@OriginalArg(0) Class104_Sub1 arg0) {
		this.aClass104_Sub1_46 = arg0;
	}

	@OriginalMember(owner = "client!cp", name = "e", descriptor = "()Z", line = 18)
	boolean method25405() {
		if (this.aClass104_Sub1_46.aBoolean90 && this.aClass104_Sub1_46.aBoolean103 && this.aClass191_8 == null) {
			@Pc(16) Class190 local16 = Class190.method24585(this.aClass104_Sub1_46, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local16 != null) {
				this.aClass191_8 = Class191.method24589(this.aClass104_Sub1_46, new Class190[] { local16 });
			}
		}
		return this.aClass191_8 != null;
	}

	@OriginalMember(owner = "client!cp", name = "m", descriptor = "()Z", line = 18)
	boolean method25406() {
		if (this.aClass104_Sub1_46.aBoolean90 && this.aClass104_Sub1_46.aBoolean103 && this.aClass191_8 == null) {
			@Pc(16) Class190 local16 = Class190.method24585(this.aClass104_Sub1_46, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local16 != null) {
				this.aClass191_8 = Class191.method24589(this.aClass104_Sub1_46, new Class190[] { local16 });
			}
		}
		return this.aClass191_8 != null;
	}

	@OriginalMember(owner = "client!cp", name = "k", descriptor = "()Z", line = 18)
	boolean method25407() {
		if (this.aClass104_Sub1_46.aBoolean90 && this.aClass104_Sub1_46.aBoolean103 && this.aClass191_8 == null) {
			@Pc(16) Class190 local16 = Class190.method24585(this.aClass104_Sub1_46, 35632, "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n");
			if (local16 != null) {
				this.aClass191_8 = Class191.method24589(this.aClass104_Sub1_46, new Class190[] { local16 });
			}
		}
		return this.aClass191_8 != null;
	}

	@OriginalMember(owner = "client!cp", name = "n", descriptor = "(Lclient!adu;Lclient!adu;F)Z", line = 28)
	boolean method25408(@OriginalArg(0) Class88_Sub3 arg0, @OriginalArg(1) Class88_Sub3 arg1, @OriginalArg(2) float arg2) {
		if (!this.method25405()) {
			return false;
		}
		@Pc(8) Class112_Sub1_Sub2 local8 = this.aClass104_Sub1_46.aClass112_Sub1_Sub2_1;
		@Pc(20) Class93_Sub1_Sub3 local20 = new Class93_Sub1_Sub3(this.aClass104_Sub1_46, Class206.aClass206_22, Class226.aClass226_22, arg0.anInt314, arg0.anInt313);
		@Pc(22) boolean local22 = false;
		this.aClass104_Sub1_46.method20453(local8, (byte) 1);
		local8.method23435(0, local20);
		if (local8.method23442()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt314, arg0.anInt313);
			OpenGL.glUseProgram(this.aClass191_8.anInt3349);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(this.aClass191_8.anInt3349, "heightMap"), 0);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(this.aClass191_8.anInt3349, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(this.aClass191_8.anInt3349, "sampleSize"), 1.0F / (float) arg1.anInt314, 1.0F / (float) arg1.anInt313);
			for (@Pc(94) int local94 = 0; local94 < arg0.anInt315; local94++) {
				@Pc(105) float local105 = (float) local94 / (float) arg0.anInt315;
				this.aClass104_Sub1_46.method3887(arg1);
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
				arg0.method1702(0, 0, local94, arg0.anInt314, arg0.anInt313, 0, 0);
			}
			OpenGL.glUseProgram(0);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local22 = true;
		}
		local8.method23435(0, null);
		this.aClass104_Sub1_46.method20456(local8, -1497248091);
		return local22;
	}

	@OriginalMember(owner = "client!cp", name = "f", descriptor = "(Lclient!adu;Lclient!adu;F)Z", line = 28)
	boolean method25409(@OriginalArg(0) Class88_Sub3 arg0, @OriginalArg(1) Class88_Sub3 arg1, @OriginalArg(2) float arg2) {
		if (!this.method25405()) {
			return false;
		}
		@Pc(8) Class112_Sub1_Sub2 local8 = this.aClass104_Sub1_46.aClass112_Sub1_Sub2_1;
		@Pc(20) Class93_Sub1_Sub3 local20 = new Class93_Sub1_Sub3(this.aClass104_Sub1_46, Class206.aClass206_22, Class226.aClass226_22, arg0.anInt314, arg0.anInt313);
		@Pc(22) boolean local22 = false;
		this.aClass104_Sub1_46.method20453(local8, (byte) 1);
		local8.method23435(0, local20);
		if (local8.method23442()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, arg0.anInt314, arg0.anInt313);
			OpenGL.glUseProgram(this.aClass191_8.anInt3349);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(this.aClass191_8.anInt3349, "heightMap"), 0);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(this.aClass191_8.anInt3349, "rcpRelief"), 1.0F / arg2);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(this.aClass191_8.anInt3349, "sampleSize"), 1.0F / (float) arg1.anInt314, 1.0F / (float) arg1.anInt313);
			for (@Pc(94) int local94 = 0; local94 < arg0.anInt315; local94++) {
				@Pc(105) float local105 = (float) local94 / (float) arg0.anInt315;
				this.aClass104_Sub1_46.method3887(arg1);
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
				arg0.method1702(0, 0, local94, arg0.anInt314, arg0.anInt313, 0, 0);
			}
			OpenGL.glUseProgram(0);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			local22 = true;
		}
		local8.method23435(0, null);
		this.aClass104_Sub1_46.method20456(local8, -1497248091);
		return local22;
	}
}
