package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

import java.io.IOException;
import java.net.URL;

@OriginalClass("client!th")
public class Class147 {

	@OriginalMember(owner = "client!th", name = "f", descriptor = "Lclient!th;")
	public Class147 aClass147_19;

	@OriginalMember(owner = "client!th", name = "t", descriptor = "Lclient!th;")
	public Class147 aClass147_20;

	@OriginalMember(owner = "client!th", name = "adr", descriptor = "(Lclient!yp;B)V")
	static void method23928(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local13 / local23;
	}

	@OriginalMember(owner = "client!th", name = "afa", descriptor = "(Lclient!yp;B)V")
	static void method23929(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		arg0.anInt5778 -= -221471862;
		@Pc(27) int local27 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(37) int local37 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(43) Class15 local43 = Class317.aClass464_1.method29594(client.anInterface49_1, local37, (byte) 1);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local43.method378(local13, local27, Class344.aClass99Array6, (short) 128);
	}

	@OriginalMember(owner = "client!th", name = "d", descriptor = "(B)V")
	static void method23930(@OriginalArg(0) byte arg0) {
		if (Class238.anInt3841 * 1722349977 == 4 || Class238.anInt3841 * 1722349977 == 104) {
			return;
		}
		try {
			@Pc(21) short local21;
			if (Class238.anInt3845 * -1074608813 == 0 && Class238.anInt3841 * 1722349977 < 92) {
				local21 = 500;
			} else {
				local21 = 2000;
			}
			if (Class238.aBoolean769 && Class238.anInt3841 * 1722349977 >= 65) {
				local21 = 6000;
			}
			if (Class238.anInt3812 * -1746286503 == 265 && Class238.anInt3841 * 1722349977 != 211 && Class238.anInt3846 * -378193585 != 42 || Class238.anInt3812 * -1746286503 == 180 && Class238.anInt3850 * -1514170191 != 49 && Class238.anInt3850 * -1514170191 != 52) {
				Class238.anInt3814 += -1085606885;
			}
			if (Class238.anInt3814 * -635845101 > local21) {
				Class238.aClass75_3.method1319((short) 468);
				if (Class238.anInt3845 * -1074608813 >= 3) {
					Class238.anInt3841 = -1688917340;
					Class530.method30812(-5, -1031180560);
					Class570.method31723(865902806);
					return;
				}
				if (Class238.anInt3812 * -1746286503 == 265) {
					Class47.aClass28_6.method656((byte) -24);
				} else {
					Class47.aClass28_3.method656((byte) -28);
				}
				Class238.anInt3814 = 0;
				Class238.anInt3845 += 757188315;
				Class238.anInt3841 = -771784724;
			}
			@Pc(159) Class80_Sub31 local159;
			if (Class238.anInt3841 * 1722349977 == 12) {
				if (Class238.anInt3812 * -1746286503 == 265) {
					Class238.aClass75_3.method1316(Class411.method28965(Class47.aClass28_6.method655(2007586404), 40000, (byte) -107), Class47.aClass28_6.aString4, -2090814239);
				} else {
					Class238.aClass75_3.method1316(Class411.method28965(Class47.aClass28_3.method655(1200099764), 40000, (byte) -82), Class47.aClass28_3.aString4, -1980591746);
				}
				if (Class66.aSecureRandom1 == null) {
					Class66.aSecureRandom1 = client.aClass168_1.method18543((byte) -59);
					client.aClass168_1.method18544((byte) 1);
					client.aClass168_1 = null;
				}
				Class238.aClass75_3.method1314(1587586714);
				local159 = Class668.method33490(2098618374);
				local159.aPacketBit_2.p1(Class436.aClass436_10.anInt4802 * 663664571);
				Class238.aClass75_3.method1325(local159, (byte) -124);
				Class238.aClass75_3.method1315(1492179632);
				Class238.anInt3841 = -1012329194;
			}
			@Pc(209) int local209;
			if (Class238.anInt3841 * 1722349977 == 38) {
				if (!Class238.aClass75_3.method1321((byte) 2).method15545(9, (byte) 11)) {
					return;
				}
				Class238.aClass75_3.method1321((byte) 2).method15551(Class238.aClass75_3.aPacketBit_1.data, 0, 9, -1881203368);
				Class238.aClass75_3.aPacketBit_1.pos = 0;
				local209 = Class238.aClass75_3.aPacketBit_1.g1();
				if (local209 != 0) {
					Class238.anInt3841 = -1688917340;
					Class571.method31733(local209, -616338719);
					Class530.method30812(local209, 813929888);
					Class238.aClass75_3.method1319((short) 468);
					Class570.method31723(240295133);
					return;
				}
				Class238.aLong357 = Class238.aClass75_3.aPacketBit_1.g8() * 3564740782975379565L;
				Class238.aClass75_3.aPacketBit_1.pos = 0;
				if (Class238.aBoolean769) {
					Class238.anInt3841 = 466225383;
				} else {
					Class238.anInt3841 = 581391568;
				}
			}
			@Pc(271) int local271;
			@Pc(331) int local331;
			if (Class238.anInt3841 * 1722349977 == 271) {
				local159 = Class668.method33490(2091953790);
				local159.aPacketBit_2.p1(Class436.aClass436_9.anInt4802 * 663664571);
				local159.aPacketBit_2.p2(0);
				local271 = local159.aPacketBit_2.pos * -1380987821;
				local159.aPacketBit_2.p4(910);
				local159.aPacketBit_2.p4(1);
				if (Class238.anInt3812 * -1746286503 == 265) {
					local159.aPacketBit_2.p1(client.anInt3433 * 1994758437 == 14 ? 1 : 0);
				}
				@Pc(301) Packet local301 = Class41_Sub7.method17258(-1607572506);
				Class420.method29011(local301, (long) (Class238.anInt3815 * -2038590069));
				Class325.aLong368 = (long) Class238.anInt3815 * 7027300436347565927L;
				local301.p1(Class238.anInt3815 * -2038590069);
				local301.p1(Class512.aClass719_3.method37268());
				local301.p4(client.anInt3426 * -622206633);
				for (local331 = 0; local331 < 5; local331++) {
					local301.p4(Class66.aSecureRandom1.nextInt());
				}
				local301.p8(client.aLong350 * 1066294735814990989L);
				local301.p1(client.aClass722_4.anInt5829 * 1531299647);
				local301.p1(Class66.aSecureRandom1.nextInt());
				local301.rsaenc(Class174.aBigInteger1, Class174.aBigInteger2);
				local159.aPacketBit_2.pdata(local301.data, 0, local301.pos * -1380987821);
				local159.aPacketBit_2.p2check(local159.aPacketBit_2.pos * -1380987821 - local271);
				Class238.aClass75_3.method1325(local159, (byte) -22);
				Class238.aClass75_3.method1315(-2379259);
				Class238.anInt3841 = 290695784;
			}
			if (Class238.anInt3841 * 1722349977 == 40) {
				if (!Class238.aClass75_3.method1321((byte) 2).method15545(2, (byte) -66)) {
					return;
				}
				Class238.aClass75_3.method1321((byte) 2).method15551(Class238.aClass75_3.aPacketBit_1.data, 0, 2, -1992152046);
				Class238.aClass75_3.aPacketBit_1.pos = 0;
				Class238.aClass75_3.aPacketBit_1.pos = Class238.aClass75_3.aPacketBit_1.g2() * 1034180571;
				Class238.anInt3841 = -1784113918;
			}
			if (Class238.anInt3841 * 1722349977 == 50) {
				if (!Class238.aClass75_3.method1321((byte) 2).method15545(Class238.aClass75_3.aPacketBit_1.pos * -1380987821, (byte) -118)) {
					return;
				}
				Class238.aClass75_3.method1321((byte) 2).method15551(Class238.aClass75_3.aPacketBit_1.data, 0, Class238.aClass75_3.aPacketBit_1.pos * -1380987821, -2049912896);
				Class238.aClass75_3.aPacketBit_1.tinydec(Class238.anIntArray354);
				Class238.aClass75_3.aPacketBit_1.pos = 0;
				@Pc(479) String local479 = Class238.aClass75_3.aPacketBit_1.gjstr2();
				Class238.aClass75_3.aPacketBit_1.pos = 0;
				@Pc(487) String local487 = Class442.aClass442_4.method29196(-123406594);
				Class162_Sub1.method15721(local479, true, local487, client.aBoolean734, (byte) 97);
				Class238.anInt3841 = -601361175;
			}
			if (Class238.anInt3841 * 1722349977 == 65) {
				if (!Class238.aClass75_3.method1321((byte) 2).method15545(1, (byte) 55)) {
					return;
				}
				Class238.aClass75_3.method1321((byte) 2).method15551(Class238.aClass75_3.aPacketBit_1.data, 0, 1, -1703597259);
				if ((Class238.aClass75_3.aPacketBit_1.data[0] & 0xFF) == 1) {
					Class238.anInt3841 = 1618796419;
				}
			}
			if (Class238.anInt3841 * 1722349977 == 75) {
				if (!Class238.aClass75_3.method1321((byte) 2).method15545(16, (byte) 104)) {
					return;
				}
				Class238.aClass75_3.method1321((byte) 2).method15551(Class238.aClass75_3.aPacketBit_1.data, 0, 16, -1520377819);
				Class238.aClass75_3.aPacketBit_1.pos = -632980048;
				Class238.aClass75_3.aPacketBit_1.tinydec(Class238.anIntArray354);
				Class238.aClass75_3.aPacketBit_1.pos = 0;
				Class238.aLong356 = Class238.aClass75_3.aPacketBit_1.g8() * -959485551111415569L;
				Class238.aLong358 = Class238.aClass75_3.aPacketBit_1.g8() * 203499416171435583L;
				Class238.anInt3841 = 581391568;
			}
			if (Class238.anInt3841 * 1722349977 == 80) {
				Class238.aClass75_3.aPacketBit_1.pos = 0;
				Class238.aClass75_3.method1314(1587586714);
				local159 = Class668.method33490(2114019167);
				@Pc(601) PacketBit local601 = local159.aPacketBit_2;
				@Pc(634) int local634;
				@Pc(663) Packet local663;
				@Pc(773) Packet local773;
				@Pc(610) Class436 local610;
				if (Class238.anInt3812 * -1746286503 == 265) {
					if (Class238.aBoolean769) {
						local610 = Class436.aClass436_6;
					} else {
						local610 = Class436.aClass436_12;
					}
					local601.p1(local610.anInt4802 * 663664571);
					local601.p2(0);
					local331 = local601.pos * -1380987821;
					local634 = local601.pos * -1380987821;
					if (!Class238.aBoolean769) {
						local601.p4(910);
						local601.p4(1);
						local601.p1(client.anInt3433 * 1994758437 == 14 ? 1 : 0);
						local634 = local601.pos * -1380987821;
						local663 = Class14.method366(-1492053369);
						local601.pdata(local663.data, 0, local663.pos * -1380987821);
						local634 = local601.pos * -1380987821;
						local601.p1(Class238.aLong356 * 4843953102412043791L == -1L ? 1 : 0);
						if (Class238.aLong356 * 4843953102412043791L == -1L) {
							local601.pjstr(Class238.aString154);
						} else {
							local601.p8(Class238.aLong356 * 4843953102412043791L);
						}
					}
					local601.p1(Class17.method437(-1349690784));
					local601.p2(Class80_Sub1_Sub1.anInt254 * -255202897);
					local601.p2(Class80_Sub25.anInt1627 * 167687103);
					local601.p1(Class703.aClass80_Sub37_49.aClass165_Sub43_1.method16849(1538334780));
					Class337.method27874(local601, 1568141236);
					local601.pjstr(client.aString147);
					local601.p4(client.anInt3426 * -622206633);
					local663 = Class703.aClass80_Sub37_49.method14942(-453302767);
					local601.p1(local663.pos * -1380987821);
					local601.pdata(local663.data, 0, local663.pos * -1380987821);
					client.aBoolean714 = true;
					local773 = new Packet(Class705.aClass80_Sub39_1.method15026((byte) 118));
					Class705.aClass80_Sub39_1.method15025(local773, (byte) 3);
					local601.pdata(local773.data, 0, local773.data.length);
					local601.p4(client.anInt3459 * -1828596627);
					local601.p4(client.anInt3428 * 805324377);
					local601.p4(client.anInt3427 * 1329290145);
					local601.p4(client.anInt3450 * -1080683649);
					local601.p4(client.anInt3429 * 1838023237);
					local601.pjstr(Class593.aString228);
					local601.p1(client.aString143 == null ? 0 : 1);
					if (client.aString143 != null) {
						local601.pjstr(client.aString143);
					}
					local601.p1(client.aBoolean705 ? 1 : 0);
					local601.p1(client.aBoolean711 ? 1 : 0);
					local601.p1(Class479.anInt4988 * 863472045 & 0x1);
					local601.p4(client.anInt3437 * 922221607);
					local601.pjstr(client.aString142);
					local601.p1(Class47.aClass28_5 != null && Class47.aClass28_6.anInt89 * 307612145 == Class47.aClass28_5.anInt89 * 307612145 ? 0 : 1);
					local601.p2(Class47.aClass28_3.anInt89 * 307612145);
					Class679.method33623(local601, -1203331866);
					local601.tinyenc(Class238.anIntArray354, local634, local601.pos * -1380987821);
					local601.p2check(local601.pos * -1380987821 - local331);
				} else {
					if (Class238.aBoolean769) {
						local610 = Class436.aClass436_6;
					} else {
						local610 = Class436.aClass436_4;
					}
					local601.p1(local610.anInt4802 * 663664571);
					local601.p2(0);
					local331 = local601.pos * -1380987821;
					local634 = local601.pos * -1380987821;
					if (!Class238.aBoolean769) {
						local601.p4(910);
						local601.p4(1);
						local663 = Class14.method366(-622162264);
						local601.pdata(local663.data, 0, local663.pos * -1380987821);
						local634 = local601.pos * -1380987821;
						local601.p1(Class238.aLong356 * 4843953102412043791L == -1L ? 1 : 0);
						if (Class238.aLong356 * 4843953102412043791L == -1L) {
							local601.pjstr(Class238.aString154);
						} else {
							local601.p8(Class238.aLong356 * 4843953102412043791L);
						}
					}
					local601.p1(client.aClass722_4.anInt5829 * 1531299647);
					local601.p1(Class512.aClass719_3.method37268());
					local601.p1(Class17.method437(-1349690784));
					local601.p2(Class80_Sub1_Sub1.anInt254 * -255202897);
					local601.p2(Class80_Sub25.anInt1627 * 167687103);
					local601.p1(Class703.aClass80_Sub37_49.aClass165_Sub43_1.method16849(1538334780));
					Class337.method27874(local601, -1308937305);
					local601.pjstr(client.aString147);
					local663 = Class703.aClass80_Sub37_49.method14942(-453302767);
					local601.p1(local663.pos * -1380987821);
					local601.pdata(local663.data, 0, local663.pos * -1380987821);
					local773 = new Packet(Class705.aClass80_Sub39_1.method15026((byte) 87));
					Class705.aClass80_Sub39_1.method15025(local773, (byte) 3);
					local601.pdata(local773.data, 0, local773.data.length);
					local601.p4(client.anInt3459 * -1828596627);
					local601.pjstr(Class593.aString228);
					local601.p4(client.anInt3426 * -622206633);
					local601.p4(client.anInt3437 * 922221607);
					local601.pjstr(client.aString142);
					local601.p1(Class479.anInt4988 * 863472045 & 0x1);
					local601.pbool(false);
					Class679.method33623(local601, -1203331866);
					local601.tinyenc(Class238.anIntArray354, local634, local601.pos * -1380987821);
					local601.p2check(local601.pos * -1380987821 - local331);
				}
				Class238.aClass75_3.method1325(local159, (byte) -86);
				Class238.aClass75_3.method1315(2047719611);
				Class238.aClass75_3.aClass22_1 = new Class22(Class238.anIntArray354);
				@Pc(1159) int[] local1159 = new int[4];
				for (local331 = 0; local331 < 4; local331++) {
					local1159[local331] = Class238.anIntArray354[local331] + 50;
				}
				Class238.aClass75_3.aClass22_2 = new Class22(local1159);
				new Class22(local1159);
				Class238.aClass75_3.aPacketBit_1.method22564(Class238.aClass75_3.aClass22_2, -2064733220);
				Class238.anIntArray354 = null;
				Class238.anInt3841 = -190393156;
			}
			if (Class238.anInt3841 * 1722349977 == 92) {
				if (!Class238.aClass75_3.method1321((byte) 2).method15545(1, (byte) -56)) {
					return;
				}
				Class238.aClass75_3.method1321((byte) 2).method15551(Class238.aClass75_3.aPacketBit_1.data, 0, 1, -1875052516);
				local209 = Class238.aClass75_3.aPacketBit_1.g1();
				Class238.aClass75_3.aPacketBit_1.pos = 0;
				if (local209 == 21) {
					Class238.anInt3841 = 1137707479;
				} else if (local209 == 1) {
					Class238.anInt3841 = -962177880;
					Class530.method30812(local209, -1573490037);
					return;
				} else if (local209 == 52) {
					Class203.anInt3386 = local209 * -1465287057;
					Class238.anInt3841 = -1393115506;
				} else if (local209 == 2) {
					if (Class238.aBoolean772) {
						Class238.aBoolean772 = false;
						Class238.anInt3841 = -771784724;
						return;
					}
					if (Class238.anInt3812 * -1746286503 == 265) {
						Class120_Sub1_Sub1_Sub4.aClass110_Sub1_1.method7297(1829299260);
						Class238.anInt3841 = -2019552338;
					} else {
						Class238.anInt3841 = 1934567860;
					}
				} else if (local209 == 15) {
					Class238.aClass75_3.anInt248 = 920339922;
					Class238.anInt3841 = -1924355760;
				} else if (local209 == 23 && Class238.anInt3845 * -1074608813 < 3) {
					Class238.anInt3814 = 0;
					Class238.anInt3845 += 757188315;
					Class238.anInt3841 = -771784724;
					Class238.aClass75_3.method1319((short) 468);
					return;
				} else if (local209 == 42) {
					Class238.anInt3841 = 30181707;
					Class530.method30812(local209, 578477128);
					return;
				} else if (Class238.anInt3812 * -1746286503 == 180 && local209 == 49 && client.anInt3433 * 1994758437 != 9) {
					if (Class238.anInt3850 * -1514170191 != 52) {
						Class530.method30812(local209, -995349014);
					}
					return;
				} else if (!Class238.aBoolean768 || Class238.aBoolean769 || Class238.anInt3815 * -2038590069 == -1 || local209 != 35) {
					if (local209 != 53) {
						Class238.anInt3841 = -1688917340;
						Class530.method30812(local209, -1869758496);
						Class238.aClass75_3.method1319((short) 468);
						Class570.method31723(2086539992);
						return;
					}
					Class238.anInt3841 = -1899280103;
				} else {
					Class238.aBoolean769 = true;
					Class238.anInt3814 = 0;
					Class238.anInt3841 = -771784724;
					Class238.aClass75_3.method1319((short) 468);
					return;
				}
			}
			if (Class238.anInt3841 * 1722349977 == 127) {
				if (!Class238.aClass75_3.method1321((byte) 2).method15545(1, (byte) 58)) {
					return;
				}
				Class238.aClass75_3.method1321((byte) 2).method15551(Class238.aClass75_3.aPacketBit_1.data, 0, 1, -1144353394);
				local209 = Class238.aClass75_3.aPacketBit_1.data[0] & 0xFF;
				Class238.anInt3847 = local209 * -1979060966;
				Class238.anInt3841 = -1688917340;
				Class530.method30812(21, -213910868);
				Class238.aClass75_3.method1319((short) 468);
				Class570.method31723(121063301);
				return;
			}
			if (Class238.anInt3841 * 1722349977 == 211) {
				if (!Class238.aClass75_3.method1321((byte) 2).method15545(2, (byte) -50)) {
					return;
				}
				Class238.aClass75_3.method1321((byte) 2).method15551(Class238.aClass75_3.aPacketBit_1.data, 0, 2, -1437895821);
				Class238.anInt3852 = ((Class238.aClass75_3.aPacketBit_1.data[1] & 0xFF) + ((Class238.aClass75_3.aPacketBit_1.data[0] & 0xFF) << 8)) * 1192130659;
				Class238.anInt3841 = -190393156;
				return;
			}
			if (Class238.anInt3841 * 1722349977 == 241) {
				if (!Class238.aClass75_3.method1321((byte) 2).method15545(4, (byte) 3)) {
					return;
				}
				Class238.aClass75_3.method1321((byte) 2).method15551(Class238.aClass75_3.aPacketBit_1.data, 0, 4, -1861027099);
				Class238.anInt3854 = Class238.aClass75_3.aPacketBit_1.g4() * -1188382969;
				Class238.aClass75_3.aPacketBit_1.pos = 0;
				Class238.anInt3841 = -1688917340;
				Class530.method30812(53, 368633066);
				Class238.aClass75_3.method1319((short) 468);
				Class570.method31723(1378973383);
				return;
			}
			if (Class238.anInt3841 * 1722349977 == 195) {
				if (Class203.anInt3386 * 285450383 == 29) {
					if (!Class238.aClass75_3.method1321((byte) 2).method15545(1, (byte) -85)) {
						return;
					}
					Class238.aClass75_3.method1321((byte) 2).method15551(Class238.aClass75_3.aPacketBit_1.data, 0, 1, -1743556737);
					Class238.anInt3853 = (Class238.aClass75_3.aPacketBit_1.data[0] & 0xFF) * -1272474237;
				} else if (Class203.anInt3386 * 285450383 == 45) {
					if (!Class238.aClass75_3.method1321((byte) 2).method15545(3, (byte) -109)) {
						return;
					}
					Class238.aClass75_3.method1321((byte) 2).method15551(Class238.aClass75_3.aPacketBit_1.data, 0, 3, -1366476281);
					Class238.anInt3853 = (Class238.aClass75_3.aPacketBit_1.data[0] & 0xFF) * -1272474237;
					Class238.anInt3851 = ((Class238.aClass75_3.aPacketBit_1.data[2] & 0xFF) + ((Class238.aClass75_3.aPacketBit_1.data[1] & 0xFF) << 8)) * 940669243;
				} else {
					throw new IllegalStateException();
				}
				Class238.anInt3841 = -1688917340;
				Class530.method30812(Class203.anInt3386 * 285450383, -1922527298);
				Class238.aClass75_3.method1319((short) 468);
				Class570.method31723(1130242545);
				if (Class301.method27043(client.anInt3433 * 1994758437, (byte) -54)) {
					Class266.method26657(true, (short) 4422);
					Class238.anInt3846 = Class203.anInt3386 * 1500697793;
				}
				return;
			}
			if (Class238.anInt3841 * 1722349977 == 222) {
				if (!Class238.aClass75_3.method1321((byte) 2).method15545(2, (byte) 72)) {
					return;
				}
				Class238.aClass75_3.method1321((byte) 2).method15551(Class238.aClass75_3.aPacketBit_1.data, 0, 2, -1904122532);
				Class238.aClass75_3.aPacketBit_1.pos = 0;
				Class518.anInt5056 = Class238.aClass75_3.aPacketBit_1.g2() * 276576225;
				Class238.aClass75_3.aPacketBit_1.pos = 0;
				Class238.anInt3841 = 2130067066;
				return;
			}
			if (Class238.anInt3841 * 1722349977 == 234) {
				if (!Class238.aClass75_3.method1321((byte) 2).method15545(Class518.anInt5056 * 874925089, (byte) -74)) {
					return;
				}
				Class238.aClass75_3.method1321((byte) 2).method15551(Class238.aClass75_3.aPacketBit_1.data, 0, Class518.anInt5056 * 874925089, -1172359833);
				Class238.aClass75_3.aPacketBit_1.pos = 0;
				@Pc(1722) byte[] local1722 = new byte[Class518.anInt5056 * 874925089 + 1];
				Class238.aClass75_3.aPacketBit_1.method22557(local1722, 0, Class518.anInt5056 * 874925089, -1170417853);
				Class238.aClass75_3.aPacketBit_1.pos = 0;
				@Pc(1740) Packet local1740 = new Packet(local1722);
				@Pc(1744) String local1744 = local1740.gjstr();
				Class654.method33171(local1744, true, client.aBoolean734, 1122335433);
				Class530.method30812(Class203.anInt3386 * 285450383, -1924880860);
				if (Class238.anInt3812 * -1746286503 == 180 && client.anInt3433 * 1994758437 != 9) {
					Class238.anInt3841 = -190393156;
				} else {
					Class238.anInt3841 = -1688917340;
					Class238.aClass75_3.method1319((short) 468);
					Class570.method31723(-37431649);
				}
				return;
			}
			if (Class238.anInt3841 * 1722349977 == 254) {
				if (!Class238.aClass75_3.method1321((byte) 2).method15545(2, (byte) -36)) {
					return;
				}
				Class238.aClass75_3.method1321((byte) 2).method15551(Class238.aClass75_3.aPacketBit_1.data, 0, 2, -1972654296);
				Class238.aClass75_3.aPacketBit_1.pos = 0;
				Class238.aClass75_3.anInt248 = Class238.aClass75_3.aPacketBit_1.g2() * -460169961;
				Class238.anInt3841 = -2139824573;
			}
			@Pc(1892) PacketBit local1892;
			if (Class238.anInt3841 * 1722349977 == 267) {
				if (!Class238.aClass75_3.method1321((byte) 2).method15545(Class238.aClass75_3.anInt248 * 460106407, (byte) 120)) {
					return;
				}
				Class238.aClass75_3.method1321((byte) 2).method15551(Class238.aClass75_3.aPacketBit_1.data, 0, Class238.aClass75_3.anInt248 * 460106407, -1505234310);
				Class238.aClass75_3.aPacketBit_1.pos = 0;
				@Pc(1857) boolean local1857 = Class238.aClass75_3.aPacketBit_1.g1() == 1;
				while (true) {
					if (Class238.aClass75_3.aPacketBit_1.pos * -1380987821 >= Class238.aClass75_3.anInt248 * 460106407) {
						if (local1857) {
							@Pc(1889) Class80_Sub31 local1889 = Class668.method33490(2067084115);
							local1892 = local1889.aPacketBit_2;
							local1892.p1(Class436.aClass436_1.anInt4802 * 663664571);
							Class238.aClass75_3.method1325(local1889, (byte) -105);
							Class238.aClass75_3.method1315(-238154305);
							Class238.anInt3841 = 2054840095;
						} else {
							Class238.anInt3841 = -2019552338;
						}
						break;
					}
					@Pc(1873) Class460 local1873 = Class615.aClass2_Sub1_Sub2_14.method1820(Class238.aClass75_3.aPacketBit_1, 462457678);
					Class120_Sub1_Sub1_Sub4.aClass110_Sub1_1.anInterface4_2.method719(local1873.anInt4907 * -38979583, local1873.anObject19, -1757314135);
				}
			}
			if (Class238.anInt3841 * 1722349977 == 135) {
				if (!Class238.aClass75_3.method1321((byte) 2).method15545(1, (byte) -116)) {
					return;
				}
				Class238.aClass75_3.method1321((byte) 2).method15551(Class238.aClass75_3.aPacketBit_1.data, 0, 1, -1231343985);
				local209 = Class238.aClass75_3.aPacketBit_1.data[0] & 0xFF;
				if (local209 != 2) {
					if (local209 != 29 && local209 != 45) {
						Class238.anInt3841 = -1688917340;
						Class530.method30812(local209, -1185154402);
						Class238.aClass75_3.method1319((short) 468);
						Class570.method31723(-256706616);
						if (Class301.method27043(client.anInt3433 * 1994758437, (byte) -67)) {
							Class266.method26657(true, (short) 26149);
							Class238.anInt3846 = local209 * 1760181679;
						}
						return;
					}
					Class203.anInt3386 = local209 * -1465287057;
					Class238.anInt3841 = -1804083525;
					return;
				}
				Class238.anInt3841 = 1934567860;
			}
			if (Class238.anInt3841 * 1722349977 == 148) {
				if (!Class238.aClass75_3.method1321((byte) 2).method15545(1, (byte) 16)) {
					return;
				}
				Class238.aClass75_3.method1321((byte) 2).method15551(Class238.aClass75_3.aPacketBit_1.data, 0, 1, -1983494144);
				Class697.anInt5810 = (Class238.aClass75_3.aPacketBit_1.data[0] & 0xFF) * 1368909447;
				Class238.anInt3841 = -791754331;
			}
			@Pc(2029) PacketBit local2029;
			if (Class238.anInt3841 * 1722349977 == 157) {
				local2029 = Class238.aClass75_3.aPacketBit_1;
				if (Class238.anInt3812 * -1746286503 == 265) {
					if (!Class238.aClass75_3.method1321((byte) 2).method15545(Class697.anInt5810 * 983301943, (byte) 25)) {
						return;
					}
					Class238.aClass75_3.method1321((byte) 2).method15551(local2029.data, 0, Class697.anInt5810 * 983301943, -1571972482);
					local2029.pos = 0;
					Class108.method24050(local2029, 1843941384);
					client.anInt3512 = local2029.g1() * -419297101;
					client.anInt3536 = local2029.g1() * 1089535461;
					client.aBoolean748 = local2029.g1() == 1;
					client.aBoolean724 = local2029.g1() == 1;
					client.aBoolean719 = local2029.g1() == 1;
					client.aBoolean733 = local2029.g1() == 1;
					client.anInt3558 = local2029.g2() * -632410243;
					client.aBoolean731 = local2029.g1() == 1;
					Class595.anInt5356 = local2029.g3s() * -2023734779;
					client.aBoolean732 = local2029.g1() == 1;
					Class519.aString217 = local2029.gjstr();
					Class231.aLong355 = (local2029.g6() - Class303.method27111((byte) 73)) * 5364374374466182995L;
					client.aClass539_1.method30905(-1714610612).method17160(client.aBoolean732, (byte) 116);
					Class39.aClass540_1.method31056(1574758747).method30905(1803073153).method17160(client.aBoolean732, (byte) 70);
					Class25.aClass41_Sub9_1.method17330(client.aBoolean732, -1071417396);
					Class460.aClass41_Sub2_1.method17130(client.aBoolean732, (byte) 96);
				} else if (Class238.aClass75_3.method1321((byte) 2).method15545(Class697.anInt5810 * 983301943, (byte) 101)) {
					Class238.aClass75_3.method1321((byte) 2).method15551(local2029.data, 0, Class697.anInt5810 * 983301943, -1159157148);
					local2029.pos = 0;
					Class108.method24050(local2029, 1843941384);
					client.anInt3512 = local2029.g1() * -419297101;
					client.anInt3536 = local2029.g1() * 1089535461;
					client.aBoolean748 = local2029.g1() == 1;
					Class595.anInt5356 = local2029.g3s() * -2023734779;
					Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte74 = (byte) local2029.g1();
					client.aBoolean724 = local2029.g1() == 1;
					client.aBoolean719 = local2029.g1() == 1;
					Class336.aLong369 = local2029.g8() * -7120946938026617599L;
					Class231.aLong355 = (Class336.aLong369 * 621512022876777217L - Class303.method27111((byte) 120) - local2029.g5()) * 5364374374466182995L;
					local271 = local2029.g1();
					client.aBoolean731 = (local271 & 0x1) != 0;
					Class655.aBoolean969 = (local271 & 0x2) != 0;
					Class123_Sub3.anInt1160 = local2029.g4() * -1494133569;
					Class165_Sub45.anInt2388 = local2029.g4() * -913197697;
					Class43.anInt172 = local2029.g2() * 1866418969;
					Class115.anInt1015 = local2029.g2() * 1312964813;
					Class125_Sub3.anInt1185 = local2029.g2() * 967634201;
					Class284.anInt3939 = local2029.g4() * -1537116807;
					Class134.aClass306_1 = new Class306(Class284.anInt3939 * 1777591497);
					(new Thread(Class134.aClass306_1)).start();
					Class515.anInt5052 = local2029.g1() * 649277583;
					Class606.anInt5394 = local2029.g2() * -616974251;
					Class141_Sub1.anInt1282 = local2029.g2() * -758838013;
					Class80.aBoolean664 = local2029.g1() == 1;
					Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aString73 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aString75 = RuntimeException_Sub4.aString124 = local2029.gjstr2();
					Class107_Sub2.anInt864 = local2029.g1() * 493439703;
					Class61.anInt213 = local2029.g4() * 382834659;
					Class47.aClass28_5 = new Class28();
					Class47.aClass28_5.anInt89 = local2029.g2() * -465041647;
					if (Class47.aClass28_5.anInt89 * 307612145 == 65535) {
						Class47.aClass28_5.anInt89 = 465041647;
					}
					Class47.aClass28_5.aString4 = local2029.gjstr2();
					Class47.aClass28_5.anInt90 = local2029.g2() * 902130377;
					Class47.aClass28_5.anInt91 = local2029.g2() * 1383435301;
					if (Class566.aClass697_1 != Class697.aClass697_6 && (Class697.aClass697_2 != Class566.aClass697_1 || client.anInt3512 * -780671365 < 2) && Class47.aClass28_6.method657(Class47.aClass28_4, -626109227)) {
						Class392.method28682((byte) -85);
					}
				} else {
					return;
				}
				if (client.aBoolean719) {
					try {
						Class64.method1221(Class306.anApplet1, "zap", 20937170);
					} catch (@Pc(2458) Throwable local2458) {
						if (client.aBoolean706) {
							try {
								Class306.anApplet1.getAppletContext().showDocument(new URL(Class306.anApplet1.getCodeBase(), "blank.ws"), "tbi");
							} catch (@Pc(2472) Exception local2472) {
							}
						}
					}
				} else {
					try {
						Class64.method1221(Class306.anApplet1, "unzap", 20937170);
					} catch (@Pc(2480) Throwable local2480) {
					}
				}
				if (Class566.aClass697_1 == Class697.aClass697_4) {
					Class442.aClass442_1.method29194(1852403533);
				}
				if (Class238.anInt3812 * -1746286503 != 265) {
					Class238.anInt3841 = -1688917340;
					Class530.method30812(2, -1776364071);
					Class630.method32713((byte) 0);
					Class604.method32148(13, -749292198);
					Class238.aClass75_3.aClass448_2 = null;
					return;
				}
				Class238.anInt3841 = -1949431417;
			}
			if (Class238.anInt3841 * 1722349977 == 175) {
				if (!Class238.aClass75_3.method1321((byte) 2).method15545(3, (byte) -16)) {
					return;
				}
				Class238.aClass75_3.method1321((byte) 2).method15551(Class238.aClass75_3.aPacketBit_1.data, 0, 3, -1815984489);
				Class238.anInt3841 = -1683811290;
			}
			if (Class238.anInt3841 * 1722349977 == 182) {
				local2029 = Class238.aClass75_3.aPacketBit_1;
				local2029.pos = 0;
				if (local2029.method22555(-1766705110)) {
					if (!Class238.aClass75_3.method1321((byte) 2).method15545(1, (byte) -64)) {
						return;
					}
					Class238.aClass75_3.method1321((byte) 2).method15551(local2029.data, 3, 1, -1569505709);
				}
				Class238.aClass75_3.aClass448_2 = Class607.method32175(-917853670)[local2029.method22556(1347582098)];
				Class238.aClass75_3.anInt248 = local2029.g2() * -460169961;
				Class238.anInt3841 = 1428403263;
			}
			if (Class238.anInt3841 * 1722349977 == 167) {
				if (!Class238.aClass75_3.method1321((byte) 2).method15545(Class238.aClass75_3.anInt248 * 460106407, (byte) 19)) {
					return;
				}
				Class238.aClass75_3.method1321((byte) 2).method15551(Class238.aClass75_3.aPacketBit_1.data, 0, Class238.aClass75_3.anInt248 * 460106407, -2098563914);
				Class238.aClass75_3.aPacketBit_1.pos = 0;
				local209 = Class238.aClass75_3.anInt248 * 460106407;
				Class238.anInt3841 = -1688917340;
				Class530.method30812(2, -390597860);
				Class80_Sub31.method14417(-174723009);
				Class296.method26996(Class238.aClass75_3.aPacketBit_1, (byte) 58);
				local271 = local209 - Class238.aClass75_3.aPacketBit_1.pos * -1380987821;
				local1892 = new PacketBit(local271);
				System.arraycopy(Class238.aClass75_3.aPacketBit_1.data, Class238.aClass75_3.aPacketBit_1.pos * -1380987821, local1892.data, 0, local271);
				Class238.aClass75_3.aPacketBit_1.pos += local271 * 1034180571;
				if (Class238.aClass75_3.aClass448_2 == Class448.aClass448_63) {
					client.aClass539_1.method30920(new Class542(Class536.aClass536_3, local1892), (byte) 9);
				} else {
					client.aClass539_1.method30920(new Class542(Class536.aClass536_7, local1892), (byte) 9);
				}
				if (Class238.aClass75_3.aPacketBit_1.pos * -1380987821 != local209) {
					throw new RuntimeException(Class238.aClass75_3.aPacketBit_1.pos * -1380987821 + " " + local209);
				}
				Class238.aClass75_3.aClass448_2 = null;
				return;
			}
			if (Class238.anInt3841 * 1722349977 == 208) {
				if (Class238.aClass75_3.anInt248 * 460106407 == -2) {
					if (!Class238.aClass75_3.method1321((byte) 2).method15545(2, (byte) 66)) {
						return;
					}
					Class238.aClass75_3.method1321((byte) 2).method15551(Class238.aClass75_3.aPacketBit_1.data, 0, 2, -1592373740);
					Class238.aClass75_3.aPacketBit_1.pos = 0;
					Class238.aClass75_3.anInt248 = Class238.aClass75_3.aPacketBit_1.g2() * -460169961;
				}
				if (!Class238.aClass75_3.method1321((byte) 2).method15545(Class238.aClass75_3.anInt248 * 460106407, (byte) -101)) {
					return;
				}
				Class238.aClass75_3.method1321((byte) 2).method15551(Class238.aClass75_3.aPacketBit_1.data, 0, Class238.aClass75_3.anInt248 * 460106407, -1098979563);
				Class238.aClass75_3.aPacketBit_1.pos = 0;
				local209 = Class238.aClass75_3.anInt248 * 460106407;
				Class238.anInt3841 = -1688917340;
				Class530.method30812(15, 747366493);
				Class129_Sub1.method10141(845489415);
				Class296.method26996(Class238.aClass75_3.aPacketBit_1, (byte) 30);
				if (local209 != Class238.aClass75_3.aPacketBit_1.pos * -1380987821) {
					throw new RuntimeException(Class238.aClass75_3.aPacketBit_1.pos * -1380987821 + " " + local209);
				}
				Class238.aClass75_3.aClass448_2 = null;
				return;
			}
		} catch (@Pc(2837) IOException local2837) {
			Class238.aClass75_3.method1319((short) 468);
			if (Class238.anInt3845 * -1074608813 < 3) {
				if (Class238.anInt3812 * -1746286503 == 265) {
					Class47.aClass28_6.method656((byte) -93);
				} else {
					Class47.aClass28_3.method656((byte) -77);
				}
				Class238.anInt3814 = 0;
				Class238.anInt3845 += 757188315;
				Class238.anInt3841 = -771784724;
			} else {
				Class238.anInt3841 = -1688917340;
				Class530.method30812(-4, 576345950);
				Class570.method31723(1761844994);
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "it", descriptor = "(I)V")
	static void method23931(@OriginalArg(0) int arg0) {
		@Pc(3) byte[][][] local3 = client.aClass539_1.method30960(-735172124);
		@Pc(12) byte local12 = (byte) (client.anInt3496 * 939223631 - 4 & 0xFF);
		@Pc(20) int local20 = client.anInt3496 * 939223631 % client.aClass539_1.method30921(1885508155);
		@Pc(22) int local22;
		for (local22 = 0; local22 < 4; local22++) {
			for (@Pc(27) int local27 = 0; local27 < client.aClass539_1.method31011(910285358); local27++) {
				local3[local22][local20][local27] = local12;
			}
		}
		if (Class507.anInt5045 * -1170417853 == 3) {
			return;
		}
		for (local22 = 0; local22 < 2; local22++) {
			client.anIntArray305[local22] = -1000000;
			client.anIntArray314[local22] = 1000000;
			client.anIntArray315[local22] = 0;
			client.anIntArray317[local22] = 1000000;
			client.anIntArray316[local22] = 0;
		}
		@Pc(81) Class463 local81 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method24552().aClass463_61;
		@Pc(85) Class502 local85 = client.aClass539_1.method30903(-463929735);
		@Pc(89) Class570 local89 = client.aClass539_1.method30932(-1638462787);
		@Pc(135) int local135;
		if (Class368.anInt4502 * -1583611537 != 2 && Class368.anInt4502 * -1583611537 != 3 && -969208673 * Class588.anInt5304 == -1) {
			local135 = Class439.method29150(Class89.anInt319 * 1749751025, Class102_Sub2.anInt653 * 1132703631, Class507.anInt5045 * -1170417853, 1037753497);
			if (local135 - Class283.anInt3937 * -1465520451 < 3200 && (local85.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][Class89.anInt319 * 1749751025 >> 9][Class102_Sub2.anInt653 * 1132703631 >> 9] & 0x4) != 0) {
				Class49.method1003(local89.aClass568ArrayArrayArray1, 1, Class89.anInt319 * 1749751025 >> 9, Class102_Sub2.anInt653 * 1132703631 >> 9, false, 690045411);
			}
			return;
		}
		@Pc(108) Class626 local108 = client.aClass539_1.method30893((byte) -55);
		@Pc(146) int local146;
		if (Class368.anInt4502 * -1583611537 == 3) {
			@Pc(119) Class463 local119 = Class160.aClass121_Sub1_2.method9693(1951338957).method23078(-1450964163);
			if (Float.isNaN(local119.aFloat297)) {
				return;
			}
			local135 = (int) local119.aFloat297 - (local108.anInt5540 * -390642507 << 9);
			local146 = (int) local119.aFloat296 - (local108.anInt5537 * -894305615 << 9);
			if (local135 < 0 || local146 < 0 || local135 >> 9 >= local85.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853].length || local146 >> 9 >= local85.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local135 >> 9].length) {
				return;
			}
		} else if (Class368.anInt4502 * -1583611537 == 2) {
			local135 = (int) local81.aFloat297;
			local146 = (int) local81.aFloat296;
		} else {
			local135 = Class588.anInt5304 * -969208673;
			local146 = Class130_Sub1.anInt1175 * -978744261;
		}
		if ((local85.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local135 >> 9][local146 >> 9] & 0x4) != 0) {
			Class49.method1003(local89.aClass568ArrayArrayArray1, 0, local135 >> 9, local146 >> 9, false, -2062025022);
			return;
		}
		@Pc(264) int local264;
		@Pc(253) int local253;
		if (Class368.anInt4502 * -1583611537 == 3) {
			@Pc(242) Class463 local242 = Class160.aClass121_Sub1_2.method9603(-1785670456).method20516(1436604136);
			local253 = ((int) local242.aFloat297 >> 9) - local108.anInt5540 * -390642507;
			local264 = ((int) local242.aFloat296 >> 9) - local108.anInt5537 * -894305615;
			if (local253 < 0 || local264 < 0 || local253 >= local85.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853].length || local264 >= local85.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local253].length) {
				return;
			}
		} else {
			local253 = Class89.anInt319 * 1749751025 >> 9;
			local264 = Class102_Sub2.anInt653 * 1132703631 >> 9;
		}
		@Pc(306) int local306 = local135 >> 9;
		@Pc(310) int local310 = local146 >> 9;
		@Pc(326) int local326;
		if (local85.method30432(local253, local264, -1804834912)) {
			local326 = Class439.method29150(Class89.anInt319 * 1749751025, Class102_Sub2.anInt653 * 1132703631, 3, 1037753497);
			if (Class283.anInt3937 * -1465520451 >= local326) {
				Class49.method1003(local89.aClass568ArrayArrayArray1, 1, local253, local264, false, 1739752109);
			}
			return;
		}
		if (client.anInt3481 * 1789770377 >= 2560) {
			return;
		}
		if (local306 > local253) {
			local326 = local306 - local253;
		} else {
			local326 = local253 - local306;
		}
		@Pc(365) int local365;
		if (local310 > local264) {
			local365 = local310 - local264;
		} else {
			local365 = local264 - local310;
		}
		if (local326 == 0 && local365 == 0 || local326 <= -client.aClass539_1.method30921(1886513472) || local326 >= client.aClass539_1.method30921(1941342845) || local365 <= -client.aClass539_1.method31011(737118473) || local365 >= client.aClass539_1.method31011(-1312593270)) {
			if (Class368.anInt4502 * -1583611537 != 3) {
				Class603.method32133(local253 + Class256.aString157 + local264 + " " + local306 + Class256.aString157 + local310 + " " + local108.anInt5540 * -390642507 + Class256.aString157 + local108.anInt5537 * -894305615, new RuntimeException(), 839300151);
			}
			return;
		}
		@Pc(449) int local449;
		@Pc(451) int local451;
		if (local326 <= local365) {
			local449 = local326 * 65536 / local365;
			local451 = 32768;
			while (local310 != local264) {
				if (local264 < local310) {
					local264++;
				} else if (local264 > local310) {
					local264--;
				}
				if ((local85.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local253][local264] & 0x4) != 0) {
					Class49.method1003(local89.aClass568ArrayArrayArray1, 1, local253, local264, false, -1351635952);
					break;
				}
				if (local253 + 1 < local85.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853].length && (local85.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local253 + 1][local264] & 0x4) != 0) {
					Class49.method1003(local89.aClass568ArrayArrayArray1, 1, local253 + 1, local264, false, -556087614);
					break;
				}
				if (local253 > 0 && (local85.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local253 - 1][local264] & 0x4) != 0) {
					Class49.method1003(local89.aClass568ArrayArrayArray1, 1, local253 - 1, local264, false, -1668046160);
					break;
				}
				local451 += local449;
				if (local451 >= 65536) {
					local451 -= 65536;
					if (local253 < local306) {
						local253++;
						if (local253 + 1 < local85.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853].length && (local85.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local253 + 1][local264] & 0x4) != 0) {
							Class49.method1003(local89.aClass568ArrayArrayArray1, 1, local253 + 1, local264, false, 660566889);
							break;
						}
					} else if (local253 > local306) {
						local253--;
						if (local253 > 0 && (local85.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local253 - 1][local264] & 0x4) != 0) {
							Class49.method1003(local89.aClass568ArrayArrayArray1, 1, local253 - 1, local264, false, -1819824852);
							break;
						}
					}
				}
			}
			return;
		}
		local449 = local365 * 65536 / local326;
		local451 = 32768;
		while (local306 != local253) {
			if (local253 < local306) {
				local253++;
			} else if (local253 > local306) {
				local253--;
			}
			if ((local85.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local253][local264] & 0x4) != 0) {
				Class49.method1003(local89.aClass568ArrayArrayArray1, 1, local253, local264, false, -832937903);
				break;
			}
			if (local264 + 1 < local85.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local253].length && (local85.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local253][local264 + 1] & 0x4) != 0) {
				Class49.method1003(local89.aClass568ArrayArrayArray1, 1, local253, local264 + 1, false, -1228057918);
				break;
			}
			if (local264 > 0 && (local85.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local253][local264 - 1] & 0x4) != 0) {
				Class49.method1003(local89.aClass568ArrayArrayArray1, 1, local253, local264 - 1, false, 1655025788);
				break;
			}
			local451 += local449;
			if (local451 >= 65536) {
				local451 -= 65536;
				if (local264 < local310) {
					local264++;
					if (local264 + 1 < local85.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local253].length && (local85.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local253][local264 + 1] & 0x4) != 0) {
						Class49.method1003(local89.aClass568ArrayArrayArray1, 1, local253, local264 + 1, false, -2113832489);
						break;
					}
				} else if (local264 > local310) {
					local264--;
					if (local264 > 0 && (local85.aByteArrayArrayArray12[Class507.anInt5045 * -1170417853][local253][local264 - 1] & 0x4) != 0) {
						Class49.method1003(local89.aClass568ArrayArrayArray1, 1, local253, local264 - 1, false, -930606517);
						break;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "y", descriptor = "(IIZI)V")
	static void method23932(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		Class123.aBooleanArrayArray17[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!th", name = "e", descriptor = "()V")
	public final void method23924() {
		if (this.aClass147_19 != null) {
			this.aClass147_19.aClass147_20 = this.aClass147_20;
			this.aClass147_20.aClass147_19 = this.aClass147_19;
			this.aClass147_20 = null;
			this.aClass147_19 = null;
		}
	}

	@OriginalMember(owner = "client!th", name = "f", descriptor = "()V")
	public final void method23925() {
		if (this.aClass147_19 != null) {
			this.aClass147_19.aClass147_20 = this.aClass147_20;
			this.aClass147_20.aClass147_19 = this.aClass147_19;
			this.aClass147_20 = null;
			this.aClass147_19 = null;
		}
	}

	@OriginalMember(owner = "client!th", name = "t", descriptor = "(I)V")
	public final void method23926(@OriginalArg(0) int arg0) {
		if (this.aClass147_19 != null) {
			this.aClass147_19.aClass147_20 = this.aClass147_20;
			this.aClass147_20.aClass147_19 = this.aClass147_19;
			this.aClass147_20 = null;
			this.aClass147_19 = null;
		}
	}

	@OriginalMember(owner = "client!th", name = "u", descriptor = "()V")
	public final void method23927() {
		if (this.aClass147_19 != null) {
			this.aClass147_19.aClass147_20 = this.aClass147_20;
			this.aClass147_20.aClass147_19 = this.aClass147_19;
			this.aClass147_20 = null;
			this.aClass147_19 = null;
		}
	}
}
