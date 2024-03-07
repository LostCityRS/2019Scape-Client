package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaj")
public class Class12 {

	@OriginalMember(owner = "client!aaj", name = "e", descriptor = "Lclient!aaj;")
	static final Class12 aClass12_2 = new Class12(0);

	@OriginalMember(owner = "client!aaj", name = "n", descriptor = "Lclient!aaj;")
	public static final Class12 aClass12_1 = new Class12(1);

	@OriginalMember(owner = "client!aaj", name = "m", descriptor = "Lclient!aaj;")
	static final Class12 aClass12_3 = new Class12(2);

	@OriginalMember(owner = "client!aaj", name = "k", descriptor = "I")
	public final int anInt25;

	@OriginalMember(owner = "client!aaj", name = "m", descriptor = "()[Lclient!aaj;", line = 11)
	static Class12[] method181() {
		return new Class12[] { aClass12_3, aClass12_1, aClass12_2 };
	}

	@OriginalMember(owner = "client!aaj", name = "k", descriptor = "()[Lclient!aaj;", line = 11)
	static Class12[] method182() {
		return new Class12[] { aClass12_3, aClass12_1, aClass12_2 };
	}

	@OriginalMember(owner = "client!aaj", name = "f", descriptor = "()[Lclient!aaj;", line = 11)
	static Class12[] method183() {
		return new Class12[] { aClass12_3, aClass12_1, aClass12_2 };
	}

	@OriginalMember(owner = "client!aaj", name = "w", descriptor = "()[Lclient!aaj;", line = 11)
	static Class12[] method184() {
		return new Class12[] { aClass12_3, aClass12_1, aClass12_2 };
	}

	@OriginalMember(owner = "client!aaj", name = "<init>", descriptor = "(I)V", line = 14)
	Class12(@OriginalArg(0) int arg0) {
		this.anInt25 = arg0 * -55199245;
	}

	@OriginalMember(owner = "client!aaj", name = "l", descriptor = "(I)Lclient!aaj;", line = 20)
	public static Class12 method185(@OriginalArg(0) int arg0) {
		@Pc(2) Class12[] local2 = Class352.method27651(-1448223664);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class12 local12 = local2[local4];
			if (arg0 == local12.anInt25 * -1955231941) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aaj", name = "eo", descriptor = "(I)V", line = 1035)
	static void method186(@OriginalArg(0) int arg0) {
		client.anInt3539 = 0;
		client.anInt3541 = 0;
		client.anInt3542 = 0;
		client.anInt3543 = 0;
		client.anInt3544 = 0;
		client.anInt3545 = 0;
		client.anInt3546 = 0;
		client.anInt3547 = 0;
		client.anInt3507 = 0;
		client.anInt3447 = 0;
		client.anInt3548 = 0;
		client.anInt3440 = 0;
		client.anInt3550 = 0;
		client.anInt3551 = 0;
		client.anInt3517 = 0;
	}

	@OriginalMember(owner = "client!aaj", name = "gi", descriptor = "(Lclient!hf;Lclient!hq;ZILclient!yf;I)V", line = 6218)
	static final void method187(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class681 arg4, @OriginalArg(5) int arg5) {
		arg4.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg4.anIntArray519[arg4.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg4.anIntArray519[arg4.anInt5891 * -1497248091 + 1];
		if (arg0.anInt3970 * 532402067 == -1 && !arg1.aBoolean708) {
			Class485.method29800(arg0.anInt3953 * -1549590237, 1618096379);
			Class239.method25818(arg0.anInt3953 * -1549590237, -156727306);
			Class50.method1002(arg0.anInt3953 * -1549590237, 961338414);
		}
		if (local13 == -1) {
			arg0.anInt4001 = 1317320699;
			arg0.anInt4037 = -971360853;
			arg0.anInt4045 = -678873919;
			return;
		}
		arg0.anInt4045 = local13 * 678873919;
		arg0.anInt4046 = local23 * -284330987;
		arg0.aBoolean689 = arg2;
		@Pc(82) Class47 local82 = (Class47) Class277.aClass32_Sub12_1.method18261(local13, 1227903220);
		arg0.anInt4006 = local82.anInt145 * 1241028479;
		arg0.anInt4007 = local82.anInt138 * 1321409063;
		arg0.anInt4044 = local82.anInt147 * -1708793689;
		arg0.anInt4004 = local82.anInt186 * -409194147;
		arg0.anInt4042 = local82.anInt149 * -1722157859;
		arg0.anInt4028 = local82.anInt144 * -714062839;
		arg0.anInt4014 = arg3 * -2093534285;
		if (arg0.anInt4003 * 1011166973 > 0) {
			arg0.anInt4028 = arg0.anInt4028 * -563441120 / (arg0.anInt4003 * 1011166973) * -1283265423;
		} else if (arg0.anInt3977 * 596415983 > 0) {
			arg0.anInt4028 = arg0.anInt4028 * -563441120 / (arg0.anInt3977 * 596415983) * -1283265423;
		}
	}

	@OriginalMember(owner = "client!aaj", name = "zm", descriptor = "(Lclient!yf;I)V", line = 9476)
	static final void method188(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -725861497;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		if (local23 == -1) {
			throw new RuntimeException();
		}
		@Pc(46) Class39 local46 = (Class39) Class19.aClass32_Sub7_5.method18261(local23, -1108907654);
		if (local46.aClass519_1.getId() != local13) {
			throw new RuntimeException();
		}
		@Pc(61) int[] local61 = local46.method764(local33, -1497248091);
		@Pc(63) int local63 = 0;
		if (local61 != null) {
			local63 = local61.length;
		}
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local63;
	}

	@OriginalMember(owner = "client!aaj", name = "apn", descriptor = "(Lclient!yf;I)V", line = 12736)
	static final void method189(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class95.method1800(1370344734);
	}
}
