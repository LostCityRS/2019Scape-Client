package com.jagex;

import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
final class Class245 implements Interface24 {

	@OriginalMember(owner = "client!en", name = "vl", descriptor = "Ljava/util/List;")
	public static List aList4;

	@OriginalMember(owner = "client!en", name = "e", descriptor = "(B)V")
	public static void method26313(@OriginalArg(0) byte arg0) {
		if (Class365.aClass360Array1 == null) {
			Class365.aClass360Array1 = Class360.method28143(-2137743917);
			Class365.aClass360_19 = Class365.aClass360Array1[0];
			Exception_Sub7.aLong155 = Class303.method27111((byte) 68) * 3348525561735091157L;
		}
		if (Class365.aClass369_1 == null) {
			Class699.method37064(-1230278720);
		}
		@Pc(19) Class360 local19 = Class365.aClass360_19;
		@Pc(22) int local22 = Class11.method334(-1486132722);
		if (local19 == Class365.aClass360_19) {
			Class103_Sub2.aString24 = Class365.aClass360_19.aClass60_177.method1180(Class512.aClass719_3, 1658583039);
			Class348.aString192 = Class103_Sub2.aString24;
			if (Class365.aClass360_19.aBoolean836) {
				Class8.anInt17 = (Class365.aClass360_19.anInt4491 * 171081043 + (Class365.aClass360_19.anInt4489 * 622296769 - Class365.aClass360_19.anInt4491 * 171081043) * local22 / 100) * -1849714223;
			}
			if (Class365.aClass360_19.aBoolean837) {
				Class348.aString192 = Class348.aString192 + " - " + Class8.anInt17 * 1829723953 + "%";
			}
		} else if (Class365.aClass360_19 == Class360.aClass360_18) {
			Class365.aClass369_1 = null;
			Class604.method32148(4, 1506989963);
			if (Class365.aBoolean839) {
				Class365.aBoolean839 = false;
				Class60.method1183(Class362.aString196, Class672.aString235, "", false, (byte) 4);
			}
		} else {
			Class103_Sub2.aString24 = local19.aClass60_178.method1180(Class512.aClass719_3, 53817163);
			Class348.aString192 = Class103_Sub2.aString24;
			if (Class365.aClass360_19.aBoolean837) {
				Class348.aString192 = Class348.aString192 + " - " + local19.anInt4489 * 622296769 + "%";
			}
			Class8.anInt17 = local19.anInt4489 * 904844433;
			if (Class365.aClass360_19.aBoolean836 || local19.aBoolean836) {
				Exception_Sub7.aLong155 = Class303.method27111((byte) 79) * 3348525561735091157L;
			}
		}
		if (Class365.aClass369_1 == null) {
			return;
		}
		Class365.aClass369_1.method28301(Exception_Sub7.aLong155 * -6524789075775222403L, Class103_Sub2.aString24, Class348.aString192, Class8.anInt17 * 1829723953, Class365.aClass360_19, 2023967921);
		if (Class365.anInterface30Array1 == null) {
			return;
		}
		for (@Pc(161) int local161 = Class365.anInt4499 * 669442271 + 1; local161 < Class365.anInterface30Array1.length; local161++) {
			if (Class365.anInterface30Array1[local161].method28351(-2091250211) >= 100 && Class365.anInt4499 * 669442271 == local161 - 1 && client.anInt3433 * 1994758437 != 5 && Class365.aClass369_1.method28327(2102067032)) {
				try {
					Class365.anInterface30Array1[local161].method28342(1211156287);
				} catch (@Pc(195) Exception local195) {
					Class365.anInterface30Array1 = null;
					break;
				}
				Class365.aClass369_1.method28300(Class365.anInterface30Array1[local161], (byte) 67);
				Class365.anInt4499 += -1865098465;
				if (Class365.anInt4499 * 669442271 >= Class365.anInterface30Array1.length - 1 && Class365.anInterface30Array1.length > 1) {
					Class365.anInt4499 = (Class384.aClass90_1.method1860((byte) 43) ? 0 : -1) * -1865098465;
				}
			}
		}
	}

	@OriginalMember(owner = "client!en", name = "ff", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;I)V")
	static void method26314(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		arg2.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg2.anIntArray525[arg2.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg2.anIntArray525[arg2.anInt5778 * 1896589581 + 1];
		@Pc(29) Class79 local29 = (Class79) Class370.aClass41_Sub10_1.method18054(local13, 1828645022);
		if (local29.anInt253 * 680817871 == local23) {
			arg0.method27652(local13, -1366326138);
		} else {
			arg0.method27646(local13, local23, -255893355);
		}
	}

	@OriginalMember(owner = "client!en", name = "rv", descriptor = "(Lclient!yp;B)V")
	static void method26315(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local11.anInt4114 * 671136973;
	}

	@OriginalMember(owner = "client!en", name = "zb", descriptor = "(Lclient!yp;I)V")
	static void method26316(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (client.anInt3577 * 740205413 != 2 || local12 >= client.anInt3573 * 975306769) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
			return;
		}
		@Pc(26) Class676 local26 = client.aClass676Array1[local12];
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local26.aString236;
		if (local26.aString237 == null) {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		} else {
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local26.aString237;
		}
	}

