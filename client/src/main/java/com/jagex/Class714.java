package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zp")
public final class Class714 {

	@OriginalMember(owner = "client!zp", name = "t", descriptor = "[C")
	static final char[] aCharArray5 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!zp", name = "k", descriptor = "(C)Z")
	public static boolean method37188(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(17) char[] local17 = aCharArray5;
			for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
				@Pc(27) char local27 = local17[local19];
				if (local27 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!zp", name = "j", descriptor = "(C)B")
	public static byte method37189(@OriginalArg(0) char arg0) {
		@Pc(13) byte local13;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local13 = (byte) arg0;
		} else if (arg0 == '€') {
			local13 = -128;
		} else if (arg0 == '‚') {
			local13 = -126;
		} else if (arg0 == 'ƒ') {
			local13 = -125;
		} else if (arg0 == '„') {
			local13 = -124;
		} else if (arg0 == '…') {
			local13 = -123;
		} else if (arg0 == '†') {
			local13 = -122;
		} else if (arg0 == '‡') {
			local13 = -121;
		} else if (arg0 == 'ˆ') {
			local13 = -120;
		} else if (arg0 == '‰') {
			local13 = -119;
		} else if (arg0 == 'Š') {
			local13 = -118;
		} else if (arg0 == '‹') {
			local13 = -117;
		} else if (arg0 == 'Œ') {
			local13 = -116;
		} else if (arg0 == 'Ž') {
			local13 = -114;
		} else if (arg0 == '‘') {
			local13 = -111;
		} else if (arg0 == '’') {
			local13 = -110;
		} else if (arg0 == '“') {
			local13 = -109;
		} else if (arg0 == '”') {
			local13 = -108;
		} else if (arg0 == '•') {
			local13 = -107;
		} else if (arg0 == '–') {
			local13 = -106;
		} else if (arg0 == '—') {
			local13 = -105;
		} else if (arg0 == '˜') {
			local13 = -104;
		} else if (arg0 == '™') {
			local13 = -103;
		} else if (arg0 == 'š') {
			local13 = -102;
		} else if (arg0 == '›') {
			local13 = -101;
		} else if (arg0 == 'œ') {
			local13 = -100;
		} else if (arg0 == 'ž') {
			local13 = -98;
		} else if (arg0 == 'Ÿ') {
			local13 = -97;
		} else {
			local13 = 63;
		}
		return local13;
	}

	@OriginalMember(owner = "client!zp", name = "a", descriptor = "(C)B")
	public static byte method37190(@OriginalArg(0) char arg0) {
		@Pc(13) byte local13;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local13 = (byte) arg0;
		} else if (arg0 == '€') {
			local13 = -128;
		} else if (arg0 == '‚') {
			local13 = -126;
		} else if (arg0 == 'ƒ') {
			local13 = -125;
		} else if (arg0 == '„') {
			local13 = -124;
		} else if (arg0 == '…') {
			local13 = -123;
		} else if (arg0 == '†') {
			local13 = -122;
		} else if (arg0 == '‡') {
			local13 = -121;
		} else if (arg0 == 'ˆ') {
			local13 = -120;
		} else if (arg0 == '‰') {
			local13 = -119;
		} else if (arg0 == 'Š') {
			local13 = -118;
		} else if (arg0 == '‹') {
			local13 = -117;
		} else if (arg0 == 'Œ') {
			local13 = -116;
		} else if (arg0 == 'Ž') {
			local13 = -114;
		} else if (arg0 == '‘') {
			local13 = -111;
		} else if (arg0 == '’') {
			local13 = -110;
		} else if (arg0 == '“') {
			local13 = -109;
		} else if (arg0 == '”') {
			local13 = -108;
		} else if (arg0 == '•') {
			local13 = -107;
		} else if (arg0 == '–') {
			local13 = -106;
		} else if (arg0 == '—') {
			local13 = -105;
		} else if (arg0 == '˜') {
			local13 = -104;
		} else if (arg0 == '™') {
			local13 = -103;
		} else if (arg0 == 'š') {
			local13 = -102;
		} else if (arg0 == '›') {
			local13 = -101;
		} else if (arg0 == 'œ') {
			local13 = -100;
		} else if (arg0 == 'ž') {
			local13 = -98;
		} else if (arg0 == 'Ÿ') {
			local13 = -97;
		} else {
			local13 = 63;
		}
		return local13;
	}

