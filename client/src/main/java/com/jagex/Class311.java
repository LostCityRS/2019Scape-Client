package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public final class Class311 {

	@OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
	final int anInt4015;

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
	final int anInt4014;

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
	final int anInt4013;

	@OriginalMember(owner = "client!hf", name = "u", descriptor = "I")
	final int anInt4016;

	@OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
	final int anInt4017;

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "[Lclient!hn;")
	final Class319[] aClass319Array2;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(IIIII[Lclient!hn;)V")
	Class311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class319[] arg5) {
		this.anInt4015 = arg0;
		this.anInt4014 = arg1;
		this.anInt4013 = arg2;
		this.anInt4016 = arg3;
		this.anInt4017 = arg4;
		this.aClass319Array2 = arg5;
	}
}
