package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public final class Class213 implements Interface15 {

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "I")
	final int anInt3642;

	@OriginalMember(owner = "client!ct", name = "n", descriptor = "Lclient!adt;")
	final Class88_Sub2 aClass88_Sub2_6;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lclient!adt;I)V")
	Class213(@OriginalArg(0) Class88_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt3642 = arg1;
		this.aClass88_Sub2_6 = arg0;
	}

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "()I")
	@Override
	public int method31071() {
		return this.aClass88_Sub2_6.anInt2546;
	}

	@OriginalMember(owner = "client!ct", name = "n", descriptor = "()I")
	@Override
	public int method31069() {
		return this.aClass88_Sub2_6.anInt2545;
	}

	@OriginalMember(owner = "client!ct", name = "z", descriptor = "(I)V")
	@Override
	public void method25549(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.aClass88_Sub2_6.anInt2543, this.aClass88_Sub2_6.anInt2541, this.anInt3642);
	}

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "(I)V")
	@Override
	public void method25548(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.aClass88_Sub2_6.anInt2543, this.aClass88_Sub2_6.anInt2541, this.anInt3642);
	}

	@OriginalMember(owner = "client!ct", name = "u", descriptor = "()V")
	@Override
	public void method31066() {
	}

	@OriginalMember(owner = "client!ct", name = "f", descriptor = "()I")
	@Override
	public int method31067() {
		return this.aClass88_Sub2_6.anInt2546;
	}

	@OriginalMember(owner = "client!ct", name = "w", descriptor = "()I")
	@Override
	public int method31068() {
		return this.aClass88_Sub2_6.anInt2545;
	}

	@OriginalMember(owner = "client!ct", name = "l", descriptor = "()I")
	@Override
	public int method31072() {
		return this.aClass88_Sub2_6.anInt2545;
	}

	@OriginalMember(owner = "client!ct", name = "k", descriptor = "()I")
	@Override
	public int method31070() {
		return this.aClass88_Sub2_6.anInt2546;
	}

	@OriginalMember(owner = "client!ct", name = "p", descriptor = "(I)V")
	@Override
	public void method25547(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.aClass88_Sub2_6.anInt2543, this.aClass88_Sub2_6.anInt2541, this.anInt3642);
	}

	@OriginalMember(owner = "client!ct", name = "m", descriptor = "()V")
	@Override
	public void method31065() {
	}

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "(I)V")
	@Override
	public void method25550(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.aClass88_Sub2_6.anInt2543, this.aClass88_Sub2_6.anInt2541, this.anInt3642);
	}
}
