package com.jagex;

import jaclib.ping.IcmpService;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alx")
public final class IcmpService_Sub1 extends IcmpService {

	@OriginalMember(owner = "client!alx", name = "t", descriptor = "Lclient!alx;")
	static volatile IcmpService_Sub1 anIcmpService_Sub1_1;

	@OriginalMember(owner = "client!alx", name = "f", descriptor = "Ljava/util/List;")
	final List aList2 = new ArrayList();

	@OriginalMember(owner = "client!alx", name = "m", descriptor = "()V")
	public static void method15728() {
		if (anIcmpService_Sub1_1 == null) {
			return;
		}
		try {
			anIcmpService_Sub1_1.quit();
		} catch (@Pc(7) Throwable local7) {
		}
		anIcmpService_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!alx", name = "i", descriptor = "(Lclient!yb;)V")
	public static void method15729(@OriginalArg(0) Interface73 arg0) {
		if (anIcmpService_Sub1_1 == null) {
			throw new IllegalStateException("");
		}
		anIcmpService_Sub1_1.aList2.add(arg0);
	}

	@OriginalMember(owner = "client!alx", name = "gy", descriptor = "(S)V")
	static void method15730(@OriginalArg(0) short arg0) {
		if (client.anInt3584 * -94279287 > 1) {
			client.anInt3584 -= 2086788281;
			client.anInt3579 = client.anInt3569 * -209044089;
		}
		if (client.aClass75_1.aBoolean35) {
			client.aClass75_1.aBoolean35 = false;
			Class588.method31903((byte) -119);
			return;
		}
		if (!Class630.aBoolean955) {
			Class451.method29280(-1958078055);
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Class505.method30468(client.aClass75_1, 1669899539); local27++) {
		}
		if (client.anInt3433 * 1994758437 != 18) {
			return;
		}
		@Pc(63) int local63;
		@Pc(52) Class80_Sub31 local52;
		while (Class597.method32020(-1984189703)) {
			local52 = Class623.method32440(Class443.aClass443_25, client.aClass75_1.aClass22_1, -191270971);
			local52.aPacketBit_2.p1(0);
			local63 = local52.aPacketBit_2.pos * -1380987821;
			Class117.method8817(local52.aPacketBit_2, (byte) 2);
			local52.aPacketBit_2.p1check(local52.aPacketBit_2.pos * -1380987821 - local63);
			client.aClass75_1.method1325(local52, (byte) -80);
		}
		@Pc(129) int local129;
		if (Class533.aClass692_2 == null) {
			if (Class303.method27111((byte) 30) >= Class80.aLong339 * -4419959139974228777L) {
				Class533.aClass692_2 = client.aClass680_1.method33626(Class47.aClass28_6.aString4, (byte) 58);
			}
		} else if (Class533.aClass692_2.anInt5782 * -1361729949 != -1) {
			local52 = Class623.method32440(Class443.aClass443_76, client.aClass75_1.aClass22_1, -191270971);
			if (Class425.aGarbageCollectorMXBean1 == null || !Class425.aGarbageCollectorMXBean1.isValid()) {
				try {
					@Pc(105) Iterator local105 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
					while (local105.hasNext()) {
						@Pc(112) GarbageCollectorMXBean local112 = (GarbageCollectorMXBean) local105.next();
						if (local112.isValid()) {
							Class425.aGarbageCollectorMXBean1 = local112;
							client.aLong354 = -6530137620220037185L;
							client.aLong353 = -1649288692619019307L;
						}
					}
				} catch (@Pc(124) Throwable local124) {
				}
			}
			@Pc(127) long local127 = Class303.method27111((byte) 54);
			local129 = -1;
			if (Class425.aGarbageCollectorMXBean1 != null) {
				@Pc(134) long local134 = Class425.aGarbageCollectorMXBean1.getCollectionTime();
				if (client.aLong353 * 7161689105444936323L != -1L) {
					@Pc(146) long local146 = local134 - client.aLong353 * 7161689105444936323L;
					@Pc(152) long local152 = local127 - client.aLong354 * -3389770343781578815L;
					if (local152 != 0L) {
						local129 = (int) (local146 * 100L / local152);
					}
				}
				client.aLong353 = local134 * 1649288692619019307L;
				client.aLong354 = local127 * 6530137620220037185L;
			}
			local52.aPacketBit_2.p2_alt1(Class533.aClass692_2.anInt5782 * -1361729949);
			local52.aPacketBit_2.p1_alt2(client.anInt3413 * -1936589983);
			local52.aPacketBit_2.p1_alt1(local129);
			client.aClass75_1.method1325(local52, (byte) -110);
			Class533.aClass692_2 = null;
			Class80.aLong339 = (local127 + 30000L) * -1925122248462573849L;
		}
		Class161_Sub1.method15660(-1347687753);
		Class245.method26321(1066187147);
		@Pc(226) Class80_Sub17 local226 = (Class80_Sub17) client.aClass8_45.method247(129206984);
		if (client.aClass539_1.method30932(-1638462787) != null) {
			if (Class368.anInt4502 * -1583611537 == 5) {
				Class389.method28654((byte) -2);
			} else if (Class368.anInt4502 * -1583611537 == 6) {
				Class364.method28220(394820816);
			}
		}
		if (client.aBoolean725) {
			client.aBoolean725 = false;
		} else {
			client.aFloat256 /= 2.0F;
		}
		if (client.aBoolean723) {
			client.aBoolean723 = false;
		} else {
			client.aFloat253 /= 2.0F;
		}
		@Pc(285) int local285;
		if (Class130.method10199(755243815)) {
			Class576.method31791((byte) -118);
		} else if (Class368.anInt4502 * -1583611537 == 3) {
			@Pc(278) Class626 local278 = client.aClass539_1.method30893((byte) -49);
			local285 = local278.anInt5540 * -390642507 << 9;
			local129 = local278.anInt5537 * -894305615 << 9;
			if (Class118.aLong34 * 7778702343690755751L <= 0L) {
				Class118.aLong34 = Class303.method27111((byte) 30) * 2247461033347131671L;
			}
			@Pc(311) float local311 = (float) (Class303.method27111((byte) 82) - Class118.aLong34 * 7778702343690755751L);
			@Pc(316) int local316 = 1000 / Class165_Sub11.method16047((byte) -14);
			@Pc(322) int local322 = (int) ((double) local316 * 1.25D);
			while (local311 > 0.0F) {
				@Pc(331) float local331 = Math.min(local311, (float) local322);
				Class160.aClass121_Sub1_2.method9675(local331 / 1000.0F, client.aClass539_1.method30910((byte) -47).anIntArrayArrayArray14, client.aClass539_1.method30903(-463929735), local285, local129, (byte) -2);
				local311 -= local322;
			}
			Class118.aLong34 = Class303.method27111((byte) 110) * 2247461033347131671L;
		}
		Class349.method27999((byte) 69);
		if (client.anInt3433 * 1994758437 != 18) {
			return;
		}
		client.aClass539_1.method30904((byte) -21).method33366(client.aClass539_1, (byte) -127);
		Class53.method1090((byte) 1);
		if (client.anInt3440 * 513562023 > 10) {
			client.aClass75_1.anInt245 += 74075491;
		}
		if (client.aClass75_1.anInt245 * -1217291189 > 2250) {
			Class588.method31903((byte) -27);
			return;
		}
		if (client.anInt3541 * -1330995431 == 3) {
			Class710.method37159((byte) 7);
			Class411.method28967(-546172277);
		} else if (Class335.aClass650_1.anInterface67_5.method32275(local226, client.anInterface63Array1, client.anInt3446 * -881615229, Class544.aClass155_1, (short) 7262)) {
			Class132.method10372(false, -1136553020);
		} else {
			if (client.anInt3541 * -1330995431 == 2 && Class454.method29305(client.anInt3461 * 1675806989, 1503487917)) {
				client.aClass539_1.method30920(new Class542(Class536.aClass536_2, null), (byte) 9);
				client.anInt3541 = -39695063;
			}
			if (client.anInt3541 * -1330995431 == 1 && client.anInt3433 * 1994758437 != 3) {
				Class251.aClass24_25.method564(810194433);
				client.anInt3541 = 0;
				client.anInt3432 = client.anInt3436 * -1914178337;
				client.anInt3588 = 0;
				client.aBoolean722 = false;
				Class165_Sub41.method16812((byte) -41);
			}
			if (client.anInt3541 * -1330995431 == 0) {
				local63 = client.anInt3436 - client.anInt3432 * -1603221729;
				if (client.anInt3588 * 76099205 < Class251.aClass103Array1.length) {
					do {
						@Pc(486) Class103 local486 = Class251.aClass103Array1[client.anInt3588 * 76099205];
						if (local486.anInt2748 * -434186177 > local63) {
							break;
						}
						local486.method19206(474735839);
					} while (client.anInt3541 * -1330995431 == 0 && (client.anInt3588 += -1072850355) * 76099205 < Class251.aClass103Array1.length);
				}
				if (client.anInt3541 * -1330995431 == 0) {
					for (local285 = 0; local285 < Class251.aClass254Array1.length; local285++) {
						@Pc(527) Class254 local527 = Class251.aClass254Array1[local285];
						if (local527.aBoolean775) {
							@Pc(535) Class120_Sub1_Sub1_Sub1 local535 = local527.method26399((byte) 70);
							Class539.method31037(local535, true, (byte) -67);
						}
					}
				}
			}
		}
		Class313.method27485(1564031706);
		Class310.method27457(-1995862151);
		Class630.method32718((byte) -72);
		Class163.method15763(false, (byte) -36);
		Class599.method32052(Class279.aClass102_9, Class626.aClass235_8, -964767370);
		client.anInt3516 += -637283507;
		if (client.anInt3514 * -166506949 != 0) {
			client.anInt3485 += 1560637036;
			if (client.anInt3485 * 193518815 >= 400) {
				client.anInt3514 = 0;
			}
		}
		if (Class112.aClass327_2 != null) {
			client.anInt3458 += -700775879;
			if (client.anInt3458 * -1117500407 >= 15) {
				Class296.method26998(Class112.aClass327_2, 1423479798);
				Class112.aClass327_2 = null;
			}
		}
		client.aClass327_6 = null;
		client.aBoolean742 = false;
		client.aBoolean739 = false;
		Class492.aClass327_12 = null;
		Class567.method31525(null, -1, -1, 2064809539);
		if (!client.aBoolean728) {
			client.anInt3502 = -847777085;
		}
		Class606.method32163((byte) 58);
		client.anInt3569 += -2099756257;
		@Pc(620) Class80_Sub31 local620;
		if (client.aBoolean745) {
			local620 = Class623.method32440(Class443.aClass443_115, client.aClass75_1.aClass22_1, -191270971);
			local620.aPacketBit_2.p4(Class644.anInt5645 * 1999363209 << 28 | Class103_Sub10.anInt946 * 1676196187 << 14 | Class258.anInt3887 * 898414461);
			client.aClass75_1.method1325(local620, (byte) -109);
			client.aBoolean745 = false;
		}
		while (true) {
			@Pc(650) Class80_Sub42 local650;
			@Pc(657) Class327 local657;
			@Pc(669) Class327 local669;
			do {
				local650 = (Class80_Sub42) client.aClass8_47.method233(227957232);
				if (local650 == null) {
					while (true) {
						do {
							local650 = (Class80_Sub42) client.aClass8_48.method233(2000938420);
							if (local650 == null) {
								while (true) {
									do {
										local650 = (Class80_Sub42) client.aClass8_46.method233(973410715);
										if (local650 == null) {
											if (Class492.aClass327_12 == null) {
												client.anInt3430 = 0;
											}
											if (client.aClass327_8 != null) {
												Class563.method31459((byte) 92);
											}
											Class304.method27128(185052969);
											if (client.anInt3512 * -780671365 > 0 && Class544.aClass155_1.method15048(82, (short) 10521) && Class544.aClass155_1.method15048(81, (short) 5241) && client.anInt3575 * 866611799 != 0) {
												local63 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99 - client.anInt3575 * 866611799;
												if (local63 < 0) {
													local63 = 0;
												} else if (local63 > 3) {
													local63 = 3;
												}
												@Pc(852) Class626 local852 = client.aClass539_1.method30893((byte) -48);
												Class657.method33227(local63, local852.anInt5540 * -390642507 + Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray234[0], Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray242[0] + local852.anInt5537 * -894305615, 1002802917);
											}
											for (local63 = 0; local63 < 5; local63++) {
												@Pc(882) int local882 = client.anIntArray332[local63]++;
											}
											if (Class120_Sub1_Sub1_Sub4.aClass110_Sub1_1.aBoolean171 && Class120_Sub1_Sub1_Sub4.aClass110_Sub1_1.aLong28 * -2439323268239245765L < Class303.method27111((byte) 76) - 60000L) {
												Class706.method37137(-1413673503);
											}
											Class120_Sub1_Sub1_Sub4.aClass110_Sub1_1.method7300((byte) -105);
											for (@Pc(910) Class147_Sub6 local910 = (Class147_Sub6) client.aClass5_6.method93((byte) -66); local910 != null; local910 = (Class147_Sub6) client.aClass5_6.method110(822122660)) {
												if ((long) (local910.anInt1499 * -96601151) < Class303.method27111((byte) 108) / 1000L - 5L) {
													if (local910.aShort49 > 0) {
														Class255.method26406(5, 0, "", "", "", local910.aString46 + Class60.aClass60_21.method1180(Class512.aClass719_3, 1438335857), null, (byte) 3);
													}
													if (local910.aShort49 == 0) {
														Class255.method26406(5, 0, "", "", "", local910.aString46 + Class60.aClass60_127.method1180(Class512.aClass719_3, 2089881186), null, (byte) 3);
													}
													local910.method23926(711677908);
												}
											}
											client.anInt3517 += -763018029;
											if (client.anInt3517 * -1713654949 > 504) {
												client.anInt3517 = 0;
												local63 = (int) (Math.random() * 8.0D);
												if ((local63 & 0x1) == 1) {
													client.anInt3468 += client.anInt3469 * -1079950727;
												}
												if ((local63 & 0x2) == 2) {
													client.anInt3507 += client.anInt3470 * -1684275177;
												}
												if ((local63 & 0x4) == 4) {
													client.anInt3471 += client.anInt3472 * 2087108421;
												}
											}
											if (client.anInt3468 * -50962227 < -56) {
												client.anInt3469 = 1886070234;
											}
											if (client.anInt3468 * -50962227 > 55) {
												client.anInt3469 = -1886070234;
											}
											if (client.anInt3507 * 1620284467 < -55) {
												client.anInt3470 = 402912634;
											}
											if (client.anInt3507 * 1620284467 > 58) {
												client.anInt3470 = -402912634;
											}
											if (client.anInt3471 * 2051687043 < -44) {
												client.anInt3472 = -203084625;
											}
											if (client.anInt3471 * 2051687043 > 44) {
												client.anInt3472 = 203084625;
											}
											client.anInt3568 += 1974594971;
											if (client.anInt3568 * 1527689363 > 500) {
												client.anInt3568 = 0;
												local63 = (int) (Math.random() * 8.0D);
												if ((local63 & 0x1) == 1) {
													client.anInt3474 += client.anInt3475 * 1710949399;
												}
												if ((local63 & 0x2) == 2) {
													client.anInt3476 += client.anInt3477 * -882149283;
												}
											}
											if (client.anInt3474 * -1918431893 < -65) {
												client.anInt3475 = -396801174;
											}
											if (client.anInt3474 * -1918431893 > 60) {
												client.anInt3475 = 396801174;
											}
											if (client.anInt3476 * -692320695 < -20) {
												client.anInt3477 = 1633974349;
											}
											if (client.anInt3476 * -692320695 > 11) {
												client.anInt3477 = -1633974349;
											}
											client.aClass75_1.anInt243 += -1978460909;
											if (client.aClass75_1.anInt243 * 626261275 > 50) {
												local620 = Class623.method32440(Class443.aClass443_104, client.aClass75_1.aClass22_1, -191270971);
												client.aClass75_1.method1325(local620, (byte) -112);
											}
											if (client.aBoolean720) {
												Class615.method32284((byte) 37);
												client.aBoolean720 = false;
											}
											try {
												client.aClass75_1.method1315(810219274);
											} catch (@Pc(1171) IOException local1171) {
												Class588.method31903((byte) -79);
											}
											return;
										}
										local657 = local650.aClass327_3;
										if (local657.anInt4094 * 2071556223 < 0) {
											break;
										}
										local669 = Class301.method27041(local657.anInt4082 * 254495303, 2094689410);
									} while (local669 == null || local669.aClass327Array3 == null || local657.anInt4094 * 2071556223 >= local669.aClass327Array3.length || local657 != local669.aClass327Array3[local657.anInt4094 * 2071556223]);
									Class279.method26847(local650, 280390352);
								}
							}
							local657 = local650.aClass327_3;
							if (local657.anInt4094 * 2071556223 < 0) {
								break;
							}
							local669 = Class301.method27041(local657.anInt4082 * 254495303, 2028547978);
						} while (local669 == null || local669.aClass327Array3 == null || local657.anInt4094 * 2071556223 >= local669.aClass327Array3.length || local657 != local669.aClass327Array3[local657.anInt4094 * 2071556223]);
						Class279.method26847(local650, 1015779822);
					}
				}
				local657 = local650.aClass327_3;
				if (local657.anInt4094 * 2071556223 < 0) {
					break;
				}
				local669 = Class301.method27041(local657.anInt4082 * 254495303, 2051151051);
			} while (local669 == null || local669.aClass327Array3 == null || local657.anInt4094 * 2071556223 >= local669.aClass327Array3.length || local657 != local669.aClass327Array3[local657.anInt4094 * 2071556223]);
			Class279.method26847(local650, -852322876);
		}
	}

	@OriginalMember(owner = "client!alx", name = "<init>", descriptor = "()V")
	IcmpService_Sub1() {
	}

	@OriginalMember(owner = "client!alx", name = "notify", descriptor = "(I)V")
	@Override
	protected void notify(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.aList2.iterator();
		while (local3.hasNext()) {
			@Pc(10) Interface73 local10 = (Interface73) local3.next();
			local10.method33346(arg0 == 0, (byte) -5);
		}
	}

	@OriginalMember(owner = "client!alx", name = "notify", descriptor = "(III)V")
	@Override
	protected void notify(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Iterator local3 = this.aList2.iterator();
		while (local3.hasNext()) {
			@Pc(10) Interface73 local10 = (Interface73) local3.next();
			local10.method33341(arg0, arg1, arg2, 252434721);
		}
	}

	@OriginalMember(owner = "client!alx", name = "t", descriptor = "(I)V")
	@Override
	protected void t(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.aList2.iterator();
		while (local3.hasNext()) {
			@Pc(10) Interface73 local10 = (Interface73) local3.next();
			local10.method33346(arg0 == 0, (byte) 31);
		}
	}

	@OriginalMember(owner = "client!alx", name = "f", descriptor = "(I)V")
	@Override
	protected void f(@OriginalArg(0) int arg0) {
		@Pc(3) Iterator local3 = this.aList2.iterator();
		while (local3.hasNext()) {
			@Pc(10) Interface73 local10 = (Interface73) local3.next();
			local10.method33346(arg0 == 0, (byte) -48);
		}
	}

	@OriginalMember(owner = "client!alx", name = "e", descriptor = "(III)V")
	@Override
	protected void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Iterator local3 = this.aList2.iterator();
		while (local3.hasNext()) {
			@Pc(10) Interface73 local10 = (Interface73) local3.next();
			local10.method33341(arg0, arg1, arg2, -733921686);
		}
	}
}
