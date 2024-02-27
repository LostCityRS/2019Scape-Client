package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aeg")
public final class Class93_Sub1_Sub3 extends Class93_Sub1 implements Interface15 {

	@OriginalMember(owner = "client!aeg", name = "d", descriptor = "[I")
	static final int[] anIntArray28 = new int[1];

	@OriginalMember(owner = "client!aeg", name = "k", descriptor = "Lclient!afa;")
	final Class104_Sub1 aClass104_Sub1_9;

	@OriginalMember(owner = "client!aeg", name = "w", descriptor = "I")
	final int anInt356;

	@OriginalMember(owner = "client!aeg", name = "l", descriptor = "I")
	final int anInt355;

	@OriginalMember(owner = "client!aeg", name = "z", descriptor = "Lclient!ck;")
	final Class206 aClass206_5;

	@OriginalMember(owner = "client!aeg", name = "u", descriptor = "Lclient!dg;")
	final Class226 aClass226_5;

	@OriginalMember(owner = "client!aeg", name = "f", descriptor = "I")
	int anInt358;

	@OriginalMember(owner = "client!aeg", name = "p", descriptor = "I")
	final int anInt357;

	@OriginalMember(owner = "client!aeg", name = "<init>", descriptor = "(Lclient!afa;Lclient!ck;Lclient!dg;III)V")
	Class93_Sub1_Sub3(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) Class226 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass104_Sub1_9 = arg0;
		this.anInt356 = arg3;
		this.anInt355 = arg4;
		this.aClass206_5 = arg1;
		this.aClass226_5 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, anIntArray28, 0);
		this.anInt358 = anIntArray28[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt358);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg5, Class104_Sub1.method3826(this.aClass206_5, this.aClass226_5), this.anInt356, this.anInt355);
		this.anInt357 = this.anInt356 * this.anInt355 * this.aClass206_5.anInt3389 * -1639868421 * this.aClass226_5.anInt3687 * -1066472467;
	}

	@OriginalMember(owner = "client!aeg", name = "<init>", descriptor = "(Lclient!afa;Lclient!ck;Lclient!dg;II)V")
	Class93_Sub1_Sub3(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) Class226 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass104_Sub1_9 = arg0;
		this.anInt356 = arg3;
		this.anInt355 = arg4;
		this.aClass206_5 = arg1;
		this.aClass226_5 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, anIntArray28, 0);
		this.anInt358 = anIntArray28[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt358);
		OpenGL.glRenderbufferStorageEXT(36161, Class104_Sub1.method3826(this.aClass206_5, this.aClass226_5), this.anInt356, this.anInt355);
		this.anInt357 = this.anInt356 * this.anInt355 * this.aClass206_5.anInt3389 * -1639868421 * this.aClass226_5.anInt3687 * -1066472467;
	}

	@OriginalMember(owner = "client!aeg", name = "n", descriptor = "()I")
	@Override
	public int method31069() {
		return this.anInt355;
	}

	@OriginalMember(owner = "client!aeg", name = "e", descriptor = "()I")
	@Override
	public int method31071() {
		return this.anInt356;
	}

	@OriginalMember(owner = "client!aeg", name = "f", descriptor = "()I")
	@Override
	public int method31067() {
		return this.anInt356;
	}

	@OriginalMember(owner = "client!aeg", name = "r", descriptor = "()V")
	void method2214() {
		if (this.anInt358 != 0) {
			this.aClass104_Sub1_9.method3823(this.anInt358, this.anInt357);
			this.anInt358 = 0;
		}
	}

	@OriginalMember(owner = "client!aeg", name = "finalize", descriptor = "()V")
	@Override
	protected void finalize() throws Throwable {
		this.method2214();
		super.finalize();
	}

	@OriginalMember(owner = "client!aeg", name = "z", descriptor = "(I)V")
	@Override
	public void method25549(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt358);
	}

	@OriginalMember(owner = "client!aeg", name = "m", descriptor = "()V")
	@Override
	public void method31065() {
		if (this.anInt358 != 0) {
			@Pc(5) int[] local5 = new int[] { this.anInt358 };
			OpenGL.glDeleteRenderbuffersEXT(1, local5, 0);
			this.anInt358 = 0;
		}
	}

	@OriginalMember(owner = "client!aeg", name = "k", descriptor = "()I")
	@Override
	public int method31070() {
		return this.anInt356;
	}

	@OriginalMember(owner = "client!aeg", name = "w", descriptor = "()I")
	@Override
	public int method31068() {
		return this.anInt355;
	}

	@OriginalMember(owner = "client!aeg", name = "l", descriptor = "()I")
	@Override
	public int method31072() {
		return this.anInt355;
	}

	@OriginalMember(owner = "client!aeg", name = "u", descriptor = "()V")
	@Override
	public void method31066() {
		if (this.anInt358 != 0) {
			@Pc(5) int[] local5 = new int[] { this.anInt358 };
			OpenGL.glDeleteRenderbuffersEXT(1, local5, 0);
			this.anInt358 = 0;
		}
	}

	@OriginalMember(owner = "client!aeg", name = "hl", descriptor = "()V")
	void method2215() throws Throwable {
		this.method2214();
		super.finalize();
	}

	@OriginalMember(owner = "client!aeg", name = "p", descriptor = "(I)V")
	@Override
	public void method25547(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt358);
	}

	@OriginalMember(owner = "client!aeg", name = "d", descriptor = "(I)V")
	@Override
	public void method25548(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt358);
	}

	@OriginalMember(owner = "client!aeg", name = "c", descriptor = "(I)V")
	@Override
	public void method25550(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt358);
	}

	@OriginalMember(owner = "client!aeg", name = "v", descriptor = "()V")
	void method2216() {
		if (this.anInt358 != 0) {
			this.aClass104_Sub1_9.method3823(this.anInt358, this.anInt357);
			this.anInt358 = 0;
		}
	}
}
