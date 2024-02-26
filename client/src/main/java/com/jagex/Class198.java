package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bx")
public final class Class198 {

	@OriginalMember(owner = "client!bx", name = "f", descriptor = "I")
	int anInt3366 = 128;

	@OriginalMember(owner = "client!bx", name = "e", descriptor = "I")
	int anInt3367 = 128;

	@OriginalMember(owner = "client!bx", name = "t", descriptor = "I")
	int anInt3365;

	@OriginalMember(owner = "client!bx", name = "u", descriptor = "I")
	int anInt3368;

	@OriginalMember(owner = "client!bx", name = "l", descriptor = "I")
	int anInt3369;

	@OriginalMember(owner = "client!bx", name = "g", descriptor = "I")
	int anInt3370;

	@OriginalMember(owner = "client!bx", name = "<init>", descriptor = "(IIIIII)V")
	Class198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3365 = arg0;
		this.anInt3366 = arg1;
		this.anInt3367 = arg2;
		this.anInt3368 = arg3;
		this.anInt3369 = arg4;
		this.anInt3370 = arg5;
	}

	@OriginalMember(owner = "client!bx", name = "<init>", descriptor = "(I)V")
	Class198(@OriginalArg(0) int arg0) {
		this.anInt3365 = arg0;
	}

	@OriginalMember(owner = "client!bx", name = "u", descriptor = "()Lclient!bx;")
	Class198 method24915() {
		return new Class198(this.anInt3365, this.anInt3366, this.anInt3367, this.anInt3368, this.anInt3369, this.anInt3370);
	}

	@OriginalMember(owner = "client!bx", name = "t", descriptor = "()Lclient!bx;")
	Class198 method24916() {
		return new Class198(this.anInt3365, this.anInt3366, this.anInt3367, this.anInt3368, this.anInt3369, this.anInt3370);
	}

	@OriginalMember(owner = "client!bx", name = "f", descriptor = "(Lclient!bx;)V")
	void method24917(@OriginalArg(0) Class198 arg0) {
		this.anInt3366 = arg0.anInt3366;
		this.anInt3367 = arg0.anInt3367;
		this.anInt3368 = arg0.anInt3368;
		this.anInt3369 = arg0.anInt3369;
		this.anInt3365 = arg0.anInt3365;
		this.anInt3370 = arg0.anInt3370;
	}

	@OriginalMember(owner = "client!bx", name = "e", descriptor = "()Lclient!bx;")
	Class198 method24918() {
		return new Class198(this.anInt3365, this.anInt3366, this.anInt3367, this.anInt3368, this.anInt3369, this.anInt3370);
	}

	@OriginalMember(owner = "client!bx", name = "l", descriptor = "(Lclient!bx;)V")
	void method24919(@OriginalArg(0) Class198 arg0) {
		this.anInt3366 = arg0.anInt3366;
		this.anInt3367 = arg0.anInt3367;
		this.anInt3368 = arg0.anInt3368;
		this.anInt3369 = arg0.anInt3369;
		this.anInt3365 = arg0.anInt3365;
		this.anInt3370 = arg0.anInt3370;
	}

	@OriginalMember(owner = "client!bx", name = "g", descriptor = "(Lclient!bx;)V")
	void method24920(@OriginalArg(0) Class198 arg0) {
		this.anInt3366 = arg0.anInt3366;
		this.anInt3367 = arg0.anInt3367;
		this.anInt3368 = arg0.anInt3368;
		this.anInt3369 = arg0.anInt3369;
		this.anInt3365 = arg0.anInt3365;
		this.anInt3370 = arg0.anInt3370;
	}
}
