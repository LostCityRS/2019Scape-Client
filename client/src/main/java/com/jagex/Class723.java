package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zz")
public class Class723 {

	@OriginalMember(owner = "client!zz", name = "u", descriptor = "[I")
	static int[] anIntArray528;

	@OriginalMember(owner = "client!zz", name = "z", descriptor = "[[[B")
	static byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!zz", name = "e", descriptor = "I")
	static int anInt5968 = 0;

	@OriginalMember(owner = "client!zz", name = "n", descriptor = "I")
	static int anInt5966 = 0;

	@OriginalMember(owner = "client!zz", name = "m", descriptor = "I")
	static int anInt5967 = 0;

	@OriginalMember(owner = "client!zz", name = "k", descriptor = "[[B")
	static byte[][] aByteArrayArray26 = new byte[1000][];

	@OriginalMember(owner = "client!zz", name = "f", descriptor = "[[B")
	static byte[][] aByteArrayArray27 = new byte[250][];

	@OriginalMember(owner = "client!zz", name = "w", descriptor = "[[B")
	static byte[][] aByteArrayArray28 = new byte[50][];

	@OriginalMember(owner = "client!zz", name = "<init>", descriptor = "()V", line = 14)
	Class723() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!zz", name = "f", descriptor = "([I[I)V", line = 19)
	public static void method36934(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			Class588.anIntArray475 = null;
			anIntArray528 = null;
			aByteArrayArrayArray14 = null;
			return;
		}
		Class588.anIntArray475 = arg0;
		anIntArray528 = new int[arg0.length];
		aByteArrayArrayArray14 = new byte[arg0.length][][];
		for (@Pc(25) int local25 = 0; local25 < Class588.anIntArray475.length; local25++) {
			aByteArrayArrayArray14[local25] = new byte[arg1[local25]][];
		}
	}

	@OriginalMember(owner = "client!zz", name = "w", descriptor = "([I[I)V", line = 19)
	public static void method36935(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			Class588.anIntArray475 = null;
			anIntArray528 = null;
			aByteArrayArrayArray14 = null;
			return;
		}
		Class588.anIntArray475 = arg0;
		anIntArray528 = new int[arg0.length];
		aByteArrayArrayArray14 = new byte[arg0.length][][];
		for (@Pc(25) int local25 = 0; local25 < Class588.anIntArray475.length; local25++) {
			aByteArrayArrayArray14[local25] = new byte[arg1[local25]][];
		}
	}

