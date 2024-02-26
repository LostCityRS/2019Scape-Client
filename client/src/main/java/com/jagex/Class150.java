package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class150 {

	@OriginalMember(owner = "client!al", name = "t", descriptor = "Z")
	static boolean aBoolean386 = false;

	@OriginalMember(owner = "client!al", name = "e", descriptor = "([[[Lclient!tb;)V")
	static void method14518(@OriginalArg(0) Class568[][][] arg0) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class568[][] local9 = arg0[local1];
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				for (@Pc(17) int local17 = 0; local17 < local9[local11].length; local17++) {
					@Pc(29) Class568 local29 = local9[local11][local17];
					if (local29 != null) {
						if (local29.aClass120_Sub1_Sub4_1 instanceof Interface60) {
							((Interface60) local29.aClass120_Sub1_Sub4_1).method13821(102977551);
						}
						if (local29.aClass120_Sub1_Sub3_1 instanceof Interface60) {
							((Interface60) local29.aClass120_Sub1_Sub3_1).method13821(102977551);
						}
						if (local29.aClass120_Sub1_Sub3_2 instanceof Interface60) {
							((Interface60) local29.aClass120_Sub1_Sub3_2).method13821(102977551);
						}
						if (local29.aClass120_Sub1_Sub2_1 instanceof Interface60) {
							((Interface60) local29.aClass120_Sub1_Sub2_1).method13821(102977551);
						}
						if (local29.aClass120_Sub1_Sub2_2 instanceof Interface60) {
							((Interface60) local29.aClass120_Sub1_Sub2_2).method13821(102977551);
						}
						for (@Pc(80) Class594 local80 = local29.aClass594_2; local80 != null; local80 = local80.aClass594_3) {
							@Pc(85) Class120_Sub1_Sub1 local85 = local80.aClass120_Sub1_Sub1_1;
							if (local85 instanceof Interface60) {
								((Interface60) local85).method13821(102977551);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!al", name = "u", descriptor = "([[[Lclient!tb;)V")
	static void method14519(@OriginalArg(0) Class568[][][] arg0) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class568[][] local9 = arg0[local1];
			for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
				for (@Pc(17) int local17 = 0; local17 < local9[local11].length; local17++) {
					@Pc(29) Class568 local29 = local9[local11][local17];
					if (local29 != null) {
						if (local29.aClass120_Sub1_Sub4_1 instanceof Interface60) {
							((Interface60) local29.aClass120_Sub1_Sub4_1).method13821(102977551);
						}
						if (local29.aClass120_Sub1_Sub3_1 instanceof Interface60) {
							((Interface60) local29.aClass120_Sub1_Sub3_1).method13821(102977551);
						}
						if (local29.aClass120_Sub1_Sub3_2 instanceof Interface60) {
							((Interface60) local29.aClass120_Sub1_Sub3_2).method13821(102977551);
						}
						if (local29.aClass120_Sub1_Sub2_1 instanceof Interface60) {
							((Interface60) local29.aClass120_Sub1_Sub2_1).method13821(102977551);
						}
						if (local29.aClass120_Sub1_Sub2_2 instanceof Interface60) {
							((Interface60) local29.aClass120_Sub1_Sub2_2).method13821(102977551);
						}
						for (@Pc(80) Class594 local80 = local29.aClass594_2; local80 != null; local80 = local80.aClass594_3) {
							@Pc(85) Class120_Sub1_Sub1 local85 = local80.aClass120_Sub1_Sub1_1;
							if (local85 instanceof Interface60) {
								((Interface60) local85).method13821(102977551);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!al", name = "f", descriptor = "(IB)I")
	static int method14520(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		if (arg0 == 9 || arg0 == 10) {
			return 1;
		} else if (arg0 == 11) {
			return 8;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!al", name = "auh", descriptor = "(Lclient!yp;B)V")
	static void method14521(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub25_1.method16332(-441029515);
	}

	@OriginalMember(owner = "client!al", name = "m", descriptor = "([I[F[FIII)V")
	static void method14522(@OriginalArg(0) int[] arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 >= arg4) {
			return;
		}
		@Pc(8) int local8 = (arg4 + arg3) / 2;
		@Pc(10) int local10 = arg3;
		@Pc(14) int local14 = arg0[local8];
		arg0[local8] = arg0[arg4];
		arg0[arg4] = local14;
		@Pc(28) float local28 = arg1[local8];
		arg1[local8] = arg1[arg4];
		arg1[arg4] = local28;
		@Pc(42) float local42 = arg2[local8];
		arg2[local8] = arg2[arg4];
		arg2[arg4] = local42;
		@Pc(61) int local61 = Long.MAX_VALUE == (long) local14 ? 0 : 1;
		for (@Pc(63) int local63 = arg3; local63 < arg4; local63++) {
			if (arg0[local63] < local14 + (local63 & local61)) {
				@Pc(79) int local79 = arg0[local63];
				arg0[local63] = arg0[local10];
				arg0[local10] = local79;
				@Pc(93) float local93 = arg1[local63];
				arg1[local63] = arg1[local10];
				arg1[local10] = local93;
				@Pc(107) float local107 = arg2[local63];
				arg2[local63] = arg2[local10];
				arg2[local10] = local107;
				local10++;
			}
		}
		arg0[arg4] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg4] = arg1[local10];
		arg1[local10] = local28;
		arg2[arg4] = arg2[local10];
		arg2[local10] = local42;
		method14522(arg0, arg1, arg2, arg3, local10 - 1, -1729959424);
		method14522(arg0, arg1, arg2, local10 + 1, arg4, -1729959424);
	}

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V")
	Class150() throws Throwable {
		throw new Error();
	}
}
