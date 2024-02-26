package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class578 {

	@OriginalMember(owner = "client!tp", name = "u", descriptor = "I")
	static final int anInt5294 = 16;

	@OriginalMember(owner = "client!tp", name = "f", descriptor = "I")
	static final int anInt5295 = 2;

	@OriginalMember(owner = "client!tp", name = "g", descriptor = "I")
	static final int anInt5296 = 63;

	@OriginalMember(owner = "client!tp", name = "e", descriptor = "I")
	static final int anInt5297 = 8;

	@OriginalMember(owner = "client!tp", name = "t", descriptor = "I")
	static final int anInt5298 = 1;

	@OriginalMember(owner = "client!tp", name = "l", descriptor = "I")
	static final int anInt5299 = 62;

	@OriginalMember(owner = "client!tp", name = "hq", descriptor = "Lclient!aox;")
	public static Class41_Sub19 aClass41_Sub19_1;

	@OriginalMember(owner = "client!tp", name = "fk", descriptor = "Lclient!pf;")
	public static Class480 aClass480_125;

	@OriginalMember(owner = "client!tp", name = "akx", descriptor = "(Lclient!yp;B)V")
	static void method31794(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (Class159_Sub1.aClass24_15 == null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		} else {
			@Pc(20) Class80 local20 = Class159_Sub1.aClass24_15.method560((long) local12);
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local20 == null ? 0 : 1;
		}
	}

	@OriginalMember(owner = "client!tp", name = "adt", descriptor = "(Lclient!yp;I)V")
	static void method31795(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = arg0.aClass80_Sub32_4.anInt1650 * 753247591;
	}

	@OriginalMember(owner = "client!tp", name = "af", descriptor = "(II)Lclient!com/jagex/twitchtv/TwitchWebcamDevice;")
	public static TwitchWebcamDevice method31796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class622.aTwitchWebcamDeviceArray1 == null) {
			return null;
		}
		for (@Pc(6) int local6 = 0; local6 < Class622.aTwitchWebcamDeviceArray1.length; local6++) {
			if (Class622.aTwitchWebcamDeviceArray1[local6].e * 1851409193 == arg0) {
				return Class622.aTwitchWebcamDeviceArray1[local6];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tp", name = "acv", descriptor = "(Lclient!yp;I)V")
	static void method31797(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = arg0.aClass378_3.aByte138;
	}

	@OriginalMember(owner = "client!tp", name = "be", descriptor = "(Lclient!aqb;ZB)V")
	static void method31798(@OriginalArg(0) Class120_Sub1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) {
		if (Class630.anInt5553 * 721317679 >= 414) {
			return;
		}
		@Pc(8) Class335 local8 = arg0.aClass335_1;
		@Pc(11) String local11 = arg0.aString72;
		if (local8.anIntArray416 != null) {
			local8 = local8.method27836(Class672.aClass134_1, Class672.aClass134_1, -995250311);
			if (local8 == null) {
				return;
			}
			local11 = local8.aString188;
		}
		if (!local8.aBoolean821) {
			return;
		}
		if (arg0.anInt2664 * -123508655 != 0) {
			@Pc(50) String local50 = client.aClass722_4 == Class722.aClass722_6 ? Class60.aClass60_56.method1180(Class512.aClass719_3, 1099152799) : Class60.aClass60_136.method1180(Class512.aClass719_3, 1707720733);
			local11 = local11 + Class292.method26948(arg0.anInt2664 * -123508655, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anInt2709 * -2012525865, -489493754) + Class256.aString162 + local50 + arg0.anInt2664 * -123508655 + Class256.aString160;
		}
		if (client.aBoolean728 && !arg1) {
			@Pc(98) Class79 local98 = (Class79) (Class34.anInt107 * -968124561 == -1 ? null : Class370.aClass41_Sub10_1.method18054(Class34.anInt107 * -968124561, 405364430));
			if ((Class542.anInt5121 * -1641097909 & 0x2) != 0 && (local98 == null || local8.method27849(Class34.anInt107 * -968124561, local98.anInt253 * 680817871, -204472210) != local98.anInt253 * 680817871)) {
				Class360.method28144(client.aString149, client.aString146 + " " + Class256.aString158 + " " + Class90.method1870(16776960, -1014339336) + local11, Class107_Sub1.anInt682 * 582850143, 8, -1, (long) (arg0.anInt2671 * 1078276675), 0, 0, true, false, (long) (arg0.anInt2671 * 1078276675), false, (byte) 117);
			}
		}
		if (arg1) {
			return;
		}
		@Pc(167) String[] local167 = local8.aStringArray25;
		@Pc(169) boolean local169 = false;
		if (client.aBoolean736) {
			local167 = Class586.method31883(local167, (byte) -104);
		}
		if (local167 == null) {
			return;
		}
		@Pc(182) int local182;
		for (local182 = local167.length - 1; local182 >= 0; local182--) {
			if (local167[local182] != null && (arg0.anInt2666 * -739418435 & 0x1 << local182) == 0) {
				@Pc(203) short local203 = client.aShortArray83[local182];
				@Pc(207) int local207 = client.anInt3523 * -1653832769;
				@Pc(212) int local212 = local8.method27826(local182, -920860176);
				if (local212 != -1) {
					local207 = local212;
				}
				@Pc(226) boolean local226 = local167[local182].equalsIgnoreCase(Class60.aClass60_131.method1180(Class512.aClass719_3, 438042737));
				@Pc(235) boolean local235 = local167[local182].equalsIgnoreCase(Class60.aClass60_9.method1180(Class512.aClass719_3, 565867655));
				if (local226 || local235) {
					if (local169) {
						continue;
					}
					switch(client.aClass660_2.anInt5684 * -1513142625) {
						case 0:
							if (local226) {
								continue;
							}
							break;
						case 1:
						case 3:
							if (local8.aByte136 == 1) {
								local169 = true;
								continue;
							}
							break;
						case 2:
							local169 = true;
							continue;
					}
					if (local226) {
						local207 = local8.anInt4205 * 1912686937;
					}
				}
				Class360.method28144(local167[local182], Class90.method1870(16776960, -1379525314) + local11, local207, local203, -1, (long) (arg0.anInt2671 * 1078276675), 0, 0, true, false, (long) (arg0.anInt2671 * 1078276675), false, (byte) 66);
			}
		}
		if (!local169) {
			return;
		}
		for (local182 = 0; local182 < local167.length; local182++) {
			if (local167[local182] != null && (arg0.anInt2666 * -739418435 & 0x1 << local182) == 0) {
				@Pc(335) boolean local335 = local167[local182].equalsIgnoreCase(Class60.aClass60_131.method1180(Class512.aClass719_3, 1069342725));
				@Pc(344) boolean local344 = local167[local182].equalsIgnoreCase(Class60.aClass60_9.method1180(Class512.aClass719_3, -426385926));
				if (local335 || local344) {
					@Pc(352) short local352 = client.aShortArray83[local182];
					@Pc(356) int local356 = client.anInt3523 * -1653832769;
					@Pc(361) int local361 = local8.method27826(local182, -920860176);
					if (local361 != -1) {
						local356 = local361;
					}
					if (client.aClass660_2 == Class660.aClass660_5 || client.aClass660_2 == Class660.aClass660_3 && arg0.anInt2664 * -123508655 > Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anInt2709 * -2012525865) {
						local352 = (short) (local352 + 2000);
					}
					if (local335) {
						local356 = local8.anInt4205 * 1912686937;
					}
					Class360.method28144(local167[local182], Class90.method1870(16776960, -1404146790) + local11, local356, local352, -1, (long) (arg0.anInt2671 * 1078276675), 0, 0, true, false, (long) (arg0.anInt2671 * 1078276675), false, (byte) 73);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "()V")
	Class578() throws Throwable {
		throw new Error();
	}
}
