package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public final class Class216 implements Interface16 {

	@OriginalMember(owner = "client!cv", name = "f", descriptor = "I")
	final int anInt3611;

	@OriginalMember(owner = "client!cv", name = "e", descriptor = "Lclient!adr;")
	final Class84_Sub2 aClass84_Sub2_3;

	@OriginalMember(owner = "client!cv", name = "t", descriptor = "I")
	final int anInt3610;

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Lclient!adr;II)V")
	Class216(@OriginalArg(0) Class84_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3611 = arg2;
		this.aClass84_Sub2_3 = arg0;
		this.anInt3610 = arg1;
	}

	@OriginalMember(owner = "client!cv", name = "g", descriptor = "()I")
	@Override
	public int method30839() {
		return this.aClass84_Sub2_3.anInt300;
	}

	@OriginalMember(owner = "client!cv", name = "t", descriptor = "()I")
	@Override
	public int method30843() {
		return this.aClass84_Sub2_3.anInt300;
	}

	@OriginalMember(owner = "client!cv", name = "f", descriptor = "()I")
	@Override
	public int method30838() {
		return this.aClass84_Sub2_3.anInt300;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V")
	@Override
	public void method25856(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.anInt3610, this.aClass84_Sub2_3.anInt2592, this.anInt3611);
	}

	@OriginalMember(owner = "client!cv", name = "e", descriptor = "()V")
	@Override
	public void method30837() {
	}

	@OriginalMember(owner = "client!cv", name = "j", descriptor = "()V")
	@Override
	public void method30834() {
	}

	@OriginalMember(owner = "client!cv", name = "l", descriptor = "()I")
	@Override
	public int method30841() {
		return this.aClass84_Sub2_3.anInt300;
	}

	@OriginalMember(owner = "client!cv", name = "u", descriptor = "()I")
	@Override
	public int method30840() {
		return this.aClass84_Sub2_3.anInt300;
	}

	@OriginalMember(owner = "client!cv", name = "m", descriptor = "()V")
	@Override
	public void method30835() {
	}

	@OriginalMember(owner = "client!cv", name = "s", descriptor = "(I)V")
	@Override
	public void method25855(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.anInt3610, this.aClass84_Sub2_3.anInt2592, this.anInt3611);
	}

	@OriginalMember(owner = "client!cv", name = "o", descriptor = "()V")
	@Override
	public void method30836() {
	}

	@OriginalMember(owner = "client!cv", name = "i", descriptor = "()I")
	@Override
	public int method30842() {
		return this.aClass84_Sub2_3.anInt300;
	}
}
