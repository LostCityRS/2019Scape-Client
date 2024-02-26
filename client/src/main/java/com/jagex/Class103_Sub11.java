package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agg")
public final class Class103_Sub11 extends Class103 {

	@OriginalMember(owner = "client!agg", name = "f", descriptor = "I")
	int anInt948;

	@OriginalMember(owner = "client!agg", name = "e", descriptor = "Ljava/lang/String;")
	final String aString28;

	@OriginalMember(owner = "client!agg", name = "u", descriptor = "I")
	final int anInt949;

	@OriginalMember(owner = "client!agg", name = "l", descriptor = "I")
	final int anInt950;

	@OriginalMember(owner = "client!agg", name = "vy", descriptor = "(Lclient!yp;B)V")
	static void method7905(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		Class79.method1430(local13, new Class80_Sub40(local23, 3), null, true, -1835640862);
	}

	@OriginalMember(owner = "client!agg", name = "ab", descriptor = "(ILjava/lang/String;I)V")
	static void method7906(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(3, (long) arg0);
		local4.method22135(-457826299);
		local4.aString102 = arg1;
	}

	@OriginalMember(owner = "client!agg", name = "bb", descriptor = "(Lclient!arz;IIZI)V")
	static void method7907(@OriginalArg(0) Class80_Sub1_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		if (arg0 == null || arg0 == Class630.aClass8_55.aClass80_3) {
			return;
		}
		@Pc(12) int local12 = arg0.anInt3076 * 2065388359;
		@Pc(17) int local17 = arg0.anInt3078 * 1896675471;
		@Pc(22) int local22 = arg0.anInt3079 * 1479399259;
		@Pc(28) int local28 = (int) (arg0.aLong248 * 7780148905970551279L);
		@Pc(33) long local33 = arg0.aLong248 * 7780148905970551279L;
		if (local22 >= 2000) {
			local22 -= 2000;
		}
		@Pc(41) Class626 local41 = client.aClass539_1.method30893((byte) -124);
		if (local22 == 25) {
			@Pc(49) Class327 local49 = Class369.method28340(local17, local12, -1668739906);
			if (local49 != null) {
				Class450.method29279((byte) 45);
				@Pc(56) Class80_Sub27 local56 = client.method25326(local49);
				Class723.method37343(local49, local56.method14325(1360354992), local56.anInt1636 * -909045709, (short) -20769);
				client.aString149 = Class669.method33496(local49, -1593869399);
				if (client.aString149 == null) {
					client.aString149 = "Null";
				}
				client.aString146 = local49.aString184 + Class90.method1870(16777215, -1759740037);
			}
			return;
		}
		@Pc(121) Class80_Sub31 local121;
		if (local22 == 8) {
			@Pc(96) Class80_Sub19 local96 = (Class80_Sub19) client.aClass24_18.method560((long) local28);
			if (local96 != null) {
				@Pc(103) Class120_Sub1_Sub1_Sub1_Sub1 local103 = (Class120_Sub1_Sub1_Sub1_Sub1) local96.anObject5;
				client.anInt3500 = arg1 * -819515597;
				client.anInt3501 = arg2 * 380483957;
				client.anInt3514 = -813124122;
				client.anInt3485 = 0;
				local121 = Class623.method32440(Class443.aClass443_114, client.aClass75_1.aClass22_1, -191270971);
				local121.aClass80_Sub36_Sub1_2.method23155(client.anInt3527 * 206551609, (byte) -1);
				local121.aClass80_Sub36_Sub1_2.method23345(Class86.anInt284 * 531357219, (byte) 21);
				local121.aClass80_Sub36_Sub1_2.method23219(local28, 1878436097);
				local121.aClass80_Sub36_Sub1_2.method23155(client.anInt3526 * 1831183447, (byte) -35);
				local121.aClass80_Sub36_Sub1_2.method23351(Class519.method30604(886292528) ? 1 : 0, -711109028);
				client.aClass75_1.method1325(local121, (byte) -92);
				Class103_Sub13.method7939(local103.anIntArray234[0], local103.anIntArray242[0], 1596974813);
			}
		}
		@Pc(173) Class443 local173 = null;
		if (local22 == 9) {
			local173 = Class443.aClass443_2;
		} else if (local22 == 10) {
			local173 = Class443.aClass443_44;
		} else if (local22 == 11) {
			local173 = Class443.aClass443_117;
		} else if (local22 == 12) {
			local173 = Class443.aClass443_33;
		} else if (local22 == 13) {
			local173 = Class443.aClass443_4;
		} else if (local22 == 1003) {
			local173 = Class443.aClass443_85;
		}
		if (local173 != null) {
			@Pc(217) Class80_Sub19 local217 = (Class80_Sub19) client.aClass24_18.method560((long) local28);
			if (local217 != null) {
				@Pc(224) Class120_Sub1_Sub1_Sub1_Sub1 local224 = (Class120_Sub1_Sub1_Sub1_Sub1) local217.anObject5;
				client.anInt3500 = arg1 * -819515597;
				client.anInt3501 = arg2 * 380483957;
				client.anInt3514 = -813124122;
				client.anInt3485 = 0;
				@Pc(242) Class80_Sub31 local242 = Class623.method32440(local173, client.aClass75_1.aClass22_1, -191270971);
				local242.aClass80_Sub36_Sub1_2.method23209(Class519.method30604(-304432671) ? 1 : 0, 78345922);
				local242.aClass80_Sub36_Sub1_2.method23218(local28, 1673014664);
				client.aClass75_1.method1325(local242, (byte) -120);
				Class103_Sub13.method7939(local224.anIntArray234[0], local224.anIntArray242[0], 1213687268);
			}
		}
		if (local22 == 59) {
			client.anInt3500 = arg1 * -819515597;
			client.anInt3501 = arg2 * 380483957;
			client.anInt3514 = 1740921587;
			client.anInt3485 = 0;
			@Pc(292) Class80_Sub31 local292 = Class623.method32440(Class443.aClass443_61, client.aClass75_1.aClass22_1, -191270971);
			local292.aClass80_Sub36_Sub1_2.method23155(client.anInt3527 * 206551609, (byte) -93);
			local292.aClass80_Sub36_Sub1_2.method23155(local41.anInt5537 * -894305615 + local17, (byte) -127);
			local292.aClass80_Sub36_Sub1_2.method23410(Class86.anInt284 * 531357219, (byte) -123);
			local292.aClass80_Sub36_Sub1_2.method23219(local12 + local41.anInt5540 * -390642507, 1989014734);
			local292.aClass80_Sub36_Sub1_2.method23218(client.anInt3526 * 1831183447, 1673014664);
			client.aClass75_1.method1325(local292, (byte) -51);
			Class103_Sub13.method7939(local12, local17, 684920064);
		}
		if (local22 == 30 && client.aClass327_10 == null) {
			Class565.method31481(local17, local12, 1451090564);
			client.aClass327_10 = Class369.method28340(local17, local12, 2122559092);
			if (client.aClass327_10 != null) {
				Class296.method26998(client.aClass327_10, -808890013);
			}
		}
		if (local22 == 15) {
			@Pc(368) Class120_Sub1_Sub1_Sub1_Sub2 local368 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local368 != null) {
				client.anInt3500 = arg1 * -819515597;
				client.anInt3501 = arg2 * 380483957;
				client.anInt3514 = -813124122;
				client.anInt3485 = 0;
				local121 = Class623.method32440(Class443.aClass443_80, client.aClass75_1.aClass22_1, -191270971);
				local121.aClass80_Sub36_Sub1_2.method23219(local28, 475032891);
				local121.aClass80_Sub36_Sub1_2.method23154(Class519.method30604(-1070458772) ? 1 : 0, 1275868335);
				local121.aClass80_Sub36_Sub1_2.method23219(client.anInt3527 * 206551609, 171950379);
				local121.aClass80_Sub36_Sub1_2.method23218(client.anInt3526 * 1831183447, 1673014664);
				local121.aClass80_Sub36_Sub1_2.method23229(Class86.anInt284 * 531357219, 1476678554);
				client.aClass75_1.method1325(local121, (byte) -31);
				Class103_Sub13.method7939(local368.anIntArray234[0], local368.anIntArray242[0], 1577177480);
			}
		}
		@Pc(441) Class443 local441 = null;
		if (local22 == 18) {
			local441 = Class443.aClass443_82;
		} else if (local22 == 19) {
			local441 = Class443.aClass443_27;
		} else if (local22 == 20) {
			local441 = Class443.aClass443_28;
		} else if (local22 == 21) {
			local441 = Class443.aClass443_122;
		} else if (local22 == 22) {
			local441 = Class443.aClass443_18;
		} else if (local22 == 1004) {
			local441 = Class443.aClass443_103;
		}
		if (local441 != null) {
			client.anInt3500 = arg1 * -819515597;
			client.anInt3501 = arg2 * 380483957;
			client.anInt3514 = -813124122;
			client.anInt3485 = 0;
			local121 = Class623.method32440(local441, client.aClass75_1.aClass22_1, -191270971);
			local121.aClass80_Sub36_Sub1_2.method23218(local28, 1673014664);
			local121.aClass80_Sub36_Sub1_2.method23220(local41.anInt5537 * -894305615 + local17, 2036747717);
			local121.aClass80_Sub36_Sub1_2.method23218(local41.anInt5540 * -390642507 + local12, 1673014664);
			local121.aClass80_Sub36_Sub1_2.method23351((arg3 ? 2 : 0) | (Class519.method30604(-1896887984) ? 1 : 0), -711109028);
			client.aClass75_1.method1325(local121, (byte) -13);
			Class103_Sub13.method7939(local12, local17, 789990746);
		}
		if (local22 == 60) {
			if (client.anInt3512 * -780671365 > 0 && Class24.method583(1479624119)) {
				Class657.method33227(Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99, local41.anInt5540 * -390642507 + local12, local41.anInt5537 * -894305615 + local17, 196293592);
			} else {
				client.anInt3500 = arg1 * -819515597;
				client.anInt3501 = arg2 * 380483957;
				client.anInt3514 = 1740921587;
				client.anInt3485 = 0;
				local121 = Class623.method32440(Class443.aClass443_108, client.aClass75_1.aClass22_1, -191270971);
				local121.aClass80_Sub36_Sub1_2.method23219(local41.anInt5537 * -894305615 + local17, 657587080);
				local121.aClass80_Sub36_Sub1_2.method23218(local12 + local41.anInt5540 * -390642507, 1673014664);
				client.aClass75_1.method1325(local121, (byte) -66);
			}
		}
		if (local22 == 58) {
			@Pc(623) Class327 local623 = Class369.method28340(local17, local12, 74386614);
			if (local623 != null) {
				Class606.method32162(local623, -2007126626);
			}
		}
		if (local22 == 2) {
			client.anInt3500 = arg1 * -819515597;
			client.anInt3501 = arg2 * 380483957;
			client.anInt3514 = -813124122;
			client.anInt3485 = 0;
			local121 = Class623.method32440(Class443.aClass443_23, client.aClass75_1.aClass22_1, -191270971);
			local121.aClass80_Sub36_Sub1_2.method23155(client.anInt3526 * 1831183447, (byte) -72);
			local121.aClass80_Sub36_Sub1_2.method23218(client.anInt3527 * 206551609, 1673014664);
			local121.aClass80_Sub36_Sub1_2.method23220(local41.anInt5540 * -390642507 + local12, 2036747717);
			local121.aClass80_Sub36_Sub1_2.method23154(Class519.method30604(503549013) ? 1 : 0, 1275868335);
			local121.aClass80_Sub36_Sub1_2.method23229(Class86.anInt284 * 531357219, 262810863);
			local121.aClass80_Sub36_Sub1_2.method23219(local41.anInt5537 * -894305615 + local17, 2068080198);
			local121.aClass80_Sub36_Sub1_2.method23410((int) (local33 >>> 32) & Integer.MAX_VALUE, (byte) -124);
			client.aClass75_1.method1325(local121, (byte) -46);
			Class103_Sub13.method7939(local12, local17, 1085551723);
		}
		if (local22 == 16) {
			client.anInt3500 = arg1 * -819515597;
			client.anInt3501 = arg2 * 380483957;
			client.anInt3514 = -813124122;
			client.anInt3485 = 0;
			local121 = Class623.method32440(Class443.aClass443_80, client.aClass75_1.aClass22_1, -191270971);
			local121.aClass80_Sub36_Sub1_2.method23219(Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anInt2671 * 1078276675, 1129330003);
			local121.aClass80_Sub36_Sub1_2.method23154(Class519.method30604(-1749746593) ? 1 : 0, 1275868335);
			local121.aClass80_Sub36_Sub1_2.method23219(client.anInt3527 * 206551609, 2091175856);
			local121.aClass80_Sub36_Sub1_2.method23218(client.anInt3526 * 1831183447, 1673014664);
			local121.aClass80_Sub36_Sub1_2.method23229(Class86.anInt284 * 531357219, 378705456);
			client.aClass75_1.method1325(local121, (byte) -86);
		}
		if (local22 == 23) {
			if (client.anInt3512 * -780671365 > 0 && Class24.method583(1479624119)) {
				Class657.method33227(Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99, local41.anInt5540 * -390642507 + local12, local17 + local41.anInt5537 * -894305615, 790508122);
			} else {
				local121 = Class681.method36701(local12, local17, local28, (byte) 1);
				if (local28 == 1) {
					local121.aClass80_Sub36_Sub1_2.method23154(-1, 1275868335);
					local121.aClass80_Sub36_Sub1_2.method23154(-1, 1275868335);
					local121.aClass80_Sub36_Sub1_2.method23155((int) client.aFloat255, (byte) -1);
					local121.aClass80_Sub36_Sub1_2.method23154(57, 1275868335);
					local121.aClass80_Sub36_Sub1_2.method23154(client.anInt3474 * -1918431893, 1275868335);
					local121.aClass80_Sub36_Sub1_2.method23154(client.anInt3476 * -692320695, 1275868335);
					local121.aClass80_Sub36_Sub1_2.method23154(89, 1275868335);
					@Pc(863) Class463 local863 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method24552().aClass463_61;
					local121.aClass80_Sub36_Sub1_2.method23155((int) local863.aFloat297, (byte) -3);
					local121.aClass80_Sub36_Sub1_2.method23155((int) local863.aFloat296, (byte) -118);
					local121.aClass80_Sub36_Sub1_2.method23154(63, 1275868335);
				} else {
					client.anInt3500 = arg1 * -819515597;
					client.anInt3501 = arg2 * 380483957;
					client.anInt3514 = 1740921587;
					client.anInt3485 = 0;
				}
				client.aClass75_1.method1325(local121, (byte) -16);
				Class103_Sub13.method7939(local12, local17, 1730815953);
			}
		}
		if (local22 == 57 || local22 == 1007) {
			Class665.method33454(local28, local17, local12, arg0.aString105, 835782350);
		}
		@Pc(918) Class443 local918 = null;
		if (local22 == 44) {
			local918 = Class443.aClass443_118;
		} else if (local22 == 45) {
			local918 = Class443.aClass443_64;
		} else if (local22 == 46) {
			local918 = Class443.aClass443_78;
		} else if (local22 == 47) {
			local918 = Class443.aClass443_56;
		} else if (local22 == 48) {
			local918 = Class443.aClass443_51;
		} else if (local22 == 49) {
			local918 = Class443.aClass443_6;
		} else if (local22 == 50) {
			local918 = Class443.aClass443_22;
		} else if (local22 == 51) {
			local918 = Class443.aClass443_91;
		} else if (local22 == 52) {
			local918 = Class443.aClass443_102;
		} else if (local22 == 53) {
			local918 = Class443.aClass443_92;
		}
		@Pc(1004) Class80_Sub31 local1004;
		if (local918 != null) {
			@Pc(984) Class120_Sub1_Sub1_Sub1_Sub2 local984 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local984 != null) {
				client.anInt3500 = arg1 * -819515597;
				client.anInt3501 = arg2 * 380483957;
				client.anInt3514 = -813124122;
				client.anInt3485 = 0;
				local1004 = Class623.method32440(local918, client.aClass75_1.aClass22_1, -191270971);
				local1004.aClass80_Sub36_Sub1_2.method23218(local28, 1673014664);
				local1004.aClass80_Sub36_Sub1_2.method23211(Class519.method30604(-1484650279) ? 1 : 0, -183466620);
				client.aClass75_1.method1325(local1004, (byte) -13);
				Class103_Sub13.method7939(local984.anIntArray234[0], local984.anIntArray242[0], 1538815780);
			}
		}
		@Pc(1035) Class443 local1035 = null;
		if (local22 == 3) {
			local1035 = Class443.aClass443_14;
		} else if (local22 == 4) {
			local1035 = Class443.aClass443_26;
		} else if (local22 == 5) {
			local1035 = Class443.aClass443_29;
		} else if (local22 == 6) {
			local1035 = Class443.aClass443_63;
		} else if (local22 == 1001) {
			local1035 = Class443.aClass443_120;
		} else if (local22 == 1002) {
			local1035 = Class443.aClass443_41;
		}
		if (local1035 != null) {
			client.anInt3500 = arg1 * -819515597;
			client.anInt3501 = arg2 * 380483957;
			client.anInt3514 = -813124122;
			client.anInt3485 = 0;
			local1004 = Class623.method32440(local1035, client.aClass75_1.aClass22_1, -191270971);
			local1004.aClass80_Sub36_Sub1_2.method23155(local12 + local41.anInt5540 * -390642507, (byte) -80);
			local1004.aClass80_Sub36_Sub1_2.method23250((int) (local33 >>> 32) & Integer.MAX_VALUE, -713073138);
			local1004.aClass80_Sub36_Sub1_2.method23209(Class519.method30604(234403495) ? 1 : 0, -793392349);
			local1004.aClass80_Sub36_Sub1_2.method23219(local41.anInt5537 * -894305615 + local17, 2091236934);
			client.aClass75_1.method1325(local1004, (byte) -105);
			Class103_Sub13.method7939(local12, local17, 961670380);
		}
		if (local22 == 17) {
			client.anInt3500 = arg1 * -819515597;
			client.anInt3501 = arg2 * 380483957;
			client.anInt3514 = -813124122;
			client.anInt3485 = 0;
			local1004 = Class623.method32440(Class443.aClass443_75, client.aClass75_1.aClass22_1, -191270971);
			local1004.aClass80_Sub36_Sub1_2.method23229(Class86.anInt284 * 531357219, 366850130);
			local1004.aClass80_Sub36_Sub1_2.method23220(client.anInt3527 * 206551609, 2036747717);
			local1004.aClass80_Sub36_Sub1_2.method23154(Class519.method30604(1332110199) ? 1 : 0, 1275868335);
			local1004.aClass80_Sub36_Sub1_2.method23218(local28, 1673014664);
			local1004.aClass80_Sub36_Sub1_2.method23155(local41.anInt5537 * -894305615 + local17, (byte) -6);
			local1004.aClass80_Sub36_Sub1_2.method23218(local41.anInt5540 * -390642507 + local12, 1673014664);
			local1004.aClass80_Sub36_Sub1_2.method23218(client.anInt3526 * 1831183447, 1673014664);
			client.aClass75_1.method1325(local1004, (byte) -84);
			Class103_Sub13.method7939(local12, local17, 839014315);
		}
		if (local22 == 1008 || local22 == 1009 || local22 == 1010 || local22 == 1011 || local22 == 1012) {
			Class579.method31810(local22, local28, local12, (byte) -3);
		}
		if (client.aBoolean728) {
			Class450.method29279((byte) 45);
		}
		if (Class112.aClass327_2 != null && client.anInt3458 * -1117500407 == 0) {
			Class296.method26998(Class112.aClass327_2, -747960972);
		}
	}

	@OriginalMember(owner = "client!agg", name = "<init>", descriptor = "(Lclient!ald;)V")
	Class103_Sub11(@OriginalArg(0) Class80_Sub36 arg0) {
		super(arg0);
		this.anInt948 = arg0.method23178((byte) -84) * 1403006543;
		this.aString28 = arg0.method23376((short) 21207);
		this.anInt949 = arg0.method23182(1538503459) * -900351105;
		this.anInt950 = arg0.method23178((byte) -37) * -1523910417;
	}

	@OriginalMember(owner = "client!agg", name = "f", descriptor = "(I)V")
	@Override
	public void method19206(@OriginalArg(0) int arg0) {
		Class251.aClass254Array1[this.anInt948 * -1602475857].method26399((byte) 1).method18975(this.aString28, this.anInt949 * 611714175, 0, this.anInt950 * 1670854159, (short) -9989);
	}

	@OriginalMember(owner = "client!agg", name = "g", descriptor = "()V")
	@Override
	public void method19202() {
		Class251.aClass254Array1[this.anInt948 * -1602475857].method26399((byte) 5).method18975(this.aString28, this.anInt949 * 611714175, 0, this.anInt950 * 1670854159, (short) -8221);
	}

	@OriginalMember(owner = "client!agg", name = "l", descriptor = "()V")
	@Override
	public void method19198() {
		Class251.aClass254Array1[this.anInt948 * -1602475857].method26399((byte) -9).method18975(this.aString28, this.anInt949 * 611714175, 0, this.anInt950 * 1670854159, (short) -11365);
	}
}
