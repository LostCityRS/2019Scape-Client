package com.jagex;

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qg")
final class Class505 implements Interface9 {

	@OriginalMember(owner = "client!qg", name = "bv", descriptor = "Ljava/lang/String;")
	public static String aString216;

	@OriginalMember(owner = "client!qg", name = "jo", descriptor = "(Lclient!yp;I)V")
	static void method30465(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
	}

	@OriginalMember(owner = "client!qg", name = "bbl", descriptor = "(Lclient!yp;I)V")
	static void method30466(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.aClass327_7 == null ? -1 : client.aClass327_7.anInt4087 * -2053489901;
	}

	@OriginalMember(owner = "client!qg", name = "yi", descriptor = "(Lclient!yp;I)V")
	static void method30467(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class630.anInt5553 * 721317679;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class630.anInt5554 * 876474189;
	}

	@OriginalMember(owner = "client!qg", name = "je", descriptor = "(Lclient!ad;I)Z")
	static boolean method30468(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		try {
			return Class103_Sub20.method8554(arg0, 1349483335);
		} catch (@Pc(4) IOException local4) {
			if (client.anInt3433 * 1994758437 == 15) {
				arg0.method1320(1557355805);
				return false;
			} else {
				Class588.method31903((byte) -54);
				return true;
			}
		} catch (@Pc(19) Exception local19) {
			@Pc(23) Class626 local23 = client.aClass539_1.method30893((byte) -92);
			@Pc(99) String local99 = (arg0.aClass448_2 == null ? -1 : arg0.aClass448_2.anInt4887 * -452698733) + Class256.aString157 + (arg0.aClass448_4 == null ? -1 : arg0.aClass448_4.anInt4887 * -452698733) + Class256.aString157 + (arg0.aClass448_1 == null ? -1 : arg0.aClass448_1.anInt4887 * -452698733) + " " + arg0.anInt248 * 460106407 + Class256.aString157 + (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray234[0] + local23.anInt5540 * -390642507) + Class256.aString157 + (local23.anInt5537 * -894305615 + Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray242[0]) + " ";
			for (@Pc(101) int local101 = 0; local101 < arg0.anInt248 * 460106407 && local101 < 50; local101++) {
				local99 = local99 + arg0.aClass80_Sub36_Sub1_1.aByteArray61[local101] + Class256.aString157;
			}
			Class603.method32133(local99, local19, 839300151);
			Class266.method26657(false, (short) 13472);
			return true;
		}
	}

	@OriginalMember(owner = "client!qg", name = "dc", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method30469(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		arg0.anInt4166 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581] * 1002124109;
		Class296.method26998(arg0, -1168242995);
	}

	@OriginalMember(owner = "client!qg", name = "l", descriptor = "(Lclient!ald;B)Lclient!vd;")
	static Class610 method30470(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0.method23362(-2087237171);
		@Pc(7) int local7 = arg0.method23362(-797066671);
		@Pc(11) int local11 = arg0.method23362(718787610);
		@Pc(14) int[] local14 = new int[local11];
		for (@Pc(16) int local16 = 0; local16 < local11; local16++) {
			local14[local16] = arg0.method23362(-781470258);
		}
		return new Class610(local3, local7, local14);
	}

	@OriginalMember(owner = "client!qg", name = "avc", descriptor = "(Lclient!yp;I)V")
	static void method30471(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!qg", name = "t", descriptor = "(Lclient!ald;S)Ljava/lang/Object;")
	@Override
	public Object method30638(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) short arg1) {
		return arg0.method23182(588864657);
	}

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "(Lclient!ald;)Ljava/lang/Object;")
	@Override
	public Object method30635(@OriginalArg(0) Class80_Sub36 arg0) {
		return arg0.method23182(-1136431396);
	}

	@OriginalMember(owner = "client!qg", name = "e", descriptor = "(Lclient!ald;)Ljava/lang/Object;")
	@Override
	public Object method30637(@OriginalArg(0) Class80_Sub36 arg0) {
		return arg0.method23182(-1131004135);
	}

	@OriginalMember(owner = "client!qg", name = "u", descriptor = "(Lclient!ald;)Ljava/lang/Object;")
	@Override
	public Object method30636(@OriginalArg(0) Class80_Sub36 arg0) {
		return arg0.method23182(407723674);
	}
}
