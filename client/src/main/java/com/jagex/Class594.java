package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uj")
public final class Class594 {

	@OriginalMember(owner = "client!uj", name = "q", descriptor = "[[S")
	public static short[][] aShortArrayArray5;

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
	static int anInt5325;

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
	static int anInt5324 = 0;

	@OriginalMember(owner = "client!uj", name = "t", descriptor = "Lclient!ase;")
	public Class120_Sub1_Sub1 aClass120_Sub1_Sub1_1;

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "Lclient!uj;")
	public Class594 aClass594_3;

	@OriginalMember(owner = "client!uj", name = "i", descriptor = "(Lclient!ase;)Lclient!uj;")
	static Class594 method31948(@OriginalArg(0) Class120_Sub1_Sub1 arg0) {
		@Pc(5) Class594 local5;
		if (Class362.aClass594_1 == null) {
			local5 = new Class594();
		} else {
			local5 = Class362.aClass594_1;
			Class362.aClass594_1 = Class362.aClass594_1.aClass594_3;
			local5.aClass594_3 = null;
			anInt5324 -= 1120381915;
		}
		local5.aClass120_Sub1_Sub1_1 = arg0;
		return local5;
	}

	@OriginalMember(owner = "client!uj", name = "u", descriptor = "(Lclient!ase;)Lclient!uj;")
	static Class594 method31950(@OriginalArg(0) Class120_Sub1_Sub1 arg0) {
		@Pc(5) Class594 local5;
		if (Class362.aClass594_1 == null) {
			local5 = new Class594();
		} else {
			local5 = Class362.aClass594_1;
			Class362.aClass594_1 = Class362.aClass594_1.aClass594_3;
			local5.aClass594_3 = null;
			anInt5324 -= 1120381915;
		}
		local5.aClass120_Sub1_Sub1_1 = arg0;
		return local5;
	}

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "(Lclient!ase;)Lclient!uj;")
	static Class594 method31951(@OriginalArg(0) Class120_Sub1_Sub1 arg0) {
		@Pc(5) Class594 local5;
		if (Class362.aClass594_1 == null) {
			local5 = new Class594();
		} else {
			local5 = Class362.aClass594_1;
			Class362.aClass594_1 = Class362.aClass594_1.aClass594_3;
			local5.aClass594_3 = null;
			anInt5324 -= 1120381915;
		}
		local5.aClass120_Sub1_Sub1_1 = arg0;
		return local5;
	}

	@OriginalMember(owner = "client!uj", name = "l", descriptor = "(Lclient!ase;)Lclient!uj;")
	static Class594 method31952(@OriginalArg(0) Class120_Sub1_Sub1 arg0) {
		@Pc(5) Class594 local5;
		if (Class362.aClass594_1 == null) {
			local5 = new Class594();
		} else {
			local5 = Class362.aClass594_1;
			Class362.aClass594_1 = Class362.aClass594_1.aClass594_3;
			local5.aClass594_3 = null;
			anInt5324 -= 1120381915;
		}
		local5.aClass120_Sub1_Sub1_1 = arg0;
		return local5;
	}

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "(Lclient!ase;)Lclient!uj;")
	static Class594 method31953(@OriginalArg(0) Class120_Sub1_Sub1 arg0) {
		@Pc(5) Class594 local5;
		if (Class362.aClass594_1 == null) {
			local5 = new Class594();
		} else {
			local5 = Class362.aClass594_1;
			Class362.aClass594_1 = Class362.aClass594_1.aClass594_3;
			local5.aClass594_3 = null;
			anInt5324 -= 1120381915;
		}
		local5.aClass120_Sub1_Sub1_1 = arg0;
		return local5;
	}

	@OriginalMember(owner = "client!uj", name = "zt", descriptor = "(Lclient!yp;B)V")
	static void method31954(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(26) String local26 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		if (local12 == -1) {
			throw new RuntimeException();
		}
		@Pc(39) Class50 local39 = (Class50) Class111_Sub1.aClass41_Sub20_1.method18054(local12, -36623826);
		if (local39.aClass521_1 != Class521.aClass521_42) {
			throw new RuntimeException();
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local39.method1018(local26, (short) -11102) ? 1 : 0;
	}

	@OriginalMember(owner = "client!uj", name = "aug", descriptor = "(Lclient!yp;B)V")
	static void method31955(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class257.method26428(Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(-343091012), 200, -1043754383);
	}

	@OriginalMember(owner = "client!uj", name = "g", descriptor = "([F[IIII)V")
	public static void method31956(@OriginalArg(0) float[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) float local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		for (@Pc(40) int local40 = arg2; local40 < arg3; local40++) {
			if (arg0[local40] > local14) {
				@Pc(53) float local53 = arg0[local40];
				arg0[local40] = arg0[local10];
				arg0[local10] = local53;
				@Pc(67) int local67 = arg1[local40];
				arg1[local40] = arg1[local10];
				arg1[local10++] = local67;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		method31956(arg0, arg1, arg2, local10 - 1, -45594667);
		method31956(arg0, arg1, local10 + 1, arg3, -1706477591);
	}

	@OriginalMember(owner = "client!uj", name = "pg", descriptor = "(Lclient!yp;I)V")
	static void method31957(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class114.method8626(local11, local14, arg0, -450665121);
	}

	@OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
	Class594() {
	}

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "(I)V")
	void method31949(@OriginalArg(0) int arg0) {
		if (anInt5324 * -1852811181 < 500) {
			this.aClass120_Sub1_Sub1_1 = null;
			this.aClass594_3 = Class362.aClass594_1;
			Class362.aClass594_1 = this;
			anInt5324 += 1120381915;
		}
	}
}
