package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adg")
public final class Class80_Sub1_Sub1 extends Class80_Sub1 implements Interface11, Interface5 {

	@OriginalMember(owner = "client!adg", name = "gs", descriptor = "Lclient!abq;")
	public static Class41 aClass41_2;

	@OriginalMember(owner = "client!adg", name = "k", descriptor = "I")
	public static int anInt254;

	@OriginalMember(owner = "client!adg", name = "u", descriptor = "Lclient!aax;")
	Class24 aClass24_3;

	@OriginalMember(owner = "client!adg", name = "k", descriptor = "(I)Lclient!zl;")
	public static Class710 method1491(@OriginalArg(0) int arg0) {
		return Class138.aClass710_3 == null ? Class710.aClass710_6 : Class138.aClass710_3;
	}

	@OriginalMember(owner = "client!adg", name = "aft", descriptor = "(Lclient!yp;I)V")
	static void method1492(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class623.method32439((char) local12, 1515891663) ? 1 : 0;
	}

	@OriginalMember(owner = "client!adg", name = "<init>", descriptor = "()V")
	Class80_Sub1_Sub1() {
	}

	@OriginalMember(owner = "client!adg", name = "p", descriptor = "(II)I")
	public int method1482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass24_3 == null) {
			return arg1;
		} else {
			@Pc(11) Class80_Sub20 local11 = (Class80_Sub20) this.aClass24_3.method560((long) arg0);
			return local11 == null ? arg1 : local11.anInt1588 * 701000167;
		}
	}

	@OriginalMember(owner = "client!adg", name = "t", descriptor = "(Lclient!ald;I)V")
	@Override
	public void method37006(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(-1561815072);
			if (local3 == 0) {
				return;
			}
			this.method1484(arg0, local3, 2792457);
		}
	}

	@OriginalMember(owner = "client!adg", name = "j", descriptor = "(I)V")
	@Override
	public void method37012(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adg", name = "m", descriptor = "(ILjava/lang/String;B)Ljava/lang/String;")
	public String method1483(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) byte arg2) {
		if (this.aClass24_3 == null) {
			return arg1;
		} else {
			@Pc(12) Class80_Sub19 local12 = (Class80_Sub19) this.aClass24_3.method560((long) arg0);
			return local12 == null ? arg1 : (String) local12.anObject5;
		}
	}

	@OriginalMember(owner = "client!adg", name = "g", descriptor = "(IS)V")
	@Override
	public void method37014(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
	}

	@OriginalMember(owner = "client!adg", name = "f", descriptor = "(B)V")
	@Override
	public void method37007(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!adg", name = "e", descriptor = "()V")
	@Override
	public void method37008() {
	}

	@OriginalMember(owner = "client!adg", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	public void method37009(@OriginalArg(0) Class80_Sub36 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(-1116892484);
			if (local3 == 0) {
				return;
			}
			this.method1484(arg0, local3, -241488376);
		}
	}

	@OriginalMember(owner = "client!adg", name = "l", descriptor = "(Lclient!ald;II)V")
	void method1484(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 != 249) {
			return;
		}
		@Pc(6) int local6 = arg0.method23362(772440296);
		@Pc(14) int local14;
		if (this.aClass24_3 == null) {
			local14 = Class700.method37081(local6, (byte) 9);
			this.aClass24_3 = new Class24(local14);
		}
		for (local14 = 0; local14 < local6; local14++) {
			@Pc(34) boolean local34 = arg0.method23362(743362467) == 1;
			@Pc(38) int local38 = arg0.method23180(1710327153);
			@Pc(47) Class80 local47;
			if (local34) {
				local47 = new Class80_Sub19(arg0.method23376((short) 27224));
			} else {
				local47 = new Class80_Sub20(arg0.method23182(1180069025));
			}
			this.aClass24_3.method563(local47, (long) local38);
		}
	}

	@OriginalMember(owner = "client!adg", name = "o", descriptor = "(I)V")
	@Override
	public void method37010(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adg", name = "s", descriptor = "(I)V")
	@Override
	public void method37011(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adg", name = "i", descriptor = "(IIS)I")
	public int method1485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		if (this.aClass24_3 == null) {
			return arg1;
		} else {
			@Pc(11) Class80_Sub20 local11 = (Class80_Sub20) this.aClass24_3.method560((long) arg0);
			return local11 == null ? arg1 : local11.anInt1588 * 701000167;
		}
	}

	@OriginalMember(owner = "client!adg", name = "x", descriptor = "(Lclient!ald;I)V")
	void method1486(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(6) int local6 = arg0.method23362(-995613845);
		@Pc(14) int local14;
		if (this.aClass24_3 == null) {
			local14 = Class700.method37081(local6, (byte) 9);
			this.aClass24_3 = new Class24(local14);
		}
		for (local14 = 0; local14 < local6; local14++) {
			@Pc(34) boolean local34 = arg0.method23362(-1830587250) == 1;
			@Pc(38) int local38 = arg0.method23180(1710327153);
			@Pc(47) Class80 local47;
			if (local34) {
				local47 = new Class80_Sub19(arg0.method23376((short) 11350));
			} else {
				local47 = new Class80_Sub20(arg0.method23182(1059203199));
			}
			this.aClass24_3.method563(local47, (long) local38);
		}
	}

	@OriginalMember(owner = "client!adg", name = "z", descriptor = "(II)I")
	public int method1487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass24_3 == null) {
			return arg1;
		} else {
			@Pc(11) Class80_Sub20 local11 = (Class80_Sub20) this.aClass24_3.method560((long) arg0);
			return local11 == null ? arg1 : local11.anInt1588 * 701000167;
		}
	}

	@OriginalMember(owner = "client!adg", name = "a", descriptor = "(I)V")
	@Override
	public void method37013(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adg", name = "v", descriptor = "(II)I")
	public int method1488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass24_3 == null) {
			return arg1;
		} else {
			@Pc(11) Class80_Sub20 local11 = (Class80_Sub20) this.aClass24_3.method560((long) arg0);
			return local11 == null ? arg1 : local11.anInt1588 * 701000167;
		}
	}

	@OriginalMember(owner = "client!adg", name = "y", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public String method1489(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass24_3 == null) {
			return arg1;
		} else {
			@Pc(12) Class80_Sub19 local12 = (Class80_Sub19) this.aClass24_3.method560((long) arg0);
			return local12 == null ? arg1 : (String) local12.anObject5;
		}
	}

	@OriginalMember(owner = "client!adg", name = "n", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public String method1490(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass24_3 == null) {
			return arg1;
		} else {
			@Pc(12) Class80_Sub19 local12 = (Class80_Sub19) this.aClass24_3.method560((long) arg0);
			return local12 == null ? arg1 : (String) local12.anObject5;
		}
	}
}
