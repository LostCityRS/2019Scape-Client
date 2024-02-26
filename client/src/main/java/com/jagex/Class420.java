package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class420 {

	@OriginalMember(owner = "client!mm", name = "t", descriptor = "Lclient!mm;")
	public static final Class420 aClass420_3 = new Class420();

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "Lclient!mm;")
	public static final Class420 aClass420_2 = new Class420();

	@OriginalMember(owner = "client!mm", name = "t", descriptor = "(I)[Lclient!ek;")
	static Class244[] method29002(@OriginalArg(0) int arg0) {
		return new Class244[] { Class244.aClass244_1, Class244.aClass244_7, Class244.aClass244_5, Class244.aClass244_6, Class244.aClass244_3, Class244.aClass244_2, Class244.aClass244_4 };
	}

	@OriginalMember(owner = "client!mm", name = "j", descriptor = "(Lclient!yp;I)V")
	static void method29003(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1] = ((Class352) Class106.aClass73_Sub1_6.method18054(arg0.anIntArray525[arg0.anInt5778 * 1896589581 - 1], 1769558406)).anInt4258 * 1518170125;
	}

	@OriginalMember(owner = "client!mm", name = "y", descriptor = "(Lclient!yp;I)V")
	static void method29004(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		arg0.anIntArray525[arg0.anInt5778 * 1896589581] = Class586.method31878(arg0.anIntArray525[arg0.anInt5778 * 1896589581], arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1], -923281162);
		arg0.anInt5778 += 2036747717;
	}

	@OriginalMember(owner = "client!mm", name = "is", descriptor = "(Lclient!yp;I)V")
	static void method29005(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class642.method32960(local11, local14, arg0, -1568471753);
	}

	@OriginalMember(owner = "client!mm", name = "li", descriptor = "(Lclient!hx;ILclient!yp;I)V")
	static void method29006(@OriginalArg(0) Class327 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) int arg3) {
		if (arg0.aByteArrayArray15 == null) {
			throw new RuntimeException();
		}
		if (arg0.anIntArray411 == null) {
			arg0.anIntArray411 = new int[arg0.aByteArrayArray15.length];
		}
		arg0.anIntArray411[arg1] = Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!mm", name = "aoe", descriptor = "(Lclient!yp;I)V")
	static void method29007(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		arg0.anInt5778 -= -221471862;
		@Pc(18) boolean local18 = arg0.anIntArray525[arg0.anInt5778 * 1896589581] == 1;
		@Pc(33) boolean local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1] == 1;
		Class160.aClass121_Sub1_2.method9594(local18, local33, (byte) 118);
	}

	@OriginalMember(owner = "client!mm", name = "aqy", descriptor = "(Lclient!yp;B)V")
	static void method29008(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= 2036747717;
		arg0.anInt5778 -= 2036747717;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!mm", name = "add", descriptor = "(Lclient!yp;B)V")
	static void method29009(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local13 - local23;
	}

	@OriginalMember(owner = "client!mm", name = "aw", descriptor = "(Lclient!di;IIIIIB)V")
	static void method29010(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6) {
		if ((Class233.aClass99_28 == null || Class80_Sub34.aClass99_16 == null || Class165_Sub13.aClass99_17 == null) && Class708.aClass480_136.method29945(Class273.anInt3922 * -1100674303, (byte) 1) && Class708.aClass480_136.method29945(Class80_Sub1_Sub15_Sub3.anInt3293 * -102189527, (byte) 1) && Class708.aClass480_136.method29945(Class382.anInt4539 * -1617557707, (byte) 1)) {
			@Pc(33) Class109 local33 = Class212.method25822(Class708.aClass480_136, Class80_Sub1_Sub15_Sub3.anInt3293 * -102189527, 0);
			Class80_Sub34.aClass99_16 = arg0.method20906(local33, true);
			local33.method7131();
			Class231.aClass99_27 = arg0.method20906(local33, true);
			Class233.aClass99_28 = arg0.method20906(Class212.method25822(Class708.aClass480_136, Class273.anInt3922 * -1100674303, 0), true);
			@Pc(62) Class109 local62 = Class212.method25822(Class708.aClass480_136, Class382.anInt4539 * -1617557707, 0);
			Class165_Sub13.aClass99_17 = arg0.method20906(local62, true);
			local62.method7131();
			Class647.aClass99_39 = arg0.method20906(local62, true);
		}
		if (Class233.aClass99_28 == null || Class80_Sub34.aClass99_16 == null || Class165_Sub13.aClass99_17 == null) {
			return;
		}
		@Pc(91) int local91 = (arg3 - Class165_Sub13.aClass99_17.method18218() * 2) / Class233.aClass99_28.method18218();
		@Pc(93) int local93;
		for (local93 = 0; local93 < local91; local93++) {
			Class233.aClass99_28.method18225(arg1 + Class165_Sub13.aClass99_17.method18218() + local93 * Class233.aClass99_28.method18218(), arg2 + arg4 - Class233.aClass99_28.method18219());
		}
		local93 = (arg4 - arg5 - Class165_Sub13.aClass99_17.method18219()) / Class80_Sub34.aClass99_16.method18219();
		for (@Pc(127) int local127 = 0; local127 < local93; local127++) {
			Class80_Sub34.aClass99_16.method18225(arg1, arg2 + arg5 + local127 * Class80_Sub34.aClass99_16.method18219());
			Class231.aClass99_27.method18225(arg1 + arg3 - Class231.aClass99_27.method18218(), arg2 + arg5 + local127 * Class80_Sub34.aClass99_16.method18219());
		}
		Class165_Sub13.aClass99_17.method18225(arg1, arg2 + arg4 - Class165_Sub13.aClass99_17.method18219());
		Class647.aClass99_39.method18225(arg1 + arg3 - Class165_Sub13.aClass99_17.method18218(), arg4 + arg2 - Class165_Sub13.aClass99_17.method18219());
	}

	@OriginalMember(owner = "client!mm", name = "y", descriptor = "(Lclient!ald;J)V")
	static void method29011(@OriginalArg(0) Packet arg0, @OriginalArg(1) long arg1) {
		@Pc(10) Class31 local10;
		if (Class238.aString153 != null && Class238.aString153.length() == 6) {
			if (Class238.aBoolean770) {
				local10 = Class31.aClass31_4;
			} else {
				local10 = Class31.aClass31_3;
			}
		} else if (Class587.aClass474_1.method29864(arg1)) {
			local10 = Class31.aClass31_1;
		} else {
			local10 = Class31.aClass31_2;
		}
		arg0.p1(local10.method37268());
		switch(local10.anInt104 * -1971508353) {
			case 0:
				arg0.pos += -158245012;
				break;
			case 1:
				arg0.p4(Class587.aClass474_1.method29863(arg1));
				break;
			case 2:
			case 3:
				arg0.p3(Integer.parseInt(Class238.aString153));
				arg0.pos += 1034180571;
		}
	}

	@OriginalMember(owner = "client!mm", name = "hr", descriptor = "(IIII)V")
	public static void method29012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) int local3 = arg0 << 3;
		@Pc(7) int local7 = arg1 << 3;
		@Pc(11) int local11 = arg2 << 3;
		if (Class368.anInt4502 * -1583611537 != 3) {
			client.aFloat254 = local3;
			client.aFloat255 = local7;
			if (Class368.anInt4502 * -1583611537 == 5) {
				client.anInt3481 = local3 * -560342087;
				Class664.anInt5692 = local7 * -399825347;
				Class338.anInt4231 = local11 * 1745932449;
			}
			Class517.method30581(832175576);
		} else if (Class160.aClass121_Sub1_2.method9607(-411950295) == Class340.aClass340_7) {
			@Pc(26) Class123_Sub3 local26 = (Class123_Sub3) Class160.aClass121_Sub1_2.method9603(-1540673207);
			@Pc(30) Class466 local30 = new Class466();
			@Pc(34) Class466 local34 = new Class466();
			local30.method29645(0.0F, 1.0F, 0.0F, 3.1415927F - (float) (2.0D * 3.141592653589793D * (double) local7 / 16384.0D));
			@Pc(57) Class463 local57 = new Class463(1.0F, 0.0F, 0.0F);
			local57.method29500(local30);
			local57.method29475();
			local34.method29648(local57, (float) ((double) local3 * 3.141592653589793D * 2.0D) / 16384.0F);
			local30.method29660(local34);
			local26.aClass466_1.method29647(local30);
		}
		client.aBoolean726 = true;
	}

	@OriginalMember(owner = "client!mm", name = "t", descriptor = "(FLclient!on;Lclient!oq;Lclient!on;Lclient!on;Lclient!on;FFFI)V")
	public static void method29013(@OriginalArg(0) float arg0, @OriginalArg(1) Class463 arg1, @OriginalArg(2) Class466 arg2, @OriginalArg(3) Class463 arg3, @OriginalArg(4) Class463 arg4, @OriginalArg(5) Class463 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) int arg9) {
		if (arg3.method29480(arg1)) {
			return;
		}
		@Pc(9) Class463 local9 = Class463.method29541(0.0F, 0.0F, 0.0F);
		@Pc(14) Class463 local14 = Class463.method29472(Class463.method29487(arg3, arg1));
		local14.method29500(arg2);
		@Pc(21) Class463 local21 = Class463.method29487(local14, local9);
		@Pc(24) float local24 = local21.method29481();
		if (arg5.aFloat297 == Float.POSITIVE_INFINITY || Float.isNaN(arg1.aFloat297) || local24 > arg7 || local24 < arg8) {
			arg1.method29478(arg3);
			arg4.method29575();
			return;
		}
		arg2.method29701();
		@Pc(54) Class463 local54 = Class463.method29541(1.0F, 0.0F, 0.0F);
		@Pc(59) Class463 local59 = Class463.method29541(0.0F, 1.0F, 0.0F);
		@Pc(64) Class463 local64 = Class463.method29541(0.0F, 0.0F, 1.0F);
		local54.method29500(arg2);
		local59.method29500(arg2);
		local64.method29500(arg2);
		@Pc(84) Class463 local84 = Class463.method29541(Class463.method29498(local54, arg4), Class463.method29498(local59, arg4), Class463.method29498(local64, arg4));
		@Pc(87) Class463 local87 = Class463.method29472(local84);
		@Pc(104) Class463 local104 = Class463.method29541(local21.aFloat297 * arg5.aFloat297, local21.aFloat295 * arg5.aFloat295, arg5.aFloat296 * local21.aFloat296);
		local87.method29484(local104, arg0);
		local87.method29499(arg6);
		@Pc(116) Class463 local116 = Class463.method29551(local54, local87.aFloat297);
		local116.method29484(local59, local87.aFloat295);
		local116.method29484(local64, local87.aFloat296);
		arg4.method29478(local116);
		arg1.method29483(Class463.method29551(arg4, arg0));
	}

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "()V")
	Class420() {
	}
}
