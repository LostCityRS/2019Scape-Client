package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xo")
public final class Class666 {

	@OriginalMember(owner = "client!xo", name = "u", descriptor = "([BII)Ljava/lang/String;")
	public static String method33077(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) char[] local2 = new char[arg2];
		@Pc(4) int local4 = 0;
		@Pc(6) int local6 = arg1;
		@Pc(10) int local10 = arg1 + arg2;
		while (local6 < local10) {
			@Pc(20) int local20 = arg0[local6++] & 0xFF;
			@Pc(27) int local27;
			if (local20 < 128) {
				if (local20 == 0) {
					local27 = 65533;
				} else {
					local27 = local20;
				}
			} else if (local20 < 192) {
				local27 = 65533;
			} else if (local20 < 224) {
				if (local6 < local10 && (arg0[local6] & 0xC0) == 128) {
					local27 = (local20 & 0x1F) << 6 | arg0[local6++] & 0x3F;
					if (local27 < 128) {
						local27 = 65533;
					}
				} else {
					local27 = 65533;
				}
			} else if (local20 < 240) {
				if (local6 + 1 < local10 && (arg0[local6] & 0xC0) == 128 && (arg0[local6 + 1] & 0xC0) == 128) {
					local27 = (local20 & 0xF) << 12 | (arg0[local6++] & 0x3F) << 6 | arg0[local6++] & 0x3F;
					if (local27 < 2048) {
						local27 = 65533;
					}
				} else {
					local27 = 65533;
				}
			} else if (local20 >= 248) {
				local27 = 65533;
			} else if (local6 + 2 < local10 && (arg0[local6] & 0xC0) == 128 && (arg0[local6 + 1] & 0xC0) == 128 && (arg0[local6 + 2] & 0xC0) == 128) {
				local27 = (local20 & 0x7) << 18 | (arg0[local6++] & 0x3F) << 12 | (arg0[local6++] & 0x3F) << 6 | arg0[local6++] & 0x3F;
				if (local27 >= 65536 && local27 <= 1114111) {
					local27 = 65533;
				} else {
					local27 = 65533;
				}
			} else {
				local27 = 65533;
			}
			local2[local4++] = (char) local27;
		}
		return new String(local2, 0, local4);
	}

	@OriginalMember(owner = "client!xo", name = "l", descriptor = "([BII)Ljava/lang/String;")
	public static String method33078(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) char[] local2 = new char[arg2];
		@Pc(4) int local4 = 0;
		@Pc(6) int local6 = arg1;
		@Pc(10) int local10 = arg1 + arg2;
		while (local6 < local10) {
			@Pc(20) int local20 = arg0[local6++] & 0xFF;
			@Pc(27) int local27;
			if (local20 < 128) {
				if (local20 == 0) {
					local27 = 65533;
				} else {
					local27 = local20;
				}
			} else if (local20 < 192) {
				local27 = 65533;
			} else if (local20 < 224) {
				if (local6 < local10 && (arg0[local6] & 0xC0) == 128) {
					local27 = (local20 & 0x1F) << 6 | arg0[local6++] & 0x3F;
					if (local27 < 128) {
						local27 = 65533;
					}
				} else {
					local27 = 65533;
				}
			} else if (local20 < 240) {
				if (local6 + 1 < local10 && (arg0[local6] & 0xC0) == 128 && (arg0[local6 + 1] & 0xC0) == 128) {
					local27 = (local20 & 0xF) << 12 | (arg0[local6++] & 0x3F) << 6 | arg0[local6++] & 0x3F;
					if (local27 < 2048) {
						local27 = 65533;
					}
				} else {
					local27 = 65533;
				}
			} else if (local20 >= 248) {
				local27 = 65533;
			} else if (local6 + 2 < local10 && (arg0[local6] & 0xC0) == 128 && (arg0[local6 + 1] & 0xC0) == 128 && (arg0[local6 + 2] & 0xC0) == 128) {
				local27 = (local20 & 0x7) << 18 | (arg0[local6++] & 0x3F) << 12 | (arg0[local6++] & 0x3F) << 6 | arg0[local6++] & 0x3F;
				if (local27 >= 65536 && local27 <= 1114111) {
					local27 = 65533;
				} else {
					local27 = 65533;
				}
			} else {
				local27 = 65533;
			}
			local2[local4++] = (char) local27;
		}
		return new String(local2, 0, local4);
	}

	@OriginalMember(owner = "client!xo", name = "f", descriptor = "([BILjava/lang/CharSequence;)I")
	public static int method33079(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) CharSequence arg2) {
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

	@OriginalMember(owner = "client!xo", name = "w", descriptor = "([BII)Ljava/lang/String;")
	public static String method33080(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) char[] local2 = new char[arg2];
		@Pc(4) int local4 = 0;
		@Pc(6) int local6 = arg1;
		@Pc(10) int local10 = arg1 + arg2;
		while (local6 < local10) {
			@Pc(20) int local20 = arg0[local6++] & 0xFF;
			@Pc(27) int local27;
			if (local20 < 128) {
				if (local20 == 0) {
					local27 = 65533;
				} else {
					local27 = local20;
				}
			} else if (local20 < 192) {
				local27 = 65533;
			} else if (local20 < 224) {
				if (local6 < local10 && (arg0[local6] & 0xC0) == 128) {
					local27 = (local20 & 0x1F) << 6 | arg0[local6++] & 0x3F;
					if (local27 < 128) {
						local27 = 65533;
					}
				} else {
					local27 = 65533;
				}
			} else if (local20 < 240) {
				if (local6 + 1 < local10 && (arg0[local6] & 0xC0) == 128 && (arg0[local6 + 1] & 0xC0) == 128) {
					local27 = (local20 & 0xF) << 12 | (arg0[local6++] & 0x3F) << 6 | arg0[local6++] & 0x3F;
					if (local27 < 2048) {
						local27 = 65533;
					}
				} else {
					local27 = 65533;
				}
			} else if (local20 >= 248) {
				local27 = 65533;
			} else if (local6 + 2 < local10 && (arg0[local6] & 0xC0) == 128 && (arg0[local6 + 1] & 0xC0) == 128 && (arg0[local6 + 2] & 0xC0) == 128) {
				local27 = (local20 & 0x7) << 18 | (arg0[local6++] & 0x3F) << 12 | (arg0[local6++] & 0x3F) << 6 | arg0[local6++] & 0x3F;
				if (local27 >= 65536 && local27 <= 1114111) {
					local27 = 65533;
				} else {
					local27 = 65533;
				}
			} else {
				local27 = 65533;
			}
			local2[local4++] = (char) local27;
		}
		return new String(local2, 0, local4);
	}

	@OriginalMember(owner = "client!xo", name = "k", descriptor = "(Ljava/lang/CharSequence;)I")
	public static int method33081(@OriginalArg(0) CharSequence arg0) {
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

	@OriginalMember(owner = "client!xo", name = "ahe", descriptor = "(Lclient!yf;S)V")
	static void method33082(@OriginalArg(0) Class681 arg0, @OriginalArg(1) short arg1) {
		if (Class118_Sub1.aClass12_4 == null) {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = -1;
		} else {
			arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class118_Sub1.aClass12_4.anInt25 * -1955231941;
		}
	}

	@OriginalMember(owner = "client!xo", name = "bai", descriptor = "(Lclient!yf;B)V")
	static void method33083(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) int local12 = arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091];
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub29_1.method16555(local12, -1461159917);
	}

	@OriginalMember(owner = "client!xo", name = "o", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	static boolean method33084(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		Class411.anInt4875 = -1680223351;
		Class411.aClass175_3 = client.aClass175_2;
		return Class507.method30409(false, false, arg0, arg1, -1L);
	}

	@OriginalMember(owner = "client!xo", name = "ake", descriptor = "(Lclient!yf;B)V")
	static void method33085(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt6052 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray521[arg0.anInt6052 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray521[arg0.anInt6052 * -1497248091 + 1];
		Class267.method26341(local13, local23 >> 14 & 0x3FFF, local23 & 0x3FFF, false, 1689501411);
	}

	@OriginalMember(owner = "client!xo", name = "x", descriptor = "(Lclient!yf;B)V")
	static void method33086(@OriginalArg(0) Class681 arg0, @OriginalArg(1) byte arg1) {
		@Pc(16) Class347 local16 = (Class347) Class288.aClass55_Sub2_1.method18273(arg0.anIntArray521[(arg0.anInt6052 -= 1189701933) * -1497248091], -1857953871);
		arg0.anIntArray521[(arg0.anInt6052 += 1189701933) * -1497248091 - 1] = local16.anIntArray425 == null ? 0 : local16.anIntArray425.length;
	}

	@OriginalMember(owner = "client!xo", name = "<init>", descriptor = "()V")
	Class666() throws Throwable {
		throw new Error();
	}
}
