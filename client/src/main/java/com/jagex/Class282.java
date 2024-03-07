package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public class Class282 {

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "Ljava/lang/String;")
	String aString157;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!alw;ZZ)V", line = 8)
	Class282(@OriginalArg(0) Packet arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		if (arg1) {
			arg0.g8(-1438943276);
		}
		if (arg2) {
			this.aString157 = arg0.fastgstr((byte) 22);
		} else {
			this.aString157 = null;
		}
	}

	@OriginalMember(owner = "client!ga", name = "n", descriptor = "()Ljava/lang/String;", line = 18)
	public String method26464() {
		return this.aString157;
	}

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "(B)Ljava/lang/String;", line = 18)
	public String method26465(@OriginalArg(0) byte arg0) {
		return this.aString157;
	}

	@OriginalMember(owner = "client!ga", name = "m", descriptor = "()Ljava/lang/String;", line = 18)
	public String method26466() {
		return this.aString157;
	}

	@OriginalMember(owner = "client!ga", name = "bb", descriptor = "(Lclient!aqk;ZI)V", line = 1511)
	static void method26467(@OriginalArg(0) Class132_Sub1_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (Class454.anInt5042 * -1838307953 >= 407) {
			return;
		}
		if (arg0 != Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3) {
			@Pc(176) String local176;
			@Pc(65) boolean local65;
			@Pc(96) int local96;
			if (arg0.anInt2801 * -526144769 == 0) {
				local65 = true;
				if (-391321205 * Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anInt2800 != -1 && arg0.anInt2800 * -391321205 != -1) {
					local96 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anInt2800 * -391321205 < arg0.anInt2800 * -391321205 ? Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anInt2800 * -391321205 : arg0.anInt2800 * -391321205;
					@Pc(106) int local106 = Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anInt2804 * 1852619943 - arg0.anInt2804 * 1852619943;
					if (local106 < 0) {
						local106 = -local106;
					}
					if (local106 > local96) {
						local65 = false;
					}
				}
				@Pc(129) String local129 = client.aClass702_4 == Class702.aClass702_5 ? Class74.aClass74_137.method1259(Class106.aClass717_8, (byte) 60) : Class74.aClass74_135.method1259(Class106.aClass717_8, (byte) 25);
				if (arg0.anInt2804 * 1852619943 >= arg0.anInt2810 * -1619580895) {
					local176 = arg0.method20069(true, (byte) -22) + (local65 ? Class93_Sub31.method22006(arg0.anInt2804 * 1852619943, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anInt2804 * 1852619943, -412299365) : Class306.method26804(16777215, -1010272212)) + Class430.aString203 + local129 + arg0.anInt2804 * 1852619943 + Class430.aString205;
				} else {
					local176 = arg0.method20069(true, (byte) -124) + (local65 ? Class93_Sub31.method22006(arg0.anInt2804 * 1852619943, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anInt2804 * 1852619943, -1302559707) : Class306.method26804(16777215, 1970179317)) + Class430.aString203 + local129 + arg0.anInt2804 * 1852619943 + "+" + (arg0.anInt2810 * -1619580895 - arg0.anInt2804 * 1852619943) + Class430.aString205;
				}
			} else if (arg0.anInt2801 * -526144769 == -1) {
				local176 = arg0.method20069(true, (byte) 7);
			} else {
				local176 = arg0.method20069(true, (byte) 39) + Class430.aString203 + Class74.aClass74_58.method1259(Class106.aClass717_8, (byte) -41) + arg0.anInt2801 * -526144769 + Class430.aString205;
			}
			local65 = false;
			if (arg0.aClass658_1 != null && arg0.aClass658_1.anInt5817 * 1405397749 != -1) {
				@Pc(287) Class336 local287 = (Class336) Class162.aClass32_Sub3_2.method18261(arg0.aClass658_1.anInt5817 * 1405397749, 1918118324);
				if (local287.aBoolean713) {
					local65 = true;
					local176 = ((Class336) Class162.aClass32_Sub3_2.method18261(arg0.aClass658_1.anInt5817 * 1405397749, 1941995995)).aString178;
					if (local287.anInt4159 * 76137607 != 0) {
						@Pc(321) String local321 = Class702.aClass702_5 == client.aClass702_4 ? Class74.aClass74_137.method1259(Class106.aClass717_8, (byte) 25) : Class74.aClass74_135.method1259(Class106.aClass717_8, (byte) -64);
						local176 = local176 + Class93_Sub31.method22006(local287.anInt4159 * 76137607, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anInt2804 * 1852619943, 422529462) + Class430.aString203 + local321 + local287.anInt4159 * 76137607 + Class430.aString205;
					}
				}
			}
			if (client.aBoolean625 && !arg1 && (Class253.anInt3851 * 735260021 & 0x8) != 0) {
				Class280.method26455(client.aString145, client.aString142 + " " + Class430.aString206 + " " + Class306.method26804(16777215, 583218653) + local176, Class271.anInt3885 * -308125347, 15, -1, (long) (-1688488127 * arg0.anInt2768), 0, 0, true, false, (long) (arg0.anInt2768 * -1688488127), false, (byte) -89);
			}
			if (!arg1) {
				for (local96 = 7; local96 >= 0; local96--) {
					if (client.aStringArray22[local96] != null) {
						@Pc(414) short local414 = 0;
						if (client.aStringArray22[local96].equalsIgnoreCase(Class74.aClass74_130.method1259(Class106.aClass717_8, (byte) -34))) {
							if (client.aClass660_1 == Class660.aClass660_4) {
								continue;
							}
							if (client.aClass660_1 == Class660.aClass660_6) {
								local414 = 2000;
							} else if (client.aClass660_1 == Class660.aClass660_5 && arg0.anInt2804 * 1852619943 > Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anInt2804 * 1852619943) {
								local414 = 2000;
							}
							if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anInt2802 * -1582304709 == 0 || arg0.anInt2802 * -1582304709 == 0) {
								if (arg0.aBoolean455) {
									local414 = 2000;
								}
							} else if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anInt2802 * -1582304709 == arg0.anInt2802 * -1582304709) {
								local414 = 2000;
							} else {
								local414 = 0;
							}
						} else if (client.aBooleanArray20[local96]) {
							local414 = 2000;
						}
						@Pc(491) short local491 = (short) (client.aShortArray83[local96] + local414);
						@Pc(504) int local504 = client.anIntArray304[local96] == -1 ? client.anInt3521 * 1255649659 : client.anIntArray304[local96];
						@Pc(510) int local510 = local65 ? 16776960 : 16777215;
						Class280.method26455(client.aStringArray22[local96], Class306.method26804(local510, -1086984971) + local176, local504, local491, -1, (long) (-1688488127 * arg0.anInt2768), 0, 0, true, false, (long) (arg0.anInt2768 * -1688488127), false, (byte) -123);
					}
				}
			} else if (!local65) {
				Class280.method26455(Class306.method26804(13421772, -663945116) + local176, "", -1, -1, 0, 0L, 0, 0, false, true, (long) (arg0.anInt2768 * -1688488127), false, (byte) -124);
			}
			if (!arg1 && !local65) {
				for (@Pc(584) Class93_Sub1_Sub7 local584 = (Class93_Sub1_Sub7) Class454.aClass22_55.method428((byte) 36); local584 != null; local584 = (Class93_Sub1_Sub7) Class454.aClass22_55.method442(566498847)) {
					if (local584.anInt3012 * -92627949 == 23) {
						local584.aString98 = Class306.method26804(16777215, 1609838090) + local176;
						break;
					}
				}
			}
		} else if (client.aBoolean625 && (Class253.anInt3851 * 735260021 & 0x10) != 0) {
			Class280.method26455(client.aString145, client.aString142 + " " + Class430.aString206 + " " + Class306.method26804(16777215, 1024041211) + Class74.aClass74_146.method1259(Class106.aClass717_8, (byte) -32), Class271.anInt3885 * -308125347, 16, -1, 0L, 0, 0, true, false, (long) (arg0.anInt2768 * -1688488127), false, (byte) -46);
		}
	}

	@OriginalMember(owner = "client!ga", name = "hv", descriptor = "(Lclient!yf;I)V", line = 6441)
	static final void method26468(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -1915563430;
		@Pc(18) boolean local18 = arg0.anIntArray519[arg0.anInt5891 * -1497248091] == 1;
		@Pc(28) int local28 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(32) Class312 local32 = Class659.method32808(local28, 1456863860);
		@Pc(38) Class320 local38 = Class166_Sub1.aClass320Array1[local28 >> 16];
		Class453.method28966(local32, local38, arg0, local18 ? Class310.aClass310_4 : Class310.aClass310_3, (byte) 50);
	}

	@OriginalMember(owner = "client!ga", name = "apg", descriptor = "(Lclient!yf;B)V", line = 12696)
	static final void method26469(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		if (Class65.aClass123_Sub1_2.method9020((byte) -100) != Class338.aClass338_7) {
			throw new RuntimeException();
		}
		((Class25_Sub1) Class65.aClass123_Sub1_2.method9017(1924700441)).method15966(arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091], 1189701933);
	}
}
