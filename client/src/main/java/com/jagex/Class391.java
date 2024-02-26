package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ky")
public final class Class391 {

	@OriginalMember(owner = "client!ky", name = "co", descriptor = "Lclient!aag;")
	static Class8 aClass8_53;

	@OriginalMember(owner = "client!ky", name = "q", descriptor = "Lclient!pf;")
	static Class480 aClass480_111;

	@OriginalMember(owner = "client!ky", name = "t", descriptor = "Lclient!ky;")
	static final Class391 aClass391_11 = new Class391();

	@OriginalMember(owner = "client!ky", name = "f", descriptor = "Lclient!ky;")
	static final Class391 aClass391_12 = new Class391();

	@OriginalMember(owner = "client!ky", name = "e", descriptor = "Lclient!ky;")
	static final Class391 aClass391_13 = new Class391();

	@OriginalMember(owner = "client!ky", name = "e", descriptor = "()[Lclient!ky;")
	public static Class391[] method28670() {
		return new Class391[] { aClass391_11, aClass391_12, aClass391_13 };
	}

	@OriginalMember(owner = "client!ky", name = "se", descriptor = "(Lclient!yp;I)V")
	static void method28672(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		if (local11.anInt4167 * 1052460537 == -1) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local11.anInt4141 * 857016887;
		}
	}

	@OriginalMember(owner = "client!ky", name = "ach", descriptor = "(Lclient!yp;I)V")
	static void method28673(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(28) boolean local28 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1] == 1;
		Class80.method24404(local13, local28, 975928476);
	}

	@OriginalMember(owner = "client!ky", name = "afb", descriptor = "(Lclient!yp;B)V")
	static void method28674(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		arg0.anInt5778 -= -221471862;
		@Pc(27) int local27 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(37) int local37 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local13.indexOf(local27, local37);
	}

	@OriginalMember(owner = "client!ky", name = "e", descriptor = "(I)V")
	static void method28675(@OriginalArg(0) int arg0) {
		Class101.aClass243_7.method26256(1693912082);
	}

	@OriginalMember(owner = "client!ky", name = "bao", descriptor = "(Lclient!yp;I)V")
	static void method28676(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (Class279.aClass102_9.method20791()) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub47_1.method16950(local12, (byte) -16);
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 3;
		}
	}

	@OriginalMember(owner = "client!ky", name = "j", descriptor = "(IIII)Z")
	static boolean method28677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class570 local3 = client.aClass539_1.method30932(-1638462787);
		@Pc(5) boolean local5 = true;
		@Pc(13) Interface60 local13 = (Interface60) local3.method31570(arg0, arg1, arg2, (byte) -13);
		if (local13 != null) {
			local5 &= Class200.method24929(local13, (byte) 89);
		}
		local13 = (Interface60) local3.method31574(arg0, arg1, arg2, client.anInterface62_1, (byte) -121);
		if (local13 != null) {
			local5 &= Class200.method24929(local13, (byte) 51);
		}
		local13 = (Interface60) local3.method31558(arg0, arg1, arg2, -697330391);
		if (local13 != null) {
			local5 &= Class200.method24929(local13, (byte) 99);
		}
		return local5;
	}

	@OriginalMember(owner = "client!ky", name = "<init>", descriptor = "()V")
	Class391() {
	}

	@OriginalMember(owner = "client!ky", name = "f", descriptor = "(IIB)I")
	public int method28669(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		@Pc(10) int local10 = Class80_Sub1_Sub1.anInt254 * -255202897 > arg1 ? Class80_Sub1_Sub1.anInt254 * -255202897 : arg1;
		if (aClass391_11 == this) {
			return 0;
		} else if (aClass391_13 == this) {
			return local10 - arg0;
		} else if (aClass391_12 == this) {
			return (local10 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ky", name = "u", descriptor = "(II)I")
	public int method28671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = Class80_Sub1_Sub1.anInt254 * -255202897 > arg1 ? Class80_Sub1_Sub1.anInt254 * -255202897 : arg1;
		if (aClass391_11 == this) {
			return 0;
		} else if (aClass391_13 == this) {
			return local10 - arg0;
		} else if (aClass391_12 == this) {
			return (local10 - arg0) / 2;
		} else {
			return 0;
		}
	}
}
