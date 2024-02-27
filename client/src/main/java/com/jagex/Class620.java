package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class620 {

	@OriginalMember(owner = "client!vp", name = "bu", descriptor = "Z")
	static boolean aBoolean852;

	@OriginalMember(owner = "client!vp", name = "lh", descriptor = "I")
	static int anInt5805;

	@OriginalMember(owner = "client!vp", name = "e", descriptor = "J")
	long aLong293;

	@OriginalMember(owner = "client!vp", name = "n", descriptor = "[I")
	int[] anIntArray496;

	@OriginalMember(owner = "client!vp", name = "m", descriptor = "[S")
	short[] aShortArray148;

	@OriginalMember(owner = "client!vp", name = "k", descriptor = "[S")
	short[] aShortArray149;

	@OriginalMember(owner = "client!vp", name = "ye", descriptor = "(Lclient!yf;I)V")
	static void method32291(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class50.aClass28_5.anInt101 * 2142901097;
	}

	@OriginalMember(owner = "client!vp", name = "h", descriptor = "(IIII)I")
	static int method32292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == arg1) {
			return arg0;
		}
		@Pc(8) int local8 = 128 - arg2;
		@Pc(22) int local22 = (arg0 & 0x7F) * local8 + (arg1 & 0x7F) * arg2 >> 7;
		@Pc(36) int local36 = (arg0 & 0x380) * local8 + arg2 * (arg1 & 0x380) >> 7;
		@Pc(50) int local50 = (arg1 & 0xFC00) * arg2 + (arg0 & 0xFC00) * local8 >> 7;
		return local50 & 0xFC00 | local36 & 0x380 | local22 & 0x7F;
	}

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class620(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aLong293 = arg0 * -4936121373889991153L;
		this.anIntArray496 = arg1;
		this.aShortArray148 = arg2;
		this.aShortArray149 = arg3;
	}
}
