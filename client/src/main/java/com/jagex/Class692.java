package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ys")
public class Class692 {

	@OriginalMember(owner = "client!ys", name = "hl", descriptor = "Lclient!aoe;")
	public static Class32_Sub4 aClass32_Sub4_3;

	@OriginalMember(owner = "client!ys", name = "bj", descriptor = "I")
	public static int anInt5936;

	@OriginalMember(owner = "client!ys", name = "e", descriptor = "Lclient!ys;")
	public static final Class692 aClass692_8 = new Class692(1);

	@OriginalMember(owner = "client!ys", name = "n", descriptor = "Lclient!ys;")
	public static final Class692 aClass692_4 = new Class692(2);

	@OriginalMember(owner = "client!ys", name = "m", descriptor = "Lclient!ys;")
	public static final Class692 aClass692_3 = new Class692(4);

	@OriginalMember(owner = "client!ys", name = "k", descriptor = "Lclient!ys;")
	public static final Class692 aClass692_2 = new Class692(8);

	@OriginalMember(owner = "client!ys", name = "f", descriptor = "Lclient!ys;")
	public static final Class692 aClass692_5 = new Class692(16);

	@OriginalMember(owner = "client!ys", name = "w", descriptor = "Lclient!ys;")
	public static final Class692 aClass692_6 = new Class692(32);

	@OriginalMember(owner = "client!ys", name = "l", descriptor = "Lclient!ys;")
	public static final Class692 aClass692_7 = new Class692(64);

	@OriginalMember(owner = "client!ys", name = "u", descriptor = "Lclient!ys;")
	public static final Class692 aClass692_1 = new Class692(128);

	@OriginalMember(owner = "client!ys", name = "z", descriptor = "I")
	public final int anInt5935;

	@OriginalMember(owner = "client!ys", name = "<init>", descriptor = "(I)V", line = 14)
	Class692(@OriginalArg(0) int arg0) {
		this.anInt5935 = arg0 * 1938704131;
	}

	@OriginalMember(owner = "client!ys", name = "r", descriptor = "(B)V", line = 207)
	static void method36595(@OriginalArg(0) byte arg0) {
		Class411.aString199 = "";
		Class411.aString201 = "";
		Class411.username = "";
		Class411.aBoolean751 = true;
	}

	@OriginalMember(owner = "client!ys", name = "eb", descriptor = "(IIB)V", line = 963)
	public static void method36596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		Class93_Sub14.anInt1527 = (arg0 - Class159_Sub1.anInt1915) * -1845499089;
		Class159_Sub1.anInt1952 = (arg1 - Class159_Sub1.anInt1921) * 1415476369;
		Class159_Sub1.anInt1956 = -130712985;
		Class159_Sub1.anInt1951 = -919990023;
		Class358.method27776(-2013703278);
	}

	@OriginalMember(owner = "client!ys", name = "fm", descriptor = "(Lclient!yf;I)V", line = 5864)
	static final void method36597(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class593.method31719(local11, local14, arg0, 2028922900);
	}

	@OriginalMember(owner = "client!ys", name = "akw", descriptor = "(Lclient!yf;I)V", line = 11591)
	static final void method36598(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(15) Class93_Sub1_Sub20 local15 = Class93_Sub12.method13453((byte) 1);
		if (local15 != null) {
			@Pc(36) boolean local36 = local15.method23174(local12 >> 28 & 0x3, local12 >> 14 & 0x3FFF, local12 & 0x3FFF, Class687.anIntArray525, 258936316);
			if (local36) {
				method36596(Class687.anIntArray525[1], Class687.anIntArray525[2], (byte) 0);
			}
		}
	}

	@OriginalMember(owner = "client!ys", name = "alu", descriptor = "(Lclient!yf;S)V", line = 11792)
	static final void method36599(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(28) boolean local28 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1] == 1;
		if (local13 == 0) {
			Class159_Sub1.aBoolean354 = local28;
		} else if (local13 == 1) {
			Class159_Sub1.aBoolean353 = local28;
		} else if (local13 == 2) {
			Class159_Sub1.aBoolean358 = local28;
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ys", name = "amk", descriptor = "(Lclient!yf;B)V", line = 12079)
	static final void method36600(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5888 -= -1422374923;
		Class480.method29750((String) arg0.anObjectArray45[arg0.anInt5888 * 587908375], (String) arg0.anObjectArray45[arg0.anInt5888 * 587908375 + 1], (String) arg0.anObjectArray45[arg0.anInt5888 * 587908375 + 2], arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091] == 1, true, -767293693);
	}

	@OriginalMember(owner = "client!ys", name = "arw", descriptor = "(Lclient!yf;S)V", line = 12953)
	static final void method36601(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		Class3.method22((byte) 104);
	}

	@OriginalMember(owner = "client!ys", name = "awf", descriptor = "(Lclient!yf;B)V", line = 13802)
	static final void method36602(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		Class334.method27403(2, local13, local23, "", (short) 13121);
	}
}
