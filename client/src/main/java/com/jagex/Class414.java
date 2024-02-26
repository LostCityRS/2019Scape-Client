package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public final class Class414 {

	@OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
	final int anInt4618;

	@OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
	final int anInt4616;

	@OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
	final int anInt4617;

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
	final int anInt4619;

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "S")
	final short aShort170;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "S")
	final short aShort169;

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "S")
	final short aShort171;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "Z")
	final boolean aBoolean858;

	@OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
	final int anInt4620;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	Class414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt4618 = arg0;
		this.anInt4616 = arg1;
		this.anInt4617 = arg2;
		this.anInt4619 = arg3;
		this.aShort170 = (short) arg4;
		this.aShort169 = (short) arg5;
		this.aShort171 = (short) arg6;
		this.aBoolean858 = arg10;
		this.anInt4620 = arg11;
	}
}
