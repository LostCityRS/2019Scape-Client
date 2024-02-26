package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public final class Class580 {

	@OriginalMember(owner = "client!tr", name = "t", descriptor = "B")
	byte aByte153;

	@OriginalMember(owner = "client!tr", name = "f", descriptor = "B")
	byte aByte152;

	@OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
	int anInt5300;

	@OriginalMember(owner = "client!tr", name = "u", descriptor = "S")
	short aShort181;

	@OriginalMember(owner = "client!tr", name = "l", descriptor = "B")
	byte aByte154;

	@OriginalMember(owner = "client!tr", name = "g", descriptor = "[I")
	int[] anIntArray478;

	@OriginalMember(owner = "client!tr", name = "i", descriptor = "[B")
	byte[] aByteArray104;

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(IIIII[I[B)V")
	Class580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) byte[] arg6) {
		this.aByte153 = (byte) arg0;
		this.aByte152 = (byte) arg1;
		this.anInt5300 = arg2;
		this.aShort181 = (short) arg3;
		this.aByte154 = (byte) arg4;
		this.anIntArray478 = arg5;
		this.aByteArray104 = arg6;
	}
}
