package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public final class Class427 {

	@OriginalMember(owner = "client!mw", name = "ay", descriptor = "I")
	static int anInt4636;

	@OriginalMember(owner = "client!mw", name = "k", descriptor = "S")
	static short aShort172;

	@OriginalMember(owner = "client!mw", name = "t", descriptor = "Lclient!mw;")
	public static final Class427 aClass427_1 = new Class427();

	@OriginalMember(owner = "client!mw", name = "f", descriptor = "Lclient!mw;")
	public static final Class427 aClass427_2 = new Class427();

	@OriginalMember(owner = "client!mw", name = "abt", descriptor = "(Lclient!yp;I)V")
	static void method29054(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 1815275855;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(28) boolean local28 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1] == 1;
		@Pc(38) int local38 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		@Pc(43) Class302 local43 = Class134.aClass305_1.method27140(local13, 1321349683);
		if (local43.method27102(611492113) == null) {
			local43.method27060(client.anInterface27_1, (byte) 18);
		}
		if (!local28) {
			@Pc(144) Class374 local144 = (Class374) Class664.aClass41_Sub17_2.method18054(local38, 1108122044);
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local144.method28421(local43.method27102(-1599277621).method722(local144.aClass107_1.anInt862 * -1873516487, (byte) 2), 1852039573);
			return;
		}
		@Pc(59) Class107_Sub2 local59 = (Class107_Sub2) Class528.aClass2_Sub1_Sub1_3.method18054(local38, 1749575838);
		switch(local59.aClass521_6.aClass519_7.anInt5057 * -647640727) {
			case 2:
				arg0.aLongArray27[(arg0.anInt5777 += 1311199625) * -628853575 - 1] = local43.method27102(-129318739).method716(local59.anInt862 * -1873516487, (byte) 87);
				break;
			case 3:
				arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local43.method27102(-490459277).method722(local59.anInt862 * -1873516487, (byte) 2);
				break;
			default:
				arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local43.method27102(1133693311).method718(local59.anInt862 * -1873516487, (byte) 25);
		}
	}

	@OriginalMember(owner = "client!mw", name = "adv", descriptor = "(Lclient!yp;I)V")
	static void method29055(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(31) int local31 = client.aClass533ArrayArray1[local23][local13].method30824((byte) 17);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local31 == 2 ? 1 : 0;
	}

	@OriginalMember(owner = "client!mw", name = "t", descriptor = "(Lclient!pf;IIB)Lclient!aan;")
	public static Class15 method29056(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		return Class165_Sub44.method16877(arg0, arg1, arg2, null, -362209666);
	}

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "()V")
	Class427() {
	}
}
