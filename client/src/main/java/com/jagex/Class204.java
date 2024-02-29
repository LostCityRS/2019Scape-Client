package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class Class204 implements Interface15 {

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
	final int anInt3381;

	@OriginalMember(owner = "client!cg", name = "m", descriptor = "Lclient!adq;")
	final Class88_Sub1 aClass88_Sub1_3;

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
	final int anInt3382;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lclient!adq;II)V", line = 56)
	Class204(@OriginalArg(0) Class88_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3381 = arg2;
		this.aClass88_Sub1_3 = arg0;
		this.anInt3382 = arg1;
	}

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "()I", line = 63)
	@Override
	public int method30890() {
		return this.aClass88_Sub1_3.anInt290;
	}

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "()I", line = 63)
	@Override
	public int method30886() {
		return this.aClass88_Sub1_3.anInt290;
	}

	@OriginalMember(owner = "client!cg", name = "k", descriptor = "()I", line = 63)
	@Override
	public int method30889() {
		return this.aClass88_Sub1_3.anInt290;
	}

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "()I", line = 67)
	@Override
	public int method30888() {
		return this.aClass88_Sub1_3.anInt290;
	}

	@OriginalMember(owner = "client!cg", name = "l", descriptor = "()I", line = 67)
	@Override
	public int method30891() {
		return this.aClass88_Sub1_3.anInt290;
	}

	@OriginalMember(owner = "client!cg", name = "w", descriptor = "()I", line = 67)
	@Override
	public int method30887() {
		return this.aClass88_Sub1_3.anInt290;
	}

	@OriginalMember(owner = "client!cg", name = "z", descriptor = "(I)V", line = 71)
	@Override
	public void method25456(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.anInt3382, this.aClass88_Sub1_3.anInt2541, this.anInt3381);
	}

	@OriginalMember(owner = "client!cg", name = "p", descriptor = "(I)V", line = 71)
	@Override
	public void method25454(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.anInt3382, this.aClass88_Sub1_3.anInt2541, this.anInt3381);
	}

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "(I)V", line = 71)
	@Override
	public void method25455(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.anInt3382, this.aClass88_Sub1_3.anInt2541, this.anInt3381);
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)V", line = 71)
	@Override
	public void method25457(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.anInt3382, this.aClass88_Sub1_3.anInt2541, this.anInt3381);
	}

	@OriginalMember(owner = "client!cg", name = "m", descriptor = "()V", line = 74)
	@Override
	public void method30884() {
	}

	@OriginalMember(owner = "client!cg", name = "u", descriptor = "()V", line = 74)
	@Override
	public void method30885() {
	}
}
