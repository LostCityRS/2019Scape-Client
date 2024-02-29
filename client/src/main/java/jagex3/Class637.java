package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class637 {

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
	public static final int anInt5891 = 0;

	@OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
	public static final int anInt5892 = 1;

	@OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
	public static final int anInt5893 = 2;

	@OriginalMember(owner = "client!wh", name = "z", descriptor = "I")
	public static final int anInt5894 = 4;

	@OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
	public static final int anInt5895 = 3;

	@OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
	public static final int anInt5896 = 3;

	@OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
	public static final int anInt5897 = 2;

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
	static final int anInt5898 = 100;

	@OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
	public static final int anInt5900 = 5;

	@OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
	public static final int anInt5901 = 1;

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
	public static final int anInt5902 = 0;

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
	static final int anInt5909 = 3;

	@OriginalMember(owner = "client!wh", name = "sq", descriptor = "Lclient!ek;")
	public static Class113 aClass113_1;

	@OriginalMember(owner = "client!wh", name = "x", descriptor = "I")
	public int anInt5899;

	@OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
	public int anInt5903;

	@OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
	public int anInt5904;

	@OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
	public int anInt5905;

	@OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
	public int anInt5906;

	@OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
	public int anInt5907;

	@OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
	public int anInt5908;

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "[[I")
	public int[][] anIntArrayArray66 = new int[3][5];

	@OriginalMember(owner = "client!wh", name = "bcy", descriptor = "(Lclient!yf;I)V")
	static void method32635(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anInt6049 -= 1915061582;
		@Pc(27) String local27 = (String) arg0.anObjectArray45[arg0.anInt6049 * 587908375];
		@Pc(38) String local38 = (String) arg0.anObjectArray45[arg0.anInt6049 * 587908375 + 1];
		if (local27.length() <= 500 && local38.length() <= 500) {
			Class330.method27464(local12, local27, local38, (byte) 8);
		}
	}

	@OriginalMember(owner = "client!wh", name = "awv", descriptor = "(Lclient!yf;B)V")
	static void method32636(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) Class154_Sub1 local2 = Class443.method29051(2036177897);
		if (local2 != null) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local2.anInt1654 * 2079113925;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local2.anInt1650 * 803722663;
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local2.aString47;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local2.method14148(-2146831733);
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local2.method14154((byte) -37);
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local2.anInt1652 * 1625257571;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local2.anInt1655 * 1280583823;
			arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = local2.aString46;
			return;
		}
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = 0;
		arg0.anObjectArray45[(arg0.anInt6049 += 957530791) * 587908375 - 1] = "";
	}

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!py;)V")
	public Class637(@OriginalArg(0) Class497 arg0) {
		@Pc(14) byte[] local14 = arg0.method30240(Class649.aClass649_9.anInt5956 * -51136173, (byte) 17);
		if (local14 == null) {
		}
		this.method32630(new Class93_Sub41(local14), (short) -32768);
	}

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "(Lclient!alw;S)V")
	void method32630(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) short arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInt5903 = arg0.method22431(-118643075) * 665851349;
			} else if (local3 == 2) {
				this.anInt5904 = arg0.method22431(-118643075) * -840389275;
			} else if (local3 == 3) {
				this.anInt5905 = arg0.method22431(-118643075) * -1776279231;
			} else if (local3 == 4) {
				this.anInt5906 = arg0.method22425((short) 16384) * -167208525;
			} else if (local3 == 5) {
				this.anInt5907 = arg0.method22425((short) 16384) * 329391631;
			} else if (local3 == 6) {
				this.anInt5908 = arg0.method22431(-118643075) * 793463205;
			} else if (local3 == 7) {
				this.anInt5899 = arg0.method22431(-118643075) * -650604495;
			} else if (local3 >= 100) {
				local3 -= 100;
				this.anIntArrayArray66[local3 & (int) (Math.pow(2.0D, 3.0D) - 1.0D)][local3 >> 3] = arg0.method22427(-1434290800);
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "n", descriptor = "(Lclient!alw;)V")
	void method32631(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInt5903 = arg0.method22431(-118643075) * 665851349;
			} else if (local3 == 2) {
				this.anInt5904 = arg0.method22431(-118643075) * -840389275;
			} else if (local3 == 3) {
				this.anInt5905 = arg0.method22431(-118643075) * -1776279231;
			} else if (local3 == 4) {
				this.anInt5906 = arg0.method22425((short) 16384) * -167208525;
			} else if (local3 == 5) {
				this.anInt5907 = arg0.method22425((short) 16384) * 329391631;
			} else if (local3 == 6) {
				this.anInt5908 = arg0.method22431(-118643075) * 793463205;
			} else if (local3 == 7) {
				this.anInt5899 = arg0.method22431(-118643075) * -650604495;
			} else if (local3 >= 100) {
				local3 -= 100;
				this.anIntArrayArray66[local3 & (int) (Math.pow(2.0D, 3.0D) - 1.0D)][local3 >> 3] = arg0.method22427(-1434290800);
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "m", descriptor = "(Lclient!alw;)V")
	void method32632(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInt5903 = arg0.method22431(-118643075) * 665851349;
			} else if (local3 == 2) {
				this.anInt5904 = arg0.method22431(-118643075) * -840389275;
			} else if (local3 == 3) {
				this.anInt5905 = arg0.method22431(-118643075) * -1776279231;
			} else if (local3 == 4) {
				this.anInt5906 = arg0.method22425((short) 16384) * -167208525;
			} else if (local3 == 5) {
				this.anInt5907 = arg0.method22425((short) 16384) * 329391631;
			} else if (local3 == 6) {
				this.anInt5908 = arg0.method22431(-118643075) * 793463205;
			} else if (local3 == 7) {
				this.anInt5899 = arg0.method22431(-118643075) * -650604495;
			} else if (local3 >= 100) {
				local3 -= 100;
				this.anIntArrayArray66[local3 & (int) (Math.pow(2.0D, 3.0D) - 1.0D)][local3 >> 3] = arg0.method22427(-1434290800);
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "k", descriptor = "(Lclient!alw;)V")
	void method32633(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInt5903 = arg0.method22431(-118643075) * 665851349;
			} else if (local3 == 2) {
				this.anInt5904 = arg0.method22431(-118643075) * -840389275;
			} else if (local3 == 3) {
				this.anInt5905 = arg0.method22431(-118643075) * -1776279231;
			} else if (local3 == 4) {
				this.anInt5906 = arg0.method22425((short) 16384) * -167208525;
			} else if (local3 == 5) {
				this.anInt5907 = arg0.method22425((short) 16384) * 329391631;
			} else if (local3 == 6) {
				this.anInt5908 = arg0.method22431(-118643075) * 793463205;
			} else if (local3 == 7) {
				this.anInt5899 = arg0.method22431(-118643075) * -650604495;
			} else if (local3 >= 100) {
				local3 -= 100;
				this.anIntArrayArray66[local3 & (int) (Math.pow(2.0D, 3.0D) - 1.0D)][local3 >> 3] = arg0.method22427(-1434290800);
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "(Lclient!alw;)V")
	void method32634(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInt5903 = arg0.method22431(-118643075) * 665851349;
			} else if (local3 == 2) {
				this.anInt5904 = arg0.method22431(-118643075) * -840389275;
			} else if (local3 == 3) {
				this.anInt5905 = arg0.method22431(-118643075) * -1776279231;
			} else if (local3 == 4) {
				this.anInt5906 = arg0.method22425((short) 16384) * -167208525;
			} else if (local3 == 5) {
				this.anInt5907 = arg0.method22425((short) 16384) * 329391631;
			} else if (local3 == 6) {
				this.anInt5908 = arg0.method22431(-118643075) * 793463205;
			} else if (local3 == 7) {
				this.anInt5899 = arg0.method22431(-118643075) * -650604495;
			} else if (local3 >= 100) {
				local3 -= 100;
				this.anIntArrayArray66[local3 & (int) (Math.pow(2.0D, 3.0D) - 1.0D)][local3 >> 3] = arg0.method22427(-1434290800);
			}
		}
	}
}