	@OriginalMember(owner = "client!zz", name = "n", descriptor = "(IZI)[B", line = 35)
	public static synchronized byte[] method36936(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(21) byte[] local21;
		if ((arg0 == 100 || arg0 < 100 && arg1) && anInt5968 * 990331919 > 0) {
			local21 = aByteArrayArray26[(anInt5968 -= 1260595951) * 990331919];
			aByteArrayArray26[anInt5968 * 990331919] = null;
			return local21;
		} else if ((arg0 == 5000 || arg0 < 5000 && arg1) && anInt5966 * 211106159 > 0) {
			local21 = aByteArrayArray27[(anInt5966 -= -1451866737) * 211106159];
			aByteArrayArray27[anInt5966 * 211106159] = null;
			return local21;
		} else if ((arg0 == 30000 || arg0 < 30000 && arg1) && anInt5967 * -1547868365 > 0) {
			local21 = aByteArrayArray28[(anInt5967 -= -902763525) * -1547868365];
			aByteArrayArray28[anInt5967 * -1547868365] = null;
			return local21;
		} else {
			@Pc(94) int local94;
			if (aByteArrayArrayArray14 != null) {
				for (local94 = 0; local94 < Class588.anIntArray475.length; local94++) {
					if ((arg0 == Class588.anIntArray475[local94] || arg0 < Class588.anIntArray475[local94] && arg1) && anIntArray528[local94] > 0) {
						@Pc(127) byte[] local127 = aByteArrayArrayArray14[local94][--anIntArray528[local94]];
						aByteArrayArrayArray14[local94][anIntArray528[local94]] = null;
						return local127;
					}
				}
			}
			if (arg1 && Class588.anIntArray475 != null) {
				for (local94 = 0; local94 < Class588.anIntArray475.length; local94++) {
					if (arg0 <= Class588.anIntArray475[local94] && anIntArray528[local94] < aByteArrayArrayArray14[local94].length) {
						return new byte[Class588.anIntArray475[local94]];
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!zz", name = "m", descriptor = "(II)[B", line = 72)
	public static synchronized byte[] method36937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method36936(arg0, false, 592143678);
	}

	@OriginalMember(owner = "client!zz", name = "l", descriptor = "(I)[B", line = 72)
	public static synchronized byte[] method36938(@OriginalArg(0) int arg0) {
		return method36936(arg0, false, -1995390377);
	}

	@OriginalMember(owner = "client!zz", name = "u", descriptor = "(I)[B", line = 72)
	public static synchronized byte[] method36939(@OriginalArg(0) int arg0) {
		return method36936(arg0, false, -774839264);
	}

	@OriginalMember(owner = "client!zz", name = "k", descriptor = "([BB)V", line = 76)
	public static synchronized void method36940(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) {
		if (arg0.length == 100 && anInt5968 * 990331919 < 1000) {
			aByteArrayArray26[(anInt5968 += 1260595951) * 990331919 - 1] = arg0;
		} else if (arg0.length == 5000 && anInt5966 * 211106159 < 250) {
			aByteArrayArray27[(anInt5966 += -1451866737) * 211106159 - 1] = arg0;
		} else if (arg0.length == 30000 && anInt5967 * -1547868365 < 50) {
			aByteArrayArray28[(anInt5967 += -902763525) * -1547868365 - 1] = arg0;
		} else if (aByteArrayArrayArray14 != null) {
			for (@Pc(69) int local69 = 0; local69 < Class588.anIntArray475.length; local69++) {
				if (arg0.length == Class588.anIntArray475[local69] && anIntArray528[local69] < aByteArrayArrayArray14[local69].length) {
					aByteArrayArrayArray14[local69][anIntArray528[local69]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!zz", name = "z", descriptor = "([B)V", line = 76)
	public static synchronized void method36941(@OriginalArg(0) byte[] arg0) {
		if (arg0.length == 100 && anInt5968 * 990331919 < 1000) {
			aByteArrayArray26[(anInt5968 += 1260595951) * 990331919 - 1] = arg0;
		} else if (arg0.length == 5000 && anInt5966 * 211106159 < 250) {
			aByteArrayArray27[(anInt5966 += -1451866737) * 211106159 - 1] = arg0;
		} else if (arg0.length == 30000 && anInt5967 * -1547868365 < 50) {
			aByteArrayArray28[(anInt5967 += -902763525) * -1547868365 - 1] = arg0;
		} else if (aByteArrayArrayArray14 != null) {
			for (@Pc(69) int local69 = 0; local69 < Class588.anIntArray475.length; local69++) {
				if (arg0.length == Class588.anIntArray475[local69] && anIntArray528[local69] < aByteArrayArrayArray14[local69].length) {
					aByteArrayArrayArray14[local69][anIntArray528[local69]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!zz", name = "j", descriptor = "(I)V", line = 167)
	static void method36942(@OriginalArg(0) int arg0) {
		@Pc(3) Class93_Sub1_Sub11 local3 = Class371.method28000(14, 0L);
		local3.method21885(2144073280);
	}

	@OriginalMember(owner = "client!zz", name = "t", descriptor = "(Lclient!yf;I)V", line = 4877)
	static final void method36943(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5889 += arg0.anIntArray520[arg0.anInt5889 * -709694321] * 2047914607;
	}
}