	@OriginalMember(owner = "client!zp", name = "s", descriptor = "(C)B")
	public static byte method37191(@OriginalArg(0) char arg0) {
		@Pc(13) byte local13;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local13 = (byte) arg0;
		} else if (arg0 == '€') {
			local13 = -128;
		} else if (arg0 == '‚') {
			local13 = -126;
		} else if (arg0 == 'ƒ') {
			local13 = -125;
		} else if (arg0 == '„') {
			local13 = -124;
		} else if (arg0 == '…') {
			local13 = -123;
		} else if (arg0 == '†') {
			local13 = -122;
		} else if (arg0 == '‡') {
			local13 = -121;
		} else if (arg0 == 'ˆ') {
			local13 = -120;
		} else if (arg0 == '‰') {
			local13 = -119;
		} else if (arg0 == 'Š') {
			local13 = -118;
		} else if (arg0 == '‹') {
			local13 = -117;
		} else if (arg0 == 'Œ') {
			local13 = -116;
		} else if (arg0 == 'Ž') {
			local13 = -114;
		} else if (arg0 == '‘') {
			local13 = -111;
		} else if (arg0 == '’') {
			local13 = -110;
		} else if (arg0 == '“') {
			local13 = -109;
		} else if (arg0 == '”') {
			local13 = -108;
		} else if (arg0 == '•') {
			local13 = -107;
		} else if (arg0 == '–') {
			local13 = -106;
		} else if (arg0 == '—') {
			local13 = -105;
		} else if (arg0 == '˜') {
			local13 = -104;
		} else if (arg0 == '™') {
			local13 = -103;
		} else if (arg0 == 'š') {
			local13 = -102;
		} else if (arg0 == '›') {
			local13 = -101;
		} else if (arg0 == 'œ') {
			local13 = -100;
		} else if (arg0 == 'ž') {
			local13 = -98;
		} else if (arg0 == 'Ÿ') {
			local13 = -97;
		} else {
			local13 = 63;
		}
		return local13;
	}

	@OriginalMember(owner = "client!zp", name = "p", descriptor = "(Ljava/lang/CharSequence;II[BI)I")
	public static int method37192(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg2 - arg1;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			@Pc(14) char local14 = arg0.charAt(local5 + arg1);
			if (local14 > '\u0000' && local14 < '\u0080' || !(local14 < ' ' || local14 > 'ÿ')) {
				arg3[arg4 + local5] = (byte) local14;
			} else if (local14 == '€') {
				arg3[local5 + arg4] = -128;
			} else if (local14 == '‚') {
				arg3[local5 + arg4] = -126;
			} else if (local14 == 'ƒ') {
				arg3[local5 + arg4] = -125;
			} else if (local14 == '„') {
				arg3[arg4 + local5] = -124;
			} else if (local14 == '…') {
				arg3[local5 + arg4] = -123;
			} else if (local14 == '†') {
				arg3[local5 + arg4] = -122;
			} else if (local14 == '‡') {
				arg3[local5 + arg4] = -121;
			} else if (local14 == 'ˆ') {
				arg3[arg4 + local5] = -120;
			} else if (local14 == '‰') {
				arg3[arg4 + local5] = -119;
			} else if (local14 == 'Š') {
				arg3[arg4 + local5] = -118;
			} else if (local14 == '‹') {
				arg3[local5 + arg4] = -117;
			} else if (local14 == 'Œ') {
				arg3[local5 + arg4] = -116;
			} else if (local14 == 'Ž') {
				arg3[arg4 + local5] = -114;
			} else if (local14 == '‘') {
				arg3[arg4 + local5] = -111;
			} else if (local14 == '’') {
				arg3[arg4 + local5] = -110;
			} else if (local14 == '“') {
				arg3[arg4 + local5] = -109;
			} else if (local14 == '”') {
				arg3[arg4 + local5] = -108;
			} else if (local14 == '•') {
				arg3[arg4 + local5] = -107;
			} else if (local14 == '–') {
				arg3[local5 + arg4] = -106;
			} else if (local14 == '—') {
				arg3[arg4 + local5] = -105;
			} else if (local14 == '˜') {
				arg3[arg4 + local5] = -104;
			} else if (local14 == '™') {
				arg3[arg4 + local5] = -103;
			} else if (local14 == 'š') {
				arg3[local5 + arg4] = -102;
			} else if (local14 == '›') {
				arg3[local5 + arg4] = -101;
			} else if (local14 == 'œ') {
				arg3[arg4 + local5] = -100;
			} else if (local14 == 'ž') {
				arg3[arg4 + local5] = -98;
			} else if (local14 == 'Ÿ') {
				arg3[local5 + arg4] = -97;
			} else {
				arg3[local5 + arg4] = 63;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!zp", name = "h", descriptor = "(Ljava/lang/CharSequence;)[B")
	public static byte[] method37193(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(5) byte[] local5 = new byte[local2];
		for (@Pc(7) int local7 = 0; local7 < local2; local7++) {
			@Pc(14) char local14 = arg0.charAt(local7);
			if (local14 > '\u0000' && local14 < '\u0080' || !(local14 < ' ' || local14 > 'ÿ')) {
				local5[local7] = (byte) local14;
			} else if (local14 == '€') {
				local5[local7] = -128;
			} else if (local14 == '‚') {
				local5[local7] = -126;
			} else if (local14 == 'ƒ') {
				local5[local7] = -125;
			} else if (local14 == '„') {
				local5[local7] = -124;
			} else if (local14 == '…') {
				local5[local7] = -123;
			} else if (local14 == '†') {
				local5[local7] = -122;
			} else if (local14 == '‡') {
				local5[local7] = -121;
			} else if (local14 == 'ˆ') {
				local5[local7] = -120;
			} else if (local14 == '‰') {
				local5[local7] = -119;
			} else if (local14 == 'Š') {
				local5[local7] = -118;
			} else if (local14 == '‹') {
				local5[local7] = -117;
			} else if (local14 == 'Œ') {
				local5[local7] = -116;
			} else if (local14 == 'Ž') {
				local5[local7] = -114;
			} else if (local14 == '‘') {
				local5[local7] = -111;
			} else if (local14 == '’') {
				local5[local7] = -110;
			} else if (local14 == '“') {
				local5[local7] = -109;
			} else if (local14 == '”') {
				local5[local7] = -108;
			} else if (local14 == '•') {
				local5[local7] = -107;
			} else if (local14 == '–') {
				local5[local7] = -106;
			} else if (local14 == '—') {
				local5[local7] = -105;
			} else if (local14 == '˜') {
				local5[local7] = -104;
			} else if (local14 == '™') {
				local5[local7] = -103;
			} else if (local14 == 'š') {
				local5[local7] = -102;
			} else if (local14 == '›') {
				local5[local7] = -101;
			} else if (local14 == 'œ') {
				local5[local7] = -100;
			} else if (local14 == 'ž') {
				local5[local7] = -98;
			} else if (local14 == 'Ÿ') {
				local5[local7] = -97;
			} else {
				local5[local7] = 63;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!zp", name = "w", descriptor = "(C)Z")
	public static boolean method37194(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(17) char[] local17 = aCharArray5;
			for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
				@Pc(27) char local27 = local17[local19];
				if (local27 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!zp", name = "r", descriptor = "(C)Z")
	public static boolean method37195(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(17) char[] local17 = aCharArray5;
			for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
				@Pc(27) char local27 = local17[local19];
				if (local27 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!zp", name = "q", descriptor = "(B)C")
	public static char method37196(@OriginalArg(0) byte arg0) {
		@Pc(3) int local3 = arg0 & 0xFF;
		if (local3 == 0) {
			throw new IllegalArgumentException("" + Integer.toString(local3, 16));
		}
		if (local3 >= 128 && local3 < 160) {
			@Pc(32) char local32 = aCharArray5[local3 - 128];
			if (local32 == '\u0000') {
				local32 = '?';
			}
			local3 = local32;
		}
		return (char) local3;
	}

	@OriginalMember(owner = "client!zp", name = "c", descriptor = "([BII)Ljava/lang/String;")
	public static String method37197(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) char[] local2 = new char[arg2];
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < arg2; local6++) {
			@Pc(17) int local17 = arg0[local6 + arg1] & 0xFF;
			if (local17 != 0) {
				if (local17 >= 128 && local17 < 160) {
					@Pc(32) char local32 = aCharArray5[local17 - 128];
					if (local32 == '\u0000') {
						local32 = '?';
					}
					local17 = local32;
				}
				local2[local4++] = (char) local17;
			}
		}
		return new String(local2, 0, local4);
	}

	@OriginalMember(owner = "client!zp", name = "d", descriptor = "(Ljava/lang/CharSequence;)[B")
	public static byte[] method37198(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(5) byte[] local5 = new byte[local2];
		for (@Pc(7) int local7 = 0; local7 < local2; local7++) {
			@Pc(14) char local14 = arg0.charAt(local7);
			if (local14 > '\u0000' && local14 < '\u0080' || !(local14 < ' ' || local14 > 'ÿ')) {
				local5[local7] = (byte) local14;
			} else if (local14 == '€') {
				local5[local7] = -128;
			} else if (local14 == '‚') {
				local5[local7] = -126;
			} else if (local14 == 'ƒ') {
				local5[local7] = -125;
			} else if (local14 == '„') {
				local5[local7] = -124;
			} else if (local14 == '…') {
				local5[local7] = -123;
			} else if (local14 == '†') {
				local5[local7] = -122;
			} else if (local14 == '‡') {
				local5[local7] = -121;
			} else if (local14 == 'ˆ') {
				local5[local7] = -120;
			} else if (local14 == '‰') {
				local5[local7] = -119;
			} else if (local14 == 'Š') {
				local5[local7] = -118;
			} else if (local14 == '‹') {
				local5[local7] = -117;
			} else if (local14 == 'Œ') {
				local5[local7] = -116;
			} else if (local14 == 'Ž') {
				local5[local7] = -114;
			} else if (local14 == '‘') {
				local5[local7] = -111;
			} else if (local14 == '’') {
				local5[local7] = -110;
			} else if (local14 == '“') {
				local5[local7] = -109;
			} else if (local14 == '”') {
				local5[local7] = -108;
			} else if (local14 == '•') {
				local5[local7] = -107;
			} else if (local14 == '–') {
				local5[local7] = -106;
			} else if (local14 == '—') {
				local5[local7] = -105;
			} else if (local14 == '˜') {
				local5[local7] = -104;
			} else if (local14 == '™') {
				local5[local7] = -103;
			} else if (local14 == 'š') {
				local5[local7] = -102;
			} else if (local14 == '›') {
				local5[local7] = -101;
			} else if (local14 == 'œ') {
				local5[local7] = -100;
			} else if (local14 == 'ž') {
				local5[local7] = -98;
			} else if (local14 == 'Ÿ') {
				local5[local7] = -97;
			} else {
				local5[local7] = 63;
			}
		}
		return local5;
	}

	@OriginalMember(owner = "client!zp", name = "z", descriptor = "(Ljava/lang/CharSequence;II[BI)I")
	public static int method37199(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg2 - arg1;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			@Pc(14) char local14 = arg0.charAt(local5 + arg1);
			if (local14 > '\u0000' && local14 < '\u0080' || !(local14 < ' ' || local14 > 'ÿ')) {
				arg3[arg4 + local5] = (byte) local14;
			} else if (local14 == '€') {
				arg3[local5 + arg4] = -128;
			} else if (local14 == '‚') {
				arg3[local5 + arg4] = -126;
			} else if (local14 == 'ƒ') {
				arg3[local5 + arg4] = -125;
			} else if (local14 == '„') {
				arg3[arg4 + local5] = -124;
			} else if (local14 == '…') {
				arg3[local5 + arg4] = -123;
			} else if (local14 == '†') {
				arg3[local5 + arg4] = -122;
			} else if (local14 == '‡') {
				arg3[local5 + arg4] = -121;
			} else if (local14 == 'ˆ') {
				arg3[arg4 + local5] = -120;
			} else if (local14 == '‰') {
				arg3[arg4 + local5] = -119;
			} else if (local14 == 'Š') {
				arg3[arg4 + local5] = -118;
			} else if (local14 == '‹') {
				arg3[local5 + arg4] = -117;
			} else if (local14 == 'Œ') {
				arg3[local5 + arg4] = -116;
			} else if (local14 == 'Ž') {
				arg3[arg4 + local5] = -114;
			} else if (local14 == '‘') {
				arg3[arg4 + local5] = -111;
			} else if (local14 == '’') {
				arg3[arg4 + local5] = -110;
			} else if (local14 == '“') {
				arg3[arg4 + local5] = -109;
			} else if (local14 == '”') {
				arg3[arg4 + local5] = -108;
			} else if (local14 == '•') {
				arg3[arg4 + local5] = -107;
			} else if (local14 == '–') {
				arg3[local5 + arg4] = -106;
			} else if (local14 == '—') {
				arg3[arg4 + local5] = -105;
			} else if (local14 == '˜') {
				arg3[arg4 + local5] = -104;
			} else if (local14 == '™') {
				arg3[arg4 + local5] = -103;
			} else if (local14 == 'š') {
				arg3[local5 + arg4] = -102;
			} else if (local14 == '›') {
				arg3[local5 + arg4] = -101;
			} else if (local14 == 'œ') {
				arg3[arg4 + local5] = -100;
			} else if (local14 == 'ž') {
				arg3[arg4 + local5] = -98;
			} else if (local14 == 'Ÿ') {
				arg3[local5 + arg4] = -97;
			} else {
				arg3[local5 + arg4] = 63;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!zp", name = "o", descriptor = "(C)B")
	public static byte method37200(@OriginalArg(0) char arg0) {
		@Pc(13) byte local13;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local13 = (byte) arg0;
		} else if (arg0 == '€') {
			local13 = -128;
		} else if (arg0 == '‚') {
			local13 = -126;
		} else if (arg0 == 'ƒ') {
			local13 = -125;
		} else if (arg0 == '„') {
			local13 = -124;
		} else if (arg0 == '…') {
			local13 = -123;
		} else if (arg0 == '†') {
			local13 = -122;
		} else if (arg0 == '‡') {
			local13 = -121;
		} else if (arg0 == 'ˆ') {
			local13 = -120;
		} else if (arg0 == '‰') {
			local13 = -119;
		} else if (arg0 == 'Š') {
			local13 = -118;
		} else if (arg0 == '‹') {
			local13 = -117;
		} else if (arg0 == 'Œ') {
			local13 = -116;
		} else if (arg0 == 'Ž') {
			local13 = -114;
		} else if (arg0 == '‘') {
			local13 = -111;
		} else if (arg0 == '’') {
			local13 = -110;
		} else if (arg0 == '“') {
			local13 = -109;
		} else if (arg0 == '”') {
			local13 = -108;
		} else if (arg0 == '•') {
			local13 = -107;
		} else if (arg0 == '–') {
			local13 = -106;
		} else if (arg0 == '—') {
			local13 = -105;
		} else if (arg0 == '˜') {
			local13 = -104;
		} else if (arg0 == '™') {
			local13 = -103;
		} else if (arg0 == 'š') {
			local13 = -102;
		} else if (arg0 == '›') {
			local13 = -101;
		} else if (arg0 == 'œ') {
			local13 = -100;
		} else if (arg0 == 'ž') {
			local13 = -98;
		} else if (arg0 == 'Ÿ') {
			local13 = -97;
		} else {
			local13 = 63;
		}
		return local13;
	}

	@OriginalMember(owner = "client!zp", name = "x", descriptor = "(C)Z")
	public static boolean method37201(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(17) char[] local17 = aCharArray5;
			for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
				@Pc(27) char local27 = local17[local19];
				if (local27 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!zp", name = "y", descriptor = "(Ljava/lang/CharSequence;II[BI)I")
	public static int method37202(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg2 - arg1;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			@Pc(14) char local14 = arg0.charAt(local5 + arg1);
			if (local14 > '\u0000' && local14 < '\u0080' || !(local14 < ' ' || local14 > 'ÿ')) {
				arg3[arg4 + local5] = (byte) local14;
			} else if (local14 == '€') {
				arg3[local5 + arg4] = -128;
			} else if (local14 == '‚') {
				arg3[local5 + arg4] = -126;
			} else if (local14 == 'ƒ') {
				arg3[local5 + arg4] = -125;
			} else if (local14 == '„') {
				arg3[arg4 + local5] = -124;
			} else if (local14 == '…') {
				arg3[local5 + arg4] = -123;
			} else if (local14 == '†') {
				arg3[local5 + arg4] = -122;
			} else if (local14 == '‡') {
				arg3[local5 + arg4] = -121;
			} else if (local14 == 'ˆ') {
				arg3[arg4 + local5] = -120;
			} else if (local14 == '‰') {
				arg3[arg4 + local5] = -119;
			} else if (local14 == 'Š') {
				arg3[arg4 + local5] = -118;
			} else if (local14 == '‹') {
				arg3[local5 + arg4] = -117;
			} else if (local14 == 'Œ') {
				arg3[local5 + arg4] = -116;
			} else if (local14 == 'Ž') {
				arg3[arg4 + local5] = -114;
			} else if (local14 == '‘') {
				arg3[arg4 + local5] = -111;
			} else if (local14 == '’') {
				arg3[arg4 + local5] = -110;
			} else if (local14 == '“') {
				arg3[arg4 + local5] = -109;
			} else if (local14 == '”') {
				arg3[arg4 + local5] = -108;
			} else if (local14 == '•') {
				arg3[arg4 + local5] = -107;
			} else if (local14 == '–') {
				arg3[local5 + arg4] = -106;
			} else if (local14 == '—') {
				arg3[arg4 + local5] = -105;
			} else if (local14 == '˜') {
				arg3[arg4 + local5] = -104;
			} else if (local14 == '™') {
				arg3[arg4 + local5] = -103;
			} else if (local14 == 'š') {
				arg3[local5 + arg4] = -102;
			} else if (local14 == '›') {
				arg3[local5 + arg4] = -101;
			} else if (local14 == 'œ') {
				arg3[arg4 + local5] = -100;
			} else if (local14 == 'ž') {
				arg3[arg4 + local5] = -98;
			} else if (local14 == 'Ÿ') {
				arg3[local5 + arg4] = -97;
			} else {
				arg3[local5 + arg4] = 63;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!zp", name = "n", descriptor = "([B)Ljava/lang/String;")
	public static String method37203(@OriginalArg(0) byte[] arg0) {
		return Class2.method1814(arg0, 0, arg0.length, (byte) 42);
	}

	@OriginalMember(owner = "client!zp", name = "v", descriptor = "(Ljava/lang/CharSequence;II[BI)I")
	public static int method37204(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) int local3 = arg2 - arg1;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			@Pc(14) char local14 = arg0.charAt(local5 + arg1);
			if (local14 > '\u0000' && local14 < '\u0080' || !(local14 < ' ' || local14 > 'ÿ')) {
				arg3[arg4 + local5] = (byte) local14;
			} else if (local14 == '€') {
				arg3[local5 + arg4] = -128;
			} else if (local14 == '‚') {
				arg3[local5 + arg4] = -126;
			} else if (local14 == 'ƒ') {
				arg3[local5 + arg4] = -125;
			} else if (local14 == '„') {
				arg3[arg4 + local5] = -124;
			} else if (local14 == '…') {
				arg3[local5 + arg4] = -123;
			} else if (local14 == '†') {
				arg3[local5 + arg4] = -122;
			} else if (local14 == '‡') {
				arg3[local5 + arg4] = -121;
			} else if (local14 == 'ˆ') {
				arg3[arg4 + local5] = -120;
			} else if (local14 == '‰') {
				arg3[arg4 + local5] = -119;
			} else if (local14 == 'Š') {
				arg3[arg4 + local5] = -118;
			} else if (local14 == '‹') {
				arg3[local5 + arg4] = -117;
			} else if (local14 == 'Œ') {
				arg3[local5 + arg4] = -116;
			} else if (local14 == 'Ž') {
				arg3[arg4 + local5] = -114;
			} else if (local14 == '‘') {
				arg3[arg4 + local5] = -111;
			} else if (local14 == '’') {
				arg3[arg4 + local5] = -110;
			} else if (local14 == '“') {
				arg3[arg4 + local5] = -109;
			} else if (local14 == '”') {
				arg3[arg4 + local5] = -108;
			} else if (local14 == '•') {
				arg3[arg4 + local5] = -107;
			} else if (local14 == '–') {
				arg3[local5 + arg4] = -106;
			} else if (local14 == '—') {
				arg3[arg4 + local5] = -105;
			} else if (local14 == '˜') {
				arg3[arg4 + local5] = -104;
			} else if (local14 == '™') {
				arg3[arg4 + local5] = -103;
			} else if (local14 == 'š') {
				arg3[local5 + arg4] = -102;
			} else if (local14 == '›') {
				arg3[local5 + arg4] = -101;
			} else if (local14 == 'œ') {
				arg3[arg4 + local5] = -100;
			} else if (local14 == 'ž') {
				arg3[arg4 + local5] = -98;
			} else if (local14 == 'Ÿ') {
				arg3[local5 + arg4] = -97;
			} else {
				arg3[local5 + arg4] = 63;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!zp", name = "ww", descriptor = "(Lclient!yp;I)V")
	static void method37205(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = ((Class80_Sub1_Sub2) Class281.aClass41_Sub22_1.method18054(local12, 1952201434)).anInt280 * -2146728983;
	}

	@OriginalMember(owner = "client!zp", name = "sv", descriptor = "(Lclient!yp;B)V")
	static void method37206(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(8) Class691 local8 = arg0.aBoolean988 ? arg0.aClass691_1 : arg0.aClass691_2;
		@Pc(11) Class327 local11 = local8.aClass327_14;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(20) Class323 local20 = local11.method27643(Class279.aClass102_9, 1477428010);
		if (local20 != null) {
			local13 = local20.anInt4066 * 1560847089;
			local15 = local20.anInt4068 * 1138267573;
		}
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local13;
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local15;
	}

	@OriginalMember(owner = "client!zp", name = "uk", descriptor = "(Lclient!yp;I)V")
	static void method37207(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2069933997);
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = client.method25508(local16) ? 1 : 0;
	}

	@OriginalMember(owner = "client!zp", name = "an", descriptor = "(Lclient!yp;B)V")
	static void method37208(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		@Pc(9) int local9 = arg0.anIntArray526[arg0.anInt5780 * -1336568839] >> 16;
		@Pc(19) int local19 = arg0.anIntArray526[arg0.anInt5780 * -1336568839] & 0xFFFF;
		@Pc(32) int local32 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		if (local32 < 0 || local32 > 5000) {
			throw new RuntimeException();
		}
		arg0.anIntArray528[local9] = local32;
		@Pc(48) byte local48 = -1;
		if (local19 == Class521.aClass521_65.method37268()) {
			local48 = 0;
		}
		for (@Pc(56) int local56 = 0; local56 < local32; local56++) {
			arg0.anIntArrayArray67[local9][local56] = local48;
		}
	}

	@OriginalMember(owner = "client!zp", name = "aaw", descriptor = "(Lclient!yp;B)V")
	static void method37209(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		if (client.aString148 == null) {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
		} else {
			arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class274.anInt3924 * -912877411;
		}
	}

	@OriginalMember(owner = "client!zp", name = "wp", descriptor = "(Lclient!yp;I)V")
	static void method37210(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anInt5778 -= 1593803993;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		@Pc(43) int local43 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 3];
		@Pc(53) int local53 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 4];
		Class490.aClass263_13.method26532(Class280.aClass280_9, local13, local23, local43, Class278.aClass278_5.method26831(1226433533), Class269.aClass269_5, 0.0F, 0.0F, null, 0, local53, local33, 1684941441);
	}

	@OriginalMember(owner = "client!zp", name = "f", descriptor = "(B)Z")
	static boolean method37211(@OriginalArg(0) byte arg0) {
		return Class407.method28948(Class630.aClass641_1.aClass615_1, (byte) 44);
	}

	@OriginalMember(owner = "client!zp", name = "azl", descriptor = "(Lclient!yp;I)V")
	static void method37212(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = Class703.aClass80_Sub37_49.aClass165_Sub17_1.method16163(-444301547) ? 1 : 0;
	}

	@OriginalMember(owner = "client!zp", name = "<init>", descriptor = "()V")
	Class714() throws Throwable {
		throw new Error();
	}
}
