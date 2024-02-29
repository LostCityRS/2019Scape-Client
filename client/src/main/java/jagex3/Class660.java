package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xi")
public final class Class660 implements SerializableEnum {

	@OriginalMember(owner = "client!xi", name = "e", descriptor = "Lclient!xi;")
	static final Class660 aClass660_3 = new Class660(2, 0);

	@OriginalMember(owner = "client!xi", name = "n", descriptor = "Lclient!xi;")
	public static final Class660 aClass660_5 = new Class660(1, 1);

	@OriginalMember(owner = "client!xi", name = "m", descriptor = "Lclient!xi;")
	public static final Class660 aClass660_6 = new Class660(3, 2);

	@OriginalMember(owner = "client!xi", name = "k", descriptor = "Lclient!xi;")
	public static final Class660 aClass660_4 = new Class660(0, 3);

	@OriginalMember(owner = "client!xi", name = "f", descriptor = "I")
	public final int anInt5984;

	@OriginalMember(owner = "client!xi", name = "w", descriptor = "I")
	final int anInt5985;

	@OriginalMember(owner = "client!xi", name = "e", descriptor = "(I)[Lclient!xi;")
	public static Class660[] method32999(@OriginalArg(0) int arg0) {
		return new Class660[] { aClass660_4, aClass660_5, aClass660_3, aClass660_6 };
	}

	@OriginalMember(owner = "client!xi", name = "m", descriptor = "()[Lclient!xi;")
	public static Class660[] method33000() {
		return new Class660[] { aClass660_4, aClass660_5, aClass660_3, aClass660_6 };
	}

	@OriginalMember(owner = "client!xi", name = "f", descriptor = "()[Lclient!xi;")
	public static Class660[] method33001() {
		return new Class660[] { aClass660_4, aClass660_5, aClass660_3, aClass660_6 };
	}

	@OriginalMember(owner = "client!xi", name = "bm", descriptor = "(Lclient!aqc;ZI)V")
	static void method33002(@OriginalArg(0) Class132_Sub1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (Class454.anInt5203 * -1838307953 >= 407) {
			return;
		}
		@Pc(8) Class336 local8 = arg0.aClass336_1;
		@Pc(11) String local11 = arg0.aString66;
		if (local8.anIntArray414 != null) {
			local8 = local8.method27516(Class624.aClass120_1, Class624.aClass120_1, (short) 916);
			if (local8 == null) {
				return;
			}
			local11 = local8.aString184;
		}
		if (!local8.aBoolean722) {
			return;
		}
		if (arg0.anInt2647 * 1464472043 != 0) {
			@Pc(49) String local49 = client.aClass702_4 == Class702.aClass702_5 ? Class74.aClass74_137.method1259(Class106.aClass717_8, (byte) 18) : Class74.aClass74_135.method1259(Class106.aClass717_8, (byte) -36);
			local11 = local11 + Class93_Sub31.method22026(arg0.anInt2647 * 1464472043, Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anInt2804 * 1852619943, 1195437977) + Class430.aString212 + local49 + arg0.anInt2647 * 1464472043 + Class430.aString214;
		}
		if (client.aBoolean627 && !arg1) {
			@Pc(97) Class87 local97 = (Class87) (Class650.anInt5958 * -759562015 == -1 ? null : Class124.aClass32_Sub21_7.method18273(Class650.anInt5958 * -759562015, 2088182410));
			if ((Class253.anInt3892 * 735260021 & 0x2) != 0 && (local97 == null || local8.method27520(Class650.anInt5958 * -759562015, local97.anInt265 * 951920133, (byte) 29) != local97.anInt265 * 951920133)) {
				Class280.method26551(client.aString145, client.aString142 + " " + Class430.aString215 + " " + Class306.method26916(16776960, -1330056764) + local11, Class271.anInt3926 * -308125347, 8, -1, (long) (-1688488127 * arg0.anInt2768), 0, 0, true, false, (long) (arg0.anInt2768 * -1688488127), false, (byte) -51);
			}
		}
		if (arg1) {
			return;
		}
		@Pc(168) String[] local168 = local8.aStringArray29;
		@Pc(170) boolean local170 = false;
		if (client.aBoolean628) {
			local168 = Class166_Sub40.method16378(local168, -1044881814);
		}
		if (local168 == null) {
			return;
		}
		@Pc(183) int local183;
		for (local183 = local168.length - 1; local183 >= 0; local183--) {
			if (local168[local183] != null && (arg0.anInt2651 * -999636135 & 0x1 << local183) == 0) {
				@Pc(204) short local204 = client.aShortArray84[local183];
				@Pc(208) int local208 = client.anInt3521 * 1255649659;
				@Pc(213) int local213 = local8.method27532(local183, 946197927);
				if (local213 != -1) {
					local208 = local213;
				}
				@Pc(227) boolean local227 = local168[local183].equalsIgnoreCase(Class74.aClass74_130.method1259(Class106.aClass717_8, (byte) -20));
				@Pc(236) boolean local236 = local168[local183].equalsIgnoreCase(Class74.aClass74_129.method1259(Class106.aClass717_8, (byte) -12));
				if (local227 || local236) {
					if (local170) {
						continue;
					}
					switch(client.aClass660_2.anInt5984 * -1013641291) {
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
						local208 = local8.anInt4199 * 1416378971;
					}
				}
				Class280.method26551(local168[local183], Class306.method26916(16776960, 103532381) + local11, local208, local204, -1, (long) (arg0.anInt2768 * -1688488127), 0, 0, true, false, (long) (arg0.anInt2768 * -1688488127), false, (byte) -35);
			}
		}
		if (!local170) {
			return;
		}
		for (local183 = 0; local183 < local168.length; local183++) {
			if (local168[local183] != null && (arg0.anInt2651 * -999636135 & 0x1 << local183) == 0) {
				@Pc(334) boolean local334 = local168[local183].equalsIgnoreCase(Class74.aClass74_130.method1259(Class106.aClass717_8, (byte) 49));
				@Pc(343) boolean local343 = local168[local183].equalsIgnoreCase(Class74.aClass74_129.method1259(Class106.aClass717_8, (byte) 16));
				if (local334 || local343) {
					@Pc(351) short local351 = client.aShortArray84[local183];
					@Pc(355) int local355 = client.anInt3521 * 1255649659;
					@Pc(360) int local360 = local8.method27532(local183, 495554448);
					if (local360 != -1) {
						local355 = local360;
					}
					if (aClass660_6 == client.aClass660_2 || client.aClass660_2 == aClass660_5 && arg0.anInt2647 * 1464472043 > Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.anInt2804 * 1852619943) {
						local351 = (short) (local351 + 2000);
					}
					if (local334) {
						local355 = local8.anInt4199 * 1416378971;
					}
					Class280.method26551(local168[local183], Class306.method26916(16776960, 987277287) + local11, local355, local351, -1, (long) (-1688488127 * arg0.anInt2768), 0, 0, true, false, (long) (arg0.anInt2768 * -1688488127), false, (byte) -126);
				}
			}
		}
	}

