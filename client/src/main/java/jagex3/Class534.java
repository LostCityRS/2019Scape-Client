package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
final class Class534 implements Interface41 {

	@OriginalMember(owner = "client!rp", name = "hd", descriptor = "Lclient!aol;")
	public static Class32_Sub10 aClass32_Sub10_1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!rp", name = "this$0", descriptor = "Lclient!rq;")
	final Class535 aClass535_2;

	@OriginalMember(owner = "client!rp", name = "ajx", descriptor = "(Lclient!yf;I)V")
	static void method30805(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class93_Sub36.method14380(arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091], -1959024645);
	}

	@OriginalMember(owner = "client!rp", name = "u", descriptor = "(Lclient!ase;ILclient!aqk;II)V")
	static void method30806(@OriginalArg(0) Class93_Sub41_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class132_Sub1_Sub1_Sub1_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) int local8;
		if ((arg3 & 0x80) != 0) {
			@Pc(6) int[] local6 = new int[4];
			for (local8 = 0; local8 < 4; local8++) {
				local6[local8] = arg0.method22448(-917884288);
			}
			local8 = arg0.method22509(-169642142);
			Class623.method32329(arg2, local6, local8, false, -1065743879);
		}
		@Pc(66) int local66;
		@Pc(73) Class500 local73;
		@Pc(79) Class466 local79;
		@Pc(57) int local57;
		if ((arg3 & 0x40000) != 0) {
			arg0.anInt3070 += 1403713386;
			local57 = arg0.aByteArray58[(arg0.anInt3070 += -1445626955) * 212851357 - 1] & 0xFF;
			for (local8 = 0; local8 < local57; local8++) {
				local66 = arg0.method22511(1282515777);
				local73 = (Class500) Class107.method18131(Class500.method30340(-1769728711), local66, -1915563430);
				local79 = Class21.aClass79_Sub1_Sub1_1.method1464(arg0, local73, (byte) 1);
				arg2.anInterface3_5.method776(local79.anInt5253 * -1181855333, local79.anObject19, (byte) 100);
			}
		}
		if ((arg3 & 0x10) != 0) {
			arg2.anInt2799 = arg0.method22471(16711680) * 1224757437;
			if (arg2.anInt2763 * -846948133 == 0) {
				arg2.method19963(arg2.anInt2799 * 1643784853, (byte) 46);
				arg2.anInt2799 = -1224757437;
			}
		}
		if ((arg3 & 0x10000) != 0) {
			arg2.aBoolean456 = arg0.method22511(1437468065) == 1;
		}
		@Pc(155) int local155;
		@Pc(151) int local151;
		@Pc(170) int local170;
		if ((arg3 & 0x20) != 0) {
			local57 = arg0.method22461(2131635157);
			@Pc(197) int local197;
			if (local57 > 0) {
				for (local8 = 0; local8 < local57; local8++) {
					local151 = -1;
					@Pc(153) boolean local153 = true;
					local155 = -1;
					local66 = arg0.method22644((byte) -81);
					if (local66 == 32767) {
						local66 = arg0.method22644((byte) -81);
						local170 = arg0.method22644((byte) -10);
						local151 = arg0.method22644((byte) -7);
						local155 = arg0.method22644((byte) -115);
					} else if (local66 == 32766) {
						local66 = -1;
						local170 = arg0.method22425((short) 16384);
					} else {
						local170 = arg0.method22644((byte) -47);
					}
					local197 = arg0.method22644((byte) -85);
					arg2.method19970(local66, local170, local151, local155, client.anInt3485, local197, 273974416);
				}
			}
			local8 = arg0.method22511(1299380120);
			if (local8 > 0) {
				for (local66 = 0; local66 < local8; local66++) {
					local151 = arg0.method22644((byte) -94);
					local170 = arg0.method22644((byte) -29);
					if (local170 == 32767) {
						arg2.method19972(local151, -1286239838);
					} else {
						local155 = arg0.method22644((byte) -75);
						local197 = arg0.method22511(1773547438);
						@Pc(246) int local246 = local170 > 0 ? arg0.method22509(333148475) : local197;
						arg2.method19971(local151, client.anInt3485, local170, local155, local197, local246, 1804055066);
					}
				}
			}
		}
		@Pc(274) int[] local274;
		@Pc(277) int[] local277;
		if ((arg3 & 0x8000) != 0) {
			local57 = arg0.method22511(1685704594);
			local274 = new int[local57];
			local277 = new int[local57];
			@Pc(280) int[] local280 = new int[local57];
			for (local170 = 0; local170 < local57; local170++) {
				local274[local170] = arg0.method22448(-324314197);
				local277[local170] = arg0.method22461(1859352114);
				local280[local170] = arg0.method22471(16711680);
			}
			Class133_Sub1.method10077(arg2, local274, local277, local280, (short) -30212);
		}
		@Pc(359) boolean local359;
		if ((arg3 & 0x100000) != 0) {
			local57 = arg0.method22471(16711680);
			local8 = arg0.method22480(-1324297022);
			if (local57 == 65535) {
				local57 = -1;
			}
			local66 = arg0.method22461(1492500547);
			local151 = local66 & 0x7;
			local170 = local66 >> 3 & 0xF;
			if (local170 == 15) {
				local170 = -1;
			}
			local359 = (local66 >> 7 & 0x1) == 1;
			arg2.method20022(local57, local8, local151, local170, local359, 4, (byte) -85);
		}
		@Pc(379) byte[] local379;
		@Pc(384) Class93_Sub41 local384;
		if ((arg3 & 0x4) != 0) {
			local57 = arg0.method22461(1991878746);
			local379 = new byte[local57];
			local384 = new Class93_Sub41(local379);
			arg0.method22543(local379, 0, local57, -872707688);
			Class174.aClass93_Sub41Array2[arg1] = local384;
			arg2.method20078(local384, 2066189118);
		}
		if ((arg3 & 0x80000) != 0) {
			local57 = arg0.method22461(1724117843);
			local274 = new int[local57];
			local277 = new int[local57];
			for (local151 = 0; local151 < local57; local151++) {
				local170 = arg0.method22469(659164129);
				if ((local170 & 0xC000) == 49152) {
					local155 = arg0.method22469(2071994371);
					local274[local151] = local170 << 16 | local155;
				} else {
					local274[local151] = local170;
				}
				local277[local151] = arg0.method22455(1626788448);
			}
			arg2.method19966(local274, local277, 586855086);
		}
		if ((arg3 & 0x2000) != 0) {
			local57 = arg0.method22427(-1434290800);
			local8 = arg0.method22520(-1897136768);
			if (local57 == 65535) {
				local57 = -1;
			}
			local66 = arg0.method22461(1236955591);
			local151 = local66 & 0x7;
			local170 = local66 >> 3 & 0xF;
			if (local170 == 15) {
				local170 = -1;
			}
			local359 = (local66 >> 7 & 0x1) == 1;
			arg2.method20022(local57, local8, local151, local170, local359, 2, (byte) -105);
		}
		if ((arg3 & 0x2) != 0) {
			local57 = arg0.method22471(16711680);
			local8 = arg0.method22550(-1072530967);
			if (local57 == 65535) {
				local57 = -1;
			}
			local66 = arg0.method22461(1281954527);
			local151 = local66 & 0x7;
			local170 = local66 >> 3 & 0xF;
			if (local170 == 15) {
				local170 = -1;
			}
			local359 = (local66 >> 7 & 0x1) == 1;
			arg2.method20022(local57, local8, local151, local170, local359, 0, (byte) -57);
		}
		if ((arg3 & 0x800) != 0) {
			local57 = arg0.method22425((short) 16384);
			local379 = new byte[local57];
			local384 = new Class93_Sub41(local379);
			arg0.method22483(local379, 0, local57, (byte) 31);
			Class174.aClass93_Sub41Array1[arg1] = local384;
			arg2.method20060(local384, 1077944547);
		}
		if ((arg3 & 0x20000) != 0) {
			arg2.anInterface3_5.method777(1198192144);
			arg0.anInt3070 += 1403713386;
			local57 = arg0.aByteArray58[(arg0.anInt3070 += -1445626955) * 212851357 - 1] & 0xFF;
			for (local8 = 0; local8 < local57; local8++) {
				local66 = arg0.method22511(1406553697);
				local73 = (Class500) Class107.method18131(Class500.method30340(-1762008343), local66, -1915563430);
				local79 = Class21.aClass79_Sub1_Sub1_1.method1464(arg0, local73, (byte) 1);
				arg2.anInterface3_5.method776(local79.anInt5253 * -1181855333, local79.anObject19, (byte) 11);
			}
		}
		@Pc(673) String local673;
		if ((arg3 & 0x200) != 0) {
			local673 = arg0.method22439(310956939);
			if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3 == arg2) {
				Class227.method25707(2, 0, arg2.method20064(true, (byte) 65), arg2.method20065(false, 2091353777), arg2.aString81, local673, null, -1797429238);
			}
			arg2.method20073(local673, 0, 0, -1685399895);
		}
		if ((arg3 & 0x8) != 0) {
			arg2.anInt2775 = arg0.method22401(752227073) * -1449351677;
			arg2.anInt2777 = arg0.method22426(1729726077) * -2034096445;
			arg2.anInt2793 = arg0.method22401(-1090484644) * -688148243;
			arg2.anInt2778 = arg0.method22463((byte) 102) * 501346955;
			arg2.anInt2773 = arg0.method22463((byte) 76) * -1861667641;
			arg2.anInt2779 = arg0.method22426(746110096) * -1832474127;
			arg2.anInt2780 = (arg0.method22471(16711680) + client.anInt3485) * 755240883;
			arg2.anInt2762 = (arg0.method22469(1539513897) + client.anInt3485) * 1838812733;
			arg2.anInt2782 = arg0.method22469(1591926049) * 862199857;
			arg2.anInt2763 = 1975362387;
			arg2.anInt2760 = 0;
			arg2.anInt2775 += arg2.anIntArray240[0] * -1449351677;
			arg2.anInt2777 += arg2.anIntArray239[0] * -2034096445;
			arg2.anInt2793 += arg2.anIntArray240[0] * -688148243;
			arg2.anInt2778 += arg2.anIntArray239[0] * 501346955;
			arg2.anInt2773 += arg2.aByte100 * -1861667641;
			arg2.anInt2779 += arg2.aByte100 * -1832474127;
		}
		if ((arg3 & 0x1) != 0) {
			local57 = arg0.method22427(-1434290800);
			if (local57 == 65535) {
				local57 = -1;
			}
			arg2.anInt2772 = local57 * -1158576417;
		}
		if ((arg3 & 0x800000) != 0) {
			arg2.aByte71 = arg0.method22401(-1931926509);
			arg2.aByte72 = arg0.method22515(-896318173);
			arg2.aByte73 = arg0.method22401(-724281707);
			arg2.aByte74 = (byte) arg0.method22461(1717494693);
			arg2.anInt2789 = (client.anInt3485 + arg0.method22427(-1434290800)) * 782633717;
			arg2.anInt2796 = (client.anInt3485 + arg0.method22427(-1434290800)) * 1198097015;
		}
		if ((arg3 & 0x400) != 0) {
			arg2.aClass286_1 = (Class286) Class107.method18131(Class286.method26616((byte) 85), arg0.method22509(1472452770), -1915563430);
			if (arg2.aClass286_1 == null) {
				arg2.aClass286_1 = Class286.aClass286_5;
			}
		}
		if ((arg3 & 0x100) != 0) {
			local57 = arg0.method22471(16711680);
			local8 = arg0.method22520(937448499);
			if (local57 == 65535) {
				local57 = -1;
			}
			local66 = arg0.method22509(1151075287);
			local151 = local66 & 0x7;
			local170 = local66 >> 3 & 0xF;
			if (local170 == 15) {
				local170 = -1;
			}
			local359 = (local66 >> 7 & 0x1) == 1;
			arg2.method20022(local57, local8, local151, local170, local359, 1, (byte) -16);
		}
		if ((arg3 & 0x200000) != 0) {
			local673 = arg0.method22439(1075193584);
			local8 = arg0.method22425((short) 16384);
			if ((local8 & 0x1) != 0) {
				Class227.method25707(2, local8, arg2.method20064(true, (byte) -44), arg2.method20065(false, 2091353777), arg2.aString81, local673, null, -1851507170);
			}
			arg2.method20073(local673, 0, 0, -1685399895);
		}
		if ((arg3 & 0x400000) == 0) {
			return;
		}
		local57 = arg0.method22471(16711680);
		local8 = arg0.method22431(-118643075);
		if (local57 == 65535) {
			local57 = -1;
		}
		local66 = arg0.method22461(1120567204);
		local151 = local66 & 0x7;
		local170 = local66 >> 3 & 0xF;
		if (local170 == 15) {
			local170 = -1;
		}
		local359 = (local66 >> 7 & 0x1) == 1;
		arg2.method20022(local57, local8, local151, local170, local359, 3, (byte) -80);
	}

	@OriginalMember(owner = "client!rp", name = "aoc", descriptor = "(Lclient!yf;I)V")
	static void method30807(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		if (Class65.aClass123_Sub1_2.method9023(-1662199153) != Class342.aClass342_3) {
			throw new RuntimeException();
		}
		@Pc(13) Class124_Sub1 local13 = (Class124_Sub1) Class65.aClass123_Sub1_2.method8952((byte) -57);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = (int) ((double) local13.method9168((byte) 12) * 2607.5945876176133D) & 0x3FFF;
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = (int) ((double) local13.method9169(1128474611) * 2607.5945876176133D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!rp", name = "h", descriptor = "(Lclient!yf;I)V")
	static void method30808(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 2] = ((Class347) Class288.aClass55_Sub2_1.method18273(arg0.anIntArray521[-1497248091 * arg0.anInt6052 - 2], 399178293)).method27683(Class624.aClass120_1, arg0.anIntArray521[arg0.anInt6052 * -1497248091 - 1], -1533827398) ? 1 : 0;
		arg0.anInt6052 -= 1189701933;
	}

	@OriginalMember(owner = "client!rp", name = "awi", descriptor = "(Lclient!yf;I)V")
	static void method30809(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = client.aClass16_22.method218(-291053272);
		if (-703563959 * client.anInt3526 != -1) {
			local3++;
		}
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local3;
	}

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lclient!rq;)V")
	Class534(@OriginalArg(0) Class535 arg0) {
		this.aClass535_2 = arg0;
	}

	@OriginalMember(owner = "client!rp", name = "n", descriptor = "()V")
	@Override
	public void method30802() {
		this.aClass535_2.method30838(true, (byte) 40);
	}

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "(I)V")
	@Override
	public void method30803(@OriginalArg(0) int arg0) {
		this.aClass535_2.method30838(true, (byte) 92);
	}

	@OriginalMember(owner = "client!rp", name = "m", descriptor = "()V")
	@Override
	public void method30801() {
		this.aClass535_2.method30838(true, (byte) 52);
	}

	@OriginalMember(owner = "client!rp", name = "k", descriptor = "()V")
	@Override
	public void method30804() {
		this.aClass535_2.method30838(true, (byte) 98);
	}
}
