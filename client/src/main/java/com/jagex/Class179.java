package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class179 {

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
	static final int anInt3311 = 34336;

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "[I")
	static final int[] anIntArray291 = new int[1];

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "Lclient!afm;")
	final Class102_Sub3 aClass102_Sub3_39;

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
	final int anInt3312;

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "(Lclient!afm;ILjava/lang/String;)Lclient!bb;")
	static Class179 method24671(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(1) int local1 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(arg1, local1);
		OpenGL.glProgramStringARB(arg1, 34933, arg2);
		OpenGL.glGetIntegerv(34379, anIntArray291, 0);
		if (anIntArray291[0] == -1) {
			OpenGL.glBindProgramARB(arg1, 0);
			return new Class179(arg0, arg1, local1);
		} else {
			OpenGL.glBindProgramARB(arg1, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "(Lclient!afm;ILjava/lang/String;)Lclient!bb;")
	static Class179 method24674(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(1) int local1 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(arg1, local1);
		OpenGL.glProgramStringARB(arg1, 34933, arg2);
		OpenGL.glGetIntegerv(34379, anIntArray291, 0);
		if (anIntArray291[0] == -1) {
			OpenGL.glBindProgramARB(arg1, 0);
			return new Class179(arg0, arg1, local1);
		} else {
			OpenGL.glBindProgramARB(arg1, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "(Lclient!afm;ILjava/lang/String;)Lclient!bb;")
	static Class179 method24676(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(1) int local1 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(arg1, local1);
		OpenGL.glProgramStringARB(arg1, 34933, arg2);
		OpenGL.glGetIntegerv(34379, anIntArray291, 0);
		if (anIntArray291[0] == -1) {
			OpenGL.glBindProgramARB(arg1, 0);
			return new Class179(arg0, arg1, local1);
		} else {
			OpenGL.glBindProgramARB(arg1, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "(Lclient!afm;ILjava/lang/String;)Lclient!bb;")
	static Class179 method24677(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(1) int local1 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(arg1, local1);
		OpenGL.glProgramStringARB(arg1, 34933, arg2);
		OpenGL.glGetIntegerv(34379, anIntArray291, 0);
		if (anIntArray291[0] == -1) {
			OpenGL.glBindProgramARB(arg1, 0);
			return new Class179(arg0, arg1, local1);
		} else {
			OpenGL.glBindProgramARB(arg1, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lclient!afm;II)V")
	Class179(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass102_Sub3_39 = arg0;
		this.anInt3312 = arg2;
	}

	@OriginalMember(owner = "client!bb", name = "hj", descriptor = "()V")
	void method24672() throws Throwable {
		this.aClass102_Sub3_39.method6438(this.anInt3312);
		super.finalize();
	}

	@OriginalMember(owner = "client!bb", name = "hy", descriptor = "()V")
	void method24673() throws Throwable {
		this.aClass102_Sub3_39.method6438(this.anInt3312);
		super.finalize();
	}

	@OriginalMember(owner = "client!bb", name = "ht", descriptor = "()V")
	void method24675() throws Throwable {
		this.aClass102_Sub3_39.method6438(this.anInt3312);
		super.finalize();
	}

	@OriginalMember(owner = "client!bb", name = "finalize", descriptor = "()V")
	@Override
	void finalize() throws Throwable {
		this.aClass102_Sub3_39.method6438(this.anInt3312);
		super.finalize();
	}
}
