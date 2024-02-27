package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adp")
public final class Class87 implements Interface13, Interface5 {

	@OriginalMember(owner = "client!adp", name = "m", descriptor = "Ljava/lang/String;")
	public String aString11;

	@OriginalMember(owner = "client!adp", name = "n", descriptor = "I")
	public int anInt265;

	@OriginalMember(owner = "client!adp", name = "e", descriptor = "Lclient!qw;")
	Class519 aClass519_3;

	@OriginalMember(owner = "client!adp", name = "k", descriptor = "Z")
	public boolean aBoolean32 = true;

	@OriginalMember(owner = "client!adp", name = "yv", descriptor = "(Lclient!yf;I)V")
	static void method1513(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class20.aBoolean10 ? 1 : 0;
	}

	@OriginalMember(owner = "client!adp", name = "<init>", descriptor = "()V")
	Class87() {
	}

	@OriginalMember(owner = "client!adp", name = "o", descriptor = "(Lclient!alw;I)V")
	void method1506(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			@Pc(8) char local8 = Class615.method32270(arg0.method22426(1220074706), (short) 150);
			this.aClass519_3 = Class519.method30500(local8, (byte) 8);
		} else if (arg1 == 2) {
			this.anInt265 = arg0.method22431(-118643075) * -2008172851;
		} else if (arg1 == 4) {
			this.aBoolean32 = false;
		} else if (arg1 == 5) {
			this.aString11 = arg0.method22439(1948836307);
		} else if (arg1 == 101) {
			this.aClass519_3 = (Class519) Class107.method18131(Class519.method30493(1432836651), arg0.method22644((byte) -127), -1915563430);
		}
	}

	@OriginalMember(owner = "client!adp", name = "u", descriptor = "(Lclient!alw;II)V")
	void method1507(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			@Pc(8) char local8 = Class615.method32270(arg0.method22426(1065706590), (short) 150);
			this.aClass519_3 = Class519.method30500(local8, (byte) 8);
		} else if (arg1 == 2) {
			this.anInt265 = arg0.method22431(-118643075) * -2008172851;
		} else if (arg1 == 4) {
			this.aBoolean32 = false;
		} else if (arg1 == 5) {
			this.aString11 = arg0.method22439(2147401139);
		} else if (arg1 == 101) {
			this.aClass519_3 = (Class519) Class107.method18131(Class519.method30493(1992894062), arg0.method22644((byte) -67), -1915563430);
		}
	}

	@OriginalMember(owner = "client!adp", name = "p", descriptor = "(I)Z")
	public boolean method1508(@OriginalArg(0) int arg0) {
		return this.aClass519_3 == Class519.aClass519_7;
	}

	@OriginalMember(owner = "client!adp", name = "n", descriptor = "(I)V")
	@Override
	public void method36834(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adp", name = "z", descriptor = "(IB)V")
	@Override
	public void method36694(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!adp", name = "d", descriptor = "(Lclient!alw;I)V")
	void method1509(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			@Pc(8) char local8 = Class615.method32270(arg0.method22426(1528387687), (short) 150);
			this.aClass519_3 = Class519.method30500(local8, (byte) 8);
		} else if (arg1 == 2) {
			this.anInt265 = arg0.method22431(-118643075) * -2008172851;
		} else if (arg1 == 4) {
			this.aBoolean32 = false;
		} else if (arg1 == 5) {
			this.aString11 = arg0.method22439(1933586620);
		} else if (arg1 == 101) {
			this.aClass519_3 = (Class519) Class107.method18131(Class519.method30493(1999805024), arg0.method22644((byte) -108), -1915563430);
		}
	}

	@OriginalMember(owner = "client!adp", name = "k", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36837(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method1507(arg0, local3, 1896597467);
		}
	}

	@OriginalMember(owner = "client!adp", name = "f", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36838(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method1507(arg0, local3, -599867724);
		}
	}

	@OriginalMember(owner = "client!adp", name = "w", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36839(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method1507(arg0, local3, -564003242);
		}
	}

	@OriginalMember(owner = "client!adp", name = "e", descriptor = "(Lclient!alw;B)V")
	@Override
	public void method36835(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method1507(arg0, local3, 1830975183);
		}
	}

	@OriginalMember(owner = "client!adp", name = "r", descriptor = "(I)V")
	@Override
	public void method36693(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adp", name = "v", descriptor = "(I)V")
	@Override
	public void method36692(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adp", name = "c", descriptor = "(Lclient!alw;I)V")
	void method1510(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			@Pc(8) char local8 = Class615.method32270(arg0.method22426(1255886065), (short) 150);
			this.aClass519_3 = Class519.method30500(local8, (byte) 8);
		} else if (arg1 == 2) {
			this.anInt265 = arg0.method22431(-118643075) * -2008172851;
		} else if (arg1 == 4) {
			this.aBoolean32 = false;
		} else if (arg1 == 5) {
			this.aString11 = arg0.method22439(2093566124);
		} else if (arg1 == 101) {
			this.aClass519_3 = (Class519) Class107.method18131(Class519.method30493(1366069052), arg0.method22644((byte) -101), -1915563430);
		}
	}

	@OriginalMember(owner = "client!adp", name = "l", descriptor = "()V")
	@Override
	public void method36840() {
	}

	@OriginalMember(owner = "client!adp", name = "m", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36836(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method1507(arg0, local3, 1392412839);
		}
	}

	@OriginalMember(owner = "client!adp", name = "s", descriptor = "(Lclient!alw;I)V")
	void method1511(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			@Pc(8) char local8 = Class615.method32270(arg0.method22426(2060430853), (short) 150);
			this.aClass519_3 = Class519.method30500(local8, (byte) 8);
		} else if (arg1 == 2) {
			this.anInt265 = arg0.method22431(-118643075) * -2008172851;
		} else if (arg1 == 4) {
			this.aBoolean32 = false;
		} else if (arg1 == 5) {
			this.aString11 = arg0.method22439(-180913270);
		} else if (arg1 == 101) {
			this.aClass519_3 = (Class519) Class107.method18131(Class519.method30493(1718461465), arg0.method22644((byte) -19), -1915563430);
		}
	}

	@OriginalMember(owner = "client!adp", name = "y", descriptor = "()Z")
	public boolean method1512() {
		return this.aClass519_3 == Class519.aClass519_7;
	}
}