	@OriginalMember(owner = "client!xi", name = "q", descriptor = "(B)V")
	static void method33003(@OriginalArg(0) byte arg0) {
		if (Class51.aClass93_Sub36_1.aClass166_Sub47_1.method16568((short) 512) == 1) {
			Class392.aClass541_1.method31089(new Class537(Class526.aClass526_7, null), (byte) -13);
		} else {
			client.aClass532_1.method30650((byte) 0);
			Class360.method27982((short) -7152);
		}
	}

	@OriginalMember(owner = "client!xi", name = "aku", descriptor = "(Lclient!yf;B)V")
	static void method33004(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class159_Sub1.anInt1950 * -1574654625 == 100 ? 1 : 0;
	}

	@OriginalMember(owner = "client!xi", name = "jv", descriptor = "(IIIIIIIII)V")
	static void method33005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (Class383.method28326(arg0, null, 1357712085)) {
			Class485.method29983(Class166_Sub1.aClass320Array1[arg0].method27320(855839648), -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg7 < 0, 1882851760);
		} else if (arg7 == -1) {
			for (@Pc(14) int local14 = 0; local14 < 114; local14++) {
				client.aBooleanArray22[local14] = true;
			}
		} else {
			client.aBooleanArray22[arg7] = true;
		}
	}

	@OriginalMember(owner = "client!xi", name = "e", descriptor = "(ZZI)V")
	public static void method33006(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg0) {
			Class685.anInt6066 += 1883407479;
			Class376.method28224(-379347127);
		}
		if (arg1) {
			Class685.anInt6067 += -236883317;
			Class262.method26267((short) 8448);
		}
	}

	@OriginalMember(owner = "client!xi", name = "<init>", descriptor = "(II)V")
	Class660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5984 = arg0 * 1401857693;
		this.anInt5985 = arg1 * 402888471;
	}

	@OriginalMember(owner = "client!xi", name = "n", descriptor = "()I")
	@Override
	public int getId() {
		return this.anInt5985 * -673115993;
	}
}
