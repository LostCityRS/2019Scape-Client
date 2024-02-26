package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqc")
public final class Class120_Sub1_Sub1_Sub1_Sub2 extends Class120_Sub1_Sub1_Sub1 {

	@OriginalMember(owner = "client!aqc", name = "cc", descriptor = "Ljava/lang/String;")
	public String aString73;

	@OriginalMember(owner = "client!aqc", name = "ce", descriptor = "Ljava/lang/String;")
	String aString74;

	@OriginalMember(owner = "client!aqc", name = "cu", descriptor = "I")
	int anInt2710;

	@OriginalMember(owner = "client!aqc", name = "dg", descriptor = "I")
	int anInt2721;

	@OriginalMember(owner = "client!aqc", name = "ch", descriptor = "Ljava/lang/String;")
	public String aString75;

	@OriginalMember(owner = "client!aqc", name = "cj", descriptor = "Lclient!xw;")
	public Class672 aClass672_1;

	@OriginalMember(owner = "client!aqc", name = "cs", descriptor = "B")
	public byte aByte74 = 0;

	@OriginalMember(owner = "client!aqc", name = "ck", descriptor = "[I")
	public int[] anIntArray244 = new int[8];

	@OriginalMember(owner = "client!aqc", name = "ca", descriptor = "[I")
	public int[] anIntArray245 = new int[8];

	@OriginalMember(owner = "client!aqc", name = "cr", descriptor = "I")
	public int anInt2709 = 0;

	@OriginalMember(owner = "client!aqc", name = "ci", descriptor = "I")
	public int anInt2711 = 0;

	@OriginalMember(owner = "client!aqc", name = "cm", descriptor = "I")
	public int anInt2712 = 1713574825;

	@OriginalMember(owner = "client!aqc", name = "cp", descriptor = "I")
	public int anInt2713 = 0;

	@OriginalMember(owner = "client!aqc", name = "cg", descriptor = "I")
	public int anInt2714 = -1297842623;

	@OriginalMember(owner = "client!aqc", name = "cb", descriptor = "Z")
	public boolean aBoolean456 = false;

	@OriginalMember(owner = "client!aqc", name = "cw", descriptor = "I")
	public int anInt2708 = 0;

	@OriginalMember(owner = "client!aqc", name = "cl", descriptor = "I")
	public int anInt2715 = 1107257661;

	@OriginalMember(owner = "client!aqc", name = "cx", descriptor = "I")
	public int anInt2716 = 175953505;

	@OriginalMember(owner = "client!aqc", name = "cf", descriptor = "I")
	public int anInt2717 = -91662919;

	@OriginalMember(owner = "client!aqc", name = "co", descriptor = "I")
	public int anInt2718 = 805826873;

	@OriginalMember(owner = "client!aqc", name = "cz", descriptor = "I")
	public int anInt2719 = 0;

	@OriginalMember(owner = "client!aqc", name = "cq", descriptor = "I")
	public int anInt2720 = -294758081;

	@OriginalMember(owner = "client!aqc", name = "dh", descriptor = "Lclient!gj;")
	public Class289 aClass289_1 = Class289.aClass289_2;

	@OriginalMember(owner = "client!aqc", name = "dd", descriptor = "Lclient!xr;")
	public Class668 aClass668_1 = Class668.aClass668_2;

	@OriginalMember(owner = "client!aqc", name = "dc", descriptor = "Z")
	public boolean aBoolean457 = false;

