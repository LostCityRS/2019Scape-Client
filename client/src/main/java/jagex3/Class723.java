package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zz")
public final class Class723 {

	@OriginalMember(owner = "client!zz", name = "u", descriptor = "[I")
	static int[] anIntArray530;

	@OriginalMember(owner = "client!zz", name = "z", descriptor = "[[[B")
	static byte[][][] aByteArrayArrayArray14;

	@OriginalMember(owner = "client!zz", name = "e", descriptor = "I")
	static int anInt6129 = 0;

	@OriginalMember(owner = "client!zz", name = "n", descriptor = "I")
	static int anInt6127 = 0;

	@OriginalMember(owner = "client!zz", name = "m", descriptor = "I")
	static int anInt6128 = 0;

	@OriginalMember(owner = "client!zz", name = "k", descriptor = "[[B")
	static byte[][] aByteArrayArray26 = new byte[1000][];

	@OriginalMember(owner = "client!zz", name = "f", descriptor = "[[B")
	static byte[][] aByteArrayArray27 = new byte[250][];

	@OriginalMember(owner = "client!zz", name = "w", descriptor = "[[B")
	static byte[][] aByteArrayArray28 = new byte[50][];

	@OriginalMember(owner = "client!zz", name = "m", descriptor = "(II)[B")
	public static synchronized byte[] method37115(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return method37116(arg0, false, 592143678);
	}

