package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public final class Class207 implements Interface16 {

	@OriginalMember(owner = "client!ck", name = "t", descriptor = "I")
	final int anInt3396;

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "Lclient!adm;")
	final Class84_Sub1 aClass84_Sub1_7;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lclient!adm;I)V")
	Class207(@OriginalArg(0) Class84_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.anInt3396 = arg1;
		this.aClass84_Sub1_7 = arg0;
	}

	@OriginalMember(owner = "client!ck", name = "i", descriptor = "()I")
	@Override
	public int method30842() {
		return this.aClass84_Sub1_7.anInt2597;
	}

	@OriginalMember(owner = "client!ck", name = "t", descriptor = "()I")
	@Override
	public int method30843() {
		return this.aClass84_Sub1_7.anInt2596;
	}

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "()I")
	@Override
	public int method30838() {
		return this.aClass84_Sub1_7.anInt2597;
	}

	@OriginalMember(owner = "client!ck", name = "o", descriptor = "()V")
	@Override
	public void method30836() {
	}

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "()V")
	@Override
	public void method30837() {
	}

	@OriginalMember(owner = "client!ck", name = "u", descriptor = "()I")
	@Override
	public int method30840() {
		return this.aClass84_Sub1_7.anInt2596;
	}

	@OriginalMember(owner = "client!ck", name = "l", descriptor = "()I")
	@Override
	public int method30841() {
		return this.aClass84_Sub1_7.anInt2596;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
	@Override
	public void method25856(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.aClass84_Sub1_7.anInt2587, this.aClass84_Sub1_7.anInt2592, this.anInt3396);
	}

	@OriginalMember(owner = "client!ck", name = "s", descriptor = "(I)V")
	@Override
	public void method25855(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.aClass84_Sub1_7.anInt2587, this.aClass84_Sub1_7.anInt2592, this.anInt3396);
	}

	@OriginalMember(owner = "client!ck", name = "m", descriptor = "()V")
	@Override
	public void method30835() {
	}

	@OriginalMember(owner = "client!ck", name = "j", descriptor = "()V")
	@Override
	public void method30834() {
	}

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "()I")
	@Override
	public int method30839() {
		return this.aClass84_Sub1_7.anInt2596;
	}
}
