package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xl")
public final class Class663 {

	@OriginalMember(owner = "client!xl", name = "n", descriptor = "[Lclient!atz;")
	static Class149_Sub4_Sub1_Sub1[] aClass149_Sub4_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!xl", name = "m", descriptor = "I")
	static int anInt5991 = 0;

	@OriginalMember(owner = "client!xl", name = "k", descriptor = "I")
	static int anInt5995 = 0;

	@OriginalMember(owner = "client!xl", name = "w", descriptor = "I")
	static int anInt5993 = 0;

	@OriginalMember(owner = "client!xl", name = "l", descriptor = "I")
	static int anInt5992 = 0;

	@OriginalMember(owner = "client!xl", name = "u", descriptor = "I")
	static int anInt5990 = 0;

	@OriginalMember(owner = "client!xl", name = "z", descriptor = "I")
	static int anInt5997 = 0;

	@OriginalMember(owner = "client!xl", name = "d", descriptor = "[Lclient!na;")
	static Class431[] aClass431Array1 = new Class431[16];

	@OriginalMember(owner = "client!xl", name = "c", descriptor = "I")
	static int anInt5996 = 0;

	@OriginalMember(owner = "client!xl", name = "r", descriptor = "Lclient!aan;")
	static Class16 aClass16_38 = new Class16(16);

	@OriginalMember(owner = "client!xl", name = "v", descriptor = "Lclient!aan;")
	static Class16 aClass16_39 = new Class16(8);

	@OriginalMember(owner = "client!xl", name = "o", descriptor = "I")
	static int anInt5994 = 0;

	@OriginalMember(owner = "client!xl", name = "s", descriptor = "I")
	static int anInt5998 = -1097351902;

	@OriginalMember(owner = "client!xl", name = "b", descriptor = "(I)V")
	public static void method33033(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		anInt5998 = arg0 * -548675951;
		Class296.aClass674Array1 = new Class674[Class223.anIntArray338[anInt5998 * 763077233] + 1];
		anInt5993 = 0;
		anInt5992 = 0;
	}

	@OriginalMember(owner = "client!xl", name = "u", descriptor = "(I)I")
	static int method33034(@OriginalArg(0) int arg0) {
		@Pc(5) Class93_Sub14 local5 = (Class93_Sub14) aClass16_38.method215((long) arg0);
		if (local5 == null) {
			@Pc(13) Class431 local13 = Class110_Sub15_Sub2.anInterface47_1.method29056(arg0, -657045947);
			if (local13 == null || local13.anInt4953 * -1789015339 != 2) {
				return -1;
			}
			local5 = new Class93_Sub14(anInt5996 * -754661267);
			aClass16_38.method221(local5, (long) arg0);
			aClass431Array1[(anInt5996 += 399933797) * -754661267 - 1] = local13;
		}
		return local5.anInt1526 * 1279598251;
	}

	@OriginalMember(owner = "client!xl", name = "z", descriptor = "(I)I")
	static int method33035(@OriginalArg(0) int arg0) {
		@Pc(5) Class93_Sub14 local5 = (Class93_Sub14) aClass16_38.method215((long) arg0);
		if (local5 == null) {
			@Pc(13) Class431 local13 = Class110_Sub15_Sub2.anInterface47_1.method29056(arg0, -657045947);
			if (local13 == null || local13.anInt4953 * -1789015339 != 2) {
				return -1;
			}
			local5 = new Class93_Sub14(anInt5996 * -754661267);
			aClass16_38.method221(local5, (long) arg0);
			aClass431Array1[(anInt5996 += 399933797) * -754661267 - 1] = local13;
		}
		return local5.anInt1526 * 1279598251;
	}

	@OriginalMember(owner = "client!xl", name = "p", descriptor = "(Lclient!nb;Lclient!np;)V")
	public static void method33036(@OriginalArg(0) Interface46 arg0, @OriginalArg(1) Interface47 arg1) {
		anInt5991 = 0;
		anInt5995 = 0;
		Class701.aList26 = new LinkedList();
		aClass149_Sub4_Sub1_Sub1Array1 = new Class149_Sub4_Sub1_Sub1[1024];
		Class296.aClass674Array1 = new Class674[Class223.anIntArray338[anInt5998 * 763077233] + 1];
		anInt5993 = 0;
		anInt5992 = 0;
		Class110_Sub15_Sub2.anInterface47_1 = arg1;
	}

