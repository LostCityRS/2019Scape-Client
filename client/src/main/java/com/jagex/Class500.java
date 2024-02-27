package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class500 implements Interface75 {

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "Lclient!qa;")
	static final Class500 aClass500_1 = new Class500(0);

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "Lclient!qa;")
	static final Class500 aClass500_3 = new Class500(1);

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "Lclient!qa;")
	static final Class500 aClass500_2 = new Class500(2);

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "I")
	final int anInt5036;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "()[Lclient!qa;")
	public static Class500[] method30405() {
		return new Class500[] { aClass500_3, aClass500_2, aClass500_1 };
	}

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "()[Lclient!qa;")
	public static Class500[] method30406() {
		return new Class500[] { aClass500_3, aClass500_2, aClass500_1 };
	}

	@OriginalMember(owner = "client!qa", name = "l", descriptor = "()[Lclient!qa;")
	public static Class500[] method30407() {
		return new Class500[] { aClass500_3, aClass500_2, aClass500_1 };
	}

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "()[Lclient!qa;")
	public static Class500[] method30408() {
		return new Class500[] { aClass500_3, aClass500_2, aClass500_1 };
	}

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "(Lclient!yp;I)V")
	static void method30409(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 2] = ((Class352) Class106.aClass73_Sub1_6.method18054(arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 2], -917869451)).method28037(Class672.aClass134_1, arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1], 1167438974) ? 1 : 0;
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!qa", name = "anm", descriptor = "(Lclient!yp;I)V")
	static void method30410(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class175.method24651(arg0, arg0.aClass120_Sub1_Sub1_Sub1_4, (byte) 36);
	}

	@OriginalMember(owner = "client!qa", name = "ays", descriptor = "(Lclient!yp;I)V")
	static void method30411(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class165_Sub45.anInt2388 * -1067447681;
	}

	@OriginalMember(owner = "client!qa", name = "bep", descriptor = "(Lclient!yp;I)V")
	static void method30412(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		if (Class448.aClass341_1.method27918(-80730484) > 0) {
			@Pc(17) String local17 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
			@Pc(22) String local22 = Class448.aClass341_1.method27917(local17, -547489975);
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local22;
		}
	}

	@OriginalMember(owner = "client!qa", name = "axa", descriptor = "(Lclient!yp;I)V")
	static void method30413(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!qa", name = "abf", descriptor = "(Lclient!yp;I)V")
	static void method30414(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class134.aClass305_1.method27153(1607348525);
	}

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(I)V")
	Class500(@OriginalArg(0) int arg0) {
		this.anInt5036 = arg0 * 1338770787;
	}

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt5036 * -1890737077;
	}

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "()I")
	@Override
	public int getId() {
		return this.anInt5036 * -1890737077;
	}

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt5036 * -1890737077;
	}
}