	@OriginalMember(owner = "client!zz", name = "n", descriptor = "(IZI)[B")
	public static synchronized byte[] method37116(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(21) byte[] local21;
		if ((arg0 == 100 || arg0 < 100 && arg1) && anInt6129 * 990331919 > 0) {
			local21 = aByteArrayArray26[(anInt6129 -= 1260595951) * 990331919];
			aByteArrayArray26[anInt6129 * 990331919] = null;
			return local21;
		} else if ((arg0 == 5000 || arg0 < 5000 && arg1) && anInt6127 * 211106159 > 0) {
			local21 = aByteArrayArray27[(anInt6127 -= -1451866737) * 211106159];
			aByteArrayArray27[anInt6127 * 211106159] = null;
			return local21;
		} else if ((arg0 == 30000 || arg0 < 30000 && arg1) && anInt6128 * -1547868365 > 0) {
			local21 = aByteArrayArray28[(anInt6128 -= -902763525) * -1547868365];
			aByteArrayArray28[anInt6128 * -1547868365] = null;
			return local21;
		} else {
			@Pc(94) int local94;
			if (aByteArrayArrayArray14 != null) {
				for (local94 = 0; local94 < Class588.anIntArray477.length; local94++) {
					if ((arg0 == Class588.anIntArray477[local94] || arg0 < Class588.anIntArray477[local94] && arg1) && anIntArray530[local94] > 0) {
						@Pc(127) byte[] local127 = aByteArrayArrayArray14[local94][--anIntArray530[local94]];
						aByteArrayArrayArray14[local94][anIntArray530[local94]] = null;
						return local127;
					}
				}
			}
			if (arg1 && Class588.anIntArray477 != null) {
				for (local94 = 0; local94 < Class588.anIntArray477.length; local94++) {
					if (arg0 <= Class588.anIntArray477[local94] && anIntArray530[local94] < aByteArrayArrayArray14[local94].length) {
						return new byte[Class588.anIntArray477[local94]];
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!zz", name = "f", descriptor = "([I[I)V")
	public static void method37117(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			Class588.anIntArray477 = null;
			anIntArray530 = null;
			aByteArrayArrayArray14 = null;
			return;
		}
		Class588.anIntArray477 = arg0;
		anIntArray530 = new int[arg0.length];
		aByteArrayArrayArray14 = new byte[arg0.length][][];
		for (@Pc(25) int local25 = 0; local25 < Class588.anIntArray477.length; local25++) {
			aByteArrayArrayArray14[local25] = new byte[arg1[local25]][];
		}
	}

	@OriginalMember(owner = "client!zz", name = "w", descriptor = "([I[I)V")
	public static void method37118(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			Class588.anIntArray477 = null;
			anIntArray530 = null;
			aByteArrayArrayArray14 = null;
			return;
		}
		Class588.anIntArray477 = arg0;
		anIntArray530 = new int[arg0.length];
		aByteArrayArrayArray14 = new byte[arg0.length][][];
		for (@Pc(25) int local25 = 0; local25 < Class588.anIntArray477.length; local25++) {
			aByteArrayArrayArray14[local25] = new byte[arg1[local25]][];
		}
	}

	@OriginalMember(owner = "client!zz", name = "k", descriptor = "([BB)V")
	public static synchronized void method37119(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) {
		if (arg0.length == 100 && anInt6129 * 990331919 < 1000) {
			aByteArrayArray26[(anInt6129 += 1260595951) * 990331919 - 1] = arg0;
		} else if (arg0.length == 5000 && anInt6127 * 211106159 < 250) {
			aByteArrayArray27[(anInt6127 += -1451866737) * 211106159 - 1] = arg0;
		} else if (arg0.length == 30000 && anInt6128 * -1547868365 < 50) {
			aByteArrayArray28[(anInt6128 += -902763525) * -1547868365 - 1] = arg0;
		} else if (aByteArrayArrayArray14 != null) {
			for (@Pc(69) int local69 = 0; local69 < Class588.anIntArray477.length; local69++) {
				if (arg0.length == Class588.anIntArray477[local69] && anIntArray530[local69] < aByteArrayArrayArray14[local69].length) {
					aByteArrayArrayArray14[local69][anIntArray530[local69]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!zz", name = "l", descriptor = "(I)[B")
	public static synchronized byte[] method37120(@OriginalArg(0) int arg0) {
		return method37116(arg0, false, -1995390377);
	}

	@OriginalMember(owner = "client!zz", name = "u", descriptor = "(I)[B")
	public static synchronized byte[] method37121(@OriginalArg(0) int arg0) {
		return method37116(arg0, false, -774839264);
	}

	@OriginalMember(owner = "client!zz", name = "z", descriptor = "([B)V")
	public static synchronized void method37122(@OriginalArg(0) byte[] arg0) {
		if (arg0.length == 100 && anInt6129 * 990331919 < 1000) {
			aByteArrayArray26[(anInt6129 += 1260595951) * 990331919 - 1] = arg0;
		} else if (arg0.length == 5000 && anInt6127 * 211106159 < 250) {
			aByteArrayArray27[(anInt6127 += -1451866737) * 211106159 - 1] = arg0;
		} else if (arg0.length == 30000 && anInt6128 * -1547868365 < 50) {
			aByteArrayArray28[(anInt6128 += -902763525) * -1547868365 - 1] = arg0;
		} else if (aByteArrayArrayArray14 != null) {
			for (@Pc(69) int local69 = 0; local69 < Class588.anIntArray477.length; local69++) {
				if (arg0.length == Class588.anIntArray477[local69] && anIntArray530[local69] < aByteArrayArrayArray14[local69].length) {
					aByteArrayArrayArray14[local69][anIntArray530[local69]++] = arg0;
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!zz", name = "t", descriptor = "(Lclient!yf;I)V")
	static void method37123(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6050 += arg0.anIntArray522[arg0.anInt6050 * -709694321] * 2047914607;
	}

	@OriginalMember(owner = "client!zz", name = "j", descriptor = "(I)V")
	static void method37124(@OriginalArg(0) int arg0) {
		@Pc(3) Class93_Sub1_Sub11 local3 = Class371.method28187(14, 0L);
		local3.method21877(2144073280);
	}

	@OriginalMember(owner = "client!zz", name = "<init>", descriptor = "()V")
	Class723() throws Throwable {
		throw new Error();
	}
}