	@OriginalMember(owner = "client!aqc", name = "t", descriptor = "(ILclient!io;Lclient!ald;I)Lclient!asd;")
	public static Class80_Sub1_Sub13 method19081(@OriginalArg(0) int arg0, @OriginalArg(1) Class344 arg1, @OriginalArg(2) Packet arg2, @OriginalArg(3) int arg3) {
		if (Class344.aClass344_1 == arg1) {
			return new Class80_Sub1_Sub13_Sub2(arg0, arg2);
		} else if (Class344.aClass344_2 == arg1) {
			return new Class80_Sub1_Sub13_Sub1(arg0, arg2);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aqc", name = "<init>", descriptor = "(Lclient!te;I)V")
	public Class120_Sub1_Sub1_Sub1_Sub2(@OriginalArg(0) Class570 arg0, @OriginalArg(1) int arg1) {
		super(arg0, arg1, Class528.aClass2_Sub1_Sub1_3);
		this.method19068(-1218903051);
	}

	@OriginalMember(owner = "client!aqc", name = "<init>", descriptor = "(Lclient!te;)V")
	public Class120_Sub1_Sub1_Sub1_Sub2(@OriginalArg(0) Class570 arg0) {
		super(arg0, Class528.aClass2_Sub1_Sub1_3);
		this.method19068(-1163067395);
	}

	@OriginalMember(owner = "client!aqc", name = "f", descriptor = "(I)I")
	@Override
	public int method18940(@OriginalArg(0) int arg0) {
		return this.anInt2671 * 1078276675;
	}

	@OriginalMember(owner = "client!aqc", name = "cv", descriptor = "(I)Lclient!sq;")
	@Override
	public Class558 method18974(@OriginalArg(0) int arg0) {
		if (this.aClass558_3 != null) {
			if (this.aClass558_3.aString223 == null) {
				return null;
			}
			if (client.anInt3566 * 788343467 == 0 || client.anInt3566 * 788343467 == 3 || client.anInt3566 * 788343467 == 1 && Class586.method31882(this.aString73, 744286081)) {
				return this.aClass558_3;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aqc", name = "hc", descriptor = "(Lclient!ald;BI)V")
	public void method19052(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		this.aByte74 = arg1;
		@Pc(4) int local4 = -1;
		this.anInt2708 = 0;
		@Pc(12) int[] local12 = new int[Class362.aClass651_1.anIntArray512.length];
		@Pc(17) Class49[] local17 = new Class49[Class362.aClass651_1.anIntArray512.length];
		@Pc(22) Class43[] local22 = new Class43[Class362.aClass651_1.anIntArray512.length];
		@Pc(24) int local24;
		@Pc(39) int local39;
		@Pc(50) int local50;
		@Pc(56) int local56;
		@Pc(101) int local101;
		for (local24 = 0; local24 < Class362.aClass651_1.anIntArray512.length; local24++) {
			if (Class362.aClass651_1.anIntArray512[local24] != 1) {
				local39 = arg0.g1();
				if (local39 == 0) {
					local12[local24] = 0;
				} else {
					local50 = arg0.g1();
					local56 = (local39 << 8) + local50;
					if (local24 == 0 && local56 == 65535) {
						local4 = arg0.gSmart2or4null();
						this.anInt2708 = arg0.g1() * -1086578857;
						break;
					}
					if (local56 >= 2048) {
						local56 -= 2048;
						local12[local24] = local56 | 0x40000000;
						local22[local24] = (Class43) Class25.aClass41_Sub9_1.method18054(local56, 1378146892);
						local101 = local22[local24].anInt164 * -1829390975;
						if (local101 != 0) {
							this.anInt2708 = local101 * -1086578857;
						}
					} else {
						local12[local24] = local56 - 256 | Integer.MIN_VALUE;
					}
				}
			}
		}
		if (local4 == -1) {
			local24 = arg0.g2();
			local39 = 0;
			for (local50 = 0; local50 < Class362.aClass651_1.anIntArray512.length; local50++) {
				if (Class362.aClass651_1.anIntArray512[local50] == 0) {
					if ((local24 & 0x1 << local39) != 0) {
						local17[local50] = Class489.method30218(local22[local50], arg0, -1102670975);
					}
					local39++;
				}
			}
		}
		@Pc(164) int[] local164 = new int[10];
		for (local39 = 0; local39 < 10; local39++) {
			local50 = arg0.g1();
			if (Class80_Sub41.aShortArrayArrayArray5.length < 1 || local50 < 0 || local50 >= Class80_Sub41.aShortArrayArrayArray5[local39][0].length) {
				local50 = 0;
			}
			local164[local39] = local50;
		}
		@Pc(198) int[] local198 = new int[10];
		for (local50 = 0; local50 < 10; local50++) {
			local56 = arg0.g1();
			if (Class267.aShortArrayArrayArray6.length < 1 || local56 < 0 || local56 >= Class267.aShortArrayArrayArray6[local50][0].length) {
				local56 = 0;
			}
			local198[local50] = local56;
		}
		this.anInt2721 = arg0.g2() * 1617345967;
		if (this.aClass672_1 == null) {
			this.aClass672_1 = new Class672();
		}
		local50 = this.aClass672_1.anInt5712 * 1260077339;
		@Pc(255) int[] local255 = this.aClass672_1.anIntArray518;
		this.aClass672_1.method33553(this.method18970(14174193), local12, local17, local164, local198, this.aByte74 == 1, local4, (byte) 0);
		if (local4 != local50) {
			@Pc(282) Class463 local282 = Class463.method29472(this.method24552().aClass463_61);
			local282.aFloat297 = (this.anIntArray234[0] << 9) + (this.method18966((byte) -117) << 8);
			local282.aFloat296 = (this.anIntArray242[0] << 9) + (this.method18966((byte) -51) << 8);
			this.method24542(local282);
			local282.method29557();
		}
		if (this.anInt2671 * 1078276675 == client.anInt3558 * 188678613 && local255 != null) {
			for (local101 = 0; local101 < local164.length; local101++) {
				if (local255[local101] != local164[local101]) {
					Class25.aClass41_Sub9_1.method17333(-1258993030);
					break;
				}
			}
		}
		if (this.aClass658_3 != null) {
			this.aClass658_3.method33251();
		}
		if (!this.aClass6_Sub3_3.method23590(-499060808) || !this.aClass6_Sub3_3.aBoolean429) {
			return;
		}
		@Pc(366) Class621 local366 = this.method18952((byte) -89);
		if (!local366.method32325(this.aClass6_Sub3_3.method23582(-398146242), (byte) 3)) {
			this.aClass6_Sub3_3.method23587(-1, -2060415981);
			this.aClass6_Sub3_3.aBoolean429 = false;
		}
	}

	@OriginalMember(owner = "client!aqc", name = "ho", descriptor = "(Lclient!ald;I)V")
	public void method19053(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		arg0.pos = 0;
		@Pc(6) int local6 = arg0.g1();
		@Pc(11) byte local11 = (byte) (local6 & 0x1);
		@Pc(20) boolean local20 = (local6 & 0x4) != 0;
		@Pc(24) int local24 = super.method18966((byte) -15);
		this.method18984((local6 >> 3 & 0x7) + 1, (byte) 87);
		@Pc(43) boolean local43 = (local6 & 0x40) != 0;
		@Pc(48) Class463 local48 = Class463.method29472(this.method24552().aClass463_61);
		local48.aFloat297 += this.method18966((byte) -10) - local24 << 8;
		local48.aFloat296 += this.method18966((byte) -36) - local24 << 8;
		this.method24542(local48);
		local48.method29557();
		@Pc(100) int local100;
		if (local43) {
			this.anInt2710 = arg0.gSmart1or2() * -1341498785;
			local100 = local11 == 0 ? Class270.aClass647_1.anInt5647 * -1027770465 : Class270.aClass647_1.anInt5648 * -292561851;
			this.aString74 = ((Class50) Class111_Sub1.aClass41_Sub20_1.method18054(local100, -169290446)).method1016(this.anInt2710 * -621248097, -29854779);
		} else {
			this.anInt2710 = 1341498785;
			this.aString74 = null;
		}
		this.aClass668_1 = (Class668) Class80_Sub39.method15030(Class668.method33480((byte) -103), arg0.g1b(), -1837618988);
		if (Class697.aClass697_4 == Class566.aClass697_1 && client.anInt3512 * -780671365 >= 2) {
			this.aClass668_1 = Class668.aClass668_2;
		}
		this.method19052(arg0, local11, 200900610);
		this.aString75 = arg0.gjstr();
		this.aString73 = this.aString75;
		if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 == this) {
			RuntimeException_Sub4.aString124 = this.aString75;
		}
		this.anInt2709 = arg0.g1() * -134919961;
		if (local20) {
			this.anInt2713 = arg0.g2() * -228028307;
			if (this.anInt2713 * -2143684251 == 65535) {
				this.anInt2713 = 228028307;
			}
			this.anInt2711 = this.anInt2709 * -1584480147;
			this.anInt2712 = 1713574825;
		} else {
			this.anInt2713 = 0;
			this.anInt2711 = arg0.g1() * 1094666843;
			this.anInt2712 = arg0.g1() * -1713574825;
			if (this.anInt2712 * 2105065319 == 255) {
				this.anInt2712 = 1713574825;
			}
		}
		local100 = this.anInt2719 * 1327765107;
		this.anInt2719 = arg0.g1() * 1598914235;
		if (this.anInt2719 * 1327765107 == 0) {
			Class243.method26296(this, 86907415);
			return;
		}
		@Pc(244) int local244 = this.anInt2715 * -198686229;
		@Pc(249) int local249 = this.anInt2716 * -1447185825;
		@Pc(254) int local254 = this.anInt2717 * 182837111;
		@Pc(259) int local259 = this.anInt2718 * 799167223;
		@Pc(264) int local264 = this.anInt2720 * -1609127871;
		this.anInt2715 = arg0.g2() * -1107257661;
		this.anInt2716 = arg0.g2() * -175953505;
		this.anInt2717 = arg0.g2() * 91662919;
		this.anInt2718 = arg0.g2() * -805826873;
		this.anInt2720 = arg0.g1() * 184117185;
		if (local100 != this.anInt2719 * 1327765107 || local244 != this.anInt2715 * -198686229 || this.anInt2716 * -1447185825 != local249 || this.anInt2717 * 182837111 != local254 || local259 != this.anInt2718 * 799167223 || this.anInt2720 * -1609127871 != local264) {
			Class15.method421(this, (byte) -25);
		}
	}

	@OriginalMember(owner = "client!aqc", name = "hu", descriptor = "(Lclient!ald;I)V")
	public void method19054(@OriginalArg(0) Packet arg0, @OriginalArg(1) int arg1) {
		arg0.pos = 0;
		@Pc(6) int local6 = arg0.g1();
		for (@Pc(8) int local8 = 0; local8 < this.anIntArray244.length; local8++) {
			if ((local6 & 0x1 << local8) == 0) {
				this.anIntArray244[local8] = -1;
				this.anIntArray245[local8] = -1;
			} else {
				@Pc(23) int local23 = arg0.g1();
				@Pc(27) int local27 = arg0.g2();
				this.anIntArray244[local8] = local23;
				this.anIntArray245[local8] = local27;
			}
		}
	}

	@OriginalMember(owner = "client!aqc", name = "fn", descriptor = "(Lclient!di;I)Lclient!tj;")
	@Override
	Class573 method24571(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass672_1 == null || !this.method19056(arg0, 2048, (byte) 40)) {
			return null;
		}
		@Pc(14) Class471 local14 = arg0.method20813();
		@Pc(17) Class471 local17 = this.method24526();
		@Pc(20) Class457 local20 = this.method24552();
		@Pc(25) int local25 = this.aClass372_8.method28394((byte) 3);
		@Pc(46) Class568 local46 = this.aClass570_23.aClass568ArrayArrayArray1[this.aByte99][(int) local20.aClass463_61.aFloat297 >> 9][(int) local20.aClass463_61.aFloat296 >> 9];
		if (local46 == null || local46.aClass120_Sub1_Sub4_1 == null) {
			this.anInt2681 = (int) ((float) (this.anInt2681 * 1413071081) - (float) (this.anInt2681 * 1413071081) / 10.0F) * -1266739367;
		} else {
			@Pc(60) int local60 = this.anInt2681 * 1413071081 - local46.aClass120_Sub1_Sub4_1.aShort48;
			this.anInt2681 = (int) ((float) (this.anInt2681 * 1413071081) - (float) local60 / 10.0F) * -1266739367;
		}
		local14.method29760(local17);
		local14.method29783(0.0F, (float) (-20 - this.anInt2681 * 1413071081), 0.0F);
		@Pc(110) Class573 local110 = null;
		this.aBoolean454 = false;
		if (Class703.aClass80_Sub37_49.aClass165_Sub17_1.method16165((byte) -30) == 1) {
			@Pc(123) Class621 local123 = this.method18952((byte) -29);
			if (local123.aBoolean933 && (this.aClass672_1.anInt5712 * 1260077339 == -1 || ((Class335) Class460.aClass41_Sub2_1.method18054(this.aClass672_1.anInt5712 * 1260077339, -741176544)).aBoolean823)) {
				@Pc(159) Class6 local159 = this.aClass6_3.method23590(-499060808) && this.aClass6_3.method23589((byte) 98) ? this.aClass6_3 : null;
				@Pc(175) Class6_Sub3 local175 = this.aClass6_Sub3_3.method23590(-499060808) && (!this.aClass6_Sub3_3.aBoolean429 || local159 == null) ? this.aClass6_Sub3_3 : null;
				@Pc(178) short local178 = Class698.aClass638_1.aShort186;
				@Pc(181) byte local181 = Class698.aClass638_1.aByte163;
				if (this.aClass672_1.anInt5712 * 1260077339 != -1) {
					local178 = ((Class335) Class460.aClass41_Sub2_1.method18054(this.aClass672_1.anInt5712 * 1260077339, 1277888762)).aShort167;
					local181 = ((Class335) Class460.aClass41_Sub2_1.method18054(this.aClass672_1.anInt5712 * 1260077339, 1470193972)).aByte134;
				}
				@Pc(212) Class105 local212 = null;
				if (local178 > -1 && Class703.aClass80_Sub37_49.aClass165_Sub2_1.method15861(1423795933) == 1) {
					local212 = Class507.method30514(arg0, local25, this.anInt2680 * -2015931105, this.anInt2679 * -245869181, this.anInt2706 * -1001713671, this.aClass105Array3[0], local178, local181, local175 == null ? local159 : local175, (byte) 1);
				} else {
					local212 = Class315.method27500(arg0, local25, this.anInt2680 * -2015931105, this.anInt2679 * -245869181, this.anInt2706 * -1001713671, 1, this.aClass105Array3[0], 0, 0, 160, 240, local175 == null ? local159 : local175, -1940991829);
				}
				if (local212 != null) {
					if (this.aClass246Array21 == null || this.aClass246Array21.length < this.aClass105Array3.length + 1) {
						this.method24581(this.aClass105Array3.length + 1, (byte) 14);
					}
					local110 = Class454.method29307(true, -55924836);
					this.aBoolean454 = true;
					arg0.method20762(false);
					local212.method7359(local14, this.aClass246Array21[this.aClass105Array3.length], 0);
					arg0.method20762(true);
				}
			}
		}
		@Pc(334) int local334;
		if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 == this) {
			for (local334 = client.aClass101Array1.length - 1; local334 >= 0; local334--) {
				@Pc(340) Class101 local340 = client.aClass101Array1[local334];
				if (local340 != null && local340.anInt462 * 1009747225 != -1) {
					@Pc(382) int local382;
					if (local340.anInt467 * 1614016575 == 1) {
						@Pc(363) Class80_Sub19 local363 = (Class80_Sub19) client.aClass24_18.method560((long) (local340.anInt464 * 1096614689));
						if (local363 != null) {
							@Pc(370) Class120_Sub1_Sub1_Sub1_Sub1 local370 = (Class120_Sub1_Sub1_Sub1_Sub1) local363.anObject5;
							@Pc(378) Class463 local378 = Class463.method29487(local370.method24552().aClass463_61, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method24552().aClass463_61);
							local382 = (int) local378.aFloat297;
							@Pc(386) int local386 = (int) local378.aFloat296;
							this.method19055(arg0, local14, this.aClass105Array3[0], (long) local382, (long) local386, local340.anInt462 * 1009747225, 92160000L);
						}
					}
					if (local340.anInt467 * 1614016575 == 2) {
						@Pc(413) Class463 local413 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method24552().aClass463_61;
						@Pc(423) long local423 = (long) (local340.anInt466 * -191529145 - (int) local413.aFloat297);
						@Pc(433) long local433 = (long) (local340.anInt465 * -1207974023 - (int) local413.aFloat296);
						@Pc(441) long local441 = (long) (local340.anInt460 * -380320871 << 9);
						@Pc(445) long local445 = local441 * local441;
						this.method19055(arg0, local14, this.aClass105Array3[0], local423, local433, local340.anInt462 * 1009747225, local445);
					}
					if (local340.anInt467 * 1614016575 == 10 && local340.anInt464 * 1096614689 >= 0 && local340.anInt464 * 1096614689 < client.aClass120_Sub1_Sub1_Sub1_Sub2Array1.length) {
						@Pc(485) Class120_Sub1_Sub1_Sub1_Sub2 local485 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local340.anInt464 * 1096614689];
						if (local485 != null) {
							@Pc(496) Class463 local496 = Class463.method29487(local485.method24552().aClass463_61, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method24552().aClass463_61);
							@Pc(500) int local500 = (int) local496.aFloat297;
							local382 = (int) local496.aFloat296;
							this.method19055(arg0, local14, this.aClass105Array3[0], (long) local500, (long) local382, local340.anInt462 * 1009747225, 92160000L);
						}
					}
				}
			}
		}
		local14.method29760(local17);
		local14.method29783(0.0F, (float) (-5 - this.anInt2681 * 1413071081), 0.0F);
		if (this.aClass246Array21 == null || this.aClass246Array21.length < this.aClass105Array3.length) {
			this.method24581(this.aClass105Array3.length, (byte) 14);
		}
		if (local110 == null) {
			local110 = Class454.method29307(true, -1519232169);
		}
		this.method18989(arg0, this.aClass105Array3, local14, false, (byte) -27);
		for (local334 = 0; local334 < this.aClass105Array3.length; local334++) {
			if (this.aClass105Array3[local334] == null) {
				this.aClass246Array21[local334].aBoolean773 = false;
			} else {
				this.aClass105Array3[local334].method7359(local14, this.aClass246Array21[local334], Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 == this ? 1 : 0);
			}
		}
		if (this.aClass658_3 != null) {
			@Pc(613) Class221 local613 = this.aClass658_3.method33244();
			arg0.method20964(local613);
		}
		for (local334 = 0; local334 < this.aClass105Array3.length; local334++) {
			if (this.aClass105Array3[local334] != null) {
				this.aBoolean454 |= this.aClass105Array3[local334].method7395();
			}
			this.aClass105Array3[local334] = null;
		}
		this.anInt2693 = client.anInt3496 * 1940875145;
		return local110;
	}

	@OriginalMember(owner = "client!aqc", name = "fz", descriptor = "(Lclient!di;I)Lclient!uc;")
	@Override
	public Class589 method24573(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1) {
		return null;
	}

	@OriginalMember(owner = "client!aqc", name = "ez", descriptor = "()I")
	@Override
	public int method18959() {
		return -1;
	}

	@OriginalMember(owner = "client!aqc", name = "m", descriptor = "()Lclient!akx;")
	@Override
	public Class80_Sub33 method18946() {
		@Pc(3) Class626 local3 = client.aClass539_1.method30893((byte) -17);
		return Class407.method28949(this.aByte99, (int) this.method24552().aClass463_61.aFloat297 + local3.anInt5540 * 1854499328, -((int) this.method24552().aClass463_61.aFloat295), (int) this.method24552().aClass463_61.aFloat296 + local3.anInt5537 * 1677025792, 613074529);
	}

	@OriginalMember(owner = "client!aqc", name = "hd", descriptor = "(Lclient!di;Lclient!ov;Lclient!dn;JJIJ)V")
	void method19055(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) Class105 arg2, @OriginalArg(3) long arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6) {
		@Pc(7) long local7 = arg3 * arg3 + arg4 * arg4;
		if (local7 < 262144L || local7 > arg6) {
			return;
		}
		@Pc(33) int local33 = (int) (Math.atan2((double) arg3, (double) arg4) * 2607.5945876176133D - (double) this.aClass372_8.method28394((byte) 3)) & 0x3FFF;
		@Pc(51) Class105 local51 = Class586.method31885(arg0, local33, this.anInt2680 * -2015931105, this.anInt2679 * -245869181, this.anInt2706 * -1001713671, arg5, -157903963);
		if (local51 != null) {
			arg0.method20762(false);
			local51.method7359(arg1, null, 0);
			arg0.method20762(true);
		}
	}

