package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
final class Class523 implements Interface62 {

	@OriginalMember(owner = "client!r", name = "f", descriptor = "(II)Lclient!vc;")
	static Class609 method30649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class609[] local2 = Class143.method11838(-1595373383);
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class609 local12 = local2[local4];
			if (arg0 == local12.anInt5399 * 1226373385) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!r", name = "u", descriptor = "(B)V")
	static void method30650(@OriginalArg(0) byte arg0) {
		if (Class687.anIntArray524 != null) {
			return;
		}
		Class687.anIntArray524 = new int[65536];
		Class522.anIntArray467 = new int[65536];
		@Pc(10) double local10 = 0.7D;
		for (@Pc(12) int local12 = 0; local12 < 65536; local12++) {
			@Pc(26) double local26 = (double) (local12 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(37) double local37 = (double) (local12 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(44) double local44 = (double) (local12 & 0x7F) / 128.0D;
			@Pc(46) double local46 = local44;
			@Pc(48) double local48 = local44;
			@Pc(50) double local50 = local44;
			if (local37 != 0.0D) {
				@Pc(64) double local64;
				if (local44 < 0.5D) {
					local64 = local44 * (local37 + 1.0D);
				} else {
					local64 = local37 + local44 - local44 * local37;
				}
				@Pc(79) double local79 = local44 * 2.0D - local64;
				@Pc(83) double local83 = local26 + 0.3333333333333333D;
				if (local83 > 1.0D) {
					local83--;
				}
				@Pc(97) double local97 = local26 - 0.3333333333333333D;
				if (local97 < 0.0D) {
					local97++;
				}
				if (local83 * 6.0D < 1.0D) {
					local46 = local79 + (local64 - local79) * 6.0D * local83;
				} else if (local83 * 2.0D < 1.0D) {
					local46 = local64;
				} else if (local83 * 3.0D < 2.0D) {
					local46 = local79 + (local64 - local79) * (0.6666666666666666D - local83) * 6.0D;
				} else {
					local46 = local79;
				}
				if (local26 * 6.0D < 1.0D) {
					local48 = local79 + local26 * (local64 - local79) * 6.0D;
				} else if (local26 * 2.0D < 1.0D) {
					local48 = local64;
				} else if (local26 * 3.0D < 2.0D) {
					local48 = (local64 - local79) * 6.0D * (0.6666666666666666D - local26) + local79;
				} else {
					local48 = local79;
				}
				if (local97 * 6.0D < 1.0D) {
					local50 = local79 + (local64 - local79) * 6.0D * local97;
				} else if (local97 * 2.0D < 1.0D) {
					local50 = local64;
				} else if (local97 * 3.0D < 2.0D) {
					local50 = local79 + (0.6666666666666666D - local97) * (local64 - local79) * 6.0D;
				} else {
					local50 = local79;
				}
			}
			local46 = Math.pow(local46, local10);
			local48 = Math.pow(local48, local10);
			local50 = Math.pow(local50, local10);
			@Pc(263) int local263 = (int) (local46 * 256.0D);
			@Pc(268) int local268 = (int) (local48 * 256.0D);
			@Pc(273) int local273 = (int) (local50 * 256.0D);
			@Pc(283) int local283 = local273 + (local268 << 8) + (local263 << 16);
			Class687.anIntArray524[local12] = local283 & 0xFFFFFF;
			@Pc(299) int local299 = (local273 << 16) + (local268 << 8) + local263;
			Class522.anIntArray467[local12] = local299;
		}
	}

	@OriginalMember(owner = "client!r", name = "i", descriptor = "(II)Z")
	public static boolean method30651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == (arg0 & -arg0);
	}

	@OriginalMember(owner = "client!r", name = "t", descriptor = "(Lclient!ase;I)Z")
	@Override
	public boolean method31790(@OriginalArg(0) Class120_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		return arg0 instanceof Interface60 && ((Interface60) arg0).method13823(-1563389584);
	}

	@OriginalMember(owner = "client!r", name = "e", descriptor = "(Lclient!ase;)Z")
	@Override
	public boolean method31787(@OriginalArg(0) Class120_Sub1_Sub1 arg0) {
		return arg0 instanceof Interface60 && ((Interface60) arg0).method13823(-999264908);
	}

	@OriginalMember(owner = "client!r", name = "f", descriptor = "(Lclient!ase;)Z")
	@Override
	public boolean method31788(@OriginalArg(0) Class120_Sub1_Sub1 arg0) {
		return arg0 instanceof Interface60 && ((Interface60) arg0).method13823(-688702701);
	}

	@OriginalMember(owner = "client!r", name = "u", descriptor = "(Lclient!ase;)Z")
	@Override
	public boolean method31789(@OriginalArg(0) Class120_Sub1_Sub1 arg0) {
		return arg0 instanceof Interface60 && ((Interface60) arg0).method13823(-1456498342);
	}
}
