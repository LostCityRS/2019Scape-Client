package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adz")
public final class Class94 {

	@OriginalMember(owner = "client!adz", name = "n", descriptor = "I")
	static final int anInt318 = 12;

	@OriginalMember(owner = "client!adz", name = "w", descriptor = "Lclient!aba;")
	public static Class28 aClass28_7;

	@OriginalMember(owner = "client!adz", name = "e", descriptor = "I")
	static final int anInt319 = 1;

	@OriginalMember(owner = "client!adz", name = "m", descriptor = "[C")
	static final char[] aCharArray2 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!adz", name = "k", descriptor = "[C")
	static final char[] aCharArray1 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!adz", name = "r", descriptor = "(C)Z")
	static boolean method1788(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!adz", name = "l", descriptor = "(Lclient!adi;)I")
	static int method1789(@OriginalArg(0) Class83 arg0) {
		if (arg0 == null) {
			return 12;
		} else {
			switch(arg0.anInt253 * 2075397759) {
				case 2:
					return 20;
				default:
					return 12;
			}
		}
	}

	@OriginalMember(owner = "client!adz", name = "c", descriptor = "(C)Z")
	static boolean method1790(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Class239.method25913(arg0, -704422607)) {
			return true;
		} else {
			@Pc(12) char[] local12 = aCharArray2;
			@Pc(14) int local14;
			@Pc(22) char local22;
			for (local14 = 0; local14 < local12.length; local14++) {
				local22 = local12[local14];
				if (local22 == arg0) {
					return true;
				}
			}
			local12 = aCharArray1;
			for (local14 = 0; local14 < local12.length; local14++) {
				local22 = local12[local14];
				if (local22 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!adz", name = "w", descriptor = "(Lclient!adi;)I")
	static int method1791(@OriginalArg(0) Class83 arg0) {
		if (arg0 == null) {
			return 12;
		} else {
			switch(arg0.anInt253 * 2075397759) {
				case 2:
					return 20;
				default:
					return 12;
			}
		}
	}

	@OriginalMember(owner = "client!adz", name = "z", descriptor = "(C)Z")
	static boolean method1792(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Class239.method25913(arg0, -1309617943)) {
			return true;
		} else {
			@Pc(12) char[] local12 = aCharArray2;
			@Pc(14) int local14;
			@Pc(22) char local22;
			for (local14 = 0; local14 < local12.length; local14++) {
				local22 = local12[local14];
				if (local22 == arg0) {
					return true;
				}
			}
			local12 = aCharArray1;
			for (local14 = 0; local14 < local12.length; local14++) {
				local22 = local12[local14];
				if (local22 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!adz", name = "p", descriptor = "(C)Z")
	static boolean method1793(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Class239.method25913(arg0, -1109408715)) {
			return true;
		} else {
			@Pc(12) char[] local12 = aCharArray2;
			@Pc(14) int local14;
			@Pc(22) char local22;
			for (local14 = 0; local14 < local12.length; local14++) {
				local22 = local12[local14];
				if (local22 == arg0) {
					return true;
				}
			}
			local12 = aCharArray1;
			for (local14 = 0; local14 < local12.length; local14++) {
				local22 = local12[local14];
				if (local22 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!adz", name = "d", descriptor = "(C)Z")
	static boolean method1794(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Class239.method25913(arg0, -1395984167)) {
			return true;
		} else {
			@Pc(12) char[] local12 = aCharArray2;
			@Pc(14) int local14;
			@Pc(22) char local22;
			for (local14 = 0; local14 < local12.length; local14++) {
				local22 = local12[local14];
				if (local22 == arg0) {
					return true;
				}
			}
			local12 = aCharArray1;
			for (local14 = 0; local14 < local12.length; local14++) {
				local22 = local12[local14];
				if (local22 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!adz", name = "u", descriptor = "(Lclient!adi;)I")
	static int method1795(@OriginalArg(0) Class83 arg0) {
		if (arg0 == null) {
			return 12;
		} else {
			switch(arg0.anInt253 * 2075397759) {
				case 2:
					return 20;
				default:
					return 12;
			}
		}
	}

	@OriginalMember(owner = "client!adz", name = "v", descriptor = "(Ljava/lang/CharSequence;Lclient!adi;)Ljava/lang/String;")
	public static String method1796(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) Class83 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(6) int local6 = 0;
		@Pc(9) int local9 = arg0.length();
		while (local6 < local9 && Class573.method31523(arg0.charAt(local6), 1698427030)) {
			local6++;
		}
		while (local9 > local6 && Class573.method31523(arg0.charAt(local9 - 1), 1698427030)) {
			local9--;
		}
		@Pc(37) int local37 = local9 - local6;
		if (local37 < 1 || local37 > Class153.method14099(arg1, (byte) -108)) {
			return null;
		}
		@Pc(52) StringBuilder local52 = new StringBuilder(local37);
		for (@Pc(54) int local54 = local6; local54 < local9; local54++) {
			@Pc(61) char local61 = arg0.charAt(local54);
			if (Class687.method36683(local61, (byte) 0)) {
				@Pc(70) char local70 = Class549.method31208(local61, 1141105750);
				if (local70 != '\u0000') {
					local52.append(local70);
				}
			}
		}
		if (local52.length() == 0) {
			return null;
		} else {
			return local52.toString();
		}
	}

	@OriginalMember(owner = "client!adz", name = "o", descriptor = "(C)C")
	static char method1797(@OriginalArg(0) char arg0) {
		switch(arg0) {
			case ' ':
			case '-':
			case '_':
			case ' ':
				return '_';
			case '#':
			case '[':
			case ']':
				return arg0;
			case 'À':
			case 'Á':
			case 'Â':
			case 'Ã':
			case 'Ä':
			case 'à':
			case 'á':
			case 'â':
			case 'ã':
			case 'ä':
				return 'a';
			case 'Ç':
			case 'ç':
				return 'c';
			case 'È':
			case 'É':
			case 'Ê':
			case 'Ë':
			case 'è':
			case 'é':
			case 'ê':
			case 'ë':
				return 'e';
			case 'Í':
			case 'Î':
			case 'Ï':
			case 'í':
			case 'î':
			case 'ï':
				return 'i';
			case 'Ñ':
			case 'ñ':
				return 'n';
			case 'Ò':
			case 'Ó':
			case 'Ô':
			case 'Õ':
			case 'Ö':
			case 'ò':
			case 'ó':
			case 'ô':
			case 'õ':
			case 'ö':
				return 'o';
			case 'Ù':
			case 'Ú':
			case 'Û':
			case 'Ü':
			case 'ù':
			case 'ú':
			case 'û':
			case 'ü':
				return 'u';
			case 'ß':
				return 'b';
			case 'ÿ':
			case 'Ÿ':
				return 'y';
			default:
				return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!adz", name = "s", descriptor = "(C)C")
	static char method1798(@OriginalArg(0) char arg0) {
		switch(arg0) {
			case ' ':
			case '-':
			case '_':
			case ' ':
				return '_';
			case '#':
			case '[':
			case ']':
				return arg0;
			case 'À':
			case 'Á':
			case 'Â':
			case 'Ã':
			case 'Ä':
			case 'à':
			case 'á':
			case 'â':
			case 'ã':
			case 'ä':
				return 'a';
			case 'Ç':
			case 'ç':
				return 'c';
			case 'È':
			case 'É':
			case 'Ê':
			case 'Ë':
			case 'è':
			case 'é':
			case 'ê':
			case 'ë':
				return 'e';
			case 'Í':
			case 'Î':
			case 'Ï':
			case 'í':
			case 'î':
			case 'ï':
				return 'i';
			case 'Ñ':
			case 'ñ':
				return 'n';
			case 'Ò':
			case 'Ó':
			case 'Ô':
			case 'Õ':
			case 'Ö':
			case 'ò':
			case 'ó':
			case 'ô':
			case 'õ':
			case 'ö':
				return 'o';
			case 'Ù':
			case 'Ú':
			case 'Û':
			case 'Ü':
			case 'ù':
			case 'ú':
			case 'û':
			case 'ü':
				return 'u';
			case 'ß':
				return 'b';
			case 'ÿ':
			case 'Ÿ':
				return 'y';
			default:
				return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!adz", name = "k", descriptor = "(Lclient!tc;Lclient!tc;B)V")
	public static void method1799(@OriginalArg(0) Class149 arg0, @OriginalArg(1) Class149 arg1, @OriginalArg(2) byte arg2) {
		if (arg0.aClass149_19 != null) {
			arg0.method23778(-719770481);
		}
		arg0.aClass149_19 = arg1;
		arg0.aClass149_20 = arg1.aClass149_20;
		arg0.aClass149_19.aClass149_20 = arg0;
		arg0.aClass149_20.aClass149_19 = arg0;
	}

	@OriginalMember(owner = "client!adz", name = "<init>", descriptor = "()V")
	Class94() throws Throwable {
		throw new Error();
	}
}
