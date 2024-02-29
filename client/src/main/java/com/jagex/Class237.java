package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dy")
public class Class237 {

	@OriginalMember(owner = "client!dy", name = "n", descriptor = "I")
	public int anInt3815;

	@OriginalMember(owner = "client!dy", name = "k", descriptor = "I")
	int anInt3816;

	@OriginalMember(owner = "client!dy", name = "e", descriptor = "I")
	public int anInt3817;

	@OriginalMember(owner = "client!dy", name = "f", descriptor = "I")
	public int anInt3818;

	@OriginalMember(owner = "client!dy", name = "m", descriptor = "I")
	public int anInt3819;

	@OriginalMember(owner = "client!dy", name = "w", descriptor = "I")
	public int anInt3820;

	@OriginalMember(owner = "client!dy", name = "l", descriptor = "I")
	public int anInt3821;

	@OriginalMember(owner = "client!dy", name = "<init>", descriptor = "()V", line = 12)
	public Class237() {
	}

	@OriginalMember(owner = "client!dy", name = "<init>", descriptor = "(IIIIIII)V", line = 14)
	public Class237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3817 = arg0 * -938620053;
		this.anInt3815 = arg1 * -192371369;
		this.anInt3819 = arg2 * -316775901;
		this.anInt3816 = arg3 * 1476702379;
		this.anInt3818 = arg4 * -699093173;
		this.anInt3820 = arg5 * -913672293;
		this.anInt3821 = arg6 * 152514549;
	}

	@OriginalMember(owner = "client!dy", name = "m", descriptor = "(Lclient!dy;)Z", line = 25)
	public boolean method25767(@OriginalArg(0) Class237 arg0) {
		return this.anInt3817 * -1393096381 == arg0.anInt3817 * -1393096381 && this.anInt3815 * -2052057497 == arg0.anInt3815 * -2052057497 && arg0.anInt3819 * -94478965 == this.anInt3819 * -94478965 && this.anInt3816 * 2074200579 == arg0.anInt3816 * 2074200579 && this.anInt3818 * -8330653 == arg0.anInt3818 * -8330653 && arg0.anInt3820 * 1342314131 == this.anInt3820 * 1342314131 && arg0.anInt3821 * 1290585181 == this.anInt3821 * 1290585181;
	}

	@OriginalMember(owner = "client!dy", name = "n", descriptor = "(Lclient!dy;)Z", line = 25)
	public boolean method25768(@OriginalArg(0) Class237 arg0) {
		return this.anInt3817 * -1393096381 == arg0.anInt3817 * -1393096381 && this.anInt3815 * -2052057497 == arg0.anInt3815 * -2052057497 && arg0.anInt3819 * -94478965 == this.anInt3819 * -94478965 && this.anInt3816 * 2074200579 == arg0.anInt3816 * 2074200579 && this.anInt3818 * -8330653 == arg0.anInt3818 * -8330653 && arg0.anInt3820 * 1342314131 == this.anInt3820 * 1342314131 && arg0.anInt3821 * 1290585181 == this.anInt3821 * 1290585181;
	}

	@OriginalMember(owner = "client!dy", name = "e", descriptor = "(Lclient!dy;I)Z", line = 25)
	public boolean method25769(@OriginalArg(0) Class237 arg0, @OriginalArg(1) int arg1) {
		return this.anInt3817 * -1393096381 == arg0.anInt3817 * -1393096381 && this.anInt3815 * -2052057497 == arg0.anInt3815 * -2052057497 && arg0.anInt3819 * -94478965 == this.anInt3819 * -94478965 && this.anInt3816 * 2074200579 == arg0.anInt3816 * 2074200579 && this.anInt3818 * -8330653 == arg0.anInt3818 * -8330653 && arg0.anInt3820 * 1342314131 == this.anInt3820 * 1342314131 && arg0.anInt3821 * 1290585181 == this.anInt3821 * 1290585181;
	}

	@OriginalMember(owner = "client!dy", name = "m", descriptor = "(Ljava/lang/String;II)V", line = 64)
	public static void method25770(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Class50.aClass28_2 == null) {
			Class50.aClass28_2 = new Class28();
		}
		Class50.aClass28_2.aString4 = arg0;
		Class50.aClass28_2.anInt101 = (arg1 + 1099) * 470002905;
		Class50.aClass28_2.anInt100 = Class250.method25947(Class280.aClass693_1, Class703.aClass703_2, Class50.aClass28_2.anInt101 * 2142901097, -1850088124) * -1138615973;
		Class50.aClass28_2.anInt99 = Class654.method32718(Class280.aClass693_1, Class703.aClass703_2, Class50.aClass28_2.anInt101 * 2142901097, -1904685960) * 702279345;
	}

	@OriginalMember(owner = "client!dy", name = "x", descriptor = "(Lclient!do;Lclient!aaq;Lclient!aaq;I)V", line = 192)
	public static final void method25771(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class19 arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3) {
		if (!arg1.method23630((byte) -27) || !arg2.method23630((byte) -54)) {
			return;
		}
		@Pc(10) Class263 local10 = arg1.aClass263_5;
		@Pc(13) Class263 local13 = arg2.aClass263_5;
		if (local10.anIntArray364 == null) {
			if (local10.method26194(-2138096571)) {
				if (local13.anIntArray364 != null) {
					arg0.method6845(arg1.aClass17_5.aClass93_Sub1_Sub5_1, arg1.anInt3216 * 1550739371, arg2.aClass23_10.aClass93_Sub1_Sub10_2, arg2.aClass23_10.anInt72 * -1424564205, arg2.aClass23_10.aClass93_Sub1_Sub10_1, arg2.aClass23_10.anInt73 * -278335347, arg2.anInt3216 * 1550739371, local13.anIntArray369[arg2.anInt3223 * -1046590071], local10.aClass268_1 == null ? null : local10.aClass268_1.aBooleanArray23, local10.aBoolean671 | local13.aBoolean671);
				} else if (local13.method26194(-2139118976)) {
					arg0.method6843(arg1.aClass17_5.aClass93_Sub1_Sub5_1, arg1.anInt3216 * 1550739371, arg2.aClass17_5.aClass93_Sub1_Sub5_1, arg2.anInt3216 * 1550739371, local10.aClass268_1 == null ? null : local10.aClass268_1.aBooleanArray23, local10.aBoolean671);
				}
			}
		} else if (local13.anIntArray364 != null) {
			arg0.method6838(arg1.aClass23_10.aClass93_Sub1_Sub10_2, arg1.aClass23_10.anInt72 * -1424564205, arg1.aClass23_10.aClass93_Sub1_Sub10_1, arg1.aClass23_10.anInt73 * -278335347, arg1.anInt3216 * 1550739371, local10.anIntArray369[arg1.anInt3223 * -1046590071], arg2.aClass23_10.aClass93_Sub1_Sub10_2, arg2.aClass23_10.anInt72 * -1424564205, arg2.aClass23_10.aClass93_Sub1_Sub10_1, arg2.aClass23_10.anInt73 * -278335347, arg2.anInt3216 * 1550739371, local13.anIntArray369[arg2.anInt3223 * -1046590071], local10.aClass268_1 == null ? null : local10.aClass268_1.aBooleanArray23, local10.aBoolean671 | local13.aBoolean671);
		} else if (local13.method26194(-2135334395)) {
			arg0.method6849(arg1.aClass23_10.aClass93_Sub1_Sub10_2, arg1.aClass23_10.anInt72 * -1424564205, arg1.aClass23_10.aClass93_Sub1_Sub10_1, arg1.aClass23_10.anInt73 * -278335347, arg1.anInt3216 * 1550739371, local10.anIntArray369[arg1.anInt3223 * -1046590071], arg2.aClass17_5.aClass93_Sub1_Sub5_1, arg2.anInt3216 * 1550739371, local10.aClass268_1 == null ? null : local10.aClass268_1.aBooleanArray23, local10.aBoolean671 | local13.aBoolean671);
		}
	}

	@OriginalMember(owner = "client!dy", name = "hd", descriptor = "(IIIIZI)V", line = 4428)
	static final void method25772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (client.aClass532_1.method30481(-1152217372) == null) {
			Class694.aClass104_14.method20469(arg0, arg1, arg2, arg3, -16777216, (byte) 115);
			return;
		}
		@Pc(16) Class472 local16 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method24220().aClass472_61;
		@Pc(18) boolean local18 = false;
		if (client.anInt3463 * 1819062465 == 3) {
			if ((int) local16.aFloat317 < 0 || (int) local16.aFloat317 >= client.aClass532_1.method30459(1593640891) * 512 || (int) local16.aFloat319 < 0 || (int) local16.aFloat319 >= client.aClass532_1.method30466((short) 128) * 512) {
				local18 = true;
			}
			if (Class429.anInt4781 * -1453926679 == 3 && !Class65.aClass123_Sub1_2.method9003((byte) 37)) {
				local18 = true;
			}
		} else if (!client.aBoolean613) {
			local18 = true;
		}
		if (local18) {
			Class694.aClass104_14.method20469(arg0, arg1, arg2, arg3, -16777216, (byte) 9);
			return;
		}
		client.anInt3495 += -1386163559;
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 != null && (int) local16.aFloat317 - (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method19986(-274822650) - 1) * 256 >> 9 == Class172.anInt3179 * -820036969 && (int) local16.aFloat319 - (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.method19986(564816095) - 1) * 256 >> 9 == Class172.anInt3174 * -1293607373) {
			Class172.anInt3179 = -2004084007;
			Class172.anInt3174 = 246739717;
			Class723.method36942(832556703);
		}
		Class559.method31127(-811294177);
		if (!arg4) {
			Class387.method28244(-1392345673);
		}
		Class293.method26588(2141592615);
		@Pc(135) int local135;
		for (local135 = 0; local135 < client.aClass567Array1.length; local135++) {
			if (client.aClass567Array1[local135] != null && !client.aClass567Array1[local135].method31280(-89462490) && client.aClass567Array1[local135].method31282(Class694.aClass104_14, -1895227578)) {
				client.aClass567Array1[local135].method31265(client.aClass532_1.method30481(-1671370685), (byte) 23);
			}
		}
		Class710.method36799(arg0, arg1, arg2, arg3, true, 2003914095);
		@Pc(177) int local177 = client.anInt3432 * 706492895;
		@Pc(181) int local181 = client.anInt3568 * 1300190535;
		@Pc(185) int local185 = client.anInt3569 * -1968459517;
		@Pc(189) int local189 = client.anInt3570 * -1469130191;
		Class497.method30131(local177, local181, (byte) -47);
		@Pc(240) int local240;
		if (Class429.anInt4781 * -1453926679 == 2) {
			local135 = (int) client.aFloat256;
			if (client.anInt3443 * 182292977 >> 8 > local135) {
				local135 = client.anInt3443 * 182292977 >> 8;
			}
			if (client.aBooleanArray21[4] && client.anIntArray329[4] + 128 > local135) {
				local135 = client.anIntArray329[4] + 128;
			}
			local240 = client.anInt3461 * 1018036723 + (int) client.aFloat253 & 0x3FFF;
			Class716.method36876(Class72.anInt241 * -1022856553, Class305.method26802((int) local16.aFloat317, (int) local16.aFloat319, Class512.anInt5209 * 1177442423, (byte) -13) - client.anInt3484 * 1974760385, Class441.anInt4886 * -953396699, local135, local240, (local135 >> 3) * 3 + 600 << 2, local189, (byte) -40);
		} else if (Class429.anInt4781 * -1453926679 == 4) {
			local135 = (int) client.aFloat256;
			if (client.anInt3443 * 182292977 >> 8 > local135) {
				local135 = client.anInt3443 * 182292977 >> 8;
			}
			if (client.aBooleanArray21[4] && client.anIntArray329[4] + 128 > local135) {
				local135 = client.anIntArray329[4] + 128;
			}
			local240 = (int) client.aFloat253 & 0x3FFF;
			Class716.method36876(Class72.anInt241 * -1022856553, Class305.method26802(client.anInt3481 * -1195894597, client.anInt3482 * 1196621895, Class512.anInt5209 * 1177442423, (byte) -53) - client.anInt3484 * 1974760385, Class441.anInt4886 * -953396699, local135, local240, (local135 >> 3) * 3 + 600 << 2, local189, (byte) -83);
		} else if (Class429.anInt4781 * -1453926679 == 1) {
			Class688.method36520(local189, -1103134376);
		}
		local135 = Class163.anInt2002 * -1331168249;
		local240 = Class130_Sub2.anInt1117 * 1055108289;
		@Pc(375) int local375 = Class270.anInt3884 * 466086187;
		@Pc(379) int local379 = Class620.anInt5644 * 607613741;
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
					Class270.anInt3884 += (local427 << 2) * -967471741;
				}
				if (local385 == 3) {
					Class24.anInt82 = (Class24.anInt82 * -20667523 + local427 & 0x3FFF) * 1056124373;
				}
				if (local385 == 4) {
					Class620.anInt5644 += local427 * -1151839067;
					if (Class620.anInt5644 * 607613741 < 1024) {
						Class620.anInt5644 = 1632801792;
					} else if (Class620.anInt5644 * 607613741 > 3072) {
						Class620.anInt5644 = 603438080;
					}
				}
			}
		}
		if (Class163.anInt2002 * -1331168249 < 0) {
			Class163.anInt2002 = 0;
		}
		if (Class163.anInt2002 * -1331168249 > (client.aClass532_1.method30481(-1960289076).anInt5443 * -200159665 << 9) - 1) {
			Class163.anInt2002 = ((client.aClass532_1.method30481(-930676881).anInt5443 * -200159665 << 9) - 1) * 1636217271;
		}
		if (Class270.anInt3884 * 466086187 < 0) {
			Class270.anInt3884 = 0;
		}
		if (Class270.anInt3884 * 466086187 > (client.aClass532_1.method30481(-1514757946).anInt5444 * -1943751559 << 9) - 1) {
			Class270.anInt3884 = ((client.aClass532_1.method30481(-1830968116).anInt5444 * -1943751559 << 9) - 1) * -967471741;
		}
		if (Class51.aClass93_Sub36_1.aClass166_Sub15_2.method15673(-980493890) == 2) {
			Class129_Sub1.method9405(1821801795);
		} else if (Class51.aClass93_Sub36_1.aClass166_Sub15_2.method15673(-1048027228) == 3) {
			Class248.method25931((byte) 0);
		}
		Class694.aClass104_14.method20566(local177, local181, local185, local189);
		Class694.aClass104_14.method20461(true);
		Class694.aClass104_14.method20569(local177, local181, local185 + local177, local181 + local189);
		@Pc(606) Class672 local606 = client.aClass532_1.method30494((byte) -101).method32976(65536);
		local427 = local606.method33076((short) -5746);
		@Pc(614) Class368 local614 = new Class368();
		@Pc(618) Class611 local618 = client.aClass532_1.method30455(1897755705);
		if (Class253.method25991((byte) 11)) {
			Class1.aClass123_Sub1_1.method9006(local614, client.aClass470_51, client.aClass489_95, local618.anInt5623 * 270611681 << 9, local618.anInt5624 * -1994307635 << 9, (byte) 6);
		} else if (Class429.anInt4781 * -1453926679 == 3) {
			Class65.aClass123_Sub1_2.method9006(local614, client.aClass470_51, client.aClass489_95, local618.anInt5623 * 270611681 << 9, local618.anInt5624 * -1994307635 << 9, (byte) 6);
		} else {
			client.aClass470_51.method29419((float) -(Class163.anInt2002 * -1331168249), (float) -(Class130_Sub2.anInt1117 * 1055108289), (float) -(Class270.anInt3884 * 466086187));
			client.aClass470_51.method29403(0.0F, -1.0F, 0.0F, Class464.method29281(-(Class24.anInt82 * -20667523) & 0x3FFF));
			client.aClass470_51.method29403(-1.0F, 0.0F, 0.0F, Class464.method29281(-(Class620.anInt5644 * 607613741) & 0x3FFF));
			client.aClass470_51.method29403(0.0F, 0.0F, -1.0F, Class464.method29281(-(Class348.anInt4199 * -602770317) & 0x3FFF));
			Class69.method1229(client.aClass489_95, true, (float) (local185 / 2), (float) (local189 / 2), (float) (client.anInt3571 * -1609686929 << 1), (float) (client.anInt3571 * -1609686929 << 1), local185, local189, 348282027);
		}
		Class694.aClass104_14.method20601(client.aClass470_51);
		Class694.aClass104_14.method20604(client.aClass489_95);
		@Pc(785) int local785;
		if (local606.method33078(-1252342804) == null) {
			Class694.aClass104_14.method20829(3, local427);
		} else {
			Class694.aClass104_14.method20606(1.0F);
			Class694.aClass104_14.method20607(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
			if (Class429.anInt4781 * -1453926679 == 3) {
				@Pc(777) int local777 = (int) ((double) Class65.aClass123_Sub1_2.method9040((byte) 35) * 2607.5945876176133D);
				local785 = (int) ((double) Class65.aClass123_Sub1_2.method9042((byte) -117) * 2607.5945876176133D);
				local606.method33078(1328177676).method31178(Class694.aClass104_14, Class121.anInt1003 * 353504223 << 3, local177, local181, local185, local189, local777, local785, 0, local427, true, false, -2051121824);
			} else {
				local606.method33078(-1832214775).method31178(Class694.aClass104_14, Class121.anInt1003 * 353504223 << 3, local177, local181, local185, local189, Class620.anInt5644 * 607613741, Class24.anInt82 * -20667523, Class348.anInt4199 * -602770317, local427, true, false, -2113800467);
			}
			Class694.aClass104_14.method20489();
		}
		Class694.aClass104_14.method20461(false);
		Class426.method28751(client.aClass470_51, client.aClass489_95, local185, local189, (byte) 2);
		client.aClass532_1.method30494((byte) -48).method32962(client.aClass532_1, (byte) 3);
		local785 = Class51.aClass93_Sub36_1.aClass166_Sub15_2.method15673(530461942);
		@Pc(869) byte local869;
		if (local785 == 2) {
			local869 = (byte) (client.anInt3495 * 1815175593);
		} else if (local785 == 3) {
			local869 = (byte) (client.aBoolean637 ? 1 : -1);
		} else {
			local869 = 1;
		}
		if (Class253.method25991((byte) 84) || Class429.anInt4781 * -1453926679 == 3) {
			client.aClass532_1.method30481(-1085439687).method31572(client.anInt3485, local614.anInt4586 * -1774271657, local614.anInt4587 * -754001767, local614.anInt4588 * 1179660263, client.aClass532_1.method30504((byte) 2), client.anIntArray327, client.anIntArray312, client.anIntArray313, client.anIntArray314, client.anIntArray302, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 + 1, local869, (int) local16.aFloat317 >> 9, (int) local16.aFloat319 >> 9, Class51.aClass93_Sub36_1.aClass166_Sub25_1.method15888(-988861719) == 0, true, 0, true);
		} else {
			client.aClass532_1.method30481(-1151880557).method31572(client.anInt3485, Class163.anInt2002 * -1331168249, Class130_Sub2.anInt1117 * 1055108289, Class270.anInt3884 * 466086187, client.aClass532_1.method30504((byte) -44), client.anIntArray327, client.anIntArray312, client.anIntArray313, client.anIntArray314, client.anIntArray302, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aByte100 + 1, local869, (int) local16.aFloat317 >> 9, (int) local16.aFloat319 >> 9, Class51.aClass93_Sub36_1.aClass166_Sub25_1.method15888(-988861719) == 0, true, 0, true);
		}
		client.anInt3494 += -22139677;
		if (!Class694.aClass104_14.method20615() && client.anInt3435 * -849002901 == 18) {
			Class558.method31110(local177, local181, local185, local189, 1351367408);
		}
		client.aClass532_1.method30481(-1188192890).method31498(-698845241);
		Class163.anInt2002 = local135 * 1636217271;
		Class130_Sub2.anInt1117 = local240 * 1820517185;
		Class270.anInt3884 = local375 * -967471741;
		Class620.anInt5644 = local379 * -1151839067;
		Class24.anInt82 = local383 * 1056124373;
		if (client.aBoolean630 && Class520.aClass144_3.method11152(2087464072) == 0) {
			client.aBoolean630 = false;
		}
		if (client.aBoolean630) {
			Class694.aClass104_14.method20469(local177, local181, local185, local189, -16777216, (byte) 34);
			Class95.method1801(Class74.aClass74_99.method1259(Class106.aClass717_8, (byte) -87), false, Class694.aClass104_14, Class82.aClass106_1, Class348.aClass5_14, (byte) -14);
		}
		Class69.method1229(client.aClass489_95, false, (float) (local177 + local185 / 2), (float) (local181 + local189 / 2), (float) (client.anInt3571 * -1609686929 << 1), (float) (client.anInt3571 * -1609686929 << 1), local185, local189, -16711486);
		Class694.aClass104_14.method20604(client.aClass489_95);
		Class663.method32867(client.aClass489_95, (byte) 55);
	}

	@OriginalMember(owner = "client!dy", name = "dq", descriptor = "(Lclient!yf;I)V", line = 5533)
	static final void method25773(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class644.method32601(local11, local14, arg0, -470583970);
	}

	@OriginalMember(owner = "client!dy", name = "dh", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;S)V", line = 5637)
	static final void method25774(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) short arg3) {
		arg2.anInt5891 -= 463840436;
		arg0.anInt4013 = arg2.anIntArray519[arg2.anInt5891 * -1497248091] * 1504879997;
		arg0.anInt4019 = arg2.anIntArray519[arg2.anInt5891 * -1497248091 + 1] * -1608734411;
		arg0.anInt3987 = arg2.anIntArray519[arg2.anInt5891 * -1497248091 + 2] * -1532105369;
		arg0.anInt3974 = arg2.anIntArray519[arg2.anInt5891 * -1497248091 + 3] * 1866450021;
		Class354.method27694(arg0, -1174743804);
	}

	@OriginalMember(owner = "client!dy", name = "jg", descriptor = "(Lclient!hq;Lclient!hf;B)V", line = 10863)
	public static void method25775(@OriginalArg(0) Class320 arg0, @OriginalArg(1) Class312 arg1, @OriginalArg(2) byte arg2) {
		@Pc(4) Class312 local4 = Class431.method28780(arg0, arg1, 1851288469);
		@Pc(11) int local11;
		@Pc(15) int local15;
		if (local4 == null) {
			local11 = client.anInt3408 * -1378711501;
			local15 = client.anInt3416 * 2091353777;
		} else {
			local11 = local4.anInt3981 * 1215292027;
			local15 = local4.anInt3982 * -1490598249;
		}
		Class550.method31032(arg1, local11, local15, false, (byte) 30);
		Class32_Sub3.method16695(arg1, local11, local15, 1663690560);
	}

	@OriginalMember(owner = "client!dy", name = "aky", descriptor = "(Lclient!yf;I)V", line = 11683)
	static final void method25776(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(15) Class93_Sub1_Sub20 local15 = Class93_Sub12.method13453((byte) 1);
		if (local15 == null) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
			return;
		}
		@Pc(31) boolean local31 = local15.method23170(local12 >> 14 & 0x3FFF, local12 & 0x3FFF, Class687.anIntArray525, 2066377425);
		if (local31) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class687.anIntArray525[1];
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class687.anIntArray525[2];
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = -1;
		}
	}

	@OriginalMember(owner = "client!dy", name = "aub", descriptor = "(Lclient!yf;B)V", line = 13421)
	static final void method25777(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub38_1.method16324(1120721770);
	}

	@OriginalMember(owner = "client!dy", name = "azi", descriptor = "(Lclient!yf;B)V", line = 14197)
	static final void method25778(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub31_1.method16107(17402244) ? 1 : 0;
	}
}