	@OriginalMember(owner = "client!xl", name = "d", descriptor = "(Lclient!dh;J)V")
	public static void method33037(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1) {
		anInt5997 = anInt5990 * -1517636377;
		anInt5990 = 0;
		Class305.method26889(826077435);
		@Pc(11) Iterator local11 = Class701.aList26.iterator();
		while (local11.hasNext()) {
			@Pc(18) Class674 local18 = (Class674) local11.next();
			@Pc(23) boolean local23 = local18.method33277(arg0, arg1);
			if (!local23) {
				local11.remove();
				Class296.aClass674Array1[anInt5992 * 779180177] = local18;
				anInt5992 = (anInt5992 * 779180177 + 1 & Class223.anIntArray338[anInt5998 * 763077233]) * -89298831;
			}
		}
	}

	@OriginalMember(owner = "client!xl", name = "c", descriptor = "(Lclient!dh;J)V")
	public static void method33038(@OriginalArg(0) Class104 arg0, @OriginalArg(1) long arg1) {
		anInt5997 = anInt5990 * -1517636377;
		anInt5990 = 0;
		Class305.method26889(1385019767);
		@Pc(11) Iterator local11 = Class701.aList26.iterator();
		while (local11.hasNext()) {
			@Pc(18) Class674 local18 = (Class674) local11.next();
			@Pc(23) boolean local23 = local18.method33277(arg0, arg1);
			if (!local23) {
				local11.remove();
				Class296.aClass674Array1[anInt5992 * 779180177] = local18;
				anInt5992 = (anInt5992 * 779180177 + 1 & Class223.anIntArray338[anInt5998 * 763077233]) * -89298831;
			}
		}
	}

