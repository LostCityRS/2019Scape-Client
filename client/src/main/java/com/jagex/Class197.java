package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public final class Class197 {

	@OriginalMember(owner = "client!bv", name = "t", descriptor = "I")
	final int anInt3364;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(Lclient!afm;I)V")
	Class197(@OriginalArg(0) Class102_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.anInt3364 = OpenGL.glGenLists(arg1);
	}

	@OriginalMember(owner = "client!bv", name = "u", descriptor = "(I)V")
	void method24904(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt3364 + arg0, 4864);
	}

	@OriginalMember(owner = "client!bv", name = "t", descriptor = "(I)V")
	void method24905(@OriginalArg(0) int arg0) {
		OpenGL.glNewList(this.anInt3364 + arg0, 4864);
	}

	@OriginalMember(owner = "client!bv", name = "j", descriptor = "(C)V")
	void method24906(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(this.anInt3364 + arg0);
	}

	@OriginalMember(owner = "client!bv", name = "e", descriptor = "(C)V")
	void method24907(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(this.anInt3364 + arg0);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(C)V")
	void method24908(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(this.anInt3364 + arg0);
	}

	@OriginalMember(owner = "client!bv", name = "l", descriptor = "()V")
	void method24909() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!bv", name = "g", descriptor = "(C)V")
	void method24910(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(this.anInt3364 + arg0);
	}

	@OriginalMember(owner = "client!bv", name = "m", descriptor = "(C)V")
	void method24911(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(this.anInt3364 + arg0);
	}

	@OriginalMember(owner = "client!bv", name = "o", descriptor = "(C)V")
	void method24912(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(this.anInt3364 + arg0);
	}

	@OriginalMember(owner = "client!bv", name = "f", descriptor = "()V")
	void method24913() {
		OpenGL.glEndList();
	}

	@OriginalMember(owner = "client!bv", name = "i", descriptor = "(C)V")
	void method24914(@OriginalArg(0) char arg0) {
		OpenGL.glCallList(this.anInt3364 + arg0);
	}
}
