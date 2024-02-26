package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pt")
public final class Class493 {

	@OriginalMember(owner = "client!pt", name = "t", descriptor = "I")
	final int anInt5030;

	@OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
	final int anInt5028;

	@OriginalMember(owner = "client!pt", name = "e", descriptor = "I")
	final int anInt5029;

	@OriginalMember(owner = "client!pt", name = "u", descriptor = "[B")
	final byte[] aByteArray95;

	@OriginalMember(owner = "client!pt", name = "fh", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;B)V")
	static void method30272(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) byte arg3) {
		arg0.anInt4131 = arg2.anIntArray525[(arg2.anInt5778 -= 2036747717) * 1896589581] * 1341335515;
		Class296.method26998(arg0, 1158567225);
		if (arg0.anInt4094 * 2071556223 == -1 && !arg1.aBoolean794) {
			Class699.method37068(arg0.anInt4087 * -2053489901, 619775057);
		}
	}

	@OriginalMember(owner = "client!pt", name = "hz", descriptor = "(Lclient!yp;I)V")
	static void method30273(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(14) Class310 local14 = local8.aClass310_4;
		Class519.method30606(local11, local14, arg0, Class322.aClass322_5, 1458655484);
	}

	@OriginalMember(owner = "client!pt", name = "aer", descriptor = "(Lclient!yp;I)V")
	static void method30274(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = (local13 & 0x1 << local23) == 0 ? 0 : 1;
	}

	@OriginalMember(owner = "client!pt", name = "amm", descriptor = "(Lclient!yp;I)V")
	static void method30275(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= -442943724;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		@Pc(43) int local43 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 3];
		@Pc(47) Class626 local47 = client.aClass539_1.method30893((byte) -26);
		Class106.method18207((local13 >> 14 & 0x3FFF) - local47.anInt5540 * -390642507, (local13 & 0x3FFF) - local47.anInt5537 * -894305615, local23 << 2, local33, local43, false, (byte) 2);
		client.aBoolean726 = true;
	}

	@OriginalMember(owner = "client!pt", name = "t", descriptor = "(Lclient!di;IILclient!hx;I)V")
	static void method30276(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class327 arg3, @OriginalArg(4) int arg4) {
		@Pc(1) byte local1 = 127;
		@Pc(3) byte local3 = 7;
		for (@Pc(5) int local5 = 63; local5 >= 0; local5--) {
			@Pc(23) int local23 = (local5 & 0x3F) << 10 | (local3 & 0x7) << 7 | local1 & 0x7F;
			Class388.method28633(false, true, -1747311610);
			@Pc(31) int local31 = Class325.anIntArray400[local23];
			Class210.method25804(false, true, -1331760319);
			arg0.method20722(arg1, (arg3.anInt4104 * 1990157877 * (63 - local5) >> 6) + arg2, arg3.anInt4103 * 1892149809, (arg3.anInt4104 * 1990157877 >> 6) + 1, local31 | 0xFF000000, 0);
		}
	}

	@OriginalMember(owner = "client!pt", name = "f", descriptor = "([Ljava/lang/Object;III)Ljava/lang/String;")
	public static String method30277(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(11) CharSequence local11 = (CharSequence) arg0[arg1];
			return local11 == null ? "null" : local11.toString();
		} else {
			@Pc(22) int local22 = arg1 + arg2;
			@Pc(24) int local24 = 0;
			for (@Pc(26) int local26 = arg1; local26 < local22; local26++) {
				@Pc(34) CharSequence local34 = (CharSequence) arg0[local26];
				if (local34 == null) {
					local24 += 4;
				} else {
					local24 += local34.length();
				}
			}
			@Pc(51) StringBuilder local51 = new StringBuilder(local24);
			for (@Pc(53) int local53 = arg1; local53 < local22; local53++) {
				@Pc(61) CharSequence local61 = (CharSequence) arg0[local53];
				if (local61 == null) {
					local51.append("null");
				} else {
					local51.append(local61);
				}
			}
			return local51.toString();
		}
	}

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(IIII[B)V")
	Class493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4) {
		this.anInt5030 = arg0 * -1423024557;
		this.anInt5028 = arg1 * -1908463777;
		this.anInt5029 = arg2 * 1502121733;
		this.aByteArray95 = arg4;
	}
}
