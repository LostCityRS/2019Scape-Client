package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public class Class358 {

	@OriginalMember(owner = "client!jd", name = "pi", descriptor = "I")
	public static int anInt4567;

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "Lclient!jd;")
	static final Class358 aClass358_4 = new Class358(0);

	@OriginalMember(owner = "client!jd", name = "n", descriptor = "Lclient!jd;")
	public static final Class358 aClass358_3 = new Class358(1);

	@OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
	public int anInt4566;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(I)V", line = 8)
	Class358(@OriginalArg(0) int arg0) {
		this.anInt4566 = arg0 * -1668929393;
	}

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "(I)Lclient!jd;", line = 13)
	static Class358 method27771(@OriginalArg(0) int arg0) {
		if (arg0 == aClass358_4.anInt4566 * 989197935) {
			return aClass358_4;
		} else if (arg0 == aClass358_3.anInt4566 * 989197935) {
			return aClass358_3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jd", name = "n", descriptor = "(I)Lclient!jd;", line = 13)
	static Class358 method27772(@OriginalArg(0) int arg0) {
		if (arg0 == aClass358_4.anInt4566 * 989197935) {
			return aClass358_4;
		} else if (arg0 == aClass358_3.anInt4566 * 989197935) {
			return aClass358_3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jd", name = "m", descriptor = "(I)Lclient!jd;", line = 13)
	static Class358 method27773(@OriginalArg(0) int arg0) {
		if (arg0 == aClass358_4.anInt4566 * 989197935) {
			return aClass358_4;
		} else if (arg0 == aClass358_3.anInt4566 * 989197935) {
			return aClass358_3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)Lclient!jd;", line = 13)
	static Class358 method27774(@OriginalArg(0) int arg0) {
		if (arg0 == aClass358_4.anInt4566 * 989197935) {
			return aClass358_4;
		} else if (arg0 == aClass358_3.anInt4566 * 989197935) {
			return aClass358_3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "(B)V", line = 134)
	static final void method27775(@OriginalArg(0) byte arg0) {
		Class411.aLong271 = -7033311592096984251L;
		Class411.aLong270 = 0L;
		Class411.anInt4746 = -48143567;
	}

	@OriginalMember(owner = "client!jd", name = "dl", descriptor = "(I)V", line = 232)
	static void method27776(@OriginalArg(0) int arg0) {
		if (Class93_Sub14.anInt1527 * -1951188017 < 0) {
			Class93_Sub14.anInt1527 = 0;
			Class159_Sub1.anInt1956 = -130712985;
			Class159_Sub1.anInt1951 = -919990023;
		}
		if (Class93_Sub14.anInt1527 * -1951188017 > Class159_Sub1.anInt1923) {
			Class93_Sub14.anInt1527 = Class159_Sub1.anInt1923 * -1845499089;
			Class159_Sub1.anInt1956 = -130712985;
			Class159_Sub1.anInt1951 = -919990023;
		}
		if (Class159_Sub1.anInt1952 * -1606693775 < 0) {
			Class159_Sub1.anInt1952 = 0;
			Class159_Sub1.anInt1956 = -130712985;
			Class159_Sub1.anInt1951 = -919990023;
		}
		if (Class159_Sub1.anInt1952 * -1606693775 > Class159_Sub1.anInt1922) {
			Class159_Sub1.anInt1952 = Class159_Sub1.anInt1922 * 1415476369;
			Class159_Sub1.anInt1956 = -130712985;
			Class159_Sub1.anInt1951 = -919990023;
		}
	}

	@OriginalMember(owner = "client!jd", name = "au", descriptor = "(Lclient!arm;I)Ljava/lang/String;", line = 1074)
	public static String method27777(@OriginalArg(0) Class93_Sub1_Sub7 arg0, @OriginalArg(1) int arg1) {
		return Class454.aBoolean773 || arg0 == null ? "" : arg0.aString99;
	}

	@OriginalMember(owner = "client!jd", name = "be", descriptor = "(ZLclient!yf;I)V", line = 5167)
	static final void method27778(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class681 arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class677 local8 = arg1.aBoolean875 ? arg1.aClass677_2 : arg1.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		if (arg0) {
			Class240.method25871(local14, local11, (short) -18502);
		} else {
			Class337.method27459(local14, local11, 2136484877);
		}
	}

	@OriginalMember(owner = "client!jd", name = "fr", descriptor = "(Lclient!yf;I)V", line = 6027)
	static final void method27779(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class627.method32247(local11, local14, arg0, -380010234);
	}

	@OriginalMember(owner = "client!jd", name = "il", descriptor = "(Lclient!yf;B)V", line = 6550)
	static final void method27780(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class281.method26463(local11, local14, arg0, 2046894463);
	}

	@OriginalMember(owner = "client!jd", name = "aun", descriptor = "(Lclient!yf;I)V", line = 13425)
	static final void method27781(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub26_1.method15913((byte) 39);
	}

	@OriginalMember(owner = "client!jd", name = "bau", descriptor = "(Lclient!yf;I)V", line = 14258)
	static final void method27782(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub21_1.method16546(local12, 767811690);
	}
}
