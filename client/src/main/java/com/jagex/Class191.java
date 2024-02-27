package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class191 {

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "[I")
	static final int[] anIntArray299 = new int[2];

	@OriginalMember(owner = "client!bn", name = "n", descriptor = "Lclient!afa;")
	final Class104_Sub1 aClass104_Sub1_40;

	@OriginalMember(owner = "client!bn", name = "m", descriptor = "I")
	final int anInt3349;

	@OriginalMember(owner = "client!bn", name = "n", descriptor = "(Lclient!afa;[Lclient!bm;)Lclient!bn;")
	static Class191 method24601(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) Class190[] arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg1.length; local1++) {
			if (arg1[local1] == null || arg1[local1].anInt3348 <= 0) {
				return null;
			}
		}
		local1 = OpenGL.glCreateProgram();
		@Pc(22) int local22;
		for (local22 = 0; local22 < arg1.length; local22++) {
			OpenGL.glAttachShader(local1, arg1[local22].anInt3348);
		}
		OpenGL.glLinkProgram(local1);
		OpenGL.glGetProgramiv(local1, 35714, anIntArray299, 0);
		if (anIntArray299[0] == 0) {
			OpenGL.glGetProgramiv(local1, 35716, anIntArray299, 1);
			if (anIntArray299[1] > 1) {
				@Pc(60) byte[] local60 = new byte[anIntArray299[1]];
				OpenGL.glGetProgramInfoLog(local1, anIntArray299[1], anIntArray299, 0, local60, 0);
				System.out.println(new String(local60));
			}
			if (anIntArray299[0] == 0) {
				for (local22 = 0; local22 < arg1.length; local22++) {
					OpenGL.glDetachShader(local1, arg1[local22].anInt3348);
				}
				OpenGL.glDeleteProgram(local1);
				return null;
			}
		}
		return new Class191(arg0, local1, arg1);
	}

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "(Lclient!afa;[Lclient!bm;)Lclient!bn;")
	static Class191 method24602(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) Class190[] arg1) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < arg1.length; local1++) {
			if (arg1[local1] == null || arg1[local1].anInt3348 <= 0) {
				return null;
			}
		}
		local1 = OpenGL.glCreateProgram();
		@Pc(22) int local22;
		for (local22 = 0; local22 < arg1.length; local22++) {
			OpenGL.glAttachShader(local1, arg1[local22].anInt3348);
		}
		OpenGL.glLinkProgram(local1);
		OpenGL.glGetProgramiv(local1, 35714, anIntArray299, 0);
		if (anIntArray299[0] == 0) {
			OpenGL.glGetProgramiv(local1, 35716, anIntArray299, 1);
			if (anIntArray299[1] > 1) {
				@Pc(60) byte[] local60 = new byte[anIntArray299[1]];
				OpenGL.glGetProgramInfoLog(local1, anIntArray299[1], anIntArray299, 0, local60, 0);
				System.out.println(new String(local60));
			}
			if (anIntArray299[0] == 0) {
				for (local22 = 0; local22 < arg1.length; local22++) {
					OpenGL.glDetachShader(local1, arg1[local22].anInt3348);
				}
				OpenGL.glDeleteProgram(local1);
				return null;
			}
		}
		return new Class191(arg0, local1, arg1);
	}

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lclient!afa;I[Lclient!bm;)V")
	Class191(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class190[] arg2) {
		this.aClass104_Sub1_40 = arg0;
		this.anInt3349 = arg1;
	}

	@OriginalMember(owner = "client!bn", name = "hl", descriptor = "()V")
	void method24600() throws Throwable {
		this.aClass104_Sub1_40.method3843((long) this.anInt3349);
		super.finalize();
	}

	@OriginalMember(owner = "client!bn", name = "finalize", descriptor = "()V")
	@Override
	void finalize() throws Throwable {
		this.aClass104_Sub1_40.method3843((long) this.anInt3349);
		super.finalize();
	}
}
