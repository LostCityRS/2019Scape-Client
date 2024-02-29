package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public class Class350 {

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "Lclient!ig;")
	static Class337 aClass337_1;

	@OriginalMember(owner = "client!iv", name = "v", descriptor = "[Ljava/lang/String;")
	static String[] aStringArray28;

	@OriginalMember(owner = "client!iv", name = "<init>", descriptor = "()V", line = 9)
	Class350() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!iv", name = "f", descriptor = "(Lclient!ig;)V", line = 14)
	public static void method27630(@OriginalArg(0) Class337 arg0) {
		aClass337_1 = arg0;
	}

	@OriginalMember(owner = "client!iv", name = "w", descriptor = "(Lclient!alw;Ljava/lang/String;)I", line = 18)
	public static int method27631(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) String arg1) {
		@Pc(4) int local4 = arg0.anInt3070 * 212851357;
		@Pc(8) byte[] local8 = Class269.method26271(arg1, (byte) -17);
		arg0.method22456(local8.length, (byte) -47);
		arg0.anInt3070 += aClass337_1.method27451(local8, 0, local8.length, arg0.aByteArray58, arg0.anInt3070 * 212851357, -299532126) * -1445626955;
		return arg0.anInt3070 * 212851357 - local4;
	}

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "([I[II)V", line = 19)
	public static void method27632(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null || arg1 == null) {
			Class588.anIntArray475 = null;
			Class723.anIntArray528 = null;
			Class723.aByteArrayArrayArray14 = null;
			return;
		}
		Class588.anIntArray475 = arg0;
		Class723.anIntArray528 = new int[arg0.length];
		Class723.aByteArrayArrayArray14 = new byte[arg0.length][][];
		for (@Pc(25) int local25 = 0; local25 < Class588.anIntArray475.length; local25++) {
			Class723.aByteArrayArrayArray14[local25] = new byte[arg1[local25]][];
		}
	}

	@OriginalMember(owner = "client!iv", name = "l", descriptor = "(Lclient!alw;I)Ljava/lang/String;", line = 31)
	static String method27633(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = arg0.method22528((byte) -40);
			if (local3 > arg1) {
				local3 = arg1;
			}
			@Pc(11) byte[] local11 = new byte[local3];
			arg0.anInt3070 += aClass337_1.method27458(arg0.aByteArray58, arg0.anInt3070 * 212851357, local11, 0, local3, (byte) 58) * -1445626955;
			return Class155.method15306(local11, 0, local3, (byte) 68);
		} catch (@Pc(39) Exception local39) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!iv", name = "u", descriptor = "(Lclient!alw;I)Ljava/lang/String;", line = 31)
	static String method27634(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = arg0.method22528((byte) -70);
			if (local3 > arg1) {
				local3 = arg1;
			}
			@Pc(11) byte[] local11 = new byte[local3];
			arg0.anInt3070 += aClass337_1.method27458(arg0.aByteArray58, arg0.anInt3070 * 212851357, local11, 0, local3, (byte) 15) * -1445626955;
			return Class155.method15306(local11, 0, local3, (byte) 15);
		} catch (@Pc(39) Exception local39) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!iv", name = "p", descriptor = "([I[Ljava/lang/Object;III)V", line = 187)
	public static void method27635(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) int local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) Object local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(45) int local45 = local14 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(47) int local47 = arg2; local47 < arg3; local47++) {
			if (arg0[local47] < local14 + (local47 & local45)) {
				@Pc(63) int local63 = arg0[local47];
				arg0[local47] = arg0[local10];
				arg0[local10] = local63;
				@Pc(77) Object local77 = arg1[local47];
				arg1[local47] = arg1[local10];
				arg1[local10++] = local77;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		method27635(arg0, arg1, arg2, local10 - 1, 1922837306);
		method27635(arg0, arg1, local10 + 1, arg3, 151102376);
	}

	@OriginalMember(owner = "client!iv", name = "aq", descriptor = "(IIII)V", line = 268)
	static void method27636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28000(11, (long) arg0);
		local4.method21886(-1727280149);
		local4.anInt3020 = arg1 * 1415359557;
		local4.anInt3025 = arg2 * -302789657;
	}

	@OriginalMember(owner = "client!iv", name = "cj", descriptor = "(Lclient!yf;I)V", line = 5464)
	static final void method27637(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32808(local12, 307799275);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class562.method31188(local16, local22, arg0, (byte) 1);
	}
}
