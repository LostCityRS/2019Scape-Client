package jagex3;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zm")
public final class Class710 {

	@OriginalMember(owner = "client!zm", name = "ge", descriptor = "Lclient!py;")
	public static Class497 aClass497_143;

	@OriginalMember(owner = "client!zm", name = "i", descriptor = "(Ljava/lang/CharSequence;)I")
	public static int method36949(@OriginalArg(0) CharSequence arg0) {
		return Class618.method32284(arg0, 10, true, -235022158);
	}

	@OriginalMember(owner = "client!zm", name = "h", descriptor = "([Ljava/lang/Object;II)Ljava/lang/String;")
	public static String method36950(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(12) CharSequence local12 = (CharSequence) arg0[arg1];
			return local12 == null ? "null" : local12.toString();
		} else {
			@Pc(23) int local23 = arg1 + arg2;
			@Pc(25) int local25 = 0;
			for (@Pc(27) int local27 = arg1; local27 < local23; local27++) {
				@Pc(35) CharSequence local35 = (CharSequence) arg0[local27];
				if (local35 == null) {
					local25 += 4;
				} else {
					local25 += local35.length();
				}
			}
			@Pc(51) StringBuilder local51 = new StringBuilder(local25);
			for (@Pc(53) int local53 = arg1; local53 < local23; local53++) {
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

	@OriginalMember(owner = "client!zm", name = "a", descriptor = "(Ljava/lang/CharSequence;)Z")
	public static boolean method36951(@OriginalArg(0) CharSequence arg0) {
		return Class93_Sub9.method13154(arg0, 10, true, -1692383699);
	}

	@OriginalMember(owner = "client!zm", name = "g", descriptor = "(Ljava/lang/CharSequence;IZ)Z")
	static boolean method36952(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
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
				return false;
			}
			if (local57 >= arg1) {
				return false;
			}
			if (local19) {
				local57 = -local57;
			}
			@Pc(92) int local92 = local23 * arg1 + local57;
			if (local23 != local92 / arg1) {
				return false;
			}
			local23 = local92;
			local21 = true;
		}
		return local21;
	}

