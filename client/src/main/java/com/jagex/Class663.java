package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xl")
public class Class663 {

	@OriginalMember(owner = "client!xl", name = "n", descriptor = "[Lclient!atz;")
	static Class149_Sub4_Sub1_Sub1[] aClass149_Sub4_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!xl", name = "m", descriptor = "I")
	static int anInt5830 = 0;

	@OriginalMember(owner = "client!xl", name = "k", descriptor = "I")
	static int anInt5834 = 0;

	@OriginalMember(owner = "client!xl", name = "w", descriptor = "I")
	static int anInt5832 = 0;

	@OriginalMember(owner = "client!xl", name = "l", descriptor = "I")
	static int anInt5831 = 0;

	@OriginalMember(owner = "client!xl", name = "u", descriptor = "I")
	static int anInt5829 = 0;

	@OriginalMember(owner = "client!xl", name = "z", descriptor = "I")
	static int anInt5836 = 0;

	@OriginalMember(owner = "client!xl", name = "d", descriptor = "[Lclient!na;")
	static Class431[] aClass431Array1 = new Class431[16];

	@OriginalMember(owner = "client!xl", name = "c", descriptor = "I")
	static int anInt5835 = 0;

	@OriginalMember(owner = "client!xl", name = "r", descriptor = "Lclient!aan;")
	static Class16 aClass16_38 = new Class16(16);

	@OriginalMember(owner = "client!xl", name = "v", descriptor = "Lclient!aan;")
	static Class16 aClass16_39 = new Class16(8);

	@OriginalMember(owner = "client!xl", name = "o", descriptor = "I")
	static int anInt5833 = 0;

	@OriginalMember(owner = "client!xl", name = "s", descriptor = "I")
	static int anInt5837 = -1097351902;

	@OriginalMember(owner = "client!xl", name = "<init>", descriptor = "()V", line = 29)
	Class663() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!xl", name = "u", descriptor = "(I)I", line = 34)
	static int method32852(@OriginalArg(0) int arg0) {
		@Pc(5) Class93_Sub14 local5 = (Class93_Sub14) aClass16_38.method214((long) arg0);
		if (local5 == null) {
			@Pc(13) Class431 local13 = Class110_Sub15_Sub2.anInterface47_1.method28875(arg0, -657045947);
			if (local13 == null || local13.anInt4792 * -1789015339 != 2) {
				return -1;
			}
			local5 = new Class93_Sub14(anInt5835 * -754661267);
			aClass16_38.method220(local5, (long) arg0);
			aClass431Array1[(anInt5835 += 399933797) * -754661267 - 1] = local13;
		}
		return local5.anInt1526 * 1279598251;
	}

	@OriginalMember(owner = "client!xl", name = "z", descriptor = "(I)I", line = 34)
	static int method32853(@OriginalArg(0) int arg0) {
		@Pc(5) Class93_Sub14 local5 = (Class93_Sub14) aClass16_38.method214((long) arg0);
		if (local5 == null) {
			@Pc(13) Class431 local13 = Class110_Sub15_Sub2.anInterface47_1.method28875(arg0, -657045947);
			if (local13 == null || local13.anInt4792 * -1789015339 != 2) {
				return -1;
			}
			local5 = new Class93_Sub14(anInt5835 * -754661267);
			aClass16_38.method220(local5, (long) arg0);
			aClass431Array1[(anInt5835 += 399933797) * -754661267 - 1] = local13;
		}
		return local5.anInt1526 * 1279598251;
	}

	@OriginalMember(owner = "client!xl", name = "p", descriptor = "(Lclient!nb;Lclient!np;)V", line = 46)
	public static void method32854(@OriginalArg(0) Interface46 arg0, @OriginalArg(1) Interface47 arg1) {
		anInt5830 = 0;
		anInt5834 = 0;
		Class701.aList26 = new LinkedList();
		aClass149_Sub4_Sub1_Sub1Array1 = new Class149_Sub4_Sub1_Sub1[1024];
		Class296.aClass674Array1 = new Class674[Class223.anIntArray336[anInt5837 * 763077233] + 1];
		anInt5832 = 0;
		anInt5831 = 0;
		Class110_Sub15_Sub2.anInterface47_1 = arg1;
	}

