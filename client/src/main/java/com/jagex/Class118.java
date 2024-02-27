package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public abstract class Class118 implements Interface4 {

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "Lclient!py;")
	final Class497 aClass497_25;

	@OriginalMember(owner = "client!hh", name = "n", descriptor = "Lclient!eb;")
	Class240 aClass240_14;

	@OriginalMember(owner = "client!hh", name = "t", descriptor = "(Lclient!yf;B)V")
	static void method8407(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class269.method26365(-596264717);
	}

	@OriginalMember(owner = "client!hh", name = "ic", descriptor = "(Lclient!yf;I)V")
	static void method8408(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
	}

	@OriginalMember(owner = "client!hh", name = "aig", descriptor = "(Lclient!yf;B)V")
	static void method8409(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class449.aClass514_1.method30448(local13, (byte) -56).anIntArray261[local23];
	}

	@OriginalMember(owner = "client!hh", name = "aus", descriptor = "(Lclient!yf;B)V")
	static void method8410(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub28_1.method16049((byte) -16) == 1 ? 1 : 0;
	}

	@OriginalMember(owner = "client!hh", name = "awg", descriptor = "(Lclient!yf;I)V")
	static void method8411(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) int local16 = local12 >> 16;
		if (Class166_Sub1.aClass320Array1[local16] == null) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class166_Sub1.aClass320Array1[local16].aClass312Array3[local12].anInt4009 * 373487909;
		}
	}

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)V")
	public static void method8412(@OriginalArg(0) int arg0) {
		Class60.aClass22_2 = new Class22();
	}

	@OriginalMember(owner = "client!hh", name = "bq", descriptor = "(IB)Z")
	static boolean method8413(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6 || arg0 == 1001 || arg0 == 1002) {
			return true;
		} else {
			return arg0 == 2;
		}
	}

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "([Ljava/lang/String;[II)V")
	public static void method8414(@OriginalArg(0) String[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		Class370.method28177(arg0, arg1, 0, arg0.length - 1, -1716175909);
	}

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "(Lclient!alw;I)Lclient!vt;")
	public static Interface67 method8415(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class623 local5 = Class351.method27735(arg0.method22425((short) 16384), 1962594255);
		if (Class623.aClass623_2 == local5) {
			return Class632.method32476(arg0, -912817713);
		} else if (local5 == Class623.aClass623_1) {
			return Class280.method26547(arg0, (byte) -37);
		} else if (Class623.aClass623_3 == local5) {
			return Class448.method29101(arg0, -152339054);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lclient!py;I)V")
	Class118(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1) {
		this.aClass497_25 = arg0;
		this.aClass240_14 = new Class240(arg1);
	}
}
