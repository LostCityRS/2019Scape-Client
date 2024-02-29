package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abc")
public final class Class30 implements Interface13, Interface5 {

	@OriginalMember(owner = "client!abc", name = "hz", descriptor = "Lclient!aor;")
	public static Class32_Sub16 aClass32_Sub16_1;

	@OriginalMember(owner = "client!abc", name = "n", descriptor = "[[Lclient!qw;")
	Class519[][] aClass519ArrayArray1;

	@OriginalMember(owner = "client!abc", name = "e", descriptor = "[[Ljava/lang/Object;")
	Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!abc", name = "m", descriptor = "I")
	public int anInt105;

	@OriginalMember(owner = "client!abc", name = "go", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method626(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt6052 -= -725861497;
		@Pc(13) int local13 = arg2.anIntArray521[arg2.anInt6052 * -1497248091];
		@Pc(24) short local24 = (short) arg2.anIntArray521[arg2.anInt6052 * -1497248091 + 1];
		@Pc(35) short local35 = (short) arg2.anIntArray521[arg2.anInt6052 * -1497248091 + 2];
		if (local13 < 0 || local13 >= 5) {
			return;
		}
		arg0.method26965(local13, local24, local35, -645249360);
		Class354.method27789(arg0, -1174743804);
		if (arg0.anInt4011 * 532402067 == -1 && !arg1.aBoolean712) {
			Class41.method817(arg0.anInt3994 * -1549590237, local13, 1469693779);
		}
	}

	@OriginalMember(owner = "client!abc", name = "d", descriptor = "(ZI)V")
	static void method627(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		Class168.aString61 = Class168.aString61.trim();
		Class168.anInt2443 = 0;
		if (Class168.aString61.length() == 0) {
			Class168.anInt2445 = 0;
			return;
		}
		Class314.method27032("--> " + Class168.aString61, -2007571843);
		Class32_Sub7.method16835(Class168.aString61, false, arg0, (byte) 3);
		if (arg0) {
			Class168.anInt2445 = Class168.aString61.length() * -1799421149;
		} else {
			Class168.anInt2445 = 0;
			Class168.aString61 = "";
		}
	}

	@OriginalMember(owner = "client!abc", name = "<init>", descriptor = "()V")
	Class30() {
	}

	@OriginalMember(owner = "client!abc", name = "o", descriptor = "(Lclient!alw;I)V")
	void method617(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 3) {
			@Pc(6) int local6 = arg0.method22425((short) 16384);
			if (this.anObjectArrayArray1 == null) {
				this.anObjectArrayArray1 = new Object[local6][];
				this.aClass519ArrayArray1 = new Class519[local6][];
			}
			for (@Pc(22) int local22 = arg0.method22425((short) 16384); local22 != 255; local22 = arg0.method22425((short) 16384)) {
				@Pc(29) int local29 = arg0.method22425((short) 16384);
				@Pc(32) Class519[] local32 = new Class519[local29];
				for (@Pc(34) int local34 = 0; local34 < local29; local34++) {
					local32[local34] = (Class519) Class107.method18131(Class519.method30493(1543250623), arg0.method22644((byte) -33), -1915563430);
				}
				this.anObjectArrayArray1[local22] = Class166_Sub38.method16338(arg0, local32, -932100834);
				this.aClass519ArrayArray1[local22] = local32;
			}
		} else if (arg1 == 4) {
			this.anInt105 = arg0.method22608((short) 6058) * 586759731;
		}
	}

