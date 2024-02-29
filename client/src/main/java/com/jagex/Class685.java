package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yk")
public class Class685 {

	@OriginalMember(owner = "client!yk", name = "m", descriptor = "[I")
	public static int[] anIntArray522;

	@OriginalMember(owner = "client!yk", name = "f", descriptor = "[I")
	public static int[] anIntArray523;

	@OriginalMember(owner = "client!yk", name = "k", descriptor = "[I")
	public static int[] anIntArray524;

	@OriginalMember(owner = "client!yk", name = "e", descriptor = "I")
	static int anInt5905 = 0;

	@OriginalMember(owner = "client!yk", name = "n", descriptor = "I")
	static int anInt5906 = 0;

	@OriginalMember(owner = "client!yk", name = "<init>", descriptor = "()V", line = 10)
	Class685() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!yk", name = "o", descriptor = "(ZZ)V", line = 15)
	public static void method33426(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			anInt5905 += 1883407479;
			Class376.method28044(213749755);
		}
		if (arg1) {
			anInt5906 += -236883317;
			Class262.method26169((short) 8448);
		}
	}

	@OriginalMember(owner = "client!yk", name = "s", descriptor = "(ZZ)V", line = 15)
	public static void method33427(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			anInt5905 += 1883407479;
			Class376.method28044(1427294686);
		}
		if (arg1) {
			anInt5906 += -236883317;
			Class262.method26169((short) 8448);
		}
	}

	@OriginalMember(owner = "client!yk", name = "v", descriptor = "(ZZ)V", line = 15)
	public static void method33428(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			anInt5905 += 1883407479;
			Class376.method28044(-1643142297);
		}
		if (arg1) {
			anInt5906 += -236883317;
			Class262.method26169((short) 8448);
		}
	}

	@OriginalMember(owner = "client!yk", name = "e", descriptor = "(Ljava/lang/CharSequence;B)J", line = 16)
	static long method33429(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) byte arg1) {
		@Pc(1) long local1 = 0L;
		@Pc(4) int local4 = arg0.length();
		for (@Pc(6) int local6 = 0; local6 < local4; local6++) {
			local1 *= 37L;
			@Pc(17) char local17 = arg0.charAt(local6);
			if (local17 >= 'A' && local17 <= 'Z') {
				local1 += local17 + 1 - 65;
			} else if (local17 >= 'a' && local17 <= 'z') {
				local1 += local17 + 1 - 97;
			} else if (local17 >= '0' && local17 <= '9') {
				local1 += local17 + 27 - 48;
			}
			if (local1 >= 177917621779460413L) {
				break;
			}
		}
		while (local1 % 37L == 0L && local1 != 0L) {
			local1 /= 37L;
		}
		return local1;
	}

	@OriginalMember(owner = "client!yk", name = "y", descriptor = "(ZZ)V", line = 26)
	public static void method33430(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			anInt5905 -= 1883407479;
			if (anInt5905 * 774673735 == 0) {
				anIntArray522 = null;
			}
		}
		if (arg1) {
			anInt5906 -= -236883317;
			if (anInt5906 * -771365597 == 0) {
				anIntArray524 = null;
			}
		}
	}

	@OriginalMember(owner = "client!yk", name = "q", descriptor = "()V", line = 37)
	static void method33431() {
		if (anIntArray522 != null) {
			return;
		}
		anIntArray522 = new int[65536];
		@Pc(8) double local8 = 0.7D;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 512; local12++) {
			@Pc(27) float local27 = ((float) (local12 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(36) float local36 = (float) (local12 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(38) int local38 = 0; local38 < 128; local38++) {
				@Pc(46) float local46 = (float) local38 / 128.0F;
				@Pc(48) float local48 = 0.0F;
				@Pc(50) float local50 = 0.0F;
				@Pc(52) float local52 = 0.0F;
				@Pc(56) float local56 = local27 / 60.0F;
				@Pc(59) int local59 = (int) local56;
				@Pc(63) int local63 = local59 % 6;
				@Pc(68) float local68 = local56 - (float) local59;
				@Pc(74) float local74 = (1.0F - local36) * local46;
				@Pc(82) float local82 = (1.0F - local68 * local36) * local46;
				@Pc(92) float local92 = (1.0F - (1.0F - local68) * local36) * local46;
				if (local63 == 0) {
					local48 = local46;
					local50 = local92;
					local52 = local74;
				} else if (local63 == 1) {
					local48 = local82;
					local50 = local46;
					local52 = local74;
				} else if (local63 == 2) {
					local48 = local74;
					local50 = local46;
					local52 = local92;
				} else if (local63 == 3) {
					local48 = local74;
					local50 = local82;
					local52 = local46;
				} else if (local63 == 4) {
					local48 = local92;
					local50 = local74;
					local52 = local46;
				} else if (local63 == 5) {
					local48 = local46;
					local50 = local74;
					local52 = local82;
				}
				local48 = (float) Math.pow((double) local48, local8);
				local50 = (float) Math.pow((double) local50, local8);
				local52 = (float) Math.pow((double) local52, local8);
				@Pc(173) int local173 = (int) (local48 * 256.0F);
				@Pc(178) int local178 = (int) (local50 * 256.0F);
				@Pc(183) int local183 = (int) (local52 * 256.0F);
				@Pc(195) int local195 = (local173 << 16) + -16777216 + (local178 << 8) + local183;
				anIntArray522[local10++] = local195;
			}
		}
	}

	@OriginalMember(owner = "client!yk", name = "x", descriptor = "()V", line = 37)
	static void method33432() {
		if (anIntArray522 != null) {
			return;
		}
		anIntArray522 = new int[65536];
		@Pc(8) double local8 = 0.7D;
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 512; local12++) {
			@Pc(27) float local27 = ((float) (local12 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(36) float local36 = (float) (local12 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(38) int local38 = 0; local38 < 128; local38++) {
				@Pc(46) float local46 = (float) local38 / 128.0F;
				@Pc(48) float local48 = 0.0F;
				@Pc(50) float local50 = 0.0F;
				@Pc(52) float local52 = 0.0F;
				@Pc(56) float local56 = local27 / 60.0F;
				@Pc(59) int local59 = (int) local56;
				@Pc(63) int local63 = local59 % 6;
				@Pc(68) float local68 = local56 - (float) local59;
				@Pc(74) float local74 = (1.0F - local36) * local46;
				@Pc(82) float local82 = (1.0F - local68 * local36) * local46;
				@Pc(92) float local92 = (1.0F - (1.0F - local68) * local36) * local46;
				if (local63 == 0) {
					local48 = local46;
					local50 = local92;
					local52 = local74;
				} else if (local63 == 1) {
					local48 = local82;
					local50 = local46;
					local52 = local74;
				} else if (local63 == 2) {
					local48 = local74;
					local50 = local46;
					local52 = local92;
				} else if (local63 == 3) {
					local48 = local74;
					local50 = local82;
					local52 = local46;
				} else if (local63 == 4) {
					local48 = local92;
					local50 = local74;
					local52 = local46;
				} else if (local63 == 5) {
					local48 = local46;
					local50 = local74;
					local52 = local82;
				}
				local48 = (float) Math.pow((double) local48, local8);
				local50 = (float) Math.pow((double) local50, local8);
				local52 = (float) Math.pow((double) local52, local8);
				@Pc(173) int local173 = (int) (local48 * 256.0F);
				@Pc(178) int local178 = (int) (local50 * 256.0F);
				@Pc(183) int local183 = (int) (local52 * 256.0F);
				@Pc(195) int local195 = (local173 << 16) + -16777216 + (local178 << 8) + local183;
				anIntArray522[local10++] = local195;
			}
		}
	}

	@OriginalMember(owner = "client!yk", name = "b", descriptor = "()V", line = 99)
	static void method33433() {
		if (anIntArray524 != null) {
			return;
		}
		anIntArray524 = new int[65536];
		anIntArray523 = new int[65536];
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
					local64 = (local37 + 1.0D) * local44;
				} else {
					local64 = local44 + local37 - local37 * local44;
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
					local46 = local79 + local83 * (local64 - local79) * 6.0D;
				} else if (local83 * 2.0D < 1.0D) {
					local46 = local64;
				} else if (local83 * 3.0D < 2.0D) {
					local46 = local79 + (0.6666666666666666D - local83) * (local64 - local79) * 6.0D;
				} else {
					local46 = local79;
				}
				if (local26 * 6.0D < 1.0D) {
					local48 = local26 * 6.0D * (local64 - local79) + local79;
				} else if (local26 * 2.0D < 1.0D) {
					local48 = local64;
				} else if (local26 * 3.0D < 2.0D) {
					local48 = (0.6666666666666666D - local26) * 6.0D * (local64 - local79) + local79;
				} else {
					local48 = local79;
				}
				if (local97 * 6.0D < 1.0D) {
					local50 = local97 * 6.0D * (local64 - local79) + local79;
				} else if (local97 * 2.0D < 1.0D) {
					local50 = local64;
				} else if (local97 * 3.0D < 2.0D) {
					local50 = (0.6666666666666666D - local97) * (local64 - local79) * 6.0D + local79;
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
			@Pc(283) int local283 = (local268 << 8) + (local263 << 16) + local273;
			anIntArray524[local12] = local283 & 0xFFFFFF;
			@Pc(299) int local299 = (local268 << 8) + (local273 << 16) + local263;
			anIntArray523[local12] = local299;
		}
	}

	@OriginalMember(owner = "client!yk", name = "h", descriptor = "()V", line = 99)
	static void method33434() {
		if (anIntArray524 != null) {
			return;
		}
		anIntArray524 = new int[65536];
		anIntArray523 = new int[65536];
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
					local64 = (local37 + 1.0D) * local44;
				} else {
					local64 = local44 + local37 - local37 * local44;
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
					local46 = local79 + local83 * (local64 - local79) * 6.0D;
				} else if (local83 * 2.0D < 1.0D) {
					local46 = local64;
				} else if (local83 * 3.0D < 2.0D) {
					local46 = local79 + (0.6666666666666666D - local83) * (local64 - local79) * 6.0D;
				} else {
					local46 = local79;
				}
				if (local26 * 6.0D < 1.0D) {
					local48 = local26 * 6.0D * (local64 - local79) + local79;
				} else if (local26 * 2.0D < 1.0D) {
					local48 = local64;
				} else if (local26 * 3.0D < 2.0D) {
					local48 = (0.6666666666666666D - local26) * 6.0D * (local64 - local79) + local79;
				} else {
					local48 = local79;
				}
				if (local97 * 6.0D < 1.0D) {
					local50 = local97 * 6.0D * (local64 - local79) + local79;
				} else if (local97 * 2.0D < 1.0D) {
					local50 = local64;
				} else if (local97 * 3.0D < 2.0D) {
					local50 = (0.6666666666666666D - local97) * (local64 - local79) * 6.0D + local79;
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
			@Pc(283) int local283 = (local268 << 8) + (local263 << 16) + local273;
			anIntArray524[local12] = local283 & 0xFFFFFF;
			@Pc(299) int local299 = (local268 << 8) + (local273 << 16) + local263;
			anIntArray523[local12] = local299;
		}
	}

	@OriginalMember(owner = "client!yk", name = "u", descriptor = "([I[F[FIII)V", line = 143)
	static void method33435(@OriginalArg(0) int[] arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg3 >= arg4) {
			return;
		}
		@Pc(8) int local8 = (arg4 + arg3) / 2;
		@Pc(10) int local10 = arg3;
		@Pc(14) int local14 = arg0[local8];
		arg0[local8] = arg0[arg4];
		arg0[arg4] = local14;
		@Pc(28) float local28 = arg1[local8];
		arg1[local8] = arg1[arg4];
		arg1[arg4] = local28;
		@Pc(42) float local42 = arg2[local8];
		arg2[local8] = arg2[arg4];
		arg2[arg4] = local42;
		@Pc(61) int local61 = (long) local14 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(63) int local63 = arg3; local63 < arg4; local63++) {
			if (arg0[local63] < local14 + (local63 & local61)) {
				@Pc(79) int local79 = arg0[local63];
				arg0[local63] = arg0[local10];
				arg0[local10] = local79;
				@Pc(93) float local93 = arg1[local63];
				arg1[local63] = arg1[local10];
				arg1[local10] = local93;
				@Pc(107) float local107 = arg2[local63];
				arg2[local63] = arg2[local10];
				arg2[local10] = local107;
				local10++;
			}
		}
		arg0[arg4] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg4] = arg1[local10];
		arg1[local10] = local28;
		arg2[arg4] = arg2[local10];
		arg2[local10] = local42;
		method33435(arg0, arg1, arg2, arg3, local10 - 1, -1558733387);
		method33435(arg0, arg1, arg2, local10 + 1, arg4, -1786317961);
	}

	@OriginalMember(owner = "client!yk", name = "i", descriptor = "(I)S", line = 147)
	public static short method33436(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = arg0 >> 10 & 0x3F;
		@Pc(11) int local11 = arg0 >> 3 & 0x70;
		@Pc(15) int local15 = arg0 & 0x7F;
		@Pc(32) int local32 = local15 <= 64 ? local11 * local15 >> 7 : (127 - local15) * local11 >> 7;
		@Pc(36) int local36 = local15 + local32;
		@Pc(45) int local45;
		if (local36 == 0) {
			local45 = local32 << 1;
		} else {
			local45 = (local32 << 8) / local36;
		}
		return (short) (local5 << 10 | local45 >> 4 << 7 | local36);
	}

	@OriginalMember(owner = "client!yk", name = "a", descriptor = "(I)S", line = 147)
	public static short method33437(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = arg0 >> 10 & 0x3F;
		@Pc(11) int local11 = arg0 >> 3 & 0x70;
		@Pc(15) int local15 = arg0 & 0x7F;
		@Pc(32) int local32 = local15 <= 64 ? local11 * local15 >> 7 : (127 - local15) * local11 >> 7;
		@Pc(36) int local36 = local15 + local32;
		@Pc(45) int local45;
		if (local36 == 0) {
			local45 = local32 << 1;
		} else {
			local45 = (local32 << 8) / local36;
		}
		return (short) (local5 << 10 | local45 >> 4 << 7 | local36);
	}

	@OriginalMember(owner = "client!yk", name = "g", descriptor = "(I)S", line = 147)
	public static short method33438(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = arg0 >> 10 & 0x3F;
		@Pc(11) int local11 = arg0 >> 3 & 0x70;
		@Pc(15) int local15 = arg0 & 0x7F;
		@Pc(32) int local32 = local15 <= 64 ? local11 * local15 >> 7 : (127 - local15) * local11 >> 7;
		@Pc(36) int local36 = local15 + local32;
		@Pc(45) int local45;
		if (local36 == 0) {
			local45 = local32 << 1;
		} else {
			local45 = (local32 << 8) / local36;
		}
		return (short) (local5 << 10 | local45 >> 4 << 7 | local36);
	}

	@OriginalMember(owner = "client!yk", name = "j", descriptor = "(II)I", line = 160)
	public static int method33439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!yk", name = "t", descriptor = "(II)I", line = 167)
	public static int method33440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg1 >>> 24;
		@Pc(7) int local7 = 255 - local3;
		@Pc(25) int local25 = (local3 * (arg1 & 0xFF00FF) & 0xFF00FF00 | local3 * (arg1 & 0xFF00) & 0xFF0000) >>> 8;
		return ((local7 * (arg0 & 0xFF00FF) & 0xFF00FF00 | local7 * (arg0 & 0xFF00) & 0xFF0000) >>> 8) + local25;
	}

	@OriginalMember(owner = "client!yk", name = "ae", descriptor = "(II)I", line = 167)
	public static int method33441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg1 >>> 24;
		@Pc(7) int local7 = 255 - local3;
		@Pc(25) int local25 = (local3 * (arg1 & 0xFF00FF) & 0xFF00FF00 | local3 * (arg1 & 0xFF00) & 0xFF0000) >>> 8;
		return ((local7 * (arg0 & 0xFF00FF) & 0xFF00FF00 | local7 * (arg0 & 0xFF00) & 0xFF0000) >>> 8) + local25;
	}

	@OriginalMember(owner = "client!yk", name = "ah", descriptor = "(III)I", line = 174)
	public static int method33442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = 255 - arg2;
		@Pc(21) int local21 = (arg2 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * arg2 & 0xFF0000) >>> 8;
		return local21 + ((local3 * (arg0 & 0xFF00FF) & 0xFF00FF00 | (arg0 & 0xFF00) * local3 & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!yk", name = "ag", descriptor = "(III)I", line = 174)
	public static int method33443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = 255 - arg2;
		@Pc(21) int local21 = (arg2 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * arg2 & 0xFF0000) >>> 8;
		return local21 + ((local3 * (arg0 & 0xFF00FF) & 0xFF00FF00 | (arg0 & 0xFF00) * local3 & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!yk", name = "al", descriptor = "(IIF)I", line = 180)
	public static int method33444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		return Class260.method26154(arg0, arg1, (int) arg2, 445606420);
	}

	@OriginalMember(owner = "client!yk", name = "ai", descriptor = "(I)I", line = 184)
	public static int method33445(@OriginalArg(0) int arg0) {
		@Pc(8) double local8 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(17) double local17 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(24) double local24 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(26) double local26 = local8;
		if (local17 < local8) {
			local26 = local17;
		}
		if (local24 < local26) {
			local26 = local24;
		}
		@Pc(40) double local40 = local8;
		if (local17 > local8) {
			local40 = local17;
		}
		if (local24 > local40) {
			local40 = local24;
		}
		@Pc(54) double local54 = 0.0D;
		@Pc(56) double local56 = 0.0D;
		@Pc(62) double local62 = (local26 + local40) / 2.0D;
		if (local26 != local40) {
			if (local62 < 0.5D) {
				local56 = (local40 - local26) / (local40 + local26);
			}
			if (local62 >= 0.5D) {
				local56 = (local40 - local26) / (2.0D - local40 - local26);
			}
			if (local40 == local8) {
				local54 = (local17 - local24) / (local40 - local26);
			} else if (local40 == local17) {
				local54 = (local24 - local8) / (local40 - local26) + 2.0D;
			} else if (local24 == local40) {
				local54 = (local8 - local17) / (local40 - local26) + 4.0D;
			}
		}
		local54 /= 6.0D;
		@Pc(143) int local143 = (int) (local54 * 256.0D);
		@Pc(148) int local148 = (int) (local56 * 256.0D);
		@Pc(153) int local153 = (int) (local62 * 256.0D);
		if (local148 < 0) {
			local148 = 0;
		} else if (local148 > 255) {
			local148 = 255;
		}
		if (local153 < 0) {
			local153 = 0;
		} else if (local153 > 255) {
			local153 = 255;
		}
		if (local153 > 243) {
			local148 >>= 0x4;
		} else if (local153 > 217) {
			local148 >>= 0x3;
		} else if (local153 > 192) {
			local148 >>= 0x2;
		} else if (local153 > 179) {
			local148 >>= 0x1;
		}
		return ((local143 >> 2 & 0x3F) << 10) + (local148 >> 5 << 7) + (local153 >> 1);
	}

	@OriginalMember(owner = "client!yk", name = "as", descriptor = "(I)I", line = 184)
	public static int method33446(@OriginalArg(0) int arg0) {
		@Pc(8) double local8 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(17) double local17 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(24) double local24 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(26) double local26 = local8;
		if (local17 < local8) {
			local26 = local17;
		}
		if (local24 < local26) {
			local26 = local24;
		}
		@Pc(40) double local40 = local8;
		if (local17 > local8) {
			local40 = local17;
		}
		if (local24 > local40) {
			local40 = local24;
		}
		@Pc(54) double local54 = 0.0D;
		@Pc(56) double local56 = 0.0D;
		@Pc(62) double local62 = (local26 + local40) / 2.0D;
		if (local26 != local40) {
			if (local62 < 0.5D) {
				local56 = (local40 - local26) / (local40 + local26);
			}
			if (local62 >= 0.5D) {
				local56 = (local40 - local26) / (2.0D - local40 - local26);
			}
			if (local40 == local8) {
				local54 = (local17 - local24) / (local40 - local26);
			} else if (local40 == local17) {
				local54 = (local24 - local8) / (local40 - local26) + 2.0D;
			} else if (local24 == local40) {
				local54 = (local8 - local17) / (local40 - local26) + 4.0D;
			}
		}
		local54 /= 6.0D;
		@Pc(143) int local143 = (int) (local54 * 256.0D);
		@Pc(148) int local148 = (int) (local56 * 256.0D);
		@Pc(153) int local153 = (int) (local62 * 256.0D);
		if (local148 < 0) {
			local148 = 0;
		} else if (local148 > 255) {
			local148 = 255;
		}
		if (local153 < 0) {
			local153 = 0;
		} else if (local153 > 255) {
			local153 = 255;
		}
		if (local153 > 243) {
			local148 >>= 0x4;
		} else if (local153 > 217) {
			local148 >>= 0x3;
		} else if (local153 > 192) {
			local148 >>= 0x2;
		} else if (local153 > 179) {
			local148 >>= 0x1;
		}
		return ((local143 >> 2 & 0x3F) << 10) + (local148 >> 5 << 7) + (local153 >> 1);
	}

	@OriginalMember(owner = "client!yk", name = "ac", descriptor = "(I)I", line = 184)
	public static int method33447(@OriginalArg(0) int arg0) {
		@Pc(8) double local8 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(17) double local17 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(24) double local24 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(26) double local26 = local8;
		if (local17 < local8) {
			local26 = local17;
		}
		if (local24 < local26) {
			local26 = local24;
		}
		@Pc(40) double local40 = local8;
		if (local17 > local8) {
			local40 = local17;
		}
		if (local24 > local40) {
			local40 = local24;
		}
		@Pc(54) double local54 = 0.0D;
		@Pc(56) double local56 = 0.0D;
		@Pc(62) double local62 = (local26 + local40) / 2.0D;
		if (local26 != local40) {
			if (local62 < 0.5D) {
				local56 = (local40 - local26) / (local40 + local26);
			}
			if (local62 >= 0.5D) {
				local56 = (local40 - local26) / (2.0D - local40 - local26);
			}
			if (local40 == local8) {
				local54 = (local17 - local24) / (local40 - local26);
			} else if (local40 == local17) {
				local54 = (local24 - local8) / (local40 - local26) + 2.0D;
			} else if (local24 == local40) {
				local54 = (local8 - local17) / (local40 - local26) + 4.0D;
			}
		}
		local54 /= 6.0D;
		@Pc(143) int local143 = (int) (local54 * 256.0D);
		@Pc(148) int local148 = (int) (local56 * 256.0D);
		@Pc(153) int local153 = (int) (local62 * 256.0D);
		if (local148 < 0) {
			local148 = 0;
		} else if (local148 > 255) {
			local148 = 255;
		}
		if (local153 < 0) {
			local153 = 0;
		} else if (local153 > 255) {
			local153 = 255;
		}
		if (local153 > 243) {
			local148 >>= 0x4;
		} else if (local153 > 217) {
			local148 >>= 0x3;
		} else if (local153 > 192) {
			local148 >>= 0x2;
		} else if (local153 > 179) {
			local148 >>= 0x1;
		}
		return ((local143 >> 2 & 0x3F) << 10) + (local148 >> 5 << 7) + (local153 >> 1);
	}

	@OriginalMember(owner = "client!yk", name = "aw", descriptor = "(I)I", line = 184)
	public static int method33448(@OriginalArg(0) int arg0) {
		@Pc(8) double local8 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(17) double local17 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(24) double local24 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(26) double local26 = local8;
		if (local17 < local8) {
			local26 = local17;
		}
		if (local24 < local26) {
			local26 = local24;
		}
		@Pc(40) double local40 = local8;
		if (local17 > local8) {
			local40 = local17;
		}
		if (local24 > local40) {
			local40 = local24;
		}
		@Pc(54) double local54 = 0.0D;
		@Pc(56) double local56 = 0.0D;
		@Pc(62) double local62 = (local26 + local40) / 2.0D;
		if (local26 != local40) {
			if (local62 < 0.5D) {
				local56 = (local40 - local26) / (local40 + local26);
			}
			if (local62 >= 0.5D) {
				local56 = (local40 - local26) / (2.0D - local40 - local26);
			}
			if (local40 == local8) {
				local54 = (local17 - local24) / (local40 - local26);
			} else if (local40 == local17) {
				local54 = (local24 - local8) / (local40 - local26) + 2.0D;
			} else if (local24 == local40) {
				local54 = (local8 - local17) / (local40 - local26) + 4.0D;
			}
		}
		local54 /= 6.0D;
		@Pc(143) int local143 = (int) (local54 * 256.0D);
		@Pc(148) int local148 = (int) (local56 * 256.0D);
		@Pc(153) int local153 = (int) (local62 * 256.0D);
		if (local148 < 0) {
			local148 = 0;
		} else if (local148 > 255) {
			local148 = 255;
		}
		if (local153 < 0) {
			local153 = 0;
		} else if (local153 > 255) {
			local153 = 255;
		}
		if (local153 > 243) {
			local148 >>= 0x4;
		} else if (local153 > 217) {
			local148 >>= 0x3;
		} else if (local153 > 192) {
			local148 >>= 0x2;
		} else if (local153 > 179) {
			local148 >>= 0x1;
		}
		return ((local143 >> 2 & 0x3F) << 10) + (local148 >> 5 << 7) + (local153 >> 1);
	}

	@OriginalMember(owner = "client!yk", name = "at", descriptor = "(II)I", line = 219)
	public static final int method33449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!yk", name = "ad", descriptor = "(II)I", line = 227)
	public static final int method33450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			arg1 = arg1 * (arg0 & 0x7F) >> 7;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return (arg0 & 0xFF80) + arg1;
		}
	}

	@OriginalMember(owner = "client!yk", name = "am", descriptor = "(III)I", line = 240)
	public static final int method33451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg1 >> 5 << 7) + ((arg0 & 0xFF) >> 2 << 10) + (arg2 >> 1);
	}

	@OriginalMember(owner = "client!yk", name = "au", descriptor = "(III)I", line = 240)
	public static final int method33452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg1 >> 5 << 7) + ((arg0 & 0xFF) >> 2 << 10) + (arg2 >> 1);
	}

	@OriginalMember(owner = "client!yk", name = "ayt", descriptor = "(Lclient!yf;I)V", line = 14046)
	static final void method33453(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		Class642.method32518((byte) 80);
		Class275.method26341(1725709509);
		client.aClass532_1.method30533((byte) 0);
		Class106_Sub1.method5135(-2032756498);
		client.aBoolean601 = false;
	}
}
