package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iw")
public final class Class351 {

	@OriginalMember(owner = "client!iw", name = "or", descriptor = "I")
	public static int anInt4246;

	@OriginalMember(owner = "client!iw", name = "e", descriptor = "Lclient!iw;")
	static final Class351 aClass351_1 = new Class351(0, 4);

	@OriginalMember(owner = "client!iw", name = "n", descriptor = "Lclient!iw;")
	static final Class351 aClass351_2 = new Class351(1, 5);

	@OriginalMember(owner = "client!iw", name = "m", descriptor = "Lclient!iw;")
	static final Class351 aClass351_3 = new Class351(2, 6);

	@OriginalMember(owner = "client!iw", name = "k", descriptor = "I")
	final int anInt4244;

	@OriginalMember(owner = "client!iw", name = "f", descriptor = "I")
	public final int anInt4245;

	@OriginalMember(owner = "client!iw", name = "f", descriptor = "(I)Lclient!iw;")
	public static Class351 method27731(@OriginalArg(0) int arg0) {
		@Pc(2) Class351[] local2 = Class32_Sub21.method17599((byte) -83);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class351 local12 = local2[local4];
			if (arg0 == local12.anInt4244 * 1429919719) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!iw", name = "m", descriptor = "()[Lclient!iw;")
	static Class351[] method27732() {
		return new Class351[] { aClass351_1, aClass351_2, aClass351_3 };
	}

	@OriginalMember(owner = "client!iw", name = "k", descriptor = "()[Lclient!iw;")
	static Class351[] method27733() {
		return new Class351[] { aClass351_1, aClass351_2, aClass351_3 };
	}

	@OriginalMember(owner = "client!iw", name = "w", descriptor = "(I)Lclient!iw;")
	public static Class351 method27734(@OriginalArg(0) int arg0) {
		@Pc(2) Class351[] local2 = Class32_Sub21.method17599((byte) -120);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class351 local12 = local2[local4];
			if (arg0 == local12.anInt4244 * 1429919719) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!iw", name = "n", descriptor = "(II)Lclient!vs;")
	static Class623 method27735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class623[] local2 = Class254.method26091((byte) -69);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class623 local12 = local2[local4];
			if (local12.anInt5842 * -1361159159 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!iw", name = "k", descriptor = "(Lclient!alw;I)V")
	static void method27736(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < Class606.anInt5718 * 2035023117; local1++) {
			@Pc(10) int local10 = arg0.method22644((byte) -23);
			@Pc(14) int local14 = arg0.method22427(-1434290800);
			if (local14 == 65535) {
				local14 = -1;
			}
			if (Class632.aClass154_Sub1Array2[local10] != null) {
				Class632.aClass154_Sub1Array2[local10].anInt1652 = local14 * 1058716491;
			}
		}
	}

	@OriginalMember(owner = "client!iw", name = "cd", descriptor = "(Lclient!yf;I)V")
	static void method27737(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class562.method31369(local11, local14, arg0, (byte) 1);
	}

	@OriginalMember(owner = "client!iw", name = "sq", descriptor = "(Lclient!yf;I)V")
	static void method27738(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(24) int local24 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(30) Class87 local30 = (Class87) Class124.aClass32_Sub21_7.method18273(local24, 111252798);
		if (local30.method1508(1429228259)) {
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local11.method26976(local24, local30.aString11, -2111319918);
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local11.method26951(local24, local30.anInt265 * 951920133, 165204008);
		}
	}

	@OriginalMember(owner = "client!iw", name = "ux", descriptor = "(Lclient!yf;B)V")
	static void method27739(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, -121337275);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local16.anInt4076 * -220894753;
	}

	@OriginalMember(owner = "client!iw", name = "ahi", descriptor = "(Lclient!yf;I)V")
	static void method27740(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6049 -= 1915061582;
		@Pc(14) String local14 = (String) arg0.anObjectArray45[arg0.anInt6049 * 587908375];
		@Pc(25) String local25 = (String) arg0.anObjectArray45[arg0.anInt6049 * 587908375 + 1];
		if (client.anInt3514 * 2055688893 == 0 && (client.aBoolean623 && !client.aBoolean635 || client.aBoolean640)) {
			return;
		}
		@Pc(39) Class175 local39 = Class330.method27465(-1608641612);
		@Pc(45) Class93_Sub22 local45 = Class102.method2592(Class446.aClass446_9, local39.aClass24_2, (byte) 49);
		local45.aClass93_Sub41_Sub2_1.method22466(0, 2145264426);
		@Pc(56) int local56 = local45.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
		local45.aClass93_Sub41_Sub2_1.method22414(local14, -664135129);
		Class284.method26577(local45.aClass93_Sub41_Sub2_1, local25, -1497248091);
		local45.aClass93_Sub41_Sub2_1.method22419(local45.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local56, 857643681);
		local39.method24363(local45, -1594490576);
	}

	@OriginalMember(owner = "client!iw", name = "awj", descriptor = "(Lclient!yf;B)V")
	static void method27741(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		Class334.method27496(4, local13, local23, "", (short) 21248);
	}

	@OriginalMember(owner = "client!iw", name = "ae", descriptor = "(Lclient!yf;I)V")
	static void method27742(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class20.method375(16711935);
		Class111.method6799(arg0, 720906785);
	}

	@OriginalMember(owner = "client!iw", name = "lh", descriptor = "(Lclient!yf;I)V")
	static void method27743(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 1458907833);
		Class336.method27537(local16, arg0, -2125545030);
	}

	@OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(II)V")
	Class351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4244 = arg0 * -2071180329;
		this.anInt4245 = arg1 * -1388927923;
	}
}
