package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class Class182 {

	@OriginalMember(owner = "client!be", name = "e", descriptor = "I")
	final int anInt3330;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!afa;I)V", line = 9)
	Class182(@OriginalArg(0) Class104_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.anInt3330 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(I)V", line = 14)
	void method24557(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt3330 + arg0, 4864);
	}

	@OriginalMember(owner = "client!be", name = "k", descriptor = "(I)V", line = 14)
	void method24558(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt3330 + arg0, 4864);
	}

	@OriginalMember(owner = "client!be", name = "n", descriptor = "()V", line = 18)
	void method24559() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!be", name = "f", descriptor = "()V", line = 18)
	void method24560() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!be", name = "w", descriptor = "()V", line = 18)
	void method24561() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!be", name = "l", descriptor = "(C)V", line = 22)
	void method24562(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(this.anInt3330 + arg0);
	}

	@OriginalMember(owner = "client!be", name = "m", descriptor = "(C)V", line = 22)
	void method24563(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(this.anInt3330 + arg0);
	}

	@OriginalMember(owner = "client!be", name = "u", descriptor = "(C)V", line = 22)
	void method24564(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(this.anInt3330 + arg0);
	}
}
