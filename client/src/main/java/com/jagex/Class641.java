package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public class Class641 implements Interface75 {

	@OriginalMember(owner = "client!wn", name = "e", descriptor = "Lclient!wn;")
	static final Class641 aClass641_3 = new Class641(0);

	@OriginalMember(owner = "client!wn", name = "n", descriptor = "Lclient!wn;")
	public static final Class641 aClass641_2 = new Class641(1);

	@OriginalMember(owner = "client!wn", name = "m", descriptor = "Lclient!wn;")
	public static final Class641 aClass641_1 = new Class641(2);

	@OriginalMember(owner = "client!wn", name = "k", descriptor = "I")
	final int anInt5756;

	@OriginalMember(owner = "client!wn", name = "f", descriptor = "()[Lclient!wn;", line = 14)
	public static Class641[] method32501() {
		return new Class641[] { aClass641_3, aClass641_2, aClass641_1 };
	}

	@OriginalMember(owner = "client!wn", name = "m", descriptor = "()[Lclient!wn;", line = 14)
	public static Class641[] method32502() {
		return new Class641[] { aClass641_3, aClass641_2, aClass641_1 };
	}

	@OriginalMember(owner = "client!wn", name = "z", descriptor = "()[Lclient!wn;", line = 14)
	public static Class641[] method32503() {
		return new Class641[] { aClass641_3, aClass641_2, aClass641_1 };
	}

	@OriginalMember(owner = "client!wn", name = "w", descriptor = "()[Lclient!wn;", line = 14)
	public static Class641[] method32504() {
		return new Class641[] { aClass641_3, aClass641_2, aClass641_1 };
	}

	@OriginalMember(owner = "client!wn", name = "u", descriptor = "()[Lclient!wn;", line = 14)
	public static Class641[] method32505() {
		return new Class641[] { aClass641_3, aClass641_2, aClass641_1 };
	}

	@OriginalMember(owner = "client!wn", name = "l", descriptor = "()[Lclient!wn;", line = 14)
	public static Class641[] method32506() {
		return new Class641[] { aClass641_3, aClass641_2, aClass641_1 };
	}

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(I)V", line = 17)
	Class641(@OriginalArg(0) int arg0) {
		this.anInt5756 = arg0 * -1124084087;
	}

	@OriginalMember(owner = "client!wn", name = "n", descriptor = "()I", line = 22)
	@Override
	public int getId() {
		return this.anInt5756 * -1775206471;
	}

	@OriginalMember(owner = "client!wn", name = "k", descriptor = "()I", line = 22)
	@Override
	public int method36919() {
		return this.anInt5756 * -1775206471;
	}

	@OriginalMember(owner = "client!wn", name = "f", descriptor = "(IIIIIIB)I", line = 43)
	public static int method32507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6) {
		if ((arg5 & 0x1) == 1) {
			@Pc(6) int local6 = arg3;
			arg3 = arg4;
			arg4 = local6;
		}
		@Pc(14) int local14 = arg2 & 0x3;
		if (local14 == 0) {
			return arg0;
		} else if (local14 == 1) {
			return arg1;
		} else if (local14 == 2) {
			return 7 - arg0 - (arg3 - 1);
		} else {
			return 7 - arg1 - (arg4 - 1);
		}
	}

	@OriginalMember(owner = "client!wn", name = "iy", descriptor = "(Lclient!nk;I)V", line = 9067)
	static final void readZonePacket(@OriginalArg(0) ZoneProt arg0, @OriginalArg(1) int arg1) {
		@Pc(2) PacketBit local2 = client.aClass175_2.packet;
		@Pc(9) int local9;
		@Pc(13) Class611 local13;
		@Pc(21) int local21;
		@Pc(28) int local28;
		@Pc(38) int local38;
		@Pc(45) int local45;
		@Pc(49) int local49;
		@Pc(53) int local53;
		@Pc(57) int local57;
		if (arg0 == ZoneProt.aZoneProt_4) {
			local9 = local2.g1((short) 16384);
			local13 = client.world.method30455(1937956135);
			local21 = (local9 & 0x7) + Class127_Sub1.zoneUpdateZ * -1456641695;
			local28 = local21 + local13.anInt5624 * -1994307635;
			local38 = (local9 >> 4 & 0x7) + Class252.zoneUpdateLevel * 717882671;
			local45 = local38 + local13.anInt5623 * 270611681;
			local49 = local2.g2(-1434290800);
			local53 = local2.g2(-1434290800);
			local57 = local2.g2(-1434290800);
			if (client.aClass16_20 != null) {
				@Pc(75) Class93_Sub5 local75 = (Class93_Sub5) client.aClass16_20.method214((long) (Class113_Sub1.zoneUpdateX * 1733983357 << 28 | local28 << 14 | local45));
				if (local75 != null) {
					for (@Pc(84) Class93_Sub3 local84 = (Class93_Sub3) local75.aClass22_17.method428((byte) 86); local84 != null; local84 = (Class93_Sub3) local75.aClass22_17.method442(1402996631)) {
						if (local84.anInt1405 * -308533965 == local49 && local84.anInt1404 * -815066371 == local53) {
							local84.method23969(-1645041246);
							local84.anInt1404 = local57 * 1126767189;
							Class676.method33222(Class113_Sub1.zoneUpdateX * 1733983357, local45, local28, local84, 2026343802);
							break;
						}
					}
					if (local38 >= 0 && local21 >= 0 && local38 < client.world.method30459(-1068841303) && local21 < client.world.method30466((short) 128)) {
						Class518.method30305(Class113_Sub1.zoneUpdateX * 1733983357, local38, local21, 2090140645);
					}
				}
			}
			return;
		}
		@Pc(156) int local156;
		if (arg0 == ZoneProt.aZoneProt_14) {
			local9 = local2.g1((short) 16384);
			local156 = local2.g1_alt3(2097080045);
			local21 = Class252.zoneUpdateLevel * 717882671 + (local156 >> 4 & 0x7);
			local28 = (local156 & 0x7) + Class127_Sub1.zoneUpdateZ * -1456641695;
			@Pc(181) Class629 local181 = new Class629(local2, local9, false);
			local45 = client.anIntArray309[local181.anInt5709 * 1175627307];
			if (client.world.method30443(-2077151248).method30383((byte) 23) || local21 >= 0 && local28 >= 0 && local21 < client.world.method30459(-13743953) && local28 < client.world.method30466((short) 128)) {
				Class359.method27788(Class113_Sub1.zoneUpdateX * 1733983357, local21, local28, local45, -1, local181.anInt5709 * 1175627307, local181.anInt5708 * -1626288991, local181.aClass458_90, (byte) 61);
			}
			return;
		}
		@Pc(288) int local288;
		@Pc(312) int local312;
		@Pc(361) int local361;
		if (ZoneProt.aZoneProt_15 == arg0) {
			local9 = local2.g1((short) 16384);
			local156 = Class252.zoneUpdateLevel * 717882671 + (local9 >> 4 & 0x7);
			local21 = (local9 & 0x7) + Class127_Sub1.zoneUpdateZ * -1456641695;
			local28 = local2.g2(-1434290800);
			if (local28 == 65535) {
				local28 = -1;
			}
			local38 = local2.g1((short) 16384);
			local45 = local38 >> 4 & 0xF;
			local49 = local38 & 0x7;
			local53 = local2.g1((short) 16384);
			local57 = local2.g1((short) 16384);
			local288 = local2.g2(-1434290800);
			if (client.world.method30443(-1477257259) != Class526.aClass526_2 && (local156 >= 0 && local21 >= 0 && local156 < client.world.method30459(-511713213) && local21 < client.world.method30466((short) 128))) {
				local312 = local45 + 1;
				if (Class520.selfPlayer.anIntArray240[0] >= local156 - local312 && Class520.selfPlayer.anIntArray240[0] <= local156 + local312 && Class520.selfPlayer.anIntArray239[0] >= local21 - local312 && Class520.selfPlayer.anIntArray239[0] <= local312 + local21) {
					@Pc(357) Class472 local357 = new Class472((float) (local156 << 9), 0.0F, (float) (local21 << 9));
					local361 = Class113_Sub1.zoneUpdateX * 1733983357;
					Class274.aClass258_1.method26098(Class275.aClass275_13, local28, local49, local57, Class280.aClass280_7.method26450(-965692435), Class278.aClass278_5, 0.0F, (float) (local45 << 9), local357, local361, local288, local53, -1609326909);
				}
			}
			return;
		}
		@Pc(524) int local524;
		@Pc(534) int local534;
		@Pc(475) int local475;
		if (ZoneProt.aZoneProt_7 == arg0) {
			local9 = local2.g1((short) 16384);
			local156 = (local9 >> 4 & 0x7) + Class252.zoneUpdateLevel * 717882671;
			local21 = (local9 & 0x7) + Class127_Sub1.zoneUpdateZ * -1456641695;
			local28 = local2.g2(-1434290800);
			if (local28 == 65535) {
				local28 = -1;
			}
			local38 = local2.g1((short) 16384);
			local45 = local38 >> 4 & 0xF;
			local49 = local38 & 0x7;
			local53 = local2.g1((short) 16384);
			local57 = local2.g1((short) 16384);
			local288 = local2.g2(-1434290800);
			@Pc(451) boolean local451 = local2.g1((short) 16384) == 1;
			if (client.world.method30443(-889874041) != Class526.aClass526_2 && (local156 >= 0 && local21 >= 0 && local156 < client.world.method30459(319647663) && local21 < client.world.method30466((short) 128))) {
				local475 = local45 + 1;
				if (Class520.selfPlayer.anIntArray240[0] >= local156 - local475 && Class520.selfPlayer.anIntArray240[0] <= local475 + local156 && Class520.selfPlayer.anIntArray239[0] >= local21 - local475 && Class520.selfPlayer.anIntArray239[0] <= local475 + local21) {
					@Pc(520) Class472 local520 = new Class472((float) (local156 << 9), 0.0F, (float) (local21 << 9));
					local524 = Class113_Sub1.zoneUpdateX * 1733983357;
					local534 = local451 ? Class280.aClass280_3.method26450(-523092267) : Class280.aClass280_7.method26450(-1332204781);
					Class274.aClass258_1.method26098(Class275.aClass275_13, local28, local49, local57, local534, Class278.aClass278_5, 0.0F, (float) (local45 << 9), local520, local524, local288, local53, 113420925);
				}
			}
		} else if (arg0 == ZoneProt.aZoneProt_13) {
			local9 = local2.g1((short) 16384);
			local156 = Class252.zoneUpdateLevel * 1435765342 + (local9 >> 4 & 0xF);
			local21 = Class127_Sub1.zoneUpdateZ * 1381683906 + (local9 & 0xF);
			local28 = local2.g1((short) 16384);
			@Pc(591) boolean local591 = (local28 & 0x1) != 0;
			@Pc(599) boolean local599 = (local28 & 0x2) != 0;
			local49 = local599 ? local28 >> 2 : -1;
			local53 = local156 + local2.g1b(2037908931);
			local57 = local21 + local2.g1b(1372007448);
			local288 = local2.g2s((byte) -37);
			local312 = local2.g2s((byte) -60);
			local475 = local2.g2(-1434290800);
			local361 = local2.g1((short) 16384);
			if (local599) {
				local361 = (byte) local361;
			} else {
				local361 *= 4;
			}
			local524 = local2.g1((short) 16384) * 4;
			local534 = local2.g2(-1434290800);
			@Pc(659) int local659 = local2.g2(-1434290800);
			@Pc(663) int local663 = local2.g1((short) 16384);
			@Pc(667) int local667 = local2.g2(-1434290800);
			if (local663 == 255) {
				local663 = -1;
			}
			@Pc(676) int local676 = local2.g2s((byte) -63);
			if (client.world.method30443(-1744088389) != Class526.aClass526_2 && (local156 >= 0 && local21 >= 0 && local156 < client.world.method30459(655711085) * 2 && local21 < client.world.method30459(-2140698730) * 2 && local53 >= 0 && local57 >= 0 && local53 < client.world.method30466((short) 128) * 2 && local57 < client.world.method30466((short) 128) * 2 && local475 != 65535)) {
				local156 *= 256;
				local21 *= 256;
				local53 *= 256;
				local57 = local57 * 256;
				local361 <<= 0x2;
				local524 <<= 0x2;
				local667 <<= 0x2;
				Class302.method26738(local475, local288, local312, local49, local361, local524, local156, local21, local53, local57, local534, local659, local663, local667, local591, local676, Class113_Sub1.zoneUpdateX * 1733983357, 1309385098);
			}
		} else if (arg0 == ZoneProt.aZoneProt_1) {
			local2.g1((short) 16384);
			local9 = local2.g1((short) 16384);
			local156 = Class252.zoneUpdateLevel * 717882671 + (local9 >> 4 & 0x7);
			local21 = (local9 & 0x7) + Class127_Sub1.zoneUpdateZ * -1456641695;
			local28 = local2.g2(-1434290800);
			local38 = local2.g1((short) 16384);
			local45 = local2.g3((short) -2399);
			@Pc(816) String local816 = local2.gjstr(911901416);
			if (client.world.method30443(-2137420022) != Class526.aClass526_2) {
				Class586.method31640(Class113_Sub1.zoneUpdateX * 1733983357, local156, local21, local38, local28, local45, local816, -1341391550);
			}
		} else if (arg0 == ZoneProt.aZoneProt_11) {
			local9 = local2.g1((short) 16384);
			local156 = local2.g4_alt3(-1070886628);
			local21 = local2.g1_alt2(-229830992);
			local28 = Class252.zoneUpdateLevel * 717882671 + (local21 >> 4 & 0x7);
			local38 = Class127_Sub1.zoneUpdateZ * -1456641695 + (local21 & 0x7);
			@Pc(874) Class629 local874 = new Class629(local2, local9, false);
			local49 = client.anIntArray309[local874.anInt5709 * 1175627307];
			if (client.world.method30443(-1474467379).method30383((byte) 14) || local28 >= 0 && local38 >= 0 && local28 < client.world.method30459(398663230) && local38 < client.world.method30466((short) 128)) {
				Class359.method27788(Class113_Sub1.zoneUpdateX * 1733983357, local28, local38, local49, local156, local874.anInt5709 * 1175627307, local874.anInt5708 * -1626288991, local874.aClass458_90, (byte) 91);
			}
		} else if (arg0 == ZoneProt.aZoneProt_8) {
			local9 = local2.g4(-118643075);
			local156 = local2.g1((short) 16384);
			((Class610) client.world.method30496(1359924061).method18261(local9, 692964413)).method31977(local156, (byte) -63);
		} else if (ZoneProt.aZoneProt_3 == arg0) {
			local9 = local2.g1((short) 16384);
			@Pc(959) boolean local959 = (local9 & 0x80) != 0;
			local21 = (local9 >> 3 & 0x7) + Class252.zoneUpdateLevel * 717882671;
			local28 = Class127_Sub1.zoneUpdateZ * -1456641695 + (local9 & 0x7);
			local38 = local21 + local2.g1b(591860620);
			local45 = local28 + local2.g1b(1559484477);
			local49 = local2.g2s((byte) -67);
			local53 = local2.g2(-1434290800);
			local57 = local2.g1((short) 16384) * 4;
			local288 = local2.g1((short) 16384) * 4;
			local312 = local2.g2(-1434290800);
			local475 = local2.g2(-1434290800);
			local361 = local2.g1((short) 16384);
			local524 = local2.g2(-1434290800);
			local534 = local2.g2s((byte) -40);
			if (local361 == 255) {
				local361 = -1;
			}
			if (client.world.method30443(-1016027029) != Class526.aClass526_2 && (local21 >= 0 && local28 >= 0 && local21 < client.world.method30459(-92475261) && local28 < client.world.method30466((short) 128) && local38 >= 0 && local45 >= 0 && local38 < client.world.method30459(-2106086182) && local45 < client.world.method30466((short) 128) && local53 != 65535)) {
				local21 = local21 * 512 + 256;
				local28 = local28 * 512 + 256;
				local38 = local38 * 512 + 256;
				local45 = local45 * 512 + 256;
				local57 <<= 0x2;
				local288 <<= 0x2;
				local524 <<= 0x2;
				@Pc(1138) Class132_Sub1_Sub1_Sub4 local1138 = new Class132_Sub1_Sub1_Sub4(client.world.method30481(-1455667273), local53, Class113_Sub1.zoneUpdateX * 1733983357, Class113_Sub1.zoneUpdateX * 1733983357, local21, local28, local57, client.anInt3485 + local312, client.anInt3485 + local475, local361, local524, 0, local49, local288, local959, -1, local534);
				local1138.method23915(local38, local45, Class305.method26802(local38, local45, Class113_Sub1.zoneUpdateX * 1733983357, (byte) -12) - local288, client.anInt3485 + local312, -24684772);
				client.aClass22_46.method408(new Class93_Sub1_Sub6(local1138), -1480355044);
			}
		} else {
			@Pc(1178) Class611 local1178;
			if (ZoneProt.aZoneProt_6 == arg0) {
				local9 = local2.g2(-1434290800);
				local156 = local2.g1_alt3(1772403977);
				local1178 = client.world.method30455(1874398101);
				local28 = (local156 & 0x7) + Class127_Sub1.zoneUpdateZ * -1456641695;
				local38 = local28 + local1178.anInt5624 * -1994307635;
				local45 = (local156 >> 4 & 0x7) + Class252.zoneUpdateLevel * 717882671;
				local49 = local45 + local1178.anInt5623 * 270611681;
				@Pc(1226) Class93_Sub5 local1226 = (Class93_Sub5) client.aClass16_20.method214((long) (Class113_Sub1.zoneUpdateX * 1733983357 << 28 | local38 << 14 | local49));
				if (local1226 != null) {
					for (@Pc(1234) Class93_Sub3 local1234 = (Class93_Sub3) local1226.aClass22_17.method428((byte) 50); local1234 != null; local1234 = (Class93_Sub3) local1226.aClass22_17.method442(329004555)) {
						if (local9 == local1234.anInt1405 * -308533965) {
							local1234.method23969(-1859277688);
							break;
						}
					}
					if (local1226.aClass22_17.method453(1826666963)) {
						local1226.method23969(-2111182206);
					}
					if (local45 >= 0 && local28 >= 0 && local45 < client.world.method30459(-1937689022) && local28 < client.world.method30466((short) 128)) {
						Class518.method30305(Class113_Sub1.zoneUpdateX * 1733983357, local45, local28, -1266442059);
					}
				}
			} else if (ZoneProt.aZoneProt_9 == arg0) {
				local9 = local2.g2_alt3(16711680);
				local156 = local2.g1((short) 16384);
				local1178 = client.world.method30455(1811293653);
				local28 = Class127_Sub1.zoneUpdateZ * -1456641695 + (local156 & 0x7);
				local38 = local28 + local1178.anInt5624 * -1994307635;
				local45 = Class252.zoneUpdateLevel * 717882671 + (local156 >> 4 & 0x7);
				local49 = local45 + local1178.anInt5623 * 270611681;
				local53 = local2.g2_alt2(1967954638);
				local57 = local2.g2(-1434290800);
				if (client.selfPlayerSlot * -859840571 != local57) {
					@Pc(1362) boolean local1362 = local45 >= 0 && local28 >= 0 && local45 < client.world.method30459(-1628217093) && local28 < client.world.method30466((short) 128);
					if (local1362 || client.world.method30443(-1823123234).method30383((byte) 126)) {
						Class676.method33222(Class113_Sub1.zoneUpdateX * 1733983357, local49, local38, new Class93_Sub3(local53, local9), 2107991193);
						if (local1362) {
							Class518.method30305(Class113_Sub1.zoneUpdateX * 1733983357, local45, local28, 1500256836);
						}
					}
				}
			} else {
				@Pc(1436) Class629 local1436;
				if (arg0 == ZoneProt.aZoneProt_5) {
					local9 = local2.g4_alt1(-1641237881);
					local156 = local2.g1_alt1(1488405570);
					local21 = local2.g1_alt3(1483805794);
					local28 = Class252.zoneUpdateLevel * 717882671 + (local21 >> 4 & 0x7);
					local38 = Class127_Sub1.zoneUpdateZ * -1456641695 + (local21 & 0x7);
					local45 = local2.g1_alt3(1996497033);
					local1436 = new Class629(local2, local156, false);
					local53 = client.anIntArray309[local1436.anInt5709 * 1175627307];
					if (client.world.method30443(-2018566566) != Class526.aClass526_2) {
						Class573.method31343(Class113_Sub1.zoneUpdateX * 1733983357, local28, local38, local53, local1436.anInt5709 * 1175627307, local1436.anInt5708 * -1626288991, local1436.aClass458_90, local9, local45, (byte) 2);
					}
				} else if (arg0 == ZoneProt.aZoneProt_12) {
					local9 = local2.g1((short) 16384);
					local156 = local2.g4_alt3(1563321998);
					local21 = local2.g1_alt2(-133626576);
					local28 = local2.g1_alt3(1473159419);
					local38 = (local28 >> 4 & 0x7) + Class252.zoneUpdateLevel * 717882671;
					local45 = (local28 & 0x7) + Class127_Sub1.zoneUpdateZ * -1456641695;
					local1436 = new Class629(local2, local21, false);
					local53 = client.anIntArray309[local1436.anInt5709 * 1175627307];
					if (Class615.aClass615_22.anInt5628 * 948246811 == local1436.anInt5709 * 1175627307) {
						local1436.anInt5709 = Class615.aClass615_21.anInt5628 * 1830441169;
					}
					if ((local9 & 0x1) == 1) {
						Class475.method29678(Class113_Sub1.zoneUpdateX * 1733983357, local38, local45, local53, local156, local1436.anInt5709 * 1175627307, null, (byte) -52);
					} else {
						@Pc(1558) int[] local1558 = null;
						if ((local9 & 0x2) == 2) {
							local288 = local2.g1((short) 16384);
							local1558 = new int[local288];
							for (local312 = 0; local312 < local288; local312++) {
								local1558[local312] = local2.g4(-118643075);
							}
						}
						@Pc(1585) short[] local1585 = null;
						if ((local9 & 0x4) == 4) {
							local312 = local2.g1((short) 16384);
							local1585 = new short[local312];
							for (local475 = 0; local475 < local312; local475++) {
								local1585[local475] = (short) local2.g2(-1434290800);
							}
						}
						@Pc(1613) short[] local1613 = null;
						if ((local9 & 0x8) == 8) {
							local475 = local2.g1((short) 16384);
							local1613 = new short[local475];
							for (local361 = 0; local361 < local475; local361++) {
								local1613[local361] = (short) local2.g2(-1434290800);
							}
						}
						Class475.method29678(Class113_Sub1.zoneUpdateX * 1733983357, local38, local45, local53, local156, local1436.anInt5709 * 1175627307, new Class620(Class93_Sub8.aLong63 * -2739388424769540707L, local1558, local1585, local1613), (byte) -85);
						Class93_Sub8.aLong63 += 7408032350761746613L;
					}
				} else if (arg0 == ZoneProt.aZoneProt_2) {
					local9 = local2.g1((short) 16384);
					local156 = Class252.zoneUpdateLevel * 717882671 + (local9 >> 4 & 0x7);
					local21 = (local9 & 0x7) + Class127_Sub1.zoneUpdateZ * -1456641695;
					local28 = local2.g2(-1434290800);
					if (local28 == 65535) {
						local28 = -1;
					}
					local38 = local2.g2(-1434290800);
					local45 = local2.g2(-1434290800);
					local49 = local2.g1((short) 16384);
					local53 = local2.g2s((byte) -77);
					if (client.world.method30443(-1174203992) != Class526.aClass526_2 && (local156 >= 0 && local21 >= 0 && local156 < client.world.method30459(527465057) && local21 < client.world.method30466((short) 128))) {
						if (local28 == -1) {
							@Pc(1749) Class93_Sub1_Sub9 local1749 = (Class93_Sub1_Sub9) client.aClass16_21.method214((long) (local156 << 16 | local21));
							if (local1749 != null) {
								local1749.aClass132_Sub1_Sub1_Sub5_1.method24109((byte) 32);
								local1749.method23969(-1074536262);
							}
						} else {
							local57 = local156 * 512 + 256;
							local288 = local21 * 512 + 256;
							local312 = Class113_Sub1.zoneUpdateX * 1733983357;
							if (local312 < 3 && client.world.method30487(182541256).method30330(local156, local21, -662808309)) {
								local312++;
							}
							@Pc(1818) Class132_Sub1_Sub1_Sub5 local1818 = new Class132_Sub1_Sub1_Sub5(client.world.method30481(-1815959157), local28, local45, Class113_Sub1.zoneUpdateX * 1733983357, local312, local57, Class305.method26802(local57, local288, Class113_Sub1.zoneUpdateX * 1733983357, (byte) -82) - local38, local288, local156, local156, local21, local21, local49, false, local53);
							client.aClass16_21.method220(new Class93_Sub1_Sub9(local1818), (long) (local156 << 16 | local21));
						}
					}
				} else if (arg0 == ZoneProt.aZoneProt_10) {
					local9 = local2.g1_alt3(1668602181);
					local13 = client.world.method30455(2048986555);
					local21 = (local9 & 0x7) + Class127_Sub1.zoneUpdateZ * -1456641695;
					local28 = local21 + local13.anInt5624 * -1994307635;
					local38 = Class252.zoneUpdateLevel * 717882671 + (local9 >> 4 & 0x7);
					local45 = local13.anInt5623 * 270611681 + local38;
					local49 = local2.g2_alt3(16711680);
					local53 = local2.g2_alt1(1314680267);
					@Pc(1900) boolean local1900 = local38 >= 0 && local21 >= 0 && local38 < client.world.method30459(1316326022) && local21 < client.world.method30466((short) 128);
					if (local1900 || client.world.method30443(-1974156521).method30383((byte) 9)) {
						Class676.method33222(Class113_Sub1.zoneUpdateX * 1733983357, local45, local28, new Class93_Sub3(local49, local53), -821409621);
						if (local1900) {
							Class518.method30305(Class113_Sub1.zoneUpdateX * 1733983357, local38, local21, 2124335454);
						}
					}
				} else {
					Class646.method32608("" + arg0, new RuntimeException(), 475912576);
					Class642.logout(false, (short) 28594);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wn", name = "auu", descriptor = "(Lclient!yf;I)V", line = 13361)
	static final void method32509(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.options.aClass166_Sub39_2.getValue(-1440210536);
	}

	@OriginalMember(owner = "client!wn", name = "axm", descriptor = "(Lclient!yf;B)V", line = 13916)
	static final void method32510(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.aBoolean625 ? 1 : 0;
	}

	@OriginalMember(owner = "client!wn", name = "bey", descriptor = "(Lclient!yf;I)V", line = 14998)
	static final void method32511(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(14) int local14 = -1;
		if (Class173.aList3 != null && local12 >= 0 && local12 < Class173.aList3.size()) {
			local14 = (Integer) Class173.aList3.get(local12);
		}
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local14;
	}
}
