package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xu")
public final class Class670 {

	@OriginalMember(owner = "client!xu", name = "i", descriptor = "([BILjava/lang/CharSequence;)I")
	public static int method33499(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) CharSequence arg2) {
		@Pc(2) int local2 = arg2.length();
		@Pc(4) int local4 = arg1;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			@Pc(13) char local13 = arg2.charAt(local6);
			if (local13 <= '\u007f') {
				arg0[local4++] = (byte) local13;
			} else if (local13 <= '\u07ff') {
				arg0[local4++] = (byte) (local13 >> 6 | 0xC0);
				arg0[local4++] = (byte) (local13 & 0x3F | 0x80);
			} else {
				arg0[local4++] = (byte) (local13 >> 12 | 0xE0);
				arg0[local4++] = (byte) (local13 >> 6 & 0x3F | 0x80);
				arg0[local4++] = (byte) (local13 & 0x3F | 0x80);
			}
		}
		return local4 - arg1;
	}

	@OriginalMember(owner = "client!xu", name = "u", descriptor = "(Ljava/lang/CharSequence;)I")
	public static int method33500(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			@Pc(13) char local13 = arg0.charAt(local6);
			if (local13 <= '\u007f') {
				local4++;
			} else if (local13 <= '\u07ff') {
				local4 += 2;
			} else {
				local4 += 3;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!xu", name = "l", descriptor = "(Ljava/lang/CharSequence;)I")
	public static int method33501(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			@Pc(13) char local13 = arg0.charAt(local6);
			if (local13 <= '\u007f') {
				local4++;
			} else if (local13 <= '\u07ff') {
				local4 += 2;
			} else {
				local4 += 3;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!xu", name = "g", descriptor = "(Ljava/lang/CharSequence;)I")
	public static int method33502(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			@Pc(13) char local13 = arg0.charAt(local6);
			if (local13 <= '\u007f') {
				local4++;
			} else if (local13 <= '\u07ff') {
				local4 += 2;
			} else {
				local4 += 3;
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!xu", name = "s", descriptor = "([BII)Ljava/lang/String;")
	public static String method33503(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!xu", name = "m", descriptor = "([BILjava/lang/CharSequence;)I")
	public static int method33504(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) CharSequence arg2) {
		@Pc(2) int local2 = arg2.length();
		@Pc(4) int local4 = arg1;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			@Pc(13) char local13 = arg2.charAt(local6);
			if (local13 <= '\u007f') {
				arg0[local4++] = (byte) local13;
			} else if (local13 <= '\u07ff') {
				arg0[local4++] = (byte) (local13 >> 6 | 0xC0);
				arg0[local4++] = (byte) (local13 & 0x3F | 0x80);
			} else {
				arg0[local4++] = (byte) (local13 >> 12 | 0xE0);
				arg0[local4++] = (byte) (local13 >> 6 & 0x3F | 0x80);
				arg0[local4++] = (byte) (local13 & 0x3F | 0x80);
			}
		}
		return local4 - arg1;
	}

	@OriginalMember(owner = "client!xu", name = "o", descriptor = "([BILjava/lang/CharSequence;)I")
	public static int method33505(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) CharSequence arg2) {
		@Pc(2) int local2 = arg2.length();
		@Pc(4) int local4 = arg1;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			@Pc(13) char local13 = arg2.charAt(local6);
			if (local13 <= '\u007f') {
				arg0[local4++] = (byte) local13;
			} else if (local13 <= '\u07ff') {
				arg0[local4++] = (byte) (local13 >> 6 | 0xC0);
				arg0[local4++] = (byte) (local13 & 0x3F | 0x80);
			} else {
				arg0[local4++] = (byte) (local13 >> 12 | 0xE0);
				arg0[local4++] = (byte) (local13 >> 6 & 0x3F | 0x80);
				arg0[local4++] = (byte) (local13 & 0x3F | 0x80);
			}
		}
		return local4 - arg1;
	}

	@OriginalMember(owner = "client!xu", name = "j", descriptor = "([BII)Ljava/lang/String;")
	public static String method33506(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!xu", name = "a", descriptor = "([BII)Ljava/lang/String;")
	public static String method33507(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!xu", name = "k", descriptor = "([BII)Ljava/lang/String;")
	public static String method33508(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!xu", name = "ag", descriptor = "(Lclient!yp;B)V")
	static void method33509(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= -221471862;
		if (arg0.anIntArray525[arg0.anInt5778 * 1896589581] <= arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1]) {
			arg0.anInt5780 += arg0.anIntArray526[-1336568839 * arg0.anInt5780] * -1216954807;
		}
	}

	@OriginalMember(owner = "client!xu", name = "wn", descriptor = "(Lclient!yp;B)V")
	static void method33510(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		Class490.aClass263_13.method26608(-1790369672);
	}

	@OriginalMember(owner = "client!xu", name = "afv", descriptor = "(Lclient!yp;I)V")
	static void method33511(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) String local13 = (String) arg0.anObjectArray46[(arg0.anInt5776 -= -825189621) * -2070619997];
		if (local13 == null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local13.length();
		}
	}

	@OriginalMember(owner = "client!xu", name = "aok", descriptor = "(Lclient!yp;I)V")
	static void method33512(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) throws Exception_Sub3 {
		arg0.anInt5778 -= -221471862;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(26) float local26 = (float) arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1] / 1000.0F;
		BufferedSocket.aClass121_Sub1_2.method9595(local13, local26, -140372461);
	}

	@OriginalMember(owner = "client!xu", name = "eo", descriptor = "(IB)V")
	public static void method33513(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(5) Class200 local5 = (Class200) Class159_Sub1.aHashMap4.get(arg0);
		if (local5 == null) {
			local5 = new Class200();
		}
		local5.anInt3372 = Class159_Sub1.anInt2023 * 1354234379;
		local5.anInt3373 = Class159_Sub1.anInt2024 * -2071666767;
		Class159_Sub1.aHashMap4.put(arg0, local5);
	}

	@OriginalMember(owner = "client!xu", name = "afw", descriptor = "(Lclient!yp;I)V")
	static void method33514(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anObjectArray46[(arg0.anInt5776 += -825189621) * -2070619997 - 1] = Class90.method1870(local12, -1382972277);
	}

	@OriginalMember(owner = "client!xu", name = "<init>", descriptor = "()V")
	Class670() throws Throwable {
		throw new Error();
	}
}
