package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public class Class631 implements Interface75 {

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "Lclient!wa;")
	static final Class631 aClass631_2 = new Class631(0);

	@OriginalMember(owner = "client!wa", name = "n", descriptor = "Lclient!wa;")
	static final Class631 aClass631_3 = new Class631(1);

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "Lclient!wa;")
	static final Class631 aClass631_1 = new Class631(2);

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
	final int anInt5719;

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "()[Lclient!wa;", line = 14)
	public static Class631[] method32279() {
		return new Class631[] { aClass631_1, aClass631_2, aClass631_3 };
	}

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(I)V", line = 17)
	Class631(@OriginalArg(0) int arg0) {
		this.anInt5719 = arg0 * -2075815569;
	}

	@OriginalMember(owner = "client!wa", name = "n", descriptor = "()I", line = 22)
	@Override
	public int getId() {
		return this.anInt5719 * -494867057;
	}

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "()I", line = 22)
	@Override
	public int method36919() {
		return this.anInt5719 * -494867057;
	}

	@OriginalMember(owner = "client!wa", name = "m", descriptor = "(I)Z", line = 56)
	static boolean method32280(@OriginalArg(0) int arg0) {
		return Class588.aClass588_3 != null;
	}

	@OriginalMember(owner = "client!wa", name = "gl", descriptor = "(I)V", line = 3386)
	public static final void method32281(@OriginalArg(0) int arg0) {
		if (client.anInt3486 * 901426439 == -1 || -66946315 * client.anInt3490 == -1) {
			return;
		}
		@Pc(28) int local28 = (client.anInt3525 * 1769487553 * (client.anInt3493 * -31038737 - client.anInt3456 * 2076015603) >> 16) + client.anInt3456 * 2076015603;
		client.anInt3525 += local28 * -1606003903;
		if (client.anInt3525 * 1769487553 >= 65535) {
			client.anInt3525 = -1292194625;
			if (client.aBoolean624) {
				client.aBoolean607 = false;
			} else {
				client.aBoolean607 = true;
			}
			client.aBoolean624 = true;
		} else {
			client.aBoolean607 = false;
			client.aBoolean624 = false;
		}
		@Pc(62) float local62 = (float) (client.anInt3525 * 1769487553) / 65535.0F;
		@Pc(65) float[] local65 = new float[3];
		@Pc(69) int local69 = client.anInt3491 * 264715726;
		@Pc(100) int local100;
		@Pc(138) int local138;
		@Pc(148) int local148;
		@Pc(152) int local152;
		@Pc(160) int local160;
		@Pc(178) int local178;
		for (@Pc(71) int local71 = 0; local71 < 3; local71++) {
			@Pc(86) int local86 = client.anIntArrayArrayArray15[client.anInt3486 * 901426439][local69][local71] * 3;
			local100 = client.anIntArrayArrayArray15[client.anInt3486 * 901426439][local69 + 1][local71] * 3;
			local138 = (client.anIntArrayArrayArray15[client.anInt3486 * 901426439][local69 + 2][local71] - (client.anIntArrayArrayArray15[client.anInt3486 * 901426439][local69 + 3][local71] - client.anIntArrayArrayArray15[client.anInt3486 * 901426439][local69 + 2][local71])) * 3;
			local148 = client.anIntArrayArrayArray15[client.anInt3486 * 901426439][local69][local71];
			local152 = local100 - local86;
			local160 = local138 + (local86 - local100 * 2);
			local178 = client.anIntArrayArrayArray15[client.anInt3486 * 901426439][local69 + 2][local71] - local148 + local100 - local138;
			local65[local71] = ((local62 * (float) local178 + (float) local160) * local62 + (float) local152) * local62 + (float) local148;
		}
		@Pc(204) Class611 local204 = client.world.method30455(1700360326);
		Class163.anInt2002 = ((int) local65[0] - local204.anInt5623 * 1114227200) * 1636217271;
		Class130_Sub2.anInt1117 = (int) local65[1] * -1820517185;
		Class270.anInt3884 = ((int) local65[2] - local204.anInt5624 * 1116707328) * -967471741;
		@Pc(238) float[] local238 = new float[3];
		local100 = client.anInt3506 * 1168037790;
		for (local138 = 0; local138 < 3; local138++) {
			local148 = client.anIntArrayArrayArray15[client.anInt3490 * -66946315][local100][local138] * 3;
			local152 = client.anIntArrayArrayArray15[client.anInt3490 * -66946315][local100 + 1][local138] * 3;
			local160 = (client.anIntArrayArrayArray15[client.anInt3490 * -66946315][local100 + 2][local138] - (client.anIntArrayArrayArray15[client.anInt3490 * -66946315][local100 + 3][local138] - client.anIntArrayArrayArray15[client.anInt3490 * -66946315][local100 + 2][local138])) * 3;
			local178 = client.anIntArrayArrayArray15[client.anInt3490 * -66946315][local100][local138];
			@Pc(325) int local325 = local152 - local148;
			@Pc(333) int local333 = local148 - local152 * 2 + local160;
			@Pc(351) int local351 = client.anIntArrayArrayArray15[client.anInt3490 * -66946315][local100 + 2][local138] - local178 + local152 - local160;
			local238[local138] = (float) local178 + local62 * (((float) local333 + (float) local351 * local62) * local62 + (float) local325);
		}
		@Pc(381) float local381 = local238[0] - local65[0];
		@Pc(391) float local391 = -1.0F * (local238[1] - local65[1]);
		@Pc(399) float local399 = local238[2] - local65[2];
		@Pc(409) double local409 = Math.sqrt((double) (local381 * local381 + local399 * local399));
		Class620.anInt5644 = ((int) (Math.atan2((double) local391, local409) * 2607.5945876176133D) & 0x3FFF) * -1151839067;
		IsaacRandom.anInt82 = ((int) (-Math.atan2((double) local381, (double) local399) * 2607.5945876176133D) & 0x3FFF) * 1056124373;
		Class348.anInt4199 = (client.anIntArrayArrayArray15[client.anInt3486 * 901426439][local69][3] + (client.anInt3525 * 1769487553 * (client.anIntArrayArrayArray15[client.anInt3486 * 901426439][local69 + 2][3] - client.anIntArrayArrayArray15[client.anInt3486 * 901426439][local69][3]) >> 16)) * -2045030213;
	}

	@OriginalMember(owner = "client!wa", name = "zd", descriptor = "(Lclient!yf;I)V", line = 9494)
	static final void method32282(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(26) String local26 = (String) arg0.anObjectArray45[(arg0.anInt5888 -= 957530791) * 587908375];
		if (local12 == -1) {
			throw new RuntimeException();
		}
		@Pc(39) Class39 local39 = (Class39) Class19.aClass32_Sub7_5.get(local12, -229709126);
		if (Class519.aClass519_7 != local39.aClass519_1) {
			throw new RuntimeException();
		}
		@Pc(52) int[] local52 = local39.method764(local26, -1497248091);
		@Pc(54) int local54 = 0;
		if (local52 != null) {
			local54 = local52.length;
		}
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local54;
	}

	@OriginalMember(owner = "client!wa", name = "bcf", descriptor = "(Lclient!yf;I)V", line = 14675)
	static final void method32283(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}