	@OriginalMember(owner = "client!abc", name = "s", descriptor = "(Lclient!alw;I)V")
	void method618(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 3) {
			@Pc(6) int local6 = arg0.method22425((short) 16384);
			if (this.anObjectArrayArray1 == null) {
				this.anObjectArrayArray1 = new Object[local6][];
				this.aClass519ArrayArray1 = new Class519[local6][];
			}
			for (@Pc(22) int local22 = arg0.method22425((short) 16384); local22 != 255; local22 = arg0.method22425((short) 16384)) {
				@Pc(29) int local29 = arg0.method22425((short) 16384);
				@Pc(32) Class519[] local32 = new Class519[local29];
				for (@Pc(34) int local34 = 0; local34 < local29; local34++) {
					local32[local34] = (Class519) Class107.method18131(Class519.method30493(1860785111), arg0.method22644((byte) -58), -1915563430);
				}
				this.anObjectArrayArray1[local22] = Class166_Sub38.method16338(arg0, local32, -486098583);
				this.aClass519ArrayArray1[local22] = local32;
			}
		} else if (arg1 == 4) {
			this.anInt105 = arg0.method22608((short) -6368) * 586759731;
		}
	}

	@OriginalMember(owner = "client!abc", name = "r", descriptor = "(I)V")
	@Override
	public void method36693(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!abc", name = "p", descriptor = "(Lclient!alw;II)V")
	void method619(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 3) {
			@Pc(6) int local6 = arg0.method22425((short) 16384);
			if (this.anObjectArrayArray1 == null) {
				this.anObjectArrayArray1 = new Object[local6][];
				this.aClass519ArrayArray1 = new Class519[local6][];
			}
			for (@Pc(22) int local22 = arg0.method22425((short) 16384); local22 != 255; local22 = arg0.method22425((short) 16384)) {
				@Pc(29) int local29 = arg0.method22425((short) 16384);
				@Pc(32) Class519[] local32 = new Class519[local29];
				for (@Pc(34) int local34 = 0; local34 < local29; local34++) {
					local32[local34] = (Class519) Class107.method18131(Class519.method30493(1688759182), arg0.method22644((byte) -119), -1915563430);
				}
				this.anObjectArrayArray1[local22] = Class166_Sub38.method16338(arg0, local32, -1452468992);
				this.aClass519ArrayArray1[local22] = local32;
			}
		} else if (arg1 == 4) {
			this.anInt105 = arg0.method22608((short) -9339) * 586759731;
		}
	}

	@OriginalMember(owner = "client!abc", name = "n", descriptor = "(I)V")
	@Override
	public void method36834(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!abc", name = "z", descriptor = "(IB)V")
	@Override
	public void method36694(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!abc", name = "m", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36836(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method619(arg0, local3, -261418109);
		}
	}

	@OriginalMember(owner = "client!abc", name = "k", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36837(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method619(arg0, local3, -193447756);
		}
	}

	@OriginalMember(owner = "client!abc", name = "v", descriptor = "(I)V")
	@Override
	public void method36692(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!abc", name = "w", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36839(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method619(arg0, local3, -426344539);
		}
	}

	@OriginalMember(owner = "client!abc", name = "l", descriptor = "()V")
	@Override
	public void method36840() {
	}

	@OriginalMember(owner = "client!abc", name = "u", descriptor = "(II)[Ljava/lang/Object;")
	public Object[] method620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anObjectArrayArray1 == null ? null : this.anObjectArrayArray1[arg0];
	}

	@OriginalMember(owner = "client!abc", name = "e", descriptor = "(Lclient!alw;B)V")
	@Override
	public void method36835(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method619(arg0, local3, -1227236892);
		}
	}

	@OriginalMember(owner = "client!abc", name = "c", descriptor = "(I)[Ljava/lang/Object;")
	public Object[] method621(@OriginalArg(0) int arg0) {
		return this.anObjectArrayArray1 == null ? null : this.anObjectArrayArray1[arg0];
	}

	@OriginalMember(owner = "client!abc", name = "d", descriptor = "(I)[Ljava/lang/Object;")
	public Object[] method622(@OriginalArg(0) int arg0) {
		return this.anObjectArrayArray1 == null ? null : this.anObjectArrayArray1[arg0];
	}

	@OriginalMember(owner = "client!abc", name = "y", descriptor = "(Lclient!alw;I)V")
	void method623(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 3) {
			@Pc(6) int local6 = arg0.method22425((short) 16384);
			if (this.anObjectArrayArray1 == null) {
				this.anObjectArrayArray1 = new Object[local6][];
				this.aClass519ArrayArray1 = new Class519[local6][];
			}
			for (@Pc(22) int local22 = arg0.method22425((short) 16384); local22 != 255; local22 = arg0.method22425((short) 16384)) {
				@Pc(29) int local29 = arg0.method22425((short) 16384);
				@Pc(32) Class519[] local32 = new Class519[local29];
				for (@Pc(34) int local34 = 0; local34 < local29; local34++) {
					local32[local34] = (Class519) Class107.method18131(Class519.method30493(1865591604), arg0.method22644((byte) -41), -1915563430);
				}
				this.anObjectArrayArray1[local22] = Class166_Sub38.method16338(arg0, local32, -1802627876);
				this.aClass519ArrayArray1[local22] = local32;
			}
		} else if (arg1 == 4) {
			this.anInt105 = arg0.method22608((short) -8336) * 586759731;
		}
	}

	@OriginalMember(owner = "client!abc", name = "f", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36838(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method619(arg0, local3, 365861905);
		}
	}

	@OriginalMember(owner = "client!abc", name = "q", descriptor = "(Lclient!alw;I)V")
	void method624(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 3) {
			@Pc(6) int local6 = arg0.method22425((short) 16384);
			if (this.anObjectArrayArray1 == null) {
				this.anObjectArrayArray1 = new Object[local6][];
				this.aClass519ArrayArray1 = new Class519[local6][];
			}
			for (@Pc(22) int local22 = arg0.method22425((short) 16384); local22 != 255; local22 = arg0.method22425((short) 16384)) {
				@Pc(29) int local29 = arg0.method22425((short) 16384);
				@Pc(32) Class519[] local32 = new Class519[local29];
				for (@Pc(34) int local34 = 0; local34 < local29; local34++) {
					local32[local34] = (Class519) Class107.method18131(Class519.method30493(1507909282), arg0.method22644((byte) -83), -1915563430);
				}
				this.anObjectArrayArray1[local22] = Class166_Sub38.method16338(arg0, local32, -1626946471);
				this.aClass519ArrayArray1[local22] = local32;
			}
		} else if (arg1 == 4) {
			this.anInt105 = arg0.method22608((short) -6125) * 586759731;
		}
	}

	@OriginalMember(owner = "client!abc", name = "x", descriptor = "(Lclient!alw;I)V")
	void method625(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 3) {
			@Pc(6) int local6 = arg0.method22425((short) 16384);
			if (this.anObjectArrayArray1 == null) {
				this.anObjectArrayArray1 = new Object[local6][];
				this.aClass519ArrayArray1 = new Class519[local6][];
			}
			for (@Pc(22) int local22 = arg0.method22425((short) 16384); local22 != 255; local22 = arg0.method22425((short) 16384)) {
				@Pc(29) int local29 = arg0.method22425((short) 16384);
				@Pc(32) Class519[] local32 = new Class519[local29];
				for (@Pc(34) int local34 = 0; local34 < local29; local34++) {
					local32[local34] = (Class519) Class107.method18131(Class519.method30493(1698160951), arg0.method22644((byte) -19), -1915563430);
				}
				this.anObjectArrayArray1[local22] = Class166_Sub38.method16338(arg0, local32, 712117700);
				this.aClass519ArrayArray1[local22] = local32;
			}
		} else if (arg1 == 4) {
			this.anInt105 = arg0.method22608((short) 1719) * 586759731;
		}
	}
}
