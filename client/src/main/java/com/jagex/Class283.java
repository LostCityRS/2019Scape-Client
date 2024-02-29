package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public class Class283 {

	@OriginalMember(owner = "client!gb", name = "do", descriptor = "Lclient!no;")
	public static Class444 aClass444_1;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V", line = 4)
	Class283() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "(J)V", line = 9)
	public static final void method26470(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Class172.method23196(arg0 - 1L);
			Class172.method23196(1L);
		} else {
			Class172.method23196(arg0);
		}
	}

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "(J)V", line = 9)
	public static final void method26471(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Class172.method23196(arg0 - 1L);
			Class172.method23196(1L);
		} else {
			Class172.method23196(arg0);
		}
	}

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "(J)V", line = 9)
	public static final void method26472(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Class172.method23196(arg0 - 1L);
			Class172.method23196(1L);
		} else {
			Class172.method23196(arg0);
		}
	}

	@OriginalMember(owner = "client!gb", name = "w", descriptor = "(J)V", line = 9)
	public static final void method26473(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Class172.method23196(arg0 - 1L);
			Class172.method23196(1L);
		} else {
			Class172.method23196(arg0);
		}
	}

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "(J)V", line = 9)
	public static final void method26474(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Class172.method23196(arg0 - 1L);
			Class172.method23196(1L);
		} else {
			Class172.method23196(arg0);
		}
	}

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "(J)V", line = 20)
	static final void method26475(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "(B)V", line = 165)
	public static void method26476(@OriginalArg(0) byte arg0) {
		Class487.anInt5150 = 0;
		Class487.anInt5151 = 0;
	}

	@OriginalMember(owner = "client!gb", name = "al", descriptor = "(Lclient!yf;I)V", line = 237)
	static void method26477(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class407.method28582(955083601) ? 1 : 0;
	}

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "(Lclient!py;Lclient!py;Lclient!py;Lclient!py;I)V", line = 261)
	public static void method26478(@OriginalArg(0) Class497 arg0, @OriginalArg(1) Class497 arg1, @OriginalArg(2) Class497 arg2, @OriginalArg(3) Class497 arg3, @OriginalArg(4) int arg4) {
		Class589.aClass497_132 = arg0;
		Class108.aClass497_21 = arg1;
		Class709.aClass497_142 = arg2;
		Class166_Sub1.aClass320Array1 = new Class320[Class589.aClass497_132.method30090((byte) -110)];
		Class9.aBooleanArray1 = new boolean[Class589.aClass497_132.method30090((byte) -83)];
	}

	@OriginalMember(owner = "client!gb", name = "iu", descriptor = "(Lclient!yf;I)V", line = 6498)
	static final void method26479(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 1656673384);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class110_Sub8.method7959(local16, local22, arg0, (short) -26666);
	}

	@OriginalMember(owner = "client!gb", name = "amy", descriptor = "(Lclient!yf;B)V", line = 12041)
	static final void method26480(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class175.method24376(local13, local23, (byte) 15) ? 1 : 0;
	}
}
