package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class Class623 {

	@OriginalMember(owner = "client!vs", name = "fd", descriptor = "Lclient!py;")
	public static Class497 aClass497_136;

	@OriginalMember(owner = "client!vs", name = "ts", descriptor = "I")
	public static int anInt5843;

	@OriginalMember(owner = "client!vs", name = "az", descriptor = "[Lclient!abp;")
	protected static Class42[] aClass42Array1;

	@OriginalMember(owner = "client!vs", name = "e", descriptor = "Lclient!vs;")
	static final Class623 aClass623_2 = new Class623(0);

	@OriginalMember(owner = "client!vs", name = "n", descriptor = "Lclient!vs;")
	static final Class623 aClass623_1 = new Class623(1);

	@OriginalMember(owner = "client!vs", name = "m", descriptor = "Lclient!vs;")
	static final Class623 aClass623_3 = new Class623(2);

	@OriginalMember(owner = "client!vs", name = "k", descriptor = "I")
	final int anInt5842;

	@OriginalMember(owner = "client!vs", name = "m", descriptor = "()[Lclient!vs;")
	static Class623[] method32325() {
		return new Class623[] { aClass623_2, aClass623_1, aClass623_3 };
	}

	@OriginalMember(owner = "client!vs", name = "f", descriptor = "(I)Lclient!vs;")
	static Class623 method32326(@OriginalArg(0) int arg0) {
		@Pc(2) Class623[] local2 = Class254.method26091((byte) -63);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class623 local12 = local2[local4];
			if (local12.anInt5842 * -1361159159 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vs", name = "k", descriptor = "(I)Lclient!vs;")
	static Class623 method32327(@OriginalArg(0) int arg0) {
		@Pc(2) Class623[] local2 = Class254.method26091((byte) -67);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class623 local12 = local2[local4];
			if (local12.anInt5842 * -1361159159 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!vs", name = "hi", descriptor = "(Lclient!yf;I)V")
	static void method32328(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class586.method31816(local11, local14, arg0, (byte) -5);
	}

	@OriginalMember(owner = "client!vs", name = "jf", descriptor = "(Lclient!ahm;[IIZI)V")
	public static void method32329(@OriginalArg(0) Class132_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		@Pc(5) boolean local5;
		@Pc(7) int local7;
		if (arg0.anIntArray236 != null) {
			local5 = true;
			for (local7 = 0; local7 < arg0.anIntArray236.length; local7++) {
				if (arg0.anIntArray236[local7] != arg1[local7]) {
					local5 = false;
					break;
				}
			}
			@Pc(28) Class19 local28 = arg0.aClass19_3;
			if (local5 && local28.method23564(254631299)) {
				@Pc(39) Class263 local39 = arg0.aClass19_3.method23565(1556683228);
				@Pc(44) int local44 = local39.anInt3909 * 23893545;
				if (local44 == 1) {
					local28.method23607(arg2, (byte) -18);
				}
				if (local44 == 2) {
					local28.method23640((short) 5174);
				}
			}
		}
		local5 = true;
		for (local7 = 0; local7 < arg1.length; local7++) {
			if (arg1[local7] != -1) {
				local5 = false;
			}
			if (arg0.anIntArray236 == null || arg0.anIntArray236[local7] == -1 || ((Class263) Class32.aClass32_Sub17_23.method18273(arg1[local7], 1327322706)).anInt3914 * -1789992573 >= ((Class263) Class32.aClass32_Sub17_23.method18273(arg0.anIntArray236[local7], -98644071)).anInt3914 * -1789992573) {
				arg0.anIntArray236 = arg1;
				arg0.aClass19_3.method23575(arg2, (byte) 2);
				if (arg3) {
					arg0.anInt2760 = arg0.anInt2763 * 609116505;
				}
			}
		}
		if (!local5) {
			return;
		}
		arg0.anIntArray236 = arg1;
		arg0.aClass19_3.method23575(arg2, (byte) 2);
		if (arg3) {
			arg0.anInt2760 = arg0.anInt2763 * 609116505;
		}
	}

	@OriginalMember(owner = "client!vs", name = "mf", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V")
	static void method32330(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2, @OriginalArg(3) int arg3) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt6049 -= 957530791) * 587908375];
		if (Class532.method30778(local13, arg2, 1518522314) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray14 = Class499.method30329(local13, arg2, 1120168652);
		arg0.aBoolean684 = true;
	}

	@OriginalMember(owner = "client!vs", name = "m", descriptor = "(Lclient!uh;IIS)Lclient!asc;")
	static Class93_Sub1_Sub13 method32331(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) short arg3) {
		@Pc(8) int local8 = arg0.anInt2065 * 825039395 | arg1 << 10;
		@Pc(16) Class93_Sub1_Sub13 local16 = (Class93_Sub1_Sub13) Class695.aClass253_1.method26076((long) local8 << 16);
		if (local16 != null) {
			return local16;
		}
		@Pc(28) byte[] local28 = Class542.aClass497_129.method30240(Class542.aClass497_129.method30249(local8, (short) 27900), (byte) 83);
		if (local28 == null) {
			local8 = arg0.anInt2065 * 825039395 | arg2 + 65536 << 10;
			local16 = (Class93_Sub1_Sub13) Class695.aClass253_1.method26076((long) local8 << 16);
			if (local16 != null) {
				return local16;
			}
			local28 = Class542.aClass497_129.method30240(Class542.aClass497_129.method30249(local8, (short) 8524), (byte) 72);
			if (local28 == null) {
				local8 = arg0.anInt2065 * 825039395 | 0x3FFFC00;
				local16 = (Class93_Sub1_Sub13) Class695.aClass253_1.method26076((long) local8 << 16);
				if (local16 != null) {
					return local16;
				}
				local28 = Class542.aClass497_129.method30240(Class542.aClass497_129.method30249(local8, (short) 12933), (byte) 25);
				if (local28 == null) {
					return null;
				} else if (local28.length <= 1) {
					return null;
				} else {
					try {
						local16 = Class113.method7407(local28, (short) 5791);
					} catch (@Pc(185) Exception local185) {
						throw new RuntimeException(local185.getMessage() + " " + local8);
					}
					local16.aClass155_70 = arg0;
					Class695.aClass253_1.method26078(local16, (long) local8 << 16);
					return local16;
				}
			} else if (local28.length <= 1) {
				return null;
			} else {
				try {
					local16 = Class113.method7407(local28, (short) 12045);
				} catch (@Pc(115) Exception local115) {
					throw new RuntimeException(local115.getMessage() + " " + local8);
				}
				local16.aClass155_70 = arg0;
				Class695.aClass253_1.method26078(local16, (long) local8 << 16);
				return local16;
			}
		} else if (local28.length <= 1) {
			return null;
		} else {
			try {
				local16 = Class113.method7407(local28, (short) 26838);
			} catch (@Pc(42) Exception local42) {
				throw new RuntimeException(local42.getMessage() + " " + local8);
			}
			local16.aClass155_70 = arg0;
			Class695.aClass253_1.method26078(local16, (long) local8 << 16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(I)V")
	Class623(@OriginalArg(0) int arg0) {
		this.anInt5842 = arg0 * 2060841529;
	}
}
