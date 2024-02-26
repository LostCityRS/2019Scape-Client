package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class210 {

	@OriginalMember(owner = "client!co", name = "t", descriptor = "Lclient!co;")
	public static final Class210 aClass210_25 = new Class210(8, 3);

	@OriginalMember(owner = "client!co", name = "f", descriptor = "Lclient!co;")
	public static final Class210 aClass210_24 = new Class210(7, 4);

	@OriginalMember(owner = "client!co", name = "e", descriptor = "Lclient!co;")
	public static final Class210 aClass210_17 = new Class210(2, 1);

	@OriginalMember(owner = "client!co", name = "u", descriptor = "Lclient!co;")
	public static final Class210 aClass210_19 = new Class210(5, 1);

	@OriginalMember(owner = "client!co", name = "l", descriptor = "Lclient!co;")
	public static final Class210 aClass210_26 = new Class210(6, 2);

	@OriginalMember(owner = "client!co", name = "g", descriptor = "Lclient!co;")
	public static final Class210 aClass210_21 = new Class210(3, 1);

	@OriginalMember(owner = "client!co", name = "i", descriptor = "Lclient!co;")
	static final Class210 aClass210_22 = new Class210(0, 3);

	@OriginalMember(owner = "client!co", name = "m", descriptor = "Lclient!co;")
	static final Class210 aClass210_20 = new Class210(9, 4);

	@OriginalMember(owner = "client!co", name = "o", descriptor = "Lclient!co;")
	public static final Class210 aClass210_18 = new Class210(1, 1);

	@OriginalMember(owner = "client!co", name = "j", descriptor = "Lclient!co;")
	public static final Class210 aClass210_23 = new Class210(4, 1);

	@OriginalMember(owner = "client!co", name = "a", descriptor = "I")
	public final int anInt3601;

	@OriginalMember(owner = "client!co", name = "s", descriptor = "I")
	public final int anInt3600;

	@OriginalMember(owner = "client!co", name = "f", descriptor = "(ZZI)V")
	public static void method25804(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg0) {
			Class687.anInt5772 -= -241315101;
			if (Class687.anInt5772 * 1966867147 == 0) {
				Class325.anIntArray400 = null;
			}
		}
		if (arg1) {
			Class687.anInt5773 -= -1120305201;
			if (Class687.anInt5773 * 1840719663 == 0) {
				Class687.anIntArray524 = null;
			}
		}
	}

	@OriginalMember(owner = "client!co", name = "qy", descriptor = "(Lclient!yp;S)V")
	static void method25805(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class563.method31455(local11, local14, arg0, -1934980461);
	}

	@OriginalMember(owner = "client!co", name = "t", descriptor = "(II)I")
	public static int method25806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Class55.anIntArray25[arg0];
	}

	@OriginalMember(owner = "client!co", name = "o", descriptor = "(Lclient!sc;Lclient!aod;III)Z")
	static boolean method25807(@OriginalArg(0) Interface60 arg0, @OriginalArg(1) Class41_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 == null) {
			return false;
		}
		@Pc(11) Class625 local11 = (Class625) arg1.method18054(arg0.method13834((byte) -18), -137024896);
		if (local11.aBoolean943 && !client.aBoolean732) {
			return false;
		}
		@Pc(23) int local23 = local11.anInt5502 * -1477183523;
		if (local11.anIntArray503 != null) {
			for (@Pc(29) int local29 = 0; local29 < local11.anIntArray503.length; local29++) {
				if (local11.anIntArray503[local29] != -1) {
					@Pc(49) Class625 local49 = (Class625) arg1.method18054(local11.anIntArray503[local29], 398316166);
					if (local49.anInt5502 * -1477183523 >= 0) {
						local23 = local49.anInt5502 * -1477183523;
					}
				}
			}
		}
		if (local23 < 0) {
			return false;
		}
		Class27.anIntArray9[Class27.anInt87 * -1449044929] = local11.anInt5499 * 324896623;
		Class27.anIntArray10[Class27.anInt87 * -1449044929] = arg2;
		Class27.anIntArray8[Class27.anInt87 * -1449044929] = arg3;
		Class27.anInt87 += 358652863;
		return true;
	}

	@OriginalMember(owner = "client!co", name = "dq", descriptor = "(Lclient!di;IIIII)V")
	static void method25808(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.method20986(arg1, arg2, arg1 + arg3, arg4 + arg2);
		arg0.method20716(arg1, arg2, arg3, arg4, -16777216, (byte) 70);
		if (Class159_Sub1.anInt2017 * 1776676847 < 100) {
			return;
		}
		@Pc(29) float local29 = (float) Class159_Sub1.anInt1989 / (float) Class159_Sub1.anInt2001;
		@Pc(31) int local31 = arg3;
		@Pc(33) int local33 = arg4;
		if (local29 < 1.0F) {
			local33 = (int) (local29 * (float) arg3);
		} else {
			local31 = (int) ((float) arg4 / local29);
		}
		@Pc(58) int local58 = arg1 + (arg3 - local31) / 2;
		@Pc(66) int local66 = arg2 + (arg4 - local33) / 2;
		if (Class374.aClass99_31 == null || Class374.aClass99_31.method18218() != local31 || Class374.aClass99_31.method18219() != local33) {
			Class159_Sub1.aClass243_34 = Class159_Sub1.aClass243_33;
			Class159_Sub1.method15344(Class159_Sub1.anInt1991, Class159_Sub1.anInt1989 + Class159_Sub1.anInt1996, Class159_Sub1.anInt2001 + Class159_Sub1.anInt1991, Class159_Sub1.anInt1996, local58, local66, local31 + local58, local33 + local66);
			Class159_Sub1.method15346(arg0, false, false, client.aBoolean732, true);
			arg0.method20744();
			Class374.aClass99_31 = arg0.method20743(local58, local66, local31, local33, true);
		}
		Class374.aClass99_31.method18225(local58, local66);
		@Pc(123) int local123 = Class290.anInt3947 * 1225644585 * local31 / Class159_Sub1.anInt2001;
		@Pc(131) int local131 = local33 * -871755821 * Class278.anInt3927 / Class159_Sub1.anInt1989;
		@Pc(141) int local141 = local58 + Class147_Sub2.anInt1485 * -1443658731 * local31 / Class159_Sub1.anInt2001;
		@Pc(155) int local155 = local66 + local33 - local33 * 724794277 * Class469.anInt4956 / Class159_Sub1.anInt1989 - local131;
		@Pc(157) int local157 = -1996554240;
		if (Class722.aClass722_6 == client.aClass722_4) {
			local157 = -1996488705;
		}
		arg0.method20722(local141, local155, local123, local131, local157, 1);
		arg0.method20818(local141, local155, local123, local131, local157, 0);
		for (@Pc(183) Class80_Sub18 local183 = (Class80_Sub18) Class159_Sub1.aClass8_28.method247(129206984); local183 != null; local183 = (Class80_Sub18) Class159_Sub1.aClass8_28.method237(89307408)) {
			@Pc(195) Class320 local195 = (Class320) Class159_Sub1.aClass41_Sub13_4.method18054(local183.anInt1587 * 1945594581, 251770910);
			if (Class508.method30530(local195, -726845162)) {
				@Pc(209) Class200 local209 = (Class200) Class159_Sub1.aHashMap4.get(local183.anInt1587 * 1945594581);
				if (local209 == null) {
					local209 = (Class200) Class159_Sub1.aHashMap5.get(local195.anInt4061 * -1976811059);
				}
				if (local209 != null) {
					@Pc(247) int local247;
					if (local209.anInt3373 * -353644331 > Class159_Sub1.anInt2024 * 1506340421 / 2) {
						local247 = (Class159_Sub1.anInt2024 * 1864718011 - local209.anInt3373 * 15008811) / (Class159_Sub1.anInt2024 * 1506340421);
					} else {
						local247 = local209.anInt3373 * 15008811 / (Class159_Sub1.anInt2024 * 1506340421);
					}
					@Pc(268) int local268 = local31 * local183.anInt1582 * 652783051 / Class159_Sub1.anInt2001 + local58;
					@Pc(281) int local281 = local66 + local33 * (Class159_Sub1.anInt1989 - local183.anInt1584 * -1163867765) / Class159_Sub1.anInt1989;
					arg0.method20716(local268 - 2, local281 - 2, 4, 4, local247 << 24 | 0xFFFF00, (byte) 1);
				}
			}
		}
		Class159_Sub1.aClass243_33.method26247(5, (byte) 118);
	}

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(II)V")
	Class210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3601 = arg0 * -1729586287;
		this.anInt3600 = arg1 * -1735195657;
	}
}
