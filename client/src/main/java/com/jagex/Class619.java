package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class619 {

	@OriginalMember(owner = "client!vo", name = "dd", descriptor = "Lclient!df;")
	public static Class225 aClass225_8;

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "I")
	final int anInt5803;

	@OriginalMember(owner = "client!vo", name = "n", descriptor = "I")
	final int anInt5802;

	@OriginalMember(owner = "client!vo", name = "m", descriptor = "I")
	final int anInt5804;

	@OriginalMember(owner = "client!vo", name = "k", descriptor = "I")
	final int anInt5801;

	@OriginalMember(owner = "client!vo", name = "ah", descriptor = "(Lclient!yf;I)V")
	static void method32286(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		if (arg0.anIntArray521[arg0.anInt6052 * -1497248091] < arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1]) {
			arg0.anInt6050 += arg0.anIntArray522[arg0.anInt6050 * -709694321] * 2047914607;
		}
	}

	@OriginalMember(owner = "client!vo", name = "it", descriptor = "(Lclient!yf;I)V")
	static void method32287(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, -238281358);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class430.method28942(local16, local22, arg0, 862007149);
	}

	@OriginalMember(owner = "client!vo", name = "ahp", descriptor = "(Lclient!yf;B)V")
	static void method32288(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class606.method32091(-2075761707);
	}

	@OriginalMember(owner = "client!vo", name = "aqz", descriptor = "(Lclient!yf;I)V")
	static void method32289(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6049 -= -1422374923;
		@Pc(14) String local14 = (String) arg0.anObjectArray45[arg0.anInt6049 * 587908375];
		@Pc(25) String local25 = (String) arg0.anObjectArray45[arg0.anInt6049 * 587908375 + 1];
		@Pc(36) String local36 = (String) arg0.anObjectArray45[arg0.anInt6049 * 587908375 + 2];
		@Pc(54) boolean local54 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091] == 1;
		Class166_Sub18.method15753(local14, local25, local36, local54, -946038093);
	}

	@OriginalMember(owner = "client!vo", name = "bcp", descriptor = "(Lclient!yf;B)V")
	static void method32290(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		Class688.method36701((Class132_Sub1) arg0.anInterface61_1, arg0, 1527728487);
	}

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(IIII)V")
	Class619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt5803 = arg0 * 1818470663;
		this.anInt5802 = arg1 * 1518226865;
		this.anInt5804 = arg2 * -2068891701;
		this.anInt5801 = arg3 * 1352268411;
	}
}
