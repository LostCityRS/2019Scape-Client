package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lx")
public class Class409 {

	@OriginalMember(owner = "client!lx", name = "w", descriptor = "I")
	int anInt4700;

	@OriginalMember(owner = "client!lx", name = "f", descriptor = "I")
	int anInt4703;

	@OriginalMember(owner = "client!lx", name = "k", descriptor = "I")
	int anInt4704;

	@OriginalMember(owner = "client!lx", name = "n", descriptor = "I")
	int anInt4699 = 128;

	@OriginalMember(owner = "client!lx", name = "m", descriptor = "I")
	int anInt4701 = 128;

	@OriginalMember(owner = "client!lx", name = "e", descriptor = "I")
	int anInt4702;

	@OriginalMember(owner = "client!lx", name = "<init>", descriptor = "(I)V", line = 11)
	Class409(@OriginalArg(0) int arg0) {
		this.anInt4702 = arg0;
	}

	@OriginalMember(owner = "client!lx", name = "<init>", descriptor = "(IIIIII)V", line = 15)
	Class409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4702 = arg0;
		this.anInt4699 = arg1;
		this.anInt4701 = arg2;
		this.anInt4704 = arg3;
		this.anInt4703 = arg4;
		this.anInt4700 = arg5;
	}

	@OriginalMember(owner = "client!lx", name = "e", descriptor = "()Lclient!lx;", line = 25)
	Class409 method28585() {
		return new Class409(this.anInt4702, this.anInt4699, this.anInt4701, this.anInt4704, this.anInt4703, this.anInt4700);
	}

	@OriginalMember(owner = "client!lx", name = "m", descriptor = "()Lclient!lx;", line = 25)
	Class409 method28586() {
		return new Class409(this.anInt4702, this.anInt4699, this.anInt4701, this.anInt4704, this.anInt4703, this.anInt4700);
	}

	@OriginalMember(owner = "client!lx", name = "n", descriptor = "(Lclient!lx;)V", line = 29)
	void method28587(@OriginalArg(0) Class409 arg0) {
		this.anInt4699 = arg0.anInt4699;
		this.anInt4701 = arg0.anInt4701;
		this.anInt4704 = arg0.anInt4704;
		this.anInt4703 = arg0.anInt4703;
		this.anInt4702 = arg0.anInt4702;
		this.anInt4700 = arg0.anInt4700;
	}

	@OriginalMember(owner = "client!lx", name = "k", descriptor = "(Lclient!lx;)V", line = 29)
	void method28588(@OriginalArg(0) Class409 arg0) {
		this.anInt4699 = arg0.anInt4699;
		this.anInt4701 = arg0.anInt4701;
		this.anInt4704 = arg0.anInt4704;
		this.anInt4703 = arg0.anInt4703;
		this.anInt4702 = arg0.anInt4702;
		this.anInt4700 = arg0.anInt4700;
	}

	@OriginalMember(owner = "client!lx", name = "f", descriptor = "(Lclient!lx;)V", line = 29)
	void method28589(@OriginalArg(0) Class409 arg0) {
		this.anInt4699 = arg0.anInt4699;
		this.anInt4701 = arg0.anInt4701;
		this.anInt4704 = arg0.anInt4704;
		this.anInt4703 = arg0.anInt4703;
		this.anInt4702 = arg0.anInt4702;
		this.anInt4700 = arg0.anInt4700;
	}
}
