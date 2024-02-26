package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class606 {

	@OriginalMember(owner = "client!v", name = "e", descriptor = "I")
	static int anInt5393;

	@OriginalMember(owner = "client!v", name = "f", descriptor = "Lclient!ahd;")
	static Class121_Sub1 aClass121_Sub1_3;

	@OriginalMember(owner = "client!v", name = "pj", descriptor = "I")
	public static int anInt5394;

	@OriginalMember(owner = "client!v", name = "uj", descriptor = "I")
	public static int anInt5395;

	@OriginalMember(owner = "client!v", name = "t", descriptor = "Z")
	static boolean aBoolean931 = false;

	@OriginalMember(owner = "client!v", name = "o", descriptor = "()Z")
	static boolean method32153() {
		return aBoolean931;
	}

	@OriginalMember(owner = "client!v", name = "l", descriptor = "(Lclient!akx;)V")
	static void method32154(@OriginalArg(0) Class80_Sub33 arg0) {
		aClass121_Sub1_3 = new Class121_Sub1(client.aClass454_1);
		aClass121_Sub1_3.method9576(Class358.aClass358_3, 1029802013);
		try {
			@Pc(15) Class123_Sub1 local15 = (Class123_Sub1) aClass121_Sub1_3.method9647(Class340.aClass340_5, false, -298500847);
			@Pc(22) Class20_Sub3 local22 = (Class20_Sub3) aClass121_Sub1_3.method9577(Class347.aClass347_7, false, 1593820257);
			local15.method9811(arg0, -1295862870);
			local22.method16632(new Class466(0.0F, 0.0F, 0.0F), (byte) 17);
			aClass121_Sub1_3.method9588(Class463.method29541(99999.0F, 99999.0F, 99999.0F), (short) 255);
			aClass121_Sub1_3.method9572(Class463.method29541(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), 1210996802);
			aClass121_Sub1_3.method9704(Class463.method29541(99999.0F, 99999.0F, 99999.0F), (byte) 89);
			aClass121_Sub1_3.method9583(Class463.method29541(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), -351030388);
		} catch (@Pc(65) Exception_Sub3 local65) {
		}
		anInt5393 = Class363.aClass152_1.method14615(-1099060548) * -1542004277;
		Class626.anInt5539 = Class363.aClass152_1.method14598(1494080893) * -1297226297;
		aBoolean931 = true;
	}

	@OriginalMember(owner = "client!v", name = "m", descriptor = "()V")
	static void method32155() {
		aClass121_Sub1_3 = null;
		aBoolean931 = false;
	}

	@OriginalMember(owner = "client!v", name = "i", descriptor = "()V")
	static void method32156() {
		aClass121_Sub1_3 = null;
		aBoolean931 = false;
	}

	@OriginalMember(owner = "client!v", name = "g", descriptor = "()V")
	static void method32157() {
		aClass121_Sub1_3 = null;
		aBoolean931 = false;
	}

	@OriginalMember(owner = "client!v", name = "j", descriptor = "()V")
	static void method32158() {
		@Pc(4) Class123_Sub1 local4 = (Class123_Sub1) aClass121_Sub1_3.method9603(-1551497806);
		@Pc(9) Class20_Sub3 local9 = (Class20_Sub3) aClass121_Sub1_3.method9693(1680926764);
		@Pc(13) Class463 local13 = local4.method20516(1436604136);
		@Pc(17) Class466 local17 = local9.method16660((byte) -52);
		if (client.aClass327_7 != null) {
			@Pc(24) int local24 = client.aClass327_7.anInt4103 * 1892149809;
			@Pc(29) int local29 = client.aClass327_7.anInt4104 * 1990157877;
			@Pc(31) float local31 = 1000.0F;
			@Pc(43) float local43 = (float) (Math.atan((double) ((float) local24 / 2.0F / local31)) * 2.0D);
			@Pc(55) float local55 = (float) (Math.atan((double) ((float) local29 / 2.0F / local31)) * 2.0D);
			try {
				aClass121_Sub1_3.method9645(local43, local55, -1873957713);
			} catch (@Pc(62) Exception_Sub3 local62) {
			}
		}
		if (Class363.aClass152_1.method14594(-1626526275)) {
			@Pc(68) Class466 local68 = Class466.method29640();
			local68.method29645(1.0F, 0.0F, 0.0F, (float) (Class363.aClass152_1.method14598(-788610396) - Class626.anInt5539 * 1625967607) / 200.0F);
			local17.method29660(local68);
			@Pc(91) Class463 local91 = Class463.method29541(0.0F, 1.0F, 0.0F);
			local91.method29500(local17);
			@Pc(96) Class466 local96 = Class466.method29640();
			local96.method29648(local91, (float) (anInt5393 * -947635229 - Class363.aClass152_1.method14615(-1463645110)) / 200.0F);
			local17.method29660(local96);
			local9.method16632(local17, (byte) 9);
		}
		anInt5393 = Class363.aClass152_1.method14615(-1715245015) * -1542004277;
		Class626.anInt5539 = Class363.aClass152_1.method14598(1942793319) * -1297226297;
		local17.method29701();
		@Pc(140) Class463 local140;
		if (Class544.aClass155_1.method15048(98, (short) -20627)) {
			local140 = Class463.method29541(0.0F, 0.0F, 25.0F);
			local140.method29500(local17);
			local140.aFloat295 *= -1.0F;
			local13.method29483(local140);
		}
		if (Class544.aClass155_1.method15048(99, (short) 5308)) {
			local140 = Class463.method29541(0.0F, 0.0F, -25.0F);
			local140.method29500(local17);
			local140.aFloat295 *= -1.0F;
			local13.method29483(local140);
		}
		if (Class544.aClass155_1.method15048(96, (short) 6292)) {
			local140 = Class463.method29541(-25.0F, 0.0F, 0.0F);
			local140.method29500(local17);
			local140.aFloat295 *= -1.0F;
			local13.method29483(local140);
		}
		if (Class544.aClass155_1.method15048(97, (short) -3043)) {
			local140 = Class463.method29541(25.0F, 0.0F, 0.0F);
			local140.method29500(local17);
			local140.aFloat295 *= -1.0F;
			local13.method29483(local140);
		}
		@Pc(232) Class80_Sub33 local232 = new Class80_Sub33(0, (int) local13.aFloat297, (int) local13.aFloat295, (int) local13.aFloat296);
		local4.method9811(local232, -119326604);
		@Pc(240) Class626 local240 = client.aClass539_1.method30893((byte) -41);
		@Pc(247) int local247 = local240.anInt5540 * -390642507 << 9;
		@Pc(254) int local254 = local240.anInt5537 * -894305615 << 9;
		aClass121_Sub1_3.method9675(0.02F, client.aClass539_1.method30910((byte) -90).anIntArrayArrayArray14, client.aClass539_1.method30903(-463929735), local247, local254, (byte) -111);
	}

	@OriginalMember(owner = "client!v", name = "ds", descriptor = "(Lclient!yp;I)V")
	static void method32159(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2034663826);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class167.method17874(local16, local22, arg0, (byte) 6);
	}

	@OriginalMember(owner = "client!v", name = "alg", descriptor = "(Lclient!yp;B)V")
	static void method32160(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		if (Class13.aBoolean5 && Class411.aFrame2 != null) {
			Class126.method20383(Class703.aClass80_Sub37_49.aClass165_Sub18_1.method16183((short) 32767), -1, -1, false, 1615516245);
		}
		@Pc(26) String local26 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		@Pc(44) boolean local44 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581] == 1;
		@Pc(54) String local54 = Class503.method30453(-908601258) + local26;
		Class654.method33171(local54, local44, client.aBoolean734, 483094175);
	}

	@OriginalMember(owner = "client!v", name = "bey", descriptor = "(Lclient!yp;B)V")
	static void method32161(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= 2036747717;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(17) Class88 local17 = Class313.method27486(local13, 1974357676);
		if (local17 == null) {
			throw new RuntimeException();
		}
		Class245.aList4 = local17.method1783(0, 181440089);
		if (Class245.aList4 != null) {
			client.anInt3451 = local13 * 2033239385;
			Class411.anIterator2 = Class245.aList4.iterator();
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class245.aList4.size();
		}
	}

	@OriginalMember(owner = "client!v", name = "kw", descriptor = "(Lclient!hx;I)V")
	static void method32162(@OriginalArg(0) Class327 arg0, @OriginalArg(1) int arg1) {
		if (!client.aBoolean728) {
			return;
		}
		if (arg0.anObjectArray27 != null) {
			@Pc(14) Class327 local14 = Class369.method28340(Class86.anInt284 * 531357219, client.anInt3526 * 1831183447, 1255454629);
			if (local14 != null) {
				@Pc(21) Class80_Sub42 local21 = new Class80_Sub42();
				local21.aClass327_3 = arg0;
				local21.aClass327_4 = local14;
				local21.anObjectArray4 = arg0.anObjectArray27;
				Class279.method26847(local21, -205858253);
			}
		}
		@Pc(40) Class80_Sub31 local40 = Class623.method32440(Class443.aClass443_60, client.aClass75_1.aClass22_1, -191270971);
		local40.aPacketBit_2.p4_alt2(arg0.anInt4087 * -2053489901);
		local40.aPacketBit_2.p2_alt2(arg0.anInt4167 * 1052460537);
		local40.aPacketBit_2.p2_alt3(arg0.anInt4094 * 2071556223);
		local40.aPacketBit_2.p2_alt3(client.anInt3526 * 1831183447);
		local40.aPacketBit_2.p4_alt1(Class86.anInt284 * 531357219);
		local40.aPacketBit_2.p2(client.anInt3527 * 206551609);
		client.aClass75_1.method1325(local40, (byte) -127);
	}

	@OriginalMember(owner = "client!v", name = "lv", descriptor = "(B)V")
	static void method32163(@OriginalArg(0) byte arg0) {
		if (client.anInt3460 * 1849344509 == -1) {
			return;
		}
		@Pc(9) int local9 = Class363.aClass152_1.method14615(-1795664416);
		@Pc(13) int local13 = Class363.aClass152_1.method14598(1825024862);
		@Pc(18) Class80_Sub17 local18 = (Class80_Sub17) client.aClass8_45.method247(129206984);
		if (local18 != null) {
			local9 = local18.method23451(44294968);
			local13 = local18.method23454(-795033645);
		}
		if (client.aClass327_8 != null && client.aClass327_9 == Class45.aClass327_5) {
			client.aBoolean739 = true;
			client.anInt3504 = 0;
			client.anInt3490 = 0;
			client.anInt3505 = Class80_Sub1_Sub1.anInt254 * -948363655;
			client.anInt3434 = Class80_Sub25.anInt1627 * 2130188529;
		}
		Class71.method18184(null, client.anInt3460 * 1849344509, 0, 0, Class80_Sub1_Sub1.anInt254 * -255202897, Class80_Sub25.anInt1627 * 167687103, 0, 0, local9, local13, 2018242369);
		if (Class492.aClass327_12 != null) {
			Class671.method33521(local9, local13, -702676384);
		}
	}

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
	Class606() throws Throwable {
		throw new Error();
	}
}
