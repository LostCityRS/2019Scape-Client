package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rx")
public class Class540 implements Interface18, Interface19, Interface56 {

	@OriginalMember(owner = "client!rx", name = "n", descriptor = "Lclient!ck;")
	final Class206 aClass206_28;

	@OriginalMember(owner = "client!rx", name = "e", descriptor = "Lclient!dg;")
	final Class226 aClass226_33;

	@OriginalMember(owner = "client!rx", name = "m", descriptor = "I")
	final int anInt5286;

	@OriginalMember(owner = "client!rx", name = "k", descriptor = "I")
	final int anInt5287;

	@OriginalMember(owner = "client!rx", name = "f", descriptor = "Lclient!aqv;")
	final Class104_Sub2_Sub2 aClass104_Sub2_Sub2_11;

	@OriginalMember(owner = "client!rx", name = "w", descriptor = "I")
	int anInt5285;

	@OriginalMember(owner = "client!rx", name = "<init>", descriptor = "(Lclient!aqv;Lclient!ck;Lclient!dg;II)V", line = 16)
	Class540(@OriginalArg(0) Class104_Sub2_Sub2 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) Class226 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass206_28 = arg1;
		this.aClass226_33 = arg2;
		this.anInt5286 = arg3;
		this.anInt5287 = arg4;
		this.aClass104_Sub2_Sub2_11 = arg0;
		@Pc(19) int[] local19 = new int[1];
		OpenGL.glGenRenderbuffersEXT(1, local19, 0);
		this.anInt5285 = local19[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt5285);
		OpenGL.glRenderbufferStorageEXT(36161, Class104_Sub2_Sub2.method21339(this.aClass206_28, this.aClass226_33), arg3, arg4);
	}

	@OriginalMember(owner = "client!rx", name = "<init>", descriptor = "(Lclient!aqv;Lclient!ck;Lclient!dg;III)V", line = 29)
	Class540(@OriginalArg(0) Class104_Sub2_Sub2 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) Class226 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass206_28 = arg1;
		this.aClass226_33 = arg2;
		this.anInt5286 = arg3;
		this.anInt5287 = arg4;
		this.aClass104_Sub2_Sub2_11 = arg0;
		@Pc(19) int[] local19 = new int[1];
		OpenGL.glGenRenderbuffersEXT(1, local19, 0);
		this.anInt5285 = local19[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt5285);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg5, Class104_Sub2_Sub2.method21339(this.aClass206_28, this.aClass226_33), arg3, arg4);
	}

	@OriginalMember(owner = "client!rx", name = "f", descriptor = "()I", line = 43)
	@Override
	public int method30886() {
		return this.anInt5286;
	}

	@OriginalMember(owner = "client!rx", name = "e", descriptor = "()I", line = 43)
	@Override
	public int method30890() {
		return this.anInt5286;
	}

	@OriginalMember(owner = "client!rx", name = "k", descriptor = "()I", line = 43)
	@Override
	public int method30889() {
		return this.anInt5286;
	}

	@OriginalMember(owner = "client!rx", name = "n", descriptor = "()I", line = 47)
	@Override
	public int method30888() {
		return this.anInt5287;
	}

	@OriginalMember(owner = "client!rx", name = "w", descriptor = "()I", line = 47)
	@Override
	public int method30887() {
		return this.anInt5287;
	}

	@OriginalMember(owner = "client!rx", name = "l", descriptor = "()I", line = 47)
	@Override
	public int method30891() {
		return this.anInt5287;
	}

	@OriginalMember(owner = "client!rx", name = "z", descriptor = "(I)V", line = 51)
	@Override
	public void method30895(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt5285);
	}

	@OriginalMember(owner = "client!rx", name = "p", descriptor = "(I)V", line = 51)
	@Override
	public void method30892(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt5285);
	}

	@OriginalMember(owner = "client!rx", name = "d", descriptor = "(I)V", line = 51)
	@Override
	public void method30894(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt5285);
	}

	@OriginalMember(owner = "client!rx", name = "c", descriptor = "(I)V", line = 51)
	@Override
	public void method30893(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt5285);
	}

	@OriginalMember(owner = "client!rx", name = "m", descriptor = "()V", line = 55)
	@Override
	public void method30884() {
		if (this.anInt5285 != 0) {
			@Pc(5) int[] local5 = new int[] { this.anInt5285 };
			OpenGL.glDeleteRenderbuffersEXT(1, local5, 0);
			this.anInt5285 = 0;
		}
	}

	@OriginalMember(owner = "client!rx", name = "u", descriptor = "()V", line = 55)
	@Override
	public void method30885() {
		if (this.anInt5285 != 0) {
			@Pc(5) int[] local5 = new int[] { this.anInt5285 };
			OpenGL.glDeleteRenderbuffersEXT(1, local5, 0);
			this.anInt5285 = 0;
		}
	}

	@OriginalMember(owner = "client!rx", name = "v", descriptor = "()V", line = 64)
	void method30896() {
		if (this.anInt5285 != 0) {
			this.aClass104_Sub2_Sub2_11.method21323(this.anInt5285, this.anInt5286 * this.anInt5287 * this.aClass226_33.anInt3646 * -1066472467 * this.aClass206_28.anInt3389 * -1639868421);
			this.anInt5285 = 0;
		}
	}

	@OriginalMember(owner = "client!rx", name = "o", descriptor = "()V", line = 64)
	void method30897() {
		if (this.anInt5285 != 0) {
			this.aClass104_Sub2_Sub2_11.method21323(this.anInt5285, this.anInt5286 * this.anInt5287 * this.aClass226_33.anInt3646 * -1066472467 * this.aClass206_28.anInt3389 * -1639868421);
			this.anInt5285 = 0;
		}
	}

	@OriginalMember(owner = "client!rx", name = "r", descriptor = "()V", line = 64)
	void method30898() {
		if (this.anInt5285 != 0) {
			this.aClass104_Sub2_Sub2_11.method21323(this.anInt5285, this.anInt5286 * this.anInt5287 * this.aClass226_33.anInt3646 * -1066472467 * this.aClass206_28.anInt3389 * -1639868421);
			this.anInt5285 = 0;
		}
	}

	@OriginalMember(owner = "client!rx", name = "s", descriptor = "()V", line = 64)
	void method30899() {
		if (this.anInt5285 != 0) {
			this.aClass104_Sub2_Sub2_11.method21323(this.anInt5285, this.anInt5286 * this.anInt5287 * this.aClass226_33.anInt3646 * -1066472467 * this.aClass206_28.anInt3389 * -1639868421);
			this.anInt5285 = 0;
		}
	}

	@OriginalMember(owner = "client!rx", name = "y", descriptor = "()V", line = 64)
	void method30900() {
		if (this.anInt5285 != 0) {
			this.aClass104_Sub2_Sub2_11.method21323(this.anInt5285, this.anInt5286 * this.anInt5287 * this.aClass226_33.anInt3646 * -1066472467 * this.aClass206_28.anInt3389 * -1639868421);
			this.anInt5285 = 0;
		}
	}

	@OriginalMember(owner = "client!rx", name = "finalize", descriptor = "()V", line = 71)
	@Override
	protected void finalize() throws Throwable {
		this.method30898();
		super.finalize();
	}

	@OriginalMember(owner = "client!rx", name = "hl", descriptor = "()V", line = 71)
	void method30901() throws Throwable {
		this.method30898();
		super.finalize();
	}
}
