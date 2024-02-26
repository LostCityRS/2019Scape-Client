package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agi")
public final class Class103_Sub13 extends Class103 {

	@OriginalMember(owner = "client!agi", name = "f", descriptor = "I")
	final int anInt956;

	@OriginalMember(owner = "client!agi", name = "e", descriptor = "I")
	final int anInt955;

	@OriginalMember(owner = "client!agi", name = "jt", descriptor = "(III)V")
	static void method7939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class27.anInt85 = arg0 * -1198271169;
		Class27.anInt88 = arg1 * -2069609469;
		Class27.aBoolean15 = false;
		Class677.method33597((short) -6735);
	}

	@OriginalMember(owner = "client!agi", name = "bh", descriptor = "(Lclient!aqc;ZB)V")
	static void method7940(@OriginalArg(0) Class120_Sub1_Sub1_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2) {
		if (Class630.anInt5553 * 721317679 >= 414) {
			return;
		}
		if (arg0 != Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3) {
			@Pc(175) String local175;
			@Pc(64) boolean local64;
			@Pc(95) int local95;
			if (arg0.anInt2713 * -2143684251 == 0) {
				local64 = true;
				if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anInt2712 * 2105065319 != -1 && arg0.anInt2712 * 2105065319 != -1) {
					local95 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anInt2712 * 2105065319 < arg0.anInt2712 * 2105065319 ? Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anInt2712 * 2105065319 : arg0.anInt2712 * 2105065319;
					@Pc(105) int local105 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anInt2709 * -2012525865 - arg0.anInt2709 * -2012525865;
					if (local105 < 0) {
						local105 = -local105;
					}
					if (local105 > local95) {
						local64 = false;
					}
				}
				@Pc(128) String local128 = client.aClass722_4 == Class722.aClass722_6 ? Class60.aClass60_56.method1180(Class512.aClass719_3, -612972241) : Class60.aClass60_136.method1180(Class512.aClass719_3, -360233064);
				if (arg0.anInt2709 * -2012525865 >= arg0.anInt2711 * 23647699) {
					local175 = arg0.method19057(true, -394962924) + (local64 ? Class292.method26948(arg0.anInt2709 * -2012525865, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anInt2709 * -2012525865, -1748160575) : Class90.method1870(16777215, -1305906155)) + Class256.aString162 + local128 + arg0.anInt2709 * -2012525865 + Class256.aString160;
				} else {
					local175 = arg0.method19057(true, -394962924) + (local64 ? Class292.method26948(arg0.anInt2709 * -2012525865, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anInt2709 * -2012525865, 1709795370) : Class90.method1870(16777215, -1085702398)) + Class256.aString162 + local128 + arg0.anInt2709 * -2012525865 + "+" + (arg0.anInt2711 * 23647699 - arg0.anInt2709 * -2012525865) + Class256.aString160;
				}
			} else if (arg0.anInt2713 * -2143684251 == -1) {
				local175 = arg0.method19057(true, -394962924);
			} else {
				local175 = arg0.method19057(true, -394962924) + Class256.aString162 + Class60.aClass60_137.method1180(Class512.aClass719_3, 1624151297) + arg0.anInt2713 * -2143684251 + Class256.aString160;
			}
			local64 = false;
			if (arg0.aClass672_1 != null && arg0.aClass672_1.anInt5712 * 1260077339 != -1) {
				@Pc(285) Class335 local285 = (Class335) Class460.aClass41_Sub2_1.method18054(arg0.aClass672_1.anInt5712 * 1260077339, -1748107705);
				if (local285.aBoolean829) {
					local64 = true;
					local175 = ((Class335) Class460.aClass41_Sub2_1.method18054(arg0.aClass672_1.anInt5712 * 1260077339, -1368625892)).aString188;
					if (local285.anInt4202 * 932927349 != 0) {
						@Pc(320) String local320 = Class722.aClass722_6 == client.aClass722_4 ? Class60.aClass60_56.method1180(Class512.aClass719_3, -1514245276) : Class60.aClass60_136.method1180(Class512.aClass719_3, 392564674);
						local175 = local175 + Class292.method26948(local285.anInt4202 * 932927349, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anInt2709 * -2012525865, -360622547) + Class256.aString162 + local320 + local285.anInt4202 * 932927349 + Class256.aString160;
					}
				}
			}
			if (client.aBoolean728 && !arg1 && (Class542.anInt5121 * -1641097909 & 0x8) != 0) {
				Class360.method28144(client.aString149, client.aString146 + " " + Class256.aString158 + " " + Class90.method1870(16777215, -1189463896) + local175, Class107_Sub1.anInt682 * 582850143, 15, -1, (long) (arg0.anInt2671 * 1078276675), 0, 0, true, false, (long) (arg0.anInt2671 * 1078276675), false, (byte) 114);
			}
			if (!arg1) {
				for (local95 = 7; local95 >= 0; local95--) {
					if (client.aStringArray22[local95] != null) {
						@Pc(414) short local414 = 0;
						if (client.aStringArray22[local95].equalsIgnoreCase(Class60.aClass60_131.method1180(Class512.aClass719_3, 565285418))) {
							if (client.aClass660_1 == Class660.aClass660_6) {
								continue;
							}
							if (Class660.aClass660_5 == client.aClass660_1) {
								local414 = 2000;
							} else if (Class660.aClass660_3 == client.aClass660_1 && arg0.anInt2709 * -2012525865 > Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anInt2709 * -2012525865) {
								local414 = 2000;
							}
							if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anInt2708 * 1960918119 == 0 || arg0.anInt2708 * 1960918119 == 0) {
								if (arg0.aBoolean457) {
									local414 = 2000;
								}
							} else if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anInt2708 * 1960918119 == arg0.anInt2708 * 1960918119) {
								local414 = 2000;
							} else {
								local414 = 0;
							}
						} else if (client.aBooleanArray18[local95]) {
							local414 = 2000;
						}
						@Pc(492) short local492 = (short) (client.aShortArray84[local95] + local414);
						@Pc(505) int local505 = client.anIntArray307[local95] == -1 ? client.anInt3523 * -1653832769 : client.anIntArray307[local95];
						@Pc(511) int local511 = local64 ? 16776960 : 16777215;
						Class360.method28144(client.aStringArray22[local95], Class90.method1870(local511, -900367508) + local175, local505, local492, -1, (long) (arg0.anInt2671 * 1078276675), 0, 0, true, false, (long) (arg0.anInt2671 * 1078276675), false, (byte) 73);
					}
				}
			} else if (!local64) {
				Class360.method28144(Class90.method1870(13421772, -1202419812) + local175, "", -1, -1, 0, 0L, 0, 0, false, true, (long) (arg0.anInt2671 * 1078276675), false, (byte) 61);
			}
			if (!arg1 && !local64) {
				for (@Pc(585) Class80_Sub1_Sub11 local585 = (Class80_Sub1_Sub11) Class630.aClass8_55.method247(129206984); local585 != null; local585 = (Class80_Sub1_Sub11) Class630.aClass8_55.method237(247162863)) {
					if (local585.anInt3079 * 1479399259 == 23) {
						local585.aString107 = Class90.method1870(16777215, -1768638064) + local175;
						break;
					}
				}
			}
		} else if (client.aBoolean728 && (Class542.anInt5121 * -1641097909 & 0x10) != 0) {
			Class360.method28144(client.aString149, client.aString146 + " " + Class256.aString158 + " " + Class90.method1870(16777215, -894729368) + Class60.aClass60_43.method1180(Class512.aClass719_3, -1696447922), Class107_Sub1.anInt682 * 582850143, 16, -1, 0L, 0, 0, true, false, (long) (arg0.anInt2671 * 1078276675), false, (byte) 94);
		}
	}

	@OriginalMember(owner = "client!agi", name = "bch", descriptor = "(Lclient!yp;B)V")
	static void method7941(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		Class267.method26665((Class120_Sub1) arg0.anInterface60_1, arg0, 1607691986);
	}

	@OriginalMember(owner = "client!agi", name = "<init>", descriptor = "(Lclient!ald;)V")
	Class103_Sub13(@OriginalArg(0) Class80_Sub36 arg0) {
		super(arg0);
		this.anInt956 = arg0.method23178((byte) -60) * -845206159;
		this.anInt955 = arg0.method23182(874354044) * -1296310217;
	}

	@OriginalMember(owner = "client!agi", name = "l", descriptor = "()V")
	@Override
	public void method19198() {
		client.anInt3463 = client.anInt3436 * 769322739;
		client.anInt3464 = (client.anInt3436 + this.anInt956 * -1517948015) * 838019321;
		Class605.anInt5392 = client.anInt3482 * 1421413329;
		Class352.anInt4261 = client.anInt3465 * -367152769;
		Class85.anInt283 = client.anInt3466 * -1351153991;
		Class304.anInt3975 = client.anInt3467 * -538021995;
		client.anInt3482 = (this.anInt955 * -1206266489 >>> 24) * 1133036253;
		client.anInt3465 = (this.anInt955 * -1206266489 >>> 16 & 0xFF) * 1123948983;
		client.anInt3466 = (-1206266489 * this.anInt955 >>> 8 & 0xFF) * -979067637;
		client.anInt3467 = (this.anInt955 * -1206266489 & 0xFF) * 1450514745;
	}

	@OriginalMember(owner = "client!agi", name = "f", descriptor = "(I)V")
	@Override
	public void method19206(@OriginalArg(0) int arg0) {
		client.anInt3463 = client.anInt3436 * 769322739;
		client.anInt3464 = (client.anInt3436 + this.anInt956 * -1517948015) * 838019321;
		Class605.anInt5392 = client.anInt3482 * 1421413329;
		Class352.anInt4261 = client.anInt3465 * -367152769;
		Class85.anInt283 = client.anInt3466 * -1351153991;
		Class304.anInt3975 = client.anInt3467 * -538021995;
		client.anInt3482 = (this.anInt955 * -1206266489 >>> 24) * 1133036253;
		client.anInt3465 = (this.anInt955 * -1206266489 >>> 16 & 0xFF) * 1123948983;
		client.anInt3466 = (-1206266489 * this.anInt955 >>> 8 & 0xFF) * -979067637;
		client.anInt3467 = (this.anInt955 * -1206266489 & 0xFF) * 1450514745;
	}

	@OriginalMember(owner = "client!agi", name = "g", descriptor = "()V")
	@Override
	public void method19202() {
		client.anInt3463 = client.anInt3436 * 769322739;
		client.anInt3464 = (client.anInt3436 + this.anInt956 * -1517948015) * 838019321;
		Class605.anInt5392 = client.anInt3482 * 1421413329;
		Class352.anInt4261 = client.anInt3465 * -367152769;
		Class85.anInt283 = client.anInt3466 * -1351153991;
		Class304.anInt3975 = client.anInt3467 * -538021995;
		client.anInt3482 = (this.anInt955 * -1206266489 >>> 24) * 1133036253;
		client.anInt3465 = (this.anInt955 * -1206266489 >>> 16 & 0xFF) * 1123948983;
		client.anInt3466 = (-1206266489 * this.anInt955 >>> 8 & 0xFF) * -979067637;
		client.anInt3467 = (this.anInt955 * -1206266489 & 0xFF) * 1450514745;
	}
}
