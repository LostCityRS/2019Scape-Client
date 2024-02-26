package com.jagex;

import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class244 implements Interface75 {

	@OriginalMember(owner = "client!ek", name = "tc", descriptor = "I")
	public static int anInt3863;

	@OriginalMember(owner = "client!ek", name = "p", descriptor = "Ljava/awt/Frame;")
	protected static Frame aFrame1;

	@OriginalMember(owner = "client!ek", name = "t", descriptor = "Lclient!ek;")
	static final Class244 aClass244_6 = new Class244(2, 1);

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "Lclient!ek;")
	static final Class244 aClass244_1 = new Class244(0, 2);

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "Lclient!ek;")
	static final Class244 aClass244_4 = new Class244(4, 3);

	@OriginalMember(owner = "client!ek", name = "u", descriptor = "Lclient!ek;")
	static final Class244 aClass244_3 = new Class244(1, 4);

	@OriginalMember(owner = "client!ek", name = "l", descriptor = "Lclient!ek;")
	static final Class244 aClass244_2 = new Class244(6, 5);

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "Lclient!ek;")
	static final Class244 aClass244_7 = new Class244(5, 6);

	@OriginalMember(owner = "client!ek", name = "i", descriptor = "Lclient!ek;")
	static final Class244 aClass244_5 = new Class244(3, 7);

	@OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
	final int anInt3862;

	@OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
	final int anInt3861;

	@OriginalMember(owner = "client!ek", name = "u", descriptor = "()[Lclient!ek;")
	static Class244[] method26300() {
		return new Class244[] { aClass244_1, aClass244_7, aClass244_5, aClass244_6, aClass244_3, aClass244_2, aClass244_4 };
	}

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "()[Lclient!ek;")
	static Class244[] method26301() {
		return new Class244[] { aClass244_1, aClass244_7, aClass244_5, aClass244_6, aClass244_3, aClass244_2, aClass244_4 };
	}

	@OriginalMember(owner = "client!ek", name = "afl", descriptor = "(Lclient!yp;B)V")
	static void method26302(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = Class634.method32806(Class721.method37333(arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581], (byte) -121), Class512.aClass719_3.method37268(), (byte) 72);
	}

	@OriginalMember(owner = "client!ek", name = "bfy", descriptor = "(Lclient!yp;I)V")
	static void method26303(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ek", name = "atu", descriptor = "(Lclient!yp;B)V")
	static void method26304(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub17_1.method16165((byte) -100) == 1 ? 1 : 0;
	}

	@OriginalMember(owner = "client!ek", name = "ax", descriptor = "(IS)V")
	public static void method26305(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
		Class49.anInt187 = arg0 * 113490415;
		Class80_Sub17_Sub2.aClass80_Sub17_Sub2Array1 = new Class80_Sub17_Sub2[arg0];
		Class167.anInt2472 = 0;
	}

	@OriginalMember(owner = "client!ek", name = "jb", descriptor = "(Lclient!ni;I)V")
	static void method26306(@OriginalArg(0) Class438 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) PacketBit local2 = client.aClass75_1.aPacketBit_1;
		@Pc(9) int local9;
		@Pc(13) int local13;
		@Pc(25) int local25;
		@Pc(32) int local32;
		@Pc(42) int local42;
		@Pc(53) int local53;
		@Pc(17) Class626 local17;
		@Pc(49) int local49;
		@Pc(57) int local57;
		if (Class438.aClass438_1 == arg0) {
			local9 = local2.g2_alt3();
			local13 = local2.g1();
			local17 = client.aClass539_1.method30893((byte) -67);
			local25 = (local13 & 0x7) + Class434.anInt4795 * 1234046595;
			local32 = local17.anInt5537 * -894305615 + local25;
			local42 = Class436.anInt4803 * -113322595 + (local13 >> 4 & 0x7);
			local49 = local17.anInt5540 * -390642507 + local42;
			local53 = local2.g2_alt2();
			local57 = local2.g2();
			if (local57 != client.anInt3558 * 188678613) {
				@Pc(80) boolean local80 = local42 >= 0 && local25 >= 0 && local42 < client.aClass539_1.method30921(1985630112) && local25 < client.aClass539_1.method31011(-1513054430);
				if (local80 || client.aClass539_1.method30898((byte) 1).method30869(-1483926948)) {
					Class599.method32053(Class691.anInt5781 * -280750383, local49, local32, new Class80_Sub9(local53, local9), 33190);
					if (local80) {
						Class103_Sub23.method8700(Class691.anInt5781 * -280750383, local42, local25, (short) -3628);
					}
				}
			}
			return;
		}
		@Pc(131) int local131;
		if (arg0 == Class438.aClass438_6) {
			local9 = local2.g1();
			local13 = local2.g1_alt3();
			local131 = (local13 >> 4 & 0x7) + Class436.anInt4803 * -113322595;
			local25 = Class434.anInt4795 * 1234046595 + (local13 & 0x7);
			@Pc(146) Class619 local146 = new Class619(local2, local9, false);
			local42 = client.anIntArray306[local146.anInt5434 * 13806191];
			if (client.aClass539_1.method30898((byte) 1).method30869(137758640) || local131 >= 0 && local25 >= 0 && local131 < client.aClass539_1.method30921(2115901355) && local25 < client.aClass539_1.method31011(-144732083)) {
				Class705.method37130(Class691.anInt5781 * -280750383, local131, local25, local42, -1, local146.anInt5434 * 13806191, local146.anInt5435 * -509515973, local146.aClass457_90, -1323739461);
			}
		} else if (arg0 == Class438.aClass438_7) {
			local9 = local2.g1();
			local13 = local2.g4_alt3();
			local131 = local2.g1_alt2();
			local25 = Class436.anInt4803 * -113322595 + (local131 >> 4 & 0x7);
			local32 = (local131 & 0x7) + Class434.anInt4795 * 1234046595;
			@Pc(233) Class619 local233 = new Class619(local2, local9, false);
			local49 = client.anIntArray306[local233.anInt5434 * 13806191];
			if (client.aClass539_1.method30898((byte) 1).method30869(2137705486) || local25 >= 0 && local32 >= 0 && local25 < client.aClass539_1.method30921(1941868951) && local32 < client.aClass539_1.method31011(-877071588)) {
				Class705.method37130(Class691.anInt5781 * -280750383, local25, local32, local49, local13, local233.anInt5434 * 13806191, local233.anInt5435 * -509515973, local233.aClass457_90, -1323739461);
			}
		} else {
			@Pc(291) Class626 local291;
			if (Class438.aClass438_14 == arg0) {
				local9 = local2.g1_alt3();
				local291 = client.aClass539_1.method30893((byte) -14);
				local131 = (local9 & 0x7) + Class434.anInt4795 * 1234046595;
				local25 = local291.anInt5537 * -894305615 + local131;
				local32 = Class436.anInt4803 * -113322595 + (local9 >> 4 & 0x7);
				local42 = local291.anInt5540 * -390642507 + local32;
				local49 = local2.g2_alt3();
				local53 = local2.g2_alt1();
				@Pc(349) boolean local349 = local32 >= 0 && local131 >= 0 && local32 < client.aClass539_1.method30921(2024292543) && local131 < client.aClass539_1.method31011(-1279630537);
				if (local349 || client.aClass539_1.method30898((byte) 1).method30869(1785623665)) {
					Class599.method32053(Class691.anInt5781 * -280750383, local42, local25, new Class80_Sub9(local49, local53), 33190);
					if (local349) {
						Class103_Sub23.method8700(Class691.anInt5781 * -280750383, local32, local131, (short) -7987);
					}
				}
			} else if (arg0 == Class438.aClass438_3) {
				local2.g1();
				local9 = local2.g1();
				local13 = Class436.anInt4803 * -113322595 + (local9 >> 4 & 0x7);
				local131 = Class434.anInt4795 * 1234046595 + (local9 & 0x7);
				local25 = local2.g2();
				local32 = local2.g1();
				local42 = local2.g3();
				@Pc(424) String local424 = local2.gjstr();
				if (client.aClass539_1.method30898((byte) 1) != Class536.aClass536_2) {
					Class93.method1882(Class691.anInt5781 * -280750383, local13, local131, local32, local25, local42, local424, -279631586);
				}
			} else {
				@Pc(486) Class619 local486;
				if (Class438.aClass438_9 == arg0) {
					local9 = local2.g4_alt1();
					local13 = local2.g1_alt1();
					local131 = local2.g1_alt3();
					local25 = Class436.anInt4803 * -113322595 + (local131 >> 4 & 0x7);
					local32 = Class434.anInt4795 * 1234046595 + (local131 & 0x7);
					local42 = local2.g1_alt3();
					local486 = new Class619(local2, local13, false);
					local53 = client.anIntArray306[local486.anInt5434 * 13806191];
					if (client.aClass539_1.method30898((byte) 1) != Class536.aClass536_2) {
						Class157.method15209(Class691.anInt5781 * -280750383, local25, local32, local53, local486.anInt5434 * 13806191, local486.anInt5435 * -509515973, local486.aClass457_90, local9, local42, (byte) 3);
					}
				} else if (Class438.aClass438_12 == arg0) {
					local9 = local2.g4();
					local13 = local2.g1();
					((Class625) client.aClass539_1.method30905(1852810715).method18054(local9, 1927841833)).method32458(local13, (byte) -74);
				} else {
					@Pc(603) int local603;
					@Pc(636) int local636;
					@Pc(685) int local685;
					@Pc(695) int local695;
					if (arg0 == Class438.aClass438_4) {
						local9 = local2.g1();
						local13 = (local9 >> 4 & 0x7) + Class436.anInt4803 * -113322595;
						local131 = (local9 & 0x7) + Class434.anInt4795 * 1234046595;
						local25 = local2.g2();
						if (local25 == 65535) {
							local25 = -1;
						}
						local32 = local2.g1();
						local42 = local32 >> 4 & 0xF;
						local49 = local32 & 0x7;
						local53 = local2.g1();
						local57 = local2.g1();
						local603 = local2.g2();
						@Pc(612) boolean local612 = local2.g1() == 1;
						if (client.aClass539_1.method30898((byte) 1) != Class536.aClass536_2 && (local13 >= 0 && local131 >= 0 && local13 < client.aClass539_1.method30921(1830506023) && local131 < client.aClass539_1.method31011(744121125))) {
							local636 = local42 + 1;
							if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray234[0] >= local13 - local636 && Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray234[0] <= local13 + local636 && Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray242[0] >= local131 - local636 && Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray242[0] <= local636 + local131) {
								@Pc(681) Class463 local681 = new Class463((float) (local13 << 9), 0.0F, (float) (local131 << 9));
								local685 = Class691.anInt5781 * -280750383;
								local695 = local612 ? Class278.aClass278_3.method26831(-1048749151) : Class278.aClass278_5.method26831(171841480);
								Class490.aClass263_13.method26532(Class280.aClass280_1, local25, local49, local57, local695, Class269.aClass269_4, 0.0F, (float) (local42 << 9), local681, local685, local603, local53, 2072341088);
							}
						}
					} else {
						@Pc(824) int local824;
						if (arg0 == Class438.aClass438_2) {
							local9 = local2.g1();
							local13 = Class436.anInt4803 * -113322595 + (local9 >> 4 & 0x7);
							local131 = (local9 & 0x7) + Class434.anInt4795 * 1234046595;
							local25 = local2.g2();
							if (local25 == 65535) {
								local25 = -1;
							}
							local32 = local2.g2();
							local42 = local2.g2();
							local49 = local2.g1();
							local53 = local2.g2s();
							if (client.aClass539_1.method30898((byte) 1) != Class536.aClass536_2 && (local13 >= 0 && local131 >= 0 && local13 < client.aClass539_1.method30921(1997827888) && local131 < client.aClass539_1.method31011(-1796511541))) {
								if (local25 == -1) {
									@Pc(797) Class80_Sub1_Sub8 local797 = (Class80_Sub1_Sub8) client.aClass24_19.method560((long) (local13 << 16 | local131));
									if (local797 != null) {
										local797.aClass120_Sub1_Sub1_Sub5_1.method24352((byte) -31);
										local797.method24395((byte) 123);
									}
								} else {
									local57 = local13 * 512 + 256;
									local603 = local131 * 512 + 256;
									local824 = Class691.anInt5781 * -280750383;
									if (local824 < 3 && client.aClass539_1.method30903(-463929735).method30429(local13, local131, 1283932066)) {
										local824++;
									}
									@Pc(867) Class120_Sub1_Sub1_Sub5 local867 = new Class120_Sub1_Sub1_Sub5(client.aClass539_1.method30932(-1638462787), local25, local42, Class691.anInt5781 * -280750383, local824, local57, Class439.method29150(local57, local603, Class691.anInt5781 * -280750383, 1037753497) - local32, local603, local13, local13, local131, local131, local49, false, local53);
									client.aClass24_19.method563(new Class80_Sub1_Sub8(local867), (long) (local13 << 16 | local131));
								}
							}
						} else if (Class438.aClass438_10 == arg0) {
							local9 = local2.g2();
							local13 = local2.g1_alt3();
							local17 = client.aClass539_1.method30893((byte) -69);
							local25 = (local13 & 0x7) + Class434.anInt4795 * 1234046595;
							local32 = local25 + local17.anInt5537 * -894305615;
							local42 = (local13 >> 4 & 0x7) + Class436.anInt4803 * -113322595;
							local49 = local17.anInt5540 * -390642507 + local42;
							@Pc(943) Class80_Sub4 local943 = (Class80_Sub4) client.aClass24_22.method560((long) (Class691.anInt5781 * -280750383 << 28 | local32 << 14 | local49));
							if (local943 != null) {
								for (@Pc(952) Class80_Sub9 local952 = (Class80_Sub9) local943.aClass8_18.method247(129206984); local952 != null; local952 = (Class80_Sub9) local943.aClass8_18.method237(-1704673781)) {
									if (local952.anInt1498 * 959158013 == local9) {
										local952.method24395((byte) 34);
										break;
									}
								}
								if (local943.aClass8_18.method240(1294340804)) {
									local943.method24395((byte) 105);
								}
								if (local42 >= 0 && local25 >= 0 && local42 < client.aClass539_1.method30921(2088391566) && local25 < client.aClass539_1.method31011(-1738066881)) {
									Class103_Sub23.method8700(Class691.anInt5781 * -280750383, local42, local25, (short) -8478);
								}
							}
						} else {
							@Pc(1079) int local1079;
							if (Class438.aClass438_8 == arg0) {
								local9 = local2.g1();
								@Pc(1017) boolean local1017 = (local9 & 0x80) != 0;
								local131 = Class436.anInt4803 * -113322595 + (local9 >> 3 & 0x7);
								local25 = Class434.anInt4795 * 1234046595 + (local9 & 0x7);
								local32 = local131 + local2.g1b();
								local42 = local25 + local2.g1b();
								local49 = local2.g2s();
								local53 = local2.g2();
								local57 = local2.g1() * 4;
								local603 = local2.g1() * 4;
								local824 = local2.g2();
								local636 = local2.g2();
								local1079 = local2.g1();
								local685 = local2.g2();
								local695 = local2.g2s();
								if (local1079 == 255) {
									local1079 = -1;
								}
								if (client.aClass539_1.method30898((byte) 1) != Class536.aClass536_2 && (local131 >= 0 && local25 >= 0 && local131 < client.aClass539_1.method30921(1867325265) && local25 < client.aClass539_1.method31011(-1261265557) && local32 >= 0 && local42 >= 0 && local32 < client.aClass539_1.method30921(2129657092) && local42 < client.aClass539_1.method31011(-1575869630) && local53 != 65535)) {
									local131 = local131 * 512 + 256;
									local25 = local25 * 512 + 256;
									local32 = local32 * 512 + 256;
									local42 = local42 * 512 + 256;
									local57 <<= 0x2;
									local603 <<= 0x2;
									local685 <<= 0x2;
									@Pc(1196) Class120_Sub1_Sub1_Sub4 local1196 = new Class120_Sub1_Sub1_Sub4(client.aClass539_1.method30932(-1638462787), local53, Class691.anInt5781 * -280750383, Class691.anInt5781 * -280750383, local131, local25, local57, local824 + client.anInt3436, client.anInt3436 + local636, local1079, local685, 0, local49, local603, local1017, -1, local695);
									local1196.method24204(local32, local42, Class439.method29150(local32, local42, Class691.anInt5781 * -280750383, 1037753497) - local603, local824 + client.anInt3436, 2111777600);
									client.aClass8_49.method232(new Class80_Sub1_Sub6(local1196), -107666413);
								}
							} else if (Class438.aClass438_5 == arg0) {
								local9 = local2.g1();
								local291 = client.aClass539_1.method30893((byte) -18);
								local131 = (local9 & 0x7) + Class434.anInt4795 * 1234046595;
								local25 = local131 + local291.anInt5537 * -894305615;
								local32 = Class436.anInt4803 * -113322595 + (local9 >> 4 & 0x7);
								local42 = local32 + local291.anInt5540 * -390642507;
								local49 = local2.g2();
								local53 = local2.g2();
								local57 = local2.g2();
								if (client.aClass24_22 != null) {
									@Pc(1294) Class80_Sub4 local1294 = (Class80_Sub4) client.aClass24_22.method560((long) (Class691.anInt5781 * -280750383 << 28 | local25 << 14 | local42));
									if (local1294 != null) {
										for (@Pc(1303) Class80_Sub9 local1303 = (Class80_Sub9) local1294.aClass8_18.method247(129206984); local1303 != null; local1303 = (Class80_Sub9) local1294.aClass8_18.method237(587248851)) {
											if (local1303.anInt1498 * 959158013 == local49 && local1303.anInt1497 * -1156703001 == local53) {
												local1303.method24395((byte) 125);
												local1303.anInt1497 = local57 * -739559721;
												Class599.method32053(Class691.anInt5781 * -280750383, local42, local25, local1303, 33190);
												break;
											}
										}
										if (local32 >= 0 && local131 >= 0 && local32 < client.aClass539_1.method30921(1914876929) && local131 < client.aClass539_1.method31011(998441859)) {
											Class103_Sub23.method8700(Class691.anInt5781 * -280750383, local32, local131, (short) -20082);
										}
									}
								}
							} else if (Class438.aClass438_15 == arg0) {
								local9 = local2.g1();
								local13 = Class436.anInt4803 * -113322595 + (local9 >> 4 & 0x7);
								local131 = (local9 & 0x7) + Class434.anInt4795 * 1234046595;
								local25 = local2.g2();
								if (local25 == 65535) {
									local25 = -1;
								}
								local32 = local2.g1();
								local42 = local32 >> 4 & 0xF;
								local49 = local32 & 0x7;
								local53 = local2.g1();
								local57 = local2.g1();
								local603 = local2.g2();
								if (client.aClass539_1.method30898((byte) 1) != Class536.aClass536_2 && (local13 >= 0 && local131 >= 0 && local13 < client.aClass539_1.method30921(1958107341) && local131 < client.aClass539_1.method31011(867719559))) {
									local824 = local42 + 1;
									if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray234[0] >= local13 - local824 && Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray234[0] <= local13 + local824 && Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray242[0] >= local131 - local824 && Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray242[0] <= local131 + local824) {
										@Pc(1493) Class463 local1493 = new Class463((float) (local13 << 9), 0.0F, (float) (local131 << 9));
										local1079 = Class691.anInt5781 * -280750383;
										Class490.aClass263_13.method26532(Class280.aClass280_1, local25, local49, local57, Class278.aClass278_5.method26831(-33544736), Class269.aClass269_4, 0.0F, (float) (local42 << 9), local1493, local1079, local603, local53, 1997870036);
									}
								}
							} else if (arg0 == Class438.aClass438_13) {
								local9 = local2.g1();
								local13 = (local9 >> 4 & 0xF) + Class436.anInt4803 * -226645190;
								local131 = (local9 & 0xF) + Class434.anInt4795 * -1826874106;
								local25 = local2.g1();
								@Pc(1556) boolean local1556 = (local25 & 0x1) != 0;
								@Pc(1564) boolean local1564 = (local25 & 0x2) != 0;
								local49 = local1564 ? local25 >> 2 : -1;
								local53 = local13 + local2.g1b();
								local57 = local131 + local2.g1b();
								local603 = local2.g2s();
								local824 = local2.g2s();
								local636 = local2.g2();
								local1079 = local2.g1();
								if (local1564) {
									local1079 = (byte) local1079;
								} else {
									local1079 *= 4;
								}
								local685 = local2.g1() * 4;
								local695 = local2.g2();
								@Pc(1624) int local1624 = local2.g2();
								@Pc(1628) int local1628 = local2.g1();
								@Pc(1632) int local1632 = local2.g2();
								if (local1628 == 255) {
									local1628 = -1;
								}
								@Pc(1641) int local1641 = local2.g2s();
								if (client.aClass539_1.method30898((byte) 1) != Class536.aClass536_2 && (local13 >= 0 && local131 >= 0 && local13 < client.aClass539_1.method30921(2097497107) * 2 && local131 < client.aClass539_1.method30921(2145975759) * 2 && local53 >= 0 && local57 >= 0 && local53 < client.aClass539_1.method31011(1132987535) * 2 && local57 < client.aClass539_1.method31011(-797298054) * 2 && local636 != 65535)) {
									local13 *= 256;
									local131 *= 256;
									local53 = local53 * 256;
									local57 *= 256;
									local1079 <<= 0x2;
									local685 <<= 0x2;
									local1632 <<= 0x2;
									Class43.method929(local636, local603, local824, local49, local1079, local685, local13, local131, local53, local57, local695, local1624, local1628, local1632, local1556, local1641, Class691.anInt5781 * -280750383, (byte) 13);
								}
							} else if (Class438.aClass438_11 == arg0) {
								local9 = local2.g1();
								local13 = local2.g4_alt3();
								local131 = local2.g1_alt2();
								local25 = local2.g1_alt3();
								local32 = (local25 >> 4 & 0x7) + Class436.anInt4803 * -113322595;
								local42 = (local25 & 0x7) + Class434.anInt4795 * 1234046595;
								local486 = new Class619(local2, local131, false);
								local53 = client.anIntArray306[local486.anInt5434 * 13806191];
								if (Class607.aClass607_22.anInt5396 * 1323580581 == local486.anInt5434 * 13806191) {
									local486.anInt5434 = Class607.aClass607_21.anInt5396 * 2048271403;
								}
								if ((local9 & 0x1) == 1) {
									Class405.method28909(Class691.anInt5781 * -280750383, local32, local42, local53, local13, local486.anInt5434 * 13806191, null, 364051605);
								} else {
									@Pc(1824) int[] local1824 = null;
									if ((local9 & 0x2) == 2) {
										local603 = local2.g1();
										local1824 = new int[local603];
										for (local824 = 0; local824 < local603; local824++) {
											local1824[local824] = local2.g4();
										}
									}
									@Pc(1851) short[] local1851 = null;
									if ((local9 & 0x4) == 4) {
										local824 = local2.g1();
										local1851 = new short[local824];
										for (local636 = 0; local636 < local824; local636++) {
											local1851[local636] = (short) local2.g2();
										}
									}
									@Pc(1879) short[] local1879 = null;
									if ((local9 & 0x8) == 8) {
										local636 = local2.g1();
										local1879 = new short[local636];
										for (local1079 = 0; local1079 < local636; local1079++) {
											local1879[local1079] = (short) local2.g2();
										}
									}
									Class405.method28909(Class691.anInt5781 * -280750383, local32, local42, local53, local13, local486.anInt5434 * 13806191, new Class614(Class80_Sub8.aLong69 * 593061003217164791L, local1824, local1851, local1879), 364051605);
									Class80_Sub8.aLong69 += 9034042645872457671L;
								}
							} else {
								Class603.method32133("" + arg0, new RuntimeException(), 839300151);
								Class266.method26657(false, (short) 7337);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(II)V")
	Class244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3862 = arg0 * -518871639;
		this.anInt3861 = arg1 * 1374250333;
	}

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "()I")
	@Override
	public int method37268() {
		return this.anInt3861 * 635180789;
	}

	@OriginalMember(owner = "client!ek", name = "i", descriptor = "()I")
	@Override
	public int method37269() {
		return this.anInt3861 * 635180789;
	}

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "()I")
	@Override
	public int method37267() {
		return this.anInt3861 * 635180789;
	}
}
