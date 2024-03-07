package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adp")
public class Class87 implements Interface13, Interface5 {

	@OriginalMember(owner = "client!adp", name = "m", descriptor = "Ljava/lang/String;")
	public String aString11;

	@OriginalMember(owner = "client!adp", name = "n", descriptor = "I")
	public int anInt265;

	@OriginalMember(owner = "client!adp", name = "e", descriptor = "Lclient!qw;")
	Class519 aClass519_3;

	@OriginalMember(owner = "client!adp", name = "k", descriptor = "Z")
	public boolean aBoolean32 = true;

	@OriginalMember(owner = "client!adp", name = "<init>", descriptor = "()V", line = 17)
	Class87() {
	}

	@OriginalMember(owner = "client!adp", name = "k", descriptor = "(Lclient!alw;)V", line = 21)
	@Override
	public void method36656(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method1507(arg0, local3, 1896597467);
		}
	}

	@OriginalMember(owner = "client!adp", name = "f", descriptor = "(Lclient!alw;)V", line = 21)
	@Override
	public void method36657(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method1507(arg0, local3, -599867724);
		}
	}

	@OriginalMember(owner = "client!adp", name = "w", descriptor = "(Lclient!alw;)V", line = 21)
	@Override
	public void method36658(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method1507(arg0, local3, -564003242);
		}
	}

	@OriginalMember(owner = "client!adp", name = "e", descriptor = "(Lclient!alw;B)V", line = 21)
	@Override
	public void method36654(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method1507(arg0, local3, 1830975183);
		}
	}

	@OriginalMember(owner = "client!adp", name = "m", descriptor = "(Lclient!alw;)V", line = 21)
	@Override
	public void method36655(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method1507(arg0, local3, 1392412839);
		}
	}

	@OriginalMember(owner = "client!adp", name = "o", descriptor = "(Lclient!alw;I)V", line = 28)
	void method1506(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			@Pc(8) char local8 = Class615.method32086(arg0.g1b(1220074706), (short) 150);
			this.aClass519_3 = Class519.method30317(local8, (byte) 8);
		} else if (arg1 == 2) {
			this.anInt265 = arg0.g4(-118643075) * -2008172851;
		} else if (arg1 == 4) {
			this.aBoolean32 = false;
		} else if (arg1 == 5) {
			this.aString11 = arg0.gjstr(1948836307);
		} else if (arg1 == 101) {
			this.aClass519_3 = (Class519) Class107.method18116(Class519.method30309(1432836651), arg0.gSmart1or2((byte) -127), -1915563430);
		}
	}

	@OriginalMember(owner = "client!adp", name = "u", descriptor = "(Lclient!alw;II)V", line = 28)
	void method1507(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			@Pc(8) char local8 = Class615.method32086(arg0.g1b(1065706590), (short) 150);
			this.aClass519_3 = Class519.method30317(local8, (byte) 8);
		} else if (arg1 == 2) {
			this.anInt265 = arg0.g4(-118643075) * -2008172851;
		} else if (arg1 == 4) {
			this.aBoolean32 = false;
		} else if (arg1 == 5) {
			this.aString11 = arg0.gjstr(2147401139);
		} else if (arg1 == 101) {
			this.aClass519_3 = (Class519) Class107.method18116(Class519.method30309(1992894062), arg0.gSmart1or2((byte) -67), -1915563430);
		}
	}

	@OriginalMember(owner = "client!adp", name = "d", descriptor = "(Lclient!alw;I)V", line = 28)
	void method1508(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			@Pc(8) char local8 = Class615.method32086(arg0.g1b(1528387687), (short) 150);
			this.aClass519_3 = Class519.method30317(local8, (byte) 8);
		} else if (arg1 == 2) {
			this.anInt265 = arg0.g4(-118643075) * -2008172851;
		} else if (arg1 == 4) {
			this.aBoolean32 = false;
		} else if (arg1 == 5) {
			this.aString11 = arg0.gjstr(1933586620);
		} else if (arg1 == 101) {
			this.aClass519_3 = (Class519) Class107.method18116(Class519.method30309(1999805024), arg0.gSmart1or2((byte) -108), -1915563430);
		}
	}

	@OriginalMember(owner = "client!adp", name = "c", descriptor = "(Lclient!alw;I)V", line = 28)
	void method1509(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			@Pc(8) char local8 = Class615.method32086(arg0.g1b(1255886065), (short) 150);
			this.aClass519_3 = Class519.method30317(local8, (byte) 8);
		} else if (arg1 == 2) {
			this.anInt265 = arg0.g4(-118643075) * -2008172851;
		} else if (arg1 == 4) {
			this.aBoolean32 = false;
		} else if (arg1 == 5) {
			this.aString11 = arg0.gjstr(2093566124);
		} else if (arg1 == 101) {
			this.aClass519_3 = (Class519) Class107.method18116(Class519.method30309(1366069052), arg0.gSmart1or2((byte) -101), -1915563430);
		}
	}

	@OriginalMember(owner = "client!adp", name = "s", descriptor = "(Lclient!alw;I)V", line = 28)
	void method1510(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			@Pc(8) char local8 = Class615.method32086(arg0.g1b(2060430853), (short) 150);
			this.aClass519_3 = Class519.method30317(local8, (byte) 8);
		} else if (arg1 == 2) {
			this.anInt265 = arg0.g4(-118643075) * -2008172851;
		} else if (arg1 == 4) {
			this.aBoolean32 = false;
		} else if (arg1 == 5) {
			this.aString11 = arg0.gjstr(-180913270);
		} else if (arg1 == 101) {
			this.aClass519_3 = (Class519) Class107.method18116(Class519.method30309(1718461465), arg0.gSmart1or2((byte) -19), -1915563430);
		}
	}

	@OriginalMember(owner = "client!adp", name = "p", descriptor = "(I)Z", line = 42)
	public boolean method1511(@OriginalArg(0) int arg0) {
		return this.aClass519_3 == Class519.aClass519_7;
	}

	@OriginalMember(owner = "client!adp", name = "y", descriptor = "()Z", line = 42)
	public boolean method1512() {
		return this.aClass519_3 == Class519.aClass519_7;
	}

	@OriginalMember(owner = "client!adp", name = "n", descriptor = "(I)V", line = 45)
	@Override
	public void method36653(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adp", name = "l", descriptor = "()V", line = 45)
	@Override
	public void method36659() {
	}

	@OriginalMember(owner = "client!adp", name = "z", descriptor = "(IB)V", line = 46)
	@Override
	public void method36513(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
	}

	@OriginalMember(owner = "client!adp", name = "r", descriptor = "(I)V", line = 46)
	@Override
	public void method36512(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adp", name = "v", descriptor = "(I)V", line = 46)
	@Override
	public void method36511(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adp", name = "yv", descriptor = "(Lclient!yf;I)V", line = 9331)
	static final void method1513(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class20.aBoolean10 ? 1 : 0;
	}
}
