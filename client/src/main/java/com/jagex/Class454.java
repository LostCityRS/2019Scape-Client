package com.jagex;

import java.awt.Canvas;
import java.util.Stack;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class454 implements Interface29 {

	@OriginalMember(owner = "client!o", name = "y", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas6;

	@OriginalMember(owner = "client!o", name = "j", descriptor = "(Ljava/lang/String;I)V")
	public static void method29302(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		Class149.aString48 = arg0;
		Class149.anInt1523 = Class149.aString48.length() * -1734720461;
	}

	@OriginalMember(owner = "client!o", name = "l", descriptor = "([Lclient!hx;I)V")
	public static void method29303(@OriginalArg(0) Class327[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class327 local9 = arg0[local1];
			if (local9.anObjectArray11 != null) {
				@Pc(16) Class80_Sub42 local16 = new Class80_Sub42();
				local16.aClass327_3 = local9;
				local16.anObjectArray4 = local9.anObjectArray11;
				Class144.method11993(local16, 5000000, -764625506);
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "zz", descriptor = "(Lclient!yp;I)V")
	static void method29304(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		@Pc(27) String local27 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		@Pc(33) Class80_Sub31 local33 = Class623.method32440(Class443.aClass443_98, client.aClass75_2.aClass22_1, -191270971);
		local33.aClass80_Sub36_Sub1_2.method23155(Class350.method28013(local13, (short) 16383) + Class350.method28013(local27, (short) 16383), (byte) -48);
		local33.aClass80_Sub36_Sub1_2.method23165(local13, 1684301764);
		local33.aClass80_Sub36_Sub1_2.method23165(local27, 1951451411);
		client.aClass75_2.method1325(local33, (byte) -119);
	}

	@OriginalMember(owner = "client!o", name = "t", descriptor = "(II)Z")
	public static boolean method29305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class251.anInt3880 * -1561586921 != arg0 || Class235.aClass252_1 == null) {
			Class662.method33334(-651882577);
			Class235.aClass252_1 = Class252.aClass252_4;
			Class251.anInt3880 = arg0 * -1851501401;
		}
		@Pc(39) int local39;
		if (Class252.aClass252_4 == Class235.aClass252_1) {
			@Pc(23) byte[] local23 = Class110_Sub1.aClass480_17.method29926(arg0, 1472047355);
			if (local23 == null) {
				return false;
			}
			@Pc(32) Class80_Sub36 local32 = new Class80_Sub36(local23);
			Class614.method32274(local32, (byte) 65);
			local39 = local32.method23362(-1972610165);
			@Pc(41) int local41;
			for (local41 = 0; local41 < local39; local41++) {
				Class251.aClass8_50.method232(new Class80_Sub30(local32), 1235286495);
			}
			local41 = local32.method23195(1819265938);
			Class251.aClass250Array1 = new Class250[local41];
			@Pc(62) int local62;
			for (local62 = 0; local62 < local41; local62++) {
				Class251.aClass250Array1[local62] = new Class250(local32);
			}
			local62 = local32.method23195(1803527715);
			Class251.aClass254Array1 = new Class254[local62];
			@Pc(83) int local83;
			for (local83 = 0; local83 < local62; local83++) {
				Class251.aClass254Array1[local83] = new Class254(local32, local83);
			}
			local83 = local32.method23195(1911533844);
			Class700.aClass249Array1 = new Class249[local83];
			@Pc(105) int local105;
			for (local105 = 0; local105 < local83; local105++) {
				Class700.aClass249Array1[local105] = new Class249(local32);
			}
			local105 = local32.method23195(1708212627);
			Class251.aClass239Array1 = new Class239[local105];
			@Pc(126) int local126;
			for (local126 = 0; local126 < local105; local126++) {
				Class251.aClass239Array1[local126] = new Class239(local32);
			}
			local126 = local32.method23195(1755781538);
			Class251.aClass103Array1 = new Class103[local126];
			for (@Pc(147) int local147 = 0; local147 < local126; local147++) {
				Class251.aClass103Array1[local147] = Class98.method2707(local32, (byte) 14);
			}
			Class235.aClass252_1 = Class252.aClass252_3;
		}
		if (Class235.aClass252_1 == Class252.aClass252_3) {
			@Pc(165) boolean local165 = true;
			@Pc(167) Class254[] local167 = Class251.aClass254Array1;
			for (local39 = 0; local39 < local167.length; local39++) {
				@Pc(177) Class254 local177 = local167[local39];
				if (!local177.method26389(16711935)) {
					local165 = false;
				}
			}
			@Pc(187) Class103[] local187 = Class251.aClass103Array1;
			for (local39 = 0; local39 < local187.length; local39++) {
				@Pc(197) Class103 local197 = local187[local39];
				if (!local197.method19201(-58481742)) {
					local165 = false;
				}
			}
			@Pc(207) Class249[] local207 = Class700.aClass249Array1;
			for (local39 = 0; local39 < local207.length; local39++) {
				@Pc(217) Class249 local217 = local207[local39];
				if (!local217.method26343(1901969671)) {
					local165 = false;
				}
			}
			if (!local165) {
				return false;
			}
			Class235.aClass252_1 = Class252.aClass252_2;
		}
		return true;
	}

	@OriginalMember(owner = "client!o", name = "x", descriptor = "(Lclient!di;Lclient!hx;III)V")
	static void method29306(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class327 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 == null) {
			return;
		}
		arg0.method20744();
		@Pc(6) Class323 local6 = null;
		@Pc(8) Class98 local8 = null;
		if (arg1.anInt4135 * 710314345 == 5) {
			local6 = arg1.method27643(arg0, 1477428010);
			if (local6 == null) {
				return;
			}
			local8 = local6.aClass98_1;
			if (local6.anInt4066 * 1560847089 != arg1.anInt4103 * 1892149809 || arg1.anInt4104 * 1990157877 != local6.anInt4068 * 1138267573) {
				throw new IllegalStateException("");
			}
		}
		arg0.method20986(arg2, arg3, arg1.anInt4103 * 1892149809 + arg2, arg1.anInt4104 * 1990157877 + arg3);
		if (Class27.anInt86 * 104994417 == 2 || Class27.anInt86 * 104994417 == 5 || Class86.aClass99_2 == null) {
			if (local8 == null) {
				return;
			}
			arg0.method20748(-16777216, local8, arg2, arg3);
			return;
		}
		arg0.method20707(Class27.anIntArray7);
		arg0.method20705();
		@Pc(87) Class626 local87 = client.aClass539_1.method30893((byte) -26);
		@Pc(96) int local96;
		@Pc(100) int local100;
		@Pc(106) int local106;
		@Pc(108) int local108;
		if (Class368.anInt4502 * -1583611537 == 4) {
			local96 = client.anInt3479 * -1853431703;
			local100 = client.anInt3480 * 608799169;
			local106 = (int) -client.aFloat255 & 0x3FFF;
			local108 = 4096;
		} else {
			@Pc(113) Class463 local113 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method24552().aClass463_61;
			local96 = (int) local113.aFloat297;
			local100 = (int) local113.aFloat296;
			if (Class368.anInt4502 * -1583611537 == 3) {
				local106 = (int) -((double) Class160.aClass121_Sub1_2.method9648(-2051110487) * 2607.5945876176133D) + client.anInt3474 * -1918431893 & 0x3FFF;
			} else {
				local106 = (int) -client.aFloat255 + client.anInt3474 * -1918431893 & 0x3FFF;
			}
			local108 = 4096 - client.anInt3476 * 1807770768;
		}
		@Pc(164) int local164 = local96 / 128 + 48;
		@Pc(176) int local176 = client.aClass539_1.method31011(-1658864843) * 4 + 48 - local100 / 128;
		if (local8 == null) {
			Class86.aClass99_2.method18237((float) (arg1.anInt4103 * 1892149809) / 2.0F + (float) arg2, (float) arg3 + (float) (arg1.anInt4104 * 1990157877) / 2.0F, (float) local164, (float) local176, local108, local106 << 2, 1, -1, 1);
		} else {
			Class86.aClass99_2.method18239((float) (arg1.anInt4103 * 1892149809) / 2.0F + (float) arg2, (float) (arg1.anInt4104 * 1990157877) / 2.0F + (float) arg3, (float) local164, (float) local176, local108, local106 << 2, local8, arg2, arg3);
		}
		@Pc(250) Class587 local250 = client.aClass539_1.method30896(-1856823817);
		@Pc(263) int local263;
		@Pc(277) int local277;
		@Pc(289) int local289;
		@Pc(299) int local299;
		@Pc(309) int local309;
		for (@Pc(255) Class80_Sub20 local255 = (Class80_Sub20) Class27.aClass8_2.method247(129206984); local255 != null; local255 = (Class80_Sub20) Class27.aClass8_2.method237(-708134248)) {
			local263 = local255.anInt1588 * 701000167;
			local277 = (local250.anIntArray479[local263] >> 14 & 0x3FFF) - local87.anInt5540 * -390642507;
			local289 = (local250.anIntArray479[local263] & 0x3FFF) - local87.anInt5537 * -894305615;
			local299 = local277 * 4 + 2 - local96 / 128;
			local309 = local289 * 4 + 2 - local100 / 128;
			Class669.method33495(arg0, local8, arg1, arg2, arg3, local299, local309, local250.anIntArray480[local263], -2143012646);
		}
		for (local263 = 0; local263 < Class27.anInt87 * -1449044929; local263++) {
			local277 = Class27.anIntArray10[local263] * 4 + 2 - local96 / 128;
			local289 = Class27.anIntArray8[local263] * 4 + 2 - local100 / 128;
			@Pc(369) Class625 local369 = (Class625) client.aClass539_1.method30905(718182229).method18054(Class27.anIntArray9[local263], 420563367);
			if (local369.anIntArray503 != null) {
				local369 = local369.method32456(Class672.aClass134_1, Class672.aClass134_1, 747494840);
				if (local369 == null || local369.anInt5502 * -1477183523 == -1) {
					continue;
				}
			}
			Class669.method33495(arg0, local8, arg1, arg2, arg3, local277, local289, local369.anInt5502 * -1477183523, -2144911481);
		}
		for (@Pc(407) Class80_Sub4 local407 = (Class80_Sub4) client.aClass24_22.method580((byte) -73); local407 != null; local407 = (Class80_Sub4) client.aClass24_22.method566((byte) 7)) {
			local277 = (int) (local407.aLong338 * 3209506792906532031L >> 28 & 0x3L);
			if (local277 == Class27.anInt83 * -1955503601) {
				local289 = (int) (local407.aLong338 * 3209506792906532031L & 0x3FFFL) - local87.anInt5540 * -390642507;
				local299 = (int) (local407.aLong338 * 3209506792906532031L >> 14 & 0x3FFFL) - local87.anInt5537 * -894305615;
				local309 = local289 * 4 + 2 - local96 / 128;
				@Pc(473) int local473 = local299 * 4 + 2 - local100 / 128;
				Class174.method24632(arg1, local8, arg2, arg3, local309, local473, Class697.aClass99Array9[0], -1442896750);
			}
		}
		Class75.method1343(arg0, local96, local100, arg1, local8, arg2, arg3, 614914721);
		Class384.method28593(local96, local100, arg1, local8, arg2, arg3, 1859493658);
		Class239.method26216(local96, local100, arg1, local6, arg2, arg3, (byte) 0);
		if (Class368.anInt4502 * -1583611537 != 4) {
			if (Class27.anInt85 * 764713663 != -1) {
				local263 = Class27.anInt85 * -1236112644 + 2 - local96 / 128 + (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method18966((byte) -106) - 1) * 2;
				local277 = Class27.anInt88 * 1044257452 + 2 - local100 / 128 + (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method18966((byte) -24) - 1) * 2;
				Class165.method16960(arg1, local8, arg2 - Class475.anInt4961 * -1285085079, arg3 - Class148.anInt1470 * -1407629571, local263, local277, Class250.aClass99Array3[Class27.aBoolean15 ? 1 : 0], 100.0D, Class313.aClass313_2, Class309.aClass309_1, (byte) 34);
			}
			if (!Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.aClass668_1.method33486((short) 12655)) {
				arg0.method20716(arg2 + arg1.anInt4103 * 1892149809 / 2 - 1, arg3 + arg1.anInt4104 * 1990157877 / 2 - 1, 3, 3, -1, (byte) 73);
			}
		}
		arg0.method20706(Class27.anIntArray7[0], Class27.anIntArray7[1], Class27.anIntArray7[2], Class27.anIntArray7[3]);
	}

	@OriginalMember(owner = "client!o", name = "t", descriptor = "(ZI)Lclient!tj;")
	public static Class573 method29307(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Stack local2 = Class573.aStack1;
		synchronized (Class573.aStack1) {
			@Pc(10) Class573 local10;
			if (Class573.aStack1.isEmpty()) {
				local10 = new Class573();
			} else {
				local10 = (Class573) Class573.aStack1.pop();
			}
			local10.aBoolean919 = arg0;
			return local10;
		}
	}

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
	Class454() {
	}

	@OriginalMember(owner = "client!o", name = "f", descriptor = "(Lclient!jk;I)Lclient!jr;")
	@Override
	public Interface31 method29300(@OriginalArg(0) Class362 arg0, @OriginalArg(1) int arg1) {
		if (Class362.aClass362_1 == arg0) {
			return client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[arg1];
		}
		if (arg0 == Class362.aClass362_2) {
			@Pc(15) Class80_Sub19 local15 = (Class80_Sub19) client.aClass24_18.method560((long) arg1);
			if (local15 != null) {
				return (Interface31) local15.anObject5;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!o", name = "t", descriptor = "(Lclient!jk;II)Lclient!jr;")
	@Override
	public Interface31 method29301(@OriginalArg(0) Class362 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Class362.aClass362_1 == arg0) {
			return client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[arg1];
		}
		if (arg0 == Class362.aClass362_2) {
			@Pc(15) Class80_Sub19 local15 = (Class80_Sub19) client.aClass24_18.method560((long) arg1);
			if (local15 != null) {
				return (Interface31) local15.anObject5;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!o", name = "e", descriptor = "(Lclient!jk;I)Lclient!jr;")
	@Override
	public Interface31 method29299(@OriginalArg(0) Class362 arg0, @OriginalArg(1) int arg1) {
		if (Class362.aClass362_1 == arg0) {
			return client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[arg1];
		}
		if (arg0 == Class362.aClass362_2) {
			@Pc(15) Class80_Sub19 local15 = (Class80_Sub19) client.aClass24_18.method560((long) arg1);
			if (local15 != null) {
				return (Interface31) local15.anObject5;
			}
		}
		return null;
	}
}
