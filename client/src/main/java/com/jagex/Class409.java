package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lx")
public final class Class409 {

	@OriginalMember(owner = "client!lx", name = "w", descriptor = "I")
	int anInt4861;

	@OriginalMember(owner = "client!lx", name = "f", descriptor = "I")
	int anInt4864;

	@OriginalMember(owner = "client!lx", name = "k", descriptor = "I")
	int anInt4865;

	@OriginalMember(owner = "client!lx", name = "n", descriptor = "I")
	int anInt4860 = 128;

	@OriginalMember(owner = "client!lx", name = "m", descriptor = "I")
	int anInt4862 = 128;

	@OriginalMember(owner = "client!lx", name = "e", descriptor = "I")
	int anInt4863;

	@OriginalMember(owner = "client!lx", name = "<init>", descriptor = "(I)V")
	Class409(@OriginalArg(0) int arg0) {
		this.anInt4863 = arg0;
	}

	@OriginalMember(owner = "client!lx", name = "<init>", descriptor = "(IIIIII)V")
	Class409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4863 = arg0;
		this.anInt4860 = arg1;
		this.anInt4862 = arg2;
		this.anInt4865 = arg3;
		this.anInt4864 = arg4;
		this.anInt4861 = arg5;
	}

	@OriginalMember(owner = "client!lx", name = "n", descriptor = "(Lclient!lx;)V")
	void method28766(@OriginalArg(0) Class409 arg0) {
		this.anInt4860 = arg0.anInt4860;
		this.anInt4862 = arg0.anInt4862;
		this.anInt4865 = arg0.anInt4865;
		this.anInt4864 = arg0.anInt4864;
		this.anInt4863 = arg0.anInt4863;
		this.anInt4861 = arg0.anInt4861;
	}

	@OriginalMember(owner = "client!lx", name = "e", descriptor = "()Lclient!lx;")
	Class409 method28767() {
		return new Class409(this.anInt4863, this.anInt4860, this.anInt4862, this.anInt4865, this.anInt4864, this.anInt4861);
	}

	@OriginalMember(owner = "client!lx", name = "m", descriptor = "()Lclient!lx;")
	Class409 method28768() {
		return new Class409(this.anInt4863, this.anInt4860, this.anInt4862, this.anInt4865, this.anInt4864, this.anInt4861);
	}

	@OriginalMember(owner = "client!lx", name = "k", descriptor = "(Lclient!lx;)V")
	void method28769(@OriginalArg(0) Class409 arg0) {
		this.anInt4860 = arg0.anInt4860;
		this.anInt4862 = arg0.anInt4862;
		this.anInt4865 = arg0.anInt4865;
		this.anInt4864 = arg0.anInt4864;
		this.anInt4863 = arg0.anInt4863;
		this.anInt4861 = arg0.anInt4861;
	}

	@OriginalMember(owner = "client!lx", name = "f", descriptor = "(Lclient!lx;)V")
	void method28770(@OriginalArg(0) Class409 arg0) {
		this.anInt4860 = arg0.anInt4860;
		this.anInt4862 = arg0.anInt4862;
		this.anInt4865 = arg0.anInt4865;
		this.anInt4864 = arg0.anInt4864;
		this.anInt4863 = arg0.anInt4863;
		this.anInt4861 = arg0.anInt4861;
	}
}
