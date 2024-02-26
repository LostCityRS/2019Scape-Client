package com.jagex;

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class499 {

	@OriginalMember(owner = "client!q", name = "o", descriptor = "Lclient!zo;")
	static Class713 aClass713_1;

	@OriginalMember(owner = "client!q", name = "f", descriptor = "[I")
	static int[] anIntArray464;

	@OriginalMember(owner = "client!q", name = "l", descriptor = "Lclient!m;")
	static Class411 aClass411_3;

	@OriginalMember(owner = "client!q", name = "g", descriptor = "Lclient!zj;")
	static Class708 aClass708_1;

	@OriginalMember(owner = "client!q", name = "t", descriptor = "I")
	static final int anInt5035 = 3;

	@OriginalMember(owner = "client!q", name = "i", descriptor = "Lclient!zi;")
	static Class707 aClass707_1;

	@OriginalMember(owner = "client!q", name = "og", descriptor = "Ljava/lang/String;")
	static String aString215;

	@OriginalMember(owner = "client!q", name = "e", descriptor = "I")
	static int anInt5033 = 0;

	@OriginalMember(owner = "client!q", name = "u", descriptor = "I")
	static int anInt5034 = 0;

	@OriginalMember(owner = "client!q", name = "az", descriptor = "(Lclient!zo;)V")
	static void method30362(@OriginalArg(0) Class713 arg0) {
		aClass713_1 = arg0;
	}

	@OriginalMember(owner = "client!q", name = "aq", descriptor = "(Ljava/lang/String;)V")
	public static void method30363(@OriginalArg(0) String arg0) {
		if (client.anInt3433 * 1994758437 != 0) {
			return;
		}
		@Pc(10) Class80_Sub31 local10 = Class623.method32440(Class443.aClass443_97, client.aClass75_2.aClass22_1, -191270971);
		local10.aClass80_Sub36_Sub1_2.method23155(0, (byte) -23);
		@Pc(21) int local21 = local10.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821;
		local10.aClass80_Sub36_Sub1_2.method23165(arg0, 2110797765);
		local10.aClass80_Sub36_Sub1_2.anInt3152 += -1350670595;
		local10.aClass80_Sub36_Sub1_2.method23190(anIntArray464, local21, local10.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821, (byte) 8);
		local10.aClass80_Sub36_Sub1_2.method23170(local10.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821 - local21, -377880512);
		client.aClass75_2.method1325(local10, (byte) -100);
		Class323.aClass711_1 = Class711.aClass711_3;
	}

	@OriginalMember(owner = "client!q", name = "y", descriptor = "()V")
	public static void method30364() {
		if (1994758437 * client.anInt3433 == 4 && (!Class353.method28071(2100096287) && !Class684.method36790((byte) 17))) {
			Class604.method32148(12, 1528296663);
		}
	}

	@OriginalMember(owner = "client!q", name = "ah", descriptor = "()Lclient!zm;")
	public static Class711 method30365() {
		return Class323.aClass711_1 == null ? Class711.aClass711_6 : Class323.aClass711_1;
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "()V")
	static void method30366() {
		aClass411_3 = Class411.aClass411_2;
		aClass708_1 = Class708.aClass708_4;
		aClass707_1 = Class707.aClass707_13;
		Class323.aClass711_1 = Class711.aClass711_6;
		Class138.aClass710_3 = Class710.aClass710_6;
		aClass713_1 = Class713.aClass713_5;
		Class2_Sub1.aString13 = null;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "()V")
	static void method30367() {
		aClass411_3 = Class411.aClass411_2;
		aClass708_1 = Class708.aClass708_4;
		aClass707_1 = Class707.aClass707_13;
		Class323.aClass711_1 = Class711.aClass711_6;
		Class138.aClass710_3 = Class710.aClass710_6;
		aClass713_1 = Class713.aClass713_5;
		Class2_Sub1.aString13 = null;
	}

	@OriginalMember(owner = "client!q", name = "ax", descriptor = "()V")
	static void method30368() {
		aClass411_3 = Class411.aClass411_2;
		aClass708_1 = Class708.aClass708_4;
		aClass707_1 = Class707.aClass707_13;
		Class323.aClass711_1 = Class711.aClass711_6;
		Class138.aClass710_3 = Class710.aClass710_6;
		aClass713_1 = Class713.aClass713_5;
		Class2_Sub1.aString13 = null;
	}

	@OriginalMember(owner = "client!q", name = "ay", descriptor = "()Z")
	static boolean method30369() {
		return aClass411_3 != null;
	}

	@OriginalMember(owner = "client!q", name = "ai", descriptor = "()Z")
	static boolean method30370() {
		return aClass411_3 != null;
	}

	@OriginalMember(owner = "client!q", name = "ba", descriptor = "()V")
	static void method30371() {
		client.aClass75_2.method1319((short) 468);
		if (anInt5034 * 1504780479 < 2) {
			Class47.aClass28_3.method656((byte) -1);
			anInt5033 = 0;
			anInt5034 += -516796609;
			aClass411_3 = Class411.aClass411_2;
		} else {
			aClass411_3 = null;
			aClass708_1 = Class708.aClass708_6;
			Class604.method32148(4, -1673818105);
		}
	}

	@OriginalMember(owner = "client!q", name = "ao", descriptor = "(Ljava/lang/String;)V")
	public static void method30372(@OriginalArg(0) String arg0) {
		if (client.anInt3433 * 1994758437 != 0) {
			return;
		}
		@Pc(10) Class80_Sub31 local10 = Class623.method32440(Class443.aClass443_38, client.aClass75_2.aClass22_1, -191270971);
		local10.aClass80_Sub36_Sub1_2.method23154(0, 1275868335);
		@Pc(21) int local21 = local10.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821;
		local10.aClass80_Sub36_Sub1_2.method23165(arg0, 2046499842);
		local10.aClass80_Sub36_Sub1_2.anInt3152 += -1350670595;
		local10.aClass80_Sub36_Sub1_2.method23190(anIntArray464, local21, local10.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821, (byte) 8);
		local10.aClass80_Sub36_Sub1_2.method23171(local10.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821 - local21, (byte) 78);
		client.aClass75_2.method1325(local10, (byte) -5);
		aClass713_1 = Class713.aClass713_3;
	}

	@OriginalMember(owner = "client!q", name = "aj", descriptor = "()V")
	public static void method30373() {
		if (client.anInt3433 * 1994758437 == 0) {
			@Pc(11) Class80_Sub31 local11 = Class623.method32440(Class443.aClass443_9, client.aClass75_2.aClass22_1, -191270971);
			client.aClass75_2.method1325(local11, (byte) -63);
			Class138.aClass710_3 = Class710.aClass710_4;
			Class2_Sub1.aString13 = null;
		}
	}

	@OriginalMember(owner = "client!q", name = "ag", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;)V")
	public static void method30374(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) String arg4) {
		if (client.anInt3433 * 1994758437 != 0) {
			return;
		}
		@Pc(10) Class80_Sub31 local10 = Class623.method32440(Class443.aClass443_24, client.aClass75_2.aClass22_1, -191270971);
		local10.aClass80_Sub36_Sub1_2.method23155(0, (byte) -30);
		@Pc(21) int local21 = local10.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821;
		local10.aClass80_Sub36_Sub1_2.method23165(arg0, 2041251310);
		local10.aClass80_Sub36_Sub1_2.method23165(arg1, 1932410562);
		local10.aClass80_Sub36_Sub1_2.method23154(arg2, 1275868335);
		local10.aClass80_Sub36_Sub1_2.method23154(arg3 ? 1 : 0, 1275868335);
		local10.aClass80_Sub36_Sub1_2.method23165(arg4, 2106454998);
		local10.aClass80_Sub36_Sub1_2.anInt3152 += -1350670595;
		local10.aClass80_Sub36_Sub1_2.method23190(anIntArray464, local21, local10.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821, (byte) 8);
		local10.aClass80_Sub36_Sub1_2.method23170(local10.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821 - local21, -377880512);
		client.aClass75_2.method1325(local10, (byte) -45);
		if (arg2 < 13) {
			client.aBoolean747 = true;
			Class480.method30005((byte) 12);
		}
		aClass707_1 = Class707.aClass707_20;
	}

	@OriginalMember(owner = "client!q", name = "bn", descriptor = "(Lclient!aku;)[I")
	static int[] method30375(@OriginalArg(0) Class80_Sub31 arg0) {
		@Pc(4) Class80_Sub36 local4 = new Class80_Sub36(518);
		@Pc(7) int[] local7 = new int[4];
		@Pc(9) int local9;
		for (local9 = 0; local9 < 4; local9++) {
			local7[local9] = (int) (Math.random() * 9.9999999E7D);
		}
		local4.method23154(10, 1275868335);
		local4.method23345(local7[0], (byte) 48);
		local4.method23345(local7[1], (byte) 120);
		local4.method23345(local7[2], (byte) 48);
		local4.method23345(local7[3], (byte) 48);
		for (local9 = 0; local9 < 10; local9++) {
			local4.method23345((int) (Math.random() * 9.9999999E7D), (byte) 121);
		}
		local4.method23155((int) (Math.random() * 9.9999999E7D), (byte) -20);
		local4.method23206(Class174.aBigInteger1, Class174.aBigInteger2, (byte) 0);
		arg0.aClass80_Sub36_Sub1_2.method23168(local4.aByteArray61, 0, local4.anInt3152 * -1380987821, (byte) 65);
		return local7;
	}

	@OriginalMember(owner = "client!q", name = "al", descriptor = "(I)V")
	public static void method30376(@OriginalArg(0) int arg0) {
		if (client.anInt3433 * 1994758437 == 0) {
			@Pc(11) Class80_Sub31 local11 = Class623.method32440(Class443.aClass443_19, client.aClass75_2.aClass22_1, -191270971);
			local11.aClass80_Sub36_Sub1_2.method23154(arg0, 1275868335);
			client.aClass75_2.method1325(local11, (byte) -96);
		}
	}

	@OriginalMember(owner = "client!q", name = "aa", descriptor = "(Lclient!zi;)V")
	static void method30377(@OriginalArg(0) Class707 arg0) {
		aClass707_1 = arg0;
	}

	@OriginalMember(owner = "client!q", name = "af", descriptor = "()Lclient!zm;")
	public static Class711 method30378() {
		return Class323.aClass711_1 == null ? Class711.aClass711_6 : Class323.aClass711_1;
	}

	@OriginalMember(owner = "client!q", name = "am", descriptor = "()Lclient!zm;")
	public static Class711 method30379() {
		return Class323.aClass711_1 == null ? Class711.aClass711_6 : Class323.aClass711_1;
	}

	@OriginalMember(owner = "client!q", name = "ak", descriptor = "()Lclient!zm;")
	public static Class711 method30380() {
		return Class323.aClass711_1 == null ? Class711.aClass711_6 : Class323.aClass711_1;
	}

	@OriginalMember(owner = "client!q", name = "at", descriptor = "()Lclient!zl;")
	public static Class710 method30381() {
		return Class138.aClass710_3 == null ? Class710.aClass710_6 : Class138.aClass710_3;
	}

	@OriginalMember(owner = "client!q", name = "bt", descriptor = "()V")
	static void method30382() {
		client.aClass75_2.method1319((short) 468);
		if (anInt5034 * 1504780479 < 2) {
			Class47.aClass28_3.method656((byte) -69);
			anInt5033 = 0;
			anInt5034 += -516796609;
			aClass411_3 = Class411.aClass411_2;
		} else {
			aClass411_3 = null;
			aClass708_1 = Class708.aClass708_6;
			Class604.method32148(4, -1678420607);
		}
	}

	@OriginalMember(owner = "client!q", name = "av", descriptor = "()Ljava/lang/String;")
	public static String method30383() {
		return Class2_Sub1.aString13;
	}

	@OriginalMember(owner = "client!q", name = "ac", descriptor = "()V")
	public static void method30384() {
		if (client.anInt3433 * 1994758437 == 0) {
			@Pc(11) Class80_Sub31 local11 = Class623.method32440(Class443.aClass443_9, client.aClass75_2.aClass22_1, -191270971);
			client.aClass75_2.method1325(local11, (byte) -9);
			Class138.aClass710_3 = Class710.aClass710_4;
			Class2_Sub1.aString13 = null;
		}
	}

	@OriginalMember(owner = "client!q", name = "ad", descriptor = "()Lclient!zl;")
	public static Class710 method30385() {
		return Class138.aClass710_3 == null ? Class710.aClass710_6 : Class138.aClass710_3;
	}

	@OriginalMember(owner = "client!q", name = "ae", descriptor = "(Lclient!zi;)V")
	static void method30386(@OriginalArg(0) Class707 arg0) {
		aClass707_1 = arg0;
	}

	@OriginalMember(owner = "client!q", name = "ap", descriptor = "(Lclient!zi;)V")
	static void method30387(@OriginalArg(0) Class707 arg0) {
		aClass707_1 = arg0;
	}

	@OriginalMember(owner = "client!q", name = "ar", descriptor = "(Lclient!zm;)V")
	static void method30388(@OriginalArg(0) Class711 arg0) {
		Class323.aClass711_1 = arg0;
	}

	@OriginalMember(owner = "client!q", name = "au", descriptor = "(Lclient!zm;)V")
	static void method30389(@OriginalArg(0) Class711 arg0) {
		Class323.aClass711_1 = arg0;
	}

	@OriginalMember(owner = "client!q", name = "ab", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;)V")
	public static void method30390(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) String arg4) {
		if (client.anInt3433 * 1994758437 != 0) {
			return;
		}
		@Pc(10) Class80_Sub31 local10 = Class623.method32440(Class443.aClass443_24, client.aClass75_2.aClass22_1, -191270971);
		local10.aClass80_Sub36_Sub1_2.method23155(0, (byte) -45);
		@Pc(21) int local21 = local10.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821;
		local10.aClass80_Sub36_Sub1_2.method23165(arg0, 2113554560);
		local10.aClass80_Sub36_Sub1_2.method23165(arg1, 2005733276);
		local10.aClass80_Sub36_Sub1_2.method23154(arg2, 1275868335);
		local10.aClass80_Sub36_Sub1_2.method23154(arg3 ? 1 : 0, 1275868335);
		local10.aClass80_Sub36_Sub1_2.method23165(arg4, 2084425063);
		local10.aClass80_Sub36_Sub1_2.anInt3152 += -1350670595;
		local10.aClass80_Sub36_Sub1_2.method23190(anIntArray464, local21, local10.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821, (byte) 8);
		local10.aClass80_Sub36_Sub1_2.method23170(local10.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821 - local21, -377880512);
		client.aClass75_2.method1325(local10, (byte) -124);
		if (arg2 < 13) {
			client.aBoolean747 = true;
			Class480.method30005((byte) 12);
		}
		aClass707_1 = Class707.aClass707_20;
	}

	@OriginalMember(owner = "client!q", name = "as", descriptor = "(Lclient!zo;)V")
	static void method30391(@OriginalArg(0) Class713 arg0) {
		aClass713_1 = arg0;
	}

	@OriginalMember(owner = "client!q", name = "aw", descriptor = "(Lclient!zl;)V")
	static void method30392(@OriginalArg(0) Class710 arg0) {
		Class138.aClass710_3 = arg0;
		Class2_Sub1.aString13 = null;
	}

	@OriginalMember(owner = "client!q", name = "bg", descriptor = "()V")
	static void method30393() {
		if (aClass411_3 == null) {
			return;
		}
		try {
			@Pc(9) short local9;
			if (anInt5034 * 1504780479 == 0) {
				local9 = 250;
			} else {
				local9 = 2000;
			}
			anInt5033 += -2100438453;
			if (anInt5033 * -848257181 > local9) {
				Class161.method15651((byte) -66);
			}
			@Pc(62) int local62;
			if (aClass411_3 == Class411.aClass411_2) {
				client.aClass75_2.method1316(Class411.method28965(Class47.aClass28_3.method655(-26298705), 40000, (byte) -91), Class47.aClass28_3.aString4, -401157308);
				client.aClass75_2.method1314(1587586714);
				@Pc(43) Class80_Sub31 local43 = Class668.method33490(2079323183);
				local43.aClass80_Sub36_Sub1_2.method23154(Class436.aClass436_8.anInt4802 * 663664571, 1275868335);
				local43.aClass80_Sub36_Sub1_2.method23155(0, (byte) -102);
				local62 = local43.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821;
				local43.aClass80_Sub36_Sub1_2.method23155(910, (byte) -87);
				local43.aClass80_Sub36_Sub1_2.method23155(1, (byte) -117);
				anIntArray464 = Class464.method29620(local43, -597160526);
				@Pc(82) int local82 = local43.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821;
				local43.aClass80_Sub36_Sub1_2.method23165(client.aString142, 1689539283);
				local43.aClass80_Sub36_Sub1_2.method23155(client.anInt3426 * -622206633, (byte) -38);
				local43.aClass80_Sub36_Sub1_2.method23345(client.anInt3428 * 805324377, (byte) 63);
				local43.aClass80_Sub36_Sub1_2.method23345(client.anInt3427 * 1329290145, (byte) 98);
				local43.aClass80_Sub36_Sub1_2.method23165(Class593.aString228, 1998693722);
				local43.aClass80_Sub36_Sub1_2.method23154(Class512.aClass719_3.method37268(), 1275868335);
				local43.aClass80_Sub36_Sub1_2.method23154(client.aClass722_4.anInt5829 * 1531299647, 1275868335);
				Class337.method27874(local43.aClass80_Sub36_Sub1_2, 1687003244);
				@Pc(133) String local133 = client.aString143;
				local43.aClass80_Sub36_Sub1_2.method23154(local133 == null ? 0 : 1, 1275868335);
				if (local133 != null) {
					local43.aClass80_Sub36_Sub1_2.method23165(local133, 1777128955);
				}
				Class705.aClass80_Sub39_1.method15025(local43.aClass80_Sub36_Sub1_2, (byte) 3);
				local43.aClass80_Sub36_Sub1_2.anInt3152 += -1350670595;
				local43.aClass80_Sub36_Sub1_2.method23190(anIntArray464, local82, local43.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821, (byte) 8);
				local43.aClass80_Sub36_Sub1_2.method23170(local43.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821 - local62, -377880512);
				client.aClass75_2.method1325(local43, (byte) -92);
				client.aClass75_2.method1315(-725206867);
				aClass411_3 = Class411.aClass411_1;
			}
			if (Class411.aClass411_1 == aClass411_3) {
				if (client.aClass75_2.method1321((byte) 2) == null) {
					Class161.method15651((byte) -98);
					return;
				}
				if (!client.aClass75_2.method1321((byte) 2).method15545(1, (byte) 83)) {
					return;
				}
				client.aClass75_2.method1321((byte) 2).method15551(client.aClass75_2.aClass80_Sub36_Sub1_1.aByteArray61, 0, 1, -1538233007);
				aClass708_1 = (Class708) Class80_Sub39.method15030(Class538.method30883(-1185400593), client.aClass75_2.aClass80_Sub36_Sub1_1.aByteArray61[0] & 0xFF, -1160976459);
				if (aClass708_1 == Class708.aClass708_10) {
					client.aClass75_2.aClass22_1 = new Class22(anIntArray464);
					@Pc(247) int[] local247 = new int[4];
					for (local62 = 0; local62 < 4; local62++) {
						local247[local62] = anIntArray464[local62] + 50;
					}
					client.aClass75_2.aClass22_2 = new Class22(local247);
					new Class22(local247);
					client.aClass75_2.aClass80_Sub36_Sub1_1.method22564(client.aClass75_2.aClass22_2, -181366327);
					Class604.method32148(0, -1230569023);
					client.aClass75_2.method1314(1587586714);
					client.aClass75_2.aClass80_Sub36_Sub1_1.anInt3152 = 0;
					client.aClass75_2.aClass448_3 = null;
					client.aClass75_2.aClass448_4 = null;
					client.aClass75_2.aClass448_1 = null;
					client.aClass75_2.anInt245 = 0;
					Class672.aClass134_1.aClass636_1.method32852((byte) 16);
					Class376.method28463((byte) 0);
				} else {
					client.aClass75_2.method1319((short) 468);
				}
				client.aClass75_2.aClass448_2 = null;
				aClass411_3 = null;
			}
		} catch (@Pc(318) IOException local318) {
			Class161.method15651((byte) -103);
		}
	}

	@OriginalMember(owner = "client!q", name = "bl", descriptor = "()V")
	static void method30394() {
		if (aClass411_3 == null) {
			return;
		}
		try {
			@Pc(9) short local9;
			if (anInt5034 * 1504780479 == 0) {
				local9 = 250;
			} else {
				local9 = 2000;
			}
			anInt5033 += -2100438453;
			if (anInt5033 * -848257181 > local9) {
				Class161.method15651((byte) -21);
			}
			@Pc(62) int local62;
			if (aClass411_3 == Class411.aClass411_2) {
				client.aClass75_2.method1316(Class411.method28965(Class47.aClass28_3.method655(-1155058966), 40000, (byte) -15), Class47.aClass28_3.aString4, -524654130);
				client.aClass75_2.method1314(1587586714);
				@Pc(43) Class80_Sub31 local43 = Class668.method33490(2130200958);
				local43.aClass80_Sub36_Sub1_2.method23154(Class436.aClass436_8.anInt4802 * 663664571, 1275868335);
				local43.aClass80_Sub36_Sub1_2.method23155(0, (byte) -81);
				local62 = local43.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821;
				local43.aClass80_Sub36_Sub1_2.method23155(910, (byte) -112);
				local43.aClass80_Sub36_Sub1_2.method23155(1, (byte) -47);
				anIntArray464 = Class464.method29620(local43, -555448474);
				@Pc(82) int local82 = local43.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821;
				local43.aClass80_Sub36_Sub1_2.method23165(client.aString142, 2013923470);
				local43.aClass80_Sub36_Sub1_2.method23155(client.anInt3426 * -622206633, (byte) -39);
				local43.aClass80_Sub36_Sub1_2.method23345(client.anInt3428 * 805324377, (byte) 111);
				local43.aClass80_Sub36_Sub1_2.method23345(client.anInt3427 * 1329290145, (byte) 82);
				local43.aClass80_Sub36_Sub1_2.method23165(Class593.aString228, 1877108122);
				local43.aClass80_Sub36_Sub1_2.method23154(Class512.aClass719_3.method37268(), 1275868335);
				local43.aClass80_Sub36_Sub1_2.method23154(client.aClass722_4.anInt5829 * 1531299647, 1275868335);
				Class337.method27874(local43.aClass80_Sub36_Sub1_2, 1287845888);
				@Pc(133) String local133 = client.aString143;
				local43.aClass80_Sub36_Sub1_2.method23154(local133 == null ? 0 : 1, 1275868335);
				if (local133 != null) {
					local43.aClass80_Sub36_Sub1_2.method23165(local133, 2019924676);
				}
				Class705.aClass80_Sub39_1.method15025(local43.aClass80_Sub36_Sub1_2, (byte) 3);
				local43.aClass80_Sub36_Sub1_2.anInt3152 += -1350670595;
				local43.aClass80_Sub36_Sub1_2.method23190(anIntArray464, local82, local43.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821, (byte) 8);
				local43.aClass80_Sub36_Sub1_2.method23170(local43.aClass80_Sub36_Sub1_2.anInt3152 * -1380987821 - local62, -377880512);
				client.aClass75_2.method1325(local43, (byte) -17);
				client.aClass75_2.method1315(422089851);
				aClass411_3 = Class411.aClass411_1;
			}
			if (Class411.aClass411_1 == aClass411_3) {
				if (client.aClass75_2.method1321((byte) 2) == null) {
					Class161.method15651((byte) -29);
					return;
				}
				if (!client.aClass75_2.method1321((byte) 2).method15545(1, (byte) -85)) {
					return;
				}
				client.aClass75_2.method1321((byte) 2).method15551(client.aClass75_2.aClass80_Sub36_Sub1_1.aByteArray61, 0, 1, -1697298636);
				aClass708_1 = (Class708) Class80_Sub39.method15030(Class538.method30883(484025689), client.aClass75_2.aClass80_Sub36_Sub1_1.aByteArray61[0] & 0xFF, -1959614549);
				if (aClass708_1 == Class708.aClass708_10) {
					client.aClass75_2.aClass22_1 = new Class22(anIntArray464);
					@Pc(247) int[] local247 = new int[4];
					for (local62 = 0; local62 < 4; local62++) {
						local247[local62] = anIntArray464[local62] + 50;
					}
					client.aClass75_2.aClass22_2 = new Class22(local247);
					new Class22(local247);
					client.aClass75_2.aClass80_Sub36_Sub1_1.method22564(client.aClass75_2.aClass22_2, -804795945);
					Class604.method32148(0, -486153130);
					client.aClass75_2.method1314(1587586714);
					client.aClass75_2.aClass80_Sub36_Sub1_1.anInt3152 = 0;
					client.aClass75_2.aClass448_3 = null;
					client.aClass75_2.aClass448_4 = null;
					client.aClass75_2.aClass448_1 = null;
					client.aClass75_2.anInt245 = 0;
					Class672.aClass134_1.aClass636_1.method32852((byte) 16);
					Class376.method28463((byte) 0);
				} else {
					client.aClass75_2.method1319((short) 468);
				}
				client.aClass75_2.aClass448_2 = null;
				aClass411_3 = null;
			}
		} catch (@Pc(318) IOException local318) {
			Class161.method15651((byte) -43);
		}
	}

	@OriginalMember(owner = "client!q", name = "br", descriptor = "(Lclient!aku;)[I")
	static int[] method30395(@OriginalArg(0) Class80_Sub31 arg0) {
		@Pc(4) Class80_Sub36 local4 = new Class80_Sub36(518);
		@Pc(7) int[] local7 = new int[4];
		@Pc(9) int local9;
		for (local9 = 0; local9 < 4; local9++) {
			local7[local9] = (int) (Math.random() * 9.9999999E7D);
		}
		local4.method23154(10, 1275868335);
		local4.method23345(local7[0], (byte) 90);
		local4.method23345(local7[1], (byte) 65);
		local4.method23345(local7[2], (byte) 44);
		local4.method23345(local7[3], (byte) 89);
		for (local9 = 0; local9 < 10; local9++) {
			local4.method23345((int) (Math.random() * 9.9999999E7D), (byte) 78);
		}
		local4.method23155((int) (Math.random() * 9.9999999E7D), (byte) -112);
		local4.method23206(Class174.aBigInteger1, Class174.aBigInteger2, (byte) 0);
		arg0.aClass80_Sub36_Sub1_2.method23168(local4.aByteArray61, 0, local4.anInt3152 * -1380987821, (byte) 21);
		return local7;
	}

	@OriginalMember(owner = "client!q", name = "an", descriptor = "()Ljava/lang/String;")
	public static String method30396() {
		return Class2_Sub1.aString13;
	}

	@OriginalMember(owner = "client!q", name = "n", descriptor = "()V")
	public static void method30397() {
		if (1994758437 * client.anInt3433 == 4 && (!Class353.method28071(1116119610) && !Class684.method36790((byte) 85))) {
			Class604.method32148(12, -767590034);
		}
	}

	@OriginalMember(owner = "client!q", name = "x", descriptor = "(Lclient!yp;B)V")
	static void method30398(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class688.method36898(local13, -1413748954);
	}

	@OriginalMember(owner = "client!q", name = "aud", descriptor = "(Lclient!yp;I)V")
	static void method30399(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub8_1.method15974(663188391);
	}

	@OriginalMember(owner = "client!q", name = "alm", descriptor = "(Lclient!yp;I)V")
	static void method30400(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		if (local13 >= 0 && local13 < 2) {
			client.anIntArrayArrayArray15[local13] = new int[local23 << 1][4];
		}
	}

	@OriginalMember(owner = "client!q", name = "e", descriptor = "(Lclient!ald;B)V")
	static void method30401(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0.method23195(1610902092);
		Class90.aClass644Array1 = new Class644[local3];
		@Pc(8) int local8;
		for (local8 = 0; local8 < local3; local8++) {
			Class90.aClass644Array1[local8] = new Class644();
			Class90.aClass644Array1[local8].anInt5644 = arg0.method23195(1278982849) * -57965287;
			Class90.aClass644Array1[local8].aString234 = arg0.method23186((byte) 12);
		}
		Class635.anInt5596 = arg0.method23195(1787961376) * -1098124595;
		Class635.anInt5600 = arg0.method23195(1672696345) * -548797411;
		Class635.anInt5597 = arg0.method23195(1573960241) * -958334015;
		Class635.aClass163_Sub1Array2 = new Class163_Sub1[Class635.anInt5600 * 1540152885 - Class635.anInt5596 * 828983813 + 1];
		for (local8 = 0; local8 < Class635.anInt5597 * 1584731201; local8++) {
			@Pc(75) int local75 = arg0.method23195(1813947273);
			@Pc(83) Class163_Sub1 local83 = Class635.aClass163_Sub1Array2[local75] = new Class163_Sub1();
			local83.anInt2080 = arg0.method23362(-1119142397) * -1087879865;
			local83.anInt2081 = arg0.method23182(-2124494973) * -1255476189;
			local83.anInt2085 = arg0.method23195(1673024255) * 183586725;
			if (local83.anInt2085 * 1899036717 != 0) {
				local83.aString62 = arg0.method23186((byte) 12);
			}
			local83.anInt2086 = (local75 + Class635.anInt5596 * 828983813) * 34241443;
			local83.aString63 = arg0.method23186((byte) 12);
			local83.aString61 = arg0.method23186((byte) 12);
		}
		RuntimeException_Sub1.anInt3204 = arg0.method23182(999138195) * -1854384973;
		Class635.aBoolean959 = true;
	}

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
	Class499() throws Throwable {
		throw new Error();
	}
}
