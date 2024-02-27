package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class51 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!ac", name = "$assertionsDisabled", descriptor = "Z")
	static final boolean aBoolean30 = !Class51.class.desiredAssertionStatus();

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
	static final int anInt190 = 1;

	@OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
	static final int anInt193 = 2;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "[B")
	static byte[] aByteArray18 = new byte[2048];

	@OriginalMember(owner = "client!ac", name = "u", descriptor = "[B")
	static byte[] aByteArray17 = new byte[2048];

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "[Lclient!ald;")
	static Packet[] aPacketArray1 = new Packet[2048];

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "[Lclient!ald;")
	static Packet[] aPacketArray2 = new Packet[2048];

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
	public static int anInt191 = 0;

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "[I")
	static int[] anIntArray20 = new int[2048];

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
	static int anInt192 = 0;

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "[I")
	static int[] anIntArray21 = new int[2048];

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "[Lclient!s;")
	static Class543[] aClass543Array1 = new Class543[2048];

	@OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
	static int anInt194 = 0;

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "[I")
	static int[] anIntArray22 = new int[2048];

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "(Lclient!asa;)V")
	static void method1041(@OriginalArg(0) PacketBit arg0) {
		@Pc(1) int local1 = 0;
		arg0.method22560(1668075746);
		@Pc(6) int local6;
		@Pc(15) int local15;
		@Pc(39) int local39;
		for (local6 = 0; local6 < anInt191 * 44967471; local6++) {
			local15 = anIntArray20[local6];
			if ((aByteArray18[local15] & 0x1) == 0) {
				if (local1 > 0) {
					local1--;
					aByteArray18[local15] = (byte) (aByteArray18[local15] | 0x2);
				} else {
					local39 = arg0.method22559(1, -325783685);
					if (local39 == 0) {
						local1 = Class351.method28022(arg0, 1409280463);
						aByteArray18[local15] = (byte) (aByteArray18[local15] | 0x2);
					} else {
						Class167.method17876(arg0, local15, 32884);
					}
				}
			}
		}
		arg0.method22568(451966293);
		if (local1 != 0) {
			throw new RuntimeException();
		}
		arg0.method22560(1668075746);
		for (local6 = 0; local6 < anInt191 * 44967471; local6++) {
			local15 = anIntArray20[local6];
			if ((aByteArray18[local15] & 0x1) != 0) {
				if (local1 > 0) {
					local1--;
					aByteArray18[local15] = (byte) (aByteArray18[local15] | 0x2);
				} else {
					local39 = arg0.method22559(1, -325783685);
					if (local39 == 0) {
						local1 = Class351.method28022(arg0, 1137259340);
						aByteArray18[local15] = (byte) (aByteArray18[local15] | 0x2);
					} else {
						Class167.method17876(arg0, local15, 32884);
					}
				}
			}
		}
		arg0.method22568(271678019);
		if (local1 != 0) {
			throw new RuntimeException();
		}
		arg0.method22560(1668075746);
		for (local6 = 0; local6 < anInt192 * -2044546579; local6++) {
			local15 = anIntArray21[local6];
			if ((aByteArray18[local15] & 0x1) != 0) {
				if (local1 > 0) {
					local1--;
					aByteArray18[local15] = (byte) (aByteArray18[local15] | 0x2);
				} else {
					local39 = arg0.method22559(1, -325783685);
					if (local39 == 0) {
						local1 = Class351.method28022(arg0, 1981254003);
						aByteArray18[local15] = (byte) (aByteArray18[local15] | 0x2);
					} else if (Class438.method29147(arg0, local15, (byte) 2)) {
						aByteArray18[local15] = (byte) (aByteArray18[local15] | 0x2);
					}
				}
			}
		}
		arg0.method22568(890084839);
		if (local1 != 0) {
			throw new RuntimeException();
		}
		arg0.method22560(1668075746);
		for (local6 = 0; local6 < anInt192 * -2044546579; local6++) {
			local15 = anIntArray21[local6];
			if ((aByteArray18[local15] & 0x1) == 0) {
				if (local1 > 0) {
					local1--;
					aByteArray18[local15] = (byte) (aByteArray18[local15] | 0x2);
				} else {
					local39 = arg0.method22559(1, -325783685);
					if (local39 == 0) {
						local1 = Class351.method28022(arg0, 1555764367);
						aByteArray18[local15] = (byte) (aByteArray18[local15] | 0x2);
					} else if (Class438.method29147(arg0, local15, (byte) 2)) {
						aByteArray18[local15] = (byte) (aByteArray18[local15] | 0x2);
					}
				}
			}
		}
		arg0.method22568(1600593238);
		if (local1 != 0) {
			throw new RuntimeException();
		}
		anInt191 = 0;
		anInt192 = 0;
		for (local6 = 1; local6 < 2048; local6++) {
			aByteArray18[local6] = (byte) (aByteArray18[local6] >> 1);
			@Pc(312) Class120_Sub1_Sub1_Sub1_Sub2 local312 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local6];
			if (local312 == null) {
				anIntArray21[(anInt192 += -1283238939) * -2044546579 - 1] = local6;
			} else {
				anIntArray20[(anInt191 += -585441073) * 44967471 - 1] = local6;
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "ai", descriptor = "(Lclient!asa;)V")
	static void method1042(@OriginalArg(0) PacketBit arg0) {
		for (@Pc(1) int local1 = 0; local1 < anInt194 * -1414067589; local1++) {
			arg0.g2();
			@Pc(14) int local14 = anIntArray22[local1];
			@Pc(18) Class120_Sub1_Sub1_Sub1_Sub2 local18 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local14];
			@Pc(22) int local22 = arg0.g1();
			if ((local22 & 0x40) != 0) {
				local22 += arg0.g1() << 8;
			}
			if ((local22 & 0x1000) != 0) {
				local22 += arg0.g1() << 16;
			}
			Class124_Sub1.method9831(arg0, local14, local18, local22, 979478774);
		}
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(Lclient!asa;I)V")
	static void method1043(@OriginalArg(0) PacketBit arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class626 local3 = client.aClass539_1.method30893((byte) -25);
		@Pc(13) boolean local13 = arg0.method22559(1, -325783685) == 1;
		if (local13) {
			anIntArray22[(anInt194 += -985578317) * -1414067589 - 1] = arg1;
		}
		@Pc(32) int local32 = arg0.method22559(2, -325783685);
		@Pc(36) Class120_Sub1_Sub1_Sub1_Sub2 local36 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[arg1];
		if (local32 != 0) {
			@Pc(162) int local162;
			@Pc(167) int local167;
			@Pc(172) int local172;
			@Pc(177) int local177;
			@Pc(190) int local190;
			if (local32 == 1) {
				local162 = arg0.method22559(3, -325783685);
				local167 = arg0.method22559(1, -325783685);
				local172 = local36.anIntArray234[0];
				local177 = local36.anIntArray242[0];
				if (local167 == 1) {
					aByteArray17[arg1] = Class712.aClass712_5.aByte165;
					local190 = arg0.method22559(2, -325783685);
					switch(local190) {
						case 0:
							local36.method19058(local172, local177 + 1, aByteArray17[arg1], (byte) -16);
							break;
						case 1:
							local36.method19058(local172 - 1, local177, aByteArray17[arg1], (byte) -52);
							break;
						case 2:
							local36.method19058(local172 + 1, local177, aByteArray17[arg1], (byte) -90);
							break;
						case 3:
							local36.method19058(local172, local177 - 1, aByteArray17[arg1], (byte) -101);
					}
				}
				if (local162 == 0) {
					local172--;
					local177--;
				} else if (local162 == 1) {
					local177--;
				} else if (local162 == 2) {
					local172++;
					local177--;
				} else if (local162 == 3) {
					local172--;
				} else if (local162 == 4) {
					local172++;
				} else if (local162 == 5) {
					local172--;
					local177++;
				} else if (local162 == 6) {
					local177++;
				} else if (local162 == 7) {
					local172++;
					local177++;
				}
				local36.method19058(local172, local177, aByteArray17[arg1], (byte) -49);
			} else if (local32 == 2) {
				local162 = arg0.method22559(4, -325783685);
				local167 = local36.anIntArray234[0];
				local172 = local36.anIntArray242[0];
				if (local162 == 0) {
					local167 -= 2;
					local172 -= 2;
				} else if (local162 == 1) {
					local167--;
					local172 -= 2;
				} else if (local162 == 2) {
					local172 -= 2;
				} else if (local162 == 3) {
					local167++;
					local172 -= 2;
				} else if (local162 == 4) {
					local167 += 2;
					local172 -= 2;
				} else if (local162 == 5) {
					local167 -= 2;
					local172--;
				} else if (local162 == 6) {
					local167 += 2;
					local172--;
				} else if (local162 == 7) {
					local167 -= 2;
				} else if (local162 == 8) {
					local167 += 2;
				} else if (local162 == 9) {
					local167 -= 2;
					local172++;
				} else if (local162 == 10) {
					local167 += 2;
					local172++;
				} else if (local162 == 11) {
					local167 -= 2;
					local172 += 2;
				} else if (local162 == 12) {
					local167--;
					local172 += 2;
				} else if (local162 == 13) {
					local172 += 2;
				} else if (local162 == 14) {
					local167++;
					local172 += 2;
				} else if (local162 == 15) {
					local167 += 2;
					local172 += 2;
				}
				local36.method19058(local167, local172, aByteArray17[arg1], (byte) -54);
			} else {
				local162 = arg0.method22559(1, -325783685);
				@Pc(443) int local443;
				@Pc(454) int local454;
				@Pc(461) int local461;
				if (local162 == 0) {
					local167 = arg0.method22559(15, -325783685);
					local172 = local167 >> 12 & 0x7;
					local177 = (byte) (local167 >> 10) & 0x3;
					local190 = local167 >> 5 & 0x1F;
					if (local190 > 15) {
						local190 -= 32;
					}
					local443 = local167 & 0x1F;
					if (local443 > 15) {
						local443 -= 32;
					}
					local454 = local190 + local36.anIntArray234[0];
					local461 = local443 + local36.anIntArray242[0];
					if (local172 == Class712.aClass712_3.anInt5823 * 1854589905) {
						local36.method19063(local454, local461, (byte) 3);
					} else {
						aByteArray17[arg1] = (byte) (local172 - 1);
						local36.method19058(local454, local461, aByteArray17[arg1], (byte) -93);
					}
					local36.aByte99 = local36.aByte100 = (byte) (local177 + local36.aByte99 & 0x3);
					if (client.aClass539_1.method30903(-463929735).method30429(local454, local461, 1209497248)) {
						local36.aByte100++;
					}
					if (arg1 == client.anInt3558 * 188678613 && Class507.anInt5045 * -1170417853 != local36.aByte99) {
						Class507.anInt5045 = local36.aByte99 * -1165759125;
					}
				} else {
					local167 = arg0.method22559(3, -325783685);
					local172 = arg0.method22559(30, -325783685);
					local177 = local172 >> 28 & 0x3;
					local190 = local172 >> 14 & 0x3FFF;
					local443 = local172 & 0x3FFF;
					local454 = (local3.anInt5540 * -390642507 + local36.anIntArray234[0] + local190 & 0x3FFF) - local3.anInt5540 * -390642507;
					local461 = (local36.anIntArray242[0] + local3.anInt5537 * -894305615 + local443 & 0x3FFF) - local3.anInt5537 * -894305615;
					if (Class712.aClass712_3.anInt5823 * 1854589905 == local167) {
						local36.method19063(local454, local461, (byte) 3);
					} else {
						aByteArray17[arg1] = (byte) (local167 - 1);
						local36.method19058(local454, local461, aByteArray17[arg1], (byte) -113);
					}
					local36.aByte99 = local36.aByte100 = (byte) (local36.aByte99 + local177 & 0x3);
					if (client.aClass539_1.method30903(-463929735).method30429(local454, local461, 519945308)) {
						local36.aByte100++;
					}
					if (client.anInt3558 * 188678613 == arg1) {
						Class507.anInt5045 = local36.aByte99 * -1165759125;
					}
				}
			}
		} else if (!local13) {
			if (client.anInt3558 * 188678613 == arg1) {
				throw new RuntimeException();
			}
			@Pc(59) Class543 local59 = aClass543Array1[arg1] = new Class543();
			Class712.method37173(1941988846);
			local59.anInt5122 = ((local36.anIntArray234[0] + -390642507 * local3.anInt5540 >> 6 << 14) + (local36.aByte99 << 28) + (-894305615 * local3.anInt5537 + local36.anIntArray242[0] >> 6)) * -344784041;
			if (-469406145 * local36.anInt2714 == -1) {
				local59.anInt5123 = local36.aClass372_8.method28394((byte) 3) * 477795463;
			} else {
				local59.anInt5123 = local36.anInt2714 * -794849479;
			}
			local59.anInt5124 = local36.anInt2683 * -703689353;
			local59.aClass289_5 = local36.aClass289_1;
			local59.aBoolean905 = local36.aBoolean457;
			if (local36.anInt2719 * 1327765107 > 0) {
				Class243.method26296(local36, -2067093170);
			}
			client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[arg1] = null;
			if (arg0.method22559(1, -325783685) != 0) {
				Class438.method29147(arg0, arg1, (byte) 2);
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!asa;)V")
	static void method1044(@OriginalArg(0) PacketBit arg0) {
		arg0.method22560(1668075746);
		@Pc(6) int local6 = client.anInt3558 * 188678613;
		@Pc(19) Class120_Sub1_Sub1_Sub1_Sub2 local19 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local6] = new Class120_Sub1_Sub1_Sub1_Sub2(client.aClass539_1.method30932(-1638462787));
		local19.anInt2671 = local6 * -486069653;
		@Pc(29) int local29 = arg0.method22559(30, -325783685);
		@Pc(34) byte local34 = (byte) (local29 >> 28);
		@Pc(40) int local40 = local29 >> 14 & 0x3FFF;
		@Pc(44) int local44 = local29 & 0x3FFF;
		@Pc(48) Class626 local48 = client.aClass539_1.method30893((byte) -1);
		local19.anIntArray234[0] = local40 - local48.anInt5540 * -390642507;
		local19.anIntArray242[0] = local44 - local48.anInt5537 * -894305615;
		local19.method24531((float) ((local19.anIntArray234[0] << 9) + (local19.method18966((byte) -2) << 8)), local19.method24554().aClass463_61.aFloat295, (float) ((local19.anIntArray242[0] << 9) + (local19.method18966((byte) -93) << 8)));
		Class507.anInt5045 = (local19.aByte99 = local19.aByte100 = local34) * -1165759125;
		if (client.aClass539_1.method30903(-463929735).method30429(local19.anIntArray234[0], local19.anIntArray242[0], 637176961)) {
			local19.aByte100++;
		}
		if (aPacketArray1[local6] != null) {
			local19.method19053(aPacketArray1[local6], 2108577359);
		}
		if (aPacketArray2[local6] != null) {
			local19.method19054(aPacketArray2[local6], 2015216348);
		}
		anInt191 = 0;
		anIntArray20[(anInt191 += -585441073) * 44967471 - 1] = local6;
		aByteArray18[local6] = 0;
		anInt192 = 0;
		for (@Pc(173) int local173 = 1; local173 < 2048; local173++) {
			if (local173 != local6) {
				@Pc(185) int local185 = arg0.method22559(18, -325783685);
				@Pc(191) int local191 = local185 >> 16 & 0x3;
				@Pc(197) int local197 = local185 >> 8 & 0xFF;
				@Pc(201) int local201 = local185 & 0xFF;
				@Pc(209) Class543 local209 = aClass543Array1[local173] = new Class543();
				local209.anInt5122 = ((local197 << 14) + (local191 << 28) + local201) * -344784041;
				local209.anInt5123 = 0;
				local209.anInt5124 = 1760051131;
				local209.aClass289_5 = Class289.aClass289_2;
				local209.aBoolean905 = false;
				anIntArray21[(anInt192 += -1283238939) * -2044546579 - 1] = local173;
				aByteArray18[local173] = 0;
			}
		}
		arg0.method22568(-28112570);
		@Pc(259) Class340 local259 = BufferedSocket.aClass121_Sub1_2.method9607(-1326883180);
		if (Class340.aClass340_7 == local259) {
			@Pc(267) Class123_Sub3 local267 = (Class123_Sub3) BufferedSocket.aClass121_Sub1_2.method9603(-1665302503);
			local267.method10000((byte) 106);
		}
		@Pc(274) Class347 local274 = BufferedSocket.aClass121_Sub1_2.method9702(1835659828);
		if (local274 == Class347.aClass347_3) {
			@Pc(282) Class20_Sub5 local282 = (Class20_Sub5) BufferedSocket.aClass121_Sub1_2.method9693(1923310893);
			local282.method16939(516375657);
		}
	}

	@OriginalMember(owner = "client!ac", name = "s", descriptor = "(Lclient!asa;)V")
	static void method1045(@OriginalArg(0) PacketBit arg0) {
		arg0.method22560(1668075746);
		@Pc(6) int local6 = client.anInt3558 * 188678613;
		@Pc(19) Class120_Sub1_Sub1_Sub1_Sub2 local19 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local6] = new Class120_Sub1_Sub1_Sub1_Sub2(client.aClass539_1.method30932(-1638462787));
		local19.anInt2671 = local6 * -486069653;
		@Pc(29) int local29 = arg0.method22559(30, -325783685);
		@Pc(34) byte local34 = (byte) (local29 >> 28);
		@Pc(40) int local40 = local29 >> 14 & 0x3FFF;
		@Pc(44) int local44 = local29 & 0x3FFF;
		@Pc(48) Class626 local48 = client.aClass539_1.method30893((byte) -43);
		local19.anIntArray234[0] = local40 - local48.anInt5540 * -390642507;
		local19.anIntArray242[0] = local44 - local48.anInt5537 * -894305615;
		local19.method24531((float) ((local19.anIntArray234[0] << 9) + (local19.method18966((byte) -91) << 8)), local19.method24554().aClass463_61.aFloat295, (float) ((local19.anIntArray242[0] << 9) + (local19.method18966((byte) -100) << 8)));
		Class507.anInt5045 = (local19.aByte99 = local19.aByte100 = local34) * -1165759125;
		if (client.aClass539_1.method30903(-463929735).method30429(local19.anIntArray234[0], local19.anIntArray242[0], 1101790166)) {
			local19.aByte100++;
		}
		if (aPacketArray1[local6] != null) {
			local19.method19053(aPacketArray1[local6], 1791446336);
		}
		if (aPacketArray2[local6] != null) {
			local19.method19054(aPacketArray2[local6], 2015216348);
		}
		anInt191 = 0;
		anIntArray20[(anInt191 += -585441073) * 44967471 - 1] = local6;
		aByteArray18[local6] = 0;
		anInt192 = 0;
		for (@Pc(173) int local173 = 1; local173 < 2048; local173++) {
			if (local173 != local6) {
				@Pc(185) int local185 = arg0.method22559(18, -325783685);
				@Pc(191) int local191 = local185 >> 16 & 0x3;
				@Pc(197) int local197 = local185 >> 8 & 0xFF;
				@Pc(201) int local201 = local185 & 0xFF;
				@Pc(209) Class543 local209 = aClass543Array1[local173] = new Class543();
				local209.anInt5122 = ((local197 << 14) + (local191 << 28) + local201) * -344784041;
				local209.anInt5123 = 0;
				local209.anInt5124 = 1760051131;
				local209.aClass289_5 = Class289.aClass289_2;
				local209.aBoolean905 = false;
				anIntArray21[(anInt192 += -1283238939) * -2044546579 - 1] = local173;
				aByteArray18[local173] = 0;
			}
		}
		arg0.method22568(-369495473);
		@Pc(259) Class340 local259 = BufferedSocket.aClass121_Sub1_2.method9607(-1511025238);
		if (Class340.aClass340_7 == local259) {
			@Pc(267) Class123_Sub3 local267 = (Class123_Sub3) BufferedSocket.aClass121_Sub1_2.method9603(-2137873893);
			local267.method10000((byte) 101);
		}
		@Pc(274) Class347 local274 = BufferedSocket.aClass121_Sub1_2.method9702(1151916111);
		if (local274 == Class347.aClass347_3) {
			@Pc(282) Class20_Sub5 local282 = (Class20_Sub5) BufferedSocket.aClass121_Sub1_2.method9693(2072707499);
			local282.method16939(344663933);
		}
	}

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "(Lclient!asa;)V")
	static void method1046(@OriginalArg(0) PacketBit arg0) {
		arg0.method22560(1668075746);
		@Pc(6) int local6 = client.anInt3558 * 188678613;
		@Pc(19) Class120_Sub1_Sub1_Sub1_Sub2 local19 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local6] = new Class120_Sub1_Sub1_Sub1_Sub2(client.aClass539_1.method30932(-1638462787));
		local19.anInt2671 = local6 * -486069653;
		@Pc(29) int local29 = arg0.method22559(30, -325783685);
		@Pc(34) byte local34 = (byte) (local29 >> 28);
		@Pc(40) int local40 = local29 >> 14 & 0x3FFF;
		@Pc(44) int local44 = local29 & 0x3FFF;
		@Pc(48) Class626 local48 = client.aClass539_1.method30893((byte) -83);
		local19.anIntArray234[0] = local40 - local48.anInt5540 * -390642507;
		local19.anIntArray242[0] = local44 - local48.anInt5537 * -894305615;
		local19.method24531((float) ((local19.anIntArray234[0] << 9) + (local19.method18966((byte) -57) << 8)), local19.method24554().aClass463_61.aFloat295, (float) ((local19.anIntArray242[0] << 9) + (local19.method18966((byte) -60) << 8)));
		Class507.anInt5045 = (local19.aByte99 = local19.aByte100 = local34) * -1165759125;
		if (client.aClass539_1.method30903(-463929735).method30429(local19.anIntArray234[0], local19.anIntArray242[0], 1270113318)) {
			local19.aByte100++;
		}
		if (aPacketArray1[local6] != null) {
			local19.method19053(aPacketArray1[local6], 1856562004);
		}
		if (aPacketArray2[local6] != null) {
			local19.method19054(aPacketArray2[local6], 2015216348);
		}
		anInt191 = 0;
		anIntArray20[(anInt191 += -585441073) * 44967471 - 1] = local6;
		aByteArray18[local6] = 0;
		anInt192 = 0;
		for (@Pc(173) int local173 = 1; local173 < 2048; local173++) {
			if (local173 != local6) {
				@Pc(185) int local185 = arg0.method22559(18, -325783685);
				@Pc(191) int local191 = local185 >> 16 & 0x3;
				@Pc(197) int local197 = local185 >> 8 & 0xFF;
				@Pc(201) int local201 = local185 & 0xFF;
				@Pc(209) Class543 local209 = aClass543Array1[local173] = new Class543();
				local209.anInt5122 = ((local197 << 14) + (local191 << 28) + local201) * -344784041;
				local209.anInt5123 = 0;
				local209.anInt5124 = 1760051131;
				local209.aClass289_5 = Class289.aClass289_2;
				local209.aBoolean905 = false;
				anIntArray21[(anInt192 += -1283238939) * -2044546579 - 1] = local173;
				aByteArray18[local173] = 0;
			}
		}
		arg0.method22568(-427158967);
		@Pc(259) Class340 local259 = BufferedSocket.aClass121_Sub1_2.method9607(-484938653);
		if (Class340.aClass340_7 == local259) {
			@Pc(267) Class123_Sub3 local267 = (Class123_Sub3) BufferedSocket.aClass121_Sub1_2.method9603(-2105866551);
			local267.method10000((byte) 108);
		}
		@Pc(274) Class347 local274 = BufferedSocket.aClass121_Sub1_2.method9702(1777225533);
		if (local274 == Class347.aClass347_3) {
			@Pc(282) Class20_Sub5 local282 = (Class20_Sub5) BufferedSocket.aClass121_Sub1_2.method9693(1994118878);
			local282.method16939(-1865254856);
		}
	}

	@OriginalMember(owner = "client!ac", name = "x", descriptor = "(Lclient!asa;I)V")
	static void method1047(@OriginalArg(0) PacketBit arg0, @OriginalArg(1) int arg1) {
		anInt194 = 0;
		Class490.method30234(arg0, (byte) -9);
		Class355.method28098(arg0, (byte) -45);
		if (arg1 != arg0.pos * -1380987821) {
			throw new RuntimeException(arg0.pos * -1380987821 + " " + arg1);
		}
	}

	@OriginalMember(owner = "client!ac", name = "aq", descriptor = "(Lclient!asa;)V")
	static void method1048(@OriginalArg(0) PacketBit arg0) {
		for (@Pc(1) int local1 = 0; local1 < anInt194 * -1414067589; local1++) {
			arg0.g2();
			@Pc(14) int local14 = anIntArray22[local1];
			@Pc(18) Class120_Sub1_Sub1_Sub1_Sub2 local18 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local14];
			@Pc(22) int local22 = arg0.g1();
			if ((local22 & 0x40) != 0) {
				local22 += arg0.g1() << 8;
			}
			if ((local22 & 0x1000) != 0) {
				local22 += arg0.g1() << 16;
			}
			Class124_Sub1.method9831(arg0, local14, local18, local22, 336348436);
		}
	}

	@OriginalMember(owner = "client!ac", name = "w", descriptor = "(Lclient!asa;I)V")
	static void method1049(@OriginalArg(0) PacketBit arg0, @OriginalArg(1) int arg1) {
		anInt194 = 0;
		Class490.method30234(arg0, (byte) 23);
		Class355.method28098(arg0, (byte) -95);
		if (arg1 != arg0.pos * -1380987821) {
			throw new RuntimeException(arg0.pos * -1380987821 + " " + arg1);
		}
	}

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "(Lclient!asa;)I")
	static int method1050(@OriginalArg(0) PacketBit arg0) {
		@Pc(4) int local4 = arg0.method22559(2, -325783685);
		@Pc(8) int local8;
		if (local4 == 0) {
			local8 = 0;
		} else if (local4 == 1) {
			local8 = arg0.method22559(5, -325783685);
		} else if (local4 == 2) {
			local8 = arg0.method22559(8, -325783685);
		} else {
			local8 = arg0.method22559(11, -325783685);
		}
		return local8;
	}

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "(Lclient!asa;)V")
	static void method1051(@OriginalArg(0) PacketBit arg0) {
		@Pc(1) int local1 = 0;
		arg0.method22560(1668075746);
		@Pc(6) int local6;
		@Pc(15) int local15;
		@Pc(39) int local39;
		for (local6 = 0; local6 < anInt191 * 44967471; local6++) {
			local15 = anIntArray20[local6];
			if ((aByteArray18[local15] & 0x1) == 0) {
				if (local1 > 0) {
					local1--;
					aByteArray18[local15] = (byte) (aByteArray18[local15] | 0x2);
				} else {
					local39 = arg0.method22559(1, -325783685);
					if (local39 == 0) {
						local1 = Class351.method28022(arg0, 2029859237);
						aByteArray18[local15] = (byte) (aByteArray18[local15] | 0x2);
					} else {
						Class167.method17876(arg0, local15, 32884);
					}
				}
			}
		}
		arg0.method22568(1722420480);
		if (local1 != 0) {
			throw new RuntimeException();
		}
		arg0.method22560(1668075746);
		for (local6 = 0; local6 < anInt191 * 44967471; local6++) {
			local15 = anIntArray20[local6];
			if ((aByteArray18[local15] & 0x1) != 0) {
				if (local1 > 0) {
					local1--;
					aByteArray18[local15] = (byte) (aByteArray18[local15] | 0x2);
				} else {
					local39 = arg0.method22559(1, -325783685);
					if (local39 == 0) {
						local1 = Class351.method28022(arg0, 1318365058);
						aByteArray18[local15] = (byte) (aByteArray18[local15] | 0x2);
					} else {
						Class167.method17876(arg0, local15, 32884);
					}
				}
			}
		}
		arg0.method22568(-810424945);
		if (local1 != 0) {
			throw new RuntimeException();
		}
		arg0.method22560(1668075746);
		for (local6 = 0; local6 < anInt192 * -2044546579; local6++) {
			local15 = anIntArray21[local6];
			if ((aByteArray18[local15] & 0x1) != 0) {
				if (local1 > 0) {
					local1--;
					aByteArray18[local15] = (byte) (aByteArray18[local15] | 0x2);
				} else {
					local39 = arg0.method22559(1, -325783685);
					if (local39 == 0) {
						local1 = Class351.method28022(arg0, 1535851049);
						aByteArray18[local15] = (byte) (aByteArray18[local15] | 0x2);
					} else if (Class438.method29147(arg0, local15, (byte) 2)) {
						aByteArray18[local15] = (byte) (aByteArray18[local15] | 0x2);
					}
				}
			}
		}
		arg0.method22568(1589106065);
		if (local1 != 0) {
			throw new RuntimeException();
		}
		arg0.method22560(1668075746);
		for (local6 = 0; local6 < anInt192 * -2044546579; local6++) {
			local15 = anIntArray21[local6];
			if ((aByteArray18[local15] & 0x1) == 0) {
				if (local1 > 0) {
					local1--;
					aByteArray18[local15] = (byte) (aByteArray18[local15] | 0x2);
				} else {
					local39 = arg0.method22559(1, -325783685);
					if (local39 == 0) {
						local1 = Class351.method28022(arg0, 1395041096);
						aByteArray18[local15] = (byte) (aByteArray18[local15] | 0x2);
					} else if (Class438.method29147(arg0, local15, (byte) 2)) {
						aByteArray18[local15] = (byte) (aByteArray18[local15] | 0x2);
					}
				}
			}
		}
		arg0.method22568(-1170182619);
		if (local1 != 0) {
			throw new RuntimeException();
		}
		anInt191 = 0;
		anInt192 = 0;
		for (local6 = 1; local6 < 2048; local6++) {
			aByteArray18[local6] = (byte) (aByteArray18[local6] >> 1);
			@Pc(312) Class120_Sub1_Sub1_Sub1_Sub2 local312 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local6];
			if (local312 == null) {
				anIntArray21[(anInt192 += -1283238939) * -2044546579 - 1] = local6;
			} else {
				anIntArray20[(anInt191 += -585441073) * 44967471 - 1] = local6;
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(Lclient!asa;)V")
	static void method1052(@OriginalArg(0) PacketBit arg0) {
		@Pc(1) int local1 = 0;
		arg0.method22560(1668075746);
		@Pc(6) int local6;
		@Pc(15) int local15;
		@Pc(39) int local39;
		for (local6 = 0; local6 < anInt191 * 44967471; local6++) {
			local15 = anIntArray20[local6];
			if ((aByteArray18[local15] & 0x1) == 0) {
				if (local1 > 0) {
					local1--;
					aByteArray18[local15] = (byte) (aByteArray18[local15] | 0x2);
				} else {
					local39 = arg0.method22559(1, -325783685);
					if (local39 == 0) {
						local1 = Class351.method28022(arg0, 1720998661);
						aByteArray18[local15] = (byte) (aByteArray18[local15] | 0x2);
					} else {
						Class167.method17876(arg0, local15, 32884);
					}
				}
			}
		}
		arg0.method22568(-1038466952);
		if (local1 != 0) {
			throw new RuntimeException();
		}
		arg0.method22560(1668075746);
		for (local6 = 0; local6 < anInt191 * 44967471; local6++) {
			local15 = anIntArray20[local6];
			if ((aByteArray18[local15] & 0x1) != 0) {
				if (local1 > 0) {
					local1--;
					aByteArray18[local15] = (byte) (aByteArray18[local15] | 0x2);
				} else {
					local39 = arg0.method22559(1, -325783685);
					if (local39 == 0) {
						local1 = Class351.method28022(arg0, 1743988430);
						aByteArray18[local15] = (byte) (aByteArray18[local15] | 0x2);
					} else {
						Class167.method17876(arg0, local15, 32884);
					}
				}
			}
		}
		arg0.method22568(1962975436);
		if (local1 != 0) {
			throw new RuntimeException();
		}
		arg0.method22560(1668075746);
		for (local6 = 0; local6 < anInt192 * -2044546579; local6++) {
			local15 = anIntArray21[local6];
			if ((aByteArray18[local15] & 0x1) != 0) {
				if (local1 > 0) {
					local1--;
					aByteArray18[local15] = (byte) (aByteArray18[local15] | 0x2);
				} else {
					local39 = arg0.method22559(1, -325783685);
					if (local39 == 0) {
						local1 = Class351.method28022(arg0, 2038921139);
						aByteArray18[local15] = (byte) (aByteArray18[local15] | 0x2);
					} else if (Class438.method29147(arg0, local15, (byte) 2)) {
						aByteArray18[local15] = (byte) (aByteArray18[local15] | 0x2);
					}
				}
			}
		}
		arg0.method22568(1403863250);
		if (local1 != 0) {
			throw new RuntimeException();
		}
		arg0.method22560(1668075746);
		for (local6 = 0; local6 < anInt192 * -2044546579; local6++) {
			local15 = anIntArray21[local6];
			if ((aByteArray18[local15] & 0x1) == 0) {
				if (local1 > 0) {
					local1--;
					aByteArray18[local15] = (byte) (aByteArray18[local15] | 0x2);
				} else {
					local39 = arg0.method22559(1, -325783685);
					if (local39 == 0) {
						local1 = Class351.method28022(arg0, 2105178701);
						aByteArray18[local15] = (byte) (aByteArray18[local15] | 0x2);
					} else if (Class438.method29147(arg0, local15, (byte) 2)) {
						aByteArray18[local15] = (byte) (aByteArray18[local15] | 0x2);
					}
				}
			}
		}
		arg0.method22568(48058151);
		if (local1 != 0) {
			throw new RuntimeException();
		}
		anInt191 = 0;
		anInt192 = 0;
		for (local6 = 1; local6 < 2048; local6++) {
			aByteArray18[local6] = (byte) (aByteArray18[local6] >> 1);
			@Pc(312) Class120_Sub1_Sub1_Sub1_Sub2 local312 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local6];
			if (local312 == null) {
				anIntArray21[(anInt192 += -1283238939) * -2044546579 - 1] = local6;
			} else {
				anIntArray20[(anInt191 += -585441073) * 44967471 - 1] = local6;
			}
		}
	}

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "(Lclient!asa;)V")
	static void method1053(@OriginalArg(0) PacketBit arg0) {
		arg0.method22560(1668075746);
		@Pc(6) int local6 = client.anInt3558 * 188678613;
		@Pc(19) Class120_Sub1_Sub1_Sub1_Sub2 local19 = Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local6] = new Class120_Sub1_Sub1_Sub1_Sub2(client.aClass539_1.method30932(-1638462787));
		local19.anInt2671 = local6 * -486069653;
		@Pc(29) int local29 = arg0.method22559(30, -325783685);
		@Pc(34) byte local34 = (byte) (local29 >> 28);
		@Pc(40) int local40 = local29 >> 14 & 0x3FFF;
		@Pc(44) int local44 = local29 & 0x3FFF;
		@Pc(48) Class626 local48 = client.aClass539_1.method30893((byte) -127);
		local19.anIntArray234[0] = local40 - local48.anInt5540 * -390642507;
		local19.anIntArray242[0] = local44 - local48.anInt5537 * -894305615;
		local19.method24531((float) ((local19.anIntArray234[0] << 9) + (local19.method18966((byte) -55) << 8)), local19.method24554().aClass463_61.aFloat295, (float) ((local19.anIntArray242[0] << 9) + (local19.method18966((byte) -83) << 8)));
		Class507.anInt5045 = (local19.aByte99 = local19.aByte100 = local34) * -1165759125;
		if (client.aClass539_1.method30903(-463929735).method30429(local19.anIntArray234[0], local19.anIntArray242[0], 2112068185)) {
			local19.aByte100++;
		}
		if (aPacketArray1[local6] != null) {
			local19.method19053(aPacketArray1[local6], 1742486153);
		}
		if (aPacketArray2[local6] != null) {
			local19.method19054(aPacketArray2[local6], 2015216348);
		}
		anInt191 = 0;
		anIntArray20[(anInt191 += -585441073) * 44967471 - 1] = local6;
		aByteArray18[local6] = 0;
		anInt192 = 0;
		for (@Pc(173) int local173 = 1; local173 < 2048; local173++) {
			if (local173 != local6) {
				@Pc(185) int local185 = arg0.method22559(18, -325783685);
				@Pc(191) int local191 = local185 >> 16 & 0x3;
				@Pc(197) int local197 = local185 >> 8 & 0xFF;
				@Pc(201) int local201 = local185 & 0xFF;
				@Pc(209) Class543 local209 = aClass543Array1[local173] = new Class543();
				local209.anInt5122 = ((local197 << 14) + (local191 << 28) + local201) * -344784041;
				local209.anInt5123 = 0;
				local209.anInt5124 = 1760051131;
				local209.aClass289_5 = Class289.aClass289_2;
				local209.aBoolean905 = false;
				anIntArray21[(anInt192 += -1283238939) * -2044546579 - 1] = local173;
				aByteArray18[local173] = 0;
			}
		}
		arg0.method22568(-678686861);
		@Pc(259) Class340 local259 = BufferedSocket.aClass121_Sub1_2.method9607(-961087715);
		if (Class340.aClass340_7 == local259) {
			@Pc(267) Class123_Sub3 local267 = (Class123_Sub3) BufferedSocket.aClass121_Sub1_2.method9603(-1662778384);
			local267.method10000((byte) 121);
		}
		@Pc(274) Class347 local274 = BufferedSocket.aClass121_Sub1_2.method9702(1922774153);
		if (local274 == Class347.aClass347_3) {
			@Pc(282) Class20_Sub5 local282 = (Class20_Sub5) BufferedSocket.aClass121_Sub1_2.method9693(2127997172);
			local282.method16939(-1283088274);
		}
	}

	@OriginalMember(owner = "client!ac", name = "y", descriptor = "(Lclient!asa;)I")
	static int method1054(@OriginalArg(0) PacketBit arg0) {
		@Pc(4) int local4 = arg0.method22559(2, -325783685);
		@Pc(8) int local8;
		if (local4 == 0) {
			local8 = 0;
		} else if (local4 == 1) {
			local8 = arg0.method22559(5, -325783685);
		} else if (local4 == 2) {
			local8 = arg0.method22559(8, -325783685);
		} else {
			local8 = arg0.method22559(11, -325783685);
		}
		return local8;
	}

	@OriginalMember(owner = "client!ac", name = "v", descriptor = "(Lclient!asa;)I")
	static int method1055(@OriginalArg(0) PacketBit arg0) {
		@Pc(4) int local4 = arg0.method22559(2, -325783685);
		@Pc(8) int local8;
		if (local4 == 0) {
			local8 = 0;
		} else if (local4 == 1) {
			local8 = arg0.method22559(5, -325783685);
		} else if (local4 == 2) {
			local8 = arg0.method22559(8, -325783685);
		} else {
			local8 = arg0.method22559(11, -325783685);
		}
		return local8;
	}

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "(Lclient!asa;)I")
	static int method1056(@OriginalArg(0) PacketBit arg0) {
		@Pc(4) int local4 = arg0.method22559(2, -325783685);
		@Pc(8) int local8;
		if (local4 == 0) {
			local8 = 0;
		} else if (local4 == 1) {
			local8 = arg0.method22559(5, -325783685);
		} else if (local4 == 2) {
			local8 = arg0.method22559(8, -325783685);
		} else {
			local8 = arg0.method22559(11, -325783685);
		}
		return local8;
	}

	@OriginalMember(owner = "client!ac", name = "z", descriptor = "(Lclient!asa;)I")
	static int method1057(@OriginalArg(0) PacketBit arg0) {
		@Pc(4) int local4 = arg0.method22559(2, -325783685);
		@Pc(8) int local8;
		if (local4 == 0) {
			local8 = 0;
		} else if (local4 == 1) {
			local8 = arg0.method22559(5, -325783685);
		} else if (local4 == 2) {
			local8 = arg0.method22559(8, -325783685);
		} else {
			local8 = arg0.method22559(11, -325783685);
		}
		return local8;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(Lclient!asa;I)Z")
	static boolean method1058(@OriginalArg(0) PacketBit arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0.method22559(2, -325783685);
		@Pc(21) int local21;
		@Pc(26) int local26;
		@Pc(119) int local119;
		@Pc(123) int local123;
		@Pc(129) int local129;
		@Pc(133) int local133;
		if (local4 == 0) {
			if (arg0.method22559(1, -325783685) != 0) {
				Class438.method29147(arg0, arg1, (byte) 2);
			}
			local21 = arg0.method22559(6, -325783685);
			local26 = arg0.method22559(6, -325783685);
			@Pc(36) boolean local36 = arg0.method22559(1, -325783685) == 1;
			if (local36) {
				anIntArray22[(anInt194 += -985578317) * -1414067589 - 1] = arg1;
			}
			if (client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[arg1] != null) {
				throw new RuntimeException();
			}
			@Pc(63) Class543 local63 = aClass543Array1[arg1];
			@Pc(74) Class120_Sub1_Sub1_Sub1_Sub2 local74 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[arg1] = new Class120_Sub1_Sub1_Sub1_Sub2(client.aClass539_1.method30932(-1638462787));
			local74.anInt2671 = arg1 * -486069653;
			if (aPacketArray1[arg1] != null) {
				local74.method19053(aPacketArray1[arg1], 2111872767);
			}
			if (aPacketArray2[arg1] != null) {
				local74.method19054(aPacketArray2[arg1], 2015216348);
			}
			local74.method18986(local63.anInt5123 * 36827447, true, (byte) -124);
			local74.anInt2683 = local63.anInt5124 * 434134087;
			local119 = local63.anInt5122 * -1301112729;
			local123 = local119 >> 28;
			local129 = local119 >> 14 & 0xFF;
			local133 = local119 & 0xFF;
			@Pc(137) Class626 local137 = client.aClass539_1.method30893((byte) -23);
			@Pc(148) int local148 = local21 + (local129 << 6) - local137.anInt5540 * -390642507;
			@Pc(159) int local159 = local26 + (local133 << 6) - local137.anInt5537 * -894305615;
			local74.aClass289_1 = local63.aClass289_5;
			local74.aBoolean457 = local63.aBoolean905;
			local74.aByteArray49[0] = aByteArray17[arg1];
			local74.aByte99 = local74.aByte100 = (byte) local123;
			if (client.aClass539_1.method30903(-463929735).method30429(local148, local159, 1143701745)) {
				local74.aByte100++;
			}
			local74.method19063(local148, local159, (byte) 3);
			aClass543Array1[arg1] = null;
			return true;
		} else if (local4 == 1) {
			local21 = arg0.method22559(2, -325783685);
			local26 = aClass543Array1[arg1].anInt5122 * -1301112729;
			aClass543Array1[arg1].anInt5122 = ((((local26 >> 28) + local21 & 0x3) << 28) + (local26 & 0xFFFFFFF)) * -344784041;
			return false;
		} else {
			@Pc(261) int local261;
			@Pc(268) int local268;
			@Pc(291) int local291;
			if (local4 != 2) {
				local21 = arg0.method22559(20, -325783685);
				local26 = local21 >> 18 & 0x3;
				local261 = local21 >> 16 & 0x3;
				local268 = local21 >> 8 & 0xFF;
				local291 = local21 & 0xFF;
				local119 = aClass543Array1[arg1].anInt5122 * -1301112729;
				aByteArray17[arg1] = (byte) (local26 - 1);
				assert aByteArray17[arg1] >= 0 && aByteArray17[arg1] <= 3;
				local123 = local261 + (local119 >> 28) & 0x3;
				local129 = local268 + (local119 >> 14) & 0xFF;
				local133 = local291 + local119 & 0xFF;
				Class80_Sub39.method15030(Class712.method37173(-1985223418), local26 - 1, -1537909965);
				aClass543Array1[arg1].anInt5122 = ((local123 << 28) + (local129 << 14) + local133) * -344784041;
				return false;
			}
			local21 = arg0.method22559(5, -325783685);
			local26 = local21 >> 3 & 0x3;
			local261 = local21 & 0x7;
			local268 = aClass543Array1[arg1].anInt5122 * -1301112729;
			assert aByteArray17[arg1] >= 0 && aByteArray17[arg1] <= 3;
			local291 = (local268 >> 28) + local26 & 0x3;
			local119 = local268 >> 14 & 0xFF;
			local123 = local268 & 0xFF;
			if (local261 == 0) {
				local119--;
				local123--;
			}
			if (local261 == 1) {
				local123--;
			}
			if (local261 == 2) {
				local119++;
				local123--;
			}
			if (local261 == 3) {
				local119--;
			}
			if (local261 == 4) {
				local119++;
			}
			if (local261 == 5) {
				local119--;
				local123++;
			}
			if (local261 == 6) {
				local123++;
			}
			if (local261 == 7) {
				local119++;
				local123++;
			}
			Class80_Sub39.method15030(Class712.method37173(1384621735), aByteArray17[arg1], -1758435042);
			aClass543Array1[arg1].anInt5122 = (local123 + (local119 << 14) + (local291 << 28)) * -344784041;
			return false;
		}
	}

	@OriginalMember(owner = "client!ac", name = "ax", descriptor = "(Lclient!asa;I)Z")
	static boolean method1059(@OriginalArg(0) PacketBit arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = arg0.method22559(2, -325783685);
		@Pc(21) int local21;
		@Pc(26) int local26;
		@Pc(119) int local119;
		@Pc(123) int local123;
		@Pc(129) int local129;
		@Pc(133) int local133;
		if (local4 == 0) {
			if (arg0.method22559(1, -325783685) != 0) {
				Class438.method29147(arg0, arg1, (byte) 2);
			}
			local21 = arg0.method22559(6, -325783685);
			local26 = arg0.method22559(6, -325783685);
			@Pc(36) boolean local36 = arg0.method22559(1, -325783685) == 1;
			if (local36) {
				anIntArray22[(anInt194 += -985578317) * -1414067589 - 1] = arg1;
			}
			if (client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[arg1] != null) {
				throw new RuntimeException();
			}
			@Pc(63) Class543 local63 = aClass543Array1[arg1];
			@Pc(74) Class120_Sub1_Sub1_Sub1_Sub2 local74 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[arg1] = new Class120_Sub1_Sub1_Sub1_Sub2(client.aClass539_1.method30932(-1638462787));
			local74.anInt2671 = arg1 * -486069653;
			if (aPacketArray1[arg1] != null) {
				local74.method19053(aPacketArray1[arg1], 2085540671);
			}
			if (aPacketArray2[arg1] != null) {
				local74.method19054(aPacketArray2[arg1], 2015216348);
			}
			local74.method18986(local63.anInt5123 * 36827447, true, (byte) -82);
			local74.anInt2683 = local63.anInt5124 * 434134087;
			local119 = local63.anInt5122 * -1301112729;
			local123 = local119 >> 28;
			local129 = local119 >> 14 & 0xFF;
			local133 = local119 & 0xFF;
			@Pc(137) Class626 local137 = client.aClass539_1.method30893((byte) -100);
			@Pc(148) int local148 = local21 + (local129 << 6) - local137.anInt5540 * -390642507;
			@Pc(159) int local159 = local26 + (local133 << 6) - local137.anInt5537 * -894305615;
			local74.aClass289_1 = local63.aClass289_5;
			local74.aBoolean457 = local63.aBoolean905;
			local74.aByteArray49[0] = aByteArray17[arg1];
			local74.aByte99 = local74.aByte100 = (byte) local123;
			if (client.aClass539_1.method30903(-463929735).method30429(local148, local159, 2021952624)) {
				local74.aByte100++;
			}
			local74.method19063(local148, local159, (byte) 3);
			aClass543Array1[arg1] = null;
			return true;
		} else if (local4 == 1) {
			local21 = arg0.method22559(2, -325783685);
			local26 = aClass543Array1[arg1].anInt5122 * -1301112729;
			aClass543Array1[arg1].anInt5122 = ((((local26 >> 28) + local21 & 0x3) << 28) + (local26 & 0xFFFFFFF)) * -344784041;
			return false;
		} else {
			@Pc(261) int local261;
			@Pc(268) int local268;
			@Pc(291) int local291;
			if (local4 != 2) {
				local21 = arg0.method22559(20, -325783685);
				local26 = local21 >> 18 & 0x3;
				local261 = local21 >> 16 & 0x3;
				local268 = local21 >> 8 & 0xFF;
				local291 = local21 & 0xFF;
				local119 = aClass543Array1[arg1].anInt5122 * -1301112729;
				aByteArray17[arg1] = (byte) (local26 - 1);
				assert aByteArray17[arg1] >= 0 && aByteArray17[arg1] <= 3;
				local123 = local261 + (local119 >> 28) & 0x3;
				local129 = local268 + (local119 >> 14) & 0xFF;
				local133 = local291 + local119 & 0xFF;
				Class80_Sub39.method15030(Class712.method37173(335541949), local26 - 1, -1607124172);
				aClass543Array1[arg1].anInt5122 = ((local123 << 28) + (local129 << 14) + local133) * -344784041;
				return false;
			}
			local21 = arg0.method22559(5, -325783685);
			local26 = local21 >> 3 & 0x3;
			local261 = local21 & 0x7;
			local268 = aClass543Array1[arg1].anInt5122 * -1301112729;
			assert aByteArray17[arg1] >= 0 && aByteArray17[arg1] <= 3;
			local291 = (local268 >> 28) + local26 & 0x3;
			local119 = local268 >> 14 & 0xFF;
			local123 = local268 & 0xFF;
			if (local261 == 0) {
				local119--;
				local123--;
			}
			if (local261 == 1) {
				local123--;
			}
			if (local261 == 2) {
				local119++;
				local123--;
			}
			if (local261 == 3) {
				local119--;
			}
			if (local261 == 4) {
				local119++;
			}
			if (local261 == 5) {
				local119--;
				local123++;
			}
			if (local261 == 6) {
				local123++;
			}
			if (local261 == 7) {
				local119++;
				local123++;
			}
			Class80_Sub39.method15030(Class712.method37173(-1340826172), aByteArray17[arg1], -834047750);
			aClass543Array1[arg1].anInt5122 = (local123 + (local119 << 14) + (local291 << 28)) * -344784041;
			return false;
		}
	}

	@OriginalMember(owner = "client!ac", name = "ay", descriptor = "(Lclient!asa;)V")
	static void method1060(@OriginalArg(0) PacketBit arg0) {
		for (@Pc(1) int local1 = 0; local1 < anInt194 * -1414067589; local1++) {
			arg0.g2();
			@Pc(14) int local14 = anIntArray22[local1];
			@Pc(18) Class120_Sub1_Sub1_Sub1_Sub2 local18 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local14];
			@Pc(22) int local22 = arg0.g1();
			if ((local22 & 0x40) != 0) {
				local22 += arg0.g1() << 8;
			}
			if ((local22 & 0x1000) != 0) {
				local22 += arg0.g1() << 16;
			}
			Class124_Sub1.method9831(arg0, local14, local18, local22, -1686104250);
		}
	}

	@OriginalMember(owner = "client!ac", name = "r", descriptor = "(Lclient!asa;I)V")
	static void method1061(@OriginalArg(0) PacketBit arg0, @OriginalArg(1) int arg1) {
		anInt194 = 0;
		Class490.method30234(arg0, (byte) 15);
		Class355.method28098(arg0, (byte) -95);
		if (arg1 != arg0.pos * -1380987821) {
			throw new RuntimeException(arg0.pos * -1380987821 + " " + arg1);
		}
	}

	@OriginalMember(owner = "client!ac", name = "ao", descriptor = "(Lclient!asa;)V")
	static void method1062(@OriginalArg(0) PacketBit arg0) {
		for (@Pc(1) int local1 = 0; local1 < anInt194 * -1414067589; local1++) {
			arg0.g2();
			@Pc(14) int local14 = anIntArray22[local1];
			@Pc(18) Class120_Sub1_Sub1_Sub1_Sub2 local18 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local14];
			@Pc(22) int local22 = arg0.g1();
			if ((local22 & 0x40) != 0) {
				local22 += arg0.g1() << 8;
			}
			if ((local22 & 0x1000) != 0) {
				local22 += arg0.g1() << 16;
			}
			Class124_Sub1.method9831(arg0, local14, local18, local22, 516187774);
		}
	}

	@OriginalMember(owner = "client!ac", name = "aj", descriptor = "()V")
	static void method1063() {
		anInt191 = 0;
		for (@Pc(3) int local3 = 0; local3 < 2048; local3++) {
			aPacketArray1[local3] = null;
			aPacketArray2[local3] = null;
			aByteArray17[local3] = Class712.aClass712_2.aByte165;
			aClass543Array1[local3] = null;
		}
	}

	@OriginalMember(owner = "client!ac", name = "amy", descriptor = "(Lclient!yp;B)V")
	static void method1064(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class691.method36971(-435118065);
	}

	@OriginalMember(owner = "client!ac", name = "aeu", descriptor = "(Lclient!yp;B)V")
	static void method1065(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local13 % local23;
	}

	@OriginalMember(owner = "client!ac", name = "ahx", descriptor = "(Lclient!yp;I)V")
	static void method1066(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(28) Class80_Sub1_Sub14 local28 = Class103_Sub23.method8701(local13, local23, -221471862);
		if (local28 != null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local28.anInt3100 * 102067333;
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = Class682.method36709(local28.aLong262 * -7838853670110439257L, Class512.aClass719_3.anInt5827 * 379080821, 1495571818);
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local28.anInt3102 * 2118734045;
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local28.aString111 == null ? "" : local28.aString111;
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local28.aString110 == null ? "" : local28.aString110;
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local28.aString113 == null ? "" : local28.aString113;
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local28.aString114 == null ? "" : local28.aString114;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local28.anInt3101 * -949162007;
			arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = local28.aString112 == null ? "" : local28.aString112;
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local28.aClass452_1 == null ? -1 : local28.aClass452_1.getId();
			return;
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = "";
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = -1;
	}

	@OriginalMember(owner = "client!ac", name = "cb", descriptor = "(Lclient!yp;B)V")
	static void method1067(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2010588937);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class446.method29251(local16, local22, arg0, 170236002);
	}

	@OriginalMember(owner = "client!ac", name = "aij", descriptor = "(Lclient!yp;I)V")
	static void method1068(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 1815275855;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		@Pc(38) Class80_Sub1_Sub19 local38 = Class610.aClass52_2.method1073(local13, 2067265362);
		if (local38.method23052(local23, 1194945131).anInt5697 * 809932323 != 0) {
			throw new RuntimeException("");
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local38.method23054(local23, local33, (byte) 19);
	}

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
	Class51() throws Throwable {
		throw new Error();
	}
}
