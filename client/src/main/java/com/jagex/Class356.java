package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class356 {

	@OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
	static final int anInt4266 = 6;

	@OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
	static final int anInt4267 = 11;

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
	static final int anInt4268 = 2048;

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
	static final int anInt4269 = 2;

	@OriginalMember(owner = "client!ja", name = "l", descriptor = "[I")
	static int[] anIntArray432 = new int[512];

	static {
		@Pc(4) byte local4 = 9;
		for (@Pc(8) int local8 = local4 - 1; local8 >= 0; local8--) {
			@Pc(18) int local18 = 0x1 << local4 - local8 - 1;
			@Pc(24) int local24 = 0x1 << local4 - local8;
			for (@Pc(26) int local26 = local18; local26 < local24; local26++) {
				anIntArray432[local26] = (local8 << 6) + (local24 - local26 << 6 >>> local4 - local8 - 1);
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "(IIII)I")
	public static int method28099(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 4095 - arg0;
		} else {
			return 4095 - arg1;
		}
	}

	@OriginalMember(owner = "client!ja", name = "na", descriptor = "(Lclient!yp;I)V")
	static void method28100(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class491.method30257(local11, local14, arg0, 1480652930);
	}

	@OriginalMember(owner = "client!ja", name = "ber", descriptor = "(Lclient!yp;B)V")
	static void method28101(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= 1815275855;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		@Pc(43) Integer local43 = (Integer) client.aClass274_1.method26792(local13, 326461728).method26741(local23, local33, -1117696537);
		if (local43 == null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local43;
		}
	}

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "(B)I")
	public static int method28102(@OriginalArg(0) byte arg0) {
		return 10;
	}
}
