package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class439 {

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
	static final int anInt4805 = 6;

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
	static final int anInt4806 = 7;

	@OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
	static final int anInt4807 = 10;

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
	static final int anInt4808 = 9;

	@OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
	static final int anInt4809 = 1;

	@OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
	static final int anInt4810 = 3;

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
	static final int anInt4811 = 5;

	@OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
	static final int anInt4812 = 2;

	@OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
	static final int anInt4813 = 4;

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
	static final int anInt4814 = 8;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
	static final int anInt4815 = 13;

	@OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
	static final int anInt4816 = 11;

	@OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
	static final int anInt4817 = 12;

	@OriginalMember(owner = "client!nj", name = "afn", descriptor = "(Lclient!yp;I)V")
	static void method29148(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class610.method32207((char) local12, 43225662) ? 1 : 0;
	}

	@OriginalMember(owner = "client!nj", name = "aqx", descriptor = "(Lclient!yp;B)V")
	static void method29149(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!nj", name = "jo", descriptor = "(IIII)I")
	public static int method29150(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (client.aClass539_1.method30932(-1638462787) == null) {
			return 0;
		}
		@Pc(9) int local9 = arg0 >> 9;
		@Pc(13) int local13 = arg1 >> 9;
		if (local9 < 0 || local13 < 0 || local9 > client.aClass539_1.method30921(1951909262) - 1 || local13 > client.aClass539_1.method31011(-1160821767) - 1) {
			return 0;
		}
		@Pc(35) int local35 = arg2;
		if (arg2 < 3 && (client.aClass539_1.method30903(-463929735).aByteArrayArrayArray12[1][local9][local13] & 0x2) != 0) {
			local35 = arg2 + 1;
		}
		return client.aClass539_1.method30932(-1638462787).aClass100Array1[local35].method2915(arg0, arg1, (byte) -91);
	}

	@OriginalMember(owner = "client!nj", name = "bz", descriptor = "(Lclient!yp;I)V")
	static void method29151(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(29) Class691 local29;
		if (arg0.aBoolean988) {
			local29 = arg0.aClass691_1;
		} else {
			local29 = arg0.aClass691_2;
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local23 != -1 && local29.method36967(local13, local23, 703519319) ? 1 : 0;
	}

	@OriginalMember(owner = "client!nj", name = "aup", descriptor = "(Lclient!yp;B)V")
	static void method29152(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub28_1.method16420(-1979751059);
	}

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
	Class439() throws Throwable {
		throw new Error();
	}
}
