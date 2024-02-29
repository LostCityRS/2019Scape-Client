package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dy")
public final class Class237 {

	@OriginalMember(owner = "client!dy", name = "e", descriptor = "I")
	public int anInt3858;

	@OriginalMember(owner = "client!dy", name = "n", descriptor = "I")
	public int anInt3856;

	@OriginalMember(owner = "client!dy", name = "m", descriptor = "I")
	public int anInt3860;

	@OriginalMember(owner = "client!dy", name = "k", descriptor = "I")
	int anInt3857;

	@OriginalMember(owner = "client!dy", name = "f", descriptor = "I")
	public int anInt3859;

	@OriginalMember(owner = "client!dy", name = "w", descriptor = "I")
	public int anInt3861;

	@OriginalMember(owner = "client!dy", name = "l", descriptor = "I")
	public int anInt3862;

	@OriginalMember(owner = "client!dy", name = "dq", descriptor = "(Lclient!yf;I)V")
	static void method25863(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class644.method32781(local11, local14, arg0, -470583970);
	}

	@OriginalMember(owner = "client!dy", name = "dh", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;S)V")
	static void method25864(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) short arg3) {
		arg2.anInt6052 -= 463840436;
		arg0.anInt4054 = arg2.anIntArray521[arg2.anInt6052 * -1497248091] * 1504879997;
		arg0.anInt4060 = arg2.anIntArray521[arg2.anInt6052 * -1497248091 + 1] * -1608734411;
		arg0.anInt4028 = arg2.anIntArray521[arg2.anInt6052 * -1497248091 + 2] * -1532105369;
		arg0.anInt4015 = arg2.anIntArray521[arg2.anInt6052 * -1497248091 + 3] * 1866450021;
		Class354.method27789(arg0, -1174743804);
	}

	@OriginalMember(owner = "client!dy", name = "x", descriptor = "(Lclient!do;Lclient!aaq;Lclient!aaq;I)V")
	public static void method25865(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class19 arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3) {
		if (!arg1.method23590((byte) -27) || !arg2.method23590((byte) -54)) {
			return;
		}
		@Pc(10) Class263 local10 = arg1.aClass263_5;
		@Pc(13) Class263 local13 = arg2.aClass263_5;
		if (local10.anIntArray366 == null) {
			if (local10.method26281(-2138096571)) {
				if (local13.anIntArray366 != null) {
					arg0.method6843(arg1.aClass17_5.aClass93_Sub1_Sub5_1, arg1.anInt3216 * 1550739371, arg2.aClass23_10.aClass93_Sub1_Sub10_2, arg2.aClass23_10.anInt72 * -1424564205, arg2.aClass23_10.aClass93_Sub1_Sub10_1, arg2.aClass23_10.anInt73 * -278335347, arg2.anInt3216 * 1550739371, local13.anIntArray371[arg2.anInt3223 * -1046590071], local10.aClass268_1 == null ? null : local10.aClass268_1.aBooleanArray23, local10.aBoolean675 | local13.aBoolean675);
				} else if (local13.method26281(-2139118976)) {
					arg0.method6816(arg1.aClass17_5.aClass93_Sub1_Sub5_1, arg1.anInt3216 * 1550739371, arg2.aClass17_5.aClass93_Sub1_Sub5_1, arg2.anInt3216 * 1550739371, local10.aClass268_1 == null ? null : local10.aClass268_1.aBooleanArray23, local10.aBoolean675);
				}
			}
		} else if (local13.anIntArray366 != null) {
			arg0.method6831(arg1.aClass23_10.aClass93_Sub1_Sub10_2, arg1.aClass23_10.anInt72 * -1424564205, arg1.aClass23_10.aClass93_Sub1_Sub10_1, arg1.aClass23_10.anInt73 * -278335347, arg1.anInt3216 * 1550739371, local10.anIntArray371[arg1.anInt3223 * -1046590071], arg2.aClass23_10.aClass93_Sub1_Sub10_2, arg2.aClass23_10.anInt72 * -1424564205, arg2.aClass23_10.aClass93_Sub1_Sub10_1, arg2.aClass23_10.anInt73 * -278335347, arg2.anInt3216 * 1550739371, local13.anIntArray371[arg2.anInt3223 * -1046590071], local10.aClass268_1 == null ? null : local10.aClass268_1.aBooleanArray23, local10.aBoolean675 | local13.aBoolean675);
		} else if (local13.method26281(-2135334395)) {
			arg0.method6844(arg1.aClass23_10.aClass93_Sub1_Sub10_2, arg1.aClass23_10.anInt72 * -1424564205, arg1.aClass23_10.aClass93_Sub1_Sub10_1, arg1.aClass23_10.anInt73 * -278335347, arg1.anInt3216 * 1550739371, local10.anIntArray371[arg1.anInt3223 * -1046590071], arg2.aClass17_5.aClass93_Sub1_Sub5_1, arg2.anInt3216 * 1550739371, local10.aClass268_1 == null ? null : local10.aClass268_1.aBooleanArray23, local10.aBoolean675 | local13.aBoolean675);
		}
	}

	@OriginalMember(owner = "client!dy", name = "aub", descriptor = "(Lclient!yf;B)V")
	static void method25866(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub38_1.method16333(1120721770);
	}

	@OriginalMember(owner = "client!dy", name = "aky", descriptor = "(Lclient!yf;I)V")
	static void method25867(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(15) Class93_Sub1_Sub20 local15 = Class93_Sub12.method13454((byte) 1);
		if (local15 == null) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
			return;
		}
		@Pc(31) boolean local31 = local15.method23192(local12 >> 14 & 0x3FFF, local12 & 0x3FFF, Class687.anIntArray527, 2066377425);
		if (local31) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class687.anIntArray527[1];
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class687.anIntArray527[2];
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		}
	}

	@OriginalMember(owner = "client!dy", name = "azi", descriptor = "(Lclient!yf;B)V")
	static void method25868(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub31_1.method16121(17402244) ? 1 : 0;
	}

	@OriginalMember(owner = "client!dy", name = "jg", descriptor = "(Lclient!hq;Lclient!hf;B)V")
	public static void method25869(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class312 arg1, @OriginalArg(2) byte arg2) {
		@Pc(4) Class312 local4 = Class431.method28960(arg0, arg1, 1851288469);
		@Pc(11) int local11;
		@Pc(15) int local15;
		if (local4 == null) {
			local11 = client.anInt3408 * -1378711501;
			local15 = client.anInt3416 * 2091353777;
		} else {
			local11 = local4.anInt4022 * 1215292027;
			local15 = local4.anInt4023 * -1490598249;
		}
		Class550.method31212(arg1, local11, local15, false, (byte) 30);
		Class32_Sub3.method16707(arg1, local11, local15, 1663690560);
	}

	@OriginalMember(owner = "client!dy", name = "hd", descriptor = "(IIIIZI)V")
	static void method25870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (client.aClass532_1.method30640(-1152217372) == null) {
			Class694.aClass104_14.method20612(arg0, arg1, arg2, arg3, -16777216, (byte) 115);
			return;
		}
		@Pc(16) Class472 local16 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24241().aClass472_61;
		@Pc(18) boolean local18 = false;
		if (client.anInt3463 * 1819062465 == 3) {
			if ((int) local16.aFloat325 < 0 || (int) local16.aFloat325 >= client.aClass532_1.method30625(1593640891) * 512 || (int) local16.aFloat327 < 0 || (int) local16.aFloat327 >= client.aClass532_1.method30655((short) 128) * 512) {
				local18 = true;
			}
			if (Class429.anInt4942 * -1453926679 == 3 && !Class65.aClass123_Sub1_2.method8987((byte) 37)) {
				local18 = true;
			}
		} else if (!client.aBoolean615) {
			local18 = true;
		}
		if (local18) {
			Class694.aClass104_14.method20612(arg0, arg1, arg2, arg3, -16777216, (byte) 9);
			return;
		}
		client.anInt3495 += -1386163559;
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null && (int) local16.aFloat325 - (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method20009(-274822650) - 1) * 256 >> 9 == Class172.anInt3179 * -820036969 && (int) local16.aFloat327 - (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method20009(564816095) - 1) * 256 >> 9 == Class172.anInt3174 * -1293607373) {
			Class172.anInt3179 = -2004084007;
			Class172.anInt3174 = 246739717;
			Class723.method37124(832556703);
		}
		Class559.method31310(-811294177);
		if (!arg4) {
			Class387.method28426(-1392345673);
		}
		Class293.method26682(2141592615);
		@Pc(135) int local135;
		for (local135 = 0; local135 < client.aClass567Array1.length; local135++) {
			if (client.aClass567Array1[local135] != null && !client.aClass567Array1[local135].method31446(-89462490) && client.aClass567Array1[local135].method31447(Class694.aClass104_14, -1895227578)) {
				client.aClass567Array1[local135].method31451(client.aClass532_1.method30640(-1671370685), (byte) 23);
			}
		}
		Class710.method36980(arg0, arg1, arg2, arg3, true, 2003914095);
		@Pc(177) int local177 = client.anInt3432 * 706492895;
		@Pc(181) int local181 = client.anInt3568 * 1300190535;
		@Pc(185) int local185 = client.anInt3569 * -1968459517;
		@Pc(189) int local189 = client.anInt3570 * -1469130191;
		Class497.method30313(local177, local181, (byte) -47);
		@Pc(240) int local240;
		if (Class429.anInt4942 * -1453926679 == 2) {
			local135 = (int) client.aFloat256;
			if (client.anInt3443 * 182292977 >> 8 > local135) {
				local135 = client.anInt3443 * 182292977 >> 8;
			}
			if (client.aBooleanArray21[4] && client.anIntArray329[4] + 128 > local135) {
				local135 = client.anIntArray329[4] + 128;
			}
			local240 = client.anInt3461 * 1018036723 + (int) client.aFloat253 & 0x3FFF;
			Class716.method37057(Class72.anInt241 * -1022856553, Class305.method26894((int) local16.aFloat325, (int) local16.aFloat327, BaseVarTypeComponentHook.anInt5370 * 1177442423, (byte) -13) - client.anInt3484 * 1974760385, SortedQueueEntry.anInt5047 * -953396699, local135, local240, (local135 >> 3) * 3 + 600 << 2, local189, (byte) -40);
		} else if (Class429.anInt4942 * -1453926679 == 4) {
			local135 = (int) client.aFloat256;
			if (client.anInt3443 * 182292977 >> 8 > local135) {
				local135 = client.anInt3443 * 182292977 >> 8;
			}
			if (client.aBooleanArray21[4] && client.anIntArray329[4] + 128 > local135) {
				local135 = client.anIntArray329[4] + 128;
			}
			local240 = (int) client.aFloat253 & 0x3FFF;
			Class716.method37057(Class72.anInt241 * -1022856553, Class305.method26894(client.anInt3481 * -1195894597, client.anInt3482 * 1196621895, BaseVarTypeComponentHook.anInt5370 * 1177442423, (byte) -53) - client.anInt3484 * 1974760385, SortedQueueEntry.anInt5047 * -953396699, local135, local240, (local135 >> 3) * 3 + 600 << 2, local189, (byte) -83);
		} else if (Class429.anInt4942 * -1453926679 == 1) {
			Class688.method36702(local189, -1103134376);
		}
		local135 = Class163.anInt2002 * -1331168249;
		local240 = Class130_Sub2.anInt1117 * 1055108289;
		@Pc(375) int local375 = Class270.anInt3925 * 466086187;
		@Pc(379) int local379 = Class620.anInt5805 * 607613741;
		@Pc(383) int local383 = Class24.anInt82 * -20667523;
		@Pc(427) int local427;
		for (@Pc(385) int local385 = 0; local385 < 5; local385++) {
			if (client.aBooleanArray21[local385]) {
				local427 = (int) (Math.random() * (double) (client.anIntArray328[local385] * 2 + 1) - (double) client.anIntArray328[local385] + Math.sin((double) client.anIntArray330[local385] / 100.0D * (double) client.anIntArray318[local385]) * (double) client.anIntArray329[local385]);
				if (local385 == 0) {
					Class163.anInt2002 += (local427 << 2) * 1636217271;
				}
				if (local385 == 1) {
					Class130_Sub2.anInt1117 += (local427 << 2) * 1820517185;
				}
				if (local385 == 2) {
					Class270.anInt3925 += (local427 << 2) * -967471741;
				}
				if (local385 == 3) {
					Class24.anInt82 = (Class24.anInt82 * -20667523 + local427 & 0x3FFF) * 1056124373;
				}
				if (local385 == 4) {
					Class620.anInt5805 += local427 * -1151839067;
					if (Class620.anInt5805 * 607613741 < 1024) {
						Class620.anInt5805 = 1632801792;
					} else if (Class620.anInt5805 * 607613741 > 3072) {
						Class620.anInt5805 = 603438080;
					}
				}
			}
		}
		if (Class163.anInt2002 * -1331168249 < 0) {
			Class163.anInt2002 = 0;
		}
		if (Class163.anInt2002 * -1331168249 > (client.aClass532_1.method30640(-1960289076).anInt5604 * -200159665 << 9) - 1) {
			Class163.anInt2002 = ((client.aClass532_1.method30640(-930676881).anInt5604 * -200159665 << 9) - 1) * 1636217271;
		}
		if (Class270.anInt3925 * 466086187 < 0) {
			Class270.anInt3925 = 0;
		}
		if (Class270.anInt3925 * 466086187 > (client.aClass532_1.method30640(-1514757946).anInt5605 * -1943751559 << 9) - 1) {
			Class270.anInt3925 = ((client.aClass532_1.method30640(-1830968116).anInt5605 * -1943751559 << 9) - 1) * -967471741;
		}
		if (Class51.aClass93_Sub36_1.aClass166_Sub15_2.method15685(-980493890) == 2) {
			Class129_Sub1.method9403(1821801795);
		} else if (Class51.aClass93_Sub36_1.aClass166_Sub15_2.method15685(-1048027228) == 3) {
			Class248.method26023((byte) 0);
		}
		Class694.aClass104_14.method20475(local177, local181, local185, local189);
		Class694.aClass104_14.method20481(true);
		Class694.aClass104_14.method20479(local177, local181, local185 + local177, local181 + local189);
		@Pc(606) Class672 local606 = client.aClass532_1.method30713((byte) -101).method33147(65536);
		local427 = local606.method33238((short) -5746);
		@Pc(614) Class368 local614 = new Class368();
		@Pc(618) Class611 local618 = client.aClass532_1.method30624(1897755705);
		if (Class253.method26088((byte) 11)) {
			Class1.aClass123_Sub1_1.method8950(local614, client.aClass470_51, client.aClass489_95, local618.anInt5784 * 270611681 << 9, local618.anInt5785 * -1994307635 << 9, (byte) 6);
		} else if (Class429.anInt4942 * -1453926679 == 3) {
			Class65.aClass123_Sub1_2.method8950(local614, client.aClass470_51, client.aClass489_95, local618.anInt5784 * 270611681 << 9, local618.anInt5785 * -1994307635 << 9, (byte) 6);
		} else {
			client.aClass470_51.method29566((float) -(Class163.anInt2002 * -1331168249), (float) -(Class130_Sub2.anInt1117 * 1055108289), (float) -(Class270.anInt3925 * 466086187));
			client.aClass470_51.method29560(0.0F, -1.0F, 0.0F, Class464.method29463(-(Class24.anInt82 * -20667523) & 0x3FFF));
			client.aClass470_51.method29560(-1.0F, 0.0F, 0.0F, Class464.method29463(-(Class620.anInt5805 * 607613741) & 0x3FFF));
			client.aClass470_51.method29560(0.0F, 0.0F, -1.0F, Class464.method29463(-(Class348.anInt4240 * -602770317) & 0x3FFF));
			Class69.method1228(client.aClass489_95, true, (float) (local185 / 2), (float) (local189 / 2), (float) (client.anInt3571 * -1609686929 << 1), (float) (client.anInt3571 * -1609686929 << 1), local185, local189, 348282027);
		}
		Class694.aClass104_14.method20528(client.aClass470_51);
		Class694.aClass104_14.method20531(client.aClass489_95);
		@Pc(785) int local785;
		if (local606.method33239(-1252342804) == null) {
			Class694.aClass104_14.method20786(3, local427);
		} else {
			Class694.aClass104_14.method20533(1.0F);
			Class694.aClass104_14.method20534(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
			if (Class429.anInt4942 * -1453926679 == 3) {
				@Pc(777) int local777 = (int) ((double) Class65.aClass123_Sub1_2.method8961((byte) 35) * 2607.5945876176133D);
				local785 = (int) ((double) Class65.aClass123_Sub1_2.method8962((byte) -117) * 2607.5945876176133D);
				local606.method33239(1328177676).method31343(Class694.aClass104_14, Class121.anInt1003 * 353504223 << 3, local177, local181, local185, local189, local777, local785, 0, local427, true, false, -2051121824);
			} else {
				local606.method33239(-1832214775).method31343(Class694.aClass104_14, Class121.anInt1003 * 353504223 << 3, local177, local181, local185, local189, Class620.anInt5805 * 607613741, Class24.anInt82 * -20667523, Class348.anInt4240 * -602770317, local427, true, false, -2113800467);
			}
			Class694.aClass104_14.method20513();
		}
		Class694.aClass104_14.method20481(false);
		Class426.method28932(client.aClass470_51, client.aClass489_95, local185, local189, (byte) 2);
		client.aClass532_1.method30713((byte) -48).method33168(client.aClass532_1, (byte) 3);
		local785 = Class51.aClass93_Sub36_1.aClass166_Sub15_2.method15685(530461942);
		@Pc(869) byte local869;
		if (local785 == 2) {
			local869 = (byte) (client.anInt3495 * 1815175593);
		} else if (local785 == 3) {
			local869 = (byte) (client.aBoolean639 ? 1 : -1);
		} else {
			local869 = 1;
		}
		if (Class253.method26088((byte) 84) || Class429.anInt4942 * -1453926679 == 3) {
			client.aClass532_1.method30640(-1085439687).method31755(client.anInt3485, local614.anInt4747 * -1774271657, local614.anInt4748 * -754001767, local614.anInt4749 * 1179660263, client.aClass532_1.method30639((byte) 2), client.anIntArray327, client.anIntArray312, client.anIntArray313, client.anIntArray314, client.anIntArray302, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 + 1, local869, (int) local16.aFloat325 >> 9, (int) local16.aFloat327 >> 9, Class51.aClass93_Sub36_1.aClass166_Sub25_1.method15899(-988861719) == 0, true, 0, true);
		} else {
			client.aClass532_1.method30640(-1151880557).method31755(client.anInt3485, Class163.anInt2002 * -1331168249, Class130_Sub2.anInt1117 * 1055108289, Class270.anInt3925 * 466086187, client.aClass532_1.method30639((byte) -44), client.anIntArray327, client.anIntArray312, client.anIntArray313, client.anIntArray314, client.anIntArray302, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 + 1, local869, (int) local16.aFloat325 >> 9, (int) local16.aFloat327 >> 9, Class51.aClass93_Sub36_1.aClass166_Sub25_1.method15899(-988861719) == 0, true, 0, true);
		}
		client.anInt3494 += -22139677;
		if (!Class694.aClass104_14.method20545() && client.anInt3435 * -849002901 == 18) {
			Class558.method31290(local177, local181, local185, local189, 1351367408);
		}
		client.aClass532_1.method30640(-1188192890).method31633(-698845241);
		Class163.anInt2002 = local135 * 1636217271;
		Class130_Sub2.anInt1117 = local240 * 1820517185;
		Class270.anInt3925 = local375 * -967471741;
		Class620.anInt5805 = local379 * -1151839067;
		Class24.anInt82 = local383 * 1056124373;
		if (client.aBoolean632 && Class520.aClass144_3.method11155(2087464072) == 0) {
			client.aBoolean632 = false;
		}
		if (client.aBoolean632) {
			Class694.aClass104_14.method20612(local177, local181, local185, local189, -16777216, (byte) 34);
			Class95.method1801(Class74.aClass74_99.method1259(Class106.aClass717_8, (byte) -87), false, Class694.aClass104_14, Class82.aClass106_1, Class348.aClass5_14, (byte) -14);
		}
		Class69.method1228(client.aClass489_95, false, (float) (local177 + local185 / 2), (float) (local181 + local189 / 2), (float) (client.anInt3571 * -1609686929 << 1), (float) (client.anInt3571 * -1609686929 << 1), local185, local189, -16711486);
		Class694.aClass104_14.method20531(client.aClass489_95);
		Class663.method33051(client.aClass489_95, (byte) 55);
	}

	@OriginalMember(owner = "client!dy", name = "m", descriptor = "(Ljava/lang/String;II)V")
	public static void method25871(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Class50.aClass28_2 == null) {
			Class50.aClass28_2 = new Class28();
		}
		Class50.aClass28_2.aString4 = arg0;
		Class50.aClass28_2.anInt101 = (arg1 + 1099) * 470002905;
		Class50.aClass28_2.anInt100 = Class250.method26049(Class280.aClass693_1, Class703.aClass703_2, Class50.aClass28_2.anInt101 * 2142901097, -1850088124) * -1138615973;
		Class50.aClass28_2.anInt99 = Class654.method32900(Class280.aClass693_1, Class703.aClass703_2, Class50.aClass28_2.anInt101 * 2142901097, -1904685960) * 702279345;
	}

	@OriginalMember(owner = "client!dy", name = "<init>", descriptor = "(IIIIIII)V")
	public Class237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3858 = arg0 * -938620053;
		this.anInt3856 = arg1 * -192371369;
		this.anInt3860 = arg2 * -316775901;
		this.anInt3857 = arg3 * 1476702379;
		this.anInt3859 = arg4 * -699093173;
		this.anInt3861 = arg5 * -913672293;
		this.anInt3862 = arg6 * 152514549;
	}

	@OriginalMember(owner = "client!dy", name = "<init>", descriptor = "()V")
	public Class237() {
	}

	@OriginalMember(owner = "client!dy", name = "m", descriptor = "(Lclient!dy;)Z")
	public boolean method25860(@OriginalArg(0) Class237 arg0) {
		return this.anInt3858 * -1393096381 == arg0.anInt3858 * -1393096381 && this.anInt3856 * -2052057497 == arg0.anInt3856 * -2052057497 && arg0.anInt3860 * -94478965 == this.anInt3860 * -94478965 && this.anInt3857 * 2074200579 == arg0.anInt3857 * 2074200579 && this.anInt3859 * -8330653 == arg0.anInt3859 * -8330653 && arg0.anInt3861 * 1342314131 == this.anInt3861 * 1342314131 && arg0.anInt3862 * 1290585181 == this.anInt3862 * 1290585181;
	}

	@OriginalMember(owner = "client!dy", name = "n", descriptor = "(Lclient!dy;)Z")
	public boolean method25861(@OriginalArg(0) Class237 arg0) {
		return this.anInt3858 * -1393096381 == arg0.anInt3858 * -1393096381 && this.anInt3856 * -2052057497 == arg0.anInt3856 * -2052057497 && arg0.anInt3860 * -94478965 == this.anInt3860 * -94478965 && this.anInt3857 * 2074200579 == arg0.anInt3857 * 2074200579 && this.anInt3859 * -8330653 == arg0.anInt3859 * -8330653 && arg0.anInt3861 * 1342314131 == this.anInt3861 * 1342314131 && arg0.anInt3862 * 1290585181 == this.anInt3862 * 1290585181;
	}

	@OriginalMember(owner = "client!dy", name = "e", descriptor = "(Lclient!dy;I)Z")
	public boolean method25862(@OriginalArg(0) Class237 arg0, @OriginalArg(1) int arg1) {
		return this.anInt3858 * -1393096381 == arg0.anInt3858 * -1393096381 && this.anInt3856 * -2052057497 == arg0.anInt3856 * -2052057497 && arg0.anInt3860 * -94478965 == this.anInt3860 * -94478965 && this.anInt3857 * 2074200579 == arg0.anInt3857 * 2074200579 && this.anInt3859 * -8330653 == arg0.anInt3859 * -8330653 && arg0.anInt3861 * 1342314131 == this.anInt3861 * 1342314131 && arg0.anInt3862 * 1290585181 == this.anInt3862 * 1290585181;
	}
}
