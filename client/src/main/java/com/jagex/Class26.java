package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaz")
public final class Class26 {

	@OriginalMember(owner = "client!aaz", name = "e", descriptor = "I")
	public int anInt79;

	@OriginalMember(owner = "client!aaz", name = "f", descriptor = "I")
	public int anInt80;

	@OriginalMember(owner = "client!aaz", name = "t", descriptor = "I")
	public int anInt81;

	@OriginalMember(owner = "client!aaz", name = "u", descriptor = "I")
	int anInt82;

	@OriginalMember(owner = "client!aaz", name = "u", descriptor = "([J[II)V")
	public static void method596(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		Class697.method37052(arg0, arg1, 0, arg0.length - 1, (short) -8319);
	}

	@OriginalMember(owner = "client!aaz", name = "<init>", descriptor = "()V")
	Class26() {
	}
}
