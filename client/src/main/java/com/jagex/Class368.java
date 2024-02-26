package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jv")
public final class Class368 {

	@OriginalMember(owner = "client!jv", name = "tb", descriptor = "I")
	public static int anInt4502;

	@OriginalMember(owner = "client!jv", name = "t", descriptor = "Lclient!jv;")
	static final Class368 aClass368_4 = new Class368(0);

	@OriginalMember(owner = "client!jv", name = "f", descriptor = "Lclient!jv;")
	static final Class368 aClass368_3 = new Class368(1);

	@OriginalMember(owner = "client!jv", name = "e", descriptor = "Lclient!jv;")
	static final Class368 aClass368_5 = new Class368(2);

	@OriginalMember(owner = "client!jv", name = "u", descriptor = "I")
	int anInt4501;

	@OriginalMember(owner = "client!jv", name = "e", descriptor = "(I)Lclient!jv;")
	static Class368 method28292(@OriginalArg(0) int arg0) {
		if (aClass368_4.anInt4501 * -803963017 == arg0) {
			return aClass368_4;
		} else if (arg0 == aClass368_3.anInt4501 * -803963017) {
			return aClass368_3;
		} else if (arg0 == aClass368_5.anInt4501 * -803963017) {
			return aClass368_5;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jv", name = "f", descriptor = "(I)Lclient!jv;")
	static Class368 method28293(@OriginalArg(0) int arg0) {
		if (aClass368_4.anInt4501 * -803963017 == arg0) {
			return aClass368_4;
		} else if (arg0 == aClass368_3.anInt4501 * -803963017) {
			return aClass368_3;
		} else if (arg0 == aClass368_5.anInt4501 * -803963017) {
			return aClass368_5;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jv", name = "t", descriptor = "(I)[Lclient!wh;")
	public static Class637[] method28294(@OriginalArg(0) int arg0) {
		return new Class637[] { Class637.aClass637_6, Class637.aClass637_4, Class637.aClass637_1, Class637.aClass637_2, Class637.aClass637_3, Class637.aClass637_5 };
	}

	@OriginalMember(owner = "client!jv", name = "cn", descriptor = "(Lclient!aod;[BIIIILclient!xs;Lclient!xs;I)I")
	public static int method28295(@OriginalArg(0) Class41_Sub3 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class669 arg6, @OriginalArg(7) Class669 arg7, @OriginalArg(8) int arg8) {
		@Pc(1) int local1 = 0;
		@Pc(6) Packet local6 = new Packet(arg1);
		@Pc(8) int local8 = -1;
		label73: while (true) {
			@Pc(12) int local12 = local6.gExtended1or2();
			if (local12 == 0) {
				return local1;
			}
			local8 += local12;
			@Pc(22) int local22 = 0;
			@Pc(24) boolean local24 = false;
			while (true) {
				@Pc(36) Class619 local36;
				@Pc(62) int local62;
				@Pc(68) Class625 local68;
				@Pc(86) int local86;
				do {
					@Pc(58) int local58;
					@Pc(81) int local81;
					do {
						do {
							do {
								do {
									@Pc(28) int local28;
									do {
										local28 = local6.gSmart1or2();
										if (local28 == 0) {
											continue label73;
										}
										local36 = new Class619(local6);
									} while (local24);
									local22 += local28 - 1;
									@Pc(48) int local48 = local22 & 0x3F;
									@Pc(54) int local54 = local22 >> 6 & 0x3F;
									local58 = arg2 + local54;
									local62 = arg3 + local48;
									local68 = (Class625) arg0.method18054(local8, 345329149);
									if ((local36.anInt5435 * -509515973 & 0x1) == 0) {
										local81 = local68.anInt5503 * 1462300569;
										local86 = local68.anInt5504 * -1951356049;
									} else {
										local81 = local68.anInt5504 * -1951356049;
										local86 = local68.anInt5503 * 1462300569;
									}
								} while (local58 >= arg4);
							} while (local62 >= arg5);
						} while (local58 + local81 < 0);
					} while (local62 + local86 < 0);
				} while (Class607.aClass607_10.anInt5396 * 1323580581 == local36.anInt5434 * 13806191 && Class703.aClass80_Sub37_49.aClass165_Sub26_1.method16355(-1745351512) == 0 && local68.anInt5506 * 350558937 == 0 && local68.anInt5505 * -1318718743 != 1 && !local68.aBoolean948);
				if (!local68.method32459(arg7, 1064491302)) {
					arg6.anInt5711 = local8 * 2092533495;
					local1++;
				}
				local24 = true;
			}
		}
	}

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(I)V")
	Class368(@OriginalArg(0) int arg0) {
		this.anInt4501 = arg0 * 517605959;
	}
}
