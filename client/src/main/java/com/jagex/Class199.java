package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!by")
public final class Class199 {

	@OriginalMember(owner = "client!by", name = "t", descriptor = "[I")
	static final int[] anIntArray303 = new int[2];

	@OriginalMember(owner = "client!by", name = "f", descriptor = "Lclient!afm;")
	final Class102_Sub3 aClass102_Sub3_43;

	@OriginalMember(owner = "client!by", name = "e", descriptor = "I")
	final int anInt3371;

	@OriginalMember(owner = "client!by", name = "t", descriptor = "(Lclient!afm;[Lclient!be;)Lclient!by;")
	static Class199 method24921(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) Class181[] arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg1.length; local1++) {
			if (arg1[local1] == null || arg1[local1].anInt3318 <= 0) {
				return null;
			}
		}
		local1 = OpenGL.glCreateProgram();
		@Pc(22) int local22;
		for (local22 = 0; local22 < arg1.length; local22++) {
			OpenGL.glAttachShader(local1, arg1[local22].anInt3318);
		}
		OpenGL.glLinkProgram(local1);
		OpenGL.glGetProgramiv(local1, 35714, anIntArray303, 0);
		if (anIntArray303[0] == 0) {
			OpenGL.glGetProgramiv(local1, 35716, anIntArray303, 1);
			if (anIntArray303[1] > 1) {
				@Pc(60) byte[] local60 = new byte[anIntArray303[1]];
				OpenGL.glGetProgramInfoLog(local1, anIntArray303[1], anIntArray303, 0, local60, 0);
				System.out.println(new String(local60));
			}
			if (anIntArray303[0] == 0) {
				for (local22 = 0; local22 < arg1.length; local22++) {
					OpenGL.glDetachShader(local1, arg1[local22].anInt3318);
				}
				OpenGL.glDeleteProgram(local1);
				return null;
			}
		}
		return new Class199(arg0, local1, arg1);
	}

	@OriginalMember(owner = "client!by", name = "f", descriptor = "(Lclient!afm;[Lclient!be;)Lclient!by;")
	static Class199 method24923(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) Class181[] arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg1.length; local1++) {
			if (arg1[local1] == null || arg1[local1].anInt3318 <= 0) {
				return null;
			}
		}
		local1 = OpenGL.glCreateProgram();
		@Pc(22) int local22;
		for (local22 = 0; local22 < arg1.length; local22++) {
			OpenGL.glAttachShader(local1, arg1[local22].anInt3318);
		}
		OpenGL.glLinkProgram(local1);
		OpenGL.glGetProgramiv(local1, 35714, anIntArray303, 0);
		if (anIntArray303[0] == 0) {
			OpenGL.glGetProgramiv(local1, 35716, anIntArray303, 1);
			if (anIntArray303[1] > 1) {
				@Pc(60) byte[] local60 = new byte[anIntArray303[1]];
				OpenGL.glGetProgramInfoLog(local1, anIntArray303[1], anIntArray303, 0, local60, 0);
				System.out.println(new String(local60));
			}
			if (anIntArray303[0] == 0) {
				for (local22 = 0; local22 < arg1.length; local22++) {
					OpenGL.glDetachShader(local1, arg1[local22].anInt3318);
				}
				OpenGL.glDeleteProgram(local1);
				return null;
			}
		}
		return new Class199(arg0, local1, arg1);
	}

	@OriginalMember(owner = "client!by", name = "e", descriptor = "(Lclient!afm;[Lclient!be;)Lclient!by;")
	static Class199 method24924(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) Class181[] arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg1.length; local1++) {
			if (arg1[local1] == null || arg1[local1].anInt3318 <= 0) {
				return null;
			}
		}
		local1 = OpenGL.glCreateProgram();
		@Pc(22) int local22;
		for (local22 = 0; local22 < arg1.length; local22++) {
			OpenGL.glAttachShader(local1, arg1[local22].anInt3318);
		}
		OpenGL.glLinkProgram(local1);
		OpenGL.glGetProgramiv(local1, 35714, anIntArray303, 0);
		if (anIntArray303[0] == 0) {
			OpenGL.glGetProgramiv(local1, 35716, anIntArray303, 1);
			if (anIntArray303[1] > 1) {
				@Pc(60) byte[] local60 = new byte[anIntArray303[1]];
				OpenGL.glGetProgramInfoLog(local1, anIntArray303[1], anIntArray303, 0, local60, 0);
				System.out.println(new String(local60));
			}
			if (anIntArray303[0] == 0) {
				for (local22 = 0; local22 < arg1.length; local22++) {
					OpenGL.glDetachShader(local1, arg1[local22].anInt3318);
				}
				OpenGL.glDeleteProgram(local1);
				return null;
			}
		}
		return new Class199(arg0, local1, arg1);
	}

	@OriginalMember(owner = "client!by", name = "<init>", descriptor = "(Lclient!afm;I[Lclient!be;)V")
	Class199(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class181[] arg2) {
		this.aClass102_Sub3_43 = arg0;
		this.anInt3371 = arg1;
	}

	@OriginalMember(owner = "client!by", name = "ht", descriptor = "()V")
	void method24922() throws Throwable {
		this.aClass102_Sub3_43.method6409((long) this.anInt3371);
		super.finalize();
	}

	@OriginalMember(owner = "client!by", name = "finalize", descriptor = "()V")
	@Override
	void finalize() throws Throwable {
		this.aClass102_Sub3_43.method6409((long) this.anInt3371);
		super.finalize();
	}

	@OriginalMember(owner = "client!by", name = "hy", descriptor = "()V")
	void method24925() throws Throwable {
		this.aClass102_Sub3_43.method6409((long) this.anInt3371);
		super.finalize();
	}

	@OriginalMember(owner = "client!by", name = "hj", descriptor = "()V")
	void method24926() throws Throwable {
		this.aClass102_Sub3_43.method6409((long) this.anInt3371);
		super.finalize();
	}
}
