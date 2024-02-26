package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public final class Class408 {

	@OriginalMember(owner = "client!lw", name = "f", descriptor = "I")
	int anInt4610 = 128;

	@OriginalMember(owner = "client!lw", name = "e", descriptor = "I")
	int anInt4611 = 128;

	@OriginalMember(owner = "client!lw", name = "t", descriptor = "I")
	int anInt4609;

	@OriginalMember(owner = "client!lw", name = "u", descriptor = "I")
	int anInt4612;

	@OriginalMember(owner = "client!lw", name = "l", descriptor = "I")
	int anInt4613;

	@OriginalMember(owner = "client!lw", name = "g", descriptor = "I")
	int anInt4614;

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(IIIIII)V")
	Class408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt4609 = arg0;
		this.anInt4610 = arg1;
		this.anInt4611 = arg2;
		this.anInt4612 = arg3;
		this.anInt4613 = arg4;
		this.anInt4614 = arg5;
	}

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(I)V")
	Class408(@OriginalArg(0) int arg0) {
		this.anInt4609 = arg0;
	}

	@OriginalMember(owner = "client!lw", name = "f", descriptor = "(Lclient!lw;)V")
	void method28951(@OriginalArg(0) Class408 arg0) {
		this.anInt4610 = arg0.anInt4610;
		this.anInt4611 = arg0.anInt4611;
		this.anInt4612 = arg0.anInt4612;
		this.anInt4613 = arg0.anInt4613;
		this.anInt4609 = arg0.anInt4609;
		this.anInt4614 = arg0.anInt4614;
	}

	@OriginalMember(owner = "client!lw", name = "t", descriptor = "()Lclient!lw;")
	Class408 method28952() {
		return new Class408(this.anInt4609, this.anInt4610, this.anInt4611, this.anInt4612, this.anInt4613, this.anInt4614);
	}

	@OriginalMember(owner = "client!lw", name = "e", descriptor = "()Lclient!lw;")
	Class408 method28953() {
		return new Class408(this.anInt4609, this.anInt4610, this.anInt4611, this.anInt4612, this.anInt4613, this.anInt4614);
	}

	@OriginalMember(owner = "client!lw", name = "u", descriptor = "()Lclient!lw;")
	Class408 method28954() {
		return new Class408(this.anInt4609, this.anInt4610, this.anInt4611, this.anInt4612, this.anInt4613, this.anInt4614);
	}

	@OriginalMember(owner = "client!lw", name = "l", descriptor = "()Lclient!lw;")
	Class408 method28955() {
		return new Class408(this.anInt4609, this.anInt4610, this.anInt4611, this.anInt4612, this.anInt4613, this.anInt4614);
	}
}
