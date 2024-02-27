package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class557 {

	@OriginalMember(owner = "client!so", name = "tq", descriptor = "Lclient!gq;")
	public static Class297 aClass297_1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!so", name = "this$0", descriptor = "Lclient!sb;")
	final Class545 aClass545_4;

	@OriginalMember(owner = "client!so", name = "baa", descriptor = "(Lclient!yf;I)V")
	static void method31245(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub31_1.method16555(local12, 473557605);
	}

	@OriginalMember(owner = "client!so", name = "u", descriptor = "(IZS)Lclient!ajo;")
	static Class93_Sub6 method31246(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) short arg2) {
		@Pc(8) long local8 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
		return (Class93_Sub6) Class93_Sub6.aClass16_9.method215(local8);
	}

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lclient!sb;)V")
	Class557(@OriginalArg(0) Class545 arg0) {
		this.aClass545_4 = arg0;
	}
}
