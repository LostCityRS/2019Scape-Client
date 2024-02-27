package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public final class Class204 implements Interface15 {

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
	final int anInt3381;

	@OriginalMember(owner = "client!cg", name = "m", descriptor = "Lclient!adq;")
	final Class88_Sub1 aClass88_Sub1_3;

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
	final int anInt3382;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lclient!adq;II)V")
	Class204(@OriginalArg(0) Class88_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3381 = arg2;
		this.aClass88_Sub1_3 = arg0;
		this.anInt3382 = arg1;
	}

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "()I")
	@Override
	public int method31071() {
		return this.aClass88_Sub1_3.anInt290;
	}

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "()I")
	@Override
	public int method31069() {
		return this.aClass88_Sub1_3.anInt290;
	}

	@OriginalMember(owner = "client!cg", name = "z", descriptor = "(I)V")
	@Override
	public void method25549(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.anInt3382, this.aClass88_Sub1_3.anInt2541, this.anInt3381);
	}

	@OriginalMember(owner = "client!cg", name = "m", descriptor = "()V")
	@Override
	public void method31065() {
	}

	@OriginalMember(owner = "client!cg", name = "u", descriptor = "()V")
	@Override
	public void method31066() {
	}

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "()I")
	@Override
	public int method31067() {
		return this.aClass88_Sub1_3.anInt290;
	}

	@OriginalMember(owner = "client!cg", name = "k", descriptor = "()I")
	@Override
	public int method31070() {
		return this.aClass88_Sub1_3.anInt290;
	}

	@OriginalMember(owner = "client!cg", name = "l", descriptor = "()I")
	@Override
	public int method31072() {
		return this.aClass88_Sub1_3.anInt290;
	}

	@OriginalMember(owner = "client!cg", name = "w", descriptor = "()I")
	@Override
	public int method31068() {
		return this.aClass88_Sub1_3.anInt290;
	}

	@OriginalMember(owner = "client!cg", name = "p", descriptor = "(I)V")
	@Override
	public void method25547(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.anInt3382, this.aClass88_Sub1_3.anInt2541, this.anInt3381);
	}

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "(I)V")
	@Override
	public void method25548(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.anInt3382, this.aClass88_Sub1_3.anInt2541, this.anInt3381);
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)V")
	@Override
	public void method25550(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.anInt3382, this.aClass88_Sub1_3.anInt2541, this.anInt3381);
	}
}
