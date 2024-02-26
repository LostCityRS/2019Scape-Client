package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zl")
public final class Class710 implements Interface75 {

	@OriginalMember(owner = "client!zl", name = "t", descriptor = "Lclient!zl;")
	public static final Class710 aClass710_6 = new Class710(-2);

	@OriginalMember(owner = "client!zl", name = "f", descriptor = "Lclient!zl;")
	public static final Class710 aClass710_4 = new Class710(-3);

	@OriginalMember(owner = "client!zl", name = "e", descriptor = "Lclient!zl;")
	public static final Class710 aClass710_8 = new Class710(2);

	@OriginalMember(owner = "client!zl", name = "u", descriptor = "Lclient!zl;")
	public static final Class710 aClass710_7 = new Class710(3);

	@OriginalMember(owner = "client!zl", name = "l", descriptor = "Lclient!zl;")
	static final Class710 aClass710_5 = new Class710(4);

	@OriginalMember(owner = "client!zl", name = "g", descriptor = "I")
	final int anInt5820;

	@OriginalMember(owner = "client!zl", name = "e", descriptor = "()[Lclient!zl;")
	public static Class710[] method37157() {
		return new Class710[] { aClass710_5, aClass710_7, aClass710_8, aClass710_6, aClass710_4 };
	}

	@OriginalMember(owner = "client!zl", name = "f", descriptor = "(Lclient!abs;Lclient!ald;II)Lclient!aby;")
	static Class49 method37158(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Class80_Sub36 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class49 local4 = new Class49(arg0);
		@Pc(8) int local8 = arg1.method23362(743998575);
		@Pc(16) boolean local16 = (local8 & 0x1) != 0;
		@Pc(25) boolean local25 = (local8 & 0x2) != 0;
		@Pc(33) boolean local33 = (local8 & 0x4) != 0;
		@Pc(41) boolean local41 = (local8 & 0x8) != 0;
		if (local16) {
			if (arg2 <= 1) {
				local4.anIntArray16[0] = arg1.method23178((byte) -46);
				local4.anIntArray17[0] = arg1.method23178((byte) -85);
			} else {
				local4.anIntArray16[0] = arg1.method23210((byte) 122);
				local4.anIntArray17[0] = arg1.method23210((byte) 85);
			}
			if (arg0.anInt139 * 1203565433 != -1 || -226067627 * arg0.anInt141 != -1) {
				if (arg2 <= 1) {
					local4.anIntArray16[1] = arg1.method23178((byte) -42);
					local4.anIntArray17[1] = arg1.method23178((byte) -14);
				} else {
					local4.anIntArray16[1] = arg1.method23210((byte) 90);
					local4.anIntArray17[1] = arg1.method23210((byte) 114);
				}
			}
			if (arg0.anInt142 * 1206901479 != -1 || arg0.anInt143 * -1136335691 != -1) {
				if (arg2 <= 1) {
					local4.anIntArray16[2] = arg1.method23178((byte) -100);
					local4.anIntArray17[2] = arg1.method23178((byte) -107);
				} else {
					local4.anIntArray16[2] = arg1.method23210((byte) 57);
					local4.anIntArray17[2] = arg1.method23210((byte) 28);
				}
			}
		}
		if (local25) {
			if (arg2 <= 1) {
				local4.anIntArray18[0] = arg1.method23178((byte) -2);
				local4.anIntArray19[0] = arg1.method23178((byte) -65);
			} else {
				local4.anIntArray18[0] = arg1.method23210((byte) 99);
				local4.anIntArray19[0] = arg1.method23210((byte) 119);
			}
			if (arg0.anInt129 * 1334171149 != -1 || arg0.anInt133 * -290918155 != -1) {
				if (arg2 <= 1) {
					local4.anIntArray18[1] = arg1.method23178((byte) -5);
					local4.anIntArray19[1] = arg1.method23178((byte) -39);
				} else {
					local4.anIntArray18[1] = arg1.method23210((byte) 34);
					local4.anIntArray19[1] = arg1.method23210((byte) 96);
				}
			}
		}
		@Pc(247) int local247;
		@Pc(250) int[] local250;
		@Pc(282) int local282;
		if (local33) {
			local247 = arg1.method23178((byte) -32);
			local250 = new int[] { local247 & 0xF, local247 >> 4 & 0xF, local247 >> 8 & 0xF, local247 >> 12 & 0xF };
			for (local282 = 0; local282 < 4; local282++) {
				if (local250[local282] != 15) {
					local4.aShortArray7[local250[local282]] = (short) arg1.method23178((byte) -18);
				}
			}
		}
		if (local41) {
			local247 = arg1.method23362(317902154);
			local250 = new int[] { local247 & 0xF, local247 >> 4 & 0xF };
			for (local282 = 0; local282 < 2; local282++) {
				if (local250[local282] != 15) {
					local4.aShortArray6[local250[local282]] = (short) arg1.method23178((byte) -2);
				}
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!zl", name = "hd", descriptor = "(B)V")
	static void method37159(@OriginalArg(0) byte arg0) {
		@Pc(3) int local3 = Class51.anInt191 * 44967471;
		@Pc(5) int[] local5 = Class51.anIntArray20;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(16) Class120_Sub1_Sub1_Sub1_Sub2 local16 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local5[local7]];
			if (local16 != null) {
				Class539.method31037(local16, false, (byte) -69);
			}
		}
	}

	@OriginalMember(owner = "client!zl", name = "abm", descriptor = "(Lclient!yp;I)V")
	static void method37160(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class134.aClass305_1 == null ? 0 : 1;
	}

	@OriginalMember(owner = "client!zl", name = "o", descriptor = "(I)V")
	static void method37161(@OriginalArg(0) int arg0) {
		Class51.anInt191 = 0;
		for (@Pc(3) int local3 = 0; local3 < 2048; local3++) {
			Class51.aClass80_Sub36Array1[local3] = null;
			Class51.aClass80_Sub36Array2[local3] = null;
			Class51.aByteArray17[local3] = Class712.aClass712_2.aByte165;
			Class51.aClass543Array1[local3] = null;
		}
	}

	@OriginalMember(owner = "client!zl", name = "<init>", descriptor = "(I)V")
	Class710(@OriginalArg(0) int arg0) {
		this.anInt5820 = arg0 * -180215541;
	}

	@OriginalMember(owner = "client!zl", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt5820 * 796172963;
	}

	@OriginalMember(owner = "client!zl", name = "f", descriptor = "()I")
	@Override
	public int method37268() {
		return this.anInt5820 * 796172963;
	}

	@OriginalMember(owner = "client!zl", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt5820 * 796172963;
	}
}
