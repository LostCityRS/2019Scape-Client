package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aix")
final class Class143_Sub5 extends Class143 {

	@OriginalMember(owner = "client!aix", name = "bv", descriptor = "(ZLclient!yp;I)V")
	static void method11842(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class690 arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class691 local8 = arg1.aBoolean988 ? arg1.aClass691_1 : arg1.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		if (arg0) {
			Class313.method27484(local14, local11, (byte) -31);
		} else {
			Class80_Sub28_Sub3.method21844(local14, local11, (byte) 2);
		}
	}

	@OriginalMember(owner = "client!aix", name = "tm", descriptor = "(Lclient!yp;I)V")
	static void method11843(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2022127949);
		Class659.method33285(local16, arg0, -247327728);
	}

	@OriginalMember(owner = "client!aix", name = "dt", descriptor = "(Lclient!yp;I)V")
	static void method11844(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class564.method31472(local11, local14, arg0, (byte) 115);
	}

	@OriginalMember(owner = "client!aix", name = "<init>", descriptor = "(Lclient!xl;IZZ)V")
	Class143_Sub5(@OriginalArg(0) Class664 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, (Class143_Sub1) null);
	}

	@OriginalMember(owner = "client!aix", name = "m", descriptor = "(Lclient!ea;)Ljava/lang/Object;")
	@Override
	Object method11828(@OriginalArg(0) Class107 arg0) {
		return arg0.aClass521_6 == Class521.aClass521_49 ? -1 : arg0.aClass521_6.method30625(35133324);
	}

	@OriginalMember(owner = "client!aix", name = "l", descriptor = "(Lclient!ea;B)Ljava/lang/Object;")
	@Override
	Object method11825(@OriginalArg(0) Class107 arg0, @OriginalArg(1) byte arg1) {
		return arg0.aClass521_6 == Class521.aClass521_49 ? -1 : arg0.aClass521_6.method30625(801969858);
	}
}
