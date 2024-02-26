package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
final class Class504 implements Interface9 {

	@OriginalMember(owner = "client!qf", name = "fe", descriptor = "Lclient!pv;")
	public static Class495 aClass495_3;

	@OriginalMember(owner = "client!qf", name = "sb", descriptor = "Lclient!eh;")
	public static Class110 aClass110_1;

	@OriginalMember(owner = "client!qf", name = "bah", descriptor = "(Lclient!yp;I)V")
	static void method30458(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!qf", name = "jz", descriptor = "(Lclient!alf;IZZI)V")
	static void method30459(@OriginalArg(0) Class120_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(37) int local37;
		@Pc(46) int local46;
		if (arg0 instanceof Class120_Sub1_Sub1 && arg0 instanceof Interface60) {
			@Pc(8) Class120_Sub1_Sub1 local8 = (Class120_Sub1_Sub1) arg0;
			@Pc(18) int local18 = local8.aShort126 - local8.aShort129 + 1 << 9;
			@Pc(28) int local28 = local8.aShort128 - local8.aShort127 + 1 << 9;
			local37 = (local8.aShort129 << 9) + local18 / 2;
			local46 = (local8.aShort127 << 9) + local28 / 2;
		} else {
			@Pc(51) Class463 local51 = arg0.method24552().aClass463_61;
			local37 = (int) local51.aFloat297;
			local46 = (int) local51.aFloat296;
		}
		Class66.method1240(arg0.aByte99, local37, local46, 0, arg1, arg2, arg3, -599715021);
	}

	@OriginalMember(owner = "client!qf", name = "dw", descriptor = "(Lclient!yp;I)V")
	static void method30460(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class167.method17874(local11, local14, arg0, (byte) 6);
	}

	@OriginalMember(owner = "client!qf", name = "u", descriptor = "(Lclient!ald;)Ljava/lang/Object;")
	@Override
	public Object method30636(@OriginalArg(0) Class80_Sub36 arg0) {
		return arg0.method23376((short) 20153);
	}

	@OriginalMember(owner = "client!qf", name = "t", descriptor = "(Lclient!ald;S)Ljava/lang/Object;")
	@Override
	public Object method30638(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) short arg1) {
		return arg0.method23376((short) 16581);
	}

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "(Lclient!ald;)Ljava/lang/Object;")
	@Override
	public Object method30635(@OriginalArg(0) Class80_Sub36 arg0) {
		return arg0.method23376((short) 16017);
	}

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "(Lclient!ald;)Ljava/lang/Object;")
	@Override
	public Object method30637(@OriginalArg(0) Class80_Sub36 arg0) {
		return arg0.method23376((short) 11646);
	}
}
