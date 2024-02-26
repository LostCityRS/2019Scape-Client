package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public final class Class206 {

	@OriginalMember(owner = "client!cj", name = "u", descriptor = "I")
	final int anInt3392;

	@OriginalMember(owner = "client!cj", name = "t", descriptor = "I")
	final int anInt3394;

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
	final int anInt3391;

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
	final int anInt3393;

	@OriginalMember(owner = "client!cj", name = "l", descriptor = "S")
	final short aShort150;

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "S")
	final short aShort152;

	@OriginalMember(owner = "client!cj", name = "i", descriptor = "S")
	final short aShort151;

	@OriginalMember(owner = "client!cj", name = "m", descriptor = "B")
	final byte aByte109;

	@OriginalMember(owner = "client!cj", name = "o", descriptor = "Z")
	final boolean aBoolean690;

	@OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
	final int anInt3395;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
	Class206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) boolean arg10, @OriginalArg(11) int arg11) {
		this.anInt3392 = arg0;
		this.anInt3394 = arg1;
		this.anInt3391 = arg2;
		this.anInt3393 = arg3;
		this.aShort150 = (short) arg4;
		this.aShort152 = (short) arg5;
		this.aShort151 = (short) arg6;
		this.aByte109 = (byte) arg8;
		this.aBoolean690 = arg10;
		this.anInt3395 = arg11;
	}
}
