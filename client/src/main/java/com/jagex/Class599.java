package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class599 implements Interface11, Interface5 {

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "[I")
	int[] anIntArray485;

	@OriginalMember(owner = "client!ur", name = "t", descriptor = "I")
	int anInt5367 = 1834239995;

	@OriginalMember(owner = "client!ur", name = "f", descriptor = "I")
	int anInt5366 = -217726385;

	@OriginalMember(owner = "client!ur", name = "u", descriptor = "Lclient!ud;")
	Class590 aClass590_4 = Class590.aClass590_2;

	@OriginalMember(owner = "client!ur", name = "l", descriptor = "I")
	int anInt5368 = 369089243;

	@OriginalMember(owner = "client!ur", name = "x", descriptor = "(IIIILclient!an;Lclient!an;)Lclient!sg;")
	public static Class549 method32041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface12 arg4, @OriginalArg(5) Interface12 arg5) {
		@Pc(1) Class551[] local1 = null;
		@Pc(7) Class599 local7 = (Class599) arg4.method18054(arg0, -365561077);
		if (local7.anIntArray485 != null) {
			local1 = new Class551[local7.anIntArray485.length];
			for (@Pc(18) int local18 = 0; local18 < local1.length; local18++) {
				@Pc(31) Class339 local31 = (Class339) arg5.method18054(local7.anIntArray485[local18], 166387156);
				local1[local18] = new Class551(local31.anInt4238 * 1216571503, local31.anInt4235 * -1648002053, local31.anInt4233 * 1172733063, local31.anInt4234 * 801325829, local31.anInt4241 * 808824183, local31.anInt4232 * 1648630711, local31.anInt4236 * -934380399, local31.aBoolean830, local31.anInt4239 * 83482639, local31.anInt4237 * -332013255, local31.anInt4240 * -239156799);
			}
		}
		return new Class549(local7.anInt5367 * -361999155, local1, local7.anInt5366 * -1736316079, arg1, arg2, arg3, local7.aClass590_4, local7.anInt5368 * -1176670547);
	}

	@OriginalMember(owner = "client!ur", name = "w", descriptor = "(IIIILclient!an;Lclient!an;)Lclient!sg;")
	public static Class549 method32042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface12 arg4, @OriginalArg(5) Interface12 arg5) {
		@Pc(1) Class551[] local1 = null;
		@Pc(7) Class599 local7 = (Class599) arg4.method18054(arg0, -1050122764);
		if (local7.anIntArray485 != null) {
			local1 = new Class551[local7.anIntArray485.length];
			for (@Pc(18) int local18 = 0; local18 < local1.length; local18++) {
				@Pc(31) Class339 local31 = (Class339) arg5.method18054(local7.anIntArray485[local18], -862082377);
				local1[local18] = new Class551(local31.anInt4238 * 1216571503, local31.anInt4235 * -1648002053, local31.anInt4233 * 1172733063, local31.anInt4234 * 801325829, local31.anInt4241 * 808824183, local31.anInt4232 * 1648630711, local31.anInt4236 * -934380399, local31.aBoolean830, local31.anInt4239 * 83482639, local31.anInt4237 * -332013255, local31.anInt4240 * -239156799);
			}
		}
		return new Class549(local7.anInt5367 * -361999155, local1, local7.anInt5366 * -1736316079, arg1, arg2, arg3, local7.aClass590_4, local7.anInt5368 * -1176670547);
	}

	@OriginalMember(owner = "client!ur", name = "i", descriptor = "(Lclient!yp;I)V")
	static void method32043(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -442943724;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		@Pc(43) int local43 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 3];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class143_Sub4.method11768(local13, local23, local33, local43 != 0, (byte) -85);
	}

	@OriginalMember(owner = "client!ur", name = "s", descriptor = "(ILjava/lang/String;II)V")
	public static void method32044(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) Class80_Sub1_Sub20 local5 = Class584.method31840(Class158.aClass158_65, arg0, -1, 996633918);
		if (local5 == null) {
			return;
		}
		@Pc(12) Class690 local12 = Class677.method33596(-1899869018);
		local12.anIntArray527 = new int[local5.anInt3147 * 132623];
		local12.anObjectArray45 = new String[local5.anInt3146 * 37010973];
		local12.anObjectArray45[0] = arg1;
		local12.anIntArray527[0] = arg2;
		Class430.method29084(local5, 500000, local12, (byte) 9);
	}

	@OriginalMember(owner = "client!ur", name = "hd", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;B)V")
	static void method32045(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) byte arg3) {
		arg0.anInt4136 = -255961727;
		arg0.anInt4122 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581] * -258024019;
		if (arg0.anInt4094 * 2071556223 == -1 && !arg1.aBoolean794) {
			Class22.method546(arg0.anInt4087 * -2053489901, (byte) -16);
		}
	}

	@OriginalMember(owner = "client!ur", name = "aol", descriptor = "(Lclient!yp;B)V")
	static void method32046(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class160.aClass121_Sub1_2.method9602((byte) 102).anInt4487 * -1638462787;
	}

	@OriginalMember(owner = "client!ur", name = "apu", descriptor = "(Lclient!yp;B)V")
	static void method32047(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) throws Exception_Sub3 {
		arg0.anInt5778 -= 1815275855;
		Class160.aClass121_Sub1_2.method9606((float) arg0.anIntArray525[arg0.anInt5778 * 1896589581], (float) arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1], (float) arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2], -1827977621);
	}

	@OriginalMember(owner = "client!ur", name = "bdv", descriptor = "(Lclient!yp;B)V")
	static void method32048(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.aClass274_1.method26780(local12, 751981932);
	}

	@OriginalMember(owner = "client!ur", name = "t", descriptor = "(I)[Lclient!zl;")
	public static Class710[] method32049(@OriginalArg(0) int arg0) {
		return new Class710[] { Class710.aClass710_5, Class710.aClass710_7, Class710.aClass710_8, Class710.aClass710_6, Class710.aClass710_4 };
	}

	@OriginalMember(owner = "client!ur", name = "fv", descriptor = "(II)Z")
	static boolean method32050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 15 || arg0 == 16;
	}

	@OriginalMember(owner = "client!ur", name = "g", descriptor = "(Lclient!aqb;S)V")
	public static void method32051(@OriginalArg(0) Class120_Sub1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) short arg1) {
		for (@Pc(4) Class80_Sub21 local4 = (Class80_Sub21) Class80_Sub21.aClass8_21.method247(129206984); local4 != null; local4 = (Class80_Sub21) Class80_Sub21.aClass8_21.method237(-303802721)) {
			if (arg0 == local4.aClass120_Sub1_Sub1_Sub1_Sub1_1) {
				if (local4.aClass529_3 != null) {
					local4.aClass529_3.method30788(100, 1175969086);
					Class490.aClass263_13.method26582(local4.aClass529_3, (byte) -63);
					local4.aClass529_3 = null;
				}
				local4.method24395((byte) 125);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "df", descriptor = "(Lclient!di;Lclient!dx;I)V")
	static void method32052(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class235 arg1, @OriginalArg(2) int arg2) {
		if (Class159_Sub1.anInt2017 * 1776676847 == 100 || Class159_Sub1.aClass80_Sub1_Sub12_3 == null) {
			return;
		}
		Class303.method27111((byte) 81);
		Class303.method27111((byte) 24);
		@Pc(21) int local21;
		@Pc(27) int local27;
		if (Class159_Sub1.anInt2017 * 1776676847 < 10) {
			for (local21 = 0; local21 < Class159_Sub1.aClass104ArrayArray1.length; local21++) {
				for (local27 = 0; local27 < Class159_Sub1.aClass104ArrayArray1[local21].length; local27++) {
					Class708.aClass480_136.method29945(Class159_Sub1.aClass632_2.anIntArrayArray66[local21][local27], (byte) 1);
					Class569.aClass480_124.method29945(Class159_Sub1.aClass632_2.anIntArrayArray66[local21][local27], (byte) 1);
				}
			}
			if (!Class159_Sub1.aClass480_48.method29987(Class159_Sub1.aClass80_Sub1_Sub12_3.aString108, 789783711)) {
				Class159_Sub1.anInt2017 = Class310.aClass480_93.method29942(Class159_Sub1.aClass80_Sub1_Sub12_3.aString108, 1029703357) / 10 * -350806257;
				return;
			}
			Class159_Sub1.anInt2017 = 786904726;
		}
		if (Class159_Sub1.anInt2017 * 1776676847 == 10) {
			Class159_Sub1.anInt1991 = Class159_Sub1.aClass80_Sub1_Sub12_3.anInt3093 * 1171189611 >> 6 << 6;
			Class159_Sub1.anInt1996 = Class159_Sub1.aClass80_Sub1_Sub12_3.anInt3095 * -893056067 >> 6 << 6;
			Class159_Sub1.anInt2001 = (Class159_Sub1.aClass80_Sub1_Sub12_3.anInt3094 * -828099429 >> 6 << 6) - Class159_Sub1.anInt1991 + 64;
			Class159_Sub1.anInt1989 = (Class159_Sub1.aClass80_Sub1_Sub12_3.anInt3096 * 1673061885 >> 6 << 6) - Class159_Sub1.anInt1996 + 64;
			@Pc(128) int[] local128 = new int[3];
			local27 = -1;
			@Pc(132) int local132 = -1;
			@Pc(136) Class463 local136 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method24552().aClass463_61;
			@Pc(140) Class626 local140 = client.aClass539_1.method30893((byte) -99);
			if (Class159_Sub1.aClass80_Sub1_Sub12_3.method22596(Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aByte99, ((int) local136.aFloat297 >> 9) + local140.anInt5540 * -390642507, ((int) local136.aFloat296 >> 9) + local140.anInt5537 * -894305615, local128, (byte) -104)) {
				local27 = local128[1] - Class159_Sub1.anInt1991;
				local132 = local128[2] - Class159_Sub1.anInt1996;
			}
			if (!Class159_Sub1.aBoolean403 && local27 >= 0 && local27 < Class159_Sub1.anInt2001 && local132 >= 0 && local132 < Class159_Sub1.anInt1989) {
				local27 += (int) (Math.random() * 10.0D) - 5;
				local132 += (int) (Math.random() * 10.0D) - 5;
				Class159_Sub1.anInt2026 = local27 * 1633656115;
				Class158.anInt2029 = local132 * -1296666553;
			} else if (Class159_Sub1.anInt2021 * 1564922793 == -1 || Class159_Sub1.anInt2025 * 626388537 == -1) {
				Class159_Sub1.aClass80_Sub1_Sub12_3.method22595(Class159_Sub1.aClass80_Sub1_Sub12_3.anInt3089 * -1734311989 >> 14 & 0x3FFF, Class159_Sub1.aClass80_Sub1_Sub12_3.anInt3089 * -1734311989 & 0x3FFF, local128, -510286738);
				Class159_Sub1.anInt2026 = (local128[1] - Class159_Sub1.anInt1991) * 1633656115;
				Class158.anInt2029 = (local128[2] - Class159_Sub1.anInt1996) * -1296666553;
			} else {
				Class159_Sub1.aClass80_Sub1_Sub12_3.method22595(Class159_Sub1.anInt2021 * 1564922793, Class159_Sub1.anInt2025 * 626388537, local128, 574934537);
				if (local128 != null) {
					Class159_Sub1.anInt2026 = (local128[1] - Class159_Sub1.anInt1991) * 1633656115;
					Class158.anInt2029 = (local128[2] - Class159_Sub1.anInt1996) * -1296666553;
				}
				Class159_Sub1.anInt2025 = -869244937;
				Class159_Sub1.anInt2021 = 427851623;
				Class159_Sub1.aBoolean403 = false;
			}
			if (Class159_Sub1.aClass80_Sub1_Sub12_3.anInt3092 * -1799444681 == 25) {
				Class159_Sub1.aFloat151 = 2.0F;
				Class159_Sub1.aFloat150 = 2.0F;
			} else if (Class159_Sub1.aClass80_Sub1_Sub12_3.anInt3092 * -1799444681 == 37) {
				Class159_Sub1.aFloat151 = 3.0F;
				Class159_Sub1.aFloat150 = 3.0F;
			} else if (Class159_Sub1.aClass80_Sub1_Sub12_3.anInt3092 * -1799444681 == 50) {
				Class159_Sub1.aFloat151 = 4.0F;
				Class159_Sub1.aFloat150 = 4.0F;
			} else if (Class159_Sub1.aClass80_Sub1_Sub12_3.anInt3092 * -1799444681 == 75) {
				Class159_Sub1.aFloat151 = 6.0F;
				Class159_Sub1.aFloat150 = 6.0F;
			} else if (Class159_Sub1.aClass80_Sub1_Sub12_3.anInt3092 * -1799444681 == 100) {
				Class159_Sub1.aFloat151 = 8.0F;
				Class159_Sub1.aFloat150 = 8.0F;
			} else if (Class159_Sub1.aClass80_Sub1_Sub12_3.anInt3092 * -1799444681 == 200) {
				Class159_Sub1.aFloat151 = 16.0F;
				Class159_Sub1.aFloat150 = 16.0F;
			} else {
				Class159_Sub1.aFloat151 = 8.0F;
				Class159_Sub1.aFloat150 = 8.0F;
			}
			Class159_Sub1.anInt1986 = (int) Class159_Sub1.aFloat150 >> 1;
			Class159_Sub1.aByteArrayArrayArray11 = Class121.method9718(Class159_Sub1.anInt1986, -873649977);
			Class156.method15158(-1537465920);
			Class159_Sub1.method15334();
			Class391.aClass8_53 = new Class8();
			Class159_Sub1.anInt1998 += (int) (Math.random() * 5.0D) - 2;
			if (Class159_Sub1.anInt1998 < -8) {
				Class159_Sub1.anInt1998 = -8;
			}
			if (Class159_Sub1.anInt1998 > 8) {
				Class159_Sub1.anInt1998 = 8;
			}
			Class159_Sub1.anInt1990 += (int) (Math.random() * 5.0D) - 2;
			if (Class159_Sub1.anInt1990 < -16) {
				Class159_Sub1.anInt1990 = -16;
			}
			if (Class159_Sub1.anInt1990 > 16) {
				Class159_Sub1.anInt1990 = 16;
			}
			Class159_Sub1.method15396(arg1, Class159_Sub1.anInt1998 >> 2 << 10, Class159_Sub1.anInt1990 >> 1);
			Class159_Sub1.aClass41_Sub13_4.method17572(1024, 256, 955692283);
			Class159_Sub1.aClass41_Sub12_2.method17547(256, 256, 1382342574);
			Class159_Sub1.aClass41_Sub3_8.method17927(4096, (short) 16807);
			Class664.aClass41_Sub17_2.method17927(256, (short) 30612);
			Class159_Sub1.anInt2017 = 1573809452;
		} else if (Class159_Sub1.anInt2017 * 1776676847 == 20) {
			if (!Class159_Sub1.aBoolean398) {
				Class249.method26348(true, 2123985286);
				Class159_Sub1.method15332(arg0, Class159_Sub1.anInt1998, Class159_Sub1.anInt1990, Class159_Sub1.aBoolean398);
				Class159_Sub1.anInt2017 = 426461060;
				Class249.method26348(true, 1834574604);
				Class554.method25310(1986877070);
			} else if (Class159_Sub1.method15332(arg0, Class159_Sub1.anInt1998, Class159_Sub1.anInt1990, Class159_Sub1.aBoolean398)) {
				Class159_Sub1.anInt2017 = 426461060;
			}
		} else if (Class159_Sub1.anInt2017 * 1776676847 == 60) {
			if (Class159_Sub1.aClass480_48.method29972(Class159_Sub1.aClass80_Sub1_Sub12_3.aString108, -1687662502)) {
				if (!Class159_Sub1.aClass480_48.method29987(Class159_Sub1.aClass80_Sub1_Sub12_3.aString108, 1063587996)) {
					return;
				}
				Class159_Sub1.aClass587_2 = Class498.method30359(Class159_Sub1.aClass480_48, Class159_Sub1.aClass80_Sub1_Sub12_3.aString108, client.aBoolean732, (byte) -92);
			} else {
				Class159_Sub1.aClass587_2 = new Class587(0);
			}
			Class159_Sub1.method15348();
			Class159_Sub1.anInt2017 = 1213365786;
			Class249.method26348(true, 1957180907);
			Class554.method25310(1986877070);
		} else if (Class159_Sub1.anInt2017 * 1776676847 >= 70) {
			local21 = 0;
			while (true) {
				if (local21 >= 3) {
					Class159_Sub1.anInt2017 = -720887332;
					System.gc();
					break;
				}
				for (local27 = 0; local27 < 5; local27++) {
					if (Class159_Sub1.aClass104ArrayArray1[local21][local27] == null || Class159_Sub1.aClass15ArrayArray1[local21][local27] == null) {
						Class159_Sub1.aClass104ArrayArray1[local21][local27] = (Class104) Class317.aClass464_1.method29602(client.anInterface49_1, Class159_Sub1.aClass632_2.anIntArrayArray66[local21][local27], true, true, 891970903);
						Class159_Sub1.aClass15ArrayArray1[local21][local27] = Class317.aClass464_1.method29594(client.anInterface49_1, Class159_Sub1.aClass632_2.anIntArrayArray66[local21][local27], (byte) 1);
						if (Class159_Sub1.aClass104ArrayArray1[local21][local27] == null || Class159_Sub1.aClass15ArrayArray1[local21][local27] == null) {
							return;
						}
						Class159_Sub1.anInt2017 += -1052418771;
					}
				}
				local21++;
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "jg", descriptor = "(IIILclient!aju;I)V")
	static void method32053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class80_Sub9 arg3, @OriginalArg(4) int arg4) {
		@Pc(10) long local10 = (long) (arg0 << 28 | arg2 << 14 | arg1);
		@Pc(15) Class80_Sub4 local15 = (Class80_Sub4) client.aClass24_22.method560(local10);
		if (local15 == null) {
			local15 = new Class80_Sub4();
			client.aClass24_22.method563(local15, local10);
			local15.aClass8_18.method232(arg3, 1347483467);
			return;
		}
		@Pc(40) Class43 local40 = (Class43) Class25.aClass41_Sub9_1.method18054(arg3.anInt1498 * 959158013, 894439234);
		@Pc(45) int local45 = local40.anInt134 * -575331907;
		if (local40.anInt151 * -331223913 == 1) {
			local45 *= arg3.anInt1497 * -1156703001 + 1;
		}
		for (@Pc(66) Class80_Sub9 local66 = (Class80_Sub9) local15.aClass8_18.method247(129206984); local66 != null; local66 = (Class80_Sub9) local15.aClass8_18.method237(-1871356134)) {
			local40 = (Class43) Class25.aClass41_Sub9_1.method18054(local66.anInt1498 * 959158013, 586980516);
			@Pc(82) int local82 = local40.anInt134 * -575331907;
			if (local40.anInt151 * -331223913 == 1) {
				local82 *= local66.anInt1497 * -1156703001 + 1;
			}
			if (local45 > local82) {
				Class130.method10200(arg3, local66, -135542929);
				return;
			}
		}
		local15.aClass8_18.method232(arg3, 396984602);
	}

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "()V")
	Class599() {
	}

	@OriginalMember(owner = "client!ur", name = "j", descriptor = "(I)V")
	@Override
	public void method37012(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ur", name = "t", descriptor = "(Lclient!ald;I)V")
	@Override
	public void method37006(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(898893703);
			if (local3 == 0) {
				return;
			}
			this.method32039(arg0, local3, (short) -32142);
		}
	}

	@OriginalMember(owner = "client!ur", name = "f", descriptor = "(B)V")
	@Override
	public void method37007(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!ur", name = "g", descriptor = "(IS)V")
	@Override
	public void method37014(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1) {
	}

	@OriginalMember(owner = "client!ur", name = "k", descriptor = "(Lclient!ald;I)V")
	void method32038(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5367 = arg0.method23178((byte) -66) * -1834239995;
		} else if (arg1 == 2) {
			this.anIntArray485 = new int[arg0.method23362(368786592)];
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray485.length; local21++) {
				this.anIntArray485[local21] = arg0.method23178((byte) -8);
			}
		} else if (arg1 == 3) {
			this.anInt5366 = arg0.method23362(-1890418393) * 217726385;
		} else if (arg1 == 4) {
			this.aClass590_4 = (Class590) Class80_Sub39.method15030(Class314.method27493(-507551326), arg0.method23362(-398898406), -952542126);
		} else if (arg1 == 5) {
			this.anInt5368 = arg0.method23210((byte) 107) * -369089243;
		} else if (arg1 == 6) {
			arg0.method23210((byte) 104);
		}
	}

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "()V")
	@Override
	public void method37008() {
	}

	@OriginalMember(owner = "client!ur", name = "l", descriptor = "(Lclient!ald;IS)V")
	void method32039(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		if (arg1 == 1) {
			this.anInt5367 = arg0.method23178((byte) -123) * -1834239995;
		} else if (arg1 == 2) {
			this.anIntArray485 = new int[arg0.method23362(793668919)];
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray485.length; local21++) {
				this.anIntArray485[local21] = arg0.method23178((byte) -63);
			}
		} else if (arg1 == 3) {
			this.anInt5366 = arg0.method23362(963625322) * 217726385;
		} else if (arg1 == 4) {
			this.aClass590_4 = (Class590) Class80_Sub39.method15030(Class314.method27493(722406207), arg0.method23362(992838950), -1583998286);
		} else if (arg1 == 5) {
			this.anInt5368 = arg0.method23210((byte) 88) * -369089243;
		} else if (arg1 == 6) {
			arg0.method23210((byte) 38);
		}
	}

	@OriginalMember(owner = "client!ur", name = "o", descriptor = "(I)V")
	@Override
	public void method37010(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
	@Override
	public void method37013(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ur", name = "s", descriptor = "(I)V")
	@Override
	public void method37011(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ur", name = "m", descriptor = "(Lclient!ald;I)V")
	void method32040(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5367 = arg0.method23178((byte) -124) * -1834239995;
		} else if (arg1 == 2) {
			this.anIntArray485 = new int[arg0.method23362(-1314443039)];
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray485.length; local21++) {
				this.anIntArray485[local21] = arg0.method23178((byte) -71);
			}
		} else if (arg1 == 3) {
			this.anInt5366 = arg0.method23362(-882950581) * 217726385;
		} else if (arg1 == 4) {
			this.aClass590_4 = (Class590) Class80_Sub39.method15030(Class314.method27493(1694390709), arg0.method23362(394075460), -1741212926);
		} else if (arg1 == 5) {
			this.anInt5368 = arg0.method23210((byte) 74) * -369089243;
		} else if (arg1 == 6) {
			arg0.method23210((byte) 80);
		}
	}

	@OriginalMember(owner = "client!ur", name = "u", descriptor = "(Lclient!ald;)V")
	@Override
	public void method37009(@OriginalArg(0) Class80_Sub36 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(-1345467719);
			if (local3 == 0) {
				return;
			}
			this.method32039(arg0, local3, (short) 19514);
		}
	}
}