	@OriginalMember(owner = "client!aqc", name = "hm", descriptor = "(Lclient!di;IB)Z")
	boolean method19056(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		@Pc(1) int local1 = arg1;
		@Pc(5) Class621 local5 = this.method18952((byte) 60);
		@Pc(20) Class6 local20 = this.aClass6_3.method23590(-499060808) && !this.aClass6_3.method23589((byte) 59) ? this.aClass6_3 : null;
		@Pc(40) Class6_Sub3 local40 = !this.aClass6_Sub3_3.method23590(-499060808) || this.aBoolean456 || this.aClass6_Sub3_3.aBoolean429 && local20 != null ? null : this.aClass6_Sub3_3;
		@Pc(45) int local45 = local5.anInt5464 * -1053924669;
		@Pc(50) int local50 = local5.anInt5459 * -635285373;
		if (local45 != 0 || local50 != 0 || local5.anInt5467 * 73788751 != 0 || local5.anInt5466 * -1192955301 != 0) {
			arg1 |= 0x7;
		}
		@Pc(76) int local76 = this.aClass372_8.method28394((byte) 3);
		@Pc(96) boolean local96 = this.aByte73 != 0 && client.anInt3436 >= this.anInt2698 * 1134746577 && client.anInt3436 < this.anInt2692 * -691507419;
		if (local96) {
			arg1 |= 0x80000;
		}
		@Pc(129) Class105 local129 = this.aClass105Array3[0] = this.aClass672_1.method33540(arg0, arg1, Class533.aClass41_Sub18_1, Class80_Sub1_Sub15.aClass41_Sub14_4, Class460.aClass41_Sub2_1, Class25.aClass41_Sub9_1, Class672.aClass134_1, Class672.aClass134_1, local20, local40, this.aClass6_Sub1_Sub1Array3, this.anIntArray235, local76, true, Class362.aClass651_1, -1942893973);
		@Pc(132) int local132 = Class490.method30235((byte) -16);
		if (Class554.anInt3423 * -2024030715 < 96 && local132 > 50) {
			Class378.method28538(2132451241);
		}
		if (Class697.aClass697_4 != Class566.aClass697_1 && local132 < 50) {
			@Pc(152) int local152 = 50 - local132;
			while (local152 > client.anInt3435 * 2101928151) {
				Class103_Sub2.aByteArrayArray9[client.anInt3435 * 2101928151] = new byte[102400];
				client.anInt3435 += -2076044569;
			}
			while (local152 < client.anInt3435 * 2101928151) {
				client.anInt3435 -= -2076044569;
				Class103_Sub2.aByteArrayArray9[client.anInt3435 * 2101928151] = null;
			}
		} else if (Class697.aClass697_4 != Class566.aClass697_1) {
			Class103_Sub2.aByteArrayArray9 = new byte[50][];
			client.anInt3435 = 0;
		}
		if (local129 == null) {
			return false;
		}
		this.anInt2674 = local129.method7366() * -527958611;
		this.anInt2699 = local129.method7390() * -807746119;
		local129.method7501();
		this.method18983(local129, (byte) 80);
		if (local45 == 0 && local50 == 0) {
			this.method18969(local76, this.method18966((byte) -14) << 9, this.method18966((byte) -70) << 9, 0, 0, 1863007926);
		} else {
			this.method18969(local76, local45, local50, local5.anInt5460 * 979112709, local5.anInt5461 * 381253511, 948639322);
			if (this.anInt2680 * -2015931105 != 0) {
				local129.method7330(this.anInt2680 * -2015931105);
			}
			if (this.anInt2679 * -245869181 != 0) {
				local129.method7318(this.anInt2679 * -245869181);
			}
			if (this.anInt2706 * -1001713671 != 0) {
				local129.method7332(0, this.anInt2706 * -1001713671, 0);
			}
		}
		if (local96) {
			local129.method7380(this.aByte70, this.aByte71, this.aByte72, this.aByte73 & 0xFF);
		}
		if (!this.aBoolean456) {
			this.method19018(arg0, local5, local1, local45, local50, local76, (byte) -23);
		}
		return true;
	}

	@OriginalMember(owner = "client!aqc", name = "hl", descriptor = "(ZI)Ljava/lang/String;")
	public String method19057(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(7) String local7 = arg0 ? this.aString75 : this.aString73;
		return this.aString74 == null ? local7 : this.aString74.replaceAll(Class256.aString163, local7);
	}

