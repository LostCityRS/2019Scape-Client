package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adu")
public final class Class89 implements Interface11, Interface5 {

	@OriginalMember(owner = "client!adu", name = "lx", descriptor = "I")
	public static int anInt319;

	@OriginalMember(owner = "client!adu", name = "t", descriptor = "I")
	public int anInt318 = 0;

	@OriginalMember(owner = "client!adu", name = "f", descriptor = "I")
	public int anInt316 = 0;

	@OriginalMember(owner = "client!adu", name = "e", descriptor = "I")
	public int anInt317 = -59222016;

	@OriginalMember(owner = "client!adu", name = "u", descriptor = "I")
	public int anInt315 = -986339328;

	@OriginalMember(owner = "client!adu", name = "m", descriptor = "(I)I")
	public static int method1804(@OriginalArg(0) int arg0) {
		return Class622.anInt5483 * -1525318091;
	}

	@OriginalMember(owner = "client!adu", name = "akz", descriptor = "(Lclient!yp;I)V")
	static void method1805(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(15) Class80_Sub1_Sub12 local15 = Class146.method13874(-673174972);
		if (local15 == null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
			return;
		}
		@Pc(31) boolean local31 = local15.method22600(local12 >> 14 & 0x3FFF, local12 & 0x3FFF, Class681.anIntArray521, -725732740);
		if (local31) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class681.anIntArray521[1];
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class681.anIntArray521[2];
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
		}
	}

	@OriginalMember(owner = "client!adu", name = "dx", descriptor = "(Lclient!di;Lclient!akh;Lclient!ho;III)Z")
	static boolean method1806(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class80_Sub18 arg1, @OriginalArg(2) Class320 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Class159_Sub1.aBoolean399 && !client.aBoolean732 && !Class159_Sub1.method15337(arg1.anInt1582 * 652783051, arg1.anInt1584 * -1163867765)) {
			return false;
		}
		if (arg2.anIntArray389 != null) {
			arg2 = arg2.method27550(Class159_Sub1.anInterface21_2, Class159_Sub1.anInterface24_2, 72026990);
			if (arg2 == null) {
				return false;
			}
		}
		@Pc(32) int local32 = Integer.MAX_VALUE;
		@Pc(34) int local34 = Integer.MIN_VALUE;
		@Pc(36) int local36 = Integer.MAX_VALUE;
		@Pc(38) int local38 = Integer.MIN_VALUE;
		if (arg2.anIntArray390 != null) {
			local32 = Class159_Sub1.anInt2007 + (Class159_Sub1.anInt2009 - Class159_Sub1.anInt2007) * (arg2.anInt4050 * 360284357 + arg1.anInt1582 * 652783051 - Class159_Sub1.anInt2003) / (Class159_Sub1.anInt2005 - Class159_Sub1.anInt2003);
			local34 = (arg2.anInt4052 * 649510463 + arg1.anInt1582 * 652783051 - Class159_Sub1.anInt2003) * (Class159_Sub1.anInt2009 - Class159_Sub1.anInt2007) / (Class159_Sub1.anInt2005 - Class159_Sub1.anInt2003) + Class159_Sub1.anInt2007;
			local38 = Class159_Sub1.anInt2010 - (arg2.anInt4051 * 1996000583 + arg1.anInt1584 * -1163867765 - Class159_Sub1.anInt2006) * (Class159_Sub1.anInt2010 - Class159_Sub1.anInt2008) / (Class159_Sub1.anInt2004 - Class159_Sub1.anInt2006);
			local36 = Class159_Sub1.anInt2010 - (arg2.anInt4053 * -987728585 + arg1.anInt1584 * -1163867765 - Class159_Sub1.anInt2006) * (Class159_Sub1.anInt2010 - Class159_Sub1.anInt2008) / (Class159_Sub1.anInt2004 - Class159_Sub1.anInt2006);
		}
		@Pc(131) Class99 local131 = null;
		@Pc(133) int local133 = 0;
		@Pc(135) int local135 = 0;
		@Pc(137) int local137 = 0;
		@Pc(139) int local139 = 0;
		if (arg2.anInt4037 * 1279732247 != -1) {
			if (arg1.aBoolean364 && arg2.anInt4033 * 888152267 != -1) {
				local131 = arg2.method27545(arg0, true, 1625909761);
			} else {
				local131 = arg2.method27545(arg0, false, -1581716893);
			}
			if (local131 != null) {
				switch(arg2.aClass313_4.anInt4019 * -1120202439) {
					case 0:
						local133 = arg1.anInt1585 * -1472438265;
						local135 = arg1.anInt1585 * -1472438265 + local131.method18214();
						break;
					case 1:
						local133 = arg1.anInt1585 * -1472438265 - local131.method18214();
						local135 = arg1.anInt1585 * -1472438265;
						break;
					case 2:
						local133 = arg1.anInt1585 * -1472438265 - (local131.method18214() + 1 >> 1);
						local135 = arg1.anInt1585 * -1472438265 + (local131.method18214() + 1 >> 1);
				}
				switch(arg2.aClass309_4.anInt4011 * -2069042521) {
					case 0:
						local137 = arg1.anInt1586 * -1587456111 - local131.method18288();
						local139 = arg1.anInt1586 * -1587456111;
						break;
					case 1:
						local137 = arg1.anInt1586 * -1587456111;
						local139 = arg1.anInt1586 * -1587456111 + local131.method18288();
						break;
					case 2:
						local137 = arg1.anInt1586 * -1587456111 - (local131.method18288() + 1 >> 1);
						local139 = arg1.anInt1586 * -1587456111 + (local131.method18288() + 1 >> 1);
				}
				if (local133 < local32) {
					local32 = local133;
				}
				if (local135 > local34) {
					local34 = local135;
				}
				if (local137 < local36) {
					local36 = local137;
				}
				if (local139 > local38) {
					local38 = local139;
				}
			}
		}
		@Pc(307) Class99 local307 = null;
		if (arg2.anInt4044 * 771633001 != -1) {
			local307 = arg2.method27546(arg0, 698474497);
		}
		@Pc(320) int local320 = 0;
		@Pc(322) int local322 = 0;
		@Pc(324) int local324 = 0;
		@Pc(326) int local326 = 0;
		@Pc(328) int local328 = 0;
		@Pc(330) int local330 = 0;
		@Pc(332) int local332 = 0;
		@Pc(334) int local334 = 0;
		if (arg2.aString178 != null) {
			Class309.method27453(arg2.anInt4031 * -618572023, (byte) -116);
			if (Class165_Sub38.aClass104_12 != null) {
				local334 = Class461.aClass15_10.method380(arg2.aString178, Class80_Sub1_Sub1.anInt254 * -255202897, 0, null, (byte) -47);
				local324 = Class461.aClass15_10.method377(arg2.aString178, Class80_Sub1_Sub1.anInt254 * -255202897, null, -134516095);
				local320 = arg1.anInt1585 * -1472438265 - local324 / 2 + (Class159_Sub1.anInt2009 - Class159_Sub1.anInt2007) * arg2.anInt4057 * -258009849 / (Class159_Sub1.anInt2005 - Class159_Sub1.anInt2003);
				local322 = arg1.anInt1586 * -1587456111 - arg2.anInt4058 * -694647429 * (Class159_Sub1.anInt2010 - Class159_Sub1.anInt2008) / (Class159_Sub1.anInt2004 - Class159_Sub1.anInt2006);
				if (local131 == null) {
					local322 -= local334 / 2;
				} else {
					local322 -= (local131.method18288() >> 1) + local334;
				}
				local326 = arg3 + local320;
				if (local326 < local32) {
					local32 = local326;
				}
				local328 = local324 + local320 + arg3;
				if (local328 > local34) {
					local34 = local328;
				}
				local330 = arg4 + local322;
				if (local330 < local36) {
					local36 = local330;
				}
				local332 = local334 + local322 + arg4;
				if (local332 > local38) {
					local38 = local332;
				}
			}
		}
		if (local34 < Class159_Sub1.anInt2007 || local32 > Class159_Sub1.anInt2009 || local38 < Class159_Sub1.anInt2008 || local36 > Class159_Sub1.anInt2010) {
			return true;
		}
		Class159_Sub1.method15360(arg0, arg1, arg2);
		if (local131 != null) {
			@Pc(489) int local489 = 0;
			@Pc(491) int local491 = 0;
			@Pc(493) int local493 = 0;
			@Pc(495) int local495 = 0;
			@Pc(497) int local497 = 0;
			@Pc(499) int local499 = 0;
			switch(arg2.aClass313_4.anInt4019 * -1120202439) {
				case 0:
					local491 = -(local131.method18218() + 1) / 2;
					break;
				case 1:
					local489 = local131.method18218();
					local491 = (local131.method18218() + 1) / 2;
					local493 = local131.method18214();
					break;
				case 2:
					local489 = local131.method18218() / 2;
					local493 = local131.method18214() >> 1;
			}
			switch(arg2.aClass309_4.anInt4011 * -2069042521) {
				case 0:
					local495 = local131.method18218();
					local497 = (local131.method18218() + 1) / 2;
					local499 = local131.method18288();
					break;
				case 1:
					local497 = -(local131.method18218() + 1) / 2;
					break;
				case 2:
					local495 = local131.method18218() / 2;
					local499 = local131.method18288() >> 1;
			}
			@Pc(586) Class200 local586 = (Class200) Class159_Sub1.aHashMap4.get(arg1.anInt1587 * 1945594581);
			if (local586 == null) {
				local586 = (Class200) Class159_Sub1.aHashMap5.get(arg2.anInt4061 * -1976811059);
			}
			@Pc(630) int local630;
			@Pc(646) int local646;
			if (local586 != null && arg2.anInt4044 * 771633001 == -1) {
				if (local586.anInt3373 * -353644331 > Class159_Sub1.anInt2024 * 1506340421 / 2) {
					local630 = (Class159_Sub1.anInt2024 * 1864718011 - local586.anInt3373 * 15008811) / (Class159_Sub1.anInt2024 * 1506340421);
				} else {
					local630 = local586.anInt3373 * 15008811 / (Class159_Sub1.anInt2024 * 1506340421);
				}
				local646 = local630 << 24 | 0xFFFF00;
				if (arg0 instanceof Class102_Sub1) {
					arg0.method20716(arg1.anInt1585 * -1472438265 - local489 - 7, arg1.anInt1586 * -1587456111 - local495 - 7, local131.method18218() + 14, local131.method18218() + 14, local646, (byte) 72);
					arg0.method20716(arg1.anInt1585 * -1472438265 - local489 - 5, arg1.anInt1586 * -1587456111 - local495 - 5, local131.method18218() + 10, local131.method18218() + 10, local646, (byte) 118);
					arg0.method20716(arg1.anInt1585 * -1472438265 - local489 - 3, arg1.anInt1586 * -1587456111 - local495 - 3, local131.method18218() + 6, local131.method18218() + 6, local646, (byte) 7);
					arg0.method20716(arg1.anInt1585 * -1472438265 - local489 - 1, arg1.anInt1586 * -1587456111 - local495 - 1, local131.method18218() + 2, local131.method18218() + 2, local646, (byte) 118);
					arg0.method20716(arg1.anInt1585 * -1472438265 - local489, arg1.anInt1586 * -1587456111 - local495, local131.method18218(), local131.method18218(), local646, (byte) 46);
				} else {
					arg0.method20717(arg1.anInt1585 * -1472438265 - local491, arg1.anInt1586 * -1587456111 - local497, local131.method18218() / 2 + 7, local646, 1684746797);
					arg0.method20717(arg1.anInt1585 * -1472438265 - local491, arg1.anInt1586 * -1587456111 - local497 - local497 == 0 ? 0 : 1, local131.method18218() / 2 + 5, local646, 1336117996);
					arg0.method20717(arg1.anInt1585 * -1472438265 - local491, arg1.anInt1586 * -1587456111 - local497 - local497 == 0 ? 0 : 1, local131.method18218() / 2 + 3, local646, 1141569296);
					arg0.method20717(arg1.anInt1585 * -1472438265 - local491, arg1.anInt1586 * -1587456111 - local497 - local497 == 0 ? 0 : 1, local131.method18218() / 2 + 1, local646, 894974742);
					arg0.method20717(arg1.anInt1585 * -1472438265 - local491, arg1.anInt1586 * -1587456111 - local497 - local497 == 0 ? 0 : 1, local131.method18218() / 2, local646, 1268974001);
				}
			}
			local131.method18225(arg1.anInt1585 * -1472438265 - local493, arg1.anInt1586 * -1587456111 - local499);
			local630 = 0;
			local646 = 0;
			if (local586 != null && local307 != null) {
				switch(arg2.aClass313_4.anInt4019 * -1120202439) {
					case 0:
						local630 = local307.method18214();
					case 1:
					default:
						break;
					case 2:
						local630 = local307.method18214() >> 1;
				}
				switch(arg2.aClass309_4.anInt4011 * -2069042521) {
					case 0:
						local646 = (local307.method18288() + local131.method18288()) / 2;
					case 1:
					default:
						break;
					case 2:
						local646 = (local307.method18288() / 2 + local131.method18288()) / 2;
				}
				@Pc(1004) int local1004;
				if (local586.anInt3373 * -353644331 > Class159_Sub1.anInt2024 * 1506340421 / 2) {
					local1004 = (Class159_Sub1.anInt2024 * 1864718011 - local586.anInt3373 * 15008811) / (Class159_Sub1.anInt2024 * 1506340421);
				} else {
					local1004 = local586.anInt3373 * 15008811 / (Class159_Sub1.anInt2024 * 1506340421);
				}
				@Pc(1020) int local1020 = local1004 << 24 | 0xFFFF00;
				local307.method18226(arg1.anInt1585 * -1472438265 - local630, arg1.anInt1586 * -1587456111 - local646, 0, local1020, 1);
			}
		}
		if (arg2.aString178 != null && Class165_Sub38.aClass104_12 != null) {
			Class483.method30030(arg0, arg1, arg2, local320, local322, local334, local324, 2144210786);
		}
		if (arg2.anInt4037 * 1279732247 != -1 || arg2.aString178 != null) {
			@Pc(1067) Class80_Sub7 local1067 = new Class80_Sub7(arg1);
			local1067.anInt1461 = local133 * 2001422441;
			local1067.anInt1463 = local135 * 1696076311;
			local1067.anInt1462 = local137 * 659963847;
			local1067.anInt1466 = local139 * -1022717471;
			local1067.anInt1468 = local326 * -602033181;
			local1067.anInt1465 = local328 * -802024881;
			local1067.anInt1464 = local330 * -1946152893;
			local1067.anInt1467 = local332 * 1617663591;
			Class391.aClass8_53.method232(local1067, 1697162262);
		}
		return false;
	}

	@OriginalMember(owner = "client!adu", name = "<init>", descriptor = "()V")
	Class89() {
	}

	@OriginalMember(owner = "client!adu", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	public void method37009(@OriginalArg(0) Packet arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			if (local3 == 0) {
				return;
			}
			this.method1801(arg0, local3, 121586383);
		}
	}

	@OriginalMember(owner = "client!adu", name = "t", descriptor = "(Lclient!ald;I)V")
	@Override
	public void method37006(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.g1();
			if (local3 == 0) {
				return;
			}
			this.method1801(arg0, local3, 121586383);
		}
	}

	@OriginalMember(owner = "client!adu", name = "l", descriptor = "(Lclient!ald;II)V")
	void method1801(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.anInt318 = arg0.g1() * 47920369;
		} else if (arg1 == 2) {
			this.anInt315 = arg0.g2() * 1989715637;
		} else if (arg1 == 3) {
			this.anInt317 = arg0.g2() * -41971957;
		} else if (arg1 == 4) {
			this.anInt316 = arg0.g2s() * 847497353;
		}
	}

	@OriginalMember(owner = "client!adu", name = "g", descriptor = "(IS)V")
	@Override
	public void method37014(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
	}

	@OriginalMember(owner = "client!adu", name = "a", descriptor = "(I)V")
	@Override
	public void method37013(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adu", name = "m", descriptor = "(Lclient!ald;I)V")
	void method1802(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt318 = arg0.g1() * 47920369;
		} else if (arg1 == 2) {
			this.anInt315 = arg0.g2() * 1989715637;
		} else if (arg1 == 3) {
			this.anInt317 = arg0.g2() * -41971957;
		} else if (arg1 == 4) {
			this.anInt316 = arg0.g2s() * 847497353;
		}
	}

	@OriginalMember(owner = "client!adu", name = "o", descriptor = "(I)V")
	@Override
	public void method37010(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adu", name = "j", descriptor = "(I)V")
	@Override
	public void method37012(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adu", name = "e", descriptor = "()V")
	@Override
	public void method37008() {
	}

	@OriginalMember(owner = "client!adu", name = "s", descriptor = "(I)V")
	@Override
	public void method37011(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!adu", name = "i", descriptor = "(Lclient!ald;I)V")
	void method1803(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt318 = arg0.g1() * 47920369;
		} else if (arg1 == 2) {
			this.anInt315 = arg0.g2() * 1989715637;
		} else if (arg1 == 3) {
			this.anInt317 = arg0.g2() * -41971957;
		} else if (arg1 == 4) {
			this.anInt316 = arg0.g2s() * 847497353;
		}
	}

	@OriginalMember(owner = "client!adu", name = "f", descriptor = "(B)V")
	@Override
	public void method37007(@OriginalArg(0) byte arg0) {
	}
}
