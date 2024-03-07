package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yd")
public class Class679 {

	@OriginalMember(owner = "client!yd", name = "e", descriptor = "Lclient!ve;")
	final Class611 aClass611_3;

	@OriginalMember(owner = "client!yd", name = "n", descriptor = "I")
	final int anInt5887;

	@OriginalMember(owner = "client!yd", name = "<init>", descriptor = "(Lclient!ve;I)V", line = 13)
	public Class679(@OriginalArg(0) Class611 arg0, @OriginalArg(1) int arg1) {
		this.aClass611_3 = arg0;
		this.anInt5887 = arg1 * 191282359;
	}

	@OriginalMember(owner = "client!yd", name = "k", descriptor = "(Lclient!alw;I)Lclient!kp;", line = 16)
	public static Class125 method33234(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class125 local3 = Class32_Sub4.method16727(arg0, -423624971);
		@Pc(7) int local7 = arg0.g4(-118643075);
		@Pc(11) int local11 = arg0.g4(-118643075);
		return new Class125_Sub3(local3.aClass390_7, local3.aClass392_7, local3.anInt2981 * 483768335, local3.anInt2982 * 2099407685, local3.anInt2983 * 1135283731, local3.anInt2980 * -1017655207, local3.anInt2985 * -1946839755, local3.anInt2986 * -1726029297, local3.anInt2984 * 291173831, local7, local11);
	}

	@OriginalMember(owner = "client!yd", name = "e", descriptor = "(I)Lclient!aut;", line = 19)
	public Class132_Sub1_Sub5_Sub1 method33235(@OriginalArg(0) int arg0) {
		@Pc(25) Class93_Sub5 local25 = (Class93_Sub5) client.aClass16_20.method214((long) (this.aClass611_3.anInt5625 * -78984409 << 28 | this.aClass611_3.anInt5624 * -1994307635 << 14 | this.aClass611_3.anInt5623 * 270611681));
		if (local25 == null) {
			return null;
		}
		@Pc(34) Class611 local34 = client.world.method30455(1738778102);
		@Pc(45) int local45 = this.aClass611_3.anInt5623 * 270611681 - local34.anInt5623 * 270611681;
		@Pc(56) int local56 = this.aClass611_3.anInt5624 * -1994307635 - local34.anInt5624 * -1994307635;
		if (local45 >= 0 && local56 >= 0 && local45 < client.world.method30459(-655527418) && local56 < client.world.method30466((short) 128) && client.world.method30481(-1937321968) != null) {
			for (@Pc(80) Class93_Sub3 local80 = (Class93_Sub3) local25.aClass22_17.method428((byte) 87); local80 != null; local80 = (Class93_Sub3) local25.aClass22_17.method442(1312498463)) {
				if (local80.anInt1405 * -308533965 == this.anInt5887 * -1840455417) {
					return (Class132_Sub1_Sub5_Sub1) client.world.method30481(-1911750433).method31546(this.aClass611_3.anInt5625 * -78984409, local45, local56, (byte) -81);
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!yd", name = "n", descriptor = "()Lclient!aut;", line = 19)
	public Class132_Sub1_Sub5_Sub1 method33236() {
		@Pc(25) Class93_Sub5 local25 = (Class93_Sub5) client.aClass16_20.method214((long) (this.aClass611_3.anInt5625 * -78984409 << 28 | this.aClass611_3.anInt5624 * -1994307635 << 14 | this.aClass611_3.anInt5623 * 270611681));
		if (local25 == null) {
			return null;
		}
		@Pc(34) Class611 local34 = client.world.method30455(1717907315);
		@Pc(45) int local45 = this.aClass611_3.anInt5623 * 270611681 - local34.anInt5623 * 270611681;
		@Pc(56) int local56 = this.aClass611_3.anInt5624 * -1994307635 - local34.anInt5624 * -1994307635;
		if (local45 >= 0 && local56 >= 0 && local45 < client.world.method30459(213030222) && local56 < client.world.method30466((short) 128) && client.world.method30481(-1968482691) != null) {
			for (@Pc(80) Class93_Sub3 local80 = (Class93_Sub3) local25.aClass22_17.method428((byte) 101); local80 != null; local80 = (Class93_Sub3) local25.aClass22_17.method442(1246770939)) {
				if (local80.anInt1405 * -308533965 == this.anInt5887 * -1840455417) {
					return (Class132_Sub1_Sub5_Sub1) client.world.method30481(-1112053277).method31546(this.aClass611_3.anInt5625 * -78984409, local45, local56, (byte) -52);
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!yd", name = "ep", descriptor = "(II)Z", line = 1776)
	static boolean method33237(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 13 || arg0 == 15;
	}

	@OriginalMember(owner = "client!yd", name = "abg", descriptor = "(Lclient!yf;I)V", line = 9851)
	static final void method33238(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5891 -= -725861497;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(28) boolean local28 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1] == 1;
		@Pc(38) int local38 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		@Pc(43) Class304 local43 = Class557.aClass297_1.method26646(local13, 161193133);
		if (local43.method26790(-2096859585) == null) {
			local43.method26788(client.anInterface27_1, (byte) 96);
		}
		if (!local28) {
			@Pc(144) Class379 local144 = (Class379) Class30.aClass32_Sub16_1.get(local38, 1343530537);
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local144.method28089(local43.method26790(-2067389413).method781(local144.aClass108_1.anInt867 * -1284841473, -1267242705), 1071523002);
			return;
		}
		@Pc(59) Class108_Sub1 local59 = (Class108_Sub1) Class21.varPlayerTypes.get(local38, -98003055);
		switch(local59.aClass519_6.aClass500_7.anInt5196 * -1217885029) {
			case 2:
				arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local43.method26790(-2128181752).method781(local59.anInt867 * -1284841473, -1267242705);
				break;
			case 4:
				arg0.aLongArray27[(arg0.anInt5894 += -1364417339) * -2000995827 - 1] = local43.method26790(-2048218209).method779(local59.anInt867 * -1284841473, 1355171314);
				break;
			default:
				arg0.anObjectArray45[(arg0.anInt5888 += 957530791) * 587908375 - 1] = local43.method26790(-2104431627).method775(local59.anInt867 * -1284841473, -1328918181);
		}
	}
}
