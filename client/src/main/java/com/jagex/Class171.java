package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public final class Class171 {

	@OriginalMember(owner = "client!at", name = "e", descriptor = "I")
	static final int anInt3198 = 50000;

	@OriginalMember(owner = "client!at", name = "f", descriptor = "I")
	static final int anInt3199 = 100000;

	@OriginalMember(owner = "client!at", name = "u", descriptor = "I")
	static final int anInt3200 = 10000;

	@OriginalMember(owner = "client!at", name = "l", descriptor = "I")
	static final int anInt3201 = 104;

	@OriginalMember(owner = "client!at", name = "g", descriptor = "I")
	static final int anInt3202 = 504;

	@OriginalMember(owner = "client!at", name = "i", descriptor = "I")
	static final int anInt3203 = 1000;

	@OriginalMember(owner = "client!at", name = "m", descriptor = "J")
	static final long aLong300 = 64425238954L;

	@OriginalMember(owner = "client!at", name = "t", descriptor = "F")
	static final float aFloat239 = 1.3F;

	@OriginalMember(owner = "client!at", name = "o", descriptor = "J")
	static final long aLong301 = 60129613779L;

	@OriginalMember(owner = "client!at", name = "fz", descriptor = "Lclient!pf;")
	public static Class480 aClass480_82;

	@OriginalMember(owner = "client!at", name = "j", descriptor = "Z")
	public static boolean aBoolean620 = false;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "Z")
	public static boolean aBoolean621 = false;

	@OriginalMember(owner = "client!at", name = "s", descriptor = "Z")
	static boolean aBoolean619 = false;

	@OriginalMember(owner = "client!at", name = "w", descriptor = "()Lclient!als;")
	static Class72_Sub1 method23486() {
		@Pc(3) Class72_Sub1 local3 = new Class72_Sub1();
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		if (Class450.aString209.startsWith("win")) {
			local7 = true;
			local5 = true;
			local9 = true;
		} else {
			local5 = true;
			local9 = true;
		}
		if (aBoolean620) {
			local3.method15584(16, 1113845175);
			local5 = false;
		}
		if (aBoolean621) {
			local3.method15584(32, 983017793);
			local7 = false;
		}
		if (aBoolean619) {
			local3.method15584(16384, -431826266);
			local9 = false;
		}
		if (!local5 && !local7) {
			Class2.method1815(local3, (byte) 17);
			return local3;
		}
		@Pc(59) int local59 = -1;
		@Pc(61) int local61 = -1;
		@Pc(63) int local63 = -1;
		if (local7) {
			try {
				Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub44_1, 3, (byte) 112);
				Class719.method37291(749309365);
				local61 = Class257.method26428(3, 1000, 2107977820);
				if (Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(399375739) == 3) {
					local3.method15584(4, -332365009);
					@Pc(91) Class203 local91 = Class279.aClass102_9.method20656();
					@Pc(98) long local98 = local91.aLong341 * 5566305393711832135L & 0xFFFFFFFFFFFFL;
					@Pc(111) boolean local111;
					switch(local91.anInt3384 * 1548391145) {
						case 4098:
							local111 = local98 >= 60129613779L;
							local5 &= local111;
							if (!local111) {
								local3.method15584(512, 1764039964);
							}
							break;
						case 4318:
							local111 = local98 >= 64425238954L;
							local5 &= local111;
							if (!local111) {
								local3.method15584(256, 907987805);
							}
					}
				}
			} catch (@Pc(142) Exception local142) {
				local3.method15584(4096, -1718953096);
			}
		}
		if (local9) {
			try {
				Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub44_1, 5, (byte) 116);
				Class719.method37291(-643545803);
				local63 = Class257.method26428(5, 1000, -125457391);
				if (Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(450008424) == 5) {
					local3.method15584(8192, -1485447816);
				}
			} catch (@Pc(173) Exception local173) {
				local3.method15584(32768, -952673604);
			}
		}
		if (local5) {
			try {
				Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub44_1, 4, (byte) 74);
				Class719.method37291(-908324694);
				local59 = Class257.method26428(1, 1000, -956241349);
				if (Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(-1566376676) == 1) {
					local3.method15584(2, -1752749696);
				}
			} catch (@Pc(204) Exception local204) {
				local3.method15584(2048, -1825814874);
			}
		}
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub44_1, 0, (byte) 115);
		if (local59 == -1 && local61 == -1) {
			Class2.method1815(local3, (byte) -47);
			return local3;
		}
		local3.method15585(3, local61, -673088298);
		local3.method15585(1, local59, -898184062);
		local3.method15585(5, local63, -479710011);
		local61 = (int) ((float) local61 * 1.3F);
		if ((local61 <= 100000 || local59 <= 100000) && local61 <= local59) {
			Class535.method30855(local3, 1, local61 == -1 ? local59 : local61, (byte) 31);
		} else {
			Class535.method30855(local3, 3, local59 == -1 ? local61 : local59, (byte) 13);
		}
		return local3;
	}

	@OriginalMember(owner = "client!at", name = "s", descriptor = "()V")
	public static void method23487() {
		@Pc(1) Class40 local1 = null;
		try {
			local1 = Class3.method70("", client.aClass722_4.aString247, true, -2014760894);
			@Pc(12) Class80_Sub36 local12 = Class703.aClass80_Sub37_49.method14942(-453302767);
			local1.method834(local12.aByteArray61, 0, local12.anInt3152 * -1380987821, (byte) 1);
		} catch (@Pc(24) Exception local24) {
		}
		try {
			if (local1 != null) {
				local1.method838(-1607330021);
			}
		} catch (@Pc(31) Exception local31) {
		}
	}

	@OriginalMember(owner = "client!at", name = "k", descriptor = "()I")
	public static int method23488() {
		@Pc(2) Class72_Sub1 local2 = Class533.method30828((byte) 113);
		Class490.method30242(local2, 1896589581);
		return local2.method15572((byte) 0);
	}

	@OriginalMember(owner = "client!at", name = "x", descriptor = "()Lclient!als;")
	static Class72_Sub1 method23489() {
		@Pc(3) Class72_Sub1 local3 = new Class72_Sub1();
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		if (Class450.aString209.startsWith("win")) {
			local7 = true;
			local5 = true;
			local9 = true;
		} else {
			local5 = true;
			local9 = true;
		}
		if (aBoolean620) {
			local3.method15584(16, -639689031);
			local5 = false;
		}
		if (aBoolean621) {
			local3.method15584(32, -1891962918);
			local7 = false;
		}
		if (aBoolean619) {
			local3.method15584(16384, -1030236714);
			local9 = false;
		}
		if (!local5 && !local7) {
			Class2.method1815(local3, (byte) -110);
			return local3;
		}
		@Pc(59) int local59 = -1;
		@Pc(61) int local61 = -1;
		@Pc(63) int local63 = -1;
		if (local7) {
			try {
				Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub44_1, 3, (byte) 109);
				Class719.method37291(1002590625);
				local61 = Class257.method26428(3, 1000, 104370921);
				if (Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(617487288) == 3) {
					local3.method15584(4, 1865692609);
					@Pc(91) Class203 local91 = Class279.aClass102_9.method20656();
					@Pc(98) long local98 = local91.aLong341 * 5566305393711832135L & 0xFFFFFFFFFFFFL;
					@Pc(111) boolean local111;
					switch(local91.anInt3384 * 1548391145) {
						case 4098:
							local111 = local98 >= 60129613779L;
							local5 &= local111;
							if (!local111) {
								local3.method15584(512, 1342569247);
							}
							break;
						case 4318:
							local111 = local98 >= 64425238954L;
							local5 &= local111;
							if (!local111) {
								local3.method15584(256, -168425468);
							}
					}
				}
			} catch (@Pc(142) Exception local142) {
				local3.method15584(4096, 2084337691);
			}
		}
		if (local9) {
			try {
				Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub44_1, 5, (byte) 114);
				Class719.method37291(-392877127);
				local63 = Class257.method26428(5, 1000, -251438318);
				if (Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(1368826134) == 5) {
					local3.method15584(8192, 754228016);
				}
			} catch (@Pc(173) Exception local173) {
				local3.method15584(32768, 1153107042);
			}
		}
		if (local5) {
			try {
				Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub44_1, 4, (byte) 69);
				Class719.method37291(2114890027);
				local59 = Class257.method26428(1, 1000, 956413252);
				if (Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(1444396149) == 1) {
					local3.method15584(2, 118955150);
				}
			} catch (@Pc(204) Exception local204) {
				local3.method15584(2048, -1304736601);
			}
		}
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub44_1, 0, (byte) 76);
		if (local59 == -1 && local61 == -1) {
			Class2.method1815(local3, (byte) 80);
			return local3;
		}
		local3.method15585(3, local61, -187695943);
		local3.method15585(1, local59, -1391665169);
		local3.method15585(5, local63, -1154214431);
		local61 = (int) ((float) local61 * 1.3F);
		if ((local61 <= 100000 || local59 <= 100000) && local61 <= local59) {
			Class535.method30855(local3, 1, local61 == -1 ? local59 : local61, (byte) 93);
		} else {
			Class535.method30855(local3, 3, local59 == -1 ? local61 : local59, (byte) 54);
		}
		return local3;
	}

	@OriginalMember(owner = "client!at", name = "v", descriptor = "()V")
	public static void method23490() {
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub10_1, 2, (byte) 32);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub10_2, 2, (byte) 59);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub26_1, 1, (byte) 7);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub41_1, 1, (byte) 46);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub34_1, 1, (byte) 9);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub7_1, 1, (byte) 52);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub17_1, 1, (byte) 85);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub2_1, 1, (byte) 39);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub22_1, 1, (byte) 39);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub4_1, 1, (byte) 46);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub13_1, 0, (byte) 24);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub9_1, 1, (byte) 72);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub43_2, 0, (byte) 81);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub43_1, 0, (byte) 103);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub6_1, 1, (byte) 55);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub11_1, Class345.aClass345_2.anInt4247 * 659011863, (byte) 66);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub47_1, 0, (byte) 81);
		if (Class279.aClass102_9 != null && Class279.aClass102_9.method20791() && Class279.aClass102_9.method20784()) {
			Class279.aClass102_9.method20856();
		}
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub32_1, 1, (byte) 87);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub35_1, 1, (byte) 79);
		Class80_Sub1_Sub16.method24084(228514763);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub8_1, 1, (byte) 70);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub38_1, 3, (byte) 105);
		Class522.method30640(-167864389);
		client.aClass539_1.method30904((byte) -69).method33382(737706353);
		client.aBoolean718 = true;
	}

	@OriginalMember(owner = "client!at", name = "r", descriptor = "(Lclient!als;)V")
	static void method23491(@OriginalArg(0) Class72_Sub1 arg0) {
		arg0.method15590(0, (byte) 6);
		@Pc(18) byte local18;
		if (Class554.anInt3423 * -2024030715 >= 96) {
			@Pc(11) int local11 = Class162_Sub2.method15802((short) -3821);
			if (local11 <= 104) {
				Class673.method33570((short) 16383);
				local18 = 4;
			} else if (local11 <= 504) {
				Class123_Sub3.method10025(1228609297);
				local18 = 3;
			} else if (local11 <= 1000) {
				Class143.method11833(1413071081);
				local18 = 2;
			} else {
				Class59.method1177(true, 544537807);
				local18 = 1;
			}
			arg0.method15585(0, local11, 881645051);
		} else {
			Class59.method1177(true, -646814996);
			local18 = 1;
			arg0.method15584(64, -656613033);
		}
		if (Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(-210754285) == 0) {
			Class703.aClass80_Sub37_49.method14959(Class703.aClass80_Sub37_49.aClass165_Sub1_2, true, 470442690);
		} else {
			Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub1_1, 0, (byte) 13);
			Class528.method30719(0, false, 1518375318);
		}
		Class719.method37291(68143807);
		arg0.method15583(local18, -756928212);
	}

	@OriginalMember(owner = "client!at", name = "q", descriptor = "(Lclient!als;II)V")
	static void method23492(@OriginalArg(0) Class72_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0.method15590(arg1, (byte) 6);
		@Pc(10) byte local10;
		if (arg2 > 100000) {
			Class673.method33570((short) 16383);
			local10 = 4;
		} else if (arg2 > 50000) {
			Class123_Sub3.method10025(-1160681443);
			local10 = 3;
		} else if (arg2 > 10000) {
			Class143.method11833(1413071081);
			local10 = 2;
		} else {
			Class59.method1177(true, -632551997);
			local10 = 1;
		}
		if (Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(-941004517) == arg1) {
			Class703.aClass80_Sub37_49.method14959(Class703.aClass80_Sub37_49.aClass165_Sub1_2, true, 470442690);
		} else {
			Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub1_1, arg1, (byte) 21);
			Class528.method30719(arg1, false, 658037346);
		}
		Class719.method37291(-635078495);
		arg0.method15583(local10, -756928212);
	}

	@OriginalMember(owner = "client!at", name = "h", descriptor = "(Lclient!als;II)V")
	static void method23493(@OriginalArg(0) Class72_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		arg0.method15590(arg1, (byte) 6);
		@Pc(10) byte local10;
		if (arg2 > 100000) {
			Class673.method33570((short) 16383);
			local10 = 4;
		} else if (arg2 > 50000) {
			Class123_Sub3.method10025(208773242);
			local10 = 3;
		} else if (arg2 > 10000) {
			Class143.method11833(1413071081);
			local10 = 2;
		} else {
			Class59.method1177(true, -946311920);
			local10 = 1;
		}
		if (Class703.aClass80_Sub37_49.aClass165_Sub1_2.method15834(-789632454) == arg1) {
			Class703.aClass80_Sub37_49.method14959(Class703.aClass80_Sub37_49.aClass165_Sub1_2, true, 470442690);
		} else {
			Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub1_1, arg1, (byte) 94);
			Class528.method30719(arg1, false, -958040214);
		}
		Class719.method37291(-379172348);
		arg0.method15583(local10, -756928212);
	}

	@OriginalMember(owner = "client!at", name = "c", descriptor = "()V")
	public static void method23494() {
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub10_1, 1, (byte) 48);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub10_2, 1, (byte) 103);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub26_1, 1, (byte) 94);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub41_1, 1, (byte) 37);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub34_1, 0, (byte) 78);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub7_1, 0, (byte) 110);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub17_1, 0, (byte) 51);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub22_1, 0, (byte) 85);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub2_1, 0, (byte) 95);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub4_1, 0, (byte) 78);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub13_1, 0, (byte) 86);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub9_1, 0, (byte) 85);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub43_2, 0, (byte) 66);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub43_1, 0, (byte) 83);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub6_1, 0, (byte) 3);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub11_1, Class345.aClass345_2.anInt4247 * 659011863, (byte) 113);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub47_1, 0, (byte) 12);
		if (Class279.aClass102_9 != null && Class279.aClass102_9.method20791() && Class279.aClass102_9.method20784()) {
			Class279.aClass102_9.method20856();
		}
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub32_1, 0, (byte) 28);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub35_1, 0, (byte) 78);
		Class80_Sub1_Sub16.method24084(-1063290308);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub8_1, 2, (byte) 18);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub38_1, 2, (byte) 71);
		Class522.method30640(1126234949);
		client.aClass539_1.method30904((byte) -23).method33382(841326755);
		client.aBoolean718 = true;
	}

	@OriginalMember(owner = "client!at", name = "z", descriptor = "()V")
	public static void method23495() {
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub10_1, 2, (byte) 76);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub10_2, 2, (byte) 26);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub26_1, 1, (byte) 118);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub41_1, 1, (byte) 120);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub34_1, 1, (byte) 59);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub7_1, 1, (byte) 109);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub17_1, 1, (byte) 20);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub2_1, 1, (byte) 46);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub22_1, 2, (byte) 109);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub4_1, 1, (byte) 77);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub13_1, 2, (byte) 31);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub9_1, 1, (byte) 50);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub43_2, 0, (byte) 95);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub43_1, 0, (byte) 16);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub6_1, 2, (byte) 12);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub11_1, Class345.aClass345_2.anInt4247 * 659011863, (byte) 71);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub47_1, 0, (byte) 106);
		if (Class279.aClass102_9 != null && Class279.aClass102_9.method20791() && Class279.aClass102_9.method20784()) {
			Class279.aClass102_9.method20856();
		}
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub32_1, 1, (byte) 21);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub35_1, 1, (byte) 75);
		Class80_Sub1_Sub16.method24084(244877861);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub8_1, 0, (byte) 18);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub38_1, 4, (byte) 94);
		Class522.method30640(-1307672719);
		client.aClass539_1.method30904((byte) -59).method33382(-876848851);
		client.aBoolean718 = true;
	}

	@OriginalMember(owner = "client!at", name = "p", descriptor = "()V")
	public static void method23496() {
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub10_1, 2, (byte) 87);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub10_2, 2, (byte) 91);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub26_1, 1, (byte) 94);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub41_1, 1, (byte) 80);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub34_1, 1, (byte) 93);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub7_1, 1, (byte) 13);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub17_1, 1, (byte) 86);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub2_1, 1, (byte) 108);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub22_1, 1, (byte) 29);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub4_1, 1, (byte) 110);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub13_1, 0, (byte) 101);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub9_1, 1, (byte) 62);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub43_2, 0, (byte) 86);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub43_1, 0, (byte) 75);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub6_1, 1, (byte) 44);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub11_1, Class345.aClass345_2.anInt4247 * 659011863, (byte) 14);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub47_1, 0, (byte) 8);
		if (Class279.aClass102_9 != null && Class279.aClass102_9.method20791() && Class279.aClass102_9.method20784()) {
			Class279.aClass102_9.method20856();
		}
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub32_1, 1, (byte) 70);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub35_1, 1, (byte) 70);
		Class80_Sub1_Sub16.method24084(1585347399);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub8_1, 1, (byte) 117);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub38_1, 3, (byte) 35);
		Class522.method30640(-2057844544);
		client.aClass539_1.method30904((byte) -125).method33382(-1227510637);
		client.aBoolean718 = true;
	}

	@OriginalMember(owner = "client!at", name = "ay", descriptor = "()V")
	static void method23497() {
		if (Class554.anInt3412 * -349861231 > 1) {
			Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub30_1, 4, (byte) 20);
		} else {
			Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub30_1, 2, (byte) 97);
		}
	}

	@OriginalMember(owner = "client!at", name = "y", descriptor = "()V")
	public static void method23498() {
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub10_1, 1, (byte) 113);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub10_2, 1, (byte) 36);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub26_1, 1, (byte) 108);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub41_1, 1, (byte) 118);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub34_1, 0, (byte) 112);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub7_1, 0, (byte) 20);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub17_1, 0, (byte) 4);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub22_1, 0, (byte) 17);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub2_1, 0, (byte) 65);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub4_1, 0, (byte) 123);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub13_1, 0, (byte) 96);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub9_1, 0, (byte) 40);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub43_2, 0, (byte) 105);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub43_1, 0, (byte) 127);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub6_1, 0, (byte) 11);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub11_1, Class345.aClass345_2.anInt4247 * 659011863, (byte) 37);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub47_1, 0, (byte) 73);
		if (Class279.aClass102_9 != null && Class279.aClass102_9.method20791() && Class279.aClass102_9.method20784()) {
			Class279.aClass102_9.method20856();
		}
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub32_1, 0, (byte) 70);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub35_1, 0, (byte) 4);
		Class80_Sub1_Sub16.method24084(-2130582059);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub8_1, 2, (byte) 111);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub38_1, 2, (byte) 122);
		Class522.method30640(-498609142);
		client.aClass539_1.method30904((byte) -36).method33382(-1243626476);
		client.aBoolean718 = true;
	}

	@OriginalMember(owner = "client!at", name = "n", descriptor = "()V")
	public static void method23499() {
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub10_1, 1, (byte) 117);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub10_2, 1, (byte) 11);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub26_1, 1, (byte) 54);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub41_1, 1, (byte) 54);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub34_1, 0, (byte) 10);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub7_1, 0, (byte) 118);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub17_1, 0, (byte) 75);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub22_1, 0, (byte) 68);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub2_1, 0, (byte) 41);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub4_1, 0, (byte) 6);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub13_1, 0, (byte) 110);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub9_1, 0, (byte) 64);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub43_2, 0, (byte) 27);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub43_1, 0, (byte) 90);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub6_1, 0, (byte) 37);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub11_1, Class345.aClass345_2.anInt4247 * 659011863, (byte) 70);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub47_1, 0, (byte) 80);
		if (Class279.aClass102_9 != null && Class279.aClass102_9.method20791() && Class279.aClass102_9.method20784()) {
			Class279.aClass102_9.method20856();
		}
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub32_1, 0, (byte) 47);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub35_1, 0, (byte) 43);
		Class80_Sub1_Sub16.method24084(674136367);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub8_1, 2, (byte) 95);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub38_1, 2, (byte) 37);
		Class522.method30640(-419209643);
		client.aClass539_1.method30904((byte) -44).method33382(-1561856931);
		client.aBoolean718 = true;
	}

	@OriginalMember(owner = "client!at", name = "d", descriptor = "()V")
	public static void method23500() {
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub10_1, 2, (byte) 102);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub10_2, 2, (byte) 35);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub26_1, 1, (byte) 111);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub41_1, 1, (byte) 117);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub34_1, 1, (byte) 114);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub7_1, 1, (byte) 106);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub17_1, 1, (byte) 46);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub2_1, 1, (byte) 94);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub22_1, 2, (byte) 19);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub4_1, 1, (byte) 70);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub13_1, 2, (byte) 67);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub9_1, 1, (byte) 42);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub43_2, 0, (byte) 97);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub43_1, 0, (byte) 102);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub6_1, 2, (byte) 71);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub11_1, Class345.aClass345_2.anInt4247 * 659011863, (byte) 106);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub47_1, 0, (byte) 50);
		if (Class279.aClass102_9 != null && Class279.aClass102_9.method20791() && Class279.aClass102_9.method20784()) {
			Class279.aClass102_9.method20856();
		}
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub32_1, 1, (byte) 127);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub35_1, 1, (byte) 121);
		Class80_Sub1_Sub16.method24084(-1249310038);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub8_1, 0, (byte) 125);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub38_1, 4, (byte) 77);
		Class522.method30640(-1427167157);
		client.aClass539_1.method30904((byte) -75).method33382(-699651847);
		client.aBoolean718 = true;
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "()V")
	public static void method23501() {
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub10_1, 1, (byte) 88);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub10_2, 1, (byte) 17);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub26_1, 1, (byte) 97);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub41_1, 1, (byte) 59);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub34_1, 0, (byte) 58);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub7_1, 0, (byte) 111);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub17_1, 0, (byte) 124);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub22_1, 0, (byte) 91);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub2_1, 0, (byte) 99);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub4_1, 0, (byte) 86);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub13_1, 0, (byte) 43);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub9_1, 0, (byte) 22);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub43_2, 0, (byte) 51);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub43_1, 0, (byte) 115);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub6_1, 0, (byte) 109);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub11_1, Class345.aClass345_2.anInt4247 * 659011863, (byte) 46);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub47_1, 0, (byte) 57);
		if (Class279.aClass102_9 != null && Class279.aClass102_9.method20791() && Class279.aClass102_9.method20784()) {
			Class279.aClass102_9.method20856();
		}
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub32_1, 0, (byte) 20);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub35_1, 0, (byte) 71);
		Class80_Sub1_Sub16.method24084(250360097);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub8_1, 2, (byte) 64);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub38_1, 2, (byte) 37);
		Class522.method30640(338404722);
		client.aClass539_1.method30904((byte) -107).method33382(444722295);
		client.aBoolean718 = true;
	}

	@OriginalMember(owner = "client!at", name = "ax", descriptor = "()V")
	static void method23502() {
		if (Class554.anInt3412 * -349861231 > 1) {
			Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub30_1, 4, (byte) 16);
		} else {
			Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub30_1, 2, (byte) 5);
		}
	}

	@OriginalMember(owner = "client!at", name = "aqz", descriptor = "(Lclient!yp;I)V")
	static void method23503(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 2036747717;
		arg0.anInt5778 -= 2036747717;
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
	}

	@OriginalMember(owner = "client!at", name = "bde", descriptor = "(Lclient!yp;I)V")
	static void method23504(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class280.method26853(2010832582);
	}

	@OriginalMember(owner = "client!at", name = "t", descriptor = "(Ljava/lang/String;II)Lclient!abu;")
	public static Class45 method23505(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class45_Sub1 local3 = new Class45_Sub1();
		local3.aString68 = arg0;
		local3.anInt2422 = arg1 * -1767699301;
		return local3;
	}

	@OriginalMember(owner = "client!at", name = "t", descriptor = "(I)[Lclient!xn;")
	static Class666[] method23506(@OriginalArg(0) int arg0) {
		return new Class666[] { Class666.aClass666_6, Class666.aClass666_3, Class666.aClass666_15, Class666.aClass666_5, Class666.aClass666_11, Class666.aClass666_10, Class666.aClass666_2, Class666.aClass666_4, Class666.aClass666_7, Class666.aClass666_12, Class666.aClass666_9, Class666.aClass666_1, Class666.aClass666_14, Class666.aClass666_13, Class666.aClass666_8 };
	}

	@OriginalMember(owner = "client!at", name = "aa", descriptor = "(Lclient!di;S)V")
	static void method23507(@OriginalArg(0) Class102 arg0, @OriginalArg(1) short arg1) {
		if (Class630.anInt5553 * 721317679 < 2 && !client.aBoolean728 || client.aClass327_8 != null) {
			return;
		}
		@Pc(34) String local34;
		if (client.aBoolean728 && Class630.anInt5553 * 721317679 < 2) {
			local34 = client.aString149 + Class60.aClass60_141.method1180(Class512.aClass719_3, 74476571) + client.aString146 + " " + Class256.aString158;
		} else if (Class714.method37211((byte) 84) && Class630.anInt5553 * 721317679 > 2) {
			local34 = Class665.method33451(Class630.aClass80_Sub1_Sub11_4, (byte) 8);
		} else {
			@Pc(50) Class80_Sub1_Sub11 local50 = Class630.aClass80_Sub1_Sub11_4;
			if (local50 == null) {
				return;
			}
			local34 = Class665.method33451(local50, (byte) 8);
			@Pc(62) int[] local62 = Class357.method28122(local50, 107738214);
			if (local62 != null) {
				local34 = local34 + Class279.method26846(local62, -350539333);
			}
		}
		if (Class630.anInt5553 * 721317679 > 2) {
			local34 = local34 + Class90.method1870(16777215, -1747088169) + " / " + (Class630.anInt5553 * 721317679 - 2) + Class60.aClass60_115.method1180(Class512.aClass719_3, -917587948);
		}
		if (Class630.aClass327_13 == null) {
			return;
		}
		@Pc(113) Class104 local113 = Class630.aClass327_13.method27635(Class317.aClass464_1, client.anInterface49_1, (byte) 108);
		if (local113 == null) {
			local113 = Class8.aClass104_1;
		}
		local113.method7637(local34, Class630.anInt5558 * -1686046855, Class630.anInt5559 * -9767145, Class630.aClass327_13.anInt4103 * 1892149809, Class630.aClass327_13.anInt4104 * 1990157877, Class630.aClass327_13.anInt4114 * 671136973, Class630.aClass327_13.anInt4096 * -449602255, Class630.aClass327_13.anInt4149 * 1280669649, Class630.aClass327_13.anInt4150 * -1409337839, client.aRandom2, Class622.anInt5488, client.anIntArray319, Class344.aClass99Array6, null, -178223731);
		Class312.method27468(client.anIntArray319[0], client.anIntArray319[1], client.anIntArray319[2], client.anIntArray319[3], -136798746);
	}

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "()V")
	Class171() throws Throwable {
		throw new Error();
	}
}
