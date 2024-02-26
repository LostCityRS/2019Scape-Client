package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class167 {

	@OriginalMember(owner = "client!ap", name = "aa", descriptor = "I")
	static int anInt2472;

	@OriginalMember(owner = "client!ap", name = "j", descriptor = "I")
	int anInt2465;

	@OriginalMember(owner = "client!ap", name = "m", descriptor = "I")
	int anInt2466;

	@OriginalMember(owner = "client!ap", name = "i", descriptor = "I")
	int anInt2469;

	@OriginalMember(owner = "client!ap", name = "o", descriptor = "I")
	int anInt2470;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "F")
	float aFloat162;

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "F")
	float aFloat161 = 1.0F;

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "F")
	float aFloat160 = 1.0F;

	@OriginalMember(owner = "client!ap", name = "t", descriptor = "I")
	int anInt2464;

	@OriginalMember(owner = "client!ap", name = "u", descriptor = "I")
	int anInt2471;

	@OriginalMember(owner = "client!ap", name = "l", descriptor = "I")
	int anInt2467;

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "I")
	int anInt2468;

	@OriginalMember(owner = "client!ap", name = "du", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;B)V")
	static void method17874(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) byte arg3) {
		arg0.anInt4136 = 1666794573;
		arg0.anInt4122 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581] * -258024019;
		Class296.method26998(arg0, 1221609545);
		if (arg0.anInt4094 * 2071556223 == -1 && !arg1.aBoolean794) {
			Class22.method546(arg0.anInt4087 * -2053489901, (byte) -87);
		}
	}

	@OriginalMember(owner = "client!ap", name = "bfj", descriptor = "(Lclient!yp;I)V")
	static void method17875(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
	}

	@OriginalMember(owner = "client!ap", name = "l", descriptor = "(Lclient!asa;II)V")
	static void method17876(@OriginalArg(0) PacketBit arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) Class626 local3 = client.aClass539_1.method30893((byte) -109);
		@Pc(13) boolean local13 = arg0.method22559(1, -325783685) == 1;
		if (local13) {
			Class51.anIntArray22[(Class51.anInt194 += -985578317) * -1414067589 - 1] = arg1;
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
					Class51.aByteArray17[arg1] = Class712.aClass712_5.aByte165;
					local190 = arg0.method22559(2, -325783685);
					switch(local190) {
						case 0:
							local36.method19058(local172, local177 + 1, Class51.aByteArray17[arg1], (byte) -89);
							break;
						case 1:
							local36.method19058(local172 - 1, local177, Class51.aByteArray17[arg1], (byte) -66);
							break;
						case 2:
							local36.method19058(local172 + 1, local177, Class51.aByteArray17[arg1], (byte) -60);
							break;
						case 3:
							local36.method19058(local172, local177 - 1, Class51.aByteArray17[arg1], (byte) -32);
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
				local36.method19058(local172, local177, Class51.aByteArray17[arg1], (byte) -82);
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
				local36.method19058(local167, local172, Class51.aByteArray17[arg1], (byte) -126);
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
						Class51.aByteArray17[arg1] = (byte) (local172 - 1);
						local36.method19058(local454, local461, Class51.aByteArray17[arg1], (byte) -115);
					}
					local36.aByte99 = local36.aByte100 = (byte) (local177 + local36.aByte99 & 0x3);
					if (client.aClass539_1.method30903(-463929735).method30429(local454, local461, 1776114423)) {
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
						Class51.aByteArray17[arg1] = (byte) (local167 - 1);
						local36.method19058(local454, local461, Class51.aByteArray17[arg1], (byte) -82);
					}
					local36.aByte99 = local36.aByte100 = (byte) (local36.aByte99 + local177 & 0x3);
					if (client.aClass539_1.method30903(-463929735).method30429(local454, local461, 283761777)) {
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
			@Pc(59) Class543 local59 = Class51.aClass543Array1[arg1] = new Class543();
			Class712.method37173(-1940535285);
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
				Class243.method26296(local36, 2083976942);
			}
			client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[arg1] = null;
			if (arg0.method22559(1, -325783685) != 0) {
				Class438.method29147(arg0, arg1, (byte) 2);
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "ke", descriptor = "(Ljava/lang/String;I)V")
	public static void method17877(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (!client.aBoolean728 || (Class542.anInt5121 * -1641097909 & 0x18) == 0) {
			return;
		}
		@Pc(10) boolean local10 = false;
		@Pc(14) int local14 = Class51.anInt191 * 44967471;
		@Pc(16) int[] local16 = Class51.anIntArray20;
		for (@Pc(18) int local18 = 0; local18 < local14; local18++) {
			@Pc(27) Class120_Sub1_Sub1_Sub1_Sub2 local27 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local16[local18]];
			if (local27.aString73 != null && local27.aString73.equalsIgnoreCase(arg0) && (local27 == Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 && (Class542.anInt5121 * -1641097909 & 0x10) != 0 || (Class542.anInt5121 * -1641097909 & 0x8) != 0)) {
				@Pc(58) Class80_Sub31 local58 = Class623.method32440(Class443.aClass443_80, client.aClass75_1.aClass22_1, -191270971);
				local58.aPacketBit_2.p2_alt2(local16[local18]);
				local58.aPacketBit_2.p1(0);
				local58.aPacketBit_2.p2_alt2(client.anInt3527 * 206551609);
				local58.aPacketBit_2.p2_alt1(client.anInt3526 * 1831183447);
				local58.aPacketBit_2.p4_alt1(Class86.anInt284 * 531357219);
				client.aClass75_1.method1325(local58, (byte) -23);
				Class103_Sub13.method7939(local27.anIntArray234[0], local27.anIntArray242[0], 1668620322);
				local10 = true;
				break;
			}
		}
		if (!local10) {
			Class141.method10906(4, Class60.aClass60_128.method1180(Class512.aClass719_3, 416163734) + arg0, (byte) 126);
		}
		if (client.aBoolean728) {
			Class450.method29279((byte) 91);
		}
	}

	@OriginalMember(owner = "client!ap", name = "atk", descriptor = "(Lclient!yp;B)V")
	static void method17878(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= 2036747717;
	}

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(IFFIII)V")
	Class167(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2464 = arg0 * 1413833609;
		this.aFloat161 = arg1;
		this.aFloat160 = arg2;
		this.anInt2471 = arg3 * 1470884363;
		this.anInt2467 = arg4 * -1812796617;
		this.anInt2468 = arg5 * 1429191505;
	}

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(I)V")
	Class167(@OriginalArg(0) int arg0) {
		this.anInt2464 = arg0 * 1413833609;
	}

	@OriginalMember(owner = "client!ap", name = "t", descriptor = "(I)Lclient!ap;")
	Class167 method17868(@OriginalArg(0) int arg0) {
		return new Class167(this.anInt2464 * -1921776967, this.aFloat161, this.aFloat160, this.anInt2471 * -876228189, this.anInt2467 * 1677769351, this.anInt2468 * 668888497);
	}

	@OriginalMember(owner = "client!ap", name = "u", descriptor = "()Lclient!ap;")
	Class167 method17869() {
		return new Class167(this.anInt2464 * -1921776967, this.aFloat161, this.aFloat160, this.anInt2471 * -876228189, this.anInt2467 * 1677769351, this.anInt2468 * 668888497);
	}

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "(Lclient!ap;I)V")
	void method17870(@OriginalArg(0) Class167 arg0, @OriginalArg(1) int arg1) {
		this.aFloat161 = arg0.aFloat161;
		this.aFloat160 = arg0.aFloat160;
		this.anInt2471 = arg0.anInt2471;
		this.anInt2467 = arg0.anInt2467;
		this.anInt2464 = arg0.anInt2464;
		this.anInt2468 = arg0.anInt2468;
	}

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "()Lclient!ap;")
	Class167 method17871() {
		return new Class167(this.anInt2464 * -1921776967, this.aFloat161, this.aFloat160, this.anInt2471 * -876228189, this.anInt2467 * 1677769351, this.anInt2468 * 668888497);
	}

	@OriginalMember(owner = "client!ap", name = "l", descriptor = "(Lclient!ap;)V")
	void method17872(@OriginalArg(0) Class167 arg0) {
		this.aFloat161 = arg0.aFloat161;
		this.aFloat160 = arg0.aFloat160;
		this.anInt2471 = arg0.anInt2471;
		this.anInt2467 = arg0.anInt2467;
		this.anInt2464 = arg0.anInt2464;
		this.anInt2468 = arg0.anInt2468;
	}

	@OriginalMember(owner = "client!ap", name = "g", descriptor = "(Lclient!ap;)V")
	void method17873(@OriginalArg(0) Class167 arg0) {
		this.aFloat161 = arg0.aFloat161;
		this.aFloat160 = arg0.aFloat160;
		this.anInt2471 = arg0.anInt2471;
		this.anInt2467 = arg0.anInt2467;
		this.anInt2464 = arg0.anInt2464;
		this.anInt2468 = arg0.anInt2468;
	}
}
