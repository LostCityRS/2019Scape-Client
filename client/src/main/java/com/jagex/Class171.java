package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!as")
public final class Class171 {

	@OriginalMember(owner = "client!as", name = "e", descriptor = "Lclient!kv;")
	static Class390 aClass390_8;

	@OriginalMember(owner = "client!as", name = "c", descriptor = "Lclient!de;")
	static Class105 aClass105_1;

	@OriginalMember(owner = "client!as", name = "m", descriptor = "I")
	static int anInt3055;

	@OriginalMember(owner = "client!as", name = "f", descriptor = "I")
	static int anInt3056;

	@OriginalMember(owner = "client!as", name = "p", descriptor = "I")
	static int anInt3057;

	@OriginalMember(owner = "client!as", name = "d", descriptor = "Lclient!de;")
	static Class105 aClass105_2;

	@OriginalMember(owner = "client!as", name = "n", descriptor = "Lclient!ky;")
	static Class392 aClass392_8;

	@OriginalMember(owner = "client!as", name = "o", descriptor = "Lclient!afr;")
	static Class105_Sub2 aClass105_Sub2_1;

	@OriginalMember(owner = "client!as", name = "cq", descriptor = "Lclient!eu;")
	static Class106 aClass106_9;

	@OriginalMember(owner = "client!as", name = "l", descriptor = "(Ljava/lang/String;ZLclient!dh;Lclient!eu;Lclient!aac;)V")
	public static void method22027(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class104 arg2, @OriginalArg(3) Class106 arg3, @OriginalArg(4) Class5 arg4) {
		@Pc(8) boolean local8 = !Class93_Sub1_Sub1.aBoolean42 || Class110_Sub23.method8623(-538663862);
		if (!local8) {
			return;
		}
		@Pc(30) int local30;
		@Pc(41) int local41;
		@Pc(48) int local48;
		@Pc(90) int local90;
		if (Class93_Sub1_Sub1.aBoolean42 && local8) {
			@Pc(17) Class5 local17 = Class63.aClass5_2;
			@Pc(23) Class106 local23 = arg2.method20518(local17, aClass105_Sub2_1, true);
			local30 = local17.method55(arg0, 250, null, -1910907678);
			local41 = local17.method49(arg0, 250, local17.anInt7 * -2059082111, null, (byte) 0);
			@Pc(44) int local44 = aClass105_1.method7206();
			local48 = local44 + 4;
			local30 += local48 * 2;
			local41 += local48 * 2;
			if (local30 < anInt3056 * 517811577) {
				local30 = anInt3056 * 517811577;
			}
			if (local41 < Class653.anInt5966 * -1506836959) {
				local41 = Class653.anInt5966 * -1506836959;
			}
			local90 = aClass390_8.method28454(local30, client.anInt3511 * 2040043391, 78279352) + anInt3055 * 1543350707;
			@Pc(102) int local102 = aClass392_8.method28471(local41, client.anInt3512 * -817449061, (short) 255) + Class355.anInt4260 * -246562615;
			arg2.method20511(Class531.aClass105_3, false).method18191(local90 + aClass105_2.method7206(), local102 + aClass105_2.method7198(), local30 - aClass105_2.method7206() * 2, local41 - aClass105_2.method7198() * 2, 1, -1, 0);
			arg2.method20511(aClass105_2, true).method18181(local90, local102);
			aClass105_2.method7168();
			arg2.method20511(aClass105_2, true).method18181(local90 + local30 - local44, local102);
			aClass105_2.method7169();
			arg2.method20511(aClass105_2, true).method18181(local90 + local30 - local44, local41 + local102 - local44);
			aClass105_2.method7168();
			arg2.method20511(aClass105_2, true).method18181(local90, local102 + local41 - local44);
			aClass105_2.method7169();
			arg2.method20511(aClass105_1, true).method18190(local90, local102 + aClass105_2.method7198(), local44, local41 - aClass105_2.method7198() * 2);
			aClass105_1.method7155();
			arg2.method20511(aClass105_1, true).method18190(local90 + aClass105_2.method7206(), local102, local30 - aClass105_2.method7206() * 2, local44);
			aClass105_1.method7155();
			arg2.method20511(aClass105_1, true).method18190(local30 + local90 - local44, local102 + aClass105_2.method7198(), local44, local41 - aClass105_2.method7198() * 2);
			aClass105_1.method7155();
			arg2.method20511(aClass105_1, true).method18190(local90 + aClass105_2.method7206(), local41 + local102 - local44, local30 - aClass105_2.method7206() * 2, local44);
			aClass105_1.method7155();
			local23.method7563(arg0, local48 + local90, local102 + local48, local30 - local48 * 2, local41 - local48 * 2, Class95.anInt320 * 2016248431 | 0xFF000000, -1, 1, 1, 0, null, null, null, 0, 0, (short) 657);
			Class269.method26366(local90, local102, local30, local41, (byte) -31);
		} else {
			local30 = arg4.method55(arg0, 250, null, -1910907678);
			local41 = arg4.method42(arg0, 250, null, -143202029) * 13;
			@Pc(326) byte local326 = 4;
			local48 = local326 + 6;
			local90 = local326 + 6;
			arg2.method20665(local48 - local326, local90 - local326, local326 + local326 + local30, local326 + local41 + local326, -16777216, 0);
			arg2.method20490(local48 - local326, local90 - local326, local326 + local30 + local326, local41 + local326 + local326, -1, 0);
			arg3.method7563(arg0, local48, local90, local30, local41, -1, -1, 1, 1, 0, null, null, null, 0, 0, (short) 657);
			Class269.method26366(local48 - local326, local90 - local326, local30 + local326 + local326, local326 + local326 + local41, (byte) -75);
		}
		if (!arg1) {
			return;
		}
		try {
			arg2.method20513();
			arg2.method20426(-1652286576);
		} catch (@Pc(420) Exception_Sub4 local420) {
		}
	}

