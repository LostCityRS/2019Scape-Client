package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class440 implements Interface71 {

	@OriginalMember(owner = "client!nk", name = "u", descriptor = "(Lclient!di;I)V")
	public static void method29165(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		Class108.aClass104_22 = (Class104) Class317.aClass464_1.method29602(client.anInterface49_1, Class495.anInt5032 * -1666529807, true, true, 83594081);
		Class619.aClass15_12 = Class317.aClass464_1.method29594(client.anInterface49_1, Class495.anInt5032 * -1666529807, (byte) 1);
		Class709.aClass104_26 = (Class104) Class317.aClass464_1.method29602(client.anInterface49_1, Class361.anInt4492 * 187098293, true, true, 1141449419);
		Class689.aClass15_13 = Class317.aClass464_1.method29594(client.anInterface49_1, Class361.anInt4492 * 187098293, (byte) 1);
		Class8.aClass104_1 = (Class104) Class317.aClass464_1.method29602(client.anInterface49_1, Class330.anInt4186 * -1554812657, true, true, 1375111152);
		Class375.aClass15_9 = Class317.aClass464_1.method29594(client.anInterface49_1, Class330.anInt4186 * -1554812657, (byte) 1);
	}

	@OriginalMember(owner = "client!nk", name = "db", descriptor = "(Lclient!yp;I)V")
	static void method29166(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2004876399);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class564.method31472(local16, local22, arg0, (byte) 116);
	}

	@OriginalMember(owner = "client!nk", name = "iu", descriptor = "(Lclient!yp;B)V")
	static void method29167(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2010677140);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class249.method26352(local16, local22, arg0, -1600964813);
	}

	@OriginalMember(owner = "client!nk", name = "ain", descriptor = "(Lclient!yp;I)V")
	static void method29168(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.aClass453_1.anIntArray451[local13] = local23;
	}

	@OriginalMember(owner = "client!nk", name = "ald", descriptor = "(Lclient!yp;I)V")
	static void method29169(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class10.method327(1937954379);
	}

	@OriginalMember(owner = "client!nk", name = "anw", descriptor = "(Lclient!yp;I)V")
	static void method29170(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (local12 < 0) {
			local12 = 0;
		}
		client.anInt3486 = (local12 + client.anInt3499 * 1390966129) * -1595748229;
	}

	@OriginalMember(owner = "client!nk", name = "xa", descriptor = "(Lclient!yp;B)V")
	static void method29171(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass372_8.method28394((byte) 3);
	}

	@OriginalMember(owner = "client!nk", name = "t", descriptor = "(Lclient!xn;[IJ)Ljava/lang/String;")
	@Override
	public String method29162(@OriginalArg(0) Class666 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (Class666.aClass666_7 == arg0) {
			@Pc(10) Class50 local10 = (Class50) Class111_Sub1.aClass41_Sub20_1.method18054(arg1[0], 1080444601);
			return local10.method1016((int) arg2, -229321640);
		} else if (arg0 == Class666.aClass666_4 || arg0 == Class666.aClass666_8) {
			@Pc(29) Class43 local29 = (Class43) Class25.aClass41_Sub9_1.method18054((int) arg2, -322657477);
			return local29.aString5;
		} else if (Class666.aClass666_14 == arg0 || Class666.aClass666_13 == arg0 || Class666.aClass666_5 == arg0 || Class666.aClass666_9 == arg0) {
			return ((Class50) Class111_Sub1.aClass41_Sub20_1.method18054(arg1[0], 677202369)).method1016((int) arg2, -730896851);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nk", name = "g", descriptor = "(Lclient!xn;[IJ)Ljava/lang/String;")
	@Override
	public String method29159(@OriginalArg(0) Class666 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (Class666.aClass666_7 == arg0) {
			@Pc(10) Class50 local10 = (Class50) Class111_Sub1.aClass41_Sub20_1.method18054(arg1[0], 1103249445);
			return local10.method1016((int) arg2, 483401599);
		} else if (arg0 == Class666.aClass666_4 || arg0 == Class666.aClass666_8) {
			@Pc(29) Class43 local29 = (Class43) Class25.aClass41_Sub9_1.method18054((int) arg2, -1386428282);
			return local29.aString5;
		} else if (Class666.aClass666_14 == arg0 || Class666.aClass666_13 == arg0 || Class666.aClass666_5 == arg0 || Class666.aClass666_9 == arg0) {
			return ((Class50) Class111_Sub1.aClass41_Sub20_1.method18054(arg1[0], -169504796)).method1016((int) arg2, 1778327871);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "(Lclient!xn;[IJ)Ljava/lang/String;")
	@Override
	public String method29160(@OriginalArg(0) Class666 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (Class666.aClass666_7 == arg0) {
			@Pc(10) Class50 local10 = (Class50) Class111_Sub1.aClass41_Sub20_1.method18054(arg1[0], 459558223);
			return local10.method1016((int) arg2, -7308232);
		} else if (arg0 == Class666.aClass666_4 || arg0 == Class666.aClass666_8) {
			@Pc(29) Class43 local29 = (Class43) Class25.aClass41_Sub9_1.method18054((int) arg2, -937204007);
			return local29.aString5;
		} else if (Class666.aClass666_14 == arg0 || Class666.aClass666_13 == arg0 || Class666.aClass666_5 == arg0 || Class666.aClass666_9 == arg0) {
			return ((Class50) Class111_Sub1.aClass41_Sub20_1.method18054(arg1[0], -853101312)).method1016((int) arg2, -147851642);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "(Lclient!xn;[IJ)Ljava/lang/String;")
	@Override
	public String method29161(@OriginalArg(0) Class666 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (Class666.aClass666_7 == arg0) {
			@Pc(10) Class50 local10 = (Class50) Class111_Sub1.aClass41_Sub20_1.method18054(arg1[0], -1568353739);
			return local10.method1016((int) arg2, 1298311915);
		} else if (arg0 == Class666.aClass666_4 || arg0 == Class666.aClass666_8) {
			@Pc(29) Class43 local29 = (Class43) Class25.aClass41_Sub9_1.method18054((int) arg2, 473776608);
			return local29.aString5;
		} else if (Class666.aClass666_14 == arg0 || Class666.aClass666_13 == arg0 || Class666.aClass666_5 == arg0 || Class666.aClass666_9 == arg0) {
			return ((Class50) Class111_Sub1.aClass41_Sub20_1.method18054(arg1[0], -1817790934)).method1016((int) arg2, -91017168);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nk", name = "u", descriptor = "(Lclient!xn;[IJ)Ljava/lang/String;")
	@Override
	public String method29164(@OriginalArg(0) Class666 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (Class666.aClass666_7 == arg0) {
			@Pc(10) Class50 local10 = (Class50) Class111_Sub1.aClass41_Sub20_1.method18054(arg1[0], -1034708725);
			return local10.method1016((int) arg2, 144390415);
		} else if (arg0 == Class666.aClass666_4 || arg0 == Class666.aClass666_8) {
			@Pc(29) Class43 local29 = (Class43) Class25.aClass41_Sub9_1.method18054((int) arg2, 244896829);
			return local29.aString5;
		} else if (Class666.aClass666_14 == arg0 || Class666.aClass666_13 == arg0 || Class666.aClass666_5 == arg0 || Class666.aClass666_9 == arg0) {
			return ((Class50) Class111_Sub1.aClass41_Sub20_1.method18054(arg1[0], -1349169998)).method1016((int) arg2, 53303613);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "(Lclient!xn;[IJ)Ljava/lang/String;")
	@Override
	public String method29163(@OriginalArg(0) Class666 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) long arg2) {
		if (Class666.aClass666_7 == arg0) {
			@Pc(10) Class50 local10 = (Class50) Class111_Sub1.aClass41_Sub20_1.method18054(arg1[0], 1569072946);
			return local10.method1016((int) arg2, 138185805);
		} else if (arg0 == Class666.aClass666_4 || arg0 == Class666.aClass666_8) {
			@Pc(29) Class43 local29 = (Class43) Class25.aClass41_Sub9_1.method18054((int) arg2, 1257567412);
			return local29.aString5;
		} else if (Class666.aClass666_14 == arg0 || Class666.aClass666_13 == arg0 || Class666.aClass666_5 == arg0 || Class666.aClass666_9 == arg0) {
			return ((Class50) Class111_Sub1.aClass41_Sub20_1.method18054(arg1[0], 1003722276)).method1016((int) arg2, -107791309);
		} else {
			return null;
		}
	}
}
