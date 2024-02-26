package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class Class614 {

	@OriginalMember(owner = "client!vj", name = "um", descriptor = "I")
	static int anInt5428;

	@OriginalMember(owner = "client!vj", name = "t", descriptor = "J")
	long aLong397;

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "[I")
	int[] anIntArray495;

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "[S")
	short[] aShortArray144;

	@OriginalMember(owner = "client!vj", name = "u", descriptor = "[S")
	short[] aShortArray143;

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "([BIIB)Ljava/lang/String;")
	public static String method32265(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(2) char[] local2 = new char[arg2];
		@Pc(4) int local4 = 0;
		@Pc(6) int local6 = arg1;
		@Pc(10) int local10 = arg1 + arg2;
		while (local6 < local10) {
			@Pc(20) int local20 = arg0[local6++] & 0xFF;
			@Pc(28) int local28;
			if (local20 < 128) {
				if (local20 == 0) {
					local28 = 65533;
				} else {
					local28 = local20;
				}
			} else if (local20 < 192) {
				local28 = 65533;
			} else if (local20 < 224) {
				if (local6 < local10 && (arg0[local6] & 0xC0) == 128) {
					local28 = (local20 & 0x1F) << 6 | arg0[local6++] & 0x3F;
					if (local28 < 128) {
						local28 = 65533;
					}
				} else {
					local28 = 65533;
				}
			} else if (local20 < 240) {
				if (local6 + 1 < local10 && (arg0[local6] & 0xC0) == 128 && (arg0[local6 + 1] & 0xC0) == 128) {
					local28 = (local20 & 0xF) << 12 | (arg0[local6++] & 0x3F) << 6 | arg0[local6++] & 0x3F;
					if (local28 < 2048) {
						local28 = 65533;
					}
				} else {
					local28 = 65533;
				}
			} else if (local20 >= 248) {
				local28 = 65533;
			} else if (local6 + 2 < local10 && (arg0[local6] & 0xC0) == 128 && (arg0[local6 + 1] & 0xC0) == 128 && (arg0[local6 + 2] & 0xC0) == 128) {
				local28 = (local20 & 0x7) << 18 | (arg0[local6++] & 0x3F) << 12 | (arg0[local6++] & 0x3F) << 6 | arg0[local6++] & 0x3F;
				if (local28 >= 65536 && local28 <= 1114111) {
					local28 = 65533;
				} else {
					local28 = 65533;
				}
			} else {
				local28 = 65533;
			}
			local2[local4++] = (char) local28;
		}
		return new String(local2, 0, local4);
	}

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "([Ljava/lang/String;[IIII)V")
	static void method32266(@OriginalArg(0) String[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg2) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) String local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) int local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		for (@Pc(40) int local40 = arg2; local40 < arg3; local40++) {
			if (local14 == null || arg0[local40] != null && arg0[local40].compareTo(local14) < (local40 & 0x1)) {
				@Pc(63) String local63 = arg0[local40];
				arg0[local40] = arg0[local10];
				arg0[local10] = local63;
				@Pc(77) int local77 = arg1[local40];
				arg1[local40] = arg1[local10];
				arg1[local10++] = local77;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		method32266(arg0, arg1, arg2, local10 - 1, -1378908785);
		method32266(arg0, arg1, local10 + 1, arg3, 1786554666);
	}

	@OriginalMember(owner = "client!vj", name = "kc", descriptor = "(Lclient!yp;I)V")
	static void method32267(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		Class330.method27768(local11, arg0, -1977870619);
	}

	@OriginalMember(owner = "client!vj", name = "aik", descriptor = "(Lclient!yp;B)V")
	static void method32268(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= 2036747717;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class379.method28546(local13, (short) 2048);
	}

	@OriginalMember(owner = "client!vj", name = "m", descriptor = "(I)Lclient!aly;")
	public static Class163_Sub1 method32269(@OriginalArg(0) int arg0) {
		return Class80_Sub28_Sub2.method21750(Class47.aClass28_6.anInt89 * 307612145, 2069681450);
	}

	@OriginalMember(owner = "client!vj", name = "ei", descriptor = "(B)V")
	static void method32270(@OriginalArg(0) byte arg0) {
		client.anInt3544 = 0;
		client.anInt3545 = 0;
		client.anInt3546 = 0;
		client.anInt3548 = 0;
		client.anInt3550 = 0;
		client.anInt3551 = 0;
		client.anInt3552 = 0;
		client.anInt3553 = 0;
		client.anInt3554 = 0;
		client.anInt3503 = 0;
		client.anInt3556 = 0;
		client.anInt3547 = 0;
		client.anInt3579 = 0;
		client.anInt3557 = 0;
		client.anInt3483 = 0;
	}

	@OriginalMember(owner = "client!vj", name = "fj", descriptor = "(Lclient!hx;Lclient!he;Lclient!yp;B)V")
	static void method32271(@OriginalArg(0) Class327 arg0, @OriginalArg(1) Class310 arg1, @OriginalArg(2) Class690 arg2, @OriginalArg(3) byte arg3) {
		arg2.anInt5778 -= -221471862;
		arg0.anInt4112 = arg2.anIntArray525[arg2.anInt5778 * 1896589581] * -67564629;
		arg0.anInt4091 = arg2.anIntArray525[arg2.anInt5778 * 1896589581 + 1] * -721252229;
		Class296.method26998(arg0, -30058);
		if (arg0.anInt4135 * 710314345 == 0) {
			Class388.method28636(arg1, arg0, false, (byte) 8);
		}
	}

	@OriginalMember(owner = "client!vj", name = "axr", descriptor = "(Lclient!yp;I)V")
	static void method32272(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(18) Class320 local18 = (Class320) Class157.aClass41_Sub13_2.method18054(local12, 1249986078);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local18.anInt4031 * -618572023;
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(B)I")
	public static int method32273(@OriginalArg(0) byte arg0) {
		return Class380.method28557((byte) 18) ? Class622.anInt5472 * -862856427 : 0;
	}

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "(Lclient!ald;B)V")
	static void method32274(@OriginalArg(0) Class80_Sub36 arg0, @OriginalArg(1) byte arg1) {
		while (true) {
			@Pc(3) int local3 = arg0.method23362(697264910);
			switch(local3) {
				case 0:
					Class251.anInt3877 = arg0.method23178((byte) -75) * 2099092997;
					Class251.anInt3878 = arg0.method23178((byte) -66) * -3670491;
					break;
				case 255:
					return;
			}
		}
	}

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(J[I[S[S)V")
	public Class614(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) short[] arg3) {
		this.aLong397 = arg0 * 635082211316332275L;
		this.anIntArray495 = arg1;
		this.aShortArray144 = arg2;
		this.aShortArray143 = arg3;
	}
}
