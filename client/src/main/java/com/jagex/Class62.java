package com.jagex;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acm")
public final class Class62 {

	@OriginalMember(owner = "client!acm", name = "gg", descriptor = "Lclient!pf;")
	public static Class480 aClass480_8;

	@OriginalMember(owner = "client!acm", name = "uh", descriptor = "I")
	public static int anInt214;

	@OriginalMember(owner = "client!acm", name = "t", descriptor = "[[Ljava/lang/String;")
	static final String[][] aStringArrayArray1 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" }, { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic" } };

	@OriginalMember(owner = "client!acm", name = "f", descriptor = "Ljava/util/Calendar;")
	static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!acm", name = "e", descriptor = "Ljava/util/Calendar;")
	static Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!acm", name = "r", descriptor = "(JIZ)Ljava/lang/String;")
	public static String method1191(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) Calendar local5;
		if (arg2) {
			Class378.method28537(arg0);
			local5 = aCalendar2;
		} else {
			Class220.method25907(arg0);
			local5 = aCalendar1;
		}
		@Pc(14) int local14 = local5.get(5);
		@Pc(18) int local18 = local5.get(2);
		@Pc(22) int local22 = local5.get(1);
		@Pc(26) int local26 = local5.get(11);
		@Pc(30) int local30 = local5.get(12);
		return arg1 == 3 ? Class38.method824(arg0, arg1, arg2, (byte) -55) : Integer.toString(local14 / 10) + local14 % 10 + "-" + aStringArrayArray1[arg1][local18] + "-" + local22 + " " + local26 / 10 + local26 % 10 + ":" + local30 / 10 + local30 % 10;
	}

	@OriginalMember(owner = "client!acm", name = "w", descriptor = "(JI)Ljava/lang/String;")
	public static String method1192(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		Class220.method25907(arg0);
		@Pc(5) int local5 = aCalendar1.get(5);
		@Pc(9) int local9 = aCalendar1.get(2);
		@Pc(13) int local13 = aCalendar1.get(1);
		return arg1 == 3 ? Class80_Sub7.method13453(arg0, arg1, 1669985981) : Integer.toString(local5 / 10) + local5 % 10 + "-" + aStringArrayArray1[arg1][local9] + "-" + local13;
	}

	@OriginalMember(owner = "client!acm", name = "s", descriptor = "(JI)Ljava/lang/String;")
	public static String method1193(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		Class220.method25907(arg0);
		@Pc(5) int local5 = aCalendar1.get(5);
		@Pc(9) int local9 = aCalendar1.get(2);
		@Pc(13) int local13 = aCalendar1.get(1);
		return arg1 == 3 ? Class80_Sub7.method13453(arg0, arg1, 2084051316) : Integer.toString(local5 / 10) + local5 % 10 + "-" + aStringArrayArray1[arg1][local9] + "-" + local13;
	}

	@OriginalMember(owner = "client!acm", name = "k", descriptor = "(JI)Ljava/lang/String;")
	public static String method1194(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		Class220.method25907(arg0);
		@Pc(5) int local5 = aCalendar1.get(5);
		@Pc(9) int local9 = aCalendar1.get(2);
		@Pc(13) int local13 = aCalendar1.get(1);
		return arg1 == 3 ? Class80_Sub7.method13453(arg0, arg1, 1560742430) : Integer.toString(local5 / 10) + local5 % 10 + "-" + aStringArrayArray1[arg1][local9] + "-" + local13;
	}

	@OriginalMember(owner = "client!acm", name = "x", descriptor = "(JI)Ljava/lang/String;")
	public static String method1195(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		Class220.method25907(arg0);
		@Pc(5) int local5 = aCalendar1.get(5);
		@Pc(9) int local9 = aCalendar1.get(2);
		@Pc(13) int local13 = aCalendar1.get(1);
		return arg1 == 3 ? Class80_Sub7.method13453(arg0, arg1, 1384522369) : Integer.toString(local5 / 10) + local5 % 10 + "-" + aStringArrayArray1[arg1][local9] + "-" + local13;
	}

	@OriginalMember(owner = "client!acm", name = "c", descriptor = "(IIIIII)J")
	public static long method1196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		aCalendar2.clear();
		aCalendar2.set(arg5, arg4, arg3, arg2, arg1, arg0);
		return aCalendar2.getTime().getTime();
	}

	@OriginalMember(owner = "client!acm", name = "d", descriptor = "(JI)Ljava/lang/String;")
	static String method1197(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		Class220.method25907(arg0);
		@Pc(5) int local5 = aCalendar1.get(5);
		@Pc(11) int local11 = aCalendar1.get(2) + 1;
		@Pc(15) int local15 = aCalendar1.get(1);
		return Integer.toString(local5 / 10) + local5 % 10 + "/" + local11 / 10 + local11 % 10 + "/" + local15 % 100 / 10 + local15 % 10;
	}

	@OriginalMember(owner = "client!acm", name = "q", descriptor = "(JIZ)Ljava/lang/String;")
	static String method1198(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) Calendar local5;
		if (arg2) {
			Class378.method28537(arg0);
			local5 = aCalendar2;
		} else {
			Class220.method25907(arg0);
			local5 = aCalendar1;
		}
		@Pc(14) int local14 = local5.get(5);
		@Pc(20) int local20 = local5.get(2) + 1;
		@Pc(24) int local24 = local5.get(1);
		@Pc(28) int local28 = local5.get(11);
		@Pc(32) int local32 = local5.get(12);
		return Integer.toString(local14 / 10) + local14 % 10 + "/" + local20 / 10 + local20 % 10 + "/" + local24 % 100 / 10 + local24 % 10 + " " + local28 / 10 + local28 % 10 + ":" + local32 / 10 + local32 % 10;
	}

	@OriginalMember(owner = "client!acm", name = "h", descriptor = "(JI)Ljava/lang/String;")
	static String method1199(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		Class220.method25907(arg0);
		@Pc(5) int local5 = aCalendar1.get(5);
		@Pc(11) int local11 = aCalendar1.get(2) + 1;
		@Pc(15) int local15 = aCalendar1.get(1);
		return Integer.toString(local5 / 10) + local5 % 10 + "/" + local11 / 10 + local11 % 10 + "/" + local15 % 100 / 10 + local15 % 10;
	}

	@OriginalMember(owner = "client!acm", name = "z", descriptor = "(JI)Ljava/lang/String;")
	public static String method1200(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		Class220.method25907(arg0);
		@Pc(5) int local5 = aCalendar1.get(11);
		@Pc(9) int local9 = aCalendar1.get(12);
		@Pc(13) int local13 = aCalendar1.get(13);
		return Integer.toString(local5 / 10) + local5 % 10 + ":" + local9 / 10 + local9 % 10 + ":" + local13 / 10 + local13 % 10;
	}

	@OriginalMember(owner = "client!acm", name = "p", descriptor = "(JI)Ljava/lang/String;")
	public static String method1201(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		Class220.method25907(arg0);
		@Pc(5) int local5 = aCalendar1.get(11);
		@Pc(9) int local9 = aCalendar1.get(12);
		@Pc(13) int local13 = aCalendar1.get(13);
		return Integer.toString(local5 / 10) + local5 % 10 + ":" + local9 / 10 + local9 % 10 + ":" + local13 / 10 + local13 % 10;
	}

	@OriginalMember(owner = "client!acm", name = "y", descriptor = "(J)I")
	public static int method1202(@OriginalArg(0) long arg0) {
		return (int) (arg0 / 86400000L) - 11745;
	}

	@OriginalMember(owner = "client!acm", name = "n", descriptor = "(J)V")
	static void method1203(@OriginalArg(0) long arg0) {
		aCalendar2.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!acm", name = "v", descriptor = "(J)I")
	public static int method1204(@OriginalArg(0) long arg0) {
		return (int) (arg0 / 86400000L) - 11745;
	}

	@OriginalMember(owner = "client!acm", name = "b", descriptor = "(IIIIII)J")
	public static long method1205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		aCalendar2.clear();
		aCalendar2.set(arg5, arg4, arg3, arg2, arg1, arg0);
		return aCalendar2.getTime().getTime();
	}

	@OriginalMember(owner = "client!acm", name = "ax", descriptor = "(I)J")
	public static long method1206(@OriginalArg(0) int arg0) {
		return (long) (arg0 + 11745) * 86400000L;
	}

	@OriginalMember(owner = "client!acm", name = "ay", descriptor = "(I)J")
	public static long method1207(@OriginalArg(0) int arg0) {
		return (long) (arg0 + 11745) * 86400000L;
	}

	@OriginalMember(owner = "client!acm", name = "ai", descriptor = "(I)J")
	public static long method1208(@OriginalArg(0) int arg0) {
		return (long) (arg0 + 11745) * 86400000L;
	}

	@OriginalMember(owner = "client!acm", name = "aq", descriptor = "(J)I")
	public static int method1209(@OriginalArg(0) long arg0) {
		Class220.method25907(arg0);
		return aCalendar1.get(1);
	}

	@OriginalMember(owner = "client!acm", name = "f", descriptor = "(II)Lclient!adj;")
	public static Class82 method1210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class82[] local2 = Class507.method30512((byte) -67);
		@Pc(4) Class82[] local4 = local2;
		for (@Pc(6) int local6 = 0; local6 < local4.length; local6++) {
			@Pc(14) Class82 local14 = local4[local6];
			if (local14.anInt258 * 458152375 == arg0) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!acm", name = "<init>", descriptor = "()V")
	Class62() throws Throwable {
		throw new Error();
	}
}
