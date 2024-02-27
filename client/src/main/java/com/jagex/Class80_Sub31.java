package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aku")
public final class Class80_Sub31 extends Class80 {

	@OriginalMember(owner = "client!aku", name = "bh", descriptor = "Lclient!ed;")
	static Class104 aClass104_11;

	@OriginalMember(owner = "client!aku", name = "m", descriptor = "[Lclient!aku;")
	static Class80_Sub31[] aClass80_Sub31Array1 = new Class80_Sub31[300];

	@OriginalMember(owner = "client!aku", name = "o", descriptor = "I")
	static int anInt1649 = 0;

	@OriginalMember(owner = "client!aku", name = "u", descriptor = "Lclient!nn;")
	Class443 aClass443_1;

	@OriginalMember(owner = "client!aku", name = "g", descriptor = "Lclient!asa;")
	public PacketBit aPacketBit_2;

	@OriginalMember(owner = "client!aku", name = "i", descriptor = "I")
	public int anInt1647;

	@OriginalMember(owner = "client!aku", name = "l", descriptor = "I")
	int anInt1648;

	@OriginalMember(owner = "client!aku", name = "j", descriptor = "(Lclient!nn;Lclient!aav;)Lclient!aku;")
	public static Class80_Sub31 method14404(@OriginalArg(0) Class443 arg0, @OriginalArg(1) Class22 arg1) {
		@Pc(2) Class80_Sub31 local2 = Class5.method115(16711935);
		local2.aClass443_1 = arg0;
		local2.anInt1648 = arg0.anInt4879 * 1348369397;
		if (local2.anInt1648 * -1051134449 == -1) {
			local2.aPacketBit_2 = new PacketBit(260);
		} else if (local2.anInt1648 * -1051134449 == -2) {
			local2.aPacketBit_2 = new PacketBit(10000);
		} else if (local2.anInt1648 * -1051134449 <= 18) {
			local2.aPacketBit_2 = new PacketBit(20);
		} else if (local2.anInt1648 * -1051134449 <= 98) {
			local2.aPacketBit_2 = new PacketBit(100);
		} else {
			local2.aPacketBit_2 = new PacketBit(260);
		}
		local2.aPacketBit_2.method22564(arg1, -919213842);
		local2.aPacketBit_2.method22553(local2.aClass443_1.anInt4880 * 1861237215, -724096896);
		local2.anInt1647 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!aku", name = "l", descriptor = "()Lclient!aku;")
	static Class80_Sub31 method14405() {
		return anInt1649 * 1131535155 == 0 ? new Class80_Sub31() : aClass80_Sub31Array1[(anInt1649 -= -1264478213) * 1131535155];
	}

	@OriginalMember(owner = "client!aku", name = "g", descriptor = "()Lclient!aku;")
	static Class80_Sub31 method14406() {
		return anInt1649 * 1131535155 == 0 ? new Class80_Sub31() : aClass80_Sub31Array1[(anInt1649 -= -1264478213) * 1131535155];
	}

	@OriginalMember(owner = "client!aku", name = "i", descriptor = "()Lclient!aku;")
	static Class80_Sub31 method14407() {
		return anInt1649 * 1131535155 == 0 ? new Class80_Sub31() : aClass80_Sub31Array1[(anInt1649 -= -1264478213) * 1131535155];
	}

	@OriginalMember(owner = "client!aku", name = "z", descriptor = "()Lclient!aku;")
	public static Class80_Sub31 method14408() {
		@Pc(2) Class80_Sub31 local2 = Class5.method115(16711935);
		local2.aClass443_1 = null;
		local2.anInt1648 = 0;
		local2.aPacketBit_2 = new PacketBit(5000);
		return local2;
	}

	@OriginalMember(owner = "client!aku", name = "o", descriptor = "(Lclient!nn;Lclient!aav;)Lclient!aku;")
	public static Class80_Sub31 method14409(@OriginalArg(0) Class443 arg0, @OriginalArg(1) Class22 arg1) {
		@Pc(2) Class80_Sub31 local2 = Class5.method115(16711935);
		local2.aClass443_1 = arg0;
		local2.anInt1648 = arg0.anInt4879 * 1348369397;
		if (local2.anInt1648 * -1051134449 == -1) {
			local2.aPacketBit_2 = new PacketBit(260);
		} else if (local2.anInt1648 * -1051134449 == -2) {
			local2.aPacketBit_2 = new PacketBit(10000);
		} else if (local2.anInt1648 * -1051134449 <= 18) {
			local2.aPacketBit_2 = new PacketBit(20);
		} else if (local2.anInt1648 * -1051134449 <= 98) {
			local2.aPacketBit_2 = new PacketBit(100);
		} else {
			local2.aPacketBit_2 = new PacketBit(260);
		}
		local2.aPacketBit_2.method22564(arg1, 1273338797);
		local2.aPacketBit_2.method22553(local2.aClass443_1.anInt4880 * 1861237215, 47198087);
		local2.anInt1647 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!aku", name = "m", descriptor = "()Lclient!aku;")
	static Class80_Sub31 method14410() {
		return anInt1649 * 1131535155 == 0 ? new Class80_Sub31() : aClass80_Sub31Array1[(anInt1649 -= -1264478213) * 1131535155];
	}

	@OriginalMember(owner = "client!aku", name = "a", descriptor = "(Lclient!nn;Lclient!aav;)Lclient!aku;")
	public static Class80_Sub31 method14411(@OriginalArg(0) Class443 arg0, @OriginalArg(1) Class22 arg1) {
		@Pc(2) Class80_Sub31 local2 = Class5.method115(16711935);
		local2.aClass443_1 = arg0;
		local2.anInt1648 = arg0.anInt4879 * 1348369397;
		if (local2.anInt1648 * -1051134449 == -1) {
			local2.aPacketBit_2 = new PacketBit(260);
		} else if (local2.anInt1648 * -1051134449 == -2) {
			local2.aPacketBit_2 = new PacketBit(10000);
		} else if (local2.anInt1648 * -1051134449 <= 18) {
			local2.aPacketBit_2 = new PacketBit(20);
		} else if (local2.anInt1648 * -1051134449 <= 98) {
			local2.aPacketBit_2 = new PacketBit(100);
		} else {
			local2.aPacketBit_2 = new PacketBit(260);
		}
		local2.aPacketBit_2.method22564(arg1, -329950161);
		local2.aPacketBit_2.method22553(local2.aClass443_1.anInt4880 * 1861237215, 1017131780);
		local2.anInt1647 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!aku", name = "x", descriptor = "()Lclient!aku;")
	public static Class80_Sub31 method14412() {
		@Pc(2) Class80_Sub31 local2 = Class5.method115(16711935);
		local2.aClass443_1 = null;
		local2.anInt1648 = 0;
		local2.aPacketBit_2 = new PacketBit(5000);
		return local2;
	}

	@OriginalMember(owner = "client!aku", name = "s", descriptor = "()Lclient!aku;")
	public static Class80_Sub31 method14413() {
		@Pc(2) Class80_Sub31 local2 = Class5.method115(16711935);
		local2.aClass443_1 = null;
		local2.anInt1648 = 0;
		local2.aPacketBit_2 = new PacketBit(5000);
		return local2;
	}

	@OriginalMember(owner = "client!aku", name = "bby", descriptor = "(Lclient!yp;I)V")
	static void method14416(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!aku", name = "aq", descriptor = "(I)V")
	static void method14417(@OriginalArg(0) int arg0) {
		if (client.anInt3433 * 1994758437 == 19) {
			Class631.method32722((byte) -1);
		}
		client.aClass75_2.method1319((short) 468);
		Class282.method26867(-455826321);
		Class597.focus = true;
		Class332.method27797(-1597079621);
		@Pc(17) int local17;
		for (local17 = 0; local17 < client.aClass101Array1.length; local17++) {
			client.aClass101Array1[local17] = null;
		}
		client.aBoolean728 = false;
		client.anInt3468 = ((int) (Math.random() * 100.0D) - 50) * -1690268667;
		client.anInt3507 = ((int) (Math.random() * 110.0D) - 55) * 1314490107;
		client.anInt3471 = ((int) (Math.random() * 80.0D) - 40) * 1255513131;
		client.anInt3474 = ((int) (Math.random() * 120.0D) - 60) * 68204355;
		client.anInt3476 = ((int) (Math.random() * 30.0D) - 20) * -787297287;
		client.aFloat255 = (int) (Math.random() * 160.0D) - 80 & 0x3FFF;
		Class40.method844(-106597705);
		for (local17 = 0; local17 < 2048; local17++) {
			client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[local17] = null;
		}
		Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3 = null;
		client.anInt3453 = 0;
		client.anInt3452 = 0;
		client.aClass24_18.method564(953836934);
		client.aClass8_49.method260(-617989958);
		client.aClass24_19.method564(451392378);
		client.aClass5_8.method89(514987768);
		client.aClass24_22.method564(-105264913);
		Class80_Sub8.aClass8_19 = new Class8();
		Class80_Sub8.aClass8_20 = new Class8();
		Class28.anInt92 = 0;
		Class244.anInt3863 = 0;
		Class617.anInt5429 = 0;
		Class166.anInt2402 = 0;
		Class699.anInt5813 = 0;
		Class606.anInt5395 = 0;
		Class62.anInt214 = 0;
		Class203.anInt3387 = 0;
		Class165_Sub13.anInt2172 = 0;
		Class147_Sub1.anInt1445 = 0;
		if (client.anInt3460 * 1849344509 != -1) {
			Class123.method20527(client.anInt3460 * 1849344509, (byte) 4);
		}
		for (@Pc(161) Class80_Sub40 local161 = (Class80_Sub40) client.aClass24_20.method580((byte) -64); local161 != null; local161 = (Class80_Sub40) client.aClass24_20.method566((byte) 7)) {
			if (!local161.method24399(444819286)) {
				local161 = (Class80_Sub40) client.aClass24_20.method580((byte) -32);
				if (local161 == null) {
					break;
				}
			}
			Class80_Sub42.method15605(local161, true, false, (byte) -79);
		}
		client.anInt3460 = -458761045;
		client.aClass24_20 = new Class24(8);
		Class305.method27204(1074437727);
		client.aClass327_10 = null;
		for (local17 = 0; local17 < 8; local17++) {
			client.aStringArray22[local17] = null;
			client.aBooleanArray18[local17] = false;
			client.anIntArray307[local17] = -1;
		}
		Class74.method1311((byte) 13);
		client.aBoolean730 = true;
		for (local17 = 0; local17 < 106; local17++) {
			client.aBooleanArray19[local17] = true;
		}
		for (local17 = 0; local17 < 3; local17++) {
			for (@Pc(240) int local240 = 0; local240 < 8; local240++) {
				client.aClass533ArrayArray1[local17][local240] = new Class533();
			}
		}
		client.aClass539_1.method30904((byte) -58).method33382(-379884134);
		client.aBoolean726 = true;
		Class625.aShortArray146 = Class335.aShortArray113 = Class43.aShortArray1 = new short[256];
		Class499.aString215 = Class60.aClass60_134.method1180(Class512.aClass719_3, -1056475056);
		Class703.aClass80_Sub37_49.method14943(Class703.aClass80_Sub37_49.aClass165_Sub10_2, Class703.aClass80_Sub37_49.aClass165_Sub10_1.method16018(-1492191366), (byte) 68);
		client.anInt3459 = 0;
		Class474.method29881(314119653);
		Class533.aClass692_2 = null;
		Class80.aLong339 = 0L;
	}

	@OriginalMember(owner = "client!aku", name = "u", descriptor = "(Ljava/lang/String;B)V")
	public static void method14418(@OriginalArg(0) String arg0, @OriginalArg(1) byte arg1) {
		if (client.anInt3433 * 1994758437 != 0) {
			return;
		}
		@Pc(10) Class80_Sub31 local10 = Class623.method32440(Class443.aClass443_97, client.aClass75_2.aClass22_1, -191270971);
		local10.aPacketBit_2.p2(0);
		@Pc(21) int local21 = local10.aPacketBit_2.pos * -1380987821;
		local10.aPacketBit_2.pjstr(arg0);
		local10.aPacketBit_2.pos += -1350670595;
		local10.aPacketBit_2.tinyenc(Class499.anIntArray464, local21, local10.aPacketBit_2.pos * -1380987821);
		local10.aPacketBit_2.p2check(local10.aPacketBit_2.pos * -1380987821 - local21);
		client.aClass75_2.method1325(local10, (byte) -112);
		Class323.aClass711_1 = Class711.aClass711_3;
	}

	@OriginalMember(owner = "client!aku", name = "<init>", descriptor = "()V")
	Class80_Sub31() {
	}

	@OriginalMember(owner = "client!aku", name = "u", descriptor = "(I)V")
	public void method14403(@OriginalArg(0) int arg0) {
		if (anInt1649 * 1131535155 < aClass80_Sub31Array1.length) {
			aClass80_Sub31Array1[(anInt1649 += -1264478213) * 1131535155 - 1] = this;
		}
	}

	@OriginalMember(owner = "client!aku", name = "p", descriptor = "()V")
	public void method14414() {
		if (anInt1649 * 1131535155 < aClass80_Sub31Array1.length) {
			aClass80_Sub31Array1[(anInt1649 += -1264478213) * 1131535155 - 1] = this;
		}
	}

	@OriginalMember(owner = "client!aku", name = "v", descriptor = "()V")
	public void method14415() {
		if (anInt1649 * 1131535155 < aClass80_Sub31Array1.length) {
			aClass80_Sub31Array1[(anInt1649 += -1264478213) * 1131535155 - 1] = this;
		}
	}
}
