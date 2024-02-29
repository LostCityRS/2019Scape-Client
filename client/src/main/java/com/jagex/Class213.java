package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class Class213 implements Interface15 {

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "I")
	final int anInt3601;

	@OriginalMember(owner = "client!ct", name = "n", descriptor = "Lclient!adt;")
	final Class88_Sub2 aClass88_Sub2_6;

	@OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(Lclient!adt;I)V", line = 190)
	Class213(@OriginalArg(0) Class88_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.anInt3601 = arg1;
		this.aClass88_Sub2_6 = arg0;
	}

	@OriginalMember(owner = "client!ct", name = "e", descriptor = "()I", line = 196)
	@Override
	public int method30890() {
		return this.aClass88_Sub2_6.anInt2546;
	}

	@OriginalMember(owner = "client!ct", name = "f", descriptor = "()I", line = 196)
	@Override
	public int method30886() {
		return this.aClass88_Sub2_6.anInt2546;
	}

	@OriginalMember(owner = "client!ct", name = "k", descriptor = "()I", line = 196)
	@Override
	public int method30889() {
		return this.aClass88_Sub2_6.anInt2546;
	}

	@OriginalMember(owner = "client!ct", name = "n", descriptor = "()I", line = 200)
	@Override
	public int method30888() {
		return this.aClass88_Sub2_6.anInt2545;
	}

	@OriginalMember(owner = "client!ct", name = "w", descriptor = "()I", line = 200)
	@Override
	public int method30887() {
		return this.aClass88_Sub2_6.anInt2545;
	}

	@OriginalMember(owner = "client!ct", name = "l", descriptor = "()I", line = 200)
	@Override
	public int method30891() {
		return this.aClass88_Sub2_6.anInt2545;
	}

	@OriginalMember(owner = "client!ct", name = "z", descriptor = "(I)V", line = 204)
	@Override
	public void method25456(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.aClass88_Sub2_6.anInt2543, this.aClass88_Sub2_6.anInt2541, this.anInt3601);
	}

	@OriginalMember(owner = "client!ct", name = "d", descriptor = "(I)V", line = 204)
	@Override
	public void method25455(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.aClass88_Sub2_6.anInt2543, this.aClass88_Sub2_6.anInt2541, this.anInt3601);
	}

	@OriginalMember(owner = "client!ct", name = "p", descriptor = "(I)V", line = 204)
	@Override
	public void method25454(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.aClass88_Sub2_6.anInt2543, this.aClass88_Sub2_6.anInt2541, this.anInt3601);
	}

	@OriginalMember(owner = "client!ct", name = "c", descriptor = "(I)V", line = 204)
	@Override
	public void method25457(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.aClass88_Sub2_6.anInt2543, this.aClass88_Sub2_6.anInt2541, this.anInt3601);
	}

	@OriginalMember(owner = "client!ct", name = "u", descriptor = "()V", line = 207)
	@Override
	public void method30885() {
	}

	@OriginalMember(owner = "client!ct", name = "m", descriptor = "()V", line = 207)
	@Override
	public void method30884() {
	}
}
