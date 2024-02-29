package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public class Class637 {

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
	public static final int anInt5730 = 0;

	@OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
	public static final int anInt5731 = 1;

	@OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
	public static final int anInt5732 = 2;

	@OriginalMember(owner = "client!wh", name = "z", descriptor = "I")
	public static final int anInt5733 = 4;

	@OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
	public static final int anInt5734 = 3;

	@OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
	public static final int anInt5735 = 3;

	@OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
	public static final int anInt5736 = 2;

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
	static final int anInt5737 = 100;

	@OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
	public static final int anInt5739 = 5;

	@OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
	public static final int anInt5740 = 1;

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
	public static final int anInt5741 = 0;

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
	static final int anInt5748 = 3;

	@OriginalMember(owner = "client!wh", name = "sq", descriptor = "Lclient!ek;")
	public static Class113 aClass113_1;

	@OriginalMember(owner = "client!wh", name = "x", descriptor = "I")
	public int anInt5738;

	@OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
	public int anInt5742;

	@OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
	public int anInt5743;

	@OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
	public int anInt5744;

	@OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
	public int anInt5745;

	@OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
	public int anInt5746;

	@OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
	public int anInt5747;

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "[[I")
	public int[][] anIntArrayArray66 = new int[3][5];

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!py;)V", line = 28)
	public Class637(@OriginalArg(0) Class497 arg0) {
		@Pc(14) byte[] local14 = arg0.method30079(Class649.aClass649_9.anInt5795 * -51136173, (byte) 17);
		if (local14 == null) {
		}
		this.method32449(new Class93_Sub41(local14), (short) -32768);
	}

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "(Lclient!alw;S)V", line = 36)
	void method32449(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) short arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInt5742 = arg0.method22483(-118643075) * 665851349;
			} else if (local3 == 2) {
				this.anInt5743 = arg0.method22483(-118643075) * -840389275;
			} else if (local3 == 3) {
				this.anInt5744 = arg0.method22483(-118643075) * -1776279231;
			} else if (local3 == 4) {
				this.anInt5745 = arg0.method22465((short) 16384) * -167208525;
			} else if (local3 == 5) {
				this.anInt5746 = arg0.method22465((short) 16384) * 329391631;
			} else if (local3 == 6) {
				this.anInt5747 = arg0.method22483(-118643075) * 793463205;
			} else if (local3 == 7) {
				this.anInt5738 = arg0.method22483(-118643075) * -650604495;
			} else if (local3 >= 100) {
				local3 -= 100;
				this.anIntArrayArray66[local3 & (int) (Math.pow(2.0D, 3.0D) - 1.0D)][local3 >> 3] = arg0.method22472(-1434290800);
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "n", descriptor = "(Lclient!alw;)V", line = 36)
	void method32450(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInt5742 = arg0.method22483(-118643075) * 665851349;
			} else if (local3 == 2) {
				this.anInt5743 = arg0.method22483(-118643075) * -840389275;
			} else if (local3 == 3) {
				this.anInt5744 = arg0.method22483(-118643075) * -1776279231;
			} else if (local3 == 4) {
				this.anInt5745 = arg0.method22465((short) 16384) * -167208525;
			} else if (local3 == 5) {
				this.anInt5746 = arg0.method22465((short) 16384) * 329391631;
			} else if (local3 == 6) {
				this.anInt5747 = arg0.method22483(-118643075) * 793463205;
			} else if (local3 == 7) {
				this.anInt5738 = arg0.method22483(-118643075) * -650604495;
			} else if (local3 >= 100) {
				local3 -= 100;
				this.anIntArrayArray66[local3 & (int) (Math.pow(2.0D, 3.0D) - 1.0D)][local3 >> 3] = arg0.method22472(-1434290800);
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "m", descriptor = "(Lclient!alw;)V", line = 36)
	void method32451(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInt5742 = arg0.method22483(-118643075) * 665851349;
			} else if (local3 == 2) {
				this.anInt5743 = arg0.method22483(-118643075) * -840389275;
			} else if (local3 == 3) {
				this.anInt5744 = arg0.method22483(-118643075) * -1776279231;
			} else if (local3 == 4) {
				this.anInt5745 = arg0.method22465((short) 16384) * -167208525;
			} else if (local3 == 5) {
				this.anInt5746 = arg0.method22465((short) 16384) * 329391631;
			} else if (local3 == 6) {
				this.anInt5747 = arg0.method22483(-118643075) * 793463205;
			} else if (local3 == 7) {
				this.anInt5738 = arg0.method22483(-118643075) * -650604495;
			} else if (local3 >= 100) {
				local3 -= 100;
				this.anIntArrayArray66[local3 & (int) (Math.pow(2.0D, 3.0D) - 1.0D)][local3 >> 3] = arg0.method22472(-1434290800);
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "k", descriptor = "(Lclient!alw;)V", line = 36)
	void method32452(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInt5742 = arg0.method22483(-118643075) * 665851349;
			} else if (local3 == 2) {
				this.anInt5743 = arg0.method22483(-118643075) * -840389275;
			} else if (local3 == 3) {
				this.anInt5744 = arg0.method22483(-118643075) * -1776279231;
			} else if (local3 == 4) {
				this.anInt5745 = arg0.method22465((short) 16384) * -167208525;
			} else if (local3 == 5) {
				this.anInt5746 = arg0.method22465((short) 16384) * 329391631;
			} else if (local3 == 6) {
				this.anInt5747 = arg0.method22483(-118643075) * 793463205;
			} else if (local3 == 7) {
				this.anInt5738 = arg0.method22483(-118643075) * -650604495;
			} else if (local3 >= 100) {
				local3 -= 100;
				this.anIntArrayArray66[local3 & (int) (Math.pow(2.0D, 3.0D) - 1.0D)][local3 >> 3] = arg0.method22472(-1434290800);
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "(Lclient!alw;)V", line = 36)
	void method32453(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22465((short) 16384);
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInt5742 = arg0.method22483(-118643075) * 665851349;
			} else if (local3 == 2) {
				this.anInt5743 = arg0.method22483(-118643075) * -840389275;
			} else if (local3 == 3) {
				this.anInt5744 = arg0.method22483(-118643075) * -1776279231;
			} else if (local3 == 4) {
				this.anInt5745 = arg0.method22465((short) 16384) * -167208525;
			} else if (local3 == 5) {
				this.anInt5746 = arg0.method22465((short) 16384) * 329391631;
			} else if (local3 == 6) {
				this.anInt5747 = arg0.method22483(-118643075) * 793463205;
			} else if (local3 == 7) {
				this.anInt5738 = arg0.method22483(-118643075) * -650604495;
			} else if (local3 >= 100) {
				local3 -= 100;
				this.anIntArrayArray66[local3 & (int) (Math.pow(2.0D, 3.0D) - 1.0D)][local3 >> 3] = arg0.method22472(-1434290800);
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "awv", descriptor = "(Lclient!yf;B)V", line = 13654)
	static final void method32454(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(2) Class154_Sub1 local2 = Class443.method28870(2036177897);
		if (local2 != null) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local2.anInt1654 * 2079113925;
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local2.anInt1650 * 803722663;
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local2.aString47;
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local2.method14151(-2146831733);
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local2.method14157((byte) -37);
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local2.anInt1652 * 1625257571;
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local2.anInt1655 * 1280583823;
			arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local2.aString46;
			return;
		}
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = "";
	}

	@OriginalMember(owner = "client!wh", name = "bcy", descriptor = "(Lclient!yf;I)V", line = 14591)
	static final void method32455(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anInt5888 -= 1915061582;
		@Pc(27) String local27 = (String) arg0.anObjectArray45[arg0.anInt5888 * 587908375];
		@Pc(38) String local38 = (String) arg0.anObjectArray45[arg0.anInt5888 * 587908375 + 1];
		if (local27.length() <= 500 && local38.length() <= 500) {
			Class330.method27373(local12, local27, local38, (byte) 8);
		}
	}
}
