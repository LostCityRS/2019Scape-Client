package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jz")
final class Class371 implements Interface21 {

	@OriginalMember(owner = "client!jz", name = "fy", descriptor = "Lclient!pf;")
	public static Class480 aClass480_102;

	@OriginalMember(owner = "client!jz", name = "d", descriptor = "(Lclient!dn;Lclient!aad;Lclient!aad;I)V")
	public static void method28386(@OriginalArg(0) Class105 arg0, @OriginalArg(1) Class6 arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) int arg3) {
		if (!arg1.method23606(1971145303) || !arg2.method23606(1974935042)) {
			return;
		}
		@Pc(10) Class261 local10 = arg1.aClass261_5;
		@Pc(13) Class261 local13 = arg2.aClass261_5;
		if (local10.anIntArray368 == null) {
			if (local10.method26483(309618994)) {
				if (local13.anIntArray368 != null) {
					arg0.method7351(arg1.aClass25_5.aClass80_Sub1_Sub5_1, arg1.anInt3215 * 140891625, arg2.aClass10_9.aClass80_Sub1_Sub7_1, arg2.aClass10_9.anInt40 * -262292137, arg2.aClass10_9.aClass80_Sub1_Sub7_2, arg2.aClass10_9.anInt41 * 175063815, arg2.anInt3215 * 140891625, local13.anIntArray370[arg2.anInt3212 * 1869185205], local10.aClass276_1 == null ? null : local10.aClass276_1.aBooleanArray22, local10.aBoolean776 | local13.aBoolean776);
				} else if (local13.method26483(381200281)) {
					arg0.method7343(arg1.aClass25_5.aClass80_Sub1_Sub5_1, arg1.anInt3215 * 140891625, arg2.aClass25_5.aClass80_Sub1_Sub5_1, arg2.anInt3215 * 140891625, local10.aClass276_1 == null ? null : local10.aClass276_1.aBooleanArray22, local10.aBoolean776);
				}
			}
		} else if (local13.anIntArray368 != null) {
			arg0.method7527(arg1.aClass10_9.aClass80_Sub1_Sub7_1, arg1.aClass10_9.anInt40 * -262292137, arg1.aClass10_9.aClass80_Sub1_Sub7_2, arg1.aClass10_9.anInt41 * 175063815, arg1.anInt3215 * 140891625, local10.anIntArray370[arg1.anInt3212 * 1869185205], arg2.aClass10_9.aClass80_Sub1_Sub7_1, arg2.aClass10_9.anInt40 * -262292137, arg2.aClass10_9.aClass80_Sub1_Sub7_2, arg2.aClass10_9.anInt41 * 175063815, arg2.anInt3215 * 140891625, local13.anIntArray370[arg2.anInt3212 * 1869185205], local10.aClass276_1 == null ? null : local10.aClass276_1.aBooleanArray22, local10.aBoolean776 | local13.aBoolean776);
		} else if (local13.method26483(558672840)) {
			arg0.method7345(arg1.aClass10_9.aClass80_Sub1_Sub7_1, arg1.aClass10_9.anInt40 * -262292137, arg1.aClass10_9.aClass80_Sub1_Sub7_2, arg1.aClass10_9.anInt41 * 175063815, arg1.anInt3215 * 140891625, local10.anIntArray370[arg1.anInt3212 * 1869185205], arg2.aClass25_5.aClass80_Sub1_Sub5_1, arg2.anInt3215 * 140891625, local10.aClass276_1 == null ? null : local10.aClass276_1.aBooleanArray22, local10.aBoolean776 | local13.aBoolean776);
		}
	}

	@OriginalMember(owner = "client!jz", name = "g", descriptor = "(IIS)I")
	public static int method28387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!jz", name = "a", descriptor = "(Lclient!ara;IB)V")
	static void method28388(@OriginalArg(0) Class80_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		if (!Class630.aBoolean955) {
			return;
		}
		@Pc(5) Class15 local5 = Class445.method29244(2044017830);
		@Pc(7) int local7 = 0;
		@Pc(21) int local21;
		for (@Pc(13) Class80_Sub1_Sub11 local13 = (Class80_Sub1_Sub11) arg0.aSecondaryLinkedList_10.head((byte) -32); local13 != null; local13 = (Class80_Sub1_Sub11) arg0.aSecondaryLinkedList_10.next((byte) -102)) {
			local21 = Class413.method28991(local13, local5, (byte) 1);
			if (local21 > local7) {
				local7 = local21;
			}
		}
		local7 += 8;
		@Pc(45) int local45 = Class630.anInt5547 * 1378633515 * 855388281 * arg0.anInt3022 + 21;
		Class681.anInt5749 = ((Class630.aBoolean957 ? 26 : 22) + Class630.anInt5547 * 1378633515 * arg0.anInt3022 * 855388281) * -52523477;
		local21 = Class427.anInt4636 * 663066865 + Class594.anInt5325 * 2014486095;
		if (local21 + local7 > Class80_Sub1_Sub1.anInt254 * -255202897) {
			local21 = Class594.anInt5325 * 2014486095 - local7;
		}
		if (local21 < 0) {
			local21 = 0;
		}
		@Pc(100) int local100 = Class630.aBoolean957 ? local5.anInt45 * 1190692343 + 20 + 1 : 31;
		@Pc(111) int local111 = local5.anInt45 * 1190692343 + (arg1 - local100) + 1;
		if (local45 + local111 > Class80_Sub25.anInt1627 * 167687103) {
			local111 = Class80_Sub25.anInt1627 * 167687103 - local45;
		}
		if (local111 < 0) {
			local111 = 0;
		}
		Class41_Sub12.anInt2441 = local21 * -581572293;
		Class630.anInt5557 = local111 * 1268791119;
		Class40.anInt116 = local7 * -41210043;
		Class630.aClass80_Sub1_Sub4_1 = arg0;
	}

	@OriginalMember(owner = "client!jz", name = "apm", descriptor = "(Lclient!yp;B)V")
	static void method28389(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		if (BufferedSocket.aClass121_Sub1_2.method9702(988561541) != Class347.aClass347_7) {
			throw new RuntimeException();
		}
		((Class20_Sub3) BufferedSocket.aClass121_Sub1_2.method9693(1830893728)).method16649(arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581], -1600519277);
	}

	@OriginalMember(owner = "client!jz", name = "ex", descriptor = "(Lclient!yp;S)V")
	static void method28390(@OriginalArg(0) Class690 arg0, @OriginalArg(1) short arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2125037525);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class370.method28376(local16, local22, arg0, (short) -14067);
	}

	@OriginalMember(owner = "client!jz", name = "n", descriptor = "(I)Lclient!kb;")
	@Override
	public Class374 method28385(@OriginalArg(0) int arg0) {
		return (Class374) Class664.aClass41_Sub17_2.method18054(arg0, 1191764396);
	}

	@OriginalMember(owner = "client!jz", name = "g", descriptor = "(Lclient!qt;II)Lclient!ea;")
	@Override
	public Class107 method28382(@OriginalArg(0) Class143 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return (Class107) ((Interface12) Class161.aMap13.get(arg0)).method18054(arg1, -659410747);
	}

	@OriginalMember(owner = "client!jz", name = "i", descriptor = "(II)Lclient!kb;")
	@Override
	public Class374 method28381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Class374) Class664.aClass41_Sub17_2.method18054(arg0, -782407088);
	}

	@OriginalMember(owner = "client!jz", name = "y", descriptor = "(Lclient!qt;I)Lclient!ea;")
	@Override
	public Class107 method28383(@OriginalArg(0) Class143 arg0, @OriginalArg(1) int arg1) {
		return (Class107) ((Interface12) Class161.aMap13.get(arg0)).method18054(arg1, -140164624);
	}

	@OriginalMember(owner = "client!jz", name = "b", descriptor = "(I)Lclient!kb;")
	@Override
	public Class374 method28380(@OriginalArg(0) int arg0) {
		return (Class374) Class664.aClass41_Sub17_2.method18054(arg0, 1160858968);
	}

	@OriginalMember(owner = "client!jz", name = "c", descriptor = "(I)Lclient!kb;")
	@Override
	public Class374 method28384(@OriginalArg(0) int arg0) {
		return (Class374) Class664.aClass41_Sub17_2.method18054(arg0, -1549894855);
	}
}
