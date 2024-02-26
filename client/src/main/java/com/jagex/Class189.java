package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public final class Class189 {

	@OriginalMember(owner = "client!bm", name = "u", descriptor = "Lclient!bw;")
	Interface14 anInterface14_6;

	@OriginalMember(owner = "client!bm", name = "t", descriptor = "S")
	short aShort142;

	@OriginalMember(owner = "client!bm", name = "f", descriptor = "B")
	byte aByte105;

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "B")
	byte aByte106;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lclient!bw;III)V")
	Class189(@OriginalArg(0) Interface14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInterface14_6 = arg0;
		this.aShort142 = (short) arg1;
		this.aByte105 = (byte) arg2;
		this.aByte106 = (byte) arg3;
	}
}
