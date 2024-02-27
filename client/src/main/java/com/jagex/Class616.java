package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class616 {

	@OriginalMember(owner = "client!vl", name = "t", descriptor = "Lclient!vl;")
	public static final Class616 aClass616_3 = new Class616(0);

	@OriginalMember(owner = "client!vl", name = "f", descriptor = "Lclient!vl;")
	public static final Class616 aClass616_2 = new Class616(1);

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "Lclient!vl;")
	public static final Class616 aClass616_1 = new Class616(4);

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "(II)Lclient!dj;")
	static Class225 method32287(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class225 local6 = (Class225) Class80_Sub39.method15030(Class331.method27784(1359121246), arg0, -870018685);
		if (local6 == null) {
			local6 = Class225.aClass225_5;
		}
		return local6;
	}

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "(Lclient!hx;Lclient!hr;IIIIIJ)V")
	static void method32288(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class323 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7) {
		@Pc(7) int local7 = arg5 * arg5 + arg4 * arg4;
		if ((long) local7 > arg7) {
			return;
		}
		@Pc(32) int local32;
		if (Class368.anInt4502 * -1583611537 == 3) {
			local32 = (int) ((double) BufferedSocket.aClass121_Sub1_2.method9648(2053904016) * 2607.5945876176133D) + client.anInt3474 * -1918431893 & 0x3FFF;
		} else if (Class368.anInt4502 * -1583611537 == 4) {
			local32 = (int) client.aFloat255 & 0x3FFF;
		} else {
			local32 = (int) client.aFloat255 + client.anInt3474 * -1918431893 & 0x3FFF;
		}
		@Pc(57) int local57 = Class467.anIntArray454[local32];
		@Pc(61) int local61 = Class467.anIntArray453[local32];
		if (Class368.anInt4502 * -1583611537 != 4) {
			local57 = local57 * 256 / (client.anInt3476 * -692320695 + 256);
			local61 = local61 * 256 / (client.anInt3476 * -692320695 + 256);
		}
		@Pc(96) int local96 = local57 * arg5 + local61 * arg4 >> 14;
		@Pc(106) int local106 = local61 * arg5 - local57 * arg4 >> 14;
		@Pc(110) Class99 local110 = Class313.aClass99Array4[arg6];
		@Pc(113) int local113 = local110.method18218();
		@Pc(116) int local116 = local110.method18219();
		@Pc(129) int local129 = arg0.anInt4103 * 1892149809 / 2 + local96 - local113 / 2;
		@Pc(133) int local133 = local113 + local129;
		@Pc(145) int local145 = -local106 + arg0.anInt4104 * 1990157877 / 2 - local116;
		@Pc(149) int local149 = local116 + local145;
		@Pc(179) boolean local179;
		if (arg1 == null) {
			@Pc(186) int local186 = local113 / 2;
			local179 = local145 <= -local116 || local149 >= arg0.anInt4104 * 1990157877 || local129 <= -local186 || local133 >= arg0.anInt4103 * 1892149809 + local186;
		} else {
			local179 = !arg1.method27607(local129, local145, 288830201) || !arg1.method27607(local133, local145, 288830201) || !arg1.method27607(local129, local149, 288830201) || !arg1.method27607(local133, local149, 288830201);
		}
		if (local179) {
			@Pc(220) double local220 = Math.atan2((double) local96, (double) local106);
			@Pc(228) double local228 = Math.atan2((double) Math.abs(local96), (double) Math.abs(local106));
			@Pc(244) double local244 = Math.atan2((double) (arg0.anInt4103 * 1892149809 / 2), (double) (arg0.anInt4104 * 1990157877 / 2));
			@Pc(246) boolean local246 = false;
			@Pc(248) double local248 = 0.0D;
			@Pc(263) int local263;
			if (local228 < local244) {
				local248 = 1.5707963267948966D - local220;
				local263 = arg0.anInt4104 * 1990157877 / 2;
			} else {
				local248 = local220;
				local263 = arg0.anInt4103 * 1892149809 / 2;
			}
			@Pc(285) int local285 = Math.abs((int) -((double) local263 * Math.sin(1.5707963267948966D) / Math.sin(local248)));
			Class393.aClass99Array7[arg6].method18243((float) (arg0.anInt4103 * 1892149809) / 2.0F + (float) arg2 + 0.0F, (float) (arg0.anInt4104 * 1990157877) / 2.0F + (float) arg3 - 0.0F, (float) Class393.aClass99Array7[arg6].method18214() / 2.0F, (float) local285, 4096, (int) (-local220 / 6.283185307179586D * 65535.0D));
		} else if (arg1 == null) {
			local110.method18225(local129 + arg2, arg3 + local145);
		} else {
			local110.method18235(arg2 + local129, local145 + arg3, arg1.aClass98_1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!vl", name = "jq", descriptor = "(IIIIIIII)V")
	static void method32289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(3) int local3 = arg6 - 334;
		if (local3 < 0) {
			local3 = 0;
		} else if (local3 > 100) {
			local3 = 100;
		}
		@Pc(23) int local23 = client.aShort158 + (client.aShort159 - client.aShort158) * local3 / 100;
		@Pc(29) int local29 = local23 * arg5 >> 8;
		@Pc(35) int local35 = 16384 - arg3 & 0x3FFF;
		@Pc(41) int local41 = 16384 - arg4 & 0x3FFF;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(47) int local47 = local29;
		if (local35 != 0) {
			local45 = Class467.anIntArray454[local35] * -local29 >> 14;
			local47 = Class467.anIntArray453[local35] * local29 >> 14;
		}
		if (local41 != 0) {
			local43 = local47 * Class467.anIntArray454[local41] >> 14;
			local47 = local47 * Class467.anIntArray453[local41] >> 14;
		}
		Class89.anInt319 = (arg0 - local43) * 2068667409;
		Class283.anInt3937 = (arg1 - local45) * 364051605;
		Class102_Sub2.anInt653 = (arg2 - local47) * 483037039;
		client.anInt3481 = arg3 * -560342087;
		Class664.anInt5692 = arg4 * -399825347;
		Class338.anInt4231 = 0;
	}

	@OriginalMember(owner = "client!vl", name = "an", descriptor = "(IIII)V")
	static void method32290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) Class80_Sub1_Sub9 local4 = Class22.method545(11, (long) arg0);
		local4.method22135(-457826299);
		local4.anInt3064 = arg1 * -1221031713;
		local4.anInt3047 = arg2 * 673180539;
	}

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(I)V")
	Class616(@OriginalArg(0) int arg0) {
	}
}
