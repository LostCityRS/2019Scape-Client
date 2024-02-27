package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rx")
public final class Class540 implements Interface18, Interface19, Interface56 {

	@OriginalMember(owner = "client!rx", name = "n", descriptor = "Lclient!ck;")
	final Class206 aClass206_28;

	@OriginalMember(owner = "client!rx", name = "e", descriptor = "Lclient!dg;")
	final Class226 aClass226_33;

	@OriginalMember(owner = "client!rx", name = "m", descriptor = "I")
	final int anInt5447;

	@OriginalMember(owner = "client!rx", name = "k", descriptor = "I")
	final int anInt5448;

	@OriginalMember(owner = "client!rx", name = "f", descriptor = "Lclient!aqv;")
	final Class104_Sub2_Sub2 aClass104_Sub2_Sub2_11;

	@OriginalMember(owner = "client!rx", name = "w", descriptor = "I")
	int anInt5446;

	@OriginalMember(owner = "client!rx", name = "<init>", descriptor = "(Lclient!aqv;Lclient!ck;Lclient!dg;III)V")
	Class540(@OriginalArg(0) Class104_Sub2_Sub2 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) Class226 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass206_28 = arg1;
		this.aClass226_33 = arg2;
		this.anInt5447 = arg3;
		this.anInt5448 = arg4;
		this.aClass104_Sub2_Sub2_11 = arg0;
		@Pc(19) int[] local19 = new int[1];
		OpenGL.glGenRenderbuffersEXT(1, local19, 0);
		this.anInt5446 = local19[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt5446);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg5, Class104_Sub2_Sub2.method21321(this.aClass206_28, this.aClass226_33), arg3, arg4);
	}

	@OriginalMember(owner = "client!rx", name = "<init>", descriptor = "(Lclient!aqv;Lclient!ck;Lclient!dg;II)V")
	Class540(@OriginalArg(0) Class104_Sub2_Sub2 arg0, @OriginalArg(1) Class206 arg1, @OriginalArg(2) Class226 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass206_28 = arg1;
		this.aClass226_33 = arg2;
		this.anInt5447 = arg3;
		this.anInt5448 = arg4;
		this.aClass104_Sub2_Sub2_11 = arg0;
		@Pc(19) int[] local19 = new int[1];
		OpenGL.glGenRenderbuffersEXT(1, local19, 0);
		this.anInt5446 = local19[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt5446);
		OpenGL.glRenderbufferStorageEXT(36161, Class104_Sub2_Sub2.method21321(this.aClass206_28, this.aClass226_33), arg3, arg4);
	}

	@OriginalMember(owner = "client!rx", name = "f", descriptor = "()I")
	@Override
	public int method31067() {
		return this.anInt5447;
	}

	@OriginalMember(owner = "client!rx", name = "e", descriptor = "()I")
	@Override
	public int method31071() {
		return this.anInt5447;
	}

	@OriginalMember(owner = "client!rx", name = "n", descriptor = "()I")
	@Override
	public int method31069() {
		return this.anInt5448;
	}

	@OriginalMember(owner = "client!rx", name = "z", descriptor = "(I)V")
	@Override
	public void method31076(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt5446);
	}

	@OriginalMember(owner = "client!rx", name = "m", descriptor = "()V")
	@Override
	public void method31065() {
		if (this.anInt5446 != 0) {
			@Pc(5) int[] local5 = new int[] { this.anInt5446 };
			OpenGL.glDeleteRenderbuffersEXT(1, local5, 0);
			this.anInt5446 = 0;
		}
	}

	@OriginalMember(owner = "client!rx", name = "u", descriptor = "()V")
	@Override
	public void method31066() {
		if (this.anInt5446 != 0) {
			@Pc(5) int[] local5 = new int[] { this.anInt5446 };
			OpenGL.glDeleteRenderbuffersEXT(1, local5, 0);
			this.anInt5446 = 0;
		}
	}

	@OriginalMember(owner = "client!rx", name = "v", descriptor = "()V")
	void method31077() {
		if (this.anInt5446 != 0) {
			this.aClass104_Sub2_Sub2_11.method21315(this.anInt5446, this.anInt5447 * this.anInt5448 * this.aClass226_33.anInt3687 * -1066472467 * this.aClass206_28.anInt3389 * -1639868421);
			this.anInt5446 = 0;
		}
	}

	@OriginalMember(owner = "client!rx", name = "w", descriptor = "()I")
	@Override
	public int method31068() {
		return this.anInt5448;
	}

	@OriginalMember(owner = "client!rx", name = "k", descriptor = "()I")
	@Override
	public int method31070() {
		return this.anInt5447;
	}

	@OriginalMember(owner = "client!rx", name = "o", descriptor = "()V")
	void method31078() {
		if (this.anInt5446 != 0) {
			this.aClass104_Sub2_Sub2_11.method21315(this.anInt5446, this.anInt5447 * this.anInt5448 * this.aClass226_33.anInt3687 * -1066472467 * this.aClass206_28.anInt3389 * -1639868421);
			this.anInt5446 = 0;
		}
	}

	@OriginalMember(owner = "client!rx", name = "l", descriptor = "()I")
	@Override
	public int method31072() {
		return this.anInt5448;
	}

	@OriginalMember(owner = "client!rx", name = "r", descriptor = "()V")
	void method31079() {
		if (this.anInt5446 != 0) {
			this.aClass104_Sub2_Sub2_11.method21315(this.anInt5446, this.anInt5447 * this.anInt5448 * this.aClass226_33.anInt3687 * -1066472467 * this.aClass206_28.anInt3389 * -1639868421);
			this.anInt5446 = 0;
		}
	}

	@OriginalMember(owner = "client!rx", name = "finalize", descriptor = "()V")
	@Override
	void finalize() throws Throwable {
		this.method31079();
		super.finalize();
	}

	@OriginalMember(owner = "client!rx", name = "p", descriptor = "(I)V")
	@Override
	public void method31073(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt5446);
	}

	@OriginalMember(owner = "client!rx", name = "d", descriptor = "(I)V")
	@Override
	public void method31075(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt5446);
	}

	@OriginalMember(owner = "client!rx", name = "c", descriptor = "(I)V")
	@Override
	public void method31074(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt5446);
	}

	@OriginalMember(owner = "client!rx", name = "hl", descriptor = "()V")
	void method31080() throws Throwable {
		this.method31079();
		super.finalize();
	}

	@OriginalMember(owner = "client!rx", name = "s", descriptor = "()V")
	void method31081() {
		if (this.anInt5446 != 0) {
			this.aClass104_Sub2_Sub2_11.method21315(this.anInt5446, this.anInt5447 * this.anInt5448 * this.aClass226_33.anInt3687 * -1066472467 * this.aClass206_28.anInt3389 * -1639868421);
			this.anInt5446 = 0;
		}
	}

	@OriginalMember(owner = "client!rx", name = "y", descriptor = "()V")
	void method31082() {
		if (this.anInt5446 != 0) {
			this.aClass104_Sub2_Sub2_11.method21315(this.anInt5446, this.anInt5447 * this.anInt5448 * this.aClass226_33.anInt3687 * -1066472467 * this.aClass206_28.anInt3389 * -1639868421);
			this.anInt5446 = 0;
		}
	}
}