	@OriginalMember(owner = "client!aqc", name = "hb", descriptor = "(IIBB)V")
	public void method19058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) byte arg3) {
		if (this.aClass6_3.method23590(-499060808) && this.aClass6_3.method23581((byte) 67).anInt3896 * -1996482375 == 1) {
			this.anIntArray240 = null;
			this.aClass6_3.method23587(-1, -2060415981);
		}
		for (@Pc(23) int local23 = 0; local23 < this.aClass561Array3.length; local23++) {
			if (this.aClass561Array3[local23].anInt5188 * -2124314403 != -1) {
				@Pc(49) Class684 local49 = (Class684) Class104_Sub2.aClass41_Sub16_1.method18054(this.aClass561Array3[local23].anInt5188 * -2124314403, -1323667519);
				if (local49.aBoolean986 && local49.anInt5764 * 319211597 != -1 && ((Class261) Class125.aClass41_Sub1_6.method18054(local49.anInt5764 * 319211597, 1157597147)).anInt3896 * -1996482375 == 1) {
					this.aClass561Array3[local23].aClass6_9.method23587(-1, -2060415981);
					this.aClass561Array3[local23].anInt5188 = -1389203317;
				}
			}
		}
		this.anInt2714 = -1297842623;
		if (arg0 < 0 || arg0 >= client.aClass539_1.method30921(2044590670) || arg1 < 0 || arg1 >= client.aClass539_1.method31011(-1935353478)) {
			this.method19063(arg0, arg1, (byte) 3);
		} else if (this.anIntArray234[0] >= 0 && this.anIntArray234[0] < client.aClass539_1.method30921(1955229001) && this.anIntArray242[0] >= 0 && this.anIntArray242[0] < client.aClass539_1.method31011(-1561598273)) {
			this.method19059(arg0, arg1, arg2, (short) -8087);
		} else {
			this.method19063(arg0, arg1, (byte) 3);
		}
	}

	@OriginalMember(owner = "client!aqc", name = "ff", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24598(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aqc", name = "hi", descriptor = "(IIBS)V")
	void method19059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) short arg3) {
		if (this.anInt2700 * 1679797067 < this.anIntArray234.length - 1) {
			this.anInt2700 += -1307113885;
		}
		for (@Pc(20) int local20 = this.anInt2700 * 1679797067; local20 > 0; local20--) {
			this.anIntArray234[local20] = this.anIntArray234[local20 - 1];
			this.anIntArray242[local20] = this.anIntArray242[local20 - 1];
			this.aByteArray49[local20] = this.aByteArray49[local20 - 1];
		}
		this.anIntArray234[0] = arg0;
		this.anIntArray242[0] = arg1;
		this.aByteArray49[0] = arg2;
	}

	@OriginalMember(owner = "client!aqc", name = "ge", descriptor = "()V")
	@Override
	void method24590() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aqc", name = "b", descriptor = "(B)I")
	@Override
	public int method18966(@OriginalArg(0) byte arg0) {
		return this.aClass672_1 == null || this.aClass672_1.anInt5712 * 1260077339 == -1 ? super.method18966((byte) -94) : ((Class335) Class460.aClass41_Sub2_1.method18054(this.aClass672_1.anInt5712 * 1260077339, 473823336)).anInt4212 * 1573297955;
	}

	@OriginalMember(owner = "client!aqc", name = "bm", descriptor = "(I)I")
	@Override
	int method18970(@OriginalArg(0) int arg0) {
		return this.anInt2721 * -666322609;
	}

	@OriginalMember(owner = "client!aqc", name = "gh", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24600(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aqc", name = "fw", descriptor = "(Lclient!di;III)Z")
	@Override
	boolean method24583(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass672_1 == null || !this.method19056(arg0, 131072, (byte) 40)) {
			return false;
		}
		@Pc(14) Class471 local14 = this.method24526();
		@Pc(16) boolean local16 = false;
		@Pc(18) int local18;
		for (local18 = 0; local18 < this.aClass105Array3.length; local18++) {
			if (this.aClass105Array3[local18] != null && this.aClass105Array3[local18].aBoolean173 && this.aClass105Array3[local18].method7360(arg1, arg2, local14, true, 0)) {
				local16 = true;
				break;
			}
		}
		for (local18 = 0; local18 < this.aClass105Array3.length; local18++) {
			this.aClass105Array3[local18] = null;
		}
		return local16;
	}

	@OriginalMember(owner = "client!aqc", name = "fo", descriptor = "(B)Z")
	@Override
	boolean method24566(@OriginalArg(0) byte arg0) {
		return false;
	}

	@OriginalMember(owner = "client!aqc", name = "io", descriptor = "(Lclient!di;Lclient!ov;Lclient!dn;JJIJ)V")
	void method19060(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) Class105 arg2, @OriginalArg(3) long arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6) {
		@Pc(7) long local7 = arg3 * arg3 + arg4 * arg4;
		if (local7 < 262144L || local7 > arg6) {
			return;
		}
		@Pc(33) int local33 = (int) (Math.atan2((double) arg3, (double) arg4) * 2607.5945876176133D - (double) this.aClass372_8.method28394((byte) 3)) & 0x3FFF;
		@Pc(51) Class105 local51 = Class586.method31885(arg0, local33, this.anInt2680 * -2015931105, this.anInt2679 * -245869181, this.anInt2706 * -1001713671, arg5, -1730301625);
		if (local51 != null) {
			arg0.method20762(false);
			local51.method7359(arg1, null, 0);
			arg0.method20762(true);
		}
	}

	@OriginalMember(owner = "client!aqc", name = "k", descriptor = "()Lclient!on;")
	@Override
	public Class463 method18939() {
		return Class463.method29470();
	}

	@OriginalMember(owner = "client!aqc", name = "cd", descriptor = "(B)Z")
	@Override
	public boolean method18973(@OriginalArg(0) byte arg0) {
		return Class698.aClass638_1.aBoolean962;
	}

	@OriginalMember(owner = "client!aqc", name = "hz", descriptor = "(I)Z")
	public boolean method19061(@OriginalArg(0) int arg0) {
		return this.aClass672_1 != null;
	}

	@OriginalMember(owner = "client!aqc", name = "ia", descriptor = "(Ljava/lang/String;IIB)V")
	public void method19062(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		this.method18975(arg0, arg1, arg2, Class165_Sub11.method16047((byte) -95) * -2074823537 * Class698.aClass638_1.anInt5616, (short) -3198);
	}

	@OriginalMember(owner = "client!aqc", name = "t", descriptor = "(I)Lclient!jk;")
	@Override
	public Class362 method18947(@OriginalArg(0) int arg0) {
		return Class362.aClass362_1;
	}

	@OriginalMember(owner = "client!aqc", name = "gk", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24602(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aqc", name = "e", descriptor = "(B)Lclient!akx;")
	@Override
	public Class80_Sub33 method18941(@OriginalArg(0) byte arg0) {
		@Pc(3) Class626 local3 = client.aClass539_1.method30893((byte) -126);
		return Class407.method28949(this.aByte99, (int) this.method24552().aClass463_61.aFloat297 + local3.anInt5540 * 1854499328, -((int) this.method24552().aClass463_61.aFloat295), (int) this.method24552().aClass463_61.aFloat296 + local3.anInt5537 * 1677025792, 2072908670);
	}

	@OriginalMember(owner = "client!aqc", name = "hs", descriptor = "(IIB)V")
	public void method19063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		this.anInt2700 = 0;
		this.anInt2702 = 0;
		this.anInt2678 = 0;
		this.anIntArray234[0] = arg0;
		this.anIntArray242[0] = arg1;
		@Pc(22) int local22 = this.method18966((byte) -112);
		@Pc(27) Class463 local27 = Class463.method29472(this.method24552().aClass463_61);
		local27.aFloat297 = this.anIntArray234[0] * 512 + local22 * 256;
		local27.aFloat296 = local22 * 256 + this.anIntArray242[0] * 512;
		this.method24542(local27);
		local27.method29557();
		if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 == this) {
			client.aClass539_1.method30904((byte) -18).method33382(397884975);
		}
		if (this.aClass658_3 != null) {
			this.aClass658_3.method33251();
		}
	}

	@OriginalMember(owner = "client!aqc", name = "u", descriptor = "(I)Lclient!oq;")
	@Override
	public Class466 method18942(@OriginalArg(0) int arg0) {
		@Pc(1) Class466 local1 = Class466.method29640();
		local1.method29650(Class467.method29716(this.aClass372_8.anInt4506 * 1783746791), 0.0F, 0.0F);
		return local1;
	}

	@OriginalMember(owner = "client!aqc", name = "iu", descriptor = "(Z)Ljava/lang/String;")
	public String method19064(@OriginalArg(0) boolean arg0) {
		return arg0 ? this.aString75 : this.aString73;
	}

	@OriginalMember(owner = "client!aqc", name = "g", descriptor = "()Lclient!jk;")
	@Override
	public Class362 method18944() {
		return Class362.aClass362_1;
	}

	@OriginalMember(owner = "client!aqc", name = "i", descriptor = "()I")
	@Override
	public int method18945() {
		return this.anInt2671 * 1078276675;
	}

	@OriginalMember(owner = "client!aqc", name = "ce", descriptor = "(B)I")
	@Override
	public int method18987(@OriginalArg(0) byte arg0) {
		return -(this.anInt2671 * 1078276675) - 1;
	}

	@OriginalMember(owner = "client!aqc", name = "fh", descriptor = "(Lclient!di;B)V")
	@Override
	void method24572(@OriginalArg(0) Class102 arg0, @OriginalArg(1) byte arg1) {
		if (this.aClass672_1 == null || !this.aBoolean455 && !this.method19056(arg0, 0, (byte) 40)) {
			return;
		}
		@Pc(16) Class471 local16 = arg0.method20813();
		local16.method29761(this.method24552());
		local16.method29783(0.0F, -5.0F, 0.0F);
		this.method18989(arg0, this.aClass105Array3, local16, this.aBoolean455, (byte) -50);
		for (@Pc(36) int local36 = 0; local36 < this.aClass105Array3.length; local36++) {
			this.aClass105Array3[local36] = null;
		}
	}

	@OriginalMember(owner = "client!aqc", name = "fb", descriptor = "(I)V")
	@Override
	void method24570(@OriginalArg(0) int arg0) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aqc", name = "j", descriptor = "()Lclient!akx;")
	@Override
	public Class80_Sub33 method18948() {
		@Pc(3) Class626 local3 = client.aClass539_1.method30893((byte) -99);
		return Class407.method28949(this.aByte99, (int) this.method24552().aClass463_61.aFloat297 + local3.anInt5540 * 1854499328, -((int) this.method24552().aClass463_61.aFloat295), (int) this.method24552().aClass463_61.aFloat296 + local3.anInt5537 * 1677025792, -203733681);
	}

	@OriginalMember(owner = "client!aqc", name = "in", descriptor = "(Lclient!ald;)V")
	public void method19065(@OriginalArg(0) Packet arg0) {
		arg0.pos = 0;
		@Pc(6) int local6 = arg0.g1();
		@Pc(11) byte local11 = (byte) (local6 & 0x1);
		@Pc(20) boolean local20 = (local6 & 0x4) != 0;
		@Pc(24) int local24 = super.method18966((byte) -32);
		this.method18984((local6 >> 3 & 0x7) + 1, (byte) 18);
		@Pc(43) boolean local43 = (local6 & 0x40) != 0;
		@Pc(48) Class463 local48 = Class463.method29472(this.method24552().aClass463_61);
		local48.aFloat297 += this.method18966((byte) -84) - local24 << 8;
		local48.aFloat296 += this.method18966((byte) -54) - local24 << 8;
		this.method24542(local48);
		local48.method29557();
		@Pc(100) int local100;
		if (local43) {
			this.anInt2710 = arg0.gSmart1or2() * -1341498785;
			local100 = local11 == 0 ? Class270.aClass647_1.anInt5647 * -1027770465 : Class270.aClass647_1.anInt5648 * -292561851;
			this.aString74 = ((Class50) Class111_Sub1.aClass41_Sub20_1.method18054(local100, 746780567)).method1016(this.anInt2710 * -621248097, -257538656);
		} else {
			this.anInt2710 = 1341498785;
			this.aString74 = null;
		}
		this.aClass668_1 = (Class668) Class80_Sub39.method15030(Class668.method33480((byte) -94), arg0.g1b(), -1575323306);
		if (Class697.aClass697_4 == Class566.aClass697_1 && client.anInt3512 * -780671365 >= 2) {
			this.aClass668_1 = Class668.aClass668_2;
		}
		this.method19052(arg0, local11, 200900610);
		this.aString75 = arg0.gjstr();
		this.aString73 = this.aString75;
		if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 == this) {
			RuntimeException_Sub4.aString124 = this.aString75;
		}
		this.anInt2709 = arg0.g1() * -134919961;
		if (local20) {
			this.anInt2713 = arg0.g2() * -228028307;
			if (this.anInt2713 * -2143684251 == 65535) {
				this.anInt2713 = 228028307;
			}
			this.anInt2711 = this.anInt2709 * -1584480147;
			this.anInt2712 = 1713574825;
		} else {
			this.anInt2713 = 0;
			this.anInt2711 = arg0.g1() * 1094666843;
			this.anInt2712 = arg0.g1() * -1713574825;
			if (this.anInt2712 * 2105065319 == 255) {
				this.anInt2712 = 1713574825;
			}
		}
		local100 = this.anInt2719 * 1327765107;
		this.anInt2719 = arg0.g1() * 1598914235;
		if (this.anInt2719 * 1327765107 == 0) {
			Class243.method26296(this, -1707786219);
			return;
		}
		@Pc(244) int local244 = this.anInt2715 * -198686229;
		@Pc(249) int local249 = this.anInt2716 * -1447185825;
		@Pc(254) int local254 = this.anInt2717 * 182837111;
		@Pc(259) int local259 = this.anInt2718 * 799167223;
		@Pc(264) int local264 = this.anInt2720 * -1609127871;
		this.anInt2715 = arg0.g2() * -1107257661;
		this.anInt2716 = arg0.g2() * -175953505;
		this.anInt2717 = arg0.g2() * 91662919;
		this.anInt2718 = arg0.g2() * -805826873;
		this.anInt2720 = arg0.g1() * 184117185;
		if (local100 != this.anInt2719 * 1327765107 || local244 != this.anInt2715 * -198686229 || this.anInt2716 * -1447185825 != local249 || this.anInt2717 * 182837111 != local254 || local259 != this.anInt2718 * 799167223 || this.anInt2720 * -1609127871 != local264) {
			Class15.method421(this, (byte) -2);
		}
	}

	@OriginalMember(owner = "client!aqc", name = "dz", descriptor = "()I")
	@Override
	public int method18965() {
		return this.aClass672_1 == null || this.aClass672_1.anInt5712 * 1260077339 == -1 ? super.method18966((byte) -93) : ((Class335) Class460.aClass41_Sub2_1.method18054(this.aClass672_1.anInt5712 * 1260077339, 1587556501)).anInt4212 * 1573297955;
	}

	@OriginalMember(owner = "client!aqc", name = "fd", descriptor = "(Lclient!di;)Lclient!uc;")
	@Override
	public Class589 method24589(@OriginalArg(0) Class102 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aqc", name = "fc", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24592(@OriginalArg(0) Class102 arg0) {
		if (this.aClass672_1 == null || !this.method19056(arg0, 2048, (byte) 40)) {
			return null;
		}
		@Pc(14) Class471 local14 = arg0.method20813();
		@Pc(17) Class471 local17 = this.method24526();
		@Pc(20) Class457 local20 = this.method24552();
		@Pc(25) int local25 = this.aClass372_8.method28394((byte) 3);
		@Pc(46) Class568 local46 = this.aClass570_23.aClass568ArrayArrayArray1[this.aByte99][(int) local20.aClass463_61.aFloat297 >> 9][(int) local20.aClass463_61.aFloat296 >> 9];
		if (local46 == null || local46.aClass120_Sub1_Sub4_1 == null) {
			this.anInt2681 = (int) ((float) (this.anInt2681 * 1413071081) - (float) (this.anInt2681 * 1413071081) / 10.0F) * -1266739367;
		} else {
			@Pc(60) int local60 = this.anInt2681 * 1413071081 - local46.aClass120_Sub1_Sub4_1.aShort48;
			this.anInt2681 = (int) ((float) (this.anInt2681 * 1413071081) - (float) local60 / 10.0F) * -1266739367;
		}
		local14.method29760(local17);
		local14.method29783(0.0F, (float) (-20 - this.anInt2681 * 1413071081), 0.0F);
		@Pc(110) Class573 local110 = null;
		this.aBoolean454 = false;
		if (Class703.aClass80_Sub37_49.aClass165_Sub17_1.method16165((byte) -83) == 1) {
			@Pc(123) Class621 local123 = this.method18952((byte) -57);
			if (local123.aBoolean933 && (this.aClass672_1.anInt5712 * 1260077339 == -1 || ((Class335) Class460.aClass41_Sub2_1.method18054(this.aClass672_1.anInt5712 * 1260077339, 749712487)).aBoolean823)) {
				@Pc(159) Class6 local159 = this.aClass6_3.method23590(-499060808) && this.aClass6_3.method23589((byte) 98) ? this.aClass6_3 : null;
				@Pc(175) Class6_Sub3 local175 = this.aClass6_Sub3_3.method23590(-499060808) && (!this.aClass6_Sub3_3.aBoolean429 || local159 == null) ? this.aClass6_Sub3_3 : null;
				@Pc(178) short local178 = Class698.aClass638_1.aShort186;
				@Pc(181) byte local181 = Class698.aClass638_1.aByte163;
				if (this.aClass672_1.anInt5712 * 1260077339 != -1) {
					local178 = ((Class335) Class460.aClass41_Sub2_1.method18054(this.aClass672_1.anInt5712 * 1260077339, 982332985)).aShort167;
					local181 = ((Class335) Class460.aClass41_Sub2_1.method18054(this.aClass672_1.anInt5712 * 1260077339, -327932614)).aByte134;
				}
				@Pc(212) Class105 local212 = null;
				if (local178 > -1 && Class703.aClass80_Sub37_49.aClass165_Sub2_1.method15861(1423795933) == 1) {
					local212 = Class507.method30514(arg0, local25, this.anInt2680 * -2015931105, this.anInt2679 * -245869181, this.anInt2706 * -1001713671, this.aClass105Array3[0], local178, local181, local175 == null ? local159 : local175, (byte) 1);
				} else {
					local212 = Class315.method27500(arg0, local25, this.anInt2680 * -2015931105, this.anInt2679 * -245869181, this.anInt2706 * -1001713671, 1, this.aClass105Array3[0], 0, 0, 160, 240, local175 == null ? local159 : local175, -210108756);
				}
				if (local212 != null) {
					if (this.aClass246Array21 == null || this.aClass246Array21.length < this.aClass105Array3.length + 1) {
						this.method24581(this.aClass105Array3.length + 1, (byte) 14);
					}
					local110 = Class454.method29307(true, -1729562496);
					this.aBoolean454 = true;
					arg0.method20762(false);
					local212.method7359(local14, this.aClass246Array21[this.aClass105Array3.length], 0);
					arg0.method20762(true);
				}
			}
		}
		@Pc(334) int local334;
		if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 == this) {
			for (local334 = client.aClass101Array1.length - 1; local334 >= 0; local334--) {
				@Pc(340) Class101 local340 = client.aClass101Array1[local334];
				if (local340 != null && local340.anInt462 * 1009747225 != -1) {
					@Pc(382) int local382;
					if (local340.anInt467 * 1614016575 == 1) {
						@Pc(363) Class80_Sub19 local363 = (Class80_Sub19) client.aClass24_18.method560((long) (local340.anInt464 * 1096614689));
						if (local363 != null) {
							@Pc(370) Class120_Sub1_Sub1_Sub1_Sub1 local370 = (Class120_Sub1_Sub1_Sub1_Sub1) local363.anObject5;
							@Pc(378) Class463 local378 = Class463.method29487(local370.method24552().aClass463_61, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method24552().aClass463_61);
							local382 = (int) local378.aFloat297;
							@Pc(386) int local386 = (int) local378.aFloat296;
							this.method19055(arg0, local14, this.aClass105Array3[0], (long) local382, (long) local386, local340.anInt462 * 1009747225, 92160000L);
						}
					}
					if (local340.anInt467 * 1614016575 == 2) {
						@Pc(413) Class463 local413 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method24552().aClass463_61;
						@Pc(423) long local423 = (long) (local340.anInt466 * -191529145 - (int) local413.aFloat297);
						@Pc(433) long local433 = (long) (local340.anInt465 * -1207974023 - (int) local413.aFloat296);
						@Pc(441) long local441 = (long) (local340.anInt460 * -380320871 << 9);
						@Pc(445) long local445 = local441 * local441;
						this.method19055(arg0, local14, this.aClass105Array3[0], local423, local433, local340.anInt462 * 1009747225, local445);
					}
					if (local340.anInt467 * 1614016575 == 10 && local340.anInt464 * 1096614689 >= 0 && local340.anInt464 * 1096614689 < client.aClass120_Sub1_Sub1_Sub1_Sub2Array1.length) {
						@Pc(485) Class120_Sub1_Sub1_Sub1_Sub2 local485 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local340.anInt464 * 1096614689];
						if (local485 != null) {
							@Pc(496) Class463 local496 = Class463.method29487(local485.method24552().aClass463_61, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method24552().aClass463_61);
							@Pc(500) int local500 = (int) local496.aFloat297;
							local382 = (int) local496.aFloat296;
							this.method19055(arg0, local14, this.aClass105Array3[0], (long) local500, (long) local382, local340.anInt462 * 1009747225, 92160000L);
						}
					}
				}
			}
		}
		local14.method29760(local17);
		local14.method29783(0.0F, (float) (-5 - this.anInt2681 * 1413071081), 0.0F);
		if (this.aClass246Array21 == null || this.aClass246Array21.length < this.aClass105Array3.length) {
			this.method24581(this.aClass105Array3.length, (byte) 14);
		}
		if (local110 == null) {
			local110 = Class454.method29307(true, 284312824);
		}
		this.method18989(arg0, this.aClass105Array3, local14, false, (byte) -76);
		for (local334 = 0; local334 < this.aClass105Array3.length; local334++) {
			if (this.aClass105Array3[local334] == null) {
				this.aClass246Array21[local334].aBoolean773 = false;
			} else {
				this.aClass105Array3[local334].method7359(local14, this.aClass246Array21[local334], Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 == this ? 1 : 0);
			}
		}
		if (this.aClass658_3 != null) {
			@Pc(613) Class221 local613 = this.aClass658_3.method33244();
			arg0.method20964(local613);
		}
		for (local334 = 0; local334 < this.aClass105Array3.length; local334++) {
			if (this.aClass105Array3[local334] != null) {
				this.aBoolean454 |= this.aClass105Array3[local334].method7395();
			}
			this.aClass105Array3[local334] = null;
		}
		this.anInt2693 = client.anInt3496 * 1940875145;
		return local110;
	}

	@OriginalMember(owner = "client!aqc", name = "fl", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24597(@OriginalArg(0) Class102 arg0) {
		if (this.aClass672_1 == null || !this.method19056(arg0, 2048, (byte) 40)) {
			return null;
		}
		@Pc(14) Class471 local14 = arg0.method20813();
		@Pc(17) Class471 local17 = this.method24526();
		@Pc(20) Class457 local20 = this.method24552();
		@Pc(25) int local25 = this.aClass372_8.method28394((byte) 3);
		@Pc(46) Class568 local46 = this.aClass570_23.aClass568ArrayArrayArray1[this.aByte99][(int) local20.aClass463_61.aFloat297 >> 9][(int) local20.aClass463_61.aFloat296 >> 9];
		if (local46 == null || local46.aClass120_Sub1_Sub4_1 == null) {
			this.anInt2681 = (int) ((float) (this.anInt2681 * 1413071081) - (float) (this.anInt2681 * 1413071081) / 10.0F) * -1266739367;
		} else {
			@Pc(60) int local60 = this.anInt2681 * 1413071081 - local46.aClass120_Sub1_Sub4_1.aShort48;
			this.anInt2681 = (int) ((float) (this.anInt2681 * 1413071081) - (float) local60 / 10.0F) * -1266739367;
		}
		local14.method29760(local17);
		local14.method29783(0.0F, (float) (-20 - this.anInt2681 * 1413071081), 0.0F);
		@Pc(110) Class573 local110 = null;
		this.aBoolean454 = false;
		if (Class703.aClass80_Sub37_49.aClass165_Sub17_1.method16165((byte) -71) == 1) {
			@Pc(123) Class621 local123 = this.method18952((byte) -30);
			if (local123.aBoolean933 && (this.aClass672_1.anInt5712 * 1260077339 == -1 || ((Class335) Class460.aClass41_Sub2_1.method18054(this.aClass672_1.anInt5712 * 1260077339, -1551262094)).aBoolean823)) {
				@Pc(159) Class6 local159 = this.aClass6_3.method23590(-499060808) && this.aClass6_3.method23589((byte) 67) ? this.aClass6_3 : null;
				@Pc(175) Class6_Sub3 local175 = this.aClass6_Sub3_3.method23590(-499060808) && (!this.aClass6_Sub3_3.aBoolean429 || local159 == null) ? this.aClass6_Sub3_3 : null;
				@Pc(178) short local178 = Class698.aClass638_1.aShort186;
				@Pc(181) byte local181 = Class698.aClass638_1.aByte163;
				if (this.aClass672_1.anInt5712 * 1260077339 != -1) {
					local178 = ((Class335) Class460.aClass41_Sub2_1.method18054(this.aClass672_1.anInt5712 * 1260077339, -925859367)).aShort167;
					local181 = ((Class335) Class460.aClass41_Sub2_1.method18054(this.aClass672_1.anInt5712 * 1260077339, 1115950818)).aByte134;
				}
				@Pc(212) Class105 local212 = null;
				if (local178 > -1 && Class703.aClass80_Sub37_49.aClass165_Sub2_1.method15861(1423795933) == 1) {
					local212 = Class507.method30514(arg0, local25, this.anInt2680 * -2015931105, this.anInt2679 * -245869181, this.anInt2706 * -1001713671, this.aClass105Array3[0], local178, local181, local175 == null ? local159 : local175, (byte) 1);
				} else {
					local212 = Class315.method27500(arg0, local25, this.anInt2680 * -2015931105, this.anInt2679 * -245869181, this.anInt2706 * -1001713671, 1, this.aClass105Array3[0], 0, 0, 160, 240, local175 == null ? local159 : local175, 1821065698);
				}
				if (local212 != null) {
					if (this.aClass246Array21 == null || this.aClass246Array21.length < this.aClass105Array3.length + 1) {
						this.method24581(this.aClass105Array3.length + 1, (byte) 14);
					}
					local110 = Class454.method29307(true, 1708316454);
					this.aBoolean454 = true;
					arg0.method20762(false);
					local212.method7359(local14, this.aClass246Array21[this.aClass105Array3.length], 0);
					arg0.method20762(true);
				}
			}
		}
		@Pc(334) int local334;
		if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 == this) {
			for (local334 = client.aClass101Array1.length - 1; local334 >= 0; local334--) {
				@Pc(340) Class101 local340 = client.aClass101Array1[local334];
				if (local340 != null && local340.anInt462 * 1009747225 != -1) {
					@Pc(382) int local382;
					if (local340.anInt467 * 1614016575 == 1) {
						@Pc(363) Class80_Sub19 local363 = (Class80_Sub19) client.aClass24_18.method560((long) (local340.anInt464 * 1096614689));
						if (local363 != null) {
							@Pc(370) Class120_Sub1_Sub1_Sub1_Sub1 local370 = (Class120_Sub1_Sub1_Sub1_Sub1) local363.anObject5;
							@Pc(378) Class463 local378 = Class463.method29487(local370.method24552().aClass463_61, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method24552().aClass463_61);
							local382 = (int) local378.aFloat297;
							@Pc(386) int local386 = (int) local378.aFloat296;
							this.method19055(arg0, local14, this.aClass105Array3[0], (long) local382, (long) local386, local340.anInt462 * 1009747225, 92160000L);
						}
					}
					if (local340.anInt467 * 1614016575 == 2) {
						@Pc(413) Class463 local413 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method24552().aClass463_61;
						@Pc(423) long local423 = (long) (local340.anInt466 * -191529145 - (int) local413.aFloat297);
						@Pc(433) long local433 = (long) (local340.anInt465 * -1207974023 - (int) local413.aFloat296);
						@Pc(441) long local441 = (long) (local340.anInt460 * -380320871 << 9);
						@Pc(445) long local445 = local441 * local441;
						this.method19055(arg0, local14, this.aClass105Array3[0], local423, local433, local340.anInt462 * 1009747225, local445);
					}
					if (local340.anInt467 * 1614016575 == 10 && local340.anInt464 * 1096614689 >= 0 && local340.anInt464 * 1096614689 < client.aClass120_Sub1_Sub1_Sub1_Sub2Array1.length) {
						@Pc(485) Class120_Sub1_Sub1_Sub1_Sub2 local485 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local340.anInt464 * 1096614689];
						if (local485 != null) {
							@Pc(496) Class463 local496 = Class463.method29487(local485.method24552().aClass463_61, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method24552().aClass463_61);
							@Pc(500) int local500 = (int) local496.aFloat297;
							local382 = (int) local496.aFloat296;
							this.method19055(arg0, local14, this.aClass105Array3[0], (long) local500, (long) local382, local340.anInt462 * 1009747225, 92160000L);
						}
					}
				}
			}
		}
		local14.method29760(local17);
		local14.method29783(0.0F, (float) (-5 - this.anInt2681 * 1413071081), 0.0F);
		if (this.aClass246Array21 == null || this.aClass246Array21.length < this.aClass105Array3.length) {
			this.method24581(this.aClass105Array3.length, (byte) 14);
		}
		if (local110 == null) {
			local110 = Class454.method29307(true, -2092940717);
		}
		this.method18989(arg0, this.aClass105Array3, local14, false, (byte) -80);
		for (local334 = 0; local334 < this.aClass105Array3.length; local334++) {
			if (this.aClass105Array3[local334] == null) {
				this.aClass246Array21[local334].aBoolean773 = false;
			} else {
				this.aClass105Array3[local334].method7359(local14, this.aClass246Array21[local334], Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 == this ? 1 : 0);
			}
		}
		if (this.aClass658_3 != null) {
			@Pc(613) Class221 local613 = this.aClass658_3.method33244();
			arg0.method20964(local613);
		}
		for (local334 = 0; local334 < this.aClass105Array3.length; local334++) {
			if (this.aClass105Array3[local334] != null) {
				this.aBoolean454 |= this.aClass105Array3[local334].method7395();
			}
			this.aClass105Array3[local334] = null;
		}
		this.anInt2693 = client.anInt3496 * 1940875145;
		return local110;
	}

	@OriginalMember(owner = "client!aqc", name = "fg", descriptor = "(Lclient!di;)Lclient!tj;")
	@Override
	Class573 method24594(@OriginalArg(0) Class102 arg0) {
		if (this.aClass672_1 == null || !this.method19056(arg0, 2048, (byte) 40)) {
			return null;
		}
		@Pc(14) Class471 local14 = arg0.method20813();
		@Pc(17) Class471 local17 = this.method24526();
		@Pc(20) Class457 local20 = this.method24552();
		@Pc(25) int local25 = this.aClass372_8.method28394((byte) 3);
		@Pc(46) Class568 local46 = this.aClass570_23.aClass568ArrayArrayArray1[this.aByte99][(int) local20.aClass463_61.aFloat297 >> 9][(int) local20.aClass463_61.aFloat296 >> 9];
		if (local46 == null || local46.aClass120_Sub1_Sub4_1 == null) {
			this.anInt2681 = (int) ((float) (this.anInt2681 * 1413071081) - (float) (this.anInt2681 * 1413071081) / 10.0F) * -1266739367;
		} else {
			@Pc(60) int local60 = this.anInt2681 * 1413071081 - local46.aClass120_Sub1_Sub4_1.aShort48;
			this.anInt2681 = (int) ((float) (this.anInt2681 * 1413071081) - (float) local60 / 10.0F) * -1266739367;
		}
		local14.method29760(local17);
		local14.method29783(0.0F, (float) (-20 - this.anInt2681 * 1413071081), 0.0F);
		@Pc(110) Class573 local110 = null;
		this.aBoolean454 = false;
		if (Class703.aClass80_Sub37_49.aClass165_Sub17_1.method16165((byte) -75) == 1) {
			@Pc(123) Class621 local123 = this.method18952((byte) -2);
			if (local123.aBoolean933 && (this.aClass672_1.anInt5712 * 1260077339 == -1 || ((Class335) Class460.aClass41_Sub2_1.method18054(this.aClass672_1.anInt5712 * 1260077339, 131050487)).aBoolean823)) {
				@Pc(159) Class6 local159 = this.aClass6_3.method23590(-499060808) && this.aClass6_3.method23589((byte) 39) ? this.aClass6_3 : null;
				@Pc(175) Class6_Sub3 local175 = this.aClass6_Sub3_3.method23590(-499060808) && (!this.aClass6_Sub3_3.aBoolean429 || local159 == null) ? this.aClass6_Sub3_3 : null;
				@Pc(178) short local178 = Class698.aClass638_1.aShort186;
				@Pc(181) byte local181 = Class698.aClass638_1.aByte163;
				if (this.aClass672_1.anInt5712 * 1260077339 != -1) {
					local178 = ((Class335) Class460.aClass41_Sub2_1.method18054(this.aClass672_1.anInt5712 * 1260077339, 837430633)).aShort167;
					local181 = ((Class335) Class460.aClass41_Sub2_1.method18054(this.aClass672_1.anInt5712 * 1260077339, -8679028)).aByte134;
				}
				@Pc(212) Class105 local212 = null;
				if (local178 > -1 && Class703.aClass80_Sub37_49.aClass165_Sub2_1.method15861(1423795933) == 1) {
					local212 = Class507.method30514(arg0, local25, this.anInt2680 * -2015931105, this.anInt2679 * -245869181, this.anInt2706 * -1001713671, this.aClass105Array3[0], local178, local181, local175 == null ? local159 : local175, (byte) 1);
				} else {
					local212 = Class315.method27500(arg0, local25, this.anInt2680 * -2015931105, this.anInt2679 * -245869181, this.anInt2706 * -1001713671, 1, this.aClass105Array3[0], 0, 0, 160, 240, local175 == null ? local159 : local175, 1841552754);
				}
				if (local212 != null) {
					if (this.aClass246Array21 == null || this.aClass246Array21.length < this.aClass105Array3.length + 1) {
						this.method24581(this.aClass105Array3.length + 1, (byte) 14);
					}
					local110 = Class454.method29307(true, 783187324);
					this.aBoolean454 = true;
					arg0.method20762(false);
					local212.method7359(local14, this.aClass246Array21[this.aClass105Array3.length], 0);
					arg0.method20762(true);
				}
			}
		}
		@Pc(334) int local334;
		if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 == this) {
			for (local334 = client.aClass101Array1.length - 1; local334 >= 0; local334--) {
				@Pc(340) Class101 local340 = client.aClass101Array1[local334];
				if (local340 != null && local340.anInt462 * 1009747225 != -1) {
					@Pc(382) int local382;
					if (local340.anInt467 * 1614016575 == 1) {
						@Pc(363) Class80_Sub19 local363 = (Class80_Sub19) client.aClass24_18.method560((long) (local340.anInt464 * 1096614689));
						if (local363 != null) {
							@Pc(370) Class120_Sub1_Sub1_Sub1_Sub1 local370 = (Class120_Sub1_Sub1_Sub1_Sub1) local363.anObject5;
							@Pc(378) Class463 local378 = Class463.method29487(local370.method24552().aClass463_61, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method24552().aClass463_61);
							local382 = (int) local378.aFloat297;
							@Pc(386) int local386 = (int) local378.aFloat296;
							this.method19055(arg0, local14, this.aClass105Array3[0], (long) local382, (long) local386, local340.anInt462 * 1009747225, 92160000L);
						}
					}
					if (local340.anInt467 * 1614016575 == 2) {
						@Pc(413) Class463 local413 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method24552().aClass463_61;
						@Pc(423) long local423 = (long) (local340.anInt466 * -191529145 - (int) local413.aFloat297);
						@Pc(433) long local433 = (long) (local340.anInt465 * -1207974023 - (int) local413.aFloat296);
						@Pc(441) long local441 = (long) (local340.anInt460 * -380320871 << 9);
						@Pc(445) long local445 = local441 * local441;
						this.method19055(arg0, local14, this.aClass105Array3[0], local423, local433, local340.anInt462 * 1009747225, local445);
					}
					if (local340.anInt467 * 1614016575 == 10 && local340.anInt464 * 1096614689 >= 0 && local340.anInt464 * 1096614689 < client.aClass120_Sub1_Sub1_Sub1_Sub2Array1.length) {
						@Pc(485) Class120_Sub1_Sub1_Sub1_Sub2 local485 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local340.anInt464 * 1096614689];
						if (local485 != null) {
							@Pc(496) Class463 local496 = Class463.method29487(local485.method24552().aClass463_61, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.method24552().aClass463_61);
							@Pc(500) int local500 = (int) local496.aFloat297;
							local382 = (int) local496.aFloat296;
							this.method19055(arg0, local14, this.aClass105Array3[0], (long) local500, (long) local382, local340.anInt462 * 1009747225, 92160000L);
						}
					}
				}
			}
		}
		local14.method29760(local17);
		local14.method29783(0.0F, (float) (-5 - this.anInt2681 * 1413071081), 0.0F);
		if (this.aClass246Array21 == null || this.aClass246Array21.length < this.aClass105Array3.length) {
			this.method24581(this.aClass105Array3.length, (byte) 14);
		}
		if (local110 == null) {
			local110 = Class454.method29307(true, 1166242380);
		}
		this.method18989(arg0, this.aClass105Array3, local14, false, (byte) -20);
		for (local334 = 0; local334 < this.aClass105Array3.length; local334++) {
			if (this.aClass105Array3[local334] == null) {
				this.aClass246Array21[local334].aBoolean773 = false;
			} else {
				this.aClass105Array3[local334].method7359(local14, this.aClass246Array21[local334], Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 == this ? 1 : 0);
			}
		}
		if (this.aClass658_3 != null) {
			@Pc(613) Class221 local613 = this.aClass658_3.method33244();
			arg0.method20964(local613);
		}
		for (local334 = 0; local334 < this.aClass105Array3.length; local334++) {
			if (this.aClass105Array3[local334] != null) {
				this.aBoolean454 |= this.aClass105Array3[local334].method7395();
			}
			this.aClass105Array3[local334] = null;
		}
		this.anInt2693 = client.anInt3496 * 1940875145;
		return local110;
	}

	@OriginalMember(owner = "client!aqc", name = "ft", descriptor = "(Lclient!di;II)Z")
	@Override
	boolean method24563(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass672_1 == null || !this.method19056(arg0, 131072, (byte) 40)) {
			return false;
		}
		@Pc(14) Class471 local14 = this.method24526();
		@Pc(16) boolean local16 = false;
		@Pc(18) int local18;
		for (local18 = 0; local18 < this.aClass105Array3.length; local18++) {
			if (this.aClass105Array3[local18] != null && this.aClass105Array3[local18].aBoolean173 && this.aClass105Array3[local18].method7360(arg1, arg2, local14, true, 0)) {
				local16 = true;
				break;
			}
		}
		for (local18 = 0; local18 < this.aClass105Array3.length; local18++) {
			this.aClass105Array3[local18] = null;
		}
		return local16;
	}

	@OriginalMember(owner = "client!aqc", name = "fs", descriptor = "()Z")
	@Override
	boolean method24596() {
		return false;
	}

	@OriginalMember(owner = "client!aqc", name = "fu", descriptor = "()Z")
	@Override
	boolean method24606() {
		return false;
	}

	@OriginalMember(owner = "client!aqc", name = "fr", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24562(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aqc", name = "hg", descriptor = "(ZI)Ljava/lang/String;")
	public String method19066(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		return arg0 ? this.aString75 : this.aString73;
	}

	@OriginalMember(owner = "client!aqc", name = "gb", descriptor = "(Lclient!di;)V")
	@Override
	void method24605(@OriginalArg(0) Class102 arg0) {
		if (this.aClass672_1 == null || !this.aBoolean455 && !this.method19056(arg0, 0, (byte) 40)) {
			return;
		}
		@Pc(16) Class471 local16 = arg0.method20813();
		local16.method29761(this.method24552());
		local16.method29783(0.0F, -5.0F, 0.0F);
		this.method18989(arg0, this.aClass105Array3, local16, this.aBoolean455, (byte) -50);
		for (@Pc(36) int local36 = 0; local36 < this.aClass105Array3.length; local36++) {
			this.aClass105Array3[local36] = null;
		}
	}

	@OriginalMember(owner = "client!aqc", name = "gz", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24580(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aqc", name = "bq", descriptor = "(I)I")
	@Override
	public int method18960(@OriginalArg(0) int arg0) {
		return -1;
	}

	@OriginalMember(owner = "client!aqc", name = "gg", descriptor = "()V")
	@Override
	void method24603() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aqc", name = "ih", descriptor = "()V")
	void method19067() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anIntArray244.length; local1++) {
			this.anIntArray244[local1] = -1;
		}
		for (local1 = 0; local1 < this.anIntArray245.length; local1++) {
			this.anIntArray245[local1] = -1;
		}
	}

	@OriginalMember(owner = "client!aqc", name = "fy", descriptor = "(Lclient!di;Lclient!alf;IIIZI)V")
	@Override
	void method24569(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aqc", name = "l", descriptor = "(I)Lclient!on;")
	@Override
	public Class463 method18943(@OriginalArg(0) int arg0) {
		return Class463.method29470();
	}

	@OriginalMember(owner = "client!aqc", name = "ee", descriptor = "()I")
	@Override
	int method19046() {
		return this.anInt2721 * -666322609;
	}

	@OriginalMember(owner = "client!aqc", name = "ef", descriptor = "()I")
	@Override
	int method19025() {
		return this.anInt2721 * -666322609;
	}

	@OriginalMember(owner = "client!aqc", name = "fi", descriptor = "(Lclient!di;Lclient!alf;IIIZ)V")
	@Override
	void method24599(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class120_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aqc", name = "ey", descriptor = "()I")
	@Override
	public int method18994() {
		return -1;
	}

	@OriginalMember(owner = "client!aqc", name = "ek", descriptor = "()I")
	@Override
	public int method19034() {
		return -1;
	}

	@OriginalMember(owner = "client!aqc", name = "el", descriptor = "()Z")
	@Override
	public boolean method19030() {
		return Class698.aClass638_1.aBoolean962;
	}

	@OriginalMember(owner = "client!aqc", name = "em", descriptor = "()Lclient!sq;")
	@Override
	public Class558 method19040() {
		if (this.aClass558_3 != null) {
			if (this.aClass558_3.aString223 == null) {
				return null;
			}
			if (client.anInt3566 * 788343467 == 0 || client.anInt3566 * 788343467 == 3 || client.anInt3566 * 788343467 == 1 && Class586.method31882(this.aString73, 862161655)) {
				return this.aClass558_3;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!aqc", name = "fp", descriptor = "()I")
	@Override
	public int method18953() {
		return -(this.anInt2671 * 1078276675) - 1;
	}

	@OriginalMember(owner = "client!aqc", name = "hh", descriptor = "(I)V")
	void method19068(@OriginalArg(0) int arg0) {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anIntArray244.length; local1++) {
			this.anIntArray244[local1] = -1;
		}
		for (local1 = 0; local1 < this.anIntArray245.length; local1++) {
			this.anIntArray245[local1] = -1;
		}
	}

	@OriginalMember(owner = "client!aqc", name = "gw", descriptor = "(Lclient!di;)V")
	@Override
	void method24593(@OriginalArg(0) Class102 arg0) {
		if (this.aClass672_1 == null || !this.aBoolean455 && !this.method19056(arg0, 0, (byte) 40)) {
			return;
		}
		@Pc(16) Class471 local16 = arg0.method20813();
		local16.method29761(this.method24552());
		local16.method29783(0.0F, -5.0F, 0.0F);
		this.method18989(arg0, this.aClass105Array3, local16, this.aBoolean455, (byte) -101);
		for (@Pc(36) int local36 = 0; local36 < this.aClass105Array3.length; local36++) {
			this.aClass105Array3[local36] = null;
		}
	}

	@OriginalMember(owner = "client!aqc", name = "gi", descriptor = "(Lclient!di;)V")
	@Override
	void method24607(@OriginalArg(0) Class102 arg0) {
		if (this.aClass672_1 == null || !this.aBoolean455 && !this.method19056(arg0, 0, (byte) 40)) {
			return;
		}
		@Pc(16) Class471 local16 = arg0.method20813();
		local16.method29761(this.method24552());
		local16.method29783(0.0F, -5.0F, 0.0F);
		this.method18989(arg0, this.aClass105Array3, local16, this.aBoolean455, (byte) -95);
		for (@Pc(36) int local36 = 0; local36 < this.aClass105Array3.length; local36++) {
			this.aClass105Array3[local36] = null;
		}
	}

	@OriginalMember(owner = "client!aqc", name = "gp", descriptor = "(Lclient!di;)V")
	@Override
	void method24608(@OriginalArg(0) Class102 arg0) {
		if (this.aClass672_1 == null || !this.aBoolean455 && !this.method19056(arg0, 0, (byte) 40)) {
			return;
		}
		@Pc(16) Class471 local16 = arg0.method20813();
		local16.method29761(this.method24552());
		local16.method29783(0.0F, -5.0F, 0.0F);
		this.method18989(arg0, this.aClass105Array3, local16, this.aBoolean455, (byte) -86);
		for (@Pc(36) int local36 = 0; local36 < this.aClass105Array3.length; local36++) {
			this.aClass105Array3[local36] = null;
		}
	}

	@OriginalMember(owner = "client!aqc", name = "il", descriptor = "(Lclient!ald;B)V")
	public void method19069(@OriginalArg(0) Packet arg0, @OriginalArg(1) byte arg1) {
		this.aByte74 = arg1;
		@Pc(4) int local4 = -1;
		this.anInt2708 = 0;
		@Pc(12) int[] local12 = new int[Class362.aClass651_1.anIntArray512.length];
		@Pc(17) Class49[] local17 = new Class49[Class362.aClass651_1.anIntArray512.length];
		@Pc(22) Class43[] local22 = new Class43[Class362.aClass651_1.anIntArray512.length];
		@Pc(24) int local24;
		@Pc(39) int local39;
		@Pc(50) int local50;
		@Pc(56) int local56;
		@Pc(101) int local101;
		for (local24 = 0; local24 < Class362.aClass651_1.anIntArray512.length; local24++) {
			if (Class362.aClass651_1.anIntArray512[local24] != 1) {
				local39 = arg0.g1();
				if (local39 == 0) {
					local12[local24] = 0;
				} else {
					local50 = arg0.g1();
					local56 = (local39 << 8) + local50;
					if (local24 == 0 && local56 == 65535) {
						local4 = arg0.gSmart2or4null();
						this.anInt2708 = arg0.g1() * -1086578857;
						break;
					}
					if (local56 >= 2048) {
						local56 -= 2048;
						local12[local24] = local56 | 0x40000000;
						local22[local24] = (Class43) Class25.aClass41_Sub9_1.method18054(local56, 455385388);
						local101 = local22[local24].anInt164 * -1829390975;
						if (local101 != 0) {
							this.anInt2708 = local101 * -1086578857;
						}
					} else {
						local12[local24] = local56 - 256 | Integer.MIN_VALUE;
					}
				}
			}
		}
		if (local4 == -1) {
			local24 = arg0.g2();
			local39 = 0;
			for (local50 = 0; local50 < Class362.aClass651_1.anIntArray512.length; local50++) {
				if (Class362.aClass651_1.anIntArray512[local50] == 0) {
					if ((local24 & 0x1 << local39) != 0) {
						local17[local50] = Class489.method30218(local22[local50], arg0, -1679374177);
					}
					local39++;
				}
			}
		}
		@Pc(164) int[] local164 = new int[10];
		for (local39 = 0; local39 < 10; local39++) {
			local50 = arg0.g1();
			if (Class80_Sub41.aShortArrayArrayArray5.length < 1 || local50 < 0 || local50 >= Class80_Sub41.aShortArrayArrayArray5[local39][0].length) {
				local50 = 0;
			}
			local164[local39] = local50;
		}
		@Pc(198) int[] local198 = new int[10];
		for (local50 = 0; local50 < 10; local50++) {
			local56 = arg0.g1();
			if (Class267.aShortArrayArrayArray6.length < 1 || local56 < 0 || local56 >= Class267.aShortArrayArrayArray6[local50][0].length) {
				local56 = 0;
			}
			local198[local50] = local56;
		}
		this.anInt2721 = arg0.g2() * 1617345967;
		if (this.aClass672_1 == null) {
			this.aClass672_1 = new Class672();
		}
		local50 = this.aClass672_1.anInt5712 * 1260077339;
		@Pc(255) int[] local255 = this.aClass672_1.anIntArray518;
		this.aClass672_1.method33553(this.method18970(1445439901), local12, local17, local164, local198, this.aByte74 == 1, local4, (byte) 0);
		if (local4 != local50) {
			@Pc(282) Class463 local282 = Class463.method29472(this.method24552().aClass463_61);
			local282.aFloat297 = (this.anIntArray234[0] << 9) + (this.method18966((byte) -38) << 8);
			local282.aFloat296 = (this.anIntArray242[0] << 9) + (this.method18966((byte) -98) << 8);
			this.method24542(local282);
			local282.method29557();
		}
		if (this.anInt2671 * 1078276675 == client.anInt3558 * 188678613 && local255 != null) {
			for (local101 = 0; local101 < local164.length; local101++) {
				if (local255[local101] != local164[local101]) {
					Class25.aClass41_Sub9_1.method17333(-1258993030);
					break;
				}
			}
		}
		if (this.aClass658_3 != null) {
			this.aClass658_3.method33251();
		}
		if (!this.aClass6_Sub3_3.method23590(-499060808) || !this.aClass6_Sub3_3.aBoolean429) {
			return;
		}
		@Pc(366) Class621 local366 = this.method18952((byte) -12);
		if (!local366.method32325(this.aClass6_Sub3_3.method23582(-979204968), (byte) 71)) {
			this.aClass6_Sub3_3.method23587(-1, -2060415981);
			this.aClass6_Sub3_3.aBoolean429 = false;
		}
	}

	@OriginalMember(owner = "client!aqc", name = "iq", descriptor = "(IIB)V")
	public void method19070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (this.aClass6_3.method23590(-499060808) && this.aClass6_3.method23581((byte) 67).anInt3896 * -1996482375 == 1) {
			this.anIntArray240 = null;
			this.aClass6_3.method23587(-1, -2060415981);
		}
		for (@Pc(23) int local23 = 0; local23 < this.aClass561Array3.length; local23++) {
			if (this.aClass561Array3[local23].anInt5188 * -2124314403 != -1) {
				@Pc(49) Class684 local49 = (Class684) Class104_Sub2.aClass41_Sub16_1.method18054(this.aClass561Array3[local23].anInt5188 * -2124314403, 1585751228);
				if (local49.aBoolean986 && local49.anInt5764 * 319211597 != -1 && ((Class261) Class125.aClass41_Sub1_6.method18054(local49.anInt5764 * 319211597, -2029764146)).anInt3896 * -1996482375 == 1) {
					this.aClass561Array3[local23].aClass6_9.method23587(-1, -2060415981);
					this.aClass561Array3[local23].anInt5188 = -1389203317;
				}
			}
		}
		this.anInt2714 = -1297842623;
		if (arg0 < 0 || arg0 >= client.aClass539_1.method30921(2131820141) || arg1 < 0 || arg1 >= client.aClass539_1.method31011(683914928)) {
			this.method19063(arg0, arg1, (byte) 3);
		} else if (this.anIntArray234[0] >= 0 && this.anIntArray234[0] < client.aClass539_1.method30921(1986631131) && this.anIntArray242[0] >= 0 && this.anIntArray242[0] < client.aClass539_1.method31011(-1966277791)) {
			this.method19059(arg0, arg1, arg2, (short) -16110);
		} else {
			this.method19063(arg0, arg1, (byte) 3);
		}
	}

	@OriginalMember(owner = "client!aqc", name = "if", descriptor = "(Lclient!ald;)V")
	public void method19071(@OriginalArg(0) Packet arg0) {
		arg0.pos = 0;
		@Pc(6) int local6 = arg0.g1();
		for (@Pc(8) int local8 = 0; local8 < this.anIntArray244.length; local8++) {
			if ((local6 & 0x1 << local8) == 0) {
				this.anIntArray244[local8] = -1;
				this.anIntArray245[local8] = -1;
			} else {
				@Pc(23) int local23 = arg0.g1();
				@Pc(27) int local27 = arg0.g2();
				this.anIntArray244[local8] = local23;
				this.anIntArray245[local8] = local27;
			}
		}
	}

	@OriginalMember(owner = "client!aqc", name = "o", descriptor = "()Lclient!akx;")
	@Override
	public Class80_Sub33 method18949() {
		@Pc(3) Class626 local3 = client.aClass539_1.method30893((byte) -70);
		return Class407.method28949(this.aByte99, (int) this.method24552().aClass463_61.aFloat297 + local3.anInt5540 * 1854499328, -((int) this.method24552().aClass463_61.aFloat295), (int) this.method24552().aClass463_61.aFloat296 + local3.anInt5537 * 1677025792, -563066779);
	}

	@OriginalMember(owner = "client!aqc", name = "dy", descriptor = "()I")
	@Override
	public int method18982() {
		return this.aClass672_1 == null || this.aClass672_1.anInt5712 * 1260077339 == -1 ? super.method18966((byte) -85) : ((Class335) Class460.aClass41_Sub2_1.method18054(this.aClass672_1.anInt5712 * 1260077339, 226889695)).anInt4212 * 1573297955;
	}

	@OriginalMember(owner = "client!aqc", name = "ig", descriptor = "(Lclient!di;Lclient!ov;Lclient!dn;JJIJ)V")
	void method19072(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) Class105 arg2, @OriginalArg(3) long arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6) {
		@Pc(7) long local7 = arg3 * arg3 + arg4 * arg4;
		if (local7 < 262144L || local7 > arg6) {
			return;
		}
		@Pc(33) int local33 = (int) (Math.atan2((double) arg3, (double) arg4) * 2607.5945876176133D - (double) this.aClass372_8.method28394((byte) 3)) & 0x3FFF;
		@Pc(51) Class105 local51 = Class586.method31885(arg0, local33, this.anInt2680 * -2015931105, this.anInt2679 * -245869181, this.anInt2706 * -1001713671, arg5, 1900165055);
		if (local51 != null) {
			arg0.method20762(false);
			local51.method7359(arg1, null, 0);
			arg0.method20762(true);
		}
	}

	@OriginalMember(owner = "client!aqc", name = "id", descriptor = "(Lclient!di;Lclient!ov;Lclient!dn;JJIJ)V")
	void method19073(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class471 arg1, @OriginalArg(2) Class105 arg2, @OriginalArg(3) long arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6) {
		@Pc(7) long local7 = arg3 * arg3 + arg4 * arg4;
		if (local7 < 262144L || local7 > arg6) {
			return;
		}
		@Pc(33) int local33 = (int) (Math.atan2((double) arg3, (double) arg4) * 2607.5945876176133D - (double) this.aClass372_8.method28394((byte) 3)) & 0x3FFF;
		@Pc(51) Class105 local51 = Class586.method31885(arg0, local33, this.anInt2680 * -2015931105, this.anInt2679 * -245869181, this.anInt2706 * -1001713671, arg5, -1028873172);
		if (local51 != null) {
			arg0.method20762(false);
			local51.method7359(arg1, null, 0);
			arg0.method20762(true);
		}
	}

	@OriginalMember(owner = "client!aqc", name = "ix", descriptor = "(Z)Ljava/lang/String;")
	public String method19074(@OriginalArg(0) boolean arg0) {
		@Pc(7) String local7 = arg0 ? this.aString75 : this.aString73;
		return this.aString74 == null ? local7 : this.aString74.replaceAll(Class256.aString163, local7);
	}

	@OriginalMember(owner = "client!aqc", name = "ip", descriptor = "(Z)Ljava/lang/String;")
	public String method19075(@OriginalArg(0) boolean arg0) {
		@Pc(7) String local7 = arg0 ? this.aString75 : this.aString73;
		return this.aString74 == null ? local7 : this.aString74.replaceAll(Class256.aString163, local7);
	}

	@OriginalMember(owner = "client!aqc", name = "ir", descriptor = "(Z)Ljava/lang/String;")
	public String method19076(@OriginalArg(0) boolean arg0) {
		return arg0 ? this.aString75 : this.aString73;
	}

	@OriginalMember(owner = "client!aqc", name = "s", descriptor = "()Lclient!oq;")
	@Override
	public Class466 method18950() {
		@Pc(1) Class466 local1 = Class466.method29640();
		local1.method29650(Class467.method29716(this.aClass372_8.anInt4506 * 1783746791), 0.0F, 0.0F);
		return local1;
	}

	@OriginalMember(owner = "client!aqc", name = "a", descriptor = "()Lclient!akx;")
	@Override
	public Class80_Sub33 method18951() {
		@Pc(3) Class626 local3 = client.aClass539_1.method30893((byte) -104);
		return Class407.method28949(this.aByte99, (int) this.method24552().aClass463_61.aFloat297 + local3.anInt5540 * 1854499328, -((int) this.method24552().aClass463_61.aFloat295), (int) this.method24552().aClass463_61.aFloat296 + local3.anInt5537 * 1677025792, -1544382146);
	}

	@OriginalMember(owner = "client!aqc", name = "it", descriptor = "(II)V")
	public void method19077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2700 = 0;
		this.anInt2702 = 0;
		this.anInt2678 = 0;
		this.anIntArray234[0] = arg0;
		this.anIntArray242[0] = arg1;
		@Pc(22) int local22 = this.method18966((byte) -54);
		@Pc(27) Class463 local27 = Class463.method29472(this.method24552().aClass463_61);
		local27.aFloat297 = this.anIntArray234[0] * 512 + local22 * 256;
		local27.aFloat296 = local22 * 256 + this.anIntArray242[0] * 512;
		this.method24542(local27);
		local27.method29557();
		if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 == this) {
			client.aClass539_1.method30904((byte) -40).method33382(-821244243);
		}
		if (this.aClass658_3 != null) {
			this.aClass658_3.method33251();
		}
	}

	@OriginalMember(owner = "client!aqc", name = "ib", descriptor = "(II)V")
	public void method19078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2700 = 0;
		this.anInt2702 = 0;
		this.anInt2678 = 0;
		this.anIntArray234[0] = arg0;
		this.anIntArray242[0] = arg1;
		@Pc(22) int local22 = this.method18966((byte) -109);
		@Pc(27) Class463 local27 = Class463.method29472(this.method24552().aClass463_61);
		local27.aFloat297 = this.anIntArray234[0] * 512 + local22 * 256;
		local27.aFloat296 = local22 * 256 + this.anIntArray242[0] * 512;
		this.method24542(local27);
		local27.method29557();
		if (Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 == this) {
			client.aClass539_1.method30904((byte) -29).method33382(-1285156666);
		}
		if (this.aClass658_3 != null) {
			this.aClass658_3.method33251();
		}
	}

	@OriginalMember(owner = "client!aqc", name = "iy", descriptor = "()Z")
	public boolean method19079() {
		return this.aClass672_1 != null;
	}

	@OriginalMember(owner = "client!aqc", name = "iw", descriptor = "()Z")
	public boolean method19080() {
		return this.aClass672_1 != null;
	}
}
