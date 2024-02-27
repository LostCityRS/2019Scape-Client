package com.jagex;

import java.util.HashMap;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adl")
public final class Class85 implements Interface13, Interface5 {

	@OriginalMember(owner = "client!adl", name = "e", descriptor = "I")
	public int anInt260 = 0;

	@OriginalMember(owner = "client!adl", name = "n", descriptor = "I")
	public int anInt261 = 0;

	@OriginalMember(owner = "client!adl", name = "m", descriptor = "I")
	public int anInt259 = -1468389376;

	@OriginalMember(owner = "client!adl", name = "k", descriptor = "I")
	public int anInt262 = -1478424576;

	@OriginalMember(owner = "client!adl", name = "j", descriptor = "([Lclient!add;S)Ljava/util/Map;")
	public static Map method1445(@OriginalArg(0) Class79_Sub1[] arg0, @OriginalArg(1) short arg1) {
		if (arg0 == null || arg0.length == 0) {
			return null;
		}
		@Pc(11) HashMap local11 = new HashMap();
		@Pc(13) Class79_Sub1[] local13 = arg0;
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(23) Class79_Sub1 local23 = local13[local15];
			local11.put(local23.aClass138_3, local23);
		}
		return local11;
	}

	@OriginalMember(owner = "client!adl", name = "<init>", descriptor = "()V")
	Class85() {
	}

	@OriginalMember(owner = "client!adl", name = "f", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36838(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method1441(arg0, local3, -662244246);
		}
	}

	@OriginalMember(owner = "client!adl", name = "e", descriptor = "(Lclient!alw;B)V")
	@Override
	public void method36835(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method1441(arg0, local3, -1685563223);
		}
	}

	@OriginalMember(owner = "client!adl", name = "u", descriptor = "(Lclient!alw;II)V")
	void method1441(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.anInt260 = arg0.method22425((short) 16384) * 902203875;
		} else if (arg1 == 2) {
			this.anInt262 = arg0.method22427(-1434290800) * -686490591;
		} else if (arg1 == 3) {
			this.anInt259 = arg0.method22427(-1434290800) * -59437243;
		} else if (arg1 == 4) {
			this.anInt261 = arg0.method22494((byte) -99) * -1378844945;
		}
	}

	@OriginalMember(owner = "client!adl", name = "z", descriptor = "(IB)V")
	@Override
	public void method36694(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!adl", name = "w", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36839(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method1441(arg0, local3, -1446094756);
		}
	}

	@OriginalMember(owner = "client!adl", name = "m", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36836(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method1441(arg0, local3, -1769124415);
		}
	}

	@OriginalMember(owner = "client!adl", name = "k", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36837(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method1441(arg0, local3, -1119649340);
		}
	}

	@OriginalMember(owner = "client!adl", name = "l", descriptor = "()V")
	@Override
	public void method36840() {
	}

	@OriginalMember(owner = "client!adl", name = "r", descriptor = "(I)V")
	@Override
	public void method36693(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adl", name = "c", descriptor = "(Lclient!alw;I)V")
	void method1442(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt260 = arg0.method22425((short) 16384) * 902203875;
		} else if (arg1 == 2) {
			this.anInt262 = arg0.method22427(-1434290800) * -686490591;
		} else if (arg1 == 3) {
			this.anInt259 = arg0.method22427(-1434290800) * -59437243;
		} else if (arg1 == 4) {
			this.anInt261 = arg0.method22494((byte) -11) * -1378844945;
		}
	}

	@OriginalMember(owner = "client!adl", name = "v", descriptor = "(I)V")
	@Override
	public void method36692(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adl", name = "n", descriptor = "(I)V")
	@Override
	public void method36834(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adl", name = "d", descriptor = "(Lclient!alw;I)V")
	void method1443(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt260 = arg0.method22425((short) 16384) * 902203875;
		} else if (arg1 == 2) {
			this.anInt262 = arg0.method22427(-1434290800) * -686490591;
		} else if (arg1 == 3) {
			this.anInt259 = arg0.method22427(-1434290800) * -59437243;
		} else if (arg1 == 4) {
			this.anInt261 = arg0.method22494((byte) -65) * -1378844945;
		}
	}

	@OriginalMember(owner = "client!adl", name = "p", descriptor = "(Lclient!alw;I)V")
	void method1444(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt260 = arg0.method22425((short) 16384) * 902203875;
		} else if (arg1 == 2) {
			this.anInt262 = arg0.method22427(-1434290800) * -686490591;
		} else if (arg1 == 3) {
			this.anInt259 = arg0.method22427(-1434290800) * -59437243;
		} else if (arg1 == 4) {
			this.anInt261 = arg0.method22494((byte) -72) * -1378844945;
		}
	}
}