	@OriginalMember(owner = "client!xl", name = "d", descriptor = "(Lclient!dh;J)V", line = 57)
	public static void method32855(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1) {
		anInt5836 = anInt5829 * -1517636377;
		anInt5829 = 0;
		Class305.method26797(826077435);
		@Pc(11) Iterator local11 = Class701.aList26.iterator();
		while (local11.hasNext()) {
			@Pc(18) Class674 local18 = (Class674) local11.next();
			@Pc(23) boolean local23 = local18.method33105(arg0, arg1);
			if (!local23) {
				local11.remove();
				Class296.aClass674Array1[anInt5831 * 779180177] = local18;
				anInt5831 = (anInt5831 * 779180177 + 1 & Class223.anIntArray336[anInt5837 * 763077233]) * -89298831;
			}
		}
	}

	@OriginalMember(owner = "client!xl", name = "c", descriptor = "(Lclient!dh;J)V", line = 57)
	public static void method32856(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1) {
		anInt5836 = anInt5829 * -1517636377;
		anInt5829 = 0;
		Class305.method26797(1385019767);
		@Pc(11) Iterator local11 = Class701.aList26.iterator();
		while (local11.hasNext()) {
			@Pc(18) Class674 local18 = (Class674) local11.next();
			@Pc(23) boolean local23 = local18.method33105(arg0, arg1);
			if (!local23) {
				local11.remove();
				Class296.aClass674Array1[anInt5831 * 779180177] = local18;
				anInt5831 = (anInt5831 * 779180177 + 1 & Class223.anIntArray336[anInt5837 * 763077233]) * -89298831;
			}
		}
	}

