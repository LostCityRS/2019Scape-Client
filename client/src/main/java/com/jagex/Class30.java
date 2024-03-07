package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abc")
public class Class30 implements Interface13, Interface5 {

	@OriginalMember(owner = "client!abc", name = "hz", descriptor = "Lclient!aor;")
	public static Class32_Sub16 aClass32_Sub16_1;

	@OriginalMember(owner = "client!abc", name = "n", descriptor = "[[Lclient!qw;")
	Class519[][] aClass519ArrayArray1;

	@OriginalMember(owner = "client!abc", name = "e", descriptor = "[[Ljava/lang/Object;")
	Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!abc", name = "m", descriptor = "I")
	public int anInt105;

	@OriginalMember(owner = "client!abc", name = "<init>", descriptor = "()V", line = 16)
	Class30() {
	}

	@OriginalMember(owner = "client!abc", name = "m", descriptor = "(Lclient!alw;)V", line = 20)
	@Override
	public void method36655(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method622(arg0, local3, -261418109);
		}
	}

	@OriginalMember(owner = "client!abc", name = "k", descriptor = "(Lclient!alw;)V", line = 20)
	@Override
	public void method36656(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method622(arg0, local3, -193447756);
		}
	}

	@OriginalMember(owner = "client!abc", name = "w", descriptor = "(Lclient!alw;)V", line = 20)
	@Override
	public void method36658(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method622(arg0, local3, -426344539);
		}
	}

	@OriginalMember(owner = "client!abc", name = "e", descriptor = "(Lclient!alw;B)V", line = 20)
	@Override
	public void method36654(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method622(arg0, local3, -1227236892);
		}
	}

	@OriginalMember(owner = "client!abc", name = "f", descriptor = "(Lclient!alw;)V", line = 20)
	@Override
	public void method36657(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method622(arg0, local3, 365861905);
		}
	}

	@OriginalMember(owner = "client!abc", name = "u", descriptor = "(II)[Ljava/lang/Object;", line = 27)
	public Object[] method617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.anObjectArrayArray1 == null ? null : this.anObjectArrayArray1[arg0];
	}

	@OriginalMember(owner = "client!abc", name = "c", descriptor = "(I)[Ljava/lang/Object;", line = 27)
	public Object[] method618(@OriginalArg(0) int arg0) {
		return this.anObjectArrayArray1 == null ? null : this.anObjectArrayArray1[arg0];
	}

	@OriginalMember(owner = "client!abc", name = "d", descriptor = "(I)[Ljava/lang/Object;", line = 27)
	public Object[] method619(@OriginalArg(0) int arg0) {
		return this.anObjectArrayArray1 == null ? null : this.anObjectArrayArray1[arg0];
	}

	@OriginalMember(owner = "client!abc", name = "o", descriptor = "(Lclient!alw;I)V", line = 32)
	void method620(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 3) {
			@Pc(6) int local6 = arg0.g1((short) 16384);
			if (this.anObjectArrayArray1 == null) {
				this.anObjectArrayArray1 = new Object[local6][];
				this.aClass519ArrayArray1 = new Class519[local6][];
			}
			for (@Pc(22) int local22 = arg0.g1((short) 16384); local22 != 255; local22 = arg0.g1((short) 16384)) {
				@Pc(29) int local29 = arg0.g1((short) 16384);
				@Pc(32) Class519[] local32 = new Class519[local29];
				for (@Pc(34) int local34 = 0; local34 < local29; local34++) {
					local32[local34] = (Class519) Class107.method18116(Class519.method30309(1543250623), arg0.gSmart1or2((byte) -33), -1915563430);
				}
				this.anObjectArrayArray1[local22] = Class166_Sub38.method16323(arg0, local32, -932100834);
				this.aClass519ArrayArray1[local22] = local32;
			}
		} else if (arg1 == 4) {
			this.anInt105 = arg0.gVarInt2((short) 6058) * 586759731;
		}
	}

	@OriginalMember(owner = "client!abc", name = "s", descriptor = "(Lclient!alw;I)V", line = 32)
	void method621(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 3) {
			@Pc(6) int local6 = arg0.g1((short) 16384);
			if (this.anObjectArrayArray1 == null) {
				this.anObjectArrayArray1 = new Object[local6][];
				this.aClass519ArrayArray1 = new Class519[local6][];
			}
			for (@Pc(22) int local22 = arg0.g1((short) 16384); local22 != 255; local22 = arg0.g1((short) 16384)) {
				@Pc(29) int local29 = arg0.g1((short) 16384);
				@Pc(32) Class519[] local32 = new Class519[local29];
				for (@Pc(34) int local34 = 0; local34 < local29; local34++) {
					local32[local34] = (Class519) Class107.method18116(Class519.method30309(1860785111), arg0.gSmart1or2((byte) -58), -1915563430);
				}
				this.anObjectArrayArray1[local22] = Class166_Sub38.method16323(arg0, local32, -486098583);
				this.aClass519ArrayArray1[local22] = local32;
			}
		} else if (arg1 == 4) {
			this.anInt105 = arg0.gVarInt2((short) -6368) * 586759731;
		}
	}

	@OriginalMember(owner = "client!abc", name = "p", descriptor = "(Lclient!alw;II)V", line = 32)
	void method622(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 3) {
			@Pc(6) int local6 = arg0.g1((short) 16384);
			if (this.anObjectArrayArray1 == null) {
				this.anObjectArrayArray1 = new Object[local6][];
				this.aClass519ArrayArray1 = new Class519[local6][];
			}
			for (@Pc(22) int local22 = arg0.g1((short) 16384); local22 != 255; local22 = arg0.g1((short) 16384)) {
				@Pc(29) int local29 = arg0.g1((short) 16384);
				@Pc(32) Class519[] local32 = new Class519[local29];
				for (@Pc(34) int local34 = 0; local34 < local29; local34++) {
					local32[local34] = (Class519) Class107.method18116(Class519.method30309(1688759182), arg0.gSmart1or2((byte) -119), -1915563430);
				}
				this.anObjectArrayArray1[local22] = Class166_Sub38.method16323(arg0, local32, -1452468992);
				this.aClass519ArrayArray1[local22] = local32;
			}
		} else if (arg1 == 4) {
			this.anInt105 = arg0.gVarInt2((short) -9339) * 586759731;
		}
	}

	@OriginalMember(owner = "client!abc", name = "y", descriptor = "(Lclient!alw;I)V", line = 32)
	void method623(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 3) {
			@Pc(6) int local6 = arg0.g1((short) 16384);
			if (this.anObjectArrayArray1 == null) {
				this.anObjectArrayArray1 = new Object[local6][];
				this.aClass519ArrayArray1 = new Class519[local6][];
			}
			for (@Pc(22) int local22 = arg0.g1((short) 16384); local22 != 255; local22 = arg0.g1((short) 16384)) {
				@Pc(29) int local29 = arg0.g1((short) 16384);
				@Pc(32) Class519[] local32 = new Class519[local29];
				for (@Pc(34) int local34 = 0; local34 < local29; local34++) {
					local32[local34] = (Class519) Class107.method18116(Class519.method30309(1865591604), arg0.gSmart1or2((byte) -41), -1915563430);
				}
				this.anObjectArrayArray1[local22] = Class166_Sub38.method16323(arg0, local32, -1802627876);
				this.aClass519ArrayArray1[local22] = local32;
			}
		} else if (arg1 == 4) {
			this.anInt105 = arg0.gVarInt2((short) -8336) * 586759731;
		}
	}

	@OriginalMember(owner = "client!abc", name = "q", descriptor = "(Lclient!alw;I)V", line = 32)
	void method624(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 3) {
			@Pc(6) int local6 = arg0.g1((short) 16384);
			if (this.anObjectArrayArray1 == null) {
				this.anObjectArrayArray1 = new Object[local6][];
				this.aClass519ArrayArray1 = new Class519[local6][];
			}
			for (@Pc(22) int local22 = arg0.g1((short) 16384); local22 != 255; local22 = arg0.g1((short) 16384)) {
				@Pc(29) int local29 = arg0.g1((short) 16384);
				@Pc(32) Class519[] local32 = new Class519[local29];
				for (@Pc(34) int local34 = 0; local34 < local29; local34++) {
					local32[local34] = (Class519) Class107.method18116(Class519.method30309(1507909282), arg0.gSmart1or2((byte) -83), -1915563430);
				}
				this.anObjectArrayArray1[local22] = Class166_Sub38.method16323(arg0, local32, -1626946471);
				this.aClass519ArrayArray1[local22] = local32;
			}
		} else if (arg1 == 4) {
			this.anInt105 = arg0.gVarInt2((short) -6125) * 586759731;
		}
	}

	@OriginalMember(owner = "client!abc", name = "x", descriptor = "(Lclient!alw;I)V", line = 32)
	void method625(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 3) {
			@Pc(6) int local6 = arg0.g1((short) 16384);
			if (this.anObjectArrayArray1 == null) {
				this.anObjectArrayArray1 = new Object[local6][];
				this.aClass519ArrayArray1 = new Class519[local6][];
			}
			for (@Pc(22) int local22 = arg0.g1((short) 16384); local22 != 255; local22 = arg0.g1((short) 16384)) {
				@Pc(29) int local29 = arg0.g1((short) 16384);
				@Pc(32) Class519[] local32 = new Class519[local29];
				for (@Pc(34) int local34 = 0; local34 < local29; local34++) {
					local32[local34] = (Class519) Class107.method18116(Class519.method30309(1698160951), arg0.gSmart1or2((byte) -19), -1915563430);
				}
				this.anObjectArrayArray1[local22] = Class166_Sub38.method16323(arg0, local32, 712117700);
				this.aClass519ArrayArray1[local22] = local32;
			}
		} else if (arg1 == 4) {
			this.anInt105 = arg0.gVarInt2((short) 1719) * 586759731;
		}
	}

	@OriginalMember(owner = "client!abc", name = "n", descriptor = "(I)V", line = 56)
	@Override
	public void method36653(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!abc", name = "l", descriptor = "()V", line = 56)
	@Override
	public void method36659() {
	}

	@OriginalMember(owner = "client!abc", name = "r", descriptor = "(I)V", line = 57)
	@Override
	public void method36512(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!abc", name = "z", descriptor = "(IB)V", line = 57)
	@Override
	public void method36513(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!abc", name = "v", descriptor = "(I)V", line = 57)
	@Override
	public void method36511(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!abc", name = "d", descriptor = "(ZI)V", line = 244)
	static void method626(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		Class168.aString61 = Class168.aString61.trim();
		Class168.anInt2443 = 0;
		if (Class168.aString61.length() == 0) {
			Class168.anInt2445 = 0;
			return;
		}
		Class314.method26939("--> " + Class168.aString61, -2007571843);
		Class32_Sub7.method16823(Class168.aString61, false, arg0, (byte) 3);
		if (arg0) {
			Class168.anInt2445 = Class168.aString61.length() * -1799421149;
		} else {
			Class168.anInt2445 = 0;
			Class168.aString61 = "";
		}
	}

	@OriginalMember(owner = "client!abc", name = "go", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 6056)
	static final void method627(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt5891 -= -725861497;
		@Pc(13) int local13 = arg2.anIntArray519[arg2.anInt5891 * -1497248091];
		@Pc(24) short local24 = (short) arg2.anIntArray519[arg2.anInt5891 * -1497248091 + 1];
		@Pc(35) short local35 = (short) arg2.anIntArray519[arg2.anInt5891 * -1497248091 + 2];
		if (local13 < 0 || local13 >= 5) {
			return;
		}
		arg0.method26917(local13, local24, local35, -645249360);
		Class354.method27694(arg0, -1174743804);
		if (arg0.anInt3970 * 532402067 == -1 && !arg1.aBoolean708) {
			Class41.method816(arg0.anInt3953 * -1549590237, local13, 1469693779);
		}
	}
}
