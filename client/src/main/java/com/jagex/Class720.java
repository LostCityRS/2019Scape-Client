package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zw")
public final class Class720 {

	@OriginalMember(owner = "client!zw", name = "w", descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lclient!zt;)I")
	public static int method37088(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) CharSequence arg1, @OriginalArg(2) Class717 arg2) {
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
			local11 = Class379.method28279(local43, 411557452);
			local13 = Class379.method28279(local55, -1890237118);
			local43 = Class13.method191(local43, arg2, 174677212);
			local55 = Class13.method191(local55, arg2, 887941996);
			if (local55 != local43 && Character.toUpperCase(local43) != Character.toUpperCase(local55)) {
				local43 = Character.toLowerCase(local43);
				local55 = Character.toLowerCase(local55);
				if (local55 != local43) {
					return Class75.method1269(local43, arg2, -212280896) - Class75.method1269(local55, arg2, 1590727142);
				}
			}
		}
		@Pc(113) int local113 = Math.min(local2, local5);
		@Pc(146) char local146;
		@Pc(115) int local115;
		for (local115 = 0; local115 < local113; local115++) {
			if (arg2 == Class717.aClass717_11) {
				local7 = local2 - 1 - local115;
				local9 = local5 - 1 - local115;
			} else {
				local9 = local115;
				local7 = local115;
			}
			@Pc(142) char local142 = arg0.charAt(local7);
			local146 = arg1.charAt(local9);
			if (local146 != local142 && Character.toUpperCase(local142) != Character.toUpperCase(local146)) {
				local142 = Character.toLowerCase(local142);
				local146 = Character.toLowerCase(local146);
				if (local142 != local146) {
					return Class75.method1269(local142, arg2, 1465439415) - Class75.method1269(local146, arg2, 1006910519);
				}
			}
		}
		local115 = local2 - local5;
		if (local115 != 0) {
			return local115;
		}
		for (@Pc(185) int local185 = 0; local185 < local113; local185++) {
			local146 = arg0.charAt(local185);
			@Pc(196) char local196 = arg1.charAt(local185);
			if (local196 != local146) {
				return Class75.method1269(local146, arg2, -1833051189) - Class75.method1269(local196, arg2, 1657692029);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!zw", name = "l", descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lclient!zt;)I")
	public static int method37089(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) CharSequence arg1, @OriginalArg(2) Class717 arg2) {
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
			local11 = Class379.method28279(local43, 742635315);
			local13 = Class379.method28279(local55, -1672736702);
			local43 = Class13.method191(local43, arg2, 1360779888);
			local55 = Class13.method191(local55, arg2, 184625520);
			if (local55 != local43 && Character.toUpperCase(local43) != Character.toUpperCase(local55)) {
				local43 = Character.toLowerCase(local43);
				local55 = Character.toLowerCase(local55);
				if (local55 != local43) {
					return Class75.method1269(local43, arg2, 60716865) - Class75.method1269(local55, arg2, 1326815200);
				}
			}
		}
		@Pc(113) int local113 = Math.min(local2, local5);
		@Pc(146) char local146;
		@Pc(115) int local115;
		for (local115 = 0; local115 < local113; local115++) {
			if (arg2 == Class717.aClass717_11) {
				local7 = local2 - 1 - local115;
				local9 = local5 - 1 - local115;
			} else {
				local9 = local115;
				local7 = local115;
			}
			@Pc(142) char local142 = arg0.charAt(local7);
			local146 = arg1.charAt(local9);
			if (local146 != local142 && Character.toUpperCase(local142) != Character.toUpperCase(local146)) {
				local142 = Character.toLowerCase(local142);
				local146 = Character.toLowerCase(local146);
				if (local142 != local146) {
					return Class75.method1269(local142, arg2, 938492969) - Class75.method1269(local146, arg2, -177217029);
				}
			}
		}
		local115 = local2 - local5;
		if (local115 != 0) {
			return local115;
		}
		for (@Pc(185) int local185 = 0; local185 < local113; local185++) {
			local146 = arg0.charAt(local185);
			@Pc(196) char local196 = arg1.charAt(local185);
			if (local196 != local146) {
				return Class75.method1269(local146, arg2, -1245980696) - Class75.method1269(local196, arg2, 2102300903);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!zw", name = "r", descriptor = "(C)C")
	static char method37090(@OriginalArg(0) char arg0) {
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

	@OriginalMember(owner = "client!zw", name = "z", descriptor = "(CLclient!zt;)C")
	static char method37091(@OriginalArg(0) char arg0, @OriginalArg(1) Class717 arg1) {
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
			if (arg0 == 'Ñ' && arg1 != Class717.aClass717_12) {
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
			if (arg0 == 'ñ' && arg1 != Class717.aClass717_12) {
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

	@OriginalMember(owner = "client!zw", name = "p", descriptor = "(CLclient!zt;)C")
	static char method37092(@OriginalArg(0) char arg0, @OriginalArg(1) Class717 arg1) {
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
			if (arg0 == 'Ñ' && arg1 != Class717.aClass717_12) {
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
			if (arg0 == 'ñ' && arg1 != Class717.aClass717_12) {
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

	@OriginalMember(owner = "client!zw", name = "d", descriptor = "(C)C")
	static char method37093(@OriginalArg(0) char arg0) {
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

	@OriginalMember(owner = "client!zw", name = "c", descriptor = "(C)C")
	static char method37094(@OriginalArg(0) char arg0) {
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

	@OriginalMember(owner = "client!zw", name = "u", descriptor = "(CLclient!zt;)C")
	static char method37095(@OriginalArg(0) char arg0, @OriginalArg(1) Class717 arg1) {
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
			if (arg0 == 'Ñ' && arg1 != Class717.aClass717_12) {
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
			if (arg0 == 'ñ' && arg1 != Class717.aClass717_12) {
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

	@OriginalMember(owner = "client!zw", name = "v", descriptor = "(C)C")
	static char method37096(@OriginalArg(0) char arg0) {
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

	@OriginalMember(owner = "client!zw", name = "o", descriptor = "(CLclient!zt;)I")
	static int method37097(@OriginalArg(0) char arg0, @OriginalArg(1) Class717 arg1) {
		@Pc(3) int local3 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local3 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == Class717.aClass717_12) {
			local3 = 1762;
		}
		return local3;
	}

	@OriginalMember(owner = "client!zw", name = "s", descriptor = "(JIZLclient!zt;)Ljava/lang/String;")
	public static String method37098(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class717 arg3) {
		@Pc(1) char local1 = ',';
		@Pc(3) char local3 = '.';
		if (Class717.aClass717_15 == arg3) {
			local1 = '.';
			local3 = ',';
		}
		if (Class717.aClass717_11 == arg3) {
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

	@OriginalMember(owner = "client!zw", name = "m", descriptor = "(B)Lclient!akl;")
	public static Class93_Sub22 method37099(@OriginalArg(0) byte arg0) {
		@Pc(2) Class93_Sub22 local2 = Class527.method30572(-1845715267);
		local2.aClass446_1 = null;
		local2.anInt1570 = 0;
		local2.aClass93_Sub41_Sub2_1 = new Class93_Sub41_Sub2(5000);
		return local2;
	}

	@OriginalMember(owner = "client!zw", name = "<init>", descriptor = "()V")
	Class720() throws Throwable {
		throw new Error();
	}
}
