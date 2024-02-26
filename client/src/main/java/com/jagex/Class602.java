package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uv")
public final class Class602 implements Interface11 {

	@OriginalMember(owner = "client!uv", name = "f", descriptor = "I")
	static final int anInt5381 = 70;

	@OriginalMember(owner = "client!uv", name = "e", descriptor = "I")
	public int anInt5382 = -1780288577;

	@OriginalMember(owner = "client!uv", name = "u", descriptor = "I")
	public int anInt5383 = 177273559;

	@OriginalMember(owner = "client!uv", name = "l", descriptor = "I")
	public int anInt5384 = 797217867;

	@OriginalMember(owner = "client!uv", name = "g", descriptor = "I")
	public int anInt5385 = 272562437;

	@OriginalMember(owner = "client!uv", name = "i", descriptor = "I")
	public int anInt5390 = -546295662;

	@OriginalMember(owner = "client!uv", name = "m", descriptor = "I")
	public int anInt5386 = -1815174835;

	@OriginalMember(owner = "client!uv", name = "o", descriptor = "I")
	public int anInt5387 = 1354403373;

	@OriginalMember(owner = "client!uv", name = "j", descriptor = "I")
	public int anInt5388 = -1340884715;

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "I")
	public int anInt5380 = 265731341;

	@OriginalMember(owner = "client!uv", name = "s", descriptor = "I")
	public int anInt5389 = 1283509401;

	@OriginalMember(owner = "client!uv", name = "k", descriptor = "I")
	public int anInt5391 = -1439653141;

	@OriginalMember(owner = "client!uv", name = "t", descriptor = "Lclient!uo;")
	final Class151 aClass151_1;

	@OriginalMember(owner = "client!uv", name = "aew", descriptor = "(Lclient!yp;B)V")
	static void method32122(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local13 & -1 - (0x1 << local23);
	}

	@OriginalMember(owner = "client!uv", name = "oy", descriptor = "(Lclient!yp;B)V")
	static void method32123(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2080360636);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class80_Sub38.method22944(local16, local22, arg0, 1035349492);
	}

	@OriginalMember(owner = "client!uv", name = "zg", descriptor = "(Lclient!yp;S)V")
	static void method32124(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		if (Class519.aString217 != null && Class519.aString217.equalsIgnoreCase(local13)) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 1;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!uv", name = "t", descriptor = "([Ljava/lang/String;[II)V")
	public static void method32125(@OriginalArg(0) String[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		Class614.method32266(arg0, arg1, 0, arg0.length - 1, 1732848377);
	}

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(ILclient!uo;)V")
	Class602(@OriginalArg(0) int arg0, @OriginalArg(1) Class151 arg1) {
		this.aClass151_1 = arg1;
	}

	@OriginalMember(owner = "client!uv", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	public void method37009(@OriginalArg(0) Class80_Sub36 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(-300037459);
			if (local3 == 0) {
				return;
			}
			this.method32111(arg0, local3, (byte) -101);
		}
	}

	@OriginalMember(owner = "client!uv", name = "i", descriptor = "(Lclient!di;II)V")
	void method32110(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class480 local3 = this.aClass151_1.aClass480_37;
		if (arg1 >= 0 && this.aClass151_1.aClass243_22.method26282((long) arg1) == null && local3.method29945(arg1, (byte) 1)) {
			@Pc(21) Class109 local21 = Class212.method25823(local3, arg1);
			this.aClass151_1.aClass243_22.method26253(arg0.method20906(local21, true), (long) arg1);
		}
	}

	@OriginalMember(owner = "client!uv", name = "l", descriptor = "(Lclient!ald;IB)V")
	void method32111(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (arg1 == 1) {
			arg0.method23178((byte) -112);
		} else if (arg1 == 2) {
			this.anInt5382 = arg0.method23362(-2039152839) * -731230911;
		} else if (arg1 == 3) {
			this.anInt5383 = arg0.method23362(-1220596237) * -1835192791;
		} else if (arg1 == 4) {
			this.anInt5384 = 0;
		} else if (arg1 == 5) {
			this.anInt5390 = arg0.method23178((byte) -88) * -498657629;
		} else if (arg1 == 6) {
			arg0.method23362(111230741);
		} else if (arg1 == 7) {
			this.anInt5386 = arg0.method23210((byte) 23) * 1815174835;
		} else if (arg1 == 8) {
			this.anInt5387 = arg0.method23210((byte) 31) * -1354403373;
		} else if (arg1 == 9) {
			this.anInt5388 = arg0.method23210((byte) 127) * 1340884715;
		} else if (arg1 == 10) {
			this.anInt5380 = arg0.method23210((byte) 86) * -265731341;
		} else if (arg1 == 11) {
			this.anInt5384 = arg0.method23178((byte) -49) * -797217867;
		} else if (arg1 == 12) {
			this.anInt5389 = arg0.method23210((byte) 91) * -1283509401;
		} else if (arg1 == 13) {
			this.anInt5391 = arg0.method23210((byte) 30) * 1439653141;
		}
	}

	@OriginalMember(owner = "client!uv", name = "g", descriptor = "(Lclient!di;II)Lclient!cm;")
	public Class99 method32112(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 < 0) {
			return null;
		}
		@Pc(11) Class99 local11 = (Class99) this.aClass151_1.aClass243_22.method26282((long) arg1);
		if (local11 == null) {
			this.method32114(arg0, -46412781);
			local11 = (Class99) this.aClass151_1.aClass243_22.method26282((long) arg1);
		}
		return local11;
	}

	@OriginalMember(owner = "client!uv", name = "s", descriptor = "(Lclient!di;I)Lclient!cm;")
	public Class99 method32113(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 0) {
			return null;
		}
		@Pc(11) Class99 local11 = (Class99) this.aClass151_1.aClass243_22.method26282((long) arg1);
		if (local11 == null) {
			this.method32114(arg0, -460106006);
			local11 = (Class99) this.aClass151_1.aClass243_22.method26282((long) arg1);
		}
		return local11;
	}

	@OriginalMember(owner = "client!uv", name = "t", descriptor = "(Lclient!ald;I)V")
	@Override
	public void method37006(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(-1360286848);
			if (local3 == 0) {
				return;
			}
			this.method32111(arg0, local3, (byte) -52);
		}
	}

	@OriginalMember(owner = "client!uv", name = "f", descriptor = "(B)V")
	@Override
	public void method37007(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!uv", name = "m", descriptor = "(Lclient!di;I)V")
	void method32114(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		this.method32110(arg0, this.anInt5386 * -832929669, 1234802501);
		this.method32110(arg0, this.anInt5387 * 204279387, -1954539376);
		this.method32110(arg0, this.anInt5388 * -912707133, -391896217);
		this.method32110(arg0, this.anInt5380 * -1013144005, -2055613608);
		this.method32110(arg0, this.anInt5389 * -1444857769, 959465110);
		this.method32110(arg0, this.anInt5391 * 690227773, 294402903);
	}

	@OriginalMember(owner = "client!uv", name = "o", descriptor = "(Lclient!ald;I)V")
	void method32115(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method23178((byte) -61);
		} else if (arg1 == 2) {
			this.anInt5382 = arg0.method23362(-1295541846) * -731230911;
		} else if (arg1 == 3) {
			this.anInt5383 = arg0.method23362(253627531) * -1835192791;
		} else if (arg1 == 4) {
			this.anInt5384 = 0;
		} else if (arg1 == 5) {
			this.anInt5390 = arg0.method23178((byte) -73) * -498657629;
		} else if (arg1 == 6) {
			arg0.method23362(-1428939524);
		} else if (arg1 == 7) {
			this.anInt5386 = arg0.method23210((byte) 45) * 1815174835;
		} else if (arg1 == 8) {
			this.anInt5387 = arg0.method23210((byte) 58) * -1354403373;
		} else if (arg1 == 9) {
			this.anInt5388 = arg0.method23210((byte) 38) * 1340884715;
		} else if (arg1 == 10) {
			this.anInt5380 = arg0.method23210((byte) 48) * -265731341;
		} else if (arg1 == 11) {
			this.anInt5384 = arg0.method23178((byte) -27) * -797217867;
		} else if (arg1 == 12) {
			this.anInt5389 = arg0.method23210((byte) 87) * -1283509401;
		} else if (arg1 == 13) {
			this.anInt5391 = arg0.method23210((byte) 117) * 1439653141;
		}
	}

	@OriginalMember(owner = "client!uv", name = "j", descriptor = "(Lclient!ald;I)V")
	void method32116(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			arg0.method23178((byte) -42);
		} else if (arg1 == 2) {
			this.anInt5382 = arg0.method23362(-1194578739) * -731230911;
		} else if (arg1 == 3) {
			this.anInt5383 = arg0.method23362(707767137) * -1835192791;
		} else if (arg1 == 4) {
			this.anInt5384 = 0;
		} else if (arg1 == 5) {
			this.anInt5390 = arg0.method23178((byte) -13) * -498657629;
		} else if (arg1 == 6) {
			arg0.method23362(-1697468944);
		} else if (arg1 == 7) {
			this.anInt5386 = arg0.method23210((byte) 28) * 1815174835;
		} else if (arg1 == 8) {
			this.anInt5387 = arg0.method23210((byte) 85) * -1354403373;
		} else if (arg1 == 9) {
			this.anInt5388 = arg0.method23210((byte) 31) * 1340884715;
		} else if (arg1 == 10) {
			this.anInt5380 = arg0.method23210((byte) 47) * -265731341;
		} else if (arg1 == 11) {
			this.anInt5384 = arg0.method23178((byte) -17) * -797217867;
		} else if (arg1 == 12) {
			this.anInt5389 = arg0.method23210((byte) 37) * -1283509401;
		} else if (arg1 == 13) {
			this.anInt5391 = arg0.method23210((byte) 94) * 1439653141;
		}
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Lclient!di;I)Lclient!cm;")
	public Class99 method32117(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 0) {
			return null;
		}
		@Pc(11) Class99 local11 = (Class99) this.aClass151_1.aClass243_22.method26282((long) arg1);
		if (local11 == null) {
			this.method32114(arg0, -164879375);
			local11 = (Class99) this.aClass151_1.aClass243_22.method26282((long) arg1);
		}
		return local11;
	}

	@OriginalMember(owner = "client!uv", name = "e", descriptor = "()V")
	@Override
	public void method37008() {
	}

	@OriginalMember(owner = "client!uv", name = "k", descriptor = "(Lclient!di;I)Lclient!cm;")
	public Class99 method32118(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 0) {
			return null;
		}
		@Pc(11) Class99 local11 = (Class99) this.aClass151_1.aClass243_22.method26282((long) arg1);
		if (local11 == null) {
			this.method32114(arg0, 1729970665);
			local11 = (Class99) this.aClass151_1.aClass243_22.method26282((long) arg1);
		}
		return local11;
	}

	@OriginalMember(owner = "client!uv", name = "x", descriptor = "(Lclient!di;I)V")
	void method32119(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class480 local3 = this.aClass151_1.aClass480_37;
		if (arg1 >= 0 && this.aClass151_1.aClass243_22.method26282((long) arg1) == null && local3.method29945(arg1, (byte) 1)) {
			@Pc(21) Class109 local21 = Class212.method25823(local3, arg1);
			this.aClass151_1.aClass243_22.method26253(arg0.method20906(local21, true), (long) arg1);
		}
	}

	@OriginalMember(owner = "client!uv", name = "w", descriptor = "(Lclient!di;)V")
	void method32120(@OriginalArg(0) Class102 arg0) {
		this.method32110(arg0, this.anInt5386 * -832929669, -1197989532);
		this.method32110(arg0, this.anInt5387 * 204279387, 872741270);
		this.method32110(arg0, this.anInt5388 * -912707133, 758947180);
		this.method32110(arg0, this.anInt5380 * -1013144005, 1703244151);
		this.method32110(arg0, this.anInt5389 * -1444857769, -410901637);
		this.method32110(arg0, this.anInt5391 * 690227773, -505405964);
	}

	@OriginalMember(owner = "client!uv", name = "r", descriptor = "(Lclient!di;)V")
	void method32121(@OriginalArg(0) Class102 arg0) {
		this.method32110(arg0, this.anInt5386 * -832929669, 339141434);
		this.method32110(arg0, this.anInt5387 * 204279387, -226177215);
		this.method32110(arg0, this.anInt5388 * -912707133, -517187412);
		this.method32110(arg0, this.anInt5380 * -1013144005, -1718384246);
		this.method32110(arg0, this.anInt5389 * -1444857769, -1160830392);
		this.method32110(arg0, this.anInt5391 * 690227773, 736796658);
	}
}
