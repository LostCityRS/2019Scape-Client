package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bu")
public final class Class196 {

	@OriginalMember(owner = "client!bu", name = "e", descriptor = "I")
	static final int anInt3366 = 34336;

	@OriginalMember(owner = "client!bu", name = "k", descriptor = "[I")
	static final int[] anIntArray300 = new int[1];

	@OriginalMember(owner = "client!bu", name = "n", descriptor = "Lclient!afa;")
	final Class104_Sub1 aClass104_Sub1_42;

	@OriginalMember(owner = "client!bu", name = "m", descriptor = "I")
	final int anInt3365;

	@OriginalMember(owner = "client!bu", name = "n", descriptor = "(Lclient!afa;ILjava/lang/String;)Lclient!bu;")
	static Class196 method24625(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(1) int local1 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(arg1, local1);
		OpenGL.glProgramStringARB(arg1, 34933, arg2);
		OpenGL.glGetIntegerv(34379, anIntArray300, 0);
		if (anIntArray300[0] == -1) {
			OpenGL.glBindProgramARB(arg1, 0);
			return new Class196(arg0, arg1, local1);
		} else {
			OpenGL.glBindProgramARB(arg1, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!bu", name = "e", descriptor = "(Lclient!afa;ILjava/lang/String;)Lclient!bu;")
	static Class196 method24626(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(1) int local1 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(arg1, local1);
		OpenGL.glProgramStringARB(arg1, 34933, arg2);
		OpenGL.glGetIntegerv(34379, anIntArray300, 0);
		if (anIntArray300[0] == -1) {
			OpenGL.glBindProgramARB(arg1, 0);
			return new Class196(arg0, arg1, local1);
		} else {
			OpenGL.glBindProgramARB(arg1, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!bu", name = "m", descriptor = "(Lclient!afa;ILjava/lang/String;)Lclient!bu;")
	static Class196 method24628(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(1) int local1 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(arg1, local1);
		OpenGL.glProgramStringARB(arg1, 34933, arg2);
		OpenGL.glGetIntegerv(34379, anIntArray300, 0);
		if (anIntArray300[0] == -1) {
			OpenGL.glBindProgramARB(arg1, 0);
			return new Class196(arg0, arg1, local1);
		} else {
			OpenGL.glBindProgramARB(arg1, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!bu", name = "k", descriptor = "(Lclient!afa;ILjava/lang/String;)Lclient!bu;")
	static Class196 method24629(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(1) int local1 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(arg1, local1);
		OpenGL.glProgramStringARB(arg1, 34933, arg2);
		OpenGL.glGetIntegerv(34379, anIntArray300, 0);
		if (anIntArray300[0] == -1) {
			OpenGL.glBindProgramARB(arg1, 0);
			return new Class196(arg0, arg1, local1);
		} else {
			OpenGL.glBindProgramARB(arg1, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!bu", name = "f", descriptor = "(Lclient!afa;ILjava/lang/String;)Lclient!bu;")
	static Class196 method24630(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		@Pc(1) int local1 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(arg1, local1);
		OpenGL.glProgramStringARB(arg1, 34933, arg2);
		OpenGL.glGetIntegerv(34379, anIntArray300, 0);
		if (anIntArray300[0] == -1) {
			OpenGL.glBindProgramARB(arg1, 0);
			return new Class196(arg0, arg1, local1);
		} else {
			OpenGL.glBindProgramARB(arg1, 0);
			return null;
		}
	}

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lclient!afa;II)V")
	Class196(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass104_Sub1_42 = arg0;
		this.anInt3365 = arg2;
	}

	@OriginalMember(owner = "client!bu", name = "finalize", descriptor = "()V")
	@Override
	void finalize() throws Throwable {
		this.aClass104_Sub1_42.method3824(this.anInt3365);
		super.finalize();
	}

	@OriginalMember(owner = "client!bu", name = "hl", descriptor = "()V")
	void method24627() throws Throwable {
		this.aClass104_Sub1_42.method3824(this.anInt3365);
		super.finalize();
	}
}
