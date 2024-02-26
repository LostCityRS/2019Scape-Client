package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zx")
public final class Class721 {

	@OriginalMember(owner = "client!zx", name = "at", descriptor = "(Ljava/lang/CharSequence;)J")
	public static long method37297(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) long local4 = 0L;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + (long) arg0.charAt(local6);
		}
		return local4;
	}

	@OriginalMember(owner = "client!zx", name = "z", descriptor = "(Ljava/lang/CharSequence;C)I")
	static int method37298(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) char arg1) {
		@Pc(1) int local1 = 0;
		@Pc(4) int local4 = arg0.length();
		for (@Pc(6) int local6 = 0; local6 < local4; local6++) {
			if (arg0.charAt(local6) == arg1) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!zx", name = "aa", descriptor = "(C)Z")
	public static boolean method37299(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!zx", name = "v", descriptor = "([Ljava/lang/Object;II)Ljava/lang/String;")
	public static String method37300(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!zx", name = "y", descriptor = "([Ljava/lang/Object;II)Ljava/lang/String;")
	public static String method37301(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!zx", name = "n", descriptor = "([Ljava/lang/Object;II)Ljava/lang/String;")
	public static String method37302(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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

	@OriginalMember(owner = "client!zx", name = "ae", descriptor = "(C)Z")
	public static boolean method37303(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!zx", name = "ax", descriptor = "(Ljava/lang/CharSequence;IZ)Z")
	static boolean method37304(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (arg1 < 2 || arg1 > 36) {
			throw new IllegalArgumentException("" + arg1);
		}
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg0.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(35) char local35 = arg0.charAt(local28);
			if (local28 == 0) {
				if (local35 == '-') {
					local19 = true;
					continue;
				}
				if (local35 == '+' && arg2) {
					continue;
				}
			}
			@Pc(56) int local56;
			if (local35 >= '0' && local35 <= '9') {
				local56 = local35 - '0';
			} else if (local35 >= 'A' && local35 <= 'Z') {
				local56 = local35 - '7';
			} else if (local35 >= 'a' && local35 <= 'z') {
				local56 = local35 - 'W';
			} else {
				return false;
			}
			if (local56 >= arg1) {
				return false;
			}
			if (local19) {
				local56 = -local56;
			}
			@Pc(91) int local91 = local23 * arg1 + local56;
			if (local23 != local91 / arg1) {
				return false;
			}
			local23 = local91;
			local21 = true;
		}
		return local21;
	}

	@OriginalMember(owner = "client!zx", name = "au", descriptor = "(C)Z")
	public static boolean method37305(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!zx", name = "ay", descriptor = "(Ljava/lang/CharSequence;IZ)Z")
	static boolean method37306(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (arg1 < 2 || arg1 > 36) {
			throw new IllegalArgumentException("" + arg1);
		}
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg0.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(35) char local35 = arg0.charAt(local28);
			if (local28 == 0) {
				if (local35 == '-') {
					local19 = true;
					continue;
				}
				if (local35 == '+' && arg2) {
					continue;
				}
			}
			@Pc(56) int local56;
			if (local35 >= '0' && local35 <= '9') {
				local56 = local35 - '0';
			} else if (local35 >= 'A' && local35 <= 'Z') {
				local56 = local35 - '7';
			} else if (local35 >= 'a' && local35 <= 'z') {
				local56 = local35 - 'W';
			} else {
				return false;
			}
			if (local56 >= arg1) {
				return false;
			}
			if (local19) {
				local56 = -local56;
			}
			@Pc(91) int local91 = local23 * arg1 + local56;
			if (local23 != local91 / arg1) {
				return false;
			}
			local23 = local91;
			local21 = true;
		}
		return local21;
	}

	@OriginalMember(owner = "client!zx", name = "ai", descriptor = "(Ljava/lang/CharSequence;I)I")
	public static int method37307(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1) {
		return Class508.method30527(arg0, arg1, true, (byte) 7);
	}

	@OriginalMember(owner = "client!zx", name = "aq", descriptor = "(Ljava/lang/CharSequence;I)I")
	public static int method37308(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1) {
		return Class508.method30527(arg0, arg1, true, (byte) -89);
	}

	@OriginalMember(owner = "client!zx", name = "ao", descriptor = "(Ljava/lang/CharSequence;IZ)I")
	static int method37309(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (arg1 < 2 || arg1 > 36) {
			throw new IllegalArgumentException("" + arg1);
		}
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg0.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(35) char local35 = arg0.charAt(local28);
			if (local28 == 0) {
				if (local35 == '-') {
					local19 = true;
					continue;
				}
				if (local35 == '+' && arg2) {
					continue;
				}
			}
			@Pc(57) int local57;
			if (local35 >= '0' && local35 <= '9') {
				local57 = local35 - '0';
			} else if (local35 >= 'A' && local35 <= 'Z') {
				local57 = local35 - '7';
			} else if (local35 >= 'a' && local35 <= 'z') {
				local57 = local35 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local57 >= arg1) {
				throw new NumberFormatException();
			}
			if (local19) {
				local57 = -local57;
			}
			@Pc(96) int local96 = local23 * arg1 + local57;
			if (local96 / arg1 != local23) {
				throw new NumberFormatException();
			}
			local23 = local96;
			local21 = true;
		}
		if (!local21) {
			throw new NumberFormatException();
		}
		return local23;
	}

	@OriginalMember(owner = "client!zx", name = "al", descriptor = "(Ljava/lang/CharSequence;)I")
	public static int method37310(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + Class308.method27442(arg0.charAt(local6), (byte) 81);
		}
		return local4;
	}

	@OriginalMember(owner = "client!zx", name = "ag", descriptor = "(IZ)Ljava/lang/String;")
	public static String method37311(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return arg1 && arg0 >= 0 ? Class69.method1250(arg0, 10, arg1, 2128104651) : Integer.toString(arg0);
	}

	@OriginalMember(owner = "client!zx", name = "ab", descriptor = "(IIZ)Ljava/lang/String;")
	static String method37312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (arg1 < 2 || arg1 > 36) {
			throw new IllegalArgumentException("" + arg1);
		} else if (arg2 && arg0 >= 0) {
			@Pc(27) int local27 = 2;
			@Pc(31) int local31 = arg0 / arg1;
			while (local31 != 0) {
				local31 /= arg1;
				local27++;
			}
			@Pc(42) char[] local42 = new char[local27];
			local42[0] = '+';
			for (@Pc(50) int local50 = local27 - 1; local50 > 0; local50--) {
				@Pc(54) int local54 = arg0;
				arg0 /= arg1;
				@Pc(64) int local64 = local54 - arg1 * arg0;
				if (local64 >= 10) {
					local42[local50] = (char) (local64 + 87);
				} else {
					local42[local50] = (char) (local64 + 48);
				}
			}
			return new String(local42);
		} else {
			return Integer.toString(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!zx", name = "av", descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I")
	public static int method37313(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) CharSequence arg1) {
		@Pc(2) int local2 = arg0.length();
		@Pc(5) int local5 = arg1.length();
		if (local2 == 0) {
			return local5;
		} else if (local5 == 0) {
			return local2;
		} else {
			@Pc(18) int[] local18 = new int[local2 + 1];
			@Pc(23) int[] local23 = new int[local2 + 1];
			@Pc(25) int local25 = 0;
			while (local25 <= local2) {
				local18[local25] = local25++;
			}
			for (local25 = 1; local25 <= local5; local25++) {
				local23[0] = local25;
				@Pc(49) char local49 = arg1.charAt(local25 - 1);
				for (@Pc(51) int local51 = 1; local51 <= local2; local51++) {
					local23[local51] = Math.min(Math.min(local23[local51 - 1] + 1, local18[local51] + 1), local18[local51 - 1] + (arg0.charAt(local51 - 1) == local49 ? 0 : 1));
				}
				@Pc(91) int[] local91 = local18;
				local18 = local23;
				local23 = local91;
			}
			return local18[local2];
		}
	}

	@OriginalMember(owner = "client!zx", name = "ak", descriptor = "(Ljava/lang/CharSequence;)I")
	public static int method37314(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + arg0.charAt(local6);
		}
		return local4;
	}

	@OriginalMember(owner = "client!zx", name = "af", descriptor = "(Ljava/lang/CharSequence;)I")
	public static int method37315(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + arg0.charAt(local6);
		}
		return local4;
	}

	@OriginalMember(owner = "client!zx", name = "am", descriptor = "(Ljava/lang/CharSequence;)I")
	public static int method37316(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + arg0.charAt(local6);
		}
		return local4;
	}

	@OriginalMember(owner = "client!zx", name = "az", descriptor = "(C)Z")
	public static boolean method37317(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!zx", name = "p", descriptor = "(Ljava/lang/CharSequence;C)I")
	static int method37318(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) char arg1) {
		@Pc(1) int local1 = 0;
		@Pc(4) int local4 = arg0.length();
		for (@Pc(6) int local6 = 0; local6 < local4; local6++) {
			if (arg0.charAt(local6) == arg1) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!zx", name = "ad", descriptor = "(Ljava/lang/CharSequence;)J")
	public static long method37319(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) long local4 = 0L;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + (long) arg0.charAt(local6);
		}
		return local4;
	}

	@OriginalMember(owner = "client!zx", name = "ah", descriptor = "(Ljava/lang/CharSequence;)I")
	public static int method37320(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + Class308.method27442(arg0.charAt(local6), (byte) 3);
		}
		return local4;
	}

	@OriginalMember(owner = "client!zx", name = "an", descriptor = "(C)Z")
	public static boolean method37321(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!zx", name = "c", descriptor = "(Ljava/lang/CharSequence;)Z")
	public static boolean method37322(@OriginalArg(0) CharSequence arg0) {
		return Class547.method31237(arg0, 10, true, -1174710433);
	}

	@OriginalMember(owner = "client!zx", name = "b", descriptor = "(Ljava/lang/CharSequence;IZ)Z")
	static boolean method37323(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (arg1 < 2 || arg1 > 36) {
			throw new IllegalArgumentException("" + arg1);
		}
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg0.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(35) char local35 = arg0.charAt(local28);
			if (local28 == 0) {
				if (local35 == '-') {
					local19 = true;
					continue;
				}
				if (local35 == '+' && arg2) {
					continue;
				}
			}
			@Pc(56) int local56;
			if (local35 >= '0' && local35 <= '9') {
				local56 = local35 - '0';
			} else if (local35 >= 'A' && local35 <= 'Z') {
				local56 = local35 - '7';
			} else if (local35 >= 'a' && local35 <= 'z') {
				local56 = local35 - 'W';
			} else {
				return false;
			}
			if (local56 >= arg1) {
				return false;
			}
			if (local19) {
				local56 = -local56;
			}
			@Pc(91) int local91 = local23 * arg1 + local56;
			if (local23 != local91 / arg1) {
				return false;
			}
			local23 = local91;
			local21 = true;
		}
		return local21;
	}

	@OriginalMember(owner = "client!zx", name = "ap", descriptor = "(C)Z")
	public static boolean method37324(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!zx", name = "ar", descriptor = "(C)Z")
	public static boolean method37325(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!zx", name = "aj", descriptor = "(Ljava/lang/CharSequence;IZ)I")
	static int method37326(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (arg1 < 2 || arg1 > 36) {
			throw new IllegalArgumentException("" + arg1);
		}
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg0.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(35) char local35 = arg0.charAt(local28);
			if (local28 == 0) {
				if (local35 == '-') {
					local19 = true;
					continue;
				}
				if (local35 == '+' && arg2) {
					continue;
				}
			}
			@Pc(57) int local57;
			if (local35 >= '0' && local35 <= '9') {
				local57 = local35 - '0';
			} else if (local35 >= 'A' && local35 <= 'Z') {
				local57 = local35 - '7';
			} else if (local35 >= 'a' && local35 <= 'z') {
				local57 = local35 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local57 >= arg1) {
				throw new NumberFormatException();
			}
			if (local19) {
				local57 = -local57;
			}
			@Pc(96) int local96 = local23 * arg1 + local57;
			if (local96 / arg1 != local23) {
				throw new NumberFormatException();
			}
			local23 = local96;
			local21 = true;
		}
		if (!local21) {
			throw new NumberFormatException();
		}
		return local23;
	}

	@OriginalMember(owner = "client!zx", name = "ac", descriptor = "(Ljava/lang/CharSequence;IZ)I")
	static int method37327(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (arg1 < 2 || arg1 > 36) {
			throw new IllegalArgumentException("" + arg1);
		}
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) int local23 = 0;
		@Pc(26) int local26 = arg0.length();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(35) char local35 = arg0.charAt(local28);
			if (local28 == 0) {
				if (local35 == '-') {
					local19 = true;
					continue;
				}
				if (local35 == '+' && arg2) {
					continue;
				}
			}
			@Pc(57) int local57;
			if (local35 >= '0' && local35 <= '9') {
				local57 = local35 - '0';
			} else if (local35 >= 'A' && local35 <= 'Z') {
				local57 = local35 - '7';
			} else if (local35 >= 'a' && local35 <= 'z') {
				local57 = local35 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local57 >= arg1) {
				throw new NumberFormatException();
			}
			if (local19) {
				local57 = -local57;
			}
			@Pc(96) int local96 = local23 * arg1 + local57;
			if (local96 / arg1 != local23) {
				throw new NumberFormatException();
			}
			local23 = local96;
			local21 = true;
		}
		if (!local21) {
			throw new NumberFormatException();
		}
		return local23;
	}

	@OriginalMember(owner = "client!zx", name = "as", descriptor = "(Ljava/lang/String;C)[Ljava/lang/String;")
	public static String[] method37328(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(4) int local4 = Class68.method1249(arg0, arg1, (byte) 0);
		@Pc(9) String[] local9 = new String[local4 + 1];
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local4; local15++) {
			@Pc(20) int local20;
			for (local20 = local13; arg0.charAt(local20) != arg1; local20++) {
			}
			local9[local11++] = arg0.substring(local13, local20);
			local13 = local20 + 1;
		}
		local9[local4] = arg0.substring(local13);
		return local9;
	}

	@OriginalMember(owner = "client!zx", name = "aw", descriptor = "(Ljava/lang/String;C)[Ljava/lang/String;")
	public static String[] method37329(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(4) int local4 = Class68.method1249(arg0, arg1, (byte) 0);
		@Pc(9) String[] local9 = new String[local4 + 1];
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local4; local15++) {
			@Pc(20) int local20;
			for (local20 = local13; arg0.charAt(local20) != arg1; local20++) {
			}
			local9[local11++] = arg0.substring(local13, local20);
			local13 = local20 + 1;
		}
		local9[local4] = arg0.substring(local13);
		return local9;
	}

	@OriginalMember(owner = "client!zx", name = "bg", descriptor = "(Ljava/lang/String;C)[Ljava/lang/String;")
	public static String[] method37330(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(4) int local4 = Class68.method1249(arg0, arg1, (byte) 0);
		@Pc(9) String[] local9 = new String[local4 + 1];
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local4; local15++) {
			@Pc(20) int local20;
			for (local20 = local13; arg0.charAt(local20) != arg1; local20++) {
			}
			local9[local11++] = arg0.substring(local13, local20);
			local13 = local20 + 1;
		}
		local9[local4] = arg0.substring(local13);
		return local9;
	}

	@OriginalMember(owner = "client!zx", name = "bl", descriptor = "(Ljava/lang/String;C)[Ljava/lang/String;")
	public static String[] method37331(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(4) int local4 = Class68.method1249(arg0, arg1, (byte) 0);
		@Pc(9) String[] local9 = new String[local4 + 1];
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < local4; local15++) {
			@Pc(20) int local20;
			for (local20 = local13; arg0.charAt(local20) != arg1; local20++) {
			}
			local9[local11++] = arg0.substring(local13, local20);
			local13 = local20 + 1;
		}
		local9[local4] = arg0.substring(local13);
		return local9;
	}

	@OriginalMember(owner = "client!zx", name = "br", descriptor = "(C)Z")
	public static boolean method37332(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}

	@OriginalMember(owner = "client!zx", name = "j", descriptor = "(IB)J")
	public static long method37333(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		return (long) (arg0 + 11745) * 86400000L;
	}

	@OriginalMember(owner = "client!zx", name = "dw", descriptor = "(Lclient!di;Lclient!aag;III)V")
	static void method37334(@OriginalArg(0) Class102 arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Class391.aClass8_53.method260(-1016463986);
		if (Class159_Sub1.aBoolean406) {
			return;
		}
		for (@Pc(10) Class80_Sub18 local10 = (Class80_Sub18) arg1.method247(129206984); local10 != null; local10 = (Class80_Sub18) arg1.method237(181466860)) {
			@Pc(21) Class320 local21 = (Class320) Class159_Sub1.aClass41_Sub13_4.method18054(local10.anInt1587 * 1945594581, -1068383584);
			if (Class508.method30530(local21, 2071088578)) {
				@Pc(34) boolean local34 = Class89.method1806(arg0, local10, local21, arg2, arg3, 2110937219);
				if (local34) {
					Class236.method26134(arg0, local10, local21, 228424710);
				}
			}
		}
	}

	@OriginalMember(owner = "client!zx", name = "aqe", descriptor = "(Lclient!yp;I)V")
	static void method37335(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = 0;
	}

	@OriginalMember(owner = "client!zx", name = "f", descriptor = "(Lclient!asa;II)V")
	static void method37336(@OriginalArg(0) Class80_Sub36_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class51.anInt194 = 0;
		Class490.method30234(arg0, (byte) -4);
		Class355.method28098(arg0, (byte) -28);
		if (arg1 != arg0.anInt3152 * -1380987821) {
			throw new RuntimeException(arg0.anInt3152 * -1380987821 + " " + arg1);
		}
	}

	@OriginalMember(owner = "client!zx", name = "<init>", descriptor = "()V")
	Class721() throws Throwable {
		throw new Error();
	}
}