	@OriginalMember(owner = "client!as", name = "k", descriptor = "(Lclient!kv;Lclient!ky;IIIIIIIII)V")
	public static void method22028(@OriginalArg(0) Class390 arg0, @OriginalArg(1) Class392 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		aClass390_8 = arg0;
		aClass392_8 = arg1;
		anInt3055 = arg2 * 1158229371;
		Class355.anInt4260 = arg3 * -546678407;
		anInt3056 = arg4 * -2019906359;
		Class653.anInt5966 = arg5 * -1369733663;
		Class160.anInt1962 = arg6 * -765907503;
		Class296.anInt3960 = arg7 * 929248895;
		Class628.anInt5868 = arg8 * -1945750021;
		aClass105_2 = null;
		aClass105_1 = null;
		Class531.aClass105_3 = null;
		Class95.anInt320 = arg9 * 1219501199;
		anInt3057 = arg10 * -443119733;
		Class110_Sub23.method8623(-809031499);
		Class93_Sub1_Sub1.aBoolean42 = true;
	}

	@OriginalMember(owner = "client!as", name = "f", descriptor = "(Lclient!kv;Lclient!ky;IIIIIIIII)V")
	public static void method22029(@OriginalArg(0) Class390 arg0, @OriginalArg(1) Class392 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		aClass390_8 = arg0;
		aClass392_8 = arg1;
		anInt3055 = arg2 * 1158229371;
		Class355.anInt4260 = arg3 * -546678407;
		anInt3056 = arg4 * -2019906359;
		Class653.anInt5966 = arg5 * -1369733663;
		Class160.anInt1962 = arg6 * -765907503;
		Class296.anInt3960 = arg7 * 929248895;
		Class628.anInt5868 = arg8 * -1945750021;
		aClass105_2 = null;
		aClass105_1 = null;
		Class531.aClass105_3 = null;
		Class95.anInt320 = arg9 * 1219501199;
		anInt3057 = arg10 * -443119733;
		Class110_Sub23.method8623(-1807995228);
		Class93_Sub1_Sub1.aBoolean42 = true;
	}

	@OriginalMember(owner = "client!as", name = "w", descriptor = "()Z")
	static boolean method22030() {
		@Pc(1) boolean local1 = true;
		if (aClass105_2 == null) {
			if (Class110_Sub7.aClass497_22.method30235(Class160.anInt1962 * 182602545, -512225963)) {
				aClass105_2 = Class203.method24662(Class110_Sub7.aClass497_22, Class160.anInt1962 * 182602545);
			} else {
				local1 = false;
			}
		}
		if (aClass105_1 == null) {
			if (Class110_Sub7.aClass497_22.method30235(Class296.anInt3960 * -278754945, -512225963)) {
				aClass105_1 = Class203.method24662(Class110_Sub7.aClass497_22, Class296.anInt3960 * -278754945);
			} else {
				local1 = false;
			}
		}
		if (Class531.aClass105_3 == null) {
			if (Class110_Sub7.aClass497_22.method30235(Class628.anInt5868 * 1184402739, -512225963)) {
				Class531.aClass105_3 = Class203.method24662(Class110_Sub7.aClass497_22, Class628.anInt5868 * 1184402739);
			} else {
				local1 = false;
			}
		}
		if (Class63.aClass5_2 == null) {
			if (Class633.aClass497_137.method30235(anInt3057 * 57763875, -512225963)) {
				Class63.aClass5_2 = Class157.aClass462_2.method29422(client.anInterface50_1, anInt3057 * 57763875, -698567722);
			} else {
				local1 = false;
			}
		}
		if (aClass105_Sub2_1 == null) {
			if (Class110_Sub7.aClass497_22.method30235(anInt3057 * 57763875, -512225963)) {
				aClass105_Sub2_1 = (Class105_Sub2) Class203.method24662(Class110_Sub7.aClass497_22, anInt3057 * 57763875);
			} else {
				local1 = false;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!as", name = "tl", descriptor = "(Lclient!yf;S)V")
	static void method22031(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32986(local12, 1804055296);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local16.anInt4021 * -1281935361;
	}

	@OriginalMember(owner = "client!as", name = "anw", descriptor = "(Lclient!yf;I)V")
	static void method22032(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class320.method27333(arg0, arg0.aClass132_Sub1_Sub1_Sub1_4, -1667506080);
	}

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "()V")
	Class171() throws Throwable {
		throw new Error();
	}
}
