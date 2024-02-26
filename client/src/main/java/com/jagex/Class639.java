package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class639 {

	@OriginalMember(owner = "client!wj", name = "t", descriptor = "Lclient!wj;")
	public static final Class639 aClass639_8 = new Class639(1);

	@OriginalMember(owner = "client!wj", name = "f", descriptor = "Lclient!wj;")
	static final Class639 aClass639_5 = new Class639(2);

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "Lclient!wj;")
	static final Class639 aClass639_3 = new Class639(3);

	@OriginalMember(owner = "client!wj", name = "u", descriptor = "Lclient!wj;")
	public static final Class639 aClass639_4 = new Class639(4);

	@OriginalMember(owner = "client!wj", name = "l", descriptor = "Lclient!wj;")
	static final Class639 aClass639_11 = new Class639(5);

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "Lclient!wj;")
	static final Class639 aClass639_6 = new Class639(6);

	@OriginalMember(owner = "client!wj", name = "i", descriptor = "Lclient!wj;")
	static final Class639 aClass639_7 = new Class639(7);

	@OriginalMember(owner = "client!wj", name = "m", descriptor = "Lclient!wj;")
	static final Class639 aClass639_1 = new Class639(8);

	@OriginalMember(owner = "client!wj", name = "o", descriptor = "Lclient!wj;")
	static final Class639 aClass639_2 = new Class639(9);

	@OriginalMember(owner = "client!wj", name = "j", descriptor = "Lclient!wj;")
	static final Class639 aClass639_9 = new Class639(10);

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "Lclient!wj;")
	static final Class639 aClass639_10 = new Class639(12);

	@OriginalMember(owner = "client!wj", name = "s", descriptor = "I")
	public final int anInt5637;

	@OriginalMember(owner = "client!wj", name = "ar", descriptor = "(Lclient!yp;B)V")
	static void method32882(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.aLongArray27[(arg0.anInt5777 += 1311199625) * -628853575 - 1] = (Long) arg0.aClass80_Sub1_Sub20_2.anObjectArray5[arg0.anInt5780 * -1336568839];
	}

	@OriginalMember(owner = "client!wj", name = "aao", descriptor = "(Lclient!yp;I)V")
	static void method32883(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5776 -= -1650379242;
		@Pc(14) String local14 = (String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997];
		@Pc(25) String local25 = (String) arg0.anObjectArray46[arg0.anInt5776 * -2070619997 + 1];
		Class79.method1431(local14, local25, -1428269406);
	}

	@OriginalMember(owner = "client!wj", name = "aaf", descriptor = "(Lclient!yp;I)V")
	static void method32884(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		if (client.aString151 == null) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		} else {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = client.aString151;
		}
	}

	@OriginalMember(owner = "client!wj", name = "asw", descriptor = "(Lclient!yp;B)V")
	static void method32885(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (local12 == -1) {
			Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub10_2, Class703.aClass80_Sub37_49.aClass165_Sub10_1.method16018(-746811165), (byte) 109);
		} else {
			Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub10_2, local12, (byte) 60);
		}
		Class643.method33027(1661397441);
	}

	@OriginalMember(owner = "client!wj", name = "or", descriptor = "(Lclient!yp;I)V")
	static void method32886(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local13 < local23 ? local13 : local23;
	}

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(I)V")
	Class639(@OriginalArg(0) int arg0) {
		this.anInt5637 = arg0 * 1798222619;
	}
}
