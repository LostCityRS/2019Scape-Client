package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
final class Class372 implements Interface50 {

	@OriginalMember(owner = "client!k", name = "u", descriptor = "Z")
	public static boolean aBoolean747;

	@OriginalMember(owner = "client!k", name = "it", descriptor = "Lclient!ach;")
	public static Class58 aClass58_2;

	@OriginalMember(owner = "client!k", name = "aeb", descriptor = "(Lclient!yf;I)V")
	static void method28197(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local13 % local23;
	}

	@OriginalMember(owner = "client!k", name = "akq", descriptor = "(Lclient!yf;I)V")
	static void method28198(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class93_Sub29 local2 = Class636.method32628((byte) -68);
		if (local2 == null) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local2.anInt1603 * 1208139441;
			@Pc(76) int local76 = local2.anInt1604 * -1010688139 << 28 | Class159.anInt1915 + local2.anInt1605 * 1012619213 << 14 | Class159.anInt1921 + local2.anInt1608 * -2087611449;
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local76;
		}
	}

	@OriginalMember(owner = "client!k", name = "af", descriptor = "(Lclient!dh;I)V")
	static void method28199(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -10660793;
		Class319.method27317(arg0, Class166_Sub17.anInt2179 * 1703853389, Class369.anInt4750 * -310709577, Class221.anInt3670 * 1555894759, Class115.anInt972 * 1280805653, local1, -16777216, -1752375831);
		Class118_Sub1.aClass106_3.method7524(Class74.aClass74_90.method1259(Class106.aClass717_8, (byte) -17), Class166_Sub17.anInt2179 * 1703853389 + 3, Class369.anInt4750 * -310709577 + 14, local1, -1, (byte) 0);
		@Pc(41) int local41 = Class82.aClass153_1.method14058(966984045);
		@Pc(45) int local45 = Class82.aClass153_1.method14064(-312530223);
		@Pc(49) int local49;
		@Pc(54) Class93_Sub1_Sub7 local54;
		@Pc(75) int local75;
		if (!Class454.aBoolean781) {
			local49 = 0;
			for (local54 = (Class93_Sub1_Sub7) Class454.aClass22_55.method445((byte) 67); local54 != null; local54 = (Class93_Sub1_Sub7) Class454.aClass22_55.method415(188373594)) {
				local75 = Class369.anInt4750 * -310709577 + 31 + Class454.anInt5197 * -875883057 * (Class454.anInt5203 * -1838307953 - 1 - local49);
				Class152.method14003(local41, local45, Class166_Sub17.anInt2179 * 1703853389, Class369.anInt4750 * -310709577, Class221.anInt3670 * 1555894759, Class115.anInt972 * 1280805653, local75, local54, Class118_Sub1.aClass106_3, Class110_Sub3.aClass5_7, -1, -256, (short) -28184);
				local49++;
			}
			return;
		}
		local49 = 0;
		for (@Pc(112) Class93_Sub1_Sub8 local112 = (Class93_Sub1_Sub8) Class454.aClass18_16.method246(1740174608); local112 != null; local112 = (Class93_Sub1_Sub8) Class454.aClass18_16.method253(-393573947)) {
			local75 = Class454.anInt5197 * -875883057 * local49 + Class369.anInt4750 * -310709577 + 31;
			if (local112.anInt3013 * -2109043087 == 1) {
				Class152.method14003(local41, local45, Class166_Sub17.anInt2179 * 1703853389, Class369.anInt4750 * -310709577, Class221.anInt3670 * 1555894759, Class115.anInt972 * 1280805653, local75, (Class93_Sub1_Sub7) local112.aClass18_10.aClass93_Sub1_4.aClass93_Sub1_68, Class118_Sub1.aClass106_3, Class110_Sub3.aClass5_7, -1, -256, (short) -10902);
			} else {
				Class125_Sub1.method9213(local41, local45, Class166_Sub17.anInt2179 * 1703853389, Class369.anInt4750 * -310709577, Class221.anInt3670 * 1555894759, Class115.anInt972 * 1280805653, local75, local112, Class118_Sub1.aClass106_3, Class110_Sub3.aClass5_7, -1, -256, -1543405323);
			}
			local49++;
		}
		if (Class454.aClass93_Sub1_Sub8_1 == null) {
			return;
		}
		Class319.method27317(arg0, Class301.anInt3972 * 1939408525, Class318.anInt4136 * -988861719, Class454.anInt5207 * -816478179, Class360.anInt4731 * 2144271703, local1, -16777216, -1033482350);
		Class118_Sub1.aClass106_3.method7524(Class454.aClass93_Sub1_Sub8_1.aString101, Class301.anInt3972 * 1939408525 + 3, Class318.anInt4136 * -988861719 + 14, local1, -1, (byte) 0);
		local49 = 0;
		for (local54 = (Class93_Sub1_Sub7) Class454.aClass93_Sub1_Sub8_1.aClass18_10.method246(-232290585); local54 != null; local54 = (Class93_Sub1_Sub7) Class454.aClass93_Sub1_Sub8_1.aClass18_10.method253(1002196344)) {
			local75 = Class318.anInt4136 * -988861719 + 31 + Class454.anInt5197 * -875883057 * local49;
			Class152.method14003(local41, local45, Class301.anInt3972 * 1939408525, Class318.anInt4136 * -988861719, Class454.anInt5207 * -816478179, Class360.anInt4731 * 2144271703, local75, local54, Class118_Sub1.aClass106_3, Class110_Sub3.aClass5_7, -1, -256, (short) -5460);
			local49++;
		}
	}

	@OriginalMember(owner = "client!k", name = "kk", descriptor = "(Lclient!alu;ZZI)V")
	public static void method28200(@OriginalArg(0) Class93_Sub40 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int local4 = arg0.anInt3172 * 1220811495;
		@Pc(10) int local10 = (int) (arg0.aLong232 * -3750704643647536275L);
		arg0.method23981(-1035667234);
		if (arg1) {
			Class535.method30934(local4, -406199094);
		}
		Class361.method27988(local4, -268348105);
		@Pc(25) Class312 local25 = Class659.method32986(local10, -426943126);
		if (local25 != null) {
			Class354.method27789(local25, -1174743804);
		}
		Class74.method1261(local4, (byte) 3);
		if (!arg2 && -703563959 * client.anInt3526 != -1) {
			Class189.method24596(client.anInt3526 * -703563959, 1, 1029282319);
		}
		@Pc(52) Class10 local52 = new Class10(client.aClass16_22);
		for (@Pc(57) Class93_Sub40 local57 = (Class93_Sub40) local52.method160((byte) 118); local57 != null; local57 = (Class93_Sub40) local52.next()) {
			if (!local57.method23982(-1382074122)) {
				local57 = (Class93_Sub40) local52.method160((byte) 89);
				if (local57 == null) {
					break;
				}
			}
			if (local57.anInt3171 * -256237711 == 3) {
				@Pc(83) int local83 = (int) (local57.aLong232 * -3750704643647536275L);
				if (local4 == local83 >>> 16) {
					method28200(local57, true, arg2, 759144924);
				}
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "n", descriptor = "([BLclient!aac;Z)Ljava/lang/Object;")
	@Override
	public Object method28195(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) boolean arg2) {
		return Class694.aClass104_14.method20518(arg1, Class203.method24670(arg0)[0], arg2);
	}

	@OriginalMember(owner = "client!k", name = "e", descriptor = "([BLclient!aac;ZI)Ljava/lang/Object;")
	@Override
	public Object method28196(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		return Class694.aClass104_14.method20518(arg1, Class203.method24670(arg0)[0], arg2);
	}
}
