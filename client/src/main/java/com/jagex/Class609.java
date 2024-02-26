package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class609 {

	@OriginalMember(owner = "client!vc", name = "t", descriptor = "Lclient!vc;")
	static final Class609 aClass609_1 = new Class609(0);

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "Lclient!vc;")
	static final Class609 aClass609_2 = new Class609(1);

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "Lclient!vc;")
	static final Class609 aClass609_3 = new Class609(2);

	@OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
	final int anInt5399;

	@OriginalMember(owner = "client!vc", name = "u", descriptor = "()[Lclient!vc;")
	static Class609[] method32192() {
		return new Class609[] { aClass609_3, aClass609_2, aClass609_1 };
	}

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "()[Lclient!vc;")
	static Class609[] method32193() {
		return new Class609[] { aClass609_3, aClass609_2, aClass609_1 };
	}

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "()[Lclient!vc;")
	static Class609[] method32194() {
		return new Class609[] { aClass609_3, aClass609_2, aClass609_1 };
	}

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "()[Lclient!vc;")
	static Class609[] method32195() {
		return new Class609[] { aClass609_3, aClass609_2, aClass609_1 };
	}

	@OriginalMember(owner = "client!vc", name = "in", descriptor = "(Lclient!yp;B)V")
	static void method32196(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2124830270);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class519.method30606(local16, local22, arg0, arg0.aClass80_Sub32_4 == Class477.aClass80_Sub32_3 ? Class322.aClass322_6 : Class322.aClass322_4, 1406841842);
	}

	@OriginalMember(owner = "client!vc", name = "mw", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;B)V")
	static void method32197(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) byte arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray46[(arg2.anInt5776 -= -825189621) * -2070619997];
		if (Class619.method32302(local13, arg2, -2135323466) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray18 = Class431.method29089(local13, arg2, 1921055098);
		arg0.aBoolean815 = true;
	}

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(I)V")
	Class609(@OriginalArg(0) int arg0) {
		this.anInt5399 = arg0 * -1582275271;
	}
}
