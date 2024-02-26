package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class461 {

	@OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
	public static final int anInt4908 = 20;

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
	public static final int anInt4909 = 2;

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
	public static final int anInt4910 = 29;

	@OriginalMember(owner = "client!ol", name = "w", descriptor = "I")
	public static final int anInt4911 = 22;

	@OriginalMember(owner = "client!ol", name = "u", descriptor = "I")
	public static final int anInt4912 = 11;

	@OriginalMember(owner = "client!ol", name = "t", descriptor = "I")
	public static final int anInt4913 = 28;

	@OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
	public static final int anInt4914 = 21;

	@OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
	public static final int anInt4915 = 10;

	@OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
	public static final int anInt4916 = 5;

	@OriginalMember(owner = "client!ol", name = "y", descriptor = "I")
	public static final int anInt4917 = 8;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
	public static final int anInt4918 = 9;

	@OriginalMember(owner = "client!ol", name = "s", descriptor = "I")
	public static final int anInt4919 = 23;

	@OriginalMember(owner = "client!ol", name = "k", descriptor = "I")
	public static final int anInt4920 = 14;

	@OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
	public static final int anInt4921 = 25;

	@OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
	public static final int anInt4922 = 24;

	@OriginalMember(owner = "client!ol", name = "r", descriptor = "I")
	public static final int anInt4923 = 6;

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
	public static final int anInt4924 = 3;

	@OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
	public static final int anInt4925 = 4;

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
	public static final int anInt4926 = 19;

	@OriginalMember(owner = "client!ol", name = "z", descriptor = "I")
	public static final int anInt4927 = 16;

	@OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
	public static final int anInt4928 = 27;

	@OriginalMember(owner = "client!ol", name = "v", descriptor = "I")
	public static final int anInt4929 = 13;

	@OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
	public static final int anInt4930 = 17;

	@OriginalMember(owner = "client!ol", name = "x", descriptor = "I")
	public static final int anInt4931 = 26;

	@OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
	public static final int anInt4932 = 1;

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
	public static final int anInt4933 = 15;

	@OriginalMember(owner = "client!ol", name = "cg", descriptor = "Lclient!aan;")
	static Class15 aClass15_10;

	@OriginalMember(owner = "client!ol", name = "n", descriptor = "(IIIII)I")
	static int method29433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(11) int local11 = 65536 - Class467.anIntArray453[arg2 * 8192 / arg3] >> 1;
		return (arg0 * (65536 - local11) >> 16) + (local11 * arg1 >> 16);
	}

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "(IB)Z")
	public static boolean method29434(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return arg0 >= Class607.aClass607_13.anInt5396 * 1323580581 && arg0 <= Class607.aClass607_5.anInt5396 * 1323580581 || arg0 == Class607.aClass607_20.anInt5396 * 1323580581;
	}

	@OriginalMember(owner = "client!ol", name = "pm", descriptor = "(Lclient!yp;I)V")
	static void method29435(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class114.method8626(local11, local14, arg0, -237441248);
	}

	@OriginalMember(owner = "client!ol", name = "afd", descriptor = "(Lclient!yp;I)V")
	static void method29436(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class304.method27127((char) local12, (byte) -60) ? 1 : 0;
	}

	@OriginalMember(owner = "client!ol", name = "fx", descriptor = "(II)Z")
	static boolean method29437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 17 || arg0 == 7 || arg0 == 0 || arg0 == 12 || arg0 == 8;
	}

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "()V")
	Class461() throws Throwable {
		throw new Error();
	}
}
