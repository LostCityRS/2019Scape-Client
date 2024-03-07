package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xi")
public class Class660 implements Interface75 {

	@OriginalMember(owner = "client!xi", name = "e", descriptor = "Lclient!xi;")
	static final Class660 aClass660_3 = new Class660(2, 0);

	@OriginalMember(owner = "client!xi", name = "n", descriptor = "Lclient!xi;")
	public static final Class660 aClass660_5 = new Class660(1, 1);

	@OriginalMember(owner = "client!xi", name = "m", descriptor = "Lclient!xi;")
	public static final Class660 aClass660_6 = new Class660(3, 2);

	@OriginalMember(owner = "client!xi", name = "k", descriptor = "Lclient!xi;")
	public static final Class660 aClass660_4 = new Class660(0, 3);

	@OriginalMember(owner = "client!xi", name = "f", descriptor = "I")
	public final int anInt5823;

	@OriginalMember(owner = "client!xi", name = "w", descriptor = "I")
	final int anInt5824;

	@OriginalMember(owner = "client!xi", name = "e", descriptor = "(ZZI)V", line = 15)
	public static void method32818(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg0) {
			Class685.anInt5905 += 1883407479;
			Class376.method28044(-379347127);
		}
		if (arg1) {
			Class685.anInt5906 += -236883317;
			Class262.method26169((short) 8448);
		}
	}

	@OriginalMember(owner = "client!xi", name = "e", descriptor = "(I)[Lclient!xi;", line = 17)
	public static Class660[] method32819(@OriginalArg(0) int arg0) {
		return new Class660[] { aClass660_4, aClass660_5, aClass660_3, aClass660_6 };
	}

	@OriginalMember(owner = "client!xi", name = "m", descriptor = "()[Lclient!xi;", line = 17)
	public static Class660[] method32820() {
		return new Class660[] { aClass660_4, aClass660_5, aClass660_3, aClass660_6 };
	}

	@OriginalMember(owner = "client!xi", name = "f", descriptor = "()[Lclient!xi;", line = 17)
	public static Class660[] method32821() {
		return new Class660[] { aClass660_4, aClass660_5, aClass660_3, aClass660_6 };
	}

	@OriginalMember(owner = "client!xi", name = "<init>", descriptor = "(II)V", line = 20)
	Class660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5823 = arg0 * 1401857693;
		this.anInt5824 = arg1 * 402888471;
	}

	@OriginalMember(owner = "client!xi", name = "k", descriptor = "()I", line = 26)
	@Override
	public int method36919() {
		return this.anInt5824 * -673115993;
	}

	@OriginalMember(owner = "client!xi", name = "n", descriptor = "()I", line = 26)
	@Override
	public int getId() {
		return this.anInt5824 * -673115993;
	}

	@OriginalMember(owner = "client!xi", name = "q", descriptor = "(B)V", line = 682)
	static void method32822(@OriginalArg(0) byte arg0) {
		if (Class51.options.aClass166_Sub47_1.method16557((short) 512) == 1) {
			Class392.aClass541_1.method30906(new Class537(Class526.aClass526_7, null), (byte) -13);
		} else {
			client.world.method30533((byte) 0);
			Class360.method27799((short) -7152);
		}
	}

	@OriginalMember(owner = "client!xi", name = "bm", descriptor = "(Lclient!aqc;ZI)V", line = 1426)
	static void method32823(@OriginalArg(0) Class132_Sub1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (Class454.anInt5042 * -1838307953 >= 407) {
			return;
		}
		@Pc(8) Class336 local8 = arg0.aClass336_1;
		@Pc(11) String local11 = arg0.aString66;
		if (local8.anIntArray412 != null) {
			local8 = local8.method27435(Class624.playerVariableManager, Class624.playerVariableManager, (short) 916);
			if (local8 == null) {
				return;
			}
			local11 = local8.aString178;
		}
		if (!local8.aBoolean718) {
			return;
		}
		if (arg0.anInt2647 * 1464472043 != 0) {
			@Pc(49) String local49 = client.modeGame == Class702.aClass702_5 ? Class74.aClass74_137.method1259(Class106.lang, (byte) 18) : Class74.aClass74_135.method1259(Class106.lang, (byte) -36);
			local11 = local11 + Class93_Sub31.method22006(arg0.anInt2647 * 1464472043, Class520.selfPlayer.anInt2804 * 1852619943, 1195437977) + Class430.aString203 + local49 + arg0.anInt2647 * 1464472043 + Class430.aString205;
		}
		if (client.aBoolean625 && !arg1) {
			@Pc(97) Class87 local97 = (Class87) (Class650.anInt5797 * -759562015 == -1 ? null : Class124.aClass32_Sub21_7.get(Class650.anInt5797 * -759562015, 2088182410));
			if ((Class253.anInt3851 * 735260021 & 0x2) != 0 && (local97 == null || local8.method27429(Class650.anInt5797 * -759562015, local97.anInt265 * 951920133, (byte) 29) != local97.anInt265 * 951920133)) {
				Class280.method26455(client.aString145, client.aString142 + " " + Class430.aString206 + " " + Class306.method26804(16776960, -1330056764) + local11, Class271.anInt3885 * -308125347, 8, -1, (long) (-1688488127 * arg0.anInt2768), 0, 0, true, false, (long) (arg0.anInt2768 * -1688488127), false, (byte) -51);
			}
		}
		if (arg1) {
			return;
		}
		@Pc(168) String[] local168 = local8.aStringArray25;
		@Pc(170) boolean local170 = false;
		if (client.aBoolean626) {
			local168 = Class166_Sub40.method16368(local168, -1044881814);
		}
		if (local168 == null) {
			return;
		}
		@Pc(183) int local183;
		for (local183 = local168.length - 1; local183 >= 0; local183--) {
			if (local168[local183] != null && (arg0.anInt2651 * -999636135 & 0x1 << local183) == 0) {
				@Pc(204) short local204 = client.aShortArray84[local183];
				@Pc(208) int local208 = client.anInt3521 * 1255649659;
				@Pc(213) int local213 = local8.method27444(local183, 946197927);
				if (local213 != -1) {
					local208 = local213;
				}
				@Pc(227) boolean local227 = local168[local183].equalsIgnoreCase(Class74.aClass74_130.method1259(Class106.lang, (byte) -20));
				@Pc(236) boolean local236 = local168[local183].equalsIgnoreCase(Class74.aClass74_129.method1259(Class106.lang, (byte) -12));
				if (local227 || local236) {
					if (local170) {
						continue;
					}
					switch(client.aClass660_2.anInt5823 * -1013641291) {
						case 0:
							if (local227) {
								continue;
							}
							break;
						case 1:
						case 2:
							if (local8.aByte138 == 1) {
								local170 = true;
								continue;
							}
							break;
						case 3:
							local170 = true;
							continue;
					}
					if (local227) {
						local208 = local8.anInt4158 * 1416378971;
					}
				}
				Class280.method26455(local168[local183], Class306.method26804(16776960, 103532381) + local11, local208, local204, -1, (long) (arg0.anInt2768 * -1688488127), 0, 0, true, false, (long) (arg0.anInt2768 * -1688488127), false, (byte) -35);
			}
		}
		if (!local170) {
			return;
		}
		for (local183 = 0; local183 < local168.length; local183++) {
			if (local168[local183] != null && (arg0.anInt2651 * -999636135 & 0x1 << local183) == 0) {
				@Pc(334) boolean local334 = local168[local183].equalsIgnoreCase(Class74.aClass74_130.method1259(Class106.lang, (byte) 49));
				@Pc(343) boolean local343 = local168[local183].equalsIgnoreCase(Class74.aClass74_129.method1259(Class106.lang, (byte) 16));
				if (local334 || local343) {
					@Pc(351) short local351 = client.aShortArray84[local183];
					@Pc(355) int local355 = client.anInt3521 * 1255649659;
					@Pc(360) int local360 = local8.method27444(local183, 495554448);
					if (local360 != -1) {
						local355 = local360;
					}
					if (aClass660_6 == client.aClass660_2 || client.aClass660_2 == aClass660_5 && arg0.anInt2647 * 1464472043 > Class520.selfPlayer.anInt2804 * 1852619943) {
						local351 = (short) (local351 + 2000);
					}
					if (local334) {
						local355 = local8.anInt4158 * 1416378971;
					}
					Class280.method26455(local168[local183], Class306.method26804(16776960, 987277287) + local11, local355, local351, -1, (long) (-1688488127 * arg0.anInt2768), 0, 0, true, false, (long) (arg0.anInt2768 * -1688488127), false, (byte) -126);
				}
			}
		}
	}

	@OriginalMember(owner = "client!xi", name = "jv", descriptor = "(IIIIIIIII)V", line = 10317)
	static final void method32824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (Class383.method28142(arg0, null, 1357712085)) {
			Class485.method29802(Class166_Sub1.aClass320Array1[arg0].method27227(855839648), -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg7 < 0, 1882851760);
		} else if (arg7 == -1) {
			for (@Pc(14) int local14 = 0; local14 < 114; local14++) {
				client.topLevelComponentRedrawRequestedTemp[local14] = true;
			}
		} else {
			client.topLevelComponentRedrawRequestedTemp[arg7] = true;
		}
	}

	@OriginalMember(owner = "client!xi", name = "aku", descriptor = "(Lclient!yf;B)V", line = 11623)
	static final void method32825(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class159_Sub1.anInt1950 * -1574654625 == 100 ? 1 : 0;
	}
}