	@OriginalMember(owner = "client!xl", name = "r", descriptor = "(Lclient!tx;Lclient!dh;)V")
	public static void method33039(@OriginalArg(0) Class585 arg0, @OriginalArg(1) Class104 arg1) {
		@Pc(2) Iterator local2 = Class701.aList26.iterator();
		while (local2.hasNext()) {
			@Pc(9) Class674 local9 = (Class674) local2.next();
			if (local9.aBoolean880) {
				local9.method33284(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!xl", name = "o", descriptor = "()V")
	public static void method33040() {
		aClass16_39 = new Class16(8);
		anInt5994 = 0;
		@Pc(9) Iterator local9 = Class701.aList26.iterator();
		while (local9.hasNext()) {
			@Pc(16) Class674 local16 = (Class674) local9.next();
			local16.method33311();
		}
	}

	@OriginalMember(owner = "client!xl", name = "s", descriptor = "()V")
	public static void method33041() {
		aClass16_39 = new Class16(8);
		anInt5994 = 0;
		@Pc(9) Iterator local9 = Class701.aList26.iterator();
		while (local9.hasNext()) {
			@Pc(16) Class674 local16 = (Class674) local9.next();
			local16.method33311();
		}
	}

	@OriginalMember(owner = "client!xl", name = "y", descriptor = "()V")
	public static void method33042() {
		aClass16_39 = new Class16(8);
		anInt5994 = 0;
		@Pc(9) Iterator local9 = Class701.aList26.iterator();
		while (local9.hasNext()) {
			@Pc(16) Class674 local16 = (Class674) local9.next();
			local16.method33311();
		}
	}

	@OriginalMember(owner = "client!xl", name = "q", descriptor = "()V")
	public static void method33043() {
		aClass16_39 = new Class16(8);
		anInt5994 = 0;
		@Pc(9) Iterator local9 = Class701.aList26.iterator();
		while (local9.hasNext()) {
			@Pc(16) Class674 local16 = (Class674) local9.next();
			local16.method33311();
		}
	}

	@OriginalMember(owner = "client!xl", name = "x", descriptor = "()V")
	public static void method33044() {
		aClass16_39 = new Class16(8);
		anInt5994 = 0;
		@Pc(9) Iterator local9 = Class701.aList26.iterator();
		while (local9.hasNext()) {
			@Pc(16) Class674 local16 = (Class674) local9.next();
			local16.method33311();
		}
	}

	@OriginalMember(owner = "client!xl", name = "v", descriptor = "(Lclient!tx;Lclient!dh;)V")
	public static void method33045(@OriginalArg(0) Class585 arg0, @OriginalArg(1) Class104 arg1) {
		@Pc(2) Iterator local2 = Class701.aList26.iterator();
		while (local2.hasNext()) {
			@Pc(9) Class674 local9 = (Class674) local2.next();
			if (local9.aBoolean880) {
				local9.method33284(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!xl", name = "h", descriptor = "(I)V")
	public static void method33046(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		anInt5998 = arg0 * -548675951;
		Class296.aClass674Array1 = new Class674[Class223.anIntArray338[anInt5998 * 763077233] + 1];
		anInt5993 = 0;
		anInt5992 = 0;
	}

	@OriginalMember(owner = "client!xl", name = "a", descriptor = "(I)V")
	public static void method33047(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		anInt5998 = arg0 * -548675951;
		Class296.aClass674Array1 = new Class674[Class223.anIntArray338[anInt5998 * 763077233] + 1];
		anInt5993 = 0;
		anInt5992 = 0;
	}

	@OriginalMember(owner = "client!xl", name = "xm", descriptor = "(Lclient!yf;I)V")
	static void method33048(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class624.aClass120_1.method8665(local12, (byte) 35);
	}

	@OriginalMember(owner = "client!xl", name = "lr", descriptor = "(II)V")
	public static void method33049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class121.aClass93_Sub28_2 == null || (arg0 < 0 || arg0 >= Class121.aClass93_Sub28_2.anInt1602 * -1052058559)) {
			return;
		}
		@Pc(16) Class373 local16 = Class121.aClass93_Sub28_2.aClass373Array1[arg0];
		if (local16.aByte150 != -1) {
			return;
		}
		@Pc(24) Class175 local24 = Class330.method27465(-1591794019);
		@Pc(30) Class93_Sub22 local30 = Class102.method2592(Class446.aClass446_67, local24.aClass24_2, (byte) 125);
		local30.aClass93_Sub41_Sub2_1.method22522(Class46.method894(local16.aString200, -2097123155) + 2, (byte) -85);
		local30.aClass93_Sub41_Sub2_1.method22466(arg0, 2138344338);
		local30.aClass93_Sub41_Sub2_1.method22414(local16.aString200, -2003140695);
		local24.method24363(local30, -1777179793);
	}

	@OriginalMember(owner = "client!xl", name = "fk", descriptor = "(B)V")
	static void method33050(@OriginalArg(0) byte arg0) {
		for (@Pc(5) int local5 = Class624.aClass120_1.aClass647_1.method32822(true, 1236194973); local5 != -1; local5 = Class624.aClass120_1.aClass647_1.method32822(false, 1844575074)) {
			Class166_Sub34.method16217(local5, 575191378);
			client.anIntArray319[(client.anInt3539 += -245152335) * 1497097041 - 1 & 0x3F] = local5;
		}
		for (@Pc(35) Class93_Sub1_Sub11 local35 = Class379.method28287((byte) -112); local35 != null; local35 = Class379.method28287((byte) -73)) {
			@Pc(41) int local41 = local35.method21820(1232297652);
			@Pc(45) long local45 = local35.method21815(668145154);
			@Pc(55) Class108 local55;
			if (local41 == 1) {
				local55 = (Class108) Class72.aClass79_Sub1_Sub2_2.method18273((int) local45, 1318381296);
				Class596.aClass113_Sub1_1.method33645(local55, local35.anInt3020 * -222984563, 908369267);
				client.anIntArray322[(client.anInt3543 += -417848381) * -491428629 - 1 & 0x3F] = (int) local45;
			} else if (local41 == 2) {
				local55 = (Class108) Class72.aClass79_Sub1_Sub2_2.method18273((int) local45, -1294191481);
				Class596.aClass113_Sub1_1.method33649(local55, local35.aString103, -1670748317);
				client.anIntArray321[(client.anInt3544 += 238378227) * 1821580347 - 1 & 0x3F] = (int) local45;
			} else {
				@Pc(119) Class312 local119;
				if (local41 == 3) {
					local119 = Class659.method32986((int) local45, 414985263);
					if (!local35.aString103.equals(local119.aString170)) {
						local119.aString170 = local35.aString103;
						Class354.method27789(local119, -1174743804);
					}
				} else if (local41 == 23) {
					local119 = Class659.method32986((int) local45, 1373384509);
					if (local119.aBoolean699 != (local35.anInt3020 * -222984563 == 1)) {
						local119.aBoolean699 = local35.anInt3020 * -222984563 == 1;
						Class354.method27789(local119, -1174743804);
					}
				} else {
					@Pc(181) int local181;
					@Pc(186) int local186;
					@Pc(191) int local191;
					if (local41 == 4) {
						local119 = Class659.method32986((int) local45, -562696572);
						local181 = local35.anInt3020 * -222984563;
						local186 = local35.anInt3025 * -371058729;
						local191 = local35.anInt3019 * 1568594051;
						if (local181 != local119.anInt4042 * 1553054515 || local119.anInt4078 * 371778301 != local186 || local191 != local119.anInt4079 * 786895357) {
							local119.anInt4042 = local181 * 1317320699;
							local119.anInt4078 = local186 * 971360853;
							local119.anInt4079 = local191 * 1171936085;
							local119.aClass331_2 = null;
							Class354.method27789(local119, -1174743804);
						}
					} else if (local41 == 5) {
						local119 = Class659.method32986((int) local45, 1227522623);
						if (local119.anInt4064 * -1088634495 != local35.anInt3020 * -222984563) {
							if (-222984563 * local35.anInt3020 == -1) {
								local119.aClass19_6 = null;
							} else {
								if (local119.aClass19_6 == null) {
									local119.aClass19_6 = new Class19_Sub2();
								}
								local119.aClass19_6.method23580(local35.anInt3020 * -222984563, -67984982);
							}
							local119.anInt4064 = local35.anInt3020 * 1999844109;
							Class354.method27789(local119, -1174743804);
						}
					} else if (local41 == 6) {
						@Pc(293) int local293 = local35.anInt3020 * -222984563;
						local181 = local293 >> 10 & 0x1F;
						local186 = local293 >> 5 & 0x1F;
						local191 = local293 & 0x1F;
						@Pc(321) int local321 = (local191 << 3) + (local186 << 11) + (local181 << 19);
						@Pc(326) Class312 local326 = Class659.method32986((int) local45, -584669151);
						if (local326.anInt4034 * 969124391 != local321) {
							local326.anInt4034 = local321 * -999742057;
							Class354.method27789(local326, -1174743804);
						}
					} else if (local41 == 7) {
						local119 = Class659.method32986((int) local45, 1220209065);
						@Pc(359) boolean local359 = local35.anInt3020 * -222984563 == 1;
						if (local359 != local119.aBoolean685) {
							local119.aBoolean685 = local359;
							Class354.method27789(local119, -1174743804);
						}
					} else if (local41 == 8) {
						local119 = Class659.method32986((int) local45, 1749407565);
						if (local35.anInt3020 * -222984563 != local119.anInt4047 * 1332164047 || local35.anInt3025 * -371058729 != local119.anInt4048 * 1214995653 || local119.anInt4069 * -822913903 != local35.anInt3019 * 1568594051) {
							local119.anInt4047 = local35.anInt3020 * -825872157;
							local119.anInt4048 = local35.anInt3025 * -547281941;
							local119.anInt4069 = local35.anInt3019 * -1071884845;
							if (local119.anInt4086 * 307668159 != -1) {
								if (local119.anInt4044 * 1011166973 > 0) {
									local119.anInt4069 = local119.anInt4069 * -563441120 / (local119.anInt4044 * 1011166973) * -1283265423;
								} else if (local119.anInt4018 * 596415983 > 0) {
									local119.anInt4069 = -563441120 * local119.anInt4069 / (local119.anInt4018 * 596415983) * -1283265423;
								}
							}
							Class354.method27789(local119, -1174743804);
						}
					} else if (local41 == 9) {
						local119 = Class659.method32986((int) local45, 1404543799);
						if (local119.anInt4086 * 307668159 != local35.anInt3020 * -222984563 || local119.anInt4087 * -570377411 != local35.anInt3025 * -371058729) {
							local119.anInt4086 = local35.anInt3020 * -1185158221;
							local119.anInt4087 = local35.anInt3025 * -1857789789;
							Class354.method27789(local119, -1174743804);
						}
					} else if (local41 == 10) {
						local119 = Class659.method32986((int) local45, 1952374909);
						if (local119.anInt4045 * 1572745861 != local35.anInt3020 * -222984563 || local119.anInt4083 * 1502707537 != local35.anInt3025 * -371058729 || local119.anInt4085 * 1088282729 != local35.anInt3019 * 1568594051) {
							local119.anInt4045 = local35.anInt3020 * -994314647;
							local119.anInt4083 = local35.anInt3025 * 773384871;
							local119.anInt4085 = local35.anInt3019 * 490607627;
							Class354.method27789(local119, -1174743804);
						}
					} else if (local41 == 11) {
						local119 = Class659.method32986((int) local45, 1784370960);
						local119.aByte126 = 0;
						local119.anInt4020 = (local119.anInt4016 = local35.anInt3020 * -1022068223) * 557709685;
						local119.aByte127 = 0;
						local119.anInt4021 = (local119.anInt4017 = local35.anInt3025 * 1904872493) * -1138027155;
						Class354.method27789(local119, -1174743804);
					} else if (local41 == 12) {
						local119 = Class659.method32986((int) local45, 1724037930);
						local181 = local35.anInt3020 * -222984563;
						if (local119 != null && local119.anInt4012 * -158526639 == 0) {
							if (local181 > local119.anInt4084 * -1927602083 - local119.anInt4023 * -1490598249) {
								local181 = local119.anInt4084 * -1927602083 - local119.anInt4023 * -1490598249;
							}
							if (local181 < 0) {
								local181 = 0;
							}
							if (local119.anInt4031 * -1543587533 != local181) {
								local119.anInt4031 = local181 * -259266053;
								Class354.method27789(local119, -1174743804);
							}
						}
					} else if (local41 == 13) {
						local119 = Class659.method32986((int) local45, -225014660);
						local119.anInt4036 = local35.anInt3020 * 1285299233;
					} else if (local41 == 14) {
						Class172.aBoolean522 = true;
						Class172.anInt3179 = local35.anInt3020 * 1465557115;
						Class172.anInt3174 = local35.anInt3025 * 1288205261;
					} else if (local41 == 15) {
						local119 = Class659.method32986((int) local45, 1000465252);
						local119.anInt4076 = local35.anInt3020 * 1602008339;
					} else if (local41 == 21) {
						local119 = Class659.method32986((int) local45, 978593478);
						local119.aBoolean701 = local35.anInt3020 * -222984563 == 1;
					} else if (local41 == 22) {
						local119 = Class659.method32986((int) local45, 1142374947);
						local119.aBoolean695 = local35.anInt3020 * -222984563 == 1;
					} else if (local41 == 17) {
						local119 = Class659.method32986((int) local45, 1393391603);
						local181 = (int) (local45 >> 32);
						local119.method26965(local181, (short) (local35.anInt3020 * -222984563), (short) (local35.anInt3025 * -371058729), 156948969);
					} else if (local41 == 20) {
						local119 = Class659.method32986((int) local45, 2101990543);
						local181 = (int) (local45 >> 32);
						local119.method26994(local181, (short) (local35.anInt3020 * -222984563), (short) (local35.anInt3025 * -371058729), -2110074);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!xl", name = "av", descriptor = "(Lclient!pq;B)V")
	static void method33051(@OriginalArg(0) Class489 arg0, @OriginalArg(1) byte arg1) {
		Class454.aClass489_98.method30018(arg0);
	}

	@OriginalMember(owner = "client!xl", name = "<init>", descriptor = "()V")
	Class663() throws Throwable {
		throw new Error();
	}
}
