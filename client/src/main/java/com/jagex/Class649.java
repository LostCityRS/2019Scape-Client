package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ww")
public final class Class649 {

	@OriginalMember(owner = "client!ww", name = "hj", descriptor = "Lclient!ape;")
	public static Class55_Sub1 aClass55_Sub1_1;

	@OriginalMember(owner = "client!ww", name = "e", descriptor = "Lclient!ww;")
	public static final Class649 aClass649_1 = new Class649(1);

	@OriginalMember(owner = "client!ww", name = "n", descriptor = "Lclient!ww;")
	static final Class649 aClass649_2 = new Class649(2);

	@OriginalMember(owner = "client!ww", name = "m", descriptor = "Lclient!ww;")
	static final Class649 aClass649_3 = new Class649(3);

	@OriginalMember(owner = "client!ww", name = "k", descriptor = "Lclient!ww;")
	public static final Class649 aClass649_5 = new Class649(4);

	@OriginalMember(owner = "client!ww", name = "f", descriptor = "Lclient!ww;")
	static final Class649 aClass649_4 = new Class649(5);

	@OriginalMember(owner = "client!ww", name = "w", descriptor = "Lclient!ww;")
	static final Class649 aClass649_11 = new Class649(6);

	@OriginalMember(owner = "client!ww", name = "l", descriptor = "Lclient!ww;")
	static final Class649 aClass649_7 = new Class649(7);

	@OriginalMember(owner = "client!ww", name = "u", descriptor = "Lclient!ww;")
	static final Class649 aClass649_6 = new Class649(8);

	@OriginalMember(owner = "client!ww", name = "z", descriptor = "Lclient!ww;")
	static final Class649 aClass649_8 = new Class649(9);

	@OriginalMember(owner = "client!ww", name = "p", descriptor = "Lclient!ww;")
	static final Class649 aClass649_9 = new Class649(10);

	@OriginalMember(owner = "client!ww", name = "d", descriptor = "Lclient!ww;")
	static final Class649 aClass649_10 = new Class649(12);

	@OriginalMember(owner = "client!ww", name = "c", descriptor = "I")
	public final int anInt5956;

	@OriginalMember(owner = "client!ww", name = "sa", descriptor = "(Lclient!yf;B)V")
	static void method32840(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(24) int local24 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(25) int local25 = local24 - 1;
		if (local11.aStringArray27 == null || local25 >= local11.aStringArray27.length || local11.aStringArray27[local25] == null) {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		} else {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local11.aStringArray27[local25];
		}
	}

	@OriginalMember(owner = "client!ww", name = "aw", descriptor = "(IZB)V")
	static void method32841(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28187(23, (long) arg0);
		local4.method21813(266435198);
		local4.anInt3020 = (arg1 ? 1 : 0) * 1415359557;
	}

	@OriginalMember(owner = "client!ww", name = "lm", descriptor = "(Lclient!yf;I)V")
	static void method32842(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 213776968);
		Class430.method28943(local16, arg0, -1868226881);
	}

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(I)V")
	Class649(@OriginalArg(0) int arg0) {
		this.anInt5956 = arg0 * 376500955;
	}
}
