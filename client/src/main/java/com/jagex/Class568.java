package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class568 {

	@OriginalMember(owner = "client!tb", name = "tz", descriptor = "B")
	public static byte aByte151;

	@OriginalMember(owner = "client!tb", name = "o", descriptor = "Lclient!uj;")
	public Class594 aClass594_2;

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "Lclient!asi;")
	public Class120_Sub1_Sub2 aClass120_Sub1_Sub2_1;

	@OriginalMember(owner = "client!tb", name = "u", descriptor = "Lclient!asi;")
	public Class120_Sub1_Sub2 aClass120_Sub1_Sub2_2;

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "Lclient!asq;")
	public Class120_Sub1_Sub3 aClass120_Sub1_Sub3_1;

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "Lclient!asq;")
	public Class120_Sub1_Sub3 aClass120_Sub1_Sub3_2;

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "Lclient!ash;")
	public Class120_Sub1_Sub4 aClass120_Sub1_Sub4_1;

	@OriginalMember(owner = "client!tb", name = "m", descriptor = "Lclient!asc;")
	Class120_Sub1_Sub5 aClass120_Sub1_Sub5_1;

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "Lclient!tb;")
	public Class568 aClass568_1;

	@OriginalMember(owner = "client!tb", name = "s", descriptor = "S")
	short aShort177;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "S")
	short aShort178;

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "S")
	short aShort179;

	@OriginalMember(owner = "client!tb", name = "k", descriptor = "S")
	short aShort180;

	@OriginalMember(owner = "client!tb", name = "t", descriptor = "B")
	public byte aByte150;

	@OriginalMember(owner = "client!tb", name = "aeb", descriptor = "(Lclient!yp;I)V")
	static void method31526(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local13 > local23 ? local13 : local23;
	}

	@OriginalMember(owner = "client!tb", name = "aih", descriptor = "(Lclient!yp;B)V")
	static void method31527(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		if (local23 == -1) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class71.aClass510_2.method30536(local13, -1847649923).method22906((char) local23, -44087155);
		}
	}

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "(I)Z")
	public static boolean method31528(@OriginalArg(0) int arg0) {
		return Class526.anInterface58_1 != null;
	}

	@OriginalMember(owner = "client!tb", name = "aqc", descriptor = "(Lclient!yp;I)V")
	static void method31529(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class238.anInt3846 * -378193585;
	}

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "(Lclient!pf;II)Lclient!cm;")
	public static Class99 method31530(@OriginalArg(0) Class480 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class99 local5 = (Class99) Class364.aClass243_79.method26282((long) arg1);
		if (local5 == null) {
			if (Class365.aBoolean840) {
				local5 = Class279.aClass102_9.method20906(Class212.method25823(arg0, arg1), true);
			} else {
				local5 = Class680.method33639(arg0.method29926(arg1, 1472047355), -711106775);
			}
			Class364.aClass243_79.method26253(local5, (long) arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "client!tb", name = "wo", descriptor = "(Lclient!yp;I)V")
	static void method31531(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 2036747717;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		Class490.aClass263_13.method26523(local13, (short) 27847);
	}

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(I)V")
	public Class568(@OriginalArg(0) int arg0) {
		this.aByte150 = (byte) arg0;
	}
}
