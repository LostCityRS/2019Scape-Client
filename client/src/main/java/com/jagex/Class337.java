package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;

@OriginalClass("client!ig")
public final class Class337 {

	@OriginalMember(owner = "client!ig", name = "m", descriptor = "Lclient!pf;")
	static Class480 aClass480_96;

	@OriginalMember(owner = "client!ig", name = "t", descriptor = "Lclient!ig;")
	static final Class337 aClass337_4 = new Class337(0);

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "Lclient!ig;")
	static final Class337 aClass337_2 = new Class337(1);

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "Lclient!ig;")
	static final Class337 aClass337_5 = new Class337(2);

	@OriginalMember(owner = "client!ig", name = "u", descriptor = "Lclient!ig;")
	public static final Class337 aClass337_7 = new Class337(3);

	@OriginalMember(owner = "client!ig", name = "l", descriptor = "Lclient!ig;")
	public static final Class337 aClass337_6 = new Class337(4);

	@OriginalMember(owner = "client!ig", name = "g", descriptor = "Lclient!ig;")
	public static final Class337 aClass337_3 = new Class337(5);

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
	int anInt4230;

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "(I)Lclient!ig;")
	public static Class337 method27871(@OriginalArg(0) int arg0) {
		if (arg0 == aClass337_4.anInt4230 * 1053518529) {
			return aClass337_4;
		} else if (aClass337_2.anInt4230 * 1053518529 == arg0) {
			return aClass337_2;
		} else if (aClass337_5.anInt4230 * 1053518529 == arg0) {
			return aClass337_5;
		} else if (arg0 == aClass337_7.anInt4230 * 1053518529) {
			return aClass337_7;
		} else if (arg0 == aClass337_6.anInt4230 * 1053518529) {
			return aClass337_6;
		} else if (arg0 == aClass337_3.anInt4230 * 1053518529) {
			return aClass337_3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "(I)Lclient!ig;")
	public static Class337 method27872(@OriginalArg(0) int arg0) {
		if (arg0 == aClass337_4.anInt4230 * 1053518529) {
			return aClass337_4;
		} else if (aClass337_2.anInt4230 * 1053518529 == arg0) {
			return aClass337_2;
		} else if (aClass337_5.anInt4230 * 1053518529 == arg0) {
			return aClass337_5;
		} else if (arg0 == aClass337_7.anInt4230 * 1053518529) {
			return aClass337_7;
		} else if (arg0 == aClass337_6.anInt4230 * 1053518529) {
			return aClass337_6;
		} else if (arg0 == aClass337_3.anInt4230 * 1053518529) {
			return aClass337_3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ig", name = "u", descriptor = "(I)Lclient!ig;")
	public static Class337 method27873(@OriginalArg(0) int arg0) {
		if (arg0 == aClass337_4.anInt4230 * 1053518529) {
			return aClass337_4;
		} else if (aClass337_2.anInt4230 * 1053518529 == arg0) {
			return aClass337_2;
		} else if (aClass337_5.anInt4230 * 1053518529 == arg0) {
			return aClass337_5;
		} else if (arg0 == aClass337_7.anInt4230 * 1053518529) {
			return aClass337_7;
		} else if (arg0 == aClass337_6.anInt4230 * 1053518529) {
			return aClass337_6;
		} else if (arg0 == aClass337_3.anInt4230 * 1053518529) {
			return aClass337_3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ig", name = "o", descriptor = "(Lclient!ald;I)V")
	public static void method27874(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(2) byte[] local2 = new byte[24];
		try {
			Class554.aClass36_4.method762(0L);
			Class554.aClass36_4.method764(local2, (byte) -81);
			@Pc(11) int local11;
			for (local11 = 0; local11 < 24 && local2[local11] == 0; local11++) {
			}
			if (local11 >= 24) {
				throw new IOException();
			}
		} catch (@Pc(31) Exception local31) {
			for (@Pc(33) int local33 = 0; local33 < 24; local33++) {
				local2[local33] = -1;
			}
		}
		arg0.pdata(local2, 0, 24);
	}

	@OriginalMember(owner = "client!ig", name = "arz", descriptor = "(Lclient!yp;B)V")
	static void method27875(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub34_1, arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581], (byte) 35);
		Class719.method37291(-808949469);
		client.aBoolean714 = false;
	}

	@OriginalMember(owner = "client!ig", name = "bcm", descriptor = "(Lclient!yp;I)V")
	static void method27876(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!ig", name = "fe", descriptor = "(II)Z")
	static boolean method27877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 13 || arg0 == 15 || arg0 == 18;
	}

	@OriginalMember(owner = "client!ig", name = "t", descriptor = "(I)[Lclient!abf;")
	public static Class32[] method27878(@OriginalArg(0) int arg0) {
		return new Class32[] { Class32.aClass32_15, Class32.aClass32_42, Class32.aClass32_24, Class32.aClass32_4, Class32.aClass32_5, Class32.aClass32_2, Class32.aClass32_7, Class32.aClass32_8, Class32.aClass32_9, Class32.aClass32_10, Class32.aClass32_14, Class32.aClass32_11, Class32.aClass32_12, Class32.aClass32_13, Class32.aClass32_25, Class32.aClass32_3, Class32.aClass32_16, Class32.aClass32_17, Class32.aClass32_18, Class32.aClass32_19, Class32.aClass32_20, Class32.aClass32_6, Class32.aClass32_22, Class32.aClass32_41, Class32.aClass32_38, Class32.aClass32_39, Class32.aClass32_26, Class32.aClass32_27, Class32.aClass32_28, Class32.aClass32_29, Class32.aClass32_30, Class32.aClass32_31, Class32.aClass32_40, Class32.aClass32_33, Class32.aClass32_23, Class32.aClass32_35, Class32.aClass32_36, Class32.aClass32_37, Class32.aClass32_1, Class32.aClass32_21, Class32.aClass32_34, Class32.aClass32_32 };
	}

	@OriginalMember(owner = "client!ig", name = "bs", descriptor = "(II)Z")
	static boolean method27879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
	}

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(I)V")
	Class337(@OriginalArg(0) int arg0) {
		this.anInt4230 = arg0 * -1091820223;
	}
}
