package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class Class416 {

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
	final int anInt4764;

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
	final int anInt4765;

	@OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
	final int anInt4762;

	@OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
	final int anInt4763;

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "S")
	final short aShort169;

	@OriginalMember(owner = "client!mf", name = "w", descriptor = "S")
	final short aShort168;

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "S")
	final short aShort170;

	@OriginalMember(owner = "client!mf", name = "u", descriptor = "Z")
	final boolean aBoolean754;

	@OriginalMember(owner = "client!mf", name = "z", descriptor = "I")
	final int anInt4766;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 14)
	Class416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt4764 = arg0;
		this.anInt4765 = arg1;
		this.anInt4762 = arg2;
		this.anInt4763 = arg3;
		this.aShort169 = (short) arg4;
		this.aShort168 = (short) arg5;
		this.aShort170 = (short) arg6;
		this.aBoolean754 = arg10;
		this.anInt4766 = arg11;
	}
}
