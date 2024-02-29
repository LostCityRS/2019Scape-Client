package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class Class193 {

	@OriginalMember(owner = "client!bp", name = "k", descriptor = "Lclient!bv;")
	Interface14 anInterface14_6;

	@OriginalMember(owner = "client!bp", name = "e", descriptor = "S")
	short aShort143;

	@OriginalMember(owner = "client!bp", name = "n", descriptor = "B")
	byte aByte106;

	@OriginalMember(owner = "client!bp", name = "m", descriptor = "B")
	byte aByte107;

	@OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lclient!bv;III)V", line = 10)
	Class193(@OriginalArg(0) Interface14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInterface14_6 = arg0;
		this.aShort143 = (short) arg1;
		this.aByte106 = (byte) arg2;
		this.aByte107 = (byte) arg3;
	}
}
