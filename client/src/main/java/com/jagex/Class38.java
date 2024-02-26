package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.util.Calendar;

@OriginalClass("client!abl")
public final class Class38 {

	@OriginalMember(owner = "client!abl", name = "l", descriptor = "(Lclient!pf;Lclient!xl;I)[B")
	static byte[] method821(@OriginalArg(0) Class480 arg0, @OriginalArg(1) Class664 arg1, @OriginalArg(2) int arg2) {
		return arg1.method33353(1717510120) > 1 ? arg0.method29918(arg1.method33356(arg2, (byte) 19), arg1.method33354(arg2, (byte) -28), 1896589581) : arg0.method29918(arg1.anInt5690 * -1975739137, arg2, 1896589581);
	}

	@OriginalMember(owner = "client!abl", name = "e", descriptor = "(Lclient!pf;Lclient!xl;)I")
	static int method822(@OriginalArg(0) Class480 arg0, @OriginalArg(1) Class664 arg1) {
		if (arg0 == null) {
			return 0;
		} else if (arg1.method33353(410981680) > 1) {
			@Pc(12) int local12 = arg0.method29930(-501088122) - 1;
			return local12 * arg1.method33353(-175088953) + arg0.method29929(local12, -561697017);
		} else {
			return arg0.method29929(arg1.anInt5690 * -1975739137, -561697017);
		}
	}

	@OriginalMember(owner = "client!abl", name = "u", descriptor = "(Lclient!pf;Lclient!xl;)I")
	static int method823(@OriginalArg(0) Class480 arg0, @OriginalArg(1) Class664 arg1) {
		if (arg0 == null) {
			return 0;
		} else if (arg1.method33353(-297171479) > 1) {
			@Pc(12) int local12 = arg0.method29930(-1036973326) - 1;
			return local12 * arg1.method33353(1126329747) + arg0.method29929(local12, -561697017);
		} else {
			return arg0.method29929(arg1.anInt5690 * -1975739137, -561697017);
		}
	}

	@OriginalMember(owner = "client!abl", name = "e", descriptor = "(JIZB)Ljava/lang/String;")
	static String method824(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) byte arg3) {
		@Pc(5) Calendar local5;
		if (arg2) {
			Class378.method28537(arg0);
			local5 = Class62.aCalendar2;
		} else {
			Class220.method25907(arg0);
			local5 = Class62.aCalendar1;
		}
		@Pc(14) int local14 = local5.get(5);
		@Pc(20) int local20 = local5.get(2) + 1;
		@Pc(24) int local24 = local5.get(1);
		@Pc(28) int local28 = local5.get(11);
		@Pc(32) int local32 = local5.get(12);
		return Integer.toString(local14 / 10) + local14 % 10 + "/" + local20 / 10 + local20 % 10 + "/" + local24 % 100 / 10 + local24 % 10 + " " + local28 / 10 + local28 % 10 + ":" + local32 / 10 + local32 % 10;
	}

	@OriginalMember(owner = "client!abl", name = "<init>", descriptor = "()V")
	Class38() throws Throwable {
		throw new Error();
	}
}
