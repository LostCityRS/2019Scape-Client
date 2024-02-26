package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class345 {

	@OriginalMember(owner = "client!iq", name = "vg", descriptor = "I")
	public static int anInt4249;

	@OriginalMember(owner = "client!iq", name = "t", descriptor = "Lclient!iq;")
	public static final Class345 aClass345_2 = new Class345(0, 104);

	@OriginalMember(owner = "client!iq", name = "f", descriptor = "Lclient!iq;")
	static final Class345 aClass345_1 = new Class345(1, 120);

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "Lclient!iq;")
	static final Class345 aClass345_3 = new Class345(2, 136);

	@OriginalMember(owner = "client!iq", name = "u", descriptor = "Lclient!iq;")
	static final Class345 aClass345_4 = new Class345(3, 168);

	@OriginalMember(owner = "client!iq", name = "l", descriptor = "Lclient!iq;")
	static final Class345 aClass345_5 = new Class345(4, 72);

	@OriginalMember(owner = "client!iq", name = "g", descriptor = "Lclient!iq;")
	static final Class345 aClass345_6 = new Class345(5, 256);

	@OriginalMember(owner = "client!iq", name = "i", descriptor = "I")
	public final int anInt4247;

	@OriginalMember(owner = "client!iq", name = "m", descriptor = "I")
	public final int anInt4248;

	@OriginalMember(owner = "client!iq", name = "u", descriptor = "(I)Lclient!iq;")
	public static Class345 method27953(@OriginalArg(0) int arg0) {
		@Pc(2) Class345[] local2 = Class595.method31974(-1152427209);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class345 local12 = local2[local4];
			if (local12.anInt4247 * 659011863 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "()[Lclient!iq;")
	static Class345[] method27954() {
		return new Class345[] { aClass345_2, aClass345_3, aClass345_6, aClass345_4, aClass345_5, aClass345_1 };
	}

	@OriginalMember(owner = "client!iq", name = "azh", descriptor = "(Lclient!yp;I)V")
	static void method27955(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub22_1.method16265((byte) -125) ? 1 : 0;
	}

	@OriginalMember(owner = "client!iq", name = "dm", descriptor = "(Lclient!yp;I)V")
	static void method27956(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2035457375);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class588.method31901(local16, local22, arg0, 1271038661);
	}

	@OriginalMember(owner = "client!iq", name = "ia", descriptor = "(Lclient!yp;I)V")
	static void method27957(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(18) boolean local18 = arg0.anIntArray525[arg0.anInt5778 * 1896589581] == 1;
		@Pc(28) int local28 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(32) Class327 local32 = Class301.method27041(local28, 2075939778);
		@Pc(38) Class310 local38 = Class709.aClass310Array1[local28 >> 16];
		Class519.method30606(local32, local38, arg0, local18 ? Class322.aClass322_2 : Class322.aClass322_3, 1901762677);
	}

	@OriginalMember(owner = "client!iq", name = "fi", descriptor = "(Lclient!yp;B)V")
	static void method27958(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class245.method26314(local11, local14, arg0, 73581900);
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(Lclient!yp;I)V")
	static void method27959(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(29) Class79 local29 = (Class79) Class370.aClass41_Sub10_1.method18054(local23, -349012933);
		if (!local29.method1428(-1790923995)) {
			@Pc(84) int local84 = local29.anInt253 * 680817871;
			if (local13 == -1) {
				arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local84;
			} else {
				arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = ((Class352) Class106.aClass73_Sub1_6.method18054(local13, -572009868)).method28029(local23, local84, 257111456);
			}
			return;
		}
		@Pc(36) String local36 = local29.aString11;
		if (local13 == -1) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local36;
		} else {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = ((Class352) Class106.aClass73_Sub1_6.method18054(local13, 1995077387)).method28033(local23, local36, -57195145);
		}
	}

	@OriginalMember(owner = "client!iq", name = "ad", descriptor = "(IIIS)V")
	static void method27960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) short arg3) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(9, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = arg1 * -1221031713;
		local4.anInt3047 = arg2 * 673180539;
	}

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(II)V")
	Class345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4247 = arg0 * -50262361;
		this.anInt4248 = arg1 * -2098204759;
	}
}
