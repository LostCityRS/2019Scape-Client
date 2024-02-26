package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ym")
public final class Class687 {

	@OriginalMember(owner = "client!ym", name = "u", descriptor = "[I")
	public static int[] anIntArray524;

	@OriginalMember(owner = "client!ym", name = "gb", descriptor = "Lclient!pf;")
	public static Class480 aClass480_134;

	@OriginalMember(owner = "client!ym", name = "t", descriptor = "I")
	static int anInt5772 = 0;

	@OriginalMember(owner = "client!ym", name = "f", descriptor = "I")
	static int anInt5773 = 0;

	@OriginalMember(owner = "client!ym", name = "am", descriptor = "(II)I")
	public static int method36804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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
			arg1 = (arg0 & 0x7F) * arg1 >> 7;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return (arg0 & 0xFF80) + arg1;
		}
	}

	@OriginalMember(owner = "client!ym", name = "r", descriptor = "(ZZ)V")
	public static void method36805(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			anInt5772 -= -241315101;
			if (anInt5772 * 1966867147 == 0) {
				Class325.anIntArray400 = null;
			}
		}
		if (arg1) {
			anInt5773 -= -1120305201;
			if (anInt5773 * 1840719663 == 0) {
				anIntArray524 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ym", name = "x", descriptor = "(ZZ)V")
	public static void method36806(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			anInt5772 += -241315101;
			Class443.method29217(-1644373765);
		}
		if (arg1) {
			anInt5773 += -1120305201;
			Class523.method30650((byte) 61);
		}
	}

	@OriginalMember(owner = "client!ym", name = "w", descriptor = "(ZZ)V")
	public static void method36807(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			anInt5772 -= -241315101;
			if (anInt5772 * 1966867147 == 0) {
				Class325.anIntArray400 = null;
			}
		}
		if (arg1) {
			anInt5773 -= -1120305201;
			if (anInt5773 * 1840719663 == 0) {
				anIntArray524 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ym", name = "z", descriptor = "()V")
	static void method36808() {
		if (anIntArray524 != null) {
			return;
		}
		anIntArray524 = new int[65536];
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
			anIntArray524[local12] = local283 & 0xFFFFFF;
			@Pc(299) int local299 = (local273 << 16) + (local268 << 8) + local263;
			Class522.anIntArray467[local12] = local299;
		}
	}

	@OriginalMember(owner = "client!ym", name = "h", descriptor = "(ZZ)V")
	public static void method36809(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			anInt5772 -= -241315101;
			if (anInt5772 * 1966867147 == 0) {
				Class325.anIntArray400 = null;
			}
		}
		if (arg1) {
			anInt5773 -= -1120305201;
			if (anInt5773 * 1840719663 == 0) {
				anIntArray524 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ym", name = "d", descriptor = "()V")
	static void method36810() {
		if (Class325.anIntArray400 != null) {
			return;
		}
		Class325.anIntArray400 = new int[65536];
		@Pc(7) double local7 = 0.7D;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < 512; local11++) {
			@Pc(26) float local26 = ((float) (local11 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(35) float local35 = (float) (local11 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(37) int local37 = 0; local37 < 128; local37++) {
				@Pc(45) float local45 = (float) local37 / 128.0F;
				@Pc(47) float local47 = 0.0F;
				@Pc(49) float local49 = 0.0F;
				@Pc(51) float local51 = 0.0F;
				@Pc(55) float local55 = local26 / 60.0F;
				@Pc(58) int local58 = (int) local55;
				@Pc(62) int local62 = local58 % 6;
				@Pc(67) float local67 = local55 - (float) local58;
				@Pc(73) float local73 = local45 * (1.0F - local35);
				@Pc(81) float local81 = local45 * (1.0F - local35 * local67);
				@Pc(91) float local91 = local45 * (1.0F - (1.0F - local67) * local35);
				if (local62 == 0) {
					local47 = local45;
					local49 = local91;
					local51 = local73;
				} else if (local62 == 1) {
					local47 = local81;
					local49 = local45;
					local51 = local73;
				} else if (local62 == 2) {
					local47 = local73;
					local49 = local45;
					local51 = local91;
				} else if (local62 == 3) {
					local47 = local73;
					local49 = local81;
					local51 = local45;
				} else if (local62 == 4) {
					local47 = local91;
					local49 = local73;
					local51 = local45;
				} else if (local62 == 5) {
					local47 = local45;
					local49 = local73;
					local51 = local81;
				}
				local47 = (float) Math.pow((double) local47, local7);
				local49 = (float) Math.pow((double) local49, local7);
				local51 = (float) Math.pow((double) local51, local7);
				@Pc(172) int local172 = (int) (local47 * 256.0F);
				@Pc(177) int local177 = (int) (local49 * 256.0F);
				@Pc(182) int local182 = (int) (local51 * 256.0F);
				@Pc(194) int local194 = local182 + (local172 << 16) + -16777216 + (local177 << 8);
				Class325.anIntArray400[local9++] = local194;
			}
		}
	}

	@OriginalMember(owner = "client!ym", name = "ac", descriptor = "(I)I")
	public static int method36811(@OriginalArg(0) int arg0) {
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
		@Pc(62) double local62 = (local40 + local26) / 2.0D;
		if (local40 != local26) {
			if (local62 < 0.5D) {
				local56 = (local40 - local26) / (local40 + local26);
			}
			if (local62 >= 0.5D) {
				local56 = (local40 - local26) / (2.0D - local40 - local26);
			}
			if (local8 == local40) {
				local54 = (local17 - local24) / (local40 - local26);
			} else if (local17 == local40) {
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
		return (local153 >> 1) + (local148 >> 5 << 7) + ((local143 >> 2 & 0x3F) << 10);
	}

	@OriginalMember(owner = "client!ym", name = "p", descriptor = "()V")
	static void method36812() {
		if (anIntArray524 != null) {
			return;
		}
		anIntArray524 = new int[65536];
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
			anIntArray524[local12] = local283 & 0xFFFFFF;
			@Pc(299) int local299 = (local273 << 16) + (local268 << 8) + local263;
			Class522.anIntArray467[local12] = local299;
		}
	}

	@OriginalMember(owner = "client!ym", name = "v", descriptor = "()V")
	static void method36813() {
		if (anIntArray524 != null) {
			return;
		}
		anIntArray524 = new int[65536];
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
			anIntArray524[local12] = local283 & 0xFFFFFF;
			@Pc(299) int local299 = (local273 << 16) + (local268 << 8) + local263;
			Class522.anIntArray467[local12] = local299;
		}
	}

	@OriginalMember(owner = "client!ym", name = "y", descriptor = "(I)S")
	public static short method36814(@OriginalArg(0) int arg0) {
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

	@OriginalMember(owner = "client!ym", name = "ai", descriptor = "(IIF)I")
	public static int method36815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		return Class163.method15759(arg0, arg1, (int) arg2, -848328629);
	}

	@OriginalMember(owner = "client!ym", name = "c", descriptor = "(II)I")
	public static int method36816(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg1 >>> 24;
		@Pc(7) int local7 = 255 - local3;
		@Pc(25) int local25 = (local3 * (arg1 & 0xFF00FF) & 0xFF00FF00 | local3 * (arg1 & 0xFF00) & 0xFF0000) >>> 8;
		return ((local7 * (arg0 & 0xFF00FF) & 0xFF00FF00 | (arg0 & 0xFF00) * local7 & 0xFF0000) >>> 8) + local25;
	}

	@OriginalMember(owner = "client!ym", name = "aj", descriptor = "(I)I")
	public static int method36817(@OriginalArg(0) int arg0) {
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
		@Pc(62) double local62 = (local40 + local26) / 2.0D;
		if (local40 != local26) {
			if (local62 < 0.5D) {
				local56 = (local40 - local26) / (local40 + local26);
			}
			if (local62 >= 0.5D) {
				local56 = (local40 - local26) / (2.0D - local40 - local26);
			}
			if (local8 == local40) {
				local54 = (local17 - local24) / (local40 - local26);
			} else if (local17 == local40) {
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
		return (local153 >> 1) + (local148 >> 5 << 7) + ((local143 >> 2 & 0x3F) << 10);
	}

	@OriginalMember(owner = "client!ym", name = "ax", descriptor = "(III)I")
	public static int method36818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = 255 - arg2;
		@Pc(21) int local21 = ((arg1 & 0xFF00FF) * arg2 & 0xFF00FF00 | arg2 * (arg1 & 0xFF00) & 0xFF0000) >>> 8;
		return local21 + ((local3 * (arg0 & 0xFF00FF) & 0xFF00FF00 | (arg0 & 0xFF00) * local3 & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!ym", name = "ay", descriptor = "(III)I")
	public static int method36819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = 255 - arg2;
		@Pc(21) int local21 = ((arg1 & 0xFF00FF) * arg2 & 0xFF00FF00 | arg2 * (arg1 & 0xFF00) & 0xFF0000) >>> 8;
		return local21 + ((local3 * (arg0 & 0xFF00FF) & 0xFF00FF00 | (arg0 & 0xFF00) * local3 & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!ym", name = "n", descriptor = "(II)I")
	public static int method36820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!ym", name = "aq", descriptor = "(IIF)I")
	public static int method36821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2) {
		return Class163.method15759(arg0, arg1, (int) arg2, -952063204);
	}

	@OriginalMember(owner = "client!ym", name = "al", descriptor = "(II)I")
	public static int method36822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!ym", name = "ao", descriptor = "(I)I")
	public static int method36823(@OriginalArg(0) int arg0) {
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
		@Pc(62) double local62 = (local40 + local26) / 2.0D;
		if (local40 != local26) {
			if (local62 < 0.5D) {
				local56 = (local40 - local26) / (local40 + local26);
			}
			if (local62 >= 0.5D) {
				local56 = (local40 - local26) / (2.0D - local40 - local26);
			}
			if (local8 == local40) {
				local54 = (local17 - local24) / (local40 - local26);
			} else if (local17 == local40) {
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
		return (local153 >> 1) + (local148 >> 5 << 7) + ((local143 >> 2 & 0x3F) << 10);
	}

	@OriginalMember(owner = "client!ym", name = "b", descriptor = "(II)I")
	public static int method36824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg1 >>> 24;
		@Pc(7) int local7 = 255 - local3;
		@Pc(25) int local25 = (local3 * (arg1 & 0xFF00FF) & 0xFF00FF00 | local3 * (arg1 & 0xFF00) & 0xFF0000) >>> 8;
		return ((local7 * (arg0 & 0xFF00FF) & 0xFF00FF00 | (arg0 & 0xFF00) * local7 & 0xFF0000) >>> 8) + local25;
	}

	@OriginalMember(owner = "client!ym", name = "ab", descriptor = "(II)I")
	public static int method36825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!ym", name = "ag", descriptor = "(II)I")
	public static int method36826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!ym", name = "ah", descriptor = "(II)I")
	public static int method36827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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

	@OriginalMember(owner = "client!ym", name = "af", descriptor = "(II)I")
	public static int method36828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
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
			arg1 = (arg0 & 0x7F) * arg1 >> 7;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return (arg0 & 0xFF80) + arg1;
		}
	}

	@OriginalMember(owner = "client!ym", name = "q", descriptor = "(ZZ)V")
	public static void method36829(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			anInt5772 -= -241315101;
			if (anInt5772 * 1966867147 == 0) {
				Class325.anIntArray400 = null;
			}
		}
		if (arg1) {
			anInt5773 -= -1120305201;
			if (anInt5773 * 1840719663 == 0) {
				anIntArray524 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ym", name = "ak", descriptor = "(III)I")
	public static int method36830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg2 >> 1) + (arg1 >> 5 << 7) + ((arg0 >> 2 & 0x3F) << 10);
	}

	@OriginalMember(owner = "client!ym", name = "at", descriptor = "(III)I")
	public static int method36831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return (arg2 >> 1) + (arg1 >> 5 << 7) + ((arg0 >> 2 & 0x3F) << 10);
	}

	@OriginalMember(owner = "client!ym", name = "qh", descriptor = "(Lclient!yp;I)V")
	static void method36832(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2017281947);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class563.method31455(local16, local22, arg0, -1274368693);
	}

	@OriginalMember(owner = "client!ym", name = "l", descriptor = "(I)V")
	static void method36833(@OriginalArg(0) int arg0) {
		Class101.aClass243_7.method26259((byte) 3);
	}

	@OriginalMember(owner = "client!ym", name = "xh", descriptor = "(Lclient!yp;I)V")
	static void method36834(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class80_Sub33 local13 = (Class80_Sub33) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local13.anInt1653 * 1944136251;
	}

	@OriginalMember(owner = "client!ym", name = "<init>", descriptor = "()V")
	Class687() throws Throwable {
		throw new Error();
	}
}
