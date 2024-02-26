package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class534 implements Interface18, Interface17, Interface56 {

	@OriginalMember(owner = "client!rm", name = "f", descriptor = "Lclient!co;")
	final Class210 aClass210_28;

	@OriginalMember(owner = "client!rm", name = "t", descriptor = "Lclient!dy;")
	final Class236 aClass236_33;

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
	final int anInt5075;

	@OriginalMember(owner = "client!rm", name = "u", descriptor = "I")
	final int anInt5076;

	@OriginalMember(owner = "client!rm", name = "l", descriptor = "Lclient!aqi;")
	final Class102_Sub1_Sub1 aClass102_Sub1_Sub1_11;

	@OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
	int anInt5074;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lclient!aqi;Lclient!co;Lclient!dy;III)V")
	Class534(@OriginalArg(0) Class102_Sub1_Sub1 arg0, @OriginalArg(1) Class210 arg1, @OriginalArg(2) Class236 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass210_28 = arg1;
		this.aClass236_33 = arg2;
		this.anInt5075 = arg3;
		this.anInt5076 = arg4;
		this.aClass102_Sub1_Sub1_11 = arg0;
		@Pc(19) int[] local19 = new int[1];
		OpenGL.glGenRenderbuffersEXT(1, local19, 0);
		this.anInt5074 = local19[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt5074);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg5, Class102_Sub1_Sub1.method20103(this.aClass210_28, this.aClass236_33), arg3, arg4);
	}

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lclient!aqi;Lclient!co;Lclient!dy;II)V")
	Class534(@OriginalArg(0) Class102_Sub1_Sub1 arg0, @OriginalArg(1) Class210 arg1, @OriginalArg(2) Class236 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass210_28 = arg1;
		this.aClass236_33 = arg2;
		this.anInt5075 = arg3;
		this.anInt5076 = arg4;
		this.aClass102_Sub1_Sub1_11 = arg0;
		@Pc(19) int[] local19 = new int[1];
		OpenGL.glGenRenderbuffersEXT(1, local19, 0);
		this.anInt5074 = local19[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt5074);
		OpenGL.glRenderbufferStorageEXT(36161, Class102_Sub1_Sub1.method20103(this.aClass210_28, this.aClass236_33), arg3, arg4);
	}

	@OriginalMember(owner = "client!rm", name = "w", descriptor = "()V")
	void method30847() {
		if (this.anInt5074 != 0) {
			this.aClass102_Sub1_Sub1_11.method20100(this.anInt5074, this.anInt5075 * this.anInt5076 * this.aClass236_33.anInt3804 * -369125885 * this.aClass210_28.anInt3600 * 499559879);
			this.anInt5074 = 0;
		}
	}

	@OriginalMember(owner = "client!rm", name = "m", descriptor = "()V")
	@Override
	public void method30835() {
		if (this.anInt5074 != 0) {
			@Pc(5) int[] local5 = new int[] { this.anInt5074 };
			OpenGL.glDeleteRenderbuffersEXT(1, local5, 0);
			this.anInt5074 = 0;
		}
	}

	@OriginalMember(owner = "client!rm", name = "t", descriptor = "()I")
	@Override
	public int method30843() {
		return this.anInt5075;
	}

	@OriginalMember(owner = "client!rm", name = "i", descriptor = "()I")
	@Override
	public int method30842() {
		return this.anInt5076;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
	@Override
	public void method30846(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt5074);
	}

	@OriginalMember(owner = "client!rm", name = "x", descriptor = "()V")
	void method30848() {
		if (this.anInt5074 != 0) {
			this.aClass102_Sub1_Sub1_11.method20100(this.anInt5074, this.anInt5075 * this.anInt5076 * this.aClass236_33.anInt3804 * -369125885 * this.aClass210_28.anInt3600 * 499559879);
			this.anInt5074 = 0;
		}
	}

	@OriginalMember(owner = "client!rm", name = "finalize", descriptor = "()V")
	@Override
	protected void finalize() throws Throwable {
		this.method30848();
		super.finalize();
	}

	@OriginalMember(owner = "client!rm", name = "u", descriptor = "()I")
	@Override
	public int method30840() {
		return this.anInt5075;
	}

	@OriginalMember(owner = "client!rm", name = "l", descriptor = "()I")
	@Override
	public int method30841() {
		return this.anInt5075;
	}

	@OriginalMember(owner = "client!rm", name = "g", descriptor = "()I")
	@Override
	public int method30839() {
		return this.anInt5075;
	}

	@OriginalMember(owner = "client!rm", name = "f", descriptor = "()I")
	@Override
	public int method30838() {
		return this.anInt5076;
	}

	@OriginalMember(owner = "client!rm", name = "e", descriptor = "()V")
	@Override
	public void method30837() {
		if (this.anInt5074 != 0) {
			@Pc(5) int[] local5 = new int[] { this.anInt5074 };
			OpenGL.glDeleteRenderbuffersEXT(1, local5, 0);
			this.anInt5074 = 0;
		}
	}

	@OriginalMember(owner = "client!rm", name = "j", descriptor = "()V")
	@Override
	public void method30834() {
		if (this.anInt5074 != 0) {
			@Pc(5) int[] local5 = new int[] { this.anInt5074 };
			OpenGL.glDeleteRenderbuffersEXT(1, local5, 0);
			this.anInt5074 = 0;
		}
	}

	@OriginalMember(owner = "client!rm", name = "hy", descriptor = "()V")
	void method30849() throws Throwable {
		this.method30848();
		super.finalize();
	}

	@OriginalMember(owner = "client!rm", name = "hj", descriptor = "()V")
	void method30850() throws Throwable {
		this.method30848();
		super.finalize();
	}

	@OriginalMember(owner = "client!rm", name = "ht", descriptor = "()V")
	void method30851() throws Throwable {
		this.method30848();
		super.finalize();
	}

	@OriginalMember(owner = "client!rm", name = "s", descriptor = "(I)V")
	@Override
	public void method30845(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt5074);
	}

	@OriginalMember(owner = "client!rm", name = "o", descriptor = "()V")
	@Override
	public void method30836() {
		if (this.anInt5074 != 0) {
			@Pc(5) int[] local5 = new int[] { this.anInt5074 };
			OpenGL.glDeleteRenderbuffersEXT(1, local5, 0);
			this.anInt5074 = 0;
		}
	}

	@OriginalMember(owner = "client!rm", name = "k", descriptor = "(I)V")
	@Override
	public void method30844(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferRenderbufferEXT(36160, arg0, 36161, this.anInt5074);
	}

	@OriginalMember(owner = "client!rm", name = "r", descriptor = "()V")
	void method30852() {
		if (this.anInt5074 != 0) {
			this.aClass102_Sub1_Sub1_11.method20100(this.anInt5074, this.anInt5075 * this.anInt5076 * this.aClass236_33.anInt3804 * -369125885 * this.aClass210_28.anInt3600 * 499559879);
			this.anInt5074 = 0;
		}
	}
}
