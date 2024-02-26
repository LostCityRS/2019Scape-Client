package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!za")
public final class Class700 {

	@OriginalMember(owner = "client!za", name = "u", descriptor = "[Lclient!er;")
	static Class249[] aClass249Array1;

	@OriginalMember(owner = "client!za", name = "a", descriptor = "(CLclient!zv;)I")
	static int method37069(@OriginalArg(0) char arg0, @OriginalArg(1) Class719 arg1) {
		@Pc(3) int local3 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local3 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && Class719.aClass719_7 == arg1) {
			local3 = 1762;
		}
		return local3;
	}

	@OriginalMember(owner = "client!za", name = "g", descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lclient!zv;)I")
	public static int method37070(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) CharSequence arg1, @OriginalArg(2) Class719 arg2) {
		@Pc(2) int local2 = arg0.length();
		@Pc(5) int local5 = arg1.length();
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(11) char local11 = 0;
		@Pc(13) char local13 = 0;
		while (local7 - local11 < local2 || local9 - local13 < local5) {
			if (local7 - local11 >= local2) {
				return -1;
			}
			if (local9 - local13 >= local5) {
				return 1;
			}
			@Pc(43) char local43;
			if (local11 == '\u0000') {
				local43 = arg0.charAt(local7++);
			} else {
				local43 = local11;
				@Pc(45) boolean local45 = false;
			}
			@Pc(55) char local55;
			if (local13 == '\u0000') {
				local55 = arg1.charAt(local9++);
			} else {
				local55 = local13;
				@Pc(57) boolean local57 = false;
			}
			local11 = Class145.method12037(local43, (byte) -46);
			local13 = Class145.method12037(local55, (byte) 26);
			local43 = Class116.method8756(local43, arg2, -1900866342);
			local55 = Class116.method8756(local55, arg2, -1416843414);
			if (local55 != local43 && Character.toUpperCase(local43) != Character.toUpperCase(local55)) {
				local43 = Character.toLowerCase(local43);
				local55 = Character.toLowerCase(local55);
				if (local55 != local43) {
					return Class460.method29418(local43, arg2, 32768) - Class460.method29418(local55, arg2, 32768);
				}
			}
		}
		@Pc(113) int local113 = Math.min(local2, local5);
		@Pc(146) char local146;
		@Pc(115) int local115;
		for (local115 = 0; local115 < local113; local115++) {
			if (Class719.aClass719_9 == arg2) {
				local7 = local2 - 1 - local115;
				local9 = local5 - 1 - local115;
			} else {
				local9 = local115;
				local7 = local115;
			}
			@Pc(142) char local142 = arg0.charAt(local7);
			local146 = arg1.charAt(local9);
			if (local142 != local146 && Character.toUpperCase(local142) != Character.toUpperCase(local146)) {
				local142 = Character.toLowerCase(local142);
				local146 = Character.toLowerCase(local146);
				if (local146 != local142) {
					return Class460.method29418(local142, arg2, 32768) - Class460.method29418(local146, arg2, 32768);
				}
			}
		}
		local115 = local2 - local5;
		if (local115 != 0) {
			return local115;
		}
		for (@Pc(186) int local186 = 0; local186 < local113; local186++) {
			local146 = arg0.charAt(local186);
			@Pc(197) char local197 = arg1.charAt(local186);
			if (local146 != local197) {
				return Class460.method29418(local146, arg2, 32768) - Class460.method29418(local197, arg2, 32768);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!za", name = "i", descriptor = "(CLclient!zv;)C")
	static char method37071(@OriginalArg(0) char arg0, @OriginalArg(1) Class719 arg1) {
		if (arg0 >= 'À' && arg0 <= 'ÿ') {
			if (arg0 >= 'À' && arg0 <= 'Æ') {
				return 'A';
			}
			if (arg0 == 'Ç') {
				return 'C';
			}
			if (arg0 >= 'È' && arg0 <= 'Ë') {
				return 'E';
			}
			if (arg0 >= 'Ì' && arg0 <= 'Ï') {
				return 'I';
			}
			if (arg0 == 'Ñ' && Class719.aClass719_7 != arg1) {
				return 'N';
			}
			if (arg0 >= 'Ò' && arg0 <= 'Ö') {
				return 'O';
			}
			if (arg0 >= 'Ù' && arg0 <= 'Ü') {
				return 'U';
			}
			if (arg0 == 'Ý') {
				return 'Y';
			}
			if (arg0 == 'ß') {
				return 's';
			}
			if (arg0 >= 'à' && arg0 <= 'æ') {
				return 'a';
			}
			if (arg0 == 'ç') {
				return 'c';
			}
			if (arg0 >= 'è' && arg0 <= 'ë') {
				return 'e';
			}
			if (arg0 >= 'ì' && arg0 <= 'ï') {
				return 'i';
			}
			if (arg0 == 'ñ' && Class719.aClass719_7 != arg1) {
				return 'n';
			}
			if (arg0 >= 'ò' && arg0 <= 'ö') {
				return 'o';
			}
			if (arg0 >= 'ù' && arg0 <= 'ü') {
				return 'u';
			}
			if (arg0 == 'ý' || arg0 == 'ÿ') {
				return 'y';
			}
		}
		if (arg0 == 'Œ') {
			return 'O';
		} else if (arg0 == 'œ') {
			return 'o';
		} else if (arg0 == 'Ÿ') {
			return 'Y';
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!za", name = "j", descriptor = "(C)C")
	static char method37072(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!za", name = "m", descriptor = "(CLclient!zv;)C")
	static char method37073(@OriginalArg(0) char arg0, @OriginalArg(1) Class719 arg1) {
		if (arg0 >= 'À' && arg0 <= 'ÿ') {
			if (arg0 >= 'À' && arg0 <= 'Æ') {
				return 'A';
			}
			if (arg0 == 'Ç') {
				return 'C';
			}
			if (arg0 >= 'È' && arg0 <= 'Ë') {
				return 'E';
			}
			if (arg0 >= 'Ì' && arg0 <= 'Ï') {
				return 'I';
			}
			if (arg0 == 'Ñ' && Class719.aClass719_7 != arg1) {
				return 'N';
			}
			if (arg0 >= 'Ò' && arg0 <= 'Ö') {
				return 'O';
			}
			if (arg0 >= 'Ù' && arg0 <= 'Ü') {
				return 'U';
			}
			if (arg0 == 'Ý') {
				return 'Y';
			}
			if (arg0 == 'ß') {
				return 's';
			}
			if (arg0 >= 'à' && arg0 <= 'æ') {
				return 'a';
			}
			if (arg0 == 'ç') {
				return 'c';
			}
			if (arg0 >= 'è' && arg0 <= 'ë') {
				return 'e';
			}
			if (arg0 >= 'ì' && arg0 <= 'ï') {
				return 'i';
			}
			if (arg0 == 'ñ' && Class719.aClass719_7 != arg1) {
				return 'n';
			}
			if (arg0 >= 'ò' && arg0 <= 'ö') {
				return 'o';
			}
			if (arg0 >= 'ù' && arg0 <= 'ü') {
				return 'u';
			}
			if (arg0 == 'ý' || arg0 == 'ÿ') {
				return 'y';
			}
		}
		if (arg0 == 'Œ') {
			return 'O';
		} else if (arg0 == 'œ') {
			return 'o';
		} else if (arg0 == 'Ÿ') {
			return 'Y';
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!za", name = "k", descriptor = "(CLclient!zv;)I")
	static int method37074(@OriginalArg(0) char arg0, @OriginalArg(1) Class719 arg1) {
		@Pc(3) int local3 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local3 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && Class719.aClass719_7 == arg1) {
			local3 = 1762;
		}
		return local3;
	}

	@OriginalMember(owner = "client!za", name = "s", descriptor = "(CLclient!zv;)I")
	static int method37075(@OriginalArg(0) char arg0, @OriginalArg(1) Class719 arg1) {
		@Pc(3) int local3 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local3 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && Class719.aClass719_7 == arg1) {
			local3 = 1762;
		}
		return local3;
	}

	@OriginalMember(owner = "client!za", name = "o", descriptor = "(C)C")
	static char method37076(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!za", name = "x", descriptor = "(JIZLclient!zv;)Ljava/lang/String;")
	public static String method37077(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class719 arg3) {
		@Pc(1) char local1 = ',';
		@Pc(3) char local3 = '.';
		if (Class719.aClass719_4 == arg3) {
			local1 = '.';
			local3 = ',';
		}
		if (arg3 == Class719.aClass719_9) {
			local3 = ' ';
		}
		@Pc(17) boolean local17 = false;
		if (arg0 < 0L) {
			local17 = true;
			arg0 = -arg0;
		}
		@Pc(31) StringBuilder local31 = new StringBuilder(26);
		@Pc(35) int local35;
		@Pc(41) int local41;
		if (arg1 > 0) {
			for (local35 = 0; local35 < arg1; local35++) {
				local41 = (int) arg0;
				arg0 /= 10L;
				local31.append((char) (local41 + 48 - (int) arg0 * 10));
			}
			local31.append(local1);
		}
		local35 = 0;
		while (true) {
			local41 = (int) arg0;
			arg0 /= 10L;
			local31.append((char) (local41 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local17) {
					local31.append('-');
				}
				return local31.reverse().toString();
			}
			if (arg2) {
				local35++;
				if (local35 % 3 == 0) {
					local31.append(local3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!za", name = "w", descriptor = "(JIZLclient!zv;)Ljava/lang/String;")
	public static String method37078(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class719 arg3) {
		@Pc(1) char local1 = ',';
		@Pc(3) char local3 = '.';
		if (Class719.aClass719_4 == arg3) {
			local1 = '.';
			local3 = ',';
		}
		if (arg3 == Class719.aClass719_9) {
			local3 = ' ';
		}
		@Pc(17) boolean local17 = false;
		if (arg0 < 0L) {
			local17 = true;
			arg0 = -arg0;
		}
		@Pc(31) StringBuilder local31 = new StringBuilder(26);
		@Pc(35) int local35;
		@Pc(41) int local41;
		if (arg1 > 0) {
			for (local35 = 0; local35 < arg1; local35++) {
				local41 = (int) arg0;
				arg0 /= 10L;
				local31.append((char) (local41 + 48 - (int) arg0 * 10));
			}
			local31.append(local1);
		}
		local35 = 0;
		while (true) {
			local41 = (int) arg0;
			arg0 /= 10L;
			local31.append((char) (local41 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local17) {
					local31.append('-');
				}
				return local31.reverse().toString();
			}
			if (arg2) {
				local35++;
				if (local35 % 3 == 0) {
					local31.append(local3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!za", name = "r", descriptor = "(JIZLclient!zv;)Ljava/lang/String;")
	public static String method37079(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class719 arg3) {
		@Pc(1) char local1 = ',';
		@Pc(3) char local3 = '.';
		if (Class719.aClass719_4 == arg3) {
			local1 = '.';
			local3 = ',';
		}
		if (arg3 == Class719.aClass719_9) {
			local3 = ' ';
		}
		@Pc(17) boolean local17 = false;
		if (arg0 < 0L) {
			local17 = true;
			arg0 = -arg0;
		}
		@Pc(31) StringBuilder local31 = new StringBuilder(26);
		@Pc(35) int local35;
		@Pc(41) int local41;
		if (arg1 > 0) {
			for (local35 = 0; local35 < arg1; local35++) {
				local41 = (int) arg0;
				arg0 /= 10L;
				local31.append((char) (local41 + 48 - (int) arg0 * 10));
			}
			local31.append(local1);
		}
		local35 = 0;
		while (true) {
			local41 = (int) arg0;
			arg0 /= 10L;
			local31.append((char) (local41 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local17) {
					local31.append('-');
				}
				return local31.reverse().toString();
			}
			if (arg2) {
				local35++;
				if (local35 % 3 == 0) {
					local31.append(local3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!za", name = "qq", descriptor = "(Lclient!yp;I)V")
	static void method37080(@OriginalArg(0) Class690 arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0.anIntArray525[(arg0.anInt5778 -= 2036747717) * 1896589581];
		@Pc(16) Class327 local16 = Class301.method27041(local12, 2004935300);
		@Pc(22) Class310 local22 = Class709.aClass310Array1[local12 >> 16];
		Class165_Sub15.method16124(local16, local22, arg0, (byte) 95);
	}

	@OriginalMember(owner = "client!za", name = "l", descriptor = "(IB)I")
	public static int method37081(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(6) int local6 = local0 | local0 >>> 1;
		@Pc(12) int local12 = local6 | local6 >>> 2;
		@Pc(18) int local18 = local12 | local12 >>> 4;
		@Pc(24) int local24 = local18 | local18 >>> 8;
		@Pc(30) int local30 = local24 | local24 >>> 16;
		return local30 + 1;
	}

	@OriginalMember(owner = "client!za", name = "aec", descriptor = "(Lclient!yp;B)V")
	static void method37082(@OriginalArg(0) Class690 arg0, @OriginalArg(1) byte arg1) {
		arg0.anInt5778 -= 1593803993;
		@Pc(13) int local13 = arg0.anIntArray525[arg0.anInt5778 * 1896589581];
		@Pc(23) int local23 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 1];
		@Pc(33) int local33 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 2];
		@Pc(43) int local43 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 3];
		@Pc(53) int local53 = arg0.anIntArray525[arg0.anInt5778 * 1896589581 + 4];
		arg0.anIntArray525[(arg0.anInt5778 += 2036747717) * 1896589581 - 1] = local13 + (local53 - local33) * (local23 - local13) / (local43 - local33);
	}

	@OriginalMember(owner = "client!za", name = "<init>", descriptor = "()V")
	Class700() throws Throwable {
		throw new Error();
	}
}