	@OriginalMember(owner = "client!en", name = "abh", descriptor = "(Lclient!yp;B)V")
	static void method26317(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.aClass699Array1[local12].aBoolean992 ? 1 : 0;
	}

	@OriginalMember(owner = "client!en", name = "asu", descriptor = "(Lclient!yp;B)V")
	static void method26318(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub6_1, local12, (byte) 58);
		Class719.method37291(1751104110);
		client.aBoolean714 = false;
	}

	@OriginalMember(owner = "client!en", name = "bfl", descriptor = "(Lclient!yp;B)V")
	static void method26319(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 1;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "([BS)V")
	static void method26320(@OriginalArg(0) byte[] arg0, @OriginalArg(1) short arg1) {
		@Pc(4) Class80_Sub36 local4 = new Class80_Sub36(arg0);
		while (true) {
			@Pc(8) int local8 = local4.method23362(-1622716313);
			if (local8 == 0) {
				return;
			}
			if (local8 == 1) {
				@Pc(19) int local19 = local4.method23178((byte) -20);
				Class490.aClass263_13.method26540(local19, (byte) 50);
			}
		}
	}

	@OriginalMember(owner = "client!en", name = "i", descriptor = "(I)V")
	public static void method26321(@OriginalArg(0) int arg0) {
		if (client.anInt3433 * 1994758437 != 18 && client.anInt3433 * 1994758437 != 3 || client.aClass75_1 == null) {
			return;
		}
		while (true) {
			@Pc(16) Interface66 local16 = (Interface66) Class604.aLinkedList5.poll();
			if (local16 == null) {
				return;
			}
			local16.method32127(-1025961657);
		}
	}

	@OriginalMember(owner = "client!en", name = "g", descriptor = "(B)V")
	static void method26322(@OriginalArg(0) byte arg0) {
		@Pc(2) Class243 local2 = Class430.aClass243_81;
		synchronized (Class430.aClass243_81) {
			Class430.aClass243_81.method26259((byte) 3);
		}
	}

	@OriginalMember(owner = "client!en", name = "g", descriptor = "(II)V")
	public static void method26323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(3, (long) arg0);
		local4.method22078(-2060816514);
	}

	@OriginalMember(owner = "client!en", name = "o", descriptor = "(Lclient!kb;B)I")
	@Override
	public int method36978(@OriginalArg(0) Class374 arg0, @OriginalArg(1) byte arg1) {
		@Pc(10) Class80_Sub20 local10 = (Class80_Sub20) Class251.aClass24_25.method560((long) (arg0.anInt4508 * 1922751929) | 0x100000000L);
		return local10 == null ? Class672.aClass134_1.method36978(arg0, (byte) -68) : local10.anInt1588 * 701000167;
	}

	@OriginalMember(owner = "client!en", name = "m", descriptor = "(Lclient!ea;I)I")
	@Override
	public int method36980(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class80_Sub20 local8 = (Class80_Sub20) Class251.aClass24_25.method560((long) (arg0.anInt862 * -1873516487));
		return local8 == null ? Class672.aClass134_1.method36980(arg0, -1143060250) : local8.anInt1588 * 701000167;
	}

	@OriginalMember(owner = "client!en", name = "ay", descriptor = "(Lclient!ea;)I")
	@Override
	public int method36977(@OriginalArg(0) Class107 arg0) {
		@Pc(8) Class80_Sub20 local8 = (Class80_Sub20) Class251.aClass24_25.method560((long) (arg0.anInt862 * -1873516487));
		return local8 == null ? Class672.aClass134_1.method36980(arg0, 1405592381) : local8.anInt1588 * 701000167;
	}

	@OriginalMember(owner = "client!en", name = "ax", descriptor = "(Lclient!ea;)I")
	@Override
	public int method36979(@OriginalArg(0) Class107 arg0) {
		@Pc(8) Class80_Sub20 local8 = (Class80_Sub20) Class251.aClass24_25.method560((long) (arg0.anInt862 * -1873516487));
		return local8 == null ? Class672.aClass134_1.method36980(arg0, -778324157) : local8.anInt1588 * 701000167;
	}

	@OriginalMember(owner = "client!en", name = "ai", descriptor = "(Lclient!kb;)I")
	@Override
	public int method36981(@OriginalArg(0) Class374 arg0) {
		@Pc(10) Class80_Sub20 local10 = (Class80_Sub20) Class251.aClass24_25.method560((long) (arg0.anInt4508 * 1922751929) | 0x100000000L);
		return local10 == null ? Class672.aClass134_1.method36978(arg0, (byte) -66) : local10.anInt1588 * 701000167;
	}

	@OriginalMember(owner = "client!en", name = "aq", descriptor = "(Lclient!kb;)I")
	@Override
	public int method36982(@OriginalArg(0) Class374 arg0) {
		@Pc(10) Class80_Sub20 local10 = (Class80_Sub20) Class251.aClass24_25.method560((long) (arg0.anInt4508 * 1922751929) | 0x100000000L);
		return local10 == null ? Class672.aClass134_1.method36978(arg0, (byte) -33) : local10.anInt1588 * 701000167;
	}
}
