package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class Class530 implements Interface56 {

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
	final int anInt5231;

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "Lclient!aig;")
	final Class141_Sub1 aClass141_Sub1_1;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lclient!aig;I)V", line = 225)
	Class530(@OriginalArg(0) Class141_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.anInt5231 = arg1;
		this.aClass141_Sub1_1 = arg0;
	}

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "()I", line = 231)
	@Override
	public int method30890() {
		return this.aClass141_Sub1_1.method11362();
	}

	@OriginalMember(owner = "client!ri", name = "k", descriptor = "()I", line = 231)
	@Override
	public int method30889() {
		return this.aClass141_Sub1_1.method11362();
	}

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "()I", line = 231)
	@Override
	public int method30886() {
		return this.aClass141_Sub1_1.method11362();
	}

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "()I", line = 235)
	@Override
	public int method30888() {
		return this.aClass141_Sub1_1.method11340();
	}

	@OriginalMember(owner = "client!ri", name = "w", descriptor = "()I", line = 235)
	@Override
	public int method30887() {
		return this.aClass141_Sub1_1.method11340();
	}

	@OriginalMember(owner = "client!ri", name = "l", descriptor = "()I", line = 235)
	@Override
	public int method30891() {
		return this.aClass141_Sub1_1.method11340();
	}

	@OriginalMember(owner = "client!ri", name = "z", descriptor = "(I)V", line = 239)
	@Override
	public void method30895(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.aClass141_Sub1_1.anInt1373, this.aClass141_Sub1_1.anInt1369, this.anInt5231);
	}

	@OriginalMember(owner = "client!ri", name = "p", descriptor = "(I)V", line = 239)
	@Override
	public void method30892(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.aClass141_Sub1_1.anInt1373, this.aClass141_Sub1_1.anInt1369, this.anInt5231);
	}

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "(I)V", line = 239)
	@Override
	public void method30894(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.aClass141_Sub1_1.anInt1373, this.aClass141_Sub1_1.anInt1369, this.anInt5231);
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)V", line = 239)
	@Override
	public void method30893(@OriginalArg(0) int arg0) {
		OpenGL.glFramebufferTexture2DEXT(36160, arg0, this.aClass141_Sub1_1.anInt1373, this.aClass141_Sub1_1.anInt1369, this.anInt5231);
	}

	@OriginalMember(owner = "client!ri", name = "m", descriptor = "()V", line = 242)
	@Override
	public void method30884() {
	}

	@OriginalMember(owner = "client!ri", name = "u", descriptor = "()V", line = 242)
	@Override
	public void method30885() {
	}
}