	@OriginalMember(owner = "client!zm", name = "at", descriptor = "(Ljava/lang/CharSequence;)I")
	public static int method36953(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + Class138_Sub3.method11406(arg0.charAt(local6), 2095866420);
		}
		return local4;
	}

	@OriginalMember(owner = "client!zm", name = "j", descriptor = "(Ljava/lang/CharSequence;)I")
	public static int method36954(@OriginalArg(0) CharSequence arg0) {
		return Class618.method32284(arg0, 10, true, -1200937613);
	}

	@OriginalMember(owner = "client!zm", name = "t", descriptor = "(Ljava/lang/CharSequence;I)I")
	public static int method36955(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1) {
		return Class618.method32284(arg0, arg1, true, 1780161068);
	}

	@OriginalMember(owner = "client!zm", name = "ae", descriptor = "(Ljava/lang/CharSequence;I)I")
	public static int method36956(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1) {
		return Class618.method32284(arg0, arg1, true, -309697025);
	}

	@OriginalMember(owner = "client!zm", name = "ar", descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I")
	public static int method36957(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) CharSequence arg1) {
		@Pc(2) int local2 = arg0.length();
		@Pc(5) int local5 = arg1.length();
		if (local2 == 0) {
			return local5;
		} else if (local5 == 0) {
			return local2;
		} else {
			@Pc(19) int[] local19 = new int[local2 + 1];
			@Pc(24) int[] local24 = new int[local2 + 1];
			@Pc(26) int local26 = 0;
			while (local26 <= local2) {
				local19[local26] = local26++;
			}
			for (local26 = 1; local26 <= local5; local26++) {
				local24[0] = local26;
				@Pc(50) char local50 = arg1.charAt(local26 - 1);
				for (@Pc(52) int local52 = 1; local52 <= local2; local52++) {
					local24[local52] = Math.min(Math.min(local24[local52 - 1] + 1, local19[local52] + 1), local19[local52 - 1] + (arg0.charAt(local52 - 1) == local50 ? 0 : 1));
				}
				@Pc(92) int[] local92 = local19;
				local19 = local24;
				local24 = local92;
			}
			return local19[local2];
		}
	}

	@OriginalMember(owner = "client!zm", name = "aw", descriptor = "(IZ)Ljava/lang/String;")
	public static String method36958(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return arg1 && arg0 >= 0 ? Class703.method36906(arg0, 10, arg1, -235499267) : Integer.toString(arg0);
	}

	@OriginalMember(owner = "client!zm", name = "al", descriptor = "(IZ)Ljava/lang/String;")
	public static String method36959(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return arg1 && arg0 >= 0 ? Class703.method36906(arg0, 10, arg1, -235499267) : Integer.toString(arg0);
	}

	@OriginalMember(owner = "client!zm", name = "ac", descriptor = "(IZ)Ljava/lang/String;")
	public static String method36960(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return arg1 && arg0 >= 0 ? Class703.method36906(arg0, 10, arg1, -235499267) : Integer.toString(arg0);
	}

	@OriginalMember(owner = "client!zm", name = "b", descriptor = "(Ljava/lang/CharSequence;C)I")
	static int method36961(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) char arg1) {
		@Pc(1) int local1 = 0;
		@Pc(4) int local4 = arg0.length();
		for (@Pc(6) int local6 = 0; local6 < local4; local6++) {
			if (arg0.charAt(local6) == arg1) {
				local1++;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!zm", name = "as", descriptor = "(IIZ)Ljava/lang/String;")
	static String method36962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (arg1 < 2 || arg1 > 36) {
			throw new IllegalArgumentException("" + arg1);
		} else if (arg2 && arg0 >= 0) {
			@Pc(27) int local27 = 2;
			@Pc(31) int local31 = arg0 / arg1;
			while (local31 != 0) {
				local31 /= arg1;
				local27++;
			}
			@Pc(43) char[] local43 = new char[local27];
			local43[0] = '+';
			for (@Pc(51) int local51 = local27 - 1; local51 > 0; local51--) {
				@Pc(55) int local55 = arg0;
				arg0 /= arg1;
				@Pc(65) int local65 = local55 - arg1 * arg0;
				if (local65 >= 10) {
					local43[local51] = (char) (local65 + 87);
				} else {
					local43[local51] = (char) (local65 + 48);
				}
			}
			return new String(local43);
		} else {
			return Integer.toString(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!zm", name = "ay", descriptor = "(C)Z")
	public static boolean method36963(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!zm", name = "ad", descriptor = "(Ljava/lang/CharSequence;)I")
	public static int method36964(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + arg0.charAt(local6);
		}
		return local4;
	}

	@OriginalMember(owner = "client!zm", name = "ai", descriptor = "(IZ)Ljava/lang/String;")
	public static String method36965(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return arg1 && arg0 >= 0 ? Class703.method36906(arg0, 10, arg1, -235499267) : Integer.toString(arg0);
	}

	@OriginalMember(owner = "client!zm", name = "am", descriptor = "(Ljava/lang/CharSequence;)I")
	public static int method36966(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + arg0.charAt(local6);
		}
		return local4;
	}

	@OriginalMember(owner = "client!zm", name = "au", descriptor = "(Ljava/lang/CharSequence;)J")
	public static long method36967(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) long local4 = 0L;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + (long) arg0.charAt(local6);
		}
		return local4;
	}

	@OriginalMember(owner = "client!zm", name = "ao", descriptor = "(C)Z")
	public static boolean method36968(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!zm", name = "ap", descriptor = "(C)Z")
	public static boolean method36969(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!zm", name = "aq", descriptor = "(C)Z")
	public static boolean method36970(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!zm", name = "ax", descriptor = "(C)Z")
	public static boolean method36971(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!zm", name = "av", descriptor = "(C)Z")
	public static boolean method36972(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!zm", name = "ah", descriptor = "(Ljava/lang/CharSequence;IZ)I")
	static int method36973(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
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
				throw new NumberFormatException();
			}
			if (local56 >= arg1) {
				throw new NumberFormatException();
			}
			if (local19) {
				local56 = -local56;
			}
			@Pc(95) int local95 = local23 * arg1 + local56;
			if (local23 != local95 / arg1) {
				throw new NumberFormatException();
			}
			local23 = local95;
			local21 = true;
		}
		if (!local21) {
			throw new NumberFormatException();
		}
		return local23;
	}

	@OriginalMember(owner = "client!zm", name = "aj", descriptor = "(C)Z")
	public static boolean method36974(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}

	@OriginalMember(owner = "client!zm", name = "ag", descriptor = "(Ljava/lang/CharSequence;IZ)I")
	static int method36975(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
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
				throw new NumberFormatException();
			}
			if (local56 >= arg1) {
				throw new NumberFormatException();
			}
			if (local19) {
				local56 = -local56;
			}
			@Pc(95) int local95 = local23 * arg1 + local56;
			if (local23 != local95 / arg1) {
				throw new NumberFormatException();
			}
			local23 = local95;
			local21 = true;
		}
		if (!local21) {
			throw new NumberFormatException();
		}
		return local23;
	}

	@OriginalMember(owner = "client!zm", name = "ab", descriptor = "(C)Z")
	public static boolean method36976(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!zm", name = "az", descriptor = "(Ljava/lang/String;C)[Ljava/lang/String;")
	public static String[] method36977(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(4) int local4 = Class343.method27615(arg0, arg1, 16711935);
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

	@OriginalMember(owner = "client!zm", name = "aa", descriptor = "(Ljava/lang/String;C)[Ljava/lang/String;")
	public static String[] method36978(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(4) int local4 = Class343.method27615(arg0, arg1, 16711935);
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

	@OriginalMember(owner = "client!zm", name = "af", descriptor = "(Ljava/lang/String;C)[Ljava/lang/String;")
	public static String[] method36979(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(4) int local4 = Class343.method27615(arg0, arg1, 16711935);
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

	@OriginalMember(owner = "client!zm", name = "hx", descriptor = "(IIIIZI)V")
	public static void method36980(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (arg2 < 1) {
			arg2 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		@Pc(13) int local13 = arg3 - 334;
		if (local13 < 0) {
			local13 = 0;
		} else if (local13 > 100) {
			local13 = 100;
		}
		@Pc(33) int local33 = local13 * (client.aShort152 - client.aShort153) / 100 + client.aShort153;
		@Pc(43) int local43 = arg3 * 512 * local33 / (arg2 * 334);
		@Pc(73) int local73;
		@Pc(79) int local79;
		@Pc(48) short local48;
		if (local43 < client.aShort150) {
			local48 = client.aShort150;
			local33 = local48 * 334 * arg2 / (arg3 * 512);
			if (local33 > client.aShort156) {
				local33 = client.aShort156;
				local73 = arg3 * local33 * 512 / (local48 * 334);
				local79 = (arg2 - local73) / 2;
				if (arg4) {
					Class694.aClass104_14.method20478();
					Class694.aClass104_14.method20612(arg0, arg1, local79, arg3, -16777216, (byte) 115);
					Class694.aClass104_14.method20612(arg2 + arg0 - local79, arg1, local79, arg3, -16777216, (byte) 22);
				}
				arg0 += local79;
				arg2 -= local79 * 2;
			}
		} else if (local43 > client.aShort151) {
			local48 = client.aShort151;
			local33 = local48 * 334 * arg2 / (arg3 * 512);
			if (local33 < client.aShort155) {
				local33 = client.aShort155;
				local73 = local48 * arg2 * 334 / (local33 * 512);
				local79 = (arg3 - local73) / 2;
				if (arg4) {
					Class694.aClass104_14.method20478();
					Class694.aClass104_14.method20612(arg0, arg1, arg2, local79, -16777216, (byte) 53);
					Class694.aClass104_14.method20612(arg0, arg1 + arg3 - local79, arg2, local79, -16777216, (byte) 68);
				}
				arg1 += local79;
				arg3 -= local79 * 2;
			}
		}
		client.anInt3571 = arg3 * local33 / 334 * 1984904847;
		client.anInt3432 = arg0 * -930692577;
		client.anInt3568 = arg1 * -1244412809;
		client.anInt3569 = (short) arg2 * 1265975723;
		client.anInt3570 = (short) arg3 * 489176785;
	}

	@OriginalMember(owner = "client!zm", name = "nv", descriptor = "(Lclient!yf;I)V")
	static void method36981(@OriginalArg(0) Class681 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class677 local8 = arg0.aBoolean884 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class661.method33024(local11, local14, arg0, 893778847);
	}

	@OriginalMember(owner = "client!zm", name = "<init>", descriptor = "()V")
	Class710() throws Throwable {
		throw new Error();
	}
}
