package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class438 {

	@OriginalMember(owner = "client!ni", name = "fd", descriptor = "Lclient!pf;")
	public static Class480 aClass480_112;

	@OriginalMember(owner = "client!ni", name = "t", descriptor = "Lclient!ni;")
	public static final Class438 aClass438_12 = new Class438(5);

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "Lclient!ni;")
	public static final Class438 aClass438_2 = new Class438(10);

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "Lclient!ni;")
	public static final Class438 aClass438_3 = new Class438(-1);

	@OriginalMember(owner = "client!ni", name = "u", descriptor = "Lclient!ni;")
	public static final Class438 aClass438_5 = new Class438(7);

	@OriginalMember(owner = "client!ni", name = "l", descriptor = "Lclient!ni;")
	public static final Class438 aClass438_9 = new Class438(7);

	@OriginalMember(owner = "client!ni", name = "g", descriptor = "Lclient!ni;")
	public static final Class438 aClass438_6 = new Class438(2);

	@OriginalMember(owner = "client!ni", name = "i", descriptor = "Lclient!ni;")
	public static final Class438 aClass438_4 = new Class438(9);

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "Lclient!ni;")
	public static final Class438 aClass438_8 = new Class438(18);

	@OriginalMember(owner = "client!ni", name = "o", descriptor = "Lclient!ni;")
	public static final Class438 aClass438_1 = new Class438(7);

	@OriginalMember(owner = "client!ni", name = "j", descriptor = "Lclient!ni;")
	public static final Class438 aClass438_10 = new Class438(3);

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "Lclient!ni;")
	public static final Class438 aClass438_7 = new Class438(-1);

	@OriginalMember(owner = "client!ni", name = "s", descriptor = "Lclient!ni;")
	public static final Class438 aClass438_11 = new Class438(-1);

	@OriginalMember(owner = "client!ni", name = "k", descriptor = "Lclient!ni;")
	public static final Class438 aClass438_13 = new Class438(21);

	@OriginalMember(owner = "client!ni", name = "x", descriptor = "Lclient!ni;")
	public static final Class438 aClass438_14 = new Class438(5);

	@OriginalMember(owner = "client!ni", name = "w", descriptor = "Lclient!ni;")
	public static final Class438 aClass438_15 = new Class438(8);

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "()[Lclient!ni;")
	public static Class438[] method29143() {
		return new Class438[] { aClass438_12, aClass438_2, aClass438_3, aClass438_5, aClass438_9, aClass438_6, aClass438_4, aClass438_8, aClass438_1, aClass438_10, aClass438_7, aClass438_11, aClass438_13, aClass438_14, aClass438_15 };
	}

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "()[Lclient!ni;")
	public static Class438[] method29144() {
		return new Class438[] { aClass438_12, aClass438_2, aClass438_3, aClass438_5, aClass438_9, aClass438_6, aClass438_4, aClass438_8, aClass438_1, aClass438_10, aClass438_7, aClass438_11, aClass438_13, aClass438_14, aClass438_15 };
	}

	@OriginalMember(owner = "client!ni", name = "aps", descriptor = "(Lclient!yp;I)V")
	static void method29145(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		Class576.method31792(arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581], (byte) -81);
	}

	@OriginalMember(owner = "client!ni", name = "jc", descriptor = "(II)V")
	static void method29146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(2) PacketBit local2 = client.aClass75_1.aPacketBit_1;
		while (local2.method22561(client.aClass75_1.anInt248 * 460106407, (byte) 12) >= 15) {
			@Pc(17) int local17 = local2.method22559(15, -325783685);
			if (local17 == 32767) {
				break;
			}
			@Pc(23) boolean local23 = false;
			@Pc(29) Class80_Sub19 local29 = (Class80_Sub19) client.aClass24_18.method560((long) local17);
			@Pc(38) Class120_Sub1_Sub1_Sub1_Sub1 local38;
			if (local29 == null) {
				local38 = new Class120_Sub1_Sub1_Sub1_Sub1(client.aClass539_1.method30932(-1638462787));
				local38.anInt2671 = local17 * -486069653;
				local29 = new Class80_Sub19(local38);
				client.aClass24_18.method563(local29, (long) local17);
				client.aClass80_Sub19Array1[(client.anInt3452 += -382054833) * -340916049 - 1] = local29;
				local23 = true;
			}
			local38 = (Class120_Sub1_Sub1_Sub1_Sub1) local29.anObject5;
			client.anIntArray304[(client.anInt3453 += 192683631) * -1702559601 - 1] = local17;
			local38.anInt2694 = client.anInt3456 * -1555677495;
			if (local38.aClass335_1 != null && local38.aClass335_1.method27835((byte) 45)) {
				Class599.method32051(local38, (short) 13672);
			}
			local38.method18794((Class335) Class460.aClass41_Sub2_1.method18054(local2.method22559(15, -325783685), -977594700), -1076598588);
			@Pc(116) int local116 = local2.method22559(arg0, -325783685);
			if (local116 > (0x1 << arg0 - 1) - 1) {
				local116 -= 0x1 << arg0;
			}
			@Pc(136) int local136 = local2.method22559(arg0, -325783685);
			if (local136 > (0x1 << arg0 - 1) - 1) {
				local136 -= 0x1 << arg0;
			}
			@Pc(156) int local156 = local2.method22559(1, -325783685);
			if (local156 == 1) {
				client.anIntArray308[(client.anInt3438 += -304368359) * 1467537193 - 1] = local17;
			}
			@Pc(176) int local176 = local2.method22559(2, -325783685);
			@Pc(187) int local187 = local2.method22559(3, -325783685) + 4 << 11 & 0x3FFF;
			@Pc(192) int local192 = local2.method22559(1, -325783685);
			local38.method18984(local38.aClass335_1.anInt4212 * 1573297955, (byte) 101);
			local38.anInt2697 = (local38.aClass335_1.anInt4209 * -2090808675 << 3) * 77355267;
			if (local23) {
				local38.method18986(local187, true, (byte) -22);
			}
			local38.method18792(local176, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray234[0] + local136, Class641.aClass120_Sub1_Sub1_Sub1_Sub2_3.anIntArray242[0] + local116, local192 == 1, local38.method18966((byte) -50), 791988281);
			if (local38.aClass335_1.method27835((byte) 45)) {
				Class676.method33587(local38.aByte99, local38.anIntArray234[0], local38.anIntArray242[0], 0, null, local38, null, (byte) 10);
			}
			if (local23) {
				local38.method18793(1176605398);
			}
		}
		local2.method22568(1565460824);
	}

	@OriginalMember(owner = "client!ni", name = "g", descriptor = "(Lclient!asa;IB)Z")
	static boolean method29147(@OriginalArg(0) PacketBit arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		@Pc(4) int local4 = arg0.method22559(2, -325783685);
		@Pc(21) int local21;
		@Pc(26) int local26;
		@Pc(119) int local119;
		@Pc(123) int local123;
		@Pc(129) int local129;
		@Pc(133) int local133;
		if (local4 == 0) {
			if (arg0.method22559(1, -325783685) != 0) {
				method29147(arg0, arg1, (byte) 2);
			}
			local21 = arg0.method22559(6, -325783685);
			local26 = arg0.method22559(6, -325783685);
			@Pc(36) boolean local36 = arg0.method22559(1, -325783685) == 1;
			if (local36) {
				Class51.anIntArray22[(Class51.anInt194 += -985578317) * -1414067589 - 1] = arg1;
			}
			if (client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[arg1] != null) {
				throw new RuntimeException();
			}
			@Pc(63) Class543 local63 = Class51.aClass543Array1[arg1];
			@Pc(74) Class120_Sub1_Sub1_Sub1_Sub2 local74 = client.aClass120_Sub1_Sub1_Sub1_Sub2Array1[arg1] = new Class120_Sub1_Sub1_Sub1_Sub2(client.aClass539_1.method30932(-1638462787));
			local74.anInt2671 = arg1 * -486069653;
			if (Class51.aPacketArray1[arg1] != null) {
				local74.method19053(Class51.aPacketArray1[arg1], 1767040723);
			}
			if (Class51.aPacketArray2[arg1] != null) {
				local74.method19054(Class51.aPacketArray2[arg1], 2015216348);
			}
			local74.method18986(local63.anInt5123 * 36827447, true, (byte) -27);
			local74.anInt2683 = local63.anInt5124 * 434134087;
			local119 = local63.anInt5122 * -1301112729;
			local123 = local119 >> 28;
			local129 = local119 >> 14 & 0xFF;
			local133 = local119 & 0xFF;
			@Pc(137) Class626 local137 = client.aClass539_1.method30893((byte) -113);
			@Pc(148) int local148 = local21 + (local129 << 6) - local137.anInt5540 * -390642507;
			@Pc(159) int local159 = local26 + (local133 << 6) - local137.anInt5537 * -894305615;
			local74.aClass289_1 = local63.aClass289_5;
			local74.aBoolean457 = local63.aBoolean905;
			local74.aByteArray49[0] = Class51.aByteArray17[arg1];
			local74.aByte99 = local74.aByte100 = (byte) local123;
			if (client.aClass539_1.method30903(-463929735).method30429(local148, local159, 2110125445)) {
				local74.aByte100++;
			}
			local74.method19063(local148, local159, (byte) 3);
			Class51.aClass543Array1[arg1] = null;
			return true;
		} else if (local4 == 1) {
			local21 = arg0.method22559(2, -325783685);
			local26 = Class51.aClass543Array1[arg1].anInt5122 * -1301112729;
			Class51.aClass543Array1[arg1].anInt5122 = ((((local26 >> 28) + local21 & 0x3) << 28) + (local26 & 0xFFFFFFF)) * -344784041;
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
				local119 = Class51.aClass543Array1[arg1].anInt5122 * -1301112729;
				Class51.aByteArray17[arg1] = (byte) (local26 - 1);
				if (!Class51.aBoolean30 && (Class51.aByteArray17[arg1] < 0 || Class51.aByteArray17[arg1] > 3)) {
					throw new AssertionError();
				}
				local123 = local261 + (local119 >> 28) & 0x3;
				local129 = local268 + (local119 >> 14) & 0xFF;
				local133 = local291 + local119 & 0xFF;
				Class80_Sub39.method15030(Class712.method37173(190780046), local26 - 1, -1366890411);
				Class51.aClass543Array1[arg1].anInt5122 = ((local123 << 28) + (local129 << 14) + local133) * -344784041;
				return false;
			}
			local21 = arg0.method22559(5, -325783685);
			local26 = local21 >> 3 & 0x3;
			local261 = local21 & 0x7;
			local268 = Class51.aClass543Array1[arg1].anInt5122 * -1301112729;
			if (!Class51.aBoolean30 && (Class51.aByteArray17[arg1] < 0 || Class51.aByteArray17[arg1] > 3)) {
				throw new AssertionError();
			}
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
			Class80_Sub39.method15030(Class712.method37173(-1127619140), Class51.aByteArray17[arg1], -1920310511);
			Class51.aClass543Array1[arg1].anInt5122 = (local123 + (local119 << 14) + (local291 << 28)) * -344784041;
			return false;
		}
	}

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(I)V")
	Class438(@OriginalArg(0) int arg0) {
	}
}
