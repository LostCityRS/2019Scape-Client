package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yj")
public final class Class685 {

	@OriginalMember(owner = "client!yj", name = "t", descriptor = "Lclient!yj;")
	public static final Class685 aClass685_8 = new Class685(1);

	@OriginalMember(owner = "client!yj", name = "f", descriptor = "Lclient!yj;")
	public static final Class685 aClass685_2 = new Class685(2);

	@OriginalMember(owner = "client!yj", name = "e", descriptor = "Lclient!yj;")
	public static final Class685 aClass685_3 = new Class685(4);

	@OriginalMember(owner = "client!yj", name = "u", descriptor = "Lclient!yj;")
	public static final Class685 aClass685_7 = new Class685(8);

	@OriginalMember(owner = "client!yj", name = "l", descriptor = "Lclient!yj;")
	public static final Class685 aClass685_5 = new Class685(16);

	@OriginalMember(owner = "client!yj", name = "g", descriptor = "Lclient!yj;")
	public static final Class685 aClass685_6 = new Class685(32);

	@OriginalMember(owner = "client!yj", name = "i", descriptor = "Lclient!yj;")
	public static final Class685 aClass685_4 = new Class685(64);

	@OriginalMember(owner = "client!yj", name = "m", descriptor = "Lclient!yj;")
	public static final Class685 aClass685_1 = new Class685(128);

	@OriginalMember(owner = "client!yj", name = "o", descriptor = "I")
	public final int anInt5771;

	@OriginalMember(owner = "client!yj", name = "c", descriptor = "(Lclient!yp;I)V")
	static void method36791(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = arg0.aClass80_Sub1_Sub20_2.anObjectArray5[arg0.anInt5780 * -1336568839];
	}

	@OriginalMember(owner = "client!yj", name = "axb", descriptor = "(Lclient!yp;I)V")
	static void method36792(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(29) Class79 local29 = (Class79) Class370.aClass41_Sub10_1.method18054(local23, 358825568);
		if (local29.method1428(-997462359)) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = ((Class320) Class157.aClass41_Sub13_2.method18054(local13, -807498776)).method27548(local23, local29.aString11, 1139316220);
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = ((Class320) Class157.aClass41_Sub13_2.method18054(local13, 2055413595)).method27547(local23, local29.anInt253 * 680817871, -80617481);
		}
	}

	@OriginalMember(owner = "client!yj", name = "<init>", descriptor = "(I)V")
	Class685(@OriginalArg(0) int arg0) {
		this.anInt5771 = arg0 * -581855171;
	}
}
