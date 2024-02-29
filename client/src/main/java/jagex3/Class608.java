package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class608 implements Interface13 {

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
	public static final int anInt5722 = -1;

	@OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
	public static final int anInt5725 = 0;

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
	public static final int anInt5726 = 1;

	@OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
	static final int anInt5727 = 16777215;

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
	static final int anInt5728 = 70;

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "[I")
	public int[] anIntArray489;

	@OriginalMember(owner = "client!vb", name = "u", descriptor = "Z")
	public boolean aBoolean836 = false;

	@OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
	public int anInt5740 = -903627193;

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
	public int anInt5730 = 669312675;

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
	public int anInt5731 = 1992503102;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
	int anInt5729 = -1766142217;

	@OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
	int anInt5732 = -1507387017;

	@OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
	int anInt5733 = -199719183;

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
	int anInt5734 = -729089625;

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "I")
	public int anInt5735 = 0;

	@OriginalMember(owner = "client!vb", name = "y", descriptor = "I")
	public int anInt5737 = 0;

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
	public int anInt5736 = -2128038707;

	@OriginalMember(owner = "client!vb", name = "x", descriptor = "Ljava/lang/String;")
	String aString241 = "";

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
	public int anInt5739 = 2079109471;

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
	public int anInt5724 = 0;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
	public int anInt5738 = 0;

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
	public int anInt5723 = 0;

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
	int anInt5741 = 1319444603;

	@OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
	int anInt5742 = 1550157383;

	@OriginalMember(owner = "client!vb", name = "ae", descriptor = "I")
	int anInt5743 = 319020291;

	@OriginalMember(owner = "client!vb", name = "ag", descriptor = "I")
	int anInt5744 = -59333593;

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "Lclient!vl;")
	final Class152 aClass152_1;

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "Lclient!ao;")
	final Interface11 anInterface11_13;

	@OriginalMember(owner = "client!vb", name = "nt", descriptor = "(Lclient!yf;B)V")
	static void method32139(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 1973597293);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class157.method14265(local16, local22, arg0, 831841374);
	}

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "(FFI)F")
	public static float method32140(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2) {
		@Pc(5) double local5 = Math.atan2((double) arg0, (double) arg1);
		if (local5 < 0.0D) {
			local5 = local5 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local5;
	}

	@OriginalMember(owner = "client!vb", name = "es", descriptor = "(IB)Z")
	static boolean method32141(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return arg0 == 10 || arg0 == 6 || arg0 == 3 || arg0 == 16 || arg0 == 8;
	}

	@OriginalMember(owner = "client!vb", name = "gm", descriptor = "(B)V")
	static void method32142(@OriginalArg(0) byte arg0) {
		@Pc(3) int local3 = Class174.anInt3293 * -1081967415;
		@Pc(5) int[] local5 = Class174.anIntArray278;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(16) Class132_Sub1_Sub1_Sub1_Sub2 local16 = client.aClass132_Sub1_Sub1_Sub1_Sub2Array1[local5[local7]];
			if (local16 != null) {
				Class233.method25825(local16, false, (byte) -63);
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "(B)I")
	public static int method32143(@OriginalArg(0) byte arg0) {
		return Class522.aTwitchEventLiveStreams1 == null || Class625.anInt5858 * 110744317 >= Class522.aTwitchEventLiveStreams1.anInt3603 - 1 ? -1 : (Class625.anInt5858 += -2118100395) * 110744317;
	}

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(ILclient!vl;Lclient!ao;)V")
	Class608(@OriginalArg(0) int arg0, @OriginalArg(1) Class152 arg1, @OriginalArg(2) Interface11 arg2) {
		this.aClass152_1 = arg1;
		this.anInterface11_13 = arg2;
	}

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "(Lclient!dh;)Lclient!cm;")
	public Class100 method32118(@OriginalArg(0) Class104 arg0) {
		if (this.anInt5733 * -183740945 < 0) {
			return null;
		}
		@Pc(17) Class100 local17 = (Class100) this.aClass152_1.aClass240_21.method25932((long) (this.anInt5733 * -183740945));
		if (local17 == null) {
			this.method32124(arg0, -1568063096);
			local17 = (Class100) this.aClass152_1.aClass240_21.method25932((long) (this.anInt5733 * -183740945));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "(Lclient!alw;B)V")
	@Override
	public void method36835(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method32125(arg0, local3, -679950115);
		}
	}

	@OriginalMember(owner = "client!vb", name = "z", descriptor = "(Lclient!em;Lclient!ep;I)Lclient!vb;")
	public Class608 method32119(@OriginalArg(0) Interface21 arg0, @OriginalArg(1) Interface23 arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int local1 = -1;
		if (this.anIntArray489 == null) {
			return this;
		} else if (arg0 == null || arg1 == null) {
			return null;
		} else {
			if (this.anInt5741 * 878854477 != -1) {
				@Pc(27) Class379 local27 = arg0.method28134(this.anInt5741 * 878854477, (byte) -47);
				if (local27 != null) {
					local1 = arg1.method33635(local27, 1545755568);
				}
			} else if (this.anInt5742 * 2096741513 != -1) {
				@Pc(51) Class108 local51 = arg0.method28135(Class138.aClass138_65, this.anInt5742 * 2096741513, -1497248091);
				if (local51 != null) {
					local1 = arg1.method33636(local51, 830476702);
				}
			}
			if (local1 >= 0 && local1 < this.anIntArray489.length - 1) {
				return this.anIntArray489[local1] == -1 ? null : (Class608) this.anInterface11_13.method18273(this.anIntArray489[local1], 1614628704);
			} else {
				@Pc(77) int local77 = this.anIntArray489[this.anIntArray489.length - 1];
				return local77 == -1 ? null : (Class608) this.anInterface11_13.method18273(local77, -398870355);
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "p", descriptor = "(II)Ljava/lang/String;")
	public String method32120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(2) String local2 = this.aString241;
		@Pc(14) int local14 = arg0 * this.anInt5743 * 455308715 / (this.anInt5744 * -1736668265);
		while (true) {
			@Pc(18) int local18 = local2.indexOf("%1");
			if (local18 < 0) {
				return local2;
			}
			local2 = local2.substring(0, local18) + Class107.method18132(local14, false, -449951645) + local2.substring(local18 + 2);
		}
	}

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36836(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method32125(arg0, local3, -145894470);
		}
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(Lclient!dh;I)Lclient!cm;")
	public Class100 method32121(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5732 * -2131988551 < 0) {
			return null;
		}
		@Pc(17) Class100 local17 = (Class100) this.aClass152_1.aClass240_21.method25932((long) (this.anInt5732 * -2131988551));
		if (local17 == null) {
			this.method32124(arg0, 1387012624);
			local17 = (Class100) this.aClass152_1.aClass240_21.method25932((long) (this.anInt5732 * -2131988551));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vb", name = "r", descriptor = "(Lclient!dh;I)Lclient!cm;")
	public Class100 method32122(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5733 * -183740945 < 0) {
			return null;
		}
		@Pc(17) Class100 local17 = (Class100) this.aClass152_1.aClass240_21.method25932((long) (this.anInt5733 * -183740945));
		if (local17 == null) {
			this.method32124(arg0, -802502247);
			local17 = (Class100) this.aClass152_1.aClass240_21.method25932((long) (this.anInt5733 * -183740945));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vb", name = "v", descriptor = "(Lclient!dh;B)Lclient!cm;")
	public Class100 method32123(@OriginalArg(0) Class104 arg0, @OriginalArg(1) byte arg1) {
		if (this.anInt5734 * 202498537 < 0) {
			return null;
		}
		@Pc(17) Class100 local17 = (Class100) this.aClass152_1.aClass240_21.method25932((long) (this.anInt5734 * 202498537));
		if (local17 == null) {
			this.method32124(arg0, -510801439);
			local17 = (Class100) this.aClass152_1.aClass240_21.method25932((long) (this.anInt5734 * 202498537));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "(Lclient!dh;I)V")
	void method32124(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class497 local3 = this.aClass152_1.aClass497_45;
		@Pc(33) Class105 local33;
		if (this.anInt5729 * -804410055 >= 0 && this.aClass152_1.aClass240_21.method25932((long) (this.anInt5729 * -804410055)) == null && local3.method30235(this.anInt5729 * -804410055, -512225963)) {
			local33 = Class203.method24662(local3, this.anInt5729 * -804410055);
			this.aClass152_1.aClass240_21.method25923(arg0.method20511(local33, true), (long) (this.anInt5729 * -804410055));
		}
		if (this.anInt5732 * -2131988551 >= 0 && this.aClass152_1.aClass240_21.method25932((long) (this.anInt5732 * -2131988551)) == null && local3.method30235(this.anInt5732 * -2131988551, -512225963)) {
			local33 = Class203.method24662(local3, this.anInt5732 * -2131988551);
			this.aClass152_1.aClass240_21.method25923(arg0.method20511(local33, true), (long) (this.anInt5732 * -2131988551));
		}
		if (this.anInt5733 * -183740945 >= 0 && this.aClass152_1.aClass240_21.method25932((long) (this.anInt5733 * -183740945)) == null && local3.method30235(this.anInt5733 * -183740945, -512225963)) {
			local33 = Class203.method24662(local3, this.anInt5733 * -183740945);
			this.aClass152_1.aClass240_21.method25923(arg0.method20511(local33, true), (long) (this.anInt5733 * -183740945));
		}
		if (this.anInt5734 * 202498537 >= 0 && this.aClass152_1.aClass240_21.method25932((long) (this.anInt5734 * 202498537)) == null && local3.method30235(this.anInt5734 * 202498537, -512225963)) {
			local33 = Class203.method24662(local3, this.anInt5734 * 202498537);
			this.aClass152_1.aClass240_21.method25923(arg0.method20511(local33, true), (long) (this.anInt5734 * 202498537));
		}
	}

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "(I)V")
	@Override
	public void method36834(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!vb", name = "u", descriptor = "(Lclient!alw;II)V")
	void method32125(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.anInt5740 = arg0.method22448(-1419708709) * 903627193;
		} else if (arg1 == 2) {
			this.anInt5730 = arg0.method22429((short) -11080) * 890968413;
			this.aBoolean836 = true;
		} else if (arg1 == 3) {
			this.anInt5729 = arg0.method22448(-969449569) * 1766142217;
		} else if (arg1 == 4) {
			this.anInt5733 = arg0.method22448(-192295129) * 199719183;
		} else if (arg1 == 5) {
			this.anInt5732 = arg0.method22448(-1292514137) * 1507387017;
		} else if (arg1 == 6) {
			this.anInt5734 = arg0.method22448(-2044399646) * 729089625;
		} else if (arg1 == 7) {
			this.anInt5735 = arg0.method22494((byte) -89) * -1733504063;
		} else if (arg1 == 8) {
			this.aString241 = arg0.method22440(1487593062);
		} else if (arg1 == 9) {
			this.anInt5731 = arg0.method22427(-1434290800) * 212534357;
		} else if (arg1 == 10) {
			this.anInt5737 = arg0.method22494((byte) -29) * 426052467;
		} else if (arg1 == 11) {
			this.anInt5736 = 0;
		} else if (arg1 == 12) {
			this.anInt5739 = arg0.method22425((short) 16384) * -2079109471;
		} else if (arg1 == 13) {
			this.anInt5724 = arg0.method22494((byte) -27) * -4667447;
		} else if (arg1 == 14) {
			this.anInt5736 = arg0.method22427(-1434290800) * 2128038707;
		} else if (arg1 == 16) {
			this.anInt5738 = arg0.method22494((byte) -95) * 311657605;
			this.anInt5723 = arg0.method22494((byte) -83) * -303555573;
		} else if (arg1 == 17 || arg1 == 18) {
			this.anInt5741 = arg0.method22427(-1434290800) * -1319444603;
			if (this.anInt5741 * 878854477 == 65535) {
				this.anInt5741 = 1319444603;
			}
			this.anInt5742 = arg0.method22427(-1434290800) * -1550157383;
			if (this.anInt5742 * 2096741513 == 65535) {
				this.anInt5742 = 1550157383;
			}
			@Pc(208) int local208 = -1;
			if (arg1 == 18) {
				local208 = arg0.method22427(-1434290800);
				if (local208 == 65535) {
					local208 = -1;
				}
			}
			@Pc(224) int local224 = arg0.method22425((short) 16384);
			this.anIntArray489 = new int[local224 + 2];
			for (@Pc(232) int local232 = 0; local232 <= local224; local232++) {
				this.anIntArray489[local232] = arg0.method22427(-1434290800);
				if (this.anIntArray489[local232] == 65535) {
					this.anIntArray489[local232] = -1;
				}
			}
			this.anIntArray489[local224 + 1] = local208;
		} else if (arg1 == 19) {
			this.anInt5743 = arg0.method22427(-1434290800) * 319020291;
		} else if (arg1 == 20) {
			this.anInt5744 = arg0.method22427(-1434290800) * -59333593;
		}
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(Lclient!dh;I)Lclient!cm;")
	public Class100 method32126(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5729 * -804410055 < 0) {
			return null;
		}
		@Pc(17) Class100 local17 = (Class100) this.aClass152_1.aClass240_21.method25932((long) (this.anInt5729 * -804410055));
		if (local17 == null) {
			this.method32124(arg0, -203340882);
			local17 = (Class100) this.aClass152_1.aClass240_21.method25932((long) (this.anInt5729 * -804410055));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36838(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method32125(arg0, local3, 1743892855);
		}
	}

	@OriginalMember(owner = "client!vb", name = "w", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36839(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method32125(arg0, local3, 1043599542);
		}
	}

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "()V")
	@Override
	public void method36840() {
	}

	@OriginalMember(owner = "client!vb", name = "x", descriptor = "(Lclient!dh;)Lclient!cm;")
	public Class100 method32127(@OriginalArg(0) Class104 arg0) {
		if (this.anInt5732 * -2131988551 < 0) {
			return null;
		}
		@Pc(17) Class100 local17 = (Class100) this.aClass152_1.aClass240_21.method25932((long) (this.anInt5732 * -2131988551));
		if (local17 == null) {
			this.method32124(arg0, 2103949479);
			local17 = (Class100) this.aClass152_1.aClass240_21.method25932((long) (this.anInt5732 * -2131988551));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vb", name = "s", descriptor = "(Lclient!alw;I)V")
	void method32128(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5740 = arg0.method22448(-360546306) * 903627193;
		} else if (arg1 == 2) {
			this.anInt5730 = arg0.method22429((short) 2934) * 890968413;
			this.aBoolean836 = true;
		} else if (arg1 == 3) {
			this.anInt5729 = arg0.method22448(-124438954) * 1766142217;
		} else if (arg1 == 4) {
			this.anInt5733 = arg0.method22448(-210484620) * 199719183;
		} else if (arg1 == 5) {
			this.anInt5732 = arg0.method22448(-1079965448) * 1507387017;
		} else if (arg1 == 6) {
			this.anInt5734 = arg0.method22448(-327289363) * 729089625;
		} else if (arg1 == 7) {
			this.anInt5735 = arg0.method22494((byte) -127) * -1733504063;
		} else if (arg1 == 8) {
			this.aString241 = arg0.method22440(-611590438);
		} else if (arg1 == 9) {
			this.anInt5731 = arg0.method22427(-1434290800) * 212534357;
		} else if (arg1 == 10) {
			this.anInt5737 = arg0.method22494((byte) -48) * 426052467;
		} else if (arg1 == 11) {
			this.anInt5736 = 0;
		} else if (arg1 == 12) {
			this.anInt5739 = arg0.method22425((short) 16384) * -2079109471;
		} else if (arg1 == 13) {
			this.anInt5724 = arg0.method22494((byte) -30) * -4667447;
		} else if (arg1 == 14) {
			this.anInt5736 = arg0.method22427(-1434290800) * 2128038707;
		} else if (arg1 == 16) {
			this.anInt5738 = arg0.method22494((byte) -126) * 311657605;
			this.anInt5723 = arg0.method22494((byte) -20) * -303555573;
		} else if (arg1 == 17 || arg1 == 18) {
			this.anInt5741 = arg0.method22427(-1434290800) * -1319444603;
			if (this.anInt5741 * 878854477 == 65535) {
				this.anInt5741 = 1319444603;
			}
			this.anInt5742 = arg0.method22427(-1434290800) * -1550157383;
			if (this.anInt5742 * 2096741513 == 65535) {
				this.anInt5742 = 1550157383;
			}
			@Pc(208) int local208 = -1;
			if (arg1 == 18) {
				local208 = arg0.method22427(-1434290800);
				if (local208 == 65535) {
					local208 = -1;
				}
			}
			@Pc(224) int local224 = arg0.method22425((short) 16384);
			this.anIntArray489 = new int[local224 + 2];
			for (@Pc(232) int local232 = 0; local232 <= local224; local232++) {
				this.anIntArray489[local232] = arg0.method22427(-1434290800);
				if (this.anIntArray489[local232] == 65535) {
					this.anIntArray489[local232] = -1;
				}
			}
			this.anIntArray489[local224 + 1] = local208;
		} else if (arg1 == 19) {
			this.anInt5743 = arg0.method22427(-1434290800) * 319020291;
		} else if (arg1 == 20) {
			this.anInt5744 = arg0.method22427(-1434290800) * -59333593;
		}
	}

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "(I)Ljava/lang/String;")
	public String method32129(@OriginalArg(0) int arg0) {
		@Pc(2) String local2 = this.aString241;
		@Pc(14) int local14 = arg0 * this.anInt5743 * 455308715 / (this.anInt5744 * -1736668265);
		while (true) {
			@Pc(18) int local18 = local2.indexOf("%1");
			if (local18 < 0) {
				return local2;
			}
			local2 = local2.substring(0, local18) + Class107.method18132(local14, false, -449951645) + local2.substring(local18 + 2);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!dh;)Lclient!cm;")
	public Class100 method32130(@OriginalArg(0) Class104 arg0) {
		if (this.anInt5733 * -183740945 < 0) {
			return null;
		}
		@Pc(17) Class100 local17 = (Class100) this.aClass152_1.aClass240_21.method25932((long) (this.anInt5733 * -183740945));
		if (local17 == null) {
			this.method32124(arg0, -564484658);
			local17 = (Class100) this.aClass152_1.aClass240_21.method25932((long) (this.anInt5733 * -183740945));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(Lclient!dh;)Lclient!cm;")
	public Class100 method32131(@OriginalArg(0) Class104 arg0) {
		if (this.anInt5732 * -2131988551 < 0) {
			return null;
		}
		@Pc(17) Class100 local17 = (Class100) this.aClass152_1.aClass240_21.method25932((long) (this.anInt5732 * -2131988551));
		if (local17 == null) {
			this.method32124(arg0, -100449606);
			local17 = (Class100) this.aClass152_1.aClass240_21.method25932((long) (this.anInt5732 * -2131988551));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "(Lclient!dh;)Lclient!cm;")
	public Class100 method32132(@OriginalArg(0) Class104 arg0) {
		if (this.anInt5732 * -2131988551 < 0) {
			return null;
		}
		@Pc(17) Class100 local17 = (Class100) this.aClass152_1.aClass240_21.method25932((long) (this.anInt5732 * -2131988551));
		if (local17 == null) {
			this.method32124(arg0, 63511426);
			local17 = (Class100) this.aClass152_1.aClass240_21.method25932((long) (this.anInt5732 * -2131988551));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vb", name = "t", descriptor = "(Lclient!dh;)Lclient!cm;")
	public Class100 method32133(@OriginalArg(0) Class104 arg0) {
		if (this.anInt5734 * 202498537 < 0) {
			return null;
		}
		@Pc(17) Class100 local17 = (Class100) this.aClass152_1.aClass240_21.method25932((long) (this.anInt5734 * 202498537));
		if (local17 == null) {
			this.method32124(arg0, -593219328);
			local17 = (Class100) this.aClass152_1.aClass240_21.method25932((long) (this.anInt5734 * 202498537));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vb", name = "k", descriptor = "(Lclient!alw;)V")
	@Override
	public void method36837(@OriginalArg(0) Class93_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22425((short) 16384);
			if (local3 == 0) {
				return;
			}
			this.method32125(arg0, local3, -147046238);
		}
	}

	@OriginalMember(owner = "client!vb", name = "y", descriptor = "(Lclient!em;Lclient!ep;)Lclient!vb;")
	public Class608 method32134(@OriginalArg(0) Interface21 arg0, @OriginalArg(1) Interface23 arg1) {
		@Pc(1) int local1 = -1;
		if (this.anIntArray489 == null) {
			return this;
		} else if (arg0 == null || arg1 == null) {
			return null;
		} else {
			if (this.anInt5741 * 878854477 != -1) {
				@Pc(27) Class379 local27 = arg0.method28134(this.anInt5741 * 878854477, (byte) -30);
				if (local27 != null) {
					local1 = arg1.method33635(local27, -125790509);
				}
			} else if (this.anInt5742 * 2096741513 != -1) {
				@Pc(51) Class108 local51 = arg0.method28135(Class138.aClass138_65, this.anInt5742 * 2096741513, -1497248091);
				if (local51 != null) {
					local1 = arg1.method33636(local51, 1472692167);
				}
			}
			if (local1 >= 0 && local1 < this.anIntArray489.length - 1) {
				return this.anIntArray489[local1] == -1 ? null : (Class608) this.anInterface11_13.method18273(this.anIntArray489[local1], -603934325);
			} else {
				@Pc(77) int local77 = this.anIntArray489[this.anIntArray489.length - 1];
				return local77 == -1 ? null : (Class608) this.anInterface11_13.method18273(local77, -1628673430);
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "(Lclient!dh;)Lclient!cm;")
	public Class100 method32135(@OriginalArg(0) Class104 arg0) {
		if (this.anInt5734 * 202498537 < 0) {
			return null;
		}
		@Pc(17) Class100 local17 = (Class100) this.aClass152_1.aClass240_21.method25932((long) (this.anInt5734 * 202498537));
		if (local17 == null) {
			this.method32124(arg0, -966149929);
			local17 = (Class100) this.aClass152_1.aClass240_21.method25932((long) (this.anInt5734 * 202498537));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "(Lclient!dh;)Lclient!cm;")
	public Class100 method32136(@OriginalArg(0) Class104 arg0) {
		if (this.anInt5734 * 202498537 < 0) {
			return null;
		}
		@Pc(17) Class100 local17 = (Class100) this.aClass152_1.aClass240_21.method25932((long) (this.anInt5734 * 202498537));
		if (local17 == null) {
			this.method32124(arg0, -155311382);
			local17 = (Class100) this.aClass152_1.aClass240_21.method25932((long) (this.anInt5734 * 202498537));
		}
		return local17;
	}

	@OriginalMember(owner = "client!vb", name = "ae", descriptor = "(Lclient!dh;)V")
	void method32137(@OriginalArg(0) Class104 arg0) {
		@Pc(3) Class497 local3 = this.aClass152_1.aClass497_45;
		@Pc(33) Class105 local33;
		if (this.anInt5729 * -804410055 >= 0 && this.aClass152_1.aClass240_21.method25932((long) (this.anInt5729 * -804410055)) == null && local3.method30235(this.anInt5729 * -804410055, -512225963)) {
			local33 = Class203.method24662(local3, this.anInt5729 * -804410055);
			this.aClass152_1.aClass240_21.method25923(arg0.method20511(local33, true), (long) (this.anInt5729 * -804410055));
		}
		if (this.anInt5732 * -2131988551 >= 0 && this.aClass152_1.aClass240_21.method25932((long) (this.anInt5732 * -2131988551)) == null && local3.method30235(this.anInt5732 * -2131988551, -512225963)) {
			local33 = Class203.method24662(local3, this.anInt5732 * -2131988551);
			this.aClass152_1.aClass240_21.method25923(arg0.method20511(local33, true), (long) (this.anInt5732 * -2131988551));
		}
		if (this.anInt5733 * -183740945 >= 0 && this.aClass152_1.aClass240_21.method25932((long) (this.anInt5733 * -183740945)) == null && local3.method30235(this.anInt5733 * -183740945, -512225963)) {
			local33 = Class203.method24662(local3, this.anInt5733 * -183740945);
			this.aClass152_1.aClass240_21.method25923(arg0.method20511(local33, true), (long) (this.anInt5733 * -183740945));
		}
		if (this.anInt5734 * 202498537 >= 0 && this.aClass152_1.aClass240_21.method25932((long) (this.anInt5734 * 202498537)) == null && local3.method30235(this.anInt5734 * 202498537, -512225963)) {
			local33 = Class203.method24662(local3, this.anInt5734 * 202498537);
			this.aClass152_1.aClass240_21.method25923(arg0.method20511(local33, true), (long) (this.anInt5734 * 202498537));
		}
	}

	@OriginalMember(owner = "client!vb", name = "ag", descriptor = "(Lclient!dh;)V")
	void method32138(@OriginalArg(0) Class104 arg0) {
		@Pc(3) Class497 local3 = this.aClass152_1.aClass497_45;
		@Pc(33) Class105 local33;
		if (this.anInt5729 * -804410055 >= 0 && this.aClass152_1.aClass240_21.method25932((long) (this.anInt5729 * -804410055)) == null && local3.method30235(this.anInt5729 * -804410055, -512225963)) {
			local33 = Class203.method24662(local3, this.anInt5729 * -804410055);
			this.aClass152_1.aClass240_21.method25923(arg0.method20511(local33, true), (long) (this.anInt5729 * -804410055));
		}
		if (this.anInt5732 * -2131988551 >= 0 && this.aClass152_1.aClass240_21.method25932((long) (this.anInt5732 * -2131988551)) == null && local3.method30235(this.anInt5732 * -2131988551, -512225963)) {
			local33 = Class203.method24662(local3, this.anInt5732 * -2131988551);
			this.aClass152_1.aClass240_21.method25923(arg0.method20511(local33, true), (long) (this.anInt5732 * -2131988551));
		}
		if (this.anInt5733 * -183740945 >= 0 && this.aClass152_1.aClass240_21.method25932((long) (this.anInt5733 * -183740945)) == null && local3.method30235(this.anInt5733 * -183740945, -512225963)) {
			local33 = Class203.method24662(local3, this.anInt5733 * -183740945);
			this.aClass152_1.aClass240_21.method25923(arg0.method20511(local33, true), (long) (this.anInt5733 * -183740945));
		}
		if (this.anInt5734 * 202498537 >= 0 && this.aClass152_1.aClass240_21.method25932((long) (this.anInt5734 * 202498537)) == null && local3.method30235(this.anInt5734 * 202498537, -512225963)) {
			local33 = Class203.method24662(local3, this.anInt5734 * 202498537);
			this.aClass152_1.aClass240_21.method25923(arg0.method20511(local33, true), (long) (this.anInt5734 * 202498537));
		}
	}
}