	@OriginalMember(owner = "client!xl", name = "r", descriptor = "(Lclient!tx;Lclient!dh;)V", line = 74)
	public static void method32857(@OriginalArg(0) Class585 arg0, @OriginalArg(1) Class104 arg1) {
		@Pc(2) Iterator local2 = Class701.aList26.iterator();
		while (local2.hasNext()) {
			@Pc(9) Class674 local9 = (Class674) local2.next();
			if (local9.aBoolean871) {
				local9.method33129(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!xl", name = "v", descriptor = "(Lclient!tx;Lclient!dh;)V", line = 74)
	public static void method32858(@OriginalArg(0) Class585 arg0, @OriginalArg(1) Class104 arg1) {
		@Pc(2) Iterator local2 = Class701.aList26.iterator();
		while (local2.hasNext()) {
			@Pc(9) Class674 local9 = (Class674) local2.next();
			if (local9.aBoolean871) {
				local9.method33129(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!xl", name = "o", descriptor = "()V", line = 83)
	public static void method32859() {
		aClass16_39 = new Class16(8);
		anInt5833 = 0;
		@Pc(9) Iterator local9 = Class701.aList26.iterator();
		while (local9.hasNext()) {
			@Pc(16) Class674 local16 = (Class674) local9.next();
			local16.method33101();
		}
	}

	@OriginalMember(owner = "client!xl", name = "s", descriptor = "()V", line = 83)
	public static void method32860() {
		aClass16_39 = new Class16(8);
		anInt5833 = 0;
		@Pc(9) Iterator local9 = Class701.aList26.iterator();
		while (local9.hasNext()) {
			@Pc(16) Class674 local16 = (Class674) local9.next();
			local16.method33101();
		}
	}

	@OriginalMember(owner = "client!xl", name = "y", descriptor = "()V", line = 83)
	public static void method32861() {
		aClass16_39 = new Class16(8);
		anInt5833 = 0;
		@Pc(9) Iterator local9 = Class701.aList26.iterator();
		while (local9.hasNext()) {
			@Pc(16) Class674 local16 = (Class674) local9.next();
			local16.method33101();
		}
	}

	@OriginalMember(owner = "client!xl", name = "q", descriptor = "()V", line = 83)
	public static void method32862() {
		aClass16_39 = new Class16(8);
		anInt5833 = 0;
		@Pc(9) Iterator local9 = Class701.aList26.iterator();
		while (local9.hasNext()) {
			@Pc(16) Class674 local16 = (Class674) local9.next();
			local16.method33101();
		}
	}

	@OriginalMember(owner = "client!xl", name = "x", descriptor = "()V", line = 83)
	public static void method32863() {
		aClass16_39 = new Class16(8);
		anInt5833 = 0;
		@Pc(9) Iterator local9 = Class701.aList26.iterator();
		while (local9.hasNext()) {
			@Pc(16) Class674 local16 = (Class674) local9.next();
			local16.method33101();
		}
	}

	@OriginalMember(owner = "client!xl", name = "b", descriptor = "(I)V", line = 94)
	public static void method32864(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		anInt5837 = arg0 * -548675951;
		Class296.aClass674Array1 = new Class674[Class223.anIntArray336[anInt5837 * 763077233] + 1];
		anInt5832 = 0;
		anInt5831 = 0;
	}

	@OriginalMember(owner = "client!xl", name = "h", descriptor = "(I)V", line = 94)
	public static void method32865(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		anInt5837 = arg0 * -548675951;
		Class296.aClass674Array1 = new Class674[Class223.anIntArray336[anInt5837 * 763077233] + 1];
		anInt5832 = 0;
		anInt5831 = 0;
	}

	@OriginalMember(owner = "client!xl", name = "a", descriptor = "(I)V", line = 94)
	public static void method32866(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		anInt5837 = arg0 * -548675951;
		Class296.aClass674Array1 = new Class674[Class223.anIntArray336[anInt5837 * 763077233] + 1];
		anInt5832 = 0;
		anInt5831 = 0;
	}

	@OriginalMember(owner = "client!xl", name = "av", descriptor = "(Lclient!pq;B)V", line = 1115)
	static void method32867(@OriginalArg(0) Class489 arg0, @OriginalArg(1) byte arg1) {
		Class454.aClass489_98.method29852(arg0);
	}

	@OriginalMember(owner = "client!xl", name = "fk", descriptor = "(B)V", line = 3154)
	static final void method32868(@OriginalArg(0) byte arg0) {
		for (@Pc(5) int local5 = Class624.aClass120_1.aClass647_1.method32641(true, 1236194973); local5 != -1; local5 = Class624.aClass120_1.aClass647_1.method32641(false, 1844575074)) {
			Class166_Sub34.method16206(local5, 575191378);
			client.anIntArray319[(client.anInt3539 += -245152335) * 1497097041 - 1 & 0x3F] = local5;
		}
		for (@Pc(35) Class93_Sub1_Sub11 local35 = Class379.method28088((byte) -112); local35 != null; local35 = Class379.method28088((byte) -73)) {
			@Pc(41) int local41 = local35.method21889(1232297652);
			@Pc(45) long local45 = local35.method21893(668145154);
			@Pc(55) Class108 local55;
			if (local41 == 1) {
				local55 = (Class108) Class72.aClass79_Sub1_Sub2_2.method18261((int) local45, 1318381296);
				Class596.aClass113_Sub1_1.method33464(local55, local35.anInt3020 * -222984563, 908369267);
				client.anIntArray322[(client.anInt3543 += -417848381) * -491428629 - 1 & 0x3F] = (int) local45;
			} else if (local41 == 2) {
				local55 = (Class108) Class72.aClass79_Sub1_Sub2_2.method18261((int) local45, -1294191481);
				Class596.aClass113_Sub1_1.method33468(local55, local35.aString103, -1670748317);
				client.anIntArray321[(client.anInt3544 += 238378227) * 1821580347 - 1 & 0x3F] = (int) local45;
			} else {
				@Pc(119) Class312 local119;
				if (local41 == 3) {
					local119 = Class659.method32808((int) local45, 414985263);
					if (!local35.aString103.equals(local119.aString164)) {
						local119.aString164 = local35.aString103;
						Class354.method27694(local119, -1174743804);
					}
				} else if (local41 == 23) {
					local119 = Class659.method32808((int) local45, 1373384509);
					if (local119.aBoolean695 != (local35.anInt3020 * -222984563 == 1)) {
						local119.aBoolean695 = local35.anInt3020 * -222984563 == 1;
						Class354.method27694(local119, -1174743804);
					}
				} else {
					@Pc(181) int local181;
					@Pc(186) int local186;
					@Pc(191) int local191;
					if (local41 == 4) {
						local119 = Class659.method32808((int) local45, -562696572);
						local181 = local35.anInt3020 * -222984563;
						local186 = local35.anInt3025 * -371058729;
						local191 = local35.anInt3019 * 1568594051;
						if (local181 != local119.anInt4001 * 1553054515 || local119.anInt4037 * 371778301 != local186 || local191 != local119.anInt4038 * 786895357) {
							local119.anInt4001 = local181 * 1317320699;
							local119.anInt4037 = local186 * 971360853;
							local119.anInt4038 = local191 * 1171936085;
							local119.aClass331_2 = null;
							Class354.method27694(local119, -1174743804);
						}
					} else if (local41 == 5) {
						local119 = Class659.method32808((int) local45, 1227522623);
						if (local119.anInt4023 * -1088634495 != local35.anInt3020 * -222984563) {
							if (-222984563 * local35.anInt3020 == -1) {
								local119.aClass19_6 = null;
							} else {
								if (local119.aClass19_6 == null) {
									local119.aClass19_6 = new Class19_Sub2();
								}
								local119.aClass19_6.method23566(local35.anInt3020 * -222984563, -67984982);
							}
							local119.anInt4023 = local35.anInt3020 * 1999844109;
							Class354.method27694(local119, -1174743804);
						}
					} else if (local41 == 6) {
						@Pc(293) int local293 = local35.anInt3020 * -222984563;
						local181 = local293 >> 10 & 0x1F;
						local186 = local293 >> 5 & 0x1F;
						local191 = local293 & 0x1F;
						@Pc(321) int local321 = (local191 << 3) + (local186 << 11) + (local181 << 19);
						@Pc(326) Class312 local326 = Class659.method32808((int) local45, -584669151);
						if (local326.anInt3993 * 969124391 != local321) {
							local326.anInt3993 = local321 * -999742057;
							Class354.method27694(local326, -1174743804);
						}
					} else if (local41 == 7) {
						local119 = Class659.method32808((int) local45, 1220209065);
						@Pc(359) boolean local359 = local35.anInt3020 * -222984563 == 1;
						if (local359 != local119.aBoolean681) {
							local119.aBoolean681 = local359;
							Class354.method27694(local119, -1174743804);
						}
					} else if (local41 == 8) {
						local119 = Class659.method32808((int) local45, 1749407565);
						if (local35.anInt3020 * -222984563 != local119.anInt4006 * 1332164047 || local35.anInt3025 * -371058729 != local119.anInt4007 * 1214995653 || local119.anInt4028 * -822913903 != local35.anInt3019 * 1568594051) {
							local119.anInt4006 = local35.anInt3020 * -825872157;
							local119.anInt4007 = local35.anInt3025 * -547281941;
							local119.anInt4028 = local35.anInt3019 * -1071884845;
							if (local119.anInt4045 * 307668159 != -1) {
								if (local119.anInt4003 * 1011166973 > 0) {
									local119.anInt4028 = local119.anInt4028 * -563441120 / (local119.anInt4003 * 1011166973) * -1283265423;
								} else if (local119.anInt3977 * 596415983 > 0) {
									local119.anInt4028 = -563441120 * local119.anInt4028 / (local119.anInt3977 * 596415983) * -1283265423;
								}
							}
							Class354.method27694(local119, -1174743804);
						}
					} else if (local41 == 9) {
						local119 = Class659.method32808((int) local45, 1404543799);
						if (local119.anInt4045 * 307668159 != local35.anInt3020 * -222984563 || local119.anInt4046 * -570377411 != local35.anInt3025 * -371058729) {
							local119.anInt4045 = local35.anInt3020 * -1185158221;
							local119.anInt4046 = local35.anInt3025 * -1857789789;
							Class354.method27694(local119, -1174743804);
						}
					} else if (local41 == 10) {
						local119 = Class659.method32808((int) local45, 1952374909);
						if (local119.anInt4004 * 1572745861 != local35.anInt3020 * -222984563 || local119.anInt4042 * 1502707537 != local35.anInt3025 * -371058729 || local119.anInt4044 * 1088282729 != local35.anInt3019 * 1568594051) {
							local119.anInt4004 = local35.anInt3020 * -994314647;
							local119.anInt4042 = local35.anInt3025 * 773384871;
							local119.anInt4044 = local35.anInt3019 * 490607627;
							Class354.method27694(local119, -1174743804);
						}
					} else if (local41 == 11) {
						local119 = Class659.method32808((int) local45, 1784370960);
						local119.aByte126 = 0;
						local119.anInt3979 = (local119.anInt3975 = local35.anInt3020 * -1022068223) * 557709685;
						local119.aByte127 = 0;
						local119.anInt3980 = (local119.anInt3976 = local35.anInt3025 * 1904872493) * -1138027155;
						Class354.method27694(local119, -1174743804);
					} else if (local41 == 12) {
						local119 = Class659.method32808((int) local45, 1724037930);
						local181 = local35.anInt3020 * -222984563;
						if (local119 != null && local119.anInt3971 * -158526639 == 0) {
							if (local181 > local119.anInt4043 * -1927602083 - local119.anInt3982 * -1490598249) {
								local181 = local119.anInt4043 * -1927602083 - local119.anInt3982 * -1490598249;
							}
							if (local181 < 0) {
								local181 = 0;
							}
							if (local119.anInt3990 * -1543587533 != local181) {
								local119.anInt3990 = local181 * -259266053;
								Class354.method27694(local119, -1174743804);
							}
						}
					} else if (local41 == 13) {
						local119 = Class659.method32808((int) local45, -225014660);
						local119.anInt3995 = local35.anInt3020 * 1285299233;
					} else if (local41 == 14) {
						Class172.aBoolean521 = true;
						Class172.anInt3179 = local35.anInt3020 * 1465557115;
						Class172.anInt3174 = local35.anInt3025 * 1288205261;
					} else if (local41 == 15) {
						local119 = Class659.method32808((int) local45, 1000465252);
						local119.anInt4035 = local35.anInt3020 * 1602008339;
					} else if (local41 == 21) {
						local119 = Class659.method32808((int) local45, 978593478);
						local119.aBoolean697 = local35.anInt3020 * -222984563 == 1;
					} else if (local41 == 22) {
						local119 = Class659.method32808((int) local45, 1142374947);
						local119.aBoolean691 = local35.anInt3020 * -222984563 == 1;
					} else if (local41 == 17) {
						local119 = Class659.method32808((int) local45, 1393391603);
						local181 = (int) (local45 >> 32);
						local119.method26917(local181, (short) (local35.anInt3020 * -222984563), (short) (local35.anInt3025 * -371058729), 156948969);
					} else if (local41 == 20) {
						local119 = Class659.method32808((int) local45, 2101990543);
						local181 = (int) (local45 >> 32);
						local119.method26921(local181, (short) (local35.anInt3020 * -222984563), (short) (local35.anInt3025 * -371058729), -2110074);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!xl", name = "xm", descriptor = "(Lclient!yf;I)V", line = 9108)
	static final void method32869(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class624.aClass120_1.method8667(local12, (byte) 35);
	}

	@OriginalMember(owner = "client!xl", name = "lr", descriptor = "(II)V", line = 12082)
	public static final void method32870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class121.aClass93_Sub28_2 == null || (arg0 < 0 || arg0 >= Class121.aClass93_Sub28_2.anInt1602 * -1052058559)) {
			return;
		}
		@Pc(16) Class373 local16 = Class121.aClass93_Sub28_2.aClass373Array1[arg0];
		if (local16.aByte150 != -1) {
			return;
		}
		@Pc(24) Class175 local24 = Class330.method27371(-1591794019);
		@Pc(30) Class93_Sub22 local30 = Class102.method2588(Class446.aClass446_67, local24.aClass24_2, (byte) 125);
		local30.aClass93_Sub41_Sub2_1.method22394(Class46.method895(local16.aString191, -2097123155) + 2, (byte) -85);
		local30.aClass93_Sub41_Sub2_1.method22395(arg0, 2138344338);
		local30.aClass93_Sub41_Sub2_1.method22431(local16.aString191, -2003140695);
		local24.method24356(local30, -1777179793);
	}
}
