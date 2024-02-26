package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public final class Class200 {

	@OriginalMember(owner = "client!c", name = "t", descriptor = "I")
	int anInt3372;

	@OriginalMember(owner = "client!c", name = "f", descriptor = "I")
	int anInt3373;

	@OriginalMember(owner = "client!c", name = "fx", descriptor = "(Lclient!yp;I)V")
	static void method24927(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class692.method36975(local11, local14, arg0, (byte) -98);
	}

	@OriginalMember(owner = "client!c", name = "fz", descriptor = "(Lclient!yp;B)V")
	static void method24928(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2103221948);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class123_Sub2.method20549(local16, local22, arg0, 1993015340);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(Lclient!sc;B)Z")
	static boolean method24929(@OriginalArg(0) Interface60 arg0, @OriginalArg(1) byte arg1) {
		@Pc(9) Class625 local9 = (Class625) client.aClass539_1.method30905(208433008).method18054(arg0.method13834((byte) 18), -1280456556);
		if (local9.anInt5500 * -71198285 == -1) {
			return true;
		} else {
			@Pc(26) Class57 local26 = (Class57) Class265.aClass41_Sub12_3.method18054(local9.anInt5500 * -71198285, -1497992389);
			return local26.anInt204 * -782006561 == -1 ? true : local26.method1151(-2141613351);
		}
	}

	@OriginalMember(owner = "client!c", name = "t", descriptor = "(IB)Lclient!io;")
	public static Class344 method24930(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (Class344.aClass344_1.anInt4246 * -697781393 == arg0) {
			return Class344.aClass344_1;
		} else if (arg0 == Class344.aClass344_2.anInt4246 * -697781393) {
			return Class344.aClass344_2;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!c", name = "qt", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;B)V")
	static void method24931(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) byte arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (Class619.method32302(local13, arg2, -1694238160) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray35 = Class431.method29089(local13, arg2, 903583895);
		arg0.aBoolean815 = true;
	}

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V")
	Class200() {
	}
}
