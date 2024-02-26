package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class479 {

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
	public static final int anInt4968 = 1;

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
	public static final int anInt4969 = 11;

	@OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
	public static final int anInt4970 = 5;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
	public static final int anInt4971 = 12;

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
	public static final int anInt4972 = 10;

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
	public static final int anInt4973 = 17;

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
	public static final int anInt4974 = 7;

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
	public static final int anInt4975 = 13;

	@OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
	public static final int anInt4976 = 4;

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
	public static final int anInt4977 = 15;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
	public static final int anInt4978 = 16;

	@OriginalMember(owner = "client!pe", name = "o", descriptor = "I")
	public static final int anInt4979 = 6;

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
	public static final int anInt4980 = 3;

	@OriginalMember(owner = "client!pe", name = "x", descriptor = "I")
	public static final int anInt4981 = 9;

	@OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
	public static final int anInt4982 = 14;

	@OriginalMember(owner = "client!pe", name = "s", descriptor = "I")
	public static final int anInt4983 = 18;

	@OriginalMember(owner = "client!pe", name = "q", descriptor = "I")
	public static final int anInt4984 = 2;

	@OriginalMember(owner = "client!pe", name = "z", descriptor = "I")
	public static final int anInt4985 = 8;

	@OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
	public static final int anInt4986 = 19;

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
	public static final int anInt4987 = 0;

	@OriginalMember(owner = "client!pe", name = "cl", descriptor = "I")
	public static int anInt4988;

	@OriginalMember(owner = "client!pe", name = "tc", descriptor = "(Lclient!yp;I)V")
	static void method29909(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2047621631);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local16.anInt4104 * 1990157877;
	}

	@OriginalMember(owner = "client!pe", name = "aeg", descriptor = "(Lclient!yp;I)V")
	static void method29910(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		if (local13 == 0 || local23 == 0) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
			return;
		}
		switch(local23) {
			case 1:
				arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local13;
				return;
			case 2:
				arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (int) Math.sqrt((double) local13);
				return;
			case 3:
				arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (int) Math.cbrt((double) local13);
				return;
			case 4:
				arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (int) Math.sqrt(Math.sqrt((double) local13));
				return;
			default:
				arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (int) Math.pow((double) local13, 1.0D / (double) local23);
		}
	}

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "()V")
	Class479() throws Throwable {
		throw new Error();
	}
}